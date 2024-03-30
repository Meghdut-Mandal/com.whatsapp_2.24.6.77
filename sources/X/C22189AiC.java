package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.AiC  reason: case insensitive filesystem */
public final class C22189AiC extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C199799fz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22189AiC(C199799fz r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A0t;
        LinkedHashMap A1G = C36431kI.A1G();
        AE0 ae0 = this.this$0.A00;
        synchronized (ae0) {
            A0t = C36371kC.A0t(ae0.A01.A03(), "payments_upi_international_status");
        }
        if (!(A0t == null || A0t.length() == 0)) {
            JSONArray jSONArray = new JSONArray(A0t);
            Iterator it = C15040mb.A05(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(C165617ti.A05(it));
                A1G.put(C90474aD.A0e("credentialId", jSONObject), new C195839Wg(jSONObject.getLong("startTime"), C90474aD.A0e("credentialId", jSONObject), jSONObject.getLong("endTime"), C90474aD.A0e("internationalActivationStatus", jSONObject)));
            }
        }
        return A1G;
    }
}
