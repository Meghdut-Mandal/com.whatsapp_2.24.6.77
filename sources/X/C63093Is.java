package X;

/* renamed from: X.3Is  reason: invalid class name and case insensitive filesystem */
public final class C63093Is {
    public Integer A00;
    public Integer A01;
    public final C51832oS A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63093Is) {
                C63093Is r5 = (C63093Is) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C63093Is(C51832oS r1, Integer num, Integer num2) {
        this.A02 = r1;
        this.A00 = num;
        this.A01 = num2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AuthResultData(authResult=");
        A0u.append(this.A02);
        A0u.append(", actionEntryPoint=");
        A0u.append(this.A00);
        A0u.append(", authType=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
