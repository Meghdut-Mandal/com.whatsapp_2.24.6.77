package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9ST  reason: invalid class name */
public final class AnonymousClass9ST {
    public C133216Xg A00;
    public boolean A01;
    public final C133216Xg A02;
    public final C1263663q A03;
    public final C131296Om A04;
    public final C197489bn A05;
    public final C195909Wt A06;
    public final C192289Gk A07;

    public void A00() {
        if (!this.A01) {
            this.A03.A00();
        }
    }

    public AnonymousClass9ST(Context context, C133216Xg r6, C133216Xg r7, C197489bn r8, C201589jv r9) {
        C97914qW r0;
        this.A05 = r8;
        this.A02 = r6;
        int i = 5;
        if (r7 != null) {
            int i2 = r7.A00;
            int i3 = i2 & 256;
            int i4 = i3 != 0 ? 261 : i;
            if ((i2 & 32) != 0) {
                i4 |= 32;
                if ((i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i4 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                } else if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                    i4 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                } else if ((i2 & 512) != 0) {
                    i4 |= 512;
                } else if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    i4 |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                } else if (i3 != 0) {
                    i4 |= 256;
                }
                if ((i2 & DefaultCrypto.BUFFER_SIZE) != 0) {
                    i4 |= DefaultCrypto.BUFFER_SIZE;
                }
            }
            r6.A07(r7, i4);
        } else {
            r6.A06(5);
        }
        this.A04 = new C131296Om(context.getResources());
        synchronized (r6.A07) {
            r0 = new C97914qW(r6);
        }
        this.A03 = r0;
        r0.A00();
        C195909Wt r1 = new C195909Wt(r8, r9);
        this.A06 = r1;
        this.A07 = new C192289Gk(this);
        r1.A00 = this;
    }
}
