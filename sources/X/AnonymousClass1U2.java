package X;

import android.app.Application;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import com.whatsapp.authgraphql.ui.CommonViewModel;
import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;
import com.whatsapp.bonsai.BonsaiSystemMessageBottomSheetViewModel;
import com.whatsapp.bonsai.chatinfo.BonsaiChatInfoViewModel;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;
import com.whatsapp.calling.avatar.CallAvatarARClassManager;
import com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase;
import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheetViewModel;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel;
import com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.companionmode.registration.CompanionRegistrationViewModel;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsViewModel;
import com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.conversation.selection.SelectedImageAlbumViewModel;
import com.whatsapp.conversation.viewmodel.ConversationSearchViewModel;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.conversation.viewmodel.SurveyViewModel;
import com.whatsapp.conversationslist.ArchiveHeaderViewModel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.conversationslist.InteropViewModel;
import com.whatsapp.conversationslist.filter.ConversationFilterViewModel;
import com.whatsapp.countries.CountryListViewModel;
import com.whatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.extensions.phoenix.viewmodel.FlowsFooterViewModel;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.gallery.viewmodel.GalleryViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.group.HistorySettingViewModel;
import com.whatsapp.home.HomeViewModel;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import com.whatsapp.inappsupport.ui.SupportAiViewModel;
import com.whatsapp.inappsupport.ui.SupportBkLayoutViewModel;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel;
import com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel;
import com.whatsapp.interopui.setting.InteropSettingsViewModel;
import com.whatsapp.magicmod.popup.MagicModPopupViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerViewModel;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;
import com.whatsapp.mediaview.MediaViewCurrentMessageViewModel;
import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.migration.export.ui.ExportMigrationViewModel;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.mute.ui.MuteDialogViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixSelectionViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilHostedPaymentPageViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.polls.PollCreatorViewModel;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel;
import com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import com.whatsapp.profile.UsernameViewModel;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.qrcode.AgentDeviceLoginViewModel;
import com.whatsapp.quickactionbar.viewmodel.QuickActionBarViewModel;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;
import com.whatsapp.registration.entercode.EnterCodeViewModel;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.settings.SettingsAccountViewModel;
import com.whatsapp.settings.SettingsChatViewModel;
import com.whatsapp.settings.SettingsDataUsageViewModel;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;
import com.whatsapp.settings.SettingsUserProxyViewModel;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.shops.ShopsProductPreviewFragmentViewModel;
import com.whatsapp.spamreport.ReportSpamDialogViewModel;
import com.whatsapp.status.advertise.AdvertiseViewModel;
import com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.archive.StatusArchiveSettingsViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import com.whatsapp.suggestions.SuggestionsEngine;
import com.whatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetViewModel;
import com.whatsapp.waffle.wfac.ui.WfacBanViewModel;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1U2  reason: invalid class name */
public final class AnonymousClass1U2 implements AnonymousClass004 {
    public final C18800tq A00;
    public final AnonymousClass1U1 A01;
    public final int A02;
    public final C27071Mp A03;

    public AnonymousClass1U2(C27071Mp r1, C18800tq r2, AnonymousClass1U1 r3, int i) {
        this.A00 = r2;
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = i;
    }

    private Object A08() {
        switch (this.A02) {
            case 0:
                AnonymousClass1HK r10 = (AnonymousClass1HK) this.A00.A1H.get();
                C005602m A002 = AnonymousClass1BE.A00();
                AnonymousClass16D r7 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r8 = (AnonymousClass171) this.A00.A90.get();
                C19730wQ r4 = (C19730wQ) this.A00.A4g.get();
                AnonymousClass1ND r5 = (AnonymousClass1ND) this.A00.A1N.get();
                C130806Mm A2p = C18830tt.A2o(this.A00.A00);
                C19630wG r9 = (C19630wG) this.A00.A91.get();
                return new AdhocParticipantBottomSheetViewModel(this.A01.A3n, r4, r5, A2p, r7, r8, r9, r10, (C20810yC) this.A00.A02.get(), A002);
            case 1:
                AnonymousClass004 A2m = this.A01.A3d;
                C19420v0 r52 = (C19420v0) this.A00.A9G.get();
                return new AdvertiseViewModel(this.A01.A3n, C19460v5.A00(), r52, (C19770wU) this.A00.A9Y.get(), A2m);
            case 2:
                return new AnonymousClass2LA((AnonymousClass1HT) this.A00.A7x.get(), (AnonymousClass16E) this.A00.A80.get(), (AnonymousClass37S) this.A00.A00.A07.get());
            case 3:
                Application A003 = AnonymousClass1JT.A00(this.A00.AfJ);
                C231517j r72 = (C231517j) this.A00.AFl.get();
                C19470v6 A004 = C19460v5.A00();
                AnonymousClass1LU r82 = (AnonymousClass1LU) this.A00.A7p.get();
                return new AgentDeviceLoginViewModel(A003, A004, C19460v5.A00(), C19460v5.A00(), r72, r82, (C19770wU) this.A00.A9Y.get());
            case 4:
                C220412q r6 = (C220412q) this.A00.A1l.get();
                C18820ts r53 = (C18820ts) this.A00.A9X.get();
                C19420v0 r42 = (C19420v0) this.A00.A9G.get();
                return new ArchiveHeaderViewModel((AnonymousClass1A6) this.A00.A2P.get(), r42, r53, r6, (C20810yC) this.A00.A02.get());
            case 5:
                AnonymousClass1PW r62 = (AnonymousClass1PW) this.A00.A74.get();
                C105545Fb r43 = (C105545Fb) this.A00.A00.A0q.get();
                C19730wQ r3 = (C19730wQ) this.A00.A4g.get();
                AnonymousClass171 r83 = (AnonymousClass171) this.A00.A90.get();
                AnonymousClass16D r73 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass17X r102 = (AnonymousClass17X) this.A00.A3v.get();
                C21060yb r92 = (C21060yb) this.A00.A8W.get();
                return new AudioChatCallingViewModel(r3, r43, (AnonymousClass1PZ) this.A00.A1L.get(), r62, r73, r83, r92, r102, (C20810yC) this.A00.A02.get());
            case 6:
                C119585q6 r84 = (C119585q6) this.A00.A00.ABp.get();
                C124575yQ r14 = (C124575yQ) this.A00.A00.ABR.get();
                AnonymousClass63V r74 = (AnonymousClass63V) this.A00.A00.A7M.get();
                AvatarOnDemandStickers A2Q = AnonymousClass1U1.A2P(this.A01);
                C130616Lt A1S = this.A01.A1R();
                AnonymousClass1C2 r13 = (AnonymousClass1C2) this.A00.AB4.get();
                return new AvatarExpressionsViewModel((AnonymousClass6O1) this.A00.A00.A7K.get(), (C117175lp) this.A00.A00.A7L.get(), (C117185lq) this.A00.A00.A50.get(), A1S, r74, r84, A2Q, (C23871Ae) this.A00.A0V.get(), (C24281Bv) this.A00.A0W.get(), (AnonymousClass1AP) this.A00.A89.get(), r13, r14, (C130566Lo) this.A00.A00.ACS.get(), AnonymousClass1BE.A00());
            case 7:
                return new C116335kQ(this);
            case 8:
                AnonymousClass39Q r54 = (AnonymousClass39Q) this.A00.AAy.get();
                return new AvatarHomeViewModel((AnonymousClass1BF) this.A00.A0Q.get(), this.A01.A2L(), r54, (C122775vP) this.A01.A2w.get(), (C23871Ae) this.A00.A0V.get(), AnonymousClass1BE.A00());
            case 9:
                return new C122775vP((C24251Bs) this.A00.AAn.get(), C24291Bw.A00());
            case 10:
                return new C120095qx((C116385kV) this.A01.A3E.get(), (AnonymousClass7hM) this.A01.A3X.get());
            case 11:
                return new C116385kV(this);
            case 12:
                return new C105825Hc();
            case 13:
                return new AnonymousClass5A0();
            case 14:
                return new C164307rb(this, 6);
            case 15:
                return new C164297ra(this, 10);
            case 16:
                C23871Ae r103 = (C23871Ae) this.A00.A0V.get();
                AnonymousClass1P3 r12 = (AnonymousClass1P3) this.A00.AX7.get();
                AnonymousClass1BF r75 = (AnonymousClass1BF) this.A00.A0Q.get();
                AnonymousClass1HC r11 = (AnonymousClass1HC) this.A00.AAw.get();
                C24251Bs r93 = (C24251Bs) this.A00.AAn.get();
                C116515ki A04 = this.A01.A03();
                return new AvatarProfilePhotoViewModel((AnonymousClass17Y) this.A00.A3e.get(), (C19730wQ) this.A00.A4g.get(), this.A01.A01(), A04, r75, this.A01.A2N(), r93, r103, r11, r12, (C19770wU) this.A00.A9Y.get());
            case 17:
                return new C120105qy((C116445kb) this.A01.A3Y.get(), (AnonymousClass7hM) this.A01.A3a.get());
            case 18:
                return new C116445kb(this);
            case 19:
                return new C105835Hd();
            case 20:
                return new AnonymousClass5A7((C23871Ae) this.A00.A0V.get());
            case 21:
                return new C164307rb(this, 7);
            case 22:
                return new C164297ra(this, 11);
            case 23:
                AnonymousClass3DY r32 = (AnonymousClass3DY) this.A00.A7b.get();
                AnonymousClass1N3 r44 = (AnonymousClass1N3) this.A00.A9B.get();
                C20380xT r76 = (C20380xT) this.A00.ANA.get();
                C29501Ww r63 = (C29501Ww) this.A00.A7K.get();
                return new BanAppealViewModel(r32, r44, (C25271Fq) this.A00.A9D.get(), r63, r76, (AnonymousClass3KW) this.A00.ABK.get(), (C65563So) this.A00.ABJ.get());
            case 24:
                AnonymousClass30P r45 = (AnonymousClass30P) this.A01.A3b.get();
                C29961Yr r64 = (C29961Yr) this.A00.ANm.get();
                AnonymousClass30Q r55 = (AnonymousClass30Q) this.A01.A3c.get();
                return new BanReportViewModel((AnonymousClass30O) this.A01.A34.get(), r45, r55, r64, (C31881cX) this.A00.ACk.get(), (C19770wU) this.A00.A9Y.get());
            case 25:
                return new AnonymousClass30P(this);
            case 26:
                return new AnonymousClass2Ua();
            case 27:
                return new C46072Us();
            case 28:
                return new AnonymousClass30Q(this);
            case 29:
                return new AnonymousClass2UZ();
            case 30:
                return new AnonymousClass30O(this);
            case 31:
                AnonymousClass17Y r46 = (AnonymousClass17Y) this.A00.A3e.get();
                AnonymousClass1TF r142 = (AnonymousClass1TF) this.A00.AV5.get();
                AnonymousClass1X4 r56 = (AnonymousClass1X4) this.A00.A8h.get();
                C20500xf AzV = this.A00.AzV();
                AnonymousClass16D r77 = (AnonymousClass16D) this.A00.A2A.get();
                C24541Cv r104 = (C24541Cv) this.A00.A4O.get();
                AnonymousClass1NG r65 = (AnonymousClass1NG) this.A00.A0v.get();
                AnonymousClass3PR A21 = this.A01.A20();
                return new BlockReasonListViewModel(AnonymousClass1JT.A00(this.A00.AfJ), r46, r56, r65, r77, (C63633Ku) this.A00.A00.ACP.get(), (C19970wo) this.A00.A8b.get(), r104, (C20810yC) this.A00.A02.get(), AzV, A21, r142, (C19770wU) this.A00.A9Y.get());
            case 32:
                return new BloksCDSBottomSheetViewModel();
            case 33:
                return new BonsaiChatInfoViewModel((AnonymousClass1K3) this.A00.A0x.get(), (AnonymousClass1KD) this.A00.ACE.get(), (AnonymousClass66D) this.A00.A00.A0Q.get(), C18840tu.A00(this.A00.A14));
            case 34:
                return new BonsaiConversationTitleViewModel((AnonymousClass17Y) this.A00.A3e.get(), (AnonymousClass1K3) this.A00.A0x.get(), (AnonymousClass1DP) this.A00.A1f.get());
            case 35:
                C21010yW r57 = (C21010yW) this.A00.A79.get();
                AnonymousClass16D r47 = (AnonymousClass16D) this.A00.A2A.get();
                return new BonsaiDiscoveryViewModel((C132326Tc) this.A00.ACJ.get(), r47, r57, (C19770wU) this.A00.A9Y.get(), C18840tu.A00(this.A00.A14));
            case 36:
                AnonymousClass17T r58 = (AnonymousClass17T) this.A00.A7S.get();
                return new BonsaiPromptsViewModel((AnonymousClass1X4) this.A00.A8h.get(), (AnonymousClass16J) this.A00.A57.get(), r58, (C19770wU) this.A00.A9Y.get(), C18840tu.A00(this.A00.A14));
            case 37:
                return new BonsaiSystemMessageBottomSheetViewModel();
            case 38:
                return new BotEmbodimentViewModel((AnonymousClass17Y) this.A00.A3e.get(), (AnonymousClass16J) this.A00.A57.get(), (C20810yC) this.A00.A02.get(), (C19770wU) this.A00.A9Y.get(), C18840tu.A00(this.A00.A14));
            case 39:
                return new BottomSheetViewModel((C105545Fb) this.A00.A00.A0q.get(), (C21060yb) this.A00.A8W.get(), (AnonymousClass13J) this.A00.A6z.get());
            case 40:
                C21309AGn aGn = (C21309AGn) this.A00.A00.AAw.get();
                C29121Vk r59 = (C29121Vk) this.A00.A6I.get();
                AnonymousClass97G r78 = (AnonymousClass97G) this.A00.A00.AAv.get();
                return new BrazilAddPixKeyViewModel((AnonymousClass19A) this.A00.A4x.get(), (AnonymousClass9UE) this.A00.A00.AAZ.get(), r59, (AnonymousClass1EU) this.A00.A6M.get(), r78, aGn, (C29131Vl) this.A00.A67.get());
            case 41:
                return new BrazilAddPixSelectionViewModel(this.A01.A2D());
            case 42:
                return new BrazilHostedPaymentPageViewModel((AnonymousClass19A) this.A00.A4x.get(), (C147166wm) this.A00.A00.A5F.get(), (C29121Vk) this.A00.A6I.get());
            case 43:
                return new BrazilIncomeCollectionViewModel((AnonymousClass17Y) this.A00.A3e.get(), (C19420v0) this.A00.A9G.get(), (AnonymousClass19A) this.A00.A4x.get(), (C29221Vu) this.A00.A6A.get(), (C24601Db) this.A00.A6D.get());
            case 44:
                AnonymousClass1EU r48 = (AnonymousClass1EU) this.A00.A6M.get();
                C178518gf A7q = this.A00.A00.A7p();
                C201649k3 r79 = (C201649k3) this.A00.A00.A5T.get();
                AnonymousClass9KW A2E = this.A01.A2D();
                return new BrazilPixKeySettingViewModel((AnonymousClass9UE) this.A00.A00.AAZ.get(), r48, A7q, A2E, r79, (C19770wU) this.A00.A9Y.get());
            case 45:
                C19420v0 r510 = (C19420v0) this.A00.A9G.get();
                C31881cX r66 = (C31881cX) this.A00.ACk.get();
                C31891cY r710 = (C31891cY) this.A00.ACl.get();
                C76803pT A2Y = this.A01.A2X();
                return new BusinessActivityReportViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (AnonymousClass17Y) this.A00.A3e.get(), r510, r66, r710, this.A01.A2V(), A2Y, this.A01.A2Z(), (C19770wU) this.A00.A9Y.get());
            case 46:
                return new BusinessApiSearchActivityViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C121345sz) this.A00.A00.A5b.get());
            case 47:
                return new BusinessComplianceViewModel((AnonymousClass9HJ) this.A00.A00.A5c.get(), (C19770wU) this.A00.A9Y.get());
            case 48:
                return new BusinessDirectoryActivityViewModel((AnonymousClass5DR) this.A00.A00.A0c.get());
            case 49:
                C143526qh A0a = this.A01.A0Z();
                C129006Eo r711 = (C129006Eo) this.A00.A00.A3l.get();
                AnonymousClass7gB r105 = (AnonymousClass7gB) this.A01.A3F.get();
                AnonymousClass5DR r67 = (AnonymousClass5DR) this.A00.A00.A0c.get();
                C132296Sz r85 = (C132296Sz) this.A00.A00.A6m.get();
                return new BusinessDirectoryConsumerHomeViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C142616pA) this.A00.A00.A1R.get(), (C142646pD) this.A00.A00.A1S.get(), r67, r711, r85, A0a, r105, (AnonymousClass1QW) this.A00.A00.A0Z.get());
            case 50:
                return new C164337re(this, 1);
            case 51:
                return new C164347rf(this, 1);
            case 52:
                return new C164357rg(this, 1);
            case 53:
                return new C164367rh(this, 1);
            case 54:
                return new C164387rj(this, 1);
            case 55:
                return new C164397rk(this, 1);
            case 56:
                return new C164317rc(this, 2);
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                return new C164407rl(this, 1);
            case 58:
                return new C164417rm(this, 1);
            case 59:
                return new C164457rq(this, 1);
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                C19970wo r17 = (C19970wo) this.A00.A8b.get();
                AnonymousClass17Y r16 = (AnonymousClass17Y) this.A00.A3e.get();
                Application A005 = AnonymousClass1JT.A00(this.A00.AfJ);
                AnonymousClass08M A006 = this.A01.A3n;
                C145896uh A0K = this.A01.A0J();
                AnonymousClass6MI A0O = this.A01.A0N();
                AnonymousClass6PX A0S = this.A01.A0R();
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r18;
                C119295pa r37 = new C119295pa();
                AnonymousClass6SI r27 = (AnonymousClass6SI) this.A00.A00.A6u.get();
                AnonymousClass5DR r28 = (AnonymousClass5DR) this.A00.A00.A0c.get();
                C129006Eo r29 = (C129006Eo) this.A00.A00.A3l.get();
                C132296Sz r30 = (C132296Sz) this.A00.A00.A6m.get();
                C1260562j r31 = (C1260562j) this.A00.A00.A1O.get();
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = new BusinessDirectoryContextualSearchViewModel(A005, A006, (C1254960a) this.A00.A00.A1e.get(), r16, (C121365t1) this.A00.A00.A6p.get(), (C142616pA) this.A00.A00.A1R.get(), (C142646pD) this.A00.A00.A1S.get(), A0K, r27, r28, r29, r30, r31, A0O, (C110205aI) this.A00.A00.ACt.get(), (AnonymousClass7g3) this.A01.A3I.get(), A0S, (AnonymousClass7gA) this.A01.A3H.get(), r37, (AnonymousClass7gB) this.A01.A3F.get(), r17, (AnonymousClass1QW) this.A00.A00.A0Z.get(), (C142606p9) this.A00.A00.A0b.get(), (C33191es) this.A00.A00.A1P.get());
                return businessDirectoryContextualSearchViewModel2;
            case 61:
                return new C164427rn(this, 1);
            case 62:
                return new C164437ro(this, 1);
            case 63:
                return new C164447rp(this, 1);
            case 64:
                return new BusinessDirectoryEducationNuxViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C142616pA) this.A00.A00.A1R.get(), (AnonymousClass5DR) this.A00.A00.A0c.get());
            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                return new BusinessDirectoryFrequentContactedViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C142646pD) this.A00.A00.A1S.get(), this.A01.A26());
            case 66:
                return new BusinessDirectoryPopularApiBusinessesViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C142646pD) this.A00.A00.A1S.get(), this.A01.A0J(), this.A01.A0L(), (C132296Sz) this.A00.A00.A6m.get(), (AnonymousClass1QW) this.A00.A00.A0Z.get());
            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                return new CAGInfoChatLockViewModel((C24381Cf) this.A00.A2M.get());
            case 68:
                AnonymousClass17Y r49 = (AnonymousClass17Y) this.A00.A3e.get();
                C220412q r86 = (C220412q) this.A00.A1l.get();
                AnonymousClass16D r68 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r712 = (AnonymousClass171) this.A00.A90.get();
                C235718z r511 = (C235718z) this.A00.A1Z.get();
                AnonymousClass16J r106 = (AnonymousClass16J) this.A00.A57.get();
                C232317r r112 = (C232317r) this.A00.A61.get();
                return new CAGInfoViewModel(r49, r511, r68, r712, r86, (C24381Cf) this.A00.A2M.get(), r106, r112, (C20810yC) this.A00.A02.get(), (C27541Op) this.A00.A3n.get(), (AnonymousClass1NN) this.A00.A3q.get(), (C20510xg) this.A00.A3x.get(), (C87874Qm) this.A01.A3J.get(), (C19770wU) this.A00.A9Y.get());
            case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                return new AnonymousClass4ZF(this, 1);
            case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                C105545Fb r143 = (C105545Fb) this.A00.A00.A0q.get();
                AnonymousClass6WJ r87 = (AnonymousClass6WJ) this.A00.A00.A0p.get();
                C61693Db A2X = C18830tt.A2W(this.A00.A00);
                FetchAvatarEffectUseCase A0k = this.A01.A0j();
                CallAvatarARClassManager callAvatarARClassManager = (CallAvatarARClassManager) this.A00.A00.A5q.get();
                InitializeAvatarEffectUseCase A0g = this.A01.A0f();
                ArEffectsFlmConsentManager arEffectsFlmConsentManager = (ArEffectsFlmConsentManager) this.A00.A00.A4p.get();
                C1258761r r122 = (C1258761r) this.A00.AD7.get();
                C116875lL A0e = this.A01.A0d();
                C116885lM A0i = this.A01.A0h();
                C20810yC r172 = (C20810yC) this.A00.A02.get();
                return new CallAvatarViewModel(arEffectsFlmConsentManager, callAvatarARClassManager, A2X, r87, A0e, A0g, A0i, r122, A0k, r143, (C19970wo) this.A00.A8b.get(), (AnonymousClass17Z) this.A00.A95.get(), r172, (C24261Bt) this.A00.AAz.get());
            case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                return new CallControlButtonsViewModel((C105545Fb) this.A00.A00.A0q.get());
            case 72:
                C20810yC r21 = (C20810yC) this.A00.A02.get();
                C19730wQ r20 = (C19730wQ) this.A00.A4g.get();
                C19630wG r19 = (C19630wG) this.A00.A91.get();
                C19770wU r18 = (C19770wU) this.A00.A9Y.get();
                AnonymousClass1C6 r173 = (AnonymousClass1C6) this.A00.A7s.get();
                C25841Hw A8u = C18800tq.A8t(this.A00);
                C24801Dv r162 = (C24801Dv) this.A00.A0D.get();
                C61693Db A2X2 = C18830tt.A2W(this.A00.A00);
                AnonymousClass004 AL1 = this.A00.A00.ABL;
                AnonymousClass004 AL2 = this.A00.A00.A3Q;
                AnonymousClass004 AL3 = this.A00.A00.A3R;
                C145156tR r272 = (C145156tR) this.A00.A00.ABD.get();
                AnonymousClass1PZ r292 = (AnonymousClass1PZ) this.A00.A1L.get();
                C131176Oa r302 = (C131176Oa) this.A00.A00.A3h.get();
                AnonymousClass798 r312 = (AnonymousClass798) this.A00.A00.A37.get();
                AnonymousClass53T r322 = (AnonymousClass53T) this.A00.AZF.get();
                AnonymousClass711 r33 = (AnonymousClass711) this.A00.A8v.get();
                AnonymousClass16D r34 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass185 r35 = (AnonymousClass185) this.A00.A8u.get();
                AnonymousClass171 r36 = (AnonymousClass171) this.A00.A90.get();
                return new CallGridViewModel(r162, r20, A2X2, (C105545Fb) this.A00.A00.A0q.get(), r272, AnonymousClass1U1.A0s(), r292, r302, r312, r322, r33, r34, r35, r36, r19, (C18820ts) this.A00.A9X.get(), (AnonymousClass17X) this.A00.A3v.get(), A8u, r21, (C20350xQ) this.A00.A3k.get(), r173, (AnonymousClass13J) this.A00.A6z.get(), r18, (VoipCameraManager) this.A00.A8x.get(), AL1, AL2, AL3);
            case 73:
                AnonymousClass17Y r38 = (AnonymousClass17Y) this.A00.A3e.get();
                C19730wQ r410 = (C19730wQ) this.A00.A4g.get();
                C105545Fb r512 = (C105545Fb) this.A00.A00.A0q.get();
                AnonymousClass16D r713 = (AnonymousClass16D) this.A00.A2A.get();
                C18820ts r94 = (C18820ts) this.A00.A9X.get();
                AnonymousClass171 r88 = (AnonymousClass171) this.A00.A90.get();
                C26211Jh r107 = (C26211Jh) this.A00.A7X.get();
                return new CallHeaderViewModel(r38, r410, r512, this.A01.A0v(), r713, r88, r94, r107, (C20810yC) this.A00.A02.get(), (C19770wU) this.A00.A9Y.get());
            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                return new CallLinkViewModel(this.A01.A3n, this.A01.A11(), (C19600wD) this.A00.A24.get());
            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                C005602m A007 = AnonymousClass1BE.A00();
                AnonymousClass03P A008 = C24291Bw.A00();
                C130806Mm A2p2 = C18830tt.A2o(this.A00.A00);
                AnonymousClass08M A009 = this.A01.A3n;
                C20350xQ r24 = (C20350xQ) this.A00.A3k.get();
                C20810yC r23 = (C20810yC) this.A00.A02.get();
                AnonymousClass17X r22 = (AnonymousClass17X) this.A00.A3v.get();
                AnonymousClass1HK r212 = (AnonymousClass1HK) this.A00.A1H.get();
                C18820ts r202 = (C18820ts) this.A00.A9X.get();
                C19630wG r192 = (C19630wG) this.A00.A91.get();
                AnonymousClass171 r182 = (AnonymousClass171) this.A00.A90.get();
                return new CallLogMessageParticipantBottomSheetViewModel(A009, (C19730wQ) this.A00.A4g.get(), (AnonymousClass1ND) this.A00.A1N.get(), (AnonymousClass6X4) this.A00.A1M.get(), A2p2, (AnonymousClass16D) this.A00.A2A.get(), r182, r192, r202, r212, r22, r23, r24, (AnonymousClass1C6) this.A00.A7s.get(), A007, A008);
            case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                AnonymousClass6XP r39 = (AnonymousClass6XP) this.A00.A00.A4J.get();
                C130806Mm A2p3 = C18830tt.A2o(this.A00.A00);
                return new CallRatingViewModel((C27631Pa) this.A00.A8z.get(), A2p3, r39, (C20810yC) this.A00.A02.get());
            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return new CallSuggestionsViewModel((C105545Fb) this.A00.A00.A0q.get(), (AnonymousClass4PS) this.A01.A3S.get(), (C19970wo) this.A00.A8b.get(), (C20810yC) this.A00.A02.get(), C25141Fd.A00());
            case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return new C143976rQ(this);
            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                return new C116345kR(this);
            case AnonymousClass8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return new C1260762l(this.A01.A15(), (AnonymousClass1HJ) this.A00.A1O.get());
            case 81:
                return new C130896Mv((C1260762l) this.A01.A1I.get(), (AnonymousClass16D) this.A00.A2A.get(), (C232317r) this.A00.A61.get());
            case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return new C116355kS(this);
            case 83:
                return new C116365kT(this);
            case 84:
                return new C116375kU(this);
            case 85:
                return new C116395kW(this);
            case 86:
                return new C116405kX(this);
            case 87:
                return new C116415kY(this);
            case 88:
                C19970wo r203 = (C19970wo) this.A00.A8b.get();
                C20810yC r193 = (C20810yC) this.A00.A02.get();
                C19730wQ r183 = (C19730wQ) this.A00.A4g.get();
                C19770wU r174 = (C19770wU) this.A00.A9Y.get();
                C220412q r163 = (C220412q) this.A00.A1l.get();
                C34621hN A0y = this.A01.A0x();
                C34691hU A10 = this.A01.A0z();
                C30541aN r273 = (C30541aN) this.A00.Adn.get();
                C229216m r282 = (C229216m) this.A00.A27.get();
                AnonymousClass16D r293 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r303 = (AnonymousClass171) this.A00.A90.get();
                C19970wo r313 = r203;
                C18820ts r323 = (C18820ts) this.A00.A9X.get();
                AnonymousClass1HJ r332 = (AnonymousClass1HJ) this.A00.A1O.get();
                C220412q r342 = r163;
                AnonymousClass17X r352 = (AnonymousClass17X) this.A00.A3v.get();
                return new CallsHistoryFragmentV2ViewModel(r183, (C21100yf) this.A00.A7f.get(), A0y, A10, (C34631hO) this.A00.A00.A2S.get(), r273, r282, r293, r303, r313, r323, r332, r342, r352, (C26211Jh) this.A00.A7X.get(), (C34701hV) this.A00.A00.A88.get(), r193, (C20350xQ) this.A00.A3k.get(), (C27281Np) this.A00.A3m.get(), (AnonymousClass1EL) this.A00.A8L.get(), (AnonymousClass1C6) this.A00.A7s.get(), (AnonymousClass13J) this.A00.A6z.get(), r174);
            case 89:
                AnonymousClass67M A18 = this.A01.A17();
                return new CatalogAllCategoryViewModel((C198849eI) this.A00.A00.A0x.get(), A18, new AnonymousClass96C(), (C19770wU) this.A00.A9Y.get());
            case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
                AnonymousClass67M A182 = this.A01.A17();
                return new CatalogCategoryGroupsViewModel((C198849eI) this.A00.A00.A0x.get(), A182, new AnonymousClass96C(), (C19770wU) this.A00.A9Y.get());
            case 91:
                AnonymousClass67M A183 = this.A01.A17();
                return new CatalogCategoryTabsViewModel((C198849eI) this.A00.A00.A0x.get(), this.A01.A0b(), A183, (C19770wU) this.A00.A9Y.get());
            case 92:
                C197919cb A1G = this.A01.A1F();
                return new CatalogSearchViewModel((C197189bH) this.A00.A00.AB9.get(), C18800tq.A2v(this.A00), AnonymousClass1U1.A1D(), A1G);
            case 93:
                return new ChatLockHelperBottomSheetViewModel((C235718z) this.A00.A1Z.get(), (AnonymousClass3L5) this.A00.A1Y.get());
            case 94:
                C20810yC r164 = (C20810yC) this.A00.A02.get();
                ChatTransferViewModel chatTransferViewModel = r17;
                AnonymousClass6JX A25 = this.A01.A24();
                AnonymousClass6FO r283 = (AnonymousClass6FO) this.A00.A5N.get();
                AnonymousClass5FY r294 = (AnonymousClass5FY) this.A00.ATX.get();
                AnonymousClass6NX r304 = (AnonymousClass6NX) this.A00.A00.A1Y.get();
                C125055zF r314 = (C125055zF) this.A00.A00.A27.get();
                AnonymousClass5FW r274 = (AnonymousClass5FW) this.A00.A00.A9o.get();
                C19730wQ r204 = (C19730wQ) this.A00.A4g.get();
                C21060yb r213 = (C21060yb) this.A00.A8W.get();
                C19630wG r222 = (C19630wG) this.A00.A91.get();
                AnonymousClass17Z r232 = (AnonymousClass17Z) this.A00.A95.get();
                C116425kZ r184 = (C116425kZ) this.A01.A3T.get();
                C116435ka r194 = (C116435ka) this.A01.A3U.get();
                ChatTransferViewModel chatTransferViewModel2 = new ChatTransferViewModel(r184, r194, r204, r213, r222, r232, (C19420v0) this.A00.A9G.get(), (C21520zN) this.A00.A01.get(), r164, r274, r283, r294, r304, r314, (C105535Fa) this.A00.A00.A36.get(), A25, (AnonymousClass6TQ) this.A00.A00.A2b.get(), (C19770wU) this.A00.A9Y.get());
                return chatTransferViewModel2;
            case 95:
                return new C116425kZ(this);
            case 96:
                return new C116435ka(this);
            case 97:
                return new CommonViewModel(C18840tu.A00(this.A00.A0w));
            case 98:
                AnonymousClass19A r89 = (AnonymousClass19A) this.A00.A4x.get();
                AnonymousClass16D r69 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass1LV r310 = (AnonymousClass1LV) this.A00.A1q.get();
                C27541Op r714 = (C27541Op) this.A00.A3n.get();
                MemberSuggestedGroupsManager memberSuggestedGroupsManager = (MemberSuggestedGroupsManager) this.A00.A4q.get();
                return new CommunitySettingsViewModel(r310, this.A01.A1I(), memberSuggestedGroupsManager, r69, r714, r89, (C19770wU) this.A00.A9Y.get());
            case 99:
                return new CompanionRegistrationViewModel((C25951Ih) this.A00.A1z.get(), (C19770wU) this.A00.A9Y.get());
            default:
                throw new AssertionError(this.A02);
        }
    }

    private Object A09() {
        switch (this.A02) {
            case 100:
                C202279lS r2 = (C202279lS) this.A00.A1T.get();
                AnonymousClass9Y1 r1 = (AnonymousClass9Y1) this.A00.A1R.get();
                return new ComplianceInfoViewModel((C29461Ws) this.A00.A1S.get(), r1, r2, (C19770wU) this.A00.A9Y.get());
            case 101:
                return new ConsumerDisclosureViewModel((C64733Pf) this.A01.A32.get());
            case 102:
                C238019x r11 = (C238019x) this.A00.A8U.get();
                C20310xM r8 = (C20310xM) this.A00.A2S.get();
                AnonymousClass1I4 r7 = (AnonymousClass1I4) this.A00.Acv.get();
                AnonymousClass1I7 r6 = (AnonymousClass1I7) this.A00.AFI.get();
                AnonymousClass005 A002 = C18840tu.A00(this.A00.A25);
                C30951b2 r10 = (C30951b2) this.A00.AEN.get();
                AnonymousClass1I5 AIV = this.A00.AIU();
                return new C64733Pf((C19970wo) this.A00.A8b.get(), C18800tq.A7W(this.A00), (AnonymousClass1I6) this.A00.AFH.get(), r6, r7, r8, AIV, r10, r11, (C19770wU) this.A00.A9Y.get(), A002);
            case 103:
                return new ConversationCommunityViewModel((AnonymousClass1LV) this.A00.A1q.get(), (AnonymousClass17X) this.A00.A3v.get(), (C20350xQ) this.A00.A3k.get(), (C19770wU) this.A00.A9Y.get());
            case 104:
                return new ConversationFilterViewModel(C19460v5.A00(), this.A01.A1L(), (C19630wG) this.A00.A91.get(), (C28101Ri) this.A00.A00.A2C.get());
            case 105:
                return new ConversationSearchViewModel();
            case 106:
                C19470v6 A003 = C19460v5.A00();
                AnonymousClass1LU r72 = (AnonymousClass1LU) this.A00.A7p.get();
                return new ConversationTitleViewModel(AnonymousClass1JT.A00(this.A00.AfJ), A003, C19460v5.A00(), C19460v5.A00(), r72, (C19770wU) this.A00.A9Y.get());
            case 107:
                AnonymousClass16D r5 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass1NG r4 = (AnonymousClass1NG) this.A00.A0v.get();
                AnonymousClass16I r62 = (AnonymousClass16I) this.A00.A2B.get();
                return new ConversationsSuggestedContactsViewModel((AnonymousClass19J) this.A00.A9p.get(), r4, r5, r62, (AnonymousClass1A6) this.A00.A2P.get(), (C20810yC) this.A00.A02.get(), C18840tu.A00(this.A01.A3l), C25141Fd.A00());
            case C65953Uc.A03 /*108*/:
                AnonymousClass1NI A5n = this.A00.A5m();
                AnonymousClass16D r52 = (AnonymousClass16D) this.A00.A2A.get();
                return new SuggestionsEngine((AnonymousClass1NG) this.A00.A0v.get(), A5n, r52, (C20810yC) this.A00.A02.get(), (C27591Ow) this.A00.A5M.get());
            case 109:
                return new CountryGatingViewModel(this.A00.A00.A0d(), (C20810yC) this.A00.A02.get());
            case 110:
                C18820ts r12 = (C18820ts) this.A00.A9X.get();
                return new CountryListViewModel((AnonymousClass1N4) this.A00.AXM.get(), (C19630wG) this.A00.A91.get(), r12, (AnonymousClass1M4) this.A00.AEo.get());
            case 111:
                C29731Xt r53 = (C29731Xt) this.A00.A81.get();
                WfalManager wfalManager = (WfalManager) this.A00.A9U.get();
                C63623Kt r73 = (C63623Kt) this.A00.A00.ADL.get();
                C32381dS r63 = (C32381dS) this.A00.A00.A1F.get();
                return new CrossPostingUpdatesViewModel(wfalManager, (C32371dR) this.A00.A7H.get(), r53, r63, r73, (C28781Ua) this.A00.A9d.get());
            case 112:
                C31351bg AMz = this.A00.AMy();
                return new CtwaStatusUpsellBottomSheetTriggerViewModel(C19460v5.A00(), (C21010yW) this.A00.A79.get(), (C19770wU) this.A00.A9Y.get(), AMz);
            case 113:
                AnonymousClass1XN r54 = (AnonymousClass1XN) this.A00.A7G.get();
                C19420v0 r3 = (C19420v0) this.A00.A9G.get();
                AnonymousClass63V r9 = (AnonymousClass63V) this.A00.A00.A7M.get();
                C130496Lh A1W = this.A01.A1V();
                return new EmojiExpressionsViewModel(r3, (AnonymousClass6O1) this.A00.A00.A7K.get(), r54, (AnonymousClass1H2) this.A00.A2x.get(), (C117175lp) this.A00.A00.A7L.get(), A1W, r9, (C1270066o) this.A00.A00.A7N.get(), (C119585q6) this.A00.A00.ABp.get(), (C19890wg) this.A00.A7i.get(), AnonymousClass1BE.A00());
            case 114:
                C21010yW r64 = (C21010yW) this.A00.A79.get();
                AnonymousClass19A r74 = (AnonymousClass19A) this.A00.A4x.get();
                C21060yb r42 = (C21060yb) this.A00.A8W.get();
                C24431Ck r32 = (C24431Ck) this.A00.A2z.get();
                C29501Ww r82 = (C29501Ww) this.A00.A7K.get();
                return new EncBackupViewModel(r32, r42, (C19420v0) this.A00.A9G.get(), r64, r74, r82, (C19770wU) this.A00.A9Y.get());
            case 115:
                return new EnforcedMessagesViewModel((AnonymousClass16D) this.A00.A2A.get(), (C20810yC) this.A00.A02.get(), this.A01.A29(), C25141Fd.A00());
            case 116:
                return new EnterCodeViewModel((C19970wo) this.A00.A8b.get());
            case 117:
                return new ExistViewModel(this.A01.A3n);
            case 118:
                return new ExportMigrationViewModel((C20810yC) this.A00.A02.get(), (AnonymousClass5FY) this.A00.ATX.get());
            case 119:
                C19970wo r122 = (C19970wo) this.A00.A8b.get();
                AnonymousClass6O1 r13 = (AnonymousClass6O1) this.A00.A00.A7K.get();
                ExpressionsKeyboardViewModel expressionsKeyboardViewModel = r11;
                AnonymousClass6SF r26 = (AnonymousClass6SF) this.A01.A2z.get();
                C23871Ae r24 = (C23871Ae) this.A00.A0V.get();
                C124575yQ r25 = (C124575yQ) this.A00.A00.ABR.get();
                AnonymousClass1BF r22 = (AnonymousClass1BF) this.A00.A0Q.get();
                C122775vP r23 = (C122775vP) this.A01.A2w.get();
                C20810yC r20 = (C20810yC) this.A00.A02.get();
                C21010yW r21 = (C21010yW) this.A00.A79.get();
                C117205ls r18 = (C117205ls) this.A00.A00.ACN.get();
                C117215lt r19 = (C117215lt) this.A00.A00.ACa.get();
                ExpressionsKeyboardViewModel expressionsKeyboardViewModel2 = new ExpressionsKeyboardViewModel(r122, r13, (C117175lp) this.A00.A00.A7L.get(), (C117185lq) this.A00.A00.A50.get(), this.A01.A1T(), (AnonymousClass63V) this.A00.A00.A7M.get(), r18, r19, r20, r21, r22, r23, r24, r25, r26, AnonymousClass1BE.A00());
                return expressionsKeyboardViewModel2;
            case 120:
                AnonymousClass6SF A2l = this.A01.A2k();
                C21646ATm.A00(A2l);
                return A2l;
            case 121:
                C19970wo r123 = (C19970wo) this.A00.A8b.get();
                C18820ts r132 = (C18820ts) this.A00.A9X.get();
                AnonymousClass6O1 r14 = (AnonymousClass6O1) this.A00.A00.A7K.get();
                AnonymousClass6SF r252 = (AnonymousClass6SF) this.A01.A2z.get();
                C124575yQ r242 = (C124575yQ) this.A00.A00.ABR.get();
                AnonymousClass1C2 r232 = (AnonymousClass1C2) this.A00.AB4.get();
                C23871Ae r222 = (C23871Ae) this.A00.A0V.get();
                C122775vP r212 = (C122775vP) this.A01.A2w.get();
                AnonymousClass1BF r202 = (AnonymousClass1BF) this.A00.A0Q.get();
                C21010yW r192 = (C21010yW) this.A00.A79.get();
                C20810yC r182 = (C20810yC) this.A00.A02.get();
                return new ExpressionsSearchViewModel(r123, r132, r14, (C117175lp) this.A00.A00.A7L.get(), this.A01.A1T(), (C119585q6) this.A00.A00.ABp.get(), r182, r192, r202, r212, r222, r232, r242, r252, AnonymousClass1BE.A00());
            case 122:
                AnonymousClass16D r43 = (AnonymousClass16D) this.A00.A2A.get();
                C34641hP r65 = (C34641hP) this.A00.A00.A87.get();
                AnonymousClass17X r55 = (AnonymousClass17X) this.A00.A3v.get();
                return new FavoriteCallListViewModel((C19730wQ) this.A00.A4g.get(), r43, r55, r65, (C20810yC) this.A00.A02.get(), C18840tu.A00(this.A00.A00.A88), C25141Fd.A00(), C24291Bw.A00());
            case 123:
                C19970wo r56 = (C19970wo) this.A00.A8b.get();
                AnonymousClass17X r66 = (AnonymousClass17X) this.A00.A3v.get();
                return new FavoritePickerViewModel((AnonymousClass4PS) this.A01.A3S.get(), (AnonymousClass16D) this.A00.A2A.get(), r56, r66, (C34641hP) this.A00.A00.A87.get(), C25141Fd.A00(), C24291Bw.A00());
            case 124:
                AnonymousClass185 r44 = (AnonymousClass185) this.A00.A8u.get();
                C27761Ps r57 = (C27761Ps) this.A00.A2D.get();
                return new FlowsFooterViewModel((AnonymousClass16D) this.A00.A2A.get(), r44, r57, (C20810yC) this.A00.A02.get(), (C19770wU) this.A00.A9Y.get());
            case 125:
                C19630wG r67 = (C19630wG) this.A00.A91.get();
                AnonymousClass6N7 A1l = this.A01.A1k();
                C18820ts r75 = (C18820ts) this.A00.A9X.get();
                C21060yb r45 = (C21060yb) this.A00.A8W.get();
                return new GalleryPickerViewModel((C235718z) this.A00.A1Z.get(), r45, (C19970wo) this.A00.A8b.get(), r67, r75, (C20810yC) this.A00.A02.get(), A1l, (AnonymousClass1A2) this.A00.A6R.get(), C25141Fd.A00(), C24291Bw.A00());
            case 126:
                return new GalleryViewModel((C19970wo) this.A00.A8b.get(), (AnonymousClass12T) this.A00.AT2.get(), (AnonymousClass1A1) this.A00.A3H.get(), C25141Fd.A00(), C24291Bw.A00());
            case 127:
                return new GenericBkLayoutViewModelWithReload(C18840tu.A00(this.A00.A0w));
            case 128:
                return A07((C19600wD) this.A00.A24.get(), C18840tu.A00(this.A00.A0w));
            case 129:
                C119585q6 r68 = (C119585q6) this.A00.A00.ABp.get();
                AnonymousClass63V r58 = (AnonymousClass63V) this.A00.A00.A7M.get();
                return new GifExpressionsSearchViewModel((AnonymousClass6O1) this.A00.A00.A7K.get(), (C117175lp) this.A00.A00.A7L.get(), r58, r68, (AnonymousClass3L7) this.A00.A00.ABI.get());
            case 130:
                return A02((AnonymousClass6FS) this.A00.A3g.get(), (C19970wo) this.A00.A8b.get(), (C19420v0) this.A00.A9G.get());
            case 131:
                C229216m r46 = (C229216m) this.A00.A27.get();
                C20830yE r69 = (C20830yE) this.A00.A9E.get();
                C29501Ww r92 = (C29501Ww) this.A00.A7K.get();
                AnonymousClass5FX r83 = (AnonymousClass5FX) this.A00.A00.A8i.get();
                AnonymousClass3NT r112 = (AnonymousClass3NT) this.A00.A00.A8k.get();
                return new GoogleMigrateImporterViewModel((C19600wD) this.A00.A24.get(), r46, (C19630wG) this.A00.A91.get(), r69, (AnonymousClass6X5) this.A00.A00.A8g.get(), r83, r92, (AnonymousClass3TX) this.A00.A00.A1p.get(), r112, (AnonymousClass1MM) this.A00.ANj.get());
            case 132:
                AnonymousClass16D r15 = (AnonymousClass16D) this.A00.A2A.get();
                return new GroupCallParticipantSuggestionsViewModel((AnonymousClass4PS) this.A01.A3S.get(), r15, (C19970wo) this.A00.A8b.get());
            case 133:
                return new GroupCallPsaViewModel(this.A00.A00.A2k(), (AnonymousClass171) this.A00.A90.get());
            case 134:
                return new HistorySettingViewModel((C19600wD) this.A00.A24.get(), (AnonymousClass16D) this.A00.A2A.get(), (AnonymousClass17X) this.A00.A3v.get(), (C27541Op) this.A00.A3n.get(), (C233117z) this.A00.A3w.get(), this.A01.A1n());
            case 135:
                return new HomeViewModel(AnonymousClass1JT.A00(this.A00.AfJ));
            case 136:
                C61163Au A1r = this.A01.A1q();
                C61043Ai A1v = this.A01.A1u();
                AnonymousClass38O A1t = this.A01.A1s();
                ReportBugProtocolHelper A1x = this.A01.A1w();
                return new InAppBugReportingViewModel(A1r, A1t, A1v, (AnonymousClass3DD) this.A00.A00.A5a.get(), (C61513Cf) this.A00.A00.A92.get(), A1x, (AnonymousClass1GX) this.A00.A4k.get(), AnonymousClass1BE.A00());
            case 137:
                C19730wQ r33 = (C19730wQ) this.A00.A4g.get();
                AnonymousClass16D r610 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r76 = (AnonymousClass171) this.A00.A90.get();
                C105545Fb r59 = (C105545Fb) this.A00.A00.A0q.get();
                return new InCallBannerViewModel(r33, (C27631Pa) this.A00.A8z.get(), r59, r610, r76, (C20810yC) this.A00.A02.get());
            case 138:
                AF7 af7 = (AF7) this.A00.A47.get();
                AnonymousClass9I3 r29 = (AnonymousClass9I3) this.A00.A00.AAe.get();
                C200169gl r30 = (C200169gl) this.A00.A00.A98.get();
                AnonymousClass1EU r262 = (AnonymousClass1EU) this.A00.A6M.get();
                AnonymousClass1XC r27 = (AnonymousClass1XC) this.A00.A6F.get();
                AnonymousClass1EZ r243 = (AnonymousClass1EZ) this.A00.A65.get();
                C24601Db r253 = (C24601Db) this.A00.A6D.get();
                C20810yC r223 = (C20810yC) this.A00.A02.get();
                AE0 ae0 = (AE0) this.A00.A49.get();
                AnonymousClass1DW r213 = (AnonymousClass1DW) this.A00.A2f.get();
                AnonymousClass16T r203 = (AnonymousClass16T) this.A00.A66.get();
                C24881Ed r193 = (C24881Ed) this.A00.A6H.get();
                C18820ts r183 = (C18820ts) this.A00.A9X.get();
                return new IndiaPaymentSettingsViewModel((C19970wo) this.A00.A8b.get(), r183, r193, r203, r213, r223, ae0, r243, r253, r262, r27, af7, r29, r30, (C29011Uz) this.A00.A00.A49.get(), (C19770wU) this.A00.A9Y.get());
            case 139:
                return new IndiaUpiInternationalActivationViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C18820ts) this.A00.A9X.get(), (C202269lR) this.A00.A48.get(), this.A01.A2F(), (AF7) this.A00.A47.get(), (C199799fz) this.A00.A00.A97.get());
            case 140:
                return new IndiaUpiInternationalValidateQrViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C20810yC) this.A00.A02.get(), this.A01.A2F(), (AF7) this.A00.A47.get());
            case 141:
                return new IndiaUpiMandateHistoryViewModel((AnonymousClass17Y) this.A00.A3e.get(), (C19630wG) this.A00.A91.get(), (C24881Ed) this.A00.A6H.get(), (AF7) this.A00.A47.get(), (C19770wU) this.A00.A9Y.get());
            case 142:
                return new IndiaUpiMapperLinkViewModel(AnonymousClass1JT.A00(this.A00.AfJ), (C19730wQ) this.A00.A4g.get(), (AE0) this.A00.A49.get(), this.A01.A2H(), (C200169gl) this.A00.A00.A98.get());
            case 143:
                return new IndiaUpiNumberSettingsViewModel((C200169gl) this.A00.A00.A98.get());
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                AnonymousClass17Y r34 = (AnonymousClass17Y) this.A00.A3e.get();
                AnonymousClass16S r77 = (AnonymousClass16S) this.A00.A6x.get();
                C18820ts r611 = (C18820ts) this.A00.A9X.get();
                AnonymousClass1EU r93 = (AnonymousClass1EU) this.A00.A6M.get();
                C202699mR r102 = (C202699mR) this.A00.A00.A2F.get();
                return new IndiaUpiPauseMandateViewModel(r34, (C19970wo) this.A00.A8b.get(), (C19630wG) this.A00.A91.get(), r611, r77, (AnonymousClass1DR) this.A00.A6G.get(), r93, r102, (C19770wU) this.A00.A9Y.get());
            case 145:
                C29121Vk r28 = (C29121Vk) this.A00.A6I.get();
                C193529Lv r292 = (C193529Lv) this.A00.APN.get();
                AnonymousClass5GM r302 = (AnonymousClass5GM) this.A00.A00.A2I.get();
                C29221Vu r272 = (C29221Vu) this.A00.A6A.get();
                C202269lR r263 = (C202269lR) this.A00.A48.get();
                C196129Xv r254 = (C196129Xv) this.A00.A00.A2G.get();
                AnonymousClass19A r244 = (AnonymousClass19A) this.A00.A4x.get();
                C20810yC r233 = (C20810yC) this.A00.A02.get();
                AnonymousClass16T r224 = (AnonymousClass16T) this.A00.A66.get();
                C24881Ed r214 = (C24881Ed) this.A00.A6H.get();
                C19630wG r204 = (C19630wG) this.A00.A91.get();
                C19970wo r194 = (C19970wo) this.A00.A8b.get();
                C19730wQ r184 = (C19730wQ) this.A00.A4g.get();
                return new IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel((AnonymousClass17Y) this.A00.A3e.get(), r184, r194, r204, r214, r224, r233, r244, r254, r263, r272, r28, r292, r302, (C29131Vl) this.A00.A67.get(), (C19770wU) this.A00.A9Y.get());
            case 146:
                AnonymousClass17Y r35 = (AnonymousClass17Y) this.A00.A3e.get();
                C21100yf r47 = (C21100yf) this.A00.A7f.get();
                C29121Vk r113 = (C29121Vk) this.A00.A6I.get();
                C24631De r124 = (C24631De) this.A00.A6J.get();
                C29221Vu r103 = (C29221Vu) this.A00.A6A.get();
                AE0 ae02 = (AE0) this.A00.A49.get();
                return new IndiaUpiSecureQrCodeViewModel(r35, r47, (C19970wo) this.A00.A8b.get(), (C19630wG) this.A00.A91.get(), (C19900wh) this.A00.A9J.get(), (AnonymousClass19A) this.A00.A4x.get(), ae02, r103, r113, r124, (AnonymousClass1EU) this.A00.A6M.get());
            case 147:
                return new InteropComposeEnterInfoViewModel((C230416y) this.A00.Adt.get(), this.A00.AzZ(), C25141Fd.A00());
            case 148:
                return new InteropComposeSelectIntegratorViewModel((AnonymousClass190) this.A00.A97.get(), this.A00.AzZ(), C25141Fd.A00());
            case 149:
                return new InteropOptInSelectIntegratorsViewModel((C19970wo) this.A00.A8b.get(), this.A00.AzZ(), (C32881eL) this.A00.A4L.get());
            case 150:
                return new InteropSettingsViewModel((C19970wo) this.A00.A8b.get(), (C32881eL) this.A00.A4L.get(), (AnonymousClass3E7) this.A01.A3e.get(), (C24681Dj) this.A00.A6f.get());
            case 151:
                C32931eR r16 = (C32931eR) this.A00.A4K.get();
                return new AnonymousClass3E7((AnonymousClass190) this.A00.A97.get(), r16, (C24771Ds) this.A00.A6h.get(), (C24681Dj) this.A00.A6f.get());
            case 152:
                return new InteropViewModel((AnonymousClass1A6) this.A00.A2P.get(), (C18820ts) this.A00.A9X.get(), (C32881eL) this.A00.A4L.get(), C25141Fd.A00());
            case 153:
                AnonymousClass16D r48 = (AnonymousClass16D) this.A00.A2A.get();
                C18820ts r612 = (C18820ts) this.A00.A9X.get();
                return new InviteNonWhatsAppContactPickerViewModel(AnonymousClass1JT.A00(this.A00.AfJ), r48, (AnonymousClass171) this.A00.A90.get(), r612, (C20810yC) this.A00.A02.get(), (C28271Rz) this.A00.A00.A2a.get());
            case 154:
                AnonymousClass1ND r510 = (AnonymousClass1ND) this.A00.A1N.get();
                AnonymousClass16D r613 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r78 = (AnonymousClass171) this.A00.A90.get();
                C20350xQ r94 = (C20350xQ) this.A00.A3k.get();
                return new LGCCallConfirmationSheetViewModel(this.A01.A3n, (C19730wQ) this.A00.A4g.get(), r510, r613, r78, (AnonymousClass17X) this.A00.A3v.get(), r94, (AnonymousClass1C6) this.A00.A7s.get(), C24291Bw.A00(), AnonymousClass1BE.A00());
            case 155:
                return new LinkedDeviceEditDeviceViewModel((C236419g) this.A00.A1v.get(), (C19770wU) this.A00.A9Y.get());
            case 156:
                return new LinkedDeviceEnterNicknameViewModel((C236419g) this.A00.A1v.get(), (C19770wU) this.A00.A9Y.get());
            case 157:
                Application A004 = AnonymousClass1JT.A00(this.A00.AfJ);
                C19470v6 A005 = C19460v5.A00();
                C236419g r264 = (C236419g) this.A00.A1v.get();
                C231517j r273 = (C231517j) this.A00.AFl.get();
                C25701Hi r282 = (C25701Hi) this.A00.A54.get();
                C20810yC r293 = (C20810yC) this.A00.A02.get();
                AnonymousClass196 r225 = (AnonymousClass196) this.A00.A8N.get();
                AnonymousClass1AB r234 = (AnonymousClass1AB) this.A00.A8O.get();
                C19600wD r245 = (C19600wD) this.A00.A24.get();
                C19420v0 r255 = (C19420v0) this.A00.A9G.get();
                return new LinkedDevicesSharedViewModel(A004, A005, C19460v5.A01((C33241ex) this.A00.A4A.get()), (AnonymousClass17Y) this.A00.A3e.get(), (C21100yf) this.A00.A7f.get(), (C31651cA) this.A00.AE9.get(), r225, r234, r245, r255, r264, r273, r282, r293, (C236919l) this.A00.A5Q.get(), (AnonymousClass3EC) this.A00.A00.A6o.get(), (C19770wU) this.A00.A9Y.get());
            case 158:
                C236919l r79 = (C236919l) this.A00.A5Q.get();
                C236419g r614 = (C236419g) this.A00.A1v.get();
                return new LinkedDevicesViewModel(AnonymousClass1JT.A00(this.A00.AfJ), C19460v5.A01((C33241ex) this.A00.A4A.get()), (AnonymousClass17Y) this.A00.A3e.get(), r614, r79, (C19770wU) this.A00.A9Y.get());
            case 159:
                Application A006 = AnonymousClass1JT.A00(this.A00.AfJ);
                C142616pA r49 = (C142616pA) this.A00.A00.A1R.get();
                C129006Eo r615 = (C129006Eo) this.A00.A00.A3l.get();
                return new LocationOptionPickerViewModel(A006, r49, (AnonymousClass5DR) this.A00.A00.A0c.get(), r615, (C19630wG) this.A00.A91.get(), (C20830yE) this.A00.A9E.get(), (AnonymousClass1QW) this.A00.A00.A0Z.get());
            case 160:
                return new MagicModPopupViewModel();
            case 161:
                return new MediaGalleryFragmentViewModel(C18840tu.A00(this.A01.A3f), C18840tu.A00(this.A01.A31), C18840tu.A00(this.A01.A3g), C25141Fd.A00(), C24291Bw.A00());
            case 162:
                return new C1899596g();
            case 163:
                return new C54382sr();
            case 164:
                return new AnonymousClass3NP((C19970wo) this.A00.A8b.get());
            case 165:
                return new MediaViewCurrentMessageViewModel(C18800tq.A1I(this.A00), (AnonymousClass16J) this.A00.A57.get());
            case 166:
                AnonymousClass6WJ r511 = (AnonymousClass6WJ) this.A00.A00.A0p.get();
                return new MenuBottomSheetViewModel((C19730wQ) this.A00.A4g.get(), C18830tt.A2W(this.A00.A00), r511, (C105545Fb) this.A00.A00.A0q.get(), (AnonymousClass16D) this.A00.A2A.get(), (AnonymousClass171) this.A00.A90.get(), (C24261Bt) this.A00.AAz.get());
            case 167:
                Application A007 = AnonymousClass1JT.A00(this.A00.AfJ);
                C231517j r710 = (C231517j) this.A00.AFl.get();
                C19470v6 A008 = C19460v5.A00();
                AnonymousClass1LU r84 = (AnonymousClass1LU) this.A00.A7p.get();
                return new MessageDetailsViewModel(A007, A008, C19460v5.A00(), C19460v5.A00(), r710, r84, (C19770wU) this.A00.A9Y.get());
            case 168:
                C20310xM r410 = (C20310xM) this.A00.A2S.get();
                AnonymousClass1A1 r616 = (AnonymousClass1A1) this.A00.A3H.get();
                C1256560t r512 = (C1256560t) this.A00.A00.A9r.get();
                return new MessageRatingViewModel((C117095lh) this.A00.A00.A9q.get(), r410, r512, r616, (C19770wU) this.A00.A9Y.get());
            case 169:
                return new MessageSelectionViewModel(this.A01.A3n, (AnonymousClass17Y) this.A00.A3e.get(), (AnonymousClass16J) this.A00.A57.get(), (AnonymousClass1A1) this.A00.A3H.get());
            case 170:
                return new MinimizedCallBannerViewModel(this.A01.A0o(), this.A01.A0q(), AnonymousClass1BE.A00());
            case 171:
                AnonymousClass17Y r36 = (AnonymousClass17Y) this.A00.A3e.get();
                C19730wQ r411 = (C19730wQ) this.A00.A4g.get();
                C32641dx r125 = (C32641dx) this.A00.A00.A4F.get();
                AnonymousClass16D r617 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass1CR r133 = (AnonymousClass1CR) this.A00.A1i.get();
                C24361Cd r513 = (C24361Cd) this.A00.A1j.get();
                C24381Cf r95 = (C24381Cf) this.A00.A2M.get();
                return new MuteDialogViewModel(r36, r411, r513, r617, (C19970wo) this.A00.A8b.get(), (C19420v0) this.A00.A9G.get(), r95, (AnonymousClass17X) this.A00.A3v.get(), (C20810yC) this.A00.A02.get(), r125, r133, (C19770wU) this.A00.A9Y.get());
            case 172:
                AnonymousClass3TX r126 = (AnonymousClass3TX) this.A00.A00.A1p.get();
                AnonymousClass13I r618 = (AnonymousClass13I) this.A00.A4a.get();
                C62623Gw A2U = this.A01.A2T();
                C62653Gz r114 = (C62653Gz) this.A00.A00.A4Z.get();
                C29501Ww r85 = (C29501Ww) this.A00.A7K.get();
                C19420v0 r514 = (C19420v0) this.A00.A9G.get();
                AnonymousClass1X8 r104 = (AnonymousClass1X8) this.A00.AdX.get();
                C25271Fq r412 = (C25271Fq) this.A00.A9D.get();
                return A04((C19460v5) this.A00.A5y.get(), (C19970wo) this.A00.A8b.get(), (C19630wG) this.A00.A91.get(), r412, r514, r618, A2U, r85, (AnonymousClass12U) this.A00.A7L.get(), r104, r114, r126, (C19770wU) this.A00.A9Y.get());
            case 173:
                return new NewsletterGeosuspensionInfoViewModel((AnonymousClass16D) this.A00.A2A.get(), (C20810yC) this.A00.A02.get(), this.A01.A29(), C25141Fd.A00());
            case 174:
                return new NewsletterRequestReviewViewModel(this.A01.A29(), C25141Fd.A00());
            case 175:
                C220412q r413 = (C220412q) this.A00.A1l.get();
                return new NewsletterSuspensionInfoViewModel((AnonymousClass16D) this.A00.A2A.get(), r413, (C20810yC) this.A00.A02.get(), this.A01.A29(), C25141Fd.A00());
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return new NewsletterUserReportsViewModel((AnonymousClass1M6) this.A00.ATy.get(), (AnonymousClass16D) this.A00.A2A.get(), this.A01.A2B(), new AnonymousClass32d(), C25141Fd.A00());
            case 177:
                C19730wQ r37 = (C19730wQ) this.A00.A4g.get();
                C220412q r414 = (C220412q) this.A00.A1l.get();
                AnonymousClass1CR r86 = (AnonymousClass1CR) this.A00.A1i.get();
                return new NotificationsAndSoundsViewModel(r37, r414, (AnonymousClass17X) this.A00.A3v.get(), (C20810yC) this.A00.A02.get(), (C233117z) this.A00.A3w.get(), r86, (C19770wU) this.A00.A9Y.get());
            case 178:
                return new OrientationViewModel((C27631Pa) this.A00.A8z.get(), (C19630wG) this.A00.A91.get(), this.A00.A00.ABL, this.A00.A00.A3Q);
            case 179:
                AnonymousClass17Y r415 = (AnonymousClass17Y) this.A00.A3e.get();
                C19700wN r38 = (C19700wN) this.A00.A2U.get();
                AnonymousClass1HK r127 = (AnonymousClass1HK) this.A00.A1H.get();
                AnonymousClass13J r142 = (AnonymousClass13J) this.A00.A6z.get();
                C105545Fb r711 = (C105545Fb) this.A00.A00.A0q.get();
                AnonymousClass16D r96 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass171 r115 = (AnonymousClass171) this.A00.A90.get();
                AnonymousClass1NG r515 = (AnonymousClass1NG) this.A00.A0v.get();
                AnonymousClass16I r105 = (AnonymousClass16I) this.A00.A2B.get();
                AnonymousClass1PZ r87 = (AnonymousClass1PZ) this.A00.A1L.get();
                return new ParticipantsListViewModel(r38, r415, r515, (C27631Pa) this.A00.A8z.get(), r711, r87, r96, r105, r115, r127, (C20810yC) this.A00.A02.get(), r142, (C19770wU) this.A00.A9Y.get());
            case 180:
                return new PaymentIncentiveViewModel((C19970wo) this.A00.A8b.get(), (AnonymousClass1EU) this.A00.A6M.get(), (AnonymousClass1YQ) this.A00.A69.get(), (C19770wU) this.A00.A9Y.get());
            case 181:
                AnonymousClass1EU r619 = (AnonymousClass1EU) this.A00.A6M.get();
                C23075B3f b3f = (C23075B3f) this.A00.A00.A0R.get();
                AnonymousClass2ZN r39 = (AnonymousClass2ZN) this.A00.AVK.get();
                C32971eV r88 = (C32971eV) this.A00.ARQ.get();
                return new PaymentMerchantAccountViewModel(r39, (C29231Vv) this.A00.AVn.get(), (AnonymousClass1YN) this.A00.AVo.get(), r619, b3f, r88, (C19770wU) this.A00.A9Y.get());
            case 182:
                return new PinInChatBannerViewModel((AnonymousClass17Y) this.A00.A3e.get(), (C19970wo) this.A00.A8b.get(), this.A01.A2J(), this.A00.AHt());
            case 183:
                return new PollCreatorViewModel((AnonymousClass1X4) this.A00.A8h.get(), (C19970wo) this.A00.A8b.get(), (C20810yC) this.A00.A02.get(), (C65493Sh) this.A00.A00.A3I.get());
            case 184:
                C24681Dj r416 = (C24681Dj) this.A00.A6f.get();
                AnonymousClass1Z5 r620 = (AnonymousClass1Z5) this.A00.A6i.get();
                return new PrivacyDisclosureContainerViewModel((AnonymousClass17Y) this.A00.A3e.get(), r416, (C131156Ny) this.A00.A00.A3K.get(), r620, (C19770wU) this.A00.A9Y.get());
            case 185:
                Application A009 = AnonymousClass1JT.A00(this.A00.AfJ);
                AnonymousClass9UB A4X = C18800tq.A4W(this.A00);
                AnonymousClass9N7 A0G = this.A01.A0F();
                ProductBottomSheetViewModel productBottomSheetViewModel = r13;
                C64183Mz A0E = this.A01.A0D();
                AnonymousClass9UA A06 = this.A01.A05();
                C198909eO r256 = (C198909eO) this.A03.A03.get();
                AnonymousClass6W7 r274 = (AnonymousClass6W7) this.A01.A30.get();
                AnonymousClass9Y1 r226 = (AnonymousClass9Y1) this.A00.A1R.get();
                C202279lS r235 = (C202279lS) this.A00.A1T.get();
                AnonymousClass4PE r205 = (AnonymousClass4PE) this.A01.A3V.get();
                C29461Ws r215 = (C29461Ws) this.A00.A1S.get();
                C178358fo r185 = (C178358fo) this.A00.ADJ.get();
                AnonymousClass9XI r17 = (AnonymousClass9XI) this.A00.ADM.get();
                ProductBottomSheetViewModel productBottomSheetViewModel2 = new ProductBottomSheetViewModel(A009, (C19730wQ) this.A00.A4g.get(), (C22909AyL) this.A01.A3W.get(), r17, r185, A06, r205, r215, r226, r235, A0E, r256, A0G, r274, (C199439fJ) this.A00.A17.get(), A4X, (C18820ts) this.A00.A9X.get(), (C61223Ba) this.A00.A00.A34.get());
                return productBottomSheetViewModel2;
            case 186:
                return new B9I(this, 1);
            case 187:
                return new AnonymousClass6W7((C19730wQ) this.A00.A4g.get(), (AnonymousClass17Z) this.A00.A95.get(), (AnonymousClass12O) this.A00.A98.get());
            case 188:
                return new C164327rd(this, 1);
            case 189:
                return new QuickActionBarViewModel((C228016a) this.A00.A00.ABO.get(), C18840tu.A00(this.A00.A2A), C18840tu.A00(this.A00.A00.ABN), C18840tu.A00(this.A00.A02), C18840tu.A00(this.A01.A3j), C24291Bw.A00(), AnonymousClass19Q.A00());
            case 190:
                return new AnonymousClass9IT(C18840tu.A00(this.A00.A7i));
            case 191:
                C19730wQ r310 = (C19730wQ) this.A00.A4g.get();
                C220412q r621 = (C220412q) this.A00.A1l.get();
                C21060yb r417 = (C21060yb) this.A00.A8W.get();
                C29721Xs r106 = (C29721Xs) this.A00.AYY.get();
                C19890wg r97 = (C19890wg) this.A00.A7i.get();
                return new ReactionsTrayViewModel(r310, r417, (C19970wo) this.A00.A8b.get(), r621, (C20810yC) this.A00.A02.get(), (C25361Fz) this.A00.ASg.get(), r97, r106, (C19770wU) this.A00.A9Y.get());
            case 192:
                C220412q r98 = (C220412q) this.A00.A1l.get();
                AnonymousClass16D r418 = (AnonymousClass16D) this.A00.A2A.get();
                C32881eL r128 = (C32881eL) this.A00.A4L.get();
                AnonymousClass171 r516 = (AnonymousClass171) this.A00.A90.get();
                C18820ts r712 = (C18820ts) this.A00.A9X.get();
                C26151Jb A7C = this.A00.A7B();
                AnonymousClass1A1 r134 = (AnonymousClass1A1) this.A00.A3H.get();
                return new ReportSpamDialogViewModel(AnonymousClass1JT.A00(this.A00.AfJ), r418, r516, (C63633Ku) this.A00.A00.ACP.get(), r712, A7C, r98, (AnonymousClass17X) this.A00.A3v.get(), (C20810yC) this.A00.A02.get(), r128, r134, (C32681e1) this.A00.A00.A2Y.get(), C25141Fd.A00());
            case 193:
                return new RequestPhoneNumberViewModel((AnonymousClass1X4) this.A00.A8h.get(), (AnonymousClass12O) this.A00.A98.get(), (AnonymousClass1FV) this.A00.A9A.get(), (AnonymousClass1FX) this.A00.AeX.get(), (C20380xT) this.A00.ANA.get(), (C19770wU) this.A00.A9Y.get());
            case 194:
                return new RestoreFromBackupViewModel((C20690y0) this.A00.A6r.get(), (AnonymousClass9HB) this.A00.A00.ABm.get(), (AnonymousClass1Q9) this.A00.A5D.get(), (C19770wU) this.A00.A9Y.get());
            case 195:
                return new RetryCodeCountdownTimersViewModel((AnonymousClass12U) this.A00.A7L.get());
            case 196:
                C19730wQ r311 = (C19730wQ) this.A00.A4g.get();
                C19630wG r107 = (C19630wG) this.A00.A91.get();
                C30541aN A4V = C18800tq.A4U(this.A00);
                C105545Fb r517 = (C105545Fb) this.A00.A00.A0q.get();
                AnonymousClass711 r99 = (AnonymousClass711) this.A00.A8v.get();
                C005602m A0010 = AnonymousClass19Q.A00();
                AnonymousClass1PW r713 = (AnonymousClass1PW) this.A00.A74.get();
                AnonymousClass2ZH r89 = (AnonymousClass2ZH) this.A00.A00.AD4.get();
                return new ScreenShareViewModel(r311, A4V, r517, (C131176Oa) this.A00.A00.A3h.get(), r713, r89, r99, r107, (C20810yC) this.A00.A02.get(), (VoipCameraManager) this.A00.A8x.get(), A0010);
            case 197:
                AnonymousClass17Y r810 = (AnonymousClass17Y) this.A00.A3e.get();
                AnonymousClass1YP ALB = C18800tq.ALA(this.A00);
                C129016Ep A1f = this.A01.A1e();
                C19420v0 r116 = (C19420v0) this.A00.A9G.get();
                C005602m A0011 = C25141Fd.A00();
                C19600wD r108 = (C19600wD) this.A00.A24.get();
                C24041Av r910 = (C24041Av) this.A00.A7I.get();
                C121615tQ A1j = this.A01.A1i();
                AnonymousClass6NT A1h = this.A01.A1g();
                AnonymousClass5La r135 = (AnonymousClass5La) this.A00.A00.A4T.get();
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A00.A00.A7B.get();
                C117265ly r216 = (C117265ly) this.A00.AYs.get();
                C119615qA r186 = (C119615qA) this.A00.A00.A8R.get();
                return new SearchFunStickersViewModel(r810, r910, r108, r116, emojiSearchProvider, r135, (C20810yC) this.A00.A02.get(), (C20840yF) this.A00.A8Z.get(), A1f, (C63563Kn) this.A00.A00.A8P.get(), r186, A1h, A1j, r216, (AnonymousClass1AP) this.A00.A89.get(), (WebpUtils) this.A00.A9T.get(), ALB, A0011);
            case 198:
                return new SelectedImageAlbumViewModel((AnonymousClass16J) this.A00.A57.get(), (AnonymousClass1A1) this.A00.A3H.get());
            case 199:
                return new SettingsAccountViewModel((AnonymousClass2ZA) this.A00.A00.A65.get(), (C237819v) this.A00.A40.get(), (C19770wU) this.A00.A9Y.get());
            default:
                throw new AssertionError(this.A02);
        }
    }

    private Object A0A() {
        switch (this.A02) {
            case 200:
                return new SettingsChatViewModel((AnonymousClass1Q9) this.A00.A5D.get(), (C19770wU) this.A00.A9Y.get());
            case 201:
                return A05((AnonymousClass17Y) this.A00.A3e.get(), C18800tq.A4U(this.A00), (AnonymousClass179) this.A00.A3D.get(), (C20810yC) this.A00.A02.get(), (C68903ce) this.A00.A00.ABU.get(), (C19770wU) this.A00.A9Y.get());
            case 202:
                C21010yW r13 = (C21010yW) this.A00.A79.get();
                C24431Ck r4 = (C24431Ck) this.A00.A2z.get();
                AnonymousClass1Q9 r12 = (AnonymousClass1Q9) this.A00.A5D.get();
                AnonymousClass6FS r7 = (AnonymousClass6FS) this.A00.A3g.get();
                C19420v0 r11 = (C19420v0) this.A00.A9G.get();
                C24461Cn r3 = (C24461Cn) this.A00.A0c.get();
                AnonymousClass3S1 r5 = (AnonymousClass3S1) this.A00.A00.A0J.get();
                C19600wD r10 = (C19600wD) this.A00.A24.get();
                C33101ei r6 = (C33101ei) this.A00.A3f.get();
                C33161ep r9 = (C33161ep) this.A00.A3j.get();
                return A03((AnonymousClass17Y) this.A00.A3e.get(), r3, r4, r5, r6, r7, (C33171eq) this.A00.A3i.get(), r9, r10, r11, r12, r13, (C19770wU) this.A00.A9Y.get());
            case 203:
                return new SettingsPasskeysViewModel((C19420v0) this.A00.A9G.get(), (C88014Rb) this.A01.A3h.get(), (C88024Rc) this.A01.A3i.get(), (PasskeyServerApiImpl) this.A00.A00.A57.get());
            case 204:
                return new B98(this, 1);
            case 205:
                return new AnonymousClass4ZZ(this, 1);
            case 206:
                C132016Ru AKi = this.A00.AKh();
                return new SettingsPrivacyCameraEffectsViewModel((ArEffectsFlmConsentManager) this.A00.A00.A4p.get(), C18830tt.A2W(this.A00.A00), (C1258761r) this.A00.AD7.get(), AKi, C25141Fd.A00());
            case 207:
                return new SettingsSetupUserProxyViewModel((AnonymousClass1VS) this.A00.A8r.get());
            case 208:
                AnonymousClass17Y r32 = (AnonymousClass17Y) this.A00.A3e.get();
                AnonymousClass1C4 r72 = (AnonymousClass1C4) this.A00.A7e.get();
                C20720y3 r62 = (C20720y3) this.A00.A52.get();
                C61523Ch r8 = (C61523Ch) this.A01.A3m.get();
                AnonymousClass1VS r102 = (AnonymousClass1VS) this.A00.A8r.get();
                AnonymousClass3NU A2c = this.A01.A2b();
                return new SettingsUserProxyViewModel(r32, (AnonymousClass1M6) this.A00.ATy.get(), (C20810yC) this.A00.A02.get(), r62, r72, r8, this.A00.AJQ(), r102, A2c, (C68903ce) this.A00.A00.ABU.get(), (C19770wU) this.A00.A9Y.get());
            case 209:
                return new C61523Ch((C21010yW) this.A00.A79.get());
            case 210:
                return new SharePhoneNumberRowViewModel((C19730wQ) this.A00.A4g.get(), (AnonymousClass16D) this.A00.A2A.get(), (AnonymousClass171) this.A00.A90.get(), (AnonymousClass1FV) this.A00.A9A.get(), (C19770wU) this.A00.A9Y.get());
            case 211:
                return new SharePhoneNumberViewModel((C19730wQ) this.A00.A4g.get(), (AnonymousClass1X4) this.A00.A8h.get(), (AnonymousClass1FX) this.A00.AeX.get(), (C20380xT) this.A00.ANA.get());
            case 212:
                return new ShareProductViewModel((C29461Ws) this.A00.A1S.get());
            case 213:
                return A06((C19600wD) this.A00.A24.get(), C18840tu.A00(this.A00.A0w));
            case 214:
                return new ShopsProductPreviewFragmentViewModel((C21010yW) this.A00.A79.get(), (AnonymousClass62F) this.A00.A7k.get());
            case 215:
                return new StatusArchiveSettingsViewModel(this.A01.A3n, (AnonymousClass1HT) this.A00.A7x.get(), C18800tq.AKo(this.A00));
            case 216:
                return new StickerComposerViewModel((C20690y0) this.A00.A6r.get(), this.A01.A2e(), C25141Fd.A00());
            case 217:
                C117175lp r22 = (C117175lp) this.A00.A00.A7L.get();
                C117215lt r21 = (C117215lt) this.A00.A00.ACa.get();
                C19970wo r20 = (C19970wo) this.A00.A8b.get();
                C20810yC r19 = (C20810yC) this.A00.A02.get();
                C21010yW r18 = (C21010yW) this.A00.A79.get();
                C23871Ae r17 = (C23871Ae) this.A00.A0V.get();
                C18820ts r16 = (C18820ts) this.A00.A9X.get();
                AnonymousClass6LJ A1Z = this.A01.A1Y();
                C117165lo A1O = this.A01.A1N();
                C005602m A002 = C25141Fd.A00();
                C122485uv A1Q = this.A01.A1P();
                AnonymousClass633 ACk = this.A00.A00.ACj();
                C1256860w A1b = this.A01.A1a();
                C117215lt r38 = r21;
                AnonymousClass6SS r39 = (AnonymousClass6SS) this.A00.A00.A8b.get();
                C20810yC r40 = r19;
                C21010yW r41 = r18;
                C24261Bt r42 = (C24261Bt) this.A00.AAz.get();
                C122775vP r43 = (C122775vP) this.A01.A2w.get();
                C23871Ae r44 = r17;
                AnonymousClass1BB r46 = (AnonymousClass1BB) this.A00.A85.get();
                AnonymousClass3GT r47 = (AnonymousClass3GT) this.A00.A00.ACY.get();
                C130566Lo r48 = (C130566Lo) this.A00.A00.ACS.get();
                AnonymousClass1BH r49 = (AnonymousClass1BH) this.A00.AdC.get();
                AnonymousClass6SF r50 = (AnonymousClass6SF) this.A01.A2z.get();
                C18820ts r26 = r16;
                AnonymousClass6O1 r29 = (AnonymousClass6O1) this.A00.A00.A7K.get();
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A00.A00.A7B.get();
                C121575tM r31 = (C121575tM) this.A00.A00.ACG.get();
                C117175lp r322 = r22;
                AnonymousClass63V r33 = (AnonymousClass63V) this.A00.A00.A7M.get();
                C119585q6 r34 = (C119585q6) this.A00.A00.ABp.get();
                C124455yD r35 = (C124455yD) this.A01.A3k.get();
                return new StickerExpressionsViewModel(r20, (C19420v0) this.A00.A9G.get(), r26, A1O, A1Q, r29, emojiSearchProvider, r31, r322, r33, r34, r35, A1Z, A1b, r38, r39, r40, r41, r42, r43, r44, ACk, r46, r47, r48, r49, r50, A002, AnonymousClass1BE.A00());
            case 218:
                return new C124455yD((C122505ux) this.A03.A02.get(), this.A01.A2g(), this.A00.A00.ACr(), (C130566Lo) this.A00.A00.ACS.get(), AnonymousClass1BE.A00());
            case 219:
                AnonymousClass005 A003 = C18840tu.A00(this.A00.A6r);
                AnonymousClass005 A004 = C18840tu.A00(this.A00.A4d);
                AnonymousClass005 A005 = C18840tu.A00(this.A00.A9S);
                AnonymousClass3H7 A5q = this.A00.A00.A5p();
                AnonymousClass005 A006 = C18840tu.A00(this.A00.A2A);
                AnonymousClass39V A2j = this.A01.A2i();
                AnonymousClass1BF r63 = (AnonymousClass1BF) this.A00.A0Q.get();
                C005602m A007 = C25141Fd.A00();
                AnonymousClass005 A008 = C18840tu.A00(this.A00.AXj);
                AnonymousClass196 r45 = (AnonymousClass196) this.A00.A8N.get();
                return new StickerInfoViewModel(C18800tq.A0w(this.A00), r45, A5q, r63, (C23981Ap) this.A00.A83.get(), (AnonymousClass1AP) this.A00.A89.get(), A2j, A003, A004, A005, A006, A008, A007);
            case 220:
                C20810yC r73 = (C20810yC) this.A00.A02.get();
                C220412q r410 = (C220412q) this.A00.A1l.get();
                AnonymousClass3AY A1z = this.A01.A1y();
                return new SupportAiViewModel((AnonymousClass17Y) this.A00.A3e.get(), r410, (C24381Cf) this.A00.A2M.get(), (C20310xM) this.A00.A2S.get(), r73, A1z, (AnonymousClass3E6) this.A00.A00.A60.get(), (C19770wU) this.A00.A9Y.get());
            case 221:
                return new SupportBkLayoutViewModel((C33761ft) this.A00.Abq.get(), C18840tu.A00(this.A00.A0w));
            case 222:
                return new SurveyViewModel((AnonymousClass2ZC) this.A00.Abz.get());
            case 223:
                C19730wQ r411 = (C19730wQ) this.A00.A4g.get();
                return new ToSGatingViewModel(this.A00.A00.A0d(), r411, (C24541Cv) this.A00.A4O.get(), (C20810yC) this.A00.A02.get(), (AnonymousClass1EA) this.A00.Acw.get(), (AnonymousClass1E9) this.A00.A8c.get());
            case 224:
                return new UTwoNetViewModel((AnonymousClass1Ax) this.A00.A4p.get(), this.A01.A22(), (WhatsAppDynamicPytorchLoader) this.A00.A00.A4N.get(), C25141Fd.A00());
            case 225:
                return new UniversalToolPickerViewModel();
            case 226:
                C19730wQ r36 = (C19730wQ) this.A00.A4g.get();
                AnonymousClass16D r412 = (AnonymousClass16D) this.A00.A2A.get();
                C18820ts r64 = (C18820ts) this.A00.A9X.get();
                C26211Jh r82 = (C26211Jh) this.A00.A7X.get();
                C31031bA r103 = (C31031bA) this.A00.A7W.get();
                return new UpcomingActivityViewModel(r36, r412, (C19970wo) this.A00.A8b.get(), r64, (AnonymousClass17X) this.A00.A3v.get(), r82, (C233117z) this.A00.A3w.get(), r103, (C19770wU) this.A00.A9Y.get());
            case 227:
                return new UpdatesAdvertiseViewModel(this.A01.A3n, C19460v5.A00(), (C19420v0) this.A00.A9G.get(), (C65423Rz) this.A00.A00.ACU.get());
            case 228:
                return new UsernameViewModel((C19730wQ) this.A00.A4g.get(), (C19750wS) this.A00.AdU.get(), (C19970wo) this.A00.A8b.get(), (C61873Dt) this.A00.Aau.get());
            case 229:
                return new VariantsCarouselFragmentViewModel(this.A01.A0B(), (C20810yC) this.A00.A02.get());
            case 230:
                C19730wQ r37 = (C19730wQ) this.A00.A4g.get();
                AnonymousClass1ND r52 = (AnonymousClass1ND) this.A00.A1N.get();
                AnonymousClass1HK r104 = (AnonymousClass1HK) this.A00.A1H.get();
                AnonymousClass171 r92 = (AnonymousClass171) this.A00.A90.get();
                C105545Fb r413 = (C105545Fb) this.A00.A00.A0q.get();
                AnonymousClass16D r74 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass16I r83 = (AnonymousClass16I) this.A00.A2B.get();
                AnonymousClass1PW r65 = (AnonymousClass1PW) this.A00.A74.get();
                AnonymousClass1HO r122 = (AnonymousClass1HO) this.A00.A4M.get();
                return new VoiceChatBottomSheetViewModel(r37, r413, r52, r65, r74, r83, r92, r104, (AnonymousClass17X) this.A00.A3v.get(), r122, (C20810yC) this.A00.A02.get(), (C19770wU) this.A00.A9Y.get(), C24291Bw.A00(), AnonymousClass1BE.A00());
            case 231:
                C20810yC r212 = (C20810yC) this.A00.A02.get();
                C19730wQ r202 = (C19730wQ) this.A00.A4g.get();
                C19630wG r192 = (C19630wG) this.A00.A91.get();
                C19770wU r182 = (C19770wU) this.A00.A9Y.get();
                AnonymousClass1C6 r172 = (AnonymousClass1C6) this.A00.A7s.get();
                C25841Hw A8u = C18800tq.A8t(this.A00);
                C24801Dv r162 = (C24801Dv) this.A00.A0D.get();
                C61693Db A2X = C18830tt.A2W(this.A00.A00);
                AnonymousClass004 AL1 = this.A00.A00.ABL;
                AnonymousClass004 AL2 = this.A00.A00.A3Q;
                AnonymousClass004 AL3 = this.A00.A00.A3R;
                C145156tR r27 = (C145156tR) this.A00.A00.ABD.get();
                AnonymousClass1PZ r292 = (AnonymousClass1PZ) this.A00.A1L.get();
                C131176Oa r30 = (C131176Oa) this.A00.A00.A3h.get();
                AnonymousClass798 r312 = (AnonymousClass798) this.A00.A00.A37.get();
                AnonymousClass53T r323 = (AnonymousClass53T) this.A00.AZF.get();
                AnonymousClass711 r332 = (AnonymousClass711) this.A00.A8v.get();
                AnonymousClass16D r342 = (AnonymousClass16D) this.A00.A2A.get();
                AnonymousClass185 r352 = (AnonymousClass185) this.A00.A8u.get();
                AnonymousClass171 r362 = (AnonymousClass171) this.A00.A90.get();
                return new VoiceChatGridViewModel(r162, r202, A2X, (C105545Fb) this.A00.A00.A0q.get(), r27, AnonymousClass1U1.A0s(), r292, r30, r312, r323, r332, r342, r352, r362, (AnonymousClass1G5) this.A00.A2O.get(), r192, (C18820ts) this.A00.A9X.get(), (AnonymousClass17X) this.A00.A3v.get(), A8u, r212, (C20350xQ) this.A00.A3k.get(), r172, (AnonymousClass13J) this.A00.A6z.get(), r182, (VoipCameraManager) this.A00.A8x.get(), AL1, AL2, AL3);
            case 232:
                return new WaBkExtensionsLayoutViewModel((C19600wD) this.A00.A24.get(), (AnonymousClass17Z) this.A00.A95.get(), (C20810yC) this.A00.A02.get(), C18840tu.A00(this.A00.A0w));
            case 233:
                C26461Kg A9m = this.A00.A9l();
                C005602m A009 = C25141Fd.A00();
                AnonymousClass6TL r66 = (AnonymousClass6TL) this.A00.ANz.get();
                FlowsWebViewDataRepository A1d = this.A01.A1c();
                AnonymousClass1X4 r310 = (AnonymousClass1X4) this.A00.A8h.get();
                C20310xM r53 = (C20310xM) this.A00.A2S.get();
                AnonymousClass1KT A9u = this.A00.A9t();
                C21010yW r123 = (C21010yW) this.A00.A79.get();
                return new WaFlowsViewModel(r310, (C19970wo) this.A00.A8b.get(), r53, r66, (AnonymousClass6PZ) this.A00.AeT.get(), A9m, A9u, A1d, (C20810yC) this.A00.A02.get(), r123, (C19770wU) this.A00.A9Y.get(), A009);
            case 234:
                C25271Fq r311 = (C25271Fq) this.A00.A9D.get();
                C64703Pc r67 = (C64703Pc) this.A00.Aeh.get();
                return new WfacBanViewModel(r311, (C29501Ww) this.A00.A7K.get(), (C19770wU) this.A00.A9Y.get(), r67, (AnonymousClass66X) this.A00.Aeg.get());
            default:
                throw new AssertionError(this.A02);
        }
    }

    public Object get() {
        int i = this.A02 / 100;
        if (i == 0) {
            return A08();
        }
        if (i == 1) {
            return A09();
        }
        if (i == 2) {
            return A0A();
        }
        throw new AssertionError(this.A02);
    }

    public static GoogleDriveNewUserSetupViewModel A02(AnonymousClass6FS r1, C19970wo r2, C19420v0 r3) {
        return new GoogleDriveNewUserSetupViewModel(r1, r2, r3);
    }

    public static SettingsGoogleDriveViewModel A03(AnonymousClass17Y r1, C24461Cn r2, C24431Ck r3, AnonymousClass3S1 r4, C33101ei r5, AnonymousClass6FS r6, C33171eq r7, C33161ep r8, C19600wD r9, C19420v0 r10, AnonymousClass1Q9 r11, C21010yW r12, C19770wU r13) {
        return new SettingsGoogleDriveViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public static NewDeviceConfirmationRegistrationViewModel A04(C19460v5 r1, C19970wo r2, C19630wG r3, C25271Fq r4, C19420v0 r5, AnonymousClass13I r6, C62623Gw r7, C29501Ww r8, AnonymousClass12U r9, AnonymousClass1X8 r10, C62653Gz r11, AnonymousClass3TX r12, C19770wU r13) {
        return new NewDeviceConfirmationRegistrationViewModel(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public static SettingsDataUsageViewModel A05(AnonymousClass17Y r1, C30531aM r2, AnonymousClass179 r3, C20810yC r4, C68903ce r5, C19770wU r6) {
        return new SettingsDataUsageViewModel(r1, r2, r3, r4, r5, r6);
    }

    public static ShopsBkLayoutViewModel A06(C19600wD r1, AnonymousClass005 r2) {
        return new ShopsBkLayoutViewModel(r1, r2);
    }

    public static GenericBkLayoutViewModel A07(C19600wD r1, AnonymousClass005 r2) {
        return new GenericBkLayoutViewModel(r1, r2);
    }
}
