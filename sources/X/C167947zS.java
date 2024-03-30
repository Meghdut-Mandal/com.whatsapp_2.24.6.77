package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;

/* renamed from: X.7zS  reason: invalid class name and case insensitive filesystem */
public final class C167947zS extends C02920Ck {
    public final CategoryThumbnailLoader A00;
    public final C006302t A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167947zS(CategoryThumbnailLoader categoryThumbnailLoader, C006302t r3) {
        super((C02830Cb) C167917zP.A00);
        AnonymousClass00C.A0D(categoryThumbnailLoader, 1);
        this.A00 = categoryThumbnailLoader;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass8X1(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A00, this.A01);
        }
        if (i == 1) {
            return new C174448Wx(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
        }
        if (i == 6) {
            return new C174468Wz(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A01);
        }
        if (i == 7) {
            return new C174438Ww(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false));
        }
        throw AnonymousClass000.A0d("Invalid item viewtype: ", AnonymousClass000.A0u(), i);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        AnonymousClass80B r22 = (AnonymousClass80B) r2;
        AnonymousClass00C.A0D(r22, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        r22.A0B((AnonymousClass9EP) A0L);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9EP) A0L(i)).A00;
    }
}
