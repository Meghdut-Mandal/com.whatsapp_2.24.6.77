package X;

import java.util.Arrays;

/* renamed from: X.75H  reason: invalid class name */
public abstract class AnonymousClass75H implements Runnable, AnonymousClass4PA {
    public final AnonymousClass64a A00;

    public AnonymousClass75H(AnonymousClass64a r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public synchronized void cancel() {
        C159527jV r0;
        AnonymousClass64a r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    public static void A05(C132466Tv r2, C1042658x r3, String str, Throwable th) {
        r3.A0e = str;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        sb.append(" | Trace: ");
        sb.append(Arrays.toString(th.getStackTrace()));
        r2.A0B(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0286, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/libmp4muxexception", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x028d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r1 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0292, code lost:
        if (r1 != null) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0294, code lost:
        r0 = X.AnonymousClass099.A0O(r1, "No space", false);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x029d, code lost:
        if (r0 != true) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r1);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/badaudio", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02bb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalargument", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02c1, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02ee, code lost:
        X.C90464aC.A0t(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02f3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2.exists() == true) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e2, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0123, code lost:
        if (r2.exists() != false) goto L_0x0125;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x028d A[ExcHandler: IOException (r0v13 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:136:0x01e8] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a0 A[ExcHandler: FileNotFoundException (r1v8 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:136:0x01e8] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02aa A[ExcHandler: 5LX (r1v7 'e' X.5LX A[CUSTOM_DECLARE]), Splitter:B:136:0x01e8] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02b4 A[ExcHandler: IllegalStateException (r1v5 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:136:0x01e8] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02bb A[ExcHandler: IllegalArgumentException (r1v4 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:136:0x01e8] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C122615v9 A06() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C104775Bi
            if (r0 == 0) goto L_0x0184
            r4 = r15
            X.5Bi r4 = (X.C104775Bi) r4
            X.5BW r3 = r4.A05
            java.lang.String r5 = r3.A03
            if (r5 == 0) goto L_0x0076
            X.1Av r1 = r4.A02
            java.lang.String r0 = r3.A04
            java.io.File r2 = r1.A04(r5, r0)
            r1 = 1
            boolean r0 = r2.exists()
            if (r0 != r1) goto L_0x0076
        L_0x001c:
            X.011 r7 = X.C36441kJ.A19(r2, r5)
        L_0x0020:
            r10 = 0
            if (r7 == 0) goto L_0x0073
            java.lang.Object r9 = r7.first
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r11 = r7.second
            java.lang.String r11 = (java.lang.String) r11
        L_0x002b:
            r13 = -1
            X.1B0 r1 = r4.A07
            java.lang.String r0 = r3.A04
            X.6FM r2 = r1.A00(r9, r0)
            if (r9 == 0) goto L_0x006f
            java.lang.String r0 = r9.getAbsolutePath()
            if (r0 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            long r7 = r9.length()
            r5 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            r0 = 2131894553(0x7f122119, float:1.9423914E38)
        L_0x004c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x012e
            int r1 = r0.intValue()
            X.7gs r0 = r3.A05
            r0.B5i(r1)
            r14 = 0
            X.5Be r8 = new X.5Be
            r12 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0063:
            X.5Rz r0 = X.C108055Rz.SEND
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x0132
            r0 = 2131887543(0x7f1205b7, float:1.9409696E38)
            goto L_0x004c
        L_0x006f:
            r0 = 2131894328(0x7f122038, float:1.9423458E38)
            goto L_0x004c
        L_0x0073:
            r9 = r10
            r11 = r10
            goto L_0x002b
        L_0x0076:
            java.io.File r2 = r3.A01
            r1 = 1
            if (r2 == 0) goto L_0x0082
            boolean r0 = r2.exists()
            if (r0 != r1) goto L_0x0082
            goto L_0x001c
        L_0x0082:
            java.io.File r5 = r3.A06
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x00b6
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/sticker uri is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x008d:
            r0 = 0
        L_0x008e:
            r6 = 0
            if (r0 == 0) goto L_0x0102
            com.whatsapp.stickers.WebpUtils r7 = r4.A06
            java.lang.String r0 = r5.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r2 = r7.A01(r0)
            if (r2 == 0) goto L_0x00f3
            int r0 = r2.height
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L_0x00f3
            int r0 = r2.width
            if (r0 != r1) goto L_0x00f3
            X.3S2 r0 = r3.A00
            if (r0 == 0) goto L_0x00f6
            byte[] r0 = r0.A02()
            boolean r0 = r7.A02(r5, r0)
            if (r0 == 0) goto L_0x00f6
            goto L_0x00ee
        L_0x00b6:
            X.0yb r0 = r4.A03     // Catch:{ Exception -> 0x00e6 }
            X.0ya r1 = r0.A0O()     // Catch:{ Exception -> 0x00e6 }
            if (r1 == 0) goto L_0x00dd
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00e6 }
            java.io.InputStream r2 = r1.A06(r0)     // Catch:{ Exception -> 0x00e6 }
            if (r2 != 0) goto L_0x00ce
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x008d
        L_0x00ce:
            r0 = 500000(0x7a120, double:2.47033E-318)
            boolean r0 = X.AnonymousClass6YY.A0T(r5, r2, r0)     // Catch:{ all -> 0x00d9 }
            r2.close()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x008e
        L_0x00d9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            goto L_0x00e2
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00e5
        L_0x00e2:
            X.C05600Qi.A00(r2, r1)     // Catch:{ Exception -> 0x00e6 }
        L_0x00e5:
            throw r0     // Catch:{ Exception -> 0x00e6 }
        L_0x00e6:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/copyStickerFileFromUri exception "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x008e
        L_0x00ee:
            java.lang.String r6 = X.AnonymousClass6UG.A00(r5)     // Catch:{ IOException -> 0x00fc }
            goto L_0x0102
        L_0x00f3:
            java.lang.String r0 = "ProcessStickerTask/processMedia/sticker uri in processMediaRequestData was invalid"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r0 = "ProcessStickerTask/processMedia/there is no sticker metadata object in processMediaRequestData"
        L_0x00f8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0102
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia/unable to get sticker hash"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0102:
            r7 = 0
            if (r6 == 0) goto L_0x0020
            X.1Av r1 = r4.A02
            java.lang.String r0 = r3.A04
            java.io.File r2 = r1.A04(r6, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0125
            X.0y0 r0 = r4.A01     // Catch:{ IOException -> 0x0119 }
            r0.A0f(r5, r2)     // Catch:{ IOException -> 0x0119 }
            goto L_0x011f
        L_0x0119:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia failed to move file to destination "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x011f:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0020
        L_0x0125:
            X.C90464aC.A18(r5)
            X.011 r7 = X.C36441kJ.A19(r2, r6)
            goto L_0x0020
        L_0x012e:
            if (r2 != 0) goto L_0x0132
            r12 = r10
            goto L_0x0174
        L_0x0132:
            X.1Gl r7 = X.C25471Gl.A0d
            X.AnonymousClass00C.A09(r7)
            java.io.File r6 = r2.A00
            boolean r3 = r2 instanceof X.C106555Ki
            if (r3 == 0) goto L_0x0181
            java.lang.String r5 = "image/webp"
        L_0x013f:
            r0 = 0
            X.5v4 r1 = new X.5v4
            r1.<init>(r7, r6, r5, r0)
            X.1Gr r0 = r4.A04
            X.5v5 r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x017f
            byte[] r12 = r0.A02
        L_0x014f:
            if (r3 == 0) goto L_0x017d
            r0 = r2
            X.5Ki r0 = (X.C106555Ki) r0
            X.00T r0 = r0.A04
            int r1 = X.C36331k8.A02(r0)
        L_0x015a:
            X.6Op r0 = new X.6Op
            r0.<init>(r1)
            int r13 = r0.A00
            if (r3 == 0) goto L_0x017b
            X.5Ki r2 = (X.C106555Ki) r2
            X.00T r0 = r2.A04
            int r1 = X.C36331k8.A02(r0)
            r0 = -1
            boolean r0 = X.C90474aD.A1T(r1, r0)
        L_0x0170:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
        L_0x0174:
            r14 = 1
            X.5Be r8 = new X.5Be
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x017b:
            r0 = 1
            goto L_0x0170
        L_0x017d:
            r1 = -1
            goto L_0x015a
        L_0x017f:
            r12 = 0
            goto L_0x014f
        L_0x0181:
            java.lang.String r5 = "application/was"
            goto L_0x013f
        L_0x0184:
            boolean r0 = r15 instanceof X.C104755Bg
            if (r0 == 0) goto L_0x01d9
            r3 = r15
            X.5Bg r3 = (X.C104755Bg) r3
            X.5BT r1 = r3.A01
            java.lang.String r0 = r1.A00
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r5 = 0
            r4 = 0
            if (r2 != 0) goto L_0x019d
            X.5Bc r3 = new X.5Bc
            r3.<init>(r4, r5)
            return r3
        L_0x019d:
            java.io.File r1 = r1.A06
            X.0yb r0 = r3.A00
            X.0ya r0 = r0.A0O()
            X.C18740tg.A06(r0)
            java.io.InputStream r2 = r0.A06(r2)     // Catch:{ IOException -> 0x01cd }
            if (r2 == 0) goto L_0x01bb
            X.AnonymousClass6YY.A0S(r1, r2)     // Catch:{ all -> 0x01c6 }
            r0 = 1
            X.5Bc r3 = new X.5Bc     // Catch:{ all -> 0x01c6 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01c6 }
            r2.close()     // Catch:{ IOException -> 0x01cd }
            return r3
        L_0x01bb:
            java.lang.String r0 = "ProcessCopyTask/processMedia failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c6 }
            X.5Bc r3 = new X.5Bc     // Catch:{ all -> 0x01c6 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x01c6 }
            return r3
        L_0x01c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x01cd }
            throw r0     // Catch:{ IOException -> 0x01cd }
        L_0x01cd:
            r1 = move-exception
            java.lang.String r0 = "ProcessCopyTask/processMedia exception "
            com.whatsapp.util.Log.e(r0, r1)
            X.5Bc r3 = new X.5Bc
            r3.<init>(r4, r5)
            return r3
        L_0x01d9:
            r7 = r15
            X.5Bh r7 = (X.C104765Bh) r7
            X.5BU r8 = r7.A03
            java.io.File r5 = r8.A06
            java.io.File r10 = r8.A00
            long r13 = X.AnonymousClass1GW.A06(r10)
            r4 = 1
            r6 = 0
            android.os.PowerManager$WakeLock r9 = r7.A00     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            if (r9 == 0) goto L_0x01ef
            r9.acquire()     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
        L_0x01ef:
            boolean r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            java.lang.String r12 = "audio was not transcoded correctly"
            if (r0 == 0) goto L_0x024b
            boolean r0 = X.C146516vj.A01(r10)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = "mediatranscodequeue/audio/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r1 = 0
            r11 = 96000(0x17700, float:1.34525E-40)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x020d
            r0 = 96000(0x17700, float:1.34525E-40)
            goto L_0x0217
        L_0x020d:
            long r2 = r10.length()     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0 = 8000(0x1f40, float:1.121E-41)
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            long r2 = r2 * r0
            long r2 = r2 / r13
            int r0 = (int) r2     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
        L_0x0217:
            r1 = 12200(0x2fa8, float:1.7096E-41)
            int r0 = java.lang.Math.min(r0, r11)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            X.5wI r0 = new X.5wI     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0.<init>(r10, r5)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0.A00 = r1     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            X.6vj r1 = new X.6vj     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            X.7sT r0 = new X.7sT     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0.<init>(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r1.A00 = r0     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r8.A00(r1)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r1.A02()     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            boolean r0 = r1.A08     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            if (r0 != 0) goto L_0x02d0
            X.1DC r0 = r7.A04     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            boolean r0 = r0.A0F(r5)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            if (r0 != 0) goto L_0x026e
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r12)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            goto L_0x0285
        L_0x024b:
            X.1DC r0 = r7.A04     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            boolean r0 = r0.A0F(r10)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            if (r0 == 0) goto L_0x0270
            java.lang.String r0 = "mediatranscodequeue/audio/copy-and-repair"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            X.0y0 r0 = r7.A01     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0.A0e(r10, r5)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            X.1DA r0 = X.AnonymousClass1DC.A04(r5)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            int r1 = r0.A01     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            r0 = 2
            if (r1 != r0) goto L_0x026e
            X.1AV r0 = r7.A02     // Catch:{ 5V4 -> 0x026c, IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d }
            com.whatsapp.Mp4Ops.A03(r0, r5, r6)     // Catch:{ 5V4 -> 0x026c, IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d }
            goto L_0x026e
        L_0x026c:
            r0 = move-exception
            goto L_0x0285
        L_0x026e:
            r0 = 1
            goto L_0x02d1
        L_0x0270:
            java.lang.String r0 = "mediatranscodequeue/audio/ineligible-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r12)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            goto L_0x0285
        L_0x027a:
            java.lang.String r0 = "mediatranscodequeue/audio/cannot-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
            java.lang.String r0 = "cannot transcode audio"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
        L_0x0285:
            throw r0     // Catch:{ IllegalArgumentException -> 0x02bb, IllegalStateException -> 0x02b4, 5LX -> 0x02aa, FileNotFoundException -> 0x02a0, IOException -> 0x028d, 5V4 -> 0x0286 }
        L_0x0286:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02ed }
            goto L_0x02b0
        L_0x028d:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02ed }
            if (r1 == 0) goto L_0x02c1
            java.lang.String r0 = "No space"
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r6)     // Catch:{ all -> 0x02ed }
            r1 = 2131889309(0x7f120c9d, float:1.9413278E38)
            if (r0 == r4) goto L_0x02c4
            goto L_0x02c1
        L_0x02a0:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02ed }
            r1 = 2131889295(0x7f120c8f, float:1.941325E38)
            goto L_0x02c4
        L_0x02aa:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/badaudio"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02ed }
        L_0x02b0:
            r1 = 2131889276(0x7f120c7c, float:1.941321E38)
            goto L_0x02c4
        L_0x02b4:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02ed }
            goto L_0x02c1
        L_0x02bb:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02ed }
        L_0x02c1:
            r1 = 2131889321(0x7f120ca9, float:1.9413302E38)
        L_0x02c4:
            X.7gs r0 = r8.A05     // Catch:{ all -> 0x02ed }
            r0.B5i(r1)     // Catch:{ all -> 0x02ed }
            android.os.PowerManager$WakeLock r0 = r7.A00
            X.C90464aC.A0t(r0)
            r0 = 0
            goto L_0x02d4
        L_0x02d0:
            r0 = 0
        L_0x02d1:
            X.C90464aC.A0t(r9)
        L_0x02d4:
            X.5BZ r1 = new X.5BZ
            r1.<init>()
            if (r0 == 0) goto L_0x02ea
            int r0 = X.AnonymousClass1GW.A04(r5)
            r1.A00 = r0
            r1.A00 = r5
            r1.A02 = r4
        L_0x02e5:
            X.5Bd r0 = r1.A00()
            return r0
        L_0x02ea:
            r1.A02 = r6
            goto L_0x02e5
        L_0x02ed:
            r1 = move-exception
            android.os.PowerManager$WakeLock r0 = r7.A00
            X.C90464aC.A0t(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75H.A06():X.5v9");
    }

    public void run() {
        this.A00.A04.BY1(A06());
    }
}
