package X;

import java.util.concurrent.Callable;

/* renamed from: X.76n  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76n implements Callable {
    public final /* synthetic */ C1493370u A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass76n(C1493370u r1, Object obj, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r5 = this;
            X.70u r4 = r5.A00
            boolean r0 = r5.A02
            java.lang.Object r2 = r5.A01
            if (r0 == 0) goto L_0x000b
            X.C1493370u.A06(r4)
        L_0x000b:
            boolean r0 = X.C1493370u.A09(r4)
            r3 = 0
            if (r0 != 0) goto L_0x00cb
            android.os.HandlerThread r1 = r4.A0B
            X.C18740tg.A03(r1)
            X.C1493370u.A06(r4)     // Catch:{ RuntimeException -> 0x00c0 }
            boolean r0 = r2 instanceof android.view.Surface     // Catch:{ RuntimeException -> 0x00c0 }
            if (r0 == 0) goto L_0x002d
            X.6Pd r0 = r4.A07     // Catch:{ RuntimeException -> 0x00c0 }
            android.view.Surface r2 = (android.view.Surface) r2     // Catch:{ RuntimeException -> 0x00c0 }
            X.7ab r0 = (X.C156747ab) r0     // Catch:{ RuntimeException -> 0x00c0 }
            X.C156747ab.A00(r2, r0)     // Catch:{ RuntimeException -> 0x00c0 }
        L_0x0027:
            X.6Pd r0 = r4.A07     // Catch:{ RuntimeException -> 0x00c0 }
            r0.A04()     // Catch:{ RuntimeException -> 0x00c0 }
            goto L_0x003b
        L_0x002d:
            boolean r0 = r2 instanceof android.graphics.SurfaceTexture     // Catch:{ RuntimeException -> 0x00c0 }
            if (r0 == 0) goto L_0x0027
            X.6Pd r0 = r4.A07     // Catch:{ RuntimeException -> 0x00c0 }
            android.graphics.SurfaceTexture r2 = (android.graphics.SurfaceTexture) r2     // Catch:{ RuntimeException -> 0x00c0 }
            X.7ab r0 = (X.C156747ab) r0     // Catch:{ RuntimeException -> 0x00c0 }
            X.C156747ab.A00(r2, r0)     // Catch:{ RuntimeException -> 0x00c0 }
            goto L_0x0027
        L_0x003b:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0050
            X.C18740tg.A03(r1)
            X.67n r0 = r4.A04
            if (r0 == 0) goto L_0x0050
            android.graphics.SurfaceTexture r0 = r0.A01
            r0.updateTexImage()
            X.C18740tg.A03(r1)
            r4.A08 = r3
        L_0x0050:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0G
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0098
            boolean r2 = r4.A0H
            com.whatsapp.voipcalling.GlVideoRenderer r1 = r4.A0E
            r0 = 29
            boolean r0 = r1.init(r0, r2)
            if (r0 != 0) goto L_0x0078
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/VideoRenderer.init() failed for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.C36331k8.A1P(r0, r1)
            X.C1493370u.A05(r4)
            r0 = 0
            goto L_0x00c8
        L_0x0078:
            X.13J r0 = r4.A03
            boolean r0 = r0.BN6()
            if (r0 == 0) goto L_0x00bd
            float[] r2 = X.C1493370u.A0P
        L_0x0082:
            boolean r0 = X.C1493370u.A08(r4)
            if (r0 == 0) goto L_0x009a
            android.os.Handler r1 = r4.A0A
            r0 = 8
            r1.removeMessages(r0)
            android.os.Message r1 = r1.obtainMessage(r0, r2)
            java.lang.String r0 = "setBackgroundColor"
            X.C1493370u.A00(r1, r4, r0)
        L_0x0098:
            r0 = 1
            goto L_0x00c8
        L_0x009a:
            r1 = 4
            X.7qi r0 = new X.7qi
            r0.<init>(r4, r2, r1)
            int r2 = X.C1493370u.A02(r4, r0)
            if (r2 == 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            X.C36321k7.A1N(r0, r1)
            goto L_0x0098
        L_0x00bd:
            float[] r2 = X.C1493370u.A0N
            goto L_0x0082
        L_0x00c0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.C1493370u.A05(r4)
            r0 = 0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cb
            r3 = -6
        L_0x00cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass76n.call():java.lang.Object");
    }
}
