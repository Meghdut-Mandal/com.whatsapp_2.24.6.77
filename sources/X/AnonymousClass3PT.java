package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3PT  reason: invalid class name */
public class AnonymousClass3PT {
    public long A00;
    public final AnonymousClass3NL A01 = new AnonymousClass3NL();
    public final AnonymousClass3NL A02 = new AnonymousClass3NL();
    public final Map A03 = AnonymousClass001.A0J();
    public final List A04 = C36441kJ.A14(1);

    private void A00(AnonymousClass3NL r5) {
        Iterator A0z = AnonymousClass000.A0z(r5.A00);
        while (A0z.hasNext()) {
            C130836Mp r2 = (C130836Mp) A0z.next();
            AnonymousClass365 r1 = (AnonymousClass365) this.A03.get(r2.A01);
            if (r1 != null) {
                r1.A00 = C023109s.A0C;
                r1.A02.clear();
                r2.A00(this);
            }
        }
    }

    public void A01() {
        AnonymousClass3NL r2 = this.A02;
        for (C130836Mp A002 : r2.A01) {
            A002.A00(this);
        }
        A00(r2);
        AnonymousClass3NL r22 = this.A01;
        for (C130836Mp A003 : r22.A01) {
            A003.A00(this);
        }
        A00(r22);
    }

    public void A02(List list, long j) {
        this.A00 = j;
        List list2 = this.A04;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new Rect((Rect) it.next()));
        }
        AnonymousClass3NL r4 = this.A02;
        Iterator A0z = AnonymousClass000.A0z(r4.A00);
        while (A0z.hasNext()) {
            this.A03.remove(((C130836Mp) A0z.next()).A01);
        }
        AnonymousClass3NL r3 = this.A01;
        Iterator A0z2 = AnonymousClass000.A0z(r3.A00);
        while (A0z2.hasNext()) {
            this.A03.remove(((C130836Mp) A0z2.next()).A01);
        }
        Iterator A0z3 = AnonymousClass000.A0z(this.A03);
        while (A0z3.hasNext()) {
            ((AnonymousClass365) A0z3.next()).A02.clear();
        }
        AnonymousClass3NL.A00(r4);
        AnonymousClass3NL.A00(r3);
    }
}
