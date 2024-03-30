package X;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.3F7  reason: invalid class name */
public class AnonymousClass3F7 {
    public LinearLayout.LayoutParams A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public final List A07 = AnonymousClass001.A0I();
    public final Context A08;

    public C38551pI A00() {
        Context context = this.A08;
        Integer num = this.A03;
        LinearLayout.LayoutParams layoutParams = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        return new C38551pI(context, layoutParams, num, this.A04, this.A02, this.A01, str, str2, this.A07);
    }

    public AnonymousClass3F7(Context context) {
        this.A08 = context;
    }
}
