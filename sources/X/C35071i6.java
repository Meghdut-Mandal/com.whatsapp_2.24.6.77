package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1i6  reason: invalid class name and case insensitive filesystem */
public final class C35071i6 {
    public final C000700i A00 = new C000700i(10);
    public final AnonymousClass005 A01;
    public volatile boolean A02;

    public C35071i6(AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C35071i6 r8) {
        /*
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0086
            monitor-enter(r8)
            boolean r0 = r8.A02     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0085
            X.005 r0 = r8.A01     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0082 }
            X.6Tl r1 = (X.C132396Tl) r1     // Catch:{ all -> 0x0082 }
            r3 = 0
            r0 = 10
            X.00i r6 = new X.00i     // Catch:{ all -> 0x0082 }
            r6.<init>(r0)     // Catch:{ all -> 0x0082 }
            X.12P r0 = r1.A00     // Catch:{ all -> 0x0082 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0082 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "SELECT status_message_row_id, state FROM status_crossposting"
            java.lang.String r0 = "SELECT_STATE_LIST"
            android.database.Cursor r7 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "status_message_row_id"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "state"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0071 }
        L_0x0035:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x004b
            long r1 = r7.getLong(r4)     // Catch:{ all -> 0x0071 }
            int r0 = r7.getInt(r3)     // Catch:{ all -> 0x0071 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0071 }
            r6.A0A(r1, r0)     // Catch:{ all -> 0x0071 }
            goto L_0x0035
        L_0x004b:
            r7.close()     // Catch:{ all -> 0x0078 }
            r5.close()     // Catch:{ all -> 0x0082 }
            X.00i r5 = r8.A00     // Catch:{ all -> 0x0082 }
            monitor-enter(r5)     // Catch:{ all -> 0x0082 }
            r5.A07()     // Catch:{ all -> 0x007f }
            int r4 = r6.A00()     // Catch:{ all -> 0x007f }
            r3 = 0
        L_0x005c:
            if (r3 >= r4) goto L_0x006c
            long r1 = r6.A02(r3)     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r6.A04(r3)     // Catch:{ all -> 0x007f }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x007f }
            int r3 = r3 + 1
            goto L_0x005c
        L_0x006c:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x0082 }
            goto L_0x0085
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0081
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
        L_0x0081:
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0085:
            monitor-exit(r8)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35071i6.A00(X.1i6):void");
    }

    public final Integer A01(long j) {
        Integer num;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/getNonBlocking cache not initialized");
            return null;
        }
        C000700i r1 = this.A00;
        synchronized (r1) {
            num = (Integer) r1.A05(j);
        }
        return num;
    }

    public final boolean A03(long j) {
        boolean z;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/containsKeyNonBlocking cache not initialized");
            return false;
        }
        C000700i r1 = this.A00;
        synchronized (r1) {
            z = false;
            if (r1.A01(j) >= 0) {
                z = true;
            }
        }
        return z;
    }

    public final void A02(Collection collection, int i) {
        A00(this);
        C000700i r4 = this.A00;
        synchronized (r4) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                r4.A0A(((Number) it.next()).longValue(), Integer.valueOf(i));
            }
        }
    }
}
