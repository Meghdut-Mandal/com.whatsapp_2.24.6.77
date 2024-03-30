package X;

import java.util.List;

/* renamed from: X.0Cq  reason: invalid class name and case insensitive filesystem */
public class C02980Cq implements Runnable {
    public final /* synthetic */ AnonymousClass0BV A00;
    public final /* synthetic */ AnonymousClass0Bl A01;
    public final /* synthetic */ List A02;

    public C02980Cq(AnonymousClass0BV r1, AnonymousClass0Bl r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public void run() {
        List list = this.A02;
        AnonymousClass0Bl r2 = this.A01;
        if (list.contains(r2)) {
            list.remove(r2);
            C02670Bj.A02(r2.A04.A0F, r2.A00);
        }
    }
}
