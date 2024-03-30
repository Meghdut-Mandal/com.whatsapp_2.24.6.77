package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.8TS  reason: invalid class name */
public class AnonymousClass8TS extends C33991gH {
    public final /* synthetic */ ProductDetailActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TS(Context context, ProductDetailActivity productDetailActivity) {
        super(context);
        this.A00 = productDetailActivity;
    }

    public void onClick(View view) {
        ProductDetailActivity productDetailActivity = this.A00;
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(new A9F(productDetailActivity), true);
        productDetailActivity.A04 = postcodeChangeBottomSheet;
        C167637yT.A01(productDetailActivity.A03, postcodeChangeBottomSheet, (String) productDetailActivity.A03.A04.A04());
        PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = productDetailActivity.A04;
        postcodeChangeBottomSheet2.A0B = productDetailActivity.A0q;
        C65443Sb.A00(postcodeChangeBottomSheet2, productDetailActivity);
    }
}
