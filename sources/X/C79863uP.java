package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.3uP  reason: invalid class name and case insensitive filesystem */
public final class C79863uP implements B0B {
    public C220412q A00;

    public C79863uP(C220412q r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean B1C(C193229Kn r7, C16540pP r8, C87374On r9) {
        AnonymousClass3JN r0;
        AnonymousClass00C.A0D(r9, 0);
        ArrayList A0I = AnonymousClass001.A0I();
        C592233c r02 = ((C21642ATi) r9).A06;
        if (r02 != null) {
            Map map = r02.A00;
            if (map.get("wa_push_psa_recently_joined_contacts_wids") != null) {
                JSONArray jSONArray = new JSONArray(C36431kI.A1A("wa_push_psa_recently_joined_contacts_wids", map));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
                    UserJid A0l = C36431kI.A0l((String) obj);
                    if (A0l != null && !this.A00.A0M(A0l)) {
                        A0I.add(A0l);
                    }
                }
                if ((r8 instanceof C79853uO) && (r0 = ((C79853uO) r8).A00) != null) {
                    r0.A00 = A0I;
                }
                return C36411kG.A1a(A0I);
            }
        }
        return false;
    }
}
