package X;

import java.util.Iterator;

/* renamed from: X.AVx  reason: case insensitive filesystem */
public class C21677AVx implements Runnable {
    public final /* synthetic */ C20990A2e A00;
    public final /* synthetic */ C118655oW A01;
    public final /* synthetic */ C207019uQ A02;
    public final /* synthetic */ C207179ug A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C21677AVx(C20990A2e a2e, C118655oW r2, C207019uQ r3, C207179ug r4, Integer num, String str, boolean z, boolean z2) {
        this.A00 = a2e;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = num;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
    }

    public void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            C207179ug r5 = this.A03;
            C207019uQ r4 = this.A02;
            ((C161067m6) it.next()).BkG(this.A01, r4, r5, this.A04, this.A05, this.A07, this.A06);
        }
    }
}
