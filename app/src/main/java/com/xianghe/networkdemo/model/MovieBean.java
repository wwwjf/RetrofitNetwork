package com.xianghe.networkdemo.model;

import java.io.Serializable;

/**
 * 指定分类数据
 */
public class MovieBean implements Serializable {

    private static final long serialVersionUID = 1147056979522438680L;


    /**
     * id : 34
     * title : 活了几十年，这样的场面还是第一次见
     * media : http://ivystorage.oss-cn-shenzhen.aliyuncs.com/videos/2018-07-31/20180731vu46f1duyztzr67zvzi.mp4
     * comments : 1
     * star : 1
     * like : 0
     * is_like : 0
     * uid : 8272548
     * created_at : 2018-07-31 12:31:22
     * address :
     * cover : http://ivystorage.oss-cn-shenzhen.aliyuncs.com/images/2018-07-31/20180731vu46f1duyztzr67zvzi.png
     * video_length : 02:24
     * username : yellow
     * avatar : http://thirdwx.qlogo.cn/mmopen/Q3auHgzwzM4zmH5H7x4BKFWEzO5tAIyicDPiaV77O2hvIF0OgfuX5icsBzp1TLmh5bEoJc4rOVKvN2O9B4pnvF8FpiaAYEjsulS1Uic5duaNKhQo/132
     * timestamp : 1533011482
     * is_star : 0
     */

    private int id;
    private String title;
    private String media;
    private String comments;
    private String star;
    private String like;
    private String is_like;
    private String uid;
    private String created_at;
    private String address;
    private String cover;
    private String video_length;
    private String username;
    private String avatar;
    private int timestamp;
    private String is_star;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getIs_like() {
        return is_like;
    }

    public void setIs_like(String is_like) {
        this.is_like = is_like;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getVideo_length() {
        return video_length;
    }

    public void setVideo_length(String video_length) {
        this.video_length = video_length;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getIs_star() {
        return is_star;
    }

    public void setIs_star(String is_star) {
        this.is_star = is_star;
    }

    @Override
    public String toString() {
        return "MovieBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", media='" + media + '\'' +
                ", comments='" + comments + '\'' +
                ", star='" + star + '\'' +
                ", like='" + like + '\'' +
                ", is_like='" + is_like + '\'' +
                ", uid='" + uid + '\'' +
                ", created_at='" + created_at + '\'' +
                ", address='" + address + '\'' +
                ", cover='" + cover + '\'' +
                ", video_length='" + video_length + '\'' +
                ", username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", timestamp=" + timestamp +
                ", is_star='" + is_star + '\'' +
                '}';
    }
}
