package X;

import java.util.Map;

public final class A1G implements C160897ll {
    public int A00 = -1;
    public AU0 A01;

    private final synchronized void A00() {
        AU0 au0 = this.A01;
        if (au0 != null) {
            au0.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean B3W(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0013 }
            if (r3 != r0) goto L_0x0010
            X.AU0 r0 = r2.A01     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A02()     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1G.B3W(int):boolean");
    }

    public synchronized AU0 B8n(int i, int i2, int i3) {
        AU0 au0;
        try {
            AU0 au02 = this.A01;
            if (au02 != null) {
                au0 = au02.A00();
            } else {
                au0 = null;
            }
            A00();
        } catch (Throwable th) {
            A00();
            throw th;
        }
        return au0;
    }

    public synchronized AU0 B9A(int i) {
        AU0 au0;
        AU0 au02;
        if (this.A00 != i || (au02 = this.A01) == null) {
            au0 = null;
        } else {
            au0 = au02.A00();
        }
        return au0;
    }

    public synchronized AU0 BBl(int i) {
        AU0 au0;
        AU0 au02 = this.A01;
        if (au02 != null) {
            au0 = au02.A00();
        } else {
            au0 = null;
        }
        return au0;
    }

    public void BYR(AU0 au0, int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (X.AnonymousClass00C.A0J(r1, r0) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void BYS(X.AU0 r3, int r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.AU0 r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r3.A01()     // Catch:{ all -> 0x002e }
            X.AU0 r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.A01()     // Catch:{ all -> 0x002e }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x002e }
        L_0x0013:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x002e }
            goto L_0x002a
        L_0x0018:
            r0 = 0
            goto L_0x0013
        L_0x001a:
            X.AU0 r0 = r2.A01     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0021
            r0.close()     // Catch:{ all -> 0x002e }
        L_0x0021:
            X.AU0 r0 = r3.A00()     // Catch:{ all -> 0x002e }
            r2.A01 = r0     // Catch:{ all -> 0x002e }
            r2.A00 = r4     // Catch:{ all -> 0x002e }
            goto L_0x002c
        L_0x002a:
            if (r0 == 0) goto L_0x001a
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1G.BYS(X.AU0, int, int):void");
    }

    public synchronized void clear() {
        A00();
    }

    public boolean BL9() {
        return false;
    }

    public boolean BR8(Map map) {
        return true;
    }
}
