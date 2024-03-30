package X;

import java.util.Iterator;

public class AVl implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C20990A2e A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AVl(C20990A2e a2e, long j, long j2, boolean z, boolean z2) {
        this.A02 = a2e;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A04 = z2;
    }

    public void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C161067m6) it.next()).Bhr(this.A01, this.A00, this.A03, this.A04);
        }
    }
}
