package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00T;
import X.AnonymousClass05E;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass0AP;
import X.AnonymousClass5VS;
import X.AnonymousClass7R8;
import X.C005102h;
import X.C007403e;
import X.C007603g;
import X.C023409w;
import X.C108185Sm;
import X.C113525fg;
import X.C114275gx;
import X.C114285gy;
import X.C129136Fi;
import X.C136966fM;
import X.C1506876f;
import X.C1513979j;
import X.C151997Iu;
import X.C161477my;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C93904hK;
import X.C93914hL;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class Recomposer extends C129136Fi {
    public static final AnonymousClass05L A0M = AnonymousClass05E.A00(C1513979j.A03);
    public static final AtomicReference A0N = new AtomicReference(C36381kD.A0j());
    public long A00;
    public C1506876f A01 = new C1506876f();
    public Throwable A02;
    public List A03;
    public Set A04;
    public AnonymousClass0AP A05;
    public C007403e A06;
    public boolean A07;
    public C114275gx A08;
    public List A09;
    public final C136966fM A0A;
    public final C114285gy A0B;
    public final Object A0C = C36441kJ.A11();
    public final List A0D = AnonymousClass001.A0I();
    public final List A0E = AnonymousClass001.A0I();
    public final List A0F = AnonymousClass001.A0I();
    public final List A0G = AnonymousClass001.A0I();
    public final Map A0H = C36431kI.A1G();
    public final Map A0I = C36431kI.A1G();
    public final C005102h A0J;
    public final AnonymousClass05L A0K = new AnonymousClass05N(C108185Sm.Inactive);
    public final C007603g A0L;

    public static final List A00(Recomposer recomposer) {
        List list = recomposer.A03;
        if (list == null) {
            List list2 = recomposer.A0D;
            if (list2.isEmpty()) {
                list = C023409w.A00;
            } else {
                list = C36441kJ.A15(list2);
            }
            recomposer.A03 = list;
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0AP A01(androidx.compose.runtime.Recomposer r4) {
        /*
            X.05L r2 = r4.A0K
            java.lang.Object r1 = r2.getValue()
            X.5Sm r1 = (X.C108185Sm) r1
            X.5Sm r0 = X.C108185Sm.ShuttingDown
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L_0x003e
            java.util.List r0 = r4.A0D
            r0.clear()
            X.09w r0 = X.C023409w.A00
            r4.A03 = r0
            X.76f r0 = new X.76f
            r0.<init>()
            r4.A01 = r0
            java.util.List r0 = r4.A0E
            r0.clear()
            java.util.List r0 = r4.A0G
            r0.clear()
            java.util.List r0 = r4.A0F
            r0.clear()
            r4.A09 = r1
            X.0AP r0 = r4.A05
            if (r0 == 0) goto L_0x0039
            r0.B2T(r1)
        L_0x0039:
            r4.A05 = r1
            r4.A08 = r1
        L_0x003d:
            return r1
        L_0x003e:
            X.5gx r0 = r4.A08
            if (r0 != 0) goto L_0x0092
            X.03e r0 = r4.A06
            if (r0 != 0) goto L_0x0066
            X.76f r0 = new X.76f
            r0.<init>()
            r4.A01 = r0
            java.util.List r0 = r4.A0E
            r0.clear()
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x0092
            X.5Sm r3 = X.C108185Sm.InactivePendingWork
        L_0x005a:
            r2.setValue(r3)
            X.5Sm r0 = X.C108185Sm.PendingWork
            if (r3 != r0) goto L_0x003d
            X.0AP r0 = r4.A05
            r4.A05 = r1
            return r0
        L_0x0066:
            java.util.List r0 = r4.A0E
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != 0) goto L_0x008f
            X.76f r0 = r4.A01
            int r0 = r0.size()
            if (r0 > 0) goto L_0x008f
            java.util.List r0 = r4.A0G
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != 0) goto L_0x008f
            java.util.List r0 = r4.A0F
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 != 0) goto L_0x008f
            boolean r0 = A04(r4)
            if (r0 != 0) goto L_0x008f
            X.5Sm r3 = X.C108185Sm.Idle
            goto L_0x005a
        L_0x008f:
            X.5Sm r3 = X.C108185Sm.PendingWork
            goto L_0x005a
        L_0x0092:
            X.5Sm r3 = X.C108185Sm.Inactive
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A01(androidx.compose.runtime.Recomposer):X.0AP");
    }

    public static final void A02(C161477my r3, Recomposer recomposer, Exception exc) {
        if (!AnonymousClass000.A1X(A0N.get()) || (exc instanceof AnonymousClass5VS)) {
            synchronized (recomposer.A0C) {
                C114275gx r0 = recomposer.A08;
                if (r0 == null) {
                    recomposer.A08 = new C114275gx(exc);
                } else {
                    throw r0.A00;
                }
            }
            throw exc;
        }
        synchronized (recomposer.A0C) {
            AnonymousClass00T r02 = C113525fg.A01;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            recomposer.A0G.clear();
            recomposer.A0E.clear();
            recomposer.A01 = new C1506876f();
            recomposer.A0F.clear();
            recomposer.A0I.clear();
            recomposer.A0H.clear();
            recomposer.A08 = new C114275gx(exc);
            if (r3 != null) {
                List list = recomposer.A09;
                if (list == null) {
                    list = AnonymousClass001.A0I();
                    recomposer.A09 = list;
                }
                if (!list.contains(r3)) {
                    list.add(r3);
                }
                recomposer.A0D.remove(r3);
                recomposer.A03 = null;
            }
            A01(recomposer);
        }
    }

    public static final boolean A04(Recomposer recomposer) {
        boolean A1a;
        if (!recomposer.A07) {
            C136966fM r0 = recomposer.A0A;
            synchronized (r0.A03) {
                A1a = C36401kF.A1a(r0.A01);
            }
            if (!A1a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A05(Recomposer recomposer) {
        boolean z;
        synchronized (recomposer.A0C) {
            z = true;
            if (!AnonymousClass000.A1R(recomposer.A01.size())) {
                if (!C36401kF.A1a(recomposer.A0E) && !A04(recomposer)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.76f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.76f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.76f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.76f} */
    /* JADX WARNING: type inference failed for: r0v28, types: [java.util.Set[], java.lang.Object[]] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final boolean A06(androidx.compose.runtime.Recomposer r11) {
        /*
            java.lang.Object r2 = r11.A0C
            monitor-enter(r2)
            X.76f r4 = r11.A01     // Catch:{ all -> 0x00c6 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r11.A0E     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c6 }
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00b4
            boolean r0 = A04(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x001e:
            X.76f r0 = new X.76f     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            r11.A01 = r0     // Catch:{ all -> 0x00c6 }
            monitor-exit(r2)
            monitor-enter(r2)
            java.util.List r8 = A00(r11)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r2)
            r7 = 0
            int r6 = r8.size()     // Catch:{ all -> 0x00bd }
        L_0x0031:
            if (r7 >= r6) goto L_0x0093
            java.lang.Object r9 = r8.get(r7)     // Catch:{ all -> 0x00bd }
            X.7my r9 = (X.C161477my) r9     // Catch:{ all -> 0x00bd }
            X.6fP r9 = (X.C136986fP) r9     // Catch:{ all -> 0x00bd }
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference r5 = r9.A0F     // Catch:{ all -> 0x00bd }
            java.lang.Object r10 = r5.get()     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x0071
            java.lang.Object r0 = X.C112295df.A00     // Catch:{ all -> 0x00bd }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r10 instanceof java.util.Set     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x005c
            r0 = 2
            java.util.Set[] r0 = new java.util.Set[r0]     // Catch:{ all -> 0x00bd }
            X.C36341k9.A1I(r10, r4, r0)     // Catch:{ all -> 0x00bd }
        L_0x0055:
            boolean r0 = r5.compareAndSet(r10, r0)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x003b
            goto L_0x0073
        L_0x005c:
            boolean r0 = r10 instanceof java.lang.Object[]     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0088
            r3 = r10
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x00bd }
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x00bd }
            int r1 = r3.length     // Catch:{ all -> 0x00bd }
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00bd }
            r0[r1] = r4     // Catch:{ all -> 0x00bd }
            goto L_0x0055
        L_0x0071:
            r0 = r4
            goto L_0x0055
        L_0x0073:
            if (r10 != 0) goto L_0x007c
            java.lang.Object r1 = r9.A0C     // Catch:{ all -> 0x00bd }
            monitor-enter(r1)     // Catch:{ all -> 0x00bd }
            X.C136986fP.A05(r9)     // Catch:{ all -> 0x0085 }
            monitor-exit(r1)     // Catch:{ all -> 0x00bd }
        L_0x007c:
            int r0 = X.C108185Sm.A00(r11)     // Catch:{ all -> 0x00bd }
            if (r0 <= 0) goto L_0x0093
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0085:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x0092
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "corrupt pendingModifications: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r5, r0, r1)     // Catch:{ all -> 0x00bd }
        L_0x0092:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x0093:
            X.76f r0 = new X.76f     // Catch:{ all -> 0x00bd }
            r0.<init>()     // Catch:{ all -> 0x00bd }
            r11.A01 = r0     // Catch:{ all -> 0x00bd }
            monitor-enter(r2)
            X.0AP r0 = A01(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x00b6
            java.util.List r0 = r11.A0E     // Catch:{ all -> 0x00c6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c6 }
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00b4
            boolean r0 = A04(r11)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            monitor-exit(r2)
            return r1
        L_0x00b6:
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00bd:
            r1 = move-exception
            monitor-enter(r2)
            X.76f r0 = r11.A01     // Catch:{ all -> 0x00c6 }
            r0.A01(r4)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r2)
            throw r1
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A06(androidx.compose.runtime.Recomposer):boolean");
    }

    public final void A0C() {
        synchronized (this.A0C) {
            AnonymousClass05L r2 = this.A0K;
            if (((C108185Sm) r2.getValue()).compareTo(C108185Sm.Idle) >= 0) {
                r2.setValue(C108185Sm.ShuttingDown);
            }
        }
        this.A0L.B2S((CancellationException) null);
    }

    public Recomposer(C005102h r4) {
        C136966fM r2 = new C136966fM(new C151997Iu(this));
        this.A0A = r2;
        C007603g r1 = new C007603g((C007403e) r4.get(C007403e.A00));
        r1.BL4(new AnonymousClass7R8(this));
        this.A0L = r1;
        this.A0J = r4.plus(r2).plus(r1);
        this.A0B = new C114285gy(this);
    }

    public static final void A03(C93904hK r1) {
        try {
            if (r1.A0N() instanceof C93914hL) {
                throw AnonymousClass001.A09("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            r1.A0B();
        }
    }
}
