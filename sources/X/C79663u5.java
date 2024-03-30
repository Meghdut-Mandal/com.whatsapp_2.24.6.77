package X;

import com.whatsapp.R;

/* renamed from: X.3u5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79663u5 implements AnonymousClass4SM {
    public final /* synthetic */ C47522eu A00;

    public /* synthetic */ C79663u5(C47522eu r1) {
        this.A00 = r1;
    }

    public final void BWy(String str, String str2, boolean z) {
        C47522eu r4 = this.A00;
        C47592fB r3 = r4.A05.A01;
        if (r3.A06) {
            if (str == null) {
                r4.A01.A06(R.string.f12nameremoved, 0);
            } else {
                r4.A01.A0E(str, 0);
            }
        }
        if (!z) {
            C47522eu.A05(r4);
            C47522eu.A07(r4);
            C47522eu.A04(r4);
            C50362kd r1 = new C50362kd(r4.A0G, r4.A0B);
            r4.A02 = r1;
            if (r3.A06) {
                r1.A0C();
            }
        }
    }
}
