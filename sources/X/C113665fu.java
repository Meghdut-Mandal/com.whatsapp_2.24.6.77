package X;

import com.facebook.cameracore.ardelivery.compression.tarbrotli.TarBrotliDecompressor;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.5fu  reason: invalid class name and case insensitive filesystem */
public abstract class C113665fu {
    public static AnonymousClass7eU A00;
    public static AnonymousClass7eU A01;

    public static void A00() {
        if (A00 == null) {
            A00 = new TarBrotliDecompressor();
        }
        if (A01 == null) {
            A01 = new ZipDecompressor();
        }
    }
}
