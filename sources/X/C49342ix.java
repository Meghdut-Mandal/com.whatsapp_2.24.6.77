package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.2ix  reason: invalid class name and case insensitive filesystem */
public class C49342ix extends C132446Tt {
    public final AnonymousClass171 A00;
    public final AnonymousClass1H2 A01;
    public final AnonymousClass147 A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass171.A04(this.A00, this.A02, -1, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) this.A03.get();
        if (textView != null && textView.getTag().equals(this.A02)) {
            textView.setText(AnonymousClass3UG.A05(textView.getContext(), this.A01, str));
        }
    }

    public C49342ix(TextView textView, AnonymousClass171 r3, AnonymousClass1H2 r4, AnonymousClass147 r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass001.A0F(textView);
    }
}
