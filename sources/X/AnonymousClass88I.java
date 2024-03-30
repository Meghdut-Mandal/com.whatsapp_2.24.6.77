package X;

import java.util.UUID;

/* renamed from: X.88I  reason: invalid class name */
public final class AnonymousClass88I extends C53062qe {
    public C199069ee A00;
    public final AnonymousClass88C A01;
    public final UUID A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88I) {
                AnonymousClass88I r5 = (AnonymousClass88I) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass88I(C199069ee r1, AnonymousClass88C r2, UUID uuid) {
        this.A00 = r1;
        this.A02 = uuid;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedDeviceWrapper(device=");
        A0u.append(this.A00);
        A0u.append(", appLinkUUID=");
        A0u.append(this.A02);
        A0u.append(", config=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public AnonymousClass88I() {
        this((C199069ee) null, (AnonymousClass88C) null, (UUID) null);
    }
}
