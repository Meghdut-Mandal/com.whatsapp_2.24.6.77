package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;
import java.lang.reflect.Field;

/* renamed from: X.0F6  reason: invalid class name */
public class AnonymousClass0F6 extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public C11080fh A05;
    public Field A06;
    public boolean A07;
    public boolean A08;
    public AnonymousClass0FT A09;
    public C09140bt A0A;
    public boolean A0B;
    public final Rect A0C = AnonymousClass001.A06();

    public void onDetachedFromWindow() {
        this.A05 = null;
        super.onDetachedFromWindow();
    }

    private void setSelectorEnabled(boolean z) {
        AnonymousClass0FT r0 = this.A09;
        if (r0 != null) {
            r0.A00 = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r11 != 3) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.view.MotionEvent r18, int r19) {
        /*
            r17 = this;
            r9 = r18
            int r11 = r9.getActionMasked()
            r8 = 1
            r7 = r17
            if (r11 == r8) goto L_0x0023
            r0 = 2
            if (r11 == r0) goto L_0x0025
            r0 = 3
            if (r11 == r0) goto L_0x012e
        L_0x0011:
            r3 = 1
        L_0x0012:
            X.0bt r0 = r7.A0A
            if (r0 != 0) goto L_0x001d
            X.0bt r0 = new X.0bt
            r0.<init>(r7)
            r7.A0A = r0
        L_0x001d:
            r0.A05 = r8
            r0.onTouch(r7, r9)
        L_0x0022:
            return r3
        L_0x0023:
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r0 = r19
            int r1 = r9.findPointerIndex(r0)
            if (r1 < 0) goto L_0x012e
            float r0 = r9.getX(r1)
            int r2 = (int) r0
            float r0 = r9.getY(r1)
            int r1 = (int) r0
            int r6 = r7.pointToPosition(r2, r1)
            r0 = -1
            if (r6 == r0) goto L_0x012f
            int r0 = r7.getFirstVisiblePosition()
            int r0 = r6 - r0
            android.view.View r5 = r7.getChildAt(r0)
            float r10 = (float) r2
            float r4 = (float) r1
            r7.A07 = r8
            r7.drawableHotspotChanged(r10, r4)
            boolean r0 = r7.isPressed()
            if (r0 != 0) goto L_0x0059
            r7.setPressed(r8)
        L_0x0059:
            r7.layoutChildren()
            int r1 = r7.A00
            r0 = -1
            r3 = 0
            if (r1 == r0) goto L_0x0078
            int r0 = r7.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r1 = r7.getChildAt(r1)
            if (r1 == 0) goto L_0x0078
            if (r1 == r5) goto L_0x0078
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0078
            r1.setPressed(r3)
        L_0x0078:
            r7.A00 = r6
            int r0 = r5.getLeft()
            float r0 = (float) r0
            float r1 = r10 - r0
            int r0 = r5.getTop()
            float r0 = (float) r0
            float r0 = r4 - r0
            r5.drawableHotspotChanged(r1, r0)
            boolean r0 = r5.isPressed()
            if (r0 != 0) goto L_0x0094
            r5.setPressed(r8)
        L_0x0094:
            android.graphics.drawable.Drawable r13 = r7.getSelector()
            r12 = 1
            if (r13 == 0) goto L_0x00d5
            r0 = -1
            if (r6 == r0) goto L_0x00d5
            r16 = 1
            r13.setVisible(r3, r3)
        L_0x00a3:
            android.graphics.Rect r1 = r7.A0C
            int r15 = r5.getLeft()
            int r14 = r5.getTop()
            int r2 = r5.getRight()
            int r0 = r5.getBottom()
            r1.set(r15, r14, r2, r0)
            int r2 = r1.left
            int r0 = r7.A02
            int r2 = r2 - r0
            r1.left = r2
            int r2 = r1.top
            int r0 = r7.A04
            int r2 = r2 - r0
            r1.top = r2
            int r2 = r1.right
            int r0 = r7.A03
            int r2 = r2 + r0
            r1.right = r2
            int r2 = r1.bottom
            int r0 = r7.A01
            int r2 = r2 + r0
            r1.bottom = r2
            goto L_0x00d8
        L_0x00d5:
            r16 = 0
            goto L_0x00a3
        L_0x00d8:
            java.lang.reflect.Field r2 = r7.A06     // Catch:{ IllegalAccessException -> 0x00f6 }
            boolean r14 = r2.getBoolean(r7)     // Catch:{ IllegalAccessException -> 0x00f6 }
            boolean r0 = r5.isEnabled()     // Catch:{ IllegalAccessException -> 0x00f6 }
            if (r0 == r14) goto L_0x00fa
            boolean r0 = X.AnonymousClass000.A1Q(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00f6 }
            r2.set(r7, r0)     // Catch:{ IllegalAccessException -> 0x00f6 }
            r0 = -1
            if (r6 == r0) goto L_0x00fa
            r7.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00f6 }
            goto L_0x00fa
        L_0x00f6:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00fa:
            if (r16 == 0) goto L_0x0111
            float r2 = r1.exactCenterX()
            float r1 = r1.exactCenterY()
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x010b
            r12 = 0
        L_0x010b:
            r13.setVisible(r12, r3)
            X.AnonymousClass076.A05(r13, r2, r1)
        L_0x0111:
            android.graphics.drawable.Drawable r1 = r7.getSelector()
            if (r1 == 0) goto L_0x011d
            r0 = -1
            if (r6 == r0) goto L_0x011d
            X.AnonymousClass076.A05(r1, r10, r4)
        L_0x011d:
            r7.setSelectorEnabled(r3)
            r7.refreshDrawableState()
            if (r11 != r8) goto L_0x0011
            long r0 = r7.getItemIdAtPosition(r6)
            r7.performItemClick(r5, r6, r0)
            goto L_0x0011
        L_0x012e:
            r3 = 0
        L_0x012f:
            r2 = 0
            r7.A07 = r2
            r7.setPressed(r2)
            r7.drawableStateChanged()
            int r1 = r7.A00
            int r0 = r7.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r0 = r7.getChildAt(r1)
            if (r0 == 0) goto L_0x0148
            r0.setPressed(r2)
        L_0x0148:
            if (r3 != 0) goto L_0x0012
            X.0bt r2 = r7.A0A
            if (r2 == 0) goto L_0x0022
            r1 = 0
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0156
            X.C09140bt.A01(r2)
        L_0x0156:
            r2.A05 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F6.A01(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0C;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A05 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A07 && isPressed()) {
                AnonymousClass000.A13(selector, this);
            }
        }
    }

    public boolean hasFocus() {
        if (this.A0B || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.A0B || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.A0B || super.isFocused()) {
            return true;
        }
        return false;
    }

    public boolean isInTouchMode() {
        if ((!this.A0B || !this.A08) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A05 == null) {
            C11080fh r1 = new C11080fh(this);
            this.A05 = r1;
            r1.A00.post(r1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.A07 && isPressed()) {
                    AnonymousClass000.A13(selector, this);
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public void setSelector(Drawable drawable) {
        AnonymousClass0FT r0;
        if (drawable != null) {
            r0 = new AnonymousClass0FT(drawable);
        } else {
            r0 = null;
        }
        this.A09 = r0;
        super.setSelector(r0);
        Rect A062 = AnonymousClass001.A06();
        if (drawable != null) {
            drawable.getPadding(A062);
        }
        this.A02 = A062.left;
        this.A04 = A062.top;
        this.A03 = A062.right;
        this.A01 = A062.bottom;
    }

    public AnonymousClass0F6(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.f4nameremoved);
        this.A0B = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.A06 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public int A00(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                int itemViewType = adapter.getItemViewType(i5);
                if (itemViewType != i4) {
                    view = null;
                    i4 = itemViewType;
                }
                view = adapter.getView(i5, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, makeMeasureSpec);
                view.forceLayout();
                if (i5 > 0) {
                    i3 += dividerHeight;
                }
                i3 += view.getMeasuredHeight();
                if (i3 >= i2) {
                    return i2;
                }
            }
        }
        return i3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C11080fh r2 = this.A05;
        if (r2 != null) {
            AnonymousClass0F6 r1 = r2.A00;
            r1.A05 = null;
            r1.removeCallbacks(r2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.A08 = z;
    }
}
