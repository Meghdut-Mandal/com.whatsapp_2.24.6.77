package X;

import org.json.JSONArray;

/* renamed from: X.4K1  reason: invalid class name */
public final class AnonymousClass4K1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ JSONArray $clientFiltersJSON;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4K1(JSONArray jSONArray) {
        super(1);
        this.$clientFiltersJSON = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        String string = this.$clientFiltersJSON.getString(A0I);
        AnonymousClass00C.A08(string);
        for (C52142ox r1 : C52142ox.values()) {
            if (AnonymousClass00C.A0J(r1.label, string)) {
                return r1;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Not a valid client filter: ");
        throw AnonymousClass000.A0c(this.$clientFiltersJSON.getString(A0I), A0u);
    }
}
