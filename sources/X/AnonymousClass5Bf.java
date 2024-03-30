package X;

import java.io.File;

/* renamed from: X.5Bf  reason: invalid class name */
public final class AnonymousClass5Bf extends C122615v9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final int[] A06;

    public AnonymousClass5Bf(File file, String str, byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(file, str, bArr, z);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = (iArr == null || iArr.length < 2) ? new int[0] : iArr;
    }
}
