
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Track implements Serializable {

	private static final long serialVersionUID = 7479766339619554687L;
	private Integer track_id;
    private String track_mbid;
    private String track_isrc;
    private String track_spotify_id;
    private Integer track_soundcloud_id;
    private String track_xboxmusic_id;
    private String track_name;
    private Integer track_rating;
    private Integer track_length;
    private Integer instrumental;
    private Integer has_lyrics;
    private Integer has_subtitles;
    private Integer lyrics_id;
    private Integer subtitle_id;
    private Integer album_id;
    private String album_name;
    private Integer artist_id;
    private String artist_mbid;
    private String artist_name;
    private String album_coverart_500x500;
    private String track_share_url;
    private Integer restricted;
    private String first_release_date;
    private PrimaryGenres primary_genres;

    public Integer getTrackId() {
        return track_id;
    }

    public void setTrackId(Integer track_id) {
        this.track_id = track_id;
    }

    public String getTrackMbid() {
        return track_mbid;
    }

    public void setTrackMbid(String track_mbid) {
        this.track_mbid = track_mbid;
    }

    public String getTrackIsrc() {
        return track_isrc;
    }

    public void setTrackIsrc(String track_isrc) {
        this.track_isrc = track_isrc;
    }

    public String getTrackSpotifyId() {
        return track_spotify_id;
    }

    public void setTrackSpotifyId(String track_spotify_id) {
        this.track_spotify_id = track_spotify_id;
    }

    public Integer getTrackSoundcloudId() {
        return track_soundcloud_id;
    }

    public void setTrackSoundcloudId(Integer track_soundcloud_id) {
        this.track_soundcloud_id = track_soundcloud_id;
    }

    public String getTrackXboxmusicId() {
        return track_xboxmusic_id;
    }

    public void setTrackXboxmusicId(String track_xboxmusic_id) {
        this.track_xboxmusic_id = track_xboxmusic_id;
    }

    public String getTrackName() {
        return track_name;
    }

    public void setTrackName(String track_name) {
        this.track_name = track_name;
    }

    public Integer getTrackRating() {
        return track_rating;
    }

    public void setTrackRating(Integer track_rating) {
        this.track_rating = track_rating;
    }

    public Integer getTrackLength() {
        return track_length;
    }

    public void setTrackLength(Integer track_length) {
        this.track_length = track_length;
    }
    
    public Integer getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    public Integer getHasLyrics() {
        return has_lyrics;
    }

    public void setHasLyrics(Integer has_lyrics) {
        this.has_lyrics = has_lyrics;
    }

    public Integer getHasSubtitles() {
        return has_subtitles;
    }

    public void setHasSubtitles(Integer has_subtitles) {
        this.has_subtitles = has_subtitles;
    }

    public Integer getLyricsId() {
        return lyrics_id;
    }

    public void setLyricsId(Integer lyrics_id) {
        this.lyrics_id = lyrics_id;
    }

    public Integer getSubtitleId() {
        return subtitle_id;
    }

    public void setSubtitleId(Integer subtitle_id) {
        this.subtitle_id = subtitle_id;
    }
    
    public Integer getAlbumId() {
        return album_id;
    }

    public void setAlbumId(Integer album_id) {
        this.album_id = album_id;
    }


    public String getAlbumName() {
        return album_name;
    }

    public void setAlbumName(String album_name) {
        this.album_name = album_name;
    }

    public Integer getArtistId() {
        return artist_id;
    }

    public void setArtistId(Integer artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtistMbid() {
        return artist_mbid;
    }

    public void setArtistMbid(String artist_mbid) {
        this.artist_mbid = artist_mbid;
    }

    public String getArtistName() {
        return artist_name;
    }

    public void setArtistName(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbumCoverart500x500() {
        return album_coverart_500x500;
    }

    public void setAlbumCoverart500x500(String album_coverart_500x500) {
        this.album_coverart_500x500 = album_coverart_500x500;
    }

    public String getTrackShareUrl() {
        return track_share_url;
    }

    public void setTrackShareUrl(String track_share_url) {
        this.track_share_url = track_share_url;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public String getFirstReleaseDate() {
        return first_release_date;
    }

    public void setFirstReleaseDate(String first_release_date) {
        this.first_release_date = first_release_date;
    }

    @JsonProperty("primary_genres")
    public PrimaryGenres getPrimaryGenres() {
        return primary_genres;
    }

    public void setPrimaryGenres(PrimaryGenres primary_genres) {
        this.primary_genres = primary_genres;
    }

}
