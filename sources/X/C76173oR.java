package X;

import org.json.JSONObject;

/* renamed from: X.3oR  reason: invalid class name and case insensitive filesystem */
public final class C76173oR implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        AnonymousClass00C.A0D(str, 0);
        return C54682tL.A00(C36441kJ.A1C(str));
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        C63363Jt r5 = (C63363Jt) obj;
        AnonymousClass00C.A0D(r5, 0);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("session_id", r5.A04);
        A1B.put("business_jid", r5.A02.getRawString());
        A1B.put("business_session_id", r5.A03);
        A1B.put("survey_start_timestamp", r5.A00);
        A1B.put("conversion_info", r5.A01.A00());
        return C36381kD.A0y(A1B);
    }
}
