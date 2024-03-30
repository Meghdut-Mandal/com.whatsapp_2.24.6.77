package X;

import java.util.Map;

/* renamed from: X.5Lb  reason: invalid class name */
public final class AnonymousClass5Lb extends AnonymousClass12N {
    public final Map A00 = new AnonymousClass166(12);
    public final Map A01 = new AnonymousClass166(12);
    public final Map A02 = new AnonymousClass166(12);

    public String BHv() {
        String A10;
        synchronized (this) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("LinkedAccountMediaCacheManager=");
            C90504aG.A1N(A0u, this.A00);
            A0u.append(",");
            C90504aG.A1N(A0u, this.A02);
            A0u.append(",");
            A10 = C36381kD.A10(A0u, this.A01.size());
        }
        return A10;
    }

    public void Bjh(AnonymousClass5SK r2, boolean z) {
        synchronized (this) {
            this.A00.clear();
            this.A02.clear();
            this.A01.clear();
        }
    }

    public AnonymousClass5Lb(C220112n r3) {
        super(r3);
        A08();
    }
}
