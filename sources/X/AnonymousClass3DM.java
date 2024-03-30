package X;

import android.net.Uri;
import android.text.SpannableString;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

/* renamed from: X.3DM  reason: invalid class name */
public final class AnonymousClass3DM {
    public final C19420v0 A00;
    public final AnonymousClass1N3 A01;

    public final void A00(TextEmojiLabel textEmojiLabel, AnonymousClass155 r14, int i) {
        C36331k8.A1I(r14, textEmojiLabel);
        String A0m = C36361kB.A0m(r14, i);
        HashMap A0J = AnonymousClass001.A0J();
        Uri A002 = this.A01.A00("https://faq.whatsapp.com/android/verification/how-to-register-your-account-with-a-missed-call");
        AnonymousClass00C.A08(A002);
        A0J.put("flash-call-faq-link", A002);
        C20810yC abProps = r14.getAbProps();
        AnonymousClass17Y r6 = r14.A05;
        AnonymousClass6YV.A0G(r14, r14.A01, r6, textEmojiLabel, r14.A08, abProps, A0m, A0J);
        SpannableString A0O = C36441kJ.A0O(textEmojiLabel.getText());
        ((C429721s[]) A0O.getSpans(0, A0O.length(), C429721s.class))[0].A02 = new C53962sB(this, 3);
    }

    public AnonymousClass3DM(AnonymousClass1N3 r1, C19420v0 r2) {
        C36321k7.A0x(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
