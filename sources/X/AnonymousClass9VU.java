package X;

import com.whatsapp.R;

/* renamed from: X.9VU  reason: invalid class name */
public final class AnonymousClass9VU {
    public final C61243Bc A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VU) {
                AnonymousClass9VU r5 = (AnonymousClass9VU) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass9VU(C61243Bc r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36381kD.A08(this.A01, 1664009291));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrivacyMessage(templateRes=");
        A0u.append(R.string.f12nameremoved);
        A0u.append(", businessName=");
        A0u.append(this.A01);
        A0u.append(", postcodeType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
