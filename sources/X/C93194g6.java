package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

/* renamed from: X.4g6  reason: invalid class name and case insensitive filesystem */
public class C93194g6 extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final /* synthetic */ C124985z8 A05;

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.A02);
        canvas.drawRect(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this), this.A04);
        if (this.A05.A0B) {
            canvas.drawColor(this.A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93194g6(Context context, C124985z8 r6) {
        super(context, (AttributeSet) null);
        this.A05 = r6;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Paint A0L = C36441kJ.A0L(1);
        this.A04 = A0L;
        C36381kD.A16(context, A0L, R.color.f6nameremoved);
        A0L.setStrokeWidth(C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        C36421kH.A0q(A0L);
        A0L.setAntiAlias(true);
        this.A02 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A03 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
