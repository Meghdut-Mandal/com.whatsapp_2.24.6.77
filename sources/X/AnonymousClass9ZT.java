package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9ZT  reason: invalid class name */
public abstract class AnonymousClass9ZT {
    public static AnonymousClass8SX A00(C20810yC r3, AnonymousClass8SX r4) {
        C172328Nk r0;
        if ((r4.bitField1_ & 16384) == 0 || !r3.A0E(2802)) {
            int i = r4.bitField1_;
            if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                r0 = r4.viewOnceMessageV2_;
            } else {
                int i2 = r4.bitField0_;
                if ((268435456 & i2) != 0) {
                    r0 = r4.viewOnceMessage_;
                } else if (AnonymousClass000.A1P(i2 & Integer.MIN_VALUE)) {
                    r0 = r4.ephemeralMessage_;
                } else if ((i & 512) != 0) {
                    r0 = r4.documentWithCaptionMessage_;
                } else if ((i & DefaultCrypto.BUFFER_SIZE) != 0 && r3.A0E(2189)) {
                    C172328Nk r02 = r4.editedMessage_;
                    if (r02 == null) {
                        r02 = C172328Nk.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8SX r1 = r02.message_;
                    if (r1 == null) {
                        r1 = AnonymousClass8SX.DEFAULT_INSTANCE;
                    }
                    if (r1.A0x()) {
                        return r1;
                    }
                    AnonymousClass8NL r12 = (AnonymousClass8NL) r1.A0q();
                    C173348Ri r03 = r4.messageContextInfo_;
                    if (r03 == null) {
                        r03 = C173348Ri.DEFAULT_INSTANCE;
                    }
                    r12.A0j(r03);
                    return AnonymousClass8NN.A0D(r12);
                } else if (r4.A0u() && r3.A0E(4165)) {
                    r0 = r4.botInvokeMessage_;
                } else if (!AnonymousClass000.A1P(r4.bitField1_ & 134217728) || !r3.A0E(5692)) {
                    return null;
                } else {
                    r0 = r4.lottieStickerMessage_;
                }
            }
        } else {
            r0 = r4.viewOnceMessageV2Extension_;
        }
        if (r0 == null) {
            r0 = C172328Nk.DEFAULT_INSTANCE;
        }
        AnonymousClass8SX r13 = r0.message_;
        if (r13 == null) {
            return AnonymousClass8SX.DEFAULT_INSTANCE;
        }
        return r13;
    }

    public static AnonymousClass8SX A01(C20810yC r2, AnonymousClass8SX r3) {
        if (r2.A0E(3334) && (r3.bitField1_ & C132986Wc.A0F) != 0) {
            C172328Nk r0 = r3.groupMentionedMessage_;
            if (r0 == null) {
                r0 = C172328Nk.DEFAULT_INSTANCE;
            }
            r3 = r0.message_;
            if (r3 == null) {
                r3 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
        }
        if (AnonymousClass000.A1P(r3.bitField0_ & Integer.MIN_VALUE)) {
            C172328Nk r02 = r3.ephemeralMessage_;
            if (r02 == null) {
                r02 = C172328Nk.DEFAULT_INSTANCE;
            }
            r3 = r02.message_;
            if (r3 == null) {
                r3 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
        }
        if ((r3.bitField1_ & 1073741824) != 0) {
            C172738Oz r03 = r3.commentMessage_;
            if (r03 == null) {
                r03 = C172738Oz.DEFAULT_INSTANCE;
            }
            r3 = r03.message_;
            if (r3 == null) {
                r3 = AnonymousClass8SX.DEFAULT_INSTANCE;
            }
        }
        AnonymousClass8SX A00 = A00(r2, r3);
        if (A00 != null) {
            return A00;
        }
        return r3;
    }
}
