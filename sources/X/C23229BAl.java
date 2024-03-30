package X;

/* renamed from: X.BAl  reason: case insensitive filesystem */
public class C23229BAl implements B2I {
    public Object A00;
    public final int A01;

    public C23229BAl(C20984A1y a1y, int i) {
        this.A01 = i;
        this.A00 = a1y;
    }

    public void B6O() {
        C20980A1u a1u;
        if (this.A01 == 0 && (a1u = ((C20984A1y) this.A00).A0G) != null && !a1u.A03) {
            C204269pj r2 = a1u.A05;
            r2.A0D = true;
            r2.A05.post(r2.A06);
            A23 a23 = a1u.A00;
            if (a23 != null) {
                C20983A1x a1x = a1u.A01;
                a1x.A00(a1x.A00, a23);
            }
            a1u.A03 = true;
            a1u.A04 = false;
        }
    }
}
