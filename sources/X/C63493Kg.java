package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.3Kg  reason: invalid class name and case insensitive filesystem */
public final class C63493Kg {
    public final long A00;
    public final C51102nH A01;
    public final UserJid A02;
    public final C51272nY A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63493Kg) {
                C63493Kg r8 = (C63493Kg) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r8.A02) && this.A03 == r8.A03 && this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A01, C36351kA.A05(this.A03, C36391kE.A0A(this.A02))));
    }

    public C63493Kg(C51272nY r1, C51102nH r2, UserJid userJid, long j) {
        C36321k7.A0z(r1, r2);
        this.A02 = userJid;
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = j;
    }

    public final JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("business_jid", this.A02.getRawString());
        A1B.put("business_type", this.A03.toString());
        A1B.put("conversion_event_type", this.A01.toString());
        A1B.put("conversion_event_timestamp", this.A00);
        return A1B;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SurveyConversionInfo(businessJid=");
        A0u.append(this.A02);
        A0u.append(", businessType=");
        A0u.append(this.A03);
        A0u.append(", conversionEventType=");
        A0u.append(this.A01);
        A0u.append(", conversionEventTimestamp=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
