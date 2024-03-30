package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.6T5  reason: invalid class name */
public class AnonymousClass6T5 {
    public boolean A00;
    public final C19700wN A01;
    public final C20690y0 A02;
    public final AnonymousClass1DT A03;
    public final C20810yC A04;
    public final C124935z2 A05;
    public final C101334xN A06;
    public final C129166Fp A07;
    public final AnonymousClass68C A08;
    public final AnonymousClass6Fk A09;
    public final WebpUtils A0A;
    public final AnonymousClass1B0 A0B;
    public final C25561Gu A0C;
    public final C25541Gs A0D;
    public final C19770wU A0E;
    public final URL A0F;
    public final C20050ww A0G;
    public final C20060wx A0H;
    public final AnonymousClass1BV A0I;
    public final AnonymousClass1BU A0J;
    public final AnonymousClass1GO A0K;
    public final AnonymousClass1BS A0L;
    public final C21570zS A0M;

    public static void A00(AnonymousClass68C r7, File file, File file2) {
        AnonymousClass5RJ r4;
        C144826ss r1 = new C144826ss(r7.A0A);
        byte[] bArr = r7.A0d;
        C18740tg.A06(bArr);
        C121555tK B5L = r1.B5L(bArr);
        try {
            FileInputStream A0U = C90524aI.A0U(file);
            try {
                FileOutputStream A0W = C90524aI.A0W(file2);
                try {
                    r4 = new AnonymousClass5RJ(B5L, A0W, file.length());
                    byte[] bArr2 = new byte[DefaultCrypto.BUFFER_SIZE];
                    for (int read = A0U.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE); read > 0; read = A0U.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE)) {
                        r4.write(bArr2);
                    }
                    if (!r4.A01) {
                        file2.getCanonicalPath();
                        C110995bZ.A01(r7);
                    } else {
                        file2.getCanonicalPath();
                        file2.length();
                    }
                    r4.close();
                    A0W.close();
                    A0U.close();
                    return;
                } catch (Throwable th) {
                    A0W.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0U.close();
                throw th2;
            }
        } catch (IOException unused) {
            C110995bZ.A01(r7);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    private void A01(String str) {
        if (str == null) {
            Log.e("normalDownloadHandler/cancelExpressPathFileCleanUp cancel work with empty enc hash");
        } else {
            C90514aH.A0V(this.A0M).A0B(str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:67|68) */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0508, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x050d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x050f, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        X.C110995bZ.A01(r3);
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        r8 = new X.C133136Wx(9, (java.lang.String) null, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        r31.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0594, code lost:
        if (r2.A0C() == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0598, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x059a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x059b, code lost:
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05a6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x063d, code lost:
        if (r2.A0C() == false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.C110995bZ.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0222, code lost:
        if (r33 > 0) goto L_0x0224;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:195:0x042d, B:267:0x0504] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:330:0x0587, B:343:0x059d] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:326:0x057b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:360:0x05b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:382:0x05ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x01cf */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x051f A[Catch:{ all -> 0x0567 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x053f A[SYNTHETIC, Splitter:B:295:0x053f] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x057b A[SYNTHETIC, Splitter:B:326:0x057b] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x05c9 A[Catch:{ all -> 0x065c, all -> 0x0667 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106 A[Catch:{ all -> 0x05ca, all -> 0x05cf, 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010a A[ADDED_TO_REGION, Catch:{ all -> 0x05ca, all -> 0x05cf, 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156 A[Catch:{ all -> 0x05ca, all -> 0x05cf, 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f4 A[SYNTHETIC, Splitter:B:72:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0202 A[Catch:{ all -> 0x05ca, all -> 0x05cf, 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C133136Wx A02(X.C1265864p r49, java.io.File r50, java.lang.String r51, java.net.URL r52, boolean r53) {
        /*
            r48 = this;
            r4 = r48
            X.68C r3 = r4.A08
            int r0 = r3.A00
            r33 = r0
            int r0 = r0 + 15
            int r0 = r0 / 16
            int r32 = r0 * 16
            java.io.File r13 = r3.A0D
            java.lang.String r2 = "; url="
            r47 = r52
            if (r13 == 0) goto L_0x0676
            long r5 = r13.length()
            X.6Fk r2 = r4.A09
            r2.A07 = r5
            X.6Fp r0 = r4.A07
            r45 = r0
            r0.A0B(r5)
            if (r53 == 0) goto L_0x0073
            r0 = r32
            long r0 = (long) r0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0073
            X.1Gl r0 = r3.A0A
            X.6ss r1 = new X.6ss
            r1.<init>(r0)
            byte[] r0 = r3.A0d
            X.C18740tg.A06(r0)
            X.5tK r17 = r1.B5L(r0)
            X.0wN r10 = r4.A01
            com.whatsapp.stickers.WebpUtils r9 = r4.A0A
            X.0y0 r8 = r4.A02
            X.1Gu r7 = r4.A0C
            X.1B0 r6 = r4.A0B
            X.1DT r5 = r4.A03
            X.1Gs r2 = r4.A0D
            X.4xN r1 = r4.A06
            int r0 = r1.A14
            r14 = r10
            r15 = r8
            r16 = r5
            r18 = r1
            r19 = r45
            r20 = r3
            r21 = r9
            r22 = r6
            r23 = r7
            r24 = r2
            r25 = r13
            r26 = r0
            r27 = r32
            X.AnonymousClass6YC.A09(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = 14
            r0 = 0
            X.6Wx r8 = X.C133136Wx.A00(r1, r0)
        L_0x0072:
            return r8
        L_0x0073:
            r0 = 0
            int r16 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r16)
            r4.A00 = r0     // Catch:{ all -> 0x0667 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0643 }
            java.security.MessageDigest r15 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0643 }
            r14 = r50
            long r0 = r3.A07     // Catch:{ IOException -> 0x00fc }
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00fa
            X.0yC r9 = r4.A04     // Catch:{ IOException -> 0x00fc }
            X.0yV r8 = X.C21000yV.A01     // Catch:{ IOException -> 0x00fc }
            r7 = 1539(0x603, float:2.157E-42)
            boolean r7 = X.C20800yB.A01(r8, r9, r7)     // Catch:{ IOException -> 0x00fc }
            if (r7 == 0) goto L_0x00fa
            java.lang.String r8 = X.AnonymousClass6UG.A01(r13, r15)     // Catch:{ IOException -> 0x00fc }
            java.lang.String r7 = r3.A0G     // Catch:{ IOException -> 0x00fc }
            boolean r9 = r8.equals(r7)     // Catch:{ IOException -> 0x00fc }
            if (r9 == 0) goto L_0x00fa
            r13.getCanonicalPath()     // Catch:{ IOException -> 0x00fc }
            X.C110995bZ.A01(r3)     // Catch:{ IOException -> 0x00fc }
            long r11 = r14.length()     // Catch:{ IOException -> 0x00fc }
            int r9 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x00bb
            r13.getCanonicalPath()     // Catch:{ IOException -> 0x00fc }
            A00(r3, r13, r14)     // Catch:{ IOException -> 0x00fc }
        L_0x00bb:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00fc }
            r2.A0B = r0     // Catch:{ IOException -> 0x00fc }
            r0 = 3
            r2.A03 = r0     // Catch:{ IOException -> 0x00fc }
            java.lang.String r23 = X.AnonymousClass6UG.A01(r14, r10)     // Catch:{ IOException -> 0x00fc }
            java.lang.Boolean r1 = X.C36381kD.A0j()     // Catch:{ IOException -> 0x00fc }
            r0 = 0
            X.5tV r9 = new X.5tV     // Catch:{ IOException -> 0x00fc }
            r9.<init>(r0, r1)     // Catch:{ IOException -> 0x00fc }
            X.4xN r11 = r4.A06     // Catch:{ IOException -> 0x00fc }
            r0 = r5
            r17 = r11
            r18 = r9
            r19 = r3
            r20 = r13
            r21 = r14
            r22 = r8
            r24 = r47
            X.6Wx r8 = X.AnonymousClass6YC.A04(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x00fd }
            r2.A08()     // Catch:{ IOException -> 0x00fd }
            boolean r9 = r8.A03()     // Catch:{ IOException -> 0x00fd }
            if (r9 == 0) goto L_0x0102
            r4.A01(r7)     // Catch:{ IOException -> 0x00fd }
            X.0y0 r7 = r4.A02     // Catch:{ IOException -> 0x00fd }
            X.AnonymousClass6YC.A0C(r7, r8, r13, r14)     // Catch:{ IOException -> 0x00fd }
            goto L_0x064e
        L_0x00fa:
            r0 = r5
            goto L_0x0102
        L_0x00fc:
            r0 = r5
        L_0x00fd:
            java.lang.String r7 = "normaldownloadhandler/downloadnormal error when suspect local has full data and try to return early"
            com.whatsapp.util.Log.e((java.lang.String) r7)     // Catch:{ all -> 0x0667 }
        L_0x0102:
            X.1BV r9 = r4.A0I     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            if (r16 > 0) goto L_0x0108
            r5 = 0
        L_0x0108:
            if (r53 == 0) goto L_0x0110
            if (r33 <= 0) goto L_0x0110
            int r7 = r32 + -1
            long r7 = (long) r7     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            goto L_0x0112
        L_0x0110:
            r7 = -1
        L_0x0112:
            r25 = 1
            r18 = r49
            r19 = r51
            r17 = r9
            r20 = r47
            r21 = r5
            r23 = r7
            X.6v1 r31 = r17.A02(r18, r19, r20, r21, r23, r25)     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            r2.A07()     // Catch:{ all -> 0x05ca }
            r5 = r31
            java.lang.Boolean r7 = r5.A00     // Catch:{ all -> 0x05ca }
            r2.A0H = r7     // Catch:{ all -> 0x05ca }
            java.net.HttpURLConnection r9 = r5.A01     // Catch:{ all -> 0x05ca }
            int r5 = r9.getResponseCode()     // Catch:{ all -> 0x05ca }
            java.lang.Long r5 = X.C36441kJ.A0y(r5)     // Catch:{ all -> 0x05ca }
            r2.A0R = r5     // Catch:{ all -> 0x05ca }
            java.lang.String r5 = "x-fb-application-protocol"
            java.lang.String r5 = r9.getHeaderField(r5)     // Catch:{ all -> 0x05ca }
            r2.A0X = r5     // Catch:{ all -> 0x05ca }
            java.lang.String r5 = "X-WA-Metadata"
            java.lang.String r6 = r9.getHeaderField(r5)     // Catch:{ all -> 0x05ca }
            X.5tV r30 = new X.5tV     // Catch:{ all -> 0x05ca }
            r5 = r30
            r5.<init>(r6, r7)     // Catch:{ all -> 0x05ca }
            int r6 = r9.getResponseCode()     // Catch:{ all -> 0x05ca }
            r5 = 416(0x1a0, float:5.83E-43)
            if (r6 != r5) goto L_0x01d2
            java.lang.String r5 = "Content-Range"
            java.lang.String r6 = r9.getHeaderField(r5)     // Catch:{ all -> 0x05ca }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x05ca }
            if (r5 != 0) goto L_0x01d2
            java.lang.String r5 = "*/"
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x05ca }
            if (r5 == 0) goto L_0x01d2
            r5 = 47
            int r5 = r6.lastIndexOf(r5)     // Catch:{ NumberFormatException -> 0x01cf }
            int r5 = r5 + 1
            java.lang.String r5 = r6.substring(r5)     // Catch:{ NumberFormatException -> 0x01cf }
            long r6 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x01cf }
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x01d2
            r13.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r7 = r3.A0G     // Catch:{ NumberFormatException -> 0x01cf }
            X.C110995bZ.A01(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            long r11 = r14.length()     // Catch:{ NumberFormatException -> 0x01cf }
            long r5 = r3.A07     // Catch:{ NumberFormatException -> 0x01cf }
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0196
            r13.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x01cf }
            A00(r3, r13, r14)     // Catch:{ NumberFormatException -> 0x01cf }
        L_0x0196:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x01cf }
            r2.A0B = r5     // Catch:{ NumberFormatException -> 0x01cf }
            r5 = 3
            r2.A03 = r5     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r22 = X.AnonymousClass6UG.A01(r13, r15)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r23 = X.AnonymousClass6UG.A01(r14, r10)     // Catch:{ NumberFormatException -> 0x01cf }
            X.4xN r5 = r4.A06     // Catch:{ NumberFormatException -> 0x01cf }
            r17 = r5
            r18 = r30
            r19 = r3
            r20 = r13
            r21 = r14
            r24 = r47
            X.6Wx r8 = X.AnonymousClass6YC.A04(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ NumberFormatException -> 0x01cf }
            r2.A08()     // Catch:{ NumberFormatException -> 0x01cf }
            r4.A01(r7)     // Catch:{ NumberFormatException -> 0x01cf }
            X.0y0 r5 = r4.A02     // Catch:{ NumberFormatException -> 0x01cf }
            X.AnonymousClass6YC.A0C(r5, r8, r13, r14)     // Catch:{ NumberFormatException -> 0x01cf }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x01cf:
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x05ca }
        L_0x01d2:
            int r5 = r9.getContentLength()     // Catch:{ all -> 0x05ca }
            long r5 = (long) r5     // Catch:{ all -> 0x05ca }
            long r21 = r0 + r5
            X.0wx r5 = r4.A0H     // Catch:{ all -> 0x05ca }
            long r11 = r5.A01()     // Catch:{ all -> 0x05ca }
            X.0yC r5 = r4.A04     // Catch:{ all -> 0x05ca }
            r44 = r5
            r6 = 1291(0x50b, float:1.809E-42)
            int r5 = r5.A07(r6)     // Catch:{ all -> 0x05ca }
            long r7 = X.C90504aG.A0E(r5)
            long r7 = r7 + r21
            r6 = 4
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0202
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x05ca }
            boolean r0 = r4.A00     // Catch:{ all -> 0x05ca }
            X.6Wx r8 = X.C133136Wx.A00(r6, r0)     // Catch:{ all -> 0x05ca }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            goto L_0x0639
        L_0x0202:
            r7 = 0
            X.4xN r8 = r4.A06     // Catch:{ all -> 0x05ca }
            boolean r5 = r8.A06     // Catch:{ all -> 0x05ca }
            if (r5 == 0) goto L_0x0256
            int r6 = r8.A14     // Catch:{ all -> 0x05ca }
            r5 = 1
            if (r5 != r6) goto L_0x0256
            X.1GO r5 = r4.A0K     // Catch:{ all -> 0x05ca }
            r20 = r5
            X.1Gl r5 = r3.A0A     // Catch:{ all -> 0x05ca }
            r19 = r5
            long r5 = r3.A07     // Catch:{ all -> 0x05ca }
            r17 = r5
            r39 = 0
            boolean r5 = r3.A0Q     // Catch:{ all -> 0x05ca }
            if (r5 != 0) goto L_0x0224
            r40 = 0
            if (r33 <= 0) goto L_0x0226
        L_0x0224:
            r40 = 1
        L_0x0226:
            int r12 = r3.A04     // Catch:{ all -> 0x05ca }
            boolean r11 = r3.A0Y     // Catch:{ all -> 0x05ca }
            boolean r6 = r3.A0X     // Catch:{ all -> 0x05ca }
            boolean r5 = r3.A0S     // Catch:{ all -> 0x05ca }
            r34 = r20
            r35 = r19
            r36 = r12
            r37 = r17
            r41 = r11
            r42 = r6
            r43 = r5
            boolean r5 = r34.A02(r35, r36, r37, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x05ca }
            if (r5 != 0) goto L_0x0256
            r1 = 24
            boolean r0 = r4.A00     // Catch:{ all -> 0x05ca }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x05ca }
            r8.<init>(r1, r7, r0)     // Catch:{ all -> 0x05ca }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0256:
            java.util.concurrent.FutureTask r5 = r8.A02     // Catch:{ all -> 0x05ca }
            boolean r5 = r5.isCancelled()     // Catch:{ all -> 0x05ca }
            if (r5 == 0) goto L_0x0272
            r1 = 13
            boolean r0 = r4.A00     // Catch:{ all -> 0x05ca }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x05ca }
            r8.<init>(r1, r7, r0)     // Catch:{ all -> 0x05ca }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0272:
            if (r16 <= 0) goto L_0x0285
            long r11 = r13.length()     // Catch:{ all -> 0x05ca }
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x0285
            r13.getCanonicalPath()     // Catch:{ all -> 0x05ca }
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x05ca }
            r8.A0I(r0)     // Catch:{ all -> 0x05ca }
        L_0x0285:
            X.1Gl r5 = r3.A0A     // Catch:{ all -> 0x05ca }
            r40 = r5
            X.6ss r6 = new X.6ss     // Catch:{ all -> 0x05ca }
            r6.<init>(r5)     // Catch:{ all -> 0x05ca }
            byte[] r5 = r3.A0d     // Catch:{ all -> 0x05ca }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x05ca }
            X.5tK r29 = r6.B5L(r5)     // Catch:{ all -> 0x05ca }
            r6 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x05b4 }
            r5.<init>(r14, r6)     // Catch:{ IOException -> 0x05b4 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x05b4 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x05b4 }
            X.78q r28 = new X.78q     // Catch:{ IOException -> 0x05b4 }
            r5 = r28
            r5.<init>(r6, r10)     // Catch:{ IOException -> 0x05b4 }
            int r5 = r9.getContentLength()     // Catch:{ all -> 0x05a8 }
            long r5 = (long) r5     // Catch:{ all -> 0x05a8 }
            long r9 = r13.length()     // Catch:{ all -> 0x05a8 }
            long r5 = r5 + r9
            X.5RJ r11 = new X.5RJ     // Catch:{ all -> 0x05a8 }
            r10 = r28
            r9 = r29
            r11.<init>(r9, r10, r5)     // Catch:{ all -> 0x05a8 }
            boolean r5 = r13.exists()     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            if (r5 == 0) goto L_0x02fc
            long r16 = r13.length()     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            r9 = 0
            int r5 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fc
            java.io.FileInputStream r6 = X.AnonymousClass1GW.A0J(r13)     // Catch:{ IOException -> 0x02f7 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x02f7 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x02f7 }
            X.5Qv r12 = new X.5Qv     // Catch:{ IOException -> 0x02f7 }
            r12.<init>(r5, r15)     // Catch:{ IOException -> 0x02f7 }
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r10]     // Catch:{ all -> 0x02ed }
        L_0x02de:
            r6 = 0
            int r5 = r12.read(r9, r6, r10)     // Catch:{ all -> 0x02ed }
            if (r5 < 0) goto L_0x02e9
            r11.write(r9, r6, r5)     // Catch:{ all -> 0x02ed }
            goto L_0x02de
        L_0x02e9:
            r12.close()     // Catch:{ IOException -> 0x02f7 }
            goto L_0x02fc
        L_0x02ed:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x02f2 }
            goto L_0x02f6
        L_0x02f2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x02f7 }
        L_0x02f6:
            throw r1     // Catch:{ IOException -> 0x02f7 }
        L_0x02f7:
            r0 = move-exception
            X.C110995bZ.A01(r3)     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            throw r0     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
        L_0x02fc:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            r5 = 1
            r6.<init>(r13, r5)     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            java.security.DigestOutputStream r27 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            r5 = r27
            r5.<init>(r6, r15)     // Catch:{ IOException -> 0x057b, all -> 0x0575 }
            X.0ww r12 = r4.A0G     // Catch:{ IOException -> 0x0513, all -> 0x0511 }
            boolean r6 = r3.A0Y     // Catch:{ IOException -> 0x0513, all -> 0x0511 }
            r5 = 0
            if (r6 == 0) goto L_0x0311
            r5 = 4
        L_0x0311:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0513, all -> 0x0511 }
            r6 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0513, all -> 0x0511 }
            r5 = r31
            X.5RE r26 = r5.B8D(r12, r10, r9)     // Catch:{ IOException -> 0x0513, all -> 0x0511 }
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r12]     // Catch:{ IOException -> 0x03d7 }
            r9 = 0
            r5 = r26
            int r12 = r5.read(r10, r6, r12)     // Catch:{ IOException -> 0x03d7 }
            r5 = r32
            long r15 = (long) r5
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r25 = X.C36401kF.A1U(r5)
        L_0x0334:
            if (r12 < 0) goto L_0x03d5
            long r17 = r2.A03()     // Catch:{ IOException -> 0x03d7 }
            r23 = -1
            int r5 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r5 != 0) goto L_0x035b
            long r5 = r2.A08     // Catch:{ IOException -> 0x03d7 }
            r19 = r5
            int r5 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x035b
            long r17 = r2.A01()     // Catch:{ IOException -> 0x03d7 }
            int r5 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x035b
            long r17 = X.C90514aH.A0J(r19)     // Catch:{ IOException -> 0x03d7 }
            r5 = r17
            r2.A0E = r5     // Catch:{ IOException -> 0x03d7 }
            r5 = 2
            r2.A03 = r5     // Catch:{ IOException -> 0x03d7 }
        L_0x035b:
            r5 = r27
            r5.write(r10, r9, r12)     // Catch:{ IOException -> 0x03d7 }
            r11.write(r10, r9, r12)     // Catch:{ IOException -> 0x03d7 }
            long r5 = (long) r12     // Catch:{ IOException -> 0x03d7 }
            long r0 = r0 + r5
            X.5z2 r12 = r4.A05     // Catch:{ IOException -> 0x03d7 }
            if (r12 == 0) goto L_0x036b
            r12.A0A = r0     // Catch:{ IOException -> 0x03d7 }
        L_0x036b:
            r2.A0A(r0, r5)     // Catch:{ IOException -> 0x03d7 }
            r17 = 0
            int r5 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1R(r5)
            r4.A00 = r5     // Catch:{ IOException -> 0x03d7 }
            boolean r5 = X.AnonymousClass6Y1.A07(r40)     // Catch:{ IOException -> 0x03d7 }
            if (r5 == 0) goto L_0x03a4
            byte[] r5 = r3.A0c     // Catch:{ IOException -> 0x03d7 }
            if (r33 <= 0) goto L_0x03a4
            if (r5 == 0) goto L_0x03a4
            if (r53 != 0) goto L_0x03a4
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 < 0) goto L_0x03a4
            if (r25 != 0) goto L_0x03a4
            X.0wU r6 = r4.A0E     // Catch:{ IOException -> 0x03d7 }
            r39 = 16
            X.3vW r5 = new X.3vW     // Catch:{ IOException -> 0x03d7 }
            r34 = r5
            r35 = r4
            r36 = r13
            r37 = r29
            r38 = r32
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ IOException -> 0x03d7 }
            r6.Boy(r5)     // Catch:{ IOException -> 0x03d7 }
            r25 = 1
        L_0x03a4:
            r5 = r45
            r5.A0B(r0)     // Catch:{ IOException -> 0x03d7 }
            r8.A0G()     // Catch:{ IOException -> 0x03d7 }
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.A10     // Catch:{ IOException -> 0x03d7 }
            boolean r5 = r5.getAndSet(r9)     // Catch:{ IOException -> 0x03d7 }
            if (r5 == 0) goto L_0x03c8
            long r19 = r21 - r0
            r17 = 52428800(0x3200000, double:2.5903269E-316)
            int r5 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x03c8
            r6 = 488(0x1e8, float:6.84E-43)
            r5 = r44
            boolean r5 = r5.A0E(r6)     // Catch:{ IOException -> 0x03d7 }
            if (r5 == 0) goto L_0x03c8
            goto L_0x03eb
        L_0x03c8:
            r8.A0I(r0)     // Catch:{ IOException -> 0x03d7 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5 = r26
            int r12 = r5.read(r10, r9, r6)     // Catch:{ IOException -> 0x03d7 }
            goto L_0x0334
        L_0x03d5:
            r1 = 0
            goto L_0x03ed
        L_0x03d7:
            r1 = move-exception
            r2.A0B(r1)     // Catch:{ all -> 0x0503 }
            java.net.URL r0 = r4.A0F     // Catch:{ all -> 0x0503 }
            java.lang.String r0 = X.AnonymousClass6VO.A01(r0)     // Catch:{ all -> 0x0503 }
            r2.A0Y = r0     // Catch:{ all -> 0x0503 }
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x0503 }
            int r1 = X.C111015bb.A00(r1)     // Catch:{ all -> 0x0503 }
            goto L_0x03ed
        L_0x03eb:
            r1 = 20
        L_0x03ed:
            if (r53 == 0) goto L_0x0444
            monitor-enter(r2)     // Catch:{ all -> 0x0503 }
            monitor-exit(r2)     // Catch:{ all -> 0x0503 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0503 }
            if (r0 == 0) goto L_0x0424
            X.0wN r14 = r4.A01     // Catch:{ all -> 0x0503 }
            com.whatsapp.stickers.WebpUtils r12 = r4.A0A     // Catch:{ all -> 0x0503 }
            X.0y0 r10 = r4.A02     // Catch:{ all -> 0x0503 }
            X.1Gu r9 = r4.A0C     // Catch:{ all -> 0x0503 }
            X.1B0 r6 = r4.A0B     // Catch:{ all -> 0x0503 }
            X.1DT r5 = r4.A03     // Catch:{ all -> 0x0503 }
            X.1Gs r1 = r4.A0D     // Catch:{ all -> 0x0503 }
            int r0 = r8.A14     // Catch:{ all -> 0x0503 }
            r33 = r14
            r34 = r10
            r35 = r5
            r36 = r29
            r37 = r8
            r38 = r45
            r39 = r3
            r40 = r12
            r41 = r6
            r42 = r9
            r43 = r1
            r44 = r13
            r45 = r0
            r46 = r32
            X.AnonymousClass6YC.A09(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0503 }
        L_0x0424:
            boolean r1 = r4.A00     // Catch:{ all -> 0x0503 }
            r0 = 14
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x0503 }
            r8.<init>(r0, r7, r1)     // Catch:{ all -> 0x0503 }
            r26.close()     // Catch:{ IOException -> 0x050f, all -> 0x050d }
            r27.close()     // Catch:{ IOException -> 0x057b, all -> 0x0577 }
            r11.close()     // Catch:{ all -> 0x0563 }
            r28.close()     // Catch:{ IOException -> 0x055e }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0444:
            if (r1 == 0) goto L_0x0464
            boolean r0 = r4.A00     // Catch:{ all -> 0x0503 }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x0503 }
            r8.<init>(r1, r7, r0)     // Catch:{ all -> 0x0503 }
            r26.close()     // Catch:{ IOException -> 0x050f, all -> 0x050d }
            r27.close()     // Catch:{ IOException -> 0x057b, all -> 0x0577 }
            r11.close()     // Catch:{ all -> 0x0563 }
            r28.close()     // Catch:{ IOException -> 0x055e }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0464:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0503 }
            r2.A0B = r0     // Catch:{ all -> 0x0503 }
            r0 = 3
            r2.A03 = r0     // Catch:{ all -> 0x0503 }
            java.security.MessageDigest r0 = r27.getMessageDigest()     // Catch:{ all -> 0x0503 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0503 }
            java.lang.String r20 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x0503 }
            boolean r0 = r11.A01     // Catch:{ all -> 0x0503 }
            if (r0 == 0) goto L_0x049c
            java.security.MessageDigest r0 = r28.getMessageDigest()     // Catch:{ all -> 0x0503 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0503 }
            java.lang.String r21 = X.C36441kJ.A13(r0)     // Catch:{ all -> 0x0503 }
        L_0x0489:
            r15 = r8
            r16 = r30
            r17 = r3
            r18 = r13
            r19 = r14
            r22 = r47
            X.6Wx r8 = X.AnonymousClass6YC.A04(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0503 }
            r2.A08()     // Catch:{ all -> 0x0503 }
            goto L_0x049f
        L_0x049c:
            r21 = 0
            goto L_0x0489
        L_0x049f:
            r26.close()     // Catch:{ IOException -> 0x050f, all -> 0x050d }
            r27.close()     // Catch:{ IOException -> 0x057b, all -> 0x0577 }
            r11.close()     // Catch:{ all -> 0x0563 }
            r28.close()     // Catch:{ IOException -> 0x055e }
            X.0yV r5 = X.C21000yV.A01     // Catch:{ all -> 0x05ca }
            r1 = 1539(0x603, float:2.157E-42)
            r0 = r44
            boolean r0 = X.C20800yB.A01(r5, r0, r1)     // Catch:{ all -> 0x05ca }
            if (r0 == 0) goto L_0x04bc
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x05ca }
            r4.A01(r0)     // Catch:{ all -> 0x05ca }
        L_0x04bc:
            X.0y0 r9 = r4.A02     // Catch:{ all -> 0x05ca }
            X.AnonymousClass6YC.A0C(r9, r8, r13, r14)     // Catch:{ all -> 0x05ca }
            java.lang.String r7 = r3.A0H     // Catch:{ all -> 0x05ca }
            java.lang.String r6 = r3.A0L     // Catch:{ all -> 0x05ca }
            java.io.File r5 = r9.A0b(r7, r6)     // Catch:{ all -> 0x05ca }
            boolean r1 = r8.A03()     // Catch:{ all -> 0x05ca }
            if (r1 == 0) goto L_0x04da
            if (r5 == 0) goto L_0x04da
            boolean r0 = X.AnonymousClass6Y1.A04(r40)     // Catch:{ all -> 0x05ca }
            if (r0 == 0) goto L_0x04da
            r5.delete()     // Catch:{ all -> 0x05ca }
        L_0x04da:
            if (r1 == 0) goto L_0x04f8
            boolean r0 = X.AnonymousClass6Y1.A07(r40)     // Catch:{ all -> 0x05ca }
            if (r0 == 0) goto L_0x04f8
            boolean r0 = r3.A0Q     // Catch:{ all -> 0x05ca }
            if (r0 == 0) goto L_0x04f8
            java.io.File r1 = r9.A0c(r7, r6)     // Catch:{ all -> 0x05ca }
            if (r1 == 0) goto L_0x04f8
            boolean r0 = r1.exists()     // Catch:{ all -> 0x05ca }
            if (r0 == 0) goto L_0x04f8
            r1.getAbsolutePath()     // Catch:{ all -> 0x05ca }
            r1.delete()     // Catch:{ all -> 0x05ca }
        L_0x04f8:
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0503:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0508 }
            goto L_0x050c
        L_0x0508:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x050f, all -> 0x050d }
        L_0x050c:
            throw r1     // Catch:{ IOException -> 0x050f, all -> 0x050d }
        L_0x050d:
            r1 = move-exception
            goto L_0x056a
        L_0x050f:
            r5 = move-exception
            goto L_0x0514
        L_0x0511:
            r1 = move-exception
            goto L_0x056a
        L_0x0513:
            r5 = move-exception
        L_0x0514:
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x0569 }
            X.1BU r1 = r4.A0J     // Catch:{ all -> 0x0567 }
            boolean r0 = r1.A03(r5)     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x053f
            r1.A00()     // Catch:{ all -> 0x0567 }
            r1 = 15
            boolean r0 = r4.A00     // Catch:{ all -> 0x0567 }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x0567 }
            r8.<init>(r1, r7, r0)     // Catch:{ all -> 0x0567 }
            r27.close()     // Catch:{ IOException -> 0x057b, all -> 0x0573 }
            r11.close()     // Catch:{ all -> 0x0561 }
            r28.close()     // Catch:{ IOException -> 0x055e }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x053f:
            int r1 = X.C111015bb.A00(r5)     // Catch:{ all -> 0x0567 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0567 }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x0567 }
            r8.<init>(r1, r7, r0)     // Catch:{ all -> 0x0567 }
            r27.close()     // Catch:{ IOException -> 0x057b, all -> 0x0573 }
            r11.close()     // Catch:{ all -> 0x0561 }
            r28.close()     // Catch:{ IOException -> 0x055e }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x055e:
            r5 = 9
            goto L_0x05b6
        L_0x0561:
            r1 = move-exception
            goto L_0x0564
        L_0x0563:
            r1 = move-exception
        L_0x0564:
            r5 = 9
            goto L_0x05ab
        L_0x0567:
            r1 = move-exception
            goto L_0x056a
        L_0x0569:
            r1 = move-exception
        L_0x056a:
            r27.close()     // Catch:{ all -> 0x056e }
            goto L_0x0572
        L_0x056e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x057b, all -> 0x0573 }
        L_0x0572:
            throw r1     // Catch:{ IOException -> 0x057b, all -> 0x0573 }
        L_0x0573:
            r1 = move-exception
            goto L_0x0578
        L_0x0575:
            r1 = move-exception
            goto L_0x0578
        L_0x0577:
            r1 = move-exception
        L_0x0578:
            r5 = 9
            goto L_0x059d
        L_0x057b:
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x059a }
            boolean r0 = r4.A00     // Catch:{ all -> 0x059a }
            r5 = 9
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x0598 }
            r8.<init>(r5, r7, r0)     // Catch:{ all -> 0x0598 }
            r11.close()     // Catch:{ all -> 0x05a6 }
            r28.close()     // Catch:{ IOException -> 0x05b6 }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0598:
            r1 = move-exception
            goto L_0x059d
        L_0x059a:
            r1 = move-exception
            r5 = 9
        L_0x059d:
            r11.close()     // Catch:{ all -> 0x05a1 }
            goto L_0x05a5
        L_0x05a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05a6 }
        L_0x05a5:
            throw r1     // Catch:{ all -> 0x05a6 }
        L_0x05a6:
            r1 = move-exception
            goto L_0x05ab
        L_0x05a8:
            r1 = move-exception
            r5 = 9
        L_0x05ab:
            r28.close()     // Catch:{ all -> 0x05af }
            goto L_0x05b3
        L_0x05af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x05b6 }
        L_0x05b3:
            throw r1     // Catch:{ IOException -> 0x05b6 }
        L_0x05b4:
            r5 = 9
        L_0x05b6:
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x05ca }
            boolean r0 = r4.A00     // Catch:{ all -> 0x05ca }
            X.6Wx r8 = new X.6Wx     // Catch:{ all -> 0x05ca }
            r8.<init>(r5, r7, r0)     // Catch:{ all -> 0x05ca }
            r31.close()     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x05ca:
            r1 = move-exception
            r31.close()     // Catch:{ all -> 0x05cf }
            goto L_0x05d3
        L_0x05cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
        L_0x05d3:
            throw r1     // Catch:{ 5BN -> 0x0621, 5BM -> 0x05fc, IllegalArgumentException -> 0x05ee, IOException -> 0x05d4 }
        L_0x05d4:
            r1 = move-exception
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x065c }
            r0 = r47
            X.AnonymousClass6Fk.A00(r2, r1, r0)     // Catch:{ all -> 0x065c }
            int r1 = X.C111015bb.A00(r1)     // Catch:{ all -> 0x065c }
            boolean r0 = r4.A00     // Catch:{ all -> 0x065c }
            X.6Wx r8 = X.C133136Wx.A00(r1, r0)     // Catch:{ all -> 0x065c }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x05ee:
            boolean r1 = r4.A00     // Catch:{ all -> 0x065c }
            r0 = 1
            X.6Wx r8 = X.C133136Wx.A00(r0, r1)     // Catch:{ all -> 0x065c }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x05fc:
            r3 = move-exception
            r2.A07()     // Catch:{ all -> 0x065c }
            r0 = r47
            X.AnonymousClass6Fk.A00(r2, r3, r0)     // Catch:{ all -> 0x065c }
            int r1 = r3.responseCode     // Catch:{ all -> 0x065c }
            java.lang.Long r0 = X.C36441kJ.A0y(r1)     // Catch:{ all -> 0x065c }
            r2.A0R = r0     // Catch:{ all -> 0x065c }
            X.1BS r0 = r4.A0L     // Catch:{ all -> 0x065c }
            r0.A0E(r1)     // Catch:{ all -> 0x065c }
            int r1 = r3.downloadStatus     // Catch:{ all -> 0x065c }
            boolean r0 = r4.A00     // Catch:{ all -> 0x065c }
            X.6Wx r8 = X.C133136Wx.A00(r1, r0)     // Catch:{ all -> 0x065c }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0621:
            r1 = move-exception
            r0 = r47
            X.AnonymousClass6Fk.A00(r2, r1, r0)     // Catch:{ all -> 0x065c }
            r1.getCause()     // Catch:{ all -> 0x065c }
            int r1 = r1.downloadStatus     // Catch:{ all -> 0x065c }
            boolean r0 = r4.A00     // Catch:{ all -> 0x065c }
            X.6Wx r8 = X.C133136Wx.A00(r1, r0)     // Catch:{ all -> 0x065c }
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
            goto L_0x063f
        L_0x0639:
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x064e
        L_0x063f:
            r2.A07()     // Catch:{ all -> 0x0667 }
            goto L_0x064e
        L_0x0643:
            X.C110995bZ.A01(r3)     // Catch:{ all -> 0x0667 }
            r1 = 26
            boolean r0 = r4.A00     // Catch:{ all -> 0x0667 }
            X.6Wx r8 = X.C133136Wx.A00(r1, r0)     // Catch:{ all -> 0x0667 }
        L_0x064e:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            r2.A09()
            return r8
        L_0x065c:
            r1 = move-exception
            boolean r0 = r2.A0C()     // Catch:{ all -> 0x0667 }
            if (r0 != 0) goto L_0x0666
            r2.A07()     // Catch:{ all -> 0x0667 }
        L_0x0666:
            throw r1     // Catch:{ all -> 0x0667 }
        L_0x0667:
            r1 = move-exception
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0675
            r2.A09()
        L_0x0675:
            throw r1
        L_0x0676:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            r1.append(r0)
            java.lang.String r0 = r3.A0H
            java.lang.String r0 = X.C110995bZ.A00(r0)
            r1.append(r0)
            r0 = r47
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T5.A02(X.64p, java.io.File, java.lang.String, java.net.URL, boolean):X.6Wx");
    }

    public AnonymousClass6T5(C19700wN r2, C20690y0 r3, AnonymousClass1DT r4, C20050ww r5, C20060wx r6, C20810yC r7, AnonymousClass1BV r8, AnonymousClass1BU r9, C124935z2 r10, AnonymousClass1GO r11, C101334xN r12, C129166Fp r13, AnonymousClass68C r14, AnonymousClass6Fk r15, AnonymousClass1BS r16, WebpUtils webpUtils, AnonymousClass1B0 r18, C25561Gu r19, C25541Gs r20, C19770wU r21, C21570zS r22, URL url) {
        this.A04 = r7;
        this.A01 = r2;
        this.A0E = r21;
        this.A0A = webpUtils;
        this.A02 = r3;
        this.A0H = r6;
        this.A0L = r16;
        this.A0C = r19;
        this.A0B = r18;
        this.A03 = r4;
        this.A0D = r20;
        this.A0M = r22;
        this.A0K = r11;
        this.A0J = r9;
        this.A0I = r8;
        this.A0F = url;
        this.A08 = r14;
        this.A09 = r15;
        this.A0G = r5;
        this.A05 = r10;
        this.A06 = r12;
        this.A07 = r13;
    }
}
