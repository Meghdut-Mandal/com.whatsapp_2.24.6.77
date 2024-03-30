package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.FutureTask;

/* renamed from: X.6YC  reason: invalid class name */
public class AnonymousClass6YC {
    public static HashSet A00;

    public static int A00(C121655tV r4, AnonymousClass68C r5, File file, String str, URL url) {
        String str2 = r5.A0G;
        if (str2 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash=");
            C36341k9.A1O(A0u, r5.A0H);
            str2 = r4.A01;
        }
        if (str == null) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("MediaDownload/MMS download failed to calculate hash; mediaHash=");
            A0u2.append(r5.A0H);
            A0u2.append("; url=");
            A0u2.append(url);
            C90464aC.A1A(file, "; downloadFile=", A0u2);
            A0u2.append("; downloadFile.exists?=");
            Log.w(C36421kH.A0d(A0u2, file.exists()));
            return 27;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("MediaDownload/MMS download failed due to hash mismatch; mediaHash=");
            A0u3.append(r5.A0H);
            A0u3.append("; url=");
            A0u3.append(url);
            A0u3.append("; receivedHash=");
            A0u3.append(str2);
            C36321k7.A1R("; localHash=", str, A0u3);
            return 32;
        }
    }

    public static int A01(AnonymousClass68C r7, String str, URL url) {
        if (str == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            String str2 = r7.A0H;
            A0u.append(str2);
            A0u.append("; url=");
            A0u.append(url);
            C36321k7.A1O("; mediaHash=", str2, "; calculatedHash=", str, A0u);
            A0u.append("; mediaSize=");
            Log.w(C36411kG.A11(A0u, r7.A07));
            return 1;
        }
        String str3 = r7.A0H;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        AnonymousClass000.A1D("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=", str3, "; url=", A0u2);
        A0u2.append(url);
        C36321k7.A1O("; mediaHash=", str3, "; calculatedHash=", str, A0u2);
        A0u2.append("; mediaSize=");
        Log.w(C36411kG.A11(A0u2, r7.A07));
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (X.AnonymousClass2bU) r14;
        r4 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.C20690y0 r11, X.C20060wx r12, X.C20810yC r13, X.AnonymousClass3T1 r14) {
        /*
            boolean r0 = r14 instanceof X.AnonymousClass2bU
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r0 = r14
            X.2bU r0 = (X.AnonymousClass2bU) r0
            r6 = 0
            r9 = 0
            boolean r10 = r14 instanceof X.AnonymousClass4TX
            X.1Gl r5 = X.AnonymousClass6Y1.A02(r14)
            java.lang.String r7 = r0.A04
            java.lang.String r8 = r0.A07
            r4 = r11
            java.io.File r1 = r4.A0L(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0027
            X.6vr r0 = new X.6vr
            r0.<init>(r12, r13, r1)
            r0.Bwp()
            long r0 = r0.A00
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YC.A02(X.0y0, X.0wx, X.0yC, X.3T1):long");
    }

    public static String A08(String str) {
        if (str != null) {
            String A02 = AnonymousClass1Ax.A02(str);
            if (!TextUtils.isEmpty(A02)) {
                return A02;
            }
        }
        return "enc";
    }

    public static void A09(C19700wN r17, C20690y0 r18, AnonymousClass1DT r19, C121555tK r20, C101334xN r21, C129166Fp r22, AnonymousClass68C r23, WebpUtils webpUtils, AnonymousClass1B0 r25, C25561Gu r26, C25541Gs r27, File file, int i, int i2) {
        File A0b;
        BufferedInputStream A0U;
        AnonymousClass68C r2 = r23;
        byte[] bArr = r2.A0c;
        String str = r2.A0H;
        String str2 = r2.A0L;
        int i3 = r2.A00;
        long j = r2.A07;
        C25471Gl r7 = r2.A0A;
        C20690y0 r4 = r18;
        if (AnonymousClass1GX.A0Z(r4, r19, r20, r7, webpUtils, file, str, str2, bArr, i2, i3, j)) {
            C129166Fp r3 = r22;
            if (AnonymousClass1Ax.A04(r7) || AnonymousClass6Y1.A07(r7)) {
                File A0c = r4.A0c(str, str2);
                if (A0c != null) {
                    A0A(r17, r3, r2, r25, r26, r27, A0c);
                }
            } else {
                boolean z = r2.A0Y;
                if (AnonymousClass6Y1.A04(r7) && z && !r2.A0P && r3.A0H() == null && (A0b = r4.A0b(str, str2)) != null) {
                    try {
                        A0U = C90474aD.A0U(A0b);
                        r3.A0G(AnonymousClass0QO.A00(A0U));
                        A0U.close();
                    } catch (IOException e) {
                        Log.e("MediaDownload/createProgressiveThumbnail/created progressive/thumbnail could not be read", e);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            r21.A0H();
            if (AnonymousClass6Y1.A07(r7) && i == 2) {
                r3.A05();
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught Magi exception: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught IO exception: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        com.whatsapp.util.Log.e("MediaDownload/Classify caught exception: ", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C20690y0 r20, X.AnonymousClass1AV r21, X.C21010yW r22, X.C101334xN r23, X.C129166Fp r24, X.AnonymousClass68C r25, X.AnonymousClass1GJ r26, X.AnonymousClass1B0 r27, java.io.File r28) {
        /*
            java.lang.String r6 = "MediaDownload/Failed to parse document"
            r7 = r25
            X.1Gl r8 = r7.A0A
            boolean r0 = X.AnonymousClass1Ax.A04(r8)
            r10 = 0
            r2 = r24
            r3 = r28
            if (r0 == 0) goto L_0x0149
            java.lang.String r13 = r3.getAbsolutePath()
            java.lang.String r0 = r7.A0K
            X.58O r9 = new X.58O
            r9.<init>()
            r11 = 0
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = X.AnonymousClass6YY.A07(r0)
            java.lang.String r12 = X.C90514aH.A0y(r0)
        L_0x0027:
            r15 = r12
            java.lang.Class<X.6YC> r5 = X.AnonymousClass6YC.class
            monitor-enter(r5)
            goto L_0x002e
        L_0x002c:
            r12 = r11
            goto L_0x0027
        L_0x002e:
            java.util.HashSet r4 = A00     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r4 = "bundle"
            java.lang.String r1 = "class"
            java.lang.String r0 = "dylib"
            java.lang.String[] r0 = new java.lang.String[]{r4, r1, r0}     // Catch:{ all -> 0x0146 }
            java.util.HashSet r4 = X.C36421kH.A0g(r0)     // Catch:{ all -> 0x0146 }
            A00 = r4     // Catch:{ all -> 0x0146 }
        L_0x0042:
            monitor-exit(r5)
            if (r12 == 0) goto L_0x005c
            int r1 = r12.length()
            r0 = 4
            if (r1 <= r0) goto L_0x0052
            boolean r0 = r4.contains(r12)
            if (r0 == 0) goto L_0x005c
        L_0x0052:
            java.lang.String r14 = r7.A0J
            java.lang.Long r0 = X.C36411kG.A0t()
            r9.A02 = r0
            monitor-enter(r2)
            goto L_0x005e
        L_0x005c:
            r15 = 0
            goto L_0x0052
        L_0x005e:
            java.lang.Long r0 = r2.A0C     // Catch:{ all -> 0x0143 }
            monitor-exit(r2)
            r9.A00 = r0
            long r0 = r3.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A01 = r0
            r9.A05 = r15
            r9.A07 = r14
            long r4 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.Class<com.whatsapp.media.magi.Magi> r19 = com.whatsapp.media.magi.Magi.class
            monitor-enter(r19)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            long r0 = com.whatsapp.media.magi.Magi.A00     // Catch:{ all -> 0x00ee }
            r17 = 0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x008d
            java.lang.Boolean r0 = X.C18750th.A01     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "magi"
            X.AnonymousClass10O.A00(r0)     // Catch:{ all -> 0x00ee }
            long r0 = com.whatsapp.media.magi.Magi.create(r10)     // Catch:{ all -> 0x00ee }
            com.whatsapp.media.magi.Magi.A00 = r0     // Catch:{ all -> 0x00ee }
        L_0x008d:
            monitor-exit(r19)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            com.whatsapp.media.magi.Magi$MagiClassifyResult r12 = com.whatsapp.media.magi.Magi.classify(r0, r13, r12, r14)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            if (r12 == 0) goto L_0x00e9
            int r13 = r12.returnValue     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r0 = -1
            if (r13 == r0) goto L_0x00df
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.String r0 = "MediaDownload/Classify returned: "
            r1.append(r0)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r1.append(r13)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.String r0 = ", extension (hint): "
            r1.append(r0)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r1.append(r15)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.String r0 = ", mimetype: "
            X.C36321k7.A1Q(r0, r14, r1)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.Long r0 = X.C36441kJ.A0y(r13)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r9.A02 = r0     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            long r0 = java.lang.System.nanoTime()     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.Long r0 = X.C90504aG.A0h(r0, r4)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r9.A03 = r0     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r0 = 1
            if (r13 != 0) goto L_0x00c9
            r2.A09(r10)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            goto L_0x0105
        L_0x00c9:
            if (r13 != r0) goto L_0x00ce
            com.whatsapp.media.magi.Magi$MagiCheckResult r11 = r12.checkResult     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            goto L_0x0105
        L_0x00ce:
            r0 = 2
            if (r13 != r0) goto L_0x00d9
            r0 = 3
            r2.A09(r0)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            com.whatsapp.media.magi.Magi$MagiCheckResult r11 = r12.checkResult     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r10 = 1
            goto L_0x0105
        L_0x00d9:
            java.lang.String r0 = "MediaDownload/Classify failed."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            goto L_0x0105
        L_0x00df:
            com.whatsapp.media.magi.Magi$MagiCheckResult r0 = r12.checkResult     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            java.lang.String r1 = r0.errorMsg     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            X.5Uf r0 = new X.5Uf     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            goto L_0x00ed
        L_0x00e9:
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r13)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
        L_0x00ed:
            throw r0     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
            throw r0     // Catch:{ IOException -> 0x00f8, 5Uf -> 0x00f1, Exception -> 0x00ff }
        L_0x00f1:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught Magi exception: "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0105
        L_0x00f8:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught IO exception: "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0105
        L_0x00ff:
            r1 = move-exception
            java.lang.String r0 = "MediaDownload/Classify caught exception: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0105:
            java.lang.Long r0 = r9.A02
            long r12 = r0.longValue()
            r4 = 2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0117
            r4 = 1
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01cc
        L_0x0117:
            if (r11 == 0) goto L_0x01cc
            java.util.List r1 = r11.extensions
            java.lang.String r5 = "/"
            java.lang.String r0 = "delimiter"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c2
        L_0x0130:
            java.lang.Object r0 = r1.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.append(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c2
            r4.append(r5)
            goto L_0x0130
        L_0x0143:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0146:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0149:
            boolean r0 = X.AnonymousClass1Ax.A04(r8)
            if (r0 == 0) goto L_0x015f
            java.lang.String r1 = r7.A0J
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015f
            X.6Xp r0 = new X.6Xp
            r0.<init>(r3)
            goto L_0x01d4
        L_0x015f:
            boolean r0 = X.AnonymousClass6Y1.A0A(r8)
            if (r0 != 0) goto L_0x0192
            boolean r0 = X.AnonymousClass6Y1.A03(r8)
            if (r0 != 0) goto L_0x0192
            boolean r0 = X.AnonymousClass6Y1.A07(r8)
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r7.A0J
            r1 = r27
            X.6FM r1 = r1.A00(r3, r0)
            if (r1 == 0) goto L_0x0183
            X.5Rz r0 = X.C108055Rz.RECEIVE
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x01d3
        L_0x0183:
            java.lang.String r0 = "MediaDownload/suspicious sticker found, file deleted"
        L_0x0185:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 1
            r2.A09(r0)
            r0 = r20
            X.C101334xN.A09(r0, r3)
            return
        L_0x0192:
            r0 = r26
            boolean r0 = r0.A0H(r8, r3)
            goto L_0x01a5
        L_0x0199:
            boolean r0 = X.AnonymousClass1Ax.A04(r8)
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = r7.A0J
            boolean r0 = X.AnonymousClass1GX.A0c(r0)
        L_0x01a5:
            if (r0 == 0) goto L_0x01d3
            r0 = 0
            r1 = r21
            com.whatsapp.Mp4Ops.A03(r1, r3, r0)     // Catch:{ 5V4 -> 0x01ae }
            goto L_0x01ec
        L_0x01ae:
            r1 = move-exception
            r0 = r23
            java.util.concurrent.FutureTask r0 = r0.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x01d3
            int r1 = r1.errorCode
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L_0x01d3
            java.lang.String r0 = "MediaDownload/suspicious video/audio found, file deleted"
            goto L_0x0185
        L_0x01c2:
            java.lang.String r0 = r4.toString()
            r9.A04 = r0
            java.lang.String r0 = r11.mimetype
            r9.A06 = r0
        L_0x01cc:
            r0 = r22
            r0.Bly(r9)
            if (r10 == 0) goto L_0x0149
        L_0x01d3:
            return
        L_0x01d4:
            r0.A08()     // Catch:{ 1Gw -> 0x01e1, IOException -> 0x01e7 }
            boolean r1 = r0.A01     // Catch:{ 1Gw -> 0x01e1, IOException -> 0x01e7 }
            r0 = 0
            if (r1 == 0) goto L_0x01dd
            r0 = 3
        L_0x01dd:
            r2.A09(r0)     // Catch:{ 1Gw -> 0x01e1, IOException -> 0x01e7 }
            return
        L_0x01e1:
            r1 = move-exception
            r0 = 3
            r2.A09(r0)
            goto L_0x01e8
        L_0x01e7:
            r1 = move-exception
        L_0x01e8:
            com.whatsapp.util.Log.e(r6, r1)
            return
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YC.A0B(X.0y0, X.1AV, X.0yW, X.4xN, X.6Fp, X.68C, X.1GJ, X.1B0, java.io.File):void");
    }

    public static Notification A03(Context context, AnonymousClass16D r7, String str, String str2, ArrayList arrayList) {
        AnonymousClass2bU r3;
        AnonymousClass11F r0;
        C07700Yy A02 = C20600xp.A02(context);
        A02.A0M = "sending_media@1";
        A02.A0L = "progress";
        A02.A09(System.currentTimeMillis());
        A02.A0G(str);
        A02.A0F(str);
        A02.A0E(str2);
        boolean z = false;
        if (!(arrayList == null || (r3 = (AnonymousClass2bU) arrayList.get(0)) == null || (r0 = r3.A1J.A00) == null)) {
            Intent A0G = C90504aG.A0G(context, r7.A0D(r0));
            AnonymousClass3M9.A02(A0G, "MediaDownloadService");
            A02.A0D = C65743Th.A03(context, A0G, 5);
            int i = (int) AnonymousClass2bU.A00(r3).A0E;
            if (i >= 0) {
                if (arrayList.size() > 1) {
                    z = true;
                }
                A02.A07(100, i, z);
            }
        }
        A02.A0B.icon = 17301633;
        return A02.A05();
    }

    public static C133136Wx A04(C101334xN r7, C121655tV r8, AnonymousClass68C r9, File file, File file2, String str, String str2, URL url) {
        String A08;
        int A002 = A00(r8, r9, file2, str, url);
        FutureTask futureTask = r7.A02;
        if (!futureTask.isCancelled()) {
            if (A002 != 0) {
                return new C133136Wx(A002, (String) null, true);
            }
            if (file.equals(file2)) {
                A08 = r8.A02;
            } else {
                int A01 = A01(r9, str2, url);
                if (!futureTask.isCancelled()) {
                    if (A01 != 0) {
                        int i = 31;
                        if (A01 != 1) {
                            i = 7;
                        }
                        return new C133136Wx(i, (String) null, true);
                    }
                    A08 = A08(r9.A0J);
                }
            }
            return new C133136Wx((File) null, A08, 0, true, false);
        }
        return new C133136Wx(13, (String) null, false);
    }

    public static AnonymousClass2bU A05(AnonymousClass1DF r14, AnonymousClass68C r15, AnonymousClass1CR r16) {
        long j;
        AnonymousClass5RC r9;
        int[] iArr;
        C120155r3 A002 = r15.A00();
        if (A002 == null || !AnonymousClass6Y1.A04(r15.A0A) || (iArr = A002.A01) == null || iArr.length != 4) {
            j = -1;
        } else {
            j = (long) (iArr[0] + iArr[1] + iArr[2]);
        }
        C224214g r1 = new C224214g("mediadownload/findexistingfile");
        String str = r15.A0H;
        C18740tg.A06(str);
        ArrayList A0F = r14.A0F(str, r15.A0A.A00);
        r1.A01();
        A0F.size();
        Iterator it = A0F.iterator();
        while (it.hasNext()) {
            AnonymousClass2bU A0r = C36441kJ.A0r(it);
            if (AnonymousClass1GX.A01(A0r, r16) == r15.A01) {
                File file = AnonymousClass2bU.A00(A0r).A0I;
                C18740tg.A06(file);
                String str2 = r15.A0M;
                if (str2 == null || j == -1) {
                    String A003 = AnonymousClass6UG.A00(file);
                    if (A003.equals(str)) {
                        return A0r;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("MediaDownload/call/file exists for hash, but existing file hash (");
                    A0u.append(A003);
                    A0u.append(") does not match to stored value (");
                    A0u.append(str);
                    C36321k7.A1a(A0u, "), probably the file has been replaced");
                } else {
                    try {
                        MessageDigest A0s = C90504aG.A0s();
                        BufferedInputStream A0U = C90474aD.A0U(file);
                        try {
                            C107775Qv r8 = new C107775Qv(new AnonymousClass5RB(A0U, j), A0s);
                            try {
                                r9 = new AnonymousClass5RC(r8, A0U);
                                String A02 = AnonymousClass6UG.A02(r9);
                                if (A02.equals(str) || r8.A00().equals(str2)) {
                                    r9.close();
                                    r8.close();
                                    A0U.close();
                                    return A0r;
                                }
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("MediaDownload/call/file exists for hash, but existing file hash (");
                                A0u2.append(A02);
                                A0u2.append(") does not match to stored value (");
                                A0u2.append(str);
                                C36321k7.A1a(A0u2, "), probably the file has been replaced");
                                r9.close();
                                r8.close();
                                A0U.close();
                            } catch (Throwable th) {
                                r8.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            A0U.close();
                            throw th2;
                        }
                    } catch (IOException | NoSuchAlgorithmException e) {
                        C36321k7.A1M(file, "MediaDownload/call/could not get hash for existing file; file=", AnonymousClass000.A0u(), e);
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
        }
        return null;
        throw th;
    }

    public static String A06(Context context, AnonymousClass16D r9, AnonymousClass171 r10, ArrayList arrayList) {
        Resources resources;
        int i;
        int i2;
        Object[] objArr;
        if (!arrayList.isEmpty()) {
            AnonymousClass2bU r5 = (AnonymousClass2bU) arrayList.get(0);
            if (!(r5 instanceof C46972by)) {
                AnonymousClass11F r0 = r5.A1J.A00;
                if (r0 != null) {
                    String A02 = AnonymousClass3TB.A02(C36381kD.A0u(r9, r10, r0));
                    if (arrayList.size() == 1) {
                        return C36351kA.A0w(context, A02, 1, R.string.f12nameremoved);
                    }
                    resources = context.getResources();
                    i = R.plurals.f10nameremoved;
                    i2 = arrayList.size() - 1;
                    objArr = new Object[2];
                    objArr[0] = A02;
                }
            } else if (arrayList.size() == 1) {
                return r5.A1b();
            } else {
                resources = context.getResources();
                i = R.plurals.f10nameremoved;
                i2 = arrayList.size() - 1;
                objArr = new Object[2];
                objArr[0] = r5.A1b();
            }
            AnonymousClass000.A1L(objArr, arrayList.size() - 1, 1);
            return resources.getQuantityString(i, i2, objArr);
        }
        return null;
    }

    public static String A07(Context context, ArrayList arrayList) {
        boolean z;
        Resources resources;
        int i;
        if (arrayList.isEmpty()) {
            return null;
        }
        Object obj = arrayList.get(0);
        if (!arrayList.isEmpty()) {
            int i2 = ((AnonymousClass3T1) arrayList.get(0)).A1I;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C36391kE.A0l(it).A1I != i2) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            if (obj instanceof C46972by) {
                resources = context.getResources();
                i = R.plurals.f10nameremoved;
            } else if (obj instanceof C181798o3) {
                resources = context.getResources();
                i = R.plurals.f10nameremoved;
            }
            int size = arrayList.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, arrayList.size(), 0);
            return resources.getQuantityString(i, size, objArr);
        }
        resources = context.getResources();
        i = R.plurals.f10nameremoved;
        int size2 = arrayList.size();
        Object[] objArr2 = new Object[1];
        AnonymousClass000.A1L(objArr2, arrayList.size(), 0);
        return resources.getQuantityString(i, size2, objArr2);
    }

    public static void A0A(C19700wN r4, C129166Fp r5, AnonymousClass68C r6, AnonymousClass1B0 r7, C25561Gu r8, C25541Gs r9, File file) {
        C25471Gl r3;
        C122585v5 A002;
        if ((r5.A00() != 1 || !AnonymousClass6Y1.A0A(r6.A0A)) && (r3 = r6.A0A) != C25471Gl.A0Z && (A002 = new C25531Gr(r4, r7, r8, r9).A00(new C122575v4(r3, file, r6.A0J, r6.A0P))) != null) {
            byte[] bArr = A002.A02;
            if (bArr != null) {
                r5.A0G(bArr);
            }
            Pair pair = A002.A01;
            if (pair != null) {
                r5.A0A(C36381kD.A04(pair));
                r5.A08(C36381kD.A03(pair));
            }
            Pair pair2 = A002.A00;
            if (pair2 != null) {
                int A04 = C36381kD.A04(pair2);
                synchronized (r5) {
                    r5.A07 = Integer.valueOf(A04);
                }
                int A03 = C36381kD.A03(pair2);
                synchronized (r5) {
                    r5.A08 = Integer.valueOf(A03);
                }
            }
            byte[] bArr2 = A002.A03;
            synchronized (r5) {
                r5.A0I = bArr2;
            }
        }
    }

    public static void A0C(C20690y0 r2, C133136Wx r3, File file, File file2) {
        if (r3.A03() && !file.equals(file2)) {
            file.delete();
        } else if (r3.A01 == 1) {
            file.delete();
            C101334xN.A09(r2, file2);
        }
    }
}
