package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Qp  reason: invalid class name and case insensitive filesystem */
public final class C45242Qp extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;

    public C45242Qp() {
        super(3496, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A00);
        r3.Bpz(1, this.A01);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A03);
        r3.Bpz(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0L(C36331k8.A0K(C36331k8.A0J(C36371kC.A0o(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamCommunityTabAction {");
        C20910yM.A00(this.A00, "communityNoActionTabViews", A0u);
        C20910yM.A00(this.A01, "communityTabGroupNavigations", A0u);
        C20910yM.A00(this.A02, "communityTabToHomeViews", A0u);
        C20910yM.A00(this.A03, "communityTabViews", A0u);
        return C36321k7.A0C(this.A04, "communityTabViewsViaContextMenu", A0u);
    }
}