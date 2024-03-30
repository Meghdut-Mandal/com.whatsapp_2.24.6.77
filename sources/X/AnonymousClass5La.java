package X;

import java.util.Map;

/* renamed from: X.5La  reason: invalid class name */
public final class AnonymousClass5La extends AnonymousClass12N {
    public final Map A00 = C36431kI.A1G();
    public final Map A01 = C36431kI.A1G();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5La(C220112n r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
        A08();
    }

    public void Bjh(AnonymousClass5SK r2, boolean z) {
        this.A00.clear();
        this.A01.clear();
    }

    public String BHv() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIStickersCache - ");
        C90504aG.A1N(A0u, this.A01);
        return AnonymousClass000.A0q(" items", A0u);
    }
}
