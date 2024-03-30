package X;

import java.io.IOException;

public final class A00 implements B2j {
    public final int A00;
    public final /* synthetic */ C209379zu A01;

    public A00(C209379zu r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public boolean BMw() {
        C209379zu r2 = this.A01;
        int i = this.A00;
        if (C209379zu.A04(r2)) {
            return false;
        }
        if (r2.A0B || r2.A0H[i].A09.A01()) {
            return true;
        }
        return false;
    }

    public void BPd() {
        IOException iOException;
        C209379zu r0 = this.A01;
        C198829eG r1 = r0.A0T;
        int i = r0.A00;
        IOException iOException2 = r1.A01;
        if (iOException2 == null) {
            C166117v3 r02 = r1.A00;
            if (r02 != null && (iOException = r02.A01) != null && r02.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        X.C209379zu.A03(r8, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (X.AnonymousClass000.A1S(r9.A00 & 4, 4) != false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r9.A00 >= r2) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        r9.A00 = Integer.MIN_VALUE | r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (X.AnonymousClass000.A1S(r9.A00 & 1073741824, 1073741824) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        r4 = r6.A01;
        r2 = r7.A0C;
        r2.A0G(1);
        X.C209179za.A02(r7, r2.A02, 1, r4);
        r4 = r4 + 1;
        r12 = 0;
        r1 = r2.A02[0];
        r3 = X.AnonymousClass000.A1P(r1 & 128);
        r1 = r1 & Byte.MAX_VALUE;
        r11 = r9.A03;
        r0 = r11.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r0 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        r0 = new byte[16];
        r11.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        X.C209179za.A02(r7, r0, r1, r4);
        r4 = r4 + ((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r3 == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        r2.A0G(2);
        X.C209179za.A02(r7, r2.A02, 2, r4);
        r4 = r4 + 2;
        r14 = r2.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
        r13 = r11.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
        if (r13 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        if (r13.length >= r14) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r13 = new int[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
        r10 = r11.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f4, code lost:
        if (r10 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        if (r10.length >= r14) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        r10 = new int[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        if (r3 == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r1 = r14 * 6;
        r2.A0G(r1);
        X.C209179za.A02(r7, r2.A02, r1, r4);
        r4 = r4 + ((long) r1);
        r2.A0I(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010c, code lost:
        if (r12 >= r14) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        r13[r12] = r2.A06();
        r10[r12] = r2.A05();
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011d, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        r13[0] = 0;
        r10[0] = r6.A00 - ((int) (r4 - r6.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        r0 = r6.A02;
        r15 = r0.A03;
        r12 = r11.A04;
        r1 = r0.A01;
        r3 = r0.A02;
        r2 = r0.A00;
        r11.A03 = r14;
        r11.A06 = r13;
        r11.A07 = r10;
        r11.A05 = r15;
        r11.A04 = r12;
        r11.A02 = r1;
        r11.A01 = r3;
        r11.A00 = r2;
        r0 = r11.A08;
        r0.numSubSamples = r14;
        r0.numBytesOfClearData = r13;
        r0.numBytesOfEncryptedData = r10;
        r0.key = r15;
        r0.iv = r12;
        r0.mode = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A00 < 24) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        r0 = r11.A09;
        java.util.Objects.requireNonNull(r0);
        X.C197519bq.A00(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r0 = r6.A01;
        r10 = (int) (r4 - r0);
        r6.A01 = r0 + ((long) r10);
        r6.A00 -= r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0170, code lost:
        r9.A00(r6.A00);
        r1 = r6.A01;
        r9 = r9.A01;
        r10 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017b, code lost:
        r5 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0181, code lost:
        if (r1 < r5.A00) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0183, code lost:
        r7.A05 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0188, code lost:
        if (r10 <= 0) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018a, code lost:
        r12 = java.lang.Math.min(r10, (int) (r5.A00 - r1));
        r9.put(r5.A03.A00, (int) (r1 - r5.A01), r12);
        r10 = r10 - r12;
        r1 = r1 + ((long) r12);
        r5 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a7, code lost:
        if (r1 != r5.A00) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        r5 = r5.A02;
        r7.A05 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
        r2 = r8.A0H[r17].A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b8, code lost:
        if (r2.A01() != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ba, code lost:
        r1 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        X.C209379zu.A02(r1, r8, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c1, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c2, code lost:
        r1 = r2.A04 + r2.A03;
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c9, code lost:
        if (r1 < r0) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cb, code lost:
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cc, code lost:
        r1 = r2.A0F[r1];
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x01d1=Splitter:B:81:0x01d1, B:28:0x0062=Splitter:B:28:0x0062} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bms(X.C190989Bd r19, X.AnonymousClass82Z r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            X.9zu r8 = r0.A01
            int r0 = r0.A00
            r17 = r0
            boolean r0 = X.C209379zu.A04(r8)
            if (r0 == 0) goto L_0x0011
            r16 = -3
            return r16
        L_0x0011:
            X.9za[] r0 = r8.A0H
            r7 = r0[r17]
            r10 = 2
            r0 = r21 & 2
            boolean r12 = X.AnonymousClass000.A1S(r0, r10)
            boolean r5 = r8.A0B
            long r2 = r8.A04
            X.9eg r4 = r7.A09
            X.9uY r1 = r7.A02
            X.9J2 r6 = r7.A0A
            monitor-enter(r4)
            boolean r0 = r4.A01()     // Catch:{ all -> 0x01e1 }
            r9 = r20
            if (r0 != 0) goto L_0x003f
            if (r5 == 0) goto L_0x0035
            r0 = 4
            r9.A00 = r0     // Catch:{ all -> 0x01e1 }
            goto L_0x0084
        L_0x0035:
            X.9uY r0 = r4.A07     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0059
            if (r12 != 0) goto L_0x01d5
            if (r0 == r1) goto L_0x0059
            goto L_0x01d5
        L_0x003f:
            int r5 = r4.A03     // Catch:{ all -> 0x01e1 }
            int r11 = r4.A04     // Catch:{ all -> 0x01e1 }
            int r11 = r11 + r5
            int r0 = r4.A01     // Catch:{ all -> 0x01e1 }
            if (r11 < r0) goto L_0x0049
            int r11 = r11 - r0
        L_0x0049:
            if (r12 != 0) goto L_0x01d1
            X.9uY[] r0 = r4.A0F     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            if (r0 != r1) goto L_0x01d1
            java.nio.ByteBuffer r0 = r9.A01     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x0062
            int r0 = r9.A02     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x0062
        L_0x0059:
            monitor-exit(r4)
            r16 = -3
            r0 = r17
            X.C209379zu.A03(r8, r0)
            return r16
        L_0x0062:
            long[] r0 = r4.A0E     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            r9.A00 = r0     // Catch:{ all -> 0x01e1 }
            int[] r0 = r4.A0A     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            r9.A00 = r0     // Catch:{ all -> 0x01e1 }
            int[] r0 = r4.A0B     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            r6.A00 = r0     // Catch:{ all -> 0x01e1 }
            long[] r0 = r4.A0D     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            r6.A01 = r0     // Catch:{ all -> 0x01e1 }
            X.9UL[] r0 = r4.A0G     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
            r6.A02 = r0     // Catch:{ all -> 0x01e1 }
            int r0 = r5 + 1
            r4.A03 = r0     // Catch:{ all -> 0x01e1 }
        L_0x0084:
            monitor-exit(r4)
            r16 = -4
            r1 = 4
            int r0 = r9.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 != 0) goto L_0x01ae
            long r0 = r9.A00
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x009f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r9.A00
            r1 = r1 | r0
            r9.A00 = r1
        L_0x009f:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r9.A00
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0170
            long r4 = r6.A01
            X.9lW r2 = r7.A0C
            r1 = 1
            r2.A0G(r1)
            byte[] r0 = r2.A02
            X.C209179za.A02(r7, r0, r1, r4)
            r0 = 1
            long r4 = r4 + r0
            byte[] r0 = r2.A02
            r12 = 0
            byte r1 = r0[r12]
            r0 = r1 & 128(0x80, float:1.794E-43)
            boolean r3 = X.AnonymousClass000.A1P(r0)
            r1 = r1 & 127(0x7f, float:1.78E-43)
            X.9OC r11 = r9.A03
            byte[] r0 = r11.A04
            if (r0 != 0) goto L_0x00d3
            r0 = 16
            byte[] r0 = new byte[r0]
            r11.A04 = r0
        L_0x00d3:
            X.C209179za.A02(r7, r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            if (r3 == 0) goto L_0x011d
            r2.A0G(r10)
            byte[] r0 = r2.A02
            X.C209179za.A02(r7, r0, r10, r4)
            r0 = 2
            long r4 = r4 + r0
            int r14 = r2.A06()
        L_0x00e9:
            int[] r13 = r11.A06
            if (r13 == 0) goto L_0x00f0
            int r0 = r13.length
            if (r0 >= r14) goto L_0x00f2
        L_0x00f0:
            int[] r13 = new int[r14]
        L_0x00f2:
            int[] r10 = r11.A07
            if (r10 == 0) goto L_0x00f9
            int r0 = r10.length
            if (r0 >= r14) goto L_0x00fb
        L_0x00f9:
            int[] r10 = new int[r14]
        L_0x00fb:
            if (r3 == 0) goto L_0x011f
            int r1 = r14 * 6
            r2.A0G(r1)
            byte[] r0 = r2.A02
            X.C209179za.A02(r7, r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            r2.A0I(r12)
        L_0x010c:
            if (r12 >= r14) goto L_0x012b
            int r0 = r2.A06()
            r13[r12] = r0
            int r0 = r2.A05()
            r10[r12] = r0
            int r12 = r12 + 1
            goto L_0x010c
        L_0x011d:
            r14 = 1
            goto L_0x00e9
        L_0x011f:
            r13[r12] = r12
            int r15 = r6.A00
            long r2 = r6.A01
            long r0 = r4 - r2
            int r2 = (int) r0
            int r15 = r15 - r2
            r10[r12] = r15
        L_0x012b:
            X.9UL r0 = r6.A02
            byte[] r15 = r0.A03
            byte[] r12 = r11.A04
            int r1 = r0.A01
            int r3 = r0.A02
            int r2 = r0.A00
            r11.A03 = r14
            r11.A06 = r13
            r11.A07 = r10
            r11.A05 = r15
            r11.A04 = r12
            r11.A02 = r1
            r11.A01 = r3
            r11.A00 = r2
            android.media.MediaCodec$CryptoInfo r0 = r11.A08
            r0.numSubSamples = r14
            r0.numBytesOfClearData = r13
            r0.numBytesOfEncryptedData = r10
            r0.key = r15
            r0.iv = r12
            r0.mode = r1
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 24
            if (r1 < r0) goto L_0x0163
            X.9bq r0 = r11.A09
            java.util.Objects.requireNonNull(r0)
            X.C197519bq.A00(r0, r3, r2)
        L_0x0163:
            long r0 = r6.A01
            long r4 = r4 - r0
            int r10 = (int) r4
            long r2 = (long) r10
            long r0 = r0 + r2
            r6.A01 = r0
            int r0 = r6.A00
            int r0 = r0 - r10
            r6.A00 = r0
        L_0x0170:
            int r0 = r6.A00
            r9.A00(r0)
            long r1 = r6.A01
            java.nio.ByteBuffer r9 = r9.A01
            int r10 = r6.A00
        L_0x017b:
            X.9LC r5 = r7.A05
            long r3 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0188
            X.9LC r0 = r5.A02
            r7.A05 = r0
            goto L_0x017b
        L_0x0188:
            if (r10 <= 0) goto L_0x01ae
            long r3 = r5.A00
            long r3 = r3 - r1
            int r0 = (int) r3
            int r12 = java.lang.Math.min(r10, r0)
            X.9Bm r0 = r5.A03
            byte[] r11 = r0.A00
            long r5 = r5.A01
            long r3 = r1 - r5
            int r0 = (int) r3
            r9.put(r11, r0, r12)
            int r10 = r10 - r12
            long r3 = (long) r12
            long r1 = r1 + r3
            X.9LC r5 = r7.A05
            long r3 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0188
            X.9LC r5 = r5.A02
            r7.A05 = r5
            goto L_0x0188
        L_0x01ae:
            X.9za[] r0 = r8.A0H
            r0 = r0[r17]
            X.9eg r2 = r0.A09
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x01c2
            X.9uY r1 = r2.A07
        L_0x01bc:
            r0 = r17
            X.C209379zu.A02(r1, r8, r0)
            return r16
        L_0x01c2:
            int r0 = r2.A03
            int r1 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A01
            if (r1 < r0) goto L_0x01cc
            int r1 = r1 - r0
        L_0x01cc:
            X.9uY[] r0 = r2.A0F
            r1 = r0[r1]
            goto L_0x01bc
        L_0x01d1:
            X.9uY[] r0 = r4.A0F     // Catch:{ all -> 0x01e1 }
            r0 = r0[r11]     // Catch:{ all -> 0x01e1 }
        L_0x01d5:
            r1 = r19
            r1.A00 = r0     // Catch:{ all -> 0x01e1 }
            monitor-exit(r4)
            X.9uY r0 = r1.A00
            r7.A02 = r0
            r16 = -5
            return r16
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A00.Bms(X.9Bd, X.82Z, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BuD(long r9) {
        /*
            r8 = this;
            X.9zu r4 = r8.A01
            int r3 = r8.A00
            boolean r0 = X.C209379zu.A04(r4)
            r7 = 0
            if (r0 != 0) goto L_0x005c
            X.9za[] r0 = r4.A0H
            r6 = r0[r3]
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x002f
            X.9eg r5 = r6.A09
            monitor-enter(r5)
            long r1 = r5.A06     // Catch:{ all -> 0x002c }
            monitor-exit(r5)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            X.9eg r2 = r6.A09
            monitor-enter(r2)
            int r1 = r2.A02     // Catch:{ all -> 0x0029 }
            int r0 = r2.A03     // Catch:{ all -> 0x0029 }
            int r7 = r1 - r0
            r2.A03 = r1     // Catch:{ all -> 0x0029 }
            goto L_0x0039
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x002f:
            r0 = 1
            int r1 = r6.A03(r9, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0059
            r7 = r1
            goto L_0x003a
        L_0x0039:
            monitor-exit(r2)
        L_0x003a:
            if (r7 <= 0) goto L_0x0059
            X.9eg r2 = r6.A09
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x004a
            X.9uY r0 = r2.A07
        L_0x0046:
            X.C209379zu.A02(r0, r4, r3)
            return r7
        L_0x004a:
            int r0 = r2.A03
            int r1 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A01
            if (r1 < r0) goto L_0x0054
            int r1 = r1 - r0
        L_0x0054:
            X.9uY[] r0 = r2.A0F
            r0 = r0[r1]
            goto L_0x0046
        L_0x0059:
            X.C209379zu.A03(r4, r3)
        L_0x005c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A00.BuD(long):int");
    }
}
