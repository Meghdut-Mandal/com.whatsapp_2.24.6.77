package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.0Fg  reason: invalid class name and case insensitive filesystem */
public class C03470Fg extends AppCompatCheckBox {
    public static final int A0K = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public static final int[] A0L = {R.attr.f4nameremoved};
    public static final int[] A0M = {R.attr.f4nameremoved};
    public static final int[][] A0N = {new int[]{16842910, R.attr.f4nameremoved}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public Drawable A04;
    public CharSequence A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public int[] A09;
    public ColorStateList A0A;
    public PorterDuff.Mode A0B;
    public CompoundButton.OnCheckedChangeListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C06590Ue A0G = new C03840Ib(this);
    public final AnonymousClass0BQ A0H = AnonymousClass0BQ.A03(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
    public final LinkedHashSet A0I = new LinkedHashSet();
    public final LinkedHashSet A0J = new LinkedHashSet();

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.A00 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A0M);
        }
        if (this.A07) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        int[] iArr = onCreateDrawableState;
        int i2 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i2 >= length) {
                iArr = Arrays.copyOf(onCreateDrawableState, length + 1);
                iArr[length] = 16842912;
                break;
            } else if (onCreateDrawableState[i2] == 16842912) {
                break;
            } else if (onCreateDrawableState[i2] == 0) {
                iArr = (int[]) onCreateDrawableState.clone();
                iArr[i2] = 16842912;
                break;
            } else {
                i2++;
            }
        }
        this.A09 = iArr;
        return onCreateDrawableState;
    }

    private void A01() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.A03;
        ColorStateList colorStateList3 = this.A02;
        PorterDuff.Mode A002 = A00(this);
        int i = Build.VERSION.SDK_INT;
        boolean A1T = AnonymousClass000.A1T(i, 23);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = AnonymousClass08I.A01(drawable).mutate();
            if (A002 != null) {
                AnonymousClass076.A04(A002, drawable);
            }
        } else if (A1T) {
            drawable.mutate();
        }
        this.A03 = drawable;
        Drawable drawable2 = this.A04;
        ColorStateList colorStateList4 = this.A01;
        PorterDuff.Mode mode = this.A0B;
        boolean A1T2 = AnonymousClass000.A1T(i, 23);
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = AnonymousClass08I.A01(drawable2).mutate();
            if (mode != null) {
                AnonymousClass076.A04(mode, drawable2);
            }
        } else if (A1T2) {
            drawable2.mutate();
        }
        this.A04 = drawable2;
        if (this.A08) {
            AnonymousClass0BQ r4 = this.A0H;
            if (r4 != null) {
                C06590Ue r0 = this.A0G;
                r4.A09(r0);
                r4.A08(r0);
            }
            if (i >= 24) {
                Drawable drawable3 = this.A03;
                if ((drawable3 instanceof AnimatedStateListDrawable) && r4 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, r4, false);
                    ((AnimatedStateListDrawable) this.A03).addTransition(R.id.indeterminate, R.id.unchecked, r4, false);
                }
            }
        }
        Drawable drawable4 = this.A03;
        if (!(drawable4 == null || (colorStateList2 = this.A02) == null)) {
            AnonymousClass076.A01(colorStateList2, drawable4);
        }
        Drawable drawable5 = this.A04;
        if (!(drawable5 == null || (colorStateList = this.A01) == null)) {
            AnonymousClass076.A01(colorStateList, drawable5);
        }
        Drawable drawable6 = this.A03;
        Drawable drawable7 = this.A04;
        if (drawable6 != null) {
            if (drawable7 == null) {
                drawable7 = drawable6;
            } else {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                    float intrinsicWidth2 = ((float) drawable7.getIntrinsicWidth()) / ((float) drawable7.getIntrinsicHeight());
                    if (intrinsicWidth2 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                        intrinsicWidth = drawable6.getIntrinsicWidth();
                        intrinsicHeight = (int) (((float) intrinsicWidth) / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable6.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * ((float) intrinsicHeight));
                    }
                } else {
                    intrinsicWidth = drawable7.getIntrinsicWidth();
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                }
                if (i >= 23) {
                    layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                    layerDrawable.setLayerGravity(1, 17);
                } else {
                    int intrinsicWidth3 = (drawable6.getIntrinsicWidth() - intrinsicWidth) / 2;
                    int intrinsicHeight2 = (drawable6.getIntrinsicHeight() - intrinsicHeight) / 2;
                    layerDrawable.setLayerInset(1, intrinsicWidth3, intrinsicHeight2, intrinsicWidth3, intrinsicHeight2);
                }
                drawable7 = layerDrawable;
            }
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    private String getButtonStateDescription() {
        int i;
        int i2 = this.A00;
        Resources resources = getResources();
        if (i2 == 1) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
            if (i2 == 0) {
                i = R.string.f12nameremoved;
            }
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A0A;
        if (colorStateList != null) {
            return colorStateList;
        }
        int[][] iArr = A0N;
        int A022 = C014606i.A02(this, R.attr.f4nameremoved);
        int A023 = C014606i.A02(this, R.attr.f4nameremoved);
        int A024 = C014606i.A02(this, R.attr.f4nameremoved);
        int A025 = C014606i.A02(this, R.attr.f4nameremoved);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{C014606i.A00(1.0f, A024, A023), C014606i.A00(1.0f, A024, A022), C014606i.A00(0.54f, A024, A025), C014606i.A00(0.38f, A024, A025), C014606i.A00(0.38f, A024, A025)});
        this.A0A = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.A02;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public boolean isChecked() {
        return AnonymousClass000.A1O(this.A00);
    }

    public void onDraw(Canvas canvas) {
        Drawable A002;
        if (!this.A0E || !TextUtils.isEmpty(getText()) || (A002 = C05870Rj.A00(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = 1;
        if (AnonymousClass04F.A01(this) == 1) {
            i = -1;
        }
        int width = ((getWidth() - A002.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = A002.getBounds();
            AnonymousClass076.A07(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0EK)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0EK r2 = (AnonymousClass0EK) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        setCheckedState(r2.A00);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.A03 = drawable;
        this.A08 = false;
        A01();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A04 = drawable;
        A01();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.A01 != colorStateList) {
            this.A01 = colorStateList;
            A01();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.A0B != mode) {
            this.A0B = mode;
            A01();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            A01();
        }
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.A00 != i) {
            this.A00 = i;
            super.setChecked(AnonymousClass000.A1S(i, 1));
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.A05 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.A0D) {
                this.A0D = true;
                LinkedHashSet linkedHashSet = this.A0I;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass001.A0A("onCheckedStateChangedListener");
                    }
                }
                if (!(this.A00 == 2 || (onCheckedChangeListener = this.A0C) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.A0D = false;
            }
        }
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        this.A06 = charSequence;
    }

    public void setErrorShown(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
            Iterator it = this.A0J.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("onErrorChanged");
            }
        }
    }

    public void setStateDescription(CharSequence charSequence) {
        this.A05 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A0F = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        AnonymousClass0Q6.A00(colorStateList, this);
    }

    public C03470Fg(Context context, AttributeSet attributeSet) {
        super(C27891Qg.A00(context, attributeSet, R.attr.f4nameremoved, R.style.f13nameremoved), attributeSet, R.attr.f4nameremoved);
        Context context2 = getContext();
        this.A03 = C05870Rj.A00(this);
        this.A02 = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        C010404j A012 = C013205s.A01(context2, attributeSet, C27931Qk.A0M, new int[0], R.attr.f4nameremoved, R.style.f13nameremoved);
        this.A04 = A012.A02(2);
        if (this.A03 != null && C014506h.A04(context2, R.attr.f4nameremoved, false)) {
            TypedArray typedArray = A012.A02;
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == A0K && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.A03 = AnonymousClass02X.A03().A08(context2, R.drawable.mtrl_checkbox_button);
                this.A08 = true;
                if (this.A04 == null) {
                    this.A04 = AnonymousClass02X.A03().A08(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.A01 = AnonymousClass061.A01(context2, A012, 3);
        TypedArray typedArray2 = A012.A02;
        this.A0B = AnonymousClass062.A01(PorterDuff.Mode.SRC_IN, typedArray2.getInt(4, -1));
        this.A0F = typedArray2.getBoolean(10, false);
        this.A0E = typedArray2.getBoolean(6, true);
        this.A07 = typedArray2.getBoolean(9, false);
        this.A06 = typedArray2.getText(8);
        if (typedArray2.hasValue(7)) {
            setCheckedState(typedArray2.getInt(7, 0));
        }
        typedArray2.recycle();
        A01();
    }

    public static PorterDuff.Mode A00(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0F && this.A02 == null && this.A01 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.A07) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(accessibilityNodeInfo.getText());
            A0u.append(", ");
            accessibilityNodeInfo.setText(AnonymousClass000.A0o(this.A06, A0u));
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0EK r1 = new AnonymousClass0EK(super.onSaveInstanceState());
        r1.A00 = this.A00;
        return r1;
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AnonymousClass02X.A02(this, i));
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        A01();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.A0E = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.A06 = charSequence;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A0C = onCheckedChangeListener;
    }

    public Drawable getButtonDrawable() {
        return this.A03;
    }

    public Drawable getButtonIconDrawable() {
        return this.A04;
    }

    public ColorStateList getButtonIconTintList() {
        return this.A01;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.A0B;
    }

    public ColorStateList getButtonTintList() {
        return this.A02;
    }

    public int getCheckedState() {
        return this.A00;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.A06;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass02X.A02(this, i));
    }
}
