package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;

/* renamed from: X.1Ye  reason: invalid class name and case insensitive filesystem */
public class C29841Ye implements AnonymousClass1NK {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C19600wD A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final AnonymousClass1GO A05;
    public final AnonymousClass1ST A06;
    public final C29851Yf A07;
    public final C19770wU A08;
    public final Runnable A09;
    public final ArrayList A0A = new ArrayList();
    public final AnonymousClass1MK A0B;

    public /* synthetic */ void BSi(C107265Nh r1, boolean z) {
    }

    public /* synthetic */ void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ void BSl(C107265Nh r1) {
    }

    public /* synthetic */ void BSm(AnonymousClass11F r1, CallState callState, String str) {
    }

    public /* synthetic */ void Bgj() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019c, code lost:
        if (r14.A14 != true) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ad, code lost:
        if (r0.A0F != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b5, code lost:
        if (r14.A0F != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e2, code lost:
        if (X.AnonymousClass1GQ.A00(r1, 3) == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f8, code lost:
        if (X.C20800yB.A01(r10, r1.A00, 6508) != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r2 >= r0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cf, code lost:
        if (r0.A03() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e7, code lost:
        if (X.AnonymousClass6Y1.A0A(X.AnonymousClass6Y1.A02(r7)) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C29841Ye r20, X.AnonymousClass2bU r21, int r22, boolean r23) {
        /*
            r0 = r20
            X.0yC r1 = r0.A04
            r0 = 1838(0x72e, float:2.576E-42)
            X.0yV r10 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r10, r1, r0)
            if (r0 != 0) goto L_0x009e
            r0 = r20
            X.1GO r6 = r0.A05
            r15 = 0
            r7 = r21
            X.AnonymousClass00C.A0D(r7, r15)
            X.1GP r5 = r6.A07
            X.3Qa r4 = r7.A1J
            boolean r13 = r4.A02
            if (r13 == 0) goto L_0x00eb
            boolean r0 = r7.A1Y
            if (r0 == 0) goto L_0x00eb
        L_0x0024:
            r0 = 1
        L_0x0025:
            r11 = 0
            r10 = 1
            if (r0 == 0) goto L_0x005c
            if (r23 == 0) goto L_0x00d2
            boolean r0 = r7 instanceof X.C181798o3
            if (r0 == 0) goto L_0x00ad
            X.11F r0 = r4.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x00ad
            X.3Qj r1 = r7.A01
            if (r1 == 0) goto L_0x005c
            X.1D5 r0 = r6.A05
            java.lang.String r1 = r1.A0L
            if (r1 == 0) goto L_0x00aa
            X.1DE r0 = r0.A0H
            X.5z2 r0 = r0.A03(r1, r10)
            if (r0 == 0) goto L_0x00aa
            long r2 = r0.A0A
        L_0x0049:
            long r8 = r7.A00
            int r0 = r7.A0B
            long r0 = (long) r0
            r13 = 1084227584(0x40a00000, float:5.0)
            r16 = 0
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x009f
            r0 = 0
        L_0x0058:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x00d2
        L_0x005c:
            X.3Qj r0 = r7.A01
            if (r0 == 0) goto L_0x009e
            int r0 = r0.A09
            if (r0 != r15) goto L_0x009e
            boolean r0 = r5.A00(r7)
            if (r0 != 0) goto L_0x008a
            boolean r0 = r7 instanceof X.C181798o3
            if (r0 != 0) goto L_0x007a
            boolean r0 = r7 instanceof X.AnonymousClass2cY
            if (r0 != 0) goto L_0x007a
            boolean r0 = r7 instanceof X.C46882bp
            if (r0 != 0) goto L_0x007a
            boolean r0 = r7 instanceof X.C46962bx
            if (r0 == 0) goto L_0x009e
        L_0x007a:
            X.1GQ r0 = r5.A06
            boolean r0 = X.C66013Ui.A0Z(r0, r7)
            if (r0 != 0) goto L_0x008a
            X.1GR r0 = r6.A06
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x009e
        L_0x008a:
            if (r23 == 0) goto L_0x0090
            boolean r0 = r7 instanceof X.C46882bp
            if (r0 != 0) goto L_0x009e
        L_0x0090:
            r0 = r22
            boolean r0 = r6.A04(r7, r0)
            if (r0 == 0) goto L_0x009e
            r1 = 2
        L_0x0099:
            r0 = r20
            r0.A01(r11, r7, r1, r10)
        L_0x009e:
            return
        L_0x009f:
            float r12 = (float) r8
            float r8 = (float) r0
            float r12 = r12 / r8
            float r13 = r13 * r12
            double r0 = (double) r13
            double r8 = java.lang.Math.ceil(r0)
            long r0 = (long) r8
            goto L_0x0058
        L_0x00aa:
            r2 = 0
            goto L_0x0049
        L_0x00ad:
            boolean r0 = r7 instanceof X.C46882bp
            if (r0 == 0) goto L_0x00d2
            X.1D1 r1 = r6.A09
            X.11F r0 = r4.A00
            boolean r0 = r0 instanceof X.C177528dw
            X.0yC r2 = r1.A02
            r1 = 3116(0xc2c, float:4.366E-42)
            if (r0 == 0) goto L_0x00bf
            r1 = 6269(0x187d, float:8.785E-42)
        L_0x00bf:
            X.0yV r0 = X.C21000yV.A01
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00d2
            X.3Qj r0 = r7.A01
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00d2
            goto L_0x005c
        L_0x00d2:
            boolean r0 = r6.A03(r7)
            if (r0 == 0) goto L_0x005c
            X.11F r0 = r4.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x00e9
            X.1Gl r0 = X.AnonymousClass6Y1.A02(r7)
            boolean r0 = X.AnonymousClass6Y1.A0A(r0)
            r1 = 3
            if (r0 != 0) goto L_0x0099
        L_0x00e9:
            r1 = 1
            goto L_0x0099
        L_0x00eb:
            r12 = 1
            X.3Qj r0 = r7.A01
            if (r0 == 0) goto L_0x01cd
            int r0 = r0.A09
            if (r0 != r15) goto L_0x01cd
            X.11F r11 = r4.A00
            boolean r0 = r11 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0124
            X.11F r9 = r7.A0J()
            X.16E r1 = r5.A04
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r9)
            X.3Sz r8 = r1.A08(r0)
            if (r8 != 0) goto L_0x0133
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaAutoDownloadPolicy/isStatusAutoDownloadEligible/No status for "
            r1.append(r0)
            if (r9 != 0) goto L_0x011a
            java.lang.String r9 = " me"
        L_0x011a:
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0124:
            int r1 = r7.A1I
            r0 = 2
            if (r1 == r0) goto L_0x012d
            r0 = 82
            if (r1 != r0) goto L_0x01b9
        L_0x012d:
            int r0 = r7.A09
            if (r0 != r12) goto L_0x01b9
            goto L_0x0024
        L_0x0133:
            boolean r0 = r1.A0I(r7)
            if (r0 != 0) goto L_0x0124
            boolean r0 = r9 instanceof X.C177638e7
            if (r0 != 0) goto L_0x0024
            X.0wo r0 = r5.A02
            long r18 = X.C19970wo.A00(r0)
            X.0v0 r0 = r5.A03
            X.005 r0 = r0.A00
            r16 = r0
            java.lang.Object r2 = r16.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r14 = "status_tab_last_opened_time"
            r0 = 0
            long r2 = r2.getLong(r14, r0)
            long r18 = r18 - r2
            X.0yC r3 = r5.A05
            r2 = 138(0x8a, float:1.93E-43)
            boolean r2 = X.C20800yB.A01(r10, r3, r2)
            if (r2 == 0) goto L_0x0181
            java.lang.Object r2 = r16.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            long r16 = r2.getLong(r14, r0)
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0181
            r0 = 6042(0x179a, float:8.467E-42)
            int r0 = X.C20800yB.A00(r10, r3, r0)
            long r0 = (long) r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0181
            goto L_0x0124
        L_0x0181:
            r14 = 0
            if (r9 == 0) goto L_0x018a
            X.16D r0 = r5.A01
            X.141 r14 = r0.A0D(r9)
        L_0x018a:
            monitor-enter(r8)
            long r2 = r7.A1O     // Catch:{ all -> 0x01fc }
            long r0 = r8.A02     // Catch:{ all -> 0x01fc }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r16 > 0) goto L_0x0195
            r0 = 1
        L_0x0195:
            monitor-exit(r8)
            if (r0 == 0) goto L_0x0124
            if (r14 == 0) goto L_0x019f
            boolean r0 = r14.A14
            if (r0 != r12) goto L_0x019f
            goto L_0x0124
        L_0x019f:
            if (r13 != 0) goto L_0x01b1
            if (r9 == 0) goto L_0x0124
            X.16D r0 = r5.A01
            X.141 r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x0124
            X.3IL r0 = r0.A0F
            if (r0 != 0) goto L_0x01b1
            goto L_0x0124
        L_0x01b1:
            if (r14 == 0) goto L_0x0124
            X.3IL r0 = r14.A0F
            if (r0 == 0) goto L_0x0124
            goto L_0x0024
        L_0x01b9:
            r0 = 20
            if (r1 == r0) goto L_0x0024
            boolean r0 = X.C66013Ui.A0l(r7)
            if (r0 == 0) goto L_0x01d0
            X.0yf r1 = r5.A00
            X.0yi r0 = X.C21100yf.A0U
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x01d0
        L_0x01cd:
            r0 = 0
            goto L_0x0025
        L_0x01d0:
            boolean r0 = r11 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x01e4
            X.1GQ r1 = r5.A06
            r0 = 2
            boolean r0 = X.AnonymousClass1GQ.A00(r1, r0)
            if (r0 != 0) goto L_0x01ec
            r0 = 3
            boolean r0 = X.AnonymousClass1GQ.A00(r1, r0)
            if (r0 != 0) goto L_0x01ec
        L_0x01e4:
            X.1GR r0 = r6.A06
            boolean r0 = r0.A00(r7)
            goto L_0x0025
        L_0x01ec:
            boolean r0 = r7 instanceof X.C181798o3
            if (r0 == 0) goto L_0x0024
            X.0yC r1 = r1.A00
            r0 = 6508(0x196c, float:9.12E-42)
            boolean r0 = X.C20800yB.A01(r10, r1, r0)
            if (r0 != 0) goto L_0x01e4
            goto L_0x0024
        L_0x01fc:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29841Ye.A00(X.1Ye, X.2bU, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d5, code lost:
        if (r11 != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C160107kT r24, X.AnonymousClass2bU r25, int r26, boolean r27) {
        /*
            r23 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediaautodownload/queue "
            r1.append(r0)
            r7 = r25
            java.lang.String r0 = r7.A07
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "mediaautodownload/getPriorityValue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = r23
            X.0wo r0 = r9.A03
            long r19 = X.C19970wo.A00(r0)
            X.0yC r2 = r9.A04
            r1 = 60
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            X.3Qa r0 = r7.A1J
            X.11F r3 = r0.A00
            if (r3 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "mediaautodownload/getPriorityValue/getHeuristicDownloadPriority"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Yf r2 = r9.A07
            boolean r0 = r3 instanceof X.C177528dw
            r17 = 345600000(0x14997000, double:1.70749087E-315)
            r10 = 1
            if (r0 == 0) goto L_0x006b
            int r0 = r7.A1I
            if (r0 != r10) goto L_0x00d8
            long r19 = r19 - r17
        L_0x004c:
            X.1MK r0 = r9.A0B
            boolean r0 = r0.A00()
            r16 = r24
            r18 = r26
            r21 = r27
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "mediaautodownload/queue waiting to download because call is active"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.39G r0 = new X.39G
            r15 = r0
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r21)
            java.util.ArrayList r1 = r9.A0A
            monitor-enter(r1)
            goto L_0x00e7
        L_0x006b:
            boolean r0 = r7.A11
            r8 = 20
            r6 = 42
            if (r0 == 0) goto L_0x0087
            int r0 = r7.A1I
            if (r0 != r6) goto L_0x007d
            r0 = 40000(0x9c40, double:1.97626E-319)
        L_0x007a:
            long r19 = r19 + r0
            goto L_0x004c
        L_0x007d:
            if (r0 != r8) goto L_0x0082
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L_0x007a
        L_0x0082:
            if (r0 != r10) goto L_0x0087
            r0 = 20000(0x4e20, double:9.8813E-320)
            goto L_0x007a
        L_0x0087:
            X.0v0 r0 = r2.A00
            X.005 r0 = r0.A00
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r4 = "last_read_conversation_time"
            r0 = 0
            long r15 = r5.getLong(r4, r0)
            X.12q r0 = r2.A01
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r0)
            java.lang.Object r0 = r0.get(r3)
            X.3Qp r0 = (X.C65073Qp) r0
            if (r0 != 0) goto L_0x00d2
            r4 = 0
        L_0x00a9:
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r4 + r13
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            r11 = 0
            if (r0 >= 0) goto L_0x00b4
            r11 = 1
        L_0x00b4:
            X.1CR r0 = r2.A02
            boolean r3 = r0.A0j(r3)
            int r2 = r7.A1I
            r0 = 172800000(0xa4cb800, double:8.53745436E-316)
            if (r2 == r8) goto L_0x00c7
            if (r2 == r6) goto L_0x00c7
            if (r2 != r10) goto L_0x00cf
            long r19 = r19 - r0
        L_0x00c7:
            if (r3 == 0) goto L_0x00d5
            if (r11 == 0) goto L_0x00df
            r0 = 259200000(0xf731400, double:1.280618154E-315)
            goto L_0x00db
        L_0x00cf:
            long r19 = r19 - r17
            goto L_0x00c7
        L_0x00d2:
            long r4 = r0.A0Y
            goto L_0x00a9
        L_0x00d5:
            if (r11 == 0) goto L_0x00e1
            goto L_0x00db
        L_0x00d8:
            r0 = 518400000(0x1ee62800, double:2.56123631E-315)
        L_0x00db:
            long r19 = r19 - r0
            goto L_0x004c
        L_0x00df:
            long r19 = r19 - r13
        L_0x00e1:
            long r19 = r19 - r15
            long r19 = r19 + r4
            goto L_0x004c
        L_0x00e7:
            r1.add(r0)     // Catch:{ all -> 0x00ec }
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            return
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            throw r0
        L_0x00ef:
            java.lang.String r0 = "mediaautodownload/autodownload because call is not active"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ST r0 = r9.A06
            r22 = 1
            r15 = r0
            r17 = r7
            r15.A0D(r16, r17, r18, r19, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29841Ye.A01(X.7kT, X.2bU, int, boolean):void");
    }

    public void A02(AnonymousClass2bU r3) {
        A00(this, r3, this.A02.A03(true), false);
    }

    public void BSa(C107265Nh r4) {
        this.A08.Boy(new C35711j8(this, 10));
    }

    public C29841Ye(AnonymousClass1MK r3, C19600wD r4, C19970wo r5, C20810yC r6, AnonymousClass1GO r7, AnonymousClass1ST r8, C29851Yf r9, C19770wU r10) {
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r10;
        this.A0B = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A02 = r4;
        this.A09 = new C35711j8(this, 8);
    }
}
