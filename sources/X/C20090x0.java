package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0x0  reason: invalid class name and case insensitive filesystem */
public class C20090x0 {
    public Object[] alternatingKeysAndValues;
    public boolean entriesUsed;
    public int size;

    public C20070wy buildOrThrow() {
        this.entriesUsed = true;
        return C20730y4.create(this.size, this.alternatingKeysAndValues);
    }

    private void ensureCapacity(int i) {
        int i2 = i * 2;
        Object[] objArr = this.alternatingKeysAndValues;
        int length = objArr.length;
        if (i2 > length) {
            this.alternatingKeysAndValues = Arrays.copyOf(objArr, C20820yD.expandedCapacity(length, i2));
            this.entriesUsed = false;
        }
    }

    public C20090x0 putAll(Iterable iterable) {
        if (iterable instanceof Collection) {
            ensureCapacity(this.size + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            put((Map.Entry) it.next());
        }
        return this;
    }

    public C20090x0(int i) {
        this.alternatingKeysAndValues = new Object[(i * 2)];
        this.size = 0;
        this.entriesUsed = false;
    }

    public C20070wy build() {
        return buildOrThrow();
    }

    public C20090x0 put(Map.Entry entry) {
        put(entry.getKey(), entry.getValue());
        return this;
    }

    public C20090x0() {
        this(4);
    }

    public C20090x0 put(Object obj, Object obj2) {
        ensureCapacity(this.size + 1);
        C20080wz.checkEntryNotNull(obj, obj2);
        Object[] objArr = this.alternatingKeysAndValues;
        int i = this.size;
        int i2 = i * 2;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.size = i + 1;
        return this;
    }

    public C20090x0 putAll(Map map) {
        putAll((Iterable) map.entrySet());
        return this;
    }
}
