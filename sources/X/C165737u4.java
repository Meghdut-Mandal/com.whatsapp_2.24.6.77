package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7u4  reason: invalid class name and case insensitive filesystem */
public class C165737u4 extends Drawable implements Animatable, Drawable.Callback {
    public static final Executor A0h = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new AnonymousClass77P());
    public float A00;
    public Bitmap A01;
    public Canvas A02;
    public Matrix A03;
    public Matrix A04;
    public Paint A05;
    public Rect A06;
    public Rect A07;
    public Rect A08;
    public RectF A09;
    public RectF A0A;
    public RectF A0B;
    public C187718yQ A0C = C187718yQ.AUTOMATIC;
    public AnonymousClass93V A0D;
    public C22771Avh A0E;
    public AnonymousClass9Y2 A0F;
    public C187768yV A0G = C187768yV.AUTOMATIC;
    public AnonymousClass92Z A0H;
    public C193779Mv A0I;
    public C197949ce A0J;
    public AnonymousClass81G A0K;
    public Integer A0L = C023109s.A00;
    public String A0M;
    public String A0N;
    public Map A0O;
    public boolean A0P = true;
    public boolean A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = false;
    public boolean A0Y = true;
    public boolean A0Z = false;
    public int A0a = 255;
    public final C165647tl A0b;
    public final ArrayList A0c = AnonymousClass001.A0I();
    public final Semaphore A0d;
    public final ValueAnimator.AnimatorUpdateListener A0e;
    public final Matrix A0f = C90524aI.A0B();
    public final Runnable A0g;

    public int getOpacity() {
        return -3;
    }

    private void A00(Canvas canvas) {
        AnonymousClass81G r3 = this.A0K;
        AnonymousClass9Y2 r6 = this.A0F;
        if (r3 != null && r6 != null) {
            Matrix matrix = this.A0f;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(((float) bounds.width()) / ((float) r6.A04.width()), ((float) bounds.height()) / ((float) r6.A04.height()));
                matrix.preTranslate((float) bounds.left, (float) bounds.top);
            }
            r3.B5x(canvas, matrix, this.A0a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d5, code lost:
        if ((!((android.view.ViewGroup) r1).getClipChildren()) != false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.graphics.Canvas r10, X.AnonymousClass81G r11) {
        /*
            r9 = this;
            X.9Y2 r0 = r9.A0F
            if (r0 == 0) goto L_0x0184
            android.graphics.Canvas r0 = r9.A02
            if (r0 != 0) goto L_0x0049
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r9.A02 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r9.A0B = r0
            android.graphics.Matrix r0 = X.C90524aI.A0B()
            r9.A03 = r0
            android.graphics.Matrix r0 = X.C90524aI.A0B()
            r9.A04 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A06 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r9.A09 = r0
            X.7u2 r0 = new X.7u2
            r0.<init>()
            r9.A05 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A08 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A07 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r9.A0A = r0
        L_0x0049:
            android.graphics.Matrix r0 = r9.A03
            r10.getMatrix(r0)
            android.graphics.Rect r0 = r9.A06
            r10.getClipBounds(r0)
            android.graphics.Rect r5 = r9.A06
            android.graphics.RectF r4 = r9.A09
            int r0 = r5.left
            float r3 = (float) r0
            int r0 = r5.top
            float r2 = (float) r0
            int r0 = r5.right
            float r1 = (float) r0
            int r0 = r5.bottom
            float r0 = (float) r0
            r4.set(r3, r2, r1, r0)
            android.graphics.Matrix r1 = r9.A03
            android.graphics.RectF r0 = r9.A09
            r1.mapRect(r0)
            android.graphics.RectF r1 = r9.A09
            android.graphics.Rect r0 = r9.A06
            A02(r0, r1)
            boolean r0 = r9.A0P
            r3 = 0
            android.graphics.RectF r4 = r9.A0B
            if (r0 == 0) goto L_0x018c
            int r0 = r9.getIntrinsicWidth()
            float r2 = (float) r0
            int r0 = r9.getIntrinsicHeight()
            float r1 = (float) r0
            r0 = 0
            r4.set(r0, r0, r2, r1)
        L_0x0089:
            android.graphics.Matrix r1 = r9.A03
            android.graphics.RectF r0 = r9.A0B
            r1.mapRect(r0)
            android.graphics.Rect r1 = r9.getBounds()
            int r0 = r1.width()
            float r4 = (float) r0
            int r0 = r9.getIntrinsicWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r1.height()
            float r2 = (float) r0
            int r0 = r9.getIntrinsicHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            android.graphics.RectF r7 = r9.A0B
            float r6 = r7.left
            float r6 = r6 * r4
            float r5 = r7.top
            float r5 = r5 * r2
            float r1 = r7.right
            float r1 = r1 * r4
            float r0 = r7.bottom
            float r0 = r0 * r2
            r7.set(r6, r5, r1, r0)
            android.graphics.drawable.Drawable$Callback r1 = r9.getCallback()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00d7
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00d7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.getClipChildren()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ea
        L_0x00d7:
            android.graphics.RectF r8 = r9.A0B
            android.graphics.Rect r7 = r9.A06
            int r0 = r7.left
            float r6 = (float) r0
            int r0 = r7.top
            float r5 = (float) r0
            int r0 = r7.right
            float r1 = (float) r0
            int r0 = r7.bottom
            float r0 = (float) r0
            r8.intersect(r6, r5, r1, r0)
        L_0x00ea:
            android.graphics.RectF r0 = r9.A0B
            float r0 = r0.width()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            android.graphics.RectF r0 = r9.A0B
            float r0 = r0.height()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            if (r5 == 0) goto L_0x0184
            if (r6 == 0) goto L_0x0184
            android.graphics.Bitmap r0 = r9.A01
            r7 = 1
            if (r0 == 0) goto L_0x0185
            int r0 = r0.getWidth()
            if (r0 < r5) goto L_0x0185
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getHeight()
            if (r0 < r6) goto L_0x0185
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getWidth()
            if (r0 > r5) goto L_0x0129
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getHeight()
            if (r0 <= r6) goto L_0x0138
        L_0x0129:
            android.graphics.Bitmap r0 = r9.A01
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r3, r3, r5, r6)
        L_0x012f:
            r9.A01 = r1
            android.graphics.Canvas r0 = r9.A02
            r0.setBitmap(r1)
            r9.A0T = r7
        L_0x0138:
            boolean r0 = r9.A0T
            if (r0 == 0) goto L_0x0174
            android.graphics.Matrix r7 = r9.A0f
            android.graphics.Matrix r0 = r9.A03
            r7.set(r0)
            r7.preScale(r4, r2)
            android.graphics.RectF r2 = r9.A0B
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            r7.postTranslate(r1, r0)
            android.graphics.Bitmap r0 = r9.A01
            r0.eraseColor(r3)
            android.graphics.Canvas r1 = r9.A02
            int r0 = r9.A0a
            r11.B5x(r1, r7, r0)
            android.graphics.Matrix r1 = r9.A03
            android.graphics.Matrix r0 = r9.A04
            r1.invert(r0)
            android.graphics.Matrix r2 = r9.A04
            android.graphics.RectF r1 = r9.A0A
            android.graphics.RectF r0 = r9.A0B
            r2.mapRect(r1, r0)
            android.graphics.RectF r1 = r9.A0A
            android.graphics.Rect r0 = r9.A07
            A02(r0, r1)
        L_0x0174:
            android.graphics.Rect r0 = r9.A08
            r0.set(r3, r3, r5, r6)
            android.graphics.Bitmap r3 = r9.A01
            android.graphics.Rect r2 = r9.A08
            android.graphics.Rect r1 = r9.A07
            android.graphics.Paint r0 = r9.A05
            r10.drawBitmap(r3, r2, r1, r0)
        L_0x0184:
            return
        L_0x0185:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            goto L_0x012f
        L_0x018c:
            r0 = 0
            r11.B8v(r0, r4, r3)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165737u4.A01(android.graphics.Canvas, X.81G):void");
    }

    public static void A02(Rect rect, RectF rectF) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    public static void A03(C165737u4 r29) {
        C165737u4 r0 = r29;
        AnonymousClass9Y2 r4 = r0.A0F;
        if (r4 != null) {
            C197499bo r1 = C197009ay.A00;
            Rect rect = r4.A04;
            List emptyList = Collections.emptyList();
            Integer num = C023109s.A00;
            List emptyList2 = Collections.emptyList();
            Integer num2 = num;
            AnonymousClass81G r2 = new AnonymousClass81G(r4, r0, new C195509Uo(r4, (AnonymousClass815) null, (AnonymousClass81B) null, (AnonymousClass9L3) null, new C208599yW(), (C190979Bc) null, (AnonymousClass9M9) null, num, num2, "__container", (String) null, emptyList, emptyList2, Collections.emptyList(), 0.0f, 0.0f, (float) rect.width(), (float) rect.height(), 0, 0, 0, -1, -1, false), r4.A07);
            r0.A0K = r2;
            if (r0.A0V) {
                r2.A0E(true);
            }
            r0.A0K.A01 = r0.A0P;
        }
    }

    public static void A04(C165737u4 r6) {
        AnonymousClass9Y2 r1 = r6.A0F;
        if (r1 != null) {
            C187768yV r0 = r6.A0G;
            int i = Build.VERSION.SDK_INT;
            boolean z = r1.A0C;
            int i2 = r1.A03;
            int ordinal = r0.ordinal();
            boolean z2 = false;
            if (ordinal != 1 && (ordinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
                z2 = true;
            }
            r6.A0Z = z2;
        }
    }

    public void A05() {
        C165647tl r1 = this.A0b;
        if (r1.A07) {
            r1.cancel();
            C165597tg.A18(this);
        }
        this.A0F = null;
        this.A0K = null;
        this.A0J = null;
        this.A00 = -3.4028235E38f;
        r1.A06 = null;
        r1.A03 = -2.14748365E9f;
        r1.A02 = 2.14748365E9f;
        invalidateSelf();
    }

    public void A06() {
        this.A0c.clear();
        C165647tl r2 = this.A0b;
        Choreographer.getInstance().removeFrameCallback(r2);
        r2.A07 = false;
        for (Animator.AnimatorPauseListener onAnimationPause : r2.A0C) {
            onAnimationPause.onAnimationPause(r2);
        }
        C165597tg.A18(this);
    }

    public void A07() {
        float A012;
        Integer num;
        if (this.A0K == null) {
            this.A0c.add(new B8R(this, 0));
            return;
        }
        A04(this);
        if (this.A0Y || this.A0R || this.A0b.getRepeatCount() == 0) {
            if (isVisible()) {
                this.A0b.A05();
                num = C023109s.A00;
            } else {
                num = C023109s.A01;
            }
            this.A0L = num;
        }
        if (!this.A0Y && !this.A0R) {
            C165647tl r2 = this.A0b;
            if (r2.A04 < 0.0f) {
                A012 = r2.A02();
            } else {
                A012 = r2.A01();
            }
            A0C((int) A012);
            r2.A03();
            C165597tg.A18(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[LOOP:0: B:18:0x0053->B:20:0x0059, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r3 = this;
            X.81G r0 = r3.A0K
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0c
            r1 = 1
            X.B8R r0 = new X.B8R
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            A04(r3)
            boolean r0 = r3.A0Y
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x0023
            X.7tl r0 = r3.A0b
            int r0 = r0.getRepeatCount()
            if (r0 != 0) goto L_0x0077
        L_0x0023:
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L_0x0073
            X.7tl r2 = r3.A0b
            r0 = 1
            r2.A07 = r0
            r2.A06()
            r0 = 0
            r2.A05 = r0
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L_0x0063
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A01()
        L_0x004a:
            r2.A07(r0)
        L_0x004d:
            java.util.Set r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r0.onAnimationResume(r2)
            goto L_0x0053
        L_0x0063:
            float r0 = r2.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A02()
            goto L_0x004a
        L_0x0070:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x0075
        L_0x0073:
            java.lang.Integer r0 = X.C023109s.A0C
        L_0x0075:
            r3.A0L = r0
        L_0x0077:
            boolean r0 = r3.A0Y
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x000f
            X.7tl r2 = r3.A0b
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            float r0 = r2.A02()
        L_0x008c:
            int r0 = (int) r0
            r3.A0C(r0)
            r2.A03()
            X.C165597tg.A18(r3)
            return
        L_0x0097:
            float r0 = r2.A01()
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165737u4.A08():void");
    }

    public void A09(float f) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8Q(this, f, 0));
            return;
        }
        C165647tl r3 = this.A0b;
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C200579hd.A00;
        r3.A08(r3.A03, AnonymousClass001.A00(f3, f2, f));
    }

    public void A0A(float f) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8Q(this, f, 1));
            return;
        }
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C200579hd.A00;
        A0E((int) AnonymousClass001.A00(f3, f2, f));
    }

    public void A0B(float f) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8Q(this, f, 2));
            return;
        }
        C165647tl r3 = this.A0b;
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C200579hd.A00;
        r3.A07(AnonymousClass001.A00(f3, f2, f));
    }

    public void A0C(int i) {
        if (this.A0F == null) {
            this.A0c.add(new B8P(this, i, 0));
        } else {
            this.A0b.A07((float) i);
        }
    }

    public void A0D(int i) {
        if (this.A0F == null) {
            this.A0c.add(new B8P(this, i, 1));
            return;
        }
        C165647tl r2 = this.A0b;
        r2.A08(r2.A03, ((float) i) + 0.99f);
    }

    public void A0E(int i) {
        if (this.A0F == null) {
            this.A0c.add(new B8P(this, i, 2));
            return;
        }
        C165647tl r2 = this.A0b;
        r2.A08((float) i, (float) ((int) r2.A02));
    }

    public void A0F(int i, int i2) {
        if (this.A0F == null) {
            this.A0c.add(new C208219xs(this, i, i2));
        } else {
            this.A0b.A08((float) i, ((float) i2) + 0.99f);
        }
    }

    public void A0G(C201629k0 r7, C199409fG r8, Object obj) {
        AnonymousClass81G r5 = this.A0K;
        if (r5 == null) {
            this.A0c.add(new C208229xt(this, r7, r8, obj));
            return;
        }
        if (r7 == C201629k0.A02) {
            r5.B0q(r8, obj);
        } else {
            B0U b0u = r7.A00;
            if (b0u != null) {
                b0u.B0q(r8, obj);
            } else {
                ArrayList A0I2 = AnonymousClass001.A0I();
                r5.Bof(r7, new C201629k0(new String[0]), A0I2, 0);
                for (int i = 0; i < A0I2.size(); i++) {
                    ((C201629k0) A0I2.get(i)).A00.B0q(r8, obj);
                }
                if (!(true ^ A0I2.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == B4R.A0R) {
            A0B(this.A0b.A00());
        }
    }

    public void A0H(String str) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8S(this, str, 0));
            return;
        }
        C192829Is A022 = r0.A02(str);
        if (A022 != null) {
            A0D((int) (A022.A01 + A022.A00));
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cannot find marker with name ");
        A0u.append(str);
        throw AnonymousClass000.A0c(".", A0u);
    }

    public void A0I(String str) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8S(this, str, 1));
            return;
        }
        C192829Is A022 = r0.A02(str);
        if (A022 != null) {
            int i = (int) A022.A01;
            A0F(i, ((int) A022.A00) + i);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cannot find marker with name ");
        A0u.append(str);
        throw AnonymousClass000.A0c(".", A0u);
    }

    public void A0J(String str) {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            this.A0c.add(new B8S(this, str, 2));
            return;
        }
        C192829Is A022 = r0.A02(str);
        if (A022 != null) {
            A0E((int) A022.A01);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cannot find marker with name ");
        A0u.append(str);
        throw AnonymousClass000.A0c(".", A0u);
    }

    public boolean A0K(AnonymousClass9Y2 r6) {
        float f;
        float f2;
        if (this.A0F == r6) {
            return false;
        }
        this.A0T = true;
        A05();
        this.A0F = r6;
        A03(this);
        C165647tl r4 = this.A0b;
        boolean A1W = AnonymousClass000.A1W(r4.A06);
        r4.A06 = r6;
        if (A1W) {
            f = Math.max(r4.A03, r6.A02);
            f2 = Math.min(r4.A02, r6.A00);
        } else {
            f = (float) ((int) r6.A02);
            f2 = (float) ((int) r6.A00);
        }
        r4.A08(f, f2);
        float f3 = r4.A00;
        r4.A00 = 0.0f;
        r4.A01 = 0.0f;
        r4.A07((float) ((int) f3));
        r4.A04();
        A0B(r4.getAnimatedFraction());
        ArrayList arrayList = this.A0c;
        Iterator A0r = C90474aD.A0r(arrayList);
        while (A0r.hasNext()) {
            C22852Ax1 ax1 = (C22852Ax1) A0r.next();
            if (ax1 != null) {
                ax1.Bov(r6);
            }
            A0r.remove();
        }
        arrayList.clear();
        r6.A0D.A00 = this.A0W;
        A04(this);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void draw(Canvas canvas) {
        AnonymousClass81G r3 = this.A0K;
        if (r3 != null) {
            boolean z = false;
            if (this.A0C == C187718yQ.ENABLED) {
                z = true;
                try {
                    this.A0d.acquire();
                    AnonymousClass9Y2 r4 = this.A0F;
                    if (r4 != null) {
                        float f = this.A00;
                        float A002 = this.A0b.A00();
                        this.A00 = A002;
                        if (C90494aF.A01(A002, f) * r4.A01() >= 50.0f) {
                            A0B(A002);
                        }
                    }
                } catch (InterruptedException unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        this.A0d.release();
                        if (r3.A00 != this.A0b.A00()) {
                            A0h.execute(this.A0g);
                        }
                    }
                    throw th;
                }
            }
            if (this.A0X) {
                try {
                    if (this.A0Z) {
                        A01(canvas, r3);
                    } else {
                        A00(canvas);
                    }
                } catch (Throwable unused2) {
                }
            } else if (this.A0Z) {
                A01(canvas, r3);
            } else {
                A00(canvas);
            }
            this.A0T = false;
            if (!z) {
                return;
            }
            this.A0d.release();
            if (r3.A00 != this.A0b.A00()) {
                A0h.execute(this.A0g);
            }
        }
    }

    public int getIntrinsicHeight() {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            return -1;
        }
        return r0.A04.height();
    }

    public int getIntrinsicWidth() {
        AnonymousClass9Y2 r0 = this.A0F;
        if (r0 == null) {
            return -1;
        }
        return r0.A04.width();
    }

    public void invalidateSelf() {
        if (!this.A0T) {
            this.A0T = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        C165647tl r0 = this.A0b;
        if (r0 == null) {
            return false;
        }
        return r0.A07;
    }

    public void setAlpha(int i) {
        this.A0a = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass6GP.A00("Use addColorFilter instead.");
    }

    public void stop() {
        this.A0c.clear();
        this.A0b.A03();
        C165597tg.A18(this);
    }

    public C165737u4() {
        C165647tl r4 = new C165647tl();
        this.A0b = r4;
        C200439hP r2 = new C200439hP(this, 0);
        this.A0e = r2;
        this.A0d = new Semaphore(1);
        this.A0g = new AnonymousClass759((Object) this, 23);
        this.A00 = -3.4028235E38f;
        this.A0T = false;
        r4.addUpdateListener(r2);
    }

    public int getAlpha() {
        return this.A0a;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Integer num;
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            Integer num2 = this.A0L;
            if (num2 == C023109s.A01) {
                A07();
            } else if (num2 == C023109s.A0C) {
                A08();
                return visible;
            }
        } else {
            if (this.A0b.A07) {
                A06();
                num = C023109s.A0C;
            } else if (!z3) {
                num = C023109s.A00;
            }
            this.A0L = num;
            return visible;
        }
        return visible;
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            A07();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
