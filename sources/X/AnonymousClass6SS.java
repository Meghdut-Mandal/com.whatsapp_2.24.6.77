package X;

import com.whatsapp.stickers.WebpUtils;

/* renamed from: X.6SS  reason: invalid class name */
public final class AnonymousClass6SS {
    public String A00;
    public boolean A01;
    public final C21060yb A02;
    public final AnonymousClass1HA A03;
    public final WebpUtils A04;
    public final WebpUtils A05;
    public final AnonymousClass1YP A06;
    public final C20020wt A07;
    public final C20050ww A08;
    public final C19970wo A09;
    public final C18820ts A0A;
    public final AnonymousClass6O2 A0B;

    public AnonymousClass6SS(C20050ww r2, C21060yb r3, C19970wo r4, C18820ts r5, AnonymousClass6O2 r6, AnonymousClass1HA r7, WebpUtils webpUtils, AnonymousClass1YP r9, C20020wt r10) {
        AnonymousClass00C.A0D(r10, 1);
        C36321k7.A1A(webpUtils, r4, r2, r5, 2);
        C36361kB.A1J(r6, 7, r7);
        AnonymousClass00C.A0D(r3, 9);
        this.A07 = r10;
        this.A04 = webpUtils;
        this.A06 = r9;
        this.A05 = webpUtils;
        this.A09 = r4;
        this.A08 = r2;
        this.A0A = r5;
        this.A0B = r6;
        this.A03 = r7;
        this.A02 = r3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:76|77|78|79|80|(3:82|(2:84|(4:86|(2:88|(1:90)(1:123))(2:92|(5:97|(5:100|(4:103|(1:217)(4:105|(1:(1:109))(2:112|(1:116))|110|216)|111|101)|215|117|98)|214|118|(1:122))(1:96))|91|124))|(1:196)(9:126|(1:128)|130|131|(1:133)(1:134)|135|(3:137|(1:139)|140)|141|197))(1:195)) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0289, code lost:
        if (r23.length() == 0) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0311, code lost:
        if (200 != r2) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        X.C05600Qi.A00(r24, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0365, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0171 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass00I A00(X.AnonymousClass6SS r29, java.lang.String r30, java.util.Set r31) {
        /*
            r4 = r29
            X.0wo r0 = r4.A09
            r29 = r0
            X.C19970wo.A00(r29)
            r0 = 9
            r27 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x0366 }
            java.net.URL r1 = X.C90524aI.A0j(r30)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x0366 }
            X.AnonymousClass00C.A0E(r5, r0)     // Catch:{ Exception -> 0x0366 }
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x0366 }
            X.AnonymousClass00C.A0E(r5, r0)     // Catch:{ Exception -> 0x0366 }
            X.0wt r0 = r4.A07     // Catch:{ Exception -> 0x0366 }
            java.lang.String r1 = r0.A02()     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = "User-Agent"
            r5.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0366 }
            X.C90464aC.A1S(r5)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = "GET"
            r5.setRequestMethod(r0)     // Catch:{ Exception -> 0x0366 }
            r5.connect()     // Catch:{ Exception -> 0x0366 }
            int r2 = r5.getResponseCode()     // Catch:{ Exception -> 0x0366 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/failed "
            X.C36321k7.A1S(r0, r1, r2)     // Catch:{ Exception -> 0x0366 }
            X.C19970wo.A00(r29)
            android.net.TrafficStats.clearThreadStatsTag()
            return r27
        L_0x0050:
            X.C19970wo.A00(r29)     // Catch:{ Exception -> 0x0366 }
            r3 = 0
            r26 = 0
            r25 = 0
            X.0ww r2 = r4.A08     // Catch:{ Exception -> 0x0366 }
            java.lang.Integer r1 = X.C36381kD.A0m()     // Catch:{ Exception -> 0x0366 }
            X.5RE r0 = X.C132776Vf.A00(r2, r3, r1, r5)     // Catch:{ Exception -> 0x0366 }
            android.util.JsonReader r24 = X.C90474aD.A0K(r0)     // Catch:{ Exception -> 0x0366 }
            r24.beginObject()     // Catch:{ all -> 0x035d }
        L_0x0069:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02f1
            java.lang.String r2 = r24.nextName()     // Catch:{ all -> 0x035d }
            if (r2 == 0) goto L_0x02e3
            int r1 = r2.hashCode()     // Catch:{ all -> 0x035d }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r1 == r0) goto L_0x00a2
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r1 == r0) goto L_0x0095
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r1 != r0) goto L_0x02e3
            java.lang.String r0 = "pagination"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02e3
            java.lang.String r26 = X.AnonymousClass6W4.A02(r24)     // Catch:{ all -> 0x035d }
            goto L_0x0069
        L_0x0095:
            java.lang.String r0 = "meta"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02e3
            X.00I r3 = X.AnonymousClass6W4.A00(r24)     // Catch:{ all -> 0x035d }
            goto L_0x0069
        L_0x00a2:
            java.lang.String r0 = "data"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02e3
            java.util.ArrayList r25 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x035d }
            r24.beginArray()     // Catch:{ all -> 0x035d }
        L_0x00b1:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02de
            r24.beginObject()     // Catch:{ all -> 0x035d }
            r5 = 0
            r23 = r5
        L_0x00bd:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = r24.nextName()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "username"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r23 = r24.nextString()     // Catch:{ all -> 0x035d }
            goto L_0x00bd
        L_0x00d4:
            java.lang.String r0 = "images"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x0156
            r24.beginObject()     // Catch:{ all -> 0x035d }
        L_0x00df:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x0151
            java.lang.String r1 = r24.nextName()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "fixed_height"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x014d
            r24.beginObject()     // Catch:{ all -> 0x035d }
            r7 = -1
            r5 = 0
            r6 = r5
            r2 = -1
        L_0x00f8:
            boolean r0 = r24.hasNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x0142
            java.lang.String r8 = r24.nextName()     // Catch:{ all -> 0x035d }
            if (r8 == 0) goto L_0x013e
            int r1 = r8.hashCode()     // Catch:{ all -> 0x035d }
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r1 == r0) goto L_0x0131
            r0 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r0) goto L_0x0124
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r1 != r0) goto L_0x013e
            java.lang.String r0 = "width"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x013e
            int r7 = X.C90484aE.A0A(r24)     // Catch:{ all -> 0x035d }
            goto L_0x00f8
        L_0x0124:
            java.lang.String r0 = "webp"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x013e
            java.lang.String r6 = r24.nextString()     // Catch:{ all -> 0x035d }
            goto L_0x00f8
        L_0x0131:
            java.lang.String r0 = "height"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x013e
            int r2 = X.C90484aE.A0A(r24)     // Catch:{ all -> 0x035d }
            goto L_0x00f8
        L_0x013e:
            r24.skipValue()     // Catch:{ all -> 0x035d }
            goto L_0x00f8
        L_0x0142:
            r24.endObject()     // Catch:{ all -> 0x035d }
            if (r6 == 0) goto L_0x00df
            X.3XN r5 = new X.3XN     // Catch:{ all -> 0x035d }
            r5.<init>(r6, r7, r2)     // Catch:{ all -> 0x035d }
            goto L_0x00df
        L_0x014d:
            r24.skipValue()     // Catch:{ all -> 0x035d }
            goto L_0x00df
        L_0x0151:
            r24.endObject()     // Catch:{ all -> 0x035d }
            goto L_0x00bd
        L_0x0156:
            r24.skipValue()     // Catch:{ all -> 0x035d }
            goto L_0x00bd
        L_0x015b:
            r24.endObject()     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x00b1
            int r11 = r5.A01     // Catch:{ all -> 0x035d }
            int r10 = r5.A00     // Catch:{ all -> 0x035d }
            if (r11 != r10) goto L_0x00b1
            java.lang.String r5 = r5.A02     // Catch:{ all -> 0x035d }
            r2 = 0
            X.1YP r1 = r4.A06     // Catch:{ Exception -> 0x0171 }
            r0 = 0
            X.6c4 r2 = r1.A02(r5, r0)     // Catch:{ Exception -> 0x0171 }
            goto L_0x017a
        L_0x0171:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "BaseStickerProvider/getStickerFromUrl/error loading "
            X.C36321k7.A1P(r0, r5, r1)     // Catch:{ all -> 0x035d }
        L_0x017a:
            if (r2 == 0) goto L_0x00b1
            X.1HA r9 = r4.A03     // Catch:{ all -> 0x035d }
            com.whatsapp.stickers.WebpUtils r5 = r4.A05     // Catch:{ all -> 0x035d }
            X.0yb r1 = r4.A02     // Catch:{ all -> 0x035d }
            r22 = 0
            r0 = 0
            java.lang.String r21 = X.AnonymousClass1HA.A03(r2, r11, r10, r0)     // Catch:{ all -> 0x035d }
            X.0y0 r0 = r9.A01     // Catch:{ all -> 0x035d }
            byte[] r5 = X.AnonymousClass1HA.A05(r0, r1, r2, r5)     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x027f
            java.lang.String r0 = r2.A0E     // Catch:{ all -> 0x035d }
            r28 = r0
            X.C18740tg.A06(r28)     // Catch:{ all -> 0x035d }
            com.facebook.animated.webp.WebPImage r20 = X.AnonymousClass1HB.A02(r5)     // Catch:{ all -> 0x035d }
            if (r20 == 0) goto L_0x027f
            int r1 = r20.getFrameCount()     // Catch:{ all -> 0x035d }
            r0 = 1
            if (r1 != r0) goto L_0x01c2
            X.1HB r1 = r9.A07     // Catch:{ all -> 0x035d }
            r0 = r28
            android.graphics.Bitmap r1 = r1.A07(r0, r5, r11, r10)     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x0273
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x035d }
            r0.<init>(r1)     // Catch:{ all -> 0x035d }
            java.util.concurrent.ConcurrentHashMap r5 = r9.A0E     // Catch:{ all -> 0x035d }
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x035d }
            r1.<init>(r0)     // Catch:{ all -> 0x035d }
        L_0x01bb:
            r0 = r21
            r5.put(r0, r1)     // Catch:{ all -> 0x035d }
            goto L_0x027d
        L_0x01c2:
            X.1HB r6 = r9.A07     // Catch:{ all -> 0x035d }
            r0 = r21
            java.lang.String r5 = X.AnonymousClass1HB.A04(r11, r10, r0)     // Catch:{ all -> 0x035d }
            android.graphics.Bitmap r1 = X.AnonymousClass1HB.A01(r6, r5)     // Catch:{ all -> 0x035d }
            if (r1 != 0) goto L_0x01da
            r0 = r20
            android.graphics.Bitmap r1 = X.AnonymousClass1HB.A00(r0, r6, r5, r11, r10)     // Catch:{ all -> 0x035d }
            if (r1 != 0) goto L_0x01da
            goto L_0x027f
        L_0x01da:
            int r19 = r1.getHeight()     // Catch:{ all -> 0x035d }
            int r18 = r1.getWidth()     // Catch:{ all -> 0x035d }
            int r0 = r19 / 10
            r17 = r0
            r14 = 0
            r13 = 0
            r8 = 0
            r12 = 0
        L_0x01ea:
            r0 = r18
            if (r14 >= r0) goto L_0x022a
            r7 = 0
        L_0x01ef:
            int r0 = r19 - r17
            if (r7 >= r0) goto L_0x0227
            int r0 = r1.getPixel(r14, r7)     // Catch:{ all -> 0x035d }
            int r16 = android.graphics.Color.red(r0)     // Catch:{ all -> 0x035d }
            int r6 = android.graphics.Color.blue(r0)     // Catch:{ all -> 0x035d }
            int r5 = android.graphics.Color.green(r0)     // Catch:{ all -> 0x035d }
            int r15 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x035d }
            r0 = 10
            if (r15 <= r0) goto L_0x0219
            r15 = 230(0xe6, float:3.22E-43)
            r0 = r16
            if (r0 < r15) goto L_0x021c
            if (r6 < r15) goto L_0x0217
            if (r5 < r15) goto L_0x0217
            int r13 = r13 + 1
        L_0x0217:
            int r8 = r8 + 1
        L_0x0219:
            int r7 = r7 + r17
            goto L_0x01ef
        L_0x021c:
            r15 = 20
            if (r0 > r15) goto L_0x0217
            if (r6 > r15) goto L_0x0217
            if (r5 > r15) goto L_0x0217
            int r12 = r12 + 1
            goto L_0x0217
        L_0x0227:
            int r14 = r14 + 1
            goto L_0x01ea
        L_0x022a:
            double r5 = (double) r13     // Catch:{ all -> 0x035d }
            double r7 = (double) r8     // Catch:{ all -> 0x035d }
            r13 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r7 = r7 * r13
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x027f
            double r5 = (double) r12     // Catch:{ all -> 0x035d }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x027f
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035d }
            r6 = 47
            r5 = 45
            r0 = r28
            java.lang.String r0 = r0.replace(r6, r5)     // Catch:{ all -> 0x035d }
            r7.append(r0)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "_"
            r7.append(r0)     // Catch:{ all -> 0x035d }
            r7.append(r11)     // Catch:{ all -> 0x035d }
            java.lang.String r17 = X.AnonymousClass000.A0r(r0, r7, r10)     // Catch:{ all -> 0x035d }
            X.17Y r5 = r9.A02     // Catch:{ all -> 0x035d }
            X.1HG r0 = r9.A09     // Catch:{ all -> 0x035d }
            X.9Um r12 = new X.9Um     // Catch:{ all -> 0x035d }
            r13 = r1
            r14 = r20
            r15 = r5
            r16 = r0
            r18 = r11
            r19 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x035d }
            java.util.concurrent.ConcurrentHashMap r5 = r9.A0D     // Catch:{ all -> 0x035d }
            java.lang.ref.WeakReference r1 = X.AnonymousClass001.A0F(r12)     // Catch:{ all -> 0x035d }
            goto L_0x01bb
        L_0x0273:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035d }
            java.lang.String r1 = "StickerImageLoader/loadAndValidateGiphySticker failed to create drawable, hash: "
            X.C36321k7.A1P(r1, r0, r5)     // Catch:{ all -> 0x035d }
            goto L_0x027f
        L_0x027d:
            r22 = 1
        L_0x027f:
            if (r22 == 0) goto L_0x00b1
            r7 = 0
            if (r23 == 0) goto L_0x028b
            int r1 = r23.length()     // Catch:{ all -> 0x035d }
            r0 = 0
            if (r1 != 0) goto L_0x028c
        L_0x028b:
            r0 = 1
        L_0x028c:
            r5 = 0
            if (r0 == 0) goto L_0x0291
            r8 = r5
            goto L_0x029d
        L_0x0291:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035d }
            r1 = 64
            r0 = r23
            java.lang.String r8 = X.C90464aC.A0f(r0, r6, r1)     // Catch:{ all -> 0x035d }
        L_0x029d:
            java.lang.String r9 = "Giphy"
            X.1XQ[] r0 = new X.AnonymousClass1XQ[r7]     // Catch:{ all -> 0x035d }
            r1 = r31
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x035d }
            X.1XQ[] r1 = (X.AnonymousClass1XQ[]) r1     // Catch:{ all -> 0x035d }
            X.3S2 r0 = new X.3S2     // Catch:{ all -> 0x035d }
            r10 = r5
            r11 = r5
            r12 = r5
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r0
            r7 = r5
            r13 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x035d }
            r2.A04 = r0     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r2.A0A     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02d7
            com.whatsapp.stickers.WebpUtils r6 = r4.A04     // Catch:{ all -> 0x035d }
            java.io.File r1 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x035d }
            X.3S2 r0 = r2.A04     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x02d4
            byte[] r5 = r0.A02()     // Catch:{ all -> 0x035d }
        L_0x02d4:
            r6.A02(r1, r5)     // Catch:{ all -> 0x035d }
        L_0x02d7:
            r0 = r25
            r0.add(r2)     // Catch:{ all -> 0x035d }
            goto L_0x00b1
        L_0x02de:
            r24.endArray()     // Catch:{ all -> 0x035d }
            goto L_0x0069
        L_0x02e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/unexpected key - "
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ all -> 0x035d }
            r24.skipValue()     // Catch:{ all -> 0x035d }
            goto L_0x0069
        L_0x02f1:
            r24.endObject()     // Catch:{ all -> 0x035d }
            r24.close()     // Catch:{ Exception -> 0x0366 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0366 }
            java.lang.String r1 = "GiphyStickerProvider/executeRequest/next: "
            r0 = r26
            X.C36321k7.A1R(r1, r0, r2)     // Catch:{ Exception -> 0x0366 }
            if (r3 == 0) goto L_0x0313
            java.lang.Object r0 = r3.A00     // Catch:{ Exception -> 0x0366 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0366 }
            if (r0 == 0) goto L_0x0313
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0366 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 1
            if (r1 == r2) goto L_0x0314
        L_0x0313:
            r0 = 0
        L_0x0314:
            if (r0 != 0) goto L_0x0344
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0366 }
            if (r3 == 0) goto L_0x0329
            java.lang.Object r0 = r3.A00     // Catch:{ Exception -> 0x0366 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0366 }
        L_0x0320:
            r1.append(r0)     // Catch:{ Exception -> 0x0366 }
            r0 = 40
            r1.append(r0)     // Catch:{ Exception -> 0x0366 }
            goto L_0x032c
        L_0x0329:
            r0 = r27
            goto L_0x0320
        L_0x032c:
            if (r3 == 0) goto L_0x032f
            goto L_0x0332
        L_0x032f:
            r0 = r27
            goto L_0x0336
        L_0x0332:
            java.lang.Object r0 = r3.A01     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0366 }
        L_0x0336:
            java.lang.String r2 = X.C36321k7.A0E(r0, r1)     // Catch:{ Exception -> 0x0366 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0366 }
            java.lang.String r0 = "GiphyStickerProvider/executeRequest/got error: "
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ Exception -> 0x0366 }
            goto L_0x036a
        L_0x0344:
            if (r25 == 0) goto L_0x034f
            r1 = r26
            r0 = r25
            X.00I r2 = X.C36441kJ.A0W(r1, r0)     // Catch:{ Exception -> 0x0366 }
            goto L_0x0356
        L_0x034f:
            X.00I r2 = new X.00I     // Catch:{ Exception -> 0x0366 }
            r1 = r27
            r2.<init>(r1, r1)     // Catch:{ Exception -> 0x0366 }
        L_0x0356:
            X.C19970wo.A00(r29)
            android.net.TrafficStats.clearThreadStatsTag()
            return r2
        L_0x035d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x035f }
        L_0x035f:
            r1 = move-exception
            r0 = r24
            X.C05600Qi.A00(r0, r2)     // Catch:{ Exception -> 0x0366 }
            throw r1     // Catch:{ Exception -> 0x0366 }
        L_0x0366:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0371 }
        L_0x036a:
            X.C19970wo.A00(r29)
            android.net.TrafficStats.clearThreadStatsTag()
            return r27
        L_0x0371:
            r0 = move-exception
            X.C19970wo.A00(r29)
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6SS.A00(X.6SS, java.lang.String, java.util.Set):X.00I");
    }

    public static final String A01(AnonymousClass6SS r7, CharSequence charSequence, String str) {
        String A002 = C54392ss.A00("https://api.giphy.com/v1/stickers/search", "api_key", AnonymousClass6JD.A0J, "q", charSequence.toString(), "lang", AnonymousClass6W4.A00.A03(r7.A0A, r7.A0B.A01()), "rating", "pg-13", "limit", "24");
        if (str == null || str.length() == 0) {
            return A002;
        }
        return C54392ss.A00(A002, "offset", str);
    }
}
