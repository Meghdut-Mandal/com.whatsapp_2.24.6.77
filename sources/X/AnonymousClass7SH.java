package X;

/* renamed from: X.7SH  reason: invalid class name */
public final class AnonymousClass7SH extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SH(AnonymousClass6YD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass005 r3;
        Number A0z;
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass6YD r0 = this.this$0;
        AnonymousClass1S3 r1 = r0.A0D;
        int i = r1.A02;
        r1.A02 = A0I;
        r0.A07.A0D(r1);
        AnonymousClass6YD r4 = this.this$0;
        if (i != 98 ? i == 0 && A0I == 98 : A0I == 0) {
            AnonymousClass6YD.A01(r4).A00.A00();
        }
        if (A0I != 98) {
            r3 = r4.A0G;
            ((C131436Pa) r3.get()).A03();
            AnonymousClass6DA r12 = AnonymousClass6YD.A01(r4).A00;
            synchronized (r12) {
                r12.A01 = null;
                r12.A03 = null;
                r12.A00 = null;
                r12.A02 = null;
            }
        } else {
            AnonymousClass08S r2 = r4.A07;
            r3 = r4.A0G;
            r2.A0F(((C131436Pa) r3.get()).A05.A02.A02, r4.A09);
            AnonymousClass6Th r22 = ((C131436Pa) r3.get()).A05.A02;
            if (r22.A00 == null) {
                C1497172m.A00(r22.A05, r22, 32);
            }
        }
        if (AnonymousClass6YD.A08(r4) || ((A0z = C36441kJ.A0z(r4.A05)) != null && A0z.intValue() == 98)) {
            ((C131436Pa) r3.get()).A04.A09();
        }
        return AnonymousClass0AJ.A00;
    }
}
