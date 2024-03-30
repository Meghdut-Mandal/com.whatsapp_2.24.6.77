package X;

/* renamed from: X.6AZ  reason: invalid class name */
public final class AnonymousClass6AZ {
    public final C135086c7 A00;
    public final C135086c7 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AZ) {
                AnonymousClass6AZ r5 = (AnonymousClass6AZ) obj;
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

    public AnonymousClass6AZ(C135086c7 r1, C135086c7 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarUserBackup(fbId=");
        A0u.append(this.A00);
        A0u.append(", password=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
