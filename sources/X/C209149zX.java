package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.9zX  reason: invalid class name and case insensitive filesystem */
public final class C209149zX implements B29 {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public boolean BN9() {
        return true;
    }

    public AnonymousClass9VL BH7(long j) {
        long[] jArr = this.A04;
        int A032 = Util.A03(jArr, j, true);
        long j2 = jArr[A032];
        long[] jArr2 = this.A03;
        C199759fu r5 = new C199759fu(j2, jArr2[A032]);
        if (r5.A01 >= j || A032 == this.A00 - 1) {
            return new AnonymousClass9VL(r5, r5);
        }
        int i = A032 + 1;
        return new AnonymousClass9VL(r5, new C199759fu(jArr[i], jArr2[i]));
    }

    public C209149zX(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }

    public long BBK() {
        return this.A05;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChunkIndex(length=");
        A0u.append(this.A00);
        A0u.append(", sizes=");
        A0u.append(Arrays.toString(this.A01));
        A0u.append(", offsets=");
        A0u.append(Arrays.toString(this.A03));
        A0u.append(", timeUs=");
        A0u.append(Arrays.toString(this.A04));
        A0u.append(", durationsUs=");
        A0u.append(Arrays.toString(this.A02));
        return C90474aD.A0f(A0u);
    }
}
