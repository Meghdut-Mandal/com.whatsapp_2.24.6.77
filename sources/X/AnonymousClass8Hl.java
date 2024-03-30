package X;

import java.util.Map;

/* renamed from: X.8Hl  reason: invalid class name */
public class AnonymousClass8Hl<K, V> extends C20760y7<Map.Entry<K, V>> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient C20070wy map;
    public final transient int size;

    public boolean isPartialView() {
        return true;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.map.get(key))) {
            return false;
        }
        return true;
    }

    public C23931Ak createAsList() {
        return new AnonymousClass8Hd(this);
    }

    public AnonymousClass8Hl(C20070wy r2, Object[] objArr, int i, int i2) {
        this.map = r2;
        this.alternatingKeysAndValues = objArr;
        this.size = i2;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public C225614x iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.size;
    }

    public static /* synthetic */ int access$200(AnonymousClass8Hl r0) {
        return 0;
    }
}
