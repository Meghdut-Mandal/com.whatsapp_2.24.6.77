package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8Vw  reason: invalid class name and case insensitive filesystem */
public final class C174288Vw extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final C199899gC A01;
    public final String A02;

    public C174288Vw(C20050ww r13, AnonymousClass1KK r14, C199899gC r15, C19420v0 r16, C20810yC r17, AnonymousClass1WF r18, AnonymousClass005 r19, String str, AnonymousClass004 r21, AnonymousClass004 r22) {
        super(r13, r16, r17, r18, r19, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r21, r22, 6300966313316846L);
        this.A01 = r15;
        this.A00 = r14;
        this.A02 = str;
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        C199899gC r5 = this.A01;
        UserJid userJid = r5.A01;
        A0q.put("jid", userJid.getRawString());
        JSONArray A0u = C90524aI.A0u();
        for (Object next : r5.A04) {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, next);
            A0u.put(A1B);
        }
        A0q.put("products", A0u);
        A0q.put("width", r5.A03);
        A0q.put("height", r5.A02);
        String str = this.A02;
        if (str != null) {
            A0q.put("catalog_session_id", str);
        }
        AnonymousClass9W6 r0 = r5.A00;
        if (r0 != null) {
            AnonymousClass9ZK.A00(r0, A0q);
        }
        AnonymousClass9ZK.A01("product_list", this.A00.A09(userJid), jSONObject, A0q, true);
    }
}
