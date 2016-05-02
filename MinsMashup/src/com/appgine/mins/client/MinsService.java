package com.appgine.mins.client;

import com.appgine.mins.shared.ChartSearch;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("mashup")
public interface MinsService extends RemoteService {
	public ChartSearch getContent(String country);
}
