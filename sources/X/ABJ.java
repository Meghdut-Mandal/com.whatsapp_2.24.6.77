package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ABJ implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        if (r8 instanceof C180988mk) {
            AnonymousClass8NN A0p = AnonymousClass8NV.DEFAULT_INSTANCE.A0p();
            for (C201539jo A01 : Collections.unmodifiableSet(((C180988mk) r8).A00)) {
                C172288Ng A012 = A01.A01();
                AnonymousClass8NV r2 = (AnonymousClass8NV) C90524aI.A0H(A0p);
                A012.getClass();
                C23122B6c b6c = r2.keyIds_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r2.keyIds_ = b6c;
                }
                b6c.add(A012);
            }
            AnonymousClass8NE r22 = (AnonymousClass8NE) AnonymousClass8SQ.DEFAULT_INSTANCE.A0p();
            r22.A0U(AnonymousClass91G.APP_STATE_SYNC_KEY_REQUEST);
            AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(r22);
            AnonymousClass8NV r0 = (AnonymousClass8NV) A0p.A0R();
            r0.getClass();
            A0A.appStateSyncKeyRequest_ = r0;
            A0A.bitField0_ |= 64;
            r7.A00.A0d((AnonymousClass8SQ) r22.A0R());
            return;
        }
        throw AnonymousClass001.A08(C165567td.A0W(r8, "Message type is not supported ", AnonymousClass000.A0u()));
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r7) {
        if (AnonymousClass97T.A00(r7) != AnonymousClass91G.APP_STATE_SYNC_KEY_REQUEST) {
            return null;
        }
        C180988mk r5 = new C180988mk(r7.A0C, r7.A04);
        AnonymousClass8NV r0 = C170918Hz.A0L(r7).appStateSyncKeyRequest_;
        if (r0 == null) {
            r0 = AnonymousClass8NV.DEFAULT_INSTANCE;
        }
        HashSet A16 = C36441kJ.A16();
        for (C172288Ng r2 : r0.keyIds_) {
            if ((r2.bitField0_ & 1) != 0) {
                A16.add(new C201539jo(r2.keyId_.A06()));
            } else {
                C36321k7.A1J(r2, "FMessageAppStateSyncKeyRequest message missing fields for keyId: ", AnonymousClass000.A0u());
            }
        }
        Set set = r5.A00;
        set.clear();
        set.addAll(A16);
        return r5;
    }
}
