package X;

import java.util.Collection;
import java.util.Objects;

/* renamed from: X.6Gg  reason: invalid class name and case insensitive filesystem */
public abstract class C129276Gg {
    public static int A00(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] A01(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = AnonymousClass000.A0I(obj);
        }
        return iArr;
    }
}
