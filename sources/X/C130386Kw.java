package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6Kw  reason: invalid class name and case insensitive filesystem */
public final class C130386Kw {
    public final C130936Na A00;
    public final C19700wN A01;
    public final AnonymousClass5ZW A02;
    public final C19970wo A03;
    public final AnonymousClass1UW A04;

    public C130386Kw(C19700wN r1, AnonymousClass5ZW r2, C19970wo r3, C130936Na r4, AnonymousClass1UW r5) {
        C36321k7.A18(r3, r1, r4, r2);
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = r4;
        this.A02 = r2;
        this.A04 = r5;
    }

    public static final String A00(C130386Kw r4, C135086c7 r5, String str, String str2, String str3) {
        try {
            JSONObject A0w = C90484aE.A0w();
            A0w.put("operation", str3);
            A0w.put("timestamp", C36371kC.A09(r4.A03));
            C90494aF.A1I(str, A0w);
            A0w.put("password", str2);
            if (r5 != null) {
                A0w.put("fbid", C135086c7.A01(r5));
            }
            return C36381kD.A0y(A0w);
        } catch (JSONException e) {
            r4.A01.A0D("CommonUserProtocolUtils/getBasePayload/JSONException failed to generate base payload", e.getMessage(), e);
            return "";
        }
    }
}
