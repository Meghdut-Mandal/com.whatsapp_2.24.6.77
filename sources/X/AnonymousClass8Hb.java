package X;

import java.util.Map;

/* renamed from: X.8Hb  reason: invalid class name */
public final class AnonymousClass8Hb extends C21894AcN<K, V, Map.Entry<K, V>> {
    public final /* synthetic */ C21891AcK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Hb(C21891AcK acK) {
        super(acK);
        this.this$0 = acK;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByKey = this.this$0.findEntryByKey(key);
        if (findEntryByKey == -1 || !C1897595l.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new AnonymousClass8HP(this.this$0, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = C20770y8.smearedHash(key);
        int findEntryByKey = this.this$0.findEntryByKey(key, smearedHash);
        if (findEntryByKey == -1 || !C1897595l.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}
