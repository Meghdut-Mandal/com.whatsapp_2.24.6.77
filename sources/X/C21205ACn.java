package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.ACn  reason: case insensitive filesystem */
public final class C21205ACn implements B14 {
    public /* synthetic */ void Bd3(AnonymousClass6CO r1, AnonymousClass8NK r2, AnonymousClass3T1 r3) {
    }

    public void Bd4(C1275768v r2, AnonymousClass8SU r3, AnonymousClass3T1 r4) {
        C36321k7.A0w(r3, r4);
        if ((r3.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && r3.multicast_) {
            r4.A0j(64);
        }
        if ((r3.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0 && r3.urlNumber_) {
            r4.A0j(4);
        }
        if ((r3.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && r3.urlText_) {
            r4.A0j(2);
        }
    }
}
