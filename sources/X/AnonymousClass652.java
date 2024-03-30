package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.652  reason: invalid class name */
public final class AnonymousClass652 {
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass1RY A03;
    public final C20380xT A04;
    public final C19770wU A05;
    public final C21060yb A06;
    public final C20810yC A07;
    public final AnonymousClass190 A08;
    public final C32711e4 A09;

    public AnonymousClass652(C24801Dv r2, AnonymousClass17Y r3, AnonymousClass16D r4, AnonymousClass1RY r5, C21060yb r6, C20810yC r7, AnonymousClass190 r8, C20380xT r9, C32711e4 r10, C19770wU r11) {
        C36321k7.A1B(r7, r11, r8, r2, r6);
        C36321k7.A13(r10, r9, r4);
        AnonymousClass00C.A0D(r3, 9);
        this.A07 = r7;
        this.A05 = r11;
        this.A08 = r8;
        this.A00 = r2;
        this.A06 = r6;
        this.A09 = r10;
        this.A04 = r9;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }

    public final void A00(Context context, TextEmojiLabel textEmojiLabel, String str) {
        C36321k7.A0w(textEmojiLabel, str);
        textEmojiLabel.setText(C32711e4.A02(context, new C1501874h(this, context, 30), str, "learn-more", C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)));
        C36331k8.A16(textEmojiLabel, this.A06);
        C36331k8.A10(textEmojiLabel, this.A07);
    }
}
