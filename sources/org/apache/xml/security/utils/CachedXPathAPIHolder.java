package org.apache.xml.security.utils;

import org.apache.xpath.CachedXPathAPI;
import org.w3c.dom.Document;

public class CachedXPathAPIHolder {
    public static ThreadLocal a = new ThreadLocal();
    public static ThreadLocal b = new ThreadLocal();

    public static CachedXPathAPI a() {
        CachedXPathAPI cachedXPathAPI = (CachedXPathAPI) a.get();
        if (cachedXPathAPI != null) {
            return cachedXPathAPI;
        }
        CachedXPathAPI cachedXPathAPI2 = new CachedXPathAPI();
        a.set(cachedXPathAPI2);
        b.set((Object) null);
        return cachedXPathAPI2;
    }

    public static void a(Document document) {
        if (b.get() != document) {
            CachedXPathAPI cachedXPathAPI = (CachedXPathAPI) a.get();
            if (cachedXPathAPI == null) {
                a.set(new CachedXPathAPI());
            } else {
                cachedXPathAPI.getXPathContext().reset();
            }
            b.set(document);
        }
    }
}
