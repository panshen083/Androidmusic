package me.wcy.music.model;

import com.google.gson.annotations.SerializedName;

/**
 * JavaBean
 * Created by wcy on 2015/12/20.
 */
public class OnlineMusic {
    @SerializedName("pic_big")
    private String pic_big;
    @SerializedName("pic_small")
    private String pic_small;
    @SerializedName("lrclink")
    private String lrclink;
    @SerializedName("song_id")
    private String song_id;
    @SerializedName("title")
    private String title;
    @SerializedName("ting_uid")
    private String ting_uid;
    @SerializedName("album_title")
    private String album_title;
    @SerializedName("artist_name")
    private String artist_name;

    public String getPic_big() {
        return pic_big;
    }

    public String getPic_small() {
        return pic_small;
    }

    public String getLrclink() {
        return lrclink;
    }

    public String getSong_id() {
        return song_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public String getArtist_name() {
        return artist_name;
    }

}
