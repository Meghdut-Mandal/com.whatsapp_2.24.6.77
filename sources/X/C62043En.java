package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3En  reason: invalid class name and case insensitive filesystem */
public final class C62043En {
    public final AnonymousClass3TX A00;
    public final C24801Dv A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass1N3 A03;
    public final C21060yb A04;
    public final C20810yC A05;

    public final AnonymousClass0FM A00(Context context, Runnable runnable, Runnable runnable2) {
        Context context2 = context;
        View A0D = C36421kH.A0D(context2, R.layout.f9nameremoved);
        C39001qm A002 = AnonymousClass3LW.A00(context2);
        A002.A0j(A0D);
        A002.A0r(false);
        AnonymousClass0FM A0O = C36371kC.A0O(A002);
        C36341k9.A0M(A0D, R.id.dialog_title).setText(R.string.f12nameremoved);
        TextEmojiLabel A0O2 = C36351kA.A0O(A0D, R.id.dialog_message);
        A0O2.setText(R.string.f12nameremoved);
        C20810yC r10 = this.A05;
        AnonymousClass6YV.A0G(context2, this.A01, this.A02, A0O2, this.A04, r10, context2.getString(R.string.f12nameremoved), C36391kE.A11("learn-more", this.A03.A00("https://faq.whatsapp.com/729321962119902/")));
        SpannableString A0O3 = C36441kJ.A0O(A0O2.getText());
        ((C429721s[]) A0O3.getSpans(0, A0O3.length(), C429721s.class))[0].A02 = new C53962sB(this, 2);
        Window window = A0O.getWindow();
        if (window != null) {
            C36341k9.A0r(context2, window, R.color.f6nameremoved);
        }
        C36361kB.A0G(A0D, R.id.continue_button).setOnClickListener(new AnonymousClass3YT(this, A0O, runnable2, runnable, 10));
        return A0O;
    }

    public C62043En(C24801Dv r2, AnonymousClass17Y r3, AnonymousClass1N3 r4, C21060yb r5, C20810yC r6, AnonymousClass3TX r7) {
        C36321k7.A1B(r6, r3, r7, r2, r5);
        AnonymousClass00C.A0D(r4, 6);
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r7;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }
}
