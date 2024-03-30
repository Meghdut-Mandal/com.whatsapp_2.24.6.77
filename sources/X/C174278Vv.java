package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8Vv  reason: invalid class name and case insensitive filesystem */
public final class C174278Vv extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final AnonymousClass964 A01;
    public final C200939iV A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174278Vv(C20050ww r13, AnonymousClass1KK r14, AnonymousClass964 r15, C19420v0 r16, C200939iV r17, C20810yC r18, AnonymousClass1WF r19, AnonymousClass005 r20, AnonymousClass004 r21, AnonymousClass004 r22) {
        super(r13, r16, r18, r19, r20, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r21, r22, 6285325601582715L);
        AnonymousClass00C.A0D(r15, 11);
        this.A02 = r17;
        this.A00 = r14;
        this.A01 = r15;
    }

    public void A08(JSONObject jSONObject) {
        JSONObject A0q = C90464aC.A0q(jSONObject);
        C200939iV r7 = this.A02;
        UserJid userJid = r7.A07;
        AnonymousClass00C.A07(userJid);
        A0q.put("jid", userJid.getRawString());
        A0q.put("limit", String.valueOf(r7.A04));
        A0q.put("width", String.valueOf(r7.A06));
        A0q.put("height", String.valueOf(r7.A05));
        String str = r7.A08;
        if (str != null) {
            A0q.put("after", str);
        }
        String str2 = r7.A09;
        if (str2 != null) {
            A0q.put("catalog_session_id", str2);
        }
        Boolean bool = true;
        if (bool.equals(r7.A02)) {
            A0q.put("allow_shop_source", "ALLOWSHOPSOURCE_TRUE");
        }
        AnonymousClass9K5 r5 = r7.A00;
        if (r5 != null) {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("value", r5.A00);
            A1B.put("version", r5.A01);
            A0q.put("query", A1B);
        }
        if (r7.A03) {
            A0q.put("skip_direct_connection_encrypted_info_check", true);
        }
        AnonymousClass9W6 r0 = r7.A01;
        if (r0 != null) {
            AnonymousClass9ZK.A00(r0, A0q);
        }
        AnonymousClass9ZK.A01("product_catalog", this.A00.A09(userJid), jSONObject, A0q, true);
    }
}
