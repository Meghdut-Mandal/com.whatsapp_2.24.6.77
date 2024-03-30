package X;

import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8ql  reason: invalid class name and case insensitive filesystem */
public class C183418ql extends C132446Tt {
    public final /* synthetic */ C178848hw A00;

    public C183418ql(C178848hw r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C165577te.A0o(this.A00.A0P);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C207249un r0;
        C175898bF r1;
        int i;
        List list = (List) obj;
        if (list == null || list.size() == 0) {
            C178848hw r2 = this.A00;
            r2.A0g.A06("PopulateMethodsForSend could not find methods;");
            r2.finish();
            return;
        }
        C178848hw r3 = this.A00;
        C24611Dc r4 = r3.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("onPostExecute got methods: ", A0u, list);
        C165607th.A1E(r4, A0u);
        ArrayList A08 = C207249un.A08(r3.A0N.A02(), list);
        r3.A0i = A08;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("onPostExecute got paymentMethodList for store: ");
        r4.A04(AnonymousClass000.A0o(Integer.valueOf(A08.size()), A0u2));
        List list2 = r3.A0i;
        if (list2 != null && list2.size() > 0) {
            boolean z = false;
            if (r3.A0B != null) {
                Iterator it = r3.A0i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C207249un A0S = C165607th.A0S(it);
                    if (A0S.A0A.equals(r3.A0B.A0A)) {
                        r3.A0i.remove(A0S);
                        break;
                    }
                }
                r3.A0i.add(0, r3.A0B);
            } else {
                if (C179148jG.A1P(r3)) {
                    List list3 = r3.A0i;
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            r0 = AnonymousClass16S.A02(list3);
                            break;
                        }
                        r0 = C165607th.A0S(it2);
                        if ((r0 instanceof C175748az) && (r1 = r0.A08) != null && ((C175818b6) r1).A0G) {
                            break;
                        }
                    }
                } else {
                    r0 = (C207249un) r3.A0i.get(0);
                }
                r3.A0B = r0;
            }
            if (r3.A0U != null) {
                Iterator it3 = r3.A0i.iterator();
                while (it3.hasNext()) {
                    C207249un A0S2 = C165607th.A0S(it3);
                    C199799fz r02 = r3.A0G;
                    String str = A0S2.A0A;
                    AnonymousClass00C.A0D(str, 0);
                    if (!C90514aH.A16(r02.A01).containsKey(str)) {
                        r3.A0i.remove(A0S2);
                    }
                }
            }
            PaymentView paymentView = r3.A0M;
            if (paymentView != null) {
                paymentView.setBankLogo(r3.A0B.A0A());
                PaymentView paymentView2 = r3.A0M;
                C199849g7 r7 = r3.A0K;
                List list4 = r3.A0i;
                C207249un r42 = r3.A0B;
                if (r42 != null) {
                    i = 0;
                    while (true) {
                        if (i < list4.size()) {
                            if (((C207249un) list4.get(i)).A0A.equals(r42.A0A)) {
                                break;
                            }
                            i++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                } else {
                    i = C203449o2.A01(list4);
                }
                C207249un r12 = (C207249un) list4.get(i);
                AnonymousClass00C.A0D(r12, 0);
                paymentView2.setPaymentMethodText(r7.A02(r12, true));
                PaymentView paymentView3 = r3.A0M;
                if (r3.A0B == null) {
                    z = true;
                }
                paymentView3.A0I(z);
                PaymentView paymentView4 = r3.A0M;
                if (paymentView4.A00 != 1) {
                    paymentView4.A0C();
                }
            }
        }
        r3.A0J = null;
    }
}
