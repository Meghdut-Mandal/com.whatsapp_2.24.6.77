package X;

/* renamed from: X.3Q2  reason: invalid class name */
public final class AnonymousClass3Q2 {
    public final C51852oU A00;
    public final C51232nU A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q2) {
                AnonymousClass3Q2 r5 = (AnonymousClass3Q2) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C51852oU r3, AnonymousClass3Q2 r4, Object obj, AnonymousClass05L r6) {
        return r6.B3B(obj, new AnonymousClass3Q2(r3, r4.A01, r4.A02));
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36341k9.A09(this.A02) * 31));
    }

    public AnonymousClass3Q2(C51852oU r1, C51232nU r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallLinkUIState(linkText=");
        A0u.append(this.A02);
        A0u.append(", callLinkType=");
        A0u.append(this.A01);
        A0u.append(", state=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public AnonymousClass3Q2() {
        this(C51852oU.NONE, C51232nU.WA_VIDEO_CALL, (String) null);
    }
}
