package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.9Ux  reason: invalid class name and case insensitive filesystem */
public abstract class C195559Ux {
    public void A00(String str) {
        C207269up A0N;
        AnonymousClass8VI r0;
        B77 b77 = (B77) this;
        switch (b77.A01) {
            case 0:
                AnonymousClass8W7 r2 = (AnonymousClass8W7) b77.A00;
                C207269up A0N2 = C165617ti.A0N(r2.A0B, str);
                if (A0N2 != null) {
                    r2.A0H.A0T(A0N2);
                    return;
                }
                return;
            case 1:
                AnonymousClass8WH r22 = (AnonymousClass8WH) b77.A00;
                if (str.equals(r22.A0y)) {
                    r22.A0U = r22.A0S.A06(r22.A0q, str);
                    r22.A3i();
                    return;
                }
                return;
            case 2:
                C174338Wd r1 = (C174338Wd) b77.A00;
                A0N = C165617ti.A0N(r1.A0C, str);
                if (A0N != null) {
                    r0 = r1.A0I;
                    break;
                } else {
                    return;
                }
            default:
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) b77.A00;
                C29461Ws r02 = businessProductListBaseFragment.A06;
                if (r02 != null) {
                    A0N = C165617ti.A0N(r02, str);
                    if (A0N != null) {
                        r0 = businessProductListBaseFragment.A1Z();
                        break;
                    } else {
                        return;
                    }
                } else {
                    throw C36331k8.A0d("catalogCacheManager");
                }
        }
        r0.A0S(A0N);
    }
}
