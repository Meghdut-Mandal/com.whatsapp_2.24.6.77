package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

/* renamed from: X.9ei  reason: invalid class name and case insensitive filesystem */
public class C199109ei {
    public AnonymousClass17Y A00;
    public C19600wD A01;
    public C20310xM A02;
    public C29221Vu A03;
    public C24601Db A04;
    public C29121Vk A05;
    public AnonymousClass1XA A06;
    public AnonymousClass1EU A07;
    public C196039Xk A08;
    public C29131Vl A09;
    public C19770wU A0A;
    public final C20810yC A0B;
    public final AE9 A0C;
    public final AnonymousClass1EV A0D;
    public final C178518gf A0E;
    public final AnonymousClass6PS A0F;
    public final C24611Dc A0G = C165607th.A0c("BrazilPaymentAccountActionsContainerPresenter", "payment-settings");
    public final C32971eV A0H;

    public C199109ei(AnonymousClass17Y r3, C19600wD r4, C20310xM r5, C20810yC r6, AE9 ae9, C29221Vu r8, C24601Db r9, C29121Vk r10, AnonymousClass1EV r11, AnonymousClass1XA r12, AnonymousClass1EU r13, C178518gf r14, AnonymousClass6PS r15, C196039Xk r16, C32971eV r17, C29131Vl r18, C19770wU r19) {
        this.A00 = r3;
        this.A0A = r19;
        this.A09 = r18;
        this.A07 = r13;
        this.A02 = r5;
        this.A04 = r9;
        this.A05 = r10;
        this.A08 = r16;
        this.A06 = r12;
        this.A01 = r4;
        this.A03 = r8;
        this.A0B = r6;
        this.A0C = ae9;
        this.A0D = r11;
        this.A0F = r15;
        this.A0H = r17;
        this.A0E = r14;
    }

    private AnonymousClass0FM A00(AnonymousClass155 r7, CharSequence charSequence, CharSequence charSequence2, int i) {
        Context applicationContext = r7.getApplicationContext();
        C39001qm A012 = AnonymousClass3LW.A01(r7, R.style.f13nameremoved);
        A012.A0p(charSequence);
        A012.A0q(charSequence2);
        A012.A0r(true);
        String string = applicationContext.getString(R.string.f12nameremoved);
        A012.A00.A0Q(new B8L(r7, i, 4), string);
        A012.A0i(new C203989pH(r7, this, i), applicationContext.getString(R.string.f12nameremoved));
        A012.A0e(new B81(r7, i, 4));
        return A012.create();
    }

    public AnonymousClass0FM A01(Bundle bundle, AnonymousClass155 r6, int i) {
        Context applicationContext = r6.getApplicationContext();
        String str = null;
        switch (i) {
            case 100:
                C39001qm A002 = AnonymousClass3LW.A00(r6);
                C39001qm.A02(applicationContext, A002, R.string.f12nameremoved);
                A002.A0i(new B85(r6, 0), applicationContext.getString(R.string.f12nameremoved));
                return A002.create();
            case 101:
                String string = r6.getString(R.string.f12nameremoved);
                if (bundle != null) {
                    string = bundle.getString("message");
                    str = bundle.getString("title");
                }
                return A00(r6, string, str, i);
            case 102:
                return A00(r6, r6.getString(R.string.f12nameremoved), r6.getString(R.string.f12nameremoved), i);
            default:
                return null;
        }
    }
}
