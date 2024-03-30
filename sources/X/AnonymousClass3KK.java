package X;

import java.util.List;

/* renamed from: X.3KK  reason: invalid class name */
public final class AnonymousClass3KK {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KK) {
                AnonymousClass3KK r5 = (AnonymousClass3KK) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((C36341k9.A09(this.A02) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A01)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass3KK(Integer num, String str, String str2, String str3, String str4, String str5, List list) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A01 = str5;
        this.A05 = list;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NTACompletionResult(phoneNumber=");
        A0u.append(this.A02);
        A0u.append(", profilePictureUrl=");
        A0u.append(this.A04);
        A0u.append(", profileName=");
        A0u.append(this.A03);
        A0u.append(", authBlob=");
        A0u.append(this.A06);
        A0u.append(", ntaError=");
        A0u.append(this.A01);
        A0u.append(", opaqueTargetAccounts=");
        A0u.append(this.A05);
        A0u.append(", disclosureId=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
