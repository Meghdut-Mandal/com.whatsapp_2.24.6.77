package X;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6Ws  reason: invalid class name */
public class AnonymousClass6Ws {
    public static final char[] A07 = {'N', 'E', 'T', 'S', 'C', 'A', 'P', 'E', '2', '.', '0'};
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02;
    public final InputStream A03;
    public final OutputStream A04;
    public final List A05 = AnonymousClass001.A0I();
    public final byte[] A06 = new byte[256];

    public static int A00(AnonymousClass6Ws r2) {
        int read = r2.A03.read();
        r2.A00++;
        if (read != -1) {
            return read;
        }
        throw new EOFException("Unexpected end of gif file");
    }

    public static int A01(AnonymousClass6Ws r3, int i, int i2) {
        OutputStream outputStream;
        InputStream inputStream = r3.A03;
        byte[] bArr = r3.A06;
        int read = inputStream.read(bArr, i, i2);
        r3.A00 += i2;
        if (r3.A02 && (outputStream = r3.A04) != null) {
            outputStream.write(bArr, i, i2);
        }
        if (read != -1) {
            return read;
        }
        throw new EOFException("Unexpected end of gif file");
    }

    public static void A02(AnonymousClass6Ws r6, int i) {
        OutputStream outputStream;
        if (!r6.A02 || (outputStream = r6.A04) == null) {
            r6.A03.skip((long) i);
        } else {
            InputStream inputStream = r6.A03;
            int i2 = i;
            while (i2 > 0) {
                byte[] bArr = r6.A06;
                i2 -= 256;
                outputStream.write(bArr, 0, inputStream.read(bArr, 0, Math.min(256, i2)));
            }
        }
        r6.A00 += i;
    }

    public static void A03(AnonymousClass6Ws r1, int i) {
        OutputStream outputStream;
        if (r1.A02 && (outputStream = r1.A04) != null) {
            outputStream.write(i);
        }
    }

    public void A04() {
        char c;
        int A002;
        OutputStream outputStream;
        if (!this.A01) {
            this.A01 = true;
            boolean z = false;
            A01(this, 0, 6);
            byte[] bArr = this.A06;
            if ('G' == ((char) bArr[0]) && 'I' == ((char) bArr[1]) && 'F' == ((char) bArr[2]) && '8' == ((char) bArr[3]) && (('7' == (c = (char) bArr[4]) || '9' == c) && 'a' == ((char) bArr[5]))) {
                A02(this, 4);
                int A003 = A00(this);
                A03(this, A003);
                if ((A003 & 128) != 0) {
                    z = true;
                }
                int i = 2 << (A003 & 7);
                A02(this, 2);
                if (z) {
                    A02(this, i * 3);
                }
                int[] iArr = {0, 0};
                while (true) {
                    A002 = A00(this);
                    A03(this, A002);
                    if (A002 != 33) {
                        if (A002 == 44) {
                            this.A05.add(Arrays.copyOf(iArr, 2));
                            A02(this, 8);
                            int A004 = A00(this);
                            A03(this, A004);
                            if ((A004 & 128) != 0) {
                                A02(this, (2 << (A004 & 7)) * 3);
                            }
                            A02(this, 1);
                            while (true) {
                                int A005 = A00(this);
                                A03(this, A005);
                                int i2 = 0;
                                if (A005 <= 0) {
                                    break;
                                }
                                do {
                                    i2 += A01(this, i2, A005 - i2);
                                } while (i2 < A005);
                            }
                        } else {
                            break;
                        }
                    } else {
                        int A006 = A00(this);
                        A03(this, A006);
                        if (A006 == 1) {
                            this.A05.add(Arrays.copyOf(iArr, 2));
                        } else if (A006 == 249) {
                            A02(this, 1);
                            int A007 = A00(this);
                            A03(this, A007);
                            iArr[0] = (A007 & 28) >> 2;
                            int A008 = (A00(this) | (A00(this) << 8)) * 10;
                            iArr[1] = A008;
                            if (A008 == 0) {
                                iArr[1] = 100;
                                if (!this.A02 && (outputStream = this.A04) != null) {
                                    this.A02 = true;
                                    InputStream inputStream = this.A03;
                                    if (inputStream instanceof FileInputStream) {
                                        ((FileInputStream) inputStream).getChannel().position(0);
                                    } else {
                                        inputStream.reset();
                                    }
                                    int i3 = this.A00 - 2;
                                    while (i3 > 0) {
                                        i3 -= 256;
                                        outputStream.write(bArr, 0, inputStream.read(bArr, 0, Math.min(256, i3)));
                                    }
                                    inputStream.skip(2);
                                }
                            }
                            int i4 = iArr[1] / 10;
                            A03(this, i4);
                            A03(this, i4 >> 8);
                            A02(this, 2);
                        } else if (A006 == 255) {
                            int A009 = A00(this);
                            A03(this, A009);
                            int i5 = 0;
                            if (A009 > 0) {
                                do {
                                    i5 += A01(this, i5, A009 - i5);
                                } while (i5 < A009);
                            }
                            char[] cArr = A07;
                            int i6 = 0;
                            while (true) {
                                if (cArr[i6] != ((char) bArr[i6])) {
                                    break;
                                }
                                i6++;
                                if (i6 >= 11) {
                                    while (true) {
                                        int A0010 = A00(this);
                                        A03(this, A0010);
                                        int i7 = 0;
                                        if (A0010 <= 0) {
                                            break;
                                        }
                                        do {
                                            i7 += A01(this, i7, A0010 - i7);
                                        } while (i7 < A0010);
                                    }
                                }
                            }
                        }
                        while (true) {
                            int A0011 = A00(this);
                            A03(this, A0011);
                            int i8 = 0;
                            if (A0011 <= 0) {
                                break;
                            }
                            do {
                                i8 += A01(this, i8, A0011 - i8);
                            } while (i8 < A0011);
                        }
                    }
                }
                if (A002 != 59) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unknown block header [");
                    C90504aG.A0z(A002, A0u);
                    throw C90464aC.A0M("]", A0u);
                }
                return;
            }
            throw C90524aI.A0X("Illegal header for gif");
        }
        throw AnonymousClass001.A09("extract called multiple times");
    }

    public AnonymousClass6Ws(InputStream inputStream, OutputStream outputStream) {
        this.A03 = inputStream;
        this.A04 = outputStream;
    }
}
