package X;

/* renamed from: X.8Rq  reason: invalid class name and case insensitive filesystem */
public final class C173428Rq extends C170918Hz implements C22901AyD {
    public static final C173428Rq DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER = 5;
    public static final int RECIPIENT_KEY_HASH_FIELD_NUMBER = 8;
    public static final int RECIPIENT_KEY_INDEXES_FIELD_NUMBER = 10;
    public static final int RECIPIENT_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int SENDER_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int SENDER_KEY_HASH_FIELD_NUMBER = 1;
    public static final int SENDER_KEY_INDEXES_FIELD_NUMBER = 3;
    public static final int SENDER_TIMESTAMP_FIELD_NUMBER = 2;
    public int bitField0_;
    public int receiverAccountType_;
    public C21674AUx recipientKeyHash_;
    public int recipientKeyIndexesMemoizedSerializedSize = -1;
    public B62 recipientKeyIndexes_;
    public long recipientTimestamp_;
    public int senderAccountType_;
    public C21674AUx senderKeyHash_;
    public int senderKeyIndexesMemoizedSerializedSize = -1;
    public B62 senderKeyIndexes_;
    public long senderTimestamp_;

    static {
        C173428Rq r1 = new C173428Rq();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173428Rq.class);
    }

    public C173428Rq() {
        C21674AUx aUx = C21674AUx.A00;
        this.senderKeyHash_ = aUx;
        AnonymousClass8I0 r0 = AnonymousClass8I0.A02;
        this.senderKeyIndexes_ = r0;
        this.recipientKeyHash_ = aUx;
        this.recipientKeyIndexes_ = r0;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(11);
                A1Z[1] = "senderKeyHash_";
                A1Z[2] = "senderTimestamp_";
                A1Z[3] = "senderKeyIndexes_";
                A1Z[4] = "senderAccountType_";
                C22900AyC ayC = A6W.A00;
                A1Z[5] = ayC;
                A1Z[6] = "receiverAccountType_";
                A1Z[7] = ayC;
                A1Z[8] = "recipientKeyHash_";
                A1Z[9] = "recipientTimestamp_";
                A1Z[10] = "recipientKeyIndexes_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003+\u0004ဌ\u0002\u0005ဌ\u0003\bည\u0004\tဃ\u0005\n+", A1Z);
            case 3:
                return new C173428Rq();
            case 4:
                return new AnonymousClass8J3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173428Rq.class) {
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
