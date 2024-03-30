package X;

import java.util.Iterator;

public class AVo implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20990A2e A01;
    public final /* synthetic */ C200889iQ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public AVo(C20990A2e a2e, C200889iQ r2, String str, String str2, String str3, long j) {
        this.A01 = a2e;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            long j = this.A00;
            ((C161067m6) it.next()).BX4(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
