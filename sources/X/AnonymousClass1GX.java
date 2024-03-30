package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1GX  reason: invalid class name */
public class AnonymousClass1GX extends AnonymousClass1GW {
    public final C20690y0 A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C24051Aw A03;
    public final C19700wN A04;
    public final AnonymousClass17Y A05;
    public final C18820ts A06;
    public final C20060wx A07;
    public final C20810yC A08;
    public final WebpUtils A09;
    public final C19770wU A0A;

    public static boolean A0a(AnonymousClass1DT r14, C121555tK r15, File file, File file2, OutputStream outputStream, String str, byte[] bArr, int i, int i2, int i3, long j) {
        AnonymousClass5RH r8;
        int i4 = i2;
        long j2 = j;
        try {
            FileInputStream A0J = AnonymousClass1GW.A0J(file);
            try {
                r8 = new AnonymousClass5RH(outputStream, i4);
                new C1261162p(r15, bArr, j2).A00(A0J, r8, 0, 0, (long) i);
                r8.close();
                A0J.close();
                return true;
            } catch (Throwable th) {
                A0J.close();
                throw th;
            }
            throw th;
        } catch (AnonymousClass1GY e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateProgressiveThumbnail failed  tomatch hash for progressive jpeg thumbnail; mediaHash=");
            sb.append(str);
            Log.e(sb.toString(), e);
            r14.A0U(0L, new int[]{i2}, i3, j2, false);
            file2.delete();
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0d(java.io.File r12, int r13, int r14, boolean r15) {
        /*
            r2 = 0
            r4 = 0
            X.C21656ATx.A04(r12)     // Catch:{ IOException -> 0x0007 }
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x0013
            android.graphics.Bitmap r2 = X.C21656ATx.A00(r12)     // Catch:{ IOException | IllegalArgumentException -> 0x000f, Exception -> 0x0024 }
            goto L_0x002a
        L_0x000f:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x0027
        L_0x0013:
            r8 = 0
            r10 = 1
            X.6vW r3 = new X.6vW
            r3.<init>(r12)
            r5 = 0
            r7 = 0
            r11 = 0
            r6 = r14
            android.graphics.Bitmap r2 = X.C25541Gs.A00(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x0027:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            if (r2 == 0) goto L_0x0032
            byte[] r0 = X.AnonymousClass6IR.A00(r2, r13, r15, r4)
            if (r0 != 0) goto L_0x0036
        L_0x0032:
            byte[] r0 = X.C25541Gs.A04(r12)
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GX.A0d(java.io.File, int, int, boolean):byte[]");
    }

    @Deprecated
    public Bitmap A0e(Uri uri, int i, int i2) {
        return A0f(uri, i, i2, true, true);
    }

    public static long A02(File file) {
        C37001le r2;
        try {
            r2 = new C37001le();
            r2.setDataSource(file.getAbsolutePath());
            long parseInt = (long) Integer.parseInt(r2.extractMetadata(20));
            r2.close();
            return parseInt;
        } catch (Exception unused) {
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0W(android.net.Uri.Builder r3, android.net.Uri r4, int r5) {
        /*
            java.lang.String r2 = "rotation"
            java.lang.String r0 = r4.getQueryParameter(r2)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r4.getQueryParameter(r2)     // Catch:{ NumberFormatException -> 0x0011 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x0018
        L_0x0011:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/combineRotation/invalid rotation (ignored)"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0017:
            r0 = 0
        L_0x0018:
            int r0 = r0 + r5
            int r0 = r0 % 360
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.appendQueryParameter(r2, r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GX.A0W(android.net.Uri$Builder, android.net.Uri, int):void");
    }

    public static void A0X(Uri.Builder builder, AnonymousClass6QO r4) {
        Uri uri = r4.A0J;
        A0W(builder, uri, r4.A02());
        if (uri.getQueryParameter("flip-h") != null) {
            builder.appendQueryParameter("flip-h", uri.getQueryParameter("flip-h"));
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0Z(X.C20690y0 r11, X.AnonymousClass1DT r12, X.C121555tK r13, X.C25471Gl r14, com.whatsapp.stickers.WebpUtils r15, java.io.File r16, java.lang.String r17, java.lang.String r18, byte[] r19, int r20, int r21, long r22) {
        /*
            r10 = r21
            if (r21 <= 0) goto L_0x00c6
            r8 = r19
            if (r19 == 0) goto L_0x00c6
            boolean r0 = X.AnonymousClass6Y1.A07(r14)
            r2 = r12
            r3 = r13
            r4 = r16
            r7 = r17
            r1 = r18
            r9 = r20
            r12 = r22
            if (r0 == 0) goto L_0x0059
            java.io.File r5 = r11.A0c(r7, r1)
            if (r5 == 0) goto L_0x00c6
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00c6
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00b1 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x00b1 }
            r11 = 16
            boolean r0 = A0a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004b
            byte[] r1 = r6.toByteArray()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x004f }
            r15.A03(r0, r1, r10)     // Catch:{ all -> 0x004f }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004b
            r5.length()     // Catch:{ all -> 0x004f }
            r6.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x0082
        L_0x004b:
            r6.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00c6
        L_0x004f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00b1 }
        L_0x0058:
            throw r1     // Catch:{ IOException -> 0x00b1 }
        L_0x0059:
            java.io.File r5 = r11.A0b(r7, r1)
            if (r5 == 0) goto L_0x00c6
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x00c6
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
            r11 = 2
            boolean r0 = A0a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0084
            byte[] r0 = X.AnonymousClass1GW.A02     // Catch:{ all -> 0x0088 }
            r6.write(r0)     // Catch:{ all -> 0x0088 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0084
            r5.length()     // Catch:{ all -> 0x0088 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
        L_0x0082:
            r0 = 1
            return r0
        L_0x0084:
            r6.close()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
            goto L_0x00c6
        L_0x0088:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
        L_0x0091:
            throw r1     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x009b }
        L_0x0092:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateProgressiveThumbnail failed could not find file progressive jpeg thumbnail; mediaHash="
            goto L_0x00a3
        L_0x009b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateProgressiveThumbnail failed;mediaHash="
        L_0x00a3:
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x00c6
        L_0x00b1:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CreateStickerThumbnail failed; mediaHash="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00c6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GX.A0Z(X.0y0, X.1DT, X.5tK, X.1Gl, com.whatsapp.stickers.WebpUtils, java.io.File, java.lang.String, java.lang.String, byte[], int, int, long):boolean");
    }

    public static boolean A0b(String str) {
        if (str.startsWith("video/") || str.startsWith("image/") || str.startsWith("audio/")) {
            return true;
        }
        return false;
    }

    public static boolean A0c(String str) {
        if ("video/mp4".equals(str) || "video/x.looping_mp4".equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0286, code lost:
        throw new java.io.IOException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0287, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0288, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("mediafileutils/getfilefrommediastore/unable to open stream; uri=");
        r1.append(r7);
        com.whatsapp.util.Log.w(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a1, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0254 A[SYNTHETIC, Splitter:B:104:0x0254] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0280 A[ExcHandler: SQLiteException | FileNotFoundException | NullPointerException (r0v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0287 A[ExcHandler: IllegalStateException | SecurityException | UnsupportedOperationException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015e A[ADDED_TO_REGION, Catch:{ all -> 0x0276 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0161 A[Catch:{ all -> 0x0276 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022a A[Catch:{ all -> 0x025b, all -> 0x0260, all -> 0x0265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0230 A[Catch:{ all -> 0x025b, all -> 0x0260, all -> 0x0265 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0231 A[Catch:{ all -> 0x025b, all -> 0x0260, all -> 0x0265 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0h(android.net.Uri r27) {
        /*
            r26 = this;
            r6 = r26
            X.1Aw r3 = r6.A03
            r7 = r27
            r3.A02(r7)
            X.0yb r2 = r6.A01
            X.0ya r0 = r2.A0O()
            if (r0 == 0) goto L_0x02a2
            java.lang.String r1 = "mediafileutils/getfilefrommediastore"
            X.14g r8 = new X.14g
            r8.<init>((java.lang.String) r1)
            java.lang.String r1 = r7.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00e2
            android.net.Uri$Builder r4 = r7.buildUpon()
            java.lang.String r1 = "file"
            android.net.Uri$Builder r1 = r4.scheme(r1)
            android.net.Uri r1 = r1.build()
        L_0x0030:
            java.io.File r4 = X.AnonymousClass6YY.A03(r1)
            if (r4 == 0) goto L_0x0054
            r1 = 0
            android.util.Pair r1 = android.util.Pair.create(r4, r1)
        L_0x003b:
            java.lang.Object r5 = r1.first
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            if (r5 == 0) goto L_0x00e5
            X.0y0 r1 = r6.A00
            boolean r1 = r1.A0i(r5)
            if (r1 == 0) goto L_0x00e5
            boolean r1 = r5.exists()
            if (r1 == 0) goto L_0x00e5
            return r5
        L_0x0054:
            java.lang.String r10 = "_data"
            java.lang.String r4 = r7.getAuthority()
            java.lang.String r1 = "media"
            boolean r1 = r1.equals(r4)
            r9 = 0
            if (r1 != 0) goto L_0x006a
            java.lang.String r1 = "not_media_store"
            android.util.Pair r1 = android.util.Pair.create(r9, r1)
            goto L_0x003b
        L_0x006a:
            java.lang.String[] r13 = new java.lang.String[]{r10}     // Catch:{ Exception -> 0x00c2 }
            r15 = r9
            r16 = r9
            r14 = r9
            r11 = r0
            r12 = r7
            android.database.Cursor r5 = r11.A03(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00c2 }
            if (r5 != 0) goto L_0x0081
            java.lang.String r1 = "no_cursor"
            android.util.Pair r1 = android.util.Pair.create(r9, r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x003b
        L_0x0081:
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = "empty_cursor"
            android.util.Pair r1 = android.util.Pair.create(r9, r1)     // Catch:{ all -> 0x00b6 }
            r5.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x003b
        L_0x0091:
            int r1 = r5.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = r5.getString(r1)     // Catch:{ all -> 0x00b6 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = "empty"
            android.util.Pair r1 = android.util.Pair.create(r9, r1)     // Catch:{ all -> 0x00b6 }
            r5.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x003b
        L_0x00a9:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00b6 }
            r1.<init>(r4)     // Catch:{ all -> 0x00b6 }
            android.util.Pair r1 = android.util.Pair.create(r1, r9)     // Catch:{ all -> 0x00b6 }
            r5.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x003b
        L_0x00b6:
            r4 = move-exception
            if (r5 == 0) goto L_0x00c1
            r5.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c1:
            throw r4     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            r5 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "e="
            r4.append(r1)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Pair r1 = android.util.Pair.create(r9, r1)
            goto L_0x003b
        L_0x00e2:
            r1 = r7
            goto L_0x0030
        L_0x00e5:
            java.lang.String r1 = "file searched"
            long r18 = r8.A02(r1)
            if (r5 == 0) goto L_0x00ff
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r21 = android.os.ParcelFileDescriptor.open(r5, r1)     // Catch:{ Exception -> 0x00ff }
            r22 = 0
            long r24 = r21.getStatSize()     // Catch:{ Exception -> 0x00ff }
            android.content.res.AssetFileDescriptor r20 = new android.content.res.AssetFileDescriptor     // Catch:{ Exception -> 0x00ff }
            r20.<init>(r21, r22, r24)     // Catch:{ Exception -> 0x00ff }
            goto L_0x012d
        L_0x00ff:
            java.lang.String r11 = "r"
            android.content.ContentResolver r10 = X.C21050ya.A00(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            X.0yZ r9 = r0.A01     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            X.2oR r1 = X.C51822oR.FILE     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            java.lang.String r0 = r7.getAuthority()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            r9.A00(r1, r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            android.content.res.AssetFileDescriptor r20 = r10.openAssetFileDescriptor(r7, r11)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            if (r20 != 0) goto L_0x012d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            r1.<init>()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/unable to open fd; uri="
            r1.append(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            r1.append(r7)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            throw r0     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
        L_0x012d:
            java.lang.String r0 = "opened"
            long r16 = r8.A02(r0)     // Catch:{ all -> 0x0276 }
            long r0 = r20.getLength()     // Catch:{ all -> 0x0276 }
            android.os.ParcelFileDescriptor r9 = r20.getParcelFileDescriptor()     // Catch:{ all -> 0x0276 }
            r3.A03(r9)     // Catch:{ all -> 0x0276 }
            java.lang.String r9 = "gif"
            if (r5 == 0) goto L_0x0150
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ all -> 0x0276 }
            java.lang.String r3 = X.AnonymousClass6YY.A07(r3)     // Catch:{ all -> 0x0276 }
            boolean r3 = r3.equalsIgnoreCase(r9)     // Catch:{ all -> 0x0276 }
            if (r3 != 0) goto L_0x0161
        L_0x0150:
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0276 }
            java.lang.String r3 = X.AnonymousClass6YY.A07(r3)     // Catch:{ all -> 0x0276 }
            boolean r3 = r3.equalsIgnoreCase(r9)     // Catch:{ all -> 0x0276 }
            if (r3 != 0) goto L_0x0161
            if (r5 == 0) goto L_0x016e
            goto L_0x0164
        L_0x0161:
            java.lang.String r9 = ".gif"
            goto L_0x0199
        L_0x0164:
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ all -> 0x0276 }
            java.lang.String r9 = X.AnonymousClass6YY.A07(r3)     // Catch:{ all -> 0x0276 }
            if (r9 != 0) goto L_0x017a
        L_0x016e:
            X.0ya r2 = r2.A0O()     // Catch:{ all -> 0x0276 }
            java.lang.String r2 = X.AnonymousClass1GW.A0M(r7, r2)     // Catch:{ all -> 0x0276 }
            java.lang.String r9 = X.AnonymousClass1Ax.A02(r2)     // Catch:{ all -> 0x0276 }
        L_0x017a:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0276 }
            if (r2 != 0) goto L_0x01b5
            java.lang.String r2 = "zip"
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0276 }
            if (r2 == 0) goto L_0x01b5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0276 }
            r3.<init>()     // Catch:{ all -> 0x0276 }
            java.lang.String r2 = "."
            r3.append(r2)     // Catch:{ all -> 0x0276 }
            r3.append(r9)     // Catch:{ all -> 0x0276 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0276 }
        L_0x0199:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0276 }
            r3.<init>()     // Catch:{ all -> 0x0276 }
            java.lang.String r2 = X.AnonymousClass1GW.A0K()     // Catch:{ all -> 0x0276 }
            r3.append(r2)     // Catch:{ all -> 0x0276 }
            r3.append(r9)     // Catch:{ all -> 0x0276 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0276 }
            long r2 = r20.getLength()     // Catch:{ all -> 0x0276 }
            java.io.File r11 = r6.A0i(r9, r2)     // Catch:{ all -> 0x0276 }
            goto L_0x01b8
        L_0x01b5:
            java.lang.String r9 = ""
            goto L_0x0199
        L_0x01b8:
            java.io.FileInputStream r10 = r20.createInputStream()     // Catch:{ IOException -> 0x0271 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0265 }
            r9.<init>(r11)     // Catch:{ all -> 0x0265 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r3.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r2 = "copy/start; size="
            r3.append(r2)     // Catch:{ all -> 0x025b }
            r3.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x025b }
            long r12 = r8.A02(r2)     // Catch:{ all -> 0x025b }
            X.AnonymousClass6YY.A0J(r10, r9)     // Catch:{ all -> 0x025b }
            java.lang.String r2 = "copy/end"
            long r2 = r8.A02(r2)     // Catch:{ all -> 0x025b }
            r14 = 10000000(0x989680, double:4.9406565E-317)
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x024f
            r14 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x024f
            X.0wN r15 = r6.A04     // Catch:{ all -> 0x025b }
            java.lang.String r8 = "mediafileutils/getfilefrommediastore/slow"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r6.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r14 = "size="
            r6.append(r14)     // Catch:{ all -> 0x025b }
            r6.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; find="
            r6.append(r0)     // Catch:{ all -> 0x025b }
            r0 = r18
            r6.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; open="
            r6.append(r0)     // Catch:{ all -> 0x025b }
            r0 = r16
            r6.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; copyStart="
            r6.append(r0)     // Catch:{ all -> 0x025b }
            r6.append(r12)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; copyEnd="
            r6.append(r0)     // Catch:{ all -> 0x025b }
            r6.append(r2)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; found="
            r6.append(r0)     // Catch:{ all -> 0x025b }
            r2 = 0
            r0 = 0
            if (r5 == 0) goto L_0x022b
            r0 = 1
        L_0x022b:
            r6.append(r0)     // Catch:{ all -> 0x025b }
            if (r4 == 0) goto L_0x0231
            goto L_0x0234
        L_0x0231:
            java.lang.String r0 = ""
            goto L_0x0245
        L_0x0234:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
            r1.<init>()     // Catch:{ all -> 0x025b }
            java.lang.String r0 = "; reason="
            r1.append(r0)     // Catch:{ all -> 0x025b }
            r1.append(r4)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x025b }
        L_0x0245:
            r6.append(r0)     // Catch:{ all -> 0x025b }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x025b }
            r15.A0E(r8, r0, r2)     // Catch:{ all -> 0x025b }
        L_0x024f:
            r9.close()     // Catch:{ all -> 0x0265 }
            if (r10 == 0) goto L_0x0257
            r10.close()     // Catch:{ IOException -> 0x0271 }
        L_0x0257:
            r20.close()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
            return r11
        L_0x025b:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0260 }
            goto L_0x0264
        L_0x0260:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0265 }
        L_0x0264:
            throw r1     // Catch:{ all -> 0x0265 }
        L_0x0265:
            r1 = move-exception
            if (r10 == 0) goto L_0x0270
            r10.close()     // Catch:{ all -> 0x026c }
            goto L_0x0270
        L_0x026c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0271 }
        L_0x0270:
            throw r1     // Catch:{ IOException -> 0x0271 }
        L_0x0271:
            r0 = move-exception
            X.AnonymousClass6YY.A0P(r11)     // Catch:{ all -> 0x0276 }
            throw r0     // Catch:{ all -> 0x0276 }
        L_0x0276:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x027b }
            goto L_0x027f
        L_0x027b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
        L_0x027f:
            throw r1     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0287, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280, SQLiteException | FileNotFoundException | NullPointerException -> 0x0280 }
        L_0x0280:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0287:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/unable to open stream; uri="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r2)
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L_0x02a2:
            java.lang.String r0 = "mediafileutils/getfilefrommediastore/no content resolver"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GX.A0h(android.net.Uri):java.io.File");
    }

    public File A0i(String str, long j) {
        long A022 = this.A07.A02();
        if (j >= 0 && A022 - j > 104857600) {
            return this.A00.A0Y(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mediafileutils/getsharedfileforsize/returning external file; size=");
        sb.append(j);
        sb.append("; internalAvailable=");
        sb.append(A022);
        Log.w(sb.toString());
        return C20690y0.A02(this.A00.A0E(), str);
    }

    public void A0j(Uri uri, C225014r r10, AnonymousClass4SG r11) {
        this.A0A.Box(new C49942jw(uri, r10, this.A05, this.A06, r11, this), new Void[0]);
    }

    public void A0l(File file) {
        if (file != null) {
            try {
                if (this.A00.A0i(file)) {
                    AnonymousClass6YY.A0P(file);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/unable to delete file ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
    }

    public AnonymousClass1GX(C19700wN r3, C20690y0 r4, AnonymousClass17Y r5, C21060yb r6, C19630wG r7, C18820ts r8, C20060wx r9, C20810yC r10, WebpUtils webpUtils, C24051Aw r12, C19770wU r13) {
        this.A08 = r10;
        this.A02 = r7;
        this.A05 = r5;
        this.A04 = r3;
        this.A0A = r13;
        this.A09 = webpUtils;
        this.A00 = r4;
        this.A07 = r9;
        this.A01 = r6;
        this.A06 = r8;
        this.A03 = r12;
        r12.A02.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public static int A01(AnonymousClass2bU r3, AnonymousClass1CR r4) {
        int i;
        C25471Gl A022 = AnonymousClass6Y1.A02(r3);
        C64933Qa r2 = r3.A1J;
        boolean z = r2.A02;
        if (!AnonymousClass6Y1.A07(A022)) {
            if (z) {
                return 3;
            }
            AnonymousClass11F r22 = r2.A00;
            C18740tg.A06(r22);
            C220412q r1 = r4.A0A;
            AnonymousClass16D r0 = r4.A05;
            if ((r22 == null || AnonymousClass3TD.A00(r0, r1, r22) <= 0) && !r1.A0Q(r22) && !AnonymousClass3M3.A01(r4.A0D, r22) && (((i = AnonymousClass1CR.A02(r4, r22.getRawString()).A03) == 0 && (i = r4.A0R().A03) == 0) || i == 2)) {
                return 1;
            }
        }
        return 2;
    }

    public static Bitmap A0T(BitmapFactory.Options options, Uri uri, AnonymousClass1GX r3, boolean z) {
        InputStream A0V = A0V(uri, r3, z);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(A0V, (Rect) null, options);
            if (decodeStream == null || decodeStream.getWidth() == 0 || decodeStream.getHeight() == 0) {
                throw new AnonymousClass1X5();
            }
            A0V.close();
            return decodeStream;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static Uri A0U(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        ArrayList arrayList = new ArrayList(uri.getQueryParameterNames());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("rotation") || str.equals("flip-h") || str.equals("flip-v")) {
                buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return buildUpon.build();
    }

    public static InputStream A0V(Uri uri, AnonymousClass1GX r4, boolean z) {
        InputStream A062;
        Uri build = uri.buildUpon().query((String) null).build();
        File A032 = AnonymousClass6YY.A03(build);
        if (A032 != null) {
            A062 = new FileInputStream(A032);
        } else {
            C21050ya A0O = r4.A01.A0O();
            if (A0O != null) {
                A062 = A0O.A06(build);
                if (A062 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((A062 instanceof FileInputStream) && z) {
            r4.A03.A05((FileInputStream) A062);
        }
        return A062;
    }

    public static void A0Y(AnonymousClass1GX r3, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass6QO r1 = (AnonymousClass6QO) it.next();
            if (collection.contains(r1.A08())) {
                r3.A0l(r1.A08());
                r3.A0l(r1.A06());
            }
        }
    }

    @Deprecated
    public Bitmap A0f(Uri uri, int i, int i2, boolean z, boolean z2) {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A0A2 = AnonymousClass1GW.A0A(uri, this.A01.A0O());
            BitmapFactory.Options A0g = A0g(uri, i, z, z2);
            try {
                bitmap = AnonymousClass1GW.A08(A0T(A0g, uri, this, z), A0A2, i, i2);
            } catch (OutOfMemoryError e) {
                int i3 = A0g.inSampleSize * 2;
                A0g.inSampleSize = i3;
                StringBuilder sb = new StringBuilder();
                sb.append("sample_rotate_image/oom ");
                sb.append(i3);
                Log.i(sb.toString(), e);
                bitmap = AnonymousClass1GW.A08(A0T(A0g, uri, this, z), A0A2, i, i2);
            }
            bitmap.isMutable();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sample_rotate_image/final_size:");
            sb2.append(bitmap.getWidth());
            sb2.append(" | ");
            sb2.append(bitmap.getHeight());
            Log.i(sb2.toString());
            return bitmap;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No file ");
        sb3.append(uri);
        throw new FileNotFoundException(sb3.toString());
    }

    @Deprecated
    public BitmapFactory.Options A0g(Uri uri, int i, boolean z, boolean z2) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A0V = A0V(uri, this, z);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A0V, (Rect) null, options);
                A0V.close();
                int i3 = options.outWidth;
                if (i3 <= 0 || (i2 = options.outHeight) <= 0) {
                    throw new AnonymousClass1X5();
                }
                options.inSampleSize = 1;
                int i4 = 1;
                int max = Math.max(i3, i2);
                while (true) {
                    max /= 2;
                    if (max > (i * 8) / 10) {
                        i4 *= 2;
                        options.inSampleSize = i4;
                    } else {
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("sample_rotate_image/width=");
                        sb.append(i3);
                        sb.append(" | height=");
                        sb.append(i2);
                        sb.append(" | sample_size=");
                        sb.append(i4);
                        Log.i(sb.toString());
                        options.inPreferQualityOverSpeed = true;
                        options.inMutable = z2;
                        return options;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No file ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public void A0k(File file) {
        if (C224714l.A02()) {
            this.A0A.Boy(new C35771jE(this, file, 19));
            return;
        }
        try {
            if (this.A00.A0j(file)) {
                this.A0A.Boy(new C35771jE(this.A02.A00, Uri.fromFile(file), 15));
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("mediafileurils/broadcastscanmediaintent/unable to scan file ");
            sb.append(file);
            Log.e(sb.toString(), e);
        }
    }
}
