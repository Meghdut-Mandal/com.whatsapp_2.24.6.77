package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QY  reason: invalid class name */
public final class AnonymousClass2QY extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(4, this.A00);
        r3.Bpz(2, this.A02);
        r3.Bpz(3, this.A01);
        r3.Bpz(1, this.A03);
    }

    public AnonymousClass2QY() {
        super(2474, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0L(C36331k8.A0K(C36371kC.A0o(), this.A00, A1G), this.A02, A1G), this.A01, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamUserNoticeError {");
        C20910yM.A00(C36331k8.A0h(this.A00), "noticeType", A0u);
        C20910yM.A00(this.A02, "userNoticeContentVersion", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "userNoticeErrorEvent", A0u);
        return C36321k7.A0C(this.A03, "userNoticeId", A0u);
    }
}
