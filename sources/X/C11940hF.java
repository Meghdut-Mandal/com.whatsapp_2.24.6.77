package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.0hF  reason: invalid class name and case insensitive filesystem */
public class C11940hF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ C015906w A03;

    public C11940hF(Typeface typeface, TextView textView, C015906w r3, int i) {
        this.A03 = r3;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    public void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
