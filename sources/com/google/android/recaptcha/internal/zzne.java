package com.google.android.recaptcha.internal;

import X.C165597tg;

public enum zzne implements zziv {
    UNKNOWN(0),
    INIT_NATIVE(1),
    INIT_NETWORK(2),
    INIT_NETWORK_MRI_ACTION(18),
    INIT_DOWNLOAD_JS(19),
    INIT_JS(3),
    INIT_TOTAL(4),
    VALIDATE_INPUT(20),
    DOWNLOAD_JS(21),
    SAVE_CACHE_JS(22),
    LOAD_CACHE_JS(23),
    LOAD_WEBVIEW(24),
    EXECUTE_NATIVE(5),
    EXECUTE_JS(6),
    EXECUTE_TOTAL(7),
    COLLECT_SIGNALS(25),
    FETCH_TOKEN(26),
    POST_EXECUTE(27),
    CHALLENGE_ACCOUNT_NATIVE(8),
    CHALLENGE_ACCOUNT_JS(9),
    CHALLENGE_ACCOUNT_TOTAL(10),
    VERIFY_PIN_NATIVE(11),
    VERIFY_PIN_JS(12),
    VERIFY_PIN_TOTAL(13),
    RUN_PROGRAM(14),
    FETCH_ALLOWLIST(15),
    JS_LOAD(16),
    WEB_VIEW_RELOAD_JS(17),
    UNRECOGNIZED(-1);
    
    public static final zziw zzD = null;
    public final int zzF;

    public final String toString() {
        return Integer.toString(zza());
    }

    /* access modifiers changed from: public */
    static {
        zzD = new zznd();
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzF;
        }
        throw C165597tg.A0c();
    }

    /* access modifiers changed from: public */
    zzne(int i) {
        this.zzF = i;
    }
}
