package X;

/* renamed from: X.6oK  reason: invalid class name and case insensitive filesystem */
public class C142096oK implements AnonymousClass7fG {
    public final /* synthetic */ AnonymousClass6SR A00;
    public final /* synthetic */ AnonymousClass7fG A01;

    public C142096oK(AnonymousClass6SR r1, AnonymousClass7fG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bex(C115145iP r5) {
        AnonymousClass6SR r3 = this.A00;
        if (r3.A0B.getAndSet(r5) != r5) {
            try {
                r3.A0A.set(r5.A00);
                r3.A09.set(r3.A07.now());
            } finally {
                this.A01.Bex(r5);
            }
        }
    }
}
