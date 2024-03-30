package X;

import android.content.Context;

/* renamed from: X.8gZ  reason: invalid class name */
public class AnonymousClass8gZ extends C178498gd {
    public final /* synthetic */ AnonymousClass9RS A00;
    public final /* synthetic */ AnonymousClass8gB A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8gZ(Context context, AnonymousClass17Y r8, AnonymousClass9RS r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gB r12, String str, String str2, boolean z) {
        super(context, r8, r10, r11, str);
        this.A01 = r12;
        this.A00 = r9;
        this.A03 = z;
        this.A02 = str2;
    }

    public void A05(C202059ky r3) {
        super.A05(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A06(C202059ky r3) {
        super.A06(r3);
        this.A00.A00(r3, this.A03);
    }

    public void A07(C203399nx r6) {
        super.A07(r6);
        C196129Xv r4 = this.A01.A03;
        C135086c7 A0P = C165617ti.A0P(C146356vT.A00(), String.class, this.A02, "upiHandle");
        boolean z = this.A03;
        r4.A02(A0P, z);
        AnonymousClass9RS r2 = this.A00;
        C36321k7.A1X("PAY: IndiaUpiBlockListManager/on-success blocked: ", AnonymousClass000.A0u(), z);
        r2.A01.A01.A09((C225014r) r2.A00);
        r2.A02.Bf8((C202059ky) null);
    }
}
