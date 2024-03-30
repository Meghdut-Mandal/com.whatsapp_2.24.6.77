package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.51m  reason: invalid class name */
public final class AnonymousClass51m extends C1027951y {
    public final TextEmojiLabel A00;
    public final WaImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass51m(View view, AnonymousClass652 r3, AnonymousClass16I r4, AnonymousClass1RY r5, C20430xY r6, C18820ts r7, C20810yC r8) {
        super(view, r3, r4, r5, r6, r7, r8);
        AnonymousClass00C.A0D(view, 1);
        this.A00 = C36351kA.A0O(view, R.id.business_header);
        this.A01 = C90474aD.A0P(view, R.id.delete_button);
    }

    public void A0G(C106435Jr r4, List list) {
        C36321k7.A0w(r4, list);
        super.A0G(r4, list);
        C36331k8.A0r(C36441kJ.A0F(this), this.A00, R.color.f6nameremoved);
        C36361kB.A17(this.A01, r4, 26);
    }
}
