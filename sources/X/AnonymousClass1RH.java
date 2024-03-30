package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.1RH  reason: invalid class name */
public abstract class AnonymousClass1RH {
    public static final float A00(Context context) {
        AnonymousClass00C.A0D(context, 0);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true)) {
            return TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attribute ");
        sb.append(R.attr.f4nameremoved);
        sb.append(" could not be resolved");
        throw new Resources.NotFoundException(sb.toString());
    }
}
