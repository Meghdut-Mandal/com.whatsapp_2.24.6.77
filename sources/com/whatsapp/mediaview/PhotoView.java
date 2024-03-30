package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass2XW;
import X.AnonymousClass2XZ;
import X.AnonymousClass3LS;
import X.C06360Th;
import X.C09740cr;
import X.C1497272n;
import X.C36331k8;
import X.C36341k9;
import X.C36441kJ;
import X.C66913Xu;
import X.C79263tR;
import X.C80723vr;
import X.C80943wD;
import X.C80953wE;
import X.C81213we;
import X.C92154dD;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;

public class PhotoView extends AnonymousClass2XZ implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public Matrix A0A;
    public Matrix A0B;
    public Paint A0C;
    public PointF A0D;
    public Rect A0E;
    public RectF A0F;
    public RectF A0G;
    public RectF A0H;
    public BitmapDrawable A0I;
    public Drawable A0J;
    public View.OnClickListener A0K;
    public C80953wE A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Matrix A0P;
    public ScaleGestureDetector A0Q;
    public C06360Th A0R;
    public C81213we A0S;
    public C80723vr A0T;
    public C80723vr A0U;
    public C80943wD A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Runnable A0Z = new C1497272n(this, 5);

    public static void A03(PhotoView photoView, float f, float f2, float f3) {
        float min = Math.min(Math.max(f, photoView.A04 * photoView.A08), photoView.A03);
        float f4 = min / photoView.A00;
        Matrix matrix = photoView.A0A;
        matrix.postRotate(-photoView.A07, (float) (photoView.getWidth() / 2), (float) C36441kJ.A07(photoView));
        matrix.postScale(f4, f4, f2, f3);
        photoView.A00 = min;
        matrix.postRotate(photoView.A07, (float) (photoView.getWidth() / 2), (float) C36441kJ.A07(photoView));
        A05(photoView, true);
        photoView.setImageMatrix(matrix);
    }

    public void A07() {
        this.A0R = null;
        this.A0Q = null;
        this.A0I = null;
        setImageDrawable((Drawable) null);
        C80953wE r1 = this.A0L;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0L = null;
        C80723vr r0 = this.A0U;
        if (r0 != null) {
            C80723vr.A00(r0);
        }
        this.A0U = null;
        C80723vr r02 = this.A0T;
        if (r02 != null) {
            C80723vr.A00(r02);
        }
        this.A0T = null;
        C80943wD r03 = this.A0V;
        if (r03 != null) {
            r03.A00 = true;
            PhotoView photoView = r03.A03;
            photoView.A07 = (float) Math.round(photoView.A07);
            A04(photoView, true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0V = null;
        C81213we r12 = this.A0S;
        if (r12 != null) {
            r12.A02 = true;
        }
        this.A0S = null;
        this.A0K = null;
        this.A0K = null;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static void A01(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A01(viewGroup.getChildAt(i));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A07();
        }
    }

    public static void A02(PhotoView photoView, float f, float f2) {
        View.OnClickListener onClickListener = photoView.A0K;
        if (onClickListener == null) {
            return;
        }
        if (onClickListener instanceof C66913Xu) {
            AnonymousClass2XW r8 = (AnonymousClass2XW) ((C66913Xu) onClickListener);
            C79263tR r7 = r8.A00;
            PhotoView photoView2 = r7.A01;
            Bitmap photo = photoView2.getPhoto();
            if (photo != null) {
                Matrix matrix = new Matrix();
                photoView2.getImageMatrix().invert(matrix);
                float[] fArr = {f, f2};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                MediaViewFragment mediaViewFragment = r7.A00;
                InteractiveAnnotation A012 = AnonymousClass3LS.A01(mediaViewFragment.A0x, r8.A01, fArr, fArr2, false);
                if (A012 != null) {
                    MediaViewFragment.A0D(A012, mediaViewFragment, photoView2);
                    return;
                }
            }
            MediaViewFragment mediaViewFragment2 = r7.A00;
            mediaViewFragment2.A1o(!mediaViewFragment2.A0G, true);
            return;
        }
        onClickListener.onClick(photoView);
    }

    public static void A04(PhotoView photoView, boolean z) {
        float f;
        float f2;
        float min;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        BitmapDrawable bitmapDrawable = photoView.A0I;
        if (bitmapDrawable != null && photoView.A0X) {
            photoView.A0I.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), photoView.A0I.getIntrinsicHeight());
            if (z || (photoView.A04 == 0.0f && photoView.A0I != null && photoView.A0X)) {
                float intrinsicWidth = (float) photoView.A0I.getIntrinsicWidth();
                float intrinsicHeight = (float) photoView.A0I.getIntrinsicHeight();
                float A002 = (float) C36331k8.A00(photoView, photoView.getWidth());
                float A0D2 = (float) AnonymousClass000.A0D(photoView, photoView.getHeight());
                photoView.A05 = 0.0f;
                Matrix matrix = photoView.A0A;
                matrix.reset();
                photoView.A0G.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                photoView.A0F.set(0.0f, 0.0f, A002, A0D2);
                float f9 = intrinsicWidth / 2.0f;
                float f10 = intrinsicHeight / 2.0f;
                matrix.setTranslate((A002 / 2.0f) - f9, (A0D2 / 2.0f) - f10);
                boolean z2 = photoView.A0M;
                float abs = Math.abs(photoView.A07 % 180.0f);
                int i = (abs > 90.0f ? 1 : (abs == 90.0f ? 0 : -1));
                if (z2) {
                    if (i == 0) {
                        f7 = A002 / intrinsicHeight;
                        f8 = A0D2 / intrinsicWidth;
                    } else {
                        f7 = A002 / intrinsicWidth;
                        f8 = A0D2 / intrinsicHeight;
                    }
                    min = Math.max(f7, f8);
                } else {
                    if (i == 0) {
                        f = A002 / intrinsicHeight;
                        f2 = A0D2 / intrinsicWidth;
                    } else {
                        f = A002 / intrinsicWidth;
                        f2 = A0D2 / intrinsicHeight;
                    }
                    min = Math.min(f, f2);
                }
                photoView.A04 = min;
                float f11 = photoView.A02;
                float min2 = Math.min(min, f11);
                photoView.A04 = min2;
                int i2 = photoView.A09;
                if (i2 == 3) {
                    if (abs == 90.0f) {
                        f5 = A002 / intrinsicHeight;
                        f6 = A0D2 / intrinsicWidth;
                    } else {
                        f5 = A002 / intrinsicWidth;
                        f6 = A0D2 / intrinsicHeight;
                    }
                    min2 = Math.max(f5, f6);
                } else if (i2 == 1) {
                    if (abs == 90.0f) {
                        min2 = A002 / intrinsicHeight;
                    } else {
                        min2 = A002 / intrinsicWidth;
                    }
                } else if (i2 == 2) {
                    if (abs == 90.0f) {
                        min2 = A0D2 / intrinsicWidth;
                    } else {
                        min2 = A0D2 / intrinsicHeight;
                    }
                }
                if (abs == 90.0f) {
                    f3 = A002 / intrinsicHeight;
                    f4 = A0D2 / intrinsicWidth;
                } else {
                    f3 = A002 / intrinsicWidth;
                    f4 = A0D2 / intrinsicHeight;
                }
                if (Math.abs((f3 / f4) - 1.0f) < photoView.A01) {
                    min2 = Math.max(f3, f4);
                    photoView.A05 = min2;
                }
                float min3 = Math.min(min2, f11);
                photoView.A00 = min3;
                photoView.A05 = Math.min(photoView.A05, f11);
                matrix.preScale(min3, min3, f9, f10);
                photoView.A03 = Math.max(photoView.A04 * 8.0f, 8.0f);
                matrix.postRotate(photoView.A07, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.A06 = photoView.A00;
                photoView.A0B.set(matrix);
            }
            Matrix matrix2 = photoView.A0A;
            photoView.A0P = matrix2;
            photoView.setImageMatrix(matrix2);
        }
    }

    public static void A05(PhotoView photoView, boolean z) {
        float f;
        RectF rectF = photoView.A0H;
        rectF.set(photoView.A0G);
        Matrix matrix = photoView.A0A;
        matrix.mapRect(rectF);
        float A012 = C36441kJ.A01(photoView);
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = A012 - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else if (f2 > 0.0f) {
            f = 0.0f - f2;
        } else if (f3 < A012) {
            f = A012 - f3;
        } else {
            f = 0.0f;
        }
        float A022 = C36441kJ.A02(photoView);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / 2.0f);
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < A022) {
            f4 = A022 - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            C80723vr r3 = photoView.A0T;
            if (r3 != null && !r3.A04) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A05 = false;
                r3.A04 = true;
                ((View) r3.A03).postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        photoView.setImageMatrix(matrix);
    }

    public static boolean A06(PhotoView photoView, float f, float f2) {
        float max;
        float max2;
        RectF rectF = photoView.A0H;
        rectF.set(photoView.A0G);
        Matrix matrix = photoView.A0A;
        matrix.mapRect(rectF);
        float A012 = C36441kJ.A01(photoView);
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = A012 - 0.0f;
        if (f4 - f3 < f5) {
            max = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            max = Math.max(A012 - f4, Math.min(0.0f - f3, f));
        }
        float A022 = C36441kJ.A02(photoView);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            max2 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            max2 = Math.max(A022 - f7, Math.min(0.0f - f6, f2));
        }
        matrix.postTranslate(max, max2);
        photoView.setImageMatrix(matrix);
        if (max == f && max2 == f2) {
            return true;
        }
        return false;
    }

    public void A08(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        }
        A09(bitmapDrawable);
    }

    public void A09(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0I;
        if (bitmapDrawable != bitmapDrawable2) {
            boolean z = false;
            if (bitmapDrawable2 != null) {
                if (!(bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0I.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight())) {
                    z = true;
                }
                this.A04 = 0.0f;
            }
            this.A0I = bitmapDrawable;
            setImageDrawable(bitmapDrawable);
            A04(this, z);
            invalidate();
        }
    }

    public void A0A(boolean z) {
        this.A0O = z;
        if (!z) {
            Matrix matrix = this.A0A;
            matrix.set(this.A0B);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
    }

    public boolean A0B() {
        if (this.A0O) {
            C80723vr r0 = this.A0U;
            if (r0 != null && r0.A04) {
                return true;
            }
            float f = this.A05;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            float f2 = this.A00;
            if (i == 0) {
                if (f2 != this.A04) {
                    return true;
                }
            } else if (f2 > f) {
                return true;
            }
        }
        return false;
    }

    public Bitmap getFullViewCroppedBitmap() {
        if (!this.A0M) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix(this.A0P);
        if (this.A0I == null) {
            return createBitmap;
        }
        canvas.concat(matrix);
        this.A0I.draw(canvas);
        return createBitmap;
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0I;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        if (!this.A0N || !this.A0O) {
            return false;
        }
        if (!this.A0W) {
            float f = this.A00;
            float f2 = this.A04;
            float f3 = f2 * 2.0f;
            if (f == f3) {
                f3 = f2;
            }
            float min = Math.min(this.A03, Math.max(f2, f3));
            C80953wE r4 = this.A0L;
            if (r4 != null) {
                if (min == f2) {
                    x = (float) (getWidth() / 2);
                    y = (float) C36441kJ.A07(this);
                } else {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                }
                r4.A00(f, min, x, y, 200);
            }
        }
        this.A0W = false;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0O) {
            return true;
        }
        C80723vr r0 = this.A0U;
        if (r0 != null) {
            C80723vr.A00(r0);
        }
        C80723vr r02 = this.A0T;
        if (r02 == null) {
            return true;
        }
        C80723vr.A00(r02);
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C80723vr r2;
        if (!this.A0O || (r2 = this.A0U) == null || r2.A04) {
            return true;
        }
        r2.A02 = -1;
        r2.A00 = f;
        r2.A01 = f2;
        r2.A05 = false;
        r2.A04 = true;
        ((View) r2.A03).post(r2);
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0O) {
            this.A0Y = false;
            A03(this, this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0O) {
            return false;
        }
        C80953wE r1 = this.A0L;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0Y = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C80953wE r1;
        if (this.A0O && this.A0Y) {
            this.A0W = true;
            Matrix matrix = this.A0A;
            matrix.set(this.A0B);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
        float f = this.A00;
        float f2 = this.A04;
        if (f < f2 && (r1 = this.A0L) != null) {
            r1.A00(f, f2, (float) (getWidth() / 2), (float) C36441kJ.A07(this), 100);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0O) {
            return true;
        }
        A06(this, -f, -f2);
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0K != null && !this.A0Y && this.A0N) {
            A02(this, motionEvent.getX(), motionEvent.getY());
        }
        this.A0Y = false;
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A0Q == null || this.A0R == null)) {
            if (!isEnabled()) {
                return false;
            }
            this.A0Q.onTouchEvent(motionEvent);
            this.A0R.A00(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0K != null && !this.A0Y && pointerCount == 1 && !this.A0N) {
                this.A0D.set(motionEvent.getX(), motionEvent.getY());
                post(this.A0Z);
            }
            C80723vr r0 = this.A0U;
            if (r0 != null && !r0.A04) {
                A05(this, false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z) {
        if (z != this.A0M) {
            this.A0M = z;
            requestLayout();
            invalidate();
        }
    }

    public void setIsLongpressEnabled(boolean z) {
        ((C09740cr) this.A0R.A00).A00.setIsLongpressEnabled(z);
    }

    public PhotoView(Context context) {
        super(context);
        AnonymousClass2XZ.A07(this);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A0R = new C06360Th(context, this);
        C92154dD r1 = new C92154dD(context, this, this, getScaledMinScalingSpan());
        this.A0Q = r1;
        r1.setQuickScaleEnabled(false);
        this.A0L = new C80953wE(this);
        this.A0U = new C80723vr(this, 1);
        this.A0T = new C80723vr(this, 0);
        this.A0V = new C80943wD(this);
        this.A0S = new C81213we(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private int getScaledMinScalingSpan() {
        Resources A0F2 = C36341k9.A0F(this);
        try {
            return A0F2.getDimensionPixelSize(A0F2.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, A0F2.getDisplayMetrics());
        }
    }

    public float getMinScale() {
        return this.A04;
    }

    public float getOriginalScale() {
        return this.A06;
    }

    public float getScale() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0I != null && this.A0J != null) {
            int width = (getWidth() - this.A0J.getIntrinsicWidth()) / 2;
            int height = (getHeight() - this.A0J.getIntrinsicHeight()) / 2;
            Drawable drawable = this.A0J;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A0J.getIntrinsicHeight() + height);
            this.A0J.draw(canvas);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0X = true;
        Matrix matrix = this.A0P;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A04(this, z);
        }
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0N = z;
    }

    public void setInitialFitTolerance(float f) {
        this.A01 = f;
    }

    public void setInitialScaleType(int i) {
        this.A09 = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0K = onClickListener;
    }

    public void setOverlay(Drawable drawable) {
        this.A0J = drawable;
    }

    public void setUnderscaleAmount(float f) {
        this.A08 = f;
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass2XZ.A07(this);
        A00();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass2XZ.A07(this);
        A00();
    }
}
