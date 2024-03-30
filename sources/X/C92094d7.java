package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

/* renamed from: X.4d7  reason: invalid class name and case insensitive filesystem */
public class C92094d7 extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public View A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C1271967i A05;
    public final C140456lc A06;
    public final C140456lc A07;
    public final Map A08 = new AnonymousClass008(2);

    public static C1273868b A00(C92094d7 r3) {
        C1273868b r1 = new C1273868b();
        r1.A09(r3.A06, 0);
        return r1;
    }

    public static void A01(PointF pointF, C92094d7 r5, C1273868b r6, Object obj) {
        r6.A09(obj, 1);
        r6.A09(Float.valueOf((pointF.x * 100.0f) / ((float) r5.A01.getWidth())), 2);
        r6.A09(Float.valueOf((pointF.y * 100.0f) / ((float) r5.A01.getHeight())), 3);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (AnonymousClass000.A1R((Math.abs(y) > Math.abs(x) ? 1 : (Math.abs(y) == Math.abs(x) ? 0 : -1)))) {
            i = 42;
            if (y > 0.0f) {
                i = 38;
            }
        } else {
            i = 40;
            if (x > 0.0f) {
                i = 41;
            }
        }
        C160377ku A052 = A05(i);
        if (A052 == null) {
            return false;
        }
        C140456lc r2 = this.A07;
        C1273868b A002 = A00(this);
        C1271967i r0 = this.A05;
        A002.A09(r0, 1);
        C1273868b.A06(r0, r2, A002, A052);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.A02 = true;
        C160377ku A052 = A05(35);
        C160377ku A053 = A05(61);
        if (A052 != null) {
            C140456lc r2 = this.A07;
            C1273868b A002 = A00(this);
            C1271967i r0 = this.A05;
            A002.A09(r0, 1);
            C1273868b.A06(r0, r2, A002, A052);
        }
        if (this.A01 != null && A053 != null) {
            C140456lc r4 = this.A07;
            C1273868b A003 = A00(this);
            C1271967i r22 = this.A05;
            A003.A09(r22, 1);
            A003.A09(r4, 2);
            A003.A09("detected", 3);
            A03(motionEvent, this, A003, 4);
            A02(motionEvent, this, A003, 5);
            C1273868b.A06(r22, r4, A003, A053);
        }
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    private boolean A04(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        C160377ku A052 = A05(43);
        C160377ku A053 = A05(54);
        C160377ku A054 = A05(62);
        if (A052 != null) {
            C140456lc r2 = this.A07;
            C1273868b A002 = A00(this);
            C1271967i r0 = this.A05;
            A002.A09(r0, 1);
            C1273868b.A06(r0, r2, A002, A052);
            z = true;
        } else {
            z = false;
        }
        if (A053 != null) {
            C140456lc r22 = this.A07;
            C1273868b A003 = A00(this);
            C1271967i r02 = this.A05;
            A003.A09(r02, 1);
            A03(motionEvent, this, A003, 2);
            A02(motionEvent, this, A003, 3);
            C1273868b.A06(r02, r22, A003, A053);
            z = true;
        }
        if (A054 == null) {
            return z;
        }
        C140456lc r3 = this.A07;
        C1273868b A004 = A00(this);
        C1271967i r1 = this.A05;
        A004.A09(r1, 1);
        A004.A09(r3, 2);
        A03(motionEvent, this, A004, 3);
        A02(motionEvent, this, A004, 4);
        C1273868b.A06(r1, r3, A004, A054);
        return true;
    }

    public C160377ku A05(int i) {
        Map map = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C160377ku) map.get(valueOf);
        }
        C160377ku A0X = this.A07.A0X(i);
        map.put(valueOf, A0X);
        return A0X;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A01 == null) {
            return false;
        }
        C160377ku A052 = A05(45);
        if (A052 == null && (A052 = A05(36)) == null) {
            return false;
        }
        PointF A002 = C129826Ip.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
        C140456lc r2 = this.A07;
        C1273868b A003 = A00(this);
        C1271967i r0 = this.A05;
        A01(A002, this, A003, r0);
        C1273868b.A06(r0, r2, A003, A052);
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.A01 == null) {
            return false;
        }
        C160377ku A052 = A05(49);
        if (A052 != null) {
            PointF A002 = C129826Ip.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
            C140456lc r2 = this.A07;
            C1273868b A003 = A00(this);
            C1271967i r0 = this.A05;
            A01(A002, this, A003, r0);
            C1273868b.A06(r0, r2, A003, A052);
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C160377ku A052;
        if (this.A00 == null || this.A01 == null || (A052 = A05(44)) == null) {
            return false;
        }
        C140456lc r7 = this.A07;
        C1273868b A002 = A00(this);
        C1271967i r5 = this.A05;
        A002.A09(r5, 1);
        A002.A09(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        A002.A09(Float.valueOf((this.A00.x * 100.0f) / C36441kJ.A01(this.A01)), 3);
        A002.A09(Float.valueOf((this.A00.y * 100.0f) / C36441kJ.A02(this.A01)), 4);
        C1273868b.A06(r5, r7, A002, A052);
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C160377ku A052;
        if (!(this.A01 == null || (A052 = A05(48)) == null)) {
            C140456lc r6 = this.A07;
            C1273868b A002 = A00(this);
            C1271967i r5 = this.A05;
            A002.A09(r5, 1);
            A002.A09(Float.valueOf((f * 100.0f) / C36441kJ.A01(this.A01)), 2);
            Object A003 = AnonymousClass6JI.A00(C100674vP.A00(r5, A052, r6.A08), C1273868b.A05(A002, Float.valueOf((f2 * 100.0f) / C36441kJ.A02(this.A01)), 3), A052);
            if (!(A003 instanceof Boolean)) {
                AnonymousClass6RS.A01("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean A1X = AnonymousClass000.A1X(A003);
                if (A1X) {
                    this.A04 = true;
                }
                this.A03 = true;
                return A1X;
            }
        }
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((A05(36) != null || A05(45) != null) && A04(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A05(36) == null && A05(45) == null && A04(motionEvent)) {
            return true;
        }
        return false;
    }

    public C92094d7(C1271967i r3, C140456lc r4, C140456lc r5) {
        this.A05 = r3;
        this.A07 = r4;
        this.A06 = r5;
    }

    public static void A02(MotionEvent motionEvent, C92094d7 r2, C1273868b r3, int i) {
        r3.A09(Float.valueOf(motionEvent.getY() - r2.A01.getY()), i);
    }

    public static void A03(MotionEvent motionEvent, C92094d7 r2, C1273868b r3, int i) {
        r3.A09(Float.valueOf(motionEvent.getX() - r2.A01.getX()), i);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (this.A01 == null) {
            return true;
        }
        this.A00 = C129826Ip.A00(new PointF(focusX, focusY), this.A01);
        return true;
    }
}
