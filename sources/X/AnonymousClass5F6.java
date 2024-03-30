package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5F6  reason: invalid class name */
public final class AnonymousClass5F6 extends C46482Xv {
    public final TextEmojiLabel A00;
    public final WaImageView A01;
    public final AnonymousClass6LH A02;
    public final WDSButton A03;
    public final WDSButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F6(View view, AnonymousClass6LH r3) {
        super(view);
        AnonymousClass00C.A0D(r3, 2);
        this.A02 = r3;
        this.A03 = (WDSButton) view.findViewById(R.id.allow_location_btn);
        this.A04 = (WDSButton) view.findViewById(R.id.more_options_btn);
        this.A00 = C36401kF.A0P(view, R.id.privacy_description);
        this.A01 = (WaImageView) view.findViewById(R.id.icon);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EF r5 = (AnonymousClass5EF) obj;
        AnonymousClass00C.A0D(r5, 0);
        C36361kB.A17(this.A03, r5, 9);
        C36361kB.A17(this.A04, r5, 10);
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            Context A0F = C36441kJ.A0F(this);
            String str = r5.A01;
            if (str == null) {
                str = "";
            }
            AnonymousClass3UF.A0B(A0F, waImageView, C110175aF.A00(str), R.color.f6nameremoved);
        }
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            C129426Gw.A01(textEmojiLabel, this.A02, C36441kJ.A0F(this).getString(R.string.f12nameremoved));
        }
    }
}
