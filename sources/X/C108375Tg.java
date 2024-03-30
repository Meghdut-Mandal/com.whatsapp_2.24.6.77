package X;

/* renamed from: X.5Tg  reason: invalid class name and case insensitive filesystem */
public enum C108375Tg {
    REFERRAL("referral"),
    SESSION_ID("session_id"),
    ADDITIONAL_PARAMS("additional_params"),
    RESUMABLE_DATA(C108355Te.RESUMABLE_DATA.key),
    EXTENSIONS_CONTEXT("extensions_context"),
    EXTENSIONS_MERGE_MODE("merge_mode"),
    EXTENSIONS_BACK_NAV_CONTEXT("back_nav_context"),
    EXTENSIONS_IS_RESUMED("is_resumed_from_phoenix_session"),
    EXTENSIONS_IS_BACK_TRIGGERED("is_back_triggered");
    
    public final String key;

    /* access modifiers changed from: public */
    static {
        C108375Tg[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C108375Tg(String str) {
        this.key = str;
    }
}
