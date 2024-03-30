package X;

/* renamed from: X.6ub  reason: invalid class name and case insensitive filesystem */
public class C145836ub implements C159487jR {
    public final AnonymousClass6QG A00;
    public final /* synthetic */ C145896uh A01;

    public C145836ub(AnonymousClass6QG r1, C145896uh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWx(C1261662u r2, int i) {
        C159307j9 r0 = this.A01.A08;
        if (r0 != null) {
            r0.BSS(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C128836Du r5 = (C128836Du) obj;
        C145896uh r3 = this.A01;
        if (r3.A08 != null) {
            AnonymousClass6QG r2 = this.A00;
            if (r2 != null) {
                AnonymousClass1QW r1 = r3.A0N;
                if (r1.A02() && r1.A03.A0E(3400)) {
                    C131836Qv.A01(r2, r5.A09);
                }
            }
            r3.A08.BST(r5);
        }
    }
}
