package X;

/* renamed from: X.4HS  reason: invalid class name */
public final class AnonymousClass4HS extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass00S $callback;
    public final /* synthetic */ C51412nm $type;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HS(AnonymousClass1K6 r2, C51412nm r3, AnonymousClass00S r4) {
        super(0);
        this.this$0 = r2;
        this.$type = r3;
        this.$callback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long j;
        C51412nm r1;
        AnonymousClass1K6 r5 = this.this$0;
        C51412nm r4 = this.$type;
        boolean z = false;
        if (C20800yB.A01(C21000yV.A01, ((C25681Hg) r5.A07.get()).A01, 8004)) {
            C25621Ha r2 = r5.A02;
            if (!r2.A04(r4) && AnonymousClass00C.A0J(r5.A05.A05(), "US") && r4 == (r1 = C51412nm.META_AI_SHORTCUT) && r2.A04(C51412nm.INVOKE) && !r2.A04(r1)) {
                z = true;
            }
        }
        AnonymousClass1K6 r42 = this.this$0;
        if (z) {
            C25621Ha r3 = r42.A02;
            C51412nm r12 = this.$type;
            C69573dk r22 = new C69573dk(r42, this.$callback);
            int A06 = C36431kI.A06(r12, 0);
            if (A06 == 0) {
                j = 20230902;
            } else if (A06 == 1) {
                j = 20230901;
            } else if (A06 == 2) {
                j = 20240216;
            } else {
                throw C36441kJ.A18();
            }
            C25621Ha.A00(r22, r3, j);
        } else {
            r42.A00.Bp3(new AVW(this.$callback, 49));
        }
        return AnonymousClass0AJ.A00;
    }
}
