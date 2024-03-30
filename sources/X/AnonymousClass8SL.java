package X;

/* renamed from: X.8SL  reason: invalid class name */
public final class AnonymousClass8SL extends C170918Hz implements C22901AyD {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 3;
    public static final AnonymousClass8SL DEFAULT_INSTANCE;
    public static final int FOUR_ROW_TEMPLATE_FIELD_NUMBER = 1;
    public static final int HYDRATED_FOUR_ROW_TEMPLATE_FIELD_NUMBER = 2;
    public static final int HYDRATED_TEMPLATE_FIELD_NUMBER = 4;
    public static final int INTERACTIVE_MESSAGE_TEMPLATE_FIELD_NUMBER = 5;
    public static volatile AnonymousClass7cS PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    public int bitField0_;
    public AnonymousClass8SG contextInfo_;
    public int formatCase_ = 0;
    public Object format_;
    public AnonymousClass8SO hydratedTemplate_;
    public String templateId_ = "";

    static {
        AnonymousClass8SL r1 = new AnonymousClass8SL();
        DEFAULT_INSTANCE = r1;
        C170918Hz.A0X(r1, AnonymousClass8SL.class);
    }

    public AnonymousClass8SM A0u() {
        if (this.formatCase_ == 1) {
            return (AnonymousClass8SM) this.format_;
        }
        return AnonymousClass8SM.DEFAULT_INSTANCE;
    }
}
