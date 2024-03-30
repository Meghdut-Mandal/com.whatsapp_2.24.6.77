package X;

import com.whatsapp.util.Log;

public final class AVt implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C28981Uw A01;
    public final /* synthetic */ C21230ADm A02;
    public final /* synthetic */ C123915xI A03;
    public final /* synthetic */ C023509x A04;
    public final /* synthetic */ C10770fC A05;
    public final /* synthetic */ C10810fG A06;

    public AVt(C28981Uw r1, C21230ADm aDm, C123915xI r3, C023509x r4, C10770fC r5, C10810fG r6, long j) {
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = j;
        this.A02 = aDm;
        this.A05 = r5;
        this.A04 = r4;
    }

    public final void run() {
        C10810fG r7 = this.A06;
        C30131Zi r6 = this.A03.A02;
        C28981Uw r5 = this.A01;
        long j = this.A00;
        C21230ADm aDm = this.A02;
        AnonymousClass1GQ r1 = r6.A0G;
        if (!AnonymousClass1GQ.A01(r1, 3877) || !r1.A00.A0E(5185)) {
            C10770fC r4 = this.A05;
            C023509x r3 = this.A04;
            Log.e((Throwable) new C178238fP("Unable to start reactions senders list job", 0));
            if (!r4.element) {
                r3.resumeWith(new C178318fk());
                r4.element = true;
                return;
            }
            return;
        }
        AnonymousClass8fI r12 = new AnonymousClass8fI(r5, aDm, String.valueOf(j));
        r6.A0B.A01(r12);
        r7.element = r12;
    }
}
