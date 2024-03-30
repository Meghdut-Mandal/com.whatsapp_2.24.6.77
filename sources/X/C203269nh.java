package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9nh  reason: invalid class name and case insensitive filesystem */
public class C203269nh {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1X4 A01;
    public final C20810yC A02;
    public final C29121Vk A03;
    public final C29551Xb A04;
    public final AnonymousClass1A1 A05;
    public final C19770wU A06;

    public static boolean A03(C122725vK r3, C203269nh r4) {
        int i;
        if (!r4.A02.A0E(1084) || (i = r3.A00) == 7 || i == 1) {
            return false;
        }
        return true;
    }

    public void A04(Context context, AnonymousClass16X r27, C135106c9 r28, AnonymousClass11F r29, UserJid userJid, C122725vK r31, B6K b6k, String str, List list, long j) {
        B6K b6k2 = b6k;
        UserJid userJid2 = userJid;
        b6k2.Bnv();
        C122725vK r3 = r31;
        Context context2 = context;
        if (r3.A01 != 5) {
            if (!this.A02.A0E(1084) || r3.A00 != 5) {
                int i = r3.A01;
                AnonymousClass16X r5 = r27;
                AnonymousClass11F r7 = r29;
                String str2 = str;
                List list2 = list;
                long j2 = j;
                if (i == 1 || i == 6 || !A03(r3, this)) {
                    int i2 = r3.A01;
                    C135106c9 r6 = r28;
                    if (i2 != 1 && i2 != 6) {
                        A02(context2, new C204049pN(r5, r6, r7, userJid2, b6k2, this, str2, list2, j2), new B85(b6k2, 7));
                        return;
                    } else if (A03(r3, this)) {
                        A00(context2, new C204029pL(r5, r7, userJid2, r3, b6k2, this), new B85(b6k2, 8));
                        return;
                    } else {
                        C46962bx r13 = r3.A03;
                        C18740tg.A06(r13);
                        C29121Vk r1 = this.A03;
                        if (!AnonymousClass143.A0G(r7)) {
                            userJid2 = C36401kF.A0b(r7);
                        }
                        r1.A0L(r5, r6, userJid2, r13);
                        this.A00.A0H(new AnonymousClass73N(this, r13, r3, b6k2, 6));
                        return;
                    }
                } else {
                    A01(context2, new C204039pM(r5, r7, userJid2, b6k2, this, str2, list2, j2), new B85(b6k2, 9));
                    return;
                }
            }
        }
        C39001qm A002 = AnonymousClass3LW.A00(context2);
        boolean A022 = C19600wD.A02(context2);
        int i3 = R.string.f12nameremoved;
        if (A022) {
            i3 = R.string.f12nameremoved;
        }
        A002.A0c(i3);
        C165587tf.A17(A002);
        C36341k9.A11(A002);
    }

    public C203269nh(AnonymousClass17Y r1, AnonymousClass1X4 r2, C20810yC r3, C29121Vk r4, C29551Xb r5, AnonymousClass1A1 r6, C19770wU r7) {
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(onClickListener, R.string.f12nameremoved);
        A002.A0f(onClickListener2, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public static void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(onClickListener, R.string.f12nameremoved);
        A002.A0f(onClickListener2, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public static void A02(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(onClickListener, R.string.f12nameremoved);
        A002.A0f(onClickListener2, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }
}
