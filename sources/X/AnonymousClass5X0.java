package X;

import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5X0  reason: invalid class name */
public class AnonymousClass5X0 extends C03030Cw implements C006302t {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5X0(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0124;
                case 2: goto L_0x011b;
                case 3: goto L_0x0112;
                case 4: goto L_0x0109;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00ca;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00af;
                case 15: goto L_0x00a6;
                case 16: goto L_0x009d;
                case 17: goto L_0x0094;
                case 18: goto L_0x008b;
                case 19: goto L_0x0083;
                case 20: goto L_0x007b;
                case 21: goto L_0x0073;
                case 22: goto L_0x006b;
                case 23: goto L_0x0063;
                case 24: goto L_0x0063;
                case 25: goto L_0x005b;
                case 26: goto L_0x0053;
                case 27: goto L_0x004b;
                case 28: goto L_0x0043;
                case 29: goto L_0x003b;
                case 30: goto L_0x0033;
                case 31: goto L_0x002b;
                case 32: goto L_0x0023;
                case 33: goto L_0x001b;
                case 34: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment> r3 = com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment.class
            r1 = 1
            java.lang.String r4 = "updateMaxWidthOnLayout"
            java.lang.String r5 = "updateMaxWidthOnLayout(Landroid/view/View;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.whatsapp.waffle.wfac.ui.WfacBanActivity> r3 = com.whatsapp.waffle.wfac.ui.WfacBanActivity.class
            r1 = 1
            java.lang.String r4 = "transitionToScreen"
            java.lang.String r5 = "transitionToScreen(I)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<com.whatsapp.media.utwonet.UTwoNetViewModel> r3 = com.whatsapp.media.utwonet.UTwoNetViewModel.class
            r1 = 1
            java.lang.String r4 = "onErrorFetchModel"
            java.lang.String r5 = "onErrorFetchModel(Lcom/whatsapp/ml/MLModelFetchError;)V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<com.whatsapp.media.utwonet.UTwoNetViewModel> r3 = com.whatsapp.media.utwonet.UTwoNetViewModel.class
            r1 = 1
            java.lang.String r4 = "onSuccessFetchModel"
            java.lang.String r5 = "onSuccessFetchModel(Ljava/lang/String;)V"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            r1 = 1
            java.lang.String r4 = "onClearHistorySectionClicked"
            java.lang.String r5 = "onClearHistorySectionClicked(I)V"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            r1 = 1
            java.lang.String r4 = "onStickerHeaderSelected"
            java.lang.String r5 = "onStickerHeaderSelected(Ljava/lang/String;)V"
            goto L_0x000d
        L_0x003b:
            java.lang.Class<com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.class
            r1 = 1
            java.lang.String r4 = "onReportClicked"
            java.lang.String r5 = "onReportClicked(Lcom/whatsapp/funstickers/data/model/FunStickerModel;)V"
            goto L_0x000d
        L_0x0043:
            java.lang.Class<X.4fA> r3 = X.C92934fA.class
            r1 = 1
            java.lang.String r4 = "refreshStatus"
            java.lang.String r5 = "refreshStatus(Ljava/util/Map;)V"
            goto L_0x000d
        L_0x004b:
            java.lang.Class<X.4fA> r3 = X.C92934fA.class
            r1 = 1
            java.lang.String r4 = "setSuggestionsVisibility"
            java.lang.String r5 = "setSuggestionsVisibility(Z)V"
            goto L_0x000d
        L_0x0053:
            java.lang.Class<X.4fA> r3 = X.C92934fA.class
            r1 = 1
            java.lang.String r4 = "handleSuggestions"
            java.lang.String r5 = "handleSuggestions(Ljava/util/List;)V"
            goto L_0x000d
        L_0x005b:
            java.lang.Class<X.4fA> r3 = X.C92934fA.class
            r1 = 1
            java.lang.String r4 = "setLoadingVisibility"
            java.lang.String r5 = "setLoadingVisibility(Z)V"
            goto L_0x000d
        L_0x0063:
            java.lang.Class<X.4em> r3 = X.C92814em.class
            r1 = 1
            java.lang.String r4 = "setupVoiceChatBanner"
            java.lang.String r5 = "setupVoiceChatBanner(Z)V"
            goto L_0x000d
        L_0x006b:
            java.lang.Class<X.4fT> r3 = X.C93034fT.class
            r1 = 1
            java.lang.String r4 = "bindAudioLevel"
            java.lang.String r5 = "bindAudioLevel(I)V"
            goto L_0x000d
        L_0x0073:
            java.lang.Class<X.4fT> r3 = X.C93034fT.class
            r1 = 1
            java.lang.String r4 = "bindViewState"
            java.lang.String r5 = "bindViewState(Lcom/whatsapp/calling/lightweightcalling/viewmodel/AudioChatCallingBannerViewState;)V"
            goto L_0x000d
        L_0x007b:
            java.lang.Class<com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog> r3 = com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.class
            r1 = 1
            java.lang.String r4 = "onViewStateChanged"
            java.lang.String r5 = "onViewStateChanged(Lcom/whatsapp/calling/lightweightcalling/viewmodel/AudioChatBottomSheetViewState;)V"
            goto L_0x000d
        L_0x0083:
            java.lang.Class<com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog> r3 = com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.class
            r1 = 1
            java.lang.String r4 = "onIsCallActiveChanged"
            java.lang.String r5 = "onIsCallActiveChanged(Z)V"
            goto L_0x000d
        L_0x008b:
            java.lang.Class<com.whatsapp.calling.callrating.CallRatingBottomSheet> r3 = com.whatsapp.calling.callrating.CallRatingBottomSheet.class
            r1 = 1
            java.lang.String r4 = "setTitle"
            java.lang.String r5 = "setTitle(I)V"
            goto L_0x000d
        L_0x0094:
            java.lang.Class<X.5aM> r3 = X.C110245aM.class
            r1 = 1
            java.lang.String r4 = "fromJSON"
            java.lang.String r5 = "fromJSON(Lorg/json/JSONObject;)Lcom/whatsapp/businesssearch/storage/recentsearch/RecentSearchQuery;"
            goto L_0x000d
        L_0x009d:
            java.lang.Class<X.5aL> r3 = X.C110235aL.class
            r1 = 1
            java.lang.String r4 = "fromJSON"
            java.lang.String r5 = "fromJSON(Lorg/json/JSONObject;)Lcom/whatsapp/businesssearch/storage/recentsearch/RecentSearchBusiness;"
            goto L_0x000d
        L_0x00a6:
            java.lang.Class<X.4kp> r3 = X.C95404kp.class
            r1 = 1
            java.lang.String r4 = "onBusinessListItemsUpdated"
            java.lang.String r5 = "onBusinessListItemsUpdated(Lcom/whatsapp/businessdirectory/view/delegate/BusinessListItemDelegate$BusinessListItemData;)V"
            goto L_0x000d
        L_0x00af:
            java.lang.Class<X.4ki> r3 = X.C95374ki.class
            r1 = 1
            java.lang.String r4 = "notifyBusinessApiBrowseDataChange"
            java.lang.String r5 = "notifyBusinessApiBrowseDataChange(Lcom/whatsapp/businessapisearch/view/delegate/BusinessApiBrowseListItemDelegate$BusinessApiBrowseData;)V"
            goto L_0x000d
        L_0x00b8:
            java.lang.Class<com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment> r3 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.class
            r1 = 1
            java.lang.String r4 = "onBusinessProfileClickEvent"
            java.lang.String r5 = "onBusinessProfileClickEvent(Lcom/whatsapp/contact/MinifiedBusinessProfile;)V"
            goto L_0x000d
        L_0x00c1:
            java.lang.Class<com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment> r3 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.class
            r1 = 1
            java.lang.String r4 = "onViewEvent"
            java.lang.String r5 = "onViewEvent(I)V"
            goto L_0x000d
        L_0x00ca:
            java.lang.Class<X.7j5> r3 = X.C159267j5.class
            r1 = 1
            java.lang.String r4 = "toJson"
            java.lang.String r5 = "toJson(Ljava/lang/Object;)Lorg/json/JSONObject;"
            goto L_0x000d
        L_0x00d3:
            java.lang.Class<X.7j5> r3 = X.C159267j5.class
            r1 = 1
            java.lang.String r4 = "fromJson"
            java.lang.String r5 = "fromJson(Lorg/json/JSONObject;)Ljava/lang/Object;"
            goto L_0x000d
        L_0x00dc:
            java.lang.Class<X.9eh> r3 = X.C199099eh.class
            r1 = 1
            java.lang.String r4 = "needRequestProfilePhoto"
            java.lang.String r5 = "needRequestProfilePhoto(Lcom/whatsapp/jid/UserJid;)Z"
            goto L_0x000d
        L_0x00e5:
            java.lang.Class<X.9eh> r3 = X.C199099eh.class
            r1 = 1
            java.lang.String r4 = "shouldDownloadProfilePhoto"
            java.lang.String r5 = "shouldDownloadProfilePhoto(Lcom/whatsapp/messaging/ProfilePhoto;)Z"
            goto L_0x000d
        L_0x00ee:
            java.lang.Class<X.4f8> r3 = X.C92924f8.class
            r1 = 1
            java.lang.String r4 = "onAIEmbodimentTriggerChanged"
            java.lang.String r5 = "onAIEmbodimentTriggerChanged(I)V"
            goto L_0x000d
        L_0x00f7:
            java.lang.Class<X.4f8> r3 = X.C92924f8.class
            r1 = 1
            java.lang.String r4 = "onBotAvatarMetadataChanged"
            java.lang.String r5 = "onBotAvatarMetadataChanged(Lcom/whatsapp/protocol/BotAvatarMetadata;)V"
            goto L_0x000d
        L_0x0100:
            java.lang.Class<X.4f8> r3 = X.C92924f8.class
            r1 = 1
            java.lang.String r4 = "onBotProfileChanged"
            java.lang.String r5 = "onBotProfileChanged(Lcom/whatsapp/BotProfile;)V"
            goto L_0x000d
        L_0x0109:
            java.lang.Class<com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment> r3 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.class
            r1 = 1
            java.lang.String r4 = "updateUi"
            java.lang.String r5 = "updateUi(Lcom/whatsapp/biz/catalog/view/variants/VariantsCarouselFragmentUiState;)V"
            goto L_0x000d
        L_0x0112:
            java.lang.Class<X.4mh> r3 = X.C96044mh.class
            r1 = 1
            java.lang.String r4 = "onViewItemClick"
            java.lang.String r5 = "onViewItemClick(I)V"
            goto L_0x000d
        L_0x011b:
            java.lang.Class<com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet> r3 = com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet.class
            r1 = 1
            java.lang.String r4 = "closeWithResult"
            java.lang.String r5 = "closeWithResult(I)V"
            goto L_0x000d
        L_0x0124:
            java.lang.Class<X.4mc> r3 = X.C95994mc.class
            r1 = 1
            java.lang.String r4 = "onSelected"
            java.lang.String r5 = "onSelected(I)V"
            goto L_0x000d
        L_0x012d:
            java.lang.Class<X.9gt> r3 = X.C200219gt.class
            r1 = 1
            java.lang.String r4 = "handleHardwareStatusEvent"
            java.lang.String r5 = "handleHardwareStatusEvent(I)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X0.<init>(java.lang.Object, int):void");
    }

    public static AnonymousClass5X0 A02(Object obj, int i) {
        return new AnonymousClass5X0(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02fd, code lost:
        if (r2 != 39319094) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0305, code lost:
        if (r3.equals("queue_duration_based") == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0307, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030f, code lost:
        if (r3.equals("queue_flush_append") == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0311, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0313, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x031a, code lost:
        if (r5.has("queue_duration_threshold") == false) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x031c, code lost:
        r3 = r5.getInt("queue_duration_threshold");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0320, code lost:
        r2 = java.lang.Integer.valueOf(r13);
        X.AnonymousClass00C.A0B(r4);
        r8.put(r2, new X.AnonymousClass6BA(r4, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0330, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0332, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0b18, code lost:
        if (X.C199099eh.A00(r3, r2) != false) goto L_0x0b1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0ba7, code lost:
        r1.A00 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0bad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0bb0, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0bb4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ba, code lost:
        r0 = r1.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d6, code lost:
        if (r0 != false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d8, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d9, code lost:
        r4 = r5.getString("next_state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02e5, code lost:
        if (r5.has("transition_policy") == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e7, code lost:
        r3 = A00("transition_policy", r10, r5);
        r2 = r3.hashCode();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f3, code lost:
        if (r2 == -1411068134) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02f8, code lost:
        if (r2 == -212059869) goto L_0x0309;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r35) {
        /*
            r34 = this;
            r0 = r35
            r7 = r34
            int r1 = r7.A00
            switch(r1) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0017;
                case 2: goto L_0x0056;
                case 3: goto L_0x0088;
                case 4: goto L_0x00a3;
                case 5: goto L_0x0133;
                case 6: goto L_0x0457;
                case 7: goto L_0x051f;
                case 8: goto L_0x0afd;
                case 9: goto L_0x0b20;
                case 10: goto L_0x0b37;
                case 11: goto L_0x0b42;
                case 12: goto L_0x0557;
                case 13: goto L_0x0573;
                case 14: goto L_0x05d9;
                case 15: goto L_0x068e;
                case 16: goto L_0x0b4b;
                case 17: goto L_0x0b82;
                case 18: goto L_0x07d0;
                case 19: goto L_0x07e1;
                case 20: goto L_0x07f2;
                case 21: goto L_0x0913;
                case 22: goto L_0x0920;
                case 23: goto L_0x0009;
                case 24: goto L_0x0009;
                case 25: goto L_0x093a;
                case 26: goto L_0x0947;
                case 27: goto L_0x0954;
                case 28: goto L_0x0961;
                case 29: goto L_0x09a2;
                case 30: goto L_0x09be;
                case 31: goto L_0x09df;
                case 32: goto L_0x09f6;
                case 33: goto L_0x0a44;
                case 34: goto L_0x0a53;
                case 35: goto L_0x0aa9;
                default: goto L_0x0009;
            }
        L_0x0009:
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r0 = r7.receiver
            X.4em r0 = (X.C92814em) r0
            r0.setupVoiceChatBanner(r1)
        L_0x0014:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        L_0x0017:
            int r3 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r7.receiver
            X.4mc r0 = (X.C95994mc) r0
            X.7fc r2 = r0.A02
            X.6bX r1 = r0.A03
            X.6bJ r0 = r0.A01
            r2.BKz(r0, r1, r3)
            goto L_0x0014
        L_0x0029:
            int r4 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r3 = r7.receiver
            X.9gt r3 = (X.C200219gt) r3
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "handleHardwareStatusEvent "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r4)
            java.lang.String r0 = "sup:MediaStreamController"
            r2.A01(r0, r1)
            java.util.Map r0 = r3.A0J
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r0)
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            r0.getValue()
            goto L_0x0048
        L_0x0056:
            int r4 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r3 = r7.receiver
            com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet r3 = (com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x0065
            X.0CZ r1 = r0.A0G
        L_0x0065:
            boolean r0 = r1 instanceof X.C95994mc
            if (r0 == 0) goto L_0x0075
            X.4mc r1 = (X.C95994mc) r1
            if (r1 == 0) goto L_0x0075
            int r0 = r1.A00
            if (r0 != r4) goto L_0x0075
        L_0x0071:
            r3.A1b()
            goto L_0x0014
        L_0x0075:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "text.option.selection.result"
            r2.putInt(r0, r4)
            X.01z r1 = r3.A0l()
            java.lang.String r0 = "text.option.selection.request.key"
            r1.A0o(r0, r2)
            goto L_0x0071
        L_0x0088:
            int r4 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r3 = r7.receiver
            X.4mh r3 = (X.C96044mh) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0014
            int r0 = r3.A00
            if (r0 == r4) goto L_0x0014
            X.7fc r2 = r3.A02
            X.6bX r1 = r3.A03
            X.6bJ r0 = r3.A01
            r2.BKz(r0, r1, r4)
            goto L_0x0014
        L_0x00a3:
            X.68e r0 = (X.C1274068e) r0
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            java.lang.Object r6 = r7.receiver
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment r6 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment) r6
            java.util.List r2 = r0.A00
            boolean r0 = r2.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r2.get(r3)
            X.6Cp r0 = (X.C128526Cp) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00e2
            X.6Dx r0 = r6.A01
            if (r0 == 0) goto L_0x00c9
            r0.A00()
        L_0x00c9:
            int r0 = r2.size()
            if (r0 <= r1) goto L_0x0014
            java.lang.Object r0 = r2.get(r1)
            X.6Cp r0 = (X.C128526Cp) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x010c
            X.6Dx r0 = r6.A02
            if (r0 == 0) goto L_0x0014
            r0.A00()
            goto L_0x0014
        L_0x00e2:
            X.6Dx r5 = r6.A01
            java.lang.Object r0 = r2.get(r3)
            X.6Cp r0 = (X.C128526Cp) r0
            int r9 = r0.A00
            java.lang.Object r0 = X.C007103b.A0P(r2, r1)
            X.6Cp r0 = (X.C128526Cp) r0
            if (r0 == 0) goto L_0x010a
            X.6bJ r4 = r0.A01
        L_0x00f6:
            java.lang.Object r0 = r2.get(r3)
            X.6Cp r0 = (X.C128526Cp) r0
            X.6bX r7 = r0.A02
            java.lang.Object r0 = r2.get(r3)
            X.6Cp r0 = (X.C128526Cp) r0
            java.lang.Integer r8 = r0.A03
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x00c9
        L_0x010a:
            r4 = 0
            goto L_0x00f6
        L_0x010c:
            X.6Dx r5 = r6.A02
            java.lang.Object r0 = r2.get(r1)
            X.6Cp r0 = (X.C128526Cp) r0
            int r9 = r0.A00
            java.lang.Object r0 = r2.get(r3)
            X.6Cp r0 = (X.C128526Cp) r0
            X.6bJ r4 = r0.A01
            java.lang.Object r0 = r2.get(r1)
            X.6Cp r0 = (X.C128526Cp) r0
            X.6bX r7 = r0.A02
            java.lang.Object r0 = r2.get(r1)
            X.6Cp r0 = (X.C128526Cp) r0
            java.lang.Integer r8 = r0.A03
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0014
        L_0x0133:
            X.6E1 r0 = (X.AnonymousClass6E1) r0
            java.lang.Object r1 = r7.receiver
            X.4f8 r1 = (X.C92924f8) r1
            if (r0 == 0) goto L_0x0014
            java.lang.String r3 = r0.A04
            if (r3 == 0) goto L_0x0014
            X.6WA r7 = r1.A03
            if (r7 != 0) goto L_0x014a
            java.lang.String r0 = "clientOrchestrator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014a:
            org.json.JSONObject r2 = X.C36441kJ.A1C(r3)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r1 = "data"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x016f
            org.json.JSONObject r0 = X.C36441kJ.A1C(r3)     // Catch:{ JSONException -> 0x041d }
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r1 = "aiagent_gen_behavior_graph_from_embodiment"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x041d }
            if (r0 != 0) goto L_0x0168
            java.lang.String r1 = "aiagent_gen_behavior_graph"
        L_0x0168:
            org.json.JSONObject r2 = r2.getJSONObject(r1)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r2)     // Catch:{ JSONException -> 0x041d }
        L_0x016f:
            java.lang.String r1 = "persona_profile"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x01d4
            java.lang.String r28 = r2.getString(r1)     // Catch:{ JSONException -> 0x041d }
        L_0x017b:
            java.lang.String r0 = "version"
            int r33 = r2.getInt(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "initial_status"
            org.json.JSONObject r1 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "state"
            java.lang.String r5 = X.C90474aD.A0e(r0, r1)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "action"
            java.lang.String r0 = X.C90474aD.A0e(r0, r1)     // Catch:{ JSONException -> 0x041d }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x041d }
            java.lang.String r4 = X.C36431kI.A1D(r10, r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "sentiment"
            java.lang.String r3 = A00(r0, r10, r1)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "intensity"
            java.lang.String r1 = A00(r0, r10, r1)     // Catch:{ JSONException -> 0x041d }
            X.6C9 r27 = new X.6C9     // Catch:{ JSONException -> 0x041d }
            r0 = r27
            r0.<init>(r5, r4, r3, r1)     // Catch:{ JSONException -> 0x041d }
            X.09w r30 = X.C023409w.A00     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "prefetch_videos"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ JSONException -> 0x041d }
            java.util.ArrayList r31 = A01(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "persona_global_default_sentiment"
            java.lang.String r29 = r2.getString(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "states"
            org.json.JSONArray r26 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r26)     // Catch:{ JSONException -> 0x041d }
            java.util.LinkedHashMap r25 = X.C36431kI.A1G()     // Catch:{ JSONException -> 0x041d }
            int r24 = r26.length()     // Catch:{ JSONException -> 0x041d }
            r9 = 0
            goto L_0x01d7
        L_0x01d4:
            java.lang.String r28 = ""
            goto L_0x017b
        L_0x01d7:
            r0 = r24
            if (r9 >= r0) goto L_0x034b
            r0 = r26
            org.json.JSONObject r8 = r0.getJSONObject(r9)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r6 = "name"
            java.lang.String r23 = r8.getString(r6)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "actions"
            org.json.JSONArray r22 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r22)     // Catch:{ JSONException -> 0x041d }
            java.util.LinkedHashMap r21 = X.C36431kI.A1G()     // Catch:{ JSONException -> 0x041d }
            int r20 = r22.length()     // Catch:{ JSONException -> 0x041d }
            r5 = 0
        L_0x01f9:
            r0 = r20
            if (r5 >= r0) goto L_0x027e
            r0 = r22
            org.json.JSONObject r1 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r13 = A00(r6, r10, r1)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "sentiments"
            org.json.JSONArray r19 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r19)     // Catch:{ JSONException -> 0x041d }
            java.util.LinkedHashMap r12 = X.C36431kI.A1G()     // Catch:{ JSONException -> 0x041d }
            int r18 = r19.length()     // Catch:{ JSONException -> 0x041d }
            r4 = 0
        L_0x0219:
            r0 = r18
            if (r4 >= r0) goto L_0x0270
            r0 = r19
            org.json.JSONObject r1 = r0.getJSONObject(r4)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r11 = A00(r6, r10, r1)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "is_default"
            boolean r17 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "intensities"
            org.json.JSONArray r16 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r16)     // Catch:{ JSONException -> 0x041d }
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()     // Catch:{ JSONException -> 0x041d }
            int r15 = r16.length()     // Catch:{ JSONException -> 0x041d }
            r2 = 0
        L_0x023f:
            if (r2 >= r15) goto L_0x0263
            r0 = r16
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r1 = A00(r6, r10, r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r14 = "videos"
            org.json.JSONArray r0 = r0.getJSONArray(r14)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ JSONException -> 0x041d }
            java.util.ArrayList r14 = A01(r0)     // Catch:{ JSONException -> 0x041d }
            X.6B8 r0 = new X.6B8     // Catch:{ JSONException -> 0x041d }
            r0.<init>(r1, r14)     // Catch:{ JSONException -> 0x041d }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x041d }
            int r2 = r2 + 1
            goto L_0x023f
        L_0x0263:
            X.6B7 r1 = new X.6B7     // Catch:{ JSONException -> 0x041d }
            r0 = r17
            r1.<init>(r11, r3, r0)     // Catch:{ JSONException -> 0x041d }
            r12.put(r11, r1)     // Catch:{ JSONException -> 0x041d }
            int r4 = r4 + 1
            goto L_0x0219
        L_0x0270:
            X.69i r1 = new X.69i     // Catch:{ JSONException -> 0x041d }
            r1.<init>(r13, r12)     // Catch:{ JSONException -> 0x041d }
            r0 = r21
            r0.put(r13, r1)     // Catch:{ JSONException -> 0x041d }
            int r5 = r5 + 1
            goto L_0x01f9
        L_0x027e:
            java.lang.String r0 = "transitions"
            org.json.JSONArray r12 = r8.getJSONArray(r0)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A08(r12)     // Catch:{ JSONException -> 0x041d }
            java.util.LinkedHashMap r8 = X.C36431kI.A1G()     // Catch:{ JSONException -> 0x041d }
            int r11 = r12.length()     // Catch:{ JSONException -> 0x041d }
            r6 = 0
        L_0x0290:
            if (r6 >= r11) goto L_0x0336
            org.json.JSONObject r5 = r12.getJSONObject(r6)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = "trigger"
            java.lang.String r1 = A00(r0, r10, r5)     // Catch:{ JSONException -> 0x041d }
            int r0 = r1.hashCode()     // Catch:{ JSONException -> 0x041d }
            r13 = 4
            switch(r0) {
                case -2100154143: goto L_0x02a5;
                case -1099754412: goto L_0x02ad;
                case -670453360: goto L_0x02b8;
                case -269465212: goto L_0x02bf;
                case 50572276: goto L_0x02c7;
                case 825853265: goto L_0x02cf;
                case 1010548371: goto L_0x02b5;
                default: goto L_0x02a4;
            }     // Catch:{ JSONException -> 0x041d }
        L_0x02a4:
            goto L_0x02d8
        L_0x02a5:
            java.lang.String r0 = "video_about_to_finish"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            r13 = 6
            goto L_0x02d6
        L_0x02ad:
            java.lang.String r0 = "stop_typing"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            r13 = 2
            goto L_0x02d6
        L_0x02b5:
            java.lang.String r0 = "llm_output"
            goto L_0x02ba
        L_0x02b8:
            java.lang.String r0 = "llm_streaming"
        L_0x02ba:
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            goto L_0x02d6
        L_0x02bf:
            java.lang.String r0 = "llm_finished"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            r13 = 5
            goto L_0x02d6
        L_0x02c7:
            java.lang.String r0 = "start_typing"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            r13 = 1
            goto L_0x02d6
        L_0x02cf:
            java.lang.String r0 = "send_query"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x041d }
            r13 = 3
        L_0x02d6:
            if (r0 != 0) goto L_0x02d9
        L_0x02d8:
            r13 = 0
        L_0x02d9:
            java.lang.String r0 = "next_state"
            java.lang.String r4 = r5.getString(r0)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r1 = "transition_policy"
            boolean r0 = r5.has(r1)     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0313
            java.lang.String r3 = A00(r1, r10, r5)     // Catch:{ JSONException -> 0x041d }
            int r2 = r3.hashCode()     // Catch:{ JSONException -> 0x041d }
            r0 = -1411068134(0xffffffffabe4cf1a, float:-1.6257857E-12)
            r1 = 0
            if (r2 == r0) goto L_0x0314
            r0 = -212059869(0xfffffffff35c3923, float:-1.7447879E31)
            if (r2 == r0) goto L_0x0309
            r0 = 39319094(0x257f636, float:1.5866364E-37)
            if (r2 != r0) goto L_0x0314
            java.lang.String r0 = "queue_duration_based"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0314
            r1 = 2
            goto L_0x0314
        L_0x0309:
            java.lang.String r0 = "queue_flush_append"
            boolean r0 = r3.equals(r0)     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0314
            r1 = 1
            goto L_0x0314
        L_0x0313:
            r1 = 0
        L_0x0314:
            java.lang.String r0 = "queue_duration_threshold"
            boolean r2 = r5.has(r0)     // Catch:{ JSONException -> 0x041d }
            if (r2 == 0) goto L_0x0330
            int r3 = r5.getInt(r0)     // Catch:{ JSONException -> 0x041d }
        L_0x0320:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ JSONException -> 0x041d }
            X.6BA r0 = new X.6BA     // Catch:{ JSONException -> 0x041d }
            r0.<init>(r4, r1, r3)     // Catch:{ JSONException -> 0x041d }
            r8.put(r2, r0)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0332
        L_0x0330:
            r3 = 0
            goto L_0x0320
        L_0x0332:
            int r6 = r6 + 1
            goto L_0x0290
        L_0x0336:
            X.AnonymousClass00C.A0B(r23)     // Catch:{ JSONException -> 0x041d }
            X.6B9 r2 = new X.6B9     // Catch:{ JSONException -> 0x041d }
            r1 = r23
            r0 = r21
            r2.<init>(r1, r0, r8)     // Catch:{ JSONException -> 0x041d }
            r0 = r25
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x041d }
            int r9 = r9 + 1
            goto L_0x01d7
        L_0x034b:
            X.AnonymousClass00C.A0B(r28)     // Catch:{ JSONException -> 0x041d }
            X.AnonymousClass00C.A0B(r29)     // Catch:{ JSONException -> 0x041d }
            X.6DU r3 = new X.6DU     // Catch:{ JSONException -> 0x041d }
            r32 = r25
            r26 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ JSONException -> 0x041d }
            r0 = 1
            r7.A05 = r0     // Catch:{ JSONException -> 0x041d }
            java.util.Map r0 = r3.A03     // Catch:{ JSONException -> 0x041d }
            java.util.Iterator r5 = X.AnonymousClass000.A0z(r0)     // Catch:{ JSONException -> 0x041d }
        L_0x0363:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x03ab
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x041d }
            X.6B9 r0 = (X.AnonymousClass6B9) r0     // Catch:{ JSONException -> 0x041d }
            java.util.Map r0 = r0.A00     // Catch:{ JSONException -> 0x041d }
            java.util.Iterator r4 = X.AnonymousClass000.A0z(r0)     // Catch:{ JSONException -> 0x041d }
        L_0x0375:
            boolean r0 = r4.hasNext()     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0363
            java.lang.Object r0 = r4.next()     // Catch:{ JSONException -> 0x041d }
            X.69i r0 = (X.C1277069i) r0     // Catch:{ JSONException -> 0x041d }
            java.util.Map r0 = r0.A00     // Catch:{ JSONException -> 0x041d }
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)     // Catch:{ JSONException -> 0x041d }
        L_0x0387:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0375
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x041d }
            X.6B7 r0 = (X.AnonymousClass6B7) r0     // Catch:{ JSONException -> 0x041d }
            java.util.Map r0 = r0.A00     // Catch:{ JSONException -> 0x041d }
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r0)     // Catch:{ JSONException -> 0x041d }
        L_0x0399:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0387
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x041d }
            X.6B8 r0 = (X.AnonymousClass6B8) r0     // Catch:{ JSONException -> 0x041d }
            java.util.List r0 = r0.A01     // Catch:{ JSONException -> 0x041d }
            java.util.Collections.shuffle(r0)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0399
        L_0x03ab:
            r7.A0A = r3     // Catch:{ JSONException -> 0x041d }
            X.6C9 r1 = r3.A00     // Catch:{ JSONException -> 0x041d }
            r7.A00 = r1     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = r1.A02     // Catch:{ JSONException -> 0x041d }
            r7.A02 = r0     // Catch:{ JSONException -> 0x041d }
            java.lang.String r0 = r1.A01     // Catch:{ JSONException -> 0x041d }
            r7.A01 = r0     // Catch:{ JSONException -> 0x041d }
            r7.A03()     // Catch:{ JSONException -> 0x041d }
            X.6DU r0 = r7.A0A     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x03f8
            java.util.List r4 = r0.A02     // Catch:{ JSONException -> 0x041d }
            java.util.Map r0 = r0.A03     // Catch:{ JSONException -> 0x041d }
            java.util.Collection r0 = r0.values()     // Catch:{ JSONException -> 0x041d }
            X.0tV r1 = X.C90514aH.A0X(r0)     // Catch:{ JSONException -> 0x041d }
            X.7XU r0 = X.AnonymousClass7XU.A00     // Catch:{ JSONException -> 0x041d }
            X.0la r3 = X.C14410la.A00     // Catch:{ JSONException -> 0x041d }
            X.0ii r2 = new X.0ii     // Catch:{ JSONException -> 0x041d }
            r2.<init>(r0, r3, r1)     // Catch:{ JSONException -> 0x041d }
            X.7XV r0 = X.AnonymousClass7XV.A00     // Catch:{ JSONException -> 0x041d }
            X.0ii r1 = new X.0ii     // Catch:{ JSONException -> 0x041d }
            r1.<init>(r0, r3, r2)     // Catch:{ JSONException -> 0x041d }
            X.7XW r0 = X.AnonymousClass7XW.A00     // Catch:{ JSONException -> 0x041d }
            X.0ii r2 = new X.0ii     // Catch:{ JSONException -> 0x041d }
            r2.<init>(r0, r3, r1)     // Catch:{ JSONException -> 0x041d }
            X.7XX r0 = X.AnonymousClass7XX.A00     // Catch:{ JSONException -> 0x041d }
            X.0ii r1 = new X.0ii     // Catch:{ JSONException -> 0x041d }
            r1.<init>(r0, r3, r2)     // Catch:{ JSONException -> 0x041d }
            X.7XY r0 = X.AnonymousClass7XY.A00     // Catch:{ JSONException -> 0x041d }
            X.0ih r0 = X.C15060md.A02(r0, r1)     // Catch:{ JSONException -> 0x041d }
            java.util.List r0 = X.C15060md.A00(r0)     // Catch:{ JSONException -> 0x041d }
            java.util.ArrayList r30 = X.C007103b.A0S(r0, r4)     // Catch:{ JSONException -> 0x041d }
        L_0x03f8:
            java.util.Iterator r6 = r30.iterator()     // Catch:{ JSONException -> 0x041d }
        L_0x03fc:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x041d }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r6.next()     // Catch:{ JSONException -> 0x041d }
            X.6De r0 = (X.C128676De) r0     // Catch:{ JSONException -> 0x041d }
            java.util.concurrent.ConcurrentLinkedQueue r5 = r7.A04     // Catch:{ JSONException -> 0x041d }
            java.lang.String r4 = r0.A04     // Catch:{ JSONException -> 0x041d }
            java.lang.String r3 = r0.A02     // Catch:{ JSONException -> 0x041d }
            java.lang.String r2 = r0.A01     // Catch:{ JSONException -> 0x041d }
            java.lang.String r1 = X.C90464aC.A0V()     // Catch:{ JSONException -> 0x041d }
            X.5uK r0 = new X.5uK     // Catch:{ JSONException -> 0x041d }
            r0.<init>(r4, r3, r2, r1)     // Catch:{ JSONException -> 0x041d }
            r5.add(r0)     // Catch:{ JSONException -> 0x041d }
            goto L_0x03fc
        L_0x041d:
            r1 = move-exception
            java.lang.String r0 = "ClientOrchestrator/setBehaviorGraph unable to set behavior graph, aborting"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Set r0 = r7.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0429:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x044c
            r2.next()
            X.5Ta r0 = X.C108315Ta.INVALID_BEHAVIOR_GRAPH
            long r0 = r0.value
            java.lang.String r9 = ""
            r18 = 0
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            X.6Dy r8 = new X.6Dy
            r10 = r9
            r19 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0429
        L_0x044c:
            X.66D r2 = r7.A07
            X.11F r1 = r7.A09
            X.5Ta r0 = X.C108315Ta.INVALID_BEHAVIOR_GRAPH
            r2.A01(r0, r1)
            goto L_0x0014
        L_0x0457:
            X.6D0 r0 = (X.AnonymousClass6D0) r0
            java.lang.Object r4 = r7.receiver
            X.4f8 r4 = (X.C92924f8) r4
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r1 = r4.A01
            if (r1 != 0) goto L_0x0468
            java.lang.String r0 = "botEmbodimentViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0468:
            X.1hi r1 = r1.A05
            java.lang.Object r1 = X.C36401kF.A0m(r1)
            int r5 = X.AnonymousClass000.A0I(r1)
            r1 = 2
            java.lang.Integer[] r3 = new java.lang.Integer[r1]
            r1 = 4
            boolean r11 = X.C36361kB.A1b(r3, r1)
            r2 = 1
            r1 = 5
            X.AnonymousClass000.A1L(r3, r1, r2)
            X.AnonymousClass00C.A0D(r3, r11)
            java.util.Set r1 = X.AnonymousClass02R.A0E(r3)
            boolean r1 = X.AnonymousClass000.A1Z(r1, r5)
            if (r1 == 0) goto L_0x0014
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r3 = r0.A02
            if (r3 == 0) goto L_0x0014
            X.5T3[] r8 = X.AnonymousClass5T3.values()
            X.AnonymousClass00C.A0D(r8, r11)
            int r1 = r8.length
            int r2 = r1 + -1
            X.0mZ r1 = new X.0mZ
            r1.<init>(r11, r2)
            int r7 = r3.intValue()
            boolean r1 = r1.A02(r7)
            if (r1 == 0) goto L_0x0014
            java.lang.Integer r3 = r0.A00
            if (r3 == 0) goto L_0x0014
            X.5T1[] r10 = X.AnonymousClass5T1.values()
            X.AnonymousClass00C.A0D(r10, r11)
            int r1 = r10.length
            int r2 = r1 + -1
            X.0mZ r1 = new X.0mZ
            r1.<init>(r11, r2)
            int r9 = r3.intValue()
            boolean r1 = r1.A02(r9)
            if (r1 == 0) goto L_0x0014
            java.lang.Integer r3 = r0.A01
            if (r3 == 0) goto L_0x0014
            X.5SA[] r6 = X.AnonymousClass5SA.values()
            X.AnonymousClass00C.A0D(r6, r11)
            int r1 = r6.length
            int r2 = r1 + -1
            X.0mZ r1 = new X.0mZ
            r1.<init>(r11, r2)
            int r3 = r3.intValue()
            boolean r1 = r1.A02(r3)
            if (r1 == 0) goto L_0x0014
            java.lang.Integer r0 = r0.A03
            if (r0 == 0) goto L_0x04ec
            r0.intValue()
        L_0x04ec:
            X.6WA r4 = r4.A03
            if (r4 != 0) goto L_0x04f7
            java.lang.String r0 = "clientOrchestrator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04f7:
            r0 = r10[r9]
            java.lang.String r2 = r0.name()
            r0 = r8[r7]
            java.lang.String r1 = r0.name()
            r0 = r6[r3]
            java.lang.String r3 = r0.name()
            X.C36321k7.A11(r2, r1, r3)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = X.C36431kI.A1D(r0, r2)
            java.lang.String r1 = X.C36431kI.A1D(r0, r1)
            java.lang.String r0 = X.C36431kI.A1D(r0, r3)
            X.AnonymousClass6WA.A02(r4, r2, r1, r0, r5)
            goto L_0x0014
        L_0x051f:
            int r4 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r3 = r7.receiver
            X.4f8 r3 = (X.C92924f8) r3
            r0 = 4
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            boolean r1 = X.C36361kB.A1b(r2, r0)
            r0 = 5
            X.AnonymousClass000.A1K(r2, r0)
            X.C36331k8.A1V(r2, r1)
            r0 = 6
            X.C36341k9.A1T(r2, r0)
            X.AnonymousClass00C.A0D(r2, r1)
            java.util.Set r0 = X.AnonymousClass02R.A0E(r2)
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            if (r0 != 0) goto L_0x0014
            X.6WA r1 = r3.A03
            if (r1 != 0) goto L_0x0551
            java.lang.String r0 = "clientOrchestrator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0551:
            r0 = 0
            X.AnonymousClass6WA.A02(r1, r0, r0, r0, r4)
            goto L_0x0014
        L_0x0557:
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r3 = r7.receiver
            com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment r3 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment) r3
            r0 = 1
            if (r1 != r0) goto L_0x0014
            X.625 r2 = r3.A04
            if (r2 == 0) goto L_0x0bb5
            android.content.Context r1 = r3.A0a()
            X.01I r0 = r3.A0i()
            r2.A00(r0, r1)
            goto L_0x0014
        L_0x0573:
            java.lang.Object r5 = r7.receiver
            com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment r5 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment) r5
            X.4ki r1 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.A08
            if (r1 != 0) goto L_0x0580
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0580:
            X.08S r1 = r1.A02
            java.util.List r1 = X.C36401kF.A0w(r1)
            if (r1 == 0) goto L_0x0014
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L_0x058d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r4.next()
            X.5EQ r2 = (X.AnonymousClass5EQ) r2
            boolean r1 = r2 instanceof X.AnonymousClass5E0
            if (r1 == 0) goto L_0x058d
            int r3 = r3 + 1
            X.5E0 r2 = (X.AnonymousClass5E0) r2
            X.6s9 r1 = r2.A00
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x058d
            X.60k r1 = r5.A01
            if (r1 == 0) goto L_0x0bc3
            java.lang.String r0 = r5.A05
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0014
            X.6OF r5 = r5.A03
            if (r5 == 0) goto L_0x0bbc
            long r3 = (long) r3
            r2 = 1
            X.58e r1 = new X.58e
            r1.<init>()
            java.lang.Integer r0 = X.C36371kC.A0p()
            r1.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.A09 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A04 = r0
            r1.A03 = r0
            X.AnonymousClass6OF.A00(r1, r5)
            goto L_0x0014
        L_0x05d9:
            X.6Kb r0 = (X.C130186Kb) r0
            r6 = 0
            X.AnonymousClass00C.A0D(r0, r6)
            java.lang.Object r5 = r7.receiver
            X.4ki r5 = (X.C95374ki) r5
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0616
            r3 = 1
            int r2 = r0.A00
            r0 = -1
            r1 = 2
            if (r2 != r0) goto L_0x05f8
            X.C95374ki.A01(r5, r1)
        L_0x05f1:
            X.6Tm r0 = r5.A05
            r0.A03()
            goto L_0x0014
        L_0x05f8:
            r0 = 3
            if (r2 == r3) goto L_0x0612
            if (r2 == r1) goto L_0x0612
            if (r2 == r0) goto L_0x0612
            r0 = 4
            if (r2 != r0) goto L_0x0608
            X.1Rs r0 = r5.A06
            X.C36341k9.A17(r0, r3)
            goto L_0x05f1
        L_0x0608:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BusinessApiBrowseFragmentViewModel/notifyBusinessApiBrowseDataChange error code unkonown "
            X.C36321k7.A1S(r0, r1, r2)
            goto L_0x05f1
        L_0x0612:
            X.C95374ki.A01(r5, r0)
            goto L_0x05f1
        L_0x0616:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.08S r3 = r5.A02
            java.util.List r7 = X.C36401kF.A0w(r3)
            if (r7 == 0) goto L_0x0647
            boolean r1 = X.C36401kF.A1a(r7)
            if (r1 == 0) goto L_0x0647
            java.lang.Object r1 = X.C007103b.A0N(r7)
            boolean r1 = r1 instanceof X.C105145Dn
            if (r1 != 0) goto L_0x0647
            java.lang.Object r1 = X.C007103b.A0N(r7)
            X.5EQ r1 = (X.AnonymousClass5EQ) r1
            int r2 = r1.A00
            r1 = 66
            if (r2 != r1) goto L_0x068a
            int r1 = X.C36431kI.A07(r7)
            java.util.List r1 = r7.subList(r6, r1)
            r4.addAll(r1)
        L_0x0647:
            java.util.List r1 = r0.A02
            r2 = 1
            if (r1 == 0) goto L_0x0661
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x065e
            java.lang.String r0 = r5.A00
            if (r0 != 0) goto L_0x065e
            X.50o r0 = new X.50o
            r0.<init>(r5, r2)
            r4.add(r0)
        L_0x065e:
            r4.addAll(r1)
        L_0x0661:
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "search_by_category"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0680
            java.lang.Object r0 = X.C007103b.A0N(r4)
            X.5EQ r0 = (X.AnonymousClass5EQ) r0
            int r1 = r0.A00
            r0 = 66
            if (r1 != r0) goto L_0x0680
            int r0 = r4.size()
            int r0 = r0 - r2
            java.util.List r4 = r4.subList(r6, r0)
        L_0x0680:
            r3.A0C(r4)
            X.6Tm r0 = r5.A05
            r0.A04()
            goto L_0x0014
        L_0x068a:
            r4.addAll(r7)
            goto L_0x0647
        L_0x068e:
            X.5zC r0 = (X.C125025zC) r0
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            java.lang.Object r1 = r7.receiver
            X.4kp r1 = (X.C95404kp) r1
            int r4 = r0.A03
            r5 = 2
            r8 = 1
            if (r4 == r8) goto L_0x06bf
            r3 = 6
            if (r4 == r3) goto L_0x06b8
            r3 = 13
            if (r4 == r3) goto L_0x06bf
            r0 = 8
            if (r4 == r0) goto L_0x06b8
            r0 = 9
            if (r4 != r0) goto L_0x0014
            X.00s r1 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x06b3:
            r1.A0D(r0)
            goto L_0x0014
        L_0x06b8:
            X.00s r1 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x06b3
        L_0x06bf:
            int r4 = r0.A02
            if (r4 == r5) goto L_0x06c8
            r3 = 3
            if (r4 == r3) goto L_0x06c8
            goto L_0x0014
        L_0x06c8:
            X.00s r3 = r1.A02
            X.C36341k9.A16(r3, r2)
            java.util.List r4 = r0.A0G
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x06da
            X.1Rs r3 = r1.A0T
            X.C36341k9.A18(r3, r8)
        L_0x06da:
            java.util.ArrayList r5 = r1.A0A
            r5.clear()
            r5.addAll(r4)
            X.08S r3 = r1.A0E
            r3.A0D(r5)
            java.util.HashSet r5 = r1.A0B
            r5.clear()
            java.util.Set r3 = X.C95404kp.A02(r1)
            r5.addAll(r3)
            X.6To r3 = r1.A08
            r3.A02()
            X.6To r5 = r1.A08
            X.6QG r3 = r1.A05
            r5.A04(r3, r4)
            X.6To r3 = r1.A08
            X.6M7 r7 = X.AnonymousClass6M7.A00
            X.6jV r6 = r3.A08
            r9 = 3
            float r13 = X.C134996bx.A00(r6)
            X.6WY r3 = r6.A0R
            X.6Ch r3 = r3.A06()
            X.6c5 r3 = r3.A04
            X.6bv r10 = r3.A00()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r12 = r4.iterator()
        L_0x071e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x073b
            java.lang.Object r11 = r12.next()
            r4 = r11
            X.6sA r4 = (X.C144426sA) r4
            float r3 = r4.A06
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0737
            float r3 = r4.A05
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x071e
        L_0x0737:
            r5.add(r11)
            goto L_0x071e
        L_0x073b:
            r4 = 10
            X.7qw r3 = new X.7qw
            r3.<init>(r10, r4)
            java.util.List r3 = X.C007103b.A0c(r5, r3)
            java.util.List r3 = X.C007103b.A0a(r3, r9)
            java.util.ArrayList r5 = X.C36351kA.A0z(r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x0752:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0766
            java.lang.Object r3 = r4.next()
            X.6sA r3 = (X.C144426sA) r3
            X.6bv r3 = r3.BG3()
            r5.add(r3)
            goto L_0x0752
        L_0x0766:
            r7.A00(r6, r5, r8)
            X.5x0 r7 = r0.A06
            if (r7 == 0) goto L_0x07c9
            X.6pD r8 = r1.A0J
            X.6To r3 = r1.A08
            X.6jV r3 = r3.A08
            float r18 = X.C134996bx.A00(r3)
            X.6bw r3 = r1.A0O
            java.lang.String r14 = r3.A00
            int r3 = r7.A01
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            int r3 = r7.A03
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            X.6QK r5 = r1.A0N
            java.lang.String r15 = r5.A06()
            X.1QW r3 = r1.A0S
            X.0yC r4 = r3.A03
            r3 = 4461(0x116d, float:6.251E-42)
            java.lang.String r16 = X.C36431kI.A19(r4, r3)
            X.6To r3 = r1.A08
            int r6 = r3.A01
            int r4 = r3.A00
            boolean r3 = r5.A04
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            java.util.List r3 = r7.A05
            java.lang.Boolean r10 = r5.A05()
            boolean r5 = r5.A03
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            X.6Eo r5 = r1.A0L
            java.lang.Integer r5 = r5.A03()
            int r21 = r5.intValue()
            r22 = 65
            r23 = 11
            r19 = r6
            r20 = r4
            r17 = r3
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            r0.A06 = r3
        L_0x07c9:
            r1.A00 = r2
            X.C95404kp.A06(r1)
            goto L_0x0014
        L_0x07d0:
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r7.receiver
            com.whatsapp.calling.callrating.CallRatingBottomSheet r0 = (com.whatsapp.calling.callrating.CallRatingBottomSheet) r0
            com.whatsapp.WaTextView r0 = r0.A01
            if (r0 == 0) goto L_0x0014
            r0.setText(r1)
            goto L_0x0014
        L_0x07e1:
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r0 = r7.receiver
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            r0.A0G = r1
            if (r1 != 0) goto L_0x0014
            r0.A1c()
            goto L_0x0014
        L_0x07f2:
            X.6DD r0 = (X.AnonymousClass6DD) r0
            r5 = 0
            X.AnonymousClass00C.A0D(r0, r5)
            java.lang.Object r9 = r7.receiver
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r9 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r9
            android.content.Context r3 = r9.A1D()
            if (r3 == 0) goto L_0x0014
            X.5wC r6 = r0.A01
            com.whatsapp.WaTextView r2 = r9.A04
            if (r2 == 0) goto L_0x0816
            X.3Bc r1 = r6.A02
            java.lang.CharSequence r1 = r1.A00(r3)
            r2.setText(r1)
            int r1 = r6.A01
            X.C36331k8.A0r(r3, r2, r1)
        L_0x0816:
            X.1RJ r7 = r9.A0D
            r4 = 8
            if (r7 == 0) goto L_0x0841
            boolean r1 = r6.A03
            if (r1 == 0) goto L_0x08f3
            android.view.View r1 = X.C36391kE.A0L(r7, r5)
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 != 0) goto L_0x0841
            X.00T r1 = r9.A0J
            java.lang.Object r8 = r1.getValue()
            X.6C3 r8 = (X.AnonymousClass6C3) r8
            r2 = 2131234431(0x7f080e7f, float:1.8085028E38)
            r1 = 1
            X.0BQ r2 = r8.A00(r3, r2, r1)
            android.view.View r1 = r7.A01()
            r1.setBackground(r2)
        L_0x0841:
            X.1RJ r2 = r9.A0E
            if (r2 == 0) goto L_0x085d
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x08ee
            android.view.View r2 = X.C36391kE.A0L(r2, r5)
            r1 = 2131432334(0x7f0b138e, float:1.8486423E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r2, r1)
            int r1 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
        L_0x085d:
            android.view.View r6 = r9.A00
            if (r6 == 0) goto L_0x086c
            boolean r1 = r0.A05
            r2 = r1 ^ 1
            r1 = 0
            if (r2 == 0) goto L_0x0869
            r1 = 4
        L_0x0869:
            r6.setVisibility(r1)
        L_0x086c:
            X.1RJ r2 = r9.A0C
            if (r2 == 0) goto L_0x0879
            boolean r1 = r0.A04
            int r1 = X.C36351kA.A00(r1)
            r2.A03(r1)
        L_0x0879:
            boolean r2 = r0.A04
            X.1RJ r1 = r9.A0B
            if (r2 != 0) goto L_0x08e8
            if (r1 == 0) goto L_0x0884
            r1.A03(r5)
        L_0x0884:
            com.whatsapp.calling.callgrid.view.CallGrid r1 = r9.A05
            if (r1 != 0) goto L_0x08b6
            X.1RJ r1 = r9.A0B
            if (r1 == 0) goto L_0x08e6
            android.view.View r1 = r1.A01()
            com.whatsapp.calling.callgrid.view.CallGrid r1 = (com.whatsapp.calling.callgrid.view.CallGrid) r1
        L_0x0892:
            r9.A05 = r1
            if (r1 == 0) goto L_0x089d
            X.01N r2 = r9.A0P
            X.01Y r1 = r1.A0Y
            r2.A04(r1)
        L_0x089d:
            com.whatsapp.calling.callgrid.view.CallGrid r8 = r9.A05
            if (r8 == 0) goto L_0x08b6
            X.00T r1 = r9.A0L
            java.lang.Object r10 = r1.getValue()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r10 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r10
            r11 = 0
            X.00T r1 = r9.A0N
            java.lang.Object r12 = r1.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r12 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r12
            r13 = r11
            r8.A0E(r9, r10, r11, r12, r13)
        L_0x08b6:
            com.whatsapp.calling.callgrid.view.CallGrid r6 = r9.A05
            if (r6 == 0) goto L_0x08db
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            int r1 = r0.A00
            int r1 = r1 + -1
            int r1 = r1 / 3
            int r4 = r1 + 1
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131168765(0x7f070dfd, float:1.7951841E38)
            int r1 = r2.getDimensionPixelSize(r1)
            int r4 = r4 * r1
            int r1 = r5.height
            if (r4 == r1) goto L_0x08db
            r5.height = r4
            r6.setLayoutParams(r5)
        L_0x08db:
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = r9.A06
            if (r1 == 0) goto L_0x0014
            java.util.List r0 = r0.A03
            r1.A06(r0)
            goto L_0x0014
        L_0x08e6:
            r1 = 0
            goto L_0x0892
        L_0x08e8:
            if (r1 == 0) goto L_0x08db
            r1.A03(r4)
            goto L_0x08db
        L_0x08ee:
            r2.A03(r4)
            goto L_0x085d
        L_0x08f3:
            X.00T r1 = r9.A0J
            java.lang.Object r1 = r1.getValue()
            X.6C3 r1 = (X.AnonymousClass6C3) r1
            r1.A02()
            android.view.View r2 = r7.A00
            r1 = 0
            if (r2 == 0) goto L_0x0904
            r1 = 1
        L_0x0904:
            if (r1 == 0) goto L_0x0841
            android.view.View r2 = r7.A01()
            r1 = 0
            r2.setBackground(r1)
            r7.A03(r4)
            goto L_0x0841
        L_0x0913:
            X.6DE r0 = (X.AnonymousClass6DE) r0
            java.lang.Object r1 = X.C90514aH.A0q(r0, r7)
            X.4fT r1 = (X.C93034fT) r1
            X.C93034fT.A02(r1, r0)
            goto L_0x0014
        L_0x0920:
            int r3 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r1 = r7.receiver
            X.4fT r1 = (X.C93034fT) r1
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = r1.A00
            if (r0 == 0) goto L_0x092f
            r0.getVisibility()
        L_0x092f:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r1.A00
            if (r2 == 0) goto L_0x0014
            float r1 = (float) r3
            r0 = 1
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave.A02(r2, r1, r0)
            goto L_0x0014
        L_0x093a:
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r0 = r7.receiver
            X.4fA r0 = (X.C92934fA) r0
            r0.setLoadingVisibility(r1)
            goto L_0x0014
        L_0x0947:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = X.C90514aH.A0q(r0, r7)
            X.4fA r1 = (X.C92934fA) r1
            X.C92934fA.A01(r1, r0)
            goto L_0x0014
        L_0x0954:
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r0 = r7.receiver
            X.4fA r0 = (X.C92934fA) r0
            r0.setSuggestionsVisibility(r1)
            goto L_0x0014
        L_0x0961:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = X.C90514aH.A0q(r0, r7)
            X.4fA r1 = (X.C92934fA) r1
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r6 = r1.A04
            if (r6 == 0) goto L_0x0014
            X.5Se r2 = r6.A00
            X.5Se r1 = X.C108105Se.LOADED
            if (r2 != r1) goto L_0x0014
            java.util.List r5 = r6.A02
            r4 = 0
            java.util.Iterator r3 = r5.iterator()
        L_0x097a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r3.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x098d
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x098d:
            X.3IF r1 = (X.AnonymousClass3IF) r1
            X.141 r1 = r1.A00
            X.11F r1 = r1.A0H
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x09a0
            X.1Rs r0 = r6.A0A
            r0.A0D(r5)
            goto L_0x0014
        L_0x09a0:
            r4 = r2
            goto L_0x097a
        L_0x09a2:
            X.6bq r0 = (X.C134936bq) r0
            java.lang.Object r3 = X.C90514aH.A0q(r0, r7)
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r3 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r3
            com.whatsapp.WaEditText r1 = r3.A09
            if (r1 == 0) goto L_0x09b1
            r1.A0B()
        L_0x09b1:
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = X.C90484aE.A0X(r3)
            X.01I r1 = r3.A0i()
            r2.A0S(r1, r0)
            goto L_0x0014
        L_0x09be:
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            java.lang.Object r2 = r7.receiver
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r2 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r2
            com.whatsapp.WaEditText r1 = r2.A09
            if (r1 == 0) goto L_0x09cf
            r1.setText(r0)
        L_0x09cf:
            com.whatsapp.WaEditText r1 = r2.A09
            if (r1 == 0) goto L_0x09da
            int r0 = r0.length()
            r1.setSelection(r0)
        L_0x09da:
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0D(r2, r3)
            goto L_0x0014
        L_0x09df:
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r7.receiver
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = X.C90484aE.A0X(r0)
            r0 = 0
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A09(r2, r1, r0)
            X.00s r1 = r2.A09
            java.util.List r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A07(r2)
            goto L_0x0a4e
        L_0x09f6:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = X.C90514aH.A0q(r0, r7)
            com.whatsapp.media.utwonet.UTwoNetViewModel r4 = (com.whatsapp.media.utwonet.UTwoNetViewModel) r4
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r3 = r4.A04
            boolean r1 = r3.A01
            if (r1 != 0) goto L_0x0a07
            r3.A00()
        L_0x0a07:
            java.lang.String r2 = "UTwoNet"
            r3.modelLoaded(r2)
            boolean r1 = X.C90484aE.A1W(r0)     // Catch:{ Exception -> 0x0a1f }
            if (r1 != 0) goto L_0x0a1b
            X.00s r1 = r4.A01     // Catch:{ Exception -> 0x0a1f }
            X.5CA r0 = X.AnonymousClass5CA.A00     // Catch:{ Exception -> 0x0a1f }
            r1.A0C(r0)     // Catch:{ Exception -> 0x0a1f }
            goto L_0x0014
        L_0x0a1b:
            r3.loadModel(r2, r0)     // Catch:{ Exception -> 0x0a1f }
            goto L_0x0a25
        L_0x0a1f:
            r1 = move-exception
            java.lang.String r0 = "UTwoNetViewModel/loadModel"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0a25:
            r3.modelLoaded(r2)
            boolean r0 = r3.modelLoaded(r2)
            if (r0 != 0) goto L_0x0a33
            X.00s r1 = r4.A01
            X.5CA r0 = X.AnonymousClass5CA.A00
            goto L_0x0a4e
        L_0x0a33:
            X.5cQ r1 = new X.5cQ
            r1.<init>()
            X.5r5 r0 = new X.5r5
            r0.<init>(r3, r1)
            r4.A00 = r0
            X.00s r1 = r4.A01
            X.5CB r0 = X.AnonymousClass5CB.A00
            goto L_0x0a4e
        L_0x0a44:
            java.lang.Object r0 = X.C90514aH.A0q(r0, r7)
            com.whatsapp.media.utwonet.UTwoNetViewModel r0 = (com.whatsapp.media.utwonet.UTwoNetViewModel) r0
            X.00s r1 = r0.A01
            X.5C9 r0 = X.AnonymousClass5C9.A00
        L_0x0a4e:
            r1.A0C(r0)
            goto L_0x0014
        L_0x0a53:
            int r2 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r6 = r7.receiver
            X.01I r6 = (X.AnonymousClass01I) r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WfacBanActivity/transitionToScreen/transitioning to screen "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            X.AnonymousClass3TI.A01(r0)
            r5 = 1
            r4 = 0
            if (r2 == r5) goto L_0x0a9b
            r0 = 2
            if (r2 == r0) goto L_0x0a95
            r0 = 3
            if (r2 != r0) goto L_0x0a77
            com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment r4 = new com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment
            r4.<init>()
        L_0x0a77:
            X.01z r3 = r6.getSupportFragmentManager()
            r2 = 0
            r1 = 0
            X.0d4 r0 = new X.0d4
            r0.<init>(r3, r1, r2, r5)
            r3.A0k(r0, r2)
            X.09Y r1 = X.C36341k9.A0O(r6)
            r0 = 2131429145(0x7f0b0719, float:1.8479954E38)
            if (r4 != 0) goto L_0x0aa1
            java.lang.String r0 = "fragment"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a95:
            com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment r4 = new com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment
            r4.<init>()
            goto L_0x0a77
        L_0x0a9b:
            com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment r4 = new com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment
            r4.<init>()
            goto L_0x0a77
        L_0x0aa1:
            r1.A0B(r4, r0)
            r1.A00(r2)
            goto L_0x0014
        L_0x0aa9:
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r5 = X.C90514aH.A0q(r0, r7)
            com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment r5 = (com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment) r5
            boolean r1 = r5.A12()
            if (r1 == 0) goto L_0x0014
            X.62I r4 = r5.A1j()
            android.content.res.Resources r3 = X.C36341k9.A0G(r5)
            X.AnonymousClass00C.A08(r3)
            X.3NG r1 = r5.A01
            java.lang.String r2 = "builder"
            if (r1 != 0) goto L_0x0acd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0acd:
            r4.A01(r3, r1)
            X.3NG r1 = r5.A01
            if (r1 != 0) goto L_0x0ad9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0ad9:
            r5.A1k(r1)
            android.view.View r2 = X.C36411kG.A0K(r0)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            java.util.Objects.requireNonNull(r3, r1)
            int r2 = r2.getWidth()
            X.3AO r1 = com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment.A0H(r5)
            int r1 = r1.A01
            if (r2 <= r1) goto L_0x0af6
            r2 = r1
        L_0x0af6:
            r3.width = r2
            r0.setLayoutParams(r3)
            goto L_0x0014
        L_0x0afd:
            X.5xp r0 = (X.C124245xp) r0
            java.lang.Object r3 = X.C90514aH.A0q(r0, r7)
            X.9eh r3 = (X.C199099eh) r3
            X.16D r2 = r3.A03
            X.11F r1 = r0.A03
            X.141 r2 = r2.A0D(r1)
            int r1 = r0.A01
            int r0 = r2.A05
            if (r1 != r0) goto L_0x0b1a
            boolean r1 = X.C199099eh.A00(r3, r2)
            r0 = 0
            if (r1 == 0) goto L_0x0b1b
        L_0x0b1a:
            r0 = 1
        L_0x0b1b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x0b20:
            X.11F r0 = (X.AnonymousClass11F) r0
            java.lang.Object r2 = X.C90514aH.A0q(r0, r7)
            X.9eh r2 = (X.C199099eh) r2
            X.16D r1 = r2.A03
            X.141 r0 = r1.A0D(r0)
            boolean r0 = X.C199099eh.A00(r2, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x0b37:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.Object r1 = r7.receiver
            X.7j5 r1 = (X.C159267j5) r1
            java.lang.Object r1 = r1.B7i(r0)
            return r1
        L_0x0b42:
            java.lang.Object r1 = r7.receiver
            X.7j5 r1 = (X.C159267j5) r1
            org.json.JSONObject r1 = r1.Bvo(r0)
            return r1
        L_0x0b4b:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.String r1 = "id"
            java.lang.String r6 = r0.optString(r1)
            java.lang.String r1 = "jid"
            java.lang.String r3 = r0.optString(r1)
            java.lang.String r1 = "lastUpdated"
            long r4 = r0.optLong(r1)
            if (r6 == 0) goto L_0x0b7f
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0b7f
            if (r3 == 0) goto L_0x0b7f
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0b7f
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0b7f
            X.51l r1 = new X.51l
            r1.<init>(r6, r3)
            goto L_0x0ba7
        L_0x0b7f:
            java.lang.String r0 = "RecentSearchBusiness/fromJSON:Invalid recent search business json"
            goto L_0x0bb0
        L_0x0b82:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.String r1 = "query"
            java.lang.String r3 = r0.optString(r1)
            java.lang.String r1 = "lastUpdated"
            long r4 = r0.optLong(r1)
            if (r3 == 0) goto L_0x0bae
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0bae
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0bae
            X.51k r1 = new X.51k
            r1.<init>(r3)
        L_0x0ba7:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            return r1
        L_0x0bae:
            java.lang.String r0 = "RecentSearchQuery/fromJSON:Invalid recent search query json"
        L_0x0bb0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 0
            return r1
        L_0x0bb5:
            java.lang.String r0 = "updateAppUIFacade"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0bbc:
            java.lang.String r0 = "businessApiSearchAnalyticsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0bc3:
            java.lang.String r0 = "businessApiSearchLoggingEligibility"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X0.invoke(java.lang.Object):java.lang.Object");
    }

    public static String A00(String str, Locale locale, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        AnonymousClass00C.A08(string);
        String lowerCase = string.toLowerCase(locale);
        AnonymousClass00C.A08(lowerCase);
        return lowerCase;
    }

    public static final ArrayList A01(JSONArray jSONArray) {
        ArrayList A0I = AnonymousClass001.A0I();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("video_id");
            String string2 = jSONObject.getString("sd_progressive_url");
            String string3 = jSONObject.getString("hd_progressive_url");
            String string4 = jSONObject.getString("dash_manifest");
            long j = jSONObject.getLong("duration_ms");
            long j2 = jSONObject.getLong("expiry");
            boolean z = jSONObject.getBoolean("fallback");
            C90474aD.A1A(string, string2, string3);
            if (string4.length() == 0) {
                string4 = null;
            }
            A0I.add(new C128676De(string, string2, string3, string4, C90464aC.A0V(), j, j2, z));
        }
        return A0I;
    }
}
