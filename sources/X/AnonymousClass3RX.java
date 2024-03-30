package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3RX  reason: invalid class name */
public abstract class AnonymousClass3RX {
    public static final Map A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final List A06;
    public static final List A07;
    public static final List A08;
    public static final Map A09;

    static {
        List A11 = C36371kC.A11(1);
        A08 = A11;
        Integer[] numArr = new Integer[3];
        numArr[0] = 100;
        numArr[1] = 150;
        List A0m = C36341k9.A0m(999, numArr, 2);
        A06 = A0m;
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 110;
        numArr2[1] = 120;
        numArr2[2] = 150;
        List A0m2 = C36341k9.A0m(999, numArr2, 3);
        A07 = A0m2;
        Integer[] numArr3 = new Integer[5];
        numArr3[0] = 120;
        numArr3[1] = 130;
        numArr3[2] = 150;
        numArr3[3] = 170;
        List A0m3 = C36341k9.A0m(999, numArr3, 4);
        A02 = A0m3;
        List A0b = C007103b.A0b(A0m3, 120);
        A01 = A0b;
        Integer[] numArr4 = new Integer[3];
        numArr4[0] = 170;
        numArr4[1] = 150;
        List A0m4 = C36341k9.A0m(999, numArr4, 2);
        A05 = A0m4;
        Integer[] numArr5 = new Integer[2];
        numArr5[0] = 170;
        List A0m5 = C36341k9.A0m(999, numArr5, 1);
        A03 = A0m5;
        List A112 = C36371kC.A11(999);
        A04 = A112;
        AnonymousClass011[] r15 = new AnonymousClass011[2];
        C36341k9.A1J((Object) null, A11, r15, 0);
        C36341k9.A1J(1, A0m, r15, 1);
        A09 = C000400e.A07(r15);
        AnonymousClass011[] r1 = new AnonymousClass011[6];
        C36341k9.A1J(100, A0m2, r1, 0);
        C36341k9.A1J(110, A0m3, r1, 1);
        r1[2] = C36441kJ.A19(120, A0b);
        r1[3] = C36441kJ.A19(130, A0m4);
        r1[4] = C36441kJ.A19(150, A0m5);
        r1[5] = C36441kJ.A19(170, A112);
        A00 = C000400e.A07(r1);
    }

    public static final boolean A01(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return false;
        }
        Map map = A09;
        if (!map.containsKey(num2)) {
            map = A00;
            if (!map.containsKey(num2)) {
                return false;
            }
        } else if (!map.containsKey(num)) {
            return A00.containsKey(num);
        }
        List list = (List) map.get(num2);
        if (list != null) {
            return list.contains(num);
        }
        return false;
    }

    public static final Integer A00(int i) {
        if (i == 0) {
            return C36381kD.A0m();
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 100;
            if (i != 100) {
                i2 = 110;
                if (i != 110) {
                    i2 = 120;
                    if (i != 120) {
                        i2 = 130;
                        if (i != 130) {
                            i2 = 150;
                            if (!(i == 150 || i == 170)) {
                                i2 = 999;
                                if (i != 999) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
