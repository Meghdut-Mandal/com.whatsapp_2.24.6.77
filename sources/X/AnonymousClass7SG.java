package X;

/* renamed from: X.7SG  reason: invalid class name */
public final class AnonymousClass7SG extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6YD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SG(AnonymousClass6YD r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            AnonymousClass6DA r1 = AnonymousClass6YD.A01(this.this$0).A00;
            synchronized (r1) {
                if (str.length() == 0 || r1.A00 == null || r1.A02 == null) {
                    r1.A00 = C90464aC.A0V();
                    r1.A02 = C90464aC.A0V();
                }
            }
            synchronized (r1) {
                r1.A01 = C90464aC.A0V();
                r1.A03 = C90464aC.A0V();
            }
        }
        AnonymousClass6YD r12 = this.this$0;
        r12.A00 = Integer.MAX_VALUE;
        r12.A0D.A04(str);
        if (!AnonymousClass6YD.A08(r12)) {
            AnonymousClass6YD r0 = this.this$0;
            r0.A07.A0D(r0.A0D);
        }
        return AnonymousClass0AJ.A00;
    }
}
