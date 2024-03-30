package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.1CT  reason: invalid class name */
public class AnonymousClass1CT {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final C20940yP A03 = new C20940yP();
    public final AnonymousClass1CE A04;
    public final AnonymousClass1CC A05;
    public final C19760wT A06;
    public final C20900yL A07;

    public byte[] A06(int i) {
        if (i == 1) {
            AnonymousClass1CD r1 = this.A05.A05[this.A02];
            int i2 = r1.A00;
            return new byte[]{(byte) r1.A02, (byte) i2, (byte) (i2 >> 8)};
        }
        AnonymousClass1CD r2 = this.A05.A05[this.A02];
        int i3 = r2.A00;
        return new byte[]{(byte) r2.A02, (byte) i3, (byte) (i3 >> 8), (byte) r2.A05};
    }

    public final int A00() {
        if (this.A02 == this.A05.A01) {
            return this.A00;
        }
        throw new UnsupportedOperationException("No event count available for rotated buffers");
    }

    public void A01() {
        AnonymousClass1CE r4 = this.A04;
        r4.A02.clear();
        r4.A01 = 0;
        r4.A03.reset();
        r4.A00 = 0;
        AnonymousClass1CD r2 = this.A05.A05[this.A02];
        r2.A01 = r4.A01;
        r2.A04 = 0;
        r2.A02 = 1;
        r2.A00 = 0;
        r2.A03 = r4.A01();
        this.A01 = 0;
        this.A00 = 0;
        this.A03.A00.clear();
    }

    public void A02() {
        try {
            AnonymousClass1CE r3 = this.A04;
            r3.A03();
            AnonymousClass1CD r2 = this.A05.A05[this.A02];
            r2.A01 = r3.A01;
            r2.A03 = r3.A01();
        } catch (IOException e) {
            C20900yL r1 = this.A07;
            r1.A0B = true;
            r1.A05();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e);
            throw e;
        }
    }

    public void A03() {
        try {
            AnonymousClass1CE r6 = this.A04;
            AnonymousClass1CC r8 = this.A05;
            AnonymousClass1CD[] r9 = r8.A05;
            int i = this.A02;
            r6.A04(r9[i].A01);
            boolean z = true;
            boolean z2 = false;
            if (r6.A02.position() == r9[i].A01) {
                z2 = true;
            }
            Log.a(z2);
            if (r6.A01 != r9[i].A01) {
                z = false;
            }
            Log.a(z);
            int i2 = (r6.A01() > r9[i].A03 ? 1 : (r6.A01() == r9[i].A03 ? 0 : -1));
            boolean z3 = false;
            if (i == r8.A01) {
                z3 = true;
            }
            if (i2 != 0) {
                C20900yL r1 = this.A07;
                if (z3) {
                    r1.A04 = true;
                } else {
                    r1.A09 = true;
                }
                throw new AnonymousClass1CK("Invalid checksum");
            } else if (z3) {
                this.A01 = 0;
                this.A00 = 0;
                C20940yP r5 = this.A03;
                r5.A00.clear();
                ByteBuffer A022 = r6.A02();
                if (A022.limit() != 0) {
                    byte[][] bArr = AnonymousClass1CV.A00;
                    byte[] bArr2 = new byte[bArr[2].length];
                    try {
                        A022.get(bArr2);
                        int i3 = 0;
                        while (!Arrays.equals(bArr2, bArr[i3])) {
                            i3++;
                            if (i3 >= 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Invalid value: ");
                                sb.append(bArr2);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        if (i3 >= 0) {
                            if (i3 >= 1) {
                                A022.get(A06(i3));
                            }
                            while (A022.position() < A022.limit()) {
                                try {
                                    AnonymousClass1CX A032 = AnonymousClass1CW.A03(A022);
                                    this.A01++;
                                    int i4 = A032.A01;
                                    if (i4 == 1) {
                                        this.A00++;
                                    } else if (i4 == 0) {
                                        r5.A00(A032.A00, A032.A02);
                                    }
                                } catch (AnonymousClass1CU e) {
                                    throw new AnonymousClass1CK(e.toString());
                                }
                            }
                            return;
                        }
                        throw new AnonymousClass1CK("Invalid event buffer header");
                    } catch (BufferUnderflowException unused) {
                        throw new AnonymousClass1CK("Event buffer does not have a header");
                    }
                }
            }
        } catch (IOException e2) {
            throw new AnonymousClass1CK(e2.toString());
        }
    }

    public final void A04(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.A04.A02;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(AnonymousClass1CV.A00[2]);
            AnonymousClass1CC r5 = this.A05;
            AnonymousClass1CD r4 = r5.A05[this.A02];
            int i2 = r5.A00 + 1;
            r5.A00 = i2;
            if (i2 > 65535) {
                r5.A00 = 1;
                i2 = 1;
            }
            r4.A00 = i2;
            byteBuffer.put(A06(2));
        }
        int min = Math.min(bArr.length, i);
        if (min <= byteBuffer.remaining()) {
            byteBuffer.put(bArr, 0, min);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not enough space in the buffer lenToWrite = ");
        sb.append(min);
        sb.append(" remaining = ");
        sb.append(byteBuffer.remaining());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final boolean A05() {
        if (this.A04.A02.position() == 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass1CT(C19760wT r5, AnonymousClass1CC r6, C20900yL r7, RandomAccessFile randomAccessFile, int i, int i2) {
        AnonymousClass1CE r2;
        int i3 = 65536;
        int i4 = (i * 65536) + 65536;
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = (i * 16384) + 65536;
                i3 = 16384;
            } else {
                r2 = new AnonymousClass1CE(r7, randomAccessFile, (i * 32768) + 65536, 32768);
                this.A04 = r2;
                this.A02 = i;
                this.A05 = r6;
                this.A07 = r7;
                this.A06 = r5;
            }
        }
        r2 = new AnonymousClass1CE(r7, randomAccessFile, i4, i3);
        this.A04 = r2;
        this.A02 = i;
        this.A05 = r6;
        this.A07 = r7;
        this.A06 = r5;
    }
}
