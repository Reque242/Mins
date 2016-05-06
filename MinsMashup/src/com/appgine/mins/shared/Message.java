
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message implements Serializable {

	private static final long serialVersionUID = 896529237783017314L;
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
