package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.8xv  reason: invalid class name and case insensitive filesystem */
public class C187468xv extends InputStream implements C22948Az0 {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public byte[] A03 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];

    public synchronized void A00() {
        this.A00 = this.A02;
    }

    public void B14(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = this.A03;
        if (bArr2 == null) {
            throw C90524aI.A0X("Stream is closed.");
        } else if (i2 == 0) {
        } else {
            if (i2 <= bArr.length) {
                int i4 = this.A02;
                int i5 = this.A01;
                if (i4 == i5 && this.A00 == -1) {
                    this.A01 = 0;
                    i5 = 0;
                    this.A02 = 0;
                    i4 = 0;
                }
                int i6 = i3 + i2;
                int length = bArr2.length;
                if (i6 > length) {
                    int i7 = this.A00;
                    int i8 = i3 - i7;
                    int i9 = i8;
                    if (i7 == -1) {
                        i8 = i3 - i4;
                    }
                    int i10 = length - i8;
                    if (i10 < i2) {
                        length += ((int) Math.ceil(((double) (i2 - i10)) / 1024.0d)) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                    byte[] bArr3 = new byte[length];
                    if (i7 == -1) {
                        i3 -= i4;
                        System.arraycopy(bArr2, i4, bArr3, 0, i3);
                        this.A02 = 0;
                        this.A01 = i3;
                        this.A00 = -1;
                    } else {
                        System.arraycopy(bArr2, i7, bArr3, 0, i9);
                        int i11 = this.A02;
                        int i12 = this.A00;
                        this.A02 = i11 - i12;
                        i3 = this.A01 - i12;
                        this.A01 = i3;
                        this.A00 = 0;
                    }
                    this.A03 = bArr3;
                    bArr2 = bArr3;
                }
                System.arraycopy(bArr, 0, bArr2, i3, i2);
                this.A01 += i2;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Len ");
            A0u.append(i2);
            throw C90464aC.A0M(" exceeds supplied buffer limits.", A0u);
        }
    }

    public synchronized void mark(int i) {
        A00();
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized void reset() {
        IOException iOException;
        if (this.A03 != null) {
            int i = this.A00;
            if (i != -1) {
                this.A02 = i;
                this.A00 = -1;
            } else {
                iOException = C90524aI.A0X("No marked position found.");
            }
        } else {
            iOException = C90524aI.A0X("Stream is closed.");
        }
        throw iOException;
    }

    public int available() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A01 - this.A02;
    }

    public void close() {
        if (this.A03 != null) {
            super.close();
            this.A03 = null;
            this.A01 = 0;
            this.A02 = 0;
            this.A00 = -1;
            return;
        }
        throw C90524aI.A0X("Stream is already closed.");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw C90524aI.A0X("Dst buffer is null");
        } else if (i2 == 0) {
            return i2;
        } else {
            if (i + i2 <= bArr.length) {
                int available = available();
                if (available < 1) {
                    return available;
                }
                int min = Math.min(available, i2);
                System.arraycopy(this.A03, this.A02, bArr, i, min);
                this.A02 += min;
                return min;
            }
            throw C90524aI.A0X("Not enough space in destination buffer.");
        }
    }

    public long skip(long j) {
        if (this.A03 == null) {
            throw C90524aI.A0X("Stream is closed.");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = ((long) this.A02) + j;
            int i = this.A01;
            if (j2 >= ((long) i)) {
                int available = available();
                this.A02 = i;
                return (long) available;
            }
            this.A02 = (int) j2;
            return j;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw C90524aI.A0X("Dst buffer is null");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw C90524aI.A0X("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }
}
