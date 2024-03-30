package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9gX  reason: invalid class name and case insensitive filesystem */
public final class C200059gX {
    public static final C200059gX A06 = new C200059gX(1033, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
    public static final C200059gX A07 = new C200059gX(4201, ZipDecompressor.UNZIP_BUFFER_SIZE);
    public static final C200059gX A08;
    public static final C200059gX A09;
    public static final C200059gX A0A = new C200059gX(19, 16);
    public static final C200059gX A0B;
    public static final C200059gX A0C;
    public static final C200059gX A0D = new C200059gX(285, 256);
    public final AnonymousClass9YH A00;
    public final AnonymousClass9YH A01;
    public final int[] A02;
    public final int[] A03;
    public final int A04;
    public final int A05;

    static {
        C200059gX r3 = new C200059gX(67, 64);
        A08 = r3;
        C200059gX r0 = new C200059gX(301, 256);
        A0B = r0;
        A09 = r0;
        A0C = r3;
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A02[(this.A05 - this.A03[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A05 - 1)];
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("GF(0x");
        C90504aG.A0z(this.A04, A0i);
        A0i.append(',');
        return C36321k7.A0G(A0i, this.A05);
    }

    public C200059gX(int i, int i2) {
        this.A04 = i;
        this.A05 = i2;
        int[] iArr = new int[i2];
        this.A02 = iArr;
        int[] iArr2 = new int[i2];
        this.A03 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 <<= 1;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A01 = new AnonymousClass9YH(this, new int[]{0});
        this.A00 = new AnonymousClass9YH(this, new int[]{1});
    }
}
