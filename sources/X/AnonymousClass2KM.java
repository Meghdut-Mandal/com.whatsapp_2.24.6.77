package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2KM  reason: invalid class name */
public final class AnonymousClass2KM extends C196209Yd {
    public final C25791Hr A00;
    public final C21010yW A01;
    public final C24801Dv A02;
    public final C19700wN A03;

    public String A05() {
        return "landline_call";
    }

    public String A06(Context context, C206969uL r6) {
        String str;
        AnonymousClass00C.A0D(context, 0);
        Object[] A0L = AnonymousClass001.A0L();
        if (r6 != null) {
            str = r6.A01;
        } else {
            str = null;
        }
        return C36351kA.A0x(context, A00(str), A0L, 0, R.string.f12nameremoved);
    }

    public void A08(Activity activity, AnonymousClass3T1 r7, C206969uL r8, int i) {
        C36321k7.A16(activity, r7, r8, 0);
        String str = r8.A01;
        String A002 = A00(str);
        if (A002 == null || AnonymousClass098.A06(A002)) {
            this.A03.A0E("LandLineCallAction/execute", "number in params json is INVALID but it pass VALID check", false);
            return;
        }
        AnonymousClass2OG r3 = new AnonymousClass2OG();
        r3.A00 = 1;
        r3.A01 = 1;
        this.A01.Bls(r3, new C18950u5(1, 1), true);
        UserJid A0L = r7.A0L();
        if (A0L != null) {
            this.A00.A01(A0L, r7, 2);
        }
        C24801Dv r2 = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("tel:");
        r2.Bp7(activity, Uri.parse(AnonymousClass000.A0q(A00(str), A0u)), (AnonymousClass3T1) null);
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (X.AnonymousClass098.A06(r3) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A00(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r5 = "LandLineCallAction/extractPhoneNumber"
            r4 = 0
            if (r7 == 0) goto L_0x0010
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x0026 }
            java.lang.String r0 = "number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0026 }
            goto L_0x0011
        L_0x0010:
            r3 = r4
        L_0x0011:
            r2 = 0
            if (r3 == 0) goto L_0x001b
            boolean r1 = X.AnonymousClass098.A06(r3)     // Catch:{ JSONException -> 0x0026 }
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x002f
            X.0wN r1 = r6.A03     // Catch:{ JSONException -> 0x0026 }
            java.lang.String r0 = "number in params json is either null or incorrect phone number"
            r1.A0E(r5, r0, r2)     // Catch:{ JSONException -> 0x0026 }
            return r3
        L_0x0026:
            r2 = move-exception
            X.0wN r1 = r6.A03
            java.lang.String r0 = "action param is invalid json"
            r1.A0D(r5, r0, r2)
            return r4
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KM.A00(java.lang.String):java.lang.String");
    }

    public boolean A0D(C173078Qh r2, AnonymousClass91C r3) {
        if (r2.nativeFlowInfo_ != null) {
            return false;
        }
        int i = C172718Ox.NAME_FIELD_NUMBER;
        return false;
    }

    public AnonymousClass2KM(C24801Dv r1, C19700wN r2, C25791Hr r3, C21010yW r4) {
        C36321k7.A18(r1, r2, r4, r3);
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r4;
        this.A00 = r3;
    }

    public int A03() {
        return R.drawable.ic_settings_phone;
    }
}
