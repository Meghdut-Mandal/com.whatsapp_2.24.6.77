package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1ZU  reason: invalid class name */
public final class AnonymousClass1ZU {
    public AnonymousClass9WC A00;
    public boolean A01;
    public final C19730wQ A02;
    public final AnonymousClass1Pp A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass16I A05;
    public final C36001jb A06 = new C36001jb(this, 4);
    public final AnonymousClass171 A07;
    public final C27731Pn A08;
    public final C19630wG A09;
    public final C19970wo A0A;
    public final C25271Fq A0B;
    public final C26141Ja A0C;
    public final AnonymousClass190 A0D;

    public AnonymousClass1ZU(C19730wQ r3, AnonymousClass1Pp r4, AnonymousClass16D r5, AnonymousClass16I r6, AnonymousClass171 r7, C27731Pn r8, C19970wo r9, C19630wG r10, C25271Fq r11, C26141Ja r12, AnonymousClass190 r13) {
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass00C.A0D(r10, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r4, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r12, 8);
        AnonymousClass00C.A0D(r8, 9);
        AnonymousClass00C.A0D(r11, 10);
        AnonymousClass00C.A0D(r13, 11);
        this.A0A = r9;
        this.A09 = r10;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A0C = r12;
        this.A08 = r8;
        this.A0B = r11;
        this.A0D = r13;
    }

    public final void A01(Context context, C65073Qp r16, C28981Uw r17, String str, int i) {
        C65073Qp r3 = r16;
        AnonymousClass00C.A0D(r3, 2);
        String str2 = str;
        AnonymousClass00C.A0D(str2, 3);
        String string = context.getString(R.string.f12nameremoved, new Object[]{r3.A08()});
        AnonymousClass00C.A08(string);
        C28981Uw r9 = r17;
        Intent A0n = AnonymousClass190.A0n(context, r9, (Long) null, 0, 0, false);
        A0n.addFlags(335544320);
        PendingIntent A002 = C65743Th.A00(context, 0, A0n, 134217728);
        C07700Yy A022 = C20600xp.A02(context);
        A022.A0M = "other_notifications@1";
        A022.A0G(str2);
        A022.A09(System.currentTimeMillis());
        A022.A06(3);
        A022.A0I(true);
        A022.A0D = A002;
        A022.A0F(string);
        A022.A0E(str2);
        A022.A0B.icon = R.drawable.notifybar;
        AnonymousClass141 A0D2 = this.A04.A0D(r9);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        Bitmap A023 = this.A08.A02(context, A0D2, dimensionPixelSize, dimensionPixelSize);
        if (A023 == null) {
            A023 = this.A03.A04(A0D2, this.A09.A00.getResources().getDimension(R.dimen.f7nameremoved), dimensionPixelSize);
            AnonymousClass00C.A08(A023);
        }
        A022.A0A(A023);
        C25271Fq r32 = this.A0B;
        StringBuilder sb = new StringBuilder();
        sb.append(r9);
        sb.append('-');
        sb.append(System.currentTimeMillis());
        r32.A07(sb.toString(), i, A022.A05());
        this.A05.unregisterObserver(this.A06);
        this.A01 = false;
    }

    public final void A02(C52382pL r12, C28981Uw r13, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, C187858ye r16) {
        AnonymousClass141 r3;
        int i;
        int i2;
        Context context = this.A09.A00;
        AnonymousClass00C.A08(context);
        String str = "";
        C28981Uw r8 = r13;
        C65073Qp r7 = (C65073Qp) this.A0C.A06(r13, str).first;
        if (r16.ordinal() == 0) {
            if (r12 != null) {
                int ordinal = r12.ordinal();
                if (ordinal == 2) {
                    r3 = this.A04.A0D(phoneUserJid);
                    i = R.string.f12nameremoved;
                } else if (ordinal == 3) {
                    if (phoneUserJid2 != null) {
                        r3 = this.A04.A0D(phoneUserJid2);
                        i = R.string.f12nameremoved;
                    } else {
                        i2 = R.string.f12nameremoved;
                    }
                }
                str = context.getString(i, new Object[]{this.A07.A0M(r3)});
            }
            AnonymousClass00C.A0B(str);
            A01(context, r7, r8, str, 83);
        } else if (this.A02.A0M(phoneUserJid)) {
            i2 = R.string.f12nameremoved;
        } else {
            r3 = this.A04.A0D(phoneUserJid);
            i = R.string.f12nameremoved;
            str = context.getString(i, new Object[]{this.A07.A0M(r3)});
            AnonymousClass00C.A0B(str);
            A01(context, r7, r8, str, 83);
        }
        str = context.getString(i2);
        AnonymousClass00C.A0B(str);
        A01(context, r7, r8, str, 83);
    }

    private final String A00(Context context, C44072La r8, UserJid userJid, C188118z4 r10, boolean z) {
        String str;
        int i;
        int i2;
        String A0M = this.A07.A0M(this.A04.A0D(userJid));
        int ordinal = r10.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        String string = context.getString(R.string.f12nameremoved, new Object[]{A0M});
                        AnonymousClass00C.A08(string);
                        return string;
                    }
                    throw new C13180jS();
                } else if (z) {
                    i = R.string.f12nameremoved;
                } else {
                    i2 = R.string.f12nameremoved;
                }
            } else if (z) {
                i = R.string.f12nameremoved;
            } else {
                i2 = R.string.f12nameremoved;
            }
            str = context.getString(i2, new Object[]{A0M});
            AnonymousClass00C.A0B(str);
            return str;
        } else if (z) {
            i = R.string.f12nameremoved;
        } else {
            str = context.getString(R.string.f12nameremoved, new Object[]{A0M, r8.A0K});
            AnonymousClass00C.A0B(str);
            return str;
        }
        str = context.getString(i);
        AnonymousClass00C.A0B(str);
        return str;
    }

    public final void A03(C28981Uw r17, PhoneUserJid phoneUserJid, List list) {
        String string;
        Context context = this.A09.A00;
        AnonymousClass00C.A08(context);
        C28981Uw r13 = r17;
        C65073Qp r12 = (C65073Qp) this.A0C.A06(r13, "").first;
        AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        C44072La r8 = (C44072La) r12;
        List list2 = list;
        PhoneUserJid phoneUserJid2 = phoneUserJid;
        if (list2.size() == 1) {
            string = A00(context, r8, phoneUserJid2, (C188118z4) C007103b.A0L(list2), false);
        } else {
            String A0M = this.A07.A0M(this.A04.A0D(phoneUserJid2));
            if (list2.size() == 3) {
                string = context.getString(R.string.f12nameremoved, new Object[]{A0M});
            } else {
                string = context.getString(R.string.f12nameremoved, new Object[]{A0M, A00(context, r8, phoneUserJid2, (C188118z4) C007103b.A0L(list2), true), A00(context, r8, phoneUserJid2, (C188118z4) list2.get(1), true)});
            }
            AnonymousClass00C.A08(string);
        }
        A01(context, r12, r13, string, 86);
    }
}
