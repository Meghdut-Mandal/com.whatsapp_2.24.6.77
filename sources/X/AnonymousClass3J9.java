package X;

/* renamed from: X.3J9  reason: invalid class name */
public final class AnonymousClass3J9 {
    public final int A00;
    public final AnonymousClass4T9 A01;
    public final C21667AUj A02;

    public AnonymousClass3J9(AnonymousClass4T9 r2, C21667AUj aUj, int i) {
        AnonymousClass00C.A0D(aUj, 2);
        this.A00 = i;
        this.A02 = aUj;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J9) {
                AnonymousClass3J9 r5 = (AnonymousClass3J9) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AlertBannerConfiguration(count=");
        A0u.append(this.A00);
        A0u.append(", alert=");
        A0u.append(this.A02);
        A0u.append(", onAlertClickListener=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
