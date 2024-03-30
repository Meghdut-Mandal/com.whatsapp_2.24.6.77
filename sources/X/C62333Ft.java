package X;

import java.util.LinkedList;

/* renamed from: X.3Ft  reason: invalid class name and case insensitive filesystem */
public final class C62333Ft {
    public final LinkedList A00;
    public final /* synthetic */ C39721tO A01;

    public final void A00(C88784Ua r5) {
        AnonymousClass00C.A0D(r5, 0);
        boolean A012 = A01();
        LinkedList linkedList = this.A00;
        AnonymousClass00C.A0D(linkedList, 0);
        int A07 = C36431kI.A07(linkedList);
        if (A012) {
            A07 = Math.max(0, A07 - 1);
        }
        linkedList.add(A07, r5);
    }

    public C62333Ft(C39721tO r3) {
        this.A01 = r3;
        LinkedList linkedList = new LinkedList();
        this.A00 = linkedList;
        linkedList.add(new C70723fc(r3));
    }

    public final boolean A01() {
        LinkedList linkedList = this.A00;
        if (!(!linkedList.isEmpty()) || !(C007103b.A0N(linkedList) instanceof C70723fc)) {
            return false;
        }
        return true;
    }
}
