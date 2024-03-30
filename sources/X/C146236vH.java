package X;

import java.util.Iterator;

/* renamed from: X.6vH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146236vH implements C158337gl {
    public final /* synthetic */ int A00;

    public /* synthetic */ C146236vH(int i) {
        this.A00 = i;
    }

    public final void B70(Iterable iterable) {
        int i = this.A00;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((AnonymousClass6FT) it.next()).A06(i);
        }
    }
}
