package X;

import org.json.JSONObject;

/* renamed from: X.4IX  reason: invalid class name */
public final class AnonymousClass4IX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ JSONObject $jsonObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IX(JSONObject jSONObject) {
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
