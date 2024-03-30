package X;

import java.util.Arrays;

/* renamed from: X.6DJ  reason: invalid class name */
public class AnonymousClass6DJ {
    public int A00;
    public int A01;
    public AnonymousClass5SJ A02;
    public String A03;
    public String A04;
    public String A05;

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        AnonymousClass000.A1K(objArr, this.A01);
        C36331k8.A1V(objArr, this.A00);
        C36341k9.A1T(objArr, 0);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass6DJ)) {
            return false;
        }
        AnonymousClass6DJ r4 = (AnonymousClass6DJ) obj;
        if (this.A02 == r4.A02 && r4.A01 == this.A01 && r4.A00 == this.A00) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ResumeCheck.Result type=");
        A0u.append(this.A02);
        A0u.append(", resume=");
        A0u.append(this.A01);
        A0u.append(", error=");
        A0u.append(this.A00);
        A0u.append(", message=");
        A0u.append(this.A04);
        C90514aH.A1S(A0u, ", backoff=");
        return C90474aD.A0g(A0u);
    }
}
