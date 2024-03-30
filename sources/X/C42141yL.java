package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1yL  reason: invalid class name and case insensitive filesystem */
public final class C42141yL extends AnonymousClass0D3 {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42141yL(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A00 = view;
        View findViewById = view.findViewById(R.id.contact_row_photo);
        AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        this.A02 = (ThumbnailButton) findViewById;
        View findViewById2 = view.findViewById(R.id.contact_name);
        AnonymousClass00C.A0E(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        this.A01 = textView;
        C011504z.A06(textView, 2);
        View findViewById3 = view.findViewById(R.id.iv_close);
        if ((findViewById3 instanceof ImageView) && C222013h.A07) {
            ImageView imageView = (ImageView) findViewById3;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C36361kB.A10(C36341k9.A0F(imageView), findViewById3, R.dimen.f7nameremoved);
        }
    }
}
