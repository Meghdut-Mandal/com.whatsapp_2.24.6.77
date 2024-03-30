package X;

/* renamed from: X.0dK  reason: invalid class name and case insensitive filesystem */
public class C09890dK implements AnonymousClass04S {
    public C001600r A00;
    public final /* synthetic */ AnonymousClass08V A01;
    public final /* synthetic */ AnonymousClass08S A02;

    public C09890dK(AnonymousClass08V r1, AnonymousClass08S r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void BTH(Object obj) {
        C001600r r2 = (C001600r) this.A01.apply(obj);
        C001600r r1 = this.A00;
        if (r1 != r2) {
            if (r1 != null) {
                this.A02.A0E(r1);
            }
            this.A00 = r2;
            if (r2 != null) {
                this.A02.A0F(r2, new C09860dH(this));
            }
        }
    }
}
