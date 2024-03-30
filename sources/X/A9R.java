package X;

import com.whatsapp.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

public final /* synthetic */ class A9R implements AnonymousClass4PH {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ A9R(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    public final void Ben(String str) {
        ProductDetailActivity productDetailActivity = this.A00;
        C207269up r0 = productDetailActivity.A0U;
        if (r0 != null) {
            String str2 = r0.A0F;
            AnonymousClass9Y1 r02 = productDetailActivity.A0V;
            String str3 = r02.A02;
            String str4 = str;
            AnonymousClass9N9 r2 = new AnonymousClass9N9(productDetailActivity.A0q, str2, str4, str3, productDetailActivity.A0V.A0C.get(), (long) r02.A0D.getAndIncrement());
            if (productDetailActivity.A0W.A09(r2)) {
                productDetailActivity.Bu1(R.string.f12nameremoved);
            } else {
                productDetailActivity.A0W.A07(r2, false);
            }
        }
    }
}
