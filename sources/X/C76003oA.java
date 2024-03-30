package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3oA  reason: invalid class name and case insensitive filesystem */
public final class C76003oA implements AnonymousClass4OM {
    public long A00;
    public final RecyclerView A01;
    public final C32131d1 A02;
    public final C68213bX A03 = new C68213bX();
    public final C40881wG A04;
    public final C40381vS A05;
    public final boolean A06;
    public final C19970wo A07;
    public final C18820ts A08;

    public C76003oA(RecyclerView recyclerView, AnonymousClass30A r10, AnonymousClass1RY r11, C19970wo r12, C18820ts r13, C32131d1 r14, boolean z) {
        C36321k7.A18(r10, r12, r13, r11);
        C36321k7.A10(recyclerView, r14);
        this.A07 = r12;
        this.A08 = r13;
        this.A06 = z;
        this.A01 = recyclerView;
        this.A02 = r14;
        C18800tq r0 = r10.A00.A00;
        AnonymousClass17Y A0M = C36351kA.A0M(r0);
        C19770wU A0Z = C36341k9.A0Z(r0);
        AnonymousClass16D A0R = C36341k9.A0R(r0);
        this.A04 = new C40881wG((AnonymousClass30B) r0.A00.A2v.get(), A0M, A0R, r11, this, A0Z, z);
        this.A05 = new C40381vS(recyclerView.getContext(), r13);
    }

    public final void A00() {
        RecyclerView recyclerView = this.A01;
        C18820ts r1 = this.A08;
        recyclerView.setLayoutDirection(C36401kF.A1X(r1) ? 1 : 0);
        recyclerView.setAdapter(this.A04);
        recyclerView.setItemAnimator((C02800By) null);
        new C95754mE(r1).A07(recyclerView);
    }

    public final void A01(List list) {
        RecyclerView recyclerView = this.A01;
        C68213bX r1 = this.A03;
        recyclerView.A13.remove(r1);
        if (recyclerView.A0K == r1) {
            recyclerView.A0K = null;
        }
        C40881wG r12 = this.A04;
        r12.A00 = 0;
        r12.A01 = list;
        r12.A06();
    }
}
