package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ACP implements C22944Ayu {
    public final AnonymousClass9QY A00;
    public final C22944Ayu A01;

    public ACP(AnonymousClass9QY r2, C22944Ayu ayu) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = ayu;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B3d(JSONObject jSONObject, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object B3d;
        AnonymousClass00C.A0D(jSONObject, 0);
        try {
            if (!AnonymousClass9ZU.A01("xwa_product_catalog_get_product_list", jSONObject) || (optJSONObject = jSONObject.optJSONObject("xwa_product_catalog_get_product_list")) == null || !AnonymousClass9ZU.A01("product_list", optJSONObject) || (optJSONObject2 = optJSONObject.optJSONObject("product_list")) == null || !AnonymousClass9ZU.A01("products", optJSONObject2)) {
                return new C21114A8z(4);
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("products");
            if (optJSONArray == null) {
                return new C21114A8z(4);
            }
            ArrayList A0I = AnonymousClass001.A0I();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (!(optJSONObject3 == null || (B3d = this.A01.B3d(optJSONObject3, j)) == null)) {
                    A0I.add(B3d);
                }
            }
            boolean A0J = AnonymousClass00C.A0J(AnonymousClass9ZU.A00("cart_enabled", optJSONObject2), "CARTENABLED_TRUE");
            if (A0I.isEmpty()) {
                return new C21114A8z(4);
            }
            C21114A8z a8z = new C21114A8z(1);
            a8z.A01 = A0I;
            a8z.A02 = A0J;
            this.A00.A00(a8z, optJSONObject2);
            return a8z;
        } catch (Exception e) {
            Log.e("CatalogPageGraphQLResponseConverter/convert/Could not create CatalogPage from GetProductList GraphQL response", e);
            return new C21114A8z(2);
        }
    }
}
