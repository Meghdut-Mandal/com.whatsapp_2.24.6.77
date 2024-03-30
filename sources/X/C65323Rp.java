package X;

import java.util.WeakHashMap;

/* renamed from: X.3Rp  reason: invalid class name and case insensitive filesystem */
public class C65323Rp {
    public static C65323Rp A01;
    public final WeakHashMap A00 = new WeakHashMap();

    public static synchronized C61773Dj A00(C65323Rp r2, Thread thread) {
        C61773Dj r0;
        synchronized (r2) {
            WeakHashMap weakHashMap = r2.A00;
            r0 = (C61773Dj) weakHashMap.get(thread);
            if (r0 == null) {
                r0 = new C61773Dj();
                weakHashMap.put(thread, r0);
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A02(android.graphics.BitmapFactory.Options r7, java.io.FileDescriptor r8) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r7.mCancel
            r4 = 0
            if (r0 != 0) goto L_0x0038
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            monitor-enter(r5)
            java.util.WeakHashMap r2 = r6.A00     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0035 }
            X.3Dj r0 = (X.C61773Dj) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001a
            int r1 = r0.A00     // Catch:{ all -> 0x0035 }
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0038
            monitor-enter(r5)
            X.3Dj r0 = A00(r6, r3)     // Catch:{ all -> 0x0035 }
            r0.A01 = r7     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFileDescriptor(r8, r4, r7)
            monitor-enter(r5)
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0035 }
            X.3Dj r0 = (X.C61773Dj) r0     // Catch:{ all -> 0x0035 }
            r0.A01 = r4     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0038:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65323Rp.A02(android.graphics.BitmapFactory$Options, java.io.FileDescriptor):android.graphics.Bitmap");
    }

    public static synchronized C65323Rp A01() {
        C65323Rp r0;
        synchronized (C65323Rp.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C65323Rp();
                A01 = r0;
            }
        }
        return r0;
    }
}
