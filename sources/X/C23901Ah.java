package X;

import java.io.File;
import java.util.regex.Matcher;

/* renamed from: X.1Ah  reason: invalid class name and case insensitive filesystem */
public final class C23901Ah extends AnonymousClass12N {
    public final C002000v A00;
    public final C002000v A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final C002000v A04;
    public final AnonymousClass005 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23901Ah(C20810yC r3, C21010yW r4, C220112n r5, AnonymousClass005 r6) {
        super(r5);
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 4);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        int A002 = C20800yB.A00(C21000yV.A02, r3, 7185);
        A002 = A002 <= 0 ? 20 : A002;
        this.A00 = new C002000v(A002);
        this.A01 = new C002000v(A002);
        this.A04 = new C002000v(A002);
        A08();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C23901Ah r3, java.io.File r4) {
        /*
            X.00v r3 = r3.A04
            java.lang.String r0 = r4.getAbsolutePath()
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r1 = r3.A04(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0032
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
            java.lang.String r1 = X.AnonymousClass6UG.A02(r2)     // Catch:{ all -> 0x002b }
            r2.close()
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = r4.getAbsolutePath()
            X.AnonymousClass00C.A08(r0)
            r3.A08(r0, r1)
            return r1
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23901Ah.A00(X.1Ah, java.io.File):java.lang.String");
    }

    public static final String A01(String str) {
        AnonymousClass0T4 A022 = new C10880fN("\"customProps\"\\s*:\\s*\\{").A02(str);
        if (A022 == null) {
            return null;
        }
        Matcher matcher = A022.A01;
        int i = C15040mb.A05(matcher.start(), matcher.end()).A00;
        int i2 = C15040mb.A05(matcher.start(), matcher.end()).A01;
        int i3 = 1;
        while (true) {
            i2++;
            if (i3 == 0 || i2 >= str.length()) {
                StringBuilder sb = new StringBuilder();
                C15020mZ A052 = C15040mb.A05(i, i2);
                String substring = str.substring(A052.A00, A052.A01 + 1);
                AnonymousClass00C.A08(substring);
                StringBuilder sb2 = new StringBuilder();
                sb2.append('{');
                sb2.append(substring);
                sb.append(sb2.toString());
                sb.append('}');
            } else {
                char charAt = str.charAt(i2);
                if (charAt == '{') {
                    i3++;
                } else if (charAt == '}') {
                    i3--;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        C15020mZ A0522 = C15040mb.A05(i, i2);
        String substring2 = str.substring(A0522.A00, A0522.A01 + 1);
        AnonymousClass00C.A08(substring2);
        StringBuilder sb22 = new StringBuilder();
        sb22.append('{');
        sb22.append(substring2);
        sb3.append(sb22.toString());
        sb3.append('}');
        return sb3.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass011 A02(X.C23901Ah r3, java.io.File r4, java.lang.String r5) {
        /*
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
            long r0 = r4.length()     // Catch:{ all -> 0x0011 }
            X.011 r0 = A03(r3, r2, r5, r0)     // Catch:{ all -> 0x0011 }
            r2.close()
            return r0
        L_0x0011:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23901Ah.A02(X.1Ah, java.io.File, java.lang.String):X.011");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass011 A03(X.C23901Ah r10, java.io.InputStream r11, java.lang.String r12, long r13) {
        /*
            java.lang.String r8 = "LottieCache/getJsonObjectFromStream failed to create lottie json"
            java.lang.String r0 = "LottieCache/getJsonObjectFromStream"
            X.14g r5 = new X.14g
            r5.<init>((java.lang.String) r0)
            r5.A03()
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            r9 = 0
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ IOException | JSONException -> 0x00b6 }
            r2.<init>(r11)     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.005 r0 = r10.A05     // Catch:{ all -> 0x00a8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a8 }
            X.2TE r0 = (X.AnonymousClass2TE) r0     // Catch:{ all -> 0x00a8 }
            long r3 = r0.A02(r7, r2)     // Catch:{ all -> 0x00a8 }
            r7.close()     // Catch:{ all -> 0x00af }
            r2.close()     // Catch:{ IOException | JSONException -> 0x00b6 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            X.0yC r2 = r10.A02     // Catch:{ IOException | JSONException -> 0x00b6 }
            r1 = 6787(0x1a83, float:9.51E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ IOException | JSONException -> 0x00b6 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            if (r0 == 0) goto L_0x00ba
            X.2Nu r1 = new X.2Nu     // Catch:{ IOException | JSONException -> 0x00b6 }
            r1.<init>()     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x00b6 }
            r1.A00 = r0     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.0yW r0 = r10.A03     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0.Bly(r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            return r9
        L_0x004d:
            long r3 = r5.A01()     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.0yC r2 = r10.A02     // Catch:{ IOException | JSONException -> 0x00b6 }
            r1 = 6787(0x1a83, float:9.51E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ IOException | JSONException -> 0x00b6 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            if (r0 == 0) goto L_0x008b
            X.2Pu r6 = new X.2Pu     // Catch:{ IOException | JSONException -> 0x00b6 }
            r6.<init>()     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x00b6 }
            r6.A00 = r0     // Catch:{ IOException | JSONException -> 0x00b6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ IOException | JSONException -> 0x00b6 }
            r6.A02 = r0     // Catch:{ IOException | JSONException -> 0x00b6 }
            double r2 = (double) r13     // Catch:{ IOException | JSONException -> 0x00b6 }
            r4 = 5000(0x1388, double:2.4703E-320)
            double r0 = (double) r4     // Catch:{ IOException | JSONException -> 0x00b6 }
            double r2 = r2 / r0
            double r4 = java.lang.Math.ceil(r2)     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0 = 5
            double r0 = (double) r0     // Catch:{ IOException | JSONException -> 0x00b6 }
            double r4 = r4 * r0
            r2 = 1000(0x3e8, double:4.94E-321)
            double r0 = (double) r2     // Catch:{ IOException | JSONException -> 0x00b6 }
            double r4 = r4 * r0
            long r0 = (long) r4     // Catch:{ IOException | JSONException -> 0x00b6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x00b6 }
            r6.A01 = r0     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.0yW r0 = r10.A03     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0.Bly(r6)     // Catch:{ IOException | JSONException -> 0x00b6 }
        L_0x008b:
            byte[] r1 = r7.toByteArray()     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ IOException | JSONException -> 0x00b6 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x00b6 }
            r2.<init>(r1, r0)     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.00v r0 = r10.A01     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0.A08(r12, r2)     // Catch:{ IOException | JSONException -> 0x00b6 }
            java.lang.String r1 = A01(r2)     // Catch:{ IOException | JSONException -> 0x00b6 }
            X.011 r0 = new X.011     // Catch:{ IOException | JSONException -> 0x00b6 }
            r0.<init>(r2, r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            return r0
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException | JSONException -> 0x00b6 }
            throw r0     // Catch:{ IOException | JSONException -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23901Ah.A03(X.1Ah, java.io.InputStream, java.lang.String, long):X.011");
    }

    public final AnonymousClass9Y2 A09(File file, String str) {
        AnonymousClass9Y2 r0;
        AnonymousClass011 A022;
        if (str == null) {
            str = A00(this, file);
        }
        C002000v r2 = this.A00;
        AnonymousClass9Y2 r1 = (AnonymousClass9Y2) r2.A04(str);
        if (r1 == null) {
            String str2 = (String) this.A01.A04(str);
            r1 = null;
            if (!((str2 == null && ((A022 = A02(this, file, str)) == null || (str2 = (String) A022.first) == null)) || (r0 = (AnonymousClass9Y2) C203529oE.A05(str2).A00) == null)) {
                r2.A08(str, r0);
                return r0;
            }
        }
        return r1;
    }

    public String BHv() {
        StringBuilder sb = new StringBuilder();
        sb.append("LottieCache - ");
        sb.append(this.A01.A02());
        sb.append(" items");
        return sb.toString();
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        this.A00.A07(-1);
        this.A01.A07(-1);
    }

    public final String A0A(File file) {
        String A012;
        String A002 = A00(this, file);
        String str = (String) this.A01.A04(A002);
        if (str != null && (A012 = A01(str)) != null) {
            return A012;
        }
        AnonymousClass011 A022 = A02(this, file, A002);
        if (A022 != null) {
            return (String) A022.second;
        }
        return null;
    }
}
