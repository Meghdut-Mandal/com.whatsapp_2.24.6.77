package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4dc  reason: invalid class name and case insensitive filesystem */
public final class C92334dc extends View implements AnonymousClass7f0 {
    public float A00 = 0.0533f;
    public AnonymousClass6LB A01 = AnonymousClass6LB.A05;
    public List A02 = Collections.emptyList();
    public final List A03 = AnonymousClass001.A0I();

    public void BwW(AnonymousClass6LB r4, List list, float f, float f2, int i) {
        this.A02 = list;
        this.A01 = r4;
        this.A00 = f;
        while (true) {
            List list2 = this.A03;
            if (list2.size() < list.size()) {
                list2.add(new C121045sV(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        List list = this.A02;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A0B = AnonymousClass000.A0B(this);
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && A0B > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float f = this.A00;
                if (f != -3.4028235E38f && f * ((float) i) > 0.0f && 0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass001.A0A("verticalType");
                }
            }
        }
    }

    public C92334dc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
