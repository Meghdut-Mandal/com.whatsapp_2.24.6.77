package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.6cY  reason: invalid class name and case insensitive filesystem */
public final class C135346cY implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, C158447gw {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 1;
    public Matrix A06;
    public View.OnClickListener A07;
    public C81243wh A08;
    public AnonymousClass74P A09;
    public C1500573u A0A;
    public C1500673v A0B;
    public boolean A0C;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Matrix A0H = C90524aI.A0B();
    public final Matrix A0I = C90524aI.A0B();
    public final RectF A0J = C36441kJ.A0N();
    public final RectF A0K = C36441kJ.A0N();
    public final View A0L;
    public final C1268265t A0M;
    public final RectF A0N = C36441kJ.A0N();

    public C135346cY(View view, C1268265t r4) {
        this.A0L = view;
        this.A0M = r4;
        View view2 = this.A0L;
        this.A09 = new AnonymousClass74P(view2, this);
        this.A0B = new C1500673v(view2, this);
        this.A0A = new C1500573u(view2, this);
        this.A08 = new C81243wh(view2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006f, code lost:
        if (r4.floatValue() > r2.floatValue()) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C135346cY r8, float r9, float r10, float r11) {
        /*
            r3 = 1
            java.lang.Float r7 = java.lang.Float.valueOf(r9)
            float r1 = r8.A01
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r0
            float r0 = r8.A00
            X.0iX r2 = new X.0iX
            r2.<init>(r1, r0)
            float r1 = r2.A01
            float r6 = r2.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r1.append(r0)
            r1.append(r2)
            r0 = 46
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r1)
            throw r0
        L_0x0030:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r4 = r7
            java.lang.Number r4 = (java.lang.Number) r4
            float r2 = r4.floatValue()
            r1 = r5
            java.lang.Number r1 = (java.lang.Number) r1
            float r0 = r1.floatValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0052
            float r1 = r1.floatValue()
            float r0 = r4.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0089
        L_0x0052:
            java.lang.Float r5 = java.lang.Float.valueOf(r6)
            r2 = r5
            java.lang.Number r2 = (java.lang.Number) r2
            float r1 = r2.floatValue()
            float r0 = r4.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0071
            float r1 = r4.floatValue()
            float r0 = r2.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0089
        L_0x0071:
            float r2 = r7.floatValue()
            float r0 = r8.A04
            float r0 = r2 / r0
            android.graphics.Matrix r1 = r8.A0H
            r1.postScale(r0, r0, r10, r11)
            r8.A04 = r2
            A02(r8, r3)
            X.65t r0 = r8.A0M
            r0.A01(r1)
            return
        L_0x0089:
            r7 = r5
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135346cY.A01(X.6cY, float, float, float):void");
    }

    public boolean BTl() {
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        AnonymousClass00C.A0D(motionEvent, 0);
        boolean z = false;
        if (!this.A0E) {
            return false;
        }
        if (!this.A0F) {
            float f = this.A04;
            float f2 = this.A01;
            float f3 = f2;
            if (f == f2) {
                f3 = 2.0f * f2;
            }
            float f4 = f2;
            if (f2 < f3) {
                f4 = f3;
            }
            float f5 = this.A00;
            if (f5 > f4) {
                f5 = f4;
            }
            int i = (f5 > f2 ? 1 : (f5 == f2 ? 0 : -1));
            AnonymousClass74P r7 = this.A09;
            if (i == 0) {
                if (r7 != null) {
                    View view = this.A0L;
                    x = (float) (view.getWidth() / 2);
                    y = (float) C36441kJ.A07(view);
                }
            } else if (r7 != null) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            }
            r7.A00(f, f5, x, y, 200);
        }
        this.A0F = false;
        C1268265t r2 = this.A0M;
        if (this.A04 == this.A01) {
            z = true;
        }
        r2.A02(!z);
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass00C.A0D(scaleGestureDetector, 0);
        if (this.A0E) {
            this.A0G = false;
            A01(this, this.A04 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass00C.A0D(motionEvent2, 1);
        if (this.A0E && motionEvent2.getPointerCount() >= this.A05) {
            A03(this, -f, -f2);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static final void A00(C135346cY r15) {
        if (r15.A0C) {
            RectF rectF = r15.A0J;
            float width = rectF.width();
            float height = rectF.height();
            View view = r15.A0L;
            float A002 = (float) C36331k8.A00(view, view.getWidth());
            float A0D2 = (float) AnonymousClass000.A0D(view, view.getHeight());
            r15.A02 = 0.0f;
            Matrix matrix = r15.A0H;
            matrix.reset();
            r15.A0K.set(0.0f, 0.0f, A002, A0D2);
            float f = r15.A01;
            if (f == 0.0f) {
                f = A002 / width;
                float f2 = A0D2 / height;
                if (f > f2) {
                    f = f2;
                }
                r15.A01 = f;
            }
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            r15.A01 = f;
            float f3 = f;
            float f4 = A002 / width;
            float f5 = A0D2 / height;
            if (C90494aF.A01(f4 / f5, (float) 1) < 0.0f) {
                float f6 = f4;
                if (f4 < f5) {
                    f6 = f5;
                }
                r15.A02 = f;
            }
            r15.A04 = Math.min(f, Float.MAX_VALUE);
            float f7 = r15.A02;
            if (f7 > Float.MAX_VALUE) {
                f7 = Float.MAX_VALUE;
            }
            r15.A02 = f7;
            float f8 = f3 * 8.0f;
            if (f8 < 8.0f) {
                f8 = 8.0f;
            }
            r15.A00 = f8;
            float f9 = (float) 2;
            float f10 = width / f9;
            float f11 = height / f9;
            matrix.setTranslate((A002 / f9) - f10, (A0D2 / f9) - f11);
            float f12 = r15.A04;
            matrix.preScale(f12, f12, f10, f11);
            r15.A03 = r15.A04;
            r15.A0I.set(matrix);
            r15.A06 = matrix;
            r15.A0M.A01(matrix);
        }
    }

    public static final void A02(C135346cY r10, boolean z) {
        float f;
        RectF rectF = r10.A0N;
        rectF.set(r10.A0J);
        Matrix matrix = r10.A0H;
        matrix.mapRect(rectF);
        View view = r10.A0L;
        float A012 = C36441kJ.A01(view);
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = A012 - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / ((float) 2)) + 0.0f;
        } else if (f2 > 0.0f) {
            f = 0.0f - f2;
        } else if (f3 < A012) {
            f = A012 - f3;
        } else {
            f = 0.0f;
        }
        float A022 = C36441kJ.A02(view);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A022 - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / ((float) 2));
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < A022) {
            f4 = A022 - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            C1500573u r3 = r10.A0A;
            if (r3 != null && !r3.A03) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A04 = false;
                r3.A03 = true;
                r3.A05.postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        r10.A0M.A01(matrix);
    }

    public static final boolean A03(C135346cY r10, float f, float f2) {
        float f3;
        float f4;
        RectF rectF = r10.A0N;
        rectF.set(r10.A0J);
        Matrix matrix = r10.A0H;
        matrix.mapRect(rectF);
        View view = r10.A0L;
        float A012 = C36441kJ.A01(view);
        float f5 = rectF.left;
        float f6 = rectF.right;
        float f7 = A012 - 0.0f;
        if (f6 - f5 < f7) {
            f3 = ((f7 - (f6 + f5)) / ((float) 2)) + 0.0f;
        } else {
            float f8 = A012 - f6;
            float f9 = 0.0f - f5;
            if (f9 > f) {
                f9 = f;
            }
            if (f8 < f9) {
                f8 = f9;
            }
            f3 = f8;
        }
        float A022 = C36441kJ.A02(view);
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float f12 = A022 - 0.0f;
        if (f11 - f10 < f12) {
            f4 = ((f12 - (f11 + f10)) / ((float) 2)) + 0.0f;
        } else {
            float f13 = A022 - f11;
            float f14 = 0.0f - f10;
            if (f14 > f2) {
                f14 = f2;
            }
            if (f13 < f14) {
                f13 = f14;
            }
            f4 = f13;
        }
        matrix.postTranslate(f3, f4);
        r10.A0M.A01(matrix);
        if (f3 == f && f4 == f2) {
            return true;
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0E) {
            return true;
        }
        C1500673v r1 = this.A0B;
        if (r1 != null) {
            r1.A03 = false;
            r1.A04 = true;
        }
        C1500573u r12 = this.A0A;
        if (r12 == null) {
            return true;
        }
        r12.A03 = false;
        r12.A04 = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1500673v r3;
        if (!this.A0E || !this.A0D || (r3 = this.A0B) == null || r3.A03) {
            return true;
        }
        r3.A02 = -1;
        r3.A00 = f;
        r3.A01 = f2;
        r3.A04 = false;
        r3.A03 = true;
        r3.A05.post(r3);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0E) {
            return false;
        }
        AnonymousClass74P r1 = this.A09;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0G = true;
        this.A0M.A02(C90484aE.A1Q((this.A04 > this.A01 ? 1 : (this.A04 == this.A01 ? 0 : -1))));
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass74P r2;
        if (this.A0E && this.A0G) {
            this.A0F = true;
            Matrix matrix = this.A0H;
            matrix.set(this.A0I);
            this.A04 = this.A03;
            this.A0M.A01(matrix);
        }
        float f = this.A04;
        float f2 = this.A01;
        if (f < f2 && (r2 = this.A09) != null) {
            View view = this.A0L;
            r2.A00(f, f2, C36441kJ.A01(view) / 2.0f, C36441kJ.A02(view) / 2.0f, 100);
        }
        this.A0M.A02(C90484aE.A1Q((this.A04 > this.A01 ? 1 : (this.A04 == this.A01 ? 0 : -1))));
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.A07;
        if (!(onClickListener == null || this.A0G || onClickListener == null)) {
            onClickListener.onClick(this.A0L);
        }
        this.A0G = false;
        return true;
    }
}
