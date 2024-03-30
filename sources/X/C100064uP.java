package X;

/* renamed from: X.4uP  reason: invalid class name and case insensitive filesystem */
public final class C100064uP extends C170918Hz implements C22901AyD {
    public static final int AI_WAIT_LIST_STATE_FIELD_NUMBER = 14;
    public static final int CALL_LOG_RECORDS_FIELD_NUMBER = 13;
    public static final int CHUNK_ORDER_FIELD_NUMBER = 5;
    public static final int CONVERSATIONS_FIELD_NUMBER = 2;
    public static final C100064uP DEFAULT_INSTANCE;
    public static final int GLOBAL_SETTINGS_FIELD_NUMBER = 8;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PAST_PARTICIPANTS_FIELD_NUMBER = 12;
    public static final int PHONE_NUMBER_TO_LID_MAPPINGS_FIELD_NUMBER = 15;
    public static final int PROGRESS_FIELD_NUMBER = 6;
    public static final int PUSHNAMES_FIELD_NUMBER = 7;
    public static final int RECENT_STICKERS_FIELD_NUMBER = 11;
    public static final int STATUS_V3_MESSAGES_FIELD_NUMBER = 3;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int THREAD_DS_TIMEFRAME_OFFSET_FIELD_NUMBER = 10;
    public static final int THREAD_ID_USER_SECRET_FIELD_NUMBER = 9;
    public int aiWaitListState_;
    public int bitField0_;
    public C23122B6c callLogRecords_;
    public int chunkOrder_;
    public C23122B6c conversations_;
    public C100084uR globalSettings_;
    public byte memoizedIsInitialized = 2;
    public C23122B6c pastParticipants_;
    public C23122B6c phoneNumberToLidMappings_;
    public int progress_;
    public C23122B6c pushnames_;
    public C23122B6c recentStickers_;
    public C23122B6c statusV3Messages_;
    public int syncType_;
    public int threadDsTimeframeOffset_;
    public C21674AUx threadIdUserSecret_;

    static {
        C100064uP r1 = new C100064uP();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C100064uP.class);
    }

    public C100064uP() {
        AnonymousClass8I2 r1 = AnonymousClass8I2.A02;
        this.conversations_ = r1;
        this.statusV3Messages_ = r1;
        this.pushnames_ = r1;
        this.threadIdUserSecret_ = C21674AUx.A00;
        this.recentStickers_ = r1;
        this.pastParticipants_ = r1;
        this.callLogRecords_ = r1;
        this.phoneNumberToLidMappings_ = r1;
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
                return C170918Hz.A0C(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0007\u0003\u0001ᔌ\u0000\u0002Л\u0003Л\u0005ဋ\u0001\u0006ဋ\u0002\u0007\u001b\bဉ\u0003\tည\u0004\nဋ\u0005\u000b\u001b\f\u001b\r\u001b\u000eဌ\u0006\u000f\u001b", new Object[]{"bitField0_", "syncType_", C141866nx.A00, "conversations_", C100104uT.class, "statusV3Messages_", AnonymousClass8SU.class, "chunkOrder_", "progress_", "pushnames_", C99864u5.class, "globalSettings_", "threadIdUserSecret_", "threadDsTimeframeOffset_", "recentStickers_", C173468Ru.class, "pastParticipants_", AnonymousClass8PI.class, "callLogRecords_", C100074uQ.class, "aiWaitListState_", C141856nw.A00, "phoneNumberToLidMappings_", C99854u4.class});
            case 3:
                return new C100064uP();
            case 4:
                return new C99784tx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C100064uP.class) {
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
