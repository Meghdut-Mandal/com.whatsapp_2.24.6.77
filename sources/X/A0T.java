package X;

public class A0T implements B2F {
    public long A00;
    public int A01;
    public final /* synthetic */ C201619jy A02;

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
    }

    public A0T(C201619jy r1, int i) {
        this.A02 = r1;
        this.A01 = i;
    }

    public void Bgt(C23077B3i b3i, C21664AUg aUg) {
        long j = aUg.A05;
        long j2 = (long) this.A01;
        if (j < j2) {
            long j3 = this.A00;
            long j4 = aUg.A04;
            if (j + j4 > j2) {
                j4 = j2 - j;
            }
            this.A00 = j3 + j4;
        }
    }

    public void Bgu(C23077B3i b3i, C21664AUg aUg) {
        if (!(aUg.A05 != 0 || this.A02.A0A == null || C1895394e.A00(aUg.A07) == null)) {
            C131916Rh.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", C90524aI.A0w());
        }
        C201619jy r1 = this.A02;
        if (r1.A03() != null) {
            r1.A03().Bnn(this, aUg.A07);
        }
    }
}
