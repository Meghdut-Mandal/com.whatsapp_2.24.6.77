package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.6FM  reason: invalid class name */
public abstract class AnonymousClass6FM {
    public final File A00;

    public boolean A02(C108055Rz r2) {
        return AnonymousClass000.A1V(((C106555Ki) this).A01);
    }

    public Bitmap A00() {
        if (this instanceof C106555Ki) {
            C106555Ki r0 = (C106555Ki) this;
            AnonymousClass1HB r3 = r0.A00;
            File file = r0.A03;
            return r3.A06(file, file.getName(), 64, 64);
        }
        AnonymousClass5Kh r02 = (AnonymousClass5Kh) this;
        return r02.A02.A01(r02.A03, (String) null, 64, 64);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x018d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x018e, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0191, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.io.File r21) {
        /*
            r20 = this;
            r1 = r20
            boolean r0 = r1 instanceof X.C106555Ki
            r19 = r21
            if (r0 == 0) goto L_0x00c0
            X.C18740tg.A00()
            java.io.BufferedInputStream r15 = X.C90474aD.A0U(r19)     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, NoSuchAlgorithmException -> 0x01b2 }
            java.security.MessageDigest r14 = X.C90504aG.A0s()     // Catch:{ all -> 0x009c }
            r0 = 4
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x009c }
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x009c }
            r0 = 8
            r15.skip(r0)     // Catch:{ all -> 0x009c }
            r18 = 1
            r11 = 0
            r10 = 0
            r17 = 1
            r9 = 0
        L_0x0024:
            int r16 = r15.read(r13)     // Catch:{ all -> 0x009c }
            r8 = 2
            if (r16 <= 0) goto L_0x008a
            byte r7 = r13[r11]     // Catch:{ all -> 0x009c }
            r6 = 70
            r5 = 73
            r4 = 88
            r3 = 69
            r1 = 3
            if (r7 != r3) goto L_0x0046
            byte r0 = r13[r18]     // Catch:{ all -> 0x009c }
            if (r0 != r4) goto L_0x0046
            byte r0 = r13[r8]     // Catch:{ all -> 0x009c }
            if (r0 != r5) goto L_0x0046
            byte r0 = r13[r1]     // Catch:{ all -> 0x009c }
            if (r0 != r6) goto L_0x0046
            r9 = 4
            goto L_0x0070
        L_0x0046:
            byte r2 = r12[r1]     // Catch:{ all -> 0x009c }
            if (r2 != r3) goto L_0x0055
            if (r7 != r4) goto L_0x0055
            byte r0 = r13[r18]     // Catch:{ all -> 0x009c }
            if (r0 != r5) goto L_0x0055
            byte r0 = r13[r8]     // Catch:{ all -> 0x009c }
            if (r0 != r6) goto L_0x0055
            goto L_0x006f
        L_0x0055:
            byte r1 = r12[r8]     // Catch:{ all -> 0x009c }
            if (r1 != r3) goto L_0x0063
            if (r2 != r4) goto L_0x0063
            if (r7 != r5) goto L_0x0063
            byte r0 = r13[r18]     // Catch:{ all -> 0x009c }
            if (r0 != r6) goto L_0x0063
            r9 = 2
            goto L_0x0070
        L_0x0063:
            byte r0 = r12[r18]     // Catch:{ all -> 0x009c }
            if (r0 != r3) goto L_0x0070
            if (r1 != r4) goto L_0x0070
            if (r2 != r5) goto L_0x0070
            if (r7 != r6) goto L_0x0070
            r9 = 1
            goto L_0x0070
        L_0x006f:
            r9 = 3
        L_0x0070:
            if (r17 != 0) goto L_0x007a
            if (r9 <= 0) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            r14.update(r12, r11, r10)     // Catch:{ all -> 0x009c }
            r0 = 4
            goto L_0x007e
        L_0x007a:
            r0 = 4
            if (r9 != r0) goto L_0x007e
            goto L_0x008a
        L_0x007e:
            java.lang.System.arraycopy(r13, r11, r12, r11, r0)     // Catch:{ all -> 0x009c }
            r10 = r16
            r17 = 0
            goto L_0x0024
        L_0x0086:
            r14.update(r12, r11, r9)     // Catch:{ all -> 0x009c }
            goto L_0x008d
        L_0x008a:
            r14.update(r12, r11, r10)     // Catch:{ all -> 0x009c }
        L_0x008d:
            byte[] r0 = r14.digest()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ all -> 0x009c }
            r19.getAbsolutePath()     // Catch:{ all -> 0x009c }
            r15.close()     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, NoSuchAlgorithmException -> 0x01b2 }
            return r0
        L_0x009c:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, NoSuchAlgorithmException -> 0x01b2 }
        L_0x00a5:
            throw r1     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, NoSuchAlgorithmException -> 0x01b2 }
        L_0x00a6:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "WebpUtils/getFileHashExcludingMetadata/io exception, file path:"
            goto L_0x00b5
        L_0x00ae:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "WebpUtils/getFileHashExcludingMetadata/file not found:"
        L_0x00b5:
            r0 = r19
            java.lang.String r0 = X.C90514aH.A0x(r0, r1, r2)
            X.C36351kA.A1Q(r0, r2, r3)
            goto L_0x01b8
        L_0x00c0:
            X.5Kh r1 = (X.AnonymousClass5Kh) r1
            X.1Ao r0 = r1.A02
            X.1Ah r3 = r0.A01
            r0 = r19
            java.lang.String r1 = X.C23901Ah.A00(r3, r0)
            X.00v r0 = r3.A01
            java.lang.Object r2 = r0.A04(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00e2
            r0 = r19
            X.011 r0 = X.C23901Ah.A02(r3, r0, r1)
            if (r0 == 0) goto L_0x0138
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
        L_0x00e2:
            if (r2 == 0) goto L_0x01b8
            java.lang.String r0 = "([{,])?(\\s*\"metadata\"\\s*:\\s*\\{)"
            X.0fN r1 = new X.0fN
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = "\\s"
            java.lang.String r5 = X.C36411kG.A0y(r2, r0)
            r7 = 0
            r3 = 2
            r2 = 0
            X.0T4 r0 = r1.A02(r5)
            if (r0 == 0) goto L_0x0164
            X.0js r1 = r0.A02
            r6 = 1
            X.0Uh r0 = r1.A09(r6)
            if (r0 == 0) goto L_0x0105
            java.lang.String r2 = r0.A00
        L_0x0105:
            java.lang.String r0 = "{"
            boolean r4 = X.AnonymousClass00C.A0J(r2, r0)
            if (r4 != 0) goto L_0x010e
            r3 = 0
        L_0x010e:
            X.0Uh r1 = r1.A09(r3)
            if (r1 == 0) goto L_0x0136
            X.0mZ r0 = r1.A01
            int r3 = r0.A00
        L_0x0118:
            if (r1 == 0) goto L_0x011e
            X.0mZ r0 = r1.A01
            int r7 = r0.A01
        L_0x011e:
            int r2 = r7 + 1
        L_0x0120:
            if (r6 == 0) goto L_0x013a
            char r1 = r5.charAt(r2)
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 != r0) goto L_0x012f
            int r6 = r6 + 1
        L_0x012c:
            int r2 = r2 + 1
            goto L_0x0120
        L_0x012f:
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x012c
            int r6 = r6 + -1
            goto L_0x012c
        L_0x0136:
            r3 = 0
            goto L_0x0118
        L_0x0138:
            r2 = 0
            goto L_0x00e2
        L_0x013a:
            if (r4 == 0) goto L_0x0146
            char r1 = r5.charAt(r2)
            r0 = 44
            if (r1 != r0) goto L_0x0146
            int r2 = r2 + 1
        L_0x0146:
            X.0mZ r0 = X.C15040mb.A05(r3, r2)
            int r4 = r0.A00
            int r0 = r0.A01
            int r3 = r0 + 1
            r2 = 0
            if (r3 < r4) goto L_0x0192
            if (r3 != r4) goto L_0x016d
            int r0 = r5.length()
            java.lang.CharSequence r0 = r5.subSequence(r2, r0)
        L_0x015d:
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0164
            r5 = r0
        L_0x0164:
            byte[] r0 = X.C36351kA.A1b(r5)
            java.io.ByteArrayInputStream r2 = X.C90524aI.A0P(r0)
            goto L_0x0180
        L_0x016d:
            int r1 = r5.length()
            int r0 = r3 - r4
            int r0 = r1 - r0
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r0)
            r0.append(r5, r2, r4)
            r0.append(r5, r3, r1)
            goto L_0x015d
        L_0x0180:
            java.lang.String r0 = X.AnonymousClass6UG.A02(r2)     // Catch:{ all -> 0x018b }
            r2.close()
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x018b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0192:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "End index ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ") is less than start index ("
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ")."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x01b2:
            r1 = move-exception
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/no such algorithms exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01b8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FM.A01(java.io.File):java.lang.String");
    }

    public byte[] A03() {
        StringBuilder sb;
        String str;
        if (this instanceof C106555Ki) {
            C106555Ki r0 = (C106555Ki) this;
            return r0.A02.A04(r0.A03.getAbsolutePath());
        }
        AnonymousClass5Kh r02 = (AnonymousClass5Kh) this;
        C23971Ao r2 = r02.A02;
        try {
            String A0A = r2.A01.A0A(C90524aI.A0S(C90514aH.A0w(r02.A03)));
            if (A0A != null) {
                return C36351kA.A1b(C36381kD.A0y(C36441kJ.A1C(A0A).getJSONObject("customProps")));
            }
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass000.A0u();
            str = "LottieUtils/getMetadataFromPath error getting metadata json ";
            Log.w(C36331k8.A0i(str, sb, e));
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass000.A0u();
            str = "LottieUtils/getMetadataFromPath exception retrieving lottie file ";
            Log.w(C36331k8.A0i(str, sb, e));
            return null;
        }
        return null;
    }

    public AnonymousClass6FM(File file) {
        this.A00 = file;
    }
}
