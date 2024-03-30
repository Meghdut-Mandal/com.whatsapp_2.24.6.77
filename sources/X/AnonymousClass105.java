package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

/* renamed from: X.105  reason: invalid class name */
public class AnonymousClass105 {
    public char A00;
    public int A01 = -1;
    public boolean A02 = true;
    public boolean A03 = false;
    public char A04;
    public int A05;
    public RandomAccessFile A06;
    public final String A07;
    public final byte[] A08;

    public void A04() {
        this.A02 = true;
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
            } catch (IOException unused) {
                A03();
            }
        }
        if (this.A06 == null) {
            try {
                this.A06 = new RandomAccessFile(this.A07, "r");
            } catch (IOException unused2) {
                this.A02 = false;
                A03();
            }
        }
        if (this.A02) {
            this.A01 = -1;
            this.A05 = 0;
            this.A00 = 0;
            this.A04 = 0;
            this.A03 = false;
        }
    }

    public AnonymousClass105(String str) {
        this.A07 = str;
        this.A08 = new byte[512];
    }

    private void A01() {
        if (!this.A03) {
            this.A01--;
            this.A00 = this.A04;
            this.A03 = true;
            return;
        }
        throw new C21800zp("Can only rewind one step!");
    }

    public long A02() {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (A08()) {
                A00();
                if (!Character.isDigit(this.A00)) {
                    if (!z) {
                        A01();
                        break;
                    } else if (this.A00 == '-') {
                        j = -1;
                    } else {
                        throw new C21800zp("Couldn't read number!");
                    }
                } else {
                    j2 = (j2 * 10) + ((long) (this.A00 - '0'));
                }
                z = false;
            } else if (z) {
                throw new C21800zp("Couldn't read number because the file ended!");
            }
        }
        return j * j2;
    }

    public void A03() {
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A06 = null;
                throw th;
            }
            this.A06 = null;
        }
    }

    public void A05() {
        boolean z = false;
        while (A08()) {
            A00();
            if (this.A00 == 10) {
                z = true;
            } else if (z) {
                A01();
                return;
            }
        }
    }

    public void A06() {
        boolean z = false;
        while (A08()) {
            A00();
            if (this.A00 == ' ') {
                z = true;
            } else if (z) {
                A01();
                return;
            }
        }
    }

    public boolean A08() {
        RandomAccessFile randomAccessFile;
        if (this.A02 && (randomAccessFile = this.A06) != null) {
            int i = this.A01;
            int i2 = this.A05;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.A05 = randomAccessFile.read(this.A08);
                    this.A01 = -1;
                } catch (IOException unused) {
                    this.A02 = false;
                    A03();
                }
                return A08();
            }
        }
        return false;
    }

    private void A00() {
        if (A08()) {
            int i = this.A01 + 1;
            this.A01 = i;
            this.A04 = this.A00;
            this.A00 = (char) this.A08[i];
            this.A03 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public void A07(CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z = true;
        while (true) {
            if (A08()) {
                A00();
                if (!Character.isWhitespace(this.A00)) {
                    if (!charBuffer.hasRemaining()) {
                        CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                        charBuffer.flip();
                        allocate.put(charBuffer);
                        charBuffer = allocate;
                    }
                    charBuffer.put(this.A00);
                    z = false;
                } else if (!z) {
                    A01();
                } else {
                    throw new C21800zp("Couldn't read string!");
                }
            } else if (z) {
                throw new C21800zp("Couldn't read string because file ended!");
            }
        }
        charBuffer.flip();
    }

    public void finalize() {
        A03();
    }
}
