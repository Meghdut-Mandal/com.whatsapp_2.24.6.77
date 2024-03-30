package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Vector;

/* renamed from: X.4ej  reason: invalid class name and case insensitive filesystem */
public abstract class C92794ej extends FrameLayout implements AnonymousClass7c2, AnonymousClass7c3, AnonymousClass7c4 {
    public static final double A0n = Math.log(2.0d);
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public double A04 = 0.5d;
    public double A05 = 0.5d;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D = -987675;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I = SystemClock.uptimeMillis();
    public long A0J;
    public long A0K;
    public Context A0L;
    public C139266jV A0M;
    public C124515yJ A0N;
    public C139206jP A0O;
    public AnonymousClass63E A0P;
    public AnonymousClass74L A0Q;
    public C125165zQ A0R;
    public C161217mO A0S = C161217mO.A00;
    public Queue A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public AnonymousClass7c1 A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final Matrix A0e = C90524aI.A0B();
    public final Matrix A0f = C90524aI.A0B();
    public final EnumSet A0g = EnumSet.of(AnonymousClass5T6.A00);
    public final BroadcastReceiver A0h = new C162357oS(this, 0);
    public final ComponentCallbacks A0i = new C133486Yr(this);
    public final Paint A0j = C36441kJ.A0L(2);
    public final RectF A0k = C36441kJ.A0N();
    public final float[] A0l = new float[2];
    public final float[] A0m = new float[4];

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    public static void A07(C92794ej r1) {
        r1.A0Y = false;
        r1.A0M.A0R.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A0G == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r5 = this;
            X.6jV r2 = r5.A0M
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x000b
            X.4q4 r1 = r2.A0G
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.6NI r1 = r2.A0U
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0018
            r1.A01(r4)
        L_0x0018:
            boolean r0 = r5.A0b
            if (r0 != 0) goto L_0x0031
            android.content.Context r3 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0i
            r3.registerComponentCallbacks(r0)
            android.content.BroadcastReceiver r2 = r5.A0h
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0b = r4
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92794ej.A01():void");
    }

    private void A02() {
        AnonymousClass6NI r1 = this.A0M.A0U;
        if (r1.A03) {
            r1.A01(false);
        }
        if (this.A0b) {
            Context context = this.A0L;
            context.unregisterComponentCallbacks(this.A0i);
            try {
                context.unregisterReceiver(this.A0h);
            } catch (IllegalArgumentException unused) {
            }
            this.A0b = false;
        }
        this.A0M.A06();
        AnonymousClass6TY[] r3 = AnonymousClass6TY.A0P;
        int i = 0;
        do {
            r3[i].A04();
            i++;
        } while (i < 8);
    }

    private void A03() {
        RectF rectF = this.A0k;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0E;
        Matrix matrix = this.A0f;
        matrix.mapRect(rectF);
        float[] fArr = this.A0m;
        float f = this.A06;
        fArr[0] = -f;
        float f2 = -this.A07;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0J;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    private void A04(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0l;
        fArr[0] = this.A06 - f;
        fArr[1] = this.A07 - f2;
        this.A0f.mapVectors(fArr);
        long j = this.A0J;
        double d = (double) j;
        this.A04 = A00(((double) f3) + (((double) fArr[0]) / d));
        this.A05 = A0B(((double) f4) + (((double) fArr[1]) / d), j);
    }

    private void A05(int i, float f) {
        this.A0G = i;
        this.A02 = f;
        int i2 = 1 << i;
        this.A03 = i2;
        this.A0J = (long) (i2 * this.A0M.A0N);
    }

    private void A06(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            C139266jV r2 = this.A0M;
            A05((int) Math.min(Math.max((float) bundle.getInt("zoom"), r2.A02), r2.A01), bundle.getFloat("scale"));
            this.A04 = bundle.getDouble("xVisibleCenter") - ((double) (((long) (0 - this.A0M.A06)) / (this.A0J << 1)));
            double d = bundle.getDouble("yVisibleCenter");
            C139266jV r0 = this.A0M;
            this.A05 = d - ((double) (((long) (r0.A07 - r0.A05)) / (this.A0J << 1)));
            this.A0C = bundle.getFloat("rotation");
            Matrix matrix = this.A0e;
            float f = this.A02;
            matrix.setScale(f, f);
            matrix.postRotate(this.A0C);
            matrix.invert(this.A0f);
            this.A0d = false;
        }
    }

    public static void A08(C92794ej r5) {
        C139266jV r4 = r5.A0M;
        AnonymousClass6TZ r1 = r4.A0T.A09;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        r5.A0Y = true;
        r4.A06();
        AnonymousClass74L r12 = r5.A0Q;
        r12.A0D.removeCallbacks(r12);
        r12.A09 = false;
        r12.A05 = false;
        r12.A06 = true;
        r12.A0E.forceFinished(true);
        r12.A01 = 0.0f;
        r12.A00 = 0.0f;
    }

    public static void A09(C92794ej r3) {
        AnonymousClass6TZ r1 = r3.A0M.A0T.A09;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        AnonymousClass74L r2 = r3.A0Q;
        View view = r2.A0D;
        view.removeCallbacks(r2);
        r2.A06 = false;
        r2.A05 = true;
        view.postOnAnimation(r2);
    }

    public static boolean A0A(C92794ej r5, float f, float f2, float f3) {
        float f4 = r5.A02 * f;
        int i = r5.A0G;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        if (r5.A0I((((float) i) + f4) - 1.0f, f2, f3)) {
            r5.A0M.A04();
        }
        return AnonymousClass000.A1P((r5.A08 > 1.0f ? 1 : (r5.A08 == 1.0f ? 0 : -1)));
    }

    public double A0B(double d, long j) {
        double d2 = this.A01 * (((double) this.A0J) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public final void A0C() {
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            this.A0M.A0W.get(i);
        }
        Vector vector = AnonymousClass6P6.A02;
        C97724qA r1 = new C97724qA();
        C133046Wl.A01(r1);
        C118505oA.A00(r1, (String) null);
    }

    public void A0E(float f, float f2, float f3) {
        if (this.A0W) {
            AnonymousClass6WY r0 = this.A0M.A0R;
            float[] fArr = this.A0l;
            r0.A0A(fArr, f2, f3);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0e;
            matrix.postRotate(f - this.A0C, f2, f3);
            matrix.invert(this.A0f);
            this.A0C = f % 360.0f;
            A03();
            A04(f2, f3, f4, f5);
        }
    }

    public final void A0F(Bundle bundle) {
        C124515yJ r0 = this.A0N;
        C139266jV r3 = new C139266jV(r0, this);
        this.A0M = r3;
        C134996bx r4 = r0.A02;
        if (r4 == null) {
            float f = r3.A02;
            A05((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(r4.A02, r3.A02), r3.A01);
            A05((int) min, (min % 1.0f) + 1.0f);
            C134976bv r2 = r4.A03;
            if (r2 != null) {
                this.A04 = AnonymousClass6WY.A01(r2.A01);
                this.A05 = AnonymousClass6WY.A00(r2.A00);
            }
            this.A0C = r4.A00;
        }
        this.A0P = r3.A0S;
        Matrix matrix = this.A0e;
        float f2 = this.A02;
        matrix.setScale(f2, f2);
        matrix.postRotate(this.A0C);
        matrix.invert(this.A0f);
        A06(bundle);
    }

    public final void A0G(Bundle bundle) {
        if (!this.A0d) {
            bundle.putDouble("xVisibleCenter", this.A04 + ((double) (((long) (0 - this.A0M.A06)) / (this.A0J << 1))));
            double d = this.A05;
            C139266jV r0 = this.A0M;
            bundle.putDouble("yVisibleCenter", d + ((double) (((long) (r0.A07 - r0.A05)) / (this.A0J << 1))));
            bundle.putInt("zoom", this.A0G);
            bundle.putFloat("scale", this.A02);
            bundle.putFloat("rotation", this.A0C);
            this.A0d = true;
        }
    }

    public void A0H(AnonymousClass7eQ r2) {
        Queue queue;
        if (!this.A0c || ((queue = this.A0T) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0T;
            if (queue2 == null) {
                queue2 = C90524aI.A0l();
                this.A0T = queue2;
            }
            queue2.add(r2);
            return;
        }
        r2.BaR(this.A0M);
    }

    public boolean A0I(float f, float f2, float f3) {
        AnonymousClass6WY r0 = this.A0M.A0R;
        float[] fArr = this.A0l;
        r0.A0A(fArr, f2, f3);
        float f4 = fArr[0];
        float f5 = fArr[1];
        C139266jV r2 = this.A0M;
        float min = Math.min(Math.max(f, r2.A02), r2.A01);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0G;
        float f7 = f6 / this.A02;
        this.A08 = f7;
        A05((int) min, f6);
        Matrix matrix = this.A0e;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0f);
        A03();
        A04(f2, f3, f4, f5);
        if (this.A0G != i) {
            return true;
        }
        return false;
    }

    public float getPixelSize() {
        return (float) this.A0J;
    }

    public float getZoom() {
        return (((float) this.A0G) + this.A02) - 1.0f;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A06(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z = this.A0d;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z) {
            return onSaveInstanceState;
        }
        Bundle A072 = AnonymousClass001.A07();
        A0G(A072);
        A072.putParcelable("parentBundle", onSaveInstanceState);
        return A072;
    }

    public final void setMapEventHandler(C161217mO r1) {
        if (r1 == null) {
            r1 = C161217mO.A00;
        }
        this.A0S = r1;
    }

    public C92794ej(Context context, C124515yJ r6) {
        super(context);
        if ("FacebookMapOptions.java".equals(r6.A03) && "MapView.java".length() > 0) {
            r6.A03 = "MapView.java";
        }
        this.A0H = System.nanoTime();
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = r6;
        boolean z = r6.A06;
        r6.A06 = z;
        this.A0D = z ? -15789542 : -987675;
        C125165zQ r1 = new C125165zQ(context, this);
        this.A0R = r1;
        Matrix matrix = this.A0f;
        r1.A0J = matrix;
        r1.A08 = 0.87f;
        this.A0W = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0Z = true;
        AnonymousClass74L r0 = new AnonymousClass74L(this, this);
        this.A0Q = r0;
        r0.A04 = matrix;
        AnonymousClass6UZ.A08.add(AnonymousClass001.A0F(this));
        AnonymousClass6UZ.A02(false);
    }

    public void A0D(double d, double d2) {
        this.A04 = A00(d);
        this.A05 = A0B(d2, this.A0J);
    }

    public EnumSet getCurrentAttribution() {
        return this.A0g;
    }

    @Deprecated
    public final C139266jV getMap() {
        return this.A0M;
    }

    public final C124515yJ getMapOptions() {
        return this.A0N;
    }

    public float getTileScale() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A01();
            this.A0K = System.nanoTime();
            if (!this.A0X) {
                C97694q7 r3 = this.A0M.A0T.A03;
                r3.A01.set(0);
                r3.A00.set(0);
                r3.A01.set(0);
                this.A0X = true;
                return;
            }
            return;
        }
        throw C90514aH.A0s("MapView.onCreate() must be called!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C139266jV r2 = this.A0M;
        C97664q4 r1 = r2.A0G;
        if (r1 != null) {
            r1.A04.A03();
            r1.A03();
        }
        r2.A03();
        Vector vector = AnonymousClass6P6.A02;
        C97724qA r12 = new C97724qA();
        C133046Wl.A01(r12);
        C118505oA.A00(r12, (String) null);
        A02();
    }

    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0D);
        this.A0U = true;
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            C139206jP r2 = (C139206jP) this.A0M.A0W.get(i);
            if (r2.A04) {
                r2.A06(canvas);
                if (r2 instanceof C97644q2) {
                    this.A0U &= AnonymousClass000.A1Q(((C97654q3) r2).A00);
                }
            }
        }
        if (this.A0U) {
            C139266jV r1 = this.A0M;
            if (this.A0X) {
                new AnonymousClass790(r1.A0T.A03, this.A0N.A04);
                this.A0X = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A04;
        AnonymousClass6TY.A0C.A05(nanoTime2 - nanoTime);
        if (this.A0H > 0) {
            new AnonymousClass795(this, str, nanoTime2);
            this.A0H = 0;
        }
        if (this.A0K > 0) {
            new AnonymousClass796(this, str, nanoTime2);
            this.A0K = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bd, code lost:
        if (r1 != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            long r2 = java.lang.System.nanoTime()
            super.onLayout(r10, r11, r12, r13, r14)
            int r0 = r9.getWidth()
            r9.A0F = r0
            int r5 = r9.getHeight()
            r9.A0E = r5
            int r4 = r9.A0F
            float r0 = (float) r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r9.A06 = r0
            float r0 = (float) r5
            float r0 = r0 / r1
            r9.A07 = r0
            int r0 = java.lang.Math.max(r5, r4)
            double r4 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            X.6jV r6 = r9.A0M
            int r0 = r6.A0N
            double r0 = (double) r0
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            double r0 = (double) r0
            double r4 = java.lang.Math.log(r0)
            double r0 = A0n
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            r9.A09 = r0
            float r1 = r6.A02
            X.4ej r0 = r6.A0Q
            float r0 = r0.A09
            float r4 = java.lang.Math.max(r1, r0)
            r6.A02 = r4
            int r0 = r9.A0G
            float r1 = (float) r0
            float r0 = r9.A02
            float r1 = r1 + r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r6
            r5 = 0
            r8 = 1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = (int) r4
            float r4 = r4 % r6
            float r4 = r4 + r6
            r9.A05(r0, r4)
            r1 = 1
        L_0x0063:
            r9.A03()
            boolean r0 = r9.A0c
            if (r0 != 0) goto L_0x00bd
            int r0 = r9.A0G
            float r4 = (float) r0
            float r0 = r9.A02
            float r4 = r4 + r0
            float r4 = r4 - r6
            X.6jV r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            boolean r0 = r9.A0I(r4, r1, r0)
            if (r0 == 0) goto L_0x0086
            X.6jV r0 = r9.A0M
            r0.A04()
        L_0x0086:
            double r6 = r9.A04
            double r0 = r9.A05
            r9.A0D(r6, r0)
            float r4 = r9.A0C
            X.6jV r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0E(r4, r1, r0)
            r9.A0c = r8
        L_0x009e:
            X.6jV r0 = r9.A0M
            r0.A04()
        L_0x00a3:
            X.6jV r0 = r9.A0M
            java.util.List r0 = r0.A0W
            int r1 = r0.size()
        L_0x00ab:
            if (r5 >= r1) goto L_0x00c2
            X.6jV r0 = r9.A0M
            java.util.List r0 = r0.A0W
            java.lang.Object r0 = r0.get(r5)
            X.6jP r0 = (X.C139206jP) r0
            r0.A04()
            int r5 = r5 + 1
            goto L_0x00ab
        L_0x00bd:
            if (r1 == 0) goto L_0x00a3
            goto L_0x009e
        L_0x00c0:
            r1 = 0
            goto L_0x0063
        L_0x00c2:
            java.util.Queue r0 = r9.A0T
            if (r0 == 0) goto L_0x00d0
            X.4qB r1 = new X.4qB
            r1.<init>(r9)
            android.os.Handler r0 = X.C133046Wl.A01
            r0.post(r1)
        L_0x00d0:
            X.6TY r0 = X.AnonymousClass6TY.A0E
            X.AnonymousClass6TY.A02(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92794ej.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.4q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.4q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: X.4q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: X.4q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.6jP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: X.6jP} */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: type inference failed for: r14v2, types: [X.6jP] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (X.C90494aF.A01(r8, r3.A01) <= r5) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0547, code lost:
        if (X.C90494aF.A01(r3.A0C, r3.A0A) <= r6) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0555, code lost:
        if (r11 != 0.0f) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.C90494aF.A01(r8, r3.A0A) <= r11) goto L_0x0447;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f5 A[Catch:{ all -> 0x0278, all -> 0x0664 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0515 A[Catch:{ all -> 0x0278, all -> 0x0664 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x054c A[Catch:{ all -> 0x0278, all -> 0x0664 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0559 A[Catch:{ all -> 0x0278, all -> 0x0664 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05fb A[Catch:{ all -> 0x0278, all -> 0x0664 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            long r16 = java.lang.System.nanoTime()
            r0 = r22
            X.5zQ r3 = r0.A0R     // Catch:{ all -> 0x0664 }
            r15 = r23
            int r5 = r15.getActionMasked()     // Catch:{ all -> 0x0664 }
            int r14 = r15.getPointerCount()     // Catch:{ all -> 0x0664 }
            long r0 = r15.getEventTime()     // Catch:{ all -> 0x0664 }
            float r9 = r15.getX()     // Catch:{ all -> 0x0664 }
            float r8 = r15.getY()     // Catch:{ all -> 0x0664 }
            boolean r4 = r3.A0Q     // Catch:{ all -> 0x0664 }
            java.lang.String r6 = "longPressTimeout"
            r10 = 2
            r7 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0049
            if (r5 != r10) goto L_0x0042
            if (r14 > r2) goto L_0x0042
            float r4 = r3.A09     // Catch:{ all -> 0x0664 }
            float r12 = X.C90494aF.A01(r9, r4)     // Catch:{ all -> 0x0664 }
            int r4 = r3.A0R     // Catch:{ all -> 0x0664 }
            float r11 = (float) r4     // Catch:{ all -> 0x0664 }
            int r4 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            float r4 = r3.A0A     // Catch:{ all -> 0x0664 }
            float r4 = X.C90494aF.A01(r8, r4)     // Catch:{ all -> 0x0664 }
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0447
        L_0x0042:
            r3.A0Q = r7     // Catch:{ all -> 0x0664 }
            android.os.Handler r4 = X.C133046Wl.A01     // Catch:{ all -> 0x0664 }
            r4.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0664 }
        L_0x0049:
            if (r5 == r10) goto L_0x0447
            if (r5 != 0) goto L_0x02a1
            r3.A0N = r7     // Catch:{ all -> 0x0664 }
            r3.A0M = r7     // Catch:{ all -> 0x0664 }
            boolean r4 = r3.A0O     // Catch:{ all -> 0x0664 }
            if (r4 == 0) goto L_0x0077
            long r4 = r3.A0G     // Catch:{ all -> 0x0664 }
            long r11 = r0 - r4
            int r4 = r3.A0E     // Catch:{ all -> 0x0664 }
            long r4 = (long) r4     // Catch:{ all -> 0x0664 }
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x0077
            float r4 = r3.A00     // Catch:{ all -> 0x0664 }
            float r10 = X.C90494aF.A01(r9, r4)     // Catch:{ all -> 0x0664 }
            int r4 = r3.A0D     // Catch:{ all -> 0x0664 }
            float r5 = (float) r4     // Catch:{ all -> 0x0664 }
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0077
            float r4 = r3.A01     // Catch:{ all -> 0x0664 }
            float r4 = X.C90494aF.A01(r8, r4)     // Catch:{ all -> 0x0664 }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x007f
        L_0x0077:
            r3.A0O = r7     // Catch:{ all -> 0x0664 }
            r3.A00 = r9     // Catch:{ all -> 0x0664 }
            r3.A01 = r8     // Catch:{ all -> 0x0664 }
            r3.A0G = r0     // Catch:{ all -> 0x0664 }
        L_0x007f:
            r3.A09 = r9     // Catch:{ all -> 0x0664 }
            r3.A0A = r8     // Catch:{ all -> 0x0664 }
            r3.A0Q = r2     // Catch:{ all -> 0x0664 }
            X.75L r11 = r3.A0T     // Catch:{ all -> 0x0664 }
            long r4 = r3.A0S     // Catch:{ all -> 0x0664 }
            android.os.Handler r10 = X.C133046Wl.A01     // Catch:{ all -> 0x0664 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0664 }
            long r0 = r0 + r4
            r10.postAtTime(r11, r6, r0)     // Catch:{ all -> 0x0664 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x00b3
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch:{ all -> 0x0664 }
            r3.A0K = r0     // Catch:{ all -> 0x0664 }
        L_0x009d:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0664 }
            X.7c3 r12 = r3.A0L     // Catch:{ all -> 0x0664 }
            X.4ej r12 = (X.C92794ej) r12     // Catch:{ all -> 0x0664 }
            r12.A0V = r7     // Catch:{ all -> 0x0664 }
            X.6jV r0 = r12.A0M     // Catch:{ all -> 0x0664 }
            java.util.List r0 = r0.A0W     // Catch:{ all -> 0x0664 }
            r21 = r0
            int r13 = X.C36431kI.A07(r21)     // Catch:{ all -> 0x0664 }
            goto L_0x00b7
        L_0x00b3:
            r0.clear()     // Catch:{ all -> 0x0664 }
            goto L_0x009d
        L_0x00b7:
            r20 = 0
            r11 = 0
        L_0x00ba:
            if (r13 < 0) goto L_0x0282
            r0 = r21
            java.lang.Object r14 = r0.get(r13)     // Catch:{ all -> 0x0664 }
            X.6jP r14 = (X.C139206jP) r14     // Catch:{ all -> 0x0664 }
            boolean r0 = r14.A04     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0264
            boolean r0 = r14 instanceof X.C97674q5     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x00de
            r1 = r14
            X.4q5 r1 = (X.C97674q5) r1     // Catch:{ all -> 0x0664 }
            X.60l r0 = r1.A0B     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0264
            android.graphics.RectF r0 = r1.A0A     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.contains(r9, r8)     // Catch:{ all -> 0x0664 }
            r1 = 1
            if (r0 != 0) goto L_0x0269
            goto L_0x0264
        L_0x00de:
            boolean r0 = r14 instanceof X.C97634q1     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x01c8
            r10 = r14
            X.4q1 r10 = (X.C97634q1) r10     // Catch:{ all -> 0x0664 }
            boolean r0 = r10.A0J     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x014a
            android.graphics.Matrix r4 = X.C97634q1.A0X     // Catch:{ all -> 0x0664 }
            float r0 = r10.A05     // Catch:{ all -> 0x0664 }
            r4.setRotate(r0)     // Catch:{ all -> 0x0664 }
            float[] r1 = r10.A0T     // Catch:{ all -> 0x0664 }
            float r3 = r10.A01     // Catch:{ all -> 0x0664 }
            float r0 = r10.A03     // Catch:{ all -> 0x0664 }
            float r3 = r3 - r0
            r1[r7] = r3     // Catch:{ all -> 0x0664 }
            float r3 = r10.A07     // Catch:{ all -> 0x0664 }
            float r0 = r10.A06     // Catch:{ all -> 0x0664 }
            float r3 = r3 - r0
            r1[r2] = r3     // Catch:{ all -> 0x0664 }
            r4.mapPoints(r1)     // Catch:{ all -> 0x0664 }
            r3 = r1[r7]     // Catch:{ all -> 0x0664 }
            float r0 = r10.A09     // Catch:{ all -> 0x0664 }
            float r3 = r3 + r0
            r1[r7] = r3     // Catch:{ all -> 0x0664 }
            r18 = r1[r2]     // Catch:{ all -> 0x0664 }
            float r3 = r10.A0A     // Catch:{ all -> 0x0664 }
            float r0 = r10.A0R     // Catch:{ all -> 0x0664 }
            float r3 = r3 - r0
            float r18 = r18 + r3
            r1[r2] = r18     // Catch:{ all -> 0x0664 }
            int r4 = r10.A0C     // Catch:{ all -> 0x0664 }
            int r0 = r4 / 2
            int r3 = r10.A0B     // Catch:{ all -> 0x0664 }
            float r5 = (float) r3     // Catch:{ all -> 0x0664 }
            float r15 = r18 - r5
            r6 = r1[r7]     // Catch:{ all -> 0x0664 }
            float r0 = (float) r0     // Catch:{ all -> 0x0664 }
            float r3 = r6 - r0
            float r6 = r6 + r0
            float r1 = r10.A0S     // Catch:{ all -> 0x0664 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            float r0 = r10.A08     // Catch:{ all -> 0x0664 }
            float r15 = r15 - r0
            float r18 = r18 - r0
        L_0x012f:
            float r0 = (float) r4     // Catch:{ all -> 0x0664 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            float r0 = r10.A02     // Catch:{ all -> 0x0664 }
            float r3 = r3 - r0
            float r6 = r6 + r0
        L_0x0138:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x014a
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x014a
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x014a
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x014a
            goto L_0x0285
        L_0x014a:
            r10.A0H = r7     // Catch:{ all -> 0x0664 }
            boolean r0 = X.C97634q1.A02(r10)     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0264
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0664 }
            float[] r6 = r10.A0T     // Catch:{ all -> 0x0278 }
            r6[r7] = r9     // Catch:{ all -> 0x0278 }
            r6[r2] = r8     // Catch:{ all -> 0x0278 }
            float r3 = r10.A05     // Catch:{ all -> 0x0278 }
            float r15 = -r3
            android.graphics.Matrix r5 = X.C97634q1.A0X     // Catch:{ all -> 0x0278 }
            float r4 = r10.A09     // Catch:{ all -> 0x0278 }
            float r3 = r10.A0A     // Catch:{ all -> 0x0278 }
            r5.setRotate(r15, r4, r3)     // Catch:{ all -> 0x0278 }
            r5.mapPoints(r6)     // Catch:{ all -> 0x0278 }
            r19 = r6[r7]     // Catch:{ all -> 0x0278 }
            float r5 = r10.A09     // Catch:{ all -> 0x0278 }
            float r3 = r10.A03     // Catch:{ all -> 0x0278 }
            float r18 = r5 - r3
            int r3 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r3 < 0) goto L_0x0193
            float r3 = r10.A04     // Catch:{ all -> 0x0278 }
            float r3 = r3 + r5
            int r3 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0193
            r15 = r6[r2]     // Catch:{ all -> 0x0278 }
            float r4 = r10.A0A     // Catch:{ all -> 0x0278 }
            float r3 = r10.A06     // Catch:{ all -> 0x0278 }
            float r3 = r4 - r3
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0193
            float r3 = r10.A00     // Catch:{ all -> 0x0278 }
            float r4 = r4 + r3
            int r3 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0193
            goto L_0x0272
        L_0x0193:
            float r4 = r10.A02     // Catch:{ all -> 0x0278 }
            float r18 = r18 - r4
            int r3 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            if (r3 < 0) goto L_0x01c1
            float r3 = r10.A04     // Catch:{ all -> 0x0278 }
            float r5 = r5 + r3
            float r5 = r5 + r4
            int r3 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x01c1
            r6 = r6[r2]     // Catch:{ all -> 0x0278 }
            float r5 = r10.A0A     // Catch:{ all -> 0x0278 }
            float r3 = r10.A06     // Catch:{ all -> 0x0278 }
            float r3 = r5 - r3
            float r4 = r10.A08     // Catch:{ all -> 0x0278 }
            float r3 = r3 - r4
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x01c1
            float r3 = r10.A00     // Catch:{ all -> 0x0278 }
            float r5 = r5 + r3
            float r5 = r5 + r4
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x01c1
            X.6TY r3 = X.AnonymousClass6TY.A0H     // Catch:{ all -> 0x0664 }
            X.AnonymousClass6TY.A02(r3, r0)     // Catch:{ all -> 0x0664 }
            goto L_0x0268
        L_0x01c1:
            X.6TY r3 = X.AnonymousClass6TY.A0H     // Catch:{ all -> 0x0664 }
            X.AnonymousClass6TY.A02(r3, r0)     // Catch:{ all -> 0x0664 }
            goto L_0x0264
        L_0x01c8:
            boolean r0 = r14 instanceof X.C97624q0     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x020a
            r4 = r14
            X.4q0 r4 = (X.C97624q0) r4     // Catch:{ all -> 0x0664 }
            float r1 = r4.A01     // Catch:{ all -> 0x0664 }
            float r5 = r4.A02     // Catch:{ all -> 0x0664 }
            float r6 = r1 - r5
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x01ea
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01ea
            float r3 = r4.A03     // Catch:{ all -> 0x0664 }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01ea
            float r3 = r3 + r5
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01ea
            goto L_0x027f
        L_0x01ea:
            float r3 = r4.A00     // Catch:{ all -> 0x0664 }
            float r6 = r6 - r3
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0207
            float r1 = r1 + r3
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0207
            float r1 = r4.A03     // Catch:{ all -> 0x0664 }
            float r0 = r1 - r3
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0207
            float r1 = r1 + r5
            float r1 = r1 + r3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0207
            r4.A04 = r2     // Catch:{ all -> 0x0664 }
            goto L_0x0268
        L_0x0207:
            r4.A04 = r7     // Catch:{ all -> 0x0664 }
            goto L_0x0264
        L_0x020a:
            boolean r0 = r14 instanceof X.C97614pz     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0245
            r1 = r14
            X.4pz r1 = (X.C97614pz) r1     // Catch:{ all -> 0x0664 }
            float r4 = r1.A00     // Catch:{ all -> 0x0664 }
            float r5 = r1.A02     // Catch:{ all -> 0x0664 }
            float r0 = r4 - r5
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x022f
            float r0 = r4 + r5
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x022f
            float r3 = r1.A01     // Catch:{ all -> 0x0664 }
            float r0 = r3 - r5
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x022f
            float r3 = r3 + r5
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x022f
            goto L_0x0287
        L_0x022f:
            float r3 = r1.A09     // Catch:{ all -> 0x0664 }
            float r0 = r4 - r3
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0264
            float r4 = r4 + r3
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0264
            float r1 = r1.A01     // Catch:{ all -> 0x0664 }
            float r0 = r1 - r3
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0264
            goto L_0x025f
        L_0x0245:
            boolean r0 = r14 instanceof X.C97604py     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0264
            r1 = r14
            X.4py r1 = (X.C97604py) r1     // Catch:{ all -> 0x0664 }
            android.graphics.RectF r0 = r1.A04     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.contains(r9, r8)     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x0287
            android.graphics.RectF r0 = r1.A05     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.contains(r9, r8)     // Catch:{ all -> 0x0664 }
            boolean r1 = X.AnonymousClass000.A1P(r0)     // Catch:{ all -> 0x0664 }
            goto L_0x0269
        L_0x025f:
            float r1 = r1 + r3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0268
        L_0x0264:
            int r13 = r13 + -1
            goto L_0x00ba
        L_0x0268:
            r1 = 1
        L_0x0269:
            r0 = 2
            if (r1 == r0) goto L_0x0287
            if (r1 <= r11) goto L_0x0264
            r20 = r14
            r11 = 1
            goto L_0x0264
        L_0x0272:
            X.6TY r3 = X.AnonymousClass6TY.A0H     // Catch:{ all -> 0x0664 }
            X.AnonymousClass6TY.A02(r3, r0)     // Catch:{ all -> 0x0664 }
            goto L_0x0287
        L_0x0278:
            r3 = move-exception
            X.6TY r2 = X.AnonymousClass6TY.A0H     // Catch:{ all -> 0x0664 }
            X.AnonymousClass6TY.A02(r2, r0)     // Catch:{ all -> 0x0664 }
            throw r3     // Catch:{ all -> 0x0664 }
        L_0x027f:
            r4.A04 = r2     // Catch:{ all -> 0x0664 }
            goto L_0x0287
        L_0x0282:
            r14 = r20
            goto L_0x0287
        L_0x0285:
            r10.A0H = r2     // Catch:{ all -> 0x0664 }
        L_0x0287:
            r12.A0O = r14     // Catch:{ all -> 0x0664 }
            if (r14 == 0) goto L_0x065c
            boolean r0 = r14 instanceof X.C97634q1     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x029c
            X.4q1 r14 = (X.C97634q1) r14     // Catch:{ all -> 0x0664 }
            boolean r0 = r14.A0H     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x065c
            r14.A0I = r2     // Catch:{ all -> 0x0664 }
        L_0x0297:
            r14.A03()     // Catch:{ all -> 0x0664 }
            goto L_0x065c
        L_0x029c:
            boolean r0 = r14 instanceof X.C97624q0     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x065c
            goto L_0x0297
        L_0x02a1:
            if (r5 != r2) goto L_0x0420
            r3.A0F = r7     // Catch:{ all -> 0x0664 }
            long r4 = r3.A0I     // Catch:{ all -> 0x0664 }
            long r10 = r0 - r4
            int r4 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x0664 }
            long r4 = (long) r4     // Catch:{ all -> 0x0664 }
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0315
            X.7c3 r5 = r3.A0L     // Catch:{ all -> 0x0664 }
            X.4ej r5 = (X.C92794ej) r5     // Catch:{ all -> 0x0664 }
            A07(r5)     // Catch:{ all -> 0x0664 }
            X.63E r0 = r5.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x02d5
            X.6jV r7 = r5.A0M     // Catch:{ all -> 0x0664 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.64g r6 = new X.64g     // Catch:{ all -> 0x0664 }
            r6.<init>()     // Catch:{ all -> 0x0664 }
            r6.A02 = r0     // Catch:{ all -> 0x0664 }
            r4 = 200(0xc8, float:2.8E-43)
            r1 = 0
            X.7po r0 = new X.7po     // Catch:{ all -> 0x0664 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0664 }
        L_0x02d2:
            r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x0664 }
        L_0x02d5:
            boolean r0 = r3.A0O     // Catch:{ all -> 0x0664 }
            r0 = r0 ^ 1
            r3.A0O = r0     // Catch:{ all -> 0x0664 }
            X.7c3 r1 = r3.A0L     // Catch:{ all -> 0x0664 }
            X.4ej r1 = (X.C92794ej) r1     // Catch:{ all -> 0x0664 }
            A07(r1)     // Catch:{ all -> 0x0664 }
            boolean r0 = r1.A0V     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x02f1
            X.74L r0 = r1.A0Q     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x02f1
            X.6jV r0 = r1.A0M     // Catch:{ all -> 0x0664 }
            r0.A04()     // Catch:{ all -> 0x0664 }
        L_0x02f1:
            X.6jP r3 = r1.A0O     // Catch:{ all -> 0x0664 }
            if (r3 == 0) goto L_0x065c
            boolean r0 = r3 instanceof X.C97634q1     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x030b
            X.4q1 r3 = (X.C97634q1) r3     // Catch:{ all -> 0x0664 }
            boolean r0 = r3.A0H     // Catch:{ all -> 0x0664 }
            r1 = 0
            if (r0 == 0) goto L_0x065c
            boolean r0 = r3.A0I     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x065c
            r3.A0I = r1     // Catch:{ all -> 0x0664 }
        L_0x0306:
            r3.A03()     // Catch:{ all -> 0x0664 }
            goto L_0x065c
        L_0x030b:
            boolean r0 = r3 instanceof X.C97624q0     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x065c
            X.4q0 r3 = (X.C97624q0) r3     // Catch:{ all -> 0x0664 }
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x0664 }
            goto L_0x0306
        L_0x0315:
            boolean r4 = r3.A0O     // Catch:{ all -> 0x0664 }
            java.lang.String r6 = "clickTimeout"
            if (r4 == 0) goto L_0x0378
            long r4 = r3.A0G     // Catch:{ all -> 0x0664 }
            long r10 = r0 - r4
            int r4 = r3.A0E     // Catch:{ all -> 0x0664 }
            long r4 = (long) r4     // Catch:{ all -> 0x0664 }
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0378
            float r4 = r3.A00     // Catch:{ all -> 0x0664 }
            float r7 = X.C90494aF.A01(r9, r4)     // Catch:{ all -> 0x0664 }
            int r4 = r3.A0D     // Catch:{ all -> 0x0664 }
            float r5 = (float) r4     // Catch:{ all -> 0x0664 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0378
            float r4 = r3.A01     // Catch:{ all -> 0x0664 }
            float r4 = X.C90494aF.A01(r8, r4)     // Catch:{ all -> 0x0664 }
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0378
            android.os.Handler r0 = X.C133046Wl.A01     // Catch:{ all -> 0x0664 }
            r0.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0664 }
            X.7c3 r5 = r3.A0L     // Catch:{ all -> 0x0664 }
            float r4 = r3.A00     // Catch:{ all -> 0x0664 }
            float r1 = r3.A01     // Catch:{ all -> 0x0664 }
            X.4ej r5 = (X.C92794ej) r5     // Catch:{ all -> 0x0664 }
            A07(r5)     // Catch:{ all -> 0x0664 }
            X.63E r0 = r5.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x02d5
            int r4 = (int) r4     // Catch:{ all -> 0x0664 }
            int r0 = (int) r1     // Catch:{ all -> 0x0664 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x0664 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0664 }
            X.6jV r7 = r5.A0M     // Catch:{ all -> 0x0664 }
            r0 = 1065353216(0x3f800000, float:1.0)
            X.64g r6 = new X.64g     // Catch:{ all -> 0x0664 }
            r6.<init>()     // Catch:{ all -> 0x0664 }
            r6.A02 = r0     // Catch:{ all -> 0x0664 }
            int r0 = r1.x     // Catch:{ all -> 0x0664 }
            float r0 = (float) r0     // Catch:{ all -> 0x0664 }
            r6.A03 = r0     // Catch:{ all -> 0x0664 }
            int r0 = r1.y     // Catch:{ all -> 0x0664 }
            float r0 = (float) r0     // Catch:{ all -> 0x0664 }
            r6.A04 = r0     // Catch:{ all -> 0x0664 }
            r4 = 200(0xc8, float:2.8E-43)
            X.7po r0 = new X.7po     // Catch:{ all -> 0x0664 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x0664 }
            goto L_0x02d2
        L_0x0378:
            boolean r4 = r3.A0N     // Catch:{ all -> 0x0664 }
            if (r4 != 0) goto L_0x0391
            boolean r4 = r3.A0Q     // Catch:{ all -> 0x0664 }
            if (r4 != 0) goto L_0x0391
            X.75L r8 = r3.A0U     // Catch:{ all -> 0x0664 }
            int r0 = r3.A0E     // Catch:{ all -> 0x0664 }
            long r4 = (long) r0     // Catch:{ all -> 0x0664 }
            android.os.Handler r7 = X.C133046Wl.A01     // Catch:{ all -> 0x0664 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0664 }
            long r0 = r0 + r4
            r7.postAtTime(r8, r6, r0)     // Catch:{ all -> 0x0664 }
            goto L_0x02d5
        L_0x0391:
            long r4 = r3.A0H     // Catch:{ all -> 0x0664 }
            long r0 = r0 - r4
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x0664 }
            long r4 = (long) r4     // Catch:{ all -> 0x0664 }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03bc
            boolean r0 = r3.A0M     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x03bc
            X.7c3 r1 = r3.A0L     // Catch:{ all -> 0x0664 }
            X.4ej r1 = (X.C92794ej) r1     // Catch:{ all -> 0x0664 }
            X.63E r0 = r1.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x03bc
            r0 = 0
            r1.A0Y = r0     // Catch:{ all -> 0x0664 }
            X.74L r0 = r1.A0Q     // Catch:{ all -> 0x0664 }
            r0.A07 = r2     // Catch:{ all -> 0x0664 }
            A09(r1)     // Catch:{ all -> 0x0664 }
            X.7mO r1 = r1.A0S     // Catch:{ all -> 0x0664 }
            java.lang.String r0 = "zoom"
            r1.Bpr(r0)     // Catch:{ all -> 0x0664 }
        L_0x03bc:
            boolean r0 = r3.A0N     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x02d5
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0664 }
            android.view.VelocityTracker r1 = r3.A0K     // Catch:{ all -> 0x0664 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)     // Catch:{ all -> 0x0664 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            float r5 = r0.getXVelocity()     // Catch:{ all -> 0x0664 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            float r6 = r0.getYVelocity()     // Catch:{ all -> 0x0664 }
            float r1 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0664 }
            float r0 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0664 }
            float r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0664 }
            float r0 = r3.A07     // Catch:{ all -> 0x0664 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02d5
            X.7c3 r1 = r3.A0L     // Catch:{ all -> 0x0664 }
            float r4 = r3.A08     // Catch:{ all -> 0x0664 }
            float r5 = r5 * r4
            float r4 = r4 * r6
            X.4ej r1 = (X.C92794ej) r1     // Catch:{ all -> 0x0664 }
            X.63E r0 = r1.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x02d5
            r0 = 0
            r1.A0Y = r0     // Catch:{ all -> 0x0664 }
            X.74L r0 = r1.A0Q     // Catch:{ all -> 0x0664 }
            int r6 = r1.A0F     // Catch:{ all -> 0x0664 }
            int r7 = r1.A0E     // Catch:{ all -> 0x0664 }
            int r8 = (int) r5     // Catch:{ all -> 0x0664 }
            int r9 = (int) r4     // Catch:{ all -> 0x0664 }
            android.widget.OverScroller r5 = r0.A0E     // Catch:{ all -> 0x0664 }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0664 }
            r0.A08 = r2     // Catch:{ all -> 0x0664 }
            A09(r1)     // Catch:{ all -> 0x0664 }
            X.7mO r1 = r1.A0S     // Catch:{ all -> 0x0664 }
            java.lang.String r0 = "pan"
            r1.Bpr(r0)     // Catch:{ all -> 0x0664 }
            goto L_0x02d5
        L_0x0420:
            r4 = 5
            if (r5 != r4) goto L_0x0427
            r3.A0I = r0     // Catch:{ all -> 0x0664 }
            goto L_0x065c
        L_0x0427:
            r4 = 6
            if (r5 != r4) goto L_0x0436
            if (r14 != r10) goto L_0x065c
            r3.A0H = r0     // Catch:{ all -> 0x0664 }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x065c
            r3.A0M = r7     // Catch:{ all -> 0x0664 }
            goto L_0x065c
        L_0x0436:
            r0 = 3
            if (r5 != r0) goto L_0x065c
            r3.A0F = r7     // Catch:{ all -> 0x0664 }
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x065c
            r0.recycle()     // Catch:{ all -> 0x0664 }
            r0 = 0
            r3.A0K = r0     // Catch:{ all -> 0x0664 }
            goto L_0x065c
        L_0x0447:
            r1 = 0
            r13 = 0
            r10 = 0
        L_0x044a:
            if (r1 >= r14) goto L_0x0459
            float r0 = r15.getX(r1)     // Catch:{ all -> 0x0664 }
            float r13 = r13 + r0
            float r0 = r15.getY(r1)     // Catch:{ all -> 0x0664 }
            float r10 = r10 + r0
            int r1 = r1 + 1
            goto L_0x044a
        L_0x0459:
            float r12 = (float) r14     // Catch:{ all -> 0x0664 }
            float r13 = r13 / r12
            float r10 = r10 / r12
            r11 = 0
            r6 = 0
        L_0x045e:
            if (r11 >= r14) goto L_0x0479
            float r0 = r15.getX(r11)     // Catch:{ all -> 0x0664 }
            float r0 = r0 - r13
            double r0 = (double) r0     // Catch:{ all -> 0x0664 }
            r20 = r0
            float r0 = r15.getY(r11)     // Catch:{ all -> 0x0664 }
            float r0 = r0 - r10
            double r0 = (double) r0     // Catch:{ all -> 0x0664 }
            r4 = r20
            double r0 = java.lang.Math.hypot(r4, r0)     // Catch:{ all -> 0x0664 }
            float r4 = (float) r0     // Catch:{ all -> 0x0664 }
            float r6 = r6 + r4
            int r11 = r11 + 1
            goto L_0x045e
        L_0x0479:
            float r6 = r6 / r12
            r3.A0B = r13     // Catch:{ all -> 0x0664 }
            r3.A0C = r10     // Catch:{ all -> 0x0664 }
            android.graphics.Matrix r1 = r3.A0J     // Catch:{ all -> 0x0664 }
            if (r1 == 0) goto L_0x048f
            float[] r0 = r3.A0V     // Catch:{ all -> 0x0664 }
            r0[r7] = r13     // Catch:{ all -> 0x0664 }
            r0[r2] = r10     // Catch:{ all -> 0x0664 }
            r1.mapPoints(r0)     // Catch:{ all -> 0x0664 }
            r13 = r0[r7]     // Catch:{ all -> 0x0664 }
            r10 = r0[r2]     // Catch:{ all -> 0x0664 }
        L_0x048f:
            int r1 = r3.A0F     // Catch:{ all -> 0x0664 }
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r14 == r1) goto L_0x049d
            r3.A02 = r6     // Catch:{ all -> 0x0664 }
            r3.A06 = r0     // Catch:{ all -> 0x0664 }
            if (r14 <= r2) goto L_0x064f
            goto L_0x0638
        L_0x049d:
            float r4 = r3.A06     // Catch:{ all -> 0x0664 }
            if (r14 <= r2) goto L_0x051a
            float r5 = r3.A02     // Catch:{ all -> 0x0664 }
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x04ab
            float r12 = r6 / r5
            goto L_0x04ad
        L_0x04ab:
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x04ad:
            float r11 = r12 / r4
            float r0 = X.C90494aF.A01(r11, r0)     // Catch:{ all -> 0x0664 }
            double r0 = (double) r0
            r18 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            boolean r18 = X.AnonymousClass000.A1R(r4)
            boolean r0 = r3.A0P     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x04f4
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x0664 }
            float r8 = r8 - r0
            double r4 = (double) r8     // Catch:{ all -> 0x0664 }
            float r0 = r15.getX(r2)     // Catch:{ all -> 0x0664 }
            float r9 = r9 - r0
            double r0 = (double) r9     // Catch:{ all -> 0x0664 }
            double r0 = java.lang.Math.atan2(r4, r0)     // Catch:{ all -> 0x0664 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0664 }
            float r4 = (float) r0     // Catch:{ all -> 0x0664 }
            int r0 = r3.A0F     // Catch:{ all -> 0x0664 }
            if (r0 == r14) goto L_0x04de
            r3.A05 = r4     // Catch:{ all -> 0x0664 }
        L_0x04de:
            float r0 = r3.A05     // Catch:{ all -> 0x0664 }
            float r5 = r4 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ec
            float r5 = r5 - r1
            goto L_0x04f7
        L_0x04ec:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f7
            float r5 = r5 + r1
            goto L_0x04f7
        L_0x04f4:
            r0 = 0
            goto L_0x0508
        L_0x04f7:
            r3.A05 = r4     // Catch:{ all -> 0x0664 }
            float r0 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0664 }
            double r0 = (double) r0     // Catch:{ all -> 0x0664 }
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x04f4
            r0 = 0
            r3.A0I = r0     // Catch:{ all -> 0x0664 }
        L_0x0508:
            float r4 = r3.A02     // Catch:{ all -> 0x0664 }
            float r5 = X.C90494aF.A01(r6, r4)     // Catch:{ all -> 0x0664 }
            int r4 = r3.A0R     // Catch:{ all -> 0x0664 }
            float r4 = (float) r4     // Catch:{ all -> 0x0664 }
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0517
            r3.A0I = r0     // Catch:{ all -> 0x0664 }
        L_0x0517:
            r0 = r11
            r4 = r12
            goto L_0x051c
        L_0x051a:
            r18 = 0
        L_0x051c:
            float r1 = r3.A03     // Catch:{ all -> 0x0664 }
            float r12 = r13 - r1
            float r1 = r3.A04     // Catch:{ all -> 0x0664 }
            float r11 = r10 - r1
            boolean r1 = r3.A0N     // Catch:{ all -> 0x0664 }
            if (r1 != 0) goto L_0x0540
            float r5 = r3.A0B     // Catch:{ all -> 0x0664 }
            float r1 = r3.A09     // Catch:{ all -> 0x0664 }
            float r5 = X.C90494aF.A01(r5, r1)     // Catch:{ all -> 0x0664 }
            int r1 = r3.A0R     // Catch:{ all -> 0x0664 }
            float r6 = (float) r1     // Catch:{ all -> 0x0664 }
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0557
            float r5 = r3.A0C     // Catch:{ all -> 0x0664 }
            float r1 = r3.A0A     // Catch:{ all -> 0x0664 }
            float r1 = X.C90494aF.A01(r5, r1)     // Catch:{ all -> 0x0664 }
            goto L_0x0545
        L_0x0540:
            boolean r1 = r3.A0M     // Catch:{ all -> 0x0664 }
            if (r1 != 0) goto L_0x0549
            goto L_0x054e
        L_0x0545:
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0557
        L_0x0549:
            r1 = 0
        L_0x054a:
            if (r18 == 0) goto L_0x0559
            goto L_0x0601
        L_0x054e:
            r5 = 0
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0557
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0549
        L_0x0557:
            r1 = 1
            goto L_0x054a
        L_0x0559:
            r3.A0M = r7     // Catch:{ all -> 0x0664 }
            if (r1 == 0) goto L_0x0635
            X.7c3 r9 = r3.A0L     // Catch:{ all -> 0x0664 }
            float r1 = r3.A0B     // Catch:{ all -> 0x0664 }
            float r7 = r3.A0C     // Catch:{ all -> 0x0664 }
            float r8 = r3.A08     // Catch:{ all -> 0x0664 }
            float r12 = r12 * r8
            float r8 = r8 * r11
            X.4ej r9 = (X.C92794ej) r9     // Catch:{ all -> 0x0664 }
            X.6jP r6 = r9.A0O     // Catch:{ all -> 0x0664 }
            if (r6 == 0) goto L_0x0592
            boolean r0 = r6 instanceof X.C97624q0     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0592
            X.4q0 r6 = (X.C97624q0) r6     // Catch:{ all -> 0x0664 }
            boolean r0 = r6.A04     // Catch:{ all -> 0x0664 }
            r5 = 0
            if (r0 == 0) goto L_0x0592
            float r0 = r6.A01     // Catch:{ all -> 0x0664 }
            float r4 = r6.A02     // Catch:{ all -> 0x0664 }
            float r11 = r0 - r4
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x05f2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x05f2
            float r1 = r6.A03     // Catch:{ all -> 0x0664 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x05f2
            float r1 = r1 + r4
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0592
            goto L_0x05f2
        L_0x0592:
            X.63E r0 = r9.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x05f7
            r9.requestDisallowInterceptTouchEvent(r2)     // Catch:{ all -> 0x0664 }
            A08(r9)     // Catch:{ all -> 0x0664 }
            double r0 = r9.A04     // Catch:{ all -> 0x0664 }
            long r4 = r9.A0J     // Catch:{ all -> 0x0664 }
            float r11 = (float) r4     // Catch:{ all -> 0x0664 }
            float r6 = r12 / r11
            double r6 = (double) r6     // Catch:{ all -> 0x0664 }
            double r0 = r0 - r6
            double r0 = A00(r0)     // Catch:{ all -> 0x0664 }
            r9.A04 = r0     // Catch:{ all -> 0x0664 }
            double r0 = r9.A05     // Catch:{ all -> 0x0664 }
            float r6 = r8 / r11
            double r6 = (double) r6     // Catch:{ all -> 0x0664 }
            double r0 = r0 - r6
            double r0 = r9.A0B(r0, r4)     // Catch:{ all -> 0x0664 }
            r9.A05 = r0     // Catch:{ all -> 0x0664 }
            r9.invalidate()     // Catch:{ all -> 0x0664 }
            X.6jV r6 = r9.A0M     // Catch:{ all -> 0x0664 }
            X.7eM r0 = r6.A0A     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x05ca
            java.util.ArrayList r0 = r6.A0V     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0664 }
            if (r0 != 0) goto L_0x05ef
        L_0x05ca:
            float r0 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0664 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x05dc
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0664 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ef
        L_0x05dc:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0664 }
            long r0 = r9.A0I     // Catch:{ all -> 0x0664 }
            long r11 = r4 - r0
            r7 = 200(0xc8, double:9.9E-322)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x05ef
            r6.A04()     // Catch:{ all -> 0x0664 }
            r9.A0I = r4     // Catch:{ all -> 0x0664 }
        L_0x05ef:
            r9.A0V = r2     // Catch:{ all -> 0x0664 }
            goto L_0x05f7
        L_0x05f2:
            r6.A04 = r5     // Catch:{ all -> 0x0664 }
            r6.A03()     // Catch:{ all -> 0x0664 }
        L_0x05f7:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x05fe
            r0.addMovement(r15)     // Catch:{ all -> 0x0664 }
        L_0x05fe:
            r3.A0N = r2     // Catch:{ all -> 0x0664 }
            goto L_0x0656
        L_0x0601:
            X.7c3 r6 = r3.A0L     // Catch:{ all -> 0x0664 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r8 = r3.A0B     // Catch:{ all -> 0x0664 }
            float r5 = r3.A0C     // Catch:{ all -> 0x0664 }
            X.4ej r6 = (X.C92794ej) r6     // Catch:{ all -> 0x0664 }
            X.63E r0 = r6.A0P     // Catch:{ all -> 0x0664 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0631
            A08(r6)     // Catch:{ all -> 0x0664 }
            r6.A0A = r8     // Catch:{ all -> 0x0664 }
            r6.A0B = r5     // Catch:{ all -> 0x0664 }
            boolean r0 = A0A(r6, r1, r8, r5)     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x062e
            boolean r0 = r6.A0Z     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x062e
            X.74L r5 = r6.A0Q     // Catch:{ all -> 0x0664 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r5.A01 = r1     // Catch:{ all -> 0x0664 }
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x0664 }
        L_0x062e:
            r6.invalidate()     // Catch:{ all -> 0x0664 }
        L_0x0631:
            r3.A06 = r4     // Catch:{ all -> 0x0664 }
            r3.A0M = r2     // Catch:{ all -> 0x0664 }
        L_0x0635:
            r3.A0N = r7     // Catch:{ all -> 0x0664 }
            goto L_0x0656
        L_0x0638:
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x0664 }
            float r8 = r8 - r0
            double r0 = (double) r8     // Catch:{ all -> 0x0664 }
            float r4 = r15.getX(r2)     // Catch:{ all -> 0x0664 }
            float r9 = r9 - r4
            double r4 = (double) r9     // Catch:{ all -> 0x0664 }
            double r0 = java.lang.Math.atan2(r0, r4)     // Catch:{ all -> 0x0664 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0664 }
            float r4 = (float) r0     // Catch:{ all -> 0x0664 }
            r3.A05 = r4     // Catch:{ all -> 0x0664 }
        L_0x064f:
            android.view.VelocityTracker r0 = r3.A0K     // Catch:{ all -> 0x0664 }
            if (r0 == 0) goto L_0x0656
            r0.clear()     // Catch:{ all -> 0x0664 }
        L_0x0656:
            r3.A03 = r13     // Catch:{ all -> 0x0664 }
            r3.A04 = r10     // Catch:{ all -> 0x0664 }
            r3.A0F = r14     // Catch:{ all -> 0x0664 }
        L_0x065c:
            X.6TY r3 = X.AnonymousClass6TY.A0N
            r0 = r16
            X.AnonymousClass6TY.A02(r3, r0)
            return r2
        L_0x0664:
            r3 = move-exception
            X.6TY r2 = X.AnonymousClass6TY.A0N
            r0 = r16
            X.AnonymousClass6TY.A02(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92794ej.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A01();
        } else {
            A02();
        }
    }

    public void setOnFirstTileLoadedCallback(AnonymousClass7c1 r1) {
        this.A0a = r1;
    }
}
