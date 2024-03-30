package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class A1H implements C160897ll {
    public AU0 A00;
    public final SparseArray A01 = new SparseArray();
    public final AnonymousClass9LI A02;
    public final boolean A03;

    public synchronized boolean B3W(int i) {
        boolean containsKey;
        AnonymousClass9LI r0 = this.A02;
        B5Z b5z = r0.A02;
        C20948A0f a0f = new C20948A0f(r0.A00, i);
        A1T a1t = (A1T) b5z;
        synchronized (a1t) {
            AnonymousClass9YI r1 = a1t.A03;
            synchronized (r1) {
                containsKey = r1.A02.containsKey(a0f);
            }
        }
        return containsKey;
    }

    public synchronized AU0 B8n(int i, int i2, int i3) {
        AU0 au0;
        B0Y b0y;
        AU0 au02;
        AnonymousClass9MI r4;
        boolean z;
        if (!this.A03) {
            au0 = null;
        } else {
            AnonymousClass9LI r6 = this.A02;
            while (true) {
                synchronized (r6) {
                    b0y = null;
                    try {
                        Iterator it = r6.A03.iterator();
                        if (it.hasNext()) {
                            b0y = (B0Y) it.next();
                            it.remove();
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                if (b0y != null) {
                    A1T a1t = (A1T) r6.A02;
                    Objects.requireNonNull(b0y);
                    synchronized (a1t) {
                        try {
                            r4 = (AnonymousClass9MI) a1t.A04.A02(b0y);
                            z = true;
                            boolean z2 = false;
                            if (r4 != null) {
                                AnonymousClass9MI r1 = (AnonymousClass9MI) a1t.A03.A02(b0y);
                                Objects.requireNonNull(r1);
                                if (r1.A00 == 0) {
                                    z2 = true;
                                }
                                AnonymousClass6GV.A01(z2);
                                au02 = r1.A02;
                            } else {
                                au02 = null;
                                z = false;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (z) {
                        A1T.A02(r4);
                        continue;
                    }
                    if (au02 != null) {
                        break;
                    }
                } else {
                    au02 = null;
                    break;
                }
            }
            au0 = A00(au02);
        }
        return au0;
    }

    public synchronized AU0 B9A(int i) {
        AnonymousClass9LI r0;
        r0 = this.A02;
        return A00(r0.A02.B86(new C20948A0f(r0.A00, i)));
    }

    public synchronized AU0 BBl(int i) {
        AU0 au0;
        AU0 au02 = this.A00;
        if (au02 != null) {
            au0 = au02.A00();
        } else {
            au0 = null;
        }
        return A00(au0);
    }

    public boolean BL9() {
        return false;
    }

    public boolean BR8(Map map) {
        return true;
    }

    public synchronized void BYR(AU0 au0, int i, int i2) {
        Objects.requireNonNull(au0);
        AU0 au02 = null;
        try {
            AnonymousClass87n r2 = new AnonymousClass87n(au0, C199209eu.A00);
            AU0 au03 = new AU0(AU0.A04, AU0.A05, (Object) r2);
            AU0 au04 = au03;
            AnonymousClass9LI r3 = this.A02;
            AU0 B29 = r3.A02.B29(au03, r3.A01, new C20948A0f(r3.A00, i));
            if (B29 != null && B29.A02()) {
                SparseArray sparseArray = this.A01;
                AU0 au05 = (AU0) sparseArray.get(i);
                if (au05 != null) {
                    au05.close();
                }
                sparseArray.put(i, B29);
                C132886Vq.A01(A1H.class, Integer.valueOf(i), sparseArray, "cachePreparedFrame(%d) cached. Pending frames: %s");
            }
            au03.close();
        } catch (Throwable th) {
            if (au02 != null) {
                au02.close();
            }
            throw th;
        }
    }

    public synchronized void BYS(AU0 au0, int i, int i2) {
        synchronized (this) {
            Objects.requireNonNull(au0);
            try {
                SparseArray sparseArray = this.A01;
                AU0 au02 = (AU0) sparseArray.get(i);
                if (au02 != null) {
                    sparseArray.delete(i);
                    au02.close();
                    C132886Vq.A01(A1H.class, Integer.valueOf(i), sparseArray, "removePreparedReference(%d) removed. Pending frames: %s");
                }
                AU0 au03 = null;
                try {
                    AnonymousClass87n r2 = new AnonymousClass87n(au0, C199209eu.A00);
                    AU0 au04 = new AU0(AU0.A04, AU0.A05, (Object) r2);
                    AU0 au05 = au04;
                    AU0 au06 = this.A00;
                    if (au06 != null) {
                        au06.close();
                    }
                    AnonymousClass9LI r3 = this.A02;
                    this.A00 = r3.A02.B29(au04, r3.A01, new C20948A0f(r3.A00, i));
                    au04.close();
                } catch (Throwable th) {
                    th = th;
                    if (au03 != null) {
                        au03.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public synchronized void clear() {
        AU0 au0 = this.A00;
        if (au0 != null) {
            au0.close();
        }
        this.A00 = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                AU0 au02 = (AU0) sparseArray.valueAt(i);
                if (au02 != null) {
                    au02.close();
                }
                i++;
            } else {
                sparseArray.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AU0 A00(X.AU0 r2) {
        /*
            if (r2 == 0) goto L_0x002d
            boolean r0 = r2.A02()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r2.A01()     // Catch:{ all -> 0x0028 }
            boolean r0 = r0 instanceof X.AnonymousClass87o     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r2.A01()     // Catch:{ all -> 0x0028 }
            X.87o r1 = (X.AnonymousClass87o) r1     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002d
            monitor-enter(r1)     // Catch:{ all -> 0x0028 }
            X.AU0 r0 = r1.A00     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            X.AU0 r0 = r0.A00()     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x002d:
            r0 = 0
            if (r2 == 0) goto L_0x0033
        L_0x0030:
            r2.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1H.A00(X.AU0):X.AU0");
    }

    public A1H(AnonymousClass9LI r2, boolean z) {
        this.A02 = r2;
        this.A03 = z;
    }
}
