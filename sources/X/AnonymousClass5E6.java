package X;

import java.util.List;

/* renamed from: X.5E6  reason: invalid class name */
public final class AnonymousClass5E6 extends AnonymousClass5EQ {
    public final C135016bz A00;
    public final AnonymousClass6QG A01;
    public final List A02;
    public final AnonymousClass00S A03;
    public final C019408g A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj)) && super.equals(obj)) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.viewdata.SERPMapEntryPointViewItem");
                AnonymousClass5E6 r5 = (AnonymousClass5E6) obj;
                if (!C1901797e.A00(this.A00, r5.A00) || !C1901797e.A00(this.A01, r5.A01) || !C1901797e.A00(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E6(C135016bz r2, AnonymousClass6QG r3, List list, AnonymousClass00S r5, C019408g r6) {
        super(73);
        C36321k7.A18(r5, r2, r3, list);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = list;
        this.A04 = r6;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A00;
        A1Q[1] = this.A02;
        return C90484aE.A0D(this.A01, A1Q);
    }
}
