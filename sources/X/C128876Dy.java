package X;

/* renamed from: X.6Dy  reason: invalid class name and case insensitive filesystem */
public final class C128876Dy {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C128876Dy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, long j) {
        AnonymousClass00C.A0D(str5, 7);
        C90474aD.A18(str7, str9);
        this.A01 = j;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A08 = str4;
        this.A02 = str5;
        this.A0A = str6;
        this.A05 = str7;
        this.A09 = str8;
        this.A04 = str9;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128876Dy) {
                C128876Dy r8 = (C128876Dy) obj;
                if (this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A0A, r8.A0A) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A09, r8.A09) || !AnonymousClass00C.A0J(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A07, C36381kD.A08(this.A06, C90464aC.A08(this.A01)));
        return C90504aG.A0B(this.A04, C36381kD.A08(this.A09, C36381kD.A08(this.A05, C36381kD.A08(this.A0A, C36381kD.A08(this.A02, C36381kD.A08(this.A08, (C36381kD.A08(this.A03, A082) + this.A00) * 31))))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BehaviorGraphStateUpdatedInfo(errorCode=");
        A0u.append(this.A01);
        A0u.append(", previousState=");
        A0u.append(this.A06);
        A0u.append(", toState=");
        A0u.append(this.A07);
        A0u.append(", actualCurrentState=");
        A0u.append(this.A03);
        A0u.append(", trigger=");
        A0u.append(this.A00);
        A0u.append(", triggeringAction=");
        A0u.append(this.A08);
        A0u.append(", actualAction=");
        A0u.append(this.A02);
        A0u.append(", triggeringSentiment=");
        A0u.append(this.A0A);
        A0u.append(", actualSentiment=");
        A0u.append(this.A05);
        A0u.append(", triggeringIntensity=");
        A0u.append(this.A09);
        A0u.append(", actualIntensity=");
        return C36321k7.A0E(this.A04, A0u);
    }
}
