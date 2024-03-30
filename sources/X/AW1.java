package X;

import java.util.Iterator;

public class AW1 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20990A2e A01;
    public final /* synthetic */ C207019uQ A02;
    public final /* synthetic */ C207179ug A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public AW1(C20990A2e a2e, C207019uQ r2, C207179ug r3, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A01 = a2e;
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C207179ug r4 = this.A03;
            ((C161067m6) it.next()).BkE(this.A02, r4, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
