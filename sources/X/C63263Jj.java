package X;

import java.util.List;

/* renamed from: X.3Jj  reason: invalid class name and case insensitive filesystem */
public final class C63263Jj {
    public final long A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63263Jj) {
                C63263Jj r8 = (C63263Jj) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A02);
        return C36341k9.A02(this.A00, (C36351kA.A05(this.A03, A0A) + C36341k9.A09(this.A01)) * 31);
    }

    public C63263Jj(String str, List list, List list2, long j) {
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParsedOtpRetrieverUrl(packageNames=");
        A0u.append(this.A02);
        A0u.append(", signatureHashes=");
        A0u.append(this.A03);
        A0u.append(", ctaDisplayName=");
        A0u.append(this.A01);
        A0u.append(", codeExpirationMinutes=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
