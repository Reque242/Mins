
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class MusicGenre implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6659007254860947665L;
	private Integer musicGenreId;
    private Integer musicGenreParentId;
    private String musicGenreName;
    private String musicGenreNameExtended;
    private String musicGenreVanity;

    /**
     * 
     * @return
     *     The musicGenreId
     */
    public Integer getMusicGenreId() {
        return musicGenreId;
    }

    /**
     * 
     * @param musicGenreId
     *     The music_genre_id
     */
    public void setMusicGenreId(Integer musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    /**
     * 
     * @return
     *     The musicGenreParentId
     */
    public Integer getMusicGenreParentId() {
        return musicGenreParentId;
    }

    /**
     * 
     * @param musicGenreParentId
     *     The music_genre_parent_id
     */
    public void setMusicGenreParentId(Integer musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    /**
     * 
     * @return
     *     The musicGenreName
     */
    public String getMusicGenreName() {
        return musicGenreName;
    }

    /**
     * 
     * @param musicGenreName
     *     The music_genre_name
     */
    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    /**
     * 
     * @return
     *     The musicGenreNameExtended
     */
    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    /**
     * 
     * @param musicGenreNameExtended
     *     The music_genre_name_extended
     */
    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    /**
     * 
     * @return
     *     The musicGenreVanity
     */
    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    /**
     * 
     * @param musicGenreVanity
     *     The music_genre_vanity
     */
    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

}
