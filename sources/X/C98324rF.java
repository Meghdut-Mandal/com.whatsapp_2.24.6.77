package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.4rF  reason: invalid class name and case insensitive filesystem */
public final class C98324rF extends C91864ck {
    public final C1271967i A00;
    public final C140456lc A01;
    public final C140456lc A02;
    public final C160377ku A03;
    public final boolean A04;

    public void onClick(View view) {
        Object obj;
        AnonymousClass00C.A0D(view, 0);
        C1273868b A002 = C1273868b.A00();
        A002.A0A(this.A02, 0);
        if (!this.A04 || !(view instanceof RCTextView)) {
            obj = this.A00;
        } else {
            RCTextView rCTextView = (RCTextView) view;
            CharSequence charSequence = rCTextView.A07;
            AnonymousClass00C.A0E(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) charSequence;
            Layout layout = rCTextView.A06;
            int spanStart = (int) ((double) spanned.getSpanStart(this));
            double primaryHorizontal = (double) layout.getPrimaryHorizontal(spanStart);
            double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) ((double) spanned.getSpanEnd(this)));
            int lineForOffset = layout.getLineForOffset(spanStart);
            Rect A06 = AnonymousClass001.A06();
            layout.getLineBounds(lineForOffset, A06);
            RectF rectF = new RectF(A06);
            float paddingBottom = rectF.left + ((float) (((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.A00)));
            rectF.left = paddingBottom;
            rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
            float scrollY = (float) ((double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.A01));
            rectF.top += scrollY;
            rectF.bottom += scrollY;
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
            float f = (float) 2;
            obj = new C122215uU(rectF.left + (rectF.width() / f), rectF.top + (rectF.height() / f), rectF.width(), rectF.height());
        }
        A002.A0A(obj, 1);
        C131756Qk.A02(this.A00, this.A01, new AnonymousClass6MO(A002.A00), this.A03);
    }

    public void updateDrawState(TextPaint textPaint) {
    }

    public C98324rF(C1271967i r1, C140456lc r2, C140456lc r3, C160377ku r4, String str, String str2, boolean z) {
        super(str, str2);
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = z;
    }
}
