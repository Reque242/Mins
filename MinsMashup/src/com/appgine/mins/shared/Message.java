
package com.appgine.mins.shared;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Message implements Serializable {

	private static final long serialVersionUID = 896529237783017314L;
	private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

}
