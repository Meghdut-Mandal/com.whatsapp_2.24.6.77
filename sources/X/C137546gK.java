package X;

/* renamed from: X.6gK  reason: invalid class name and case insensitive filesystem */
public final class C137546gK implements C161117mD {
    public final int A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((C137546gK) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C137546gK(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AndroidPointerIcon(type=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
