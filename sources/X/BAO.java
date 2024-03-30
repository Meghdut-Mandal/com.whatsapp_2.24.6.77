package X;

import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;

public class BAO implements C159227j1 {
    public Object A00;
    public final int A01;

    public BAO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXn(String str, int i) {
        if (this.A01 != 0) {
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) this.A00;
            if (AnonymousClass00C.A0J(str, productBottomSheetViewModel.A04)) {
                C198909eO r1 = productBottomSheetViewModel.A0M;
                C198909eO.A00(r1, new C22349AlC(r1));
                productBottomSheetViewModel.A0U(true);
            }
        }
    }

    public void BXo(AnonymousClass9NZ r6, String str) {
        if (this.A01 != 0) {
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) this.A00;
            if (AnonymousClass00C.A0J(str, productBottomSheetViewModel.A04)) {
                C207269up A06 = productBottomSheetViewModel.A0I.A06(productBottomSheetViewModel.A03, str);
                productBottomSheetViewModel.A02 = A06;
                if (A06 == null || productBottomSheetViewModel.A0U(false)) {
                    C198909eO r1 = productBottomSheetViewModel.A0M;
                    C198909eO.A00(r1, new C22349AlC(r1));
                    return;
                }
                if (!productBottomSheetViewModel.A08) {
                    productBottomSheetViewModel.A01 = productBottomSheetViewModel.A02;
                }
                C198909eO r12 = productBottomSheetViewModel.A0M;
                C198909eO.A00(r12, new C22464An3(r12, false));
                productBottomSheetViewModel.A0F.A0C((Object) null);
                productBottomSheetViewModel.A09 = true;
                productBottomSheetViewModel.A08 = true;
                ProductBottomSheetViewModel.A01(productBottomSheetViewModel);
                return;
            }
            return;
        }
        AnonymousClass9N7 r3 = (AnonymousClass9N7) this.A00;
        C207269up A0N = C165617ti.A0N(r3.A01, str);
        if (A0N != null) {
            C36391kE.A1R(r3.A04, r3, A0N, 48);
        }
    }
}
