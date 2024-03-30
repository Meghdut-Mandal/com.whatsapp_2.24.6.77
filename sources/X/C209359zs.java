package X;

import java.io.IOException;

/* renamed from: X.9zs  reason: invalid class name and case insensitive filesystem */
public final class C209359zs implements B5S, C161967nm {
    public long A00 = -9223372036854775807L;
    public long A01;
    public C161967nm A02;
    public B5S A03;
    public final AnonymousClass9WT A04;
    public final B38 A05;
    public final C195899Ws A06;

    public void B2Y(long j) {
        B5S b5s = this.A03;
        if (b5s != null) {
            b5s.B2Y(j);
        }
    }

    public boolean B3Y(long j, long j2) {
        B5S b5s = this.A03;
        if (b5s == null || !b5s.B3Y(j, j2)) {
            return false;
        }
        return true;
    }

    public void B5V(long j, boolean z) {
        this.A03.B5V(j, z);
    }

    public long B8K(C199399fF r3, long j) {
        return this.A03.B8K(r3, j);
    }

    public long B92(long j) {
        return this.A03.B92(j);
    }

    public long B93() {
        return this.A03.B93();
    }

    public long BEW() {
        return this.A03.BEW();
    }

    public C206419tN BIW() {
        return this.A03.BIW();
    }

    public void BPe() {
        try {
            B5S b5s = this.A03;
            if (b5s != null) {
                b5s.BPe();
            } else {
                this.A05.BPf();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ void BUd(B3I b3i) {
        this.A02.BUd(this);
    }

    public void BdO(B5S b5s) {
        this.A02.BdO(this);
    }

    public void Bm4(C161967nm r2, long j) {
        this.A02 = r2;
        this.A01 = j;
        B5S b5s = this.A03;
        if (b5s != null) {
            b5s.Bm4(this, j);
        }
    }

    public long Bmt() {
        return this.A03.Bmt();
    }

    public long Bpa(long j, boolean z) {
        return this.A03.Bpa(j, z);
    }

    public long Bpe(B2j[] b2jArr, B5T[] b5tArr, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != 0) {
            j2 = j;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A03.Bpe(b2jArr, b5tArr, zArr, zArr2, j2);
    }

    public void Brc(boolean z) {
        B5S b5s = this.A03;
        if (b5s != null) {
            b5s.Brc(z);
        }
    }

    public void Bwk(byte b, boolean z) {
        B5S b5s = this.A03;
        if (b5s != null) {
            b5s.Bwk(b, z);
        }
    }

    public C209359zs(AnonymousClass9WT r3, B38 b38, C195899Ws r5) {
        this.A04 = r3;
        this.A06 = r5;
        this.A05 = b38;
    }
}
