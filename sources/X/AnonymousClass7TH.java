package X;

import java.util.Objects;
import org.json.JSONArray;

/* renamed from: X.7TH  reason: invalid class name */
public final class AnonymousClass7TH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ JSONArray $this_toTypedArray;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TH(JSONArray jSONArray) {
        super(1);
        this.$this_toTypedArray = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.$this_toTypedArray.get(AnonymousClass000.A0I(obj));
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
        return obj2;
    }
}
