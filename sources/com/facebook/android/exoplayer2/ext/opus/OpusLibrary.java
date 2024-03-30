package com.facebook.android.exoplayer2.ext.opus;

import X.C200729i7;

public final class OpusLibrary {
    public static final OpusLibrary $redex_init_class = null;

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();

    static {
        C200729i7.A00("goog.exo.opus");
    }
}
