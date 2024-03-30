package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.02V  reason: invalid class name */
public class AnonymousClass02V implements Runnable {
    public final /* synthetic */ AnonymousClass02U A00;

    public AnonymousClass02V(AnonymousClass02U r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass02U r2 = this.A00;
        if ((r2.A02 & 1) != 0) {
            r2.A0W(0);
        }
        if ((r2.A02 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            r2.A0W(C65953Uc.A03);
        }
        r2.A0S = false;
        r2.A02 = 0;
    }
}
