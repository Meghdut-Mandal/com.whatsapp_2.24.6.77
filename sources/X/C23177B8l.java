package X;

import java.util.Comparator;

/* renamed from: X.B8l  reason: case insensitive filesystem */
public class C23177B8l implements Comparator {
    public final int A00;

    public C23177B8l(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        int i;
        if (this.A00 != 0) {
            valueOf = Integer.valueOf(((AnonymousClass9WA) obj).A00);
            i = ((AnonymousClass9WA) obj2).A00;
        } else {
            valueOf = Integer.valueOf(((C195609Vc) obj).A00);
            i = ((C195609Vc) obj2).A00;
        }
        return C05590Qh.A00(valueOf, Integer.valueOf(i));
    }
}
