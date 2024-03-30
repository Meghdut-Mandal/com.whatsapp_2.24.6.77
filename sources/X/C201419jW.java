package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9jW  reason: invalid class name and case insensitive filesystem */
public final class C201419jW {
    public List A00 = AnonymousClass001.A0I();
    public C208179xm A01;
    public final AnonymousClass9wq A02 = new AnonymousClass9wq(this);

    public final synchronized void A00() {
        C208179xm r1 = this.A01;
        if (r1 != null) {
            AnonymousClass9wq r4 = this.A02;
            AnonymousClass00C.A0D(r4, 0);
            ReentrantLock reentrantLock = r1.A02;
            reentrantLock.lock();
            try {
                Map map = r1.A01;
                C007403e r12 = (C007403e) map.get(r4);
                if (r12 != null) {
                    r12.B2S((CancellationException) null);
                }
                map.remove(r4);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.A01 = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|(2:26|(2:30|(2:32|(6:34|(1:36)(1:38)|37|39|40|(2:42|(1:44))))))|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b3 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(android.app.Activity r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0116 }
            r2 = 29
            if (r3 < r2) goto L_0x0013
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "SM-F700"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0015
            if (r3 != r2) goto L_0x0015
        L_0x0013:
            monitor-exit(r8)
            return
        L_0x0015:
            if (r9 == 0) goto L_0x0013
            X.9ax r0 = X.C23086B3w.A00     // Catch:{ all -> 0x0116 }
            X.00T r0 = X.C196999ax.A01     // Catch:{ all -> 0x0116 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0116 }
            X.7iT r2 = (X.C158927iT) r2     // Catch:{ all -> 0x0116 }
            if (r2 != 0) goto L_0x00c2
            X.9xl r0 = X.C208169xl.A03     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x00bd
            java.util.concurrent.locks.ReentrantLock r7 = X.C208169xl.A02     // Catch:{ all -> 0x0116 }
            r7.lock()     // Catch:{ all -> 0x0116 }
            X.9xl r0 = X.C208169xl.A03     // Catch:{ all -> 0x0111 }
            if (r0 != 0) goto L_0x00ba
            r3 = 0
            java.lang.String r1 = androidx.window.sidecar.SidecarProvider.getApiVersion()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 != 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00b3
            boolean r0 = X.AnonymousClass098.A06(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            java.util.regex.Matcher r6 = r0.matcher(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            boolean r0 = r6.matches()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b3
            r0 = 1
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b3
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            r0 = 2
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b3
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            r0 = 3
            java.lang.String r0 = r6.group(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b3
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            r1 = 4
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r6.group(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
        L_0x007f:
            X.AnonymousClass00C.A0A(r0)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            X.AUo r1 = new X.AUo     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            r1.<init>(r5, r4, r0, r2)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x00b3 }
            goto L_0x008b
        L_0x0088:
            java.lang.String r0 = ""
            goto L_0x007f
        L_0x008b:
            X.AUo r2 = X.AUo.A05     // Catch:{  }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{  }
            X.00T r0 = r1.A03     // Catch:{  }
            java.lang.Object r1 = X.C36381kD.A0p(r0)     // Catch:{  }
            java.math.BigInteger r1 = (java.math.BigInteger) r1     // Catch:{  }
            X.00T r0 = r2.A03     // Catch:{  }
            java.lang.Object r0 = X.C36381kD.A0p(r0)     // Catch:{  }
            java.math.BigInteger r0 = (java.math.BigInteger) r0     // Catch:{  }
            int r0 = r1.compareTo(r0)     // Catch:{  }
            if (r0 < 0) goto L_0x00b3
            X.9xi r1 = new X.9xi     // Catch:{  }
            r1.<init>(r9)     // Catch:{  }
            boolean r0 = r1.A03()     // Catch:{  }
            if (r0 == 0) goto L_0x00b3
            r3 = r1
        L_0x00b3:
            X.9xl r0 = new X.9xl     // Catch:{ all -> 0x0111 }
            r0.<init>(r3)     // Catch:{ all -> 0x0111 }
            X.C208169xl.A03 = r0     // Catch:{ all -> 0x0111 }
        L_0x00ba:
            r7.unlock()     // Catch:{ all -> 0x0116 }
        L_0x00bd:
            X.9xl r2 = X.C208169xl.A03     // Catch:{ all -> 0x0116 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0116 }
        L_0x00c2:
            X.1R3 r1 = X.AnonymousClass1R3.A00     // Catch:{ all -> 0x0116 }
            X.6ie r0 = new X.6ie     // Catch:{ all -> 0x0116 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0116 }
            X.9xm r2 = new X.9xm     // Catch:{ all -> 0x0116 }
            r2.<init>(r0)     // Catch:{ all -> 0x0116 }
            r8.A01 = r2     // Catch:{ all -> 0x0116 }
            X.773 r7 = X.AnonymousClass773.A00     // Catch:{ all -> 0x0116 }
            X.9wq r6 = r8.A02     // Catch:{ all -> 0x0116 }
            X.C36321k7.A0x(r7, r6)     // Catch:{ all -> 0x0116 }
            X.B3w r1 = r2.A00     // Catch:{ all -> 0x0116 }
            X.6ie r1 = (X.C138756ie) r1     // Catch:{ all -> 0x0116 }
            r5 = 0
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 r0 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1     // Catch:{ all -> 0x0116 }
            r0.<init>(r9, r1, r5)     // Catch:{ all -> 0x0116 }
            X.0nG r4 = X.AnonymousClass0R0.A00(r0)     // Catch:{ all -> 0x0116 }
            java.util.concurrent.locks.ReentrantLock r3 = r2.A02     // Catch:{ all -> 0x0116 }
            r3.lock()     // Catch:{ all -> 0x0116 }
            java.util.Map r2 = r2.A01     // Catch:{ all -> 0x010c }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x0107
            X.02o r0 = new X.02o     // Catch:{ all -> 0x010c }
            r0.<init>(r7)     // Catch:{ all -> 0x010c }
            X.041 r1 = X.C009403z.A02(r0)     // Catch:{ all -> 0x010c }
            androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1 r0 = new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1     // Catch:{ all -> 0x010c }
            r0.<init>(r6, r5, r4)     // Catch:{ all -> 0x010c }
            X.0A6 r0 = X.C36391kE.A12(r0, r1)     // Catch:{ all -> 0x010c }
            r2.put(r6, r0)     // Catch:{ all -> 0x010c }
        L_0x0107:
            r3.unlock()     // Catch:{ all -> 0x0116 }
            goto L_0x0013
        L_0x010c:
            r0 = move-exception
            r3.unlock()     // Catch:{ all -> 0x0116 }
            goto L_0x0115
        L_0x0111:
            r0 = move-exception
            r7.unlock()     // Catch:{ all -> 0x0116 }
        L_0x0115:
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201419jW.A01(android.app.Activity):void");
    }

    public final synchronized void A02(AnonymousClass026 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00.add(r2);
    }
}
