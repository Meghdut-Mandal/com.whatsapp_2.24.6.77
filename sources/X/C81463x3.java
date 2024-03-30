package X;

import java.util.Comparator;

/* renamed from: X.3x3  reason: invalid class name and case insensitive filesystem */
public class C81463x3 implements Comparator {
    public AnonymousClass16D A00;
    public C81783xZ A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C63593Kq r5 = (C63593Kq) obj2;
        AnonymousClass16D r1 = this.A00;
        AnonymousClass141 A08 = r1.A08(((C63593Kq) obj).A06);
        if (A08 == null) {
            return 1;
        }
        AnonymousClass141 A082 = r1.A08(r5.A06);
        if (A082 == null) {
            return -1;
        }
        return this.A01.compare(A08, A082);
    }

    public C81463x3(C19730wQ r3, AnonymousClass16D r4, AnonymousClass171 r5) {
        this.A00 = r4;
        this.A01 = new C81783xZ(r3, r5, 1);
    }
}
