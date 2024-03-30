package X;

/* renamed from: X.3Iy  reason: invalid class name and case insensitive filesystem */
public final class C63153Iy {
    public final AnonymousClass34G A00;
    public final C223313w A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63153Iy) {
                C63153Iy r5 = (C63153Iy) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C63153Iy(AnonymousClass34G r1, C223313w r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactPickerExtraInfo { hasLid: ");
        A0u.append(AnonymousClass000.A1V(this.A01));
        A0u.append(", isBlocked: ");
        A0u.append(this.A02);
        return AnonymousClass000.A0q(" }", A0u);
    }
}
