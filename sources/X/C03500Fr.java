package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.0Fr  reason: invalid class name and case insensitive filesystem */
public class C03500Fr extends ContentFrameLayout {
    public final /* synthetic */ AnonymousClass02U A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03500Fr(Context context, AnonymousClass02U r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A0Z(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                AnonymousClass02U r2 = this.A00;
                r2.A0X(r2.A0V(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(AnonymousClass02X.A02(this, i));
    }
}
