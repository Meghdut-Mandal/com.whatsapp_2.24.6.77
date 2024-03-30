package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.9gI  reason: invalid class name and case insensitive filesystem */
public final class C199939gI {
    public final C203399nx A00;
    public final C186018vH A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass9JF A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199939gI) {
                C199939gI r5 = (C199939gI) obj;
                if (!AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A03, C36391kE.A0A(this.A06)) + C36341k9.A09(this.A05);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\n        |---- Request Info ------------------------------\n        |IqId: ");
        A0u.append(this.A03);
        A0u.append("\n        |persistedId: ");
        A0u.append(this.A05);
        A0u.append("\n        |operationName: ");
        A0u.append(this.A06.A02);
        A0u.append("");
        return AnonymousClass091.A02(AnonymousClass000.A0q("\n        |------------------------------------------------\n      ", A0u));
    }

    public C199939gI(AnonymousClass9JF r5, String str, String str2) {
        C185648uZ r1;
        this.A06 = r5;
        this.A03 = str;
        this.A05 = str2;
        this.A02 = str2;
        C1691584f r2 = r5.A00.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(r2.A00, r2, treeMap);
        JSONObject jSONObject = new JSONObject(treeMap);
        String str3 = str2;
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("queryId", str2 == null ? "" : str3);
        A1B.put("variables", jSONObject);
        String A0y = C36381kD.A0y(A1B);
        if (str2 != null) {
            r1 = new C185648uZ(str2, 27);
        } else {
            r1 = null;
        }
        C186018vH r0 = new C186018vH(r1, str, str2, A0y);
        this.A01 = r0;
        C203399nx r02 = r0.A00;
        AnonymousClass00C.A08(r02);
        this.A00 = r02;
        String str4 = r5.A02;
        AnonymousClass00C.A08(str4);
        this.A04 = str4;
    }

    public C199939gI() {
        this(AnonymousClass99l.A00, "", (String) null);
    }
}
