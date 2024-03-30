package X;

/* renamed from: X.8SQ  reason: invalid class name */
public final class AnonymousClass8SQ extends C170918Hz implements C22901AyD {
    public static final int APP_STATE_FATAL_EXCEPTION_NOTIFICATION_FIELD_NUMBER = 10;
    public static final int APP_STATE_SYNC_KEY_REQUEST_FIELD_NUMBER = 8;
    public static final int APP_STATE_SYNC_KEY_SHARE_FIELD_NUMBER = 7;
    public static final int BOT_FEEDBACK_MESSAGE_FIELD_NUMBER = 18;
    public static final AnonymousClass8SQ DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 11;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 14;
    public static final int EPHEMERAL_EXPIRATION_FIELD_NUMBER = 4;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int HISTORY_SYNC_NOTIFICATION_FIELD_NUMBER = 6;
    public static final int INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC_FIELD_NUMBER = 9;
    public static final int INVOKER_JID_FIELD_NUMBER = 19;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int MEDIA_NOTIFY_MESSAGE_FIELD_NUMBER = 21;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_MESSAGE_FIELD_NUMBER = 16;
    public static final int PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 2;
    public C172698Ov appStateFatalExceptionNotification_;
    public AnonymousClass8NV appStateSyncKeyRequest_;
    public AnonymousClass8NW appStateSyncKeyShare_;
    public int bitField0_;
    public AnonymousClass8RB botFeedbackMessage_;
    public AnonymousClass8SK disappearingMode_;
    public AnonymousClass8SX editedMessage_;
    public int ephemeralExpiration_;
    public long ephemeralSettingTimestamp_;
    public C173498Rx historySyncNotification_;
    public C172348Nm initialSecurityNotificationSettingSync_;
    public String invokerJid_ = "";
    public AnonymousClass8SW key_;
    public C172918Pr mediaNotifyMessage_;
    public AnonymousClass8RF peerDataOperationRequestMessage_;
    public AnonymousClass8Q7 peerDataOperationRequestResponseMessage_;
    public long timestampMs_;
    public int type_;

    static {
        AnonymousClass8SQ r1 = new AnonymousClass8SQ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SQ.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(19);
                A1Z[1] = "key_";
                A1Z[2] = "type_";
                A1Z[3] = A76.A00;
                A1Z[4] = "ephemeralExpiration_";
                A1Z[5] = "ephemeralSettingTimestamp_";
                A1Z[6] = "historySyncNotification_";
                A1Z[7] = "appStateSyncKeyShare_";
                A1Z[8] = "appStateSyncKeyRequest_";
                A1Z[9] = "initialSecurityNotificationSettingSync_";
                A1Z[10] = "appStateFatalExceptionNotification_";
                A1Z[11] = "disappearingMode_";
                A1Z[12] = "editedMessage_";
                A1Z[13] = "timestampMs_";
                A1Z[14] = "peerDataOperationRequestMessage_";
                A1Z[15] = "peerDataOperationRequestResponseMessage_";
                A1Z[16] = "botFeedbackMessage_";
                A1Z[17] = "invokerJid_";
                A1Z[18] = "mediaNotifyMessage_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဋ\u0002\u0005ဂ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\u000eဉ\n\u000fဂ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဈ\u000f\u0015ဉ\u0010", A1Z);
            case 3:
                return new AnonymousClass8SQ();
            case 4:
                return new AnonymousClass8NE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SQ.class) {
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
