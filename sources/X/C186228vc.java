package X;

/* renamed from: X.8vc  reason: invalid class name and case insensitive filesystem */
public class C186228vc extends AnonymousClass5PS {
    public Object A00;
    public Object A01;
    public Object A02;

    public C186228vc(C203399nx r14, C107535Pi r15) {
        C203399nx r6 = r14;
        C203399nx A0e = C90514aH.A0e(r14, r15);
        C203539oF.A07(r6, String.class, C165567td.A0P(), C165567td.A0Q(), "1", new String[]{"bot", "v"}, false);
        this.A02 = C203539oF.A02(r14, new C23212B9u(A0e, 12), 0);
        C21360AIm aIm = C21360AIm.A00;
        AnonymousClass00C.A0D(r14, 0);
        this.A00 = C203539oF.A09(r6, aIm, new String[]{"bot", "bot"}, 1, Long.MAX_VALUE);
        this.A01 = C203539oF.A09(r6, C21361AIn.A00, C165607th.A1b(r14, this, "bot"), 1, 1).get(0);
    }

    public C186228vc(C203399nx r13, C35911jS r14) {
        C203399nx r5 = r13;
        C203399nx A0e = C90514aH.A0e(r13, r14);
        C203539oF.A07(r5, String.class, C165567td.A0P(), C165567td.A0Q(), "true", new String[]{"integrator_list", "opted_in"}, false);
        this.A00 = C203539oF.A02(r13, new C23212B9u(A0e, 34), 0);
        ALV alv = ALV.A00;
        AnonymousClass00C.A0D(r13, 0);
        this.A01 = C203539oF.A09(r5, alv, new String[]{"integrator_list", "integrator"}, 0, 999);
        this.A02 = C203539oF.A05(r13, ALW.A00, C165607th.A1b(r13, this, "integrator_list"));
    }
}
