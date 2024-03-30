package X;

import android.widget.TextView;

public final /* synthetic */ class AZ0 implements AnonymousClass004 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C174508Xh A02;

    public /* synthetic */ AZ0(TextView textView, C174508Xh r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = textView;
    }

    public final Object get() {
        C174508Xh r3 = this.A02;
        return Float.valueOf((((float) this.A00) + AZ4.A00(r3.A0B)) - ((float) this.A01.getTop()));
    }
}
