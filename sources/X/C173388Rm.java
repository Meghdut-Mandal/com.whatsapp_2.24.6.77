package X;

/* renamed from: X.8Rm  reason: invalid class name and case insensitive filesystem */
public final class C173388Rm extends C170918Hz implements C22901AyD {
    public static final C173388Rm DEFAULT_INSTANCE;
    public static final int EXPECTED_LINKS_COUNT_FIELD_NUMBER = 7;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PLUGIN_TYPE_FIELD_NUMBER = 2;
    public static final int PLUGIN_VERSION_FIELD_NUMBER = 8;
    public static final int PROFILE_PHOTO_CDN_URL_FIELD_NUMBER = 4;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int REFERENCE_INDEX_FIELD_NUMBER = 6;
    public static final int SEARCH_PROVIDER_URL_FIELD_NUMBER = 5;
    public static final int SEARCH_QUERY_FIELD_NUMBER = 9;
    public static final int THUMBNAIL_CDN_URL_FIELD_NUMBER = 3;
    public int bitField0_;
    public int expectedLinksCount_;
    public int pluginType_ = 1;
    public int pluginVersion_;
    public String profilePhotoCdnUrl_ = "";
    public int provider_ = 1;
    public int referenceIndex_;
    public String searchProviderUrl_ = "";
    public String searchQuery_ = "";
    public String thumbnailCdnUrl_ = "";

    static {
        C173388Rm r1 = new C173388Rm();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C173388Rm.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C90474aD.A1Z(12);
                A1Z[1] = "provider_";
                A1Z[2] = A6Z.A00;
                A1Z[3] = "pluginType_";
                A1Z[4] = A6Y.A00;
                A1Z[5] = "thumbnailCdnUrl_";
                A1Z[6] = "profilePhotoCdnUrl_";
                A1Z[7] = "searchProviderUrl_";
                A1Z[8] = "referenceIndex_";
                A1Z[9] = "expectedLinksCount_";
                A1Z[10] = "pluginVersion_";
                A1Z[11] = "searchQuery_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဈ\b", A1Z);
            case 3:
                return new C173388Rm();
            case 4:
                return new C171148Iw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C173388Rm.class) {
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
