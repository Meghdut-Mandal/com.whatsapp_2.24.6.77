package androidx.work;

import X.AnonymousClass041;
import X.AnonymousClass759;
import X.C005502l;
import X.C006702x;
import X.C007403e;
import X.C007603g;
import X.C008803t;
import X.C009403z;
import X.C023509x;
import X.C128916Ec;
import X.C138956iy;
import X.C141786np;
import X.C17880sD;
import X.C36321k7;
import X.C36331k8;
import X.C97484pl;
import android.content.Context;

public abstract class CoroutineWorker extends C128916Ec {
    public final C97484pl A00;
    public final C005502l A01;
    public final C007603g A02 = new C007603g((C007403e) null);

    public final C17880sD A05() {
        C007603g r3 = new C007603g((C007403e) null);
        AnonymousClass041 A022 = C009403z.A02(C008803t.A02(this.A01, r3));
        C141786np r1 = new C141786np(r3);
        C36331k8.A1T(new CoroutineWorker$getForegroundInfoAsync$1(this, r1, (C023509x) null), A022);
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A08(X.C023509x r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof com.whatsapp.messaging.xmpp.XmppLogoutWorker
            if (r0 == 0) goto L_0x0064
            r3 = r7
            com.whatsapp.messaging.xmpp.XmppLogoutWorker r3 = (com.whatsapp.messaging.xmpp.XmppLogoutWorker) r3
            boolean r0 = r8 instanceof X.AnonymousClass7AP
            if (r0 == 0) goto L_0x0029
            r6 = r8
            X.7AP r6 = (X.AnonymousClass7AP) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r6.label = r2
        L_0x0019:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r4) goto L_0x002f
            java.lang.Object r3 = r6.L$0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker r3 = (com.whatsapp.messaging.xmpp.XmppLogoutWorker) r3
            goto L_0x0052
        L_0x0029:
            X.7AP r6 = new X.7AP
            r6.<init>(r3, r8)
            goto L_0x0019
        L_0x002f:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            throw r1
        L_0x0034:
            X.AnonymousClass0AN.A00(r1)
            X.19O r2 = r3.A02     // Catch:{ all -> 0x005d }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005d }
            r2.A02 = r0     // Catch:{ all -> 0x005d }
            X.02l r2 = r3.A03     // Catch:{ all -> 0x005d }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2     // Catch:{ all -> 0x005d }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x005d }
            r6.L$0 = r3     // Catch:{ all -> 0x005d }
            r6.label = r4     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r6, r2, r0)     // Catch:{ all -> 0x005d }
            if (r1 != r5) goto L_0x0055
            return r5
        L_0x0052:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x005d }
        L_0x0055:
            X.5Xj r1 = (X.C109385Xj) r1     // Catch:{ all -> 0x005d }
            X.19O r0 = r3.A02
            r0.A07()
            return r1
        L_0x005d:
            r1 = move-exception
            X.19O r0 = r3.A02
            r0.A07()
            throw r1
        L_0x0064:
            boolean r0 = r7 instanceof com.whatsapp.messaging.xmpp.XmppLifecycleWorker
            if (r0 == 0) goto L_0x00fa
            r3 = r7
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r3 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r3
            boolean r0 = r8 instanceof X.AnonymousClass7AO
            if (r0 == 0) goto L_0x008d
            r6 = r8
            X.7AO r6 = (X.AnonymousClass7AO) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r6.label = r2
        L_0x007d:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0098
            if (r0 != r4) goto L_0x0093
            java.lang.Object r3 = r6.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r3 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r3
            goto L_0x00b6
        L_0x008d:
            X.7AO r6 = new X.7AO
            r6.<init>(r3, r8)
            goto L_0x007d
        L_0x0093:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0e()
            throw r2
        L_0x0098:
            X.AnonymousClass0AN.A00(r1)
            X.19O r2 = r3.A04     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            r2.A01 = r0     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            X.02l r2 = r3.A05     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            r0.<init>(r3, r1)     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            r6.L$0 = r3     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            r6.label = r4     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r6, r2, r0)     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            if (r1 != r5) goto L_0x00b9
            return r5
        L_0x00b6:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
        L_0x00b9:
            r5 = r1
            X.5Xj r5 = (X.C109385Xj) r5     // Catch:{ CancellationException -> 0x00db, Exception -> 0x00d3 }
            X.0zA r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A03
            r0 = 0
            r1.A03(r0)
        L_0x00cd:
            X.19O r0 = r3.A04
            r0.A06()
            return r5
        L_0x00d3:
            r2 = move-exception
            r1 = 2
            X.19O r0 = r3.A04     // Catch:{ all -> 0x00e2 }
            r0.A08(r1)     // Catch:{ all -> 0x00e2 }
            throw r2     // Catch:{ all -> 0x00e2 }
        L_0x00db:
            r1 = move-exception
            X.19O r0 = r3.A04     // Catch:{ all -> 0x00e2 }
            r0.A08(r4)     // Catch:{ all -> 0x00e2 }
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r2 = move-exception
            X.0zA r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A03
            r0 = 0
            r1.A03(r0)
        L_0x00f4:
            X.19O r0 = r3.A04
            r0.A06()
            throw r2
        L_0x00fa:
            boolean r0 = r7 instanceof com.whatsapp.backup.google.workers.BackupGpbSignalWorker
            if (r0 == 0) goto L_0x0173
            r6 = r7
            com.whatsapp.backup.google.workers.BackupGpbSignalWorker r6 = (com.whatsapp.backup.google.workers.BackupGpbSignalWorker) r6
            boolean r0 = r8 instanceof X.AnonymousClass7A3
            if (r0 == 0) goto L_0x011f
            r5 = r8
            X.7A3 r5 = (X.AnonymousClass7A3) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0113:
            java.lang.Object r1 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x012e
            if (r0 != r3) goto L_0x0129
            goto L_0x0125
        L_0x011f:
            X.7A3 r5 = new X.7A3
            r5.<init>(r6, r8)
            goto L_0x0113
        L_0x0125:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            return r1
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x012e:
            X.AnonymousClass0AN.A00(r1)
            X.02l r2 = r6.A05     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            r1 = 0
            com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2 r0 = new com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            r0.<init>(r6, r1)     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            r5.L$0 = r6     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            r5.label = r3     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r2, r0)     // Catch:{ 4yJ | 4yS -> 0x015c, 4yG | 4yH | 4yQ | 4yR -> 0x0145 }
            if (r1 == r4) goto L_0x0144
            return r1
        L_0x0144:
            return r4
        L_0x0145:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupGpbSignalWorker/failed with non-retryable error, failing. "
            r1.append(r0)
            r2.printStackTrace()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            X.C36351kA.A1L(r0, r1)
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x015c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupGpbSignalWorker/failed with retryable error, retrying later. "
            r1.append(r0)
            r2.printStackTrace()
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            X.C36351kA.A1L(r0, r1)
            X.4ov r1 = X.C97324ov.A00()
            return r1
        L_0x0173:
            r3 = r7
            com.whatsapp.avatar.init.AvatarStickerPackWorker r3 = (com.whatsapp.avatar.init.AvatarStickerPackWorker) r3
            X.02l r2 = r3.A04
            r1 = 0
            com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2 r0 = new com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.A08(X.09x):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C97484pl r2 = new C97484pl();
        this.A00 = r2;
        r2.B0P(new AnonymousClass759((Object) this, 15), ((C138956iy) this.A01.A05).A01);
        this.A01 = C006702x.A00;
    }
}
