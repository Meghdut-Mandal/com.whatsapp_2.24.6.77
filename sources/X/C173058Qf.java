package X;

/* renamed from: X.8Qf  reason: invalid class name and case insensitive filesystem */
public final class C173058Qf extends C170918Hz implements C22901AyD {
    public static final C173058Qf DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 2;
    public static final int NEWSLETTER_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int POLYGONVERTICES_FIELD_NUMBER = 1;
    public static final int SHOULD_SKIP_CONFIRMATION_FIELD_NUMBER = 4;
    public int actionCase_ = 0;
    public Object action_;
    public int bitField0_;
    public C23122B6c polygonVertices_ = AnonymousClass8I2.A02;
    public boolean shouldSkipConfirmation_;

    static {
        C173058Qf r1 = new C173058Qf();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173058Qf.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                objArr[0] = "action_";
                C170918Hz.A0Z(objArr, "actionCase_");
                objArr[3] = "polygonVertices_";
                objArr[4] = C173128Qm.class;
                objArr[5] = C172908Pq.class;
                objArr[6] = AnonymousClass8RA.class;
                objArr[7] = "shouldSkipConfirmation_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\u0002", objArr);
            case 3:
                return new C173058Qf();
            case 4:
                return new AnonymousClass8J9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173058Qf.class) {
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
