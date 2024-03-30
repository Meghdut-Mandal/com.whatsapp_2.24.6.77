package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.0Cc  reason: invalid class name and case insensitive filesystem */
public class C02840Cc {
    public static final Executor A07 = new C02850Cd();
    public Executor A00;
    public int A01;
    public List A02;
    public List A03;
    public final C02890Ch A04;
    public final C02860Ce A05;
    public final List A06;

    public void A00(List list) {
        int i = this.A01 + 1;
        this.A01 = i;
        List list2 = this.A02;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.A02 = null;
                this.A03 = Collections.emptyList();
                this.A05.Beb(0, size);
            } else if (list2 == null) {
                this.A02 = list;
                this.A03 = Collections.unmodifiableList(list);
                this.A05.BZE(0, list.size());
            } else {
                this.A04.A01.execute(new C11970hI(this, list2, list, i));
                return;
            }
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public C02840Cc(C02890Ch r2, C02860Ce r3) {
        this.A06 = new CopyOnWriteArrayList();
        this.A03 = Collections.emptyList();
        this.A05 = r3;
        this.A04 = r2;
        this.A00 = A07;
    }

    public C02840Cc(C02830Cb r3, AnonymousClass0CZ r4) {
        this(new C02880Cg(r3).A00(), (C02860Ce) new C02870Cf(r4));
    }
}
