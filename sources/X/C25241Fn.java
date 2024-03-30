package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Fn  reason: invalid class name and case insensitive filesystem */
public final class C25241Fn {
    public final C19970wo A00;
    public final C20650xu A01;
    public final AnonymousClass1DQ A02;
    public final C25251Fo A03;
    public final AnonymousClass1EU A04;
    public final AnonymousClass005 A05;
    public final C19730wQ A06;

    public C25241Fn(C19730wQ r2, C19970wo r3, C20650xu r4, AnonymousClass1DQ r5, C25251Fo r6, AnonymousClass1EU r7, AnonymousClass005 r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r6, 7);
        this.A00 = r3;
        this.A06 = r2;
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = r6;
    }

    public final synchronized void A01(AnonymousClass3T1 r13) {
        String str;
        AnonymousClass16X r0;
        AnonymousClass00C.A0D(r13, 0);
        C202319lY r6 = r13.A0M;
        if (!(r6 == null || (str = r6.A0M) == null || str.length() == 0)) {
            AnonymousClass1EU r02 = this.A04;
            AnonymousClass1EU.A00(r02);
            C24881Ed r5 = r02.A05;
            AnonymousClass00C.A08(r5);
            C202319lY A0L = r5.A0L(r6.A0M, (String) null, -1);
            if (A0L != null) {
                AnonymousClass3T1 A002 = ((AnonymousClass1VZ) this.A05.get()).A00(A0L);
                if (r6.A0G()) {
                    int i = A0L.A02;
                    AnonymousClass16X r1 = r6.A08;
                    if (!(i == 18 || (r0 = A0L.A08) == null || !r0.equals(r1))) {
                        if (A002 != null) {
                            if (r6.A0L()) {
                                A0L.A02 = 17;
                                A0L.A06 = C19970wo.A00(this.A00);
                                A002.A0M = A0L;
                            }
                            C64933Qa r7 = A002.A1J;
                            C202319lY r62 = A002.A0M;
                            C18740tg.A06(r62);
                            if (r5.A0d(r62, r7, i, 0, 0)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                sb.append(A0L.A0L);
                                Log.i(C24611Dc.A01("CoreMessageStore", sb.toString()));
                                this.A02.A01(A002, 16);
                            }
                        } else {
                            if (r6.A0L()) {
                                A0L.A02 = 17;
                                A0L.A06 = C19970wo.A00(this.A00);
                            }
                            if (r5.A0a(A0L)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                                sb2.append(A0L.A0L);
                                Log.i(C24611Dc.A01("CoreMessageStore", sb2.toString()));
                                C25251Fo r3 = this.A03;
                                r3.A06.Boy(new C35761jD(r3, A0L, 3));
                            }
                        }
                    }
                } else if (A002 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    sb3.append(A0L.A0L);
                    sb3.append(" status: ");
                    sb3.append(r6.A02);
                    Log.i(C24611Dc.A01("PaymentRequestMessageManager", sb3.toString()));
                    this.A02.A01(A002, 16);
                }
                this.A01.A0K(A002);
            }
        }
    }

    public static final boolean A00(C25241Fn r2, C202319lY r3, AnonymousClass3T1 r4) {
        int i;
        C19730wQ r0 = r2.A06;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        if (phoneUserJid == null || (AnonymousClass143.A0G(r4.A1J.A00) && !phoneUserJid.equals(r3.A0E) && !phoneUserJid.equals(r3.A0D))) {
            return false;
        }
        if (r4 instanceof C180978mj) {
            i = 15;
        } else if (r4 instanceof C180968mi) {
            i = 18;
        } else {
            throw new IllegalStateException(C24611Dc.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
        }
        r3.A02 = i;
        return true;
    }
}
