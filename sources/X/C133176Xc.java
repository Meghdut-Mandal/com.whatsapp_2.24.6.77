package X;

import android.util.Base64;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6Xc  reason: invalid class name and case insensitive filesystem */
public class C133176Xc {
    public C121655tV A00;
    public C132246Su A01;
    public Exception A02;
    public String A03;
    public String A04;
    public final C19700wN A05;
    public final C20690y0 A06;
    public final AnonymousClass1DT A07;
    public final Mp4Ops A08;
    public final C20050ww A09;
    public final AnonymousClass1AV A0A;
    public final C19630wG A0B;
    public final C20060wx A0C;
    public final C121555tK A0D;
    public final C20810yC A0E;
    public final AnonymousClass1GO A0F;
    public final C101334xN A0G;
    public final C129166Fp A0H;
    public final AnonymousClass68C A0I;
    public final C119695qI A0J;
    public final AnonymousClass6Fc A0K;
    public final AnonymousClass6ML A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final URL A0P;
    public final byte[] A0Q;
    public final int[] A0R;
    public final C19970wo A0S;
    public final AnonymousClass1BW A0T;
    public final AnonymousClass1BV A0U;
    public final C1265864p A0V;
    public final String A0W;

    public static boolean A05(C133176Xc r9, String str) {
        long j;
        BufferedInputStream bufferedInputStream;
        if (str != null) {
            try {
                File file = r9.A0N;
                MessageDigest A0s = C90504aG.A0s();
                int[] iArr = r9.A0R;
                if (iArr == null || iArr.length != 4) {
                    j = -1;
                } else {
                    j = (long) (iArr[0] + iArr[1] + iArr[2]);
                }
                bufferedInputStream = new BufferedInputStream(new AnonymousClass5RB(AnonymousClass1GW.A0J(file), j));
                AnonymousClass6UG.A03(bufferedInputStream, A0s);
                String encodeToString = Base64.encodeToString(A0s.digest(), 2);
                bufferedInputStream.close();
                if (str.equals(encodeToString)) {
                    return true;
                }
                Log.e("ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match");
                return false;
            } catch (IOException | NoSuchAlgorithmException e) {
                Log.e("ProgressiveJpegUtils/validatePartialHashesFailed", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
    }

    public static C146096v1 A00(C133176Xc r9, URL url, long j, long j2) {
        C146096v1 A022 = r9.A0U.A02(r9.A0V, r9.A0W, url, j, j2, true);
        if (r9.A00 == null) {
            r9.A00 = new C121655tV(A022.A01.getHeaderField("X-WA-Metadata"), A022.A00);
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r3 == -1) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C1261162p r17, X.C133176Xc r18, X.AnonymousClass6QJ r19, java.io.RandomAccessFile r20, java.io.RandomAccessFile r21, int r22) {
        /*
            r6 = r22
            r3 = r19
            long r13 = r3.A05(r6)
            int r0 = r3.A02(r6)
            long r15 = (long) r0
            r2 = r21
            r2.seek(r13)     // Catch:{ 1GY -> 0x008d }
            r4 = 0
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x001c
            r0 = 16
            long r4 = r13 - r0
        L_0x001c:
            r0 = r20
            r0.seek(r4)     // Catch:{ 1GY -> 0x008d }
            r7 = 1
            X.7pV r10 = new X.7pV     // Catch:{ 1GY -> 0x008d }
            r8 = r18
            r10.<init>(r8, r0, r7)     // Catch:{ 1GY -> 0x008d }
            X.5RI r11 = new X.5RI     // Catch:{ 1GY -> 0x008d }
            r11.<init>(r8, r2)     // Catch:{ 1GY -> 0x008d }
            int r12 = r22 * 10
            r9 = r17
            r9.A00(r10, r11, r12, r13, r15)     // Catch:{ 1GY -> 0x008d }
            X.C90514aH.A1M(r2)     // Catch:{ 1GY -> 0x008d }
            X.68C r0 = r8.A0I
            int r1 = r0.A02
            r0 = 2
            if (r1 != r0) goto L_0x008c
            X.6Su r9 = r8.A01
            X.C18740tg.A06(r9)
            int r0 = r9.A00
            if (r0 != 0) goto L_0x008c
            r0 = 0
            long r5 = r3.A01
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x006d
            int r2 = r3.A03(r0)
        L_0x0054:
            int r1 = r3.A00
            if (r2 >= r1) goto L_0x0061
            boolean r0 = r3.A09(r2)
            if (r0 == 0) goto L_0x0061
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0061:
            if (r2 == r1) goto L_0x006d
            long r3 = r3.A05(r2)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r3 = r5
        L_0x006e:
            boolean r0 = r9.A02(r3)
            if (r0 != 0) goto L_0x008c
            X.6Su r0 = r8.A01
            int r0 = r0.A00
            if (r0 != r7) goto L_0x0086
            X.0y0 r1 = r8.A06
            java.io.File r0 = r8.A0N
            java.io.File r0 = r1.A0N(r0)
            r0.createNewFile()
            return
        L_0x0086:
            X.5Ue r0 = new X.5Ue
            r0.<init>()
            throw r0
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133176Xc.A01(X.62p, X.6Xc, X.6QJ, java.io.RandomAccessFile, java.io.RandomAccessFile, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C133176Xc r5) {
        /*
            X.68C r2 = r5.A0I
            X.1Gl r0 = r2.A0A
            boolean r1 = r2.A0Y
            boolean r0 = X.AnonymousClass6Y1.A04(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r4 = 0
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.A0P
            if (r0 != 0) goto L_0x0031
            int[] r3 = r5.A0R
            if (r3 == 0) goto L_0x0031
            X.6Fp r2 = r5.A0H
            byte[] r0 = r2.A0H()
            if (r0 != 0) goto L_0x0031
            java.io.File r1 = r5.A0N
            r0 = r3[r4]
            byte[] r0 = X.AnonymousClass6ML.A00(r1, r0)
            r2.A0G(r0)
            if (r0 == 0) goto L_0x0031
            r4 = 1
        L_0x0031:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133176Xc.A02(X.6Xc):boolean");
    }

    public static boolean A03(C133176Xc r9, long j) {
        long j2;
        int i = r9.A0G.A14;
        if (i == 2 || i == 3) {
            AnonymousClass68C r1 = r9.A0I;
            if (!r1.A0Y || !AnonymousClass6Y1.A0A(r1.A0A) || i != 3) {
                int[] iArr = r9.A0R;
                if (iArr != null) {
                    j2 = (long) iArr[0];
                } else {
                    j2 = 262144;
                }
            } else {
                long j3 = r1.A07;
                long j4 = r1.A06;
                if (j4 == 0) {
                    j2 = 0;
                } else {
                    j2 = (long) Math.ceil((double) (5.0f * (((float) j3) / ((float) j4))));
                }
            }
            if (j >= j2) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(C133176Xc r8, AnonymousClass6QJ r9) {
        int[] iArr;
        String str;
        AnonymousClass68C r7 = r8.A0I;
        if (r7.A02 == 3 && r9 != null && (iArr = r8.A0R) != null && iArr.length == 4 && (str = r7.A0M) != null && r9.A09(0) && r9.A09(1) && r9.A09(2)) {
            try {
                if (r8.A0L.A01(r8.A0N, iArr[0], r7.A0Y) && A05(r8, str)) {
                    return A06(r8, iArr);
                }
            } catch (IOException e) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.C133176Xc r7, int[] r8) {
        /*
            java.io.File r1 = r7.A0N
            r6 = 0
            r4 = 1
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0032 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0032 }
            r1 = r8[r6]     // Catch:{ all -> 0x002b }
            r0 = r8[r4]     // Catch:{ all -> 0x002b }
            int r1 = r1 + r0
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x002b }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ all -> 0x002b }
            r5.seek(r2)     // Catch:{ all -> 0x002b }
            byte[] r0 = X.AnonymousClass1GW.A02     // Catch:{ all -> 0x002b }
            r5.write(r0)     // Catch:{ all -> 0x002b }
            r0 = 2
            long r0 = (long) r0     // Catch:{ all -> 0x002b }
            long r2 = r2 + r0
            r5.setLength(r2)     // Catch:{ all -> 0x002b }
            X.C90514aH.A1M(r5)     // Catch:{ all -> 0x002b }
            r5.close()     // Catch:{ IOException -> 0x0032 }
            r0 = 1
            goto L_0x0038
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IOException -> 0x0032 }
            throw r0     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
        L_0x0038:
            X.6Fp r1 = r7.A0H
            if (r0 == 0) goto L_0x004a
            monitor-enter(r1)
            r1.A0G = r4     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            X.6Fc r1 = r7.A0K
            r0 = 3
            r1.A04(r0)
            return r4
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004a:
            r1.A06()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133176Xc.A06(X.6Xc, int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x006d, code lost:
        if (r2 == 2) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C133176Xc(X.C19700wN r6, X.C20690y0 r7, X.AnonymousClass1DT r8, com.whatsapp.Mp4Ops r9, X.C20050ww r10, X.AnonymousClass1AV r11, X.C19970wo r12, X.C19630wG r13, X.C20060wx r14, X.AnonymousClass1BW r15, X.C20810yC r16, X.AnonymousClass1BV r17, X.AnonymousClass1GO r18, X.C101334xN r19, X.C129166Fp r20, X.AnonymousClass68C r21, X.C119695qI r22, X.C1265864p r23, X.AnonymousClass6Fc r24, X.AnonymousClass6ML r25, java.io.File r26, java.io.File r27, java.io.File r28, java.lang.String r29, java.net.URL r30, byte[] r31, int[] r32) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0B = r13
            r5.A0S = r12
            r5.A08 = r9
            r0 = r16
            r5.A0E = r0
            r5.A05 = r6
            r5.A06 = r7
            r5.A09 = r10
            r5.A0C = r14
            r5.A0T = r15
            r5.A0A = r11
            r5.A07 = r8
            r0 = r18
            r5.A0F = r0
            r0 = r25
            r5.A0L = r0
            r0 = r31
            r5.A0Q = r0
            r4 = r21
            r5.A0I = r4
            r3 = r20
            r5.A0H = r3
            r0 = r32
            r5.A0R = r0
            r0 = r17
            r5.A0U = r0
            r0 = r22
            r5.A0J = r0
            X.1Gl r0 = r4.A0A
            X.6ss r1 = new X.6ss
            r1.<init>(r0)
            byte[] r0 = r4.A0d
            X.5tK r0 = r1.B5L(r0)
            r5.A0D = r0
            r0 = r19
            r5.A0G = r0
            r0 = r24
            r5.A0K = r0
            r0 = r30
            r5.A0P = r0
            r0 = r26
            r5.A0O = r0
            r0 = r27
            r5.A0N = r0
            r0 = r28
            r5.A0M = r0
            r0 = r23
            r5.A0V = r0
            int r2 = r4.A02
            r0 = 3
            if (r2 == r0) goto L_0x006f
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0070
        L_0x006f:
            r0 = 1
        L_0x0070:
            X.C18740tg.A0C(r0)
            r0 = 3
            if (r2 != r0) goto L_0x0082
            java.lang.String r1 = r4.A0M
            r0 = 6
            if (r1 != 0) goto L_0x007c
            r0 = 4
        L_0x007c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
        L_0x0082:
            r0 = r29
            r5.A0W = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133176Xc.<init>(X.0wN, X.0y0, X.1DT, com.whatsapp.Mp4Ops, X.0ww, X.1AV, X.0wo, X.0wG, X.0wx, X.1BW, X.0yC, X.1BV, X.1GO, X.4xN, X.6Fp, X.68C, X.5qI, X.64p, X.6Fc, X.6ML, java.io.File, java.io.File, java.io.File, java.lang.String, java.net.URL, byte[], int[]):void");
    }
}
