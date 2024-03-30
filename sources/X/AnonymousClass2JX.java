package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2JX  reason: invalid class name */
public final class AnonymousClass2JX extends AnonymousClass3PH {
    public C51492nu A01(int i) {
        if (i == 8 || i == 21) {
            return C51492nu.NO_PREFERENCE;
        }
        if (i == 32 || i == 33) {
            return C51492nu.TOP_LEVEL;
        }
        return super.A01(i);
    }

    public List A02() {
        List A02 = super.A02();
        Integer[] numArr = new Integer[6];
        AnonymousClass000.A1J(numArr, 1);
        AnonymousClass000.A1L(numArr, 33, 1);
        C36331k8.A1V(numArr, 32);
        C36341k9.A1T(numArr, 21);
        C36341k9.A1U(numArr, 5);
        AnonymousClass000.A1L(numArr, 8, 5);
        List asList = Arrays.asList(numArr);
        ArrayList A13 = C36411kG.A13(asList);
        for (Object next : A02) {
            C36391kE.A1V(next, A13, asList.contains(Integer.valueOf(AnonymousClass000.A0I(next))) ? 1 : 0);
        }
        return C007103b.A0S(A13, asList);
    }
}
