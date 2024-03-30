package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.3KL  reason: invalid class name */
public class AnonymousClass3KL {
    public ContentValues A00 = C36441kJ.A0E();
    public String A01 = "";
    public String A02 = "";
    public List A03 = AnonymousClass001.A0I();
    public Set A04 = C36441kJ.A16();
    public Set A05 = C36441kJ.A16();
    public byte[] A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3KL)) {
            return false;
        }
        AnonymousClass3KL r6 = (AnonymousClass3KL) obj;
        String str = this.A01;
        if (str == null || !str.equals(r6.A01) || !this.A00.equals(r6.A00) || !this.A04.equals(r6.A04) || !this.A05.equals(r6.A05)) {
            return false;
        }
        byte[] bArr = this.A06;
        if (bArr != null && Arrays.equals(bArr, r6.A06)) {
            return true;
        }
        if (!this.A02.equals(r6.A02)) {
            return false;
        }
        List list = this.A03;
        List list2 = r6.A03;
        if (list.equals(list2) || list.size() == 1 || list2.size() == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A06;
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        if (obj == null) {
            return AnonymousClass000.A0M(this.A02, objArr, 4);
        }
        objArr[4] = obj;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("propName: ");
        A0u.append(this.A01);
        A0u.append(", paramMap: ");
        C36351kA.A1K(this.A00, A0u);
        A0u.append(", propmMap_TYPE: ");
        C36351kA.A1K(this.A04, A0u);
        A0u.append(", propGroupSet: ");
        C36351kA.A1K(this.A05, A0u);
        List list = this.A03;
        if (list.size() > 1) {
            C36371kC.A1R(", propValue_vector size: ", A0u, list);
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A0u.append(", propValue_bytes size: ");
            A0u.append(bArr.length);
        }
        A0u.append(", propValue: ");
        return AnonymousClass000.A0q(this.A02, A0u);
    }
}
