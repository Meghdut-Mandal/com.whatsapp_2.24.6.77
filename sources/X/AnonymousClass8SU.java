package X;

/* renamed from: X.8SU  reason: invalid class name */
public final class AnonymousClass8SU extends C170918Hz implements C22901AyD {
    public static final int AGENT_ID_FIELD_NUMBER = 47;
    public static final int BIZ_PRIVACY_STATUS_FIELD_NUMBER = 36;
    public static final int BOT_MESSAGE_INVOKER_JID_FIELD_NUMBER = 58;
    public static final int BROADCAST_FIELD_NUMBER = 18;
    public static final int CLEAR_MEDIA_FIELD_NUMBER = 25;
    public static final int COMMENT_METADATA_FIELD_NUMBER = 59;
    public static final AnonymousClass8SU DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 27;
    public static final int EPHEMERAL_DURATION_FIELD_NUMBER = 33;
    public static final int EPHEMERAL_OFF_TO_ON_FIELD_NUMBER = 34;
    public static final int EPHEMERAL_OUT_OF_SYNC_FIELD_NUMBER = 35;
    public static final int EPHEMERAL_START_TIMESTAMP_FIELD_NUMBER = 32;
    public static final int EVENT_ADDITIONAL_METADATA_FIELD_NUMBER = 64;
    public static final int EVENT_RESPONSES_FIELD_NUMBER = 61;
    public static final int FINAL_LIVE_LOCATION_FIELD_NUMBER = 30;
    public static final int FUTUREPROOF_DATA_FIELD_NUMBER = 43;
    public static final int IGNORE_FIELD_NUMBER = 16;
    public static final int IS_1P_BIZ_BOT_MESSAGE_FIELD_NUMBER = 56;
    public static final int IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER = 57;
    public static final int KEEP_IN_CHAT_FIELD_NUMBER = 50;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int LABELS_FIELD_NUMBER = 28;
    public static final int MEDIA_CIPHERTEXT_SHA256_FIELD_NUMBER = 20;
    public static final int MEDIA_DATA_FIELD_NUMBER = 38;
    public static final int MESSAGE_C2S_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static final int MESSAGE_SECRET_FIELD_NUMBER = 49;
    public static final int MESSAGE_STUB_PARAMETERS_FIELD_NUMBER = 26;
    public static final int MESSAGE_STUB_TYPE_FIELD_NUMBER = 24;
    public static final int MESSAGE_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int MULTICAST_FIELD_NUMBER = 21;
    public static final int NEWSLETTER_SERVER_ID_FIELD_NUMBER = 63;
    public static final int ORIGINAL_SELF_AUTHOR_USER_JID_STRING_FIELD_NUMBER = 51;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 5;
    public static final int PAYMENT_INFO_FIELD_NUMBER = 29;
    public static final int PAYMENT_TRANSACTION_INFO_FIELD_NUMBER = 53;
    public static final int PHOTO_CHANGE_FIELD_NUMBER = 39;
    public static final int PIN_IN_CHAT_FIELD_NUMBER = 54;
    public static final int POLL_ADDITIONAL_METADATA_FIELD_NUMBER = 46;
    public static final int POLL_UPDATES_FIELD_NUMBER = 45;
    public static final int PREMIUM_MESSAGE_INFO_FIELD_NUMBER = 55;
    public static final int PUSH_NAME_FIELD_NUMBER = 19;
    public static final int QUOTED_PAYMENT_INFO_FIELD_NUMBER = 31;
    public static final int QUOTED_STICKER_DATA_FIELD_NUMBER = 42;
    public static final int REACTIONS_FIELD_NUMBER = 41;
    public static final int REPORTING_TOKEN_INFO_FIELD_NUMBER = 62;
    public static final int REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER = 52;
    public static final int STARRED_FIELD_NUMBER = 17;
    public static final int STATUS_ALREADY_VIEWED_FIELD_NUMBER = 48;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int STATUS_PSA_FIELD_NUMBER = 44;
    public static final int URL_NUMBER_FIELD_NUMBER = 23;
    public static final int URL_TEXT_FIELD_NUMBER = 22;
    public static final int USER_RECEIPT_FIELD_NUMBER = 40;
    public static final int VERIFIED_BIZ_NAME_FIELD_NUMBER = 37;
    public String agentId_;
    public int bitField0_;
    public int bitField1_;
    public int bizPrivacyStatus_;
    public String botMessageInvokerJid_;
    public boolean broadcast_;
    public boolean clearMedia_;
    public AnonymousClass8PX commentMetadata_;
    public int duration_;
    public int ephemeralDuration_;
    public boolean ephemeralOffToOn_;
    public boolean ephemeralOutOfSync_;
    public long ephemeralStartTimestamp_;
    public AnonymousClass8OV eventAdditionalMetadata_;
    public C23122B6c eventResponses_;
    public C173448Rs finalLiveLocation_;
    public C21674AUx futureproofData_;
    public boolean ignore_;
    public boolean is1PBizBotMessage_;
    public boolean isGroupHistoryMessage_;
    public AnonymousClass8RT keepInChat_;
    public AnonymousClass8SW key_;
    public C23122B6c labels_;
    public C21674AUx mediaCiphertextSha256_;
    public AnonymousClass8OW mediaData_;
    public byte memoizedIsInitialized = 2;
    public long messageC2STimestamp_;
    public C21674AUx messageSecret_;
    public C23122B6c messageStubParameters_;
    public int messageStubType_;
    public long messageTimestamp_;
    public AnonymousClass8SX message_;
    public boolean multicast_;
    public long newsletterServerId_;
    public String originalSelfAuthorUserJidString_;
    public String participant_ = "";
    public AnonymousClass8S1 paymentInfo_;
    public AnonymousClass8S3 paymentTransactionInfo_;
    public AnonymousClass8QP photoChange_;
    public AnonymousClass8RM pinInChat_;
    public AnonymousClass8OY pollAdditionalMetadata_;
    public C23122B6c pollUpdates_;
    public AnonymousClass8OZ premiumMessageInfo_;
    public String pushName_ = "";
    public AnonymousClass8S1 quotedPaymentInfo_;
    public AnonymousClass8OW quotedStickerData_;
    public C23122B6c reactions_;
    public C172488Oa reportingTokenInfo_;
    public long revokeMessageTimestamp_;
    public boolean starred_;
    public boolean statusAlreadyViewed_;
    public C172878Pn statusPsa_;
    public int status_ = 1;
    public boolean urlNumber_;
    public boolean urlText_;
    public C23122B6c userReceipt_;
    public String verifiedBizName_;

    static {
        AnonymousClass8SU r1 = new AnonymousClass8SU();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SU.class);
    }

    public AnonymousClass91I A0u() {
        AnonymousClass91I A00 = AnonymousClass91I.A00(this.messageStubType_);
        if (A00 == null) {
            return AnonymousClass91I.A31;
        }
        return A00;
    }

    public String A0v(int i) {
        return C36401kF.A0s(this.messageStubParameters_, i);
    }

    public AnonymousClass8SU() {
        C21674AUx aUx = C21674AUx.A00;
        this.mediaCiphertextSha256_ = aUx;
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.messageStubParameters_ = r0;
        this.labels_ = r0;
        this.verifiedBizName_ = "";
        this.userReceipt_ = r0;
        this.reactions_ = r0;
        this.futureproofData_ = aUx;
        this.pollUpdates_ = r0;
        this.agentId_ = "";
        this.messageSecret_ = aUx;
        this.originalSelfAuthorUserJidString_ = "";
        this.botMessageInvokerJid_ = "";
        this.eventResponses_ = r0;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u00016\u0000\u0002\u0001@6\u0000\u0006\u0004\u0001ᔉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဃ\u0005\u0010ဇ\u0006\u0011ဇ\u0007\u0012ဇ\b\u0013ဈ\t\u0014ည\n\u0015ဇ\u000b\u0016ဇ\f\u0017ဇ\r\u0018ဌ\u000e\u0019ဇ\u000f\u001a\u001a\u001bဋ\u0010\u001c\u001a\u001dဉ\u0011\u001eဉ\u0012\u001fဉ\u0013 ဃ\u0014!ဋ\u0015\"ဇ\u0016#ဇ\u0017$ဌ\u0018%ဈ\u0019&ဉ\u001a'ဉ\u001b(Л)\u001b*ဉ\u001c+ည\u001d,ᐉ\u001e-\u001b.ဉ\u001f/ဈ 0ဇ!1ည\"2ဉ#3ဈ$4ဃ%5ᐉ&6ဉ'7ဉ(8ဇ)9ဇ*:ဈ+;ဉ,=\u001b>ဉ-?ဃ.@ဉ/", new Object[]{"bitField0_", "bitField1_", "key_", "message_", "messageTimestamp_", "status_", C21065A7c.A00, "participant_", "messageC2STimestamp_", "ignore_", "starred_", "broadcast_", "pushName_", "mediaCiphertextSha256_", "multicast_", "urlText_", "urlNumber_", "messageStubType_", C21066A7d.A00, "clearMedia_", "messageStubParameters_", "duration_", "labels_", "paymentInfo_", "finalLiveLocation_", "quotedPaymentInfo_", "ephemeralStartTimestamp_", "ephemeralDuration_", "ephemeralOffToOn_", "ephemeralOutOfSync_", "bizPrivacyStatus_", C21064A7b.A00, "verifiedBizName_", "mediaData_", "photoChange_", "userReceipt_", C100034uM.class, "reactions_", AnonymousClass8RO.class, "quotedStickerData_", "futureproofData_", "statusPsa_", "pollUpdates_", AnonymousClass8RN.class, "pollAdditionalMetadata_", "agentId_", "statusAlreadyViewed_", "messageSecret_", "keepInChat_", "originalSelfAuthorUserJidString_", "revokeMessageTimestamp_", "paymentTransactionInfo_", "pinInChat_", "premiumMessageInfo_", "is1PBizBotMessage_", "isGroupHistoryMessage_", "botMessageInvokerJid_", "commentMetadata_", "eventResponses_", C173168Qq.class, "reportingTokenInfo_", "newsletterServerId_", "eventAdditionalMetadata_"});
            case 3:
                return new AnonymousClass8SU();
            case 4:
                return new AnonymousClass8NK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SU.class) {
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
