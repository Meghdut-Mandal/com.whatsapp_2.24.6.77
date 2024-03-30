package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.8Vr  reason: invalid class name and case insensitive filesystem */
public final class C174238Vr extends C177038d6 {
    public final AnonymousClass1KK A00;
    public final AnonymousClass9HF A01;

    public void A08(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject A1B = C36441kJ.A1B();
        AnonymousClass9HF r6 = this.A01;
        UserJid userJid = r6.A00;
        JSONObject A0x = C90484aE.A0x(userJid.getRawString(), "biz_jid", A1B);
        A0x.put("width", 100);
        A0x.put("height", 100);
        A1B.put("image_dimensions", A0x);
        String str = r6.A01;
        if (str != null) {
            A1B.put("catalog_session_id", str);
        }
        AnonymousClass9ZK.A01("promotions", this.A00.A09(userJid), jSONObject, A1B, false);
    }

    public C174238Vr(C20050ww r12, AnonymousClass1KK r13, AnonymousClass9HF r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, AnonymousClass004 r19, AnonymousClass004 r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 5773368456121168L);
        this.A01 = r14;
        this.A00 = r13;
    }
}
