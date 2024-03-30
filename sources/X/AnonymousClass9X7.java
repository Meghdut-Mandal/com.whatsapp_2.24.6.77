package X;

/* renamed from: X.9X7  reason: invalid class name */
public final class AnonymousClass9X7 {
    public final AnonymousClass9VU A00;
    public final C61243Bc A01;
    public final C61243Bc A02;
    public final C61243Bc A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9X7) {
                AnonymousClass9X7 r5 = (AnonymousClass9X7) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36351kA.A05(this.A00, (((C36421kH.A04(this.A04) + 1237) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31))));
    }

    public AnonymousClass9X7(AnonymousClass9VU r1, C61243Bc r2, C61243Bc r3, C61243Bc r4, String str, boolean z) {
        this.A04 = str;
        this.A05 = z;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PostcodeChangeBottomSheetUiState(postcode=");
        A0u.append(this.A04);
        C90474aD.A1N(A0u, ", selectAllText=");
        A0u.append(", hasError=");
        A0u.append(this.A05);
        A0u.append(", privacyMessage=");
        A0u.append(this.A00);
        A0u.append(", headerText=");
        A0u.append(this.A02);
        A0u.append(", messageText=");
        A0u.append(this.A03);
        A0u.append(", errorText=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
