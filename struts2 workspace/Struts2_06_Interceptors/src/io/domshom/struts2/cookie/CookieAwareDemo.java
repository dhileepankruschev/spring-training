package io.domshom.struts2.cookie;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.CookiesAware;

import com.opensymphony.xwork2.ActionSupport;

/*Aware is IOC/DependencyInjection*/
public class CookieAwareDemo extends ActionSupport implements CookiesAware {
	Map<String, String> cmap;

	public Map<String, String> getCmap() {
		return cmap;
	}

	@Override
	public void setCookiesMap(Map<String, String> cmap) {
		this.cmap = cmap;
	}

	@Override
	public String execute() throws Exception {
		Set<String> keymap = cmap.keySet();
		Iterator<String> keys = keymap.iterator();
		while (keys.hasNext()) {
			String cname = (String) keys.next();
			String cvalue = cmap.get(cname);
			if (!cname.startsWith("JS")) 
				cmap.put(cname, cvalue);
			System.out.println(cname + "\t" + cvalue);
		}
		return SUCCESS;
	}
}