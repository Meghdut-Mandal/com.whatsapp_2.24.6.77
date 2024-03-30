package X;

import android.view.View;

/* renamed from: X.3YL  reason: invalid class name */
public class AnonymousClass3YL implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass3YL(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        r2 = r4.A06;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            r5 = r11
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0206;
                case 2: goto L_0x011f;
                case 3: goto L_0x013f;
                case 4: goto L_0x0153;
                case 5: goto L_0x0214;
                case 6: goto L_0x022a;
                case 7: goto L_0x0258;
                case 8: goto L_0x01b9;
                case 9: goto L_0x028a;
                case 10: goto L_0x029e;
                case 11: goto L_0x02b6;
                case 12: goto L_0x02cd;
                case 13: goto L_0x030d;
                case 14: goto L_0x01d9;
                case 15: goto L_0x033e;
                case 16: goto L_0x034f;
                case 17: goto L_0x0362;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r10.A01
            X.4mr r1 = (X.C96144mr) r1
            int r7 = r10.A00
            java.lang.Object r6 = r10.A02
            X.6c4 r6 = (X.C135066c4) r6
            java.util.List r2 = r1.A06
            if (r2 != 0) goto L_0x0018
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
        L_0x0018:
            if (r7 < 0) goto L_0x0037
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x0037
            java.lang.Object r0 = r2.get(r7)
            X.6CV r0 = (X.AnonymousClass6CV) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0037
            com.whatsapp.stickers.StickerView r0 = r1.A0D
            if (r0 == 0) goto L_0x0038
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0038
            r1.A0L()
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = X.C96144mr.A02(r1, r7)
            if (r0 != 0) goto L_0x0037
            if (r6 == 0) goto L_0x0062
            X.68B r8 = r1.A04
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0050
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x0062
        L_0x0050:
            java.lang.String r0 = r8.A0G
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r6.A0A
            if (r0 == 0) goto L_0x0068
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0062
            boolean r0 = r8.A01()
            if (r0 != 0) goto L_0x0068
        L_0x0062:
            X.68B r0 = r1.A04
            r1.A0N(r6, r0, r7)
            return
        L_0x0068:
            boolean r0 = r6.A03()
            if (r0 != 0) goto L_0x0062
            X.337 r0 = r1.A05
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = r0.A00
            java.util.Map r0 = r5.A0P
            if (r0 != 0) goto L_0x007d
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.A0P = r0
        L_0x007d:
            X.2kH r0 = r5.A0M
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x008d
            int r1 = r0.A00
            r0.A0D(r3)
            X.4mr r0 = r5.A0L
            r0.A0M(r1, r4)
        L_0x008d:
            X.2kH r2 = new X.2kH
            r2.<init>(r8, r5, r7)
            r5.A0M = r2
            X.0wU r1 = r5.A04
            X.6c4[] r0 = new X.C135066c4[r3]
            r0[r4] = r6
            r1.Box(r2, r0)
            return
        L_0x009e:
            java.lang.Object r7 = r10.A01
            X.1w0 r7 = (X.C40721w0) r7
            java.lang.Object r4 = r10.A02
            X.1yi r4 = (X.C42371yi) r4
            int r5 = r10.A00
            r3 = 0
            X.1w0 r2 = r4.A06     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x00bb }
            int r0 = r4.A04()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x00bb }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x00bb }
        L_0x00bb:
            if (r3 != 0) goto L_0x0037
            org.json.JSONArray r0 = r7.A0B     // Catch:{ JSONException -> 0x00e9 }
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x00e9 }
            X.026 r5 = r7.A02     // Catch:{ JSONException -> 0x00e9 }
            if (r5 == 0) goto L_0x00f3
            java.util.HashMap r3 = X.AnonymousClass001.A0J()     // Catch:{ JSONException -> 0x00e9 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ JSONException -> 0x00e9 }
        L_0x00cf:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x00e9 }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ JSONException -> 0x00e9 }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ JSONException -> 0x00e9 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00e9 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00e9 }
            goto L_0x00cf
        L_0x00e5:
            r5.accept(r3)     // Catch:{ JSONException -> 0x00e9 }
            goto L_0x00f3
        L_0x00e9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : "
            X.C36321k7.A1W(r0, r1, r2)
        L_0x00f3:
            r3 = 0
            X.1w0 r2 = r4.A06     // Catch:{ JSONException -> 0x0106 }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x0106 }
            int r0 = r4.A04()     // Catch:{ JSONException -> 0x0106 }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0106 }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x0106 }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0106 }
        L_0x0106:
            if (r3 != 0) goto L_0x0037
            X.1w0 r2 = r4.A06
            int r1 = r2.A00
            int r0 = r4.A04()
            if (r1 == r0) goto L_0x0037
            r2.A07(r1)
            int r0 = r4.A04()
            r2.A00 = r0
            r2.A07(r0)
            return
        L_0x011f:
            java.lang.Object r0 = r10.A01
            com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r0 = (com.whatsapp.conversation.conversationrow.DynamicButtonsLayout) r0
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            X.3CO r2 = (X.AnonymousClass3CO) r2
            java.util.List r1 = r0.A02
            java.lang.Object r0 = r1.get(r3)
            X.3EY r0 = (X.AnonymousClass3EY) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0037
            java.lang.Object r0 = r1.get(r3)
            X.3EY r0 = (X.AnonymousClass3EY) r0
            r2.A00(r0, r3)
            return
        L_0x013f:
            java.lang.Object r3 = r10.A01
            X.3EY r3 = (X.AnonymousClass3EY) r3
            java.lang.Object r2 = r10.A02
            X.2IR r2 = (X.AnonymousClass2IR) r2
            int r1 = r10.A00
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0037
            X.3CO r0 = r2.A2X
            r0.A00(r3, r1)
            return
        L_0x0153:
            java.lang.Object r4 = r10.A01
            X.1nX r4 = (X.C37991nX) r4
            java.lang.Object r5 = r10.A02
            android.view.View r5 = (android.view.View) r5
            int r3 = r10.A00
            java.lang.Object r1 = r5.getTag()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.jid.UserJid r6 = r4.A00
            boolean r0 = r1.equals(r6)
            r2 = 0
            if (r0 != 0) goto L_0x01b6
            r4.A00 = r1
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r4.A02
            java.util.ArrayList r0 = r0.A0X
            java.lang.Object r0 = r0.get(r3)
            X.3IC r0 = (X.AnonymousClass3IC) r0
            int r1 = r0.A00()
            r0 = 5
            if (r1 == r0) goto L_0x01b6
            r0 = 1
            X.C37991nX.A01(r5, r4, r3, r0)
        L_0x0183:
            if (r6 == 0) goto L_0x0037
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = r4.A02
            android.widget.ListView r0 = r1.A02
            android.view.View r5 = r0.findViewWithTag(r6)
            java.util.ArrayList r3 = r1.A0X
            java.util.Iterator r2 = r3.iterator()
        L_0x0193:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r1 = r2.next()
            X.3IC r1 = (X.AnonymousClass3IC) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0193
        L_0x01a7:
            if (r5 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0037
            int r1 = r3.indexOf(r1)
            r0 = 0
            X.C37991nX.A01(r5, r4, r1, r0)
            return
        L_0x01b4:
            r1 = 0
            goto L_0x01a7
        L_0x01b6:
            r4.A00 = r2
            goto L_0x0183
        L_0x01b9:
            java.lang.Object r0 = r10.A01
            X.4fA r0 = (X.C92934fA) r0
            int r7 = r10.A00
            java.lang.Object r1 = r10.A02
            X.3IF r1 = (X.AnonymousClass3IF) r1
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r0.A04
            if (r0 == 0) goto L_0x0037
            X.2nv r4 = X.C51502nv.CONTACT
            X.141 r5 = r1.A00
            r2 = 0
            X.1Rs r0 = r0.A09
            X.3K5 r1 = new X.3K5
            r6 = r2
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A0D(r1)
            return
        L_0x01d9:
            java.lang.Object r2 = r10.A01
            X.1yk r2 = (X.C42391yk) r2
            java.lang.Object r1 = r10.A02
            X.3JI r1 = (X.AnonymousClass3JI) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4OM r6 = r2.A06
            X.2La r5 = r1.A02
            X.3oA r6 = (X.C76003oA) r6
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.C36431kI.A1P(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A00 = r0
            if (r2 != 0) goto L_0x0037
            X.1d1 r0 = r6.A02
            r0.Bba(r5)
            return
        L_0x0206:
            java.lang.Object r2 = r10.A01
            X.1oy r2 = (X.C38471oy) r2
            java.lang.Object r1 = r10.A02
            X.4PM r1 = (X.AnonymousClass4PM) r1
            int r0 = r10.A00
            X.C38471oy.setData$lambda$2$lambda$0(r2, r1, r0, r11)
            return
        L_0x0214:
            java.lang.Object r0 = r10.A01
            X.8a2 r0 = (X.C175218a2) r0
            java.lang.Object r5 = r10.A02
            X.11F r5 = (X.AnonymousClass11F) r5
            int r6 = r10.A00
            X.1Rx r1 = r0.A03
            com.whatsapp.conversationslist.ViewHolder r3 = r0.A06
            android.widget.ImageView r2 = r3.A07
            r7 = -1
            r4 = r3
            r1.BTi(r2, r3, r4, r5, r6, r7)
            return
        L_0x022a:
            java.lang.Object r2 = r10.A01
            X.8a3 r2 = (X.C175228a3) r2
            java.lang.Object r7 = r10.A02
            X.11F r7 = (X.AnonymousClass11F) r7
            int r8 = r10.A00
            com.whatsapp.conversationslist.ViewHolder r5 = r2.A06
            X.1RJ r1 = r5.A0Y
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x0255
            android.view.View r0 = r1.A01()
            boolean r0 = r0 instanceof X.C87654Pq
            if (r0 == 0) goto L_0x0255
            android.view.View r0 = r1.A01()
            X.4Pq r0 = (X.C87654Pq) r0
            android.view.View r4 = r0.getTransitionView()
        L_0x0250:
            X.1Rx r3 = r2.A0C
            int r9 = r2.A05
            goto L_0x0282
        L_0x0255:
            android.widget.ImageView r4 = r5.A07
            goto L_0x0250
        L_0x0258:
            java.lang.Object r2 = r10.A01
            X.8a4 r2 = (X.C175238a4) r2
            java.lang.Object r7 = r10.A02
            X.11F r7 = (X.AnonymousClass11F) r7
            int r8 = r10.A00
            com.whatsapp.conversationslist.ViewHolder r5 = r2.A06
            X.1RJ r1 = r5.A0Y
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x0287
            android.view.View r0 = r1.A01()
            boolean r0 = r0 instanceof X.C87654Pq
            if (r0 == 0) goto L_0x0287
            android.view.View r0 = r1.A01()
            X.4Pq r0 = (X.C87654Pq) r0
            android.view.View r4 = r0.getTransitionView()
        L_0x027e:
            X.1Rx r3 = r2.A0D
            int r9 = r2.A07
        L_0x0282:
            r6 = r5
            r3.BTi(r4, r5, r6, r7, r8, r9)
            return
        L_0x0287:
            android.widget.ImageView r4 = r5.A07
            goto L_0x027e
        L_0x028a:
            java.lang.Object r1 = r10.A01
            X.55f r1 = (X.C1034055f) r1
            int r3 = r10.A00
            java.lang.Object r2 = r10.A02
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.03v r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.invoke(r0, r2)
            return
        L_0x029e:
            java.lang.Object r2 = r10.A01
            X.55g r2 = (X.C1034155g) r2
            int r1 = r10.A00
            java.lang.Object r3 = r10.A02
            X.55i r3 = (X.C1034355i) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.03v r2 = r2.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int[] r0 = r3.A04
            r2.invoke(r1, r0)
            return
        L_0x02b6:
            java.lang.Object r4 = r10.A01
            X.1wc r4 = (X.C41101wc) r4
            java.lang.Object r3 = r10.A02
            X.1y5 r3 = (X.C41981y5) r3
            int r2 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.gallery.IMultipleMediaSelection"
            X.AnonymousClass00C.A0E(r1, r0)
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r1 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r1
            X.C41101wc.A01(r3, r4, r1, r2)
            return
        L_0x02cd:
            java.lang.Object r3 = r10.A01
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r3 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r3
            java.lang.Object r4 = r10.A02
            int r6 = r10.A00
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.util.ArrayList r0 = r3.A0F
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 == 0) goto L_0x02f5
            X.0wU r0 = r3.A0A
            if (r0 == 0) goto L_0x02f0
            r7 = 13
            X.3vW r2 = new X.3vW
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Bp1(r2)
            return
        L_0x02f0:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x02f5:
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            java.lang.String r2 = X.C36421kH.A0a(r3, r0)
            X.17Y r1 = r3.A00
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.A0F(r2, r0)
            r3.A1c()
            return
        L_0x0308:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x030d:
            java.lang.Object r2 = r10.A01
            X.1yk r2 = (X.C42391yk) r2
            java.lang.Object r1 = r10.A02
            X.3JI r1 = (X.AnonymousClass3JI) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4OM r5 = r2.A06
            X.2La r4 = r1.A02
            X.3oA r5 = (X.C76003oA) r5
            androidx.recyclerview.widget.RecyclerView r0 = r5.A01
            X.0CP r0 = r0.getLayoutManager()
            java.lang.ref.WeakReference r3 = X.AnonymousClass001.A0F(r0)
            X.1vS r0 = r5.A05
            java.lang.ref.WeakReference r2 = X.AnonymousClass001.A0F(r0)
            X.1wG r0 = r5.A04
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            X.4Hm r1 = new X.4Hm
            r1.<init>(r0, r3, r2)
            X.1d1 r0 = r5.A02
            r0.BZJ(r4, r1)
            return
        L_0x033e:
            java.lang.Object r2 = r10.A01
            X.0CZ r2 = (X.AnonymousClass0CZ) r2
            java.lang.Object r1 = r10.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r10.A00
            r1.remove(r0)
            r2.A09(r0)
            return
        L_0x034f:
            java.lang.Object r4 = r10.A01
            X.2eD r4 = (X.C47272eD) r4
            java.lang.Object r3 = r10.A02
            X.2e3 r3 = (X.C47222e3) r3
            int r2 = r10.A00
            X.35b r1 = r4.A01
            r0 = 0
            r1.A00 = r0
            X.C47272eD.A00(r3, r4, r2)
            return
        L_0x0362:
            java.lang.Object r0 = r10.A01
            X.4mp r0 = (X.C96124mp) r0
            java.lang.Object r2 = r10.A02
            X.68B r2 = (X.AnonymousClass68B) r2
            int r1 = r10.A00
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            r0.A1b(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YL.onClick(android.view.View):void");
    }
}
