
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class MusicGenreList implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4369589176893215768L;
	private MusicGenre musicGenre;

    /**
     * 
     * @return
     *     The musicGenre
     */
    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    /**
     * 
     * @param musicGenre
     *     The music_genre
     */
    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

}
