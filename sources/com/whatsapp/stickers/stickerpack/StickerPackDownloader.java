package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass00C;
import X.AnonymousClass1B5;
import X.AnonymousClass1BA;
import X.AnonymousClass1BB;
import X.AnonymousClass1BC;
import X.AnonymousClass1BG;
import X.AnonymousClass1BH;
import X.AnonymousClass1BR;
import X.AnonymousClass1C0;
import X.AnonymousClass1C1;
import X.AnonymousClass68B;
import X.C005502l;
import X.C107185Mw;
import X.C129156Fn;
import X.C132446Tt;
import X.C158517hd;
import X.C18800tq;
import X.C19770wU;
import X.C20810yC;
import X.C21010yW;
import X.C21430zE;
import X.C23871Ae;
import X.C24041Av;
import X.C24191Bm;
import X.C24201Bn;
import X.C24221Bp;
import X.C24241Br;
import X.C24301Bx;
import com.whatsapp.util.Log;
import java.util.Map;

public final class StickerPackDownloader {
    public final C24041Av A00;
    public final C20810yC A01;
    public final C24241Br A02;
    public final C21430zE A03;
    public final AnonymousClass1BR A04;
    public final C24221Bp A05;
    public final AnonymousClass1C0 A06;
    public final C24201Bn A07;
    public final AnonymousClass1BC A08;
    public final C24191Bm A09;
    public final C24301Bx A0A;
    public final AnonymousClass1BG A0B;
    public final AnonymousClass1B5 A0C;
    public final AnonymousClass1BH A0D;
    public final C005502l A0E;
    public final AnonymousClass1C1 A0F;
    public final AnonymousClass1BB A0G;
    public final AnonymousClass1BA A0H;
    public final C19770wU A0I;

    public StickerPackDownloader(AnonymousClass1C1 r19, C24041Av r20, C20810yC r21, C24241Br r22, C21430zE r23, AnonymousClass1BB r24, AnonymousClass1BA r25, AnonymousClass1BR r26, C24221Bp r27, AnonymousClass1C0 r28, C24201Bn r29, AnonymousClass1BC r30, C24191Bm r31, C24301Bx r32, AnonymousClass1BG r33, AnonymousClass1B5 r34, AnonymousClass1BH r35, C19770wU r36, C005502l r37) {
        C20810yC r15 = r21;
        AnonymousClass00C.A0D(r15, 1);
        C19770wU r3 = r36;
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass1BB r13 = r24;
        AnonymousClass00C.A0D(r13, 3);
        AnonymousClass1B5 r5 = r34;
        AnonymousClass00C.A0D(r5, 4);
        C24191Bm r7 = r31;
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass1BC r8 = r30;
        AnonymousClass00C.A0D(r8, 6);
        C24201Bn r9 = r29;
        AnonymousClass00C.A0D(r9, 7);
        C21430zE r14 = r23;
        AnonymousClass00C.A0D(r14, 8);
        AnonymousClass1BH r4 = r35;
        AnonymousClass00C.A0D(r4, 9);
        AnonymousClass1BR r11 = r26;
        AnonymousClass00C.A0D(r11, 11);
        AnonymousClass1BA r12 = r25;
        AnonymousClass00C.A0D(r12, 12);
        C24041Av r16 = r20;
        AnonymousClass00C.A0D(r16, 14);
        C24301Bx r6 = r32;
        AnonymousClass00C.A0D(r6, 15);
        C24221Bp r10 = r27;
        AnonymousClass00C.A0D(r10, 17);
        C005502l r2 = r37;
        AnonymousClass00C.A0D(r2, 18);
        AnonymousClass1C1 r17 = r19;
        AnonymousClass00C.A0D(r17, 19);
        this.A01 = r15;
        this.A0I = r3;
        this.A0G = r13;
        this.A0C = r5;
        this.A09 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A03 = r14;
        this.A0D = r4;
        this.A02 = r22;
        this.A04 = r11;
        this.A0H = r12;
        this.A0B = r33;
        this.A00 = r16;
        this.A0A = r6;
        this.A06 = r28;
        this.A05 = r10;
        this.A0E = r2;
        this.A0F = r17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bd, code lost:
        if (r0 == false) goto L_0x01bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C111615cZ A00(X.AnonymousClass68B r13, X.C159707jn r14, com.whatsapp.stickers.stickerpack.StickerPackDownloader r15) {
        /*
            r12 = r15
            X.1Bx r6 = r15.A0A
            r4 = 0
            X.C18740tg.A00()
            r10 = r13
            boolean r0 = r13.A0S
            if (r0 != 0) goto L_0x0080
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            r1.append(r0)
            java.lang.String r0 = r13.A0L
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            X.0yC r1 = r6.A01
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = r1.A09(r0)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0080
            X.1Be r0 = r6.A03
            java.lang.String r5 = r0.A01(r1)
            X.AnonymousClass00C.A08(r5)
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = r13.A0F
            X.AnonymousClass00C.A08(r0)
            java.io.File r5 = r6.A00(r0)
            if (r5 == 0) goto L_0x0080
            X.0wG r0 = r6.A00
            android.content.Context r1 = r0.A00
            r0 = 2131231955(0x7f0804d3, float:1.8080006E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            X.C18740tg.A06(r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r3 = r0.getBitmap()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r3.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r0 = 5120(0x1400, double:2.5296E-320)
            X.AnonymousClass6YY.A0T(r5, r2, r0)
        L_0x0080:
            java.util.List r5 = r13.A05
            X.AnonymousClass00C.A08(r5)
            int r6 = r5.size()
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r4)
            X.0yC r4 = r15.A01
            r1 = 3064(0xbf8, float:4.294E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r1)
            r11 = r14
            if (r0 == 0) goto L_0x00d5
            X.7Ok r14 = new X.7Ok
            r14.<init>(r13, r11, r2, r6)
            X.02l r1 = r15.A0E
            r0 = 4
            X.02l r1 = r1.A01(r0)
            r13 = 0
            X.03g r0 = new X.03g
            r0.<init>(r13)
            X.02h r0 = X.C008803t.A02(r1, r0)
            X.041 r15 = X.C009403z.A02(r0)
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1 r9 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.03u r0 = X.C008903u.A00
            java.lang.Object r0 = X.C110515an.A00(r0, r9)
            X.0AK r0 = (X.AnonymousClass0AK) r0
            java.lang.Object r6 = r0.value
        L_0x00c5:
            java.lang.Throwable r7 = X.AnonymousClass0AK.A00(r6)
            if (r7 != 0) goto L_0x01d5
            java.util.List r6 = (java.util.List) r6
            r10.A05 = r6
            X.5KY r1 = new X.5KY
            r1.<init>(r10, r6)
            return r1
        L_0x00d5:
            X.7Ol r7 = new X.7Ol
            r7.<init>(r13, r14, r2, r6)
            java.util.List r1 = r13.A05
            X.AnonymousClass00C.A08(r1)
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x00ee:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r1 = r8.next()
            X.6c4 r1 = (X.C135066c4) r1
            boolean r0 = r14.BLM()
            java.lang.String r4 = "cancelled"
            if (r0 == 0) goto L_0x0110
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            X.AnonymousClass00C.A0D(r0, r3)
            X.03N r6 = new X.03N
            r6.<init>(r0)
            goto L_0x00c5
        L_0x0110:
            X.1Bm r0 = r15.A09
            X.AnonymousClass00C.A0B(r1)
            X.5ce r1 = r0.A00(r1)
            boolean r0 = r1 instanceof X.AnonymousClass5L4
            if (r0 == 0) goto L_0x012b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            X.AnonymousClass00C.A0D(r0, r3)
            X.03N r6 = new X.03N
            r6.<init>(r0)
            goto L_0x00c5
        L_0x012b:
            boolean r0 = r1 instanceof X.AnonymousClass5L5
            if (r0 == 0) goto L_0x0206
            r7.invoke()
            X.5L5 r1 = (X.AnonymousClass5L5) r1
            X.6c4 r0 = r1.A00
            r6.add(r0)
            goto L_0x00ee
        L_0x013a:
            X.1Bz r9 = r6.A04
            java.lang.String r3 = r13.A0F
            X.AnonymousClass00C.A08(r3)
            java.io.File r8 = r6.A00(r3)
            java.lang.String r2 = "StaticContentDownloader/download/error downloading: "
            if (r8 == 0) goto L_0x01bf
            X.13E r0 = r9.A01     // Catch:{ IOException -> 0x01a9 }
            X.6v1 r7 = r0.A04(r5)     // Catch:{ IOException -> 0x01a9 }
            java.net.HttpURLConnection r6 = r7.A01     // Catch:{ all -> 0x019f }
            int r1 = r6.getResponseCode()     // Catch:{ all -> 0x019f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x017d
            X.0ww r1 = r9.A00     // Catch:{ all -> 0x019f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x019f }
            X.5RE r0 = r7.B8D(r1, r0, r0)     // Catch:{ all -> 0x019f }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x019f }
            r6.<init>(r0)     // Catch:{ all -> 0x019f }
            boolean r0 = X.AnonymousClass6YY.A0S(r8, r6)     // Catch:{ all -> 0x0173 }
            r6.close()     // Catch:{ all -> 0x019f }
            r7.close()     // Catch:{ IOException -> 0x01a9 }
            goto L_0x01bd
        L_0x0173:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0178 }
            goto L_0x017c
        L_0x0178:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x019f }
        L_0x017c:
            throw r1     // Catch:{ all -> 0x019f }
        L_0x017d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r1.<init>()     // Catch:{ all -> 0x019f }
            r1.append(r2)     // Catch:{ all -> 0x019f }
            r1.append(r5)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = ", returned code: "
            r1.append(r0)     // Catch:{ all -> 0x019f }
            int r0 = r6.getResponseCode()     // Catch:{ all -> 0x019f }
            r1.append(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x019f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x019f }
            r7.close()     // Catch:{ IOException -> 0x01a9 }
            goto L_0x01bf
        L_0x019f:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01a9 }
        L_0x01a8:
            throw r1     // Catch:{ IOException -> 0x01a9 }
        L_0x01a9:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01bf
        L_0x01bd:
            if (r0 != 0) goto L_0x0080
        L_0x01bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerPackTrayIconDownloader/failed to download tray icon for sticker pack "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0080
        L_0x01d5:
            r7.getMessage()
            int r4 = r2.get()
        L_0x01dc:
            if (r3 >= r4) goto L_0x01f8
            java.lang.Object r0 = r5.get(r3)
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r2 = r0.A0E
            if (r2 == 0) goto L_0x01f5
            java.lang.Object r0 = r5.get(r3)
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r1 = r0.A0D
            X.1Av r0 = r12.A00
            r0.A07(r2, r1)
        L_0x01f5:
            int r3 = r3 + 1
            goto L_0x01dc
        L_0x01f8:
            java.lang.String r0 = r7.getMessage()
            if (r0 != 0) goto L_0x0200
            java.lang.String r0 = "no error message available"
        L_0x0200:
            X.5KX r1 = new X.5KX
            r1.<init>(r0)
            return r1
        L_0x0206:
            X.0jS r0 = new X.0jS
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.stickerpack.StickerPackDownloader.A00(X.68B, X.7jn, com.whatsapp.stickers.stickerpack.StickerPackDownloader):X.5cZ");
    }

    public final void A03(AnonymousClass68B r21, C158517hd r22, Integer num, Integer num2, int i, boolean z) {
        AnonymousClass68B r12 = r21;
        String str = r12.A0F;
        AnonymousClass00C.A08(str);
        AnonymousClass1BA r4 = this.A0H;
        Map map = r4.A01;
        if (map.containsKey(str)) {
            Log.e("StickerPackDownloader/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        C18800tq r5 = this.A0F.A00.A00;
        AnonymousClass1BA r14 = (AnonymousClass1BA) r5.A86.get();
        C107185Mw r7 = new C107185Mw((C20810yC) r5.A02.get(), (C21010yW) r5.A79.get(), (C23871Ae) r5.A0V.get(), (AnonymousClass1BB) r5.A85.get(), r12, r22, r14, (StickerPackDownloader) r5.A87.get(), num, num2, i, z);
        map.put(str, 0);
        r4.A00.put(str, r7);
        for (C129156Fn A082 : this.A0G.getObservers()) {
            A082.A08(r12);
        }
        this.A0I.Box(r7, r21);
    }

    public final void A04(String str) {
        C132446Tt r1;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass1BA r12 = this.A0H;
        if (r12.A01.containsKey(str) && (r1 = (C132446Tt) r12.A00.get(str)) != null) {
            r1.A0D(true);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass68B r9, X.C159707jn r10, com.whatsapp.stickers.stickerpack.StickerPackDownloader r11, X.C023509x r12, X.AnonymousClass00S r13, X.AnonymousClass040 r14) {
        /*
            boolean r0 = r12 instanceof X.C1515079v
            if (r0 == 0) goto L_0x0020
            r5 = r12
            X.79v r5 = (X.C1515079v) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0020
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 10
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0026
            goto L_0x006a
        L_0x0020:
            X.79v r5 = new X.79v
            r5.<init>(r11, r12)
            goto L_0x0012
        L_0x0026:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002e:
            X.AnonymousClass0AN.A00(r4)
            java.util.List r1 = r9.A05
            X.AnonymousClass00C.A08(r1)
            int r0 = X.AnonymousClass03U.A06(r1, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0043:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r9 = r4.next()
            X.6c4 r9 = (X.C135066c4) r9
            r12 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 r8 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.03u r1 = X.C008903u.A00
            java.lang.Integer r0 = X.C023109s.A00
            X.0ml r0 = X.AnonymousClass0A2.A01(r0, r1, r8, r14)
            r7.add(r0)
            goto L_0x0043
        L_0x0061:
            r5.label = r2     // Catch:{ all -> 0x00ef }
            java.lang.Object r4 = X.C06800Vd.A00(r7, r5)     // Catch:{ all -> 0x00ef }
            if (r4 != r6) goto L_0x006d
            return r6
        L_0x006a:
            X.AnonymousClass0AN.A00(r4)     // Catch:{ all -> 0x00ef }
        L_0x006d:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00ef }
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x007a
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x007a
            goto L_0x0093
        L_0x007a:
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00ef }
        L_0x007e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00ef }
            X.0AK r0 = (X.AnonymousClass0AK) r0     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00ef }
            boolean r0 = r0 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x00ef }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x007e
            r2 = 0
        L_0x0093:
            if (r2 == 0) goto L_0x00b9
            int r0 = X.AnonymousClass03U.A06(r4, r3)     // Catch:{ all -> 0x00ef }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00ef }
            r3.<init>(r0)     // Catch:{ all -> 0x00ef }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00ef }
        L_0x00a2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00ef }
            X.0AK r0 = (X.AnonymousClass0AK) r0     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = r0.value     // Catch:{ all -> 0x00ef }
            X.AnonymousClass0AN.A00(r0)     // Catch:{ all -> 0x00ef }
            X.6c4 r0 = (X.C135066c4) r0     // Catch:{ all -> 0x00ef }
            r3.add(r0)     // Catch:{ all -> 0x00ef }
            goto L_0x00a2
        L_0x00b9:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x00ef }
        L_0x00bd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00ef }
            X.0AK r0 = (X.AnonymousClass0AK) r0     // Catch:{ all -> 0x00ef }
            java.lang.Object r1 = r0.value     // Catch:{ all -> 0x00ef }
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00bd
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x00ef }
            if (r1 != 0) goto L_0x00dc
            java.lang.String r0 = "Unknown error"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ef }
            r1.<init>(r0)     // Catch:{ all -> 0x00ef }
        L_0x00dc:
            X.03N r3 = new X.03N     // Catch:{ all -> 0x00ef }
            r3.<init>(r1)     // Catch:{ all -> 0x00ef }
        L_0x00e1:
            X.0AK r2 = new X.0AK     // Catch:{ all -> 0x00ef }
            r2.<init>(r3)     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00e7:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00ef }
            r0.<init>(r1)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            X.03N r2 = new X.03N
            r2.<init>(r0)
        L_0x00f5:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x0105
            X.03N r0 = new X.03N
            r0.<init>(r1)
            X.0AK r2 = new X.0AK
            r2.<init>(r0)
        L_0x0105:
            X.0AK r2 = (X.AnonymousClass0AK) r2
            java.lang.Object r0 = r2.value
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.stickerpack.StickerPackDownloader.A01(X.68B, X.7jn, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.09x, X.00S, X.040):java.lang.Object");
    }

    public static final void A02(StickerPackDownloader stickerPackDownloader, Integer num, Integer num2, String str) {
        if (num != null && num2 != null) {
            stickerPackDownloader.A03.markerPoint(num.intValue(), num2.intValue(), str);
        }
    }
}
