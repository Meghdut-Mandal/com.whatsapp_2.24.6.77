package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68y  reason: invalid class name and case insensitive filesystem */
public class C1276068y {
    public final C18820ts A00;

    public C1276068y(C18820ts r1) {
        this.A00 = r1;
    }

    public AnonymousClass5Gk A00(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new AnonymousClass5Gk(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), 1), instance.get(6));
    }

    public C1512678w A01(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new C1512678w(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5)), instance.get(6));
    }

    public ArrayList A02(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        C1512678w r2 = null;
        while (it.hasNext()) {
            C1512678w A01 = A01(((C202319lY) it.next()).A05);
            if (r2 != null) {
                if (!r2.equals(A01)) {
                    A0I.add(r2);
                } else {
                    r2.count++;
                }
            }
            A01.count = 0;
            r2 = A01;
            r2.count++;
        }
        if (r2 != null) {
            A0I.add(r2);
        }
        return A0I;
    }
}
