
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Body implements Serializable {

	private static final long serialVersionUID = -1082685895837655817L;
	private List<TrackList> trackList = new ArrayList<TrackList>();


	@JsonProperty("track_list")
    public List<TrackList> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<TrackList> trackList) {
        this.trackList = trackList;
    }

}
