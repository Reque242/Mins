
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Body implements Serializable {

	private static final long serialVersionUID = -1082685895837655817L;
	private List<TrackList> track_list = new ArrayList<TrackList>();

	@JsonProperty("track_list")
    public List<TrackList> getTrackList() {
        return track_list;
    }

    public void setTrackList(List<TrackList> track_list) {
        this.track_list = track_list;
    }

}
