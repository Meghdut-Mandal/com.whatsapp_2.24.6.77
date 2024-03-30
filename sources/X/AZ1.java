package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final /* synthetic */ class AZ1 implements AnonymousClass004 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C174508Xh A02;
    public final /* synthetic */ C18820ts A03;
    public final /* synthetic */ AZ4 A04;

    public /* synthetic */ AZ1(View view, TextView textView, C174508Xh r3, C18820ts r4, AZ4 az4) {
        this.A02 = r3;
        this.A01 = textView;
        this.A03 = r4;
        this.A00 = view;
        this.A04 = az4;
    }

    public final Object get() {
        float left;
        C174508Xh r7 = this.A02;
        TextView textView = this.A01;
        C18820ts r6 = this.A03;
        View view = this.A00;
        AZ4 az4 = this.A04;
        float left2 = (float) textView.getLeft();
        int dimensionPixelSize = r7.A03.getDimensionPixelSize(R.dimen.f7nameremoved);
        if (C36401kF.A1X(r6)) {
            left = ((((float) view.getRight()) - AZ4.A00(r7.A0A)) - ((float) dimensionPixelSize)) - AZ4.A00(az4);
        } else {
            left = ((float) view.getLeft()) + AZ4.A00(r7.A0A) + ((float) dimensionPixelSize);
        }
        return Float.valueOf(left - left2);
    }
}
