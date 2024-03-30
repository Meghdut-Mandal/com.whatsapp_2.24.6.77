package X;

/* renamed from: X.8RF  reason: invalid class name */
public final class AnonymousClass8RF extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8RF DEFAULT_INSTANCE;
    public static final int HISTORY_SYNC_ON_DEMAND_REQUEST_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PLACEHOLDER_MESSAGE_RESEND_REQUEST_FIELD_NUMBER = 5;
    public static final int REQUEST_STICKER_REUPLOAD_FIELD_NUMBER = 2;
    public static final int REQUEST_URL_PREVIEW_FIELD_NUMBER = 3;
    public int bitField0_;
    public AnonymousClass8RE historySyncOnDemandRequest_;
    public int peerDataOperationRequestType_;
    public C23122B6c placeholderMessageResendRequest_;
    public C23122B6c requestStickerReupload_;
    public C23122B6c requestUrlPreview_;

    static {
        AnonymousClass8RF r1 = new AnonymousClass8RF();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RF.class);
    }

    public AnonymousClass8RF() {
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.requestStickerReupload_ = r0;
        this.requestUrlPreview_ = r0;
        this.placeholderMessageResendRequest_ = r0;
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
                A1Z[1] = "peerDataOperationRequestType_";
                A1Z[2] = A73.A00;
                A1Z[3] = "requestStickerReupload_";
                A1Z[4] = C172408Ns.class;
                A1Z[5] = "requestUrlPreview_";
                A1Z[6] = AnonymousClass8PB.class;
                A1Z[7] = "historySyncOnDemandRequest_";
                A1Z[8] = "placeholderMessageResendRequest_";
                A1Z[9] = C172398Nr.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0001\u0005\u001b", A1Z);
            case 3:
                return new AnonymousClass8RF();
            case 4:
                return new AnonymousClass8KC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RF.class) {
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
