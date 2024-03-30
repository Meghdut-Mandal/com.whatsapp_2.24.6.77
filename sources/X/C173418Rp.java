package X;

/* renamed from: X.8Rp  reason: invalid class name and case insensitive filesystem */
public final class C173418Rp extends C170918Hz implements C22901AyD {
    public static final int ADDRESSES_FIELD_NUMBER = 3;
    public static final int BUILDFLAVOR_FIELD_NUMBER = 8;
    public static final C173418Rp DEFAULT_INSTANCE;
    public static final int DEVICEIMAGEASSETURI_FIELD_NUMBER = 6;
    public static final int DEVICEMODELNAME_FIELD_NUMBER = 7;
    public static final int DEVICENAME_FIELD_NUMBER = 9;
    public static final int DEVICESERIAL_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int FIRMWAREVERSION_FIELD_NUMBER = 4;
    public static final int HARDWARETYPE_FIELD_NUMBER = 10;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile AnonymousClass7cS PARSER;
    public C23122B6c addresses_ = AnonymousClass8I2.A02;
    public C21674AUx buildFlavor_;
    public C21674AUx deviceImageAssetURI_;
    public C21674AUx deviceModelName_;
    public C21674AUx deviceName_;
    public C21674AUx deviceSerial_;
    public int error_;
    public C21674AUx firmwareVersion_;
    public C21674AUx hardwareType_;
    public int nonce_;

    static {
        C173418Rp r1 = new C173418Rp();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173418Rp.class);
    }

    public C173418Rp() {
        C21674AUx aUx = C21674AUx.A00;
        this.firmwareVersion_ = aUx;
        this.deviceSerial_ = aUx;
        this.deviceImageAssetURI_ = aUx;
        this.deviceModelName_ = aUx;
        this.buildFlavor_ = aUx;
        this.deviceName_ = aUx;
        this.hardwareType_ = aUx;
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0h = C170918Hz.A0h(11);
                A0h[1] = "error_";
                A0h[2] = "addresses_";
                A0h[3] = C172818Ph.class;
                A0h[4] = "firmwareVersion_";
                A0h[5] = "deviceSerial_";
                A0h[6] = "deviceImageAssetURI_";
                A0h[7] = "deviceModelName_";
                A0h[8] = "buildFlavor_";
                A0h[9] = "deviceName_";
                A0h[10] = "hardwareType_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003\u001b\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n", A0h);
            case 3:
                return new C173418Rp();
            case 4:
                return new AnonymousClass8IY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173418Rp.class) {
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
