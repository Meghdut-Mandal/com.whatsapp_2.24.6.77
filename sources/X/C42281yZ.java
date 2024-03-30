package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.1yZ  reason: invalid class name and case insensitive filesystem */
public final class C42281yZ extends AnonymousClass0D3 {
    public final WaTextView A00;
    public final WaTextView A01;
    public final ThumbnailButton A02;
    public final AnonymousClass1RY A03;
    public final C64633Ov A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42281yZ(View view, AnonymousClass1RY r3, C64633Ov r4, C40651vt r5) {
        super(view);
        C36331k8.A1G(r3, 3, r4);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = C36351kA.A0Q(view, R.id.newsletter_name);
        this.A00 = C36351kA.A0Q(view, R.id.newsletter_follower_count);
        this.A02 = (ThumbnailButton) C36361kB.A0F(view, R.id.newsletter_thumbnail);
        C36371kC.A1F(view, r5, this, 15);
    }
}
