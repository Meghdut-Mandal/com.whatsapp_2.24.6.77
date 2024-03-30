package X;

import java.util.List;

/* renamed from: X.6E0  reason: invalid class name */
public final class AnonymousClass6E0 {
    public final int A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E0) {
                AnonymousClass6E0 r5 = (AnonymousClass6E0) obj;
                if (this.A0A != r5.A0A || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.A09;
        return C36401kF.A02(this.A08, (((((C36351kA.A05(list, ((((((((((C36341k9.A01(this.A0A ? 1 : 0) * 31) + this.A00) * 31) + C36341k9.A09(this.A06)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A07)) * 31) + C36421kH.A05(this.A05)) * 31);
    }

    public AnonymousClass6E0(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, boolean z) {
        this.A0A = z;
        this.A00 = i;
        this.A06 = str;
        this.A01 = bool;
        this.A02 = str2;
        this.A04 = str3;
        this.A09 = list;
        this.A03 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A08 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UsyncBotResponseData(tagMatch=");
        A0u.append(this.A0A);
        A0u.append(", tag=");
        A0u.append(this.A00);
        A0u.append(", name=");
        A0u.append(this.A06);
        A0u.append(", isDefault=");
        A0u.append(this.A01);
        A0u.append(", attributes=");
        A0u.append(this.A02);
        A0u.append(", category=");
        A0u.append(this.A04);
        A0u.append(", prompts=");
        A0u.append(this.A09);
        A0u.append(", behaviorGraph=");
        A0u.append(this.A03);
        A0u.append(", personaId=");
        A0u.append(this.A07);
        A0u.append(", commandsDescription=");
        A0u.append(this.A05);
        A0u.append(", commands=");
        return AnonymousClass000.A0m(this.A08, A0u);
    }
}
