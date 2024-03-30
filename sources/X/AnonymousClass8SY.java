package X;

/* renamed from: X.8SY  reason: invalid class name */
public final class AnonymousClass8SY extends C170918Hz implements B64 {
    public static final int CALL_OUTCOME_FIELD_NUMBER = 2;
    public static final AnonymousClass8SY DEFAULT_INSTANCE;
    public static final int JID_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public int callOutcome_;
    public String jid_ = "";

    static {
        AnonymousClass8SY r1 = new AnonymousClass8SY();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SY.class);
    }

    public AnonymousClass91D B9G() {
        AnonymousClass91D A00 = AnonymousClass91D.A00(this.callOutcome_);
        return A00 == null ? AnonymousClass91D.CONNECTED : A00;
    }

    public String BDE() {
        return this.jid_;
    }

    public boolean BJm() {
        return AnonymousClass000.A1P(this.bitField0_ & 2);
    }

    public boolean BJt() {
        return C165577te.A1W(this.bitField0_);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0e = C170918Hz.A0e();
                A0e[1] = "jid_";
                A0e[2] = "callOutcome_";
                A0e[3] = C21049A6m.A00;
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A0e);
            case 3:
                return new AnonymousClass8SY();
            case 4:
                return new AnonymousClass8NM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8SY.class) {
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
