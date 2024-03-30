package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1II  reason: invalid class name */
public class AnonymousClass1II implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("ep");
            AnonymousClass00C.A08(jSONObject2);
            C175418aS A00 = AnonymousClass96R.A00(jSONObject2);
            JSONObject jSONObject3 = jSONObject.getJSONObject("lt");
            AnonymousClass00C.A08(jSONObject3);
            return new C175448aV(A00, AnonymousClass96T.A00(jSONObject3), jSONObject.getLong("lit"));
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: AdsConversionInfoJsonTransformer/fromData/JSONException", e);
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass1ID("CTWA: AdsConversionInfoJsonTransformer/fromData/JSONException", e2);
        } catch (C19740wR e3) {
            throw new AnonymousClass1ID("CTWA: AdsConversionInfoJsonTransformer/fromData/JSONException", e3);
        }
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        C175448aV r5 = (C175448aV) obj;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ep", r5.A01.A02());
            jSONObject.put("lt", r5.A02.A01());
            jSONObject.put("lit", r5.A00);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: AdsConversionInfoJsonTransformer/toData/JSONException", e);
        }
    }
}
