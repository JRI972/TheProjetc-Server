package net.theproject.server;

import net.fabricmc.api.ModInitializer;
import net.theproject.server.elements.EntityInit;
import net.theproject.server.elements.ItemInit;

import static net.theproject.server.utils.Logger.logInfo;


public class Init implements ModInitializer {

	public static final String MOD_ID = "tpserver";
	
	

	@Override
	public void onInitialize() {
		logInfo("Hello Fabric world!");


		//Registerie
			ItemInit.Init();
			EntityInit.init();
	}
}
