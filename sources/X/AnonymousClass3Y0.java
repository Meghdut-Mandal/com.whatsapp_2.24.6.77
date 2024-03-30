package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3Y0  reason: invalid class name */
public class AnonymousClass3Y0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Rect rect) {
        rect.left /= 2;
        rect.right /= 2;
        rect.top /= 2;
        rect.bottom /= 2;
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y0(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: com.whatsapp.ephemeral.ViewOnceNuxBottomSheet} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fa, code lost:
        r8.A0B.recycle();
        r8.A0B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0209, code lost:
        r9.recycle();
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020d, code lost:
        A00(r6);
        r1 = r1 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05c3, code lost:
        X.AnonymousClass00C.A0D(r2, 0);
        X.C30961b3.A00(r2, r3, (java.lang.Integer) null, java.lang.Integer.valueOf(r1), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05fc, code lost:
        r1.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x078b, code lost:
        X.AnonymousClass3SJ.A00(r2.A00, r2.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0792, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0824, code lost:
        r0.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x086f, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r3.A1c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x09cf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x09d0, code lost:
        com.whatsapp.util.Log.e("cropimage/cannot_resample: ", r1);
        r8.setResult(0, com.whatsapp.crop.CropImage.A01());
        r8.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x09df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r12.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e4, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e5, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0r("cropimage/oom: ", X.AnonymousClass000.A0u(), r1), r12);
        r0 = r8.A0B;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x00f2, B:72:0x0197, B:74:0x01a5, B:90:0x01db] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x09cf A[ExcHandler: IOException (r1v105 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:31:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x041d;
                case 1: goto L_0x042b;
                case 2: goto L_0x001b;
                case 3: goto L_0x0437;
                case 4: goto L_0x0520;
                case 5: goto L_0x0550;
                case 6: goto L_0x056a;
                case 7: goto L_0x05a2;
                case 8: goto L_0x0396;
                case 9: goto L_0x03a2;
                case 10: goto L_0x05e9;
                case 11: goto L_0x05f3;
                case 12: goto L_0x0600;
                case 13: goto L_0x0911;
                case 14: goto L_0x060c;
                case 15: goto L_0x03ae;
                case 16: goto L_0x063d;
                case 17: goto L_0x0649;
                case 18: goto L_0x0651;
                case 19: goto L_0x0698;
                case 20: goto L_0x06ab;
                case 21: goto L_0x06b3;
                case 22: goto L_0x03c1;
                case 23: goto L_0x06d1;
                case 24: goto L_0x06f2;
                case 25: goto L_0x0717;
                case 26: goto L_0x0732;
                case 27: goto L_0x074c;
                case 28: goto L_0x03e0;
                case 29: goto L_0x0754;
                case 30: goto L_0x0771;
                case 31: goto L_0x0765;
                case 32: goto L_0x0880;
                case 33: goto L_0x08c1;
                case 34: goto L_0x08dc;
                case 35: goto L_0x08ea;
                case 36: goto L_0x08f2;
                case 37: goto L_0x0909;
                case 38: goto L_0x0909;
                case 39: goto L_0x0911;
                case 40: goto L_0x0406;
                case 41: goto L_0x0406;
                case 42: goto L_0x0919;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x094d;
                case 46: goto L_0x097b;
                case 47: goto L_0x097b;
                case 48: goto L_0x0987;
                case 49: goto L_0x099b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.0v0 r0 = r3.A01
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
        L_0x0017:
            r3.A1c()
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r8 = r1.A00
            com.whatsapp.crop.CropImage r8 = (com.whatsapp.crop.CropImage) r8
            X.3Qg r0 = r8.A0M
            if (r0 == 0) goto L_0x001a
            boolean r0 = r8.A0W
            if (r0 != 0) goto L_0x001a
            r11 = 1
            r8.A0W = r11
            com.whatsapp.crop.CropImageView r0 = r8.A0L
            r3 = 0
            r0.setEnabled(r3)
            com.whatsapp.crop.CropImageView r1 = r8.A0L
            java.util.ArrayList r0 = r1.A06
            r0.clear()
            r10 = 0
            r2 = 1
            X.3PL r0 = new X.3PL
            r0.<init>(r10)
            r1.A07(r0, r11)
            com.whatsapp.crop.CropImageView r0 = r8.A0L
            r0.A01 = r11
            android.graphics.Paint r7 = X.C36441kJ.A0K()
            r7.setAntiAlias(r11)
            r7.setFilterBitmap(r11)
            r7.setDither(r11)
            X.3Qg r0 = r8.A0M
            android.graphics.Rect r6 = r0.A02()
            int r4 = r8.A06
            java.lang.String r16 = "cropimage/cannot_resample: "
            java.lang.String r5 = "cropimage/oom: "
            java.lang.String r1 = "filter"
            java.lang.String r13 = "doodle"
            r9 = 0
            if (r4 == 0) goto L_0x0138
            int r12 = r8.A07
            if (r12 == 0) goto L_0x0138
            int r9 = r8.A09
            if (r9 <= r11) goto L_0x0081
            int r0 = r6.left
            int r0 = r0 * r9
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 * r9
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 * r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 * r9
            r6.bottom = r0
        L_0x0081:
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x0095
            int r9 = r6.width()
            int r0 = r8.A06
            if (r9 >= r0) goto L_0x0095
            int r4 = r6.width()
            int r12 = r6.height()
        L_0x0095:
            int r15 = r6.width()
            int r14 = r6.height()
            int r9 = r8.A06
            int r0 = r8.A07
            int r9 = X.AnonymousClass6Y8.A00(r15, r14, r9, r0, r11)
            int r0 = r6.left
            int r0 = r0 / r9
            r6.left = r0
            int r0 = r6.right
            int r0 = r0 / r9
            r6.right = r0
            int r0 = r6.top
            int r0 = r0 / r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 / r9
            r6.bottom = r0
            int r0 = r8.A09
            if (r0 > r11) goto L_0x00d3
            if (r9 > r11) goto L_0x00d3
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r13)
            if (r0 != 0) goto L_0x00d3
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r3)
            if (r0 == 0) goto L_0x02be
        L_0x00d3:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r3
            r1.inScaled = r3
            r1.inDither = r11
            r1.inPreferQualityOverSpeed = r11
            r11 = r9
        L_0x00e8:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r9)
            if (r11 > r0) goto L_0x02be
            r1.inSampleSize = r11
            X.1GX r13 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
            java.io.InputStream r14 = X.AnonymousClass1GX.A0V(r0, r13, r2)     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r14, r10, r1)     // Catch:{ all -> 0x010b }
            r8.A0B = r0     // Catch:{ all -> 0x010b }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
            goto L_0x02be
        L_0x010b:
            r13 = move-exception
            r14.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
        L_0x0114:
            throw r13     // Catch:{ OutOfMemoryError -> 0x0115, IOException -> 0x09cf }
        L_0x0115:
            r13 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass000.A0r(r5, r0, r11)
            com.whatsapp.util.Log.e(r0, r13)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0132
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
        L_0x0132:
            A00(r6)
            int r11 = r11 * 2
            goto L_0x00e8
        L_0x0138:
            int r0 = r8.A09
            if (r0 <= r11) goto L_0x013f
            com.whatsapp.crop.CropImage.A07(r6, r8)
        L_0x013f:
            int r0 = r8.A03
            r4 = 1
            if (r0 == 0) goto L_0x015e
        L_0x0144:
            int r0 = r6.width()
            int r12 = r0 / 2
            int r0 = r8.A03
            if (r12 > r0) goto L_0x0158
            int r0 = r6.height()
            int r12 = r0 / 2
            int r0 = r8.A03
            if (r12 <= r0) goto L_0x015e
        L_0x0158:
            int r4 = r4 * 2
            A00(r6)
            goto L_0x0144
        L_0x015e:
            int r0 = r8.A09
            if (r0 > r11) goto L_0x0178
            if (r4 > r11) goto L_0x0178
            android.content.Intent r0 = r8.getIntent()
            boolean r0 = r0.hasExtra(r13)
            if (r0 != 0) goto L_0x0178
            android.content.Intent r0 = r8.getIntent()
            int r0 = r0.getIntExtra(r1, r3)
            if (r0 == 0) goto L_0x0214
        L_0x0178:
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
            r1 = r4
        L_0x0180:
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r0, r4)
            if (r1 > r0) goto L_0x0214
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options
            r13.<init>()
            r13.inSampleSize = r1
            r13.inJustDecodeBounds = r3
            r13.inScaled = r3
            r13.inDither = r11
            r13.inPreferQualityOverSpeed = r11
            X.1GX r12 = r8.A0Q     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
            android.content.Intent r0 = r8.getIntent()     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
            android.net.Uri r0 = r0.getData()     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
            java.io.InputStream r14 = X.AnonymousClass1GX.A0V(r0, r12, r11)     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r14, r10, r13)     // Catch:{ all -> 0x01da }
            r8.A0B = r0     // Catch:{ all -> 0x01da }
            int r15 = r6.width()     // Catch:{ all -> 0x01da }
            int r13 = r6.height()     // Catch:{ all -> 0x01da }
            int r0 = r8.A03     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01c4
            if (r15 > r0) goto L_0x01bb
            if (r13 <= r0) goto L_0x01c4
        L_0x01bb:
            if (r15 <= r13) goto L_0x01c1
            int r13 = r13 * r0
            int r13 = r13 / r15
            r15 = r0
            goto L_0x01c4
        L_0x01c1:
            int r15 = r15 * r0
            int r15 = r15 / r13
            r13 = r0
        L_0x01c4:
            android.graphics.Bitmap r0 = r8.A0B     // Catch:{ all -> 0x01da }
            android.graphics.Bitmap$Config r12 = r0.getConfig()     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0S     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01d0
            if (r12 != 0) goto L_0x01d2
        L_0x01d0:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01da }
        L_0x01d2:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r13, r12)     // Catch:{ all -> 0x01da }
            r14.close()     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
            goto L_0x0214
        L_0x01da:
            r12 = move-exception
            r14.close()     // Catch:{ all -> 0x01df }
            goto L_0x01e3
        L_0x01df:
            r0 = move-exception
            r12.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
        L_0x01e3:
            throw r12     // Catch:{ OutOfMemoryError -> 0x01e4, IOException -> 0x09cf }
        L_0x01e4:
            r12 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass000.A0r(r5, r0, r1)
            com.whatsapp.util.Log.e(r0, r12)
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x0201
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x0201
            android.graphics.Bitmap r0 = r8.A0B
            r0.recycle()
            r8.A0B = r10
        L_0x0201:
            if (r9 == 0) goto L_0x020d
            boolean r0 = r9.isRecycled()
            if (r0 != 0) goto L_0x020d
            r9.recycle()
            r9 = r10
        L_0x020d:
            A00(r6)
            int r1 = r1 * 2
            goto L_0x0180
        L_0x0214:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x02a1
            int r11 = r6.width()
            int r4 = r6.height()
            int r0 = r8.A03
            if (r0 == 0) goto L_0x022d
            if (r11 > r0) goto L_0x0228
            if (r4 <= r0) goto L_0x022d
        L_0x0228:
            if (r11 <= r4) goto L_0x029d
            int r4 = r4 * r0
            int r4 = r4 / r11
            r11 = r0
        L_0x022d:
            if (r9 != 0) goto L_0x0241
            android.graphics.Bitmap r0 = r8.A0B
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x023b
            if (r1 != 0) goto L_0x023d
        L_0x023b:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x023d:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r11, r4, r1)
        L_0x0241:
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r3, r3, r11, r4)
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x0296
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0296
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            int r1 = r5.left
            int r0 = r5.right
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 / 2
            float r4 = (float) r0
            int r1 = r5.top
            int r0 = r5.bottom
            int r1 = r1 + r0
            int r0 = -r1
            int r0 = r0 / 2
            float r0 = (float) r0
            r11.preTranslate(r4, r0)
            android.graphics.Matrix r0 = r8.A0D
            r11.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r11.postRotate(r0)
            int r1 = r5.left
            int r0 = r5.right
            int r1 = r1 + r0
            int r0 = r1 / 2
            float r4 = (float) r0
            int r1 = r5.top
            int r0 = r5.bottom
            int r1 = r1 + r0
            int r0 = r1 / 2
            float r0 = (float) r0
            r11.postTranslate(r4, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r5)
            r11.mapRect(r0)
            r10.setMatrix(r11)
        L_0x0296:
            android.graphics.Bitmap r0 = r8.A0B
            r10.drawBitmap(r0, r6, r5, r7)
            goto L_0x0358
        L_0x029d:
            int r11 = r11 * r0
            int r11 = r11 / r4
            r4 = r0
            goto L_0x022d
        L_0x02a1:
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "error-oom"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            r1 = 2131889315(0x7f120ca3, float:1.941329E38)
            java.lang.String r0 = "error_message_id"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r8.setResult(r3, r0)
            goto L_0x0392
        L_0x02be:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x02a1
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != 0) goto L_0x02ca
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x02ca:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r4, r12, r0)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            float r4 = (float) r4
            float r1 = (float) r12
            r0 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r0, r0, r4, r1)
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x0313
            int r0 = r6.width()
            float r1 = (float) r0
            float r0 = r5.width()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r11 = r0 / 2
            int r0 = r6.height()
            float r1 = (float) r0
            float r0 = r5.height()
            float r1 = r1 - r0
            int r0 = (int) r1
            int r4 = r0 / 2
            int r1 = java.lang.Math.max(r3, r11)
            int r0 = java.lang.Math.max(r3, r4)
            r6.inset(r1, r0)
            int r0 = -r11
            int r0 = java.lang.Math.max(r3, r0)
            float r1 = (float) r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r3, r0)
            float r0 = (float) r0
            r5.inset(r1, r0)
        L_0x0313:
            android.graphics.Matrix r0 = r8.A0D
            if (r0 == 0) goto L_0x0353
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0353
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            float r1 = r5.left
            float r0 = r5.right
            float r1 = r1 + r0
            float r4 = -r1
            r12 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r12
            float r1 = r5.top
            float r0 = r5.bottom
            float r1 = r1 + r0
            float r0 = -r1
            float r0 = r0 / r12
            r11.preTranslate(r4, r0)
            android.graphics.Matrix r0 = r8.A0D
            r11.postConcat(r0)
            int r0 = r8.A08
            float r0 = (float) r0
            r11.postRotate(r0)
            float r4 = r5.left
            float r0 = r5.right
            float r4 = r4 + r0
            float r4 = r4 / r12
            float r1 = r5.top
            float r0 = r5.bottom
            float r1 = r1 + r0
            float r1 = r1 / r12
            r11.postTranslate(r4, r1)
            r11.mapRect(r5)
            r10.setMatrix(r11)
        L_0x0353:
            android.graphics.Bitmap r0 = r8.A0B
            r10.drawBitmap(r0, r6, r5, r7)
        L_0x0358:
            android.graphics.Bitmap r0 = r8.A0B
            if (r0 == 0) goto L_0x035f
            r0.recycle()
        L_0x035f:
            if (r9 != 0) goto L_0x0368
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A01()
            r8.setResult(r3, r0)
        L_0x0368:
            X.3Qg r0 = r8.A0M
            if (r0 == 0) goto L_0x001a
            android.graphics.Rect r11 = r0.A02()
            int r0 = r8.A09
            if (r0 <= r2) goto L_0x0377
            com.whatsapp.crop.CropImage.A07(r11, r8)
        L_0x0377:
            android.net.Uri r10 = r8.A0F
            if (r10 != 0) goto L_0x09e0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r11)
            int r1 = r8.A08
            java.lang.String r0 = "rotate"
            r2.putExtra(r0, r1)
            r0 = -1
            r8.setResult(r0, r2)
            r9.recycle()
        L_0x0392:
            r8.finish()
            return
        L_0x0396:
            java.lang.Object r0 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.4T5 r0 = r0.A05
            if (r0 == 0) goto L_0x001a
            r0.BT2()
            return
        L_0x03a2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.4T5 r0 = r0.A05
            if (r0 == 0) goto L_0x001a
            r0.BQe()
            return
        L_0x03ae:
            java.lang.Object r0 = r1.A00
            X.1yM r0 = (X.C42151yM) r0
            X.36n r2 = r0.A00
            r1 = 1
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x001a
            r2.A00 = r1
            X.00s r0 = r2.A01
            r0.A0C(r2)
            return
        L_0x03c1:
            java.lang.Object r2 = r1.A00
            com.whatsapp.documentpicker.DocumentPickerActivity r2 = (com.whatsapp.documentpicker.DocumentPickerActivity) r2
            X.0yE r0 = r2.A0D
            X.2nw r1 = r0.A04()
            X.2nw r0 = X.C51512nw.DENIED
            if (r1 == r0) goto L_0x0a0c
            X.1Cb r1 = r2.A0C
            X.3g8 r0 = new X.3g8
            r0.<init>(r2)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x001a
            com.whatsapp.documentpicker.DocumentPickerActivity.A0x(r2)
            return
        L_0x03e0:
            java.lang.Object r6 = r1.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r6 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r6
            com.whatsapp.WaEditText r0 = r6.A05
            java.lang.String r5 = X.C36361kB.A0n(r0)
            java.lang.String[] r4 = r6.A0K
            r3 = 0
            if (r4 == 0) goto L_0x0a13
            int r2 = r4.length
            r1 = 0
        L_0x03f1:
            if (r1 >= r2) goto L_0x0a13
            r0 = r4[r1]
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0403
            X.4U0 r0 = r6.A09
            if (r0 == 0) goto L_0x001a
            r0.BSF(r5)
            return
        L_0x0403:
            int r1 = r1 + 1
            goto L_0x03f1
        L_0x0406:
            java.lang.Object r3 = r1.A00
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.1LX r1 = r3.A05
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x041a
            java.lang.String r2 = "ephemeral_view_once"
        L_0x0412:
            X.1LY r1 = r1.A00
            r0 = 0
            r1.A00(r2, r0)
            goto L_0x0017
        L_0x041a:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x0412
        L_0x041d:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.content.Intent r0 = X.C36331k8.A04(r0)
            r1.startActivity(r0)
            return
        L_0x042b:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0437:
            java.lang.Object r0 = r1.A00
            com.whatsapp.crop.CropImage r0 = (com.whatsapp.crop.CropImage) r0
            int r1 = r0.A08
            int r1 = r1 + 270
            int r1 = r1 % 360
            r0.A08 = r1
            android.content.Context r6 = r25.getContext()
            X.0yb r5 = r0.A0I
            android.content.Context r4 = r25.getContext()
            int r3 = r0.A08
            r1 = 90
            r2 = 2131893042(0x7f121b32, float:1.942085E38)
            if (r3 == r1) goto L_0x0467
            r1 = 180(0xb4, float:2.52E-43)
            r2 = 2131893040(0x7f121b30, float:1.9420845E38)
            if (r3 == r1) goto L_0x0467
            r1 = 270(0x10e, float:3.78E-43)
            r2 = 2131893041(0x7f121b31, float:1.9420847E38)
            if (r3 == r1) goto L_0x0467
            r2 = 2131893033(0x7f121b29, float:1.9420831E38)
        L_0x0467:
            java.lang.String r1 = r4.getString(r2)
            X.C33521fV.A00(r6, r5, r1)
            r15 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r1 = r1.getImageViewMatrix()
            r1.mapRect(r5)
            android.graphics.Matrix r2 = r0.A0C
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2.postRotate(r1)
            com.whatsapp.crop.CropImageView r4 = r0.A0L
            android.graphics.Bitmap r1 = r0.A0B
            X.3PL r3 = new X.3PL
            r3.<init>(r1)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r1 = r0.A0D
            r2.set(r1)
            android.graphics.Matrix r1 = r0.A0C
            r2.postConcat(r1)
            r3.A01 = r2
            r1 = 0
            r4.A07(r3, r1)
            X.3Qg r3 = r0.A0M
            if (r3 == 0) goto L_0x04c0
            com.whatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r2 = r1.getImageMatrix()
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>(r2)
            r3.A03 = r1
            android.graphics.Rect r1 = X.AnonymousClass3Qg.A00(r3)
            r3.A04 = r1
            android.view.View r1 = r3.A07
            r1.invalidate()
        L_0x04c0:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r1 = r0.A0L
            android.graphics.Matrix r1 = r1.getImageViewMatrix()
            r1.mapRect(r4)
            float r3 = r5.width()
            float r1 = r4.width()
            float r3 = r3 / r1
            float r2 = r5.height()
            float r1 = r4.height()
            float r2 = r2 / r1
            float r5 = java.lang.Math.min(r3, r2)
            X.3Qg r2 = r0.A0M
            if (r2 == 0) goto L_0x04ed
            com.whatsapp.crop.CropImageView r1 = r0.A0L
            r1.A08(r2)
        L_0x04ed:
            r9 = 1
            android.view.animation.AnimationSet r1 = new android.view.animation.AnimationSet
            r1.<init>(r9)
            r14 = 1119092736(0x42b40000, float:90.0)
            r10 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 1
            r19 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.RotateAnimation r13 = new android.view.animation.RotateAnimation
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.addAnimation(r13)
            r1.addAnimation(r4)
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
            com.whatsapp.crop.CropImageView r0 = r0.A0L
            r0.startAnimation(r1)
            return
        L_0x0520:
            java.lang.Object r4 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment) r4
            X.3N9 r1 = r4.A01
            if (r1 == 0) goto L_0x0549
            X.2o6 r3 = r4.A1m()
            X.2o6 r0 = X.C51612o6.BLOCKING_DISCLOSURE
            if (r3 == r0) goto L_0x0545
            X.0yW r2 = r1.A00
            X.2PT r1 = new X.2PT
            r1.<init>()
            int r0 = X.AnonymousClass3N9.A00(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r0 = 1
            X.AnonymousClass2PT.A00(r2, r1, r0)
        L_0x0545:
            r4.A1b()
            return
        L_0x0549:
            java.lang.String r0 = "dataSharingCtwaDisclosureLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0550:
            java.lang.Object r1 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r1
            X.4T5 r0 = r1.A05
            if (r0 == 0) goto L_0x055b
            r0.BT2()
        L_0x055b:
            X.1b3 r3 = r1.A01
            if (r3 == 0) goto L_0x0563
            X.11F r2 = r1.A03
            r1 = 1
            goto L_0x05c3
        L_0x0563:
            java.lang.String r0 = "disclosureLoggingUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x056a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r2 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r2
            X.2o6 r1 = r2.A1m()
            X.2o6 r0 = X.C51612o6.BLOCKING_DISCLOSURE
            if (r1 != r0) goto L_0x058c
            X.1az r1 = r2.A04
            X.11F r0 = r2.A03
            r1.A02(r0)
        L_0x057d:
            X.4T5 r0 = r2.A05
            if (r0 == 0) goto L_0x0584
            r0.BQe()
        L_0x0584:
            X.1b3 r3 = r2.A01
            if (r3 == 0) goto L_0x059b
            X.11F r2 = r2.A03
            r1 = 0
            goto L_0x05c3
        L_0x058c:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x057d
            X.1az r1 = r2.A04
            X.11F r0 = r2.A03
            r1.A02(r0)
            r0 = 1
            r2.A02 = r0
            goto L_0x057d
        L_0x059b:
            java.lang.String r0 = "disclosureLoggingUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05a2:
            java.lang.Object r4 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r4
            X.1Dv r3 = r4.A00
            if (r3 == 0) goto L_0x05e2
            android.content.Context r2 = r4.A0a()
            X.1N3 r1 = r4.A03
            if (r1 == 0) goto L_0x05db
            java.lang.String r0 = "https://faq.whatsapp.com/785493319976156"
            android.net.Uri r1 = r1.A00(r0)
            r0 = 0
            r3.Bp7(r2, r1, r0)
            X.1b3 r3 = r4.A01
            if (r3 == 0) goto L_0x05d4
            X.11F r2 = r4.A03
            r1 = 2
        L_0x05c3:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r9 = 5
            r7 = r4
            r8 = r4
            r6 = r4
            X.C30961b3.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x05d4:
            java.lang.String r0 = "disclosureLoggingUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05db:
            java.lang.String r0 = "waLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05e2:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05e9:
            java.lang.Object r1 = r1.A00
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.15A r0 = r1.A00
            r0.BRT()
            goto L_0x05fc
        L_0x05f3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.15A r0 = r1.A00
            r0.BkD()
        L_0x05fc:
            r1.A1b()
            return
        L_0x0600:
            java.lang.Object r1 = r1.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.C36421kH.A16(r1)
            return
        L_0x060c:
            java.lang.Object r4 = r1.A00
            X.21M r4 = (X.AnonymousClass21M) r4
            X.00s r0 = r4.A02
            java.lang.Object r2 = r0.A04()
            X.C18740tg.A06(r2)
            X.36n r2 = (X.C601136n) r2
            X.3Ol r3 = r4.A06
            X.11F r0 = r4.A0A
            java.lang.String r1 = r0.getRawString()
            X.3Fw r2 = r2.A02
            java.lang.String r0 = r2.A01
            boolean r0 = X.C36421kH.A1a(r0)
            r3.A01(r1, r0)
            X.31X r0 = r4.A07
            X.28U r1 = r4.A01
            X.3HK r0 = r0.A00
            X.3CT r0 = r0.A07
            r0.A00(r1, r2)
            r4.dismiss()
            return
        L_0x063d:
            java.lang.Object r0 = r1.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0i()
            r0.finish()
            return
        L_0x0649:
            java.lang.Object r0 = r1.A00
            com.whatsapp.dmsetting.ChangeDMSettingActivity r0 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x0651:
            java.lang.Object r4 = r1.A00
            com.whatsapp.dmsetting.DisappearingMessagesSettingActivity r4 = (com.whatsapp.dmsetting.DisappearingMessagesSettingActivity) r4
            r9 = 0
            X.18x r0 = r4.A04
            X.AnonymousClass00C.A0B(r0)
            java.lang.Integer r3 = r0.A04()
            X.AnonymousClass00C.A08(r3)
            int r8 = r3.intValue()
            X.3GX r5 = r4.A05
            if (r5 == 0) goto L_0x0691
            int r11 = r4.A00
            r7 = 1
            r6 = 0
            r10 = 0
            r5.A01(r6, r7, r8, r9, r10, r11)
            X.3OM r2 = new X.3OM
            r2.<init>(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r2.A0G = r1
            r2.A0L = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0a = r0
            r2.A0E = r1
            r2.A0P = r3
            android.content.Intent r0 = X.AnonymousClass3OM.A00(r2)
            r4.startActivityForResult(r0, r7)
            return
        L_0x0691:
            java.lang.String r0 = "ephemeralSettingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0698:
            java.lang.Object r2 = r1.A00
            com.whatsapp.dmsetting.DisappearingMessagesSettingActivity r2 = (com.whatsapp.dmsetting.DisappearingMessagesSettingActivity) r2
            int r0 = r2.A00
            android.content.Intent r1 = X.C36431kI.A0D()
            X.AnonymousClass190.A1T(r2, r1, r0)
            r0 = 100
            r2.startActivityForResult(r1, r0)
            return
        L_0x06ab:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x06b3:
            java.lang.Object r3 = r1.A00
            X.14u r3 = (X.C225314u) r3
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            android.content.Intent r2 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r2.addCategory(r0)
            java.lang.String r0 = "*/*"
            r2.setType(r0)
            java.lang.String r1 = "android.intent.extra.ALLOW_MULTIPLE"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.BuO(r2, r0)
            return
        L_0x06d1:
            java.lang.Object r4 = r1.A00
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            r3 = 0
            r1 = 5
            r0 = 1
            com.whatsapp.email.EmailVerificationActivity.A0F(r4, r1, r0)
            X.1Dv r2 = r4.A01
            X.190 r0 = r4.A05
            if (r0 == 0) goto L_0x06ed
            int r1 = r4.A00
            java.lang.String r0 = r4.A08
            android.content.Intent r0 = X.AnonymousClass190.A17(r4, r0, r3, r1)
            r2.A06(r4, r0)
            return
        L_0x06ed:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x06f2:
            java.lang.Object r4 = r1.A00
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            r1 = 7
            r0 = 10
            com.whatsapp.email.EmailVerificationActivity.A0F(r4, r1, r0)
            X.1Dv r3 = r4.A01
            X.190 r0 = r4.A05
            if (r0 == 0) goto L_0x0712
            int r2 = r4.A00
            java.lang.String r1 = r4.A08
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A17(r4, r1, r0, r2)
            r3.A06(r4, r0)
            r4.finish()
            return
        L_0x0712:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0717:
            java.lang.Object r1 = r1.A00
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            com.whatsapp.WaEditText r0 = r1.A02
            if (r0 != 0) goto L_0x0726
            java.lang.String r0 = "emailInput"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0726:
            java.lang.String r0 = X.C36421kH.A0Z(r0)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            com.whatsapp.email.UpdateEmailActivity.A0F(r1, r0)
            return
        L_0x0732:
            java.lang.Object r1 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r1 = (com.whatsapp.email.VerifyEmailActivity) r1
            com.whatsapp.CodeInputField r0 = r1.A02
            if (r0 != 0) goto L_0x0741
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0741:
            java.lang.String r0 = r0.getCode()
            X.AnonymousClass00C.A08(r0)
            com.whatsapp.email.VerifyEmailActivity.A0H(r1, r0)
            return
        L_0x074c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r0 = (com.whatsapp.email.VerifyEmailActivity) r0
            com.whatsapp.email.VerifyEmailActivity.A01(r0)
            return
        L_0x0754:
            java.lang.Object r2 = r1.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r2 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r2
            X.4U0 r1 = r2.A09
            if (r1 == 0) goto L_0x0761
            int r0 = r2.A00
            r1.BT1(r0)
        L_0x0761:
            r2.A1b()
            return
        L_0x0765:
            java.lang.Object r2 = r1.A00
            X.227 r2 = (X.AnonymousClass227) r2
            boolean r0 = r2 instanceof X.AnonymousClass2M7
            if (r0 == 0) goto L_0x078b
            r2.dismiss()
            return
        L_0x0771:
            java.lang.Object r2 = r1.A00
            X.227 r2 = (X.AnonymousClass227) r2
            com.whatsapp.WaEditText r0 = r2.A03
            java.lang.String r4 = X.C36331k8.A0f(r0)
            int r0 = r4.length()
            r10 = 0
            if (r0 > 0) goto L_0x0793
            int r1 = r2.A09
            if (r1 == 0) goto L_0x0793
            X.17Y r0 = r2.A0C
            r0.A06(r1, r10)
        L_0x078b:
            android.app.Activity r1 = r2.A00
            int r0 = r2.A08
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0793:
            X.4QS r1 = r2.A0D
            X.3R5 r1 = (X.AnonymousClass3R5) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0830;
                case 1: goto L_0x0828;
                case 2: goto L_0x0820;
                case 3: goto L_0x0819;
                case 4: goto L_0x0811;
                default: goto L_0x079c;
            }
        L_0x079c:
            java.lang.Object r3 = r1.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            r7 = 0
            java.lang.String r1 = X.C36371kC.A0y(r4)
            if (r1 == 0) goto L_0x07ae
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 != 0) goto L_0x07ae
            r7 = r1
        L_0x07ae:
            X.2La r0 = r3.A3t()
            java.lang.String r0 = r0.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 != 0) goto L_0x086f
            java.lang.String r6 = "descriptionTextView"
            r4 = 0
            if (r7 == 0) goto L_0x07f4
            X.0yb r5 = r3.A08
            X.0wg r4 = r3.A0y
            if (r4 == 0) goto L_0x0879
            com.whatsapp.text.ReadMoreTextView r0 = r3.A12
            if (r0 != 0) goto L_0x07ce
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x07ce:
            android.text.TextPaint r1 = r0.getPaint()
            X.1H2 r0 = r3.A0C
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A03(r3, r1, r0, r7)
            java.lang.CharSequence r0 = X.AnonymousClass6YV.A08(r5, r4, r0)
            android.text.SpannableStringBuilder r4 = X.C36441kJ.A0P(r0)
            X.1e1 r1 = r3.A13
            if (r1 == 0) goto L_0x0874
            com.whatsapp.text.ReadMoreTextView r0 = r3.A12
            if (r0 != 0) goto L_0x07ed
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x07ed:
            android.content.Context r0 = r0.getContext()
            r1.A04(r0, r4)
        L_0x07f4:
            com.whatsapp.text.ReadMoreTextView r0 = r3.A12
            if (r0 != 0) goto L_0x07fd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x07fd:
            r0.A0I(r4)
            r9 = 1
            X.4a9 r5 = new X.4a9
            r5.<init>(r3, r9)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r3.A0v
            if (r0 != 0) goto L_0x0861
            java.lang.String r0 = "newsletterViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0811:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1F(r0, r4)
            goto L_0x086f
        L_0x0819:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            X.3Ka r0 = r0.A1I
            goto L_0x0824
        L_0x0820:
            java.lang.Object r0 = r1.A00
            X.3Ka r0 = (X.C63433Ka) r0
        L_0x0824:
            r0.A00(r4)
            goto L_0x086f
        L_0x0828:
            java.lang.Object r0 = r1.A00
            X.244 r0 = (X.AnonymousClass244) r0
            r0.setNewDescription(r4)
            goto L_0x086f
        L_0x0830:
            java.lang.Object r3 = r1.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r3 = (com.whatsapp.chatinfo.ListChatInfoActivity) r3
            X.171 r1 = r3.A0B
            X.141 r0 = r3.A0K
            java.lang.String r0 = r1.A0H(r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x086f
            X.141 r1 = r3.A0K
            r1.A0P = r4
            X.16D r0 = r3.A0G
            r0.A0S(r1)
            X.1LW r1 = r3.A0H
            X.8dx r0 = r3.A3t()
            r1.A02(r0, r4)
            com.whatsapp.chatinfo.ListChatInfoActivity.A11(r3)
            X.1Cf r1 = r3.A0K
            X.8dx r0 = r3.A3t()
            r1.A02(r0)
            goto L_0x086f
        L_0x0861:
            X.1Uw r4 = X.AnonymousClass22g.A0F(r3)
            X.AnonymousClass00C.A0D(r4, r10)
            X.1Zi r3 = r0.A04
            r6 = 0
            r8 = r6
            r3.A0C(r4, r5, r6, r7, r8, r9, r10)
        L_0x086f:
            r2.dismiss()
            goto L_0x078b
        L_0x0874:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0879:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0880:
            java.lang.Object r3 = r1.A00
            X.22t r3 = (X.AnonymousClass22t) r3
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x0890
            com.whatsapp.WaEditText r0 = r3.A0L
            r3.A0B(r0)
            return
        L_0x0890:
            X.3J6 r0 = r3.A0C
            if (r0 == 0) goto L_0x08a0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x08a0
            X.3J6 r0 = r3.A0C
            r0.A03()
            return
        L_0x08a0:
            java.lang.Runnable r0 = r3.A0F
            if (r0 == 0) goto L_0x08a7
            r0.run()
        L_0x08a7:
            X.3Nh r2 = r3.A0D
            if (r2 == 0) goto L_0x08bd
            r0 = 5
            X.C64263Nh.A00(r2, r0)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x08bd
            X.2Ms r1 = new X.2Ms
            r1.<init>()
            X.0yW r0 = r2.A00
            r0.Bly(r1)
        L_0x08bd:
            r3.A0E()
            return
        L_0x08c1:
            java.lang.Object r2 = r1.A00
            X.1qK r2 = (X.C38851qK) r2
            int[][] r1 = r2.A04
            java.lang.Object r0 = r25.getTag()
            int r0 = X.AnonymousClass000.A0I(r0)
            r1 = r1[r0]
            X.4QU r0 = r2.A03
            if (r0 == 0) goto L_0x08d8
            r0.Bgo(r1)
        L_0x08d8:
            r2.dismiss()
            return
        L_0x08dc:
            java.lang.Object r0 = r1.A00
            X.1zE r0 = (X.C42691zE) r0
            X.4QX r2 = r0.A05
            X.1XQ r1 = r0.A01
            int r0 = r0.A00
            r2.BWP(r1, r0)
            return
        L_0x08ea:
            java.lang.Object r0 = r1.A00
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r0 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x08f2:
            java.lang.Object r2 = r1.A00
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r2 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r2
            X.11F r0 = r2.A0I
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            int r1 = X.C36431kI.A01(r0)
            android.content.Intent r0 = X.C36431kI.A0D()
            X.AnonymousClass190.A1T(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x0909:
            java.lang.Object r0 = r1.A00
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r0 = (com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r0
            com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A05(r0)
            return
        L_0x0911:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x0919:
            java.lang.Object r3 = r1.A00
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.0xT r2 = r3.A06
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r2 = X.C36381kD.A0F(r0)
            X.1Dv r1 = r3.A01
            android.content.Context r0 = r25.getContext()
            r1.A06(r0, r2)
            X.1LX r1 = r3.A05
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x094a
            java.lang.String r2 = "ephemeral_view_once"
        L_0x093c:
            X.1LY r1 = r1.A00
            r0 = 0
            r1.A00(r2, r0)
            r3.A1c()
            r0 = 1
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A05(r3, r0)
            return
        L_0x094a:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x093c
        L_0x094d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.0xT r2 = r3.A04
            java.lang.String r1 = "chats"
            java.lang.String r0 = "about-view-once"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r2 = X.C36381kD.A0F(r0)
            X.1Dv r1 = r3.A00
            android.content.Context r0 = r25.getContext()
            r1.A06(r0, r2)
            X.0v0 r0 = r3.A01
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C36331k8.A0w(r2, r1, r0)
            r3.A1c()
            com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet.A05(r3, r0)
            return
        L_0x097b:
            java.lang.Object r1 = r1.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.show()
            return
        L_0x0987:
            java.lang.Object r0 = r1.A00
            com.whatsapp.events.EventCreateOrEditFragment r0 = (com.whatsapp.events.EventCreateOrEditFragment) r0
            X.1us r1 = r0.A0H
            r0 = 0
            if (r1 != 0) goto L_0x0997
            java.lang.String r0 = "eventCreateOrEditViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0997:
            r1.A0T(r0)
            return
        L_0x099b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.events.EventCreateOrEditFragment r4 = (com.whatsapp.events.EventCreateOrEditFragment) r4
            r3 = 2131896550(0x7f1228e6, float:1.9427964E38)
            X.1us r0 = r4.A0H
            if (r0 != 0) goto L_0x09ad
            java.lang.String r0 = "eventCreateOrEditViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09ad:
            X.05K r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.2nU r1 = r0.A01
            X.2nU r0 = X.C51232nU.WA_VIDEO_CALL
            r2 = 1
            if (r1 != r0) goto L_0x09bd
            r2 = 0
        L_0x09bd:
            r1 = 2130903053(0x7f03000d, float:1.7412913E38)
            r0 = 5
            com.whatsapp.SingleSelectionDialogFragment r2 = com.whatsapp.SingleSelectionDialogFragment.A06(r0, r3, r2, r1)
            X.01z r1 = r4.A0k()
            java.lang.String r0 = "CALL_TYPE_SELECTION"
            X.C36381kD.A1F(r2, r1, r0)
            return
        L_0x09cf:
            r1 = move-exception
            r0 = r16
            com.whatsapp.util.Log.e(r0, r1)
            android.content.Intent r0 = com.whatsapp.crop.CropImage.A01()
            r8.setResult(r3, r0)
            r8.finish()
            return
        L_0x09e0:
            X.0wU r7 = r8.A04
            X.0wx r6 = r8.A0K
            X.0yb r5 = r8.A0I
            android.graphics.Bitmap$CompressFormat r4 = r8.A0A
            int r3 = r8.A04
            boolean r2 = r8.A0U
            int r1 = r8.A02
            int r0 = r8.A08
            X.2jg r12 = new X.2jg
            r13 = r8
            r14 = r4
            r15 = r9
            r16 = r11
            r17 = r10
            r18 = r5
            r19 = r6
            r20 = r3
            r21 = r1
            r22 = r0
            r23 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.C36391kE.A1Q(r12, r7)
            return
        L_0x0a0c:
            r1 = 2
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0D(r2, r1)
            return
        L_0x0a13:
            java.lang.String r2 = r5.trim()
            int r0 = r2.length()
            if (r0 > 0) goto L_0x0a27
            int r1 = r6.A01
            if (r1 == 0) goto L_0x0a27
            X.17Y r0 = r6.A04
            r0.A06(r1, r3)
            return
        L_0x0a27:
            X.4U0 r1 = r6.A09
            if (r1 == 0) goto L_0x0a30
            int r0 = r6.A00
            r1.BWL(r0, r2)
        L_0x0a30:
            r6.A1b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y0.onClick(android.view.View):void");
    }
}
