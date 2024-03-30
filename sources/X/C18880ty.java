package X;

import com.whatsapp.accountsync.di.AccountSyncModule;
import com.whatsapp.addons.di.AddOnBridgeModule;
import com.whatsapp.authcommon.di.CommonModule;
import com.whatsapp.authgraphql.di.UnifiedAuthenticationModule;
import com.whatsapp.avatar.di.AvatarModule;
import com.whatsapp.biz.BusinessProductModule;
import com.whatsapp.biz.di.DCEncryptedModule;
import com.whatsapp.bridge.wfs.di.WfsProductReleaseModule;
import com.whatsapp.chatinfo.di.ActivityModule;
import com.whatsapp.community.di.CommunityNotificationModule;
import com.whatsapp.conversation.conversationrow.nativeflow.NativeFlowActionModule;
import com.whatsapp.conversation.di.ConversationUiModule;
import com.whatsapp.core.di.TimeModule;
import com.whatsapp.cron.di.CronModule;
import com.whatsapp.ctwa.di.CtwaModule;
import com.whatsapp.dailyevent.di.DailyEventModule;
import com.whatsapp.data.di.QuotedMessageStoreModule;
import com.whatsapp.data.migration.di.ForceMigrationModule;
import com.whatsapp.data.transactionlock.TransactionLockModule;
import com.whatsapp.dbmigration.di.DatabaseMigrationModule;
import com.whatsapp.di.CompanionModeModule;
import com.whatsapp.di.JidMapperProviderModule;
import com.whatsapp.di.MigrationModule;
import com.whatsapp.di.SearchModule;
import com.whatsapp.dmapreview.di.PreviewSubsystemModule;
import com.whatsapp.ephemeral.di.EphemeralProductModule;
import com.whatsapp.event.EventChatInfoModule;
import com.whatsapp.expressionstray.di.EmojiImageViewLoaderModule;
import com.whatsapp.fmessage.di.FMessageRegistrationsModule;
import com.whatsapp.fmessage.factory.di.FMessageFactoryModule;
import com.whatsapp.fmessage.forward.di.FMessageForwardingSubsystemModule;
import com.whatsapp.fmessage.platform.di.FMessagePlatformModule;
import com.whatsapp.fmessage.platform.registration.di.FMessagePlatformRegistrationModule;
import com.whatsapp.fmessage.systemmessage.platform.registration.di.SystemMessagePlatformRegistrationModule;
import com.whatsapp.gifsearch.di.GifSearchModule;
import com.whatsapp.indiaupi.di.IndiaUpiModule;
import com.whatsapp.integrity.di.IntegrityModule;
import com.whatsapp.integritysignals.di.IntegritySignalsModule;
import com.whatsapp.media.dailyusage.di.MediaDailyUsageModule;
import com.whatsapp.notification.di.OtpNotificationModule;
import com.whatsapp.p2mlite.di.P2mLiteModule;
import com.whatsapp.payments.di.IndiaUpiInfraModule;
import com.whatsapp.pininchat.subsystem.di.PinInChatSubsystemModule;
import com.whatsapp.preloads.di.PreloadsReleaseModule;
import com.whatsapp.reply.subsystem.di.ReplySubsystemModule;
import com.whatsapp.stickers.di.RecentStickersModule;
import com.whatsapp.systemmessage.di.SystemMessageRegistrationsModule;
import com.whatsapp.systemmessage.factory.di.SystemMessageFactoryModule;
import com.whatsapp.wabloks.commerce.di.CommerceBloksModule;
import com.whatsapp.wabloks.commerce.phoenix.external.directconnection.ExtensionsProductModule;
import com.whatsapp.waffle.accountlinking.di.WfalProdInfraModule;
import com.whatsapp.waffle.wfac.di.WfacProductReleaseModule;
import com.whatsapp.waquickpromotionsdk.filters.di.WaQuickPromotionFilterModule;
import com.whatsapp.webquery.di.WebQueryModule;
import com.whatsapp.workmanager.WaWorkManagerModule;
import com.whatsapp.xfamily.graphql.di.XFamilyGQLModule;
import java.util.Objects;

/* renamed from: X.0ty  reason: invalid class name and case insensitive filesystem */
public final class C18880ty implements C18700tb {
    public final C18870tx A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    C18870tx r3 = this.A00;
                    AnonymousClass004 r0 = C19450v4.A00;
                    C19490v8 r1 = new C19490v8();
                    C19500v9 r02 = new C19500v9(r3.A00);
                    Objects.requireNonNull(r02);
                    r1.A0u = r02;
                    AccountSyncModule accountSyncModule = r1.A00;
                    AccountSyncModule accountSyncModule2 = accountSyncModule;
                    if (accountSyncModule == null) {
                        accountSyncModule2 = new AccountSyncModule();
                        r1.A00 = accountSyncModule2;
                    }
                    ActivityModule activityModule = r1.A08;
                    ActivityModule activityModule2 = activityModule;
                    if (activityModule == null) {
                        activityModule2 = new ActivityModule();
                        r1.A08 = activityModule2;
                    }
                    AddOnBridgeModule addOnBridgeModule = r1.A01;
                    AddOnBridgeModule addOnBridgeModule2 = addOnBridgeModule;
                    if (addOnBridgeModule == null) {
                        addOnBridgeModule2 = new AddOnBridgeModule();
                        r1.A01 = addOnBridgeModule2;
                    }
                    AvatarModule avatarModule = r1.A04;
                    AvatarModule avatarModule2 = avatarModule;
                    if (avatarModule == null) {
                        avatarModule2 = new AvatarModule();
                        r1.A04 = avatarModule2;
                    }
                    BusinessProductModule businessProductModule = r1.A05;
                    BusinessProductModule businessProductModule2 = businessProductModule;
                    if (businessProductModule == null) {
                        businessProductModule2 = new BusinessProductModule();
                        r1.A05 = businessProductModule2;
                    }
                    CommerceBloksModule commerceBloksModule = r1.A0m;
                    CommerceBloksModule commerceBloksModule2 = commerceBloksModule;
                    if (commerceBloksModule == null) {
                        commerceBloksModule2 = new CommerceBloksModule();
                        r1.A0m = commerceBloksModule2;
                    }
                    CommonModule commonModule = r1.A02;
                    CommonModule commonModule2 = commonModule;
                    if (commonModule == null) {
                        commonModule2 = new CommonModule();
                        r1.A02 = commonModule2;
                    }
                    CommunityNotificationModule communityNotificationModule = r1.A09;
                    CommunityNotificationModule communityNotificationModule2 = communityNotificationModule;
                    if (communityNotificationModule == null) {
                        communityNotificationModule2 = new CommunityNotificationModule();
                        r1.A09 = communityNotificationModule2;
                    }
                    CompanionModeModule companionModeModule = r1.A0K;
                    CompanionModeModule companionModeModule2 = companionModeModule;
                    if (companionModeModule == null) {
                        companionModeModule2 = new CompanionModeModule();
                        r1.A0K = companionModeModule2;
                    }
                    ConversationUiModule conversationUiModule = r1.A0B;
                    ConversationUiModule conversationUiModule2 = conversationUiModule;
                    if (conversationUiModule == null) {
                        conversationUiModule2 = new ConversationUiModule();
                        r1.A0B = conversationUiModule2;
                    }
                    CronModule cronModule = r1.A0D;
                    CronModule cronModule2 = cronModule;
                    if (cronModule == null) {
                        cronModule2 = new CronModule();
                        r1.A0D = cronModule2;
                    }
                    CtwaModule ctwaModule = r1.A0E;
                    CtwaModule ctwaModule2 = ctwaModule;
                    if (ctwaModule == null) {
                        ctwaModule2 = new CtwaModule();
                        r1.A0E = ctwaModule2;
                    }
                    DCEncryptedModule dCEncryptedModule = r1.A06;
                    DCEncryptedModule dCEncryptedModule2 = dCEncryptedModule;
                    if (dCEncryptedModule == null) {
                        dCEncryptedModule2 = new DCEncryptedModule();
                        r1.A06 = dCEncryptedModule2;
                    }
                    DailyEventModule dailyEventModule = r1.A0F;
                    DailyEventModule dailyEventModule2 = dailyEventModule;
                    if (dailyEventModule == null) {
                        dailyEventModule2 = new DailyEventModule();
                        r1.A0F = dailyEventModule2;
                    }
                    DatabaseMigrationModule databaseMigrationModule = r1.A0J;
                    DatabaseMigrationModule databaseMigrationModule2 = databaseMigrationModule;
                    if (databaseMigrationModule == null) {
                        databaseMigrationModule2 = new DatabaseMigrationModule();
                        r1.A0J = databaseMigrationModule2;
                    }
                    EmojiImageViewLoaderModule emojiImageViewLoaderModule = r1.A0R;
                    EmojiImageViewLoaderModule emojiImageViewLoaderModule2 = emojiImageViewLoaderModule;
                    if (emojiImageViewLoaderModule == null) {
                        emojiImageViewLoaderModule2 = new EmojiImageViewLoaderModule();
                        r1.A0R = emojiImageViewLoaderModule2;
                    }
                    EphemeralProductModule ephemeralProductModule = r1.A0P;
                    EphemeralProductModule ephemeralProductModule2 = ephemeralProductModule;
                    if (ephemeralProductModule == null) {
                        ephemeralProductModule2 = new EphemeralProductModule();
                        r1.A0P = ephemeralProductModule2;
                    }
                    EventChatInfoModule eventChatInfoModule = r1.A0Q;
                    EventChatInfoModule eventChatInfoModule2 = eventChatInfoModule;
                    if (eventChatInfoModule == null) {
                        eventChatInfoModule2 = new EventChatInfoModule();
                        r1.A0Q = eventChatInfoModule2;
                    }
                    ExtensionsProductModule extensionsProductModule = r1.A0n;
                    ExtensionsProductModule extensionsProductModule2 = extensionsProductModule;
                    if (extensionsProductModule == null) {
                        extensionsProductModule2 = new ExtensionsProductModule();
                        r1.A0n = extensionsProductModule2;
                    }
                    FMessageFactoryModule fMessageFactoryModule = r1.A0T;
                    FMessageFactoryModule fMessageFactoryModule2 = fMessageFactoryModule;
                    if (fMessageFactoryModule == null) {
                        fMessageFactoryModule2 = new FMessageFactoryModule();
                        r1.A0T = fMessageFactoryModule2;
                    }
                    FMessageForwardingSubsystemModule fMessageForwardingSubsystemModule = r1.A0U;
                    FMessageForwardingSubsystemModule fMessageForwardingSubsystemModule2 = fMessageForwardingSubsystemModule;
                    if (fMessageForwardingSubsystemModule == null) {
                        fMessageForwardingSubsystemModule2 = new FMessageForwardingSubsystemModule();
                        r1.A0U = fMessageForwardingSubsystemModule2;
                    }
                    FMessagePlatformModule fMessagePlatformModule = r1.A0V;
                    FMessagePlatformModule fMessagePlatformModule2 = fMessagePlatformModule;
                    if (fMessagePlatformModule == null) {
                        fMessagePlatformModule2 = new FMessagePlatformModule();
                        r1.A0V = fMessagePlatformModule2;
                    }
                    FMessagePlatformRegistrationModule fMessagePlatformRegistrationModule = r1.A0W;
                    FMessagePlatformRegistrationModule fMessagePlatformRegistrationModule2 = fMessagePlatformRegistrationModule;
                    if (fMessagePlatformRegistrationModule == null) {
                        fMessagePlatformRegistrationModule2 = new FMessagePlatformRegistrationModule();
                        r1.A0W = fMessagePlatformRegistrationModule2;
                    }
                    FMessageRegistrationsModule fMessageRegistrationsModule = r1.A0S;
                    FMessageRegistrationsModule fMessageRegistrationsModule2 = fMessageRegistrationsModule;
                    if (fMessageRegistrationsModule == null) {
                        fMessageRegistrationsModule2 = new FMessageRegistrationsModule();
                        r1.A0S = fMessageRegistrationsModule2;
                    }
                    ForceMigrationModule forceMigrationModule = r1.A0H;
                    ForceMigrationModule forceMigrationModule2 = forceMigrationModule;
                    if (forceMigrationModule == null) {
                        forceMigrationModule2 = new ForceMigrationModule();
                        r1.A0H = forceMigrationModule2;
                    }
                    GifSearchModule gifSearchModule = r1.A0Y;
                    GifSearchModule gifSearchModule2 = gifSearchModule;
                    if (gifSearchModule == null) {
                        gifSearchModule2 = new GifSearchModule();
                        r1.A0Y = gifSearchModule2;
                    }
                    IndiaUpiInfraModule indiaUpiInfraModule = r1.A0f;
                    IndiaUpiInfraModule indiaUpiInfraModule2 = indiaUpiInfraModule;
                    if (indiaUpiInfraModule == null) {
                        indiaUpiInfraModule2 = new IndiaUpiInfraModule();
                        r1.A0f = indiaUpiInfraModule2;
                    }
                    IndiaUpiModule indiaUpiModule = r1.A0Z;
                    IndiaUpiModule indiaUpiModule2 = indiaUpiModule;
                    if (indiaUpiModule == null) {
                        indiaUpiModule2 = new IndiaUpiModule();
                        r1.A0Z = indiaUpiModule2;
                    }
                    IntegrityModule integrityModule = r1.A0a;
                    IntegrityModule integrityModule2 = integrityModule;
                    if (integrityModule == null) {
                        integrityModule2 = new IntegrityModule();
                        r1.A0a = integrityModule2;
                    }
                    IntegritySignalsModule integritySignalsModule = r1.A0b;
                    IntegritySignalsModule integritySignalsModule2 = integritySignalsModule;
                    if (integritySignalsModule == null) {
                        integritySignalsModule2 = new IntegritySignalsModule();
                        r1.A0b = integritySignalsModule2;
                    }
                    JidMapperProviderModule jidMapperProviderModule = r1.A0L;
                    JidMapperProviderModule jidMapperProviderModule2 = jidMapperProviderModule;
                    if (jidMapperProviderModule == null) {
                        jidMapperProviderModule2 = new JidMapperProviderModule();
                        r1.A0L = jidMapperProviderModule2;
                    }
                    MediaDailyUsageModule mediaDailyUsageModule = r1.A0c;
                    MediaDailyUsageModule mediaDailyUsageModule2 = mediaDailyUsageModule;
                    if (mediaDailyUsageModule == null) {
                        mediaDailyUsageModule2 = new MediaDailyUsageModule();
                        r1.A0c = mediaDailyUsageModule2;
                    }
                    MigrationModule migrationModule = r1.A0M;
                    MigrationModule migrationModule2 = migrationModule;
                    if (migrationModule == null) {
                        migrationModule2 = new MigrationModule();
                        r1.A0M = migrationModule2;
                    }
                    NativeFlowActionModule nativeFlowActionModule = r1.A0A;
                    NativeFlowActionModule nativeFlowActionModule2 = nativeFlowActionModule;
                    if (nativeFlowActionModule == null) {
                        nativeFlowActionModule2 = new NativeFlowActionModule();
                        r1.A0A = nativeFlowActionModule2;
                    }
                    OtpNotificationModule otpNotificationModule = r1.A0d;
                    OtpNotificationModule otpNotificationModule2 = otpNotificationModule;
                    if (otpNotificationModule == null) {
                        otpNotificationModule2 = new OtpNotificationModule();
                        r1.A0d = otpNotificationModule2;
                    }
                    P2mLiteModule p2mLiteModule = r1.A0e;
                    P2mLiteModule p2mLiteModule2 = p2mLiteModule;
                    if (p2mLiteModule == null) {
                        p2mLiteModule2 = new P2mLiteModule();
                        r1.A0e = p2mLiteModule2;
                    }
                    PinInChatSubsystemModule pinInChatSubsystemModule = r1.A0g;
                    PinInChatSubsystemModule pinInChatSubsystemModule2 = pinInChatSubsystemModule;
                    if (pinInChatSubsystemModule == null) {
                        pinInChatSubsystemModule2 = new PinInChatSubsystemModule();
                        r1.A0g = pinInChatSubsystemModule2;
                    }
                    PreloadsReleaseModule preloadsReleaseModule = r1.A0h;
                    PreloadsReleaseModule preloadsReleaseModule2 = preloadsReleaseModule;
                    if (preloadsReleaseModule == null) {
                        preloadsReleaseModule2 = new PreloadsReleaseModule();
                        r1.A0h = preloadsReleaseModule2;
                    }
                    PreviewSubsystemModule previewSubsystemModule = r1.A0O;
                    PreviewSubsystemModule previewSubsystemModule2 = previewSubsystemModule;
                    if (previewSubsystemModule == null) {
                        previewSubsystemModule2 = new PreviewSubsystemModule();
                        r1.A0O = previewSubsystemModule2;
                    }
                    QuotedMessageStoreModule quotedMessageStoreModule = r1.A0G;
                    QuotedMessageStoreModule quotedMessageStoreModule2 = quotedMessageStoreModule;
                    if (quotedMessageStoreModule == null) {
                        quotedMessageStoreModule2 = new QuotedMessageStoreModule();
                        r1.A0G = quotedMessageStoreModule2;
                    }
                    RecentStickersModule recentStickersModule = r1.A0j;
                    RecentStickersModule recentStickersModule2 = recentStickersModule;
                    if (recentStickersModule == null) {
                        recentStickersModule2 = new RecentStickersModule();
                        r1.A0j = recentStickersModule2;
                    }
                    ReplySubsystemModule replySubsystemModule = r1.A0i;
                    ReplySubsystemModule replySubsystemModule2 = replySubsystemModule;
                    if (replySubsystemModule == null) {
                        replySubsystemModule2 = new ReplySubsystemModule();
                        r1.A0i = replySubsystemModule2;
                    }
                    SearchModule searchModule = r1.A0N;
                    if (searchModule == null) {
                        searchModule = new SearchModule();
                        r1.A0N = searchModule;
                    }
                    SystemMessageFactoryModule systemMessageFactoryModule = r1.A0l;
                    if (systemMessageFactoryModule == null) {
                        systemMessageFactoryModule = new SystemMessageFactoryModule();
                        r1.A0l = systemMessageFactoryModule;
                    }
                    SystemMessagePlatformRegistrationModule systemMessagePlatformRegistrationModule = r1.A0X;
                    if (systemMessagePlatformRegistrationModule == null) {
                        systemMessagePlatformRegistrationModule = new SystemMessagePlatformRegistrationModule();
                        r1.A0X = systemMessagePlatformRegistrationModule;
                    }
                    SystemMessageRegistrationsModule systemMessageRegistrationsModule = r1.A0k;
                    if (systemMessageRegistrationsModule == null) {
                        systemMessageRegistrationsModule = new SystemMessageRegistrationsModule();
                        r1.A0k = systemMessageRegistrationsModule;
                    }
                    TimeModule timeModule = r1.A0C;
                    if (timeModule == null) {
                        timeModule = new TimeModule();
                        r1.A0C = timeModule;
                    }
                    TransactionLockModule transactionLockModule = r1.A0I;
                    if (transactionLockModule == null) {
                        transactionLockModule = new TransactionLockModule();
                        r1.A0I = transactionLockModule;
                    }
                    UnifiedAuthenticationModule unifiedAuthenticationModule = r1.A03;
                    if (unifiedAuthenticationModule == null) {
                        unifiedAuthenticationModule = new UnifiedAuthenticationModule();
                        r1.A03 = unifiedAuthenticationModule;
                    }
                    WaQuickPromotionFilterModule waQuickPromotionFilterModule = r1.A0q;
                    if (waQuickPromotionFilterModule == null) {
                        waQuickPromotionFilterModule = new WaQuickPromotionFilterModule();
                        r1.A0q = waQuickPromotionFilterModule;
                    }
                    WaWorkManagerModule waWorkManagerModule = r1.A0s;
                    if (waWorkManagerModule == null) {
                        waWorkManagerModule = new WaWorkManagerModule();
                        r1.A0s = waWorkManagerModule;
                    }
                    WebQueryModule webQueryModule = r1.A0r;
                    if (webQueryModule == null) {
                        webQueryModule = new WebQueryModule();
                        r1.A0r = webQueryModule;
                    }
                    WfacProductReleaseModule wfacProductReleaseModule = r1.A0p;
                    if (wfacProductReleaseModule == null) {
                        wfacProductReleaseModule = new WfacProductReleaseModule();
                        r1.A0p = wfacProductReleaseModule;
                    }
                    WfalProdInfraModule wfalProdInfraModule = r1.A0o;
                    if (wfalProdInfraModule == null) {
                        wfalProdInfraModule = new WfalProdInfraModule();
                        r1.A0o = wfalProdInfraModule;
                    }
                    WfsProductReleaseModule wfsProductReleaseModule = r1.A07;
                    if (wfsProductReleaseModule == null) {
                        wfsProductReleaseModule = new WfsProductReleaseModule();
                        r1.A07 = wfsProductReleaseModule;
                    }
                    XFamilyGQLModule xFamilyGQLModule = r1.A0t;
                    if (xFamilyGQLModule == null) {
                        xFamilyGQLModule = new XFamilyGQLModule();
                        r1.A0t = xFamilyGQLModule;
                    }
                    this.A02 = new C18800tq(accountSyncModule2, addOnBridgeModule2, commonModule2, unifiedAuthenticationModule, avatarModule2, businessProductModule2, dCEncryptedModule2, wfsProductReleaseModule, activityModule2, communityNotificationModule2, nativeFlowActionModule2, conversationUiModule2, timeModule, cronModule2, ctwaModule2, dailyEventModule2, quotedMessageStoreModule2, forceMigrationModule2, transactionLockModule, databaseMigrationModule2, companionModeModule2, jidMapperProviderModule2, migrationModule2, searchModule, previewSubsystemModule2, ephemeralProductModule2, eventChatInfoModule2, emojiImageViewLoaderModule2, fMessageRegistrationsModule2, fMessageFactoryModule2, fMessageForwardingSubsystemModule2, fMessagePlatformModule2, fMessagePlatformRegistrationModule2, systemMessagePlatformRegistrationModule, gifSearchModule2, indiaUpiModule2, integrityModule2, integritySignalsModule2, mediaDailyUsageModule2, otpNotificationModule2, p2mLiteModule2, indiaUpiInfraModule2, pinInChatSubsystemModule2, preloadsReleaseModule2, replySubsystemModule2, recentStickersModule2, systemMessageRegistrationsModule, systemMessageFactoryModule, commerceBloksModule2, extensionsProductModule2, wfalProdInfraModule, wfacProductReleaseModule, waQuickPromotionFilterModule, webQueryModule, waWorkManagerModule, xFamilyGQLModule, r02);
                }
            }
        }
        return this.A02;
    }

    public C18880ty(C18870tx r2) {
        this.A00 = r2;
    }
}
