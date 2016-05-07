
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MusicGenre implements Serializable {

	private static final long serialVersionUID = 6659007254860947665L;
	private Integer music_genre_id;
    private Integer music_genre_parent_id;
    private String music_genre_name;
    private String music_genre_name_extended;

    public Integer getMusicGenreId() {
        return music_genre_id;
    }

    public void setMusicGenreId(Integer music_genre_id) {
        this.music_genre_id = music_genre_id;
    }
    public Integer getMusicGenreParentId() {
        return music_genre_parent_id;
    }
    
    public void setMusicGenreParentId(Integer music_genre_parent_id) {
        this.music_genre_parent_id = music_genre_parent_id;
    }

    public String getMusicGenreName() {
        return music_genre_name;
    }

    public void setMusicGenreName(String music_genre_name) {
        this.music_genre_name = music_genre_name;
    }

    public String getMusicGenreNameExtended() {
        return music_genre_name_extended;
    }

    public void setMusicGenreNameExtended(String music_genre_name_extended) {
        this.music_genre_name_extended = music_genre_name_extended;
    }

}
