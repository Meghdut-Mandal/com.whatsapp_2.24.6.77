package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6RF  reason: invalid class name */
public abstract class AnonymousClass6RF {
    public static final AnonymousClass72L A00;

    public static final List A00(List list, int i, int i2) {
        if (i <= i2) {
            if (list != null) {
                ArrayList A0r = C36361kB.A0r(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = list.get(i3);
                    C128326Bu.A00((C128326Bu) obj, obj, A0r, i, i2);
                }
                ArrayList A0v = C36401kF.A0v(A0r);
                int size2 = A0r.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C128326Bu r1 = (C128326Bu) A0r.get(i4);
                    A0v.add(new C128326Bu(r1.A02, r1.A03, Math.max(i, r1.A01) - i, Math.min(i2, r1.A00) - i));
                }
                if (!A0v.isEmpty()) {
                    return A0v;
                }
            }
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("start (");
        A0u.append(i);
        A0u.append(") should be less than or equal to end (");
        throw AnonymousClass001.A08(C36321k7.A0G(A0u, i2));
    }

    static {
        C023409w r1 = C023409w.A00;
        A00 = new AnonymousClass72L("", r1, r1);
    }

    public static final boolean A01(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i <= i3 && i4 <= i2 && (i2 != i4 || AnonymousClass000.A1S(i3, i4) == AnonymousClass000.A1S(i, i2))) {
            return true;
        }
        if (i3 > i || i2 > i4) {
            return false;
        }
        if (i4 != i2 || AnonymousClass000.A1S(i, i2) == AnonymousClass000.A1S(i3, i4)) {
            return true;
        }
        return false;
    }
}
