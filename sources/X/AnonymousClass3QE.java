package X;

import java.util.Set;

/* renamed from: X.3QE  reason: invalid class name */
public final class AnonymousClass3QE {
    public final String A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QE) {
                AnonymousClass3QE r5 = (AnonymousClass3QE) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A02, C36351kA.A05(this.A03, C36391kE.A0A(this.A01))) + C36341k9.A09(this.A00);
    }

    public AnonymousClass3QE(String str, Set set, Set set2, Set set3) {
        this.A01 = set;
        this.A03 = set2;
        this.A02 = set3;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PackageNameMatchingResult(allPackageNames=");
        A0u.append(this.A01);
        A0u.append(", packageNamesWithOtpRequest=");
        A0u.append(this.A03);
        A0u.append(", packageNamesWithActiveOtpRequest=");
        A0u.append(this.A02);
        A0u.append(", matchedPackageName=");
        return C36321k7.A0E(this.A00, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3QE() {
        /*
            r2 = this;
            r1 = 0
            X.02c r0 = X.C004702c.A00
            r2.<init>(r1, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QE.<init>():void");
    }
}
