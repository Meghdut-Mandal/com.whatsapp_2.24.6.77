package X;

import android.content.Context;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9vS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207589vS implements AnonymousClass07G {
    public final /* synthetic */ ProductBottomSheet A00;

    public /* synthetic */ C207589vS(ProductBottomSheet productBottomSheet) {
        this.A00 = productBottomSheet;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        ProductBottomSheet productBottomSheet = this.A00;
        if (menuItem.getItemId() != R.id.action_see_more_details) {
            return false;
        }
        ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A08;
        if (productBottomSheetViewModel == null) {
            throw C36331k8.A0a();
        }
        Context A0a = productBottomSheet.A0a();
        C207269up r0 = productBottomSheetViewModel.A02;
        if (r0 == null || (str = r0.A0F) == null) {
            return true;
        }
        UserJid userJid = productBottomSheetViewModel.A03;
        if (userJid != null) {
            boolean A0M = productBottomSheetViewModel.A0G.A0M(userJid);
            AnonymousClass3SM.A03(A0a, productBottomSheetViewModel.A0H, productBottomSheetViewModel.A0N, userJid, (Integer) null, (Integer) null, str, 3, A0M, A0M, false);
        }
        C64183Mz.A00(productBottomSheetViewModel.A0L, productBottomSheetViewModel.A03, 47);
        return true;
    }
}
