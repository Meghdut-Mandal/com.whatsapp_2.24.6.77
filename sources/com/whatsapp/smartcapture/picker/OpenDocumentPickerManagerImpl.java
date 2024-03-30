package com.whatsapp.smartcapture.picker;

import X.AnonymousClass00M;
import X.AnonymousClass00N;
import X.AnonymousClass05R;
import X.C009904e;
import androidx.lifecycle.OnLifecycleEvent;

public final class OpenDocumentPickerManagerImpl implements AnonymousClass00N, AnonymousClass00M {
    public static final String[] A01 = {"image/bmp", "image/gif", "image/heic", "image/png", "image/tiff", "image/webp", "application/pdf", "image/jpeg"};
    public C009904e A00;

    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    public final void onDestroy() {
        C009904e r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }
}
