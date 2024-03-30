package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8Vu  reason: invalid class name and case insensitive filesystem */
public final class C174268Vu extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final AnonymousClass9XP A01;

    public C174268Vu(C20050ww r12, AnonymousClass1KK r13, AnonymousClass9XP r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, AnonymousClass004 r19, AnonymousClass004 r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 9507656222642921L);
        this.A01 = r14;
        this.A00 = r13;
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        AnonymousClass9XP r2 = this.A01;
        UserJid userJid = r2.A04;
        A0q.put("biz_jid", userJid.getRawString());
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A06);
        A0q.put("limit", r2.A01);
        A0q.put("width", r2.A02);
        A0q.put("height", r2.A00);
        A0q.put("is_category", r2.A08);
        String str = r2.A07;
        if (str != null) {
            A0q.put("catalog_session_id", str);
        }
        String str2 = r2.A05;
        if (str2 != null) {
            A0q.put("after", str2);
        }
        if (r2.A09) {
            A0q.put("skip_direct_connection_encrypted_info_check", true);
        }
        AnonymousClass9W6 r0 = r2.A03;
        if (r0 != null) {
            AnonymousClass9ZK.A00(r0, A0q);
        }
        AnonymousClass9ZK.A01("collection", this.A00.A09(userJid), jSONObject, A0q, true);
    }
}
