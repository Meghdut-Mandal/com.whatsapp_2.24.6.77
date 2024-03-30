package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.3dP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69363dP implements C22916AyS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C42661zB A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C69363dP(C42661zB r1, String str, Map map, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A04 = map;
        this.A03 = str;
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C42661zB r4 = this.A02;
        Map map = this.A04;
        String str = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        ThumbnailButton thumbnailButton = r4.A01;
        if (thumbnailButton.getTag().equals(str)) {
            Bitmap bitmap2 = bitmap;
            if (i == 0 || i2 == 0) {
                i = bitmap2.getWidth();
                i2 = bitmap2.getHeight();
                C42661zB.A00(r4, i, i2, z2);
            }
            boolean A1T = AnonymousClass000.A1T(i, i2);
            if (i == i2 || (z2 && A1T)) {
                thumbnailButton.setImageBitmap(bitmap2);
                return;
            }
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = r4.A02;
            int A022 = C36351kA.A02(catalogCarouselDetailImageView.getContext(), catalogCarouselDetailImageView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            C594033u r12 = (C594033u) map.get(str);
            if (r12 != null) {
                catalogCarouselDetailImageView.setImageAndGradient(r12, A1T, thumbnailButton, bitmap2, r4.A00);
                return;
            }
            C36391kE.A1Q(new C49642jS(bitmap2, r4.A00, catalogCarouselDetailImageView, thumbnailButton, str, map, A022), catalogCarouselDetailImageView.A09);
        }
    }
}
