package com.whatsapp.media.transcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass16D;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass191;
import X.AnonymousClass1Y4;
import X.AnonymousClass5KF;
import X.C07700Yy;
import X.C144996tB;
import X.C19550w8;
import X.C20600xp;
import X.C20810yC;
import X.C36321k7;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class MediaTranscodeService extends AnonymousClass5KF {
    public static final HashMap A09 = AnonymousClass001.A0J();
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public AnonymousClass16J A02;
    public C20810yC A03;
    public AnonymousClass1Y4 A04;
    public boolean A05 = false;
    public int A06 = -1;
    public AnonymousClass191 A07;
    public String A08;

    public IBinder onBind(Intent intent) {
        return null;
    }

    private void A00(C07700Yy r3, String str, int i, boolean z) {
        r3.A0L = "progress";
        r3.A09(System.currentTimeMillis());
        r3.A0F(getString(R.string.f12nameremoved));
        r3.A0E(str);
        if (i >= 0) {
            r3.A07(100, i, AnonymousClass000.A1Q(i));
        }
        if (!z) {
            r3.A0G(str);
        }
        r3.A0B.icon = 17301640;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0229, code lost:
        if (r0 != 13) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if (r0.A03().A0M != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r1 != 13) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        if (r14 == true) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c5, code lost:
        if (r0 != 13) goto L_0x01c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.whatsapp.media.transcode.MediaTranscodeService r18) {
        /*
            r7 = r18
            boolean r6 = r7.A05
            r5 = 1
            r7.A05 = r5
            java.util.HashSet r17 = X.C36441kJ.A16()
            java.util.HashMap r16 = A09
            int r0 = r16.size()
            r10 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r9 = "MediaTranscodeService"
            r8 = 5
            r2 = 13
            r1 = 3
            r14 = 0
            r4 = 2
            if (r0 != r5) goto L_0x017b
            java.util.Iterator r0 = X.C36391kE.A10(r16)
            X.2bU r13 = X.C36441kJ.A0r(r0)
            X.16D r2 = r7.A00
            X.3Qa r0 = r13.A1J
            X.11F r3 = r0.A00
            X.141 r12 = r2.A0D(r3)
            int r11 = r13.A1I
            if (r11 == r4) goto L_0x0176
            if (r11 == r1) goto L_0x0171
            r0 = 13
            r2 = 2131894061(0x7f121f2d, float:1.9422916E38)
            if (r11 == r0) goto L_0x003f
            r2 = 2131894060(0x7f121f2c, float:1.9422914E38)
        L_0x003f:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r0 = r3 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0169
            r0 = 2131891208(0x7f121408, float:1.941713E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x004c:
            java.lang.String r0 = X.AnonymousClass3TB.A02(r0)
            java.lang.String r3 = X.C36391kE.A0v(r7, r0, r1, r14, r2)
            X.3Qj r0 = r13.A01
            if (r0 == 0) goto L_0x0166
            long r0 = r0.A0E
            int r2 = (int) r0
            X.0yC r1 = r7.A03
            r0 = 7576(0x1d98, float:1.0616E-41)
            boolean r0 = r1.A0E(r0)
            X.1Y4 r1 = r7.A04
            if (r0 == 0) goto L_0x010f
            X.3SC r0 = X.AnonymousClass1Y4.A00(r1, r13)
            X.6vi r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0085
            X.65P r0 = r0.A03()
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0085
        L_0x0079:
            X.1Y4 r0 = r7.A04
            boolean r0 = r0.A09(r13)
            int r2 = r2 / 2
            if (r0 == 0) goto L_0x0085
            int r2 = r2 + 50
        L_0x0085:
            android.content.Intent r0 = X.C90504aG.A0G(r7, r12)
            X.AnonymousClass3M9.A02(r0, r9)
            android.app.PendingIntent r9 = X.C65743Th.A00(r7, r8, r0, r10)
            r0 = r17
            X.AnonymousClass000.A1F(r0, r11)
        L_0x0095:
            X.0Yy r10 = X.C20600xp.A02(r7)
            java.lang.String r11 = "sending_media@1"
            r10.A0M = r11
            r10.A0D = r9
            r7.A00(r10, r3, r2, r6)
            int r0 = r17.size()
            if (r0 != r5) goto L_0x00bc
            java.util.Iterator r0 = r17.iterator()
            int r1 = X.C36341k9.A0A(r0)
            if (r1 == r4) goto L_0x010b
            r0 = 3
            if (r1 == r0) goto L_0x0107
            r0 = 13
            r12 = 2131755322(0x7f10013a, float:1.914152E38)
            if (r1 == r0) goto L_0x00bf
        L_0x00bc:
            r12 = 2131755320(0x7f100138, float:1.9141516E38)
        L_0x00bf:
            X.0ts r9 = r7.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r8 = new java.lang.Object[r5]
            int r4 = r16.size()
            X.AnonymousClass000.A1J(r8, r4)
            java.lang.String r1 = r9.A0L(r8, r12, r0)
            X.0Yy r0 = X.C20600xp.A02(r7)
            r0.A0M = r11
            r7.A00(r0, r1, r2, r6)
            android.app.Notification r0 = r0.A05()
            r10.A0C = r0
            android.app.Notification r4 = r10.A05()
            if (r6 == 0) goto L_0x00f4
            int r0 = r7.A06
            if (r0 != r2) goto L_0x00f4
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L_0x00fe
        L_0x00f4:
            boolean r1 = X.C19550w8.A06()
            r0 = 3
            if (r1 == 0) goto L_0x0103
            r7.startForeground(r0, r4, r5)
        L_0x00fe:
            r7.A06 = r2
            r7.A08 = r3
            return
        L_0x0103:
            r7.startForeground(r0, r4)
            goto L_0x00fe
        L_0x0107:
            r12 = 2131755325(0x7f10013d, float:1.9141526E38)
            goto L_0x00bf
        L_0x010b:
            r12 = 2131755318(0x7f100136, float:1.9141512E38)
            goto L_0x00bf
        L_0x010f:
            X.3Qj r0 = r13.A01
            if (r0 == 0) goto L_0x0119
            boolean r0 = r0.A0U
            if (r0 == 0) goto L_0x0119
            goto L_0x0079
        L_0x0119:
            X.3SC r0 = X.AnonymousClass1Y4.A00(r1, r13)
            X.6vi r14 = r1.A04(r0)
            if (r14 == 0) goto L_0x0085
            X.1D0 r0 = r1.A0C
            X.1GV r1 = r0.A0B
            X.65P r0 = r14.A03()
            X.1Gl r0 = r0.A08
            r18 = r0
            X.1Gk r15 = r1.A05
            java.util.Set r0 = X.C25461Gk.A04
            r1 = r18
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x014d
            X.00T r0 = r15.A02
        L_0x013d:
            java.lang.Object r0 = r0.getValue()
            X.1GM r0 = (X.AnonymousClass1GM) r0
            java.lang.Runnable r1 = r0.A03(r14)
            X.75H r1 = (X.AnonymousClass75H) r1
            if (r1 == 0) goto L_0x0085
            monitor-enter(r1)
            goto L_0x0150
        L_0x014d:
            X.00T r0 = r15.A03
            goto L_0x013d
        L_0x0150:
            X.64a r14 = r1.A00     // Catch:{ all -> 0x0256 }
            monitor-enter(r14)     // Catch:{ all -> 0x0256 }
            X.7jV r0 = r14.A00     // Catch:{ all -> 0x0253 }
            monitor-exit(r14)     // Catch:{ all -> 0x0256 }
            r14 = 1
            if (r0 == 0) goto L_0x0160
            boolean r0 = r0.BK3()     // Catch:{ all -> 0x0256 }
            if (r0 != r5) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r14 = 0
        L_0x0161:
            monitor-exit(r1)
            if (r14 != r5) goto L_0x0085
            goto L_0x0079
        L_0x0166:
            r2 = -1
            goto L_0x0085
        L_0x0169:
            X.171 r0 = r7.A01
            java.lang.String r0 = r0.A0H(r12)
            goto L_0x004c
        L_0x0171:
            r2 = 2131894071(0x7f121f37, float:1.9422936E38)
            goto L_0x003f
        L_0x0176:
            r2 = 2131894058(0x7f121f2a, float:1.942291E38)
            goto L_0x003f
        L_0x017b:
            java.util.HashSet r12 = X.C36441kJ.A16()
            java.util.Iterator r11 = X.C36391kE.A10(r16)
        L_0x0183:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x019c
            X.3T1 r3 = X.C36391kE.A0l(r11)
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            r12.add(r0)
            int r3 = r3.A1I
            r0 = r17
            X.AnonymousClass000.A1F(r0, r3)
            goto L_0x0183
        L_0x019c:
            int r0 = r12.size()
            if (r0 != r5) goto L_0x0214
            X.16D r3 = r7.A00
            java.util.Iterator r0 = r12.iterator()
            X.11F r0 = X.C36401kF.A0a(r0)
            X.141 r11 = r3.A0D(r0)
            int r0 = r17.size()
            if (r0 != r5) goto L_0x01c7
            java.util.Iterator r0 = r17.iterator()
            int r0 = X.C36341k9.A0A(r0)
            if (r0 == r4) goto L_0x0210
            if (r0 == r1) goto L_0x020c
            r13 = 2131755321(0x7f100139, float:1.9141518E38)
            if (r0 == r2) goto L_0x01ca
        L_0x01c7:
            r13 = 2131755319(0x7f100137, float:1.9141514E38)
        L_0x01ca:
            X.0ts r14 = r7.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r2 = r16.size()
            X.AnonymousClass000.A1J(r3, r2)
            java.util.Iterator r2 = r12.iterator()
            java.lang.Object r2 = r2.next()
            boolean r2 = r2 instanceof X.C177528dw
            if (r2 == 0) goto L_0x0205
            r2 = 2131891208(0x7f121408, float:1.941713E38)
            java.lang.String r2 = r7.getString(r2)
        L_0x01ed:
            java.lang.String r2 = X.AnonymousClass3TB.A02(r2)
            r3[r5] = r2
            java.lang.String r3 = r14.A0L(r3, r13, r0)
            android.content.Intent r0 = X.C90504aG.A0G(r7, r11)
            X.AnonymousClass3M9.A02(r0, r9)
            android.app.PendingIntent r9 = X.C65743Th.A00(r7, r8, r0, r10)
        L_0x0202:
            r2 = -1
            goto L_0x0095
        L_0x0205:
            X.171 r2 = r7.A01
            java.lang.String r2 = r2.A0H(r11)
            goto L_0x01ed
        L_0x020c:
            r13 = 2131755324(0x7f10013c, float:1.9141524E38)
            goto L_0x01ca
        L_0x0210:
            r13 = 2131755317(0x7f100135, float:1.914151E38)
            goto L_0x01ca
        L_0x0214:
            int r0 = r17.size()
            if (r0 != r5) goto L_0x022b
            java.util.Iterator r0 = r17.iterator()
            int r0 = X.C36341k9.A0A(r0)
            if (r0 == r4) goto L_0x024f
            if (r0 == r1) goto L_0x024b
            r10 = 2131755322(0x7f10013a, float:1.914152E38)
            if (r0 == r2) goto L_0x022e
        L_0x022b:
            r10 = 2131755320(0x7f100138, float:1.9141516E38)
        L_0x022e:
            android.content.Intent r0 = X.AnonymousClass190.A03(r7)
            android.app.PendingIntent r9 = X.C65743Th.A00(r7, r5, r0, r14)
            X.0ts r8 = r7.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r2 = r16.size()
            X.AnonymousClass000.A1L(r3, r2, r14)
            java.lang.String r3 = r8.A0L(r3, r10, r0)
            goto L_0x0202
        L_0x024b:
            r10 = 2131755325(0x7f10013d, float:1.9141526E38)
            goto L_0x022e
        L_0x024f:
            r10 = 2131755318(0x7f100136, float:1.9141512E38)
            goto L_0x022e
        L_0x0253:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0256 }
            throw r0     // Catch:{ all -> 0x0256 }
        L_0x0256:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.transcode.MediaTranscodeService.A01(com.whatsapp.media.transcode.MediaTranscodeService):void");
    }

    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        super.onCreate();
        C144996tB r1 = new C144996tB(this);
        this.A07 = r1;
        this.A02.registerObserver(r1);
    }

    public void onDestroy() {
        A09.size();
        this.A05 = false;
        stopForeground(true);
        this.A02.unregisterObserver(this.A07);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !"com.whatsapp.media.transcode.MediaTranscodeService.STOP".equals(intent.getAction())) {
            A01(this);
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C07700Yy A022 = C20600xp.A02(this);
            A022.A0M = "sending_media@1";
            A022.A0F(getString(R.string.f12nameremoved));
            A022.A0E(getString(R.string.f12nameremoved));
            A022.A09 = -1;
            A022.A0B.icon = 17301640;
            Notification A052 = A022.A05();
            if (C19550w8.A06()) {
                startForeground(3, A052, 1);
            } else {
                startForeground(3, A052);
            }
        }
        this.A05 = false;
        C36321k7.A1X("MediaTranscodeService/stopService success:", AnonymousClass000.A0u(), stopSelfResult(i2));
        return 2;
    }
}
