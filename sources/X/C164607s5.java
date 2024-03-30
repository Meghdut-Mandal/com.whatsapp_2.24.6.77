package X;

import java.util.Iterator;

/* renamed from: X.7s5  reason: invalid class name and case insensitive filesystem */
public class C164607s5 implements C158337gl {
    public Object A00;
    public final int A01;

    public C164607s5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void B70(Iterable iterable) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass3T1 r2 = (AnonymousClass3T1) obj;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((AnonymousClass6FT) it.next()).A07(r2);
            }
            return;
        }
        AnonymousClass1VD r22 = (AnonymousClass1VD) obj;
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass6FT) it2.next()).A04();
        }
        r22.A01.A03(new C146296vN(r22));
    }
}
