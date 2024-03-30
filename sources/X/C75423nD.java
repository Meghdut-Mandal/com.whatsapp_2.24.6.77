package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3nD  reason: invalid class name and case insensitive filesystem */
public final class C75423nD implements B6H {
    public C62543Go A00;
    public final C27591Ow A01;

    public void BXQ(Throwable th) {
        AnonymousClass00C.A0D(th, 0);
        Log.e("Error getting invite code with MEX", th);
        C62543Go r0 = this.A00;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C36331k8.A0d("callback");
    }

    public void Bey(C177278dX r5) {
        AnonymousClass00C.A0D(r5, 0);
        JSONArray jSONArray = r5.A01;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("message")) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Error getting invite code with MEX: ");
                C36331k8.A1P(jSONObject.get("message"), A0u);
            }
        } else {
            String A10 = C36411kG.A10("xwa2_growth_set_invite_code", r5.A00.A00);
            if (!AnonymousClass098.A06(A10)) {
                C62543Go r0 = this.A00;
                if (r0 != null) {
                    r0.A01(A10);
                    return;
                }
                throw C36331k8.A0d("callback");
            }
        }
        C62543Go r02 = this.A00;
        if (r02 != null) {
            r02.A00();
            return;
        }
        throw C36331k8.A0d("callback");
    }

    public C75423nD(C27591Ow r1) {
        this.A01 = r1;
    }
}
