package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3nj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75743nj implements AnonymousClass4R6 {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ CatalogMediaViewFragment A01;
    public final /* synthetic */ PhotoView A02;

    public /* synthetic */ C75743nj(Bitmap bitmap, CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView) {
        this.A01 = catalogMediaViewFragment;
        this.A02 = photoView;
        this.A00 = bitmap;
    }

    public final void Bjb(boolean z) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A01;
        PhotoView photoView = this.A02;
        Bitmap bitmap = this.A00;
        AnonymousClass00C.A0D(photoView, 1);
        if (z && !catalogMediaViewFragment.A0i().isFinishing()) {
            photoView.A08(bitmap);
        }
    }
}
