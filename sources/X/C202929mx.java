package X;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.9mx  reason: invalid class name and case insensitive filesystem */
public class C202929mx {
    public boolean A00 = false;
    public byte[] A01;
    public AnonymousClass9O0[] A02;
    public final AssetManager A03;
    public final B0P A04;
    public final File A05;
    public final String A06;
    public final byte[] A07;
    public final Executor A08;

    public static int A00(InputStream inputStream) {
        return (int) A01(inputStream, 2);
    }

    private FileInputStream A02(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.A04.BVc(5, (Object) null);
            }
            return null;
        }
    }

    public static void A03(C202929mx r3, Object obj, int i) {
        r3.A08.execute(new C81333wq(r3, i, 2, obj));
    }

    public static byte[] A04(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw C90464aC.A0R("Not enough bytes to read: ", AnonymousClass000.A0u(), i);
            }
        }
        return bArr;
    }

    public static byte[] A05(InputStream inputStream, int i, int i2) {
        IllegalStateException illegalStateException;
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                    A0u.append(i);
                    illegalStateException = AnonymousClass000.A0g(" bytes", A0u);
                    break;
                }
                inflater.setInput(bArr2, 0, read);
                i4 += inflater.inflate(bArr, i4, i2 - i4);
                i3 += read;
            }
            if (i3 != i) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Didn't read enough bytes during decompression. expected=");
                A0u2.append(i);
                illegalStateException = C90464aC.A0R(" actual=", A0u2, i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                illegalStateException = AnonymousClass001.A09("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            illegalStateException = AnonymousClass001.A09(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
        throw illegalStateException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01de A[SYNTHETIC, Splitter:B:118:0x01de] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C202929mx A06() {
        /*
            r28 = this;
            r7 = r28
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0396
            byte[] r0 = r7.A07
            r17 = r0
            if (r0 == 0) goto L_0x0395
            android.content.res.AssetManager r14 = r7.A03
            java.lang.String r0 = "dexopt/baseline.prof"
            java.io.FileInputStream r6 = r7.A02(r14, r0)     // Catch:{ FileNotFoundException -> 0x01a8, IOException -> 0x01ad }
            if (r6 == 0) goto L_0x01bd
            r5 = 7
            byte[] r1 = X.C202819mi.A00     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            r0 = 4
            byte[] r0 = A04(r6, r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            if (r0 == 0) goto L_0x0175
            r4 = 4
            byte[] r1 = A04(r6, r4)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            java.lang.String r0 = r7.A06     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            r19 = r0
            byte[] r0 = X.AnonymousClass9BH.A05     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            if (r0 == 0) goto L_0x0172
            r0 = 1
            long r0 = A01(r6, r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            int r10 = (int) r0     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            long r2 = A01(r6, r4)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            long r0 = A01(r6, r4)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            int r4 = (int) r0     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            int r0 = (int) r2     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            byte[] r1 = A05(r6, r4, r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            int r0 = r6.read()     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            if (r0 > 0) goto L_0x017c
            java.io.ByteArrayInputStream r4 = X.C90524aI.A0P(r1)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            int r0 = r4.available()     // Catch:{ all -> 0x0168 }
            r3 = 0
            if (r0 != 0) goto L_0x005e
            X.9O0[] r2 = new X.AnonymousClass9O0[r3]     // Catch:{ all -> 0x0168 }
            goto L_0x0161
        L_0x005e:
            X.9O0[] r2 = new X.AnonymousClass9O0[r10]     // Catch:{ all -> 0x0168 }
            r11 = 0
        L_0x0061:
            if (r11 >= r10) goto L_0x00a2
            int r12 = A00(r4)     // Catch:{ all -> 0x0168 }
            int r16 = A00(r4)     // Catch:{ all -> 0x0168 }
            r0 = 4
            long r8 = A01(r4, r0)     // Catch:{ all -> 0x0168 }
            long r26 = A01(r4, r0)     // Catch:{ all -> 0x0168 }
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x0168 }
            byte[] r13 = A04(r4, r12)     // Catch:{ all -> 0x0168 }
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0168 }
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x0168 }
            r15.<init>(r13, r12)     // Catch:{ all -> 0x0168 }
            int r12 = (int) r8     // Catch:{ all -> 0x0168 }
            int r8 = (int) r0     // Catch:{ all -> 0x0168 }
            r0 = r16
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0168 }
            java.util.TreeMap r21 = new java.util.TreeMap     // Catch:{ all -> 0x0168 }
            r21.<init>()     // Catch:{ all -> 0x0168 }
            X.9O0 r18 = new X.9O0     // Catch:{ all -> 0x0168 }
            r20 = r15
            r22 = r0
            r23 = r16
            r24 = r12
            r25 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0168 }
            r2[r11] = r18     // Catch:{ all -> 0x0168 }
            int r11 = r11 + 1
            goto L_0x0061
        L_0x00a2:
            if (r3 >= r10) goto L_0x0161
            r9 = r2[r3]     // Catch:{ all -> 0x0168 }
            int r8 = r4.available()     // Catch:{ all -> 0x0168 }
            int r0 = r9.A03     // Catch:{ all -> 0x0168 }
            int r8 = r8 - r0
            r15 = 0
        L_0x00ae:
            int r0 = r4.available()     // Catch:{ all -> 0x0168 }
            if (r0 <= r8) goto L_0x00f2
            int r0 = A00(r4)     // Catch:{ all -> 0x0168 }
            int r15 = r15 + r0
            java.util.TreeMap r11 = r9.A08     // Catch:{ all -> 0x0168 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0168 }
            r0 = 1
            X.C36341k9.A1K(r1, r11, r0)     // Catch:{ all -> 0x0168 }
            int r13 = A00(r4)     // Catch:{ all -> 0x0168 }
        L_0x00c7:
            if (r13 <= 0) goto L_0x00ae
            r0 = 2
            A01(r4, r0)     // Catch:{ all -> 0x0168 }
            r0 = 1
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x0168 }
            int r11 = (int) r0     // Catch:{ all -> 0x0168 }
            r0 = 6
            if (r11 == r0) goto L_0x00d8
            if (r11 != r5) goto L_0x00db
        L_0x00d8:
            int r13 = r13 + -1
            goto L_0x00c7
        L_0x00db:
            if (r11 <= 0) goto L_0x00d8
            r0 = 1
            A04(r4, r0)     // Catch:{ all -> 0x0168 }
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x0168 }
            int r12 = (int) r0     // Catch:{ all -> 0x0168 }
        L_0x00e6:
            if (r12 <= 0) goto L_0x00ef
            r0 = 2
            A01(r4, r0)     // Catch:{ all -> 0x0168 }
            int r12 = r12 + -1
            goto L_0x00e6
        L_0x00ef:
            int r11 = r11 + -1
            goto L_0x00db
        L_0x00f2:
            int r0 = r4.available()     // Catch:{ all -> 0x0168 }
            if (r0 != r8) goto L_0x015a
            int r12 = r9.A00     // Catch:{ all -> 0x0168 }
            int[] r11 = new int[r12]     // Catch:{ all -> 0x0168 }
            r8 = 0
            r1 = 0
        L_0x00fe:
            if (r8 >= r12) goto L_0x010a
            int r0 = A00(r4)     // Catch:{ all -> 0x0168 }
            int r1 = r1 + r0
            r11[r8] = r1     // Catch:{ all -> 0x0168 }
            int r8 = r8 + 1
            goto L_0x00fe
        L_0x010a:
            r9.A02 = r11     // Catch:{ all -> 0x0168 }
            int r15 = r9.A04     // Catch:{ all -> 0x0168 }
            int r0 = r15 * 2
            int r0 = r0 + 8
            int r0 = r0 + -1
            r0 = r0 & -8
            int r0 = r0 / 8
            byte[] r0 = A04(r4, r0)     // Catch:{ all -> 0x0168 }
            java.util.BitSet r13 = java.util.BitSet.valueOf(r0)     // Catch:{ all -> 0x0168 }
            r16 = 0
            r12 = 0
        L_0x0123:
            if (r12 >= r15) goto L_0x0156
            r11 = 2
            boolean r0 = r13.get(r12)     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x012d
            r11 = 0
        L_0x012d:
            int r0 = r12 + r15
            boolean r0 = r13.get(r0)     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0137
            r11 = r11 | 4
        L_0x0137:
            if (r11 == 0) goto L_0x0153
            java.util.TreeMap r8 = r9.A08     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = X.C90484aE.A0j(r8, r12)     // Catch:{ all -> 0x0168 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x0147
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0168 }
        L_0x0147:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0168 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0168 }
            r11 = r11 | r0
            X.C36341k9.A1K(r1, r8, r11)     // Catch:{ all -> 0x0168 }
        L_0x0153:
            int r12 = r12 + 1
            goto L_0x0123
        L_0x0156:
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x015a:
            java.lang.String r0 = "Read too much data during profile line parse"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0161:
            r4.close()     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            r6.close()     // Catch:{ IOException -> 0x01b5 }
            goto L_0x01bb
        L_0x0168:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
        L_0x0171:
            throw r1     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
        L_0x0172:
            java.lang.String r0 = "Unsupported version"
            goto L_0x017e
        L_0x0175:
            java.lang.String r0 = "Invalid magic"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
            goto L_0x0182
        L_0x017c:
            java.lang.String r0 = "Content found after the end of file"
        L_0x017e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
        L_0x0182:
            throw r0     // Catch:{ IOException -> 0x018c, IllegalStateException -> 0x0183 }
        L_0x0183:
            r2 = move-exception
            X.B0P r1 = r7.A04     // Catch:{ all -> 0x019c }
            r0 = 8
            r1.BfO(r0, r2)     // Catch:{ all -> 0x019c }
            goto L_0x0192
        L_0x018c:
            r0 = move-exception
            X.B0P r1 = r7.A04     // Catch:{ all -> 0x019c }
            r1.BfO(r5, r0)     // Catch:{ all -> 0x019c }
        L_0x0192:
            r6.close()     // Catch:{ IOException -> 0x0196 }
            goto L_0x019a
        L_0x0196:
            r0 = move-exception
            r1.BfO(r5, r0)
        L_0x019a:
            r2 = 0
            goto L_0x01bb
        L_0x019c:
            r2 = move-exception
            r6.close()     // Catch:{ IOException -> 0x01a1 }
            throw r2
        L_0x01a1:
            r1 = move-exception
            X.B0P r0 = r7.A04
            r0.BfO(r5, r1)
            throw r2
        L_0x01a8:
            r2 = move-exception
            X.B0P r1 = r7.A04
            r0 = 6
            goto L_0x01b1
        L_0x01ad:
            r2 = move-exception
            X.B0P r1 = r7.A04
            r0 = 7
        L_0x01b1:
            r1.BfO(r0, r2)
            goto L_0x01bd
        L_0x01b5:
            r1 = move-exception
            X.B0P r0 = r7.A04
            r0.BfO(r5, r1)
        L_0x01bb:
            r7.A02 = r2
        L_0x01bd:
            X.9O0[] r6 = r7.A02
            if (r6 == 0) goto L_0x0395
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r2 < r1) goto L_0x0395
            r0 = 33
            if (r2 > r0) goto L_0x0395
            if (r2 == r1) goto L_0x01d5
            r0 = 25
            if (r2 == r0) goto L_0x01d5
            switch(r2) {
                case 31: goto L_0x01d5;
                case 32: goto L_0x01d5;
                case 33: goto L_0x01d5;
                default: goto L_0x01d4;
            }
        L_0x01d4:
            return r28
        L_0x01d5:
            r3 = 0
            java.lang.String r0 = "dexopt/baseline.profm"
            java.io.FileInputStream r2 = r7.A02(r14, r0)     // Catch:{ FileNotFoundException -> 0x0385, IOException -> 0x0380, IllegalStateException -> 0x038b }
            if (r2 == 0) goto L_0x0395
            byte[] r1 = X.C202819mi.A01     // Catch:{ all -> 0x0376 }
            r0 = 4
            byte[] r0 = A04(r2, r0)     // Catch:{ all -> 0x0376 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x0368
            r4 = 4
            byte[] r8 = A04(r2, r4)     // Catch:{ all -> 0x0376 }
            byte[] r5 = X.AnonymousClass9BH.A00     // Catch:{ all -> 0x0376 }
            boolean r0 = java.util.Arrays.equals(r8, r5)     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x0291
            byte[] r1 = X.AnonymousClass9BH.A06     // Catch:{ all -> 0x0376 }
            r0 = r17
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0376 }
            if (r0 != 0) goto L_0x0361
            boolean r0 = java.util.Arrays.equals(r8, r5)     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x036f
            r0 = 1
            long r0 = A01(r2, r0)     // Catch:{ all -> 0x0376 }
            int r10 = (int) r0     // Catch:{ all -> 0x0376 }
            r0 = 4
            long r4 = A01(r2, r4)     // Catch:{ all -> 0x0376 }
            long r0 = A01(r2, r0)     // Catch:{ all -> 0x0376 }
            int r8 = (int) r0     // Catch:{ all -> 0x0376 }
            int r0 = (int) r4     // Catch:{ all -> 0x0376 }
            byte[] r1 = A05(r2, r8, r0)     // Catch:{ all -> 0x0376 }
            int r0 = r2.read()     // Catch:{ all -> 0x0376 }
            if (r0 > 0) goto L_0x028d
            java.io.ByteArrayInputStream r11 = X.C90524aI.A0P(r1)     // Catch:{ all -> 0x0376 }
            int r0 = r11.available()     // Catch:{ all -> 0x0287 }
            r14 = 0
            if (r0 != 0) goto L_0x0232
            X.9O0[] r6 = new X.AnonymousClass9O0[r14]     // Catch:{ all -> 0x0287 }
            goto L_0x0344
        L_0x0232:
            int r0 = r6.length     // Catch:{ all -> 0x0287 }
            if (r10 != r0) goto L_0x027d
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x0287 }
            int[] r12 = new int[r10]     // Catch:{ all -> 0x0287 }
            r5 = 0
        L_0x023a:
            if (r5 >= r10) goto L_0x0256
            int r1 = A00(r11)     // Catch:{ all -> 0x0287 }
            int r0 = A00(r11)     // Catch:{ all -> 0x0287 }
            r12[r5] = r0     // Catch:{ all -> 0x0287 }
            byte[] r4 = A04(r11, r1)     // Catch:{ all -> 0x0287 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0287 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0287 }
            r13[r5] = r0     // Catch:{ all -> 0x0287 }
            int r5 = r5 + 1
            goto L_0x023a
        L_0x0256:
            if (r14 >= r10) goto L_0x0344
            r9 = r6[r14]     // Catch:{ all -> 0x0287 }
            java.lang.String r1 = r9.A07     // Catch:{ all -> 0x0287 }
            r0 = r13[r14]     // Catch:{ all -> 0x0287 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0280
            r8 = r12[r14]     // Catch:{ all -> 0x0287 }
            r9.A00 = r8     // Catch:{ all -> 0x0287 }
            int[] r5 = new int[r8]     // Catch:{ all -> 0x0287 }
            r4 = 0
            r1 = 0
        L_0x026c:
            if (r4 >= r8) goto L_0x0278
            int r0 = A00(r11)     // Catch:{ all -> 0x0287 }
            int r1 = r1 + r0
            r5[r4] = r1     // Catch:{ all -> 0x0287 }
            int r4 = r4 + 1
            goto L_0x026c
        L_0x0278:
            r9.A02 = r5     // Catch:{ all -> 0x0287 }
            int r14 = r14 + 1
            goto L_0x0256
        L_0x027d:
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            goto L_0x0282
        L_0x0280:
            java.lang.String r0 = "Order of dexfiles in metadata did not match baseline"
        L_0x0282:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0287 }
            throw r0     // Catch:{ all -> 0x0287 }
        L_0x0287:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0352 }
            goto L_0x0375
        L_0x028d:
            java.lang.String r0 = "Content found after the end of file"
            goto L_0x0371
        L_0x0291:
            byte[] r0 = X.AnonymousClass9BH.A01     // Catch:{ all -> 0x0376 }
            boolean r0 = java.util.Arrays.equals(r8, r0)     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x035e
            int r8 = A00(r2)     // Catch:{ all -> 0x0376 }
            r0 = 4
            long r4 = A01(r2, r4)     // Catch:{ all -> 0x0376 }
            long r0 = A01(r2, r0)     // Catch:{ all -> 0x0376 }
            int r9 = (int) r0     // Catch:{ all -> 0x0376 }
            int r0 = (int) r4     // Catch:{ all -> 0x0376 }
            byte[] r1 = A05(r2, r9, r0)     // Catch:{ all -> 0x0376 }
            int r0 = r2.read()     // Catch:{ all -> 0x0376 }
            if (r0 > 0) goto L_0x0357
            java.io.ByteArrayInputStream r9 = X.C90524aI.A0P(r1)     // Catch:{ all -> 0x0376 }
            int r0 = r9.available()     // Catch:{ all -> 0x034d }
            r5 = 0
            if (r0 != 0) goto L_0x02c1
            X.9O0[] r6 = new X.AnonymousClass9O0[r5]     // Catch:{ all -> 0x034d }
            goto L_0x0340
        L_0x02c1:
            int r4 = r6.length     // Catch:{ all -> 0x034d }
            if (r8 == r4) goto L_0x02cd
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
        L_0x02c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x034d }
            throw r0     // Catch:{ all -> 0x034d }
        L_0x02cb:
            int r5 = r5 + 1
        L_0x02cd:
            if (r5 >= r8) goto L_0x0340
            r0 = 2
            A01(r9, r0)     // Catch:{ all -> 0x034d }
            long r0 = A01(r9, r0)     // Catch:{ all -> 0x034d }
            int r10 = (int) r0     // Catch:{ all -> 0x034d }
            byte[] r1 = A04(r9, r10)     // Catch:{ all -> 0x034d }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x034d }
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x034d }
            r15.<init>(r1, r0)     // Catch:{ all -> 0x034d }
            r0 = 4
            long r0 = A01(r9, r0)     // Catch:{ all -> 0x034d }
            int r11 = A00(r9)     // Catch:{ all -> 0x034d }
            r14 = r15
            if (r4 <= 0) goto L_0x0335
            java.lang.String r10 = "!"
            int r10 = r15.indexOf(r10)     // Catch:{ all -> 0x034d }
            if (r10 >= 0) goto L_0x02fd
            java.lang.String r10 = ":"
            int r10 = r15.indexOf(r10)     // Catch:{ all -> 0x034d }
        L_0x02fd:
            if (r10 <= 0) goto L_0x0303
            java.lang.String r14 = X.C165607th.A0o(r10, r15)     // Catch:{ all -> 0x034d }
        L_0x0303:
            r13 = 0
        L_0x0304:
            r10 = r6[r13]     // Catch:{ all -> 0x034d }
            java.lang.String r12 = r10.A07     // Catch:{ all -> 0x034d }
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x034d }
            if (r12 == 0) goto L_0x0315
            r10.A01 = r0     // Catch:{ all -> 0x034d }
            int[] r12 = new int[r11]     // Catch:{ all -> 0x034d }
            r13 = 0
            r1 = 0
            goto L_0x031a
        L_0x0315:
            int r13 = r13 + 1
            if (r13 >= r4) goto L_0x0335
            goto L_0x0304
        L_0x031a:
            if (r13 >= r11) goto L_0x0326
            int r0 = A00(r9)     // Catch:{ all -> 0x034d }
            int r1 = r1 + r0
            r12[r13] = r1     // Catch:{ all -> 0x034d }
            int r13 = r13 + 1
            goto L_0x031a
        L_0x0326:
            byte[] r1 = X.AnonymousClass9BH.A02     // Catch:{ all -> 0x034d }
            r0 = r17
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02cb
            r10.A00 = r11     // Catch:{ all -> 0x034d }
            r10.A02 = r12     // Catch:{ all -> 0x034d }
            goto L_0x02cb
        L_0x0335:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "Missing profile key: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r15, r1)     // Catch:{ all -> 0x034d }
            goto L_0x02c6
        L_0x0340:
            r9.close()     // Catch:{ all -> 0x0376 }
            goto L_0x0347
        L_0x0344:
            r11.close()     // Catch:{ all -> 0x0376 }
        L_0x0347:
            r7.A02 = r6     // Catch:{ all -> 0x0376 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0385, IOException -> 0x0380, IllegalStateException -> 0x038b }
            return r28
        L_0x034d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0352 }
            goto L_0x0375
        L_0x0352:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0376 }
            goto L_0x0375
        L_0x0357:
            java.lang.String r0 = "Content found after the end of file"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0376 }
            goto L_0x0375
        L_0x035e:
            java.lang.String r0 = "Unsupported meta version"
            goto L_0x0363
        L_0x0361:
            java.lang.String r0 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
        L_0x0363:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0376 }
            goto L_0x0375
        L_0x0368:
            java.lang.String r0 = "Invalid magic"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0376 }
            goto L_0x0375
        L_0x036f:
            java.lang.String r0 = "Unsupported meta version"
        L_0x0371:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0376 }
        L_0x0375:
            throw r1     // Catch:{ all -> 0x0376 }
        L_0x0376:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x037b }
            goto L_0x037f
        L_0x037b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0385, IOException -> 0x0380, IllegalStateException -> 0x038b }
        L_0x037f:
            throw r1     // Catch:{ FileNotFoundException -> 0x0385, IOException -> 0x0380, IllegalStateException -> 0x038b }
        L_0x0380:
            r2 = move-exception
            X.B0P r1 = r7.A04
            r0 = 7
            goto L_0x0392
        L_0x0385:
            r2 = move-exception
            X.B0P r1 = r7.A04
            r0 = 9
            goto L_0x0392
        L_0x038b:
            r2 = move-exception
            r7.A02 = r3
            X.B0P r1 = r7.A04
            r0 = 8
        L_0x0392:
            r1.BfO(r0, r2)
        L_0x0395:
            return r28
        L_0x0396:
            java.lang.String r0 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202929mx.A06():X.9mx");
    }

    public boolean A07() {
        int i;
        Integer num;
        if (this.A07 == null) {
            i = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (!this.A05.canWrite()) {
            i = 4;
            num = null;
        } else {
            this.A00 = true;
            return true;
        }
        A03(this, num, i);
        return false;
    }

    public C202929mx(AssetManager assetManager, B0P b0p, File file, String str, Executor executor) {
        this.A03 = assetManager;
        this.A08 = executor;
        this.A04 = b0p;
        this.A06 = str;
        this.A05 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AnonymousClass9BH.A02;
                    break;
                case 26:
                    bArr = AnonymousClass9BH.A03;
                    break;
                case 27:
                    bArr = AnonymousClass9BH.A04;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AnonymousClass9BH.A05;
                    break;
                default:
                    bArr = AnonymousClass9BH.A06;
                    break;
            }
        }
        this.A07 = bArr;
    }

    public static long A01(InputStream inputStream, int i) {
        byte[] A042 = A04(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (A042[i2] & 255)) << (i2 * 8);
        }
        return j;
    }
}
