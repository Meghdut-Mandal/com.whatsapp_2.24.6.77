package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ACO implements C22944Ayu {
    public final AnonymousClass9QY A00;
    public final C22944Ayu A01;

    public ACO(AnonymousClass9QY r2, C22944Ayu ayu) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = ayu;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B3d(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        AnonymousClass9VS r7;
        Object B3d;
        AnonymousClass00C.A0D(jSONObject, 0);
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("xwa_product_catalog_get_product_catalog");
            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("product_catalog")) == null)) {
                if (AnonymousClass9ZU.A03(optJSONObject, new String[]{"products"})) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("products");
                    if (optJSONArray == null) {
                        return new AnonymousClass9HD((C21112A8x) null, false);
                    }
                    ArrayList A0I = AnonymousClass001.A0I();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (!(optJSONObject3 == null || (B3d = this.A01.B3d(optJSONObject3, j)) == null)) {
                            A0I.add(B3d);
                        }
                    }
                    boolean z = false;
                    if (!AnonymousClass9ZU.A03(optJSONObject, new String[]{"paging"})) {
                        r7 = new AnonymousClass9VS(false, (String) null);
                    } else {
                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("paging");
                        if (optJSONObject4 != null) {
                            String A002 = AnonymousClass9ZU.A00("after", optJSONObject4);
                            if (A002 == null || A002.length() == 0) {
                                z = true;
                            }
                            r7 = new AnonymousClass9VS(true ^ z, A002);
                        } else {
                            throw C36381kD.A0l();
                        }
                    }
                    boolean A0J = AnonymousClass00C.A0J(AnonymousClass9ZU.A00("cart_enabled", optJSONObject), "CARTENABLED_TRUE");
                    C21112A8x a8x = new C21112A8x(r7, A0I);
                    this.A00.A00(a8x, optJSONObject);
                    return new AnonymousClass9HD(a8x, A0J);
                }
            }
            return new AnonymousClass9HD((C21112A8x) null, false);
        } catch (Exception e) {
            Log.e("GetProductCatalogGraphQLResponseConverter/convert/Could not create GetProductCatalogPageResult from GetProductCatalog GraphQL response", e);
            return new AnonymousClass9HD((C21112A8x) null, false);
        }
    }
}
