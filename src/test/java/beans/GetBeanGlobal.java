package beans;

import  global.GlobalInterface;
import  global.GlobalObject;

public class GetBeanGlobal {
	
	private static InheritableThreadLocal<GlobalInterface> threadLocalGbl = new InheritableThreadLocal<GlobalInterface>();
	public static GlobalObject glo = new GlobalObject();
	
	public static void GetGlobalBean(){
		threadLocalGbl.set(glo);
	}

	public static GlobalInterface gloObj(){
		return threadLocalGbl.get();
		
	}
}
