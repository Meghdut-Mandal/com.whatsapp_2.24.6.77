package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8Vt  reason: invalid class name and case insensitive filesystem */
public final class C174258Vt extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final C193989Nr A01;

    public C174258Vt(C20050ww r12, AnonymousClass1KK r13, C193989Nr r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, AnonymousClass004 r19, AnonymousClass004 r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 6525934317460326L);
        this.A01 = r14;
        this.A00 = r13;
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        C193989Nr r2 = this.A01;
        UserJid userJid = r2.A05;
        A0q.put("biz_jid", userJid.getRawString());
        A0q.put("collection_limit", r2.A01);
        A0q.put("item_limit", 3);
        A0q.put("width", r2.A03);
        A0q.put("height", r2.A02);
        String str = r2.A07;
        if (str != null) {
            A0q.put("catalog_session_id", str);
        }
        String str2 = r2.A06;
        if (str2 != null) {
            A0q.put("after", str2);
        }
        AnonymousClass9W6 r0 = r2.A00;
        if (r0 != null) {
            AnonymousClass9ZK.A00(r0, A0q);
        }
        AnonymousClass9ZK.A01("collections", this.A00.A09(userJid), jSONObject, A0q, true);
    }
}
