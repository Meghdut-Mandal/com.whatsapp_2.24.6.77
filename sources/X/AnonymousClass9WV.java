package X;

import java.util.Arrays;

/* renamed from: X.9WV  reason: invalid class name */
public class AnonymousClass9WV {
    public final int A00;
    public final C22865AxK A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        String str;
        String str2;
        Object obj2;
        Object obj3;
        String str3;
        String str4;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass9WV r5 = (AnonymousClass9WV) obj;
                if (this.A00 != r5.A00 || (((str = this.A02) != (str2 = r5.A02) && (str == null || !str.equals(str2))) || (((obj2 = this.A01.get()) != (obj3 = r5.A01.get()) && (obj2 == null || !obj2.equals(obj3))) || ((str3 = this.A03) != (str4 = r5.A03) && (str3 == null || !str3.equals(str4)))))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = C36381kD.A0j();
        C36341k9.A1T(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass9WV(AnonymousClass9LH r3) {
        this.A02 = r3.A01;
        this.A03 = r3.A02;
        this.A00 = r3.A00;
        this.A01 = new C20960A0t(new C20959A0s(r3));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SoftError{mCategory='");
        A0u.append(this.A02);
        A0u.append('\'');
        A0u.append(", mMessage='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", mCause=");
        A0u.append(this.A01.get());
        C90474aD.A1N(A0u, ", mFailHarder=");
        A0u.append(", mSamplingFrequency=");
        A0u.append(this.A00);
        C90474aD.A1N(A0u, ", mOnlyIfEmployeeOrBetaBuild=");
        return AnonymousClass000.A0s(A0u);
    }
}
