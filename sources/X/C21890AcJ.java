package X;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: X.AcJ  reason: case insensitive filesystem */
public class C21890AcJ<K, V> extends AbstractMap<V, K> implements C162227oF<V, K>, Serializable {
    public final C21891AcK forward;
    public transient Set inverseEntrySet;

    public void clear() {
        this.forward.clear();
    }

    public boolean containsKey(Object obj) {
        return this.forward.containsValue(obj);
    }

    public boolean containsValue(Object obj) {
        return this.forward.containsKey(obj);
    }

    public Set entrySet() {
        Set set = this.inverseEntrySet;
        if (set != null) {
            return set;
        }
        AnonymousClass8Ha r1 = new AnonymousClass8Ha(this.forward);
        this.inverseEntrySet = r1;
        return r1;
    }

    public Object get(Object obj) {
        return this.forward.getInverse(obj);
    }

    public Set keySet() {
        return this.forward.values();
    }

    public Object put(Object obj, Object obj2) {
        return this.forward.putInverse(obj, obj2, false);
    }

    public Object remove(Object obj) {
        return this.forward.removeInverse(obj);
    }

    public int size() {
        return this.forward.size;
    }

    public Set values() {
        return this.forward.keySet();
    }

    public C21890AcJ(C21891AcK acK) {
        this.forward = acK;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C162227oF unused = this.forward.inverse = this;
    }

    public C162227oF inverse() {
        throw null;
    }
}
