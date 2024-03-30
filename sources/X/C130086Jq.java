package X;

import org.json.JSONObject;

/* renamed from: X.6Jq  reason: invalid class name and case insensitive filesystem */
public final class C130086Jq {
    public final AnonymousClass57M A00;
    public final C19970wo A01;

    public C130086Jq(C19970wo r2, AnonymousClass57M r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    public static final String A00(C130086Jq r4, C135086c7 r5, String str, String str2, String str3) {
        JSONObject A0w = C90484aE.A0w();
        A0w.put("operation", str3);
        A0w.put("timestamp", C36371kC.A09(r4.A01));
        C90494aF.A1I(str, A0w);
        A0w.put("password", str2);
        if (r5 != null) {
            A0w.put("fbid", C135086c7.A01(r5));
        }
        return C36381kD.A0y(A0w);
    }
}
