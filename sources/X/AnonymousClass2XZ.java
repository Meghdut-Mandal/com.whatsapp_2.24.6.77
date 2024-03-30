package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2XZ  reason: invalid class name */
public abstract class AnonymousClass2XZ extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public AnonymousClass2XZ(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public static void A07(PhotoView photoView) {
        photoView.A0A = new Matrix();
        photoView.A0B = new Matrix();
        photoView.A0M = false;
        photoView.A0N = true;
        photoView.A02 = Float.MAX_VALUE;
        photoView.A0C = new Paint();
        photoView.A0E = new Rect();
        photoView.A09 = 0;
        photoView.A08 = 0.8f;
        photoView.A0G = new RectF();
        photoView.A0F = new RectF();
        photoView.A0H = new RectF();
        photoView.A0D = new PointF();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass2XZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AnonymousClass2XZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
