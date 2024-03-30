package X;

public class A17 implements C22869AxO {
    public final int A00;
    public final C22774Avk A01;
    public final float A02;
    public final C23077B3i A03;
    public final AnonymousClass9XE A04;
    public final AnonymousClass9GZ A05;

    public C207099uY Bpc(AnonymousClass9GX r9, C207099uY[] r10) {
        long j;
        long j2;
        int length = r10.length;
        if (length == 0) {
            return null;
        }
        C201209j4 r3 = ((A0B) this.A01).A02;
        synchronized (r3) {
            j = r3.A02;
        }
        float f = this.A02;
        if (j == -1) {
            j2 = (long) this.A00;
        } else {
            j2 = (long) (((float) j) * f);
        }
        int i = 0;
        do {
            C207099uY r5 = r10[i];
            if (((long) r5.A04) <= j2) {
                return r5;
            }
            i++;
        } while (i < length);
        int i2 = 0;
        C207099uY r4 = r10[0];
        do {
            C207099uY r2 = r10[i2];
            if (r2.A04 < r4.A04) {
                r4 = r2;
            }
            i2++;
        } while (i2 < length);
        return r4;
    }

    public A17(C22774Avk avk, C23077B3i b3i, AnonymousClass9XE r4, AnonymousClass9GZ r5, AUF auf) {
        this.A01 = avk;
        this.A04 = r4;
        this.A03 = b3i;
        this.A05 = r5;
        this.A00 = auf.audioMaxInitialBitrate;
        this.A02 = auf.audioPrefetchBandwidthFraction;
    }
}
