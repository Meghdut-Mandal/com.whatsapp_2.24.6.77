package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.24G  reason: invalid class name */
public class AnonymousClass24G extends AnonymousClass3SF {
    public final C19460v5 A00;

    public AnonymousClass24G(Context context, C19460v5 r9, TextEmojiLabel textEmojiLabel, AnonymousClass171 r11, C18820ts r12, C20810yC r13) {
        super(context, textEmojiLabel, r11, r12, (C220412q) null, r13);
        this.A00 = r9;
    }

    public void A0B(AnonymousClass141 r6) {
        TextEmojiLabel textEmojiLabel;
        boolean A0A = A0A(r6);
        C19460v5 r1 = this.A00;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("getDrawable");
        }
        if (A0A) {
            int A002 = C55832vG.A00(this.A03);
            textEmojiLabel = this.A01;
            textEmojiLabel.A0F(A002, R.dimen.f7nameremoved);
        } else {
            textEmojiLabel = this.A01;
            textEmojiLabel.A0E();
        }
        C36331k8.A0r(textEmojiLabel.getContext(), textEmojiLabel, C224514j.A00(textEmojiLabel.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }
}
