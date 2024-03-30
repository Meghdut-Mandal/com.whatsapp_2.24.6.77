package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* renamed from: X.6ms  reason: invalid class name and case insensitive filesystem */
public class C141226ms implements C160907lm {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    public void B3Q(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    public void BqF(MediaFormat mediaFormat) {
        this.A00 = this.A02.addTrack(mediaFormat);
    }

    public void BrP(int i) {
        this.A02.setOrientationHint(i);
    }

    public void Bsh(MediaFormat mediaFormat) {
        this.A01 = this.A02.addTrack(mediaFormat);
    }

    public void BxZ(C159937kC r5) {
        this.A02.writeSampleData(this.A00, r5.B95(), r5.B91());
    }

    public void Bxg(C159937kC r5) {
        this.A02.writeSampleData(this.A01, r5.B95(), r5.B91());
    }

    public void start() {
        this.A02.start();
        this.A03 = true;
    }

    public void stop() {
        this.A02.stop();
        this.A03 = false;
        this.A02.release();
    }

    public boolean BNK() {
        return this.A03;
    }
}
