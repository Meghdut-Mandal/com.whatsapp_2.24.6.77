package X;

import android.graphics.Path;
import android.view.ViewTreeObserver;
import com.whatsapp.WaRoundCornerImageView;

/* renamed from: X.6dI  reason: invalid class name and case insensitive filesystem */
public class C135806dI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WaRoundCornerImageView A00;

    public C135806dI(WaRoundCornerImageView waRoundCornerImageView) {
        this.A00 = waRoundCornerImageView;
    }

    public void onGlobalLayout() {
        WaRoundCornerImageView waRoundCornerImageView = this.A00;
        Path A0M = C36441kJ.A0M();
        waRoundCornerImageView.A01 = A0M;
        float f = waRoundCornerImageView.A00;
        A0M.addRoundRect((float) (waRoundCornerImageView.getLeft() + waRoundCornerImageView.getPaddingLeft()), (float) (waRoundCornerImageView.getTop() + waRoundCornerImageView.getPaddingTop()), (float) (waRoundCornerImageView.getRight() - waRoundCornerImageView.getPaddingRight()), (float) (waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom()), f, f, Path.Direction.CCW);
    }
}
