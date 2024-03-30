package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.whatsapp.R;

/* renamed from: X.0Ec  reason: invalid class name and case insensitive filesystem */
public class C03320Ec extends AutoCompleteTextView {
    public static final int[] A02 = {16843126};
    public final C015706u A00;
    public final C015906w A01;

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A00;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public C03320Ec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        C015906w r02 = this.A01;
        if (r02 != null) {
            r02.A04();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0PC.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A00;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AnonymousClass02X.A02(this, i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C015906w r0 = this.A01;
        if (r0 != null) {
            r0.A07(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03320Ec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C015606t.A04(this);
        C010404j A002 = C010404j.A00(getContext(), attributeSet, A02, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A02(0));
        }
        typedArray.recycle();
        C015706u r0 = new C015706u(this);
        this.A00 = r0;
        r0.A05(attributeSet, i);
        C015906w r02 = new C015906w(this);
        this.A01 = r02;
        r02.A0A(attributeSet, i);
        r02.A04();
    }
}
