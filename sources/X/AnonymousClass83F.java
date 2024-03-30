package X;

import android.net.Uri;
import java.util.Objects;

/* renamed from: X.83F  reason: invalid class name */
public final class AnonymousClass83F extends A0K implements B39 {
    public int A00;
    public int A01;
    public Uri A02;
    public boolean A03;
    public final byte[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83F(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        C200319h9.A01(bArr.length > 0 ? true : z);
        this.A04 = bArr;
    }

    public long Bks(C202189lD r11) {
        this.A02 = r11.A04;
        A02();
        long j = r11.A03;
        int i = (int) j;
        this.A01 = i;
        long j2 = r11.A02;
        long j3 = j2;
        if (j2 == -1) {
            j2 = ((long) this.A04.length) - j;
        }
        int i2 = (int) j2;
        this.A00 = i2;
        if (i2 <= 0 || i + i2 > this.A04.length) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unsatisfiable range: [");
            A0u.append(i);
            A0u.append(", ");
            A0u.append(j3);
            A0u.append("], length: ");
            throw C90524aI.A0X(C36381kD.A10(A0u, this.A04.length));
        }
        this.A03 = true;
        A04(r11);
        return (long) this.A00;
    }

    public void close() {
        if (this.A03) {
            this.A03 = false;
            A01();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A04, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A03(min);
        return min;
    }

    public Uri BIj() {
        return this.A02;
    }
}
