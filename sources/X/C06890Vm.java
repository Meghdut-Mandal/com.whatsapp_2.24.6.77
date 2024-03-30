package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.0Vm  reason: invalid class name and case insensitive filesystem */
public abstract class C06890Vm {
    public static final boolean A00;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        A00 = z;
    }

    public static ImageView A00(View view, View view2, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        int i;
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        AnonymousClass0V3 r0 = AnonymousClass0W5.A02;
        View view3 = view;
        r0.A02(matrix, view);
        ViewGroup viewGroup3 = viewGroup;
        r0.A03(matrix, viewGroup3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = !view.isAttachedToWindow();
        boolean isAttachedToWindow = viewGroup3.isAttachedToWindow();
        Bitmap bitmap = null;
        if (z) {
            if (isAttachedToWindow) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                viewGroup3.getOverlay().add(view);
            }
            AnonymousClass000.A16(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        viewGroup2 = null;
        i = 0;
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int round7 = Math.round(((float) round5) * min);
            int round8 = Math.round(((float) round6) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (A00) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round7, round8);
                beginRecording.concat(matrix);
                view3.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view3.draw(canvas);
            }
        }
        if (z) {
            viewGroup3.getOverlay().remove(view3);
            viewGroup2.addView(view3, i);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        AnonymousClass000.A16(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
