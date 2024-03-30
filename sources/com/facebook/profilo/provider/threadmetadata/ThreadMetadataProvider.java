package com.facebook.profilo.provider.threadmetadata;

import X.A2W;
import X.C201689k7;
import X.C207229ul;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class ThreadMetadataProvider extends C201689k7 {
    public static native void nativeLogThreadMetadata(Buffer buffer);

    public void disable() {
    }

    public void enable() {
    }

    public int getSupportedProviders() {
        return -1;
    }

    public int getTracingProviders() {
        return 0;
    }

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public void logOnTraceEnd(C207229ul r2, A2W a2w) {
        nativeLogThreadMetadata(r2.A09);
    }

    public void onTraceEnded(C207229ul r3, A2W a2w) {
        if (r3.A00 != 2) {
            nativeLogThreadMetadata(r3.A09);
        }
    }
}
