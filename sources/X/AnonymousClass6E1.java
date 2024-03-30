package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.6E1  reason: invalid class name */
public final class AnonymousClass6E1 {
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E1) {
                AnonymousClass6E1 r5 = (AnonymousClass6E1) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A07, r5.A07) || this.A0B != r5.A0B || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.A07;
        int A082 = C36381kD.A08(this.A05, C36381kD.A08(this.A02, (C36381kD.A08(str, (C36391kE.A0A(this.A01) + this.A00) * 31) + C36341k9.A01(this.A0B ? 1 : 0)) * 31));
        return C36401kF.A02(this.A09, (((((((C36351kA.A05(this.A0A, A082) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A08)) * 31) + C36421kH.A05(this.A06)) * 31);
    }

    public AnonymousClass6E1(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z) {
        C36321k7.A10(str3, list);
        AnonymousClass00C.A0D(list2, 12);
        this.A01 = userJid;
        this.A00 = i;
        this.A07 = str;
        this.A0B = z;
        this.A02 = str2;
        this.A05 = str3;
        this.A0A = list;
        this.A03 = str4;
        this.A04 = str5;
        this.A08 = str6;
        this.A06 = str7;
        this.A09 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotProfile(userJid=");
        A0u.append(this.A01);
        A0u.append(", tag=");
        A0u.append(this.A00);
        A0u.append(", name=");
        A0u.append(this.A07);
        A0u.append(", isDefault=");
        A0u.append(this.A0B);
        A0u.append(", attributes=");
        A0u.append(this.A02);
        A0u.append(", category=");
        A0u.append(this.A05);
        A0u.append(", prompts=");
        A0u.append(this.A0A);
        A0u.append(", avatarUrl=");
        A0u.append(this.A03);
        A0u.append(", behaviorGraph=");
        A0u.append(this.A04);
        A0u.append(", personaId=");
        A0u.append(this.A08);
        A0u.append(", commandsDescription=");
        A0u.append(this.A06);
        A0u.append(", commands=");
        return AnonymousClass000.A0m(this.A09, A0u);
    }
}
