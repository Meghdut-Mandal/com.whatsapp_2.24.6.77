package X;

import android.os.Bundle;
import com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog;

/* renamed from: X.2qm  reason: invalid class name and case insensitive filesystem */
public class C53102qm extends C03030Cw implements C006302t {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53102qm(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0148;
                case 2: goto L_0x013f;
                case 3: goto L_0x0136;
                case 4: goto L_0x012d;
                case 5: goto L_0x0124;
                case 6: goto L_0x011b;
                case 7: goto L_0x0112;
                case 8: goto L_0x0109;
                case 9: goto L_0x0100;
                case 10: goto L_0x00f7;
                case 11: goto L_0x00ee;
                case 12: goto L_0x00e5;
                case 13: goto L_0x00dc;
                case 14: goto L_0x00d3;
                case 15: goto L_0x00ca;
                case 16: goto L_0x00c1;
                case 17: goto L_0x00b8;
                case 18: goto L_0x00af;
                case 19: goto L_0x00a6;
                case 20: goto L_0x009d;
                case 21: goto L_0x0094;
                case 22: goto L_0x008b;
                case 23: goto L_0x0083;
                case 24: goto L_0x007b;
                case 25: goto L_0x0073;
                case 26: goto L_0x006b;
                case 27: goto L_0x0063;
                case 28: goto L_0x005b;
                case 29: goto L_0x0053;
                case 30: goto L_0x004b;
                case 31: goto L_0x0043;
                case 32: goto L_0x003b;
                case 33: goto L_0x0033;
                case 34: goto L_0x002b;
                case 35: goto L_0x0023;
                case 36: goto L_0x001b;
                case 37: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.3pR> r3 = X.C76783pR.class
            r1 = 1
            java.lang.String r4 = "onCriticalEvent"
            java.lang.String r5 = "onCriticalEvent(Lcom/whatsapp/group/protocol/CriticalEvent;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.3pR> r3 = X.C76783pR.class
            r1 = 1
            java.lang.String r4 = "onGroupInfoParsed"
            java.lang.String r5 = "onGroupInfoParsed(Lcom/whatsapp/group/batch/GroupInfoDataEnvelope;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.3Kp> r3 = X.C63583Kp.class
            r1 = 1
            java.lang.String r4 = "updateRequestPhoneNumberData"
            java.lang.String r5 = "updateRequestPhoneNumberData(Lcom/whatsapp/pnh/RequestPhoneNumberViewModel$PhoneNumberRequestData;)V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<X.2Y9> r3 = X.AnonymousClass2Y9.class
            r1 = 1
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<X.2Y9> r3 = X.AnonymousClass2Y9.class
            r1 = 1
            java.lang.String r4 = "handleSubscribersResponse"
            java.lang.String r5 = "handleSubscribersResponse(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterSubscribersResponse;)V"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<X.2YA> r3 = X.AnonymousClass2YA.class
            r1 = 1
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000d
        L_0x003b:
            java.lang.Class<X.2YA> r3 = X.AnonymousClass2YA.class
            r1 = 1
            java.lang.String r4 = "handleDirectorySuccess"
            java.lang.String r5 = "handleDirectorySuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterDirectorySearchResponse;)V"
            goto L_0x000d
        L_0x0043:
            java.lang.Class<X.2YC> r3 = X.AnonymousClass2YC.class
            r1 = 1
            java.lang.String r4 = "handleErrors"
            java.lang.String r5 = "handleErrors(Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z"
            goto L_0x000d
        L_0x004b:
            java.lang.Class<X.2YC> r3 = X.AnonymousClass2YC.class
            r1 = 1
            java.lang.String r4 = "handleDirectorySuccess"
            java.lang.String r5 = "handleDirectorySuccess(Lcom/whatsapp/infra/graphql/generated/newsletter/NewsletterDirectoryListResponse;)V"
            goto L_0x000d
        L_0x0053:
            java.lang.Class<X.1qJ> r3 = X.C38841qJ.class
            r1 = 1
            java.lang.String r4 = "onToolsChanged"
            java.lang.String r5 = "onToolsChanged(Ljava/util/List;)V"
            goto L_0x000d
        L_0x005b:
            java.lang.Class<com.whatsapp.home.ui.HomePlaceholderActivity> r3 = com.whatsapp.home.ui.HomePlaceholderActivity.class
            r1 = 1
            java.lang.String r4 = "onStatusBarHeight"
            java.lang.String r5 = "onStatusBarHeight(I)V"
            goto L_0x000d
        L_0x0063:
            java.lang.Class<X.1uu> r3 = X.C40091uu.class
            r1 = 1
            java.lang.String r4 = "updateResponseItems"
            java.lang.String r5 = "updateResponseItems(Lcom/whatsapp/event/fmessage/FMessageEvent;)V"
            goto L_0x000d
        L_0x006b:
            java.lang.Class<X.2ML> r3 = X.AnonymousClass2ML.class
            r1 = 1
            java.lang.String r4 = "fillStatusLabel"
            java.lang.String r5 = "fillStatusLabel(Lcom/whatsapp/event/fmessage/FMessageEvent;)V"
            goto L_0x000d
        L_0x0073:
            java.lang.Class<com.whatsapp.conversation.selection.SingleSelectedMessageActivity> r3 = com.whatsapp.conversation.selection.SingleSelectedMessageActivity.class
            r1 = 1
            java.lang.String r4 = "onSelectedEmojiChanged"
            java.lang.String r5 = "onSelectedEmojiChanged(Lcom/whatsapp/reactions/ReactionsTrayViewModel$SelectedEmoji;)V"
            goto L_0x000d
        L_0x007b:
            java.lang.Class<com.whatsapp.conversation.selection.SingleSelectedMessageActivity> r3 = com.whatsapp.conversation.selection.SingleSelectedMessageActivity.class
            r1 = 1
            java.lang.String r4 = "onReactionsTrayDisplayStateChanged"
            java.lang.String r5 = "onReactionsTrayDisplayStateChanged(I)V"
            goto L_0x000d
        L_0x0083:
            java.lang.Class<com.whatsapp.conversation.selection.SingleSelectedMessageActivity> r3 = com.whatsapp.conversation.selection.SingleSelectedMessageActivity.class
            r1 = 1
            java.lang.String r4 = "onFMessageChanged"
            java.lang.String r5 = "onFMessageChanged(Lcom/whatsapp/protocol/FMessage;)V"
            goto L_0x000d
        L_0x008b:
            java.lang.Class<com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity> r3 = com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity.class
            r1 = 1
            java.lang.String r4 = "onFMessageMediasChanged"
            java.lang.String r5 = "onFMessageMediasChanged(Ljava/util/List;)V"
            goto L_0x000d
        L_0x0094:
            java.lang.Class<X.1wC> r3 = X.C40841wC.class
            r1 = 1
            java.lang.String r4 = "onCurrentPageChanged"
            java.lang.String r5 = "onCurrentPageChanged(Lcom/whatsapp/conversation/selection/MessageSelectionDropDownViewModel$Page;)V"
            goto L_0x000d
        L_0x009d:
            java.lang.Class<X.2Kk> r3 = X.C43922Kk.class
            r1 = 1
            java.lang.String r4 = "onSelectedActionChanged"
            java.lang.String r5 = "onSelectedActionChanged(Lcom/whatsapp/conversation/conversationrow/message/selection/MessageSelectionAction;)V"
            goto L_0x000d
        L_0x00a6:
            java.lang.Class<X.2I0> r3 = X.AnonymousClass2I0.class
            r1 = 1
            java.lang.String r4 = "updateInlineFeedbackView"
            java.lang.String r5 = "updateInlineFeedbackView(Z)V"
            goto L_0x000d
        L_0x00af:
            java.lang.Class<com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity> r3 = com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity.class
            r1 = 1
            java.lang.String r4 = "updateCompanionDeviceInfo"
            java.lang.String r5 = "updateCompanionDeviceInfo(Lcom/whatsapp/data/device/CompanionDeviceInfo;)V"
            goto L_0x000d
        L_0x00b8:
            java.lang.Class<com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet> r3 = com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet.class
            r1 = 1
            java.lang.String r4 = "updateAllow"
            java.lang.String r5 = "updateAllow(Lcom/whatsapp/community/communitysettings/uiState/AllowNonAdminSubgroupCreationUiState;)V"
            goto L_0x000d
        L_0x00c1:
            java.lang.Class<com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet> r3 = com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet.class
            r1 = 1
            java.lang.String r4 = "updateRadioButtons"
            java.lang.String r5 = "updateRadioButtons(Z)V"
            goto L_0x000d
        L_0x00ca:
            java.lang.Class<X.1oB> r3 = X.C38291oB.class
            r1 = 1
            java.lang.String r4 = "updateMedia"
            java.lang.String r5 = "updateMedia(Ljava/util/ArrayList;)V"
            goto L_0x000d
        L_0x00d3:
            java.lang.Class<X.39m> r3 = X.C608239m.class
            r1 = 1
            java.lang.String r4 = "onUiState"
            java.lang.String r5 = "onUiState(Lcom/whatsapp/community/uistate/CommunitySuspendActionModeUiState;)V"
            goto L_0x000d
        L_0x00dc:
            java.lang.Class<X.3Ri> r3 = X.C65253Ri.class
            r1 = 1
            java.lang.String r4 = "onParentLongClick"
            java.lang.String r5 = "onParentLongClick(Lcom/whatsapp/jid/GroupJid;)Z"
            goto L_0x000d
        L_0x00e5:
            java.lang.Class<X.3Ri> r3 = X.C65253Ri.class
            r1 = 1
            java.lang.String r4 = "onParentClick"
            java.lang.String r5 = "onParentClick(Lcom/whatsapp/jid/GroupJid;)V"
            goto L_0x000d
        L_0x00ee:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            r1 = 1
            java.lang.String r4 = "updatePendingGroupsDialog"
            java.lang.String r5 = "updatePendingGroupsDialog(Lcom/whatsapp/community/communitysettings/uiState/PendingGroupsDialogUiState;)V"
            goto L_0x000d
        L_0x00f7:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            r1 = 1
            java.lang.String r4 = "updateMembersAddSettingRow"
            java.lang.String r5 = "updateMembersAddSettingRow(Z)V"
            goto L_0x000d
        L_0x0100:
            java.lang.Class<com.whatsapp.community.CommunitySettingsActivity> r3 = com.whatsapp.community.CommunitySettingsActivity.class
            r1 = 1
            java.lang.String r4 = "updateAllow"
            java.lang.String r5 = "updateAllow(Lcom/whatsapp/community/communitysettings/uiState/AllowNonAdminSubgroupCreationUiState;)V"
            goto L_0x000d
        L_0x0109:
            java.lang.Class<com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet> r3 = com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet.class
            r1 = 1
            java.lang.String r4 = "onCommunityRequestError"
            java.lang.String r5 = "onCommunityRequestError(I)V"
            goto L_0x000d
        L_0x0112:
            java.lang.Class<X.1pF> r3 = X.C38531pF.class
            r1 = 1
            java.lang.String r4 = "promptsUpdated"
            java.lang.String r5 = "promptsUpdated(Ljava/util/List;)V"
            goto L_0x000d
        L_0x011b:
            java.lang.Class<com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel> r3 = com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel.class
            r1 = 1
            java.lang.String r4 = "loadContacts"
            java.lang.String r5 = "loadContacts(Lcom/whatsapp/bonsai/sync/discovery/DiscoveryBots;)V"
            goto L_0x000d
        L_0x0124:
            java.lang.Class<com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet> r3 = com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet.class
            r1 = 1
            java.lang.String r4 = "onTypeChanged"
            java.lang.String r5 = "onTypeChanged(Lcom/whatsapp/bonsai/BonsaiSystemMessageBottomSheetViewModel$Type;)V"
            goto L_0x000d
        L_0x012d:
            java.lang.Class<X.2Gv> r3 = X.C43312Gv.class
            r1 = 1
            java.lang.String r4 = "onBackContainerVisibilityChanged"
            java.lang.String r5 = "onBackContainerVisibilityChanged(I)V"
            goto L_0x000d
        L_0x0136:
            java.lang.Class<X.2Gv> r3 = X.C43312Gv.class
            r1 = 1
            java.lang.String r4 = "onInformationIconVisibilityChanged"
            java.lang.String r5 = "onInformationIconVisibilityChanged(I)V"
            goto L_0x000d
        L_0x013f:
            java.lang.Class<X.2Gv> r3 = X.C43312Gv.class
            r1 = 1
            java.lang.String r4 = "onContactNameHolderVisibilityChanged"
            java.lang.String r5 = "onContactNameHolderVisibilityChanged(I)V"
            goto L_0x000d
        L_0x0148:
            java.lang.Class<X.2Gv> r3 = X.C43312Gv.class
            r1 = 1
            java.lang.String r4 = "onContactPhotoVisibilityChanged"
            java.lang.String r5 = "onContactPhotoVisibilityChanged(I)V"
            goto L_0x000d
        L_0x0151:
            java.lang.Class<X.2Gv> r3 = X.C43312Gv.class
            r1 = 1
            java.lang.String r4 = "onSubtitleTextChanged"
            java.lang.String r5 = "onSubtitleTextChanged(Lcom/whatsapp/bonsai/BonsaiConversationTitleViewModel$SubtitleText;)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53102qm.<init>(java.lang.Object, int):void");
    }

    public static Object A01(Object obj, C03000Ct r2) {
        AnonymousClass00C.A0D(obj, 0);
        return r2.receiver;
    }

    public static final CommunityPendingSuggestionsConfirmationDialog A00(int i, int i2, int i3) {
        CommunityPendingSuggestionsConfirmationDialog communityPendingSuggestionsConfirmationDialog = new CommunityPendingSuggestionsConfirmationDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("dialogId", i);
        A07.putInt("availableGroups", i2);
        A07.putInt("totalPendingGroups", i3);
        communityPendingSuggestionsConfirmationDialog.A17(A07);
        return communityPendingSuggestionsConfirmationDialog;
    }

    public static C53102qm A02(Object obj, int i) {
        return new C53102qm(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0252, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0256, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0259, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x025a, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a4, code lost:
        r0 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl(r0.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02af, code lost:
        if (r1.isCancelled != false) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b1, code lost:
        r0 = r0.A04(com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.class, "result");
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02bd, code lost:
        if (r0 == null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bf, code lost:
        r10 = X.AnonymousClass001.A0I();
        r18 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02cb, code lost:
        if (r18.hasNext() == false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02cd, code lost:
        r7 = (X.AnonymousClass9Y8) r18.next();
        r8 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d5, code lost:
        if (r8 == null) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d7, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d8, code lost:
        if (r7 == null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02da, code lost:
        r0 = X.C28981Uw.A03;
        r17 = X.C65313Ro.A00(r7.A07(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        r0 = r8.A02;
        r58 = r0;
        r0 = X.AnonymousClass1ZL.A00(X.C36371kC.A0W(r0, r17), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f7, code lost:
        if ((r0 instanceof X.C44072La) == false) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f9, code lost:
        r0 = (X.C44072La) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fb, code lost:
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fd, code lost:
        if (r0 == null) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0303, code lost:
        if (r0.A02 == -1) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0305, code lost:
        r6 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.class;
        r9 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030d, code lost:
        if (r9 == null) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030f, code lost:
        r9 = r9.A03(com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Picture.class, "picture");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0317, code lost:
        if (r9 == null) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0319, code lost:
        r3 = r9.A07(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r9.A06(com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType.A01, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r9.A07("url");
        r9 = new X.AnonymousClass3NQ(r3, r9.A07("direct_path"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0334, code lost:
        r15 = null;
        r3 = X.AnonymousClass1ZL.A05((X.C44072La) null, r9, true);
        r8.A04.A05(r0, (X.C44072La) null, r17, r3, r3);
        r14 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034f, code lost:
        if (r14 == null) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0351, code lost:
        r14 = r14.A03(com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Name.class, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0359, code lost:
        if (r0 == null) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x035b, code lost:
        r9 = r0.A0R;
        r15 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035f, code lost:
        if (r14 == null) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0361, code lost:
        r32 = r14.A07("text");
        r2 = r14.A00.optString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036d, code lost:
        if (r2 == null) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036f, code lost:
        r43 = java.lang.Long.parseLong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0373, code lost:
        r21 = r3.A02;
        r53 = r3.A01;
        r3 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x037f, code lost:
        if (r3 == null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0381, code lost:
        r2 = r3.A07("creation_time");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0387, code lost:
        if (r2 == null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0389, code lost:
        r51 = X.C36411kG.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038d, code lost:
        r3 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0391, code lost:
        if (r3 == null) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0393, code lost:
        r37 = r3.A07("invite");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0399, code lost:
        r2 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x039d, code lost:
        if (r2 == null) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x039f, code lost:
        r2 = r2.A07("subscribers_count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a5, code lost:
        if (r2 == null) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a7, code lost:
        r12 = java.lang.Long.parseLong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ab, code lost:
        if (r0 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ad, code lost:
        r14 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03af, code lost:
        r28 = X.C52162oz.PUBLIC;
        r2 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03b5, code lost:
        if (r2 == null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b7, code lost:
        r2 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState) r2.A06(com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c1, code lost:
        if (r2 == null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c8, code lost:
        if (r2.ordinal() != 1) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ca, code lost:
        r30 = X.C52182p1.VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03cc, code lost:
        r3 = r7.A03(r6, "thread_metadata");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03d0, code lost:
        if (r3 == null) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d2, code lost:
        r4 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource) r3.A06(com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03dc, code lost:
        r27 = X.AnonymousClass1ZL.A04(r4);
        r29 = X.C52282pB.NOT_ENFORCED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e2, code lost:
        if (r0 == null) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03e4, code lost:
        r3 = r0.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03e6, code lost:
        r23 = r9;
        r24 = r14;
        r21 = new X.C44072La((X.C23931Ak) null, r23, r24, X.C52452pS.DEFAULT, X.C52392pM.DEFAULT, r27, r28, r29, r30, (java.lang.Long) null, r32, (java.lang.String) null, (java.lang.String) null, r21, (java.lang.String) null, r37, X.AnonymousClass001.A0I(), 0, 1, r15, r43, 0, 0, r53, r51, r12, r3, false, false);
        r21.A0K(r0);
        r58.A0I(r21, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0423, code lost:
        if (r0 == null) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0425, code lost:
        r8.A03.A0A(X.C36371kC.A11(r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042e, code lost:
        r10.add(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0433, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0435, code lost:
        r30 = X.C52182p1.NOT_VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0438, code lost:
        r14 = X.C52382pL.GUEST;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x043c, code lost:
        r37 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0440, code lost:
        r51 = X.C19970wo.A00(r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0448, code lost:
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x044a, code lost:
        r43 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044e, code lost:
        if (r14 == null) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0450, code lost:
        r15 = r14.A07("text");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0456, code lost:
        r9 = new X.C65073Qp((X.AnonymousClass11F) r17);
        r9.A0W = -1;
        r9.A0h = r15;
        r9.A02 = 4;
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0468, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x046b, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x046e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0471, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x047a, code lost:
        throw X.C36331k8.A0d("newsletterGraphqlUtil");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x047b, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x047f, code lost:
        if (r1.filterOutSubscribedChannels == false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0481, code lost:
        if (r10 == null) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0483, code lost:
        r4 = X.AnonymousClass001.A0I();
        r3 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x048f, code lost:
        if (r3.hasNext() == false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0491, code lost:
        r2 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x049c, code lost:
        if (((X.C44072La) r2).A0N() == false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x049e, code lost:
        r4.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a2, code lost:
        if (r10 == null) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04a5, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04a6, code lost:
        r3 = r1.callback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04a8, code lost:
        if (r3 == null) goto L_0x0b4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04aa, code lost:
        r1 = r0.A03(com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.PageInfo.class, "page_info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04b4, code lost:
        if (r1 == null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04b6, code lost:
        r19 = r1.A07("endCursor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04bc, code lost:
        r3.Bmz(r19, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0702, code lost:
        if (r0.A1J.A02 != false) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0788, code lost:
        if (r60 == null) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x078a, code lost:
        r2.setResult(0, (android.content.Intent) null);
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x079b, code lost:
        r2.A3m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08ee, code lost:
        if (r0 != null) goto L_0x08f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b09, code lost:
        if (r0 != null) goto L_0x0b18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0b18, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0b4d, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r60) {
        /*
            r59 = this;
            r4 = r60
            r8 = r59
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0b1c;
                case 1: goto L_0x0b0c;
                case 2: goto L_0x0afb;
                case 3: goto L_0x0af0;
                case 4: goto L_0x0ae1;
                case 5: goto L_0x0aa6;
                case 6: goto L_0x0a7d;
                case 7: goto L_0x0a36;
                case 8: goto L_0x0a01;
                case 9: goto L_0x0980;
                case 10: goto L_0x0953;
                case 11: goto L_0x0926;
                case 12: goto L_0x0900;
                case 13: goto L_0x0041;
                case 14: goto L_0x08d4;
                case 15: goto L_0x08be;
                case 16: goto L_0x089e;
                case 17: goto L_0x0871;
                case 18: goto L_0x0864;
                case 19: goto L_0x07c9;
                case 20: goto L_0x07ab;
                case 21: goto L_0x07a0;
                case 22: goto L_0x0784;
                case 23: goto L_0x0765;
                case 24: goto L_0x069f;
                case 25: goto L_0x064f;
                case 26: goto L_0x0564;
                case 27: goto L_0x054b;
                case 28: goto L_0x050e;
                case 29: goto L_0x04c3;
                case 30: goto L_0x0281;
                case 31: goto L_0x0009;
                case 32: goto L_0x025e;
                case 33: goto L_0x0009;
                case 34: goto L_0x008f;
                case 35: goto L_0x0029;
                case 36: goto L_0x0083;
                case 37: goto L_0x006c;
                case 38: goto L_0x0057;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = A01(r4, r8)
            X.2YD r1 = (X.AnonymousClass2YD) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0023
            X.4UA r2 = r1.callback
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = r4.toString()
            X.8fQ r0 = new X.8fQ
            r0.<init>(r1)
            r2.BWe(r0)
        L_0x0023:
            r0 = 1
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0029:
            java.lang.Object r1 = A01(r4, r8)
            X.2Y9 r1 = (X.AnonymousClass2Y9) r1
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0023
            X.4RF r0 = r1.callback
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r4.toString()
            X.8fQ r0 = new X.8fQ
            r0.<init>(r1)
            goto L_0x0023
        L_0x0041:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r1 = A01(r4, r8)
            X.3Ri r1 = (X.C65253Ri) r1
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0055
            X.C65253Ri.A01(r1, r4)
            goto L_0x0023
        L_0x0055:
            r0 = 0
            goto L_0x0024
        L_0x0057:
            X.3HV r4 = (X.AnonymousClass3HV) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            java.lang.Object r0 = r8.receiver
            X.3pR r0 = (X.C76783pR) r0
            X.0wN r2 = r0.A01
            java.lang.String r1 = "participant-attribute-parser"
            java.lang.String r0 = r4.A00
            r2.A0E(r1, r0, r3)
            goto L_0x0b4b
        L_0x006c:
            X.3QD r4 = (X.AnonymousClass3QD) r4
            java.lang.Object r2 = A01(r4, r8)
            X.3pR r2 = (X.C76783pR) r2
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0b4b
            X.9gO r1 = r4.A00
            if (r1 == 0) goto L_0x0b4b
            X.0xQ r0 = r2.A02
            r0.A0X(r1)
            goto L_0x0b4b
        L_0x0083:
            X.3Jv r4 = (X.C63383Jv) r4
            java.lang.Object r0 = A01(r4, r8)
            X.3Kp r0 = (X.C63583Kp) r0
            r0.A00 = r4
            goto L_0x0b4b
        L_0x008f:
            X.9Y8 r4 = (X.AnonymousClass9Y8) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.Object r3 = r8.receiver
            X.2Y9 r3 = (X.AnonymousClass2Y9) r3
            boolean r1 = r3.isCancelled
            if (r1 != 0) goto L_0x0b4b
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.class
            java.lang.String r1 = "xwa2_newsletter_subscribers"
            X.9Y8 r4 = r4.A03(r2, r1)
            r15 = 0
            if (r4 == 0) goto L_0x00c1
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.class
            java.lang.String r1 = "subscribers"
            X.9Y8 r5 = r4.A03(r2, r1)
        L_0x00b0:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            if (r5 == 0) goto L_0x0149
            X.0wo r1 = r3.A00
            if (r1 != 0) goto L_0x00c3
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c1:
            r5 = r15
            goto L_0x00b0
        L_0x00c3:
            long r18 = X.C19970wo.A00(r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers$Edges> r4 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.Edges.class
            java.lang.String r1 = "edges"
            X.1Ak r1 = r5.A04(r4, r1)
            X.14x r9 = r1.iterator()
        L_0x00d3:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0149
            java.lang.Object r5 = r9.next()
            X.9Y8 r5 = (X.AnonymousClass9Y8) r5
            X.13o r8 = com.whatsapp.jid.Jid.Companion
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl$Xwa2NewsletterSubscribers$Subscribers$Edges$Node> r7 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.Xwa2NewsletterSubscribers.Subscribers.Edges.Node.class
            java.lang.String r6 = "node"
            X.9Y8 r4 = r5.A03(r7, r6)
            java.lang.String r1 = "id"
            java.lang.String r1 = r4.A07(r1)
            com.whatsapp.jid.Jid r13 = r8.A02(r1)
            X.13w r13 = (X.C223313w) r13
            X.9Y8 r4 = r5.A03(r7, r6)
            java.lang.String r1 = "pn"
            java.lang.String r1 = r4.A07(r1)
            com.whatsapp.jid.Jid r4 = r8.A02(r1)
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            if (r13 == 0) goto L_0x0117
            if (r4 == 0) goto L_0x0117
            X.12O r1 = r3.A01
            if (r1 != 0) goto L_0x0114
            java.lang.String r0 = "waJidMapRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0114:
            r1.A0H(r13, r4)
        L_0x0117:
            X.1Uw r14 = r3.newsletterJid
            X.9Y8 r4 = r5.A03(r7, r6)
            java.lang.String r1 = "display_name"
            java.lang.String r16 = r4.A07(r1)
            X.1ZL r1 = r3.A03
            if (r1 != 0) goto L_0x012e
            java.lang.String r0 = "newsletterGraphqlUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012e:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r4 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "role"
            java.lang.Enum r1 = r5.A06(r4, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r1 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r1
            X.2pL r11 = X.AnonymousClass1ZL.A01(r1)
            X.2p0 r12 = r3.typeOfFetch
            X.3KO r10 = new X.3KO
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r2.add(r10)
            goto L_0x00d3
        L_0x0149:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "NewsletterSubscribersGraphqlJob/handleResponse "
            X.C36341k9.A1N(r1, r4, r2)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1ZV r8 = r3.A02
            if (r8 != 0) goto L_0x0164
            java.lang.String r0 = "newsletterSubscribersManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0164:
            X.1Uw r4 = r3.newsletterJid
            X.2p0 r9 = r3.typeOfFetch
            X.C36331k8.A1I(r4, r9)
            X.12P r1 = r8.A02
            X.1M0 r5 = r1.A05()
            X.71s r7 = r5.B1k()     // Catch:{ all -> 0x0257 }
            r6 = 1
            X.1M0 r10 = r1.A05()     // Catch:{ all -> 0x01a3 }
            java.lang.String[] r11 = X.C36441kJ.A1S()     // Catch:{ all -> 0x019c }
            X.163 r1 = r8.A00     // Catch:{ all -> 0x019c }
            X.C36331k8.A19(r1, r4, r11, r0)     // Catch:{ all -> 0x019c }
            int r0 = r9.value     // Catch:{ all -> 0x019c }
            X.C36431kI.A1O(r11, r0, r6)     // Catch:{ all -> 0x019c }
            X.14e r9 = r10.A02     // Catch:{ all -> 0x019c }
            java.lang.String r6 = "newsletter_subscribers"
            java.lang.String r1 = "chat_row_id=? AND type_of_fetch=?"
            java.lang.String r0 = "DELETE_NEWSLETTER_SUBSCRIBERS_FOR_TYPE"
            int r0 = r9.A03(r6, r1, r0, r11)     // Catch:{ all -> 0x019c }
            r10.close()     // Catch:{ all -> 0x01a3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01a3 }
            goto L_0x01a9
        L_0x019c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x019e }
        L_0x019e:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x01a3 }
            throw r0     // Catch:{ all -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x0250 }
            r1.<init>(r0)     // Catch:{ all -> 0x0250 }
        L_0x01a9:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x0250 }
            if (r1 == 0) goto L_0x01b4
            java.lang.String r0 = "NewsletterSubscribersManager/deleteNewsletterSubscribersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0250 }
        L_0x01b4:
            X.163 r0 = r8.A00     // Catch:{ all -> 0x0250 }
            long r16 = r0.A08(r4)     // Catch:{ all -> 0x0250 }
            java.util.Iterator r15 = r2.iterator()     // Catch:{ all -> 0x0250 }
        L_0x01be:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x023e
            java.lang.Object r10 = r15.next()     // Catch:{ all -> 0x0250 }
            X.3KO r10 = (X.AnonymousClass3KO) r10     // Catch:{ all -> 0x0250 }
            X.14e r9 = r5.A02     // Catch:{ all -> 0x0250 }
            java.lang.String r6 = "newsletter_subscribers"
            X.13w r1 = r10.A03     // Catch:{ all -> 0x0250 }
            r13 = -1
            if (r1 == 0) goto L_0x023b
            X.12j r0 = r8.A01     // Catch:{ all -> 0x0250 }
            long r11 = r0.A07(r1)     // Catch:{ all -> 0x0250 }
        L_0x01da:
            android.content.ContentValues r4 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0250 }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "chat_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "jid_row_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            java.lang.String r1 = r10.A05     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "display_name"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            java.lang.String r1 = r10.A06     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "profile_picture_direct_path"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            java.lang.Long r0 = r10.A04     // Catch:{ all -> 0x0250 }
            if (r0 == 0) goto L_0x0206
            long r13 = r0.longValue()     // Catch:{ all -> 0x0250 }
        L_0x0206:
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "subscription_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            X.2pL r0 = r10.A01     // Catch:{ all -> 0x0250 }
            int r0 = r0.value     // Catch:{ all -> 0x0250 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "role"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            X.2p0 r0 = r10.A02     // Catch:{ all -> 0x0250 }
            int r0 = r0.value     // Catch:{ all -> 0x0250 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "type_of_fetch"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            long r0 = r10.A00     // Catch:{ all -> 0x0250 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "fetched_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x0250 }
            r1 = 5
            java.lang.String r0 = "STORE_NEWSLETTER_SUBSCRIBERS"
            r9.A08(r6, r0, r4, r1)     // Catch:{ all -> 0x0250 }
            goto L_0x01be
        L_0x023b:
            r11 = -1
            goto L_0x01da
        L_0x023e:
            r7.A00()     // Catch:{ all -> 0x0250 }
            r7.close()     // Catch:{ all -> 0x0257 }
            r5.close()
            X.4RF r0 = r3.callback
            if (r0 == 0) goto L_0x0b4b
            r0.Bi0(r2)
            goto L_0x0b4b
        L_0x0250:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0257 }
            throw r0     // Catch:{ all -> 0x0257 }
        L_0x0257:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0259 }
        L_0x0259:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x025e:
            X.9Y8 r4 = (X.AnonymousClass9Y8) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            java.lang.Object r1 = r8.receiver
            X.2YD r1 = (X.AnonymousClass2YD) r1
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl$Xwa2NewslettersDirectorySearch> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl.Xwa2NewslettersDirectorySearch.class
            java.lang.String r0 = "xwa2_newsletters_directory_search"
            X.9Y8 r0 = r4.A03(r2, r0)
            if (r0 != 0) goto L_0x02a4
            X.4UA r2 = r1.callback
            if (r2 == 0) goto L_0x0b4b
            r1 = 0
            X.8fP r0 = new X.8fP
            r0.<init>(r1, r3)
            r2.BWe(r0)
            goto L_0x0b4b
        L_0x0281:
            X.9Y8 r4 = (X.AnonymousClass9Y8) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            java.lang.Object r1 = r8.receiver
            X.2YD r1 = (X.AnonymousClass2YD) r1
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl$Xwa2NewslettersDirectoryList> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl.Xwa2NewslettersDirectoryList.class
            java.lang.String r0 = "xwa2_newsletters_directory_list"
            X.9Y8 r0 = r4.A03(r2, r0)
            if (r0 != 0) goto L_0x02a4
            X.4UA r2 = r1.callback
            if (r2 == 0) goto L_0x0b4b
            r1 = 0
            X.8fP r0 = new X.8fP
            r0.<init>(r1, r3)
            r2.BWe(r0)
            goto L_0x0b4b
        L_0x02a4:
            org.json.JSONObject r2 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl r20 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl
            r0 = r20
            r0.<init>(r2)
            boolean r0 = r1.isCancelled
            if (r0 != 0) goto L_0x0b4b
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl$Result> r3 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.class
            java.lang.String r2 = "result"
            r0 = r20
            X.1Ak r0 = r0.A04(r3, r2)
            r19 = 0
            if (r0 == 0) goto L_0x047b
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.util.Iterator r18 = r0.iterator()
        L_0x02c7:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x047d
            java.lang.Object r7 = r18.next()
            X.9Y8 r7 = (X.AnonymousClass9Y8) r7
            X.1ZL r8 = r1.A03
            if (r8 == 0) goto L_0x0474
            r4 = 0
            if (r7 == 0) goto L_0x02c7
            X.3Ro r0 = X.C28981Uw.A03
            java.lang.String r11 = "id"
            java.lang.String r0 = r7.A07(r11)
            X.1Uw r17 = X.C65313Ro.A00(r0)
            X.12q r0 = r8.A02
            r58 = r0
            r2 = r0
            r0 = r17
            X.3Qp r0 = X.C36371kC.A0W(r2, r0)
            X.3Qp r0 = X.AnonymousClass1ZL.A00(r0, r8)
            boolean r2 = r0 instanceof X.C44072La
            if (r2 == 0) goto L_0x0471
            X.2La r0 = (X.C44072La) r0
        L_0x02fb:
            r12 = -1
            if (r0 == 0) goto L_0x046e
            long r2 = r0.A02
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x046e
        L_0x0305:
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl$Result$ThreadMetadata> r6 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.class
            java.lang.String r5 = "thread_metadata"
            X.9Y8 r9 = r7.A03(r6, r5)
            if (r9 == 0) goto L_0x046b
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl$Result$ThreadMetadata$Picture> r3 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Picture.class
            java.lang.String r2 = "picture"
            X.9Y8 r9 = r9.A03(r3, r2)
            if (r9 == 0) goto L_0x046b
            java.lang.String r3 = r9.A07(r11)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType r14 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "type"
            r9.A06(r14, r2)
            java.lang.String r2 = "url"
            r9.A07(r2)
            java.lang.String r2 = "direct_path"
            java.lang.String r2 = r9.A07(r2)
            X.3NQ r9 = new X.3NQ
            r9.<init>(r3, r2)
        L_0x0334:
            r15 = 0
            r3 = 1
            X.3JG r3 = X.AnonymousClass1ZL.A05(r4, r9, r3)
            X.1ZJ r2 = r8.A04
            r26 = r3
            r22 = r0
            r23 = r4
            r24 = r17
            r25 = r3
            r21 = r2
            r21.A05(r22, r23, r24, r25, r26)
            X.9Y8 r14 = r7.A03(r6, r5)
            if (r14 == 0) goto L_0x0468
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl$Result$ThreadMetadata$Name> r9 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Name.class
            java.lang.String r2 = "name"
            X.9Y8 r14 = r14.A03(r9, r2)
        L_0x0359:
            if (r0 == 0) goto L_0x044e
            X.3Qp r9 = r0.A0R
            long r15 = r0.A02
        L_0x035f:
            if (r14 == 0) goto L_0x0448
            java.lang.String r2 = "text"
            java.lang.String r32 = r14.A07(r2)
            org.json.JSONObject r2 = r14.A00
            java.lang.String r2 = r2.optString(r11)
            if (r2 == 0) goto L_0x044a
            long r43 = java.lang.Long.parseLong(r2)
        L_0x0373:
            java.lang.String r2 = r3.A02
            r21 = r2
            long r2 = r3.A01
            r53 = r2
            X.9Y8 r3 = r7.A03(r6, r5)
            if (r3 == 0) goto L_0x0440
            java.lang.String r2 = "creation_time"
            java.lang.String r2 = r3.A07(r2)
            if (r2 == 0) goto L_0x0440
            long r51 = X.C36411kG.A0B(r2)
        L_0x038d:
            X.9Y8 r3 = r7.A03(r6, r5)
            if (r3 == 0) goto L_0x043c
            java.lang.String r2 = "invite"
            java.lang.String r37 = r3.A07(r2)
        L_0x0399:
            X.9Y8 r2 = r7.A03(r6, r5)
            if (r2 == 0) goto L_0x03ab
            java.lang.String r3 = "subscribers_count"
            java.lang.String r2 = r2.A07(r3)
            if (r2 == 0) goto L_0x03ab
            long r12 = java.lang.Long.parseLong(r2)
        L_0x03ab:
            if (r0 == 0) goto L_0x0438
            X.2pL r14 = r0.A09
        L_0x03af:
            X.2oz r28 = X.C52162oz.PUBLIC
            X.9Y8 r2 = r7.A03(r6, r5)
            if (r2 == 0) goto L_0x0435
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r11 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "verification"
            java.lang.Enum r2 = r2.A06(r11, r3)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r2 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState) r2
            if (r2 == 0) goto L_0x0435
            int r3 = r2.ordinal()
            r2 = 1
            if (r3 != r2) goto L_0x0435
            X.2p1 r30 = X.C52182p1.VERIFIED
        L_0x03cc:
            X.9Y8 r3 = r7.A03(r6, r5)
            if (r3 == 0) goto L_0x03dc
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r4 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "verification_source"
            java.lang.Enum r4 = r3.A06(r4, r2)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r4 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource) r4
        L_0x03dc:
            X.2pA r27 = X.AnonymousClass1ZL.A04(r4)
            X.2pB r29 = X.C52282pB.NOT_ENFORCED
            if (r0 == 0) goto L_0x0433
            boolean r3 = r0.A0O
        L_0x03e6:
            r45 = 0
            java.util.ArrayList r38 = X.AnonymousClass001.A0I()
            X.2pM r26 = X.C52392pM.DEFAULT
            X.2pS r25 = X.C52452pS.DEFAULT
            r40 = 1
            X.2La r2 = new X.2La
            r31 = r19
            r33 = r19
            r34 = r19
            r36 = r19
            r39 = 0
            r47 = 0
            r56 = 0
            r57 = 0
            r22 = r19
            r23 = r9
            r24 = r14
            r35 = r21
            r41 = r15
            r49 = r53
            r53 = r12
            r55 = r3
            r21 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49, r51, r53, r55, r56, r57)
            r2.A0K(r0)
            r4 = r58
            r3 = r17
            r4.A0I(r2, r3)
            if (r0 == 0) goto L_0x042e
            X.1Ja r3 = r8.A03
            java.util.List r0 = X.C36371kC.A11(r2)
            r3.A0A(r0)
        L_0x042e:
            r10.add(r2)
            goto L_0x02c7
        L_0x0433:
            r3 = 1
            goto L_0x03e6
        L_0x0435:
            X.2p1 r30 = X.C52182p1.NOT_VERIFIED
            goto L_0x03cc
        L_0x0438:
            X.2pL r14 = X.C52382pL.GUEST
            goto L_0x03af
        L_0x043c:
            r37 = r4
            goto L_0x0399
        L_0x0440:
            X.0wo r2 = r8.A01
            long r51 = X.C19970wo.A00(r2)
            goto L_0x038d
        L_0x0448:
            r32 = r4
        L_0x044a:
            r43 = -1
            goto L_0x0373
        L_0x044e:
            if (r14 == 0) goto L_0x0456
            java.lang.String r2 = "text"
            java.lang.String r15 = r14.A07(r2)
        L_0x0456:
            X.3Qp r9 = new X.3Qp
            r2 = r17
            r9.<init>((X.AnonymousClass11F) r2)
            r9.A0W = r12
            r9.A0h = r15
            r2 = 4
            r9.A02 = r2
            r15 = -1
            goto L_0x035f
        L_0x0468:
            r14 = r4
            goto L_0x0359
        L_0x046b:
            r9 = 0
            goto L_0x0334
        L_0x046e:
            r0 = r4
            goto L_0x0305
        L_0x0471:
            r0 = 0
            goto L_0x02fb
        L_0x0474:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x047b:
            r10 = r19
        L_0x047d:
            boolean r0 = r1.filterOutSubscribedChannels
            if (r0 == 0) goto L_0x04a2
            if (r10 == 0) goto L_0x0b4b
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r10.iterator()
        L_0x048b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04a5
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.2La r0 = (X.C44072La) r0
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x048b
            r4.add(r2)
            goto L_0x048b
        L_0x04a2:
            if (r10 == 0) goto L_0x0b4b
            goto L_0x04a6
        L_0x04a5:
            r10 = r4
        L_0x04a6:
            X.4UA r3 = r1.callback
            if (r3 == 0) goto L_0x0b4b
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl$PageInfo> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl.PageInfo.class
            java.lang.String r1 = "page_info"
            r0 = r20
            X.9Y8 r1 = r0.A03(r2, r1)
            if (r1 == 0) goto L_0x04bc
            java.lang.String r0 = "endCursor"
            java.lang.String r19 = r1.A07(r0)
        L_0x04bc:
            r0 = r19
            r3.Bmz(r0, r10)
            goto L_0x0b4b
        L_0x04c3:
            java.util.List r4 = (java.util.List) r4
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)
            java.lang.Object r6 = r8.receiver
            X.1qJ r6 = (X.C38841qJ) r6
            android.view.View r1 = r6.getContentView()
            r0 = 2131431349(0x7f0b0fb5, float:1.8484425E38)
            android.view.View r5 = X.C36361kB.A0G(r1, r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x04e3
            r5.removeAllViews()
        L_0x04e3:
            java.util.Iterator r3 = r4.iterator()
        L_0x04e7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b4b
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            android.content.Context r0 = r6.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625435(0x7f0e05db, float:1.8878078E38)
            android.view.View r1 = r1.inflate(r0, r5, r7)
            r0 = 2131431350(0x7f0b0fb6, float:1.8484427E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r1, r0)
            if (r0 == 0) goto L_0x050a
            r0.setText(r2)
        L_0x050a:
            r5.addView(r1)
            goto L_0x04e7
        L_0x050e:
            int r4 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r3 = r8.receiver
            com.whatsapp.home.ui.HomePlaceholderActivity r3 = (com.whatsapp.home.ui.HomePlaceholderActivity) r3
            r0 = 2131430815(0x7f0b0d9f, float:1.8483342E38)
            android.view.View r2 = r3.findViewById(r0)
            com.whatsapp.home.ui.HomePlaceholderActivity$HomePlaceholderView r2 = (com.whatsapp.home.ui.HomePlaceholderActivity.HomePlaceholderView) r2
            if (r2 == 0) goto L_0x0b4b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A01
            if (r0 == 0) goto L_0x052e
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A01
            r1.removeOnGlobalLayoutListener(r0)
        L_0x052e:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r1, r0)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            X.3ZN r0 = new X.3ZN
            r0.<init>(r1, r2, r3, r4)
            r3.A01 = r0
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.A01
            r1.addOnGlobalLayoutListener(r0)
            goto L_0x0b4b
        L_0x054b:
            X.2bT r4 = (X.AnonymousClass2bT) r4
            java.lang.Object r5 = A01(r4, r8)
            X.1uu r5 = (X.C40091uu) r5
            X.040 r3 = X.C109325Xd.A00(r5)
            X.02l r2 = r5.A09
            r1 = 0
            com.whatsapp.events.EventInfoViewModel$updateResponseItems$1 r0 = new com.whatsapp.events.EventInfoViewModel$updateResponseItems$1
            r0.<init>(r4, r5, r1)
            X.C36381kD.A1R(r2, r0, r3)
            goto L_0x0b4b
        L_0x0564:
            X.2bT r4 = (X.AnonymousClass2bT) r4
            r2 = 0
            X.AnonymousClass00C.A0D(r4, r2)
            java.lang.Object r5 = r8.receiver
            X.2ML r5 = (X.AnonymousClass2ML) r5
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x05e0
            X.2oc r3 = X.C51932oc.CANCELED
        L_0x0574:
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x05aa;
                case 1: goto L_0x05aa;
                case 2: goto L_0x0624;
                case 3: goto L_0x057b;
                case 4: goto L_0x057b;
                case 5: goto L_0x061b;
                default: goto L_0x057b;
            }
        L_0x057b:
            X.1RJ r0 = r5.A07
            android.view.View r4 = X.C36391kE.A0L(r0, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.2oc r1 = X.C51932oc.NOT_RESPONDED
            r0 = 2131887734(0x7f120676, float:1.9410083E38)
            if (r3 != r1) goto L_0x058d
            r0 = 2131887738(0x7f12067a, float:1.9410092E38)
        L_0x058d:
            r4.setText(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231716(0x7f0803e4, float:1.807952E38)
            android.graphics.drawable.Drawable r0 = X.C36381kD.A0H(r1, r0)
            r4.setBackground(r0)
            android.content.Context r3 = r4.getContext()
            r0 = 2131100993(0x7f060541, float:1.7814383E38)
        L_0x05a5:
            X.C36331k8.A0r(r3, r4, r0)
            goto L_0x0b4b
        L_0x05aa:
            X.1RJ r0 = r5.A07
            android.view.View r4 = X.C36391kE.A0L(r0, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.2oc r1 = X.C51932oc.GOING
            r0 = 2131887735(0x7f120677, float:1.9410085E38)
            if (r3 != r1) goto L_0x05bc
            r0 = 2131887736(0x7f120678, float:1.9410088E38)
        L_0x05bc:
            r4.setText(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131231717(0x7f0803e5, float:1.8079523E38)
            android.graphics.drawable.Drawable r0 = X.C36381kD.A0H(r1, r0)
            r4.setBackground(r0)
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            r1 = 2130969749(0x7f040495, float:1.7548189E38)
            r0 = 2131100995(0x7f060543, float:1.7814387E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            goto L_0x05a5
        L_0x05e0:
            X.1Xa r0 = r5.getEventMessageManager()
            boolean r0 = r0.A04(r4)
            if (r0 == 0) goto L_0x05ed
            X.2oc r3 = X.C51932oc.PAST_EVENT
            goto L_0x0574
        L_0x05ed:
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x05f7
            X.2oc r3 = X.C51932oc.CREATOR
            goto L_0x0574
        L_0x05f7:
            X.1Xa r0 = r5.getEventMessageManager()
            X.2bd r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x0617
            X.2pC r0 = r0.A01
            if (r0 == 0) goto L_0x0617
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0613
            r0 = 2
            if (r1 != r0) goto L_0x0617
            X.2oc r3 = X.C51932oc.NOT_GOING
            goto L_0x0574
        L_0x0613:
            X.2oc r3 = X.C51932oc.GOING
            goto L_0x0574
        L_0x0617:
            X.2oc r3 = X.C51932oc.NOT_RESPONDED
            goto L_0x0574
        L_0x061b:
            X.1RJ r1 = r5.A07
            r0 = 8
            r1.A03(r0)
            goto L_0x0b4b
        L_0x0624:
            X.1RJ r0 = r5.A07
            android.view.View r3 = X.C36391kE.A0L(r0, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131887737(0x7f120679, float:1.941009E38)
            r3.setText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131231718(0x7f0803e6, float:1.8079525E38)
            android.graphics.drawable.Drawable r0 = X.C36381kD.A0H(r1, r0)
            r3.setBackground(r0)
            android.content.Context r2 = X.C36371kC.A0B(r3)
            r1 = 2130971216(0x7f040a50, float:1.7551164E38)
            r0 = 2131102781(0x7f060c3d, float:1.781801E38)
            X.C36321k7.A0M(r2, r3, r1, r0)
            goto L_0x0b4b
        L_0x064f:
            X.3GR r4 = (X.AnonymousClass3GR) r4
            java.lang.Object r6 = A01(r4, r8)
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r6 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r6
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0b4b
            X.1tL r0 = r6.A07
            r5 = 0
            if (r0 != 0) goto L_0x0667
            java.lang.String r0 = "singleSelectedMessageViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0667:
            X.00s r0 = r0.A00
            X.3T1 r3 = X.C36431kI.A0r(r0)
            if (r3 == 0) goto L_0x0b4b
            java.lang.String r0 = r4.A01
            int r0 = r0.length()
            boolean r2 = X.AnonymousClass000.A1R(r0)
            X.1X4 r1 = r6.A02
            if (r1 == 0) goto L_0x0698
            java.lang.String r0 = r4.A00
            boolean r0 = r1.A0e(r3, r0, r2)
            if (r0 == 0) goto L_0x0696
            X.2IR r1 = r6.A03
            if (r1 == 0) goto L_0x068d
            r0 = 4
            r1.setVisibility(r0)
        L_0x068d:
            r0 = 1
        L_0x068e:
            r6.setResult(r0, r5)
            r6.finish()
            goto L_0x0b4b
        L_0x0696:
            r0 = 2
            goto L_0x068e
        L_0x0698:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x069f:
            int r1 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r3 = r8.receiver
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r3 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r3
            r0 = 1
            java.lang.String r5 = "reactionsTrayLayout"
            if (r1 == r0) goto L_0x06ca
            r0 = 2
            if (r1 != r0) goto L_0x0b4b
            X.2Ka r1 = r3.A05
            if (r1 != 0) goto L_0x06b8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x06b8:
            r0 = 8
            r1.setVisibility(r0)
            X.00T r0 = r3.A0G
            java.lang.Object r0 = r0.getValue()
            X.1qM r0 = (X.C38871qM) r0
            r0.A0E()
            goto L_0x0b4b
        L_0x06ca:
            X.00T r0 = r3.A0G
            java.lang.Object r0 = r0.getValue()
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
            X.2Ka r0 = r3.A05
            if (r0 != 0) goto L_0x06de
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x06de:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0743
            X.2IR r4 = r3.A03
            if (r4 == 0) goto L_0x0743
            X.1tL r0 = r3.A07
            if (r0 != 0) goto L_0x06f3
            java.lang.String r0 = "singleSelectedMessageViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06f3:
            X.00s r0 = r0.A00
            X.3T1 r0 = X.C36431kI.A0r(r0)
            if (r0 == 0) goto L_0x0704
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == 0) goto L_0x0707
        L_0x0704:
            r1 = 8388613(0x800005, float:1.175495E-38)
        L_0x0707:
            r0 = -2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0, r1)
            android.widget.FrameLayout r1 = r3.A3i()
            X.2Ka r0 = r3.A05
            if (r0 != 0) goto L_0x071a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x071a:
            r1.addView(r0, r2)
            X.2Ka r2 = r3.A05
            if (r2 != 0) goto L_0x0726
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0726:
            X.00T r0 = r3.A0F
            int r1 = X.C36331k8.A02(r0)
            r0 = 0
            X.AnonymousClass1JZ.A03(r2, r1, r0)
            X.2Ka r2 = r3.A05
            if (r2 != 0) goto L_0x0739
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0739:
            r1 = 46
            X.3v9 r0 = new X.3v9
            r0.<init>(r3, r4, r1)
            r2.post(r0)
        L_0x0743:
            X.2Ka r1 = r3.A05
            if (r1 != 0) goto L_0x074c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x074c:
            r0 = 4
            r1.setVisibility(r0)
            X.2Ka r2 = r3.A05
            if (r2 != 0) goto L_0x0759
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0759:
            r1 = 45
            X.3wT r0 = new X.3wT
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            goto L_0x0b4b
        L_0x0765:
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r2 = r8.receiver
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r2 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r2
            if (r4 == 0) goto L_0x078a
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r2.A0D
            java.lang.String r0 = "reactionsTrayViewModel"
            if (r1 != 0) goto L_0x0778
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0778:
            r1.A0U(r4)
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r2.A0D
            if (r1 != 0) goto L_0x0794
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0784:
            java.lang.Object r2 = r8.receiver
            X.2Kk r2 = (X.C43922Kk) r2
            if (r60 != 0) goto L_0x079b
        L_0x078a:
            r1 = 0
            r0 = 0
            r2.setResult(r0, r1)
            r2.finish()
            goto L_0x0b4b
        L_0x0794:
            X.2Ka r0 = new X.2Ka
            r0.<init>(r2, r1)
            r2.A05 = r0
        L_0x079b:
            r2.A3m()
            goto L_0x0b4b
        L_0x07a0:
            java.lang.Object r0 = r8.receiver
            X.0CZ r0 = (X.AnonymousClass0CZ) r0
            if (r60 == 0) goto L_0x0b4b
            r0.A06()
            goto L_0x0b4b
        L_0x07ab:
            X.4Ua r4 = (X.C88784Ua) r4
            java.lang.Object r3 = r8.receiver
            X.2Kk r3 = (X.C43922Kk) r3
            if (r4 == 0) goto L_0x0b4b
            android.content.Intent r2 = X.C36431kI.A0D()
            int r1 = r4.getId()
            java.lang.String r0 = "RESULT_EXTRA_ACTION_ID"
            r2.putExtra(r0, r1)
            r0 = 3
            r3.setResult(r0, r2)
            r3.finish()
            goto L_0x0b4b
        L_0x07c9:
            boolean r0 = X.AnonymousClass000.A1X(r4)
            java.lang.Object r5 = r8.receiver
            X.2I0 r5 = (X.AnonymousClass2I0) r5
            if (r0 == 0) goto L_0x085d
            X.4V7 r6 = X.AnonymousClass3SS.A02(r5)
            if (r6 == 0) goto L_0x0b4b
            int r1 = r5.getBottom()
            android.widget.ListView r0 = r6.getListView()
            int r0 = r0.getHeight()
            r8 = 0
            r11 = 0
            if (r1 > r0) goto L_0x07ea
            r11 = 1
        L_0x07ea:
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x083d
            android.content.Context r0 = r5.getContext()
            X.14u r1 = X.C225314u.A0N(r0)
            if (r1 == 0) goto L_0x0b4b
            android.widget.LinearLayout r9 = r5.A2F()
            X.005 r0 = r5.A25
            r0.get()
            X.4Fc r10 = new X.4Fc
            r10.<init>(r1, r5)
            X.4Fd r7 = new X.4Fd
            r7.<init>(r1, r5)
            android.view.LayoutInflater r1 = X.C36341k9.A0J(r9, r8)
            r0 = 2131624564(0x7f0e0274, float:1.8876311E38)
            android.view.View r4 = X.C36371kC.A0J(r1, r9, r0, r8)
            r0 = 2131430261(0x7f0b0b75, float:1.8482218E38)
            android.view.View r3 = r4.findViewById(r0)
            r0 = 2131430260(0x7f0b0b74, float:1.8482216E38)
            android.view.View r2 = r4.findViewById(r0)
            r1 = 25
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r10, (int) r1)
            r3.setOnClickListener(r0)
            r1 = 24
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r7, (int) r1)
            r2.setOnClickListener(r0)
            r5.A00 = r4
            r9.addView(r4)
        L_0x083d:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0844
            r0.setVisibility(r8)
        L_0x0844:
            if (r11 == 0) goto L_0x0b4b
            r0 = 41
            X.3v8 r3 = new X.3v8
            r3.<init>(r5, r6, r0)
            android.view.ViewTreeObserver r2 = r5.getViewTreeObserver()
            r1 = 10
            X.4Zm r0 = new X.4Zm
            r0.<init>((android.view.View) r5, (java.lang.Runnable) r3, (int) r1)
            r2.addOnGlobalLayoutListener(r0)
            goto L_0x0b4b
        L_0x085d:
            android.view.View r0 = r5.A00
            X.C36331k8.A0y(r0)
            goto L_0x0b4b
        L_0x0864:
            X.3SB r4 = (X.AnonymousClass3SB) r4
            java.lang.Object r0 = r8.receiver
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r0 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r0
            r0.A02 = r4
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity.A01(r0)
            goto L_0x0b4b
        L_0x0871:
            X.3Ht r4 = (X.C62843Ht) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            java.lang.Object r2 = r8.receiver
            com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminSubgroupCreationBottomSheet) r2
            r1 = 1
            r2.A0A = r1
            X.2nN r0 = r4.A00
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0896
            if (r0 != r3) goto L_0x0892
            android.widget.RadioGroup r1 = r2.A00
            if (r1 == 0) goto L_0x0892
            r0 = 2131432127(0x7f0b12bf, float:1.8486003E38)
        L_0x088f:
            r1.check(r0)
        L_0x0892:
            r2.A0A = r3
            goto L_0x0b4b
        L_0x0896:
            android.widget.RadioGroup r1 = r2.A00
            if (r1 == 0) goto L_0x0892
            r0 = 2131432128(0x7f0b12c0, float:1.8486005E38)
            goto L_0x088f
        L_0x089e:
            boolean r3 = X.AnonymousClass000.A1X(r4)
            java.lang.Object r2 = r8.receiver
            com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet r2 = (com.whatsapp.community.communitysettings.AllowNonAdminMembersAddBottomSheet) r2
            r0 = 1
            r2.A04 = r0
            android.widget.RadioGroup r1 = r2.A00
            if (r3 == 0) goto L_0x08ba
            r0 = 2131432125(0x7f0b12bd, float:1.8485999E38)
        L_0x08b0:
            if (r1 == 0) goto L_0x08b5
            r1.check(r0)
        L_0x08b5:
            r0 = 0
            r2.A04 = r0
            goto L_0x0b4b
        L_0x08ba:
            r0 = 2131432124(0x7f0b12bc, float:1.8485997E38)
            goto L_0x08b0
        L_0x08be:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r0 = r8.receiver
            X.1oB r0 = (X.C38291oB) r0
            X.3HB r0 = r0.A01
            if (r0 != 0) goto L_0x08cf
            java.lang.String r0 = "mediaCardUpdateHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x08cf:
            r0.A01(r4)
            goto L_0x0b4b
        L_0x08d4:
            X.3I2 r4 = (X.AnonymousClass3I2) r4
            java.lang.Object r2 = A01(r4, r8)
            X.39m r2 = (X.C608239m) r2
            java.util.Set r0 = r4.A00
            boolean r1 = r0.isEmpty()
            X.0V9 r0 = r2.A00
            if (r1 == 0) goto L_0x08f5
            if (r0 == 0) goto L_0x08eb
            r0.A05()
        L_0x08eb:
            r0 = 0
        L_0x08ec:
            r2.A00 = r0
            if (r0 == 0) goto L_0x0b4b
        L_0x08f0:
            r0.A06()
            goto L_0x0b4b
        L_0x08f5:
            if (r0 != 0) goto L_0x08f0
            X.01L r1 = r2.A01
            X.09f r0 = r2.A02
            X.0V9 r0 = r1.But(r0)
            goto L_0x08ec
        L_0x0900:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r1 = A01(r4, r8)
            X.3Ri r1 = (X.C65253Ri) r1
            java.util.Set r0 = r1.A01
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x091f
            X.3I2 r0 = r1.A00
            java.util.Set r0 = r0.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x091f
            X.C65253Ri.A01(r1, r4)
            goto L_0x0b4b
        L_0x091f:
            X.02t r0 = r1.A06
            r0.invoke(r4)
            goto L_0x0b4b
        L_0x0926:
            X.3Iu r4 = (X.C63113Iu) r4
            r5 = 0
            X.AnonymousClass00C.A0D(r4, r5)
            java.lang.Object r3 = r8.receiver
            X.14u r3 = (X.C225314u) r3
            int r1 = r4.A01
            if (r1 == 0) goto L_0x094e
            r2 = 1
            if (r1 == r2) goto L_0x0945
            r0 = 2
            if (r1 != r0) goto L_0x0b4b
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r0, r5, r5)
        L_0x093e:
            java.lang.String r0 = "CommunitySettingsActivity"
            r3.Btl(r1, r0)
            goto L_0x0b4b
        L_0x0945:
            int r1 = r4.A00
            int r0 = r4.A02
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r2, r1, r0)
            goto L_0x093e
        L_0x094e:
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r1 = A00(r5, r5, r5)
            goto L_0x093e
        L_0x0953:
            boolean r1 = X.AnonymousClass000.A1X(r4)
            java.lang.Object r2 = r8.receiver
            com.whatsapp.community.CommunitySettingsActivity r2 = (com.whatsapp.community.CommunitySettingsActivity) r2
            r0 = 2131888111(0x7f1207ef, float:1.9410848E38)
            if (r1 == 0) goto L_0x0963
            r0 = 2131888113(0x7f1207f1, float:1.9410852E38)
        L_0x0963:
            java.lang.CharSequence r1 = r2.getText(r0)
            X.AnonymousClass00C.A0B(r1)
            X.1RJ r0 = r2.A0I
            if (r0 != 0) goto L_0x0975
            java.lang.String r0 = "membersAddSettingRow"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0975:
            android.view.View r0 = r0.A01()
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r0.setSubText(r1)
            goto L_0x0b4b
        L_0x0980:
            X.3Ht r4 = (X.C62843Ht) r4
            r11 = 0
            X.AnonymousClass00C.A0D(r4, r11)
            java.lang.Object r7 = r8.receiver
            com.whatsapp.community.CommunitySettingsActivity r7 = (com.whatsapp.community.CommunitySettingsActivity) r7
            X.2nN r0 = r4.A00
            int r6 = r0.ordinal()
            r5 = 3
            r3 = 1
            r2 = 2
            if (r6 == r3) goto L_0x09ac
            if (r6 != r11) goto L_0x09fc
            r0 = 2131896429(0x7f12286d, float:1.942772E38)
        L_0x099a:
            java.lang.CharSequence r1 = r7.getText(r0)
            X.AnonymousClass00C.A08(r1)
            com.whatsapp.settings.SettingsRowIconText r0 = r7.A0G
            if (r0 != 0) goto L_0x09b0
            java.lang.String r0 = "allowNonAdminSubgroupCreation"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09ac:
            r0 = 2131896431(0x7f12286f, float:1.9427723E38)
            goto L_0x099a
        L_0x09b0:
            r0.setSubText(r1)
            X.2oJ r0 = r4.A01
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x09f3
            if (r0 != r5) goto L_0x0b4b
            r0 = 2131888108(0x7f1207ec, float:1.9410842E38)
        L_0x09c0:
            java.lang.String r9 = r7.getString(r0)
            if (r9 == 0) goto L_0x0b4b
            android.view.View r6 = r7.A00
            java.util.ArrayList r10 = X.C36411kG.A13(r6)
            X.0yb r8 = r7.A08
            X.AnonymousClass00C.A07(r8)
            r12 = 0
            X.3ZU r5 = new X.3ZU
            r5.<init>((android.view.View) r6, (X.AnonymousClass012) r7, (X.C21060yb) r8, (java.lang.String) r9, (java.util.List) r10, (int) r11, (boolean) r12)
            r5.A02()
            X.00T r0 = r7.A0M
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r0 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r0
            X.1hi r2 = r0.A0A
            java.lang.Object r0 = X.C36401kF.A0m(r2)
            X.3Ht r0 = (X.C62843Ht) r0
            X.2oJ r1 = X.C51742oJ.IDLE
            X.2nN r0 = r0.A00
            X.C62843Ht.A00(r2, r0, r1)
            goto L_0x0b4b
        L_0x09f3:
            r0 = 2131888107(0x7f1207eb, float:1.941084E38)
            if (r6 == r3) goto L_0x09c0
            r0 = 2131888106(0x7f1207ea, float:1.9410838E38)
            goto L_0x09c0
        L_0x09fc:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0a01:
            int r2 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r3 = r8.receiver
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            r1 = 403(0x193, float:5.65E-43)
            r0 = 2131888078(0x7f1207ce, float:1.9410781E38)
            if (r2 == r1) goto L_0x0a17
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x0b4b
            r0 = 2131888077(0x7f1207cd, float:1.941078E38)
        L_0x0a17:
            java.lang.String r2 = X.C36421kH.A0a(r3, r0)
            r3.A1b()
            X.01I r1 = r3.A0h()
            boolean r0 = r1 instanceof X.C87124No
            if (r0 == 0) goto L_0x0b4b
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet.Host"
            X.AnonymousClass00C.A0E(r1, r0)
            X.4No r1 = (X.C87124No) r1
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            X.3fk r0 = r1.A03
            r0.A2V(r2)
            goto L_0x0b4b
        L_0x0a36:
            java.util.List r6 = X.C36421kH.A0h(r4)
            java.lang.Object r5 = r8.receiver
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeAllViews()
            java.util.Iterator r4 = r6.iterator()
        L_0x0a45:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a71
            java.lang.Object r3 = r4.next()
            X.69W r3 = (X.AnonymousClass69W) r3
            android.view.LayoutInflater r1 = X.C36351kA.A0C(r5)
            r0 = 2131624179(0x7f0e00f3, float:1.887553E38)
            android.view.View r2 = X.C36381kD.A0K(r1, r0)
            r0 = 2131433022(0x7f0b163e, float:1.8487818E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r2, r0)
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            r0 = 20
            X.C36411kG.A1C(r2, r5, r3, r0)
            r5.addView(r2)
            goto L_0x0a45
        L_0x0a71:
            r1 = 11
            X.74h r0 = new X.74h
            r0.<init>(r5, r6, r1)
            r5.post(r0)
            goto L_0x0b4b
        L_0x0a7d:
            java.lang.Object r3 = r8.receiver
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel r3 = (com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel) r3
            if (r60 != 0) goto L_0x0a9c
            X.08S r1 = r3.A00
            X.00T r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            r1.A0D(r0)
            X.0wU r2 = r3.A07
            r0 = 46
            X.AVW r1 = new X.AVW
            r1.<init>(r3, r0)
        L_0x0a97:
            r2.Boy(r1)
            goto L_0x0b4b
        L_0x0a9c:
            X.0wU r2 = r3.A07
            r0 = 8
            X.74h r1 = new X.74h
            r1.<init>(r3, r4, r0)
            goto L_0x0a97
        L_0x0aa6:
            X.2nM r4 = (X.C51152nM) r4
            java.lang.Object r0 = r8.receiver
            X.02E r0 = (X.AnonymousClass02E) r0
            if (r4 == 0) goto L_0x0b4b
            android.view.View r1 = r0.A0F
            if (r1 == 0) goto L_0x0b4b
            r0 = 2131428120(0x7f0b0318, float:1.8477876E38)
            android.widget.TextView r3 = X.C36341k9.A0M(r1, r0)
            r0 = 2131428118(0x7f0b0316, float:1.8477871E38)
            android.widget.TextView r2 = X.C36341k9.A0M(r1, r0)
            int r1 = r4.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0ad7
            r0 = 1
            if (r1 != r0) goto L_0x0b4b
            r0 = 2131887031(0x7f1203b7, float:1.9408658E38)
            r3.setText(r0)
            r0 = 2131887030(0x7f1203b6, float:1.9408656E38)
        L_0x0ad3:
            r2.setText(r0)
            goto L_0x0b4b
        L_0x0ad7:
            r0 = 2131887045(0x7f1203c5, float:1.9408686E38)
            r3.setText(r0)
            r0 = 2131887043(0x7f1203c3, float:1.9408682E38)
            goto L_0x0ad3
        L_0x0ae1:
            int r1 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r0 = r8.receiver
            X.2Gv r0 = (X.C43312Gv) r0
            X.00T r0 = r0.A02
            android.view.View r0 = X.C36401kF.A0F(r0)
            goto L_0x0b18
        L_0x0af0:
            int r1 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r0 = r8.receiver
            X.2Gv r0 = (X.C43312Gv) r0
            android.view.View r0 = r0.A00
            goto L_0x0b09
        L_0x0afb:
            int r1 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r0 = r8.receiver
            X.2Gv r0 = (X.C43312Gv) r0
            X.00T r0 = r0.A04
            android.view.View r0 = X.C36401kF.A0F(r0)
        L_0x0b09:
            if (r0 != 0) goto L_0x0b18
            goto L_0x0b4b
        L_0x0b0c:
            int r1 = X.AnonymousClass000.A0I(r4)
            java.lang.Object r0 = r8.receiver
            X.28d r0 = (X.AnonymousClass28d) r0
            android.widget.ImageView r0 = r0.A09()
        L_0x0b18:
            r0.setVisibility(r1)
            goto L_0x0b4b
        L_0x0b1c:
            X.2nL r4 = (X.C51142nL) r4
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            java.lang.Object r2 = r8.receiver
            X.2Gv r2 = (X.C43312Gv) r2
            int r0 = r4.ordinal()
            r4 = 1
            if (r0 == r1) goto L_0x0b4e
            if (r0 != r4) goto L_0x0b4b
            X.00T r3 = r2.A05
            java.lang.Object r1 = r3.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887022(0x7f1203ae, float:1.940864E38)
            r1.setText(r0)
            X.1K3 r2 = r2.A01
            java.lang.Object r1 = r3.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131102371(0x7f060aa3, float:1.7817178E38)
            r2.B1X(r1, r0, r4)
        L_0x0b4b:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0b4e:
            X.00T r2 = r2.A05
            java.lang.Object r1 = r2.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            r1.setCompoundDrawables(r0, r0, r0, r0)
            java.lang.Object r1 = r2.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131887025(0x7f1203b1, float:1.9408645E38)
            r1.setText(r0)
            goto L_0x0b4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53102qm.invoke(java.lang.Object):java.lang.Object");
    }
}
