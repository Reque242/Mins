
package com.appgine.mins.shared;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Header implements Serializable {

	private static final long serialVersionUID = 62585884418517191L;
	private Integer status_code;
    private Double execute_time;

    public Integer getStatusCode() {
        return status_code;
    }

    public void setStatusCode(Integer status_code) {
        this.status_code = status_code;
    }

    public Double getExecuteTime() {
        return execute_time;
    }

    public void setExecuteTime(Double execute_time) {
        this.execute_time = execute_time;
    }

}
