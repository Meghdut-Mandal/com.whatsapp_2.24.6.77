package X;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.AXi  reason: case insensitive filesystem */
public class C21711AXi implements Comparator, B5X {
    public float A00;
    public int A01;
    public long A02;
    public final long A03;
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();
    public final TreeSet A06;

    public void BWv(int i, int i2, String str, String str2) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:21|22|33|31|19|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC, Splitter:B:21:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C23077B3i r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            java.lang.String r0 = "perVideoLRUEvict"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = X.C1895394e.A00(r8)     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0051
            java.util.Map r0 = r6.A05     // Catch:{ all -> 0x006a }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x006a }
            java.util.TreeSet r3 = (java.util.TreeSet) r3     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0051
        L_0x0015:
            java.util.Map r0 = r6.A04     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x006a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0051
            long r0 = r0.longValue()     // Catch:{ all -> 0x006a }
            float r5 = (float) r0     // Catch:{ all -> 0x006a }
            long r0 = r6.A03     // Catch:{ all -> 0x006a }
            float r2 = (float) r0     // Catch:{ all -> 0x006a }
            float r5 = r5 / r2
            float r0 = r6.A00     // Catch:{ all -> 0x006a }
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r7 instanceof X.AnonymousClass896     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0047
            r2 = r7
            X.896 r2 = (X.AnonymousClass896) r2     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r3.first()     // Catch:{ all -> 0x006a }
            X.AUg r1 = (X.C21664AUg) r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "lru_policy"
            r2.Bnz(r1, r0)     // Catch:{ all -> 0x006a }
            goto L_0x0015
        L_0x0047:
            java.lang.Object r0 = r3.first()     // Catch:{ 8xL -> 0x0015 }
            X.AUg r0 = (X.C21664AUg) r0     // Catch:{ 8xL -> 0x0015 }
            r7.Bny(r0)     // Catch:{ 8xL -> 0x0015 }
            goto L_0x0015
        L_0x0051:
            long r3 = r6.A02     // Catch:{ all -> 0x006a }
            long r3 = r3 + r9
            long r1 = r6.A03     // Catch:{ all -> 0x006a }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            java.util.TreeSet r0 = r6.A06     // Catch:{ 8xL -> 0x0051 }
            java.lang.Object r0 = r0.first()     // Catch:{ 8xL -> 0x0051 }
            X.AUg r0 = (X.C21664AUg) r0     // Catch:{ 8xL -> 0x0051 }
            r7.Bny(r0)     // Catch:{ 8xL -> 0x0051 }
            goto L_0x0051
        L_0x0066:
            X.C196289Yq.A00()
            return
        L_0x006a:
            r0 = move-exception
            X.C196289Yq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21711AXi.A00(X.B3i, java.lang.String, long):void");
    }

    public void Bgt(C23077B3i b3i, C21664AUg aUg) {
        long j;
        this.A06.add(aUg);
        long j2 = this.A02;
        long j3 = aUg.A04;
        this.A02 = j2 + j3;
        String str = aUg.A07;
        String A002 = C1895394e.A00(str);
        Map map = this.A04;
        Number A0b = C90524aI.A0b(A002, map);
        if (A0b != null) {
            j = A0b.longValue() + j3;
        } else {
            j = j3;
        }
        map.put(A002, Long.valueOf(j));
        if (aUg.A05 > ((long) this.A01)) {
            Map map2 = this.A05;
            AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
            if (abstractCollection != null) {
                abstractCollection.add(aUg);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(aUg);
                map2.put(A002, treeSet);
            }
        }
        A00(b3i, str, 0);
    }

    public void Bgu(C23077B3i b3i, C21664AUg aUg) {
        String A002 = C1895394e.A00(aUg.A07);
        Map map = this.A04;
        Number A0b = C90524aI.A0b(A002, map);
        if (A0b != null) {
            long longValue = A0b.longValue() - aUg.A04;
            Long valueOf = Long.valueOf(longValue);
            if (longValue <= 0) {
                map.remove(A002);
            } else {
                map.put(A002, valueOf);
            }
        }
        Map map2 = this.A05;
        AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
        if (abstractCollection != null) {
            abstractCollection.remove(aUg);
            if (abstractCollection.isEmpty()) {
                map2.remove(A002);
            }
        }
        this.A06.remove(aUg);
        this.A02 -= aUg.A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C21664AUg aUg = (C21664AUg) obj;
        C21664AUg aUg2 = (C21664AUg) obj2;
        long j = aUg.A03;
        long j2 = aUg2.A03;
        if (j - j2 == 0) {
            return aUg.compareTo(aUg2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    public C21711AXi(double d, int i, long j) {
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A03 = j;
        this.A01 = i;
        this.A00 = (float) d;
        this.A06 = new TreeSet(this);
    }

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
        Bgu(b3i, aUg);
        Bgt(b3i, aUg2);
    }

    public void BhF(C23077B3i b3i, String str, long j, long j2) {
        A00(b3i, str, j2);
    }
}
