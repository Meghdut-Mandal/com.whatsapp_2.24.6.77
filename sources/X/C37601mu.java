package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

/* renamed from: X.1mu  reason: invalid class name and case insensitive filesystem */
public class C37601mu extends Animation {
    public final GoogleDriveRestoreAnimationView A00;

    public static void A00(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        C37601mu r2 = new C37601mu(googleDriveRestoreAnimationView);
        googleDriveRestoreAnimationView.A02 = r2;
        r2.setDuration(2000);
        googleDriveRestoreAnimationView.A02.setRepeatCount(-1);
        googleDriveRestoreAnimationView.A02.setInterpolator(new LinearInterpolator());
        googleDriveRestoreAnimationView.A02.setFillAfter(true);
    }

    public void applyTransformation(float f, Transformation transformation) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A00;
        googleDriveRestoreAnimationView.A00 = f;
        googleDriveRestoreAnimationView.invalidate();
    }

    public C37601mu(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.A00 = googleDriveRestoreAnimationView;
    }
}
