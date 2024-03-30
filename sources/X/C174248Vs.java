package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8Vs  reason: invalid class name and case insensitive filesystem */
public final class C174248Vs extends C177038d6 {
    public final C128516Co A00;
    public final AnonymousClass1KK A01;

    public void A08(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        C128516Co r10 = this.A00;
        UserJid userJid = r10.A02;
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("width", r10.A01);
        A1B.put("height", r10.A00);
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put("biz_jid", userJid.getRawString());
        A1B2.put("image_dimensions", A1B);
        Set set = r10.A04;
        if (!set.isEmpty()) {
            ArrayList A15 = C36441kJ.A15(set);
            JSONArray A0u = C90524aI.A0u();
            int size = A15.size();
            for (int i = 0; i < size; i++) {
                JSONObject A1B3 = C36441kJ.A1B();
                A1B3.put("category_id", A15.get(i));
                A0u.put(A1B3);
            }
            A1B2.put("category_ids", A0u);
        }
        A1B2.put("catalog_session_id", r10.A03);
        AnonymousClass9ZK.A01("categories", this.A01.A09(userJid), jSONObject, A1B2, true);
    }

    public C174248Vs(C20050ww r12, AnonymousClass1KK r13, C128516Co r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, AnonymousClass004 r19, AnonymousClass004 r20) {
        super(r12, r15, r16, r17, r18, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", r19, r20, 4761338647311214L);
        this.A01 = r13;
        this.A00 = r14;
    }
}
