package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3ST  reason: invalid class name */
public abstract class AnonymousClass3ST {
    public static View.OnClickListener A00(Context context, C19730wQ r8, AnonymousClass2XH r9, C46902br r10, boolean z) {
        C46902br r3 = r10;
        UserJid A0L = r10.A0L();
        boolean z2 = r10.A1J.A02;
        UserJid userJid = A0L;
        if (z2) {
            userJid = null;
        }
        C19730wQ r4 = r8;
        Context context2 = context;
        if (r8.A0L()) {
            return new C66953Xy(context, 41);
        }
        AnonymousClass2XH r5 = r9;
        if (z) {
            return new C48862iB(context, r9, r3, userJid, 1);
        }
        return new C48872iC(context2, r3, r4, r5, A0L, 1);
    }

    public static String A01(Context context, C19730wQ r13, C19970wo r14, C18820ts r15, AnonymousClass1P5 r16, C46902br r17, boolean z) {
        int i;
        long A0I;
        if (r13.A0L()) {
            i = R.string.f12nameremoved;
        } else if (z) {
            C46902br r4 = r17;
            long j = r4.A0I + ((long) (r4.A00 * 1000));
            AnonymousClass1P5 r1 = r16;
            if (r4.A1J.A02) {
                A0I = r1.A0J(r4);
            } else {
                A0I = r1.A0I(r4);
            }
            long A08 = r14.A08(A0I);
            Object[] objArr = new Object[1];
            if (A0I > C19970wo.A00(r14)) {
                return AnonymousClass3UM.A01(r15, C36391kE.A0v(context, AnonymousClass3UM.A00(r15, A08), objArr, 0, R.string.f12nameremoved), A08);
            }
            return AnonymousClass3UM.A01(r15, C36391kE.A0v(context, AnonymousClass3UM.A00(r15, j), objArr, 0, R.string.f12nameremoved), j);
        } else {
            i = R.string.f12nameremoved;
        }
        return context.getString(i);
    }

    public static boolean A02(C19970wo r6, C46902br r7, long j) {
        long A00 = C19970wo.A00(r6);
        long A07 = r7.A0I + C36371kC.A07(r7.A00);
        if (!r7.A1J.A02) {
            if (j <= A00) {
                return false;
            }
            return true;
        } else if ((j != -1 || A07 <= A00) && j <= A00) {
            return false;
        } else {
            return true;
        }
    }
}
