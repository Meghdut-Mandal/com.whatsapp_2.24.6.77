package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class B7N extends C178498gd {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7N(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, AnonymousClass8gI r12, C199359fB r13, AnonymousClass9FL r14, Integer num) {
        super(context, r9, r10, r11, "pay-precheck");
        this.A00 = r12;
        this.A01 = r14;
        this.A03 = r13;
        this.A02 = num;
    }

    public void A05(C202059ky r8) {
        C202059ky r3 = r8;
        if (this.A04 != 0) {
            super.A05(r8);
            A08(r8);
            ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, r3, (String) null, (String) null, false);
            return;
        }
        AnonymousClass00C.A0D(r8, 0);
        super.A05(r8);
        ((AnonymousClass8gF) this.A03).A06.A01(r8, (Integer) this.A01, "upi-get-p2m-checkout-session");
        ((B1M) this.A00).BWg(r8);
    }

    public void A06(C202059ky r8) {
        C202059ky r3 = r8;
        if (this.A04 != 0) {
            super.A06(r8);
            A08(r8);
            ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, r3, (String) null, (String) null, false);
            return;
        }
        AnonymousClass00C.A0D(r8, 0);
        super.A06(r8);
        ((AnonymousClass8gF) this.A03).A06.A01(r8, (Integer) this.A01, "upi-get-p2m-checkout-session");
        ((B1M) this.A00).BWg(r8);
    }

    public void A07(C203399nx r19) {
        C199359fB r1;
        String str;
        C175698au r9;
        String str2;
        String str3;
        C199359fB r12;
        C203399nx r2 = r19;
        if (this.A04 != 0) {
            super.A07(r2);
            try {
                C203399nx A0c = r2.A0c("account");
                if (A0c == null) {
                    Log.e("PAY: IndiaUpiPayPrecheckAction sendPrecheck: empty account node");
                    A08((C202059ky) null);
                    ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, C202059ky.A00(), (String) null, (String) null, false);
                    return;
                }
                C175718aw r8 = new C175718aw();
                AnonymousClass8gI r4 = (AnonymousClass8gI) this.A00;
                AnonymousClass16T r10 = r4.A05;
                r8.A04(r10, A0c, 8);
                C203399nx A0c2 = A0c.A0c("transaction");
                C203399nx A0c3 = A0c.A0c("upi");
                C203399nx A0c4 = A0c.A0c("account");
                C202059ky A012 = C202059ky.A01(A0c);
                C203399nx A0c5 = A0c.A0c("offer_eligibility");
                if (A0c2 == null || A0c3 == null) {
                    Bundle bundle = r8.A00;
                    if (bundle != null && bundle.getString("updatedVpaFor") != null) {
                        C175698au r5 = new C175698au();
                        if (A0c4 != null) {
                            r5.A04(r10, A0c4, 0);
                        }
                        Bundle bundle2 = r8.A00;
                        if (bundle2 != null) {
                            str = bundle2.getString("updatedVpaFor");
                        } else {
                            str = null;
                        }
                        if ("sender".equals(str)) {
                            r9 = new C175698au();
                            r9.A04 = C36441kJ.A0n(r4.A02);
                            C146356vT A002 = C146356vT.A00();
                            Class<String> cls = String.class;
                            Bundle bundle3 = r8.A00;
                            if (bundle3 != null) {
                                str2 = bundle3.getString("updatedSenderVpa");
                            } else {
                                str2 = null;
                            }
                            C135086c7 A0P = C165617ti.A0P(A002, cls, str2, "upiHandle");
                            r9.A01 = A0P;
                            Bundle bundle4 = r8.A00;
                            if (bundle4 != null) {
                                str3 = bundle4.getString("updatedSenderVpaId");
                            } else {
                                str3 = null;
                            }
                            r9.A02 = str3;
                            r4.A09.A09((AnonymousClass1XD) null);
                            if (A0P.A00 == null) {
                                r9 = null;
                            } else {
                                r4.A07.A0I(A0P, r5.A02);
                            }
                            r5 = null;
                        } else if (r5.A04 != null) {
                            if (r5.A03) {
                                r5.A01 = null;
                                r5.A02 = null;
                            }
                            AnonymousClass9YB A013 = r4.A0A.A01();
                            C36391kE.A1Q(new C175608al(A013, r5), A013.A03);
                            r9 = null;
                        } else {
                            r9 = null;
                            r5 = null;
                        }
                        r4.A0C.A04((Integer) this.A02, "pay-precheck");
                        ((AnonymousClass9FL) this.A01).A00.A4X(r9, r5, (C202059ky) null, (String) null, (String) null, false);
                    } else if (A012 != null) {
                        if (A012.A00 == 2896004) {
                            AVX.A00(r4.A0E, this, 3);
                        }
                        if (!(A0c5 == null || (r1 = (C199359fB) this.A03) == null)) {
                            r4.A0B.A08((B1V) null, A0c5, r1.A01);
                        }
                        A08(A012);
                        ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, A012, (String) null, (String) null, false);
                    } else {
                        A08((C202059ky) null);
                        ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, C202059ky.A00(), (String) null, (String) null, false);
                    }
                } else {
                    String A0h = A0c2.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    String A0h2 = A0c3.A0h("token");
                    if (!(A0c5 == null || (r12 = (C199359fB) this.A03) == null)) {
                        r4.A0B.A08((B1V) null, A0c5, r12.A01);
                    }
                    r4.A0C.A04((Integer) this.A02, "pay-precheck");
                    ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, (C202059ky) null, A0h, A0h2, AnonymousClass000.A1V(A0c5));
                }
            } catch (C235919b unused) {
                A08((C202059ky) null);
                ((AnonymousClass9FL) this.A01).A00.A4X((C175698au) null, (C175698au) null, C202059ky.A00(), (String) null, (String) null, false);
            }
        } else {
            AnonymousClass00C.A0D(r2, 0);
            super.A07(r2);
            try {
                ArrayList arrayList = C186238vd.A06;
                C186238vd r42 = new C186238vd(r2, (C185968vC) this.A02);
                ((AnonymousClass8gF) this.A03).A06.A02((Integer) this.A01, "upi-get-p2m-checkout-session", 2);
                ((B1M) this.A00).BfF(r42);
            } catch (C235919b unused2) {
                Log.e("PAY: IndiaUpiGetP2mCheckoutSessionAction/getCheckoutSession: invalid response message");
                C202059ky A003 = C202059ky.A00();
                ((AnonymousClass8gF) this.A03).A06.A01(A003, (Integer) this.A01, "upi-get-p2m-checkout-session");
                ((B1M) this.A00).BWg(A003);
            }
        }
    }

    public void A08(C202059ky r4) {
        ((AnonymousClass8gI) this.A00).A0C.A02.A01(r4, (Integer) this.A02, "pay-precheck");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7N(Context context, AnonymousClass17Y r9, C29221Vu r10, AnonymousClass9YX r11, B1M b1m, AnonymousClass8gF r13, C185968vC r14, Integer num) {
        super(context, r9, r10, r11, "upi-get-p2m-checkout-session");
        this.A03 = r13;
        this.A01 = num;
        this.A00 = b1m;
        this.A02 = r14;
    }
}
