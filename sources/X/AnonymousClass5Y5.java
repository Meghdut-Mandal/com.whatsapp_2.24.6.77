package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure;
import com.whatsapp.R;

/* renamed from: X.5Y5  reason: invalid class name */
public abstract class AnonymousClass5Y5 {
    public static final EditTextForMeasure A00(Context context) {
        try {
            EditTextForMeasure editTextForMeasure = new EditTextForMeasure(context, (AttributeSet) null);
            editTextForMeasure.setBackgroundResource(17170445);
            return editTextForMeasure;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !AnonymousClass099.A0O(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.bloks.stdlib.components.bkcomponentstextinput.EditTextForMeasure");
            return (EditTextForMeasure) inflate;
        }
    }
}
