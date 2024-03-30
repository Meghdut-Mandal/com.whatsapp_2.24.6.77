package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.8pZ  reason: invalid class name and case insensitive filesystem */
public class C182718pZ extends C168207zs {
    public final View A00;
    public final View A01;
    public final WaTextView A02;

    public C182718pZ(View view) {
        super(view);
        this.A00 = C012005e.A02(view, R.id.wallpaper_header_chevron_view);
        WaTextView A0Q = C36401kF.A0Q(view, R.id.wallpaper_header_title);
        this.A02 = A0Q;
        this.A01 = C012005e.A02(view, R.id.wallpaper_header_description);
        C33511fU.A03(A0Q);
    }
}
