package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.03T  reason: invalid class name */
public abstract class AnonymousClass03T extends AnonymousClass03S {
    public static final int A01(Comparable comparable, List list, int i) {
        int i2 = 0;
        int size = list.size();
        if (0 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex (");
            sb.append(0);
            sb.append(") is greater than toIndex (");
            sb.append(i);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= size) {
            int i3 = i - 1;
            while (i2 <= i3) {
                int i4 = (i2 + i3) >>> 1;
                int A00 = C05590Qh.A00((Comparable) list.get(i4), comparable);
                if (A00 < 0) {
                    i2 = i4 + 1;
                } else if (A00 <= 0) {
                    return i4;
                } else {
                    i3 = i4 - 1;
                }
            }
            return -(i2 + 1);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toIndex (");
            sb2.append(i);
            sb2.append(") is greater than size (");
            sb2.append(size);
            sb2.append(").");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public static final ArrayList A02(Object... objArr) {
        return new ArrayList(new AnonymousClass0CN(objArr, true));
    }

    public static final ArrayList A03(Object... objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new AnonymousClass0CN(objArr, true));
    }

    public static final void A04() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A05() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
