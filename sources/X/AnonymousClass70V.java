package X;

import com.whatsapp.util.Log;

/* renamed from: X.70V  reason: invalid class name */
public class AnonymousClass70V implements C25711Hj {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass1Y4 A02;
    public final /* synthetic */ C146506vi A03;
    public final /* synthetic */ C25471Gl A04;
    public final /* synthetic */ AnonymousClass3SC A05;

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        String str2 = (String) obj;
        int i = this.A00 + 1;
        this.A00 = i;
        AnonymousClass1Y4 r7 = this.A02;
        AnonymousClass3SC r6 = this.A05;
        AnonymousClass1Y4.A03(r7, r6, -2, i, 0);
        if (C25161Ff.A00(str2)) {
            C20810yC r5 = r7.A0A;
            if (C20800yB.A01(C21000yV.A01, r5, 1539)) {
                C25471Gl r1 = this.A04;
                if ((r1 == C25471Gl.A0A || r1 == C25471Gl.A0D || r1 == C25471Gl.A0i) && r7.A0G.A03(C007103b.A0Y(r6.A02)) && !this.A01) {
                    C146506vi r4 = this.A03;
                    C124995z9 A022 = r4.A02();
                    String str3 = null;
                    if (r5.A0E(6502)) {
                        str3 = A022.A09;
                        str = A022.A08;
                    } else {
                        C101314xL r0 = (C101314xL) r7.A0K.A03(r4);
                        if (r0 != null) {
                            C129146Fj r02 = r0.A0X;
                            str3 = r02.A06();
                            str = r02.A05();
                        } else {
                            str = null;
                        }
                    }
                    long j = A022.A03;
                    AnonymousClass11F r8 = r6.A01().A1J.A00;
                    if (!(str == null || j <= 0 || r8 == null)) {
                        if (r5.A0E(6966)) {
                            r7.A05(r8, str2, (String) null, str, j);
                        }
                        if (str3 != null) {
                            r7.A05(r8, str2, str3, str, j);
                            this.A01 = true;
                            return;
                        }
                    }
                    Log.e("sendmediamessagemanager/whenhttpconnected could not send medianotify since some params are invalid");
                }
            }
        }
    }

    public AnonymousClass70V(AnonymousClass1Y4 r2, C146506vi r3, C25471Gl r4, AnonymousClass3SC r5) {
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }
}
