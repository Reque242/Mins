
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MusicGenreList implements Serializable {

	private static final long serialVersionUID = 4369589176893215768L;
	private MusicGenre music_genre;

	@JsonProperty("music_genre")
    public MusicGenre getMusicGenre() {
        return music_genre;
    }

    public void setMusicGenre(MusicGenre music_genre) {
        this.music_genre = music_genre;
    }

}
