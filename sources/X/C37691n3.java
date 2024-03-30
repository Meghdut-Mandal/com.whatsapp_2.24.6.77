package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: X.1n3  reason: invalid class name and case insensitive filesystem */
public class C37691n3 extends Animation {
    public int A00;
    public Camera A01;
    public ImageView A02;
    public boolean A03;

    public C37691n3(ImageView imageView, int i) {
        this.A02 = imageView;
        this.A00 = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        int i = ((int) (f * 180.0f)) % 360;
        Matrix matrix = transformation.getMatrix();
        this.A01.save();
        Camera camera = this.A01;
        ImageView imageView = this.A02;
        camera.translate(0.0f, 0.0f, (float) (((double) imageView.getWidth()) * Math.sin((((double) i) * 3.141592653589793d) / 180.0d)));
        Camera camera2 = this.A01;
        float f2 = (float) (i + 180);
        if (i < 90) {
            f2 = (float) i;
        }
        camera2.rotateY(f2);
        this.A01.getMatrix(matrix);
        this.A01.restore();
        matrix.preTranslate((float) ((-imageView.getWidth()) / 2), (float) ((-imageView.getHeight()) / 2));
        matrix.postTranslate((float) (imageView.getWidth() / 2), (float) C36441kJ.A07(imageView));
        if (i > 90 && !this.A03) {
            this.A03 = true;
            imageView.setImageResource(this.A00);
        }
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.A01 = new Camera();
    }
}
