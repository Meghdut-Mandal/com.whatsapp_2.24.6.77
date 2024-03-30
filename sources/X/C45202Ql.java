package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ql  reason: invalid class name and case insensitive filesystem */
public final class C45202Ql extends C20890yK {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C45202Ql() {
        super(4212, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(3, this.A01);
        r3.Bpz(4, this.A04);
        r3.Bpz(5, this.A02);
        r3.Bpz(1, this.A03);
        r3.Bpz(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0K(C36331k8.A0J(C36331k8.A0N(C36331k8.A0M(C36371kC.A0n(), this.A01, A1G), this.A04, A1G), this.A02, A1G), this.A03, A1G), this.A00);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamChatLockAction {");
        C20910yM.A00(C36331k8.A0h(this.A01), "actionEntryPoint", A0u);
        C20910yM.A00(this.A04, "actionFolderChatsCount", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "authType", A0u);
        C20910yM.A00(C36331k8.A0h(this.A03), "chatLockActionType", A0u);
        return C36321k7.A0C(this.A00, "chatLockIsGroup", A0u);
    }
}
