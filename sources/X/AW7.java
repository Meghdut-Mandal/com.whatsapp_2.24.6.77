package X;

import java.util.Iterator;

public class AW7 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C20990A2e A02;
    public final /* synthetic */ C118655oW A03;
    public final /* synthetic */ C207019uQ A04;
    public final /* synthetic */ C207179ug A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public AW7(C20990A2e a2e, C118655oW r2, C207019uQ r3, C207179ug r4, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        this.A02 = a2e;
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = j;
        this.A06 = num;
        this.A00 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A0A = z;
        this.A09 = str3;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            C207179ug r5 = this.A05;
            C207019uQ r4 = this.A04;
            C118655oW r3 = this.A03;
            long j = this.A01;
            Integer num = this.A06;
            long j2 = this.A00;
            ((C161067m6) it.next()).BkI(r3, r4, r5, num, this.A07, this.A08, this.A09, j, j2, this.A0A);
        }
    }
}
