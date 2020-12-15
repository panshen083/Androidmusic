package me.wcy.music.model;

import com.google.gson.annotations.SerializedName;

/**
 * JavaBean
 * Created by wcy on 2015/12/27.
 */
public class DownloadInfo {
    @SerializedName("bitrate")
    private Bitrate bitrate;

    public Bitrate getBitrate() {
        return bitrate;
    }

    public static class Bitrate {
        @SerializedName("file_duration")
        private int file_duration;
        @SerializedName("file_link")
        private String file_link;

        public String getFile_link() {
            return file_link;
        }

    }
}
