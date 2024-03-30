package X;

import android.media.AudioTrack;

/* renamed from: X.9cq  reason: invalid class name and case insensitive filesystem */
public final class C198059cq {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final AnonymousClass9MA A05;

    public static void A00(C198059cq r4, int i) {
        r4.A00 = i;
        long j = 5000;
        if (i == 0) {
            r4.A03 = 0;
            r4.A01 = -1;
            r4.A02 = C36391kE.A0B(System.nanoTime());
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        }
        r4.A04 = j;
    }

    public C198059cq(AudioTrack audioTrack) {
        this.A05 = new AnonymousClass9MA(audioTrack);
        A00(this, 0);
    }
}
