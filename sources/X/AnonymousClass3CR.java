package X;

import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3CR  reason: invalid class name */
public final class AnonymousClass3CR {
    public final AnonymousClass171 A00;

    public AnonymousClass3CR(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(TextEmojiLabel textEmojiLabel, C52022ol r5, AnonymousClass141 r6, int i) {
        AnonymousClass00C.A0D(textEmojiLabel, 3);
        String A0G = this.A00.A0G(r5, r6, i);
        if (A0G == null || A0G.length() == 0) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.A0I(A0G);
        textEmojiLabel.setVisibility(0);
    }
}
