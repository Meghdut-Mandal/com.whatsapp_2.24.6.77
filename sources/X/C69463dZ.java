package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3dZ  reason: invalid class name and case insensitive filesystem */
public final class C69463dZ implements C22921AyX {
    public final ImageView A00;
    public final AnonymousClass00T A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass3SF A03;
    public final AnonymousClass1RY A04;
    public final C18820ts A05;
    public final C20500xf A06;
    public final C32881eL A07;

    public void BSD(C22922AyY ayY) {
        AnonymousClass141 r4 = ((C69473da) ayY).A00;
        ImageView imageView = this.A00;
        C011004s.A08(imageView, AnonymousClass143.A03(r4.A0H));
        C48812i6.A00(imageView, this, r4, 14);
        this.A04.A08(imageView, r4);
        AnonymousClass3SF r1 = this.A03;
        r1.A05(r4);
        String A022 = AnonymousClass3U8.A02(this.A05, r4);
        if (AnonymousClass143.A0H(r4.A0H)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(0);
            C222813r r0 = UserJid.Companion;
            UserJid A0k = C36411kG.A0k(r4);
            AnonymousClass00C.A0E(A0k, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            AnonymousClass00C.A0D(A0k, 0);
            textEmojiLabel.setText((CharSequence) null);
        } else if (AnonymousClass00C.A0J(C36431kI.A18(r1.A01), A022) || AnonymousClass3M3.A01(this.A06, r4.A0H)) {
            TextEmojiLabel textEmojiLabel2 = this.A02;
            textEmojiLabel2.setVisibility(8);
            C36391kE.A1K(textEmojiLabel2);
        } else {
            TextEmojiLabel textEmojiLabel3 = this.A02;
            textEmojiLabel3.setVisibility(0);
            textEmojiLabel3.setText(A022);
        }
    }

    public C69463dZ(View view, AnonymousClass1LI r4, AnonymousClass1RY r5, C18820ts r6, C20500xf r7, C32881eL r8) {
        C36321k7.A19(r5, r4, r7, r8);
        AnonymousClass00C.A0D(r6, 6);
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = C36431kI.A1I(new AnonymousClass489(view));
        this.A00 = C36361kB.A0M(view, R.id.contactpicker_row_photo);
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r4, R.id.contactpicker_row_name);
        C33511fU.A03(A012.A01);
        this.A03 = A012;
        this.A02 = C36361kB.A0R(view, R.id.contactpicker_row_status);
    }
}
