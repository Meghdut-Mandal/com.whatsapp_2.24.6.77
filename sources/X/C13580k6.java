package X;

import java.util.NoSuchElementException;

/* renamed from: X.0k6  reason: invalid class name and case insensitive filesystem */
public final class C13580k6 extends C12260hl {
    public int A00;
    public final int[] A01;

    public int A00() {
        try {
            int[] iArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.length);
    }

    public C13580k6(int[] iArr) {
        this.A01 = iArr;
    }
}
