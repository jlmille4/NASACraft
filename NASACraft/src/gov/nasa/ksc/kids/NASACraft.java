package gov.nasa.ksc.kids;

import org.bukkit.plugin.java.JavaPlugin;

public final class NASACraft extends JavaPlugin {

	 @Override
	public void onEnable(){
		 getLogger().info("onEnabled");
	}
	 
	 
	@Override
	public void onDisable() {
		getLogger().info("onDisabled");
	}

}
