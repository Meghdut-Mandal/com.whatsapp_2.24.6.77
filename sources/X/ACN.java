package X;

import org.json.JSONObject;

public final class ACN implements C22944Ayu {
    public final C22944Ayu A00;

    public /* bridge */ /* synthetic */ Object B3d(JSONObject jSONObject, long j) {
        String str;
        JSONObject optJSONObject;
        boolean equals;
        AnonymousClass00C.A0D(jSONObject, 0);
        int i = (7205331739510454L > j ? 1 : (7205331739510454L == j ? 0 : -1));
        if (i == 0) {
            str = "xfb_wa_catalog_get_product";
        } else {
            str = "xwa_product_catalog_get_product";
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("product_catalog")) == null) {
            return new AnonymousClass9HE((C207269up) null, false);
        }
        if (i == 0) {
            equals = optJSONObject.optBoolean("cart_enabled");
        } else {
            equals = "CARTENABLED_TRUE".equals(optJSONObject.optString("cart_enabled"));
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("product");
        if (optJSONObject3 == null) {
            return new AnonymousClass9HE((C207269up) null, equals);
        }
        return new AnonymousClass9HE((C207269up) this.A00.B3d(optJSONObject3, j), equals);
    }

    public ACN(C22944Ayu ayu) {
        this.A00 = ayu;
    }
}
