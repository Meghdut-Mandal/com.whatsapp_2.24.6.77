package com.google.android.material.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass076;
import X.AnonymousClass079;
import X.AnonymousClass080;
import X.AnonymousClass088;
import X.AnonymousClass08I;
import X.AnonymousClass0BT;
import X.C011705b;
import X.C012005e;
import X.C013205s;
import X.C018707z;
import X.C18120se;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;

public class NavigationMenuItemView extends LinearLayoutCompat implements AnonymousClass080 {
    public static final int[] A0G = {16842912};
    public boolean A00;
    public int A01;
    public FrameLayout A02;
    public C018707z A03;
    public boolean A04;
    public int A05;
    public ColorStateList A06;
    public Drawable A07;
    public Drawable A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final CheckedTextView A0C;
    public final Rect A0D;
    public final Rect A0E;
    public final C011705b A0F;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.A0E = AnonymousClass001.A06();
        this.A0D = AnonymousClass001.A06();
        this.A05 = 119;
        this.A0B = true;
        this.A00 = false;
        TypedArray A002 = C013205s.A00(context, attributeSet, C27931Qk.A0F, new int[0], i, 0);
        this.A05 = A002.getInt(1, 119);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A0B = A002.getBoolean(2, true);
        A002.recycle();
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A09) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AnonymousClass08I.A01(drawable).mutate();
                AnonymousClass076.A01(this.A06, drawable);
            }
            int i = this.A01;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A0A) {
            if (this.A07 == null) {
                Drawable A002 = AnonymousClass0BT.A00(getContext().getTheme(), getResources(), R.drawable.navigation_empty_icon);
                this.A07 = A002;
                if (A002 != null) {
                    int i2 = this.A01;
                    A002.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A07;
        }
        AnonymousClass079.A00(drawable, (Drawable) null, (Drawable) null, (Drawable) null, this.A0C);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (r5.A03.getActionView() == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKf(X.C018707z r6, int r7) {
        /*
            r5 = this;
            r5.A03 = r6
            int r0 = r6.getItemId()
            if (r0 <= 0) goto L_0x000b
            r5.setId(r0)
        L_0x000b:
            boolean r1 = r6.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x0014
            r0 = 0
        L_0x0014:
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0053
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r1 = 2130968996(0x7f0401a4, float:1.7546661E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto L_0x00cb
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.View.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L_0x0050:
            X.C011504z.A04(r3, r5)
        L_0x0053:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            X.AnonymousClass08F.A00(r5, r0)
            X.07z r1 = r5.A03
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto L_0x00a2
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto L_0x00a2
            X.07z r0 = r5.A03
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            android.widget.CheckedTextView r1 = r5.A0C
            if (r0 == 0) goto L_0x00bd
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bc
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -1
        L_0x00b5:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A02
            r0.setLayoutParams(r1)
        L_0x00bc:
            return
        L_0x00bd:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x00bc
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = -2
            goto L_0x00b5
        L_0x00cb:
            r3 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.BKf(X.07z, int):void");
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C018707z r1 = this.A03;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A08;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A08);
            }
            this.A08 = drawable;
            this.A00 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    AnonymousClass000.A13(drawable, this);
                }
                if (this.A05 == 119) {
                    drawable.getPadding(AnonymousClass001.A06());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.A05 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A05 = i;
            if (i == 119 && this.A08 != null) {
                this.A08.getPadding(AnonymousClass001.A06());
            }
            requestLayout();
        }
    }

    public void setIconPadding(int i) {
        this.A0C.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A06 = colorStateList;
        this.A09 = AnonymousClass000.A1V(colorStateList);
        C018707z r0 = this.A03;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A0C.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        AnonymousClass088.A06(this.A0C, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0C.setText(charSequence);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A08;
        if (drawable != null) {
            if (this.A00) {
                this.A00 = false;
                Rect rect = this.A0E;
                Rect rect2 = this.A0D;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A0B) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A05, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A08;
        if (drawable != null && drawable.isStateful()) {
            AnonymousClass000.A13(this.A08, this);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A00 = z | this.A00;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = true;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A0F.A0d(this.A0C, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.A0C;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A08) {
            return true;
        }
        return false;
    }

    public void setIconSize(int i) {
        this.A01 = i;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A0A = z;
    }

    public Drawable getForeground() {
        return this.A08;
    }

    public int getForegroundGravity() {
        return this.A05;
    }

    public C018707z getItemData() {
        return this.A03;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18120se r3 = new C18120se(this, 9);
        this.A0F = r3;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A0C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C012005e.A0V(checkedTextView, r3);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }
}
