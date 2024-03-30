package X;

import java.util.UUID;

/* renamed from: X.886  reason: invalid class name */
public final class AnonymousClass886 extends C53062qe {
    public final AnonymousClass95H A00;
    public final UUID A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass886) {
                AnonymousClass886 r5 = (AnonymousClass886) obj;
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

    public AnonymousClass886(AnonymousClass95H r1, UUID uuid) {
        this.A01 = uuid;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedDeviceConnectionStatus(uuid=");
        A0u.append(this.A01);
        A0u.append(", connectionStatus=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
