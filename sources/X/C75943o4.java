package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3o4  reason: invalid class name and case insensitive filesystem */
public final class C75943o4 implements B1B {
    public final /* synthetic */ AnonymousClass2EJ A00;

    public void BQu(int i) {
    }

    public C75943o4(AnonymousClass2EJ r1) {
        this.A00 = r1;
    }

    public void Bcb(List list) {
        AnonymousClass2EJ r5 = this.A00;
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C223313w r2 = (C223313w) it.next();
            AnonymousClass11F A0A = r5.A0E.A0A(r2);
            if (A0A == null) {
                A0A = r2;
            }
            C36381kD.A1H(r5.A0C, A0A, A0J);
        }
        r5.A06.A0C(C007103b.A0f(A0J));
    }
}
