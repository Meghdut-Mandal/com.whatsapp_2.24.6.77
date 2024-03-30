package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AcO  reason: case insensitive filesystem */
public class C21895AcO extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C21892AcL this$0;

    public C21895AcO(C21892AcL acL) {
        this.this$0 = acL;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        C21892AcL acL = this.this$0;
        Map delegateOrNull = acL.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int access$500 = acL.indexOf(entry.getKey());
        if (access$500 == -1 || !C1897595l.A00(this.this$0.value(access$500), entry.getValue())) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return this.this$0.entrySetIterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r5 = r1.hashTableMask();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.Object r11) {
        /*
            r10 = this;
            X.AcL r1 = r10.this$0
            java.util.Map r0 = r1.delegateOrNull()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r0 = r0.remove(r11)
            return r0
        L_0x0011:
            boolean r0 = r11 instanceof java.util.Map.Entry
            r2 = 0
            if (r0 == 0) goto L_0x0058
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            boolean r0 = r1.needsAllocArrays()
            if (r0 != 0) goto L_0x0058
            int r5 = r1.hashTableMask()
            java.lang.Object r3 = r11.getKey()
            java.lang.Object r4 = r11.getValue()
            X.AcL r0 = r10.this$0
            java.lang.Object r6 = r0.requireTable()
            X.AcL r0 = r10.this$0
            int[] r7 = r0.requireEntries()
            X.AcL r0 = r10.this$0
            java.lang.Object[] r8 = r0.requireKeys()
            X.AcL r0 = r10.this$0
            java.lang.Object[] r9 = r0.requireValues()
            int r1 = X.C203409ny.remove(r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            if (r1 == r0) goto L_0x0058
            X.AcL r0 = r10.this$0
            r0.moveLastEntry(r1, r5)
            X.AcL r0 = r10.this$0
            X.C21892AcL.access$1210(r0)
            r0.incrementModCount()
            r0 = 1
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21895AcO.remove(java.lang.Object):boolean");
    }

    public int size() {
        return this.this$0.size();
    }
}
