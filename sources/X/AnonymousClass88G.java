package X;

import com.facebook.wearable.airshield.security.Hash;

/* renamed from: X.88G  reason: invalid class name */
public final class AnonymousClass88G extends C53062qe {
    public Hash A00;
    public Hash A01;

    public AnonymousClass88G(Hash hash, Hash hash2) {
        this.A01 = null;
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88G) {
                AnonymousClass88G r5 = (AnonymousClass88G) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A01) * 31) + C36411kG.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PendingEncryptionValues(txChallenge=");
        A0u.append(this.A01);
        A0u.append(", rxChallenge=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public AnonymousClass88G() {
        this((Hash) null, (Hash) null);
    }
}
