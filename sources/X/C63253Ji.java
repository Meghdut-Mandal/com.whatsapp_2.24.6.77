package X;

/* renamed from: X.3Ji  reason: invalid class name and case insensitive filesystem */
public final class C63253Ji {
    public final AnonymousClass1RY A00;
    public final AnonymousClass141 A01;
    public final C006302t A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63253Ji) {
                C63253Ji r5 = (C63253Ji) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A01);
        return C36401kF.A02(this.A00, (C36351kA.A05(this.A02, A0A) + C36341k9.A01(this.A03 ? 1 : 0)) * 31);
    }

    public C63253Ji(AnonymousClass1RY r2, AnonymousClass141 r3, C006302t r4, boolean z) {
        C36321k7.A0x(r3, r4);
        AnonymousClass00C.A0D(r2, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(contact=");
        A0u.append(this.A01);
        A0u.append(", onRemoveClick=");
        A0u.append(this.A02);
        A0u.append(", optionalParticipants=");
        A0u.append(this.A03);
        A0u.append(", contactPhotoLoader=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
