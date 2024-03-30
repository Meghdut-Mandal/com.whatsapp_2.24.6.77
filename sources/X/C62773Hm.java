package X;

/* renamed from: X.3Hm  reason: invalid class name and case insensitive filesystem */
public final class C62773Hm {
    public final AnonymousClass4QR A00;
    public final C61243Bc A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62773Hm) {
                C62773Hm r5 = (C62773Hm) obj;
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

    public C62773Hm(AnonymousClass4QR r1, C61243Bc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LGCCallConfirmationSheetUiState(titleStringProvider=");
        A0u.append(this.A01);
        A0u.append(", buttonDrawableProvider=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
