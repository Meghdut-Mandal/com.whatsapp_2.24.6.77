package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1EF  reason: invalid class name */
public class AnonymousClass1EF {
    public final Map A00 = new HashMap();

    public synchronized void A00(int i, int i2) {
        Map map = (Map) this.A00.get(Integer.valueOf(i));
        if (map != null) {
            Integer valueOf = Integer.valueOf(i2);
            Integer num = (Integer) map.get(valueOf);
            if (num != null) {
                map.put(valueOf, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public synchronized void A01(int i, int i2, int i3) {
        Map map = (Map) this.A00.get(Integer.valueOf(i));
        if (map != null) {
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, Integer.valueOf(i3));
            }
        }
    }

    public synchronized boolean A02(int i) {
        return this.A00.containsKey(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (((java.lang.Integer) r1.get(java.lang.Integer.valueOf(r4))) == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x001f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x001f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r2)
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EF.A03(int, int):boolean");
    }
}
