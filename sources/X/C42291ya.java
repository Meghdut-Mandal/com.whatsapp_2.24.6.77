package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.1ya  reason: invalid class name and case insensitive filesystem */
public final class C42291ya extends AnonymousClass0D3 {
    public final ViewGroup A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public C42291ya(View view) {
        super(view);
        this.A00 = (ViewGroup) C36361kB.A0F(view, R.id.container);
        this.A04 = C36351kA.A0Q(view, R.id.title);
        this.A03 = C36351kA.A0Q(view, R.id.newsletter_name);
        this.A02 = C36351kA.A0Q(view, R.id.description);
        this.A01 = (WaImageView) C36361kB.A0F(view, R.id.icon);
    }
}
