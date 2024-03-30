package X;

/* renamed from: X.8Or  reason: invalid class name and case insensitive filesystem */
public final class C172658Or extends C170918Hz implements C22901AyD {
    public static final C172658Or DEFAULT_INSTANCE;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int SELECTED_PROMPT_INDEX_FIELD_NUMBER = 2;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 1;
    public int bitField0_;
    public int selectedPromptIndex_;
    public C23122B6c suggestedPrompts_ = AnonymousClass8I2.A02;

    static {
        C172658Or r1 = new C172658Or();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, C172658Or.class);
    }

    public final Object A0r(Integer num, Object obj, Object obj2) {
        AnonymousClass7cS r0;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0d = C170918Hz.A0d();
                A0d[1] = "suggestedPrompts_";
                A0d[2] = "selectedPromptIndex_";
                return C170918Hz.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဋ\u0000", A0d);
            case 3:
                return new C172658Or();
            case 4:
                return new C171158Ix();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AnonymousClass7cS r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C172658Or.class) {
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
