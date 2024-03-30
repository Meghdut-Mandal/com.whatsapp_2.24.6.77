package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.6El  reason: invalid class name */
public class AnonymousClass6El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final AnonymousClass5XY A05 = new AnonymousClass5XY();
    public final HashMap A06 = new HashMap(0, 0.75f);
    public final LinkedHashSet A07 = C36441kJ.A17();

    public final int A00() {
        int i;
        synchronized (this.A05) {
            i = this.A01;
        }
        return i;
    }

    public final Object A01(Object obj) {
        synchronized (this.A05) {
            Object obj2 = this.A06.get(obj);
            if (obj2 != null) {
                LinkedHashSet linkedHashSet = this.A07;
                linkedHashSet.remove(obj);
                linkedHashSet.add(obj);
                this.A02++;
                return obj2;
            }
            this.A03++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0 = X.AnonymousClass001.A09("inconsistent state");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00a7
            X.5XY r3 = r8.A05
            monitor-enter(r3)
            int r0 = r8.A04     // Catch:{ all -> 0x00a4 }
            int r0 = r0 + 1
            r8.A04 = r0     // Catch:{ all -> 0x00a4 }
            int r0 = r8.A00()     // Catch:{ all -> 0x00a4 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x00a4 }
            java.util.HashMap r5 = r8.A06     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r5.put(r9, r10)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0023
            int r1 = r8.A00()     // Catch:{ all -> 0x00a4 }
            r0 = 1
            int r1 = r1 - r0
            r8.A01 = r1     // Catch:{ all -> 0x00a4 }
        L_0x0023:
            java.util.LinkedHashSet r6 = r8.A07     // Catch:{ all -> 0x00a4 }
            boolean r0 = r6.contains(r9)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x002e
            r6.remove(r9)     // Catch:{ all -> 0x00a4 }
        L_0x002e:
            r6.add(r9)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)
            r7 = 16
        L_0x0034:
            monitor-enter(r3)
            int r0 = r8.A00()     // Catch:{ all -> 0x00a4 }
            if (r0 < 0) goto L_0x009d
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0047
            int r0 = r8.A00()     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x009d
        L_0x0047:
            boolean r1 = r5.isEmpty()     // Catch:{ all -> 0x00a4 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r1 != r0) goto L_0x009d
            int r0 = r8.A00()     // Catch:{ all -> 0x00a4 }
            r4 = 0
            if (r0 <= r7) goto L_0x0088
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0088
            java.lang.Object r4 = X.C007103b.A0H(r6)     // Catch:{ all -> 0x00a4 }
            java.lang.Object r2 = r5.get(r4)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0096
            java.util.Map r0 = X.C07710Yz.A02(r5)     // Catch:{ all -> 0x00a4 }
            r0.remove(r4)     // Catch:{ all -> 0x00a4 }
            java.util.Collection r0 = X.C07710Yz.A00(r6)     // Catch:{ all -> 0x00a4 }
            r0.remove(r4)     // Catch:{ all -> 0x00a4 }
            int r1 = r8.A00()     // Catch:{ all -> 0x00a4 }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x00a4 }
            r0 = 1
            int r1 = r1 - r0
            r8.A01 = r1     // Catch:{ all -> 0x00a4 }
            int r0 = r8.A00     // Catch:{ all -> 0x00a4 }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x0089
        L_0x0088:
            r2 = r4
        L_0x0089:
            monitor-exit(r3)
            if (r4 != 0) goto L_0x008f
            if (r2 != 0) goto L_0x008f
            return
        L_0x008f:
            X.AnonymousClass00C.A0B(r4)
            X.AnonymousClass00C.A0B(r2)
            goto L_0x0034
        L_0x0096:
            java.lang.String r0 = "inconsistent state"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a3
        L_0x009d:
            java.lang.String r0 = "map/keySet size inconsistency"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00a7:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6El.A02(java.lang.Object, java.lang.Object):void");
    }

    public String toString() {
        String A0q;
        synchronized (this.A05) {
            int i = this.A02;
            int i2 = this.A03;
            int i3 = i2 + i;
            int i4 = 0;
            if (i3 != 0) {
                i4 = (i * 100) / i3;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LruCache[maxSize=");
            A0u.append(16);
            A0u.append(",hits=");
            A0u.append(i);
            A0u.append(",misses=");
            A0u.append(i2);
            A0u.append(",hitRate=");
            A0u.append(i4);
            A0q = AnonymousClass000.A0q("%]", A0u);
        }
        return A0q;
    }
}
