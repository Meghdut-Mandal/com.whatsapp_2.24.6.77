package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

/* renamed from: X.0FI  reason: invalid class name */
public abstract class AnonymousClass0FI extends AlertDialog$Builder {
    public Drawable A00;
    public final Rect A01;

    public void A0c() {
        super.A0a(true);
    }

    public AnonymousClass0FI(Context context, int i) {
        super(A00(context), i);
        int i2;
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        this.A01 = A01(context2);
        TypedValue A02 = C014506h.A02(context2, getClass().getCanonicalName(), R.attr.f4nameremoved);
        int i3 = A02.resourceId;
        if (i3 != 0) {
            i2 = AnonymousClass00F.A00(context2, i3);
        } else {
            i2 = A02.data;
        }
        Paint paint = C012505l.A0N;
        C012505l r4 = new C012505l(new AnonymousClass06J(AnonymousClass06J.A01(context2, (AttributeSet) null, R.attr.f4nameremoved, R.style.f13nameremoved)));
        r4.A0B(context2);
        r4.A0C(ColorStateList.valueOf(i2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(AnonymousClass000.A0X(context2));
            if (typedValue.type == 5 && dimension >= 0.0f) {
                r4.setShapeAppearanceModel(r4.A01.A0K.A04(dimension));
            }
        }
        this.A00 = r4;
    }

    public static Context A00(Context context) {
        int i;
        TypedValue A012 = C014506h.A01(context, R.attr.f4nameremoved);
        if (A012 == null) {
            i = 0;
        } else {
            i = A012.data;
        }
        Context A002 = C27891Qg.A00(context, (AttributeSet) null, R.attr.f4nameremoved, R.style.f13nameremoved);
        if (i == 0) {
            return A002;
        }
        return new C004602b(A002, i);
    }

    public static Rect A01(Context context) {
        TypedArray A002 = C013205s.A00(context, (AttributeSet) null, C27931Qk.A0G, new int[0], R.attr.f4nameremoved, R.style.f13nameremoved);
        int dimensionPixelSize = A002.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int dimensionPixelSize2 = A002.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int dimensionPixelSize3 = A002.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int dimensionPixelSize4 = A002.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        A002.recycle();
        if (AnonymousClass000.A0U(context).getLayoutDirection() == 1) {
            int i = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public AnonymousClass0FM create() {
        AnonymousClass0FM create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.A00;
        if (drawable instanceof C012505l) {
            ((C012505l) drawable).A09(C011004s.A00(decorView));
        }
        Rect rect = this.A01;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new C09130bs(create, rect));
        return create;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0K(int i) {
        super.A0K(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0L(int i) {
        super.A0L(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0M(int i) {
        super.A0M(i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0N(DialogInterface.OnCancelListener onCancelListener) {
        super.A0N(onCancelListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0V(DialogInterface.OnDismissListener onDismissListener) {
        super.A0V(onDismissListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0W(DialogInterface.OnKeyListener onKeyListener) {
        super.A0W(onKeyListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Y(View view) {
        super.A0Y(view);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Z(CharSequence charSequence) {
        super.A0Z(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0a(boolean z) {
        super.A0a(z);
        return this;
    }

    public void A0d(int i) {
        super.A0K(i);
    }

    public void A0e(int i) {
        super.A0L(i);
    }

    public void A0h(CharSequence charSequence) {
        super.A0Z(charSequence);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setView(View view) {
        super.setView(view);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0O(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        super.A0O(onClickListener, listAdapter);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0Q(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0Q(onClickListener, charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0R(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0R(onClickListener, charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0S(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A0S(onClickListener, charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0T(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        super.A0T(onClickListener, charSequenceArr);
        return this;
    }

    public void A0f(DialogInterface.OnClickListener onClickListener, int i) {
        super.setNegativeButton(i, onClickListener);
    }

    public void A0g(DialogInterface.OnClickListener onClickListener, int i) {
        super.setPositiveButton(i, onClickListener);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0P(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        super.A0P(onClickListener, listAdapter, i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0U(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        super.A0U(onClickListener, charSequenceArr, i);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder A0X(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        super.A0X(onMultiChoiceClickListener, charSequenceArr, zArr);
        return this;
    }
}
