package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2KL  reason: invalid class name */
public final class AnonymousClass2KL extends C196209Yd {
    public final C24801Dv A00;
    public final C25791Hr A01;
    public final C25121Fb A02;
    public final AnonymousClass1JN A03;
    public final C194729Qz A04;
    public final AnonymousClass3DP A05;
    public final C19770wU A06;
    public final AnonymousClass17Y A07;

    public String A05() {
        return "cta_call";
    }

    public void A08(Activity activity, AnonymousClass3T1 r16, C206969uL r17, int i) {
        String str;
        String optString;
        AnonymousClass3T1 r10 = r16;
        C36321k7.A0v(activity, 0, r10);
        C206969uL r1 = r17;
        AnonymousClass00C.A0D(r1, 3);
        if ((r10 instanceof C23043B1o) && (str = r1.A01) != null && (optString = C36441kJ.A1C(str).optString("phone_number")) != null) {
            int i2 = i;
            AnonymousClass3P8 r2 = new AnonymousClass3P8("", optString, "", 3, i2);
            if (C203369nr.A07(r10)) {
                this.A06.Boy(new C80513vW(this, r10, r2, i2, 6));
            }
            UserJid A0L = r10.A0L();
            if (A0L != null) {
                this.A01.A01(A0L, r10, 2);
            }
            if (AnonymousClass000.A1S(r10.A0A & 4194304, 4194304)) {
                this.A02.A01(AnonymousClass3IP.A00(new C25111Fa[]{C25111Fa.SKIP_ADDONS, C25111Fa.SKIP_THUMBNAILS}), r10, new C81333wq(this, i2, 19, r10));
            }
            this.A07.A0H(new C1502274l(this, activity, optString, 41));
        }
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass2KL(C24801Dv r1, AnonymousClass17Y r2, C25791Hr r3, C25121Fb r4, AnonymousClass1JN r5, C194729Qz r6, AnonymousClass3DP r7, C19770wU r8) {
        C36321k7.A18(r8, r1, r7, r4);
        C36321k7.A13(r5, r3, r2);
        this.A06 = r8;
        this.A00 = r1;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A07 = r2;
    }

    public int A03() {
        return R.drawable.ic_action_call;
    }

    public String A06(Context context, C206969uL r3) {
        return C36421kH.A0b(r3);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        return C36351kA.A1Z(r2);
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        return C36351kA.A1Z(r2);
    }
}
