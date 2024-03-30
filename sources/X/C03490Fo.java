package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

/* renamed from: X.0Fo  reason: invalid class name and case insensitive filesystem */
public class C03490Fo extends AppCompatRadioButton {
    public static final int[][] A02 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList A00;
    public boolean A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A00;
        if (colorStateList != null) {
            return colorStateList;
        }
        int A022 = C014606i.A02(this, R.attr.f4nameremoved);
        int A023 = C014606i.A02(this, R.attr.f4nameremoved);
        int A024 = C014606i.A02(this, R.attr.f4nameremoved);
        ColorStateList colorStateList2 = new ColorStateList(A02, new int[]{C014606i.A00(1.0f, A024, A022), C014606i.A00(0.54f, A024, A023), C014606i.A00(0.38f, A024, A023), C014606i.A00(0.38f, A024, A023)});
        this.A00 = colorStateList2;
        return colorStateList2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A01 = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        AnonymousClass0Q6.A00(colorStateList, this);
    }

    public C03490Fo(Context context, AttributeSet attributeSet) {
        super(C27891Qg.A00(context, attributeSet, R.attr.f4nameremoved, R.style.f13nameremoved), attributeSet, R.attr.f4nameremoved);
        Context context2 = getContext();
        TypedArray A002 = C013205s.A00(context2, attributeSet, C27931Qk.A0O, new int[0], R.attr.f4nameremoved, R.style.f13nameremoved);
        if (A002.hasValue(0)) {
            AnonymousClass0Q6.A00(AnonymousClass061.A00(context2, A002, 0), this);
        }
        this.A01 = A002.getBoolean(1, false);
        A002.recycle();
    }

    public static ColorStateList A00(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A01 && A00(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
