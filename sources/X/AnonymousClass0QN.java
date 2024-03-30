package X;

/* renamed from: X.0QN  reason: invalid class name */
public abstract class AnonymousClass0QN {
    public static boolean A00(Object obj, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!AnonymousClass0QM.A00(objArr[i], obj)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
