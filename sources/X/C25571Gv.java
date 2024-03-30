package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;

/* renamed from: X.1Gv  reason: invalid class name and case insensitive filesystem */
public final class C25571Gv {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r7.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r4 = com.whatsapp.R.plurals.f10nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r7.equals(r0) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4 = com.whatsapp.R.plurals.f10nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r7.equals(r0) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r4 = com.whatsapp.R.plurals.f10nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r0 = r6.A0L(new java.lang.Object[]{java.lang.Integer.valueOf(r8)}, r4, (long) r8);
        X.AnonymousClass00C.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(X.C18820ts r6, java.lang.String r7, int r8) {
        /*
            r5 = 0
            X.AnonymousClass00C.A0D(r6, r5)
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0011
            if (r8 == 0) goto L_0x0011
            int r0 = r7.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0015;
                case -1073633483: goto L_0x0012;
                case -1071817359: goto L_0x0018;
                case -1050893613: goto L_0x0030;
                case -366307023: goto L_0x0024;
                case 904647503: goto L_0x0027;
                case 1993842850: goto L_0x003c;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x001a
        L_0x0015:
            java.lang.String r0 = "application/pdf"
            goto L_0x0029
        L_0x0018:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x001a:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0011
            r4 = 2131755252(0x7f1000f4, float:1.9141378E38)
            goto L_0x0047
        L_0x0024:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x003e
        L_0x0027:
            java.lang.String r0 = "application/msword"
        L_0x0029:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r1
        L_0x0030:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0011
        L_0x0038:
            r4 = 2131755249(0x7f1000f1, float:1.9141372E38)
            goto L_0x0047
        L_0x003c:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x003e:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0011
            r4 = 2131755251(0x7f1000f3, float:1.9141376E38)
        L_0x0047:
            long r2 = (long) r8
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r5] = r0
            java.lang.String r0 = r6.A0L(r1, r4, r2)
            X.AnonymousClass00C.A08(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25571Gv.A03(X.0ts, java.lang.String, int):java.lang.String");
    }

    public static final boolean A04(AnonymousClass185 r2, AnonymousClass11F r3, int i) {
        AnonymousClass00C.A0D(r2, 0);
        if (i != 1) {
            return false;
        }
        C222813r r0 = UserJid.Companion;
        if (!r2.A04(C222813r.A00(r3))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.String r7, java.util.zip.ZipFile r8) {
        /*
            java.lang.String r0 = "docProps/app.xml"
            java.util.zip.ZipEntry r2 = r8.getEntry(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 60
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "[^>]*>(.*)</"
            r1.append(r0)
            r1.append(r7)
            r0 = 62
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 34
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r1, r0)
            java.io.InputStream r3 = r8.getInputStream(r2)
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x00b4 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00b4 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x00b4 }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ all -> 0x00ad }
            r4.<init>()     // Catch:{ all -> 0x00ad }
            r0 = 1000(0x3e8, float:1.401E-42)
            char[] r2 = new char[r0]     // Catch:{ all -> 0x00ad }
        L_0x0044:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x00ad }
            r0 = -1
            if (r1 == r0) goto L_0x004f
            r4.write(r2, r5, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x0044
        L_0x004f:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ad }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00ad }
            r6.close()     // Catch:{ all -> 0x00b4 }
            java.util.regex.Matcher r1 = r7.matcher(r0)     // Catch:{ all -> 0x00b4 }
            boolean r0 = r1.find()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00bb
            r0 = 1
            java.lang.String r7 = r1.group(r0)     // Catch:{ all -> 0x00b4 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x00b4 }
            X.AnonymousClass00C.A08(r7)     // Catch:{ all -> 0x00b4 }
            int r6 = r7.length()     // Catch:{ all -> 0x00b4 }
            int r6 = r6 - r0
            r4 = 0
            r2 = 0
        L_0x0075:
            if (r4 > r6) goto L_0x0097
            r0 = r6
            if (r2 != 0) goto L_0x007b
            r0 = r4
        L_0x007b:
            char r1 = r7.charAt(r0)     // Catch:{ all -> 0x00b4 }
            r0 = 32
            int r1 = X.AnonymousClass00C.A00(r1, r0)     // Catch:{ all -> 0x00b4 }
            r0 = 0
            if (r1 > 0) goto L_0x0089
            r0 = 1
        L_0x0089:
            if (r2 != 0) goto L_0x0092
            if (r0 != 0) goto L_0x008f
            r2 = 1
            goto L_0x0075
        L_0x008f:
            int r4 = r4 + 1
            goto L_0x0075
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            int r6 = r6 + -1
            goto L_0x0075
        L_0x0097:
            int r0 = r6 + 1
            java.lang.CharSequence r0 = r7.subSequence(r4, r0)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b4 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a6 }
            goto L_0x00bb
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "documentutils/count "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00bb
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00b4 }
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            r3.close()
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25571Gv.A00(java.lang.String, java.util.zip.ZipFile):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r4 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008c, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[Catch:{ all -> 0x0088, FileNotFoundException -> 0x0010 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(java.lang.String r10, int r11, int r12, int r13, boolean r14) {
        /*
            java.lang.Object r9 = X.C25561Gu.A05
            monitor-enter(r9)
            r6 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0010 }
            r1.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0010 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r7 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x0010 }
            goto L_0x0015
        L_0x0010:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0095 }
            r7 = r6
        L_0x0015:
            if (r7 != 0) goto L_0x0019
            monitor-exit(r9)
            return r6
        L_0x0019:
            android.graphics.pdf.PdfRenderer r5 = new android.graphics.pdf.PdfRenderer     // Catch:{ IOException -> 0x0024, SecurityException -> 0x001f }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0024, SecurityException -> 0x001f }
            goto L_0x0029
        L_0x001f:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0095 }
        L_0x0028:
            r5 = r6
        L_0x0029:
            if (r5 == 0) goto L_0x0090
            int r0 = r5.getPageCount()     // Catch:{ all -> 0x0095 }
            if (r0 <= 0) goto L_0x008d
            r0 = 0
            android.graphics.pdf.PdfRenderer$Page r4 = r5.openPage(r0)     // Catch:{ all -> 0x0095 }
            if (r11 <= 0) goto L_0x003a
            if (r12 > 0) goto L_0x0047
        L_0x003a:
            int r11 = r4.getWidth()     // Catch:{ all -> 0x007f }
            int r12 = r4.getHeight()     // Catch:{ all -> 0x007f }
            if (r11 <= r12) goto L_0x0059
            int r12 = r12 * r13
            int r12 = r12 / r11
            r11 = r13
        L_0x0047:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x007f }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r11, r12, r0)     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x0078
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x007f }
            r1.<init>(r8)     // Catch:{ all -> 0x007f }
            r0 = -1
            r1.drawColor(r0)     // Catch:{ all -> 0x007f }
            goto L_0x005d
        L_0x0059:
            int r11 = r11 * r13
            int r11 = r11 / r12
            r12 = r13
            goto L_0x0047
        L_0x005d:
            if (r14 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r3 = r6
            goto L_0x0074
        L_0x0062:
            int r2 = r4.getWidth()     // Catch:{ all -> 0x007f }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ all -> 0x007f }
            r3.<init>()     // Catch:{ all -> 0x007f }
            float r1 = (float) r11     // Catch:{ all -> 0x007f }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r0 = (float) r2     // Catch:{ all -> 0x007f }
            float r1 = r1 / r0
            r3.setScale(r1, r1)     // Catch:{ all -> 0x007f }
        L_0x0074:
            r0 = 1
            r4.render(r8, r6, r3, r0)     // Catch:{ all -> 0x007f }
        L_0x0078:
            if (r4 == 0) goto L_0x007d
            r4.close()     // Catch:{ all -> 0x0095 }
        L_0x007d:
            r6 = r8
            goto L_0x008d
        L_0x007f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            if (r4 == 0) goto L_0x008c
            r4.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            X.AnonymousClass0VY.A01(r2, r0)     // Catch:{ all -> 0x0095 }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x008d:
            r5.close()     // Catch:{ all -> 0x0095 }
        L_0x0090:
            r7.close()     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            monitor-exit(r9)
            return r6
        L_0x0095:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25571Gv.A01(java.lang.String, int, int, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(android.net.Uri r7, X.C21060yb r8) {
        /*
            java.lang.String r2 = "document-utils/get-document-title/unexpected exception"
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            r0 = 1
            r4 = r7
            X.AnonymousClass00C.A0D(r7, r0)
            java.io.File r0 = X.AnonymousClass6YY.A03(r7)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = r0.getName()
        L_0x0015:
            return r6
        L_0x0016:
            java.lang.String r1 = "_display_name"
            java.lang.String r0 = "_size"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            X.0ya r3 = r8.A0O()
            r6 = 0
            if (r3 != 0) goto L_0x002b
            java.lang.String r0 = "document-utils/get-document-title cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r6
        L_0x002b:
            r8 = r6
            r7 = r6
            android.database.Cursor r3 = r3.A03(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            if (r3 == 0) goto L_0x0015
            int r1 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x004b }
            if (r1 < 0) goto L_0x0047
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x004b }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            return r0
        L_0x0047:
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            return r6
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0066, UnsupportedOperationException -> 0x0061, SecurityException -> 0x005c, NullPointerException -> 0x0057, IllegalStateException -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0057:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x005c:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0061:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        L_0x0066:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25571Gv.A02(android.net.Uri, X.0yb):java.lang.String");
    }

    public static final boolean A05(String str) {
        if ("image/jpeg".equals(str) || "image/jpg".equals(str) || "image/gif".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
            return true;
        }
        return false;
    }

    public static final byte[] A06(Bitmap bitmap) {
        byte[] byteArray;
        int i = 80;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            AnonymousClass00C.A08(byteArray);
            StringBuilder sb = new StringBuilder();
            sb.append("documentutils/docthumb ");
            int length = byteArray.length;
            sb.append(length);
            sb.append(' ');
            sb.append(i);
            Log.i(sb.toString());
            i -= 5;
            if (length <= 20480) {
                break;
            }
        } while (i > 0);
        return byteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A07(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r2 = "documentutils/getpagecount "
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0019
            X.6Xp r0 = new X.6Xp     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            r0.<init>(r8)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            r0.A08()     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            int r5 = r0.A00     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            return r5
        L_0x0019:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r3 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x013b }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x013b }
            r4.<init>(r0)     // Catch:{ IOException -> 0x013b }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0062
            r5 = 0
            java.lang.String r0 = "Slides"
            int r5 = A00(r0, r4)     // Catch:{ IOException -> 0x003e }
            if (r5 != 0) goto L_0x0112
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ all -> 0x0134 }
        L_0x0042:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r6.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "ppt/slides/slide"
            r6.append(r0)     // Catch:{ all -> 0x0134 }
            int r1 = r5 + 1
            r6.append(r1)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = ".xml"
            r6.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0134 }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0112
            r5 = r1
            goto L_0x0042
        L_0x0062:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r1.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0134 }
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0134 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            X.1Gx r0 = new X.1Gx     // Catch:{ all -> 0x0134 }
            r0.<init>()     // Catch:{ all -> 0x0134 }
            goto L_0x0133
        L_0x0081:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x00e4 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00e4 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00e4 }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00bf
            r5 = 0
        L_0x009b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r3.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "xl/worksheets/sheet"
            r3.append(r0)     // Catch:{ all -> 0x00dd }
            int r1 = r5 + 1
            r3.append(r1)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = ".xml"
            r3.append(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00dd }
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00bb
            r5 = r1
            goto L_0x009b
        L_0x00bb:
            r4.close()     // Catch:{ IOException -> 0x00e4 }
            return r5
        L_0x00bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r1.<init>()     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x00dd }
            r1.append(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00dd }
            X.1Gx r0 = new X.1Gx     // Catch:{ all -> 0x00dd }
            r0.<init>()     // Catch:{ all -> 0x00dd }
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x00e4 }
            throw r0     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "documentutils/sheetcount "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            throw r1     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
        L_0x00eb:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r9)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0144
            java.lang.String r3 = "documentutils/slidecount "
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ IOException -> 0x013b }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x013b }
            r4.<init>(r0)     // Catch:{ IOException -> 0x013b }
            java.lang.String r0 = "[Content_Types].xml"
            java.util.zip.ZipEntry r0 = r4.getEntry(r0)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0116
            r5 = 0
            java.lang.String r0 = "Pages"
            int r5 = A00(r0, r4)     // Catch:{ IOException -> 0x010e }
            goto L_0x0112
        L_0x010e:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ all -> 0x0134 }
        L_0x0112:
            r4.close()     // Catch:{ IOException -> 0x013b }
            return r5
        L_0x0116:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r1.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "documentutils/no content types in "
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0134 }
            r1.append(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0134 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            X.1Gx r0 = new X.1Gx     // Catch:{ all -> 0x0134 }
            r0.<init>()     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x013b }
            throw r0     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            r0 = move-exception
            com.whatsapp.util.Log.i(r3, r0)     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
            throw r0     // Catch:{ ZipException -> 0x0155, 1Gw -> 0x014b, 1Gx -> 0x0146, Exception -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
        L_0x0144:
            r5 = 0
            return r5
        L_0x0146:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            throw r0
        L_0x014b:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            X.1Gx r0 = new X.1Gx
            r0.<init>()
            throw r0
        L_0x0155:
            r0 = move-exception
            com.whatsapp.util.Log.i(r2, r0)
            X.1Gx r0 = new X.1Gx
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25571Gv.A07(java.io.File, java.lang.String):int");
    }
}
