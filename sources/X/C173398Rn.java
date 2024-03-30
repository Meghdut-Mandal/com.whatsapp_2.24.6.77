package X;

/* renamed from: X.8Rn  reason: invalid class name and case insensitive filesystem */
public final class C173398Rn extends C170918Hz implements C22901AyD {
    public static final C173398Rn DEFAULT_INSTANCE;
    public static final int DETERMINISTIC_LC_FIELD_NUMBER = 8;
    public static final int DETERMINISTIC_LG_FIELD_NUMBER = 7;
    public static final int ELEMENT_NAME_FIELD_NUMBER = 2;
    public static final int FALLBACK_LC_FIELD_NUMBER = 5;
    public static final int FALLBACK_LG_FIELD_NUMBER = 4;
    public static final int HYDRATED_HSM_FIELD_NUMBER = 9;
    public static final int LOCALIZABLE_PARAMS_FIELD_NUMBER = 6;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 3;
    public static volatile AnonymousClass7cS PARSER;
    public int bitField0_;
    public String deterministicLc_;
    public String deterministicLg_;
    public String elementName_ = "";
    public String fallbackLc_;
    public String fallbackLg_;
    public AnonymousClass8SL hydratedHsm_;
    public C23122B6c localizableParams_;
    public String namespace_ = "";
    public C23122B6c params_;

    static {
        C173398Rn r1 = new C173398Rn();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173398Rn.class);
    }

    public C173398Rn() {
        AnonymousClass8I2 r0 = AnonymousClass8I2.A02;
        this.params_ = r0;
        this.fallbackLg_ = "";
        this.fallbackLc_ = "";
        this.localizableParams_ = r0;
        this.deterministicLg_ = "";
        this.deterministicLc_ = "";
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
                A1Z[1] = "namespace_";
                A1Z[2] = "elementName_";
                A1Z[3] = "params_";
                A1Z[4] = "fallbackLg_";
                A1Z[5] = "fallbackLc_";
                A1Z[6] = "localizableParams_";
                A1Z[7] = C172998Pz.class;
                A1Z[8] = "deterministicLg_";
                A1Z[9] = "deterministicLc_";
                A1Z[10] = "hydratedHsm_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0003\u0006\u001b\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006", A1Z);
            case 3:
                return new C173398Rn();
            case 4:
                return new C171228Je();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173398Rn.class) {
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
