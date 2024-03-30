package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.3Md  reason: invalid class name and case insensitive filesystem */
public abstract class C63973Md {
    public static final int[][] A00 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};

    public static final float[] A00(float[] fArr, int i, int i2) {
        int i3;
        int i4;
        Object next;
        Number number;
        float[] fArr2 = fArr;
        HashMap A0J = AnonymousClass001.A0J();
        int length = fArr2.length;
        int[] iArr = new int[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i5 >= i4) {
                break;
            }
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i5 * i) + i7;
                if (!zArr[i8]) {
                    float f = 0.0f;
                    if (fArr2[i8] != 0.0f) {
                        Stack stack = new Stack();
                        AnonymousClass000.A1F(stack, i8);
                        i6++;
                        while (C36411kG.A1a(stack)) {
                            int A07 = C36411kG.A07((Number) stack.pop());
                            if (A07 < 0 || A07 >= length || zArr[A07] || fArr2[A07] == f) {
                                f = 0.0f;
                            } else {
                                zArr[A07] = true;
                                iArr[A07] = i6;
                                Number A10 = C36441kJ.A10(Integer.valueOf(i6), A0J);
                                if (A10 == null) {
                                    A10 = 0;
                                }
                                C36341k9.A1K(Integer.valueOf(i6), A0J, A10.intValue() + 1);
                                int[][] iArr2 = A00;
                                int i9 = 0;
                                do {
                                    int[] iArr3 = iArr2[i9];
                                    stack.push(Integer.valueOf((((A07 / i) + iArr3[0]) * i) + (A07 % i) + iArr3[1]));
                                    i9++;
                                } while (i9 < 4);
                                f = 0.0f;
                            }
                        }
                    }
                }
            }
            i5++;
        }
        Set entrySet = A0J.entrySet();
        AnonymousClass00C.A08(entrySet);
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Object value = ((Map.Entry) next).getValue();
                AnonymousClass00C.A08(value);
                int A0I = AnonymousClass000.A0I(value);
                do {
                    Object next2 = it.next();
                    Object value2 = ((Map.Entry) next2).getValue();
                    AnonymousClass00C.A08(value2);
                    int A0I2 = AnonymousClass000.A0I(value2);
                    if (A0I < A0I2) {
                        next = next2;
                        A0I = A0I2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (!(entry == null || (number = (Number) entry.getKey()) == null)) {
            int intValue = number.intValue();
            fArr2 = new float[length];
            for (int i10 = 0; i10 < i4; i10++) {
                for (int i11 = 0; i11 < i3; i11++) {
                    int i12 = (i10 * i) + i11;
                    if (iArr[i12] == intValue) {
                        fArr2[i12] = 1.0f;
                    }
                }
            }
        }
        return fArr2;
    }
}
