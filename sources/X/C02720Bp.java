package X;

import java.util.ArrayList;

/* renamed from: X.0Bp  reason: invalid class name and case insensitive filesystem */
public class C02720Bp implements Runnable {
    public final /* synthetic */ AnonymousClass0Bl A00;
    public final /* synthetic */ AnonymousClass0BU A01;

    public C02720Bp(AnonymousClass0Bl r1, AnonymousClass0BU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0BU r2 = this.A01;
        ArrayList arrayList = r2.A03;
        AnonymousClass0Bl r1 = this.A00;
        arrayList.remove(r1);
        r2.A04.remove(r1);
    }
}
