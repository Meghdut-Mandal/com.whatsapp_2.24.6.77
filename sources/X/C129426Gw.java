package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Gw  reason: invalid class name and case insensitive filesystem */
public abstract class C129426Gw {
    public static void A01(TextEmojiLabel textEmojiLabel, AnonymousClass6LH r8, String str) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        AnonymousClass6LH.A00(textEmojiLabel.getContext(), textEmojiLabel2, r8, AnonymousClass000.A0p("# ", str, AnonymousClass000.A0u()), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
        CharSequence text = textEmojiLabel2.getText();
        AnonymousClass00C.A0D(text, 1);
        Context context = textEmojiLabel2.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C36441kJ.A0O(text));
        C37351mE.A03(textEmojiLabel2.getPaint(), AnonymousClass3UF.A04(context, C36381kD.A0H(context, R.drawable.ic_security_balloon), R.color.f6nameremoved), spannableStringBuilder, -1, 0, 1);
        textEmojiLabel2.setText(spannableStringBuilder);
    }

    public static void A00(AnonymousClass01I r5, C33771fu r6, C33751fs r7) {
        C39001qm A00 = AnonymousClass3LW.A00(r5);
        View A0D = C36421kH.A0D(r5, R.layout.f9nameremoved);
        View A02 = C012005e.A02(A0D, R.id.not_now_btn);
        C67113Yo.A00(C012005e.A02(A0D, R.id.update_btn), r5, r6, r7, 9);
        C36361kB.A18(A02, r5, 31);
        A00.A0V(new C163977r4(r5, 1));
        A00.setView(A0D);
        A00.A0b();
    }
}
