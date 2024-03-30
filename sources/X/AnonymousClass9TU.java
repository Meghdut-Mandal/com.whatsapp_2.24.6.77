package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.9TU  reason: invalid class name */
public abstract class AnonymousClass9TU {
    public final Map builderMap = C201739kJ.preservesInsertionOrderOnPutsMap();

    public abstract Collection newMutableValueCollection();

    public AnonymousClass9TU put(Object obj, Object obj2) {
        C20080wz.checkEntryNotNull(obj, obj2);
        Collection collection = (Collection) this.builderMap.get(obj);
        if (collection == null) {
            Map map = this.builderMap;
            collection = newMutableValueCollection();
            map.put(obj, collection);
        }
        collection.add(obj2);
        return this;
    }
}
