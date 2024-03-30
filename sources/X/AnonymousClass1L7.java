package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.1L7  reason: invalid class name */
public final class AnonymousClass1L7 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1L1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1L7(AnonymousClass1L1 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1L1 r0 = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String A09 = r0.A02.A09(1320);
        if (A09 != null) {
            try {
                JSONObject jSONObject = new JSONObject(A09);
                Iterator<String> keys = jSONObject.keys();
                AnonymousClass00C.A08(keys);
                C12380hx r4 = new C12380hx(C15060md.A02(new AnonymousClass4IX(jSONObject), C15080mf.A05(keys)));
                while (r4.hasNext()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject((String) r4.next());
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("app_id");
                        String optString2 = optJSONObject.optString("version", "");
                        AnonymousClass00C.A0B(optString);
                        AnonymousClass00C.A0B(optString2);
                        linkedHashMap.put(optString, optString2);
                    }
                }
            } catch (Throwable th) {
                new AnonymousClass03N(th);
            }
        }
        return linkedHashMap;
    }
}
