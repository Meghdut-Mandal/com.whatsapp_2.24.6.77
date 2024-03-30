package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.4bT  reason: invalid class name and case insensitive filesystem */
public class C91104bT extends Drawable {
    public final Paint A00 = C36371kC.A0E();
    public final /* synthetic */ SettingsRowPrivacyLinearLayout A01;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91104bT(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A01 = settingsRowPrivacyLinearLayout;
    }

    public void draw(Canvas canvas) {
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A01;
        if (settingsRowPrivacyLinearLayout.A00 > 0.0f) {
            int A02 = C36351kA.A02(settingsRowPrivacyLinearLayout.getContext(), settingsRowPrivacyLinearLayout.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            int i = (A02 & 16777215) | (((int) (((float) (A02 >> 24)) * settingsRowPrivacyLinearLayout.A00)) << 24);
            Paint paint = this.A00;
            paint.setColor(i);
            canvas.drawRect(getBounds(), paint);
        }
    }
}
