package X;

/* renamed from: X.91G  reason: invalid class name */
public enum AnonymousClass91G implements C22899AyB {
    REVOKE(0),
    EPHEMERAL_SETTING(3),
    EPHEMERAL_SYNC_RESPONSE(4),
    HISTORY_SYNC_NOTIFICATION(5),
    APP_STATE_SYNC_KEY_SHARE(6),
    APP_STATE_SYNC_KEY_REQUEST(7),
    MSG_FANOUT_BACKFILL_REQUEST(8),
    INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC(9),
    APP_STATE_FATAL_EXCEPTION_NOTIFICATION(10),
    SHARE_PHONE_NUMBER(11),
    MESSAGE_EDIT(14),
    PEER_DATA_OPERATION_REQUEST_MESSAGE(16),
    PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE(17),
    REQUEST_WELCOME_MESSAGE(18),
    BOT_FEEDBACK_MESSAGE(19),
    MEDIA_NOTIFY_MESSAGE(20);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass91G(int i) {
        this.value = i;
    }

    public static AnonymousClass91G A00(int i) {
        switch (i) {
            case 0:
                return REVOKE;
            case 3:
                return EPHEMERAL_SETTING;
            case 4:
                return EPHEMERAL_SYNC_RESPONSE;
            case 5:
                return HISTORY_SYNC_NOTIFICATION;
            case 6:
                return APP_STATE_SYNC_KEY_SHARE;
            case 7:
                return APP_STATE_SYNC_KEY_REQUEST;
            case 8:
                return MSG_FANOUT_BACKFILL_REQUEST;
            case 9:
                return INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC;
            case 10:
                return APP_STATE_FATAL_EXCEPTION_NOTIFICATION;
            case 11:
                return SHARE_PHONE_NUMBER;
            case 14:
                return MESSAGE_EDIT;
            case 16:
                return PEER_DATA_OPERATION_REQUEST_MESSAGE;
            case 17:
                return PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE;
            case 18:
                return REQUEST_WELCOME_MESSAGE;
            case 19:
                return BOT_FEEDBACK_MESSAGE;
            case 20:
                return MEDIA_NOTIFY_MESSAGE;
            default:
                return null;
        }
    }

    public final int BEY() {
        return this.value;
    }
}
