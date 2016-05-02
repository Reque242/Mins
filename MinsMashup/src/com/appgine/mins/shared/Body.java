
package com.appgine.mins.shared;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Body implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1082685895837655817L;
	private List<TrackList> trackList = new ArrayList<TrackList>();

    /**
     * 
     * @return
     *     The trackList
     */
    public List<TrackList> getTrackList() {
        return trackList;
    }

    /**
     * 
     * @param trackList
     *     The track_list
     */
    public void setTrackList(List<TrackList> trackList) {
        this.trackList = trackList;
    }

}
