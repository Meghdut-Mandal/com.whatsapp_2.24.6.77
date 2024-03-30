package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.13d  reason: invalid class name and case insensitive filesystem */
public class C221713d {
    public static C221513b A02;
    public final AnonymousClass1MB A00;
    public final AnonymousClass1ME A01;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0151, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = r7.toString();
        r8 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0161, code lost:
        if (r8.A2V("decompression_failure_reported_timestamp", 86400000) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0163, code lost:
        r4 = new X.C45062Px();
        r4.A01 = r12;
        r4.A02 = r2;
        r4.A00 = java.lang.Double.valueOf((double) r6.A01.A02());
        r6.A02.Bly(r4);
        r8.A1Z("decompression_failure_reported_timestamp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0181, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Error decompressing archive ");
        r1.append(r12);
        com.whatsapp.util.Log.w(r1.toString(), r7);
        r1 = new java.io.IOException(r7.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a4, code lost:
        r3 = null;
        r16 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a3 A[ExcHandler: IOException | IndexOutOfBoundsException (e java.lang.Throwable), Splitter:B:1:0x0016] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1MB A00(android.content.Context r19, android.content.res.Resources r20, java.lang.String r21, java.util.Locale r22, boolean r23) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r21
            r0.append(r3)
            java.lang.String r8 = ".pack"
            r0.append(r8)
            java.lang.String r5 = r0.toString()
            r9 = 0
            r13 = 1
            r15 = 0
            java.lang.Boolean r0 = X.C18750th.A03     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1 = 0
            r0 = r23
            if (r23 != 0) goto L_0x001e
            r1 = 1
        L_0x001e:
            r11 = r19
            java.io.File r6 = r11.getFilesDir()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r1 == 0) goto L_0x00b3
            java.lang.Class<X.0tq> r1 = X.C18800tq.class
            java.lang.Object r1 = X.C18810tr.A00(r11, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0tq r1 = (X.C18800tq) r1     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0tq r1 = r1.AfI     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0tt r1 = r1.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.004 r1 = r1.A4O     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.Object r6 = r1.get()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.6Kj r6 = (X.AnonymousClass6Kj) r6     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r2.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r2.append(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r1 = ".spo"
            r2.append(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r12 = r2.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.File r3 = r11.getFilesDir()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r1 = "decompressed"
            java.io.File r2 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r2.<init>(r3, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.<init>(r2, r12)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.File r2 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r2.<init>(r1, r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            boolean r1 = r2.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r1 == 0) goto L_0x0077
            X.101 r1 = r6.A03     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            boolean r1 = r1.A01(r11, r12)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r1 == 0) goto L_0x0077
        L_0x006e:
            java.lang.String r1 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r3.<init>(r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            goto L_0x010e
        L_0x0077:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            X.101 r10 = r6.A03     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r14 = 1
            boolean r1 = r10.A02(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            if (r1 == 0) goto L_0x00a5
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            long r7 = r7 - r3
            boolean r4 = X.C224714l.A02()     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            X.2Py r3 = new X.2Py     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r3.<init>()     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r3.A02 = r12     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r3.A01 = r1     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r3.A00 = r1     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            X.0yW r1 = r6.A02     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r1.Bly(r3)     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
        L_0x00a5:
            boolean r1 = r2.exists()     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = "Decompression failed: File does not exist"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
            throw r0     // Catch:{ Exception -> 0x0151, IOException | IndexOutOfBoundsException -> 0x01a3 }
        L_0x00b3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r7.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r7.append(r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r1 = "_"
            r7.append(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r2 = r11.getPackageCodePath()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.<init>(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            long r1 = r1.lastModified()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r7.append(r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r7.append(r8)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.File r2 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r2.<init>(r6, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            boolean r1 = r2.exists()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = "extracted_pack_file.pack.tmp"
            java.io.File r4 = new java.io.File     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r4.<init>(r6, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r3.<init>(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            android.content.res.AssetManager r1 = r20.getAssets()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.InputStream r1 = r1.open(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.AnonymousClass6YY.A0J(r1, r3)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r3.close()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            boolean r1 = r4.renameTo(r2)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r1 != 0) goto L_0x006e
            java.lang.String r0 = "Renaming temp file failed"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            goto L_0x019e
        L_0x010e:
            java.nio.channels.FileChannel r16 = r3.getChannel()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014d, all -> 0x01c4 }
            java.nio.channels.FileChannel$MapMode r17 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            r18 = 0
            long r20 = r2.length()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            java.nio.MappedByteBuffer r6 = r16.map(r17, r18, r20)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            r7 = r22
            java.util.List r5 = A01(r7, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            boolean r0 = r5.isEmpty()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            if (r0 == 0) goto L_0x013f
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            java.lang.String r2 = "translations/loadData error: locale '%s' not supported"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            java.lang.String[] r0 = X.C26621Kw.A04     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            java.lang.String r0 = r7.toLanguageTag()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            r1[r15] = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            java.lang.String r0 = java.lang.String.format(r4, r2, r1)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
        L_0x013f:
            X.1MB r0 = new X.1MB     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            r0.<init>(r6, r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x014b }
            X.AnonymousClass14X.A02(r3)
            X.AnonymousClass14X.A02(r16)
            return r0
        L_0x014b:
            r2 = move-exception
            goto L_0x01a7
        L_0x014d:
            r2 = move-exception
            r16 = r9
            goto L_0x01a7
        L_0x0151:
            r7 = move-exception
            java.lang.String r2 = r7.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0v0 r8 = r6.A00     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r5 = "decompression_failure_reported_timestamp"
            boolean r0 = r8.A2V(r5, r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            if (r0 == 0) goto L_0x0181
            X.2Px r4 = new X.2Px     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r4.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r4.A01 = r12     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r4.A02 = r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0wx r0 = r6.A01     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            long r2 = r0.A02()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            double r0 = (double) r2     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r4.A00 = r0     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            X.0yW r0 = r6.A02     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r0.Bly(r4)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r8.A1Z(r5)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
        L_0x0181:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.<init>()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = "Error decompressing archive "
            r1.append(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.append(r12)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            com.whatsapp.util.Log.w(r0, r7)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.lang.String r0 = r7.getMessage()     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
            r1.<init>(r0)     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
        L_0x019e:
            throw r1     // Catch:{ IOException | IndexOutOfBoundsException -> 0x01a3, all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            r16 = r9
            goto L_0x01c8
        L_0x01a3:
            r2 = move-exception
            r3 = r9
            r16 = r9
        L_0x01a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r1.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "translations/loadData error:"
            r1.append(r0)     // Catch:{ all -> 0x01c2 }
            r1.append(r2)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c2 }
            X.AnonymousClass14X.A02(r3)
            X.AnonymousClass14X.A02(r16)
            return r9
        L_0x01c2:
            r0 = move-exception
            goto L_0x01c7
        L_0x01c4:
            r0 = move-exception
            r16 = r9
        L_0x01c7:
            r9 = r3
        L_0x01c8:
            X.AnonymousClass14X.A02(r9)
            X.AnonymousClass14X.A02(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221713d.A00(android.content.Context, android.content.res.Resources, java.lang.String, java.util.Locale, boolean):X.1MB");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C221713d(android.content.Context r5, android.content.res.Resources r6, X.AnonymousClass1ME r7, java.util.Locale r8) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String[] r0 = X.C26621Kw.A04
            java.lang.String r1 = r8.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            java.lang.String r3 = r8.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.1Ky r0 = X.C26631Kx.A00     // Catch:{ IllegalArgumentException -> 0x0021 }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            r2 = r0
        L_0x0021:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            goto L_0x0043
        L_0x0029:
            java.lang.String r2 = X.C26621Kw.A02(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "strings_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.1MB r0 = A00(r5, r6, r1, r8, r0)
        L_0x0043:
            r4.A00 = r0
            r4.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221713d.<init>(android.content.Context, android.content.res.Resources, X.1ME, java.util.Locale):void");
    }

    public static List A01(Locale locale, boolean z) {
        Object obj;
        String language = locale.getLanguage();
        if (language.equals("he")) {
            language = "iw";
        } else if (language.equals("yi")) {
            language = "ji";
        } else if (language.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            language = "in";
        }
        if ("fil".equals(language)) {
            language = "tl";
        } else if (language.length() == 3) {
            return Collections.emptyList();
        }
        String country = locale.getCountry();
        String A04 = C26621Kw.A04(locale);
        ArrayList arrayList = new ArrayList(2);
        if (z || !"en".equals(language)) {
            String str = "pt";
            if (str.equals(language)) {
                if (!AnonymousClass1MD.A01.contains(locale.getCountry())) {
                    str = "pt-BR";
                }
                arrayList.add(str);
            } else if ("zh".equals(language)) {
                if (A04.equals("Hans")) {
                    obj = "zh-CN";
                } else if (A04.equals("Hant")) {
                    obj = "zh-TW";
                }
                arrayList.add(obj);
            } else if (A04.equals(C26621Kw.A04(Locale.forLanguageTag(language)))) {
                arrayList.add(language);
            }
        } else {
            obj = "en-US";
            try {
                Object A012 = C26631Kx.A00.A01(country);
                if (A012 != null) {
                    obj = A012;
                }
            } catch (IllegalArgumentException unused) {
            }
            arrayList.add(obj);
        }
        if (country.length() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("-");
            sb.append(country);
            String obj2 = sb.toString();
            if ((arrayList.isEmpty() || !((String) arrayList.get(0)).equals(obj2)) && A04.equals(C26621Kw.A04(Locale.forLanguageTag(obj2)))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void A02(C221513b r0) {
        A02 = r0;
    }
}
