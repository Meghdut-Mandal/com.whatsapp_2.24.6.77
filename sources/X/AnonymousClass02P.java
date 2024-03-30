package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.02P  reason: invalid class name */
public abstract class AnonymousClass02P extends AnonymousClass02O {
    public static final boolean A02(Object[] objArr, Object[] objArr2) {
        int length;
        boolean equals;
        if (objArr != objArr2) {
            if (!(objArr == null || objArr2 == null || (length = objArr.length) != objArr2.length)) {
                for (int i = 0; i < length; i++) {
                    Object[] objArr3 = objArr[i];
                    Object[] objArr4 = objArr2[i];
                    if (objArr3 != objArr4) {
                        if (!(objArr3 == null || objArr4 == null)) {
                            if ((objArr3 instanceof Object[]) && (objArr4 instanceof Object[])) {
                                equals = A02(objArr3, objArr4);
                            } else if ((objArr3 instanceof byte[]) && (objArr4 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) objArr3, (byte[]) objArr4);
                            } else if ((objArr3 instanceof short[]) && (objArr4 instanceof short[])) {
                                equals = Arrays.equals((short[]) objArr3, (short[]) objArr4);
                            } else if ((objArr3 instanceof int[]) && (objArr4 instanceof int[])) {
                                equals = Arrays.equals((int[]) objArr3, (int[]) objArr4);
                            } else if ((objArr3 instanceof long[]) && (objArr4 instanceof long[])) {
                                equals = Arrays.equals((long[]) objArr3, (long[]) objArr4);
                            } else if ((objArr3 instanceof float[]) && (objArr4 instanceof float[])) {
                                equals = Arrays.equals((float[]) objArr3, (float[]) objArr4);
                            } else if ((objArr3 instanceof double[]) && (objArr4 instanceof double[])) {
                                equals = Arrays.equals((double[]) objArr3, (double[]) objArr4);
                            } else if ((objArr3 instanceof char[]) && (objArr4 instanceof char[])) {
                                equals = Arrays.equals((char[]) objArr3, (char[]) objArr4);
                            } else if (!(objArr3 instanceof boolean[]) || !(objArr4 instanceof boolean[])) {
                                equals = objArr3.equals(objArr4);
                            } else {
                                equals = Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void A01(StringBuilder sb, List list, Object[] objArr) {
        String obj;
        if (list.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr2 = objArr[i];
            if (objArr2 == null) {
                obj = "null";
            } else if (objArr2 instanceof Object[]) {
                A01(sb, list, objArr2);
            } else {
                if (objArr2 instanceof byte[]) {
                    obj = Arrays.toString((byte[]) objArr2);
                } else if (objArr2 instanceof short[]) {
                    obj = Arrays.toString((short[]) objArr2);
                } else if (objArr2 instanceof int[]) {
                    obj = Arrays.toString((int[]) objArr2);
                } else if (objArr2 instanceof long[]) {
                    obj = Arrays.toString((long[]) objArr2);
                } else if (objArr2 instanceof float[]) {
                    obj = Arrays.toString((float[]) objArr2);
                } else if (objArr2 instanceof double[]) {
                    obj = Arrays.toString((double[]) objArr2);
                } else if (objArr2 instanceof char[]) {
                    obj = Arrays.toString((char[]) objArr2);
                } else if (objArr2 instanceof boolean[]) {
                    obj = Arrays.toString((boolean[]) objArr2);
                } else {
                    obj = objArr2.toString();
                }
                AnonymousClass00C.A08(obj);
            }
            sb.append(obj);
        }
        sb.append(']');
        list.remove(list.size() - 1);
    }
}
