package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3ZA  reason: invalid class name */
public abstract class AnonymousClass3ZA implements View.OnTouchListener {
    public final Matrix A00 = new Matrix();
    public final C20810yC A01;
    public final PhotoView A02;
    public final AnonymousClass2bU A03;

    public AnonymousClass3ZA(C20810yC r2, PhotoView photoView, AnonymousClass2bU r4) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = photoView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MediaViewFragment mediaViewFragment;
        PhotoView photoView;
        AnonymousClass00C.A0D(motionEvent, 1);
        if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView2 = this.A02;
            Bitmap photo = photoView2.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView2.getImageMatrix();
                Matrix matrix = this.A00;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - ((float) photoView2.getLeft()), motionEvent.getRawY() - ((float) photoView2.getTop())};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A012 = AnonymousClass3LS.A01(this.A01, this.A03, fArr, fArr2, false);
                if (A012 != null) {
                    if (this instanceof AnonymousClass4WG) {
                        AnonymousClass4WG r3 = (AnonymousClass4WG) this;
                        mediaViewFragment = (MediaViewFragment) r3.A00;
                        photoView = (PhotoView) r3.A02;
                    } else {
                        AnonymousClass2Xa r32 = (AnonymousClass2Xa) this;
                        mediaViewFragment = r32.A00;
                        photoView = r32.A01;
                    }
                    MediaViewFragment.A0D(A012, mediaViewFragment, photoView);
                }
            }
            if (this instanceof AnonymousClass4WG) {
                AnonymousClass4WG r1 = (AnonymousClass4WG) this;
                if (motionEvent.getActionMasked() == 1) {
                    AnonymousClass5NI r12 = (AnonymousClass5NI) r1.A01;
                    if (r12.A0A()) {
                        r12.A02();
                        return true;
                    }
                    r12.A03();
                    r12.A09(3000);
                    return true;
                }
            } else {
                AnonymousClass2Xa r13 = (AnonymousClass2Xa) this;
                if (motionEvent.getActionMasked() == 1) {
                    MediaViewFragment mediaViewFragment2 = r13.A00;
                    mediaViewFragment2.A1o(!mediaViewFragment2.A0G, true);
                    return true;
                }
            }
        }
        return true;
    }
}
