package X;

import java.util.Collections;
import java.util.Set;

public class ABI implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r6, AnonymousClass3T1 r7) {
        if (r7 instanceof AnonymousClass5J6) {
            AnonymousClass5J6 r72 = (AnonymousClass5J6) r7;
            AnonymousClass8NN A0p = C172698Ov.DEFAULT_INSTANCE.A0p();
            Set set = r72.A01;
            C172698Ov r2 = (C172698Ov) C90524aI.A0H(A0p);
            C23122B6c b6c = r2.collectionNames_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.collectionNames_ = b6c;
            }
            C21071A7i.A0O(set, b6c);
            long j = r72.A00;
            C172698Ov r1 = (C172698Ov) C90524aI.A0H(A0p);
            r1.bitField0_ |= 1;
            r1.timestamp_ = j;
            AnonymousClass8NE r22 = (AnonymousClass8NE) AnonymousClass8SQ.DEFAULT_INSTANCE.A0p();
            r22.A0U(AnonymousClass91G.APP_STATE_FATAL_EXCEPTION_NOTIFICATION);
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(r22);
            C172698Ov r0 = (C172698Ov) A0p.A0R();
            r0.getClass();
            A0A.appStateFatalExceptionNotification_ = r0;
            A0A.bitField0_ |= 256;
            r6.A00.A0d((AnonymousClass8SQ) r22.A0R());
            return;
        }
        throw AnonymousClass001.A08("FMessageReactionSerializer/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r9) {
        if (AnonymousClass97T.A00(r9) != AnonymousClass91G.APP_STATE_FATAL_EXCEPTION_NOTIFICATION) {
            return null;
        }
        C172698Ov r1 = C170918Hz.A0L(r9).appStateFatalExceptionNotification_;
        if (r1 == null) {
            r1 = C172698Ov.DEFAULT_INSTANCE;
        }
        return new AnonymousClass5J6(r9.A0C, Collections.unmodifiableSet(C90524aI.A0k(r1.collectionNames_)), r9.A04, r1.timestamp_);
    }
}
