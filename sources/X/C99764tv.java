package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.4tv  reason: invalid class name and case insensitive filesystem */
public final class C99764tv extends AnonymousClass8NN implements C22901AyD {
    public C99764tv() {
        super(C100104uT.DEFAULT_INSTANCE);
    }

    public void A0U(AnonymousClass5UB r3) {
        C100104uT r1 = (C100104uT) C90524aI.A0H(this);
        int i = C100104uT.ARCHIVED_FIELD_NUMBER;
        r1.endOfHistoryTransferType_ = r3.value;
        r1.bitField0_ |= 512;
    }

    public void A0V(String str) {
        C100104uT r1 = (C100104uT) C90524aI.A0H(this);
        int i = C100104uT.ARCHIVED_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        r1.name_ = str;
    }

    public void A0W(String str) {
        C100104uT r1 = (C100104uT) C90524aI.A0H(this);
        int i = C100104uT.ARCHIVED_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.pHash_ = str;
    }
}
