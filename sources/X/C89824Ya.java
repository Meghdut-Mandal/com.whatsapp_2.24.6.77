package X;

import java.util.Comparator;

/* renamed from: X.4Ya  reason: invalid class name and case insensitive filesystem */
public class C89824Ya implements Comparator {
    public final int A00;

    public C89824Ya(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 1:
                return 0;
            case 3:
                return C05590Qh.A00(Long.valueOf(((C21642ATi) obj).A04), Long.valueOf(((C21642ATi) obj2).A04));
            default:
                return C05590Qh.A00((Integer) ((AnonymousClass011) obj).first, (Integer) ((AnonymousClass011) obj2).first);
        }
    }
}
