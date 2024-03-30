package X;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.8xI  reason: invalid class name and case insensitive filesystem */
public class C187118xI extends FilterInputStream {
    public final int A00;
    public final boolean A01 = false;
    public final byte[][] A02 = new byte[11][];

    public static int A00(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 == 31) {
            int i3 = 0;
            int read = inputStream.read();
            if ((read & 127) == 0) {
                throw C90524aI.A0X("corrupted stream - invalid high tag number found");
            }
            while (read >= 0) {
                i2 = i3 | (read & 127);
                if ((read & 128) != 0) {
                    i3 = i2 << 7;
                    read = inputStream.read();
                }
            }
            throw new EOFException("EOF found inside tag value.");
        }
        return i2;
    }

    public static C202169lB A02(C22688Ass ass) {
        if (ass.A00 < 1) {
            return new C202169lB(0);
        }
        C187118xI r1 = new C187118xI((InputStream) ass);
        C202169lB r2 = new C202169lB();
        while (true) {
            AnonymousClass121 A06 = r1.A06();
            if (A06 == null) {
                return r2;
            }
            r2.A06(A06);
        }
    }

    public static C187118xI A03(StringBuffer stringBuffer, C22659AsP asP, C22634As0 as0) {
        C187118xI r1 = new C187118xI(asP.A00);
        stringBuffer.append("                       critical(");
        stringBuffer.append(as0.A02);
        stringBuffer.append(") ");
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0145, code lost:
        if (r1 != 8) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0147, code lost:
        r7[r3] = (char) ((r5[0] << 8) | (r5[1] & 255));
        r7[r3 + 1] = (char) ((r5[2] << 8) | (r5[3] & 255));
        r7[r3 + 2] = (char) ((r5[4] << 8) | (r5[5] & 255));
        r7[r3 + 3] = (char) ((r5[6] << 8) | (r5[7] & 255));
        r3 = r3 + 4;
        r9 = r9 - 8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a2 A[LOOP:4: B:99:0x01a2->B:100:0x01b4, LOOP_START, PHI: r3 r4 
      PHI: (r3v4 int) = (r3v2 int), (r3v5 int) binds: [B:96:0x019a, B:100:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:96:0x019a, B:100:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass121 A04(X.C22688Ass r10, byte[][] r11, int r12) {
        /*
            r0 = 10
            if (r12 == r0) goto L_0x01d8
            r0 = 12
            if (r12 == r0) goto L_0x01ce
            r0 = 30
            if (r12 == r0) goto L_0x0125
            switch(r12) {
                case 1: goto L_0x00ba;
                case 2: goto L_0x00af;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00a2;
                case 6: goto L_0x0089;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r12) {
                case 18: goto L_0x007f;
                case 19: goto L_0x0075;
                case 20: goto L_0x006b;
                case 21: goto L_0x0061;
                case 22: goto L_0x0057;
                case 23: goto L_0x004d;
                case 24: goto L_0x0043;
                case 25: goto L_0x0039;
                case 26: goto L_0x002f;
                case 27: goto L_0x0025;
                case 28: goto L_0x01f9;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unknown tag "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " encountered"
            java.io.IOException r1 = X.C90464aC.A0M(r0, r1)
            throw r1
        L_0x0025:
            byte[] r0 = r10.A02()
            X.AsT r4 = new X.AsT
            r4.<init>(r0)
            return r4
        L_0x002f:
            byte[] r0 = r10.A02()
            X.AsW r4 = new X.AsW
            r4.<init>(r0)
            return r4
        L_0x0039:
            byte[] r0 = r10.A02()
            X.AsQ r4 = new X.AsQ
            r4.<init>(r0)
            return r4
        L_0x0043:
            byte[] r0 = r10.A02()
            X.AsL r4 = new X.AsL
            r4.<init>((byte[]) r0)
            return r4
        L_0x004d:
            byte[] r0 = r10.A02()
            X.AsG r4 = new X.AsG
            r4.<init>((byte[]) r0)
            return r4
        L_0x0057:
            byte[] r0 = r10.A02()
            X.Asb r4 = new X.Asb
            r4.<init>((byte[]) r0)
            return r4
        L_0x0061:
            byte[] r0 = r10.A02()
            X.AsR r4 = new X.AsR
            r4.<init>(r0)
            return r4
        L_0x006b:
            byte[] r0 = r10.A02()
            X.AsV r4 = new X.AsV
            r4.<init>(r0)
            return r4
        L_0x0075:
            byte[] r0 = r10.A02()
            X.AsY r4 = new X.AsY
            r4.<init>((byte[]) r0)
            return r4
        L_0x007f:
            byte[] r0 = r10.A02()
            X.AsU r4 = new X.AsU
            r4.<init>(r0)
            return r4
        L_0x0089:
            byte[] r2 = A05(r10, r11)
            X.123 r1 = new X.123
            r1.<init>(r2)
            java.util.concurrent.ConcurrentMap r0 = X.AnonymousClass122.A02
            java.lang.Object r4 = r0.get(r1)
            X.121 r4 = (X.AnonymousClass121) r4
            if (r4 != 0) goto L_0x0202
            X.122 r4 = new X.122
            r4.<init>((byte[]) r2)
            return r4
        L_0x00a2:
            X.ArI r4 = X.C22590ArI.A00
            return r4
        L_0x00a5:
            byte[] r0 = r10.A02()
            X.AsA r4 = new X.AsA
            r4.<init>(r0)
            return r4
        L_0x00af:
            byte[] r1 = r10.A02()
            r0 = 0
            X.AsK r4 = new X.AsK
            r4.<init>(r1, r0)
            return r4
        L_0x00ba:
            byte[] r2 = A05(r10, r11)
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x00d6
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 == r0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d0
            X.AsJ r4 = new X.AsJ
            r4.<init>(r1)
            return r4
        L_0x00d0:
            X.AsJ r4 = X.C22653AsJ.A01
            return r4
        L_0x00d3:
            X.AsJ r4 = X.C22653AsJ.A02
            return r4
        L_0x00d6:
            java.lang.String r0 = "BOOLEAN value should have 1 byte in it"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00dd:
            int r5 = r10.A00
            r4 = 1
            if (r5 < r4) goto L_0x011e
            int r3 = r10.read()
            int r5 = r5 - r4
            byte[] r2 = new byte[r5]
            if (r5 == 0) goto L_0x0118
            r1 = 0
        L_0x00ec:
            if (r1 >= r5) goto L_0x00f8
            int r0 = r5 - r1
            int r0 = r10.read(r2, r1, r0)
            if (r0 < 0) goto L_0x00f8
            int r1 = r1 + r0
            goto L_0x00ec
        L_0x00f8:
            if (r1 != r5) goto L_0x0110
            if (r3 <= 0) goto L_0x0118
            r0 = 8
            if (r3 >= r0) goto L_0x0118
            int r5 = r5 - r4
            byte r1 = r2[r5]
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 << r3
            r0 = r0 & r1
            byte r0 = (byte) r0
            if (r1 == r0) goto L_0x0118
            X.ArD r4 = new X.ArD
            r4.<init>(r2, r3)
            return r4
        L_0x0110:
            java.lang.String r0 = "EOF encountered in middle of BIT STRING"
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r0)
            throw r1
        L_0x0118:
            X.ArE r4 = new X.ArE
            r4.<init>(r2, r3)
            return r4
        L_0x011e:
            java.lang.String r0 = "truncated BIT STRING detected"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x0125:
            int r9 = r10.A00
            r0 = r9 & 1
            if (r0 != 0) goto L_0x01c7
            int r8 = r9 / 2
            char[] r7 = new char[r8]
            r6 = 8
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0135:
            java.lang.String r2 = "EOF encountered in middle of BMPString"
            if (r9 < r6) goto L_0x018b
            r1 = 0
        L_0x013a:
            int r0 = r6 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x0185
            int r1 = r1 + r0
            if (r1 < r6) goto L_0x013a
            if (r1 != r6) goto L_0x0185
            byte r1 = r5[r4]
            int r1 = r1 << r6
            r0 = 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r3] = r0
            int r2 = r3 + 1
            r0 = 2
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 3
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 2
            r0 = 4
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 5
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 3
            r0 = 6
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 7
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r3 = r3 + 4
            int r9 = r9 + -8
            goto L_0x0135
        L_0x0185:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r2)
            throw r1
        L_0x018b:
            if (r9 <= 0) goto L_0x01b6
            r1 = 0
        L_0x018e:
            int r0 = r9 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x019a
            int r1 = r1 + r0
            if (r1 >= r9) goto L_0x019a
            goto L_0x018e
        L_0x019a:
            if (r1 == r9) goto L_0x01a2
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            int r0 = r4 + 1
            byte r2 = r5[r4]
            int r2 = r2 << r6
            int r4 = r0 + 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r2 = r2 | r0
            char r0 = (char) r2
            r7[r3] = r0
            r3 = r1
            if (r4 < r9) goto L_0x01a2
        L_0x01b6:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x01c2
            if (r8 != r3) goto L_0x01c2
            X.AsS r4 = new X.AsS
            r4.<init>(r7)
            return r4
        L_0x01c2:
            java.lang.IllegalStateException r1 = X.C165617ti.A0V()
            throw r1
        L_0x01c7:
            java.lang.String r0 = "malformed BMPString encoding encountered"
            java.io.IOException r1 = X.C90524aI.A0X(r0)
            throw r1
        L_0x01ce:
            byte[] r0 = r10.A02()
            X.AsZ r4 = new X.AsZ
            r4.<init>((byte[]) r0)
            return r4
        L_0x01d8:
            byte[] r3 = A05(r10, r11)
            int r1 = r3.length
            r0 = 1
            if (r1 > r0) goto L_0x020a
            if (r1 == 0) goto L_0x0203
            r0 = 0
            byte r0 = r3[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            X.AsI[] r1 = X.C22652AsI.A02
            r0 = 12
            if (r2 >= r0) goto L_0x020a
            r4 = r1[r2]
            if (r4 != 0) goto L_0x0202
            X.AsI r4 = new X.AsI
            r4.<init>((byte[]) r3)
            r1[r2] = r4
            return r4
        L_0x01f9:
            byte[] r0 = r10.A02()
            X.Asa r4 = new X.Asa
            r4.<init>(r0)
        L_0x0202:
            return r4
        L_0x0203:
            java.lang.String r0 = "ENUMERATED has zero length"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x020a:
            X.AsI r4 = new X.AsI
            r4.<init>((byte[]) r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187118xI.A04(X.Ass, byte[][], int):X.121");
    }

    public static byte[] A05(C22688Ass ass, byte[][] bArr) {
        int i = ass.A00;
        if (i >= bArr.length) {
            return ass.A02();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length = bArr2.length;
        if (i != length) {
            throw AnonymousClass001.A08("buffer length not right for data");
        } else if (i == 0) {
            return bArr2;
        } else {
            int i2 = ass.A00;
            if (i < i2) {
                InputStream inputStream = ass.A01;
                int i3 = 0;
                while (i3 < length) {
                    int read = inputStream.read(bArr2, i3, length - i3);
                    if (read < 0) {
                        break;
                    }
                    i3 += read;
                }
                int i4 = i - i3;
                ass.A00 = i4;
                if (i4 == 0) {
                    ass.A01();
                    return bArr2;
                }
                throw new EOFException(AnonymousClass000.A0r(" object truncated by ", C22688Ass.A00(ass), i4));
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("corrupted stream - out of bounds length found: ");
            A0u.append(i);
            throw C90524aI.A0X(AnonymousClass000.A0r(" >= ", A0u, i2));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C187118xI(byte[] r4, boolean r5) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.C90524aI.A0P(r4)
            int r1 = r4.length
            r0 = 1
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187118xI.<init>(byte[], boolean):void");
    }

    public static int A01(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    read = 0;
                    int i3 = 0;
                    while (i3 < i2) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            read = (read << 8) + read2;
                            i3++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (read < 0) {
                        throw C90524aI.A0X("corrupted stream - negative length found");
                    } else if (read >= i && !z) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("corrupted stream - out of bounds length found: ");
                        A0u.append(read);
                        throw C90524aI.A0X(AnonymousClass000.A0r(" >= ", A0u, i));
                    }
                } else {
                    throw C90524aI.A0X(AnonymousClass000.A0r("DER length more than 4 bytes: ", AnonymousClass000.A0u(), i2));
                }
            }
            return read;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.AsP[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass121 A06() {
        /*
            r8 = this;
            int r7 = r8.read()
            if (r7 > 0) goto L_0x0011
            if (r7 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.String r0 = "unexpected end-of-contents marker"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0011:
            int r4 = A00(r8, r7)
            r2 = r7 & 32
            boolean r1 = X.AnonymousClass000.A1P(r2)
            int r3 = r8.A00
            r0 = 0
            int r0 = A01(r8, r3, r0)
            if (r0 >= 0) goto L_0x008d
            if (r1 == 0) goto L_0x0086
            X.Asr r0 = new X.Asr
            r0.<init>(r8, r3)
            X.9WM r1 = new X.9WM
            r1.<init>(r0, r3)
            r0 = r7 & 64
            if (r0 == 0) goto L_0x003e
            X.AZV r0 = new X.AZV
            r0.<init>(r1, r4)
            X.121 r0 = r0.BDb()
            return r0
        L_0x003e:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            X.AsO r0 = r1.A02(r4, r0)
            return r0
        L_0x0048:
            r0 = 4
            if (r4 == r0) goto L_0x007c
            r0 = 8
            if (r4 == r0) goto L_0x0072
            r0 = 16
            if (r4 == r0) goto L_0x0068
            r0 = 17
            if (r4 != r0) goto L_0x0061
            X.AZb r0 = new X.AZb
            r0.<init>(r1)
            X.121 r0 = r0.BDb()
            return r0
        L_0x0061:
            java.lang.String r0 = "unknown BER object encountered"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0068:
            X.AZZ r0 = new X.AZZ
            r0.<init>(r1)
            X.121 r0 = r0.BDb()
            return r0
        L_0x0072:
            X.AZU r0 = new X.AZU
            r0.<init>(r1)
            X.121 r0 = r0.BDb()
            return r0
        L_0x007c:
            X.AZX r0 = new X.AZX
            r0.<init>(r1)
            X.121 r0 = r0.BDb()
            return r0
        L_0x0086:
            java.lang.String r0 = "indefinite-length primitive encoding encountered"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x008d:
            r6 = 0
            boolean r5 = X.AnonymousClass000.A1P(r2)
            X.Ass r2 = new X.Ass     // Catch:{ IllegalArgumentException -> 0x014b }
            r2.<init>(r8, r0, r3)     // Catch:{ IllegalArgumentException -> 0x014b }
            r0 = r7 & 64
            if (r0 == 0) goto L_0x00a5
            byte[] r0 = r2.A02()     // Catch:{ IllegalArgumentException -> 0x014b }
            X.ArC r3 = new X.ArC     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>(r0, r4, r5)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x00a5:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00b7
            int r1 = X.C201849kY.A02(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            X.9WM r0 = new X.9WM     // Catch:{ IllegalArgumentException -> 0x014b }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x014b }
            X.AsO r3 = r0.A02(r4, r5)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x00b7:
            if (r5 == 0) goto L_0x0144
            r0 = 4
            if (r4 == r0) goto L_0x0117
            r0 = 8
            if (r4 == r0) goto L_0x010d
            r0 = 16
            if (r4 == r0) goto L_0x00ed
            r0 = 17
            if (r4 != r0) goto L_0x00da
            X.9lB r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x014b }
            r0 = 1
            if (r1 >= r0) goto L_0x00d4
            X.AsN r3 = X.C190819Ak.A01     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x00d4:
            X.Ash r3 = new X.Ash     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>((X.C202169lB) r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x014b }
            java.lang.String r0 = "unknown tag "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x014b }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x014b }
            java.lang.String r0 = " encountered"
            java.io.IOException r1 = X.C90464aC.A0M(r0, r1)     // Catch:{ IllegalArgumentException -> 0x014b }
            goto L_0x013d
        L_0x00ed:
            boolean r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r0 == 0) goto L_0x00fb
            byte[] r0 = r2.A02()     // Catch:{ IllegalArgumentException -> 0x014b }
            X.Asc r3 = new X.Asc     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x00fb:
            X.9lB r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x014b }
            r0 = 1
            if (r1 >= r0) goto L_0x0107
            X.AsM r3 = X.C190819Ak.A00     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x0107:
            X.Ase r3 = new X.Ase     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>((X.C202169lB) r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x010d:
            X.9lB r0 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            X.ArF r3 = new X.ArF     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x0117:
            X.9lB r4 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x014b }
            int r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x014b }
            X.AsP[] r1 = new X.C22659AsP[r3]     // Catch:{ IllegalArgumentException -> 0x014b }
        L_0x011f:
            if (r6 == r3) goto L_0x013e
            X.11z r2 = r4.A05(r6)     // Catch:{ IllegalArgumentException -> 0x014b }
            boolean r0 = r2 instanceof X.C22659AsP     // Catch:{ IllegalArgumentException -> 0x014b }
            if (r0 == 0) goto L_0x012e
            r1[r6] = r2     // Catch:{ IllegalArgumentException -> 0x014b }
            int r6 = r6 + 1
            goto L_0x011f
        L_0x012e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x014b }
            java.lang.String r0 = "unknown object encountered in constructed OCTET STRING: "
            java.lang.String r0 = X.C165567td.A0W(r2, r0, r1)     // Catch:{ IllegalArgumentException -> 0x014b }
            X.8xh r1 = new X.8xh     // Catch:{ IllegalArgumentException -> 0x014b }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x014b }
        L_0x013d:
            throw r1     // Catch:{ IllegalArgumentException -> 0x014b }
        L_0x013e:
            X.AsB r3 = new X.AsB     // Catch:{ IllegalArgumentException -> 0x014b }
            r3.<init>((X.C22659AsP[]) r1)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x0144:
            byte[][] r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x014b }
            X.121 r3 = A04(r2, r0, r4)     // Catch:{ IllegalArgumentException -> 0x014b }
            return r3
        L_0x014b:
            r2 = move-exception
            java.lang.String r1 = "corrupted stream detected"
            X.8xh r0 = new X.8xh
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187118xI.A06():X.121");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C187118xI(byte[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = X.C90524aI.A0P(r4)
            int r1 = r4.length
            r0 = 0
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187118xI.<init>(byte[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C187118xI(InputStream inputStream) {
        super(inputStream);
        int A022 = C201849kY.A02(inputStream);
        this.A00 = A022;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C187118xI(InputStream inputStream, boolean z) {
        super(inputStream);
        int A022 = C201849kY.A02(inputStream);
        this.A00 = A022;
    }
}
