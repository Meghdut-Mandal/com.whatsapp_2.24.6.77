package X;

/* renamed from: X.1Aj  reason: invalid class name and case insensitive filesystem */
public abstract class C23921Aj {
    public static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    public static Object[] toArrayImpl(Object[] objArr, int i, int i2, Object[] objArr2) {
        C20740y5.A03(0, i2, objArr.length);
        int length = objArr2.length;
        if (length < i2) {
            objArr2 = newArray(objArr2, i2);
        } else if (length > i2) {
            objArr2[i2] = null;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    public static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] newArray(Object[] objArr, int i) {
        return C201739kJ.newArray(objArr, i);
    }

    public static Object[] checkElementsNotNull(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }
}
