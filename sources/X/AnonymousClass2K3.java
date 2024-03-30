package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2K3  reason: invalid class name */
public final class AnonymousClass2K3 extends C70693fZ {
    public final AnonymousClass1X4 A00;
    public final C25791Hr A01;
    public final C26321Js A02;
    public final C19970wo A03;
    public final AnonymousClass3PQ A04;
    public final C19770wU A05;

    public final boolean A02(C225314u r12, AnonymousClass3T1 r13, int i) {
        C51782oN r0;
        C39001qm r1;
        int i2;
        long j;
        AnonymousClass3T1 r7 = r13;
        boolean A1a = C36341k9.A1a(r13, r12);
        C26321Js r2 = this.A02;
        C51322nd r14 = C51322nd.UNPIN;
        if (!r2.A01.A09()) {
            r0 = C51782oN.NO_CONNECTION_ERROR;
        } else if (!C26321Js.A00(r14, r2, r13)) {
            r0 = C51782oN.OTHER_ERROR;
        } else {
            r0 = C51782oN.SUCCESS;
        }
        int ordinal = r0.ordinal();
        if (ordinal == A1a) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with no connection.");
            r1 = AnonymousClass3LW.A00(r12);
            i2 = R.string.f12nameremoved;
            r1.A0c(i2);
            r1.A0m(r12, (AnonymousClass04S) null, R.string.f12nameremoved);
            C36341k9.A11(r1);
        } else if (ordinal == 3) {
            Log.w("UnpinInChatSelectionAction/execute Cannot unpin message with other error.");
            r1 = AnonymousClass3LW.A00(r12);
            i2 = R.string.f12nameremoved;
            r1.A0c(i2);
            r1.A0m(r12, (AnonymousClass04S) null, R.string.f12nameremoved);
            C36341k9.A11(r1);
        } else if (ordinal == 0) {
            C80283v9.A00(this.A05, this, r13, 25);
            AnonymousClass5J2 r22 = r13.A1V;
            if (r22 == null) {
                return true;
            }
            AnonymousClass3PQ r6 = this.A04;
            C19970wo r15 = this.A03;
            if (!r22.A1f(r15)) {
                j = C36391kE.A0B(r22.A00 - C19970wo.A00(r15));
            } else {
                j = 0;
            }
            r6.A02.execute(new C81233wg(r6, r7, i, j));
            return true;
        } else if (ordinal == 2) {
            Log.e("UnpinInChatSelectionAction/execute Unreacheable/impossible states for unpin.");
        } else {
            throw C36441kJ.A18();
        }
        return false;
    }

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.vec_ic_action_unpin_in_chat);
    }

    public AnonymousClass2K3(AnonymousClass1X4 r2, C25791Hr r3, C19970wo r4, AnonymousClass3PQ r5, C26321Js r6, C19770wU r7) {
        C36321k7.A1B(r4, r2, r6, r7, r3);
        AnonymousClass00C.A0D(r5, 6);
        this.A03 = r4;
        this.A00 = r2;
        this.A02 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r5;
    }

    public boolean BBr() {
        return true;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 25;
    }
}
