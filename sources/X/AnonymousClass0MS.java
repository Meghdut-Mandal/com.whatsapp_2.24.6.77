package X;

import android.os.Looper;

/* renamed from: X.0MS  reason: invalid class name */
public final class AnonymousClass0MS extends AnonymousClass0E8 {
    public final /* synthetic */ C07560Yg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0MS(Looper looper, C07560Yg r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            X.0Yg r2 = r9.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0B
            int r1 = r0.get()
            int r0 = r10.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r10.what
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0017
            if (r2 == r1) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            java.lang.Object r0 = r10.obj
            X.0Tv r0 = (X.C06500Tv) r0
            r0.A00()
        L_0x001e:
            return
        L_0x001f:
            int r1 = r10.what
            r8 = 4
            r5 = 1
            r4 = 5
            if (r1 == r5) goto L_0x002d
            r0 = 7
            if (r1 == r0) goto L_0x002d
            if (r1 == r8) goto L_0x002d
            if (r1 != r4) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.BLT()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r1 = r10.what
            r7 = 8
            r3 = 3
            r6 = 0
            if (r1 != r8) goto L_0x0063
            int r1 = r10.arg2
            X.0L0 r0 = new X.0L0
            r0.<init>(r1)
            r2.A07 = r0
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A07()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x0087
            X.C07560Yg.A01(r6, r2, r3)
            return
        L_0x0063:
            if (r1 == r4) goto L_0x0087
            if (r1 != r3) goto L_0x0091
            java.lang.Object r1 = r10.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r6 = r1
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x0070:
            int r0 = r10.arg2
            X.0L0 r1 = new X.0L0
            r1.<init>(r0, r6)
        L_0x0077:
            X.0qB r0 = r2.A08
            r0.Bep(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            return
        L_0x0087:
            X.0L0 r1 = r2.A07
            if (r1 != 0) goto L_0x0077
            X.0L0 r1 = new X.0L0
            r1.<init>(r7)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r1 != r0) goto L_0x00ad
            X.C07560Yg.A01(r6, r2, r4)
            X.0oF r0 = r2.A0H
            if (r0 == 0) goto L_0x00a4
            int r1 = r10.arg2
            X.0e7 r0 = (X.C10360e7) r0
            X.0qg r0 = r0.A00
            r0.onConnectionSuspended(r1)
        L_0x00a4:
            int r0 = r10.arg2
            r2.A0A(r0)
            X.C07560Yg.A02(r6, r2, r4, r5)
            return
        L_0x00ad:
            r0 = 2
            if (r1 != r0) goto L_0x00b6
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00b6:
            int r2 = r10.what
            r0 = 2
            if (r2 == r0) goto L_0x00db
            if (r2 == r5) goto L_0x00db
            r0 = 7
            if (r2 == r0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Don't know how to handle message: "
            r1.append(r0)
            r1.append(r2)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r1, r2)
            return
        L_0x00db:
            java.lang.Object r4 = r10.obj
            X.0Tv r4 = (X.C06500Tv) r4
            monitor-enter(r4)
            java.lang.Object r3 = r4.A00     // Catch:{ all -> 0x0143 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0100
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Callback proxy "
            r1.append(r0)     // Catch:{ all -> 0x0143 }
            r1.append(r2)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = " being reused. This is not safe."
            r1.append(r0)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "GmsClient"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x0143 }
        L_0x0100:
            monitor-exit(r4)     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x0138
            r3 = r4
            X.0LG r3 = (X.AnonymousClass0LG) r3     // Catch:{ RuntimeException -> 0x0136 }
            int r2 = r3.A00     // Catch:{ RuntimeException -> 0x0136 }
            r0 = 0
            if (r2 != 0) goto L_0x011f
            boolean r0 = r3.A02()     // Catch:{ RuntimeException -> 0x0136 }
            if (r0 != 0) goto L_0x0138
            X.0Yg r0 = r3.A02     // Catch:{ RuntimeException -> 0x0136 }
            X.C07560Yg.A01(r6, r0, r5)     // Catch:{ RuntimeException -> 0x0136 }
            X.0L0 r1 = new X.0L0     // Catch:{ RuntimeException -> 0x0136 }
            r1.<init>(r7, r6)     // Catch:{ RuntimeException -> 0x0136 }
        L_0x011b:
            r3.A01(r1)     // Catch:{ RuntimeException -> 0x0136 }
            goto L_0x0138
        L_0x011f:
            X.0Yg r1 = r3.A02     // Catch:{ RuntimeException -> 0x0136 }
            X.C07560Yg.A01(r6, r1, r5)     // Catch:{ RuntimeException -> 0x0136 }
            android.os.Bundle r1 = r3.A01     // Catch:{ RuntimeException -> 0x0136 }
            if (r1 == 0) goto L_0x0130
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)     // Catch:{ RuntimeException -> 0x0136 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ RuntimeException -> 0x0136 }
        L_0x0130:
            X.0L0 r1 = new X.0L0     // Catch:{ RuntimeException -> 0x0136 }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0136 }
            goto L_0x011b
        L_0x0136:
            r0 = move-exception
            throw r0
        L_0x0138:
            monitor-enter(r4)
            r4.A01 = r5     // Catch:{ all -> 0x0140 }
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            r4.A00()
            return
        L_0x0140:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            throw r0
        L_0x0143:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MS.handleMessage(android.os.Message):void");
    }
}
