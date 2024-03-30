package X;

/* renamed from: X.8Q7  reason: invalid class name */
public final class AnonymousClass8Q7 extends C170918Hz implements C22901AyD {
    public static final AnonymousClass8Q7 DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int PEER_DATA_OPERATION_RESULT_FIELD_NUMBER = 3;
    public static final int STANZA_ID_FIELD_NUMBER = 2;
    public int bitField0_;
    public int peerDataOperationRequestType_;
    public C23122B6c peerDataOperationResult_ = AnonymousClass8I2.A02;
    public String stanzaId_ = "";

    static {
        AnonymousClass8Q7 r1 = new AnonymousClass8Q7();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8Q7.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0g = C170918Hz.A0g();
                A0g[1] = "peerDataOperationRequestType_";
                A0g[2] = A73.A00;
                A0g[3] = "stanzaId_";
                A0g[4] = "peerDataOperationResult_";
                A0g[5] = C173088Qi.class;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", A0g);
            case 3:
                return new AnonymousClass8Q7();
            case 4:
                return new C172148Ms();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8Q7.class) {
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
