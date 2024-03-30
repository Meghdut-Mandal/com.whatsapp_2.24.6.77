package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3L2  reason: invalid class name */
public class AnonymousClass3L2 {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C24341Cb A02;
    public final C19970wo A03;
    public final C20830yE A04;
    public final C20810yC A05;
    public final AnonymousClass3DT A06;
    public final AnonymousClass1X4 A07;
    public final AnonymousClass1NG A08;
    public final AnonymousClass1MK A09;
    public final C21060yb A0A;
    public final C20060wx A0B;
    public final C21010yW A0C;
    public final C19770wU A0D;

    public void A01(AnonymousClass6Q9 r9, long j, boolean z) {
        this.A0D.Bp1(new C81243wh(this, r9, 1, j, z));
    }

    public void A00(C146506vi r4, C46812bi r5, File file) {
        if (file == null || !this.A05.A0E(746)) {
            this.A07.A0S(r4, r5);
            if (file != null) {
                this.A0D.Boy(new C81133wW((Object) file, 13));
                return;
            }
            return;
        }
        C36371kC.A1P(new C49452j8(this.A07, r4, r5, file), this.A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.getCallState() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C225014r r5) {
        /*
            r4 = this;
            X.0yb r0 = r4.A0A
            android.telephony.TelephonyManager r3 = r0.A0K()
            r2 = 0
            if (r3 == 0) goto L_0x0015
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 >= r0) goto L_0x0022
            int r0 = r3.getCallState()
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            X.1MK r0 = r4.A09
            boolean r1 = r0.A00()
            r0 = 2131889340(0x7f120cbc, float:1.941334E38)
            if (r1 != 0) goto L_0x0034
            r0 = 1
            return r0
        L_0x0022:
            X.0yE r0 = r4.A04     // Catch:{ SecurityException -> 0x0015 }
            boolean r0 = r0.A0F()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 == 0) goto L_0x0015
            int r0 = r3.getCallStateForSubscription()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            r0 = 2131889341(0x7f120cbd, float:1.9413343E38)
        L_0x0034:
            r5.BO5(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3L2.A04(X.14r):boolean");
    }

    public AnonymousClass3L2(C20690y0 r1, AnonymousClass17Y r2, AnonymousClass1X4 r3, AnonymousClass1NG r4, AnonymousClass1MK r5, C24341Cb r6, C21060yb r7, C19970wo r8, C20830yE r9, C20060wx r10, C20810yC r11, C21010yW r12, C19770wU r13, AnonymousClass3DT r14) {
        this.A03 = r8;
        this.A05 = r11;
        this.A01 = r2;
        this.A0D = r13;
        this.A00 = r1;
        this.A0C = r12;
        this.A07 = r3;
        this.A0B = r10;
        this.A06 = r14;
        this.A09 = r5;
        this.A0A = r7;
        this.A08 = r4;
        this.A02 = r6;
        this.A04 = r9;
    }

    public void A02(AnonymousClass6Q9 r6, long j, boolean z) {
        try {
            r6.A07();
        } catch (Exception e) {
            if (!z || j < 1000) {
                C36321k7.A1a(AnonymousClass000.A0v("pttutils/stopaudiorecordandvisualization/stopaudiorecord "), e.toString());
            } else {
                Log.e("pttutils/stopaudiorecordandvisualization/stopaudiorecord ", e);
            }
        } catch (Throwable th) {
            A01(r6, j, z);
            throw th;
        }
        A01(r6, j, z);
    }

    public boolean A03(AnonymousClass01I r7, C225014r r8, AnonymousClass11F r9) {
        if (A04(r8)) {
            Log.i("voicenote/startvoicenote");
            if (this.A02.A04(new AnonymousClass3MM(r7, this, 0))) {
                if (this.A0B.A01() < C36401kF.A04(this.A05, 3657)) {
                    AnonymousClass1V2.A05(r7, r8, this.A0C, 7);
                } else if (!C36351kA.A1X(this.A08, r9)) {
                    return true;
                } else {
                    AnonymousClass3SJ.A01(r7, 106);
                    return false;
                }
            }
        }
        return false;
    }
}
