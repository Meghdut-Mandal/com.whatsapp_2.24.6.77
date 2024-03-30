package X;

public class ABK implements C22938Ayo, C22942Ays, C17740rx {
    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C18740tg.A0E(r5 instanceof C180998ml, C165567td.A0W(r5, "Unexpected message type ", AnonymousClass000.A0u()));
        AnonymousClass8NE r2 = (AnonymousClass8NE) AnonymousClass8SQ.DEFAULT_INSTANCE.A0p();
        r2.A0U(AnonymousClass91G.APP_STATE_SYNC_KEY_SHARE);
        AnonymousClass8NW r0 = ((C180998ml) r5).A00;
        AnonymousClass8SQ A0A = AnonymousClass8NN.A0A(r2);
        r0.getClass();
        A0A.appStateSyncKeyShare_ = r0;
        A0A.bitField0_ |= 32;
        r4.A00.A0d((AnonymousClass8SQ) r2.A0R());
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r5) {
        if (AnonymousClass97T.A00(r5) != AnonymousClass91G.APP_STATE_SYNC_KEY_SHARE) {
            return null;
        }
        C180998ml r1 = new C180998ml(r5.A0C, r5.A04);
        AnonymousClass8NW r0 = C170918Hz.A0L(r5).appStateSyncKeyShare_;
        if (r0 == null) {
            r0 = AnonymousClass8NW.DEFAULT_INSTANCE;
        }
        r1.A00 = r0;
        return r1;
    }
}
