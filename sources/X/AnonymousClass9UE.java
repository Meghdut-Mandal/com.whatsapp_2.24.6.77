package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9UE  reason: invalid class name */
public final class AnonymousClass9UE {
    public final AnonymousClass1EU A00;
    public final AnonymousClass5FZ A01;
    public final C20810yC A02;

    public final boolean A01() {
        C20810yC r1 = this.A02;
        if (!r1.A0E(4781) || !r1.A0E(7024)) {
            return false;
        }
        return true;
    }

    public AnonymousClass9UE(C20810yC r1, AnonymousClass1EU r2, AnonymousClass5FZ r3) {
        C36321k7.A11(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final List A00(List list) {
        Object obj;
        ArrayList A0l = C36341k9.A0l(list);
        for (Object next : list) {
            C207249un r2 = (C207249un) next;
            if (r2 instanceof C175788b3) {
                C175788b3 r22 = (C175788b3) r2;
                AnonymousClass00C.A0D(r22, 0);
                if (A01() && AnonymousClass00C.A0J(C202159l8.A0E, r22.A07)) {
                    if (!"pix_key".equals(r22.A00)) {
                        C135086c7 r0 = r22.A09;
                        if (r0 != null) {
                            obj = r0.A00;
                        } else {
                            obj = null;
                        }
                        if (!"pix_key".equals(obj)) {
                        }
                    }
                    A0l.add(next);
                }
            }
        }
        ArrayList A0J = C36321k7.A0J(A0l);
        Iterator it = A0l.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            AnonymousClass00C.A0E(A0S, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMethodNonNative");
            C175788b3 r3 = (C175788b3) A0S;
            AnonymousClass00C.A0D(r3, 0);
            AnonymousClass8NN A0p = AnonymousClass8R4.DEFAULT_INSTANCE.A0p();
            String str = r3.A0A;
            AnonymousClass8R4 r1 = (AnonymousClass8R4) C90524aI.A0H(A0p);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.credentialId_ = str;
            String str2 = r3.A07.A03;
            AnonymousClass8R4 r12 = (AnonymousClass8R4) C90524aI.A0H(A0p);
            r12.bitField0_ |= 2;
            r12.country_ = str2;
            String str3 = r3.A00;
            if (TextUtils.isEmpty(str3)) {
                C135086c7 r02 = r3.A09;
                if (r02 != null) {
                    str3 = (String) r02.A00;
                } else {
                    str3 = null;
                }
            }
            AnonymousClass8R4 r13 = (AnonymousClass8R4) C90524aI.A0H(A0p);
            str3.getClass();
            r13.bitField0_ |= 4;
            r13.type_ = str3;
            C175898bF r14 = r3.A08;
            if (r14 instanceof C175838b9) {
                AnonymousClass00C.A0E(r14, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentCustomMethodCountryData");
                HashMap hashMap = ((C175838b9) r14).A03;
                AnonymousClass00C.A08(hashMap);
                Iterator A10 = C36371kC.A10(hashMap);
                while (A10.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A10);
                    AnonymousClass8NN A0p2 = C172868Pm.DEFAULT_INSTANCE.A0p();
                    String A0f = C90494aF.A0f(A11);
                    C172868Pm r15 = (C172868Pm) C90524aI.A0H(A0p2);
                    A0f.getClass();
                    r15.bitField0_ |= 1;
                    r15.key_ = A0f;
                    String str4 = ((C206859u7) A11.getValue()).A01;
                    C172868Pm r16 = (C172868Pm) C90524aI.A0H(A0p2);
                    str4.getClass();
                    r16.bitField0_ |= 2;
                    r16.value_ = str4;
                    C170918Hz A0R = A0p2.A0R();
                    AnonymousClass8R4 r23 = (AnonymousClass8R4) C90524aI.A0H(A0p);
                    A0R.getClass();
                    C23122B6c b6c = r23.metadata_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        r23.metadata_ = b6c;
                    }
                    b6c.add(A0R);
                }
            }
            A0J.add(A0p.A0R());
        }
        return A0J;
    }
}
