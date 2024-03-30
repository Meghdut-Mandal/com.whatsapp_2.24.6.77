package X;

import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.1m0  reason: invalid class name and case insensitive filesystem */
public final class C37211m0 extends LinkMovementMethod {
    public boolean A00;
    public final Handler A01 = C36341k9.A0H();

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        AnonymousClass00C.A0D(textView, 0);
        MotionEvent motionEvent2 = motionEvent;
        C36321k7.A0v(spannable, 1, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3) {
            this.A01.removeCallbacksAndMessages((Object) null);
        } else if (action == 0 || action == 1) {
            float x = (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((motionEvent.getY() - ((float) textView.getTotalPaddingTop())) + ((float) textView.getScrollY()))), x);
            C88324Sg[] r9 = (C88324Sg[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C88324Sg.class);
            if (!(r9 == null || r9.length == 0)) {
                if (action == 1) {
                    this.A01.removeCallbacksAndMessages((Object) null);
                    if (!this.A00) {
                        r9[0].BTg(motionEvent, textView);
                    }
                    this.A00 = false;
                    return true;
                }
                this.A01.postDelayed(new C1503474x((Object) textView2, (Object) this, (Object) r9, (Object) motionEvent2, 8), 500);
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
