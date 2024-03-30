package X;

import org.json.JSONObject;

/* renamed from: X.5B0  reason: invalid class name */
public class AnonymousClass5B0 extends AnonymousClass6R4 {
    public final C132636Up A00;
    public final AnonymousClass1PW A01;
    public final C132696Uw A02;

    public JSONObject A00(C128946Ef r3, JSONObject jSONObject) {
        if (!C90484aE.A1V(this.A02.A03(r3, jSONObject.getJSONObject("payload").getString("call_id")))) {
            return AnonymousClass6R4.A03("There is no call with that call id", 17);
        }
        this.A01.A00(this.A00);
        return AnonymousClass6R4.A02((Object) null);
    }

    public AnonymousClass5B0(C132636Up r1, AnonymousClass1PW r2, C132696Uw r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
