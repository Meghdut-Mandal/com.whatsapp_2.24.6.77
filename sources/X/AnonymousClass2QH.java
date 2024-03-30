package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2QH  reason: invalid class name */
public final class AnonymousClass2QH extends C20890yK {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public AnonymousClass2QH() {
        super(3176, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(1, this.A00);
        r3.Bpz(2, this.A01);
        r3.Bpz(3, this.A02);
        r3.Bpz(4, this.A03);
    }

    public static void A00(AnonymousClass17X r3, AnonymousClass2QH r4, Object obj) {
        int A0A = r3.A07.A0A((AnonymousClass144) obj);
        int i = 16;
        if (A0A < 4) {
            i = 1;
        } else if (A0A < 8) {
            i = 2;
        } else if (A0A < 16) {
            i = 3;
        } else if (A0A < 32) {
            i = 4;
        } else if (A0A < 64) {
            i = 5;
        } else if (A0A < 128) {
            i = 6;
        } else if (A0A < 256) {
            i = 7;
        } else if (A0A < 512) {
            i = 8;
        } else if (A0A < 1000) {
            i = 9;
        } else if (A0A < 1500) {
            i = 10;
        } else if (A0A < 2000) {
            i = 11;
        } else if (A0A < 2500) {
            i = 12;
        } else if (A0A < 3000) {
            i = 13;
        } else if (A0A < 3500) {
            i = 14;
        } else if (A0A < 4000) {
            i = 15;
        } else if (A0A >= 4500) {
            i = 18;
            if (A0A < 5000) {
                i = 17;
            }
        }
        r4.A02 = Integer.valueOf(i);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0M(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamE2eeSystemMessage {");
        C20910yM.A00(C36331k8.A0h(this.A00), "chatCategory", A0u);
        C20910yM.A00(C36331k8.A0h(this.A01), "e2eeDialogInteraction", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "e2eeSystemMessageGroupSizeBucket", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A03), "e2eeSystemMessageType", A0u);
    }
}
