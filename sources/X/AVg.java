package X;

import java.util.Iterator;

public class AVg implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C20990A2e A02;
    public final /* synthetic */ C207179ug A03;

    public AVg(C20990A2e a2e, C207179ug r2, float f, long j) {
        this.A02 = a2e;
        this.A00 = f;
        this.A01 = j;
        this.A03 = r2;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C161067m6) it.next()).Bcp(this.A03, this.A00, this.A01);
        }
    }
}
