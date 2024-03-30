package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3oO  reason: invalid class name and case insensitive filesystem */
public final class C76143oO implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        AnonymousClass00C.A0D(str, 0);
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            String string = A1C.getString("jid");
            JSONObject jSONObject = A1C.getJSONObject("lt");
            AnonymousClass00C.A08(jSONObject);
            AnonymousClass9YF A00 = AnonymousClass96T.A00(jSONObject);
            long j = A1C.getLong("lit");
            AnonymousClass00C.A0B(string);
            return new AnonymousClass3Q5(A00, string, j);
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e);
        } catch (C19740wR e2) {
            throw new AnonymousClass1ID("CTWA: CtwaAdConsumerDCStateInfoStore/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        AnonymousClass3Q5 r5 = (AnonymousClass3Q5) obj;
        AnonymousClass00C.A0D(r5, 0);
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("jid", r5.A02);
            A1B.put("lt", r5.A01.A01());
            A1B.put("lit", r5.A00);
            String obj2 = A1B.toString();
            AnonymousClass00C.A0B(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: CtwaAdConsumerDCStateInfoStore/toData/JSONException", e);
        }
    }
}
