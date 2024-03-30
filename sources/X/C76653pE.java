package X;

import android.util.Pair;

/* renamed from: X.3pE  reason: invalid class name and case insensitive filesystem */
public class C76653pE implements C236119d {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass1V0 A02;

    public C76653pE(AnonymousClass1V0 r1, String str, String str2) {
        this.A02 = r1;
        this.A00 = str;
        this.A01 = str2;
    }

    public void BVN(String str) {
        C36321k7.A1Q("TwoFactorXmppMethods/sendSetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
        this.A02.A00.Bp3(new C80393vK(this, this.A00, this.A01, 15));
    }

    public void BWw(C203399nx r8, String str) {
        Pair A012 = AnonymousClass3ME.A01(r8);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TwoFactorXmppMethods/sendSetTwoFactorAuth/onError; iq=");
        A0u.append(str);
        C36321k7.A1K(A012, ", error=", A0u);
        this.A02.A00.Bp3(new C80503vV(this, A012, this.A00, this.A01, 10));
    }

    public void BiM(C203399nx r7, String str) {
        C36321k7.A1Q("TwoFactorXmppMethods/sendSetTwoFactorAuth/onSuccess; iq=", str, AnonymousClass000.A0u());
        C29011Uz r5 = (C29011Uz) this.A02.A02.get();
        r5.A08.Bp1(new C80483vT(r5, this.A00, this.A01, 0));
    }
}
