package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cP  reason: invalid class name and case insensitive filesystem */
public final class C176618cP extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;

    public C176618cP() {
        super(3006, C36431kI.A0q(), 2, 0);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(14, this.A04);
        r3.Bpz(13, this.A00);
        r3.Bpz(2, this.A05);
        r3.Bpz(11, this.A01);
        r3.Bpz(10, this.A0B);
        r3.Bpz(3, this.A0C);
        r3.Bpz(1, this.A06);
        r3.Bpz(15, this.A0D);
        r3.Bpz(16, this.A0E);
        r3.Bpz(12, this.A07);
        r3.Bpz(22, this.A08);
        r3.Bpz(20, this.A0F);
        r3.Bpz(21, this.A0G);
        r3.Bpz(23, this.A02);
        r3.Bpz(5, this.A03);
        r3.Bpz(4, this.A0H);
        r3.Bpz(9, this.A0I);
        r3.Bpz(17, this.A0J);
        r3.Bpz(6, this.A09);
        r3.Bpz(18, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(14, this.A04, A1G), this.A00);
        C36321k7.A1b(A1G, 19);
        A1G.put(C36331k8.A0S(C36331k8.A0T(C36361kB.A0j(), this.A05, A1G), this.A01, A1G), this.A0B);
        C36321k7.A1b(A1G, 8);
        A1G.put(C90484aE.A0d(C36411kG.A0s(C36401kF.A0l(C90474aD.A0X(C36331k8.A0U(C36351kA.A0s(C36341k9.A0b(C36331k8.A0J(C36371kC.A0n(), this.A0C, A1G), this.A06, A1G), this.A0D, A1G), this.A0E, A1G), this.A07, A1G), this.A08, A1G), this.A0F, A1G), this.A0G, A1G), this.A02);
        C36321k7.A1b(A1G, 7);
        A1G.put(C36371kC.A0q(C36331k8.A0O(C36351kA.A0t(C36331k8.A0R(C36331k8.A0M(C36371kC.A0p(), this.A03, A1G), this.A0H, A1G), this.A0I, A1G), this.A0J, A1G), this.A09, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamBizCatalogView {");
        C20910yM.A00(C36331k8.A0h(this.A04), "bizPlatform", A0u);
        C20910yM.A00(this.A00, "cartToggle", A0u);
        C20910yM.A00(C36331k8.A0h(this.A05), "catalogEntryPoint", A0u);
        C20910yM.A00(this.A01, "catalogEventSampled", A0u);
        C20910yM.A00(this.A0B, "catalogOwnerJid", A0u);
        C20910yM.A00(this.A0C, "catalogSessionId", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "catalogViewAction", A0u);
        C20910yM.A00(this.A0D, "collectionId", A0u);
        C20910yM.A00(this.A0E, "collectionIndex", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "deepLinkOpenFrom", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "entryPointConversationInitiated", A0u);
        C20910yM.A00(this.A0F, "entryPointConversionApp", A0u);
        C20910yM.A00(this.A0G, "entryPointConversionSource", A0u);
        C20910yM.A00(this.A02, "hasVariants", A0u);
        C20910yM.A00(this.A03, "isOrderMsgAttached", A0u);
        C20910yM.A00(this.A0H, "orderId", A0u);
        C20910yM.A00(this.A0I, "productId", A0u);
        C20910yM.A00(this.A0J, "productIndex", A0u);
        C20910yM.A00(this.A09, "quantity", A0u);
        return C36321k7.A0C(this.A0A, "sequenceNumber", A0u);
    }
}
