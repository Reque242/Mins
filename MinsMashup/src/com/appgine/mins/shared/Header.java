
package com.appgine.mins.shared;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Header implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8718081048928692811L;
	private Integer statusCode;
    private Double executeTime;

    /**
     * 
     * @return
     *     The statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The status_code
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The executeTime
     */
    public Double getExecuteTime() {
        return executeTime;
    }

    /**
     * 
     * @param executeTime
     *     The execute_time
     */
    public void setExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
    }

}
