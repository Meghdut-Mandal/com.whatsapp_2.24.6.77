package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1HA  reason: invalid class name */
public class AnonymousClass1HA {
    public AnonymousClass5N3 A00;
    public final C20690y0 A01;
    public final AnonymousClass17Y A02;
    public final C21060yb A03;
    public final AnonymousClass1HC A04;
    public final C23971Ao A05;
    public final AnonymousClass1HE A06 = new AnonymousClass1HE();
    public final AnonymousClass1HB A07;
    public final WebpUtils A08;
    public final AnonymousClass1HG A09;
    public final C24221Bp A0A;
    public final C24171Bj A0B;
    public final C24191Bm A0C;
    public final ConcurrentHashMap A0D;
    public final ConcurrentHashMap A0E;
    public final C19970wo A0F;
    public final AnonymousClass17Z A0G;
    public final C20810yC A0H;
    public final C23981Ap A0I;

    public void A07(Context context, C135066c4 r14, C88204Ru r15, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        String A032 = A03(r14, i3, i4, false);
        WebpUtils webpUtils = this.A08;
        A04((AnonymousClass17Y) null, this.A03, new C47632fL(context, r14, r15, A032, i3, i4), this, webpUtils, (Map) null);
    }

    public void A09(ImageView imageView, C135066c4 r11, C88214Rv r12, int i, int i2, boolean z, boolean z2) {
        A08(imageView, r11, r12, 1, i, i2, z, z2);
    }

    public static Drawable A00(C135066c4 r2, AnonymousClass1HA r3, String str) {
        Drawable drawable;
        Reference reference = (Reference) r3.A0E.get(str);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            return r3.A02(r2, str);
        }
        if (drawable instanceof C165737u4) {
            return C1901397a.A00(((C165737u4) drawable).A0F);
        }
        return drawable;
    }

    public static Drawable A01(AnonymousClass3KR r17, AnonymousClass1HA r18, String str, byte[] bArr) {
        int min;
        int i;
        C135066c4 r8;
        AnonymousClass3S2 r0;
        String str2;
        AnonymousClass1HA r4 = r18;
        ConcurrentHashMap concurrentHashMap = r4.A0D;
        AnonymousClass3KR r9 = r17;
        String str3 = r9.A05;
        Reference reference = (Reference) concurrentHashMap.get(str3);
        if (reference != null) {
            C195489Um r5 = (C195489Um) reference.get();
            if (r5 != null) {
                return new C165747u5(r4.A0F, r5);
            }
            concurrentHashMap.remove(str3);
        }
        byte[] bArr2 = bArr;
        WebPImage A022 = AnonymousClass1HB.A02(bArr2);
        if (A022 != null) {
            Integer num = r9.A04;
            boolean z = false;
            if (num != null && r9.A03.A0L) {
                boolean z2 = false;
                if (A022.getFrameCount() > 1) {
                    z2 = true;
                }
                r4.A04.A01.markerAnnotate(354170068, num.intValue(), AnonymousClass5IZ.A00.A00, z2);
            }
            C20810yC r10 = r4.A0H;
            C21000yV r7 = C21000yV.A02;
            if (C20800yB.A01(r7, r10, 295) && !((r0 = (r8 = r9.A03).A04) == null && ((str2 = r8.A0A) == null || (r0 = r4.A0I.A01(r8.A01(), str2)) == null))) {
                z = !r0.A0B;
            }
            String str4 = str;
            if (A022.getFrameCount() == 1 || z) {
                Bitmap A072 = r4.A07.A07(str4, bArr2, r9.A02, r9.A00);
                if (A072 != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(A072);
                    r4.A0E.put(str3, new SoftReference(bitmapDrawable));
                    return bitmapDrawable;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: ");
                sb.append(str4);
                Log.e(sb.toString());
            } else {
                if (C20800yB.A01(r7, r10, 276)) {
                    min = Math.min(512, r9.A02);
                    i = Math.min(512, r9.A00);
                    if (r9.A07) {
                        min = (int) (((float) min) / 2.0f);
                        i = (int) (((float) i) / 2.0f);
                    }
                } else {
                    min = Math.min(512, r9.A00().getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                    i = min;
                }
                AnonymousClass1HB r1 = r4.A07;
                String A042 = AnonymousClass1HB.A04(min, i, str3);
                Bitmap A012 = AnonymousClass1HB.A01(r1, A042);
                if (!(A012 == null && (A012 = AnonymousClass1HB.A00(A022, r1, A042, min, i)) == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4.replace('/', '-'));
                    sb2.append("_");
                    sb2.append(min);
                    sb2.append("_");
                    sb2.append(i);
                    String obj = sb2.toString();
                    C195489Um r13 = new C195489Um(A012, A022, r4.A02, r4.A09, obj, min, i);
                    concurrentHashMap.put(str3, new WeakReference(r13));
                    return new C165747u5(r4.A0F, r13);
                }
            }
        }
        return null;
    }

    private C165747u5 A02(C135066c4 r5, String str) {
        if (r5.A0E != null) {
            ConcurrentHashMap concurrentHashMap = this.A0D;
            Reference reference = (Reference) concurrentHashMap.get(str);
            if (reference != null) {
                C195489Um r2 = (C195489Um) reference.get();
                if (r2 != null) {
                    return new C165747u5(this.A0F, r2);
                }
                concurrentHashMap.remove(str);
            }
        }
        return null;
    }

    public static String A03(C135066c4 r3, int i, int i2, boolean z) {
        String obj;
        String str = r3.A0E;
        if (str != null) {
            obj = str.replace("/", "-");
        } else {
            obj = r3.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(z);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0154, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0165, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0169, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0170, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A05(X.C20690y0 r10, X.C21060yb r11, X.C135066c4 r12, com.whatsapp.stickers.WebpUtils r13) {
        /*
            java.lang.String r0 = r12.A0A
            r9 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData filePath is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000a:
            return r9
        L_0x000b:
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)     // Catch:{ IOException -> 0x0188 }
            r0 = 1
            X.AnonymousClass00C.A0D(r13, r0)     // Catch:{ IOException -> 0x0188 }
            r0 = 2
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r6 = r12.A0A     // Catch:{ IOException -> 0x0188 }
            if (r6 == 0) goto L_0x015c
            int r0 = r6.length()     // Catch:{ IOException -> 0x0188 }
            if (r0 == 0) goto L_0x015c
            int r1 = r12.A01     // Catch:{ IOException -> 0x0188 }
            r0 = 3
            if (r1 != r0) goto L_0x0079
            X.0ya r1 = r11.A0O()     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r12.A0A     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            java.io.InputStream r3 = r1.A06(r0)     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            goto L_0x0038
        L_0x0037:
            r3 = r9
        L_0x0038:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x005a }
            r2.<init>()     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0055
            X.AnonymousClass6YY.A0J(r3, r2)     // Catch:{ all -> 0x004e }
            byte[] r8 = r2.toByteArray()     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ all -> 0x005a }
            r3.close()     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            goto L_0x015f
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x0055:
            r2.close()     // Catch:{ all -> 0x005a }
            goto L_0x015e
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
            throw r0     // Catch:{ IOException -> 0x0071, SecurityException -> 0x0069, IllegalArgumentException -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0188 }
            goto L_0x015e
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/SecurityException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0188 }
            goto L_0x015e
        L_0x0071:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IOException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0188 }
            goto L_0x015e
        L_0x0079:
            r8 = 0
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0188 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0188 }
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x0188 }
            if (r0 == 0) goto L_0x00e7
            long r0 = r5.length()     // Catch:{ IOException -> 0x0188 }
            r2 = 1048576(0x100000, double:5.180654E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0129
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
            r7.<init>()     // Catch:{ IOException -> 0x0188 }
            java.lang.String r4 = "Sticker/getImageDataFromFile/sticker is above legal size limit: "
            r7.append(r4)     // Catch:{ IOException -> 0x0188 }
            r7.append(r2)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r4 = ", hash: "
            r7.append(r4)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r4 = r12.A0E     // Catch:{ IOException -> 0x0188 }
            r7.append(r4)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x0188 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r7 = r12.A0E     // Catch:{ IOException -> 0x0188 }
            java.lang.String r4 = r12.A0H     // Catch:{ IOException -> 0x0188 }
            java.io.File r7 = r10.A0c(r7, r4)     // Catch:{ IOException -> 0x0188 }
            if (r7 != 0) goto L_0x00bf
            java.lang.String r0 = "Sticker/getImageDataFromFile/could not get sticker thumbnail file"
        L_0x00ba:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0188 }
            goto L_0x015f
        L_0x00bf:
            boolean r4 = r7.exists()     // Catch:{ IOException -> 0x0188 }
            if (r4 != 0) goto L_0x0128
            boolean r0 = r12.A0N     // Catch:{ IOException -> 0x0188 }
            if (r0 != 0) goto L_0x00e4
            int r0 = r13.A00(r6)     // Catch:{ IOException -> 0x0188 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0188 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
            r1.<init>()     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = "Sticker/getImageDataFromFile/even first frame is above legal size limit: "
            r1.append(r0)     // Catch:{ IOException -> 0x0188 }
            r1.append(r2)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0188 }
            goto L_0x00ba
        L_0x00e4:
            java.lang.String r0 = "Sticker/getImageDataFromFile/lottie sticker exceeds sticker file limit"
            goto L_0x00ba
        L_0x00e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
            r1.<init>()     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = "Sticker/getImageDataFromFile/sticker file cannot be found, "
            r1.append(r0)     // Catch:{ IOException -> 0x0188 }
            r1.append(r6)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0188 }
            goto L_0x00ba
        L_0x00f9:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0188 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0188 }
            X.5RB r6 = new X.5RB     // Catch:{ IOException -> 0x0188 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0188 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x016a }
            r5.<init>()     // Catch:{ all -> 0x016a }
            X.AnonymousClass6YY.A0J(r6, r5)     // Catch:{ all -> 0x0163 }
            byte[] r4 = r5.toByteArray()     // Catch:{ all -> 0x0163 }
            int r3 = (int) r0     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x0163 }
            boolean r2 = r13.A03(r2, r4, r3)     // Catch:{ all -> 0x0163 }
            if (r2 == 0) goto L_0x0121
            r5.close()     // Catch:{ all -> 0x016a }
            r6.close()     // Catch:{ IOException -> 0x0188 }
            goto L_0x0128
        L_0x0121:
            r5.close()     // Catch:{ all -> 0x016a }
            r6.close()     // Catch:{ IOException -> 0x0188 }
            goto L_0x015f
        L_0x0128:
            r5 = r7
        L_0x0129:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0155 }
            r2.<init>(r5)     // Catch:{ OutOfMemoryError -> 0x0155 }
            X.5RB r3 = new X.5RB     // Catch:{ OutOfMemoryError -> 0x0155 }
            r3.<init>(r2, r0)     // Catch:{ OutOfMemoryError -> 0x0155 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x014e }
            r2.<init>()     // Catch:{ all -> 0x014e }
            X.AnonymousClass6YY.A0J(r3, r2)     // Catch:{ all -> 0x0147 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0147 }
            r2.close()     // Catch:{ all -> 0x014e }
            r3.close()     // Catch:{ OutOfMemoryError -> 0x0155 }
            r8 = r0
            goto L_0x015f
        L_0x0147:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x014e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0155 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0155 }
        L_0x0155:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromFile/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0188 }
            goto L_0x015f
        L_0x015c:
            r8 = 0
            goto L_0x015f
        L_0x015e:
            r8 = r9
        L_0x015f:
            r9 = r8
            if (r8 != 0) goto L_0x000a
            goto L_0x0171
        L_0x0163:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016c }
        L_0x016c:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ IOException -> 0x0188 }
            throw r0     // Catch:{ IOException -> 0x0188 }
        L_0x0171:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188 }
            r1.<init>()     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker file does not exist: "
            r1.append(r0)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = r12.A0E     // Catch:{ IOException -> 0x0188 }
            r1.append(r0)     // Catch:{ IOException -> 0x0188 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0188 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0188 }
            return r9
        L_0x0188:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker IOException when getting image data: "
            r1.append(r0)
            java.lang.String r0 = r12.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HA.A05(X.0y0, X.0yb, X.6c4, com.whatsapp.stickers.WebpUtils):byte[]");
    }

    public void A06() {
        AnonymousClass5N3 r1 = this.A00;
        if (r1 != null) {
            r1.A01 = true;
            r1.interrupt();
            this.A00 = null;
        }
        AnonymousClass1HE r12 = this.A06;
        synchronized (r12) {
            r12.A00.clear();
        }
        AnonymousClass1HG r13 = this.A09;
        C183818rP r0 = r13.A00;
        if (r0 != null) {
            r0.A00();
            r13.A00 = null;
        }
    }

    public void A08(ImageView imageView, C135066c4 r25, C88214Rv r26, int i, int i2, int i3, boolean z, boolean z2) {
        Integer num;
        PriorityQueue priorityQueue;
        Drawable A022;
        C135066c4 r14 = r25;
        if (r14.A0L) {
            AnonymousClass1HC r2 = this.A04;
            int A002 = r2.A00();
            num = Integer.valueOf(A002);
            r2.A01(A002, "start_sticker_loading");
        } else {
            num = null;
        }
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z;
        String A032 = A03(r14, i4, i5, z3);
        ImageView imageView2 = imageView;
        C88214Rv r15 = r26;
        if (!A032.equals(imageView2.getTag()) || imageView2.getDrawable() == null) {
            imageView2.setTag(A032);
            AnonymousClass1HE r4 = this.A06;
            synchronized (r4) {
                priorityQueue = r4.A00;
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    if (((C47642fM) it.next()).A00 == imageView2) {
                        it.remove();
                    }
                }
            }
            Drawable drawable = imageView2.getDrawable();
            Reference reference = (Reference) this.A0E.get(A032);
            if (reference == null || (A022 = (Drawable) reference.get()) == null || (A022 instanceof C165737u4)) {
                A022 = A02(r14, A032);
            }
            if (drawable != null && drawable.equals(A022)) {
                if (r26 != null) {
                    r15.Bhf(true);
                }
                if (num != null) {
                    AnonymousClass1HC r22 = this.A04;
                    int intValue = num.intValue();
                    r22.A01(intValue, "in_memory_cache_hit");
                    r22.A02(C52322pF.SUCCESS, intValue);
                    return;
                }
                return;
            } else if (A022 != null) {
                if (num != null) {
                    AnonymousClass1HC r23 = this.A04;
                    int intValue2 = num.intValue();
                    r23.A01(intValue2, "in_memory_cache_hit");
                    r23.A02(C52322pF.SUCCESS, intValue2);
                }
                imageView2.setImageDrawable(A022);
            } else {
                imageView2.setImageResource(R.drawable.sticker_loading_indicator);
                if (num != null) {
                    this.A04.A01(num.intValue(), "sticker_load_enqueued");
                }
                int i6 = i5;
                int i7 = i4;
                String str = A032;
                C47642fM r11 = new C47642fM(imageView2, this.A04, r14, r15, num, str, i7, i6, i, z3, z2);
                synchronized (r4) {
                    priorityQueue.add(r11);
                    r4.notifyAll();
                }
                if (this.A00 == null) {
                    AnonymousClass5N3 r0 = new AnonymousClass5N3(r4, this);
                    this.A00 = r0;
                    r0.start();
                    return;
                }
                return;
            }
        }
        if (r26 != null) {
            r15.Bhf(true);
        }
    }

    public AnonymousClass1HA(C20690y0 r2, AnonymousClass17Y r3, C21060yb r4, C19970wo r5, AnonymousClass17Z r6, C20810yC r7, AnonymousClass1HC r8, C23971Ao r9, C23981Ap r10, AnonymousClass1HB r11, WebpUtils webpUtils, AnonymousClass1HD r13, C24221Bp r14, C24171Bj r15, C24191Bm r16) {
        this.A0H = r7;
        this.A02 = r3;
        this.A0F = r5;
        this.A08 = webpUtils;
        this.A0I = r10;
        this.A03 = r4;
        this.A0C = r16;
        this.A01 = r2;
        this.A07 = r11;
        this.A05 = r9;
        this.A04 = r8;
        this.A0B = r15;
        this.A0G = r6;
        this.A0A = r14;
        this.A09 = new AnonymousClass1HG(r3, r7, r13);
        this.A0E = new ConcurrentHashMap();
        this.A0D = new ConcurrentHashMap();
    }

    public static void A04(AnonymousClass17Y r6, C21060yb r7, AnonymousClass3KR r8, AnonymousClass1HA r9, WebpUtils webpUtils, Map map) {
        Reference reference;
        if (r8.A02()) {
            Drawable drawable = null;
            if (map == null || (reference = (Reference) map.get(r8.A05)) == null || (drawable = (Drawable) reference.get()) == null) {
                C135066c4 r1 = r8.A03;
                byte[] A052 = A05(r9.A01, r7, r1, webpUtils);
                if (A052 != null) {
                    if (r1.A0N) {
                        String str = r8.A05;
                        String str2 = r1.A0E;
                        C23971Ao r0 = r9.A05;
                        int i = r8.A02;
                        int i2 = r8.A00;
                        try {
                            C165737u4 A022 = r0.A02(str2, A052);
                            if (A022 != null) {
                                drawable = new BitmapDrawable(r8.A00().getResources(), C23971Ao.A00(A022, i, i2));
                                r9.A0E.put(str, new SoftReference(drawable));
                            }
                        } catch (OutOfMemoryError e) {
                            Log.w("LottieUtils/getResizedLottieBitmapFromData OOM getting thumbnail bitmap", e);
                        }
                    } else if (r8.A06) {
                        String str3 = r1.A0E;
                        C18740tg.A06(str3);
                        drawable = A01(r8, r9, str3, A052);
                    } else {
                        Bitmap A072 = r9.A07.A07(r8.A05, A052, r8.A02, r8.A00);
                        if (A072 != null) {
                            drawable = new BitmapDrawable(A072);
                        }
                    }
                    drawable = null;
                }
                if (map != null) {
                    if (drawable != null) {
                        map.put(r8.A05, new SoftReference(drawable));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("StickerImageLoader/loadSticker failed to create drawable: ");
                        sb.append(r8.A05);
                        Log.e(sb.toString());
                    }
                }
            }
            r8.A01(drawable, r6);
        }
    }
}
