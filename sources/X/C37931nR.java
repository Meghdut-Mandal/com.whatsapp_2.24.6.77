package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.1nR  reason: invalid class name and case insensitive filesystem */
public final class C37931nR extends BaseAdapter {
    public Long A00;
    public final Context A01;
    public final C18820ts A02;
    public final List A03;

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public long getItemId(int i) {
        return ((C63203Jd) this.A03.get(i)).A01;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        Drawable drawable;
        Drawable drawable2;
        AnonymousClass011 A19;
        C63203Jd r3 = (C63203Jd) this.A03.get(i);
        Object obj = null;
        if (view instanceof WaTextView) {
            textView = (TextView) view;
            if (textView != null) {
                obj = textView.getTag();
            }
        } else {
            textView = null;
        }
        C51202nR r4 = r3.A02;
        if (obj != r4) {
            Context context = this.A01;
            C51202nR r0 = C51202nR.TITLE;
            int i2 = R.style.f13nameremoved;
            if (r4 == r0) {
                i2 = R.style.f13nameremoved;
            }
            textView = new WaTextView(new ContextThemeWrapper(context, i2));
            textView.setTag(r4);
        }
        AnonymousClass00C.A0D(textView, 0);
        Integer num = r3.A03;
        if (num == null || (drawable = AnonymousClass00E.A00(this.A01, num.intValue())) == null) {
            drawable = null;
        } else {
            drawable.mutate().setTint(textView.getCurrentTextColor());
        }
        long j = r3.A01;
        Long l = this.A00;
        if (l == null || j != l.longValue() || (drawable2 = AnonymousClass00E.A00(this.A01, R.drawable.ic_checkmark_selected_wds)) == null) {
            drawable2 = null;
        } else {
            drawable2.mutate().setTint(textView.getCurrentTextColor());
        }
        if (C36351kA.A1Y(this.A02)) {
            A19 = C36441kJ.A19(drawable, drawable2);
        } else {
            A19 = C36441kJ.A19(drawable2, drawable);
        }
        textView.setText(r3.A00);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) A19.first, (Drawable) null, (Drawable) A19.second, (Drawable) null);
        textView.setCompoundDrawablePadding(C36341k9.A0F(textView).getDimensionPixelSize(R.dimen.f7nameremoved));
        return textView;
    }

    public C37931nR(Context context, C18820ts r3, List list) {
        this.A02 = r3;
        this.A01 = context;
        this.A03 = list;
    }
}
