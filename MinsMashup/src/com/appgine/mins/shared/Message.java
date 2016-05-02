
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Message implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 896529237783017314L;
	private Header header;
    private Body body;

    /**
     * 
     * @return
     *     The header
     */
    public Header getHeader() {
        return header;
    }

    /**
     * 
     * @param header
     *     The header
     */
    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     * 
     * @return
     *     The body
     */
    public Body getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(Body body) {
        this.body = body;
    }

}
