package org.neos.ws.business;

import org.springframework.stereotype.Service;

@Service("Messages")
public class Messages implements IMessages{

	@Override
	public String getMessageItem() {
		
		return "Libreta cuadro grande Scribe";
	}

}
