package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.5F2  reason: invalid class name */
public final class AnonymousClass5F2 extends C46482Xv {
    public final WaTextView A00;
    public final ThumbnailButton A01;
    public final C117555mS A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F2(View view, C117555mS r3) {
        super(view);
        AnonymousClass00C.A0D(r3, 2);
        this.A02 = r3;
        this.A01 = (ThumbnailButton) C36361kB.A0G(view, R.id.profile_icon);
        this.A00 = C36341k9.A0Q(view, R.id.biz_name);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C117575mU r7 = (C117575mU) obj;
        AnonymousClass00C.A0D(r7, 0);
        WaTextView waTextView = this.A00;
        C144416s9 r1 = r7.A00;
        waTextView.setText(r1.A0I);
        String str = r1.A0G;
        if (str == null || str.length() == 0) {
            this.A01.setImageResource(R.drawable.avatar_contact);
            return;
        }
        C117555mS r2 = this.A02;
        ThumbnailButton thumbnailButton = this.A01;
        Drawable A002 = AnonymousClass00E.A00(thumbnailButton.getContext(), R.drawable.avatar_contact);
        r2.A00.A00(A002, A002, thumbnailButton, (C160197kc) null, str);
    }
}
