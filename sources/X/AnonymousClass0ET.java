package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.R;

/* renamed from: X.0ET  reason: invalid class name */
public class AnonymousClass0ET extends ViewGroup implements C17070qf {
    public View A00;
    public ViewGroup A01;
    public int A02;
    public Matrix A03;
    public final View A04;
    public final ViewTreeObserver.OnPreDrawListener A05 = new C09200bz(this);

    public static void A00(View view, View view2) {
        int left = view2.getLeft();
        int top = view2.getTop();
        int left2 = view2.getLeft() + view.getWidth();
        int top2 = view2.getTop() + view.getHeight();
        AnonymousClass0W5.A02.A06(view2, left, top, left2, top2);
    }

    public void onDraw(Canvas canvas) {
        C05970Ru.A00(canvas, true);
        canvas.setMatrix(this.A03);
        View view = this.A04;
        AnonymousClass0V3 r1 = AnonymousClass0W5.A02;
        r1.A05(view, 0);
        view.invalidate();
        r1.A05(view, 4);
        drawChild(canvas, view, getDrawingTime());
        C05970Ru.A00(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void BoT(View view, ViewGroup viewGroup) {
        this.A01 = viewGroup;
        this.A00 = view;
    }

    public void onDetachedFromWindow() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this.A05);
        AnonymousClass0W5.A02.A05(view, 0);
        view.setTag(R.id.ghost_view, (Object) null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public AnonymousClass0ET(View view) {
        super(view.getContext());
        this.A04 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.A04;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.A05);
        AnonymousClass0W5.A02.A05(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.A04;
        if (view.getTag(R.id.ghost_view) == this) {
            int i2 = 0;
            if (i == 0) {
                i2 = 4;
            }
            AnonymousClass0W5.A02.A05(view, i2);
        }
    }
}
