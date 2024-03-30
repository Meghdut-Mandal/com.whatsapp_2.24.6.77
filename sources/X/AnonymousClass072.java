package X;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.072  reason: invalid class name */
public class AnonymousClass072 extends AnonymousClass071 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C015906w A02;
    public final /* synthetic */ WeakReference A03;

    public void A01(int i) {
    }

    public AnonymousClass072(C015906w r1, WeakReference weakReference, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = weakReference;
    }

    public void A02(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.A00) != -1) {
            boolean z = false;
            if ((this.A01 & 2) != 0) {
                z = true;
            }
            typeface = Typeface.create(typeface, i, z);
        }
        C015906w r3 = this.A02;
        WeakReference weakReference = this.A03;
        if (r3.A09) {
            r3.A01 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean A022 = C011304x.A02(textView);
                int i2 = r3.A00;
                if (A022) {
                    textView.post(new C11940hF(typeface, textView, r3, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
