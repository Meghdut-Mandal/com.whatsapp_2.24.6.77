package X;

/* renamed from: X.6Dc  reason: invalid class name and case insensitive filesystem */
public final class C128656Dc {
    public final C123005vm A00;
    public final C135086c7 A01;
    public final C135086c7 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C128656Dc(C123005vm r2, C135086c7 r3, C135086c7 r4, String str, String str2, String str3, String str4) {
        C36421kH.A1J(r2, 1, str4);
        this.A00 = r2;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A02 = r3;
        this.A01 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128656Dc) {
                C128656Dc r5 = (C128656Dc) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A06, C36381kD.A08(this.A04, C36381kD.A08(this.A05, C36381kD.A08(this.A03, C36391kE.A0A(this.A00))))) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EffectParam(arEngineEffect=");
        A0u.append(this.A00);
        A0u.append(", maskId=");
        A0u.append(this.A03);
        A0u.append(", maskName=");
        A0u.append(this.A05);
        A0u.append(", maskInstanceId=");
        A0u.append(this.A04);
        A0u.append(", productSessionId=");
        A0u.append(this.A06);
        A0u.append(", fbId=");
        A0u.append(this.A02);
        A0u.append(", accessToken=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
