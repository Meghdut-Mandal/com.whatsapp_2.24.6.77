package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Aif  reason: case insensitive filesystem */
public final class C22218Aif extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8A7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22218Aif(AnonymousClass8A7 r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r4;
        C195999Xe A06;
        C1887890s r6;
        C20958A0r a0r = this.$obj;
        boolean z = true;
        if (a0r instanceof AnonymousClass8AP) {
            AnonymousClass8A7 r10 = this.this$0;
            AnonymousClass8AP r1 = (AnonymousClass8AP) a0r;
            if (r1.A00 != 5) {
                r6 = C1887890s.APPLICATION_TYPE_UNKNOWN;
            } else {
                r6 = C1887890s.APPLICATION_TYPE_FAIR_DEMO;
            }
            C200159gk r9 = AnonymousClass9AO.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("[IDLE]: Sending Session Settings ApplicationType ");
            A0u.append(r6);
            A0u.append(" Doff ");
            int i = r1.A01;
            A0u.append(i);
            A0u.append(" and Inactivity Timer ");
            int i2 = r1.A02;
            A0u.append(i2);
            A0u.append(" and Bypass Don Check ");
            boolean z2 = r1.A03;
            r9.A01("sup:IdleStateDelegate", C36421kH.A0d(A0u, z2));
            AnonymousClass9Y3 r42 = r10.A00.A01;
            AnonymousClass8NN A0p = C173238Qx.DEFAULT_INSTANCE.A0p();
            AnonymousClass8NN A01 = C170918Hz.A01(C172568Oi.DEFAULT_INSTANCE);
            ((C172568Oi) A01.A00).doffTimerSec_ = i;
            ((C172568Oi) C90524aI.A0H(A01)).inactivityTimerSec_ = i2;
            C172568Oi r12 = (C172568Oi) A01.A0R();
            r12.getClass();
            ((C173238Qx) C90524aI.A0H(A0p)).timerSettings_ = r12;
            ((C173238Qx) C90524aI.A0H(A0p)).applicationType_ = r6.BEY();
            if (z2) {
                AnonymousClass8NN A012 = C170918Hz.A01(AnonymousClass8NQ.DEFAULT_INSTANCE);
                ((AnonymousClass8NQ) A012.A00).bypassDonCheck_ = true;
                AnonymousClass8NQ r13 = (AnonymousClass8NQ) A012.A0R();
                r13.getClass();
                ((C173238Qx) C90524aI.A0H(A0p)).overrideSettings_ = r13;
            }
            LocalChannel localChannel = r42.A03;
            if (localChannel != null) {
                AnonymousClass8NN.A0L(localChannel, A0p, 27);
            }
        } else if (a0r instanceof AnonymousClass8AJ) {
            this.this$0.A00.A09((AnonymousClass8AJ) a0r);
        } else if (a0r instanceof AnonymousClass8AV) {
            AnonymousClass8A7 r5 = this.this$0;
            AnonymousClass84B r3 = r5.A00;
            C23090B4a b4a = r3.A0H;
            if (b4a != null) {
                b4a.BPK("request_media_stream_start");
            }
            AnonymousClass9Y3 r43 = r3.A01;
            int A00 = r43.A00();
            r43.A0J.put(Integer.valueOf(A00), new C22315Akd(r5));
            AnonymousClass9AO.A01.A01("sup:IdleStateDelegate", "[IDLE]: Sending ControlStreamRequest Start");
            LocalChannel localChannel2 = r43.A03;
            if (localChannel2 != null) {
                AnonymousClass8NN A013 = C170918Hz.A01(C172518Od.DEFAULT_INSTANCE);
                ((C172518Od) A013.A00).nonce_ = A00;
                ((C172518Od) C90524aI.A0H(A013)).action_ = C1887290m.CONTROL_STREAM_ACTION_START.BEY();
                AnonymousClass8NN.A0L(localChannel2, A013, 7);
            }
        } else {
            if (a0r instanceof AnonymousClass8AX) {
                r4 = this.this$0.A00;
                A06 = AnonymousClass9QJ.A00(r4.A0E, r4, AnonymousClass84B.A0S, 8);
            } else if (!(a0r instanceof AnonymousClass8AW)) {
                if (a0r instanceof AnonymousClass8AO) {
                    if (!AnonymousClass00C.A0J(((AnonymousClass8AO) a0r).A00.A01(), "LIVE_STREAM_START_DOFF_ERROR")) {
                        r4 = this.this$0.A00;
                        A06 = AnonymousClass9QJ.A00(r4.A06, r4, AnonymousClass84B.A0S, 1);
                    }
                } else if (a0r instanceof AnonymousClass8AS) {
                    r4 = this.this$0.A00;
                    A06 = r4.A06();
                } else if (a0r instanceof AnonymousClass8AM) {
                    this.this$0.A00.A0A((AnonymousClass8AM) a0r);
                } else {
                    z = false;
                }
            }
            r4.A00.A03 = A06;
        }
        return Boolean.valueOf(z);
    }
}
