package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.3II  reason: invalid class name */
public final class AnonymousClass3II {
    public final UserJid A00;
    public final JSONObject A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3II) {
                AnonymousClass3II r5 = (AnonymousClass3II) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass3II(UserJid userJid, JSONObject jSONObject) {
        C36321k7.A0x(userJid, jSONObject);
        this.A00 = userJid;
        this.A01 = jSONObject;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CtwaTrustSignalInfo(jid=");
        A0u.append(this.A00);
        A0u.append(", data=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
