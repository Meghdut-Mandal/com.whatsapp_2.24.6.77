package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6VT  reason: invalid class name */
public class AnonymousClass6VT {
    public AnonymousClass6BX A00;
    public final int A01;
    public final C001700s A02;
    public final C001700s A03;
    public final C001700s A04;
    public final C001700s A05;
    public final C001700s A06 = C36441kJ.A0Z(C36381kD.A0m());
    public final C001700s A07;
    public final AnonymousClass185 A08;
    public final C235618y A09;
    public final C20810yC A0A;
    public final C132366Tg A0B;
    public final C25491Gn A0C;
    public final List A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static int A00(AnonymousClass6VT r5) {
        int A002;
        C001700s r4 = r5.A02;
        Iterator it = C36401kF.A0w(r4).iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if ((A0a instanceof UserJid) && r5.A08.A04((UserJid) A0a)) {
                return 0;
            }
        }
        int i = r5.A01;
        if (i == 35 || i == 38 || i == 37 || AnonymousClass143.A0N((Collection) r4.A04()) || AnonymousClass143.A0L((Collection) r4.A04())) {
            return 0;
        }
        C001700s r2 = r5.A04;
        if (C36401kF.A00(r2) != 1) {
            return 0;
        }
        if ((0 < C36401kF.A00(r2) && ((A002 = C132366Tg.A00((Uri) C36401kF.A0w(r2).get(0), r5)) == 13 || A002 == 29)) || i == 40) {
            return 0;
        }
        Iterator it2 = C36401kF.A0w(r4).iterator();
        while (it2.hasNext()) {
            AnonymousClass11F A0a2 = C36401kF.A0a(it2);
            if (A0a2 instanceof UserJid) {
                C235618y r0 = r5.A09;
                UserJid userJid = (UserJid) A0a2;
                if (userJid != null && r0.A00(userJid)) {
                    return 0;
                }
            }
        }
        if (r5.A0A.A0E(3953)) {
            for (Jid A0H2 : C36401kF.A0w(r4)) {
                if (AnonymousClass143.A0H(A0H2)) {
                    return 0;
                }
            }
        }
        if (!(!r5.A0B.A03((Uri) C36391kE.A0t(C36401kF.A0w(r2))).A0K())) {
            return 1;
        }
        Number A0z = C36441kJ.A0z(r5.A07);
        if (A0z == null || A0z.intValue() != 3) {
            return 2;
        }
        return 3;
    }

    public static AnonymousClass3XT A01(MediaComposerActivity mediaComposerActivity) {
        return (AnonymousClass3XT) mediaComposerActivity.A0s.A05.A04();
    }

    public static Collection A02(MediaComposerActivity mediaComposerActivity) {
        return (Collection) mediaComposerActivity.A0s.A02.A04();
    }

    public static List A03(MediaComposerActivity mediaComposerActivity) {
        return (List) mediaComposerActivity.A0s.A04.A04();
    }

    public static void A04(AnonymousClass6VT r3) {
        int A072;
        C001700s r1 = r3.A04;
        List list = r3.A0E;
        r1.A0C(Collections.unmodifiableList(list));
        if (list.isEmpty()) {
            A072 = -1;
        } else {
            if (C36341k9.A07(r3.A03) >= list.size()) {
                A072 = C36431kI.A07(list);
            }
            A05(r3, A00(r3));
        }
        r3.A09(A072);
        A05(r3, A00(r3));
    }

    public static void A05(AnonymousClass6VT r1, int i) {
        C001700s r12 = r1.A07;
        if (i != C36341k9.A07(r12)) {
            C36341k9.A16(r12, i);
        }
    }

    public int A06() {
        if (C111075bh.A00(this.A01)) {
            return 19;
        }
        Uri A082 = A08();
        if (A082 != null && C132366Tg.A00(A082, this) == 3) {
            return 11;
        }
        Uri A083 = A08();
        if (A083 == null || C132366Tg.A00(A083, this) != 1) {
            return 12;
        }
        return 9;
    }

    public int A07() {
        int i;
        if ((this.A0J && C36401kF.A0w(this.A02).isEmpty()) || !this.A0H || (i = this.A01) == 35 || i == 38 || i == 37 || i == 40) {
            return 1;
        }
        return 0;
    }

    public Uri A08() {
        int A072 = C36341k9.A07(this.A03);
        if (A072 < 0) {
            return null;
        }
        List list = this.A0E;
        if (A072 < list.size()) {
            return (Uri) list.get(A072);
        }
        return null;
    }

    public void A09(int i) {
        C001700s r1 = this.A03;
        if (C36341k9.A07(r1) != i) {
            C36341k9.A16(r1, i);
            A0A(0);
        }
    }

    public void A0A(int i) {
        C001700s r1 = this.A06;
        if (i != C36341k9.A07(r1)) {
            C36341k9.A16(r1, i);
        }
    }

    public boolean A0C() {
        C001700s r2 = this.A04;
        if (C36401kF.A00(r2) > 1 || (this.A0L && C36401kF.A00(r2) == 1)) {
            return true;
        }
        return false;
    }

    public AnonymousClass6VT(AnonymousClass185 r3, C235618y r4, AnonymousClass3XT r5, C20810yC r6, C132366Tg r7, C25491Gn r8, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C001700s r1;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0E = A0I2;
        this.A0C = r8;
        this.A0B = r7;
        this.A09 = r4;
        this.A0A = r6;
        this.A08 = r3;
        this.A01 = i3;
        A0I2.addAll(list);
        this.A04 = C36441kJ.A0Z(Collections.unmodifiableList(A0I2));
        this.A03 = C36441kJ.A0Z(Integer.valueOf(i));
        this.A02 = C36441kJ.A0Z(Collections.unmodifiableList(list2));
        this.A0D = Collections.unmodifiableList(list2);
        if (i2 != -1) {
            r1 = C36441kJ.A0Z(Integer.valueOf(i2));
        } else {
            r1 = new AnonymousClass08S();
        }
        this.A07 = r1;
        this.A0H = z2;
        this.A0G = z3;
        C36341k9.A16(r1, A00(this));
        this.A0J = z;
        this.A05 = C36441kJ.A0Z(r5);
        this.A0L = z4;
        this.A0I = z5;
        this.A0F = z6;
        this.A0K = z7;
    }

    public boolean A0B() {
        Uri A082 = A08();
        if (A082 == null || C132366Tg.A00(A082, this) != 1 || C111075bh.A00(this.A01) || this.A0K) {
            return false;
        }
        return true;
    }
}
