package X;

import android.os.ConditionVariable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.3PH  reason: invalid class name */
public class AnonymousClass3PH {
    public final AnonymousClass00T A00 = C36431kI.A1I(new C83744Ao(this));

    public static final int A00(AnonymousClass3PH r1, int i) {
        Number number = (Number) C36371kC.A0r((Map) r1.A00.getValue(), i);
        if (number != null) {
            return number.intValue();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unknown actionId ");
        A0u.append(i);
        throw AnonymousClass000.A0c(". Add it to getSortList().", A0u);
    }

    public List A02() {
        Integer[] numArr = new Integer[36];
        AnonymousClass000.A1J(numArr, 35);
        numArr[1] = 1;
        numArr[2] = 2;
        numArr[3] = 3;
        numArr[4] = 19;
        numArr[5] = 20;
        numArr[6] = 4;
        numArr[7] = 26;
        numArr[8] = 37;
        numArr[9] = 21;
        numArr[10] = 5;
        numArr[11] = 6;
        numArr[12] = 7;
        numArr[13] = 8;
        numArr[14] = 34;
        numArr[15] = 33;
        numArr[16] = 32;
        numArr[17] = 9;
        numArr[18] = 12;
        AnonymousClass000.A1L(numArr, 24, 19);
        C36331k8.A1X(numArr, 25, 20, 17, 21);
        numArr[22] = 18;
        numArr[23] = 10;
        numArr[24] = 11;
        numArr[25] = 13;
        AnonymousClass000.A1L(numArr, 36, 26);
        numArr[27] = 14;
        numArr[28] = 31;
        numArr[29] = 15;
        numArr[30] = 16;
        numArr[31] = 22;
        numArr[32] = 23;
        numArr[33] = 27;
        AnonymousClass000.A1L(numArr, 28, 34);
        AnonymousClass000.A1L(numArr, 30, 35);
        List asList = Arrays.asList(numArr);
        AnonymousClass00C.A08(asList);
        return asList;
    }

    public AnonymousClass3PH() {
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public C51492nu A01(int i) {
        switch (i) {
            case 8:
            case 21:
            case 34:
                return C51492nu.TOP_LEVEL;
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 22:
            case 23:
            case 26:
            case 27:
            case 30:
            case 31:
            case 35:
            case 37:
                return C51492nu.OVERFLOW;
            default:
                return C51492nu.NO_PREFERENCE;
        }
    }
}
