package X;

import android.media.MediaFormat;

/* renamed from: X.6mt  reason: invalid class name and case insensitive filesystem */
public class C141236mt implements C160907lm {
    public int A00;
    public boolean A01;
    public final C107725Qp A02;
    public final C160907lm A03;

    public void B3Q(String str) {
        this.A03.B3Q(this.A02.getCanonicalPath());
    }

    public void BqF(MediaFormat mediaFormat) {
        this.A03.BqF(mediaFormat);
    }

    public void BrP(int i) {
        this.A03.BrP(i);
    }

    public void Bsh(MediaFormat mediaFormat) {
        this.A03.Bsh(mediaFormat);
    }

    public void BxZ(C159937kC r2) {
        this.A03.BxZ(r2);
        this.A00++;
    }

    public void Bxg(C159937kC r2) {
        this.A03.Bxg(r2);
        this.A00++;
    }

    public void start() {
        this.A03.start();
        this.A01 = true;
    }

    public void stop() {
        this.A03.stop();
        this.A01 = false;
        this.A02.A00();
    }

    public C141236mt(C107725Qp r1, C160907lm r2) {
        this.A03 = r2;
        this.A02 = r1;
    }

    public boolean BNK() {
        return this.A01;
    }
}
