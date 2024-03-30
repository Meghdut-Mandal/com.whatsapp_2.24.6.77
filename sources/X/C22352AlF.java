package X;

/* renamed from: X.AlF  reason: case insensitive filesystem */
public final class C22352AlF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C167487y7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22352AlF(C167487y7 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C167487y7 r1 = this.this$0;
        r1.A06.A00 = (AnonymousClass9W6) obj;
        boolean A09 = r1.A08.A09();
        C167487y7 r12 = this.this$0;
        C195399Ud r0 = r12.A05;
        if (A09) {
            r0.A00.A0E(r12.A09, 0);
            C167487y7 r13 = this.this$0;
            C195399Ud r02 = r13.A05;
            r02.A02.remove(r13.A06);
            this.this$0.A03.A0C(new C21114A8z(4));
            C167487y7 r03 = this.this$0;
            r03.A05.A00(r03.A03, r03.A06);
            C167487y7 r04 = this.this$0;
            r04.A05.A01(r04.A06);
        } else {
            A9E a9e = (A9E) r0.A02.get(r12.A06);
            if (a9e != null && a9e.A00 < a9e.A06.size()) {
                C36341k9.A16(this.this$0.A01, 5);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
