package X;

import com.whatsapp.expressionstray.emoji.view.EmojiImageView;

/* renamed from: X.6BM  reason: invalid class name */
public final class AnonymousClass6BM {
    public final long A00;
    public final AnonymousClass3PG A01;
    public final EmojiImageView A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BM) {
                AnonymousClass6BM r8 = (AnonymousClass6BM) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, C90464aC.A08(this.A00)));
    }

    public AnonymousClass6BM(AnonymousClass3PG r1, EmojiImageView emojiImageView, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = emojiImageView;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmojiTarget(emojiDescriptor=");
        A0u.append(this.A00);
        A0u.append(", emojiSequence=");
        A0u.append(this.A01);
        A0u.append(", emojiImageView=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
