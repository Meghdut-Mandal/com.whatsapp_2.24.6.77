package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2KK  reason: invalid class name */
public final class AnonymousClass2KK extends C196209Yd {
    public final C25791Hr A00;
    public final AnonymousClass1JN A01;
    public final C19770wU A02;
    public final C62563Gq A03;

    public String A05() {
        return "cta_copy";
    }

    public void A08(Activity activity, AnonymousClass3T1 r5, C206969uL r6, int i) {
        String str;
        C36321k7.A16(activity, r5, r6, 0);
        if (r5 instanceof C23043B1o) {
            String str2 = r6.A01;
            if (str2 == null || (str = C36441kJ.A1C(str2).optString("copy_code")) == null) {
                str = "";
            }
            this.A03.A01(str);
            if (C203369nr.A07(r5)) {
                C81333wq.A00(this.A02, this, r5, i, 18);
            }
            UserJid A0L = r5.A0L();
            if (A0L != null) {
                this.A00.A01(A0L, r5, 3);
            }
            AnonymousClass4V7 A012 = AnonymousClass3SS.A01(activity);
            if (A012 != null) {
                A012.Bn8();
            }
        }
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass2KK(C25791Hr r1, AnonymousClass1JN r2, C62563Gq r3, C19770wU r4) {
        C36321k7.A18(r4, r3, r2, r1);
        this.A02 = r4;
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A03() {
        return R.drawable.ic_action_copy;
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
