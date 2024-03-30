package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4hK  reason: invalid class name and case insensitive filesystem */
public class C93904hK extends Snapshot {
    public static final int[] A09 = new int[0];
    public int A00 = 1;
    public int A01;
    public C1496472d A02 = C1496472d.A04;
    public boolean A03;
    public int[] A04 = A09;
    public C1506876f A05;
    public List A06;
    public final C006302t A07;
    public final C006302t A08;

    public C93904hK A0M(C006302t r13, C006302t r14) {
        C93844hE r6;
        C154807Tp r4 = r14;
        if (this instanceof C93864hG) {
            C93864hG r7 = (C93864hG) this;
            C006302t A0B = AnonymousClass6YQ.A0B(r13, r7.A07, true);
            C006302t r1 = r7.A08;
            if (r1 != null && !r14.equals(r1)) {
                r4 = new C154807Tp(r14, r1);
            }
            boolean z = r7.A00;
            C93904hK A002 = C93864hG.A00(r7);
            if (!z) {
                return new C93864hG(A002.A0M((C006302t) null, r4), A0B, r4, false, true);
            }
            return A002.A0M(A0B, r4);
        } else if (this instanceof C93854hF) {
            C154777Tm r12 = new C154777Tm(r13, r14);
            int i = AnonymousClass6YQ.A00;
            return (C93904hK) ((Snapshot) AnonymousClass6YQ.A09(new AnonymousClass7RE(r12)));
        } else if (!(!this.A02)) {
            throw AnonymousClass001.A08("Cannot use a disposed snapshot");
        } else if (!this.A03 || this.A01 >= 0) {
            A0Q(A04());
            Object obj = AnonymousClass6YQ.A07;
            synchronized (obj) {
                int i2 = AnonymousClass6YQ.A00;
                AnonymousClass6YQ.A00 = i2 + 1;
                AnonymousClass6YQ.A01 = AnonymousClass6YQ.A01.A02(i2);
                C1496472d A082 = A08();
                A0I(A082.A02(i2));
                int A042 = A04();
                while (true) {
                    A042++;
                    if (A042 >= i2) {
                        break;
                    }
                    A082 = A082.A02(A042);
                }
                C006302t A0B2 = AnonymousClass6YQ.A0B(r13, this.A07, true);
                C006302t r15 = this.A08;
                if (r15 != null && !r14.equals(r15)) {
                    r4 = new C154807Tp(r14, r15);
                }
                r6 = new C93844hE(this, A082, A0B2, r4, i2);
            }
            if (!this.A03 && !this.A02) {
                int A043 = A04();
                synchronized (obj) {
                    int i3 = AnonymousClass6YQ.A00;
                    AnonymousClass6YQ.A00 = i3 + 1;
                    this.A00 = i3;
                    Snapshot.A03(this);
                }
                C1496472d A083 = A08();
                int A044 = A04();
                for (int i4 = A043 + 1; i4 < A044; i4++) {
                    A083 = A083.A02(i4);
                }
                A0I(A083);
            }
            return r6;
        } else {
            throw AnonymousClass001.A09("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public void A0B() {
        if (!this.A02) {
            super.A0B();
            A0D();
        }
    }

    public void A0F() {
        for (int A0D : this.A04) {
            AnonymousClass6YQ.A0D(A0D);
        }
        super.A0F();
    }

    public C1506876f A0L() {
        if (this instanceof C93864hG) {
            return C93864hG.A00((C93864hG) this).A0L();
        }
        return this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a9, code lost:
        if (r1 >= r2) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ab, code lost:
        ((X.C009003v) r3.get(r1)).invoke(r6, r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b7, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        A0F();
        X.AnonymousClass6YQ.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
        if (r7 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c0, code lost:
        r3 = r7.A01;
        r2 = r7.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c7, code lost:
        if (r1 >= r2) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c9, code lost:
        X.AnonymousClass6YQ.A0G((X.C159857k2) X.C90524aI.A0d(r3, r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d5, code lost:
        if (r6 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d7, code lost:
        r3 = r6.A01;
        r2 = r6.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01de, code lost:
        if (r1 >= r2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e0, code lost:
        X.AnonymousClass6YQ.A0G((X.C159857k2) X.C90524aI.A0d(r3, r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ec, code lost:
        r2 = r10.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ee, code lost:
        if (r2 == null) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f0, code lost:
        r1 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f4, code lost:
        if (r4 >= r1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f6, code lost:
        X.AnonymousClass6YQ.A0G((X.C159857k2) r2.get(r4));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0202, code lost:
        r10.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0204, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0207, code lost:
        return X.C93924hM.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        r7.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r7.A00 != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r7.A00 = true;
        r6.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        return X.C93924hM.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017f, code lost:
        r10.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0181, code lost:
        if (r7 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0187, code lost:
        if (r7.isEmpty() != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0189, code lost:
        r2 = r3.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018e, code lost:
        if (r1 >= r2) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0190, code lost:
        ((X.C009003v) r3.get(r1)).invoke(r7, r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019c, code lost:
        if (r6 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a2, code lost:
        if (r6.isEmpty() != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a4, code lost:
        r2 = r3.size();
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5WJ A0N() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C93864hG
            if (r0 == 0) goto L_0x0010
            r0 = r10
            X.4hG r0 = (X.C93864hG) r0
            X.4hK r0 = X.C93864hG.A00(r0)
            X.5WJ r0 = r0.A0N()
            return r0
        L_0x0010:
            boolean r0 = r10 instanceof X.C93844hE
            if (r0 == 0) goto L_0x00e4
            r7 = r10
            X.4hE r7 = (X.C93844hE) r7
            X.4hK r6 = r7.A01
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x00de
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00de
            X.76f r5 = r7.A0L()
            int r2 = r7.A04()
            r4 = 0
            if (r5 == 0) goto L_0x0038
            X.72d r0 = r6.A08()
            java.util.HashMap r3 = X.AnonymousClass6YQ.A0A(r6, r7, r0)
        L_0x0034:
            java.lang.Object r8 = X.AnonymousClass6YQ.A07
            monitor-enter(r8)
            goto L_0x003a
        L_0x0038:
            r3 = r4
            goto L_0x0034
        L_0x003a:
            X.AnonymousClass6YQ.A0E(r7)     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x005b
            int r0 = r5.size()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x005b
            int r1 = r6.A04()     // Catch:{ all -> 0x00db }
            X.72d r0 = r6.A08()     // Catch:{ all -> 0x00db }
            X.5WJ r1 = r7.A0O(r0, r3, r1)     // Catch:{ all -> 0x00db }
            X.4hM r0 = X.C93924hM.A00     // Catch:{ all -> 0x00db }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x005f
            monitor-exit(r8)
            return r1
        L_0x005b:
            r7.A0G()     // Catch:{ all -> 0x00db }
            goto L_0x0068
        L_0x005f:
            X.76f r0 = r6.A0L()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x008b
            r0.A01(r5)     // Catch:{ all -> 0x00db }
        L_0x0068:
            int r0 = r6.A04()     // Catch:{ all -> 0x00db }
            if (r0 >= r2) goto L_0x0071
            r6.A0P()     // Catch:{ all -> 0x00db }
        L_0x0071:
            X.72d r0 = r6.A08()     // Catch:{ all -> 0x00db }
            X.72d r1 = r0.A01(r2)     // Catch:{ all -> 0x00db }
            X.72d r0 = r7.A02     // Catch:{ all -> 0x00db }
            X.72d r0 = r1.A03(r0)     // Catch:{ all -> 0x00db }
            r6.A0I(r0)     // Catch:{ all -> 0x00db }
            r6.A0Q(r2)     // Catch:{ all -> 0x00db }
            int r3 = r7.A01     // Catch:{ all -> 0x00db }
            r0 = -1
            r7.A01 = r0     // Catch:{ all -> 0x00db }
            goto L_0x0092
        L_0x008b:
            r6.A0R(r5)     // Catch:{ all -> 0x00db }
            r7.A0R(r4)     // Catch:{ all -> 0x00db }
            goto L_0x0068
        L_0x0092:
            if (r3 < 0) goto L_0x00a5
            int[] r2 = r6.A04     // Catch:{ all -> 0x00db }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ all -> 0x00db }
            int r1 = r2.length     // Catch:{ all -> 0x00db }
            int r0 = r1 + 1
            int[] r0 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ all -> 0x00db }
            r0[r1] = r3     // Catch:{ all -> 0x00db }
            r6.A04 = r0     // Catch:{ all -> 0x00db }
        L_0x00a5:
            X.72d r1 = r7.A02     // Catch:{ all -> 0x00db }
            X.72d r0 = r6.A02     // Catch:{ all -> 0x00d9 }
            X.72d r0 = r0.A04(r1)     // Catch:{ all -> 0x00d9 }
            r6.A02 = r0     // Catch:{ all -> 0x00d9 }
            int[] r5 = r7.A04     // Catch:{ all -> 0x00db }
            int r4 = r5.length     // Catch:{ all -> 0x00db }
            if (r4 == 0) goto L_0x00c9
            int[] r3 = r6.A04     // Catch:{ all -> 0x00db }
            int r2 = r3.length     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00c7
            r1 = 0
            int r0 = r2 + r4
            int[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00db }
            java.lang.System.arraycopy(r5, r1, r0, r2, r4)     // Catch:{ all -> 0x00db }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x00db }
            r5 = r0
        L_0x00c7:
            r6.A04 = r5     // Catch:{ all -> 0x00db }
        L_0x00c9:
            monitor-exit(r8)
            r1 = 1
            r7.A03 = r1
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x00d6
            r7.A00 = r1
            r6.A0D()
        L_0x00d6:
            X.4hM r1 = X.C93924hM.A00
            return r1
        L_0x00d9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00de:
            X.4hL r1 = new X.4hL
            r1.<init>(r7)
            return r1
        L_0x00e4:
            boolean r0 = r10 instanceof X.C93854hF
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00ef:
            X.76f r6 = r10.A0L()
            r5 = 0
            if (r6 == 0) goto L_0x0118
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass6YQ.A08
            java.lang.Object r2 = r0.get()
            X.4hK r2 = (X.C93904hK) r2
            X.72d r1 = X.AnonymousClass6YQ.A01
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            int r0 = r0.A04()
            X.72d r0 = r1.A01(r0)
            java.util.HashMap r7 = X.AnonymousClass6YQ.A0A(r2, r10, r0)
        L_0x0112:
            X.09w r3 = X.C023409w.A00
            java.lang.Object r9 = X.AnonymousClass6YQ.A07
            monitor-enter(r9)
            goto L_0x011a
        L_0x0118:
            r7 = r5
            goto L_0x0112
        L_0x011a:
            X.AnonymousClass6YQ.A0E(r10)     // Catch:{ all -> 0x0208 }
            r4 = 0
            r8 = 1
            if (r6 == 0) goto L_0x015e
            int r0 = r6.size()     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x015e
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass6YQ.A08     // Catch:{ all -> 0x0208 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0208 }
            X.4hF r3 = (X.C93854hF) r3     // Catch:{ all -> 0x0208 }
            int r2 = X.AnonymousClass6YQ.A00     // Catch:{ all -> 0x0208 }
            X.72d r1 = X.AnonymousClass6YQ.A01     // Catch:{ all -> 0x0208 }
            int r0 = r3.A04()     // Catch:{ all -> 0x0208 }
            X.72d r0 = r1.A01(r0)     // Catch:{ all -> 0x0208 }
            X.5WJ r1 = r10.A0O(r0, r7, r2)     // Catch:{ all -> 0x0208 }
            X.4hM r0 = X.C93924hM.A00     // Catch:{ all -> 0x0208 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x0149
            monitor-exit(r9)
            return r1
        L_0x0149:
            r10.A0A()     // Catch:{ all -> 0x0208 }
            X.02t r0 = X.AnonymousClass6YQ.A09     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A08(r3, r0)     // Catch:{ all -> 0x0208 }
            X.76f r7 = r3.A0L()     // Catch:{ all -> 0x0208 }
            r10.A0R(r5)     // Catch:{ all -> 0x0208 }
            r3.A0R(r5)     // Catch:{ all -> 0x0208 }
            java.util.List r3 = X.AnonymousClass6YQ.A02     // Catch:{ all -> 0x0208 }
            goto L_0x017e
        L_0x015e:
            r10.A0A()     // Catch:{ all -> 0x0208 }
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass6YQ.A08     // Catch:{ all -> 0x0208 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0208 }
            X.4hF r1 = (X.C93854hF) r1     // Catch:{ all -> 0x0208 }
            X.02t r0 = X.AnonymousClass6YQ.A09     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A08(r1, r0)     // Catch:{ all -> 0x0208 }
            X.76f r7 = r1.A0L()     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x017d
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x017d
            java.util.List r3 = X.AnonymousClass6YQ.A02     // Catch:{ all -> 0x0208 }
            goto L_0x017e
        L_0x017d:
            r7 = r5
        L_0x017e:
            monitor-exit(r9)
            r10.A03 = r8
            if (r7 == 0) goto L_0x019c
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x019c
            int r2 = r3.size()
            r1 = 0
        L_0x018e:
            if (r1 >= r2) goto L_0x019c
            java.lang.Object r0 = r3.get(r1)
            X.03v r0 = (X.C009003v) r0
            r0.invoke(r7, r10)
            int r1 = r1 + 1
            goto L_0x018e
        L_0x019c:
            if (r6 == 0) goto L_0x01b7
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01b7
            int r2 = r3.size()
            r1 = 0
        L_0x01a9:
            if (r1 >= r2) goto L_0x01b7
            java.lang.Object r0 = r3.get(r1)
            X.03v r0 = (X.C009003v) r0
            r0.invoke(r6, r10)
            int r1 = r1 + 1
            goto L_0x01a9
        L_0x01b7:
            monitor-enter(r9)
            r10.A0F()     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A0C()     // Catch:{ all -> 0x0208 }
            if (r7 == 0) goto L_0x01d5
            java.lang.Object[] r3 = r7.A01     // Catch:{ all -> 0x0208 }
            int r2 = r7.size()     // Catch:{ all -> 0x0208 }
            r1 = 0
        L_0x01c7:
            if (r1 >= r2) goto L_0x01d5
            java.lang.Object r0 = X.C90524aI.A0d(r3, r1)     // Catch:{ all -> 0x0208 }
            X.7k2 r0 = (X.C159857k2) r0     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A0G(r0)     // Catch:{ all -> 0x0208 }
            int r1 = r1 + 1
            goto L_0x01c7
        L_0x01d5:
            if (r6 == 0) goto L_0x01ec
            java.lang.Object[] r3 = r6.A01     // Catch:{ all -> 0x0208 }
            int r2 = r6.size()     // Catch:{ all -> 0x0208 }
            r1 = 0
        L_0x01de:
            if (r1 >= r2) goto L_0x01ec
            java.lang.Object r0 = X.C90524aI.A0d(r3, r1)     // Catch:{ all -> 0x0208 }
            X.7k2 r0 = (X.C159857k2) r0     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A0G(r0)     // Catch:{ all -> 0x0208 }
            int r1 = r1 + 1
            goto L_0x01de
        L_0x01ec:
            java.util.List r2 = r10.A06     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x0202
            int r1 = r2.size()     // Catch:{ all -> 0x0208 }
        L_0x01f4:
            if (r4 >= r1) goto L_0x0202
            java.lang.Object r0 = r2.get(r4)     // Catch:{ all -> 0x0208 }
            X.7k2 r0 = (X.C159857k2) r0     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6YQ.A0G(r0)     // Catch:{ all -> 0x0208 }
            int r4 = r4 + 1
            goto L_0x01f4
        L_0x0202:
            r10.A06 = r5     // Catch:{ all -> 0x0208 }
            monitor-exit(r9)
            X.4hM r0 = X.C93924hM.A00
            return r0
        L_0x0208:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93904hK.A0N():X.5WJ");
    }

    public final void A0Q(int i) {
        synchronized (AnonymousClass6YQ.A07) {
            this.A02 = this.A02.A02(i);
        }
    }

    public void A0R(C1506876f r2) {
        if (this instanceof C93864hG) {
            throw C129546Hk.A00();
        }
        this.A05 = r2;
    }

    public C93904hK(C1496472d r2, C006302t r3, C006302t r4, int i) {
        super(r2, i);
        this.A07 = r3;
        this.A08 = r4;
    }

    public final AnonymousClass5WJ A0O(C1496472d r13, Map map, int i) {
        AnonymousClass666 A042;
        Object obj;
        AnonymousClass011 A19;
        C1496472d A043 = A08().A02(A04()).A04(this.A02);
        C1506876f A0L = A0L();
        AnonymousClass00C.A0B(A0L);
        Object[] objArr = A0L.A01;
        int size = A0L.size();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C159857k2 r8 = (C159857k2) C90524aI.A0d(objArr, i2);
            AnonymousClass666 BBv = r8.BBv();
            AnonymousClass666 A044 = AnonymousClass6YQ.A04(r13, BBv, i);
            if (!(A044 == null || (A042 = AnonymousClass6YQ.A04(A043, BBv, A04())) == null || A044.equals(A042))) {
                AnonymousClass666 A022 = Snapshot.A02(this, BBv);
                if (A022 == null) {
                    throw AnonymousClass001.A09("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                } else if ((map == null || (obj = map.get(A044)) == null) && (obj = r8.BPp(A042, A044, A022)) == null) {
                    return new C93914hL(this);
                } else {
                    if (!obj.equals(A022)) {
                        if (obj.equals(A044)) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0I();
                            }
                            C90494aF.A1F(r8, A044.A00(), arrayList);
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass001.A0I();
                            }
                            arrayList2.add(r8);
                        } else {
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0I();
                            }
                            if (!obj.equals(A042)) {
                                A19 = C36441kJ.A19(r8, obj);
                            } else {
                                A19 = C36441kJ.A19(r8, A042.A00());
                            }
                            arrayList.add(A19);
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            A0P();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnonymousClass011 r0 = (AnonymousClass011) arrayList.get(i3);
                C159857k2 r5 = (C159857k2) r0.first;
                AnonymousClass666 r4 = (AnonymousClass666) r0.second;
                r4.A00 = A04();
                synchronized (AnonymousClass6YQ.A07) {
                    r4.A01 = r5.BBv();
                    r5.BmD(r4);
                }
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                A0L.remove(arrayList2.get(i4));
            }
            List list = this.A06;
            if (list != null) {
                arrayList2 = C007103b.A0S(arrayList2, list);
            }
            this.A06 = arrayList2;
        }
        return C93924hM.A00;
    }

    public final void A0P() {
        A0Q(A04());
        if (!this.A03 && !this.A02) {
            int A042 = A04();
            synchronized (AnonymousClass6YQ.A07) {
                int i = AnonymousClass6YQ.A00;
                AnonymousClass6YQ.A00 = i + 1;
                if (this instanceof C93864hG) {
                    throw C129546Hk.A00();
                }
                this.A00 = i;
                Snapshot.A03(this);
            }
            C1496472d A082 = A08();
            int A043 = A04();
            for (int i2 = A042 + 1; i2 < A043; i2++) {
                A082 = A082.A02(i2);
            }
            A0I(A082);
        }
    }
}
