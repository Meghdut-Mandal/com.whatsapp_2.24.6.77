package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8r5  reason: invalid class name and case insensitive filesystem */
public abstract class C183618r5 extends C132446Tt {
    public final C22935Ayl A00;
    public final AnonymousClass16S A01;
    public final PaymentConfiguration A02;
    public final C19770wU A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C192489He r3 = (C192489He) obj;
        C22935Ayl ayl = this.A00;
        if (ayl != null && r3.A01) {
            ayl.BR0(r3.A00);
        }
    }

    public C183618r5(C22935Ayl ayl, AnonymousClass16S r2, PaymentConfiguration paymentConfiguration, C19770wU r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = ayl;
    }

    public C192489He A0G(String str, List list) {
        B66 A002;
        ArrayList A0r = C36361kB.A0r(list);
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C207249un A0S = C165607th.A0S(it);
            B0z b0z = null;
            C198699e3 A003 = this.A02.A00(A0S.A07.A03);
            if (!(A003 == null || (A002 = C198699e3.A00(A003)) == null || (b0z = A002.BAK()) == null)) {
                b0z.B1i(A0S);
            }
            A0r.add(A0S);
            if (b0z != null && !A0J.containsKey(A0S.A07.A03)) {
                A0J.put(A0S.A07.A03, b0z);
            }
        }
        AnonymousClass16S r4 = this.A01;
        boolean A0J2 = r4.A0J(A0r);
        ArrayList A0v = C36401kF.A0v(A0r);
        if (A0J2 && A0r.size() > 0) {
            Iterator A10 = C36391kE.A10(A0J);
            while (A10.hasNext()) {
                ((B0z) A10.next()).B0s(str, A0r);
            }
            Iterator it2 = A0r.iterator();
            while (it2.hasNext()) {
                C207249un A0S2 = C165607th.A0S(it2);
                C207249un A07 = r4.A07(A0S2.A0A);
                C18740tg.A06(A07);
                A0v.add(A07);
                byte[] bArr = A07.A0D;
                if (bArr == null || bArr.length <= 0) {
                    this.A03.Boy(new C1503474x((Object) A0S2, (Object) this, (Object) A0J, (Object) A07, 40));
                }
            }
        }
        return new C192489He(A0v, A0J2);
    }
}
