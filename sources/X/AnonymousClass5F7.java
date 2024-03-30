package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.5F7  reason: invalid class name */
public class AnonymousClass5F7 extends C46482Xv {
    public final LinearLayout A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EN r6 = (AnonymousClass5EN) obj;
        int i = 0;
        if (r6.A03) {
            this.A02.setText(r6.A02);
            String str = r6.A01;
            boolean isEmpty = TextUtils.isEmpty(str);
            WaTextView waTextView = this.A03;
            if (isEmpty) {
                waTextView.setVisibility(8);
            } else {
                waTextView.setVisibility(0);
                waTextView.setText(str);
            }
            this.A00.setVisibility(0);
            this.A04.setVisibility(8);
        } else {
            WaTextView waTextView2 = this.A04;
            waTextView2.setText(r6.A02);
            this.A00.setVisibility(8);
            waTextView2.setVisibility(0);
        }
        WaImageView waImageView = this.A01;
        if (!r6.A04) {
            i = 8;
        }
        waImageView.setVisibility(i);
        C36361kB.A17(this.A0H, r6, 18);
        C36361kB.A17(waImageView, r6, 19);
    }

    public AnonymousClass5F7(View view) {
        super(view);
        this.A04 = C36401kF.A0Q(view, R.id.search_query);
        this.A02 = C36401kF.A0Q(view, R.id.category_text);
        this.A03 = C36401kF.A0Q(view, R.id.parent_category);
        this.A01 = C36431kI.A0X(view, R.id.delete_button);
        this.A00 = C90514aH.A0U(view, R.id.category_layout);
    }
}
