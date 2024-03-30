package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2vB  reason: invalid class name and case insensitive filesystem */
public abstract class C55782vB {
    public static String A00(C18820ts r9, List list, boolean z) {
        int i;
        Object[] objArr;
        Object obj;
        int i2;
        Object[] objArr2;
        Object obj2;
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return r9.A0G(C36401kF.A0s(list, 0));
        }
        if (size != 2) {
            Object[] objArr3 = new Object[2];
            C36411kG.A1H(r9, C36401kF.A0s(list, 0), objArr3, 0);
            C36411kG.A1H(r9, C36401kF.A0s(list, 1), objArr3, 1);
            String A0C = r9.A0C(236, objArr3);
            for (int i3 = 2; i3 < C36421kH.A06(list, 1); i3++) {
                Object[] objArr4 = new Object[2];
                objArr4[0] = A0C;
                C36411kG.A1H(r9, C36401kF.A0s(list, i3), objArr4, 1);
                A0C = r9.A0C(235, objArr4);
            }
            if (z) {
                i2 = 234;
                objArr2 = new Object[2];
                objArr2[0] = A0C;
                obj2 = list.get(size - 1);
            } else {
                i = R.string.f12nameremoved;
                objArr = new Object[2];
                objArr[0] = A0C;
                obj = list.get(size - 1);
                C36411kG.A1H(r9, (String) obj, objArr, 1);
                return r9.A0D(i, objArr);
            }
        } else if (z) {
            i2 = 237;
            objArr2 = new Object[2];
            C36411kG.A1H(r9, C36401kF.A0s(list, 0), objArr2, 0);
            obj2 = list.get(1);
        } else {
            i = R.string.f12nameremoved;
            objArr = new Object[2];
            C36411kG.A1H(r9, C36401kF.A0s(list, 0), objArr, 0);
            obj = list.get(1);
            C36411kG.A1H(r9, (String) obj, objArr, 1);
            return r9.A0D(i, objArr);
        }
        C36411kG.A1H(r9, (String) obj2, objArr2, 1);
        return r9.A0C(i2, objArr2);
    }
}
