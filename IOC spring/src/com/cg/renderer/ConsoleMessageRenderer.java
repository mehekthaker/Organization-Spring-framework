package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer{

	private MessageProvider provider;
	
	@Override
	public void render() {
		System.out.println(provider.getMessage());
		
	}

	public ConsoleMessageRenderer(MessageProvider provider) {
		super();
		this.provider = provider;
	}
	
	

	/*@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider=provider;
		
	}*/

}
