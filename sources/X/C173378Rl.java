package X;

/* renamed from: X.8Rl  reason: invalid class name and case insensitive filesystem */
public final class C173378Rl extends C170918Hz implements C22901AyD {
    public static final C173378Rl DEFAULT_INSTANCE;
    public static final int FULL_SYNC_DAYS_LIMIT_FIELD_NUMBER = 1;
    public static final int FULL_SYNC_SIZE_MB_LIMIT_FIELD_NUMBER = 2;
    public static final int INLINE_INITIAL_PAYLOAD_IN_E2EE_MSG_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RECENT_SYNC_DAYS_LIMIT_FIELD_NUMBER = 5;
    public static final int STORAGE_QUOTA_MB_FIELD_NUMBER = 3;
    public static final int SUPPORT_BOT_USER_AGENT_CHAT_HISTORY_FIELD_NUMBER = 7;
    public static final int SUPPORT_CAG_REACTIONS_AND_POLLS_FIELD_NUMBER = 8;
    public static final int SUPPORT_CALL_LOG_HISTORY_FIELD_NUMBER = 6;
    public static final int SUPPORT_RECENT_SYNC_CHUNK_MESSAGE_COUNT_TUNING_FIELD_NUMBER = 10;
    public int bitField0_;
    public int fullSyncDaysLimit_;
    public int fullSyncSizeMbLimit_;
    public boolean inlineInitialPayloadInE2EeMsg_;
    public int recentSyncDaysLimit_;
    public int storageQuotaMb_;
    public boolean supportBotUserAgentChatHistory_;
    public boolean supportCagReactionsAndPolls_;
    public boolean supportCallLogHistory_;
    public boolean supportRecentSyncChunkMessageCountTuning_;

    static {
        C173378Rl r1 = new C173378Rl();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173378Rl.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(10);
                A1Z[1] = "fullSyncDaysLimit_";
                A1Z[2] = "fullSyncSizeMbLimit_";
                A1Z[3] = "storageQuotaMb_";
                A1Z[4] = "inlineInitialPayloadInE2EeMsg_";
                A1Z[5] = "recentSyncDaysLimit_";
                A1Z[6] = "supportCallLogHistory_";
                A1Z[7] = "supportBotUserAgentChatHistory_";
                A1Z[8] = "supportCagReactionsAndPolls_";
                A1Z[9] = "supportRecentSyncChunkMessageCountTuning_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\nဇ\b", A1Z);
            case 3:
                return new C173378Rl();
            case 4:
                return new C171118It();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173378Rl.class) {
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
