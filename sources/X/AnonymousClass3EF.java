package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3EF  reason: invalid class name */
public final class AnonymousClass3EF {
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final C21060yb A02;
    public final C20810yC A03;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel) {
        AnonymousClass00C.A0D(textEmojiLabel, 1);
        C20810yC r7 = this.A03;
        AnonymousClass17Y r4 = this.A01;
        C24801Dv r3 = this.A00;
        C21060yb r6 = this.A02;
        String string = context.getString(R.string.f12nameremoved);
        AnonymousClass6YV.A0E(context, Uri.parse("https://faq.whatsapp.com/5064231857013976"), r3, r4, textEmojiLabel, r6, r7, string, "passkeys_learn_more_uri");
    }

    public AnonymousClass3EF(C24801Dv r1, AnonymousClass17Y r2, C21060yb r3, C20810yC r4) {
        C36321k7.A18(r4, r2, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
