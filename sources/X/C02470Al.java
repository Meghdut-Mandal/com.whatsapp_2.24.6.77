package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.0Al  reason: invalid class name and case insensitive filesystem */
public class C02470Al implements TransformationMethod {
    public Locale A00;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public C02470Al(Context context) {
        this.A00 = context.getResources().getConfiguration().locale;
    }
}
