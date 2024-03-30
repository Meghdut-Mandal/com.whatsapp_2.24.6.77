package X;

/* renamed from: X.91A  reason: invalid class name */
public enum AnonymousClass91A implements C22899AyB {
    UPLOAD_STICKER(0),
    SEND_RECENT_STICKER_BOOTSTRAP(1),
    GENERATE_LINK_PREVIEW(2),
    HISTORY_SYNC_ON_DEMAND(3),
    PLACEHOLDER_MESSAGE_RESEND(4);
    
    public final int value;

    public static AnonymousClass91A A00(int i) {
        if (i == 0) {
            return UPLOAD_STICKER;
        }
        if (i == 1) {
            return SEND_RECENT_STICKER_BOOTSTRAP;
        }
        if (i == 2) {
            return GENERATE_LINK_PREVIEW;
        }
        if (i == 3) {
            return HISTORY_SYNC_ON_DEMAND;
        }
        if (i != 4) {
            return null;
        }
        return PLACEHOLDER_MESSAGE_RESEND;
    }

    /* access modifiers changed from: public */
    AnonymousClass91A(int i) {
        this.value = i;
    }

    public final int BEY() {
        return this.value;
    }
}
