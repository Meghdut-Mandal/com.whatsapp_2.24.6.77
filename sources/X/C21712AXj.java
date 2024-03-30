package X;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.AXj  reason: case insensitive filesystem */
public class C21712AXj implements Comparator, B5X {
    public long A00;
    public long A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final Map A05 = AnonymousClass001.A0J();
    public final float A06;
    public final int A07;
    public final Map A08 = AnonymousClass001.A0J();
    public final SortedSet A09;
    public final TreeSet A0A;

    public void BWv(int i, int i2, String str, String str2) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|(6:21|22|23|(2:27|(3:29|44|41))|30|(3:32|45|41)(1:42))(1:43)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[EDGE_INSN: B:46:0x0051->B:18:0x0051 ?: BREAK  , LOOP:1: B:18:0x0051->B:41:0x0051, LOOP_START, SYNTHETIC, Splitter:B:18:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C23077B3i r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "preVideoLruProtectPrefetchEvict"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = X.C1895394e.A00(r9)     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0051
            java.util.Map r0 = r7.A08     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0096 }
            java.util.TreeSet r3 = (java.util.TreeSet) r3     // Catch:{ all -> 0x0096 }
            if (r3 == 0) goto L_0x0051
        L_0x0015:
            java.util.Map r0 = r7.A05     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0096 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0051
            long r0 = r0.longValue()     // Catch:{ all -> 0x0096 }
            float r5 = (float) r0     // Catch:{ all -> 0x0096 }
            long r0 = r7.A04     // Catch:{ all -> 0x0096 }
            float r2 = (float) r0     // Catch:{ all -> 0x0096 }
            float r5 = r5 / r2
            float r0 = r7.A02     // Catch:{ all -> 0x0096 }
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r8 instanceof X.AnonymousClass896     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0047
            r2 = r8
            X.896 r2 = (X.AnonymousClass896) r2     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r3.first()     // Catch:{ all -> 0x0096 }
            X.AUg r1 = (X.C21664AUg) r1     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "lru_policy"
            r2.Bnz(r1, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0015
        L_0x0047:
            java.lang.Object r0 = r3.first()     // Catch:{ 8xL -> 0x0015 }
            X.AUg r0 = (X.C21664AUg) r0     // Catch:{ 8xL -> 0x0015 }
            r8.Bny(r0)     // Catch:{ 8xL -> 0x0015 }
            goto L_0x0015
        L_0x0051:
            long r5 = r7.A00     // Catch:{ all -> 0x0096 }
            long r0 = r7.A01     // Catch:{ all -> 0x0096 }
            long r5 = r5 + r0
            long r5 = r5 + r10
            long r3 = r7.A04     // Catch:{ all -> 0x0096 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            float r2 = (float) r0     // Catch:{ all -> 0x0096 }
            float r1 = (float) r3     // Catch:{ all -> 0x0096 }
            float r0 = r7.A06     // Catch:{ 8xL -> 0x0051 }
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
            java.util.SortedSet r0 = r7.A09     // Catch:{ 8xL -> 0x0051 }
            boolean r0 = r0.isEmpty()     // Catch:{ 8xL -> 0x0051 }
            if (r0 == 0) goto L_0x0080
        L_0x006e:
            java.util.TreeSet r1 = r7.A0A     // Catch:{ 8xL -> 0x0051 }
            boolean r0 = r1.isEmpty()     // Catch:{ 8xL -> 0x0051 }
            if (r0 != 0) goto L_0x0080
            java.lang.Object r0 = r1.first()     // Catch:{ 8xL -> 0x0051 }
            X.AUg r0 = (X.C21664AUg) r0     // Catch:{ 8xL -> 0x0051 }
            r8.Bny(r0)     // Catch:{ 8xL -> 0x0051 }
            goto L_0x0051
        L_0x0080:
            java.util.SortedSet r1 = r7.A09     // Catch:{ 8xL -> 0x0051 }
            boolean r0 = r1.isEmpty()     // Catch:{ 8xL -> 0x0051 }
            if (r0 != 0) goto L_0x0092
            java.lang.Object r0 = r1.first()     // Catch:{ 8xL -> 0x0051 }
            X.AUg r0 = (X.C21664AUg) r0     // Catch:{ 8xL -> 0x0051 }
            r8.Bny(r0)     // Catch:{ 8xL -> 0x0051 }
            goto L_0x0051
        L_0x0092:
            X.C196289Yq.A00()
            return
        L_0x0096:
            r0 = move-exception
            X.C196289Yq.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21712AXj.A00(X.B3i, java.lang.String, long):void");
    }

    public void Bgt(C23077B3i b3i, C21664AUg aUg) {
        long j;
        long j2;
        long j3 = aUg.A05;
        if (j3 <= ((long) this.A03)) {
            this.A0A.add(aUg);
            long j4 = this.A01;
            j = aUg.A04;
            this.A01 = j4 + j;
        } else {
            this.A09.add(aUg);
            long j5 = this.A00;
            j = aUg.A04;
            this.A00 = j5 + j;
        }
        String str = aUg.A07;
        String A002 = C1895394e.A00(str);
        Map map = this.A05;
        Number A0b = C90524aI.A0b(A002, map);
        if (A0b != null) {
            j2 = A0b.longValue() + j;
        } else {
            j2 = j;
        }
        map.put(A002, Long.valueOf(j2));
        if (j3 > ((long) this.A07)) {
            Map map2 = this.A08;
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
        Map map = this.A05;
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
        Map map2 = this.A08;
        AbstractCollection abstractCollection = (AbstractCollection) map2.get(A002);
        if (abstractCollection != null) {
            abstractCollection.remove(aUg);
            if (abstractCollection.isEmpty()) {
                map2.remove(A002);
            }
        }
        if (aUg.A05 <= ((long) this.A03)) {
            this.A0A.remove(aUg);
            this.A01 -= aUg.A04;
            return;
        }
        this.A09.remove(aUg);
        this.A00 -= aUg.A04;
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

    public C21712AXj(double d, double d2, int i, int i2, long j, boolean z) {
        SortedSet concurrentSkipListSet;
        j = j <= 0 ? 104857600 : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        d2 = d2 <= 0.0d ? 0.30000001192092896d : d2;
        this.A04 = j;
        this.A07 = i;
        this.A02 = (float) d;
        this.A03 = i2;
        this.A06 = (float) d2;
        this.A01 = 0;
        this.A00 = 0;
        this.A0A = new TreeSet(this);
        if (!z) {
            concurrentSkipListSet = new TreeSet(this);
        } else {
            concurrentSkipListSet = new ConcurrentSkipListSet(this);
        }
        this.A09 = concurrentSkipListSet;
    }

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
        Bgu(b3i, aUg);
        Bgt(b3i, aUg2);
    }

    public void BhF(C23077B3i b3i, String str, long j, long j2) {
        A00(b3i, str, j2);
    }
}
