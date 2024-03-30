package X;

import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7qM  reason: invalid class name and case insensitive filesystem */
public class C163537qM implements C158007fe {
    public Object A00;
    public final int A01;

    public C163537qM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bdy(long j) {
        long j2 = j;
        if (this.A01 != 0) {
            ProductBottomSheetViewModel productBottomSheetViewModel = ((ProductBottomSheet) this.A00).A08;
            if (productBottomSheetViewModel == null) {
                throw C36331k8.A0a();
            }
            productBottomSheetViewModel.A0S(j);
            return;
        }
        AnonymousClass8WH r2 = (AnonymousClass8WH) this.A00;
        C207269up A002 = C109915Zp.A00(r2.A0U, r2.A0T);
        C167647yU r0 = r2.A0h;
        UserJid userJid = r2.A0q;
        String str = r2.A0x;
        String str2 = r2.A0z;
        String str3 = r2.A0w;
        if (A002 == null) {
            C36331k8.A13(r0.A07);
        } else {
            r0.A0C.A01(A002, userJid, str, str2, str3, j2);
        }
    }
}
