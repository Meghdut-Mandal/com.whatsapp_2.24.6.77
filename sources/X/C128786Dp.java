package X;

import java.util.Map;

/* renamed from: X.6Dp  reason: invalid class name and case insensitive filesystem */
public final class C128786Dp {
    public final int A00;
    public final C123405wR A01;
    public final AnonymousClass9XM A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final boolean A06;
    public final C187868yf A07;
    public final String A08;

    public C128786Dp(C187868yf r2, C123405wR r3, AnonymousClass9XM r4, String str, String str2, String str3, Map map, int i, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A06 = z;
        this.A05 = map;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r2;
        this.A08 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128786Dp) {
                C128786Dp r5 = (C128786Dp) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A06 != r5.A06 || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A07 != r5.A07 || !AnonymousClass00C.A0J(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.A04;
        return ((((((C36351kA.A05(this.A05, (C36381kD.A08(str, (C36421kH.A04(this.A03) + this.A00) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A07)) * 31) + C36421kH.A05(this.A08);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FcsStateMachineContextParams(configPrefixedStateName=");
        A0u.append(this.A03);
        A0u.append(", qplInstanceKey=");
        A0u.append(this.A00);
        A0u.append(", fdsManagerId=");
        A0u.append(this.A04);
        A0u.append(", isModalOnScreen=");
        A0u.append(this.A06);
        A0u.append(", initialStateMachineInput=");
        A0u.append(this.A05);
        A0u.append(", presentationConfig=");
        A0u.append(this.A01);
        A0u.append(", phoenixSessionData=");
        A0u.append(this.A02);
        A0u.append(", backNavContext=");
        A0u.append(this.A07);
        A0u.append(", mergerName=");
        return C36321k7.A0E(this.A08, A0u);
    }
}
