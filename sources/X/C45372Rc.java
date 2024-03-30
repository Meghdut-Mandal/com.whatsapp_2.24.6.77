package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Rc  reason: invalid class name and case insensitive filesystem */
public final class C45372Rc extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C45372Rc() {
        super(3398, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A02);
        r3.Bpz(2, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A03);
        r3.Bpz(5, this.A04);
        r3.Bpz(7, this.A05);
        r3.Bpz(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0N(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A02, A1G), this.A00, A1G), this.A01, A1G), this.A03, A1G), this.A04);
        C36321k7.A1b(A1G, 9);
        A1G.put(C36331k8.A0Q(C36401kF.A0h(), this.A05, A1G), this.A06);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamDisappearingMessageChatPicker {");
        C20910yM.A00(this.A02, "chatsSelected", A0u);
        C20910yM.A00(C36331k8.A0h(this.A00), "dmChatPickerEntryPoint", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "dmChatPickerEventName", A0u);
        C20910yM.A00(this.A03, "ephemeralityDuration", A0u);
        C20910yM.A00(this.A04, "groupChatsSelected", A0u);
        C20910yM.A00(this.A05, "newlyEphemeralChats", A0u);
        return C36321k7.A0C(this.A06, "totalChatsInChatPicker", A0u);
    }
}
