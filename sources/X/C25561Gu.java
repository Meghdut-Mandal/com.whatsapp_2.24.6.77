package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1Gu  reason: invalid class name and case insensitive filesystem */
public final class C25561Gu {
    public static final C18950u5 A03 = new C18950u5(1, 1);
    public static final C25571Gv A04 = new C25571Gv();
    public static final Object A05 = new Object();
    public static final Set A06 = AnonymousClass02N.A01("wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma");
    public static final Set A07 = AnonymousClass02N.A01("7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip");
    public static final Set A08 = AnonymousClass02N.A01("pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd");
    public static final Set A09 = AnonymousClass02N.A01("apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf");
    public static final Set A0A = AnonymousClass02N.A01("ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff");
    public static final Set A0B = AnonymousClass02N.A01("vcf", "vcard");
    public static final Set A0C = AnonymousClass02N.A01("3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob");
    public final C19630wG A00;
    public final C20810yC A01;
    public final C25541Gs A02;

    public C25561Gu(C19630wG r2, C20810yC r3, C25541Gs r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C21060yb r14, java.util.List r15) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            int r4 = r15.size()
            r6 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r4) goto L_0x006c
            java.lang.Object r9 = r15.get(r3)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r2 = "document-utils/get-document-size/unexpected exception"
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            java.io.File r0 = X.AnonymousClass6YY.A03(r9)
            if (r0 == 0) goto L_0x0029
            long r0 = r0.length()
        L_0x0023:
            float r2 = (float) r0
            long r0 = (long) r2
            long r6 = r6 + r0
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0029:
            java.lang.String r1 = "_display_name"
            java.lang.String r0 = "_size"
            java.lang.String[] r10 = new java.lang.String[]{r1, r0}
            X.0ya r8 = r14.A0O()
            if (r8 != 0) goto L_0x003f
            java.lang.String r0 = "document-utils/get-document-size cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003c:
            r0 = 0
            goto L_0x0023
        L_0x003f:
            r11 = 0
            r13 = r11
            r12 = r11
            android.database.Cursor r5 = r8.A03(r9, r10, r11, r12, r13)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            if (r5 == 0) goto L_0x003c
            int r1 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0060 }
            if (r1 < 0) goto L_0x005c
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005c
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x0060 }
            r5.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            goto L_0x0023
        L_0x005c:
            r5.close()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            goto L_0x003c
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
            throw r0     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            goto L_0x003c
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25561Gu.A00(X.0yb, java.util.List):long");
    }

    public static final String A01(C18820ts r2, C46972by r3) {
        AnonymousClass00C.A0D(r2, 0);
        return C25571Gv.A03(r2, r3.A05, r3.A00);
    }

    public static final void A02(C24801Dv r11, C19700wN r12, C225314u r13, AnonymousClass17Y r14, AnonymousClass1TA r15, C46972by r16, AnonymousClass1X7 r17, AnonymousClass13J r18, C19770wU r19) {
        DocumentWarningDialogFragment documentWarningDialogFragment;
        AnonymousClass1X7 r5 = r17;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass17Y r7 = r14;
        AnonymousClass00C.A0D(r14, 1);
        AnonymousClass00C.A0D(r12, 2);
        C19770wU r2 = r19;
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r15, 4);
        AnonymousClass00C.A0D(r13, 5);
        C46972by r8 = r16;
        AnonymousClass00C.A0D(r8, 6);
        C24801Dv r6 = r11;
        AnonymousClass00C.A0D(r11, 7);
        AnonymousClass00C.A0D(r18, 8);
        C65013Qj r4 = r8.A01;
        C18740tg.A06(r4);
        File file = r4.A0I;
        if (file == null || !file.exists()) {
            r5.A03(r13);
            return;
        }
        if (!r8.A1J.A02 && "apk".equalsIgnoreCase(AnonymousClass6YY.A07(file.getAbsolutePath()))) {
            long j = r8.A1N;
            documentWarningDialogFragment = new DocumentWarningDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("message_id", j);
            bundle.putInt("warning_id", R.string.f12nameremoved);
            bundle.putBoolean("allowed_to_open", true);
            documentWarningDialogFragment.A17(bundle);
        } else if (r4.A09 == 3) {
            long j2 = r8.A1N;
            documentWarningDialogFragment = new DocumentWarningDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("message_id", j2);
            bundle2.putInt("warning_id", R.string.f12nameremoved);
            bundle2.putBoolean("allowed_to_open", true);
            documentWarningDialogFragment.A17(bundle2);
        } else {
            WeakReference weakReference = new WeakReference(r13);
            r14.A05(0, R.string.f12nameremoved);
            C66363Vr r52 = new C66363Vr(r6, r7, r8, weakReference, 1);
            AnonymousClass28n r1 = new AnonymousClass28n(r12, r15, r8);
            r1.A0B(r52, r14.A04);
            r2.Boy(r1);
            return;
        }
        documentWarningDialogFragment.A1f(r13.getSupportFragmentManager(), (String) null);
    }

    public final boolean A03(String str) {
        if (str == null) {
            return false;
        }
        if ("application/pdf".equals(str) || "application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str) || "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) || "application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
            return true;
        }
        if (C20800yB.A01(C21000yV.A02, this.A01, 1258)) {
            return C25571Gv.A05(str) || AnonymousClass1GX.A0c(str);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0139, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A04(java.io.File r18, java.lang.String r19, float r20, int r21) {
        /*
            r17 = this;
            r7 = 0
            r3 = r18
            if (r18 == 0) goto L_0x0147
            r4 = r17
            r5 = r19
            boolean r0 = r4.A03(r5)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0141 }
            r1 = 480(0x1e0, float:6.73E-43)
            if (r0 == 0) goto L_0x003c
            float r0 = (float) r1     // Catch:{ Exception -> 0x0141 }
            float r20 = r20 * r0
            int r4 = X.C14960mT.A01(r20)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0141 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ Exception -> 0x0141 }
            r1 = 0
            boolean r0 = X.AnonymousClass6YG.A07()     // Catch:{ Exception -> 0x0141 }
            if (r0 != 0) goto L_0x0147
            android.graphics.Bitmap r1 = X.C25571Gv.A01(r2, r1, r1, r4, r1)     // Catch:{ Exception -> 0x0141 }
            if (r1 == 0) goto L_0x0147
            byte[] r0 = X.C25571Gv.A06(r1)     // Catch:{ Exception -> 0x0141 }
            r1.recycle()     // Catch:{ Exception -> 0x0141 }
            return r0
        L_0x003c:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0141 }
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0141 }
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0141 }
            if (r0 != 0) goto L_0x00ad
            X.0yC r2 = r4.A01     // Catch:{ Exception -> 0x0141 }
            r1 = 6003(0x1773, float:8.412E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x0141 }
            int r0 = X.C20800yB.A00(r0, r2, r1)     // Catch:{ Exception -> 0x0141 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0141 }
            float r20 = r20 * r0
            int r11 = X.C14960mT.A01(r20)     // Catch:{ Exception -> 0x0141 }
            boolean r0 = X.C25571Gv.A05(r5)     // Catch:{ Exception -> 0x0141 }
            r12 = r21
            if (r0 == 0) goto L_0x0078
            X.1Gs r1 = r4.A02     // Catch:{ Exception -> 0x0141 }
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ Exception -> 0x0141 }
            byte[] r7 = r1.A05(r0, r11, r11, r12)     // Catch:{ Exception -> 0x0141 }
            return r7
        L_0x0078:
            boolean r0 = X.AnonymousClass1GX.A0c(r5)     // Catch:{ Exception -> 0x0141 }
            if (r0 == 0) goto L_0x0147
            r2 = 0
            X.C21656ATx.A04(r3)     // Catch:{ IOException -> 0x0083 }
            goto L_0x0085
        L_0x0083:
            r0 = 0
            goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r0 == 0) goto L_0x0091
            android.graphics.Bitmap r2 = X.C21656ATx.A00(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00a2, Exception -> 0x008d }
            goto L_0x00a8
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            goto L_0x00a5
        L_0x0091:
            r13 = 0
            r9 = 0
            X.6vW r8 = new X.6vW     // Catch:{ Exception -> 0x0141 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x0141 }
            r10 = 0
            r15 = 0
            r16 = 0
            android.graphics.Bitmap r2 = X.C25541Gs.A00(r7, r8, r9, r10, r11, r12, r13, r15, r16)     // Catch:{ Exception -> 0x0141 }
            goto L_0x00a8
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
        L_0x00a5:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0141 }
        L_0x00a8:
            byte[] r7 = X.C25541Gs.A03(r2, r11)     // Catch:{ Exception -> 0x0141 }
            return r7
        L_0x00ad:
            float r0 = (float) r1     // Catch:{ Exception -> 0x0141 }
            float r20 = r20 * r0
            int r5 = X.C14960mT.A01(r20)     // Catch:{ Exception -> 0x0141 }
            r6 = 0
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x013a }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x013a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = "docProps/thumbnail.jpeg"
            java.util.zip.ZipEntry r0 = r2.getEntry(r0)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x012f
            java.io.InputStream r3 = r2.getInputStream(r0)     // Catch:{ all -> 0x0133 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            r0 = 1
            r1.inDither = r0     // Catch:{ all -> 0x0128 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r3, r7, r1)     // Catch:{ all -> 0x0128 }
            if (r8 == 0) goto L_0x0122
            int r0 = r8.getWidth()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0122
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0122
            int r4 = r8.getWidth()     // Catch:{ all -> 0x0128 }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0128 }
            if (r4 >= r0) goto L_0x00ef
            r4 = r0
        L_0x00ef:
            if (r4 <= r5) goto L_0x011b
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r5     // Catch:{ all -> 0x0128 }
            float r1 = r1 * r0
            float r0 = (float) r4     // Catch:{ all -> 0x0128 }
            float r1 = r1 / r0
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ all -> 0x0128 }
            r13.<init>()     // Catch:{ all -> 0x0128 }
            r13.setScale(r1, r1)     // Catch:{ all -> 0x0128 }
            r9 = 0
            int r11 = r8.getWidth()     // Catch:{ all -> 0x0128 }
            int r12 = r8.getHeight()     // Catch:{ all -> 0x0128 }
            r14 = 1
            r10 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0128 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0128 }
            boolean r0 = r1.equals(r8)     // Catch:{ all -> 0x0128 }
            if (r0 != 0) goto L_0x011b
            r8.recycle()     // Catch:{ all -> 0x0128 }
            r8 = r1
        L_0x011b:
            byte[] r6 = X.C25571Gv.A06(r8)     // Catch:{ all -> 0x0128 }
            r8.recycle()     // Catch:{ all -> 0x0128 }
        L_0x0122:
            if (r3 == 0) goto L_0x012f
            r3.close()     // Catch:{ all -> 0x0133 }
            goto L_0x012f
        L_0x0128:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x012f:
            r2.close()     // Catch:{ IOException -> 0x013a }
            return r6
        L_0x0133:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x013a }
            throw r0     // Catch:{ IOException -> 0x013a }
        L_0x013a:
            r1 = move-exception
            java.lang.String r0 = "documentutils/openxmlthumb "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ Exception -> 0x0141 }
            return r6
        L_0x0141:
            r1 = move-exception
            java.lang.String r0 = "documentutils/getthumbnail "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0147:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25561Gu.A04(java.io.File, java.lang.String, float, int):byte[]");
    }
}
