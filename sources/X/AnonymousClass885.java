package X;

import com.facebook.wearable.airshield.security.Hash;

/* renamed from: X.885  reason: invalid class name */
public final class AnonymousClass885 extends C53062qe {
    public final Hash A00;
    public final Hash A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass885) {
                AnonymousClass885 r5 = (AnonymousClass885) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass885(Hash hash, Hash hash2) {
        this.A01 = hash;
        this.A00 = hash2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Challenges(tx=");
        A0u.append(this.A01);
        A0u.append(", rx=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
