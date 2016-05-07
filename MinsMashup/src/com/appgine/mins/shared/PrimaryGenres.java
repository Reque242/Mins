
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PrimaryGenres implements Serializable {

	private static final long serialVersionUID = -2505137868978611366L;
	private List<MusicGenreList> music_genre_list = new ArrayList<MusicGenreList>();

	@JsonProperty("music_genre_list")
    public List<MusicGenreList> getMusicGenreList() {
        return music_genre_list;
    }

    public void setMusicGenreList(List<MusicGenreList> music_genre_list) {
        this.music_genre_list = music_genre_list;
    }

}
