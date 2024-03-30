package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1C9  reason: invalid class name */
public class AnonymousClass1C9 {
    public boolean A00;
    public boolean A01 = true;
    public final int A02;
    public final int A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1CG A05;
    public final AnonymousClass1CC A06;
    public final C20900yL A07;
    public final File A08;
    public final RandomAccessFile A09;
    public final boolean A0A;
    public final C19760wT A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r3.A0A != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(java.io.RandomAccessFile r4, int r5) {
        /*
            r3 = this;
            r2 = 65536(0x10000, float:9.18355E-41)
            int r1 = r3.A03     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0013
            r0 = 1
            if (r1 != r0) goto L_0x000c
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0015
        L_0x000c:
            boolean r0 = r3.A0A     // Catch:{ IOException -> 0x001c }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0015:
            int r1 = r1 * r5
            int r1 = r1 + r2
            long r0 = (long) r1     // Catch:{ IOException -> 0x001c }
            r4.setLength(r0)     // Catch:{ IOException -> 0x001c }
            return
        L_0x001c:
            r2 = move-exception
            X.0yL r1 = r3.A07
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            r1.A05()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot allocate space for new WAM file: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.1CA r0 = new X.1CA
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C9.A00(java.io.RandomAccessFile, int):void");
    }

    public final int A01() {
        return this.A04.A00.A04.A02.capacity() - AnonymousClass1CV.A00[2].length;
    }

    public long A02() {
        long j;
        AnonymousClass1CJ r5 = this.A04;
        long j2 = 0;
        for (int i = 0; i < r5.A02; i++) {
            if (i == r5.A03.A01) {
                j = (long) r5.A00.A00();
            } else {
                j = r5.A04[i];
            }
            j2 += j;
        }
        return j2;
    }

    public final void A03() {
        if (this.A01) {
            try {
                this.A04.A00.A02();
                try {
                    AnonymousClass1CG r2 = this.A05;
                    AnonymousClass1CG.A01(r2, 2, r2.A07.A05.length);
                    r2.A06.A03();
                    this.A00 = false;
                } catch (IOException e) {
                    C20900yL r1 = this.A07;
                    r1.A00 = true;
                    r1.A05();
                    Log.e("wambuffer/flush: cannot write header", e);
                    Log.e("wambuffer: PERSISTENCE TURNED OFF");
                    this.A01 = false;
                }
            } catch (IOException unused) {
                Log.e("InMemorySingleEventBufferManager/flushEventBuffers: error while event buffer flush");
                Log.e("wambuffer: PERSISTENCE TURNED OFF");
                this.A01 = false;
            }
        }
    }

    public final void A05(AnonymousClass1E8 r11, AnonymousClass1E6 r12) {
        AnonymousClass1CT r6 = this.A04.A00;
        ByteBuffer byteBuffer = r6.A04.A02;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(AnonymousClass1CV.A00[2]);
            AnonymousClass1CC r8 = r6.A05;
            AnonymousClass1CD[] r7 = r8.A05;
            int i = r6.A02;
            AnonymousClass1CD r3 = r7[i];
            int i2 = r8.A00 + 1;
            r8.A00 = i2;
            if (i2 > 65535) {
                r8.A00 = 1;
                i2 = 1;
            }
            r3.A00 = i2;
            byteBuffer.put(r6.A06(2));
            r7[i].A04 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        AnonymousClass1E7 r32 = r11.A02;
        int size = r32.size();
        AnonymousClass1E7 r1 = r12.A02;
        if (size + r1.size() <= byteBuffer.remaining()) {
            byteBuffer.put(r32.A00());
            byteBuffer.put(r1.A00());
            int i3 = r6.A01 + r11.A01;
            r6.A01 = i3;
            r6.A01 = i3 + r12.A01;
            r6.A00++;
            Map map = r11.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                C20940yP r2 = r6.A03;
                int intValue = number.intValue();
                if (map.containsKey(number)) {
                    r2.A00(intValue, ((C20950yQ) map.get(number)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    public boolean A06() {
        boolean z;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) / 86400;
        AnonymousClass1CC r5 = this.A06;
        if (seconds != r5.A03) {
            int i = this.A02;
            if (i == 0 || new Random().nextInt(i) != 0) {
                z = false;
                r5.A02 = 0;
            } else {
                r5.A02 = 0;
                z = true;
            }
            r5.A04 = z;
            r5.A03 = seconds;
        }
        return r5.A04;
    }

    public final boolean A07() {
        return this.A04.A00.A05();
    }

    public final void A04() {
        int i;
        if (!A07()) {
            AnonymousClass1CJ r5 = this.A04;
            if (r5.A06()) {
                Locale locale = Locale.US;
                AnonymousClass1CT r7 = r5.A00;
                Log.i(String.format(locale, "wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", new Object[]{Integer.valueOf(this.A06.A01), Integer.valueOf(r5.A00.A04.A02.position()), Integer.valueOf(r7.A00()), Long.valueOf(r7.A05.A05[r7.A02].A04)}));
                r5.A04();
                if (!this.A0A || !((i = this.A03) == 2 || i == 3)) {
                    this.A00 = true;
                    return;
                }
                return;
            }
            throw new Error("Rotation failed since there is no empty buffer");
        }
        throw new Error("Rotation failed since the current event buffer is empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x044e, code lost:
        if (r8.A09 != false) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0222, code lost:
        if (r11.A09 != false) goto L_0x0224;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0414 A[Catch:{ 1CA -> 0x04a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0444 A[Catch:{ 1CA -> 0x04a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0228 A[Catch:{ 1CB -> 0x031a, 1CB -> 0x0382 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1C9(X.C19760wT r24, X.C19420v0 r25, X.C20810yC r26, X.C20870yI r27, X.C20900yL r28, java.io.File r29, int r30, int r31, int r32, boolean r33) {
        /*
            r23 = this;
            r6 = 2
            r5 = r23
            r5.<init>()
            r4 = 1
            r5.A01 = r4
            r1 = r29
            r1.getAbsolutePath()
            boolean r9 = r1.isFile()
            r0 = r31
            r5.A02 = r0
            r8 = r33
            r5.A0A = r8
            r22 = r28
            r0 = r22
            r5.A07 = r0
            r11 = r24
            r5.A0B = r11
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002e }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x002e }
            r5.A01 = r4     // Catch:{ IOException -> 0x002e }
            goto L_0x004c
        L_0x002e:
            r7 = move-exception
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0 = r22
            r0.A0I = r2
            if (r9 != 0) goto L_0x003c
            r0.A03 = r2
        L_0x003c:
            r22.A05()
            java.lang.String r0 = "wambuffer/newwamfile: cannot open or create persistent WAM file; running in volatile mode"
            com.whatsapp.util.Log.e(r0, r7)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r5.A01 = r0
        L_0x004c:
            r5.A08 = r1
            r5.A09 = r3
            r7 = r32
            r5.A03 = r7
            X.1CC r2 = new X.1CC
            r21 = r30
            r0 = r21
            r2.<init>(r0, r7)
            r5.A06 = r2
            X.1CG r0 = new X.1CG
            r12 = r0
            r13 = r2
            r14 = r22
            r15 = r3
            r16 = r21
            r17 = r7
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5.A05 = r0
            if (r33 == 0) goto L_0x00bb
            if (r7 == r6) goto L_0x0078
            r0 = 3
            if (r7 != r0) goto L_0x00bb
        L_0x0078:
            java.lang.String r8 = r1.getAbsolutePath()
            char r0 = java.io.File.separatorChar
            int r0 = r8.lastIndexOf(r0)
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r17 = r8.substring(r1, r0)
            r1 = 3271(0xcc7, float:4.584E-42)
            X.0yV r0 = X.C21000yV.A02
            r8 = r26
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            if (r0 == 0) goto L_0x00a8
            X.1GS r10 = new X.1GS
            r12 = r2
            r13 = r14
            r14 = r3
            r15 = r21
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x00a1:
            r5.A04 = r10
            if (r9 == 0) goto L_0x0453
            if (r3 == 0) goto L_0x0453
            goto L_0x00c8
        L_0x00a8:
            X.8cV r10 = new X.8cV
            r12 = r25
            r13 = r27
            r14 = r2
            r15 = r22
            r16 = r3
            r18 = r21
            r19 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00a1
        L_0x00bb:
            X.1CJ r10 = new X.1CJ
            r12 = r2
            r13 = r14
            r14 = r3
            r15 = r21
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x00a1
        L_0x00c8:
            r0 = r21
            r5.A00(r3, r0)     // Catch:{ 1CA -> 0x04a9 }
            X.1CG r11 = r5.A05     // Catch:{ 1CB -> 0x0382 }
            byte[][] r8 = X.AnonymousClass1CI.A00     // Catch:{ 1CB -> 0x0382 }
            r0 = r8[r6]     // Catch:{ 1CB -> 0x0382 }
            int r2 = r0.length     // Catch:{ 1CB -> 0x0382 }
            byte[] r0 = new byte[r2]     // Catch:{ 1CB -> 0x0382 }
            r11.A03 = r0     // Catch:{ 1CB -> 0x0382 }
            X.1CE r1 = r11.A06     // Catch:{ IOException -> 0x0364 }
            int r0 = r2 + 4
            r1.A04(r0)     // Catch:{ IOException -> 0x0364 }
            java.nio.ByteBuffer r7 = r1.A02()     // Catch:{ 1CB -> 0x0382 }
            byte[] r0 = r11.A03     // Catch:{ 1CB -> 0x0382 }
            r7.get(r0)     // Catch:{ 1CB -> 0x0382 }
            byte[] r2 = r11.A03     // Catch:{ Exception -> 0x0359 }
            r10 = 0
        L_0x00eb:
            r0 = r8[r10]     // Catch:{ Exception -> 0x0359 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x0359 }
            if (r0 == 0) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            int r10 = r10 + 1
            r0 = 3
            if (r10 < r0) goto L_0x00eb
            goto L_0x0342
        L_0x00fb:
            if (r10 != 0) goto L_0x00ff
            r9 = 2
            goto L_0x0108
        L_0x00ff:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 1CB -> 0x0382 }
            r7.order(r0)     // Catch:{ 1CB -> 0x0382 }
            int r9 = r7.getInt()     // Catch:{ 1CB -> 0x0382 }
        L_0x0108:
            X.1CC r8 = r11.A07     // Catch:{ 1CB -> 0x0382 }
            X.1CD[] r0 = r8.A05     // Catch:{ 1CB -> 0x0382 }
            r19 = r0
            int r15 = r0.length     // Catch:{ 1CB -> 0x0382 }
            if (r9 > r15) goto L_0x033a
            X.AnonymousClass1CG.A01(r11, r10, r9)     // Catch:{ 1CB -> 0x0382 }
            java.nio.ByteBuffer r0 = r1.A02     // Catch:{ 1CB -> 0x0382 }
            r20 = r0
            int r18 = r20.position()     // Catch:{ 1CB -> 0x0382 }
            r0 = r18
            r1.A04(r0)     // Catch:{ IOException -> 0x032f }
            java.nio.ByteBuffer r13 = r1.A02()     // Catch:{ 1CB -> 0x0382 }
            byte[] r0 = X.AnonymousClass1CI.A00(r10)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r0.length     // Catch:{ 1CB -> 0x0382 }
            byte[] r0 = new byte[r0]     // Catch:{ 1CB -> 0x0382 }
            r11.A03 = r0     // Catch:{ 1CB -> 0x0382 }
            r13.get(r0)     // Catch:{ 1CB -> 0x0382 }
            if (r10 != 0) goto L_0x0135
            r14 = 2
            goto L_0x013e
        L_0x0135:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 1CB -> 0x0382 }
            r13.order(r0)     // Catch:{ 1CB -> 0x0382 }
            int r14 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
        L_0x013e:
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r11.A01 = r0     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r11.A00 = r0     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r8.A01 = r0     // Catch:{ 1CB -> 0x0382 }
            r7 = 0
            if (r0 < r14) goto L_0x0160
            r8.A01 = r7     // Catch:{ 1CB -> 0x0382 }
        L_0x0160:
            if (r10 < r6) goto L_0x0184
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r8.A00 = r0     // Catch:{ 1CB -> 0x0382 }
            byte r1 = r13.get()     // Catch:{ 1CB -> 0x0382 }
            r0 = 1
            if (r1 == r4) goto L_0x0173
            r0 = 0
        L_0x0173:
            r8.A04 = r0     // Catch:{ 1CB -> 0x0382 }
            long r0 = X.AnonymousClass1CG.A00(r13)     // Catch:{ 1CB -> 0x0382 }
            r8.A03 = r0     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r8.A02 = r0     // Catch:{ 1CB -> 0x0382 }
        L_0x0184:
            if (r7 >= r14) goto L_0x01db
            if (r7 >= r15) goto L_0x01b8
            r2 = r19[r7]     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r2.A01 = r0     // Catch:{ 1CB -> 0x0382 }
            long r16 = X.AnonymousClass1CG.A00(r13)     // Catch:{ 1CB -> 0x0382 }
            r0 = r16
            r2.A04 = r0     // Catch:{ 1CB -> 0x0382 }
            if (r10 < r6) goto L_0x01af
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r2.A02 = r0     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r2.A00 = r0     // Catch:{ 1CB -> 0x0382 }
        L_0x01af:
            long r16 = X.AnonymousClass1CG.A00(r13)     // Catch:{ 1CB -> 0x0382 }
            r0 = r16
            r2.A03 = r0     // Catch:{ 1CB -> 0x0382 }
            goto L_0x01d8
        L_0x01b8:
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            if (r10 < r6) goto L_0x01d2
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            r13.getInt()     // Catch:{ 1CB -> 0x0382 }
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            r13.getInt()     // Catch:{ 1CB -> 0x0382 }
        L_0x01d2:
            r13.order(r12)     // Catch:{ 1CB -> 0x0382 }
            r13.getInt()     // Catch:{ 1CB -> 0x0382 }
        L_0x01d8:
            int r7 = r7 + 1
            goto L_0x0184
        L_0x01db:
            long r0 = X.AnonymousClass1CG.A00(r13)     // Catch:{ 1CB -> 0x0382 }
            r11.A02 = r0     // Catch:{ 1CB -> 0x0382 }
            int r7 = r18 + -4
            r2 = 0
            int r0 = r20.position()     // Catch:{ 1CB -> 0x0382 }
            if (r7 > r0) goto L_0x0327
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32     // Catch:{ 1CB -> 0x0382 }
            r1.<init>()     // Catch:{ 1CB -> 0x0382 }
            byte[] r0 = r20.array()     // Catch:{ 1CB -> 0x0382 }
            r1.update(r0, r2, r7)     // Catch:{ 1CB -> 0x0382 }
            long r12 = r1.getValue()     // Catch:{ 1CB -> 0x0382 }
            long r0 = r11.A02     // Catch:{ 1CB -> 0x0382 }
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x036f
            byte[] r1 = r11.A03     // Catch:{ 1CB -> 0x031a }
            byte[] r0 = X.AnonymousClass1CI.A00(r10)     // Catch:{ 1CB -> 0x031a }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ 1CB -> 0x031a }
            if (r0 == 0) goto L_0x030a
            int r13 = r11.A01     // Catch:{ 1CB -> 0x031a }
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r13 != r0) goto L_0x0302
            int r12 = r11.A00     // Catch:{ 1CB -> 0x031a }
            int r0 = r11.A04     // Catch:{ 1CB -> 0x031a }
            if (r0 == 0) goto L_0x0224
            if (r0 != r4) goto L_0x021d
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0226
        L_0x021d:
            boolean r0 = r11.A09     // Catch:{ 1CB -> 0x031a }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0226
        L_0x0224:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0226:
            if (r12 != r1) goto L_0x02fa
            int r1 = r8.A01     // Catch:{ 1CB -> 0x031a }
            if (r1 < 0) goto L_0x0312
            int r0 = r11.A05     // Catch:{ 1CB -> 0x031a }
            if (r1 >= r0) goto L_0x0312
            r7 = 0
        L_0x0231:
            if (r7 >= r15) goto L_0x0245
            r0 = r19[r7]     // Catch:{ 1CB -> 0x031a }
            int r0 = r0.A01     // Catch:{ 1CB -> 0x031a }
            if (r0 > r12) goto L_0x023c
            int r7 = r7 + 1
            goto L_0x0231
        L_0x023c:
            java.lang.String r0 = "Invalid event buffer size"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x031a }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x031a }
            goto L_0x0319
        L_0x0245:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ 1CB -> 0x0382 }
            r7.<init>()     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = "wambuffer/header/init: header="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r10)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " bufferCount="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r9)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " maxMetadataSize="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r13)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " maxEventBufferSize="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r12)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " currentEventBufferIndex="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r1)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r1)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " currentBufferSequenceNumber="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r8.A00     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " isEventBeaconingEnabled="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            boolean r0 = r8.A04     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " dayOfLastBeaconingDecision="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            long r0 = r8.A03     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " currentEventSequenceNumber="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r8.A02     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = r7.toString()     // Catch:{ 1CB -> 0x0382 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1CB -> 0x0382 }
        L_0x02a7:
            if (r2 >= r15) goto L_0x02f4
            r8 = r19[r2]     // Catch:{ 1CB -> 0x0382 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ 1CB -> 0x0382 }
            r7.<init>()     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = "wambuffer/header/init/eventBufferMetadata/"
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            r7.append(r2)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = ": size="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r8.A01     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " timestamp="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            long r0 = r8.A04     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " streamId="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r8.A02     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " bufferSequenceNumber="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            int r0 = r8.A00     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = " checksum="
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            long r0 = r8.A03     // Catch:{ 1CB -> 0x0382 }
            r7.append(r0)     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = r7.toString()     // Catch:{ 1CB -> 0x0382 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1CB -> 0x0382 }
            int r2 = r2 + 1
            goto L_0x02a7
        L_0x02f4:
            X.1CJ r0 = r5.A04     // Catch:{ 1CA -> 0x038d }
            r0.A02()     // Catch:{ 1CA -> 0x038d }
            return
        L_0x02fa:
            java.lang.String r0 = "Invalid max event buffer size"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x031a }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x031a }
            goto L_0x0319
        L_0x0302:
            java.lang.String r0 = "Invalid max metadata size"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x031a }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x031a }
            goto L_0x0319
        L_0x030a:
            java.lang.String r0 = "Invalid WAM file magic or version"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x031a }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x031a }
            goto L_0x0319
        L_0x0312:
            java.lang.String r0 = "Invalid current event buffer"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x031a }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x031a }
        L_0x0319:
            throw r1     // Catch:{ 1CB -> 0x031a }
        L_0x031a:
            r2 = move-exception
            X.0yL r1 = r11.A08     // Catch:{ 1CB -> 0x0382 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1CB -> 0x0382 }
            r1.A06 = r0     // Catch:{ 1CB -> 0x0382 }
            r1.A05()     // Catch:{ 1CB -> 0x0382 }
            throw r2     // Catch:{ 1CB -> 0x0382 }
        L_0x0327:
            java.lang.String r0 = "Given range contains invalid bytes"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
            goto L_0x0381
        L_0x032f:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 1CB -> 0x0382 }
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
            goto L_0x0381
        L_0x033a:
            java.lang.String r0 = "Event buffer downgrade not allowed"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
            goto L_0x0381
        L_0x0342:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0359 }
            r1.<init>()     // Catch:{ Exception -> 0x0359 }
            java.lang.String r0 = "Invalid value: "
            r1.append(r0)     // Catch:{ Exception -> 0x0359 }
            r1.append(r2)     // Catch:{ Exception -> 0x0359 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0359 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0359 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0359 }
            throw r0     // Catch:{ Exception -> 0x0359 }
        L_0x0359:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 1CB -> 0x0382 }
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
            goto L_0x0381
        L_0x0364:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 1CB -> 0x0382 }
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
            goto L_0x0381
        L_0x036f:
            X.0yL r1 = r11.A08     // Catch:{ 1CB -> 0x0382 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1CB -> 0x0382 }
            r1.A08 = r0     // Catch:{ 1CB -> 0x0382 }
            r1.A05()     // Catch:{ 1CB -> 0x0382 }
            java.lang.String r0 = "Invalid checksum"
            X.1CB r1 = new X.1CB     // Catch:{ 1CB -> 0x0382 }
            r1.<init>(r0)     // Catch:{ 1CB -> 0x0382 }
        L_0x0381:
            throw r1     // Catch:{ 1CB -> 0x0382 }
        L_0x0382:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ 1CA -> 0x038d }
            X.1CA r0 = new X.1CA     // Catch:{ 1CA -> 0x038d }
            r0.<init>(r1)     // Catch:{ 1CA -> 0x038d }
            throw r0     // Catch:{ 1CA -> 0x038d }
        L_0x038d:
            r7 = move-exception
            int r0 = r5.A03     // Catch:{ 1CA -> 0x04a9 }
            if (r0 == 0) goto L_0x03d2
            if (r0 == r4) goto L_0x03b4
            if (r0 != r6) goto L_0x03f5
            X.0yL r2 = r5.A07     // Catch:{ 1CA -> 0x04a9 }
            java.lang.Long r1 = r2.A0S     // Catch:{ 1CA -> 0x04a9 }
            monitor-enter(r2)     // Catch:{ 1CA -> 0x04a9 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r2.A0L     // Catch:{ all -> 0x03f0 }
            if (r0 != 0) goto L_0x03a4
            r8 = 0
            goto L_0x03a8
        L_0x03a4:
            long r8 = r0.longValue()     // Catch:{ all -> 0x03f0 }
        L_0x03a8:
            long r0 = r1.longValue()     // Catch:{ all -> 0x03f0 }
            long r8 = r8 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x03f0 }
            r2.A0L = r0     // Catch:{ all -> 0x03f0 }
            goto L_0x03f4
        L_0x03b4:
            X.0yL r2 = r5.A07     // Catch:{ 1CA -> 0x04a9 }
            java.lang.Long r1 = r2.A0T     // Catch:{ 1CA -> 0x04a9 }
            monitor-enter(r2)     // Catch:{ 1CA -> 0x04a9 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r2.A0P     // Catch:{ all -> 0x03f0 }
            if (r0 != 0) goto L_0x03c2
            r8 = 0
            goto L_0x03c6
        L_0x03c2:
            long r8 = r0.longValue()     // Catch:{ all -> 0x03f0 }
        L_0x03c6:
            long r0 = r1.longValue()     // Catch:{ all -> 0x03f0 }
            long r8 = r8 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x03f0 }
            r2.A0P = r0     // Catch:{ all -> 0x03f0 }
            goto L_0x03f4
        L_0x03d2:
            X.0yL r2 = r5.A07     // Catch:{ 1CA -> 0x04a9 }
            java.lang.Long r1 = r2.A0R     // Catch:{ 1CA -> 0x04a9 }
            monitor-enter(r2)     // Catch:{ 1CA -> 0x04a9 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r2.A0J     // Catch:{ all -> 0x03f0 }
            if (r0 != 0) goto L_0x03e0
            r8 = 0
            goto L_0x03e4
        L_0x03e0:
            long r8 = r0.longValue()     // Catch:{ all -> 0x03f0 }
        L_0x03e4:
            long r0 = r1.longValue()     // Catch:{ all -> 0x03f0 }
            long r8 = r8 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x03f0 }
            r2.A0J = r0     // Catch:{ all -> 0x03f0 }
            goto L_0x03f4
        L_0x03f0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ 1CA -> 0x04a9 }
            goto L_0x04a8
        L_0x03f4:
            monitor-exit(r2)     // Catch:{ 1CA -> 0x04a9 }
        L_0x03f5:
            X.0yL r0 = r5.A07     // Catch:{ 1CA -> 0x04a9 }
            r0.A05()     // Catch:{ 1CA -> 0x04a9 }
            X.1CJ r0 = r5.A04     // Catch:{ 1CA -> 0x04a9 }
            r0.A03()     // Catch:{ 1CA -> 0x04a9 }
            X.1CC r8 = r5.A06     // Catch:{ 1CA -> 0x04a9 }
            r2 = 0
            r8.A01 = r2     // Catch:{ 1CA -> 0x04a9 }
            r8.A00 = r2     // Catch:{ 1CA -> 0x04a9 }
            r8.A04 = r2     // Catch:{ 1CA -> 0x04a9 }
            r0 = 0
            r8.A03 = r0     // Catch:{ 1CA -> 0x04a9 }
            r8.A02 = r2     // Catch:{ 1CA -> 0x04a9 }
            X.1CJ r9 = r5.A04     // Catch:{ 1CA -> 0x04a9 }
            X.1CT r2 = r9.A00     // Catch:{ 1CA -> 0x04a9 }
            if (r2 == 0) goto L_0x041f
            r2.A01()     // Catch:{ 1CA -> 0x04a9 }
            long[] r8 = r9.A04     // Catch:{ 1CA -> 0x04a9 }
            X.1CC r2 = r9.A03     // Catch:{ 1CA -> 0x04a9 }
            int r2 = r2.A01     // Catch:{ 1CA -> 0x04a9 }
            r8[r2] = r0     // Catch:{ 1CA -> 0x04a9 }
        L_0x041f:
            X.1CG r8 = r5.A05     // Catch:{ 1CA -> 0x04a9 }
            byte[][] r0 = X.AnonymousClass1CI.A00     // Catch:{ 1CA -> 0x04a9 }
            r0 = r0[r6]     // Catch:{ 1CA -> 0x04a9 }
            r8.A03 = r0     // Catch:{ 1CA -> 0x04a9 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r8.A01 = r0     // Catch:{ 1CA -> 0x04a9 }
            r0 = 0
            r8.A02 = r0     // Catch:{ 1CA -> 0x04a9 }
            X.1CE r2 = r8.A06     // Catch:{ 1CA -> 0x04a9 }
            java.nio.ByteBuffer r0 = r2.A02     // Catch:{ 1CA -> 0x04a9 }
            r0.clear()     // Catch:{ 1CA -> 0x04a9 }
            r1 = 0
            r2.A01 = r1     // Catch:{ 1CA -> 0x04a9 }
            java.util.zip.Checksum r0 = r2.A03     // Catch:{ 1CA -> 0x04a9 }
            r0.reset()     // Catch:{ 1CA -> 0x04a9 }
            r2.A00 = r1     // Catch:{ 1CA -> 0x04a9 }
            int r0 = r8.A04     // Catch:{ 1CA -> 0x04a9 }
            if (r0 == 0) goto L_0x0450
            if (r0 != r4) goto L_0x0449
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x045e
        L_0x0449:
            boolean r0 = r8.A09     // Catch:{ 1CA -> 0x04a9 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x045e
        L_0x0450:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x045e
        L_0x0453:
            r10.A03()     // Catch:{ 1CA -> 0x04a9 }
            java.lang.String r0 = "wambuffer/wambuffer: no WAM file found; creating a new one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1CA -> 0x04a9 }
            if (r3 != 0) goto L_0x0484
            return
        L_0x045e:
            r8.A00 = r1     // Catch:{ 1CA -> 0x04a9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1CA -> 0x04a9 }
            r1.<init>()     // Catch:{ 1CA -> 0x04a9 }
            java.lang.String r0 = "wambuffer/wambuffer: error while opening WAM file ("
            r1.append(r0)     // Catch:{ 1CA -> 0x04a9 }
            r1.append(r7)     // Catch:{ 1CA -> 0x04a9 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ 1CA -> 0x04a9 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1CA -> 0x04a9 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1CA -> 0x04a9 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1CA -> 0x04a9 }
            r0 = r22
            r0.A0G = r1     // Catch:{ 1CA -> 0x04a9 }
            r22.A05()     // Catch:{ 1CA -> 0x04a9 }
        L_0x0484:
            r0 = r21
            r5.A00(r3, r0)     // Catch:{ 1CA -> 0x04a9 }
            X.1CG r1 = r5.A05     // Catch:{ IOException -> 0x049e }
            X.1CC r0 = r1.A07     // Catch:{ IOException -> 0x049e }
            X.1CD[] r0 = r0.A05     // Catch:{ IOException -> 0x049e }
            int r0 = r0.length     // Catch:{ IOException -> 0x049e }
            X.AnonymousClass1CG.A01(r1, r6, r0)     // Catch:{ IOException -> 0x049e }
            X.1CE r0 = r1.A06     // Catch:{ IOException -> 0x049e }
            r0.A03()     // Catch:{ IOException -> 0x049e }
            java.lang.String r0 = "wambuffer/initnewfile: successfully created new WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1CA -> 0x04a9 }
            return
        L_0x049e:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 1CA -> 0x04a9 }
            X.1CA r1 = new X.1CA     // Catch:{ 1CA -> 0x04a9 }
            r1.<init>(r0)     // Catch:{ 1CA -> 0x04a9 }
        L_0x04a8:
            throw r1     // Catch:{ 1CA -> 0x04a9 }
        L_0x04a9:
            r1 = move-exception
            java.lang.String r0 = "wambuffer/wambuffer: failed to initialize with new file"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r5.A01 = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0 = r22
            r0.A03 = r2
            r22.A05()
            java.io.RandomAccessFile r0 = r5.A09
            if (r0 == 0) goto L_0x04d7
            r0.close()     // Catch:{ IOException -> 0x04ca }
            goto L_0x04d7
        L_0x04ca:
            r1 = move-exception
            X.0yL r0 = r5.A07
            r0.A0A = r2
            r0.A05()
            java.lang.String r0 = "wambuffer/closefile: cannot close WAM file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04d7:
            java.io.File r0 = r5.A08
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x04e5
            java.lang.String r0 = "wambuffer/removefile: successfully removed WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04e5:
            X.0yL r0 = r5.A07
            r0.A0C = r2
            r0.A05()
            java.lang.String r0 = "wambuffer/removefile: cannot remove WAM file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C9.<init>(X.0wT, X.0v0, X.0yC, X.0yI, X.0yL, java.io.File, int, int, int, boolean):void");
    }
}
