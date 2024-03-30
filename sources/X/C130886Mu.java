package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6Mu  reason: invalid class name and case insensitive filesystem */
public final class C130886Mu {
    public final C18820ts A00;
    public final LinkedList A01 = C90524aI.A0l();
    public final LinkedList A02 = C90524aI.A0l();
    public final LinkedList A03 = C90524aI.A0l();

    public C130886Mu(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A01(C124875yw r6) {
        List list = r6.A09;
        AnonymousClass00C.A07(list);
        A00(this.A01, list);
        List list2 = r6.A0C;
        AnonymousClass00C.A07(list2);
        A00(this.A03, list2);
        List list3 = r6.A0A;
        AnonymousClass00C.A07(list3);
        for (Object next : list3) {
            LinkedList linkedList = this.A02;
            if (!linkedList.contains(next)) {
                if (linkedList.size() >= 100) {
                    linkedList.removeLast();
                }
                linkedList.addFirst(next);
            }
        }
    }

    public static final void A00(LinkedList linkedList, List list) {
        for (Object next : list) {
            if (linkedList.contains(next)) {
                linkedList.remove(next);
            }
            if (linkedList.size() >= 100) {
                linkedList.removeLast();
            }
            linkedList.addFirst(next);
        }
    }
}
