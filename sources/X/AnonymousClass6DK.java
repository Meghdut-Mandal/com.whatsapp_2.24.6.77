package X;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.6DK  reason: invalid class name */
public final class AnonymousClass6DK {
    public final int A00;
    public final String A01;
    public final ArrayList A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DK) {
                AnonymousClass6DK r5 = (AnonymousClass6DK) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A00 != r5.A00 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((C36391kE.A0A(this.A02) + C36341k9.A09(this.A04)) * 31) + this.A00) * 31) + this.A03) * 31) + C36341k9.A09(this.A05)) * 31) + C36421kH.A05(this.A01);
    }

    public AnonymousClass6DK(String str, String str2, String str3, ArrayList arrayList, int i, int i2) {
        this.A02 = arrayList;
        this.A04 = str;
        this.A00 = i;
        this.A03 = i2;
        this.A05 = str2;
        this.A01 = str3;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A04;
        C36331k8.A1V(objArr, this.A00);
        C36341k9.A1T(objArr, this.A03);
        objArr[4] = this.A05;
        return C90494aF.A0e(locale, "MLModelMetadataGraphqlResponse: models=%s entryPoint=%s assetCount=%d modelCount=%d status=%s statusDetails=%s", C90524aI.A0x(this.A01, objArr, 5, 6));
    }
}
