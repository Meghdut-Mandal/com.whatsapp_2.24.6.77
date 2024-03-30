package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import com.whatsapp.mediaview.PhotoView;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2vK  reason: invalid class name and case insensitive filesystem */
public class C55872vK implements C22916AyS {
    public Object A00;
    public final int A01;

    public C55872vK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        ImageView imageView;
        switch (this.A01) {
            case 0:
                C42211yS r2 = (C42211yS) this.A00;
                List list = AnonymousClass0D3.A0I;
                AnonymousClass00C.A0D(bitmap, 2);
                ImageView imageView2 = r2.A01;
                imageView2.setImageBitmap(bitmap);
                if (r2.A00) {
                    r2.A00 = false;
                    CatalogImageListActivity catalogImageListActivity = r2.A03;
                    Objects.requireNonNull(catalogImageListActivity);
                    imageView2.post(new AVW(catalogImageListActivity, 12));
                    return;
                }
                return;
            case 1:
                imageView = (ImageView) this.A00;
                imageView.setBackgroundColor(0);
                break;
            case 2:
                ((PhotoView) this.A00).A08(bitmap);
                return;
            case 5:
                imageView = (ImageView) this.A00;
                if (imageView == null) {
                    return;
                }
                break;
            default:
                imageView = (ImageView) this.A00;
                break;
        }
        imageView.setImageBitmap(bitmap);
        C36411kG.A1D(imageView);
    }
}
