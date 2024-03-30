package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Arrays;

public final class A0Q implements B0X {
    public int A00;
    public byte[] A01;
    public final C202189lD A02;
    public final B39 A03;

    public void B2W() {
    }

    /* JADX INFO: finally extract failed */
    public void BOE() {
        int i = 0;
        this.A00 = 0;
        try {
            B39 b39 = this.A03;
            b39.Bks(this.A02);
            do {
                int i2 = this.A00 + i;
                this.A00 = i2;
                byte[] bArr = this.A01;
                if (bArr == null) {
                    bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                } else {
                    int length = bArr.length;
                    if (i2 == length) {
                        bArr = Arrays.copyOf(bArr, length * 2);
                    }
                    int i3 = this.A00;
                    i = b39.read(bArr, i3, bArr.length - i3);
                }
                this.A01 = bArr;
                int i32 = this.A00;
                i = b39.read(bArr, i32, bArr.length - i32);
            } while (i != -1);
            try {
                b39.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            B39 b392 = this.A03;
            if (b392 != null) {
                try {
                    b392.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public A0Q(B39 b39, C202189lD r2) {
        this.A02 = r2;
        this.A03 = b39;
    }
}
