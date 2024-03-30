package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.CircularRevealView;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2rv  reason: invalid class name and case insensitive filesystem */
public class C53812rv implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C53812rv(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A03 != 0) {
            C47592fB r7 = (C47592fB) this.A00;
            PointF pointF = (PointF) this.A01;
            AtomicLong atomicLong = (AtomicLong) this.A02;
            if (r7.A01.A0J != 4) {
                return false;
            }
            r7.A0D();
            if (motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (r7.A0D() instanceof C47532ev) {
                        C47532ev r8 = (C47532ev) r7.A0D();
                        boolean A0K = r8.A0K(motionEvent.getX(), motionEvent.getY(), false);
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        Rect A06 = AnonymousClass001.A06();
                        View view2 = r8.A01;
                        if (view2 != null) {
                            view2.getGlobalVisibleRect(A06);
                        }
                        if (A06.contains((int) x, (int) y)) {
                            return false;
                        }
                        if (A0K) {
                            return true;
                        }
                    }
                    pointF.set(motionEvent.getX(), motionEvent.getY());
                    atomicLong.set(SystemClock.elapsedRealtime());
                    r7.A0G();
                    Handler handler = r7.A0A;
                    Runnable runnable = r7.A0P;
                    handler.removeCallbacks(runnable);
                    Boolean bool = C18750th.A03;
                    handler.postDelayed(runnable, 500);
                } else if (action == 1) {
                    if (r7.A0D() instanceof C47532ev) {
                        C47532ev r5 = (C47532ev) r7.A0D();
                        boolean A0K2 = r5.A0K(motionEvent.getX(), motionEvent.getY(), true);
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        Rect A062 = AnonymousClass001.A06();
                        View view3 = r5.A01;
                        if (view3 != null) {
                            view3.getGlobalVisibleRect(A062);
                        }
                        boolean contains = A062.contains((int) x2, (int) y2);
                        if (A0K2 || contains) {
                            return true;
                        }
                    }
                    pointF.set(motionEvent.getX(), motionEvent.getY());
                    r7.A0H();
                    view.performClick();
                }
            }
            if (motionEvent.getAction() != 3) {
                return false;
            }
            r7.A0H();
            C47592fB.A03(r7);
            return false;
        }
        C38891qO r3 = (C38891qO) this.A00;
        if (motionEvent.getAction() != 4) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            float y3 = motionEvent.getY();
            FrameLayout frameLayout = r3.A06;
            if (y3 >= ((float) frameLayout.getTop()) && motionEvent.getY() <= ((float) frameLayout.getBottom())) {
                float x3 = motionEvent.getX();
                CircularRevealView circularRevealView = r3.A07;
                if (x3 >= ((float) circularRevealView.getLeft()) && motionEvent.getX() <= ((float) circularRevealView.getRight())) {
                    return false;
                }
            }
        }
        r3.dismiss();
        return true;
    }
}
