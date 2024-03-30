package X;

/* renamed from: X.8RD  reason: invalid class name */
public final class AnonymousClass8RD extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 4;
    public static final AnonymousClass8RD DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int LIST_TYPE_FIELD_NUMBER = 2;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SINGLE_SELECT_REPLY_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public String description_ = "";
    public int listType_;
    public C172388Nq singleSelectReply_;
    public String title_ = "";

    static {
        AnonymousClass8RD r1 = new AnonymousClass8RD();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8RD.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(7);
                A1Z[1] = "title_";
                A1Z[2] = "listType_";
                A1Z[3] = C21062A6z.A00;
                A1Z[4] = "singleSelectReply_";
                A1Z[5] = "contextInfo_";
                A1Z[6] = "description_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new AnonymousClass8RD();
            case 4:
                return new AnonymousClass8K4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8RD.class) {
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
