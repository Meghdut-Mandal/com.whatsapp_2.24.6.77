package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.1L6  reason: invalid class name */
public final class AnonymousClass1L6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1L4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1L6(AnonymousClass1L4 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        C20810yC r1 = this.this$0.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String A09 = r1.A09(1320);
        AnonymousClass00C.A08(A09);
        try {
            JSONObject jSONObject = new JSONObject(A09);
            Iterator<String> keys = jSONObject.keys();
            AnonymousClass00C.A08(keys);
            C12380hx r5 = new C12380hx(C15060md.A02(new C86594Ln(jSONObject), C15080mf.A05(keys)));
            while (r5.hasNext()) {
                String str = (String) r5.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                AnonymousClass00C.A0B(optJSONObject);
                String optString = optJSONObject.optString("app_id");
                boolean optBoolean = optJSONObject.optBoolean("enabled", true);
                long optLong = optJSONObject.optLong("expiration_secs", 0);
                String optString2 = optJSONObject.optString("version", "");
                AnonymousClass00C.A0B(str);
                linkedHashMap.put(str, new C122455us(optLong, optString, optBoolean, optString2));
            }
            obj = AnonymousClass0AJ.A00;
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        Throwable A00 = AnonymousClass0AK.A00(obj);
        if (A00 != null) {
            A00.getMessage();
        }
        return linkedHashMap;
    }
}
