package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.5F9  reason: invalid class name */
public final class AnonymousClass5F9 extends C46482Xv {
    public final TextEmojiLabel A00;
    public final AnonymousClass3SF A01;
    public final WaImageButton A02;
    public final ThumbnailButton A03;
    public final AnonymousClass1RY A04;
    public final AnonymousClass7h9 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F9(View view, AnonymousClass1LI r8, C27731Pn r9, AnonymousClass7h9 r10) {
        super(view);
        C36321k7.A12(r10, r9, r8);
        this.A05 = r10;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r8, R.id.contact_name);
        this.A01 = A012;
        this.A04 = r9.A05(view.getContext(), "wa-business-contact-view-holder");
        ThumbnailButton thumbnailButton = (ThumbnailButton) C36361kB.A0G(view, R.id.contact_photo);
        this.A03 = thumbnailButton;
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.contact_status);
        this.A00 = A0O;
        this.A02 = (WaImageButton) C36361kB.A0G(view, R.id.message_btn);
        A0O.setClickable(true);
        A0O.setVisibility(0);
        A0O.A0C();
        C36331k8.A0r(view.getContext(), A0O, R.color.f6nameremoved);
        thumbnailButton.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = A012.A01;
        C33511fU.A03(textEmojiLabel);
        C36331k8.A0r(view.getContext(), textEmojiLabel, C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C119875qb r5 = (C119875qb) obj;
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass3SF r0 = this.A01;
        AnonymousClass141 r3 = r5.A00;
        r0.A05(r3);
        this.A04.A08(this.A03, r3);
        AnonymousClass00C.A07(r3);
        String str = r3.A0X;
        if (str != null) {
            this.A00.A0I(AnonymousClass000.A0q("  ", AnonymousClass000.A0v(str)));
        }
        TextEmojiLabel textEmojiLabel = this.A00;
        String str2 = r3.A0X;
        AnonymousClass00C.A07(str2);
        int length = str2.length();
        int i = 0;
        if (length <= 0) {
            i = 8;
        }
        textEmojiLabel.setVisibility(i);
        C36371kC.A1F(this.A02, this, r5, 5);
    }
}
