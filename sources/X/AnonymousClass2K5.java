package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2K5  reason: invalid class name */
public final class AnonymousClass2K5 extends C70693fZ {
    public final C19460v5 A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass185 A03;
    public final C235618y A04;
    public final C19970wo A05;
    public final C220412q A06;
    public final AnonymousClass17X A07;
    public final C20810yC A08;
    public final C20500xf A09;
    public final AnonymousClass1GQ A0A;
    public final AnonymousClass1E9 A0B;
    public final AnonymousClass1EM A0C;
    public final C24801Dv A0D;

    public final boolean A02(C70803fk r7, AnonymousClass3T1 r8) {
        AnonymousClass00C.A0D(r8, 0);
        r7.A1o();
        r7.A4B.clearFocus();
        r7.A1n();
        AnonymousClass155 A0B2 = C70803fk.A0B(r7);
        AnonymousClass00C.A08(A0B2);
        C24801Dv r3 = this.A0D;
        Intent className = C36431kI.A0D().setClassName(A0B2.getPackageName(), "com.whatsapp.conversation.EditMessageActivity");
        AnonymousClass3UJ.A00(className, r8.A1J);
        r3.A09(A0B2, className, 905);
        return true;
    }

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_edit);
    }

    public AnonymousClass2K5(C19460v5 r2, C24801Dv r3, C19730wQ r4, AnonymousClass16D r5, AnonymousClass185 r6, C235618y r7, C19970wo r8, C220412q r9, AnonymousClass17X r10, C20810yC r11, C20500xf r12, AnonymousClass1GQ r13, AnonymousClass1E9 r14, AnonymousClass1EM r15) {
        C36321k7.A1B(r8, r11, r4, r9, r12);
        C36321k7.A1C(r3, r5, r15, r13, r7);
        AnonymousClass00C.A0D(r14, 12);
        AnonymousClass00C.A0D(r6, 13);
        AnonymousClass00C.A0D(r10, 14);
        this.A05 = r8;
        this.A08 = r11;
        this.A01 = r4;
        this.A06 = r9;
        this.A09 = r12;
        this.A0D = r3;
        this.A02 = r5;
        this.A0C = r15;
        this.A0A = r13;
        this.A04 = r7;
        this.A00 = r2;
        this.A0B = r14;
        this.A03 = r6;
        this.A07 = r10;
    }

    public boolean BBr() {
        return true;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 9;
    }
}
