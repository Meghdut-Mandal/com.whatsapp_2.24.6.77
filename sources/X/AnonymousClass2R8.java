package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2R8  reason: invalid class name */
public final class AnonymousClass2R8 extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2R8() {
        super(2472, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(5, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(2, this.A03);
        r3.Bpz(3, this.A02);
        r3.Bpz(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0L(C36331k8.A0K(C36331k8.A0M(C36371kC.A0p(), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A02, A1G), this.A04);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUserNotice {");
        C20910yM.A00(C36331k8.A0h(this.A00), "noticeTriggeredBy", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "noticeType", A0u);
        C20910yM.A00(this.A03, "userNoticeContentVersion", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "userNoticeEvent", A0u);
        return C36321k7.A0C(this.A04, "userNoticeId", A0u);
    }
}
