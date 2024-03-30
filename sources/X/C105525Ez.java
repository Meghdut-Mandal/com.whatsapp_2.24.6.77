package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Ez  reason: invalid class name and case insensitive filesystem */
public class C105525Ez extends C46482Xv {
    public final ImageView A00;
    public final WaTextView A01;
    public final C1258561o A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5E3 r5 = (AnonymousClass5E3) obj;
        String str = r5.A02;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            C1258561o r1 = this.A02;
            ImageView imageView = this.A00;
            r1.A00(imageView, str);
            imageView.setVisibility(0);
        } else {
            this.A00.setVisibility(8);
        }
        this.A01.setText(r5.A01);
        View view = this.A0H;
        view.setOnClickListener(r5.A00);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        if (r5.A03) {
            i = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        A0a.bottomMargin = i;
    }

    public C105525Ez(View view, C1258561o r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C36401kF.A0G(view, R.id.category_icon);
        this.A01 = C36401kF.A0Q(view, R.id.category_name);
    }
}
