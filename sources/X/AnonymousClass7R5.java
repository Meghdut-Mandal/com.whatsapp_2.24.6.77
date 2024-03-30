package X;

/* renamed from: X.7R5  reason: invalid class name */
public final class AnonymousClass7R5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C94444iE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7R5(C94444iE r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        boolean A1X = AnonymousClass000.A1X(obj);
        if (this.this$0.A0A.getValue() == null) {
            z = false;
        } else {
            C128286Bq r0 = (C128286Bq) this.this$0.A0A.getValue();
            if (r0 != null) {
                r0.A02 = A1X;
            }
            AnonymousClass6VZ.A05(this.this$0);
            AnonymousClass6VZ.A06(this.this$0);
            C109225Wt.A00(this.this$0);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
