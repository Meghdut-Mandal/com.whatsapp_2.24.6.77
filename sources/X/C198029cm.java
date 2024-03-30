package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.9cm  reason: invalid class name and case insensitive filesystem */
public final class C198029cm {
    public static final C22760AvV A05 = new C207969xQ();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C200089ga A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new AnonymousClass008();

    public C198029cm(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i = Integer.MIN_VALUE;
        C200089ga r3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C200089ga r1 = (C200089ga) list3.get(i2);
            if (r1.A04 > i) {
                i = r1.A04;
                r3 = r1;
            }
        }
        this.A01 = r3;
    }
}
