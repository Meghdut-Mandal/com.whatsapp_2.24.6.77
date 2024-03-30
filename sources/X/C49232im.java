package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;

/* renamed from: X.2im  reason: invalid class name and case insensitive filesystem */
public final class C49232im extends C132446Tt {
    public final AnonymousClass171 A00;
    public final AnonymousClass141 A01;
    public final WeakReference A02;

    public C49232im(TextEmojiLabel textEmojiLabel, AnonymousClass171 r3, AnonymousClass141 r4) {
        AnonymousClass00C.A0D(r3, 3);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass001.A0F(textEmojiLabel);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass171 r3 = this.A00;
        Jid A06 = this.A01.A06(AnonymousClass144.class);
        if (A06 != null) {
            String A04 = AnonymousClass171.A04(r3, (AnonymousClass144) A06, -1, true);
            AnonymousClass00C.A08(A04);
            return A04;
        }
        throw C36381kD.A0l();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A02.get();
        if (textEmojiLabel != null) {
            if (C36411kG.A1V(this.A01, textEmojiLabel.getTag())) {
                textEmojiLabel.setVisibility(0);
                textEmojiLabel.A0I(str);
            }
        }
    }
}
