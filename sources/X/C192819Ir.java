package X;

import java.util.List;

/* renamed from: X.9Ir  reason: invalid class name and case insensitive filesystem */
public class C192819Ir {
    public final List A00;
    public final List A01;
    public final List A02;

    public C192819Ir(List list) {
        this.A01 = list;
        this.A00 = C36361kB.A0r(list);
        this.A02 = C36361kB.A0r(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new C1684780t(((AnonymousClass9L4) list.get(i)).A01.A00));
            this.A02.add(new AnonymousClass810(((AnonymousClass9L4) list.get(i)).A00.A00));
        }
    }
}
