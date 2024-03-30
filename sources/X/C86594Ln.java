package X;

import org.json.JSONObject;

/* renamed from: X.4Ln  reason: invalid class name and case insensitive filesystem */
public final class C86594Ln extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ JSONObject $jsonObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86594Ln(JSONObject jSONObject) {
        super(1);
        this.$jsonObject = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0B(str);
        boolean z = true;
        if (str.length() <= 0 || !this.$jsonObject.has(str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
