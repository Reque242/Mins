
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Track implements Serializable {

	private static final long serialVersionUID = 7479766339619554687L;
	private Integer trackId;
    private String trackMbid;
    private String trackIsrc;
    private String trackSpotifyId;
    private Integer trackSoundcloudId;
    private String trackXboxmusicId;
    private String trackName;
    private Integer trackRating;
    private Integer trackLength;
    private Integer instrumental;
    private Integer hasLyrics;
    private Integer hasSubtitles;
    private Integer lyricsId;
    private Integer subtitleId;
    private Integer albumId;
    private String albumName;
    private Integer artistId;
    private String artistMbid;
    private String artistName;
    private String albumCoverart500x500;
    private String trackShareUrl;
    private Integer restricted;
    private String firstReleaseDate;
    private PrimaryGenres primaryGenres;

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public String getTrackIsrc() {
        return trackIsrc;
    }

    public void setTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
    }

    public String getTrackSpotifyId() {
        return trackSpotifyId;
    }

    public void setTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
    }

    public Integer getTrackSoundcloudId() {
        return trackSoundcloudId;
    }

    public void setTrackSoundcloudId(Integer trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
    }

    public String getTrackXboxmusicId() {
        return trackXboxmusicId;
    }

    public void setTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Integer getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(Integer trackRating) {
        this.trackRating = trackRating;
    }

    public Integer getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Integer trackLength) {
        this.trackLength = trackLength;
    }
    
    public Integer getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    public Integer getHasLyrics() {
        return hasLyrics;
    }

    public void setHasLyrics(Integer hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    public Integer getHasSubtitles() {
        return hasSubtitles;
    }

    public void setHasSubtitles(Integer hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
    }

    public Integer getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(Integer subtitleId) {
        this.subtitleId = subtitleId;
    }
    
    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumCoverart500x500() {
        return albumCoverart500x500;
    }

    public void setAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
    }

    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public String getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

}
