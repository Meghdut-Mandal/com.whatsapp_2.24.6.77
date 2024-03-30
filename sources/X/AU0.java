package X;

import java.io.Closeable;
import java.util.Objects;

public class AU0 implements Closeable, Cloneable {
    public static final C22867AxM A04 = new C20965A0y();
    public static final C22868AxN A05 = new A10();
    public boolean A00 = false;
    public final C22867AxM A01;
    public final C201109it A02;
    public final Throwable A03;

    public synchronized AU0 A00() {
        AU0 au0;
        Throwable th;
        if (A02()) {
            AnonymousClass6GV.A01(A02());
            C201109it r3 = this.A02;
            C22867AxM axM = this.A01;
            if (this.A03 != null) {
                th = new Throwable();
            } else {
                th = null;
            }
            au0 = new AU0(axM, r3, th);
        } else {
            au0 = null;
        }
        return au0;
    }

    public synchronized Object A01() {
        Object A012;
        AnonymousClass6GV.A01(AnonymousClass000.A1Q(this.A00 ? 1 : 0));
        A012 = this.A02.A01();
        Objects.requireNonNull(A012);
        return A012;
    }

    public synchronized boolean A02() {
        return !this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        X.C201109it.A00(r3);
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r2 > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r0.booleanValue() != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        throw X.C165617ti.A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        r2 = r2 - 1;
        r3.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r2 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6 = r3.A01;
        r3.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r3.A02.BnN(r6);
        r5 = X.C201109it.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = (java.lang.Integer) r5.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        r2 = new java.lang.Object[]{r6.getClass()};
        r1 = X.C132886Vq.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r1.BMH(6) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        r1.Bxh("SharedReference", java.lang.String.format((java.util.Locale) null, "No entry in sLiveObjects for value of type %s", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0065, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006b, code lost:
        if (r0 != 1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        r5.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
        X.C36421kH.A1M(r6, r5, r0 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.A00     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0081 }
            return
        L_0x0007:
            r0 = 1
            r7.A00 = r0     // Catch:{ all -> 0x0081 }
            monitor-exit(r7)     // Catch:{ all -> 0x0081 }
            X.9it r3 = r7.A02
            monitor-enter(r3)
            X.C201109it.A00(r3)     // Catch:{ all -> 0x007e }
            int r2 = r3.A00     // Catch:{ all -> 0x007e }
            r1 = 1
            if (r2 > 0) goto L_0x0017
            r0 = 0
        L_0x0017:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0028:
            int r2 = r2 - r1
            r3.A00 = r2     // Catch:{ all -> 0x007e }
            monitor-exit(r3)
            if (r2 != 0) goto L_0x007d
            monitor-enter(r3)
            java.lang.Object r6 = r3.A01     // Catch:{ all -> 0x007a }
            r0 = 0
            r3.A01 = r0     // Catch:{ all -> 0x007a }
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x007d
            X.AxN r0 = r3.A02
            r0.BnN(r6)
            java.util.Map r5 = X.C201109it.A03
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r6)     // Catch:{ all -> 0x0077 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r4 = "SharedReference"
            java.lang.String r3 = "No entry in sLiveObjects for value of type %s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0077 }
            r1 = 0
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x0077 }
            r2[r1] = r0     // Catch:{ all -> 0x0077 }
            X.7m1 r1 = X.C132886Vq.A00     // Catch:{ all -> 0x0077 }
            r0 = 6
            boolean r0 = r1.BMH(r0)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0065
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)     // Catch:{ all -> 0x0077 }
            r1.Bxh(r4, r0)     // Catch:{ all -> 0x0077 }
        L_0x0065:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            goto L_0x0076
        L_0x0067:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0077 }
            if (r0 != r1) goto L_0x0071
            r5.remove(r6)     // Catch:{ all -> 0x0077 }
            goto L_0x0065
        L_0x0071:
            int r0 = r0 - r1
            X.C36421kH.A1M(r6, r5, r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0065
        L_0x0076:
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x007a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            throw r0
        L_0x007d:
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0081:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU0.close():void");
    }

    public void finalize() {
        String str;
        try {
            synchronized (this) {
                if (!this.A00) {
                    C201109it r6 = this.A02;
                    Object A012 = r6.A01();
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1L(A1Q, System.identityHashCode(this), 0);
                    AnonymousClass000.A1L(A1Q, System.identityHashCode(r6), 1);
                    if (A012 == null) {
                        str = null;
                    } else {
                        str = AnonymousClass000.A0k(A012);
                    }
                    A1Q[2] = str;
                    C132886Vq.A03("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", A1Q);
                    C22867AxM axM = this.A01;
                    if (axM != null) {
                        axM.BoG(r6, this.A03);
                    }
                    close();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public AU0(C22867AxM axM, C201109it r3, Throwable th) {
        Objects.requireNonNull(r3);
        this.A02 = r3;
        synchronized (r3) {
            C201109it.A00(r3);
            r3.A00++;
        }
        this.A01 = axM;
        this.A03 = th;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Throwable th;
        AnonymousClass6GV.A01(A02());
        C201109it r3 = this.A02;
        C22867AxM axM = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new AU0(axM, r3, th);
    }

    public AU0(C22867AxM axM, C22868AxN axN, Object obj) {
        this.A02 = new C201109it(axN, obj);
        this.A01 = axM;
        this.A03 = null;
    }
}
