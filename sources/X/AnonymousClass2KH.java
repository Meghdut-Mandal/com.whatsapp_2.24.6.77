package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import org.json.JSONObject;

/* renamed from: X.2KH  reason: invalid class name */
public final class AnonymousClass2KH extends C196209Yd {
    public final AnonymousClass16D A00;
    public final AnonymousClass3CV A01;
    public final AnonymousClass005 A02;

    public String A05() {
        return "voice_call";
    }

    public String A06(Context context, C206969uL r6) {
        String optString;
        String str;
        AnonymousClass00C.A0D(context, 0);
        JSONObject jSONObject = null;
        if (!(r6 == null || (str = r6.A01) == null || AnonymousClass098.A06(str))) {
            jSONObject = C36441kJ.A1C(str);
        }
        String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
        if (jSONObject == null || (optString = jSONObject.optString("display_text", A0m)) == null) {
            return A0m;
        }
        return optString;
    }

    public void A08(Activity activity, AnonymousClass3T1 r8, C206969uL r9, int i) {
        String str;
        C36321k7.A16(activity, r8, r9, 0);
        AnonymousClass11F r5 = r8.A1J.A00;
        if (r5 != null) {
            AnonymousClass141 A08 = this.A00.A08(r5);
            String str2 = r9.A01;
            if (str2 != null) {
                str = C36441kJ.A1C(str2).optString("message_origin");
            } else {
                str = null;
            }
            if (AnonymousClass00C.A0J(str, "ctwa_auto_reply")) {
                this.A01.A00(C36401kF.A0b(r5), "whatsapp_call");
            }
            ((AnonymousClass1ND) this.A02.get()).Bua(activity, A08, 36, false);
        }
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        AnonymousClass00C.A0D(activity, 0);
        C36321k7.A0x(r4, r3);
        A08(activity, r3, r4, 0);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(4037);
    }

    public AnonymousClass2KH(AnonymousClass16D r1, AnonymousClass3CV r2, AnonymousClass005 r3) {
        C36321k7.A0x(r3, r1);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public int A03() {
        return R.drawable.ic_settings_phone;
    }
}
