package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8c2  reason: invalid class name and case insensitive filesystem */
public final class C176388c2 extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public C176388c2() {
        super(3246, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A04);
        r3.Bpz(8, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0Q(C36331k8.A0P(C36331k8.A0O(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A03, A1G), this.A01, A1G), this.A02, A1G), this.A04, A1G), (Object) null, A1G), (Object) null, A1G), (Object) null, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUserActionsOnBusinessProfile {");
        C20910yM.A00(this.A03, "businessProfileDirectorySessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "businessProfileViewEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "businessProfileViewEventType", A0u);
        C20910yM.A00(this.A04, "businessRootCategory", A0u);
        return C36321k7.A0C(this.A00, "isAddedInContacts", A0u);
    }
}
