package X;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3mX  reason: invalid class name and case insensitive filesystem */
public class C75013mX implements C160087kR {
    public final /* synthetic */ C606338p A00;
    public final /* synthetic */ C65563So A01;
    public final /* synthetic */ C599635y A02;

    public C75013mX(C606338p r1, C65563So r2, C599635y r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void B2J(C123815x8 r18) {
        try {
            JSONObject jSONObject = r18.A05.getJSONObject("data").getJSONObject("purpose_public_keys");
            String string = jSONObject.getString("purpose_public_ek");
            AnonymousClass00C.A08(string);
            String string2 = jSONObject.getString("purpose_public_ik");
            AnonymousClass00C.A08(string2);
            AnonymousClass00C.A08(jSONObject.getString("purpose_public_ik_sig"));
            AnonymousClass00C.A08(jSONObject.getString("purpose_dummy_ciphertext"));
            String string3 = jSONObject.getString("purpose_dummy_nonce");
            AnonymousClass00C.A08(string3);
            AnonymousClass37Z r9 = new AnonymousClass37Z(string, string2, string3);
            C606338p r0 = this.A00;
            C599635y r1 = this.A02;
            C65563So r3 = r0.A01;
            String str = r0.A02;
            String str2 = r0.A03;
            C88624Tk r2 = r0.A00;
            String A012 = r3.A09.A01(r3.A05.A00);
            C18800tq r4 = r3.A02.A00.A00;
            C20810yC A0V = C36341k9.A0V(r4);
            new AnonymousClass2V7(C36381kD.A0U(r4), C36351kA.A0Y(r4), A0V, (AnonymousClass1WF) r4.A3W.get(), r9, C18840tu.A00(r4.A96), str2, str, A012, r4.A8J, r4.A0d, r1).Blp(new AnonymousClass3SO(r2, r3, 0));
        } catch (JSONException unused) {
            this.A00.A00.BXN(C36361kB.A0j());
        }
    }

    public void BVL(IOException iOException) {
        this.A00.A00.BXN(C36361kB.A0j());
    }

    public void BWk(Exception exc) {
        this.A00.A00.BXN(C36361kB.A0j());
    }
}
