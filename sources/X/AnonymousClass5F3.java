package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.5F3  reason: invalid class name */
public class AnonymousClass5F3 extends C46482Xv {
    public final FrameLayout A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final AnonymousClass1QW A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5E2 r6 = (AnonymousClass5E2) obj;
        View view = this.A0H;
        Context context = view.getContext();
        this.A02.setText(r6.A02);
        this.A00.setBackground((Drawable) null);
        AnonymousClass3UF.A0B(context, this.A01, r6.A00, R.color.f6nameremoved);
        view.setOnClickListener(r6.A01);
    }

    public AnonymousClass5F3(View view, AnonymousClass1QW r3) {
        super(view);
        this.A03 = r3;
        this.A02 = C36401kF.A0Q(view, R.id.category_name);
        this.A01 = C36431kI.A0X(view, R.id.category_icon);
        this.A00 = C36441kJ.A0T(view, R.id.category_layout);
    }
}
