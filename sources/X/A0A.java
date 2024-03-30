package X;

import java.util.Arrays;
import java.util.Objects;

public abstract class A0A implements B5T {
    public int A00;
    public final int A01;
    public final C206389tK A02;
    public final int[] A03;
    public final C207099uY[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            A0A a0a = (A0A) obj;
            if (this.A02 != a0a.A02 || !Arrays.equals(this.A03, a0a.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = identityHashCode;
        return identityHashCode;
    }

    public A0A(C206389tK r8, int[] iArr) {
        int i;
        int length = iArr.length;
        C200319h9.A02(AnonymousClass000.A1R(length));
        Objects.requireNonNull(r8);
        this.A02 = r8;
        this.A01 = length;
        C207099uY[] r3 = new C207099uY[length];
        this.A04 = r3;
        for (int i2 = 0; i2 < length; i2++) {
            r3[i2] = r8.A02[iArr[i2]];
        }
        Arrays.sort(r3, AXV.A00);
        int i3 = this.A01;
        int[] iArr2 = new int[i3];
        this.A03 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            C207099uY r32 = this.A04[i4];
            char c = 0;
            while (true) {
                C207099uY[] r1 = r8.A02;
                if (c >= 1) {
                    i = -1;
                    break;
                } else if (r32 == r1[c]) {
                    i = 0;
                    break;
                } else {
                    c = 1;
                }
            }
            iArr2[i4] = i;
        }
    }
}
