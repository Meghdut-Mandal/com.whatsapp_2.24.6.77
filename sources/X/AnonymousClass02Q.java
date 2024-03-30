package X;

import java.util.Arrays;

/* renamed from: X.02Q  reason: invalid class name */
public abstract class AnonymousClass02Q extends AnonymousClass02P {
    public static final void A03(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AnonymousClass00C.A0D(iArr, 0);
        AnonymousClass00C.A0D(iArr2, 1);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void A04(Object[] objArr, int i, int i2) {
        AnonymousClass00C.A0D(objArr, 0);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static final void A05(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        AnonymousClass00C.A0D(objArr, 0);
        AnonymousClass00C.A0D(objArr2, 1);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final Object[] A06(Object[] objArr, Object[] objArr2) {
        AnonymousClass00C.A0D(objArr, 0);
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        AnonymousClass00C.A0B(copyOf);
        return copyOf;
    }
}
