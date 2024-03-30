package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.5F4  reason: invalid class name */
public class AnonymousClass5F4 extends C46482Xv {
    public final TextView A00;
    public final TextView A01;
    public final WaImageView A02;
    public final WaImageView A03;
    public final C1258561o A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5E5 r6 = (AnonymousClass5E5) obj;
        String str = r6.A02;
        if (!TextUtils.isEmpty(str)) {
            this.A04.A00(this.A03, str);
        } else {
            this.A03.setImageResource(R.drawable.ic_action_search);
        }
        this.A00.setText(r6.A01);
        String str2 = r6.A03;
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i = 0;
        TextView textView = this.A01;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(str2);
        } else {
            textView.setVisibility(8);
        }
        WaImageView waImageView = this.A02;
        if (!r6.A04) {
            i = 8;
        }
        waImageView.setVisibility(i);
        this.A0H.setOnClickListener(r6.A00);
    }

    public AnonymousClass5F4(View view, C1258561o r3) {
        super(view);
        this.A04 = r3;
        this.A00 = C36391kE.A0O(view, R.id.category_text);
        this.A01 = C36391kE.A0O(view, R.id.parent_category);
        this.A03 = C36431kI.A0X(view, R.id.search_icon);
        this.A02 = C36431kI.A0X(view, R.id.nav_root);
    }
}
