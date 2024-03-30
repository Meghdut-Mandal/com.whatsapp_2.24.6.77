package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.0dR  reason: invalid class name and case insensitive filesystem */
public class C09960dR implements C17220qv {
    public final /* synthetic */ AnonymousClass0I4 A00;

    public C09960dR(AnonymousClass0I4 r1) {
        this.A00 = r1;
    }

    public boolean BZG(MotionEvent motionEvent, RecyclerView recyclerView) {
        int findPointerIndex;
        AnonymousClass0I4 r3 = this.A00;
        r3.A0E.A00(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r3.A08 = motionEvent.getPointerId(0);
            r3.A03 = motionEvent.getX();
            r3.A04 = motionEvent.getY();
            VelocityTracker velocityTracker = r3.A0C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0C = VelocityTracker.obtain();
            if (r3.A0H == null) {
                List list = r3.A0K;
                if (!list.isEmpty()) {
                    View A06 = r3.A06(motionEvent);
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        AnonymousClass0ZB r7 = (AnonymousClass0ZB) list.get(size);
                        AnonymousClass0D3 r6 = r7.A0C;
                        View view = r6.A0H;
                        if (view == A06) {
                            r3.A03 -= r7.A01;
                            r3.A04 -= r7.A02;
                            r3.A0C(r6, true);
                            if (r3.A0P.remove(view)) {
                                r3.A0F.A04(r6, r3.A0I);
                            }
                            r3.A0B(r6, r7.A0A);
                            r3.A08(motionEvent, r3.A00, 0);
                        }
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            r3.A08 = -1;
            r3.A0B((AnonymousClass0D3) null, 0);
        } else {
            int i = r3.A08;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = r3.A0C;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (r3.A0H == null) {
            return false;
        }
        return true;
    }

    public void Ber(boolean z) {
        if (z) {
            this.A00.A0B((AnonymousClass0D3) null, 0);
        }
    }

    public void BjE(MotionEvent motionEvent, RecyclerView recyclerView) {
        AnonymousClass0I4 r3 = this.A00;
        r3.A0E.A00(motionEvent);
        VelocityTracker velocityTracker = r3.A0C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (r3.A08 != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(r3.A08);
            if (findPointerIndex >= 0) {
                r3.A07(motionEvent, actionMasked, findPointerIndex);
            }
            AnonymousClass0D3 r1 = r3.A0H;
            if (r1 != null) {
                int i = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            VelocityTracker velocityTracker2 = r3.A0C;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == r3.A08) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                r3.A08 = motionEvent.getPointerId(i);
                                r3.A08(motionEvent, r3.A00, actionIndex);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (findPointerIndex >= 0) {
                        r3.A08(motionEvent, r3.A00, findPointerIndex);
                        r3.A09(r1);
                        RecyclerView recyclerView2 = r3.A0I;
                        Runnable runnable = r3.A0O;
                        recyclerView2.removeCallbacks(runnable);
                        runnable.run();
                        r3.A0I.invalidate();
                        return;
                    } else {
                        return;
                    }
                }
                r3.A0B((AnonymousClass0D3) null, 0);
                r3.A08 = -1;
            }
        }
    }
}
