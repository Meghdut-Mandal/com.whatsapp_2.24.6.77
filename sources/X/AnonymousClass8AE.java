package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.8AE  reason: invalid class name */
public final class AnonymousClass8AE extends AnonymousClass84C {
    public final AnonymousClass84B A00;

    public static final void A00(AnonymousClass8AE r4) {
        AnonymousClass9Y3 r1 = r4.A00.A01;
        LocalChannel localChannel = r1.A03;
        if (localChannel != null) {
            AnonymousClass8NN A0p = C172518Od.DEFAULT_INSTANCE.A0p();
            ((C172518Od) C90524aI.A0H(A0p)).nonce_ = r1.A00();
            ((C172518Od) C90524aI.A0H(A0p)).action_ = C1887290m.CONTROL_STREAM_ACTION_STOP.BEY();
            AnonymousClass8NN.A0L(localChannel, A0p, 7);
        }
    }

    public void A07() {
        this.A00.A0C(new C22073AgK(this));
    }

    public void A08() {
        this.A00.A0C(new C22074AgL(this));
    }

    public AnonymousClass8AE(AnonymousClass84B r1) {
        super(r1);
        this.A00 = r1;
    }
}
