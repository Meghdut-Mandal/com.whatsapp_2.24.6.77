package X;

import java.util.Comparator;

/* renamed from: X.3x0  reason: invalid class name and case insensitive filesystem */
public class C81433x0 implements Comparator {
    public final AnonymousClass16D A00;
    public final AnonymousClass171 A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass16D r1 = this.A00;
        AnonymousClass141 A0D = r1.A0D(((C107255Nf) obj).A00);
        AnonymousClass141 A0D2 = r1.A0D(((C107255Nf) obj2).A00);
        AnonymousClass3IL r4 = A0D.A0F;
        boolean z = false;
        boolean A1V = AnonymousClass000.A1V(r4);
        if (A0D2.A0F != null) {
            z = true;
        }
        if (A1V == z) {
            AnonymousClass171 r0 = this.A01;
            String A0H = r0.A0H(A0D);
            String A0H2 = r0.A0H(A0D2);
            if (A0H == null) {
                return -1;
            }
            if (A0H2 != null) {
                return A0H.compareTo(A0H2);
            }
            return 1;
        } else if (r4 != null) {
            return -1;
        } else {
            return 1;
        }
    }

    public C81433x0(AnonymousClass16D r1, AnonymousClass171 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
