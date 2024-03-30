package X;

import java.util.Arrays;

/* renamed from: X.1XQ  reason: invalid class name */
public final class AnonymousClass1XQ {
    public final int[] A00;

    public AnonymousClass1XQ(String str) {
        AnonymousClass00C.A0D(str, 1);
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            this.A00[i2] = str.codePointAt(i);
            i += Character.charCount(this.A00[i2]);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AnonymousClass00C.A0J(getClass(), obj.getClass())) {
                int[] iArr = this.A00;
                int[] iArr2 = ((AnonymousClass1XQ) obj).A00;
                if (!Arrays.equals(iArr, iArr2)) {
                    int length = iArr.length;
                    if (length == iArr2.length) {
                        int i = 0;
                        while (i < length) {
                            if (iArr[i] == iArr2[i]) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 : this.A00) {
            i = (31 * i) + i2;
        }
        return i;
    }

    public String toString() {
        return C63873Lt.A01(this.A00);
    }

    public AnonymousClass1XQ(int[] iArr) {
        AnonymousClass00C.A0D(iArr, 1);
        this.A00 = iArr;
    }
}
