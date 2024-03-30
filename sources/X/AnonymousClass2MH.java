package X;

import android.content.Context;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.2MH  reason: invalid class name */
public final class AnonymousClass2MH extends AnonymousClass2ML {
    public AnonymousClass2MH(Context context) {
        super(context);
        C36371kC.A13(context, this, R.drawable.event_rounded_border);
        AnonymousClass1JZ.A06(this, getWhatsAppLocale(), 0, 0, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843868, typedValue, true);
        this.A06.setBackgroundResource(typedValue.resourceId);
    }
}
