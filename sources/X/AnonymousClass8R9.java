package X;

/* renamed from: X.8R9  reason: invalid class name */
public final class AnonymousClass8R9 extends C170918Hz implements C22901AyD {
    public static final int AVATAR_METADATA_FIELD_NUMBER = 1;
    public static final AnonymousClass8R9 DEFAULT_INSTANCE;
    public static final int INVOKER_JID_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 2;
    public static final int PLUGIN_METADATA_FIELD_NUMBER = 3;
    public static final int SUGGESTED_PROMPT_METADATA_FIELD_NUMBER = 4;
    public C99984uH avatarMetadata_;
    public int bitField0_;
    public String invokerJid_ = "";
    public String personaId_ = "";
    public C173388Rm pluginMetadata_;
    public C172658Or suggestedPromptMetadata_;

    static {
        AnonymousClass8R9 r1 = new AnonymousClass8R9();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8R9.class);
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
                A0g[1] = "avatarMetadata_";
                A0g[2] = "personaId_";
                A0g[3] = "pluginMetadata_";
                A0g[4] = "suggestedPromptMetadata_";
                A0g[5] = "invokerJid_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", A0g);
            case 3:
                return new AnonymousClass8R9();
            case 4:
                return new C171138Iv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass8R9.class) {
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
