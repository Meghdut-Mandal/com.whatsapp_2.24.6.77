package X;

/* renamed from: X.6PE  reason: invalid class name */
public final class AnonymousClass6PE {
    public static final C125365zn A03 = new C125365zn();
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PE) {
                AnonymousClass6PE r5 = (AnonymousClass6PE) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public AnonymousClass6PE(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenShareInfo(width=");
        A0u.append(this.A02);
        A0u.append(", height=");
        A0u.append(this.A01);
        A0u.append(", dpi=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
