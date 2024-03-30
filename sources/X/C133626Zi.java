package X;

import android.media.ImageReader;

/* renamed from: X.6Zi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133626Zi implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C107305Nn A00;

    public /* synthetic */ C133626Zi(C107305Nn r1) {
        this.A00 = r1;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        C107305Nn.A01(imageReader.acquireLatestImage(), this.A00);
    }
}
