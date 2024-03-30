package X;

import android.net.Uri;

/* renamed from: X.3Jv  reason: invalid class name and case insensitive filesystem */
public final class C63383Jv {
    public final Uri A00;
    public final C223313w A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63383Jv) {
                C63383Jv r5 = (C63383Jv) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public C63383Jv(Uri uri, C223313w r2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoneNumberRequestData(jid=");
        A0u.append(this.A01);
        A0u.append(", learnMoreUri=");
        A0u.append(this.A00);
        A0u.append(", isPhoneNumberKnown=");
        A0u.append(this.A03);
        A0u.append(", isMyPhoneNumberShared=");
        A0u.append(this.A02);
        A0u.append(", wasPhoneNumberRequested=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
