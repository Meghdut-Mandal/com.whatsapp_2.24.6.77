package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public class ABP implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof AnonymousClass2bN, C165567td.A0W(r5, "Unexpected message type ", AnonymousClass000.A0u()));
        AnonymousClass8NL r1 = r4.A00;
        C172448Nw r0 = ((AnonymousClass8SX) r1.A00).requestPhoneNumberMessage_;
        if (r0 == null) {
            r0 = C172448Nw.DEFAULT_INSTANCE;
        }
        C172448Nw r02 = (C172448Nw) r0.A0q().A0R();
        AnonymousClass8SX A0F = AnonymousClass8NN.A0F(r1, r02);
        A0F.requestPhoneNumberMessage_ = r02;
        A0F.bitField1_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        if ((r5.A0A.bitField1_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            return new AnonymousClass2bN(r5.A0C, r5.A04);
        }
        return null;
    }
}
