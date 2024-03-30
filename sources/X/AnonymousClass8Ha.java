package X;

import java.util.Map;

/* renamed from: X.8Ha  reason: invalid class name */
public class AnonymousClass8Ha<K, V> extends C21894AcN<K, V, Map.Entry<V, K>> {
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByValue = this.biMap.findEntryByValue(key);
        if (findEntryByValue == -1 || !C1897595l.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new AnonymousClass8HR(this.biMap, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = C20770y8.smearedHash(key);
        int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
        if (findEntryByValue == -1 || !C1897595l.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }

    public AnonymousClass8Ha(C21891AcK acK) {
        super(acK);
    }
}
