package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9zt  reason: invalid class name and case insensitive filesystem */
public final class C209369zt implements B5S, B2D {
    public boolean A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public byte[] A04;
    public final long A05;
    public final C207099uY A06;
    public final C202249lP A07;
    public final C198829eG A08 = new C198829eG("Loader:SingleSampleMediaPeriod");
    public final C206419tN A09;
    public final C22861AxD A0A;
    public final C202189lD A0B;
    public final ArrayList A0C = AnonymousClass001.A0I();

    public void B2Y(long j) {
    }

    public void B5V(long j, boolean z) {
    }

    public long B8K(C199399fF r1, long j) {
        return j;
    }

    public void BPe() {
    }

    public long Bpa(long j, boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i >= arrayList.size()) {
                return j;
            }
            A02 a02 = (A02) arrayList.get(i);
            if (a02.A00 == 2) {
                a02.A00 = 1;
            }
            i++;
        }
    }

    public long Bpe(B2j[] b2jArr, B5T[] b5tArr, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < b5tArr.length; i++) {
            if (b2jArr[i] != null && (b5tArr[i] == null || !zArr[i])) {
                this.A0C.remove(b2jArr[i]);
                b2jArr[i] = null;
            }
            if (b2jArr[i] == null && b5tArr[i] != null) {
                A02 a02 = new A02(this);
                this.A0C.add(a02);
                b2jArr[i] = a02;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public void Brc(boolean z) {
    }

    public void Bwk(byte b, boolean z) {
    }

    public boolean B3Y(long j, long j2) {
        if (this.A02) {
            return false;
        }
        C198829eG r2 = this.A08;
        if (r2.A00 != null) {
            return false;
        }
        C202189lD r6 = this.A0B;
        r2.A00(this, new A0Q(this.A0A.B4R(), r6), 3);
        this.A07.A07(new C191069Bl(r6), new AnonymousClass9NR(this.A06, (Object) null, 1, -1, 0, C202249lP.A00(0), C202249lP.A00(this.A05)));
        return true;
    }

    public long B92(long j) {
        if (this.A02) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long B93() {
        if (this.A02) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public long BEW() {
        if (this.A02 || this.A08.A00 != null) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void BZp(B0X b0x, long j, long j2, boolean z) {
        this.A07.A06(new C191069Bl(((A0Q) b0x).A02), new AnonymousClass9NR((C207099uY) null, (Object) null, 1, -1, 0, C202249lP.A00(0), C202249lP.A00(this.A05)));
    }

    public /* bridge */ /* synthetic */ void BZr(B0X b0x, long j, long j2) {
        A0Q a0q = (A0Q) b0x;
        this.A07.A09(new C191069Bl(a0q.A02), new AnonymousClass9NR(this.A06, (Object) null, 1, -1, 0, C202249lP.A00(0), C202249lP.A00(this.A05)), a0q);
        this.A01 = a0q.A00;
        this.A04 = a0q.A01;
        this.A02 = true;
        this.A03 = true;
    }

    public /* bridge */ /* synthetic */ C191099Bo BZw(B0X b0x, IOException iOException, int i, long j, long j2) {
        this.A07.A08(new C191069Bl(((A0Q) b0x).A02), new AnonymousClass9NR(this.A06, (Object) null, 1, -1, 0, C202249lP.A00(0), C202249lP.A00(this.A05)), iOException, false);
        return C198829eG.A05;
    }

    public long Bmt() {
        if (this.A00) {
            return -9223372036854775807L;
        }
        this.A07.A04();
        this.A00 = true;
        return -9223372036854775807L;
    }

    public C209369zt(C207099uY r5, C202249lP r6, C22861AxD axD, C202189lD r8, long j) {
        this.A0B = r8;
        this.A0A = axD;
        this.A06 = r5;
        this.A05 = j;
        this.A07 = r6;
        AnonymousClass7c0 r0 = C206419tN.CREATOR;
        this.A09 = new C206419tN(new C206389tK(r5));
        r6.A02();
    }

    public C206419tN BIW() {
        return this.A09;
    }

    public void Bm4(C161967nm r1, long j) {
        r1.BdO(this);
    }
}
