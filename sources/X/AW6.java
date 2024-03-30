package X;

import java.util.Iterator;

public class AW6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20990A2e A01;
    public final /* synthetic */ C207019uQ A02;
    public final /* synthetic */ C207179ug A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public AW6(C20990A2e a2e, C207019uQ r2, C207179ug r3, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        this.A01 = a2e;
        this.A03 = r3;
        this.A02 = r2;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C207179ug r4 = this.A03;
            C207019uQ r3 = this.A02;
            boolean z = this.A0A;
            boolean z2 = this.A09;
            ((C161067m6) it.next()).BkN(r3, r4, this.A08, this.A04, this.A05, this.A06, this.A07, this.A00, z, z2);
        }
    }
}
