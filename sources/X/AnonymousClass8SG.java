package X;

/* renamed from: X.8SG  reason: invalid class name */
public final class AnonymousClass8SG extends C170918Hz implements C22901AyD {
    public static final int ACTION_LINK_FIELD_NUMBER = 33;
    public static final int ALWAYS_SHOW_AD_ATTRIBUTION_FIELD_NUMBER = 48;
    public static final int BUSINESS_MESSAGE_FORWARD_INFO_FIELD_NUMBER = 44;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 19;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 20;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 18;
    public static final int DATA_SHARING_CONTEXT_FIELD_NUMBER = 47;
    public static final AnonymousClass8SG DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 32;
    public static final int ENTRY_POINT_CONVERSION_APP_FIELD_NUMBER = 30;
    public static final int ENTRY_POINT_CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 31;
    public static final int ENTRY_POINT_CONVERSION_SOURCE_FIELD_NUMBER = 29;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 26;
    public static final int EPHEMERAL_SHARED_SECRET_FIELD_NUMBER = 27;
    public static final int EXPIRATION_FIELD_NUMBER = 25;
    public static final int EXTERNAL_AD_REPLY_FIELD_NUMBER = 28;
    public static final int FORWARDED_NEWSLETTER_MESSAGE_INFO_FIELD_NUMBER = 43;
    public static final int FORWARDING_SCORE_FIELD_NUMBER = 21;
    public static final int GROUP_MENTIONS_FIELD_NUMBER = 40;
    public static final int GROUP_SUBJECT_FIELD_NUMBER = 34;
    public static final int IS_FORWARDED_FIELD_NUMBER = 22;
    public static final int IS_SAMPLED_FIELD_NUMBER = 39;
    public static final int MENTIONED_JID_FIELD_NUMBER = 15;
    public static final int PARENT_GROUP_JID_FIELD_NUMBER = 35;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int PLACEHOLDER_KEY_FIELD_NUMBER = 24;
    public static final int QUOTED_AD_FIELD_NUMBER = 23;
    public static final int QUOTED_MESSAGE_FIELD_NUMBER = 3;
    public static final int REMOTE_JID_FIELD_NUMBER = 4;
    public static final int SMB_CLIENT_CAMPAIGN_ID_FIELD_NUMBER = 45;
    public static final int STANZA_ID_FIELD_NUMBER = 1;
    public static final int TRUST_BANNER_ACTION_FIELD_NUMBER = 38;
    public static final int TRUST_BANNER_TYPE_FIELD_NUMBER = 37;
    public C172648Oq actionLink_;
    public boolean alwaysShowAdAttribution_;
    public int bitField0_;
    public C172268Ne businessMessageForwardInfo_;
    public C21674AUx conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_;
    public C172278Nf dataSharingContext_;
    public AnonymousClass8SK disappearingMode_;
    public String entryPointConversionApp_;
    public int entryPointConversionDelaySeconds_;
    public String entryPointConversionSource_;
    public long ephemeralSettingTimestamp_;
    public C21674AUx ephemeralSharedSecret_;
    public int expiration_;
    public AnonymousClass8S4 externalAdReply_;
    public AnonymousClass8RA forwardedNewsletterMessageInfo_;
    public int forwardingScore_;
    public C23122B6c groupMentions_;
    public String groupSubject_;
    public boolean isForwarded_;
    public boolean isSampled_;
    public C23122B6c mentionedJid_;
    public String parentGroupJid_;
    public String participant_ = "";
    public AnonymousClass8SW placeholderKey_;
    public C173038Qd quotedAd_;
    public AnonymousClass8SX quotedMessage_;
    public String remoteJid_ = "";
    public String smbClientCampaignId_;
    public String stanzaId_ = "";
    public int trustBannerAction_;
    public String trustBannerType_;

    static {
        AnonymousClass8SG r1 = new AnonymousClass8SG();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SG.class);
    }

    public AnonymousClass8SG() {
        AnonymousClass8I2 r1 = AnonymousClass8I2.A02;
        this.mentionedJid_ = r1;
        this.conversionSource_ = "";
        C21674AUx aUx = C21674AUx.A00;
        this.conversionData_ = aUx;
        this.ephemeralSharedSecret_ = aUx;
        this.entryPointConversionSource_ = "";
        this.entryPointConversionApp_ = "";
        this.groupSubject_ = "";
        this.parentGroupJid_ = "";
        this.trustBannerType_ = "";
        this.groupMentions_ = r1;
        this.smbClientCampaignId_ = "";
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(34);
                A1Z[1] = "stanzaId_";
                A1Z[2] = "participant_";
                A1Z[3] = "quotedMessage_";
                A1Z[4] = "remoteJid_";
                A1Z[5] = "mentionedJid_";
                A1Z[6] = "conversionSource_";
                A1Z[7] = "conversionData_";
                A1Z[8] = "conversionDelaySeconds_";
                A1Z[9] = "forwardingScore_";
                A1Z[10] = "isForwarded_";
                A1Z[11] = "quotedAd_";
                A1Z[12] = "placeholderKey_";
                A1Z[13] = "expiration_";
                A1Z[14] = "ephemeralSettingTimestamp_";
                A1Z[15] = "ephemeralSharedSecret_";
                A1Z[16] = "externalAdReply_";
                A1Z[17] = "entryPointConversionSource_";
                A1Z[18] = "entryPointConversionApp_";
                A1Z[19] = "entryPointConversionDelaySeconds_";
                A1Z[20] = "disappearingMode_";
                A1Z[21] = "actionLink_";
                A1Z[22] = "groupSubject_";
                A1Z[23] = "parentGroupJid_";
                A1Z[24] = "trustBannerType_";
                A1Z[25] = "trustBannerAction_";
                A1Z[26] = "isSampled_";
                A1Z[27] = "groupMentions_";
                A1Z[28] = C172668Os.class;
                A1Z[29] = "forwardedNewsletterMessageInfo_";
                A1Z[30] = "businessMessageForwardInfo_";
                A1Z[31] = "smbClientCampaignId_";
                A1Z[32] = "dataSharingContext_";
                A1Z[33] = "alwaysShowAdAttribution_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u00010 \u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u000f\u001a\u0012ဈ\u0004\u0013ည\u0005\u0014ဋ\u0006\u0015ဋ\u0007\u0016ဇ\b\u0017ဉ\t\u0018ဉ\n\u0019ဋ\u000b\u001aဂ\f\u001bည\r\u001cဉ\u000e\u001dဈ\u000f\u001eဈ\u0010\u001fဋ\u0011 ဉ\u0012!ဉ\u0013\"ဈ\u0014#ဈ\u0015%ဈ\u0016&ဋ\u0017'ဇ\u0018(\u001b+ဉ\u0019,ဉ\u001a-ဈ\u001b/ဉ\u001c0ဇ\u001d", A1Z);
            case 3:
                return new AnonymousClass8SG();
            case 4:
                return new C99524tX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SG.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        C201979ko r03 = C21072A7j.A01;
                        r0 = C90524aI.A0G(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw AnonymousClass001.A0D();
        }
    }
}
