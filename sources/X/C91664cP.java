package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: X.4cP  reason: invalid class name and case insensitive filesystem */
public class C91664cP extends Handler {
    public final Handler A00 = C36341k9.A0H();
    public final WeakReference A01;

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0121, code lost:
        r5.post(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A01
            java.lang.Object r3 = r0.get()
            X.70u r3 = (X.C1493370u) r3
            if (r3 == 0) goto L_0x0010
            int r0 = r8.what
            r5 = 0
            switch(r0) {
                case 1: goto L_0x0051;
                case 2: goto L_0x00ea;
                case 3: goto L_0x0011;
                case 4: goto L_0x0029;
                case 5: goto L_0x0010;
                case 6: goto L_0x0062;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00cc;
                case 9: goto L_0x0100;
                case 10: goto L_0x0116;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r8.obj
            X.C18740tg.A06(r0)
            float r1 = X.C36441kJ.A03(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0G
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00f9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/setCornerRadius failed: -6 for "
            goto L_0x0081
        L_0x0029:
            android.os.HandlerThread r0 = r3.A0B
            X.C18740tg.A03(r0)
            r2 = 0
            int[] r1 = X.C131466Pd.A00     // Catch:{ Exception -> 0x003a }
            X.7ab r0 = new X.7ab     // Catch:{ Exception -> 0x003a }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x003a }
            r3.A07 = r0     // Catch:{ Exception -> 0x003a }
            goto L_0x00ff
        L_0x003a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.C1493370u.A05(r3)
            r2 = -5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/create failed to init EGL ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") for "
            goto L_0x0081
        L_0x0051:
            int r2 = r8.arg1
            int r1 = r8.arg2
            boolean r0 = X.C1493370u.A09(r3)
            if (r0 != 0) goto L_0x0103
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/setWindowSize failed: -6 for "
            goto L_0x0081
        L_0x0062:
            int r6 = r8.arg1
            int r4 = r8.arg2
            java.lang.Object r2 = r8.obj
            X.C18740tg.A06(r2)
            X.67n r2 = (X.C1272467n) r2
            r0 = 1
            android.os.HandlerThread r1 = r3.A0B
            X.C18740tg.A03(r1)
            r3.A08 = r0
            boolean r0 = X.C1493370u.A09(r3)
            if (r0 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/renderTexture failed: -6 for "
        L_0x0081:
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0D
            X.C36331k8.A1P(r0, r1)
            return
        L_0x008a:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0E
            boolean r0 = r2.A01(r0, r6, r4)
            if (r0 == 0) goto L_0x0010
            X.C18740tg.A03(r1)
            r3.A08 = r5
            int r0 = X.C1493370u.A01(r3)
            if (r0 != 0) goto L_0x0010
            android.os.Handler r5 = r7.A00
            java.util.Objects.requireNonNull(r3)
            r0 = 43
            X.74e r4 = new X.74e
            r4.<init>(r3, r0)
            goto L_0x0121
        L_0x00aa:
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0D
            X.C36321k7.A1N(r0, r1)
            java.lang.Object r0 = r8.obj
            X.67n r0 = (X.C1272467n) r0
            r0.A00()
            android.os.HandlerThread r0 = r3.A0B
            X.C18740tg.A03(r0)
            r0 = 0
            r3.A04 = r0
            return
        L_0x00cc:
            java.lang.Object r1 = r8.obj
            X.C18740tg.A06(r1)
            float[] r1 = (float[]) r1
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0E
            boolean r0 = r0.setBackgroundColor(r1)
            if (r0 != 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0D
            X.C36321k7.A1N(r0, r1)
            return
        L_0x00ea:
            java.lang.Object r0 = r8.obj
            X.C18740tg.A06(r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0E
            r0.setScaleType(r1)
            return
        L_0x00f9:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0E
            r0.setCornerRadius(r1)
            return
        L_0x00ff:
            return
        L_0x0100:
            r3.A0M = r5
            return
        L_0x0103:
            float[] r0 = X.C1493370u.A0O
            X.C1493370u.A03(r3, r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r3.A0E
            r0.setWindow(r5, r5, r2, r1)
            android.os.Handler r5 = r7.A00
            r0 = 1
            X.3vG r4 = new X.3vG
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0121
        L_0x0116:
            java.lang.Object r1 = r8.obj
            android.os.Handler r5 = r7.A00
            r0 = 22
            X.74i r4 = new X.74i
            r4.<init>(r3, r1, r0)
        L_0x0121:
            r5.post(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91664cP.handleMessage(android.os.Message):void");
    }

    public C91664cP(Looper looper, C1493370u r3) {
        super(looper);
        this.A01 = AnonymousClass001.A0F(r3);
    }
}
