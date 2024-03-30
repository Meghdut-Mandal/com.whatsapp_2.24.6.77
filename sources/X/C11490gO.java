package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0gO  reason: invalid class name and case insensitive filesystem */
public class C11490gO implements Runnable {
    public final /* synthetic */ C11970hI A00;
    public final /* synthetic */ AnonymousClass0X4 A01;

    public C11490gO(C11970hI r1, AnonymousClass0X4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        C11970hI r3 = this.A00;
        C02840Cc r2 = r3.A01;
        if (r2.A01 == r3.A00) {
            List list = r3.A02;
            AnonymousClass0X4 r1 = this.A01;
            r2.A02 = list;
            r2.A03 = Collections.unmodifiableList(list);
            r1.A01(r2.A05);
            Iterator it = r2.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
