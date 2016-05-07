
package com.appgine.mins.shared;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ChartSearch implements Serializable {

	private static final long serialVersionUID = -8669541650481535251L;	
	private Message message;

	@JsonProperty("message")
    public Message getMessage() {
        return message;
    }
	@JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

}
