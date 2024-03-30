package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4a3  reason: invalid class name and case insensitive filesystem */
public class C90374a3 implements AnonymousClass4RA {
    public Object A00;
    public final int A01;

    public C90374a3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bek(SpannableStringBuilder spannableStringBuilder, C80163ux r6, int i, int i2) {
        if (this.A01 != 0) {
            List list = (List) this.A00;
            if (spannableStringBuilder.charAt(i) == '@') {
                list.add(Integer.valueOf(i));
                return;
            }
            return;
        }
        Context context = (Context) this.A00;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(context, R.color.f6nameremoved)), i, i2, 33);
        context.getApplicationContext();
        spannableStringBuilder.setSpan(new C37401mJ(), i + 1, i2, 33);
    }
}
