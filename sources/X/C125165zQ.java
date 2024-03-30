package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.5zQ  reason: invalid class name and case insensitive filesystem */
public class C125165zQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06 = 1.0f;
    public float A07;
    public float A08 = 1.0f;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public Matrix A0J;
    public VelocityTracker A0K;
    public AnonymousClass7c3 A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final long A0S;
    public final AnonymousClass75L A0T = new C97754qD(this);
    public final AnonymousClass75L A0U = new C97744qC(this);
    public final float[] A0V = C90524aI.A0v();

    public C125165zQ(Context context, AnonymousClass7c3 r5) {
        this.A0L = r5;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0R = viewConfiguration.getScaledTouchSlop();
        this.A0S = (long) ViewConfiguration.getLongPressTimeout();
        this.A0E = ViewConfiguration.getDoubleTapTimeout();
        this.A0D = viewConfiguration.getScaledDoubleTapSlop();
        this.A07 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0P = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
}
