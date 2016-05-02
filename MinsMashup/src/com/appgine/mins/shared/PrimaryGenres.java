
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PrimaryGenres implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2505137868978611366L;
	private List<MusicGenreList> musicGenreList = new ArrayList<MusicGenreList>();

    /**
     * 
     * @return
     *     The musicGenreList
     */
    public List<MusicGenreList> getMusicGenreList() {
        return musicGenreList;
    }

    /**
     * 
     * @param musicGenreList
     *     The music_genre_list
     */
    public void setMusicGenreList(List<MusicGenreList> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
