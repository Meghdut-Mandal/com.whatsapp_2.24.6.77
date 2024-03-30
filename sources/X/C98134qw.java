package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.4qw  reason: invalid class name and case insensitive filesystem */
public abstract class C98134qw extends C92394ds {
    public AnonymousClass7cG A00;
    public boolean A01;
    public boolean A02;
    public int[] A03 = new int[0];
    public C123045vq[] A04 = new C123045vq[8];
    public C123045vq[] A05;
    public Drawable A06;
    public SparseArray A07;
    public Object A08;
    public final AnonymousClass63G A09 = new AnonymousClass63G(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98134qw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public void dispatchDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        AnonymousClass63G r2 = this.A09;
        r2.A02 = canvas;
        r2.A00 = 0;
        r2.A01 = r2.A03.A04.length;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            r2.A00();
        }
        r2.A02 = null;
    }

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass00C.A0D(motionEvent, 0);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.4qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.facebook.rendercore.RootHostView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.4qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.4qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.4qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.4qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.4qv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r0 = 1
            r7.A01 = r0
            r4 = r7
            boolean r0 = r7 instanceof com.facebook.rendercore.RootHostView
            if (r0 == 0) goto L_0x0050
            com.facebook.rendercore.RootHostView r4 = (com.facebook.rendercore.RootHostView) r4
            X.63t r5 = r4.A00
            X.6Wy r6 = r5.A00
            boolean r0 = r5.A02
            r3 = 0
            if (r0 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0023
            int r11 = r11 - r9
            int r12 = r12 - r10
            X.6M5 r0 = X.AnonymousClass6M5.A00
            long r1 = r0.A00(r11, r11, r12, r12)
            r0 = 0
            r6.A05(r0, r1)
            r5.A02 = r3
        L_0x0023:
            X.5vr r2 = r5.A01
            if (r2 == 0) goto L_0x0041
            X.6Y3 r1 = r5.A04
            r1.A0F(r2)
        L_0x002c:
            X.5vr r0 = r5.A01
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x0041
            r0 = 4
            if (r3 <= r0) goto L_0x0048
            X.5S6 r3 = X.AnonymousClass5S6.ERROR
            r2 = 0
            java.lang.String r1 = "RootHostDelegate"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.AnonymousClass6RL.A01(r3, r1, r0, r2)
        L_0x0041:
            X.AnonymousClass5YP.A00(r4)
        L_0x0044:
            r0 = 0
            r7.A01 = r0
            return
        L_0x0048:
            X.5vr r2 = r5.A01
            r1.A0F(r2)
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0050:
            boolean r0 = r7 instanceof X.C98124qv
            if (r0 == 0) goto L_0x0044
            X.4qv r4 = (X.C98124qv) r4
            X.5vr r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            X.6Y3 r3 = r4.A01
            r3.A0F(r0)
            r2 = 0
        L_0x0060:
            X.5vr r1 = r4.A00
            if (r0 == r1) goto L_0x0041
            r0 = 4
            if (r2 <= r0) goto L_0x0072
            X.5S6 r3 = X.AnonymousClass5S6.ERROR
            r2 = 0
            java.lang.String r1 = "RenderTreeHostView"
            java.lang.String r0 = "More than 4 recursive mount attempts. Skipping mounting the latest version."
            X.AnonymousClass6RL.A01(r3, r1, r0, r2)
            goto L_0x0044
        L_0x0072:
            r3.A0F(r1)
            int r2 = r2 + 1
            r0 = r1
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98134qw.onLayout(boolean, int, int, int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C123045vq[] r0;
        AnonymousClass00C.A0D(motionEvent, 0);
        if (isEnabled() && (r0 = this.A04) != null) {
            for (int length = r0.length - 1; -1 < length; length--) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof C98134qw) {
            C98134qw r1 = (C98134qw) viewParent;
            if (!r1.A01) {
                viewParent = r1.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void setViewTags(SparseArray sparseArray) {
        AnonymousClass00C.A0D(sparseArray, 0);
        this.A07 = sparseArray;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public static final String A00(C123045vq[] r6) {
        if (r6 == null) {
            return "<null>";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C123045vq r2 = r6[i];
            A0u.append("Item at index: ");
            if (r2 != null) {
                A0u.append(i);
                A0u.append(" Type: ");
                A0u.append(r2.A01.A06.A08());
                A0u.append(" Position in parent: ");
                A0u.append(r2.A01.A02);
            } else {
                A0u.append(i);
                A0u.append(" item is null");
            }
            A0u.append("\n");
        }
        return C36381kD.A0y(A0u);
    }

    private final void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(drawable2);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    AnonymousClass000.A13(drawable, this);
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r5 > -1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r2[r5] == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C123045vq r7) {
        /*
            r6 = this;
            X.5vq[] r3 = r6.A04
            r5 = -1
            if (r3 == 0) goto L_0x0012
            r2 = 0
            int r1 = r3.length
        L_0x0007:
            if (r2 >= r1) goto L_0x0012
            r0 = r3[r2]
            boolean r0 = X.AnonymousClass00C.A0J(r0, r7)
            if (r0 == 0) goto L_0x0092
            r5 = r2
        L_0x0012:
            r3 = -1
            if (r5 > r3) goto L_0x0027
            X.5vq[] r2 = r6.A05
            if (r2 == 0) goto L_0x009b
            r5 = 0
            int r1 = r2.length
        L_0x001b:
            if (r5 >= r1) goto L_0x009b
            r0 = r2[r5]
            boolean r0 = X.AnonymousClass00C.A0J(r0, r7)
            if (r0 == 0) goto L_0x008f
            if (r5 <= r3) goto L_0x009b
        L_0x0027:
            r4 = 1
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01
            X.6Tu r0 = r0.A06
            java.lang.Integer r2 = r0.A02
            java.lang.Integer r0 = X.C023109s.A00
            java.lang.Object r1 = r7.A04
            if (r2 != r0) goto L_0x006e
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.Drawable"
            X.AnonymousClass00C.A0E(r1, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r1.setCallback(r0)
            android.graphics.Rect r0 = r1.getBounds()
            r6.invalidate(r0)
        L_0x0046:
            X.5vq[] r3 = r6.A04
            X.5vq[] r2 = r6.A05
            X.AnonymousClass00C.A0D(r3, r4)
            if (r2 == 0) goto L_0x0054
            r1 = r2[r5]
            r0 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            r4 = 0
            if (r0 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x005c
            r2[r5] = r4
        L_0x005c:
            X.5vq[] r3 = r6.A05
            if (r3 == 0) goto L_0x0096
            int r2 = r3.length
            r1 = 0
        L_0x0062:
            if (r1 >= r2) goto L_0x0096
            r0 = r3[r1]
            if (r0 != 0) goto L_0x0098
            int r1 = r1 + 1
            goto L_0x0062
        L_0x006b:
            r3[r5] = r4
            goto L_0x005c
        L_0x006e:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.AnonymousClass00C.A0E(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r6.A02 = r4
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0081
            r0 = 0
            r1.setPressed(r0)
        L_0x0081:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x008b
            super.removeViewInLayout(r1)
        L_0x0088:
            r6.A02 = r4
            goto L_0x0046
        L_0x008b:
            super.removeView(r1)
            goto L_0x0088
        L_0x008f:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0096:
            r6.A05 = r4
        L_0x0098:
            r7.A00 = r4
            return
        L_0x009b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "\n              Mount item was not found in the list of mounted items.\n              Item to remove: "
            r2.append(r0)
            com.facebook.rendercore.RenderTreeNode r1 = r7.A01
            r0 = 0
            java.lang.String r0 = r1.A00(r0)
            r2.append(r0)
            java.lang.String r0 = "\n              Mounted items: "
            r2.append(r0)
            X.5vq[] r0 = r6.A04
            java.lang.String r0 = A00(r0)
            r2.append(r0)
            java.lang.String r0 = "\n              Scraped items: "
            r2.append(r0)
            X.5vq[] r0 = r6.A05
            java.lang.String r0 = A00(r0)
            r2.append(r0)
            java.lang.String r0 = "\n              "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            java.lang.String r0 = X.AnonymousClass091.A01(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98134qw.A01(X.5vq):void");
    }

    public void A02(C123045vq r6, int i) {
        if (r6.A01.A06.A02 == C023109s.A00) {
            Object obj = r6.A04;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            Drawable drawable = (Drawable) obj;
            drawable.setVisible(AnonymousClass000.A1Q(getVisibility()), C36371kC.A1V(drawable));
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                AnonymousClass000.A13(drawable, this);
            }
            invalidate(r6.A01.A03);
        } else {
            Object obj2 = r6.A04;
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            this.A02 = true;
            if (!(view instanceof C98134qw) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                boolean z = this.A01;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (z) {
                    super.addViewInLayout(view, -1, layoutParams, true);
                } else {
                    super.addView(view, -1, layoutParams);
                }
            } else {
                C012005e.A0J(view);
                view.setVisibility(0);
            }
        }
        C123045vq[] r3 = this.A04;
        int length = r3.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            C123045vq[] r1 = new C123045vq[i2];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A04 = r1;
            r3 = r1;
        }
        r3[i] = r6;
        r6.A00 = this;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[(childCount + 5)];
            }
            int i3 = 0;
            for (C123045vq r2 : this.A04) {
                if (r2 != null && r2.A01.A06.A02 == C023109s.A01) {
                    Object obj = r2.A04;
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.view.View");
                    this.A03[i3] = indexOfChild((View) obj);
                    i3++;
                }
            }
            this.A02 = false;
        }
        AnonymousClass63G r22 = this.A09;
        if (r22.A02 != null && r22.A00 < r22.A01) {
            r22.A00();
        }
        return this.A03[i2];
    }

    public int getMountItemCount() {
        int i = 0;
        for (C123045vq r0 : this.A04) {
            if (r0 != null) {
                i++;
            }
        }
        return i;
    }

    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A07;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public final void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass5YQ.A00(drawable, this);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        for (C123045vq r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A02 == C023109s.A00) {
                Object obj = r2.A04;
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable = (Drawable) obj;
                AnonymousClass00C.A0D(drawable, 1);
                if (drawable.isStateful()) {
                    AnonymousClass000.A13(drawable, this);
                }
            }
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            AnonymousClass000.A13(drawable2, this);
        }
    }

    public String getDescriptionOfMountedItems() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\nMounted Items");
        A0u.append(A00(this.A04));
        A0u.append("\nScraped Items: ");
        String A0q = AnonymousClass000.A0q(A00(this.A05), A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (C123045vq r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A02 == C023109s.A00) {
                Object obj = r2.A04;
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                ((Drawable) obj).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        for (C123045vq r2 : this.A04) {
            if (r2 != null && r2.A01.A06.A02 == C023109s.A00) {
                Object obj = r2.A04;
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                ((Drawable) obj).setVisible(AnonymousClass000.A1Q(i), false);
            }
        }
    }

    public final void setInterceptTouchEventHandler(AnonymousClass7cG r1) {
        this.A00 = r1;
    }

    public final void setViewTag(Object obj) {
        this.A08 = obj;
    }

    public Object getTag() {
        Object obj = this.A08;
        if (obj == null) {
            return super.getTag();
        }
        return obj;
    }
}
