package X;

/* renamed from: X.8SJ  reason: invalid class name */
public final class AnonymousClass8SJ extends C170918Hz implements C22901AyD {
    public static final int CALL_BUTTON_FIELD_NUMBER = 3;
    public static final AnonymousClass8SJ DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 4;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int QUICK_REPLY_BUTTON_FIELD_NUMBER = 1;
    public static final int URL_BUTTON_FIELD_NUMBER = 2;
    public int bitField0_;
    public int hydratedButtonCase_ = 0;
    public Object hydratedButton_;
    public int index_;

    static {
        AnonymousClass8SJ r1 = new AnonymousClass8SJ();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SJ.class);
    }

    public C173048Qe A0u() {
        if (this.hydratedButtonCase_ == 2) {
            return (C173048Qe) this.hydratedButton_;
        }
        return C173048Qe.DEFAULT_INSTANCE;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                objArr[0] = "hydratedButton_";
                C170918Hz.A0Z(objArr, "hydratedButtonCase_");
                objArr[3] = C172688Ou.class;
                objArr[4] = C173048Qe.class;
                objArr[5] = C172678Ot.class;
                objArr[6] = "index_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဋ\u0003", objArr);
            case 3:
                return new AnonymousClass8SJ();
            case 4:
                return new AnonymousClass8J5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SJ.class) {
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
