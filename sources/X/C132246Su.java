package X;

import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6Su  reason: invalid class name and case insensitive filesystem */
public class C132246Su {
    public static final byte[] A08 = {102, 116, 121, 112};
    public static final byte[] A09 = {109, 100, 97, 116};
    public static final byte[] A0A = {109, 111, 111, 118};
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final C19700wN A03;
    public final Mp4Ops A04;
    public final AnonymousClass1AV A05;
    public final C19630wG A06;
    public final File A07;

    public static int A00(int i, int i2, int i3, int i4) {
        return (((((i & 255) << 24) | ((i2 & 255) << 16)) | ((i3 & 255) << 8)) | (i4 & 255)) - 8;
    }

    private int A01(boolean z) {
        AnonymousClass5V4 r1;
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        try {
            AnonymousClass1AV r4 = this.A05;
            File file = this.A07;
            long j = this.A02;
            Log.i("mp4ops/check/start");
            C1041958q A002 = AnonymousClass1AV.A00(r4, file, C36361kB.A0i(), false);
            int i = 0;
            while (true) {
                try {
                    mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z, j);
                    if (mp4streamcheck.success || !mp4streamcheck.ioException) {
                        break;
                    }
                    SystemClock.sleep(100);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/integration fail/", e);
                    r1 = new AnonymousClass5V4(0, C36331k8.A0i("stream integrity check error: ", AnonymousClass000.A0u(), e));
                }
            }
            C18740tg.A06(mp4streamcheck);
            if (mp4streamcheck.success) {
                Log.i("mp4ops/streamcheck/finished");
                long length = file.length();
                if (A002 != null) {
                    Long l = A002.A0E;
                    if (l != null) {
                        A002.A0E = C90484aE.A0i(l, System.nanoTime());
                    }
                    A002.A0D = C36441kJ.A0y(mp4streamcheck.errorCode);
                    A002.A0B = Long.valueOf(length);
                    A002.A0C = Long.valueOf(mp4streamcheck.bytesRequiredToExtractThumbnail);
                    r4.A01.Bly(A002);
                }
                long j2 = mp4streamcheck.bytesRequiredToExtractThumbnail;
                if (j2 <= 0) {
                    return 1;
                }
                this.A01 = j2;
                return 1;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("mp4ops/streamcheck/error_message/");
            C36321k7.A1Z(A0u, mp4streamcheck.errorMessage);
            int i2 = mp4streamcheck.errorCode;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("integrity check failed, error_code: ");
            A0u2.append(i2);
            A0u2.append(" | message: ");
            r1 = new AnonymousClass5V4(i2, AnonymousClass000.A0q(mp4streamcheck.errorMessage, A0u2));
            throw r1;
        } catch (AnonymousClass5V4 e2) {
            Log.e("Mp4StreamCheck/failed/exception", e2);
            return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r5 = 0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
        if (r12 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c1, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c3, code lost:
        r0 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r5 > r0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ce, code lost:
        if (r5 <= (r0 - 1024)) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d1, code lost:
        r3 = A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d8, code lost:
        com.whatsapp.util.Log.e("Mp4StreamCheck/mdat before moov, failing check");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r3 = A01(true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(long r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0006
            r2 = 0
            return r2
        L_0x0006:
            java.io.File r0 = r14.A07
            java.io.FileInputStream r8 = X.C90524aI.A0U(r0)
            r6 = 8
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x00fa }
            r4 = 0
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x00fa }
            r7 = 1
            if (r0 != r6) goto L_0x00de
            byte[] r3 = A08     // Catch:{ all -> 0x00fa }
            r9 = 4
            r2 = 0
        L_0x001c:
            int r0 = r2 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r3[r2]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            int r2 = r2 + 1
            r0 = 1
            if (r2 >= r9) goto L_0x002c
            goto L_0x001c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r3 = 2
            if (r0 == 0) goto L_0x00e6
            byte r10 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r2 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            r13 = 3
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r11 = A00(r10, r2, r1, r0)
            int r2 = r11 + 8
            long r0 = (long) r2
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x00de
            long r0 = (long) r11     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            r12 = 0
        L_0x0048:
            int r0 = r2 + 8
            long r0 = (long) r0     // Catch:{ all -> 0x00fa }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x00bc
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x00fa }
            int r2 = r2 + r0
            if (r0 != r6) goto L_0x00de
            byte[] r11 = A0A     // Catch:{ all -> 0x00fa }
            r10 = 0
        L_0x0059:
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r11[r10]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x0082
            byte[] r11 = A09     // Catch:{ all -> 0x00fa }
            r10 = 0
        L_0x0064:
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r11[r10]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x007d
            byte r11 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r10 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r10 = A00(r11, r10, r1, r0)     // Catch:{ all -> 0x00fa }
            long r0 = (long) r10     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00b6
        L_0x007d:
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x0064
            goto L_0x0087
        L_0x0082:
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x0059
            goto L_0x009e
        L_0x0087:
            byte r9 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r6 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r6 = A00(r9, r6, r1, r0)
            int r0 = r2 + 8
            long r0 = (long) r0
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x00de
            int r2 = r2 + r6
            long r5 = (long) r2
            r0 = 1
            goto L_0x00bf
        L_0x009e:
            byte r11 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r10 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r11 = A00(r11, r10, r1, r0)
            int r2 = r2 + r11
            long r0 = (long) r2
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x00de
            long r0 = (long) r11     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            r12 = 1
            goto L_0x0048
        L_0x00b6:
            int r2 = r2 + r10
            long r0 = (long) r2     // Catch:{ all -> 0x00fa }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0048
        L_0x00bc:
            r5 = 0
            r0 = 0
        L_0x00bf:
            if (r12 == 0) goto L_0x00d6
            if (r0 == 0) goto L_0x00de
            long r0 = r14.A02     // Catch:{ all -> 0x00fa }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e6
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d1
            goto L_0x00e2
        L_0x00d1:
            int r3 = r14.A01(r4)     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00d6:
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "Mp4StreamCheck/mdat before moov, failing check"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00de:
            r2 = 1
            java.lang.String r0 = "Mp4StreamCheck/need more data to attempt stream check"
            goto L_0x00f3
        L_0x00e2:
            int r3 = r14.A01(r7)     // Catch:{ all -> 0x00fa }
        L_0x00e6:
            r14.A00 = r3     // Catch:{ all -> 0x00fa }
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "Mp4StreamCheck/check complete: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x00fa }
        L_0x00f3:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            r8.close()
            return r2
        L_0x00fa:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ff }
            throw r1
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132246Su.A02(long):boolean");
    }

    public C132246Su(C19700wN r3, Mp4Ops mp4Ops, AnonymousClass1AV r5, C19630wG r6, File file, long j) {
        this.A06 = r6;
        this.A04 = mp4Ops;
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = file;
        this.A02 = j;
    }
}
