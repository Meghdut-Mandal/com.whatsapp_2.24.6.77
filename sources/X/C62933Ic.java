package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Ic  reason: invalid class name and case insensitive filesystem */
public final class C62933Ic {
    public final View A00;
    public final TextEmojiLabel A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62933Ic) {
                C62933Ic r5 = (C62933Ic) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C62933Ic(View view, TextEmojiLabel textEmojiLabel) {
        C36321k7.A0x(textEmojiLabel, view);
        this.A01 = textEmojiLabel;
        this.A00 = view;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PinInChatRenderParams(contentTextView=");
        A0u.append(this.A01);
        A0u.append(", contentThumbnailViewOrStub=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
