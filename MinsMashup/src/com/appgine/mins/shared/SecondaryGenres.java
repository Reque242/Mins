
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SecondaryGenres implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1209814164783687954L;
	private List<Object> musicGenreList = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The musicGenreList
     */
    public List<Object> getMusicGenreList() {
        return musicGenreList;
    }

    /**
     * 
     * @param musicGenreList
     *     The music_genre_list
     */
    public void setMusicGenreList(List<Object> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
