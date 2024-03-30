package X;

/* renamed from: X.8Rx  reason: invalid class name and case insensitive filesystem */
public final class C173498Rx extends C170918Hz implements C22901AyD {
    public static final int CHUNK_ORDER_FIELD_NUMBER = 7;
    public static final C173498Rx DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_LENGTH_FIELD_NUMBER = 2;
    public static final int FILE_SHA256_FIELD_NUMBER = 1;
    public static final int INITIAL_HIST_BOOTSTRAP_INLINE_PAYLOAD_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_IN_CHUNK_TIMESTAMP_SEC_FIELD_NUMBER = 10;
    public static final int ORIGINAL_MESSAGE_ID_FIELD_NUMBER = 8;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PEER_DATA_REQUEST_SESSION_ID_FIELD_NUMBER = 12;
    public static final int PROGRESS_FIELD_NUMBER = 9;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public int bitField0_;
    public int chunkOrder_;
    public String directPath_ = "";
    public C21674AUx fileEncSha256_;
    public long fileLength_;
    public C21674AUx fileSha256_;
    public C21674AUx initialHistBootstrapInlinePayload_;
    public C21674AUx mediaKey_;
    public long oldestMsgInChunkTimestampSec_;
    public String originalMessageId_ = "";
    public String peerDataRequestSessionId_;
    public int progress_;
    public int syncType_;

    static {
        C173498Rx r1 = new C173498Rx();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173498Rx.class);
    }

    public C173498Rx() {
        C21674AUx aUx = C21674AUx.A00;
        this.fileSha256_ = aUx;
        this.mediaKey_ = aUx;
        this.fileEncSha256_ = aUx;
        this.initialHistBootstrapInlinePayload_ = aUx;
        this.peerDataRequestSessionId_ = "";
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(14);
                A1Z[1] = "fileSha256_";
                A1Z[2] = "fileLength_";
                A1Z[3] = "mediaKey_";
                A1Z[4] = "fileEncSha256_";
                A1Z[5] = "directPath_";
                A1Z[6] = "syncType_";
                A1Z[7] = C141816ns.A00;
                A1Z[8] = "chunkOrder_";
                A1Z[9] = "originalMessageId_";
                A1Z[10] = "progress_";
                A1Z[11] = "oldestMsgInChunkTimestampSec_";
                A1Z[12] = "initialHistBootstrapInlinePayload_";
                A1Z[13] = "peerDataRequestSessionId_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဋ\u0006\bဈ\u0007\tဋ\b\nဂ\t\u000bည\n\fဈ\u000b", A1Z);
            case 3:
                return new C173498Rx();
            case 4:
                return new C171288Jk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173498Rx.class) {
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
