package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.4e6  reason: invalid class name and case insensitive filesystem */
public class C92514e6 extends Animation {
    public final /* synthetic */ SettingsRowPrivacyLinearLayout A00;

    public C92514e6(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A00 = settingsRowPrivacyLinearLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A00;
        settingsRowPrivacyLinearLayout.A00 = 1.0f - f;
        settingsRowPrivacyLinearLayout.invalidate();
    }
}
