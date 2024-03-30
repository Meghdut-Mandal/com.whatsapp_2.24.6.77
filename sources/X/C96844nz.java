package X;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4nz  reason: invalid class name and case insensitive filesystem */
public final class C96844nz extends AnonymousClass0D3 {
    public ShimmerFrameLayout A00;
    public StickerView A01;
    public final ColorMatrixColorFilter A02;
    public final View A03;
    public final ColorMatrix A04;
    public final /* synthetic */ C95824mL A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96844nz(View view, C95824mL r4) {
        super(view);
        this.A05 = r4;
        this.A03 = view;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.A04 = colorMatrix;
        this.A02 = new ColorMatrixColorFilter(colorMatrix);
    }
}
