package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.whatsapp.R;

/* renamed from: X.3PB  reason: invalid class name */
public class AnonymousClass3PB {
    public String A00;
    public final C27671Pf A01;
    public final AnonymousClass1MK A02;
    public final AnonymousClass1V6 A03;
    public final C18820ts A04;
    public final C20600xp A05;
    public final AnonymousClass3T1 A06;
    public final C34071gP A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    private String A00(AnonymousClass3LI r4, AnonymousClass3LI r5, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C148826zU r0;
        if (this.A09) {
            return ((C47192dt) r4).A0D();
        }
        if (!z2 || (Build.VERSION.SDK_INT >= 28 && (!C27671Pf.A00(this.A01).A03.isEmpty()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r4.A07());
        if (this.A08 || z || this.A0A || equalsIgnoreCase || !z3 || z4 || (((r0 = this.A03.A00) != null && r0.A11) || this.A07.A00)) {
            return ((C47192dt) r4).A0F();
        }
        if (r5 != null) {
            return ((C47192dt) r5).A0E();
        }
        return ((C47192dt) r4).A0E();
    }

    public AnonymousClass3PB(C27671Pf r1, AnonymousClass1MK r2, AnonymousClass1V6 r3, C18820ts r4, C20600xp r5, AnonymousClass3T1 r6, C34071gP r7, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
        this.A03 = r3;
        this.A01 = r1;
        this.A0B = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A06 = r6;
        this.A09 = z4;
    }

    public C07700Yy A01(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, AnonymousClass141 r25, AnonymousClass3LF r26, AnonymousClass3LI r27, AnonymousClass3LI r28, CharSequence charSequence, CharSequence charSequence2, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        long j;
        String A0q;
        String A0w;
        String str;
        int i3 = i;
        CharSequence charSequence3 = charSequence;
        boolean A002 = this.A02.A00();
        AnonymousClass3LF r14 = r26;
        if (this.A06 != null) {
            z3 = true;
            j = System.currentTimeMillis();
        } else {
            z3 = false;
            j = r14.A00.A0I;
        }
        C07700Yy A022 = C20600xp.A02(context);
        A022.A0F(charSequence2);
        A022.A0E(charSequence3);
        A022.A0D = pendingIntent;
        Notification notification = A022.A0B;
        notification.deleteIntent = pendingIntent2;
        A022.A0L = "msg";
        A022.A09(j);
        C07700Yy A023 = C20600xp.A02(context);
        A023.A0L = "msg";
        C20600xp r8 = this.A05;
        Context context2 = r8.A08.A00;
        A023.A0F(context2.getString(R.string.f12nameremoved));
        if (i3 == 1) {
            Object[] objArr = new Object[1];
            C36331k8.A1W(objArr, i3);
            charSequence3 = this.A04.A0L(objArr, R.plurals.f10nameremoved, (long) i3);
        }
        A023.A0E(charSequence3);
        A023.A0B.icon = R.drawable.notifybar;
        A022.A0C = A023.A05();
        if (this.A0B) {
            if (this.A09) {
                str = "newsletter_key_messages";
            } else {
                str = "group_key_messages";
            }
            A022.A0N = str;
            A022.A0U = true;
        }
        notification.icon = R.drawable.notifybar;
        boolean z4 = this.A08;
        if (!z4) {
            AnonymousClass3T1 r0 = r14.A00;
            AnonymousClass171 r9 = r8.A06;
            AnonymousClass11F r12 = r0.A1J.A00;
            AnonymousClass141 r10 = r25;
            int A082 = r9.A08(r10, r12);
            if (!r10.A0G()) {
                A0w = C36391kE.A0v(context2, r9.A0R(r10, A082, false), new Object[1], 0, R.string.f12nameremoved);
            } else if (r0 instanceof AnonymousClass2bI) {
                A0w = r8.A04.A0O((AnonymousClass2bI) r0, false);
            } else {
                AnonymousClass11F A0J = r0.A0J();
                if (A0J != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(r8.A0I(A0J, r12));
                    A0u.append(" @ ");
                    A0q = AnonymousClass000.A0q(r9.A0R(r10, A082, false), A0u);
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("getNotificationTicker/missing_rmt_src:");
                    C36321k7.A1Z(A0u2, C66013Ui.A0F(r0));
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    C36351kA.A14(context2, A0u3, R.string.f12nameremoved);
                    A0u3.append(" @ ");
                    A0q = AnonymousClass000.A0q(r9.A0R(r10, A082, false), A0u3);
                }
                A0w = C36351kA.A0w(context2, A0q, 1, R.string.f12nameremoved);
            }
            A022.A0G(AnonymousClass3TB.A02(A0w));
        }
        String A062 = r14.A06();
        if (A062 != null) {
            A022.A0H(A062);
        }
        AnonymousClass3LI r16 = r27;
        boolean z5 = z;
        if (!z2 && !z4 && !z && !this.A0A && z3) {
            A022.A09 = C36431kI.A1Q(r16.A0C() ? 1 : 0) ? 1 : 0;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String A003 = A00(r16, r28, z5, A002, z3);
            this.A00 = A003;
            C18740tg.A06(A003);
            A022.A0M = A003;
            A022.A07 = 1;
            A022.A08 = i + i2;
            StringBuilder sb2 = sb;
            sb2.append(" channelId=");
            sb2.append(A003);
        }
        return A022;
    }
}
