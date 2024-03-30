package com.whatsapp.stickers.flow;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(StickerPackFlow stickerPackFlow, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0356, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0361, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0237, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.label
            if (r0 != 0) goto L_0x03b2
            X.AnonymousClass0AN.A00(r17)
            com.whatsapp.stickers.flow.StickerPackFlow r3 = r5.this$0
            X.0k2 r2 = new X.0k2
            r2.<init>()
            X.1B6 r1 = r3.A05
            r0 = 1
            java.util.ArrayList r0 = X.AnonymousClass1B6.A00(r1, r0)
            r2.addAll(r0)
            X.1BP r0 = r3.A0B
            java.util.ArrayList r0 = r0.A01()
            r2.addAll(r0)
            X.0k2 r1 = X.AnonymousClass03S.A00(r2)
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r5.this$0
            X.1BD r0 = r0.A06
            java.util.LinkedHashSet r7 = r0.A00()
            com.whatsapp.stickers.flow.StickerPackFlow r6 = r5.this$0
            java.util.ArrayList r4 = X.C36321k7.A0J(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0039:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005f
            X.68B r2 = X.C90514aH.A0g(r3)
            X.1B5 r0 = r6.A07
            java.lang.String r1 = r2.A0F
            X.AnonymousClass00C.A08(r1)
            int r0 = r0.A01(r1)
            r2.A00 = r0
            boolean r0 = r7.contains(r1)
            r2.A07 = r0
            X.5Ke r0 = new X.5Ke
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0039
        L_0x005f:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r4.iterator()
        L_0x0067:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Ke r0 = (X.AnonymousClass5Ke) r0
            X.68B r0 = r0.A00
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x0067
            r3.add(r1)
            goto L_0x0067
        L_0x007e:
            r0 = 20
            java.util.List r4 = X.C163907qx.A00(r3, r0)
            com.whatsapp.stickers.flow.StickerPackFlow r9 = r5.this$0
            X.0yC r1 = r9.A01
            r0 = 7640(0x1dd8, float:1.0706E-41)
            boolean r0 = X.AnonymousClass1Ax.A03(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x03a9
            java.util.ArrayList r2 = X.C36351kA.A0z(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x0099:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.next()
            X.65y r0 = (X.C1268665y) r0
            java.lang.String r0 = r0.A01()
            r2.add(r0)
            goto L_0x0099
        L_0x00ad:
            java.util.Set r8 = X.C007103b.A0f(r2)
            X.1B5 r3 = r9.A07
            X.C18740tg.A00()
            X.1B7 r0 = r3.A04
            X.00T r0 = r0.A01
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r0)
            java.lang.String r7 = "pref_key_preview_ids"
            r1 = 0
            java.lang.String r2 = r0.getString(r7, r5)
            if (r2 == 0) goto L_0x00d2
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 0
            java.util.List r1 = X.AnonymousClass099.A0L(r2, r1, r0)
        L_0x00d2:
            if (r1 != 0) goto L_0x0250
            r10 = 0
        L_0x00d5:
            if (r10 == 0) goto L_0x00dd
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00e8
        L_0x00dd:
            X.1Bk r2 = r9.A08
            X.1Bf r3 = r2.A03
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x010b
            r10 = r5
        L_0x00e8:
            if (r10 == 0) goto L_0x03a9
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r10.iterator()
        L_0x00f2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0373
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.68B r0 = (X.AnonymousClass68B) r0
            java.lang.String r0 = r0.A0F
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00f2
            r3.add(r1)
            goto L_0x00f2
        L_0x010b:
            X.1BR r11 = r2.A02     // Catch:{ 1AR -> 0x0244 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=suggest_sticker_packs&lg="
            r6.append(r0)     // Catch:{ 1AR -> 0x0244 }
            X.0ts r0 = r11.A05     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = r0.A09()     // Catch:{ 1AR -> 0x0244 }
            r6.append(r0)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = "&pack_num_limit=5&num_in_pack=3"
            r6.append(r0)     // Catch:{ 1AR -> 0x0244 }
            X.0yC r1 = r11.A06     // Catch:{ 1AR -> 0x0244 }
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = r1.A09(r0)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r6)     // Catch:{ 1AR -> 0x0244 }
            X.1Be r0 = r11.A08     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r6 = r0.A01(r1)     // Catch:{ 1AR -> 0x0244 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ 1AR -> 0x0244 }
            X.1B7 r0 = r11.A0A     // Catch:{ 1AR -> 0x0244 }
            X.00T r10 = r0.A01     // Catch:{ 1AR -> 0x0244 }
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r10)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r9 = "pref_key_etag"
            java.lang.String r0 = r0.getString(r9, r5)     // Catch:{ 1AR -> 0x0244 }
            r1 = 0
            X.5rA r6 = X.AnonymousClass1BR.A00(r5, r11, r6, r0)     // Catch:{ 1AR -> 0x0244 }
            if (r6 == 0) goto L_0x015c
            java.lang.String r1 = r6.A00     // Catch:{ 1AR -> 0x0244 }
            if (r1 == 0) goto L_0x0159
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r10)     // Catch:{ 1AR -> 0x0244 }
            X.C36341k9.A0x(r0, r9, r1)     // Catch:{ 1AR -> 0x0244 }
        L_0x0159:
            java.util.List r1 = r6.A01     // Catch:{ 1AR -> 0x0244 }
            goto L_0x0161
        L_0x015c:
            java.lang.String r0 = "StickerPackNetworkProvider/getPreviewStickerPacksFromStore unable to get preview packs"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 1AR -> 0x0244 }
        L_0x0161:
            if (r1 == 0) goto L_0x01ab
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ 1AR -> 0x0244 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ 1AR -> 0x0244 }
        L_0x016b:
            boolean r0 = r9.hasNext()     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x01ac
            X.68B r6 = X.C90514aH.A0g(r9)     // Catch:{ 1AR -> 0x0244 }
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = r2.A04     // Catch:{ 1AR -> 0x0244 }
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ 1AR -> 0x0244 }
            X.6zA r0 = new X.6zA     // Catch:{ 1AR -> 0x0244 }
            r0.<init>()     // Catch:{ 1AR -> 0x0244 }
            X.5cZ r1 = com.whatsapp.stickers.stickerpack.StickerPackDownloader.A00(r6, r0, r1)     // Catch:{ 1AR -> 0x0244 }
            boolean r0 = r1 instanceof X.AnonymousClass5KY     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x018d
            X.5KY r1 = (X.AnonymousClass5KY) r1     // Catch:{ 1AR -> 0x0244 }
            X.68B r0 = r1.A00     // Catch:{ 1AR -> 0x0244 }
            goto L_0x01a0
        L_0x018d:
            boolean r0 = r1 instanceof X.AnonymousClass5KX     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x01a6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchPreviewStickerPacks unable to get stickers for "
            r1.append(r0)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = r6.A0F     // Catch:{ 1AR -> 0x0244 }
            X.C36341k9.A1O(r1, r0)     // Catch:{ 1AR -> 0x0244 }
            r0 = r5
        L_0x01a0:
            if (r0 == 0) goto L_0x016b
            r10.add(r0)     // Catch:{ 1AR -> 0x0244 }
            goto L_0x016b
        L_0x01a6:
            X.0jS r0 = X.C36441kJ.A18()     // Catch:{ 1AR -> 0x0244 }
            throw r0     // Catch:{ 1AR -> 0x0244 }
        L_0x01ab:
            r10 = r5
        L_0x01ac:
            if (r10 == 0) goto L_0x023f
            X.1B5 r9 = r2.A05     // Catch:{ 1AR -> 0x0244 }
            X.C18740tg.A00()     // Catch:{ 1AR -> 0x0244 }
            X.1B7 r2 = r9.A04     // Catch:{ 1AR -> 0x0244 }
            java.util.ArrayList r6 = X.C36351kA.A0z(r10)     // Catch:{ 1AR -> 0x0244 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ 1AR -> 0x0244 }
        L_0x01bd:
            boolean r0 = r1.hasNext()     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x01d0
            X.68B r0 = X.C90514aH.A0g(r1)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r0 = r0.A0F     // Catch:{ 1AR -> 0x0244 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 1AR -> 0x0244 }
            r6.add(r0)     // Catch:{ 1AR -> 0x0244 }
            goto L_0x01bd
        L_0x01d0:
            X.00T r0 = r2.A01     // Catch:{ 1AR -> 0x0244 }
            android.content.SharedPreferences$Editor r2 = X.C36351kA.A0A(r0)     // Catch:{ 1AR -> 0x0244 }
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r1, r0, r0, r6, r5)     // Catch:{ 1AR -> 0x0244 }
            X.C36341k9.A0x(r2, r7, r0)     // Catch:{ 1AR -> 0x0244 }
            X.1B6 r0 = r9.A03     // Catch:{ 1AR -> 0x0244 }
            X.005 r0 = r0.A00     // Catch:{ 1AR -> 0x0244 }
            X.1M0 r7 = X.C90494aF.A0K(r0)     // Catch:{ 1AR -> 0x0244 }
            X.71s r6 = r7.B1k()     // Catch:{ all -> 0x0238 }
            java.util.Iterator r2 = r10.iterator()     // Catch:{ all -> 0x0231 }
        L_0x01f1:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x0204
            X.68B r1 = X.C90514aH.A0g(r2)     // Catch:{ all -> 0x0231 }
            X.14e r0 = r7.A02     // Catch:{ all -> 0x0231 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0231 }
            X.AnonymousClass1B6.A03(r0, r1)     // Catch:{ all -> 0x0231 }
            goto L_0x01f1
        L_0x0204:
            r6.A00()     // Catch:{ all -> 0x0231 }
            r6.close()     // Catch:{ all -> 0x0238 }
            r7.close()     // Catch:{ 1AR -> 0x0244 }
            java.util.Iterator r6 = r10.iterator()     // Catch:{ 1AR -> 0x0244 }
        L_0x0211:
            boolean r0 = r6.hasNext()     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x023f
            X.68B r2 = X.C90514aH.A0g(r6)     // Catch:{ 1AR -> 0x0244 }
            java.util.List r0 = r2.A05     // Catch:{ 1AR -> 0x0244 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 1AR -> 0x0244 }
            boolean r0 = X.C36401kF.A1a(r0)     // Catch:{ 1AR -> 0x0244 }
            if (r0 == 0) goto L_0x0211
            X.1Aq r1 = r9.A05     // Catch:{ 1AR -> 0x0244 }
            java.util.List r0 = r2.A05     // Catch:{ 1AR -> 0x0244 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 1AR -> 0x0244 }
            r1.A03(r0)     // Catch:{ 1AR -> 0x0244 }
            goto L_0x0211
        L_0x0231:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0238 }
            throw r0     // Catch:{ all -> 0x0238 }
        L_0x0238:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x023a }
        L_0x023a:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ 1AR -> 0x0244 }
            throw r0     // Catch:{ 1AR -> 0x0244 }
        L_0x023f:
            r3.A00()     // Catch:{ 1AR -> 0x0244 }
            goto L_0x00e8
        L_0x0244:
            r1 = move-exception
            java.lang.String r0 = "StickerStoreInventoryManager/fetchPreviewStickerPacks failed"
            com.whatsapp.util.Log.e(r0, r1)
            r3.A01()
            r10 = r5
            goto L_0x00e8
        L_0x0250:
            X.1B6 r6 = r3.A03
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r1.toArray(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z
            r0.<init>(r2, r1)
            X.0k2 r3 = new X.0k2
            r3.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x026d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x036d
            java.lang.Object r12 = r15.next()
            java.lang.String[] r12 = (java.lang.String[]) r12
            int r0 = r12.length
            java.lang.String r2 = X.AnonymousClass1M2.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SELECT id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs WHERE "
            r1.append(r0)
            java.lang.String r0 = "id IN "
            java.lang.String r11 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.AnonymousClass00C.A08(r11)
            java.lang.String r1 = "getDownloadablePackByIds/QUERY_STICKER_PACK_IDS"
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.005 r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0362 }
            X.1M0 r10 = X.C90484aE.A0W(r0)     // Catch:{ IllegalArgumentException -> 0x0362 }
            X.14e r0 = r10.A02     // Catch:{ all -> 0x035b }
            android.database.Cursor r11 = r0.A09(r11, r1, r12)     // Catch:{ all -> 0x035b }
        L_0x02a2:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x034d
            X.65S r12 = new X.65S     // Catch:{ all -> 0x0354 }
            r12.<init>()     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "id"
            java.lang.String r14 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "name"
            java.lang.String r13 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "publisher"
            java.lang.String r1 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            if (r14 == 0) goto L_0x033e
            int r0 = r14.length()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x033e
            if (r13 == 0) goto L_0x033e
            int r0 = r13.length()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x033e
            if (r1 == 0) goto L_0x033e
            int r0 = r1.length()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x033e
            r12.A0E = r14     // Catch:{ all -> 0x0354 }
            r12.A0G = r13     // Catch:{ all -> 0x0354 }
            r12.A0I = r1     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A03 = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "size"
            int r0 = X.C36351kA.A03(r11, r0)     // Catch:{ all -> 0x0354 }
            long r0 = (long) r0     // Catch:{ all -> 0x0354 }
            r12.A01 = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "tray_image_id"
            java.lang.String r0 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A0K = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "image_data_hash"
            java.lang.String r0 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A0F = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "tray_image_preview_id"
            java.lang.String r0 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A0L = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "animated_pack"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0354 }
            boolean r0 = X.C54282sh.A00(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A0O = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "lottie_pack"
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0354 }
            boolean r0 = X.C54282sh.A00(r11, r0)     // Catch:{ all -> 0x0354 }
            r12.A0U = r0     // Catch:{ all -> 0x0354 }
            java.lang.String r0 = "preview_image_id_array"
            java.lang.String r13 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0354 }
            if (r13 == 0) goto L_0x0339
            int r0 = r13.length()     // Catch:{ all -> 0x0354 }
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0354 }
            r0 = 0
            java.util.List r0 = X.AnonymousClass099.A0L(r13, r1, r0)     // Catch:{ all -> 0x0354 }
            r12.A0M = r0     // Catch:{ all -> 0x0354 }
        L_0x0339:
            X.68B r0 = r12.A00()     // Catch:{ all -> 0x0354 }
            goto L_0x033f
        L_0x033e:
            r0 = 0
        L_0x033f:
            if (r0 == 0) goto L_0x0346
            r2.add(r0)     // Catch:{ all -> 0x0354 }
            goto L_0x02a2
        L_0x0346:
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0354 }
            goto L_0x02a2
        L_0x034d:
            r11.close()     // Catch:{ all -> 0x035b }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x0362 }
            goto L_0x0368
        L_0x0354:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0356 }
        L_0x0356:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ all -> 0x035b }
            throw r0     // Catch:{ all -> 0x035b }
        L_0x035b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x035d }
        L_0x035d:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0362 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0362 }
        L_0x0362:
            r1 = move-exception
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDownloadableTable/exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0368:
            r3.addAll(r2)
            goto L_0x026d
        L_0x036d:
            X.0k2 r10 = X.AnonymousClass03S.A00(r3)
            goto L_0x00d5
        L_0x0373:
            java.util.Iterator r2 = r3.iterator()
        L_0x0377:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0389
            X.68B r1 = X.C90514aH.A0g(r2)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A00 = r0
            r0 = 1
            r1.A08 = r0
            goto L_0x0377
        L_0x0389:
            java.util.ArrayList r5 = X.C36351kA.A0z(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0391:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a9
            X.68B r2 = X.C90514aH.A0g(r3)
            java.lang.String r1 = r2.A0F
            X.AnonymousClass00C.A08(r1)
            X.5Ke r0 = new X.5Ke
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0391
        L_0x03a9:
            if (r5 != 0) goto L_0x03ad
            X.09w r5 = X.C023409w.A00
        L_0x03ad:
            java.util.ArrayList r0 = X.C007103b.A0S(r5, r4)
            return r0
        L_0x03b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
