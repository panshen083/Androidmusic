package me.wcy.music.service;

import android.content.Context;
import android.media.AudioManager;

import static android.content.Context.AUDIO_SERVICE;

/**
 * Created by hzwangchenyan on 2017/8/8.
 */
public class AudioFocusManager implements AudioManager.OnAudioFocusChangeListener {
    private AudioManager audioManager;
    private boolean isPausedByFocusLossTransient;

    public AudioFocusManager(Context context) {
        audioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);
    }

    public boolean requestAudioFocus() {
        return audioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN)
                == AudioManager.AUDIOFOCUS_REQUEST_GRANTED;
    }

    public void abandonAudioFocus() {
        audioManager.abandonAudioFocus(this);
    }

    @Override
    public void onAudioFocusChange(int focusChange) {
        AudioPlayer.get().getMediaPlayer().setVolume(1f, 1f);
        }
    }

