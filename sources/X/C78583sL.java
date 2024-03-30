package X;

import com.whatsapp.util.Log;

/* renamed from: X.3sL  reason: invalid class name and case insensitive filesystem */
public final class C78583sL implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public void BmI(AnonymousClass3T1 r7, C52942qQ r8) {
        boolean z;
        AnonymousClass00C.A0D(r7, 0);
        C202319lY r5 = r7.A0M;
        if (r5 != null) {
            synchronized (r5) {
                z = r5.A0O;
            }
            if (z) {
                AnonymousClass1EU r0 = (AnonymousClass1EU) this.A03.get();
                AnonymousClass1EU.A00(r0);
                C24881Ed r1 = r0.A05;
                AnonymousClass00C.A08(r1);
                r1.A0M(r7, true);
                r5.A0F(false);
                ((C25241Fn) this.A02.get()).A01(r7);
                C175708av r02 = r5.A0A;
                if (!(r02 == null || r02.A02 == null || 200 != r5.A03)) {
                    C18740tg.A00();
                    C175708av r2 = r5.A0A;
                    C18740tg.A06(r2);
                    C207259uo r03 = r2.A02;
                    C18740tg.A06(r03);
                    AnonymousClass2bZ A012 = ((AnonymousClass1FF) this.A01.get()).A01(r03.A02);
                    if (A012 != null) {
                        C207219uk r04 = A012.A00;
                        C18740tg.A06(r04);
                        C18740tg.A06(r04);
                        C207199ui r3 = r04.A01;
                        if (r3 != null) {
                            String str = r5.A0K;
                            String str2 = r3.A06;
                            if (str2 == null || str2.length() == 0 || !str2.equals(str)) {
                                r3.A06 = str;
                                ((AnonymousClass1F3) this.A00.get()).A0D(A012, A012.A1N);
                            }
                        } else {
                            Log.e("PaymentsDatabaseInserterPostProcessor/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY");
                        }
                    }
                }
                if (r8 != null) {
                    throw C36321k7.A04(C78583sL.class);
                }
            }
        }
    }

    public C78583sL(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }
}
