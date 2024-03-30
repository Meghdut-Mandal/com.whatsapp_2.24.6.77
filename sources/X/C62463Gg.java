package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3Gg  reason: invalid class name and case insensitive filesystem */
public class C62463Gg {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass3SF A03;
    public final SelectionCheckView A04;

    public void A00(String str, boolean z) {
        this.A00.setEnabled(z);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(str);
        C36351kA.A15(textEmojiLabel.getResources(), textEmojiLabel, R.color.f6nameremoved);
        textEmojiLabel.A0B();
        AnonymousClass3SF r2 = this.A03;
        r2.A01.setTextColor(textEmojiLabel.getResources().getColor(R.color.f6nameremoved));
        this.A01.setAlpha(0.5f);
        this.A04.A04(false, false);
    }

    public void A01(boolean z) {
        this.A00.setEnabled(true);
        this.A01.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.A0C();
        C36351kA.A15(textEmojiLabel.getResources(), textEmojiLabel, R.color.f6nameremoved);
        AnonymousClass3SF r4 = this.A03;
        r4.A01.setTextColor(textEmojiLabel.getResources().getColor(C224514j.A00(textEmojiLabel.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        this.A04.A04(z, false);
    }

    public C62463Gg(View view, AnonymousClass1LI r4) {
        this.A00 = C012005e.A02(view, R.id.row_container);
        this.A01 = C36401kF.A0G(view, R.id.contact_photo);
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r4, R.id.chat_able_contacts_row_name);
        this.A03 = A012;
        TextEmojiLabel textEmojiLabel = A012.A01;
        C011504z.A06(textEmojiLabel, 2);
        C33511fU.A03(textEmojiLabel);
        this.A02 = C36401kF.A0O(view, R.id.chat_able_contacts_row_status);
        this.A04 = (SelectionCheckView) C012005e.A02(view, R.id.selection_check);
    }
}
