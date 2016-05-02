
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class TrackList implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4157612047717797631L;
	private Track track;

    /**
     * 
     * @return
     *     The track
     */
    public Track getTrack() {
        return track;
    }

    /**
     * 
     * @param track
     *     The track
     */
    public void setTrack(Track track) {
        this.track = track;
    }

}
