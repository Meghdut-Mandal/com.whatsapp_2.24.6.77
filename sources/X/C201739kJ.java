package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C201739kJ {
    public static Object[] copy(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] newArray(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static Set preservesInsertionOrderOnAddsSet() {
        return C21898AcS.create();
    }

    public static Map preservesInsertionOrderOnPutsMap() {
        return C21892AcL.create();
    }
}
