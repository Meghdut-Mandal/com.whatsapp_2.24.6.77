package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.166  reason: invalid class name */
public class AnonymousClass166<K, V> extends LinkedHashMap<K, V> {
    public final int cacheLimit;

    public AnonymousClass166(int i) {
        super((int) (((float) Math.ceil((double) (((float) i) / 0.75f))) + ((float) 1)), 0.75f, true);
        this.cacheLimit = i;
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.cacheLimit) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }
}
