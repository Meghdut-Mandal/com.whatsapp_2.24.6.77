package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.6pr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143026pr implements C22916AyS {
    public final /* synthetic */ ThumbnailButton A00;

    public /* synthetic */ C143026pr(ThumbnailButton thumbnailButton) {
        this.A00 = thumbnailButton;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        ThumbnailButton thumbnailButton = this.A00;
        thumbnailButton.setBackgroundColor(0);
        thumbnailButton.setImageBitmap(bitmap);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
