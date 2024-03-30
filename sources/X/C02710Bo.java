package X;

import java.util.ArrayList;

/* renamed from: X.0Bo  reason: invalid class name and case insensitive filesystem */
public class C02710Bo implements Runnable {
    public final /* synthetic */ AnonymousClass0Bl A00;
    public final /* synthetic */ AnonymousClass0BU A01;

    public C02710Bo(AnonymousClass0Bl r1, AnonymousClass0BU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        ArrayList arrayList = this.A01.A03;
        AnonymousClass0Bl r2 = this.A00;
        if (arrayList.contains(r2)) {
            C02670Bj.A02(r2.A04.A0F, r2.A00);
        }
    }
}
