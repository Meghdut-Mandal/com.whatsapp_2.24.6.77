package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.1yb  reason: invalid class name and case insensitive filesystem */
public final class C42301yb extends AnonymousClass0D3 {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public String A03;
    public final /* synthetic */ C40691vx A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42301yb(View view, AnonymousClass33C r4, AnonymousClass33D r5, C40691vx r6) {
        super(view);
        AnonymousClass00C.A0D(r5, 4);
        this.A04 = r6;
        this.A02 = (WaImageView) C36361kB.A0F(view, R.id.status_emoji);
        this.A00 = C36361kB.A0R(view, R.id.status_text);
        WaImageView waImageView = (WaImageView) C36361kB.A0F(view, R.id.status_selected_check);
        this.A01 = waImageView;
        waImageView.setVisibility(8);
        AnonymousClass3YC.A00(view, r4, this, 33);
        AnonymousClass4Y7.A00(view, r5, this, 11);
    }
}
