package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Ail  reason: case insensitive filesystem */
public final class C22224Ail extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C20958A0r $obj;
    public final /* synthetic */ AnonymousClass8AG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22224Ail(AnonymousClass8AG r2, C20958A0r a0r) {
        super(0);
        this.$obj = a0r;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass84B r3;
        AnonymousClass9QJ r2;
        C17960sM[] r1;
        int i;
        C195999Xe A00;
        C20958A0r a0r = this.$obj;
        boolean z = false;
        if (a0r instanceof AnonymousClass8AL) {
            C195999Xe r4 = ((AnonymousClass8AL) a0r).A00;
            AnonymousClass84B r32 = this.this$0.A00;
            AnonymousClass9QJ r12 = r32.A09;
            C17960sM[] r22 = AnonymousClass84B.A0S;
            if (AnonymousClass9QJ.A01(r12, r32, r4, r22, 4)) {
                r3 = this.this$0.A00;
                A00 = AnonymousClass9QJ.A00(r3.A05, r3, r22, 6);
            }
            return Boolean.valueOf(z);
        }
        if (a0r instanceof AnonymousClass8AK) {
            boolean A0J = AnonymousClass00C.A0J(((AnonymousClass8AK) a0r).A00.A01(), "SOCKET_CONNECTION_DEVICE_LINKAGE_ERROR");
            r3 = this.this$0.A00;
            if (A0J) {
                A00 = r3.A06();
            } else {
                r2 = r3.A0B;
                r1 = AnonymousClass84B.A0S;
                i = 3;
            }
        } else if (a0r instanceof AnonymousClass8AN) {
            AnonymousClass8AG r0 = this.this$0;
            AnonymousClass8AN r23 = (AnonymousClass8AN) a0r;
            AnonymousClass00C.A0D(r23, 0);
            LocalChannel localChannel = r0.A00.A01.A03;
            if (localChannel != null) {
                AnonymousClass8NN A0p = C172808Pg.DEFAULT_INSTANCE.A0p();
                C1887990t[] values = C1887990t.values();
                AnonymousClass88F r24 = r23.A00;
                ((C172808Pg) C90524aI.A0H(A0p)).type_ = values[r24.A01].BEY();
                ((C172808Pg) C90524aI.A0H(A0p)).status_ = C1888290w.values()[r24.A00].BEY();
                ((C172808Pg) C90524aI.A0H(A0p)).level_ = r24.A02;
                AnonymousClass8NN.A0L(localChannel, A0p, 21);
            }
            z = true;
            return Boolean.valueOf(z);
        } else {
            if (a0r instanceof AnonymousClass8AS) {
                r3 = this.this$0.A00;
                r2 = r3.A06;
                r1 = AnonymousClass84B.A0S;
                i = 1;
            }
            return Boolean.valueOf(z);
        }
        A00 = AnonymousClass9QJ.A00(r2, r3, r1, i);
        r3.A00.A03 = A00;
        z = true;
        return Boolean.valueOf(z);
    }
}
