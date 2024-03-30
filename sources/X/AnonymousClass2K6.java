package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;

/* renamed from: X.2K6  reason: invalid class name */
public final class AnonymousClass2K6 extends C70693fZ {
    public final AnonymousClass17Y A00;
    public final C25791Hr A01;
    public final C26311Jr A02;
    public final AnonymousClass3PQ A03;
    public final C26321Js A04;
    public final C26341Ju A05;
    public final C19770wU A06;
    public final AnonymousClass1X4 A07;
    public final AnonymousClass17Z A08;
    public final C20810yC A09;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.vec_ic_action_pin_in_chat);
    }

    public static final void A00(C225314u r3, AnonymousClass2K6 r4, AnonymousClass3T1 r5) {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment = new PinInChatExpirationDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        AnonymousClass3UJ.A08(A072, r5.A1J);
        pinInChatExpirationDialogFragment.A17(A072);
        pinInChatExpirationDialogFragment.A02 = r5;
        pinInChatExpirationDialogFragment.A1i(r3.getSupportFragmentManager(), "PinInChatExpirationDialogFragment");
        r4.A03.A00(r5, 38, C39991uS.A0C.A00());
    }

    public AnonymousClass2K6(AnonymousClass17Y r2, AnonymousClass1X4 r3, C25791Hr r4, AnonymousClass17Z r5, C26311Jr r6, C20810yC r7, AnonymousClass3PQ r8, C26321Js r9, C26341Ju r10, C19770wU r11) {
        C36321k7.A1B(r7, r2, r11, r3, r9);
        AnonymousClass00C.A0D(r6, 7);
        C36321k7.A14(r8, r5, r4);
        this.A09 = r7;
        this.A00 = r2;
        this.A06 = r11;
        this.A07 = r3;
        this.A04 = r9;
        this.A05 = r10;
        this.A02 = r6;
        this.A03 = r8;
        this.A08 = r5;
        this.A01 = r4;
    }

    public boolean BBr() {
        return true;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 24;
    }
}
