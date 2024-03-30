package X;

import java.util.List;

/* renamed from: X.0hI  reason: invalid class name and case insensitive filesystem */
public class C11970hI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C02840Cc A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C11970hI(C02840Cc r1, List list, List list2, int i) {
        this.A01 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A00 = i;
    }

    public void run() {
        this.A01.A00.execute(new C11490gO(this, C06880Vl.A00(new C03770Hq(this))));
    }
}
