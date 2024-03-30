package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5F8  reason: invalid class name */
public final class AnonymousClass5F8 extends C46482Xv {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final C18820ts A05;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AnonymousClass5EK r8 = (AnonymousClass5EK) obj;
        AnonymousClass00C.A0D(r8, 0);
        TextView textView = this.A04;
        textView.setText(r8.A01);
        Integer num = r8.A00;
        if (num == null || num.intValue() == 0) {
            this.A03.setVisibility(8);
        } else {
            TextView textView2 = this.A03;
            textView2.setVisibility(0);
            textView2.setText(C90494aF.A0e(C36401kF.A0x(this.A05), "%,d", C90524aI.A0x(num, new Object[1], 0, 1)));
        }
        r8.A04.invoke(this.A02, r8.A02);
        C36361kB.A18(this.A00, r8, 26);
        boolean A1X = C36401kF.A1X(this.A05);
        ImageView imageView = this.A01;
        if (A1X) {
            imageView.setScaleX(-1.0f);
            i = 5;
        } else {
            imageView.setScaleY(1.0f);
            i = 3;
        }
        textView.setGravity(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F8(View view, C18820ts r3) {
        super(view);
        C36321k7.A0x(view, r3);
        this.A00 = view;
        this.A05 = r3;
        this.A02 = C36341k9.A0L(view, R.id.category_icon);
        this.A04 = C36341k9.A0M(view, R.id.category_name);
        this.A03 = C36341k9.A0M(view, R.id.biz_number);
        this.A01 = C36341k9.A0L(view, R.id.chevron_category_row);
    }
}
