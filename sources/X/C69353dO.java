package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3dO  reason: invalid class name and case insensitive filesystem */
public final class C69353dO implements C22916AyS {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CatalogMediaViewFragment A02;
    public final /* synthetic */ PhotoView A03;

    public void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        AnonymousClass00C.A0D(bitmap, 1);
        if (this.A00) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A02;
            C75743nj r1 = new C75743nj(bitmap, catalogMediaViewFragment, this.A03);
            if (!catalogMediaViewFragment.A0D) {
                r1.Bjb(true);
            } else {
                catalogMediaViewFragment.A09 = r1;
            }
        } else {
            this.A00 = true;
            this.A03.A08(bitmap);
            CatalogMediaViewFragment catalogMediaViewFragment2 = this.A02;
            C207269up r0 = catalogMediaViewFragment2.A03;
            if (r0 == null) {
                throw C36331k8.A0d("product");
            }
            String str = r0.A0F;
            if (AnonymousClass00C.A0J(AnonymousClass000.A0r("_", AnonymousClass000.A0v(str), this.A01), catalogMediaViewFragment2.A09)) {
                AnonymousClass17Y r2 = catalogMediaViewFragment2.A02;
                if (r2 != null) {
                    r2.A0H(new AVW(catalogMediaViewFragment2, 3));
                    return;
                }
                throw C36321k7.A06();
            }
        }
    }

    public C69353dO(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i) {
        this.A02 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A01 = i;
    }
}
