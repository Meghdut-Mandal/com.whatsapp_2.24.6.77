package X;

import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import java.util.UUID;

/* renamed from: X.887  reason: invalid class name */
public final class AnonymousClass887 extends C53062qe {
    public final PrivateKey A00;
    public final PublicKey A01;
    public final UUID A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass887) {
                AnonymousClass887 r5 = (AnonymousClass887) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass887(PrivateKey privateKey, PublicKey publicKey, UUID uuid) {
        this.A00 = privateKey;
        this.A01 = publicKey;
        this.A02 = uuid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkSecurity(appKey=");
        byte[] serialize = this.A00.serialize();
        AnonymousClass7XP r1 = AnonymousClass7XP.A00;
        A0u.append(AnonymousClass02R.A0A(r1, serialize));
        A0u.append(", devicePublicKey=");
        A0u.append(AnonymousClass02R.A0A(r1, this.A01.serialize()));
        A0u.append(", serviceUUID=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
