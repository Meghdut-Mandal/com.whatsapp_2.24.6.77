package X;

/* renamed from: X.3Q3  reason: invalid class name */
public final class AnonymousClass3Q3 {
    public final AnonymousClass9QU A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q3) {
                AnonymousClass3Q3 r5 = (AnonymousClass3Q3) obj;
                if (!(this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A01(this.A02 ? 1 : 0) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass3Q3(AnonymousClass9QU r1, boolean z, boolean z2) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusIndicatorViewState(isStatusIndicatorExpanded=");
        A0u.append(this.A02);
        A0u.append(", statusIndicatorState=");
        A0u.append(this.A00);
        A0u.append(", isDoublePressPromptVisible=");
        return C36321k7.A0H(A0u, this.A01);
    }

    public AnonymousClass3Q3() {
        this((AnonymousClass9QU) null, false, false);
    }
}
