package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {486}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Set $emojis;
    public final /* synthetic */ List $localResults;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {0, 1, 2, 2}, l = {489, 499, 514, 528}, m = "invokeSuspend", n = {"startTime", "startTime", "stickersFromJsonArray", "startTime"}, s = {"J$0", "J$0", "L$0", "J$0"})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public long J$0;
        public Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(list, set, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            X.C05600Qi.A00(r15, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            X.C05600Qi.A00(r9, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
            throw r1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0238 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x028d A[SYNTHETIC, Splitter:B:114:0x028d] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0292 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0206 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[SYNTHETIC, Splitter:B:39:0x00d6] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2 A[Catch:{ Exception -> 0x00f1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0114 A[SYNTHETIC, Splitter:B:67:0x0114] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0119 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0142 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0203 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0210 A[Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r49) {
            /*
                r48 = this;
                X.0AO r11 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                r0 = r48
                int r2 = r0.label
                r6 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0029
                if (r2 == r5) goto L_0x0026
                if (r2 == r6) goto L_0x0022
                r1 = 3
                if (r2 == r1) goto L_0x001a
                r0 = 4
                if (r2 != r0) goto L_0x02d7
                X.AnonymousClass0AN.A00(r49)
            L_0x0017:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x001a:
                long r7 = r0.J$0
                java.lang.Object r4 = r0.L$0
                java.util.List r4 = (java.util.List) r4
                goto L_0x0272
            L_0x0022:
                long r7 = r0.J$0
                goto L_0x0222
            L_0x0026:
                long r7 = r0.J$0
                goto L_0x0048
            L_0x0029:
                X.AnonymousClass0AN.A00(r49)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                long r7 = java.lang.System.currentTimeMillis()
                X.5lo r1 = r1.A0E     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.0yC r2 = r1.A00     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = 5423(0x152f, float:7.599E-42)
                long r1 = X.C36441kJ.A0B(r2, r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.J$0 = r7     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.label = r5     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.Object r1 = X.C07330Xf.A00(r0, r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                if (r1 != r11) goto L_0x004b
                goto L_0x02dc
            L_0x0048:
                X.AnonymousClass0AN.A00(r49)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x004b:
                java.util.Set r3 = r3     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.5lo r1 = r1.A0E     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.0yC r2 = r1.A00     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = 5421(0x152d, float:7.596E-42)
                int r1 = r2.A07(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.List r4 = X.C007103b.A0a(r3, r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r2 = ","
                r10 = 0
                r3 = 0
                java.lang.String r1 = ""
                java.lang.String r2 = X.C007103b.A0Q(r2, r1, r1, r4, r10)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r1 = X.C19430v1.A0B     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r2 = java.net.URLEncoder.encode(r2, r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.5uv r4 = r1.A0F     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.AnonymousClass00C.A0B(r2)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r14 = " / "
                X.AnonymousClass00C.A0D(r2, r3)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                org.json.JSONArray r24 = X.C90524aI.A0u()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r13 = 0
                java.lang.String r9 = "https://static.whatsapp.net/wa/static/sticker?cat=sticker_search&terms=%s&country=%s"
                java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                r12[r3] = r2     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                X.0wQ r1 = r4.A01     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                r1.A0G()     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                com.whatsapp.Me r1 = r1.A00     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                if (r1 == 0) goto L_0x0097
                java.lang.String r2 = r1.cc     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.lang.String r1 = r1.number     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.lang.String r1 = X.AnonymousClass1M4.A01(r2, r1)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                if (r1 != 0) goto L_0x0099
            L_0x0097:
                java.lang.String r1 = "GB"
            L_0x0099:
                java.lang.Object[] r1 = X.C90524aI.A0x(r1, r12, r5, r6)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.lang.String r1 = X.C90504aG.A0m(r9, r1)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.net.URL r2 = X.C90524aI.A0j(r1)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                r1 = 9
                android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.net.URLConnection r12 = r2.openConnection()     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.lang.String r1 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                X.AnonymousClass00C.A0E(r12, r1)     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                r12.connect()     // Catch:{ Exception -> 0x00f7, all -> 0x00f3 }
                java.io.InputStream r13 = r2.openStream()     // Catch:{ Exception -> 0x00f1 }
                java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00f1 }
                r9.<init>(r13)     // Catch:{ Exception -> 0x00f1 }
                java.io.BufferedReader r15 = X.C90484aE.A0b(r9)     // Catch:{ all -> 0x00ea }
                java.lang.String r2 = X.C05610Qj.A00(r15)     // Catch:{ all -> 0x00e3 }
                r15.close()     // Catch:{ all -> 0x00ea }
                int r1 = r2.length()     // Catch:{ all -> 0x00ea }
                boolean r1 = X.AnonymousClass000.A1R(r1)
                if (r1 == 0) goto L_0x00dd
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00ea }
                r1.<init>(r2)     // Catch:{ all -> 0x00ea }
                r24 = r1
            L_0x00dd:
                r9.close()     // Catch:{ Exception -> 0x00f1 }
                if (r13 == 0) goto L_0x011d
                goto L_0x011a
            L_0x00e3:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x00e5 }
            L_0x00e5:
                r1 = move-exception
                X.C05600Qi.A00(r15, r2)     // Catch:{ all -> 0x00ea }
                throw r1     // Catch:{ all -> 0x00ea }
            L_0x00ea:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x00ec }
            L_0x00ec:
                r1 = move-exception
                X.C05600Qi.A00(r9, r2)     // Catch:{ Exception -> 0x00f1 }
                throw r1     // Catch:{ Exception -> 0x00f1 }
            L_0x00f1:
                r1 = move-exception
                goto L_0x00f9
            L_0x00f3:
                r1 = move-exception
                r12 = r10
                goto L_0x028b
            L_0x00f7:
                r1 = move-exception
                r12 = r10
            L_0x00f9:
                X.0wN r9 = r4.A00     // Catch:{ all -> 0x028a }
                java.lang.String r4 = "globalSearchProvider/query/error"
                java.lang.StringBuilder r2 = X.C36381kD.A11(r1)     // Catch:{ all -> 0x028a }
                X.C90474aD.A1K(r14, r2, r1)     // Catch:{ all -> 0x028a }
                r2.append(r14)     // Catch:{ all -> 0x028a }
                java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x028a }
                java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x028a }
                r9.A0E(r4, r1, r3)     // Catch:{ all -> 0x028a }
                if (r13 == 0) goto L_0x0117
                r13.close()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0117:
                if (r12 == 0) goto L_0x0120
                goto L_0x011d
            L_0x011a:
                r13.close()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x011d:
                r12.disconnect()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0120:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.5uv r14 = r1.A0F     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                int r9 = r24.length()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.5lo r1 = r14.A02     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.0yC r2 = r1.A00     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = 5424(0x1530, float:7.6E-42)
                int r1 = r2.A07(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                int r23 = java.lang.Math.min(r9, r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r2 = 0
            L_0x013e:
                r1 = r23
                if (r2 >= r1) goto L_0x020a
                r1 = r24
                org.json.JSONObject r15 = r1.getJSONObject(r2)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.1YP r12 = r14.A03     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.AnonymousClass00C.A0B(r15)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.AnonymousClass00C.A0D(r15, r3)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r1 = "media-key"
                java.lang.String r22 = r15.getString(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "file-hash"
                java.lang.String r9 = r15.getString(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "enc-file-hash"
                java.lang.String r21 = r15.getString(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "direct-path"
                java.lang.String r20 = r15.getString(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "file-size"
                int r19 = r15.getInt(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "mimetype"
                java.lang.String r13 = r15.getString(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "height"
                int r18 = r15.getInt(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "width"
                int r17 = r15.getInt(r1)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r1 = "sticker-pack-id"
                java.lang.String r16 = X.C63893Lv.A00(r1, r15, r3)     // Catch:{ Exception -> 0x01f6 }
                X.1Av r1 = r12.A00     // Catch:{ Exception -> 0x01f4 }
                java.io.File r12 = r1.A04(r9, r13)     // Catch:{ Exception -> 0x01f4 }
                boolean r1 = r12.exists()     // Catch:{ Exception -> 0x01f4 }
                if (r1 != r5) goto L_0x01ec
                java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x01f4 }
            L_0x0196:
                X.6c4 r1 = new X.6c4     // Catch:{ Exception -> 0x01f4 }
                r27 = r10
                r28 = r10
                r29 = r10
                r30 = r10
                r31 = r10
                r32 = r10
                r33 = r10
                r34 = r10
                r35 = r10
                r36 = r10
                r37 = r10
                r38 = r10
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 0
                r47 = 0
                r25 = r1
                r26 = r10
                r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ Exception -> 0x01f4 }
                r15 = r22
                r1.A0C = r15     // Catch:{ Exception -> 0x01f4 }
                r15 = r21
                r1.A09 = r15     // Catch:{ Exception -> 0x01f4 }
                r1.A0B = r9     // Catch:{ Exception -> 0x01f4 }
                r1.A0E = r9     // Catch:{ Exception -> 0x01f4 }
                r9 = r20
                r1.A07 = r9     // Catch:{ Exception -> 0x01f4 }
                r9 = r19
                r1.A00 = r9     // Catch:{ Exception -> 0x01f4 }
                r1.A0D = r13     // Catch:{ Exception -> 0x01f4 }
                r9 = r18
                r1.A02 = r9     // Catch:{ Exception -> 0x01f4 }
                r9 = r17
                r1.A03 = r9     // Catch:{ Exception -> 0x01f4 }
                r9 = r16
                r1.A0G = r9     // Catch:{ Exception -> 0x01f4 }
                goto L_0x01ee
            L_0x01ec:
                r12 = r10
                goto L_0x0196
            L_0x01ee:
                if (r12 == 0) goto L_0x0201
                r1.A02(r12, r5)     // Catch:{ Exception -> 0x01f4 }
                goto L_0x0201
            L_0x01f4:
                r12 = move-exception
                goto L_0x01f7
            L_0x01f6:
                r12 = move-exception
            L_0x01f7:
                java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r1 = "StickerMaker/createStickerFromJsonObject/couldn't parse json object "
                X.C36321k7.A1J(r12, r1, r9)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = r10
            L_0x0201:
                if (r1 == 0) goto L_0x0206
                r4.add(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0206:
                int r2 = r2 + 1
                goto L_0x013e
            L_0x020a:
                boolean r1 = r4.isEmpty()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                if (r1 == 0) goto L_0x0238
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.List r2 = r2     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.09w r1 = X.C023409w.A00     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.J$0 = r7     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.label = r6     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.Object r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r3, r2, r1, r10, r0)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                if (r1 != r11) goto L_0x0225
                goto L_0x02dd
            L_0x0222:
                X.AnonymousClass0AN.A00(r49)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0225:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r12 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = 0
                java.lang.Long r13 = new java.lang.Long     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r13.<init>(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r17 = 1
                r14 = 2
                r15 = r7
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A0A(r12, r13, r14, r15, r17)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                return r0
            L_0x0238:
                java.util.Set r2 = r3     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.1XQ[] r1 = new X.AnonymousClass1XQ[r3]     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                X.1XQ[] r1 = (X.AnonymousClass1XQ[]) r1     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.String r3 = X.C55532um.A00(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.ArrayList r6 = X.C36321k7.A0J(r4)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.Iterator r2 = r4.iterator()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x024e:
                boolean r1 = r2.hasNext()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                if (r1 == 0) goto L_0x0260
                X.6c4 r1 = X.C90504aG.A0U(r2)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1.A08 = r3     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1.A0M = r5     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r6.add(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                goto L_0x024e
            L_0x0260:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.util.List r2 = r2     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.L$0 = r4     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r0.J$0 = r7     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r1 = 3
                r0.label = r1     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.Object r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r3, r2, r6, r10, r0)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                if (r1 != r11) goto L_0x0275
                goto L_0x02de
            L_0x0272:
                X.AnonymousClass0AN.A00(r49)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0275:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r12 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                int r1 = r4.size()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                long r1 = (long) r1     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                java.lang.Long r13 = new java.lang.Long     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r13.<init>(r1)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                r14 = 2
                r17 = 1
                r15 = r7
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A0A(r12, r13, r14, r15, r17)     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                goto L_0x0017
            L_0x028a:
                r1 = move-exception
            L_0x028b:
                if (r13 == 0) goto L_0x0290
                r13.close()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0290:
                if (r12 == 0) goto L_0x0295
                r12.disconnect()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0295:
                android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
                throw r1     // Catch:{ CancellationException -> 0x02ae, Exception -> 0x0299 }
            L_0x0299:
                r3 = move-exception
                java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
                java.lang.String r1 = "StickerExpressionsViewModel/fetchDynamicStickers/error = "
                X.C36321k7.A1J(r3, r1, r2)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                r1 = 0
                r5 = 0
                r2 = 2
                r3 = r7
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A0A(r0, r1, r2, r3, r5)
                goto L_0x0017
            L_0x02ae:
                r3 = move-exception
                java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
                java.lang.String r1 = "StickerExpressionsViewModel/fetchDynamicStickers/cancel = "
                X.C36321k7.A1J(r3, r1, r2)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                X.05L r1 = r1.A0h
                java.lang.Object r1 = r1.getValue()
                boolean r1 = r1 instanceof X.AnonymousClass56O
                if (r1 == 0) goto L_0x0017
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r5 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                java.util.List r4 = r2
                X.09w r3 = X.C023409w.A00
                r2 = 0
                r0.L$0 = r2
                r1 = 4
                r0.label = r1
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r5, r4, r3, r2, r0)
                if (r0 != r11) goto L_0x0017
                return r11
            L_0x02d7:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            L_0x02dc:
                return r11
            L_0x02dd:
                return r11
            L_0x02de:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, List list, Set set, C023509x r5) {
        super(2, r5);
        this.this$0 = stickerExpressionsViewModel;
        this.$emojis = set;
        this.$localResults = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1(this.this$0, this.$localResults, this.$emojis, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C005502l r4 = stickerExpressionsViewModel.A0c;
            final Set set = this.$emojis;
            final List list = this.$localResults;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchWhatsAppStoreStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
