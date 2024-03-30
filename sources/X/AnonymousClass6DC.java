package X;

import java.util.List;

/* renamed from: X.6DC  reason: invalid class name */
public final class AnonymousClass6DC {
    public final C128696Dg A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DC) {
                AnonymousClass6DC r5 = (AnonymousClass6DC) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A03, C36381kD.A08(this.A01, C36351kA.A05(this.A00, C36381kD.A08(this.A02, C36381kD.A08(this.A05, C36421kH.A04(this.A04)))))) + 1231;
    }

    public AnonymousClass6DC(C128696Dg r1, String str, String str2, String str3, String str4, List list) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A00 = r1;
        this.A01 = str4;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeMask(identifier=");
        C90494aF.A1N(A0u, "");
        A0u.append(this.A05);
        A0u.append(", requiredSdkVersion=");
        A0u.append(this.A02);
        A0u.append(", packagedFile=");
        A0u.append(this.A00);
        A0u.append(", manifestJson=");
        A0u.append(this.A01);
        A0u.append(", capabilitiesMinVersionModels=");
        A0u.append(this.A03);
        A0u.append(", isPersonalizedAvatar=");
        return C36321k7.A0H(A0u, true);
    }
}
