package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.0EC  reason: invalid class name */
public class AnonymousClass0EC extends Property {
    public static final Property A00 = new AnonymousClass0EC();

    public AnonymousClass0EC() {
        super(Float.class, "childrenAlpha");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Object tag = ((View) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (tag == null) {
            return Float.valueOf(1.0f);
        }
        return tag;
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Number number = (Number) obj2;
        float floatValue = number.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, number);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
