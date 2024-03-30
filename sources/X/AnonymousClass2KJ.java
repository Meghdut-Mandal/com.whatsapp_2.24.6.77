package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2KJ  reason: invalid class name */
public final class AnonymousClass2KJ extends C196209Yd {
    public final AnonymousClass3CS A00;
    public final C65003Qi A01;
    public final C19970wo A02;
    public final C20310xM A03;
    public final AnonymousClass1VZ A04;
    public final C62173Fb A05;
    public final C238019x A06;
    public final C19770wU A07;

    public String A05() {
        return "cta_cancel_reminder";
    }

    public String A06(Context context, C206969uL r4) {
        String str;
        String optString;
        AnonymousClass00C.A0D(context, 0);
        if (r4 != null && (str = r4.A01) != null && (optString = C36441kJ.A1C(str).optString("display_text_secondary")) != null && optString.length() != 0) {
            return optString;
        }
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass00C.A0B(string);
        return string;
    }

    public void A08(Activity activity, AnonymousClass3T1 r5, C206969uL r6, int i) {
        C36321k7.A0v(activity, 0, r5);
        C39001qm A002 = AnonymousClass3LW.A00(activity);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        C39001qm.A0J(A002, r5, this, 12, R.string.f12nameremoved);
        A002.A0f(C66253Vg.A00, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        AnonymousClass00C.A0D(activity, 0);
        C36321k7.A0x(r4, r3);
        A08(activity, r3, r4, 0);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(5075);
    }

    public AnonymousClass2KJ(AnonymousClass3CS r2, C65003Qi r3, C19970wo r4, C20310xM r5, AnonymousClass1VZ r6, C62173Fb r7, C238019x r8, C19770wU r9) {
        C36321k7.A1B(r4, r9, r2, r6, r8);
        C36361kB.A1J(r5, 6, r7);
        this.A02 = r4;
        this.A07 = r9;
        this.A00 = r2;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = r7;
    }

    public int A03() {
        return R.drawable.ic_notifications_off;
    }
}
