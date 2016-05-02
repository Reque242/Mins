
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Track implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7479766339619554687L;
	private Integer trackId;
    private String trackMbid;
    private String trackIsrc;
    private String trackSpotifyId;
    private Integer trackSoundcloudId;
    private String trackXboxmusicId;
    private String trackName;
    private List<Object> trackNameTranslationList = new ArrayList<Object>();
    private Integer trackRating;
    private Integer trackLength;
    private Integer commontrackId;
    private Integer instrumental;
    private Integer explicit;
    private Integer hasLyrics;
    private Integer hasSubtitles;
    private Integer numFavourite;
    private Integer lyricsId;
    private Integer subtitleId;
    private Integer albumId;
    private String albumName;
    private Integer artistId;
    private String artistMbid;
    private String artistName;
    private String albumCoverart100x100;
    private String albumCoverart350x350;
    private String albumCoverart500x500;
    private String albumCoverart800x800;
    private String trackShareUrl;
    private String trackEditUrl;
    private String commontrackVanityId;
    private Integer restricted;
    private String firstReleaseDate;
    private String updatedTime;
    private PrimaryGenres primaryGenres;
    private SecondaryGenres secondaryGenres;

    /**
     * 
     * @return
     *     The trackId
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     * 
     * @param trackId
     *     The track_id
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     * 
     * @return
     *     The trackMbid
     */
    public String getTrackMbid() {
        return trackMbid;
    }

    /**
     * 
     * @param trackMbid
     *     The track_mbid
     */
    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    /**
     * 
     * @return
     *     The trackIsrc
     */
    public String getTrackIsrc() {
        return trackIsrc;
    }

    /**
     * 
     * @param trackIsrc
     *     The track_isrc
     */
    public void setTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
    }

    /**
     * 
     * @return
     *     The trackSpotifyId
     */
    public String getTrackSpotifyId() {
        return trackSpotifyId;
    }

    /**
     * 
     * @param trackSpotifyId
     *     The track_spotify_id
     */
    public void setTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
    }

    /**
     * 
     * @return
     *     The trackSoundcloudId
     */
    public Integer getTrackSoundcloudId() {
        return trackSoundcloudId;
    }

    /**
     * 
     * @param trackSoundcloudId
     *     The track_soundcloud_id
     */
    public void setTrackSoundcloudId(Integer trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
    }

    /**
     * 
     * @return
     *     The trackXboxmusicId
     */
    public String getTrackXboxmusicId() {
        return trackXboxmusicId;
    }

    /**
     * 
     * @param trackXboxmusicId
     *     The track_xboxmusic_id
     */
    public void setTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
    }

    /**
     * 
     * @return
     *     The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * 
     * @param trackName
     *     The track_name
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * 
     * @return
     *     The trackNameTranslationList
     */
    public List<Object> getTrackNameTranslationList() {
        return trackNameTranslationList;
    }

    /**
     * 
     * @param trackNameTranslationList
     *     The track_name_translation_list
     */
    public void setTrackNameTranslationList(List<Object> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
    }

    /**
     * 
     * @return
     *     The trackRating
     */
    public Integer getTrackRating() {
        return trackRating;
    }

    /**
     * 
     * @param trackRating
     *     The track_rating
     */
    public void setTrackRating(Integer trackRating) {
        this.trackRating = trackRating;
    }

    /**
     * 
     * @return
     *     The trackLength
     */
    public Integer getTrackLength() {
        return trackLength;
    }

    /**
     * 
     * @param trackLength
     *     The track_length
     */
    public void setTrackLength(Integer trackLength) {
        this.trackLength = trackLength;
    }

    /**
     * 
     * @return
     *     The commontrackId
     */
    public Integer getCommontrackId() {
        return commontrackId;
    }

    /**
     * 
     * @param commontrackId
     *     The commontrack_id
     */
    public void setCommontrackId(Integer commontrackId) {
        this.commontrackId = commontrackId;
    }

    /**
     * 
     * @return
     *     The instrumental
     */
    public Integer getInstrumental() {
        return instrumental;
    }

    /**
     * 
     * @param instrumental
     *     The instrumental
     */
    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    /**
     * 
     * @return
     *     The explicit
     */
    public Integer getExplicit() {
        return explicit;
    }

    /**
     * 
     * @param explicit
     *     The explicit
     */
    public void setExplicit(Integer explicit) {
        this.explicit = explicit;
    }

    /**
     * 
     * @return
     *     The hasLyrics
     */
    public Integer getHasLyrics() {
        return hasLyrics;
    }

    /**
     * 
     * @param hasLyrics
     *     The has_lyrics
     */
    public void setHasLyrics(Integer hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    /**
     * 
     * @return
     *     The hasSubtitles
     */
    public Integer getHasSubtitles() {
        return hasSubtitles;
    }

    /**
     * 
     * @param hasSubtitles
     *     The has_subtitles
     */
    public void setHasSubtitles(Integer hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    /**
     * 
     * @return
     *     The numFavourite
     */
    public Integer getNumFavourite() {
        return numFavourite;
    }

    /**
     * 
     * @param numFavourite
     *     The num_favourite
     */
    public void setNumFavourite(Integer numFavourite) {
        this.numFavourite = numFavourite;
    }

    /**
     * 
     * @return
     *     The lyricsId
     */
    public Integer getLyricsId() {
        return lyricsId;
    }

    /**
     * 
     * @param lyricsId
     *     The lyrics_id
     */
    public void setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
    }

    /**
     * 
     * @return
     *     The subtitleId
     */
    public Integer getSubtitleId() {
        return subtitleId;
    }

    /**
     * 
     * @param subtitleId
     *     The subtitle_id
     */
    public void setSubtitleId(Integer subtitleId) {
        this.subtitleId = subtitleId;
    }

    /**
     * 
     * @return
     *     The albumId
     */
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * 
     * @param albumId
     *     The album_id
     */
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    /**
     * 
     * @return
     *     The albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * 
     * @param albumName
     *     The album_name
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * 
     * @return
     *     The artistId
     */
    public Integer getArtistId() {
        return artistId;
    }

    /**
     * 
     * @param artistId
     *     The artist_id
     */
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    /**
     * 
     * @return
     *     The artistMbid
     */
    public String getArtistMbid() {
        return artistMbid;
    }

    /**
     * 
     * @param artistMbid
     *     The artist_mbid
     */
    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artist_name
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The albumCoverart100x100
     */
    public String getAlbumCoverart100x100() {
        return albumCoverart100x100;
    }

    /**
     * 
     * @param albumCoverart100x100
     *     The album_coverart_100x100
     */
    public void setAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
    }

    /**
     * 
     * @return
     *     The albumCoverart350x350
     */
    public String getAlbumCoverart350x350() {
        return albumCoverart350x350;
    }

    /**
     * 
     * @param albumCoverart350x350
     *     The album_coverart_350x350
     */
    public void setAlbumCoverart350x350(String albumCoverart350x350) {
        this.albumCoverart350x350 = albumCoverart350x350;
    }

    /**
     * 
     * @return
     *     The albumCoverart500x500
     */
    public String getAlbumCoverart500x500() {
        return albumCoverart500x500;
    }

    /**
     * 
     * @param albumCoverart500x500
     *     The album_coverart_500x500
     */
    public void setAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
    }

    /**
     * 
     * @return
     *     The albumCoverart800x800
     */
    public String getAlbumCoverart800x800() {
        return albumCoverart800x800;
    }

    /**
     * 
     * @param albumCoverart800x800
     *     The album_coverart_800x800
     */
    public void setAlbumCoverart800x800(String albumCoverart800x800) {
        this.albumCoverart800x800 = albumCoverart800x800;
    }

    /**
     * 
     * @return
     *     The trackShareUrl
     */
    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    /**
     * 
     * @param trackShareUrl
     *     The track_share_url
     */
    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    /**
     * 
     * @return
     *     The trackEditUrl
     */
    public String getTrackEditUrl() {
        return trackEditUrl;
    }

    /**
     * 
     * @param trackEditUrl
     *     The track_edit_url
     */
    public void setTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
    }

    /**
     * 
     * @return
     *     The commontrackVanityId
     */
    public String getCommontrackVanityId() {
        return commontrackVanityId;
    }

    /**
     * 
     * @param commontrackVanityId
     *     The commontrack_vanity_id
     */
    public void setCommontrackVanityId(String commontrackVanityId) {
        this.commontrackVanityId = commontrackVanityId;
    }

    /**
     * 
     * @return
     *     The restricted
     */
    public Integer getRestricted() {
        return restricted;
    }

    /**
     * 
     * @param restricted
     *     The restricted
     */
    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    /**
     * 
     * @return
     *     The firstReleaseDate
     */
    public String getFirstReleaseDate() {
        return firstReleaseDate;
    }

    /**
     * 
     * @param firstReleaseDate
     *     The first_release_date
     */
    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    /**
     * 
     * @return
     *     The updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 
     * @param updatedTime
     *     The updated_time
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 
     * @return
     *     The primaryGenres
     */
    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    /**
     * 
     * @param primaryGenres
     *     The primary_genres
     */
    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

    /**
     * 
     * @return
     *     The secondaryGenres
     */
    public SecondaryGenres getSecondaryGenres() {
        return secondaryGenres;
    }

    /**
     * 
     * @param secondaryGenres
     *     The secondary_genres
     */
    public void setSecondaryGenres(SecondaryGenres secondaryGenres) {
        this.secondaryGenres = secondaryGenres;
    }

}
