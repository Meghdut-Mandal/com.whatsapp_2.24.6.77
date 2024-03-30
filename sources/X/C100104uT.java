package X;

/* renamed from: X.4uT  reason: invalid class name and case insensitive filesystem */
public final class C100104uT extends C170918Hz implements C22901AyD {
    public static final int ARCHIVED_FIELD_NUMBER = 16;
    public static final int COMMENTS_COUNT_FIELD_NUMBER = 45;
    public static final int CONTACT_PRIMARY_IDENTITY_KEY_FIELD_NUMBER = 23;
    public static final int CONVERSATION_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int CREATED_AT_FIELD_NUMBER = 31;
    public static final int CREATED_BY_FIELD_NUMBER = 32;
    public static final C100104uT DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 33;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 17;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 38;
    public static final int END_OF_HISTORY_TRANSFER_FIELD_NUMBER = 8;
    public static final int END_OF_HISTORY_TRANSFER_TYPE_FIELD_NUMBER = 11;
    public static final int EPHEMERAL_EXPIRATION_FIELD_NUMBER = 9;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_DEFAULT_SUBGROUP_FIELD_NUMBER = 36;
    public static final int IS_PARENT_GROUP_FIELD_NUMBER = 35;
    public static final int LAST_MSG_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int LID_JID_FIELD_NUMBER = 42;
    public static final int LID_ORIGIN_TYPE_FIELD_NUMBER = 44;
    public static final int LOCKED_FIELD_NUMBER = 46;
    public static final int MARKED_AS_UNREAD_FIELD_NUMBER = 19;
    public static final int MEDIA_VISIBILITY_FIELD_NUMBER = 27;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    public static final int MUTE_END_TIME_FIELD_NUMBER = 25;
    public static final int NAME_FIELD_NUMBER = 13;
    public static final int NEW_JID_FIELD_NUMBER = 3;
    public static final int NOT_SPAM_FIELD_NUMBER = 15;
    public static final int OLD_JID_FIELD_NUMBER = 4;
    public static final int PARENT_GROUP_ID_FIELD_NUMBER = 37;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 20;
    public static final int PINNED_FIELD_NUMBER = 24;
    public static final int PNH_DUPLICATE_LID_THREAD_FIELD_NUMBER = 41;
    public static final int PN_JID_FIELD_NUMBER = 39;
    public static final int P_HASH_FIELD_NUMBER = 14;
    public static final int READ_ONLY_FIELD_NUMBER = 7;
    public static final int SHARE_OWN_PN_FIELD_NUMBER = 40;
    public static final int SUPPORT_FIELD_NUMBER = 34;
    public static final int SUSPENDED_FIELD_NUMBER = 29;
    public static final int TC_TOKEN_FIELD_NUMBER = 21;
    public static final int TC_TOKEN_SENDER_TIMESTAMP_FIELD_NUMBER = 28;
    public static final int TC_TOKEN_TIMESTAMP_FIELD_NUMBER = 22;
    public static final int TERMINATED_FIELD_NUMBER = 30;
    public static final int UNREAD_COUNT_FIELD_NUMBER = 6;
    public static final int UNREAD_MENTION_COUNT_FIELD_NUMBER = 18;
    public static final int USERNAME_FIELD_NUMBER = 43;
    public static final int WALLPAPER_FIELD_NUMBER = 26;
    public boolean archived_;
    public int bitField0_;
    public int bitField1_;
    public int commentsCount_;
    public C21674AUx contactPrimaryIdentityKey_;
    public long conversationTimestamp_;
    public long createdAt_;
    public String createdBy_;
    public String description_;
    public AnonymousClass8SK disappearingMode_;
    public String displayName_;
    public int endOfHistoryTransferType_;
    public boolean endOfHistoryTransfer_;
    public int ephemeralExpiration_;
    public long ephemeralSettingTimestamp_;
    public String id_ = "";
    public boolean isDefaultSubgroup_;
    public boolean isParentGroup_;
    public long lastMsgTimestamp_;
    public String lidJid_;
    public String lidOriginType_;
    public boolean locked_;
    public boolean markedAsUnread_;
    public int mediaVisibility_;
    public byte memoizedIsInitialized = 2;
    public C23122B6c messages_;
    public long muteEndTime_;
    public String name_;
    public String newJid_;
    public boolean notSpam_;
    public String oldJid_;
    public String pHash_;
    public String parentGroupId_;
    public C23122B6c participant_;
    public int pinned_;
    public String pnJid_;
    public boolean pnhDuplicateLidThread_;
    public boolean readOnly_;
    public boolean shareOwnPn_;
    public boolean support_;
    public boolean suspended_;
    public long tcTokenSenderTimestamp_;
    public long tcTokenTimestamp_;
    public C21674AUx tcToken_;
    public boolean terminated_;
    public int unreadCount_;
    public int unreadMentionCount_;
    public String username_;
    public C99874u6 wallpaper_;

    static {
        C100104uT r1 = new C100104uT();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100104uT.class);
    }

    public C100104uT() {
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.messages_ = r0;
        this.newJid_ = "";
        this.oldJid_ = "";
        this.name_ = "";
        this.pHash_ = "";
        this.participant_ = r0;
        C21674AUx aUx = C21674AUx.A00;
        this.tcToken_ = aUx;
        this.contactPrimaryIdentityKey_ = aUx;
        this.createdBy_ = "";
        this.description_ = "";
        this.parentGroupId_ = "";
        this.displayName_ = "";
        this.pnJid_ = "";
        this.lidJid_ = "";
        this.username_ = "";
        this.lidOriginType_ = "";
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
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001.\u0000\u0002\u0001..\u0000\u0002\u0003\u0001ᔈ\u0000\u0002Л\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ဇ\u0005\bဇ\u0006\tဋ\u0007\nဂ\b\u000bဌ\t\fဃ\n\rဈ\u000b\u000eဈ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဉ\u000f\u0012ဋ\u0010\u0013ဇ\u0011\u0014Л\u0015ည\u0012\u0016ဃ\u0013\u0017ည\u0014\u0018ဋ\u0015\u0019ဃ\u0016\u001aဉ\u0017\u001bဌ\u0018\u001cဃ\u0019\u001dဇ\u001a\u001eဇ\u001b\u001fဃ\u001c ဈ\u001d!ဈ\u001e\"ဇ\u001f#ဇ $ဇ\"%ဈ!&ဈ#'ဈ$(ဇ%)ဇ&*ဈ'+ဈ(,ဈ)-ဋ*.ဇ+", new Object[]{"bitField0_", "bitField1_", "id_", "messages_", C172848Pk.class, "newJid_", "oldJid_", "lastMsgTimestamp_", "unreadCount_", "readOnly_", "endOfHistoryTransfer_", "ephemeralExpiration_", "ephemeralSettingTimestamp_", "endOfHistoryTransferType_", C141836nu.A00, "conversationTimestamp_", "name_", "pHash_", "notSpam_", "archived_", "disappearingMode_", "unreadMentionCount_", "markedAsUnread_", "participant_", C99914uA.class, "tcToken_", "tcTokenTimestamp_", "contactPrimaryIdentityKey_", "pinned_", "muteEndTime_", "wallpaper_", "mediaVisibility_", C141876ny.A00, "tcTokenSenderTimestamp_", "suspended_", "terminated_", "createdAt_", "createdBy_", "description_", "support_", "isParentGroup_", "isDefaultSubgroup_", "parentGroupId_", "displayName_", "pnJid_", "shareOwnPn_", "pnhDuplicateLidThread_", "lidJid_", "username_", "lidOriginType_", "commentsCount_", "locked_"});
            case 3:
                return new C100104uT();
            case 4:
                return new C99764tv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100104uT.class) {
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
