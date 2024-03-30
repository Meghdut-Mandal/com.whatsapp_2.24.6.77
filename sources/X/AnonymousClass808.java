package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.808  reason: invalid class name */
public class AnonymousClass808 extends AnonymousClass0D3 {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final WaTextView A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass1RJ A05;
    public final AnonymousClass1RJ A06;
    public final WDSButton A07;
    public final WDSButton A08;
    public final /* synthetic */ C168097zh A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass808(View view, C24801Dv r7, C168097zh r8) {
        super(view);
        this.A09 = r8;
        this.A00 = view;
        this.A02 = C36361kB.A0R(view, R.id.title);
        this.A06 = C36341k9.A0Y(view, R.id.subtitle);
        this.A05 = C36341k9.A0Y(view, R.id.groups_in_common);
        ImageView A0M = C36361kB.A0M(view, R.id.avatar);
        this.A01 = A0M;
        WDSButton wDSButton = (WDSButton) C36361kB.A0F(view, R.id.accept_button);
        this.A07 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) C36361kB.A0F(view, R.id.reject_button);
        this.A08 = wDSButton2;
        this.A03 = C36351kA.A0Q(view, R.id.request_status);
        this.A04 = C36341k9.A0Y(view, R.id.added_by_other_user);
        AnonymousClass3YG.A00(view, r7, this, 28);
        AnonymousClass3YG.A00(wDSButton, r8, this, 29);
        AnonymousClass3YG.A00(wDSButton2, r8, this, 30);
        C011504z.A06(A0M, 2);
    }
}
