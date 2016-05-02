package com.appgine.mins.client;

import com.appgine.mins.server.AlbumSearch;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MinsServiceAsync {

	void getContent(String country, AsyncCallback<AlbumSearch> callback);
	
}
