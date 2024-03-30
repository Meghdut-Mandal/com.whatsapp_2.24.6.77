package X;

import java.util.Iterator;

public class AVs implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20990A2e A01;
    public final /* synthetic */ C207019uQ A02;
    public final /* synthetic */ C207179ug A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public AVs(C20990A2e a2e, C207019uQ r2, C207179ug r3, String str, long j, boolean z, boolean z2) {
        this.A01 = a2e;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C207179ug r4 = this.A03;
            C207019uQ r3 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            ((C161067m6) it.next()).BhD(r3, r4, this.A04, this.A00, z, z2);
        }
    }
}
