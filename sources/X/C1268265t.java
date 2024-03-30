package X;

import android.graphics.Matrix;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.65t  reason: invalid class name and case insensitive filesystem */
public final class C1268265t {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public static void A00(ImagePreviewContentLayout imagePreviewContentLayout) {
        C135346cY r0 = new C135346cY(imagePreviewContentLayout, new C1268265t(imagePreviewContentLayout));
        r0.A0E = true;
        imagePreviewContentLayout.A02 = r0;
        LayoutInflater.from(imagePreviewContentLayout.getContext()).inflate(R.layout.f9nameremoved, imagePreviewContentLayout, true);
        imagePreviewContentLayout.setWillNotDraw(false);
    }

    public C1268265t(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A01(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        C146806wC r1 = imagePreviewContentLayout.A00;
        if (r1 != null) {
            r1.A0O.A05.set(matrix);
            r1.A0N.invalidate();
        }
        imagePreviewContentLayout.invalidate();
    }

    public void A02(boolean z) {
        ImageComposerFragment imageComposerFragment;
        boolean z2;
        boolean z3;
        C157407cu r0 = this.A00.A01;
        if (z) {
            if (r0 != null) {
                imageComposerFragment = ((C146716w3) r0).A00;
                z2 = true;
                z3 = false;
            } else {
                return;
            }
        } else if (r0 != null) {
            imageComposerFragment = ((C146716w3) r0).A00;
            z2 = false;
            z3 = true;
        } else {
            return;
        }
        ImageComposerFragment.A0A(imageComposerFragment, z2, z3);
    }
}
