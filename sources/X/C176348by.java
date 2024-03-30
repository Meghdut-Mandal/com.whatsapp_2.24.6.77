package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8by  reason: invalid class name and case insensitive filesystem */
public final class C176348by extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Long A04;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A03);
        r3.Bpz(4, this.A04);
        r3.Bpz(6, this.A00);
        r3.Bpz(7, this.A01);
        r3.Bpz(8, this.A02);
    }

    public C176348by() {
        super(4362, C36331k8.A0H(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0T(C36401kF.A0j(), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A03);
        C36321k7.A1b(A1G, 3);
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36341k9.A0a(C36331k8.A0V(C36331k8.A0U(C36371kC.A0o(), this.A04, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A00, A1G), this.A01, A1G), this.A02);
        C36321k7.A1b(A1G, 9);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBizTrustSignalCard {");
        C20910yM.A00(C36331k8.A0h(this.A03), "bizTrustSignalCardEventType", A0u);
        C20910yM.A00(this.A04, "businessPhoneNumber", A0u);
        C20910yM.A00(this.A00, "shownFacebookLikes", A0u);
        C20910yM.A00(this.A01, "shownInstagramFollowers", A0u);
        return C36321k7.A0C(this.A02, "shownJoinDate", A0u);
    }
}
