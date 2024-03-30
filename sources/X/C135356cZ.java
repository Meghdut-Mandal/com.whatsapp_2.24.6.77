package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.6cZ  reason: invalid class name and case insensitive filesystem */
public class C135356cZ implements LayoutInflater.Factory2 {
    public final C002300y A00;

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public C135356cZ(C002300y r1) {
        this.A00 = r1;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("TextView".equals(str)) {
            return new WaTextView(context, attributeSet);
        }
        return this.A00.A0F((View) null, str, context, attributeSet);
    }
}
