package X;

/* renamed from: X.7NU  reason: invalid class name */
public final class AnonymousClass7NU extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C10810fG $config;
    public final /* synthetic */ C137846gp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NU(C137846gp r2, C10810fG r3) {
        super(0);
        this.this$0 = r2;
        this.$config = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6XQ r1 = this.this$0.A0R;
        C10810fG r6 = this.$config;
        if ((r1.A02.A00 & 8) != 0) {
            for (C137856gq r5 = r1.A05; r5 != null; r5 = r5.A04) {
                if ((r5.A01 & 8) != 0) {
                    C1506776e r4 = null;
                    C137856gq r3 = r5;
                    do {
                        if (r3 instanceof C161837nY) {
                            C161837nY r32 = (C161837nY) r3;
                            if (r32.BHU()) {
                                ((C1496172a) r6.element).A01 = true;
                            }
                            r32.B1K((C1496172a) r6.element);
                        } else if ((r3.A01 & 8) != 0 && (r3 instanceof C94114hf)) {
                            int i = 0;
                            for (C137856gq r2 = ((C94114hf) r3).A00; r2 != null; r2 = r2.A02) {
                                if ((r2.A01 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r3 = r2;
                                    } else {
                                        r4 = C90464aC.A0F(r4);
                                        r3 = C90524aI.A0D(r4, r3);
                                        r4.A0D(r2);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r3 = AnonymousClass6VZ.A00(r4);
                        continue;
                    } while (r3 != null);
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
