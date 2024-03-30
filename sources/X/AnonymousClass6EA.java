package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6EA  reason: invalid class name */
public final class AnonymousClass6EA {
    public long A00 = 1;
    public boolean A01;
    public final int A02;
    public final AnonymousClass6BP A03;
    public final Jid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EA) {
                AnonymousClass6EA r8 = (AnonymousClass6EA) obj;
                if (this.A00 != r8.A00 || this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A0B, r8.A0B) || !AnonymousClass00C.A0J(this.A0C, r8.A0C) || !AnonymousClass00C.A0J(this.A09, r8.A09) || this.A0D != r8.A0D || !AnonymousClass00C.A0J(this.A0A, r8.A0A) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6EA(AnonymousClass6BP r3, Jid jid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2) {
        this.A02 = i;
        this.A04 = jid;
        this.A07 = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A0D = z;
        this.A0A = str5;
        this.A01 = z2;
        this.A08 = str6;
        this.A06 = str7;
        this.A05 = str8;
        this.A03 = r3;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A0B, C36381kD.A08(this.A07, C36351kA.A05(this.A04, (C90464aC.A08(this.A00) + this.A02) * 31)));
        return ((((((((C36381kD.A08(this.A0A, (((C36381kD.A08(this.A0C, A082) + C36341k9.A09(this.A09)) * 31) + C36341k9.A01(this.A0D ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A05)) * 31) + C36411kG.A09(this.A03);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsScreenProgressReportMetadata(sequenceNumber=");
        A0u.append(this.A00);
        A0u.append(", bizPlatform=");
        A0u.append(this.A02);
        A0u.append(", businessOwnerJid=");
        A0u.append(this.A04);
        A0u.append(", flowId=");
        A0u.append(this.A07);
        A0u.append(", messageId=");
        A0u.append(this.A0B);
        A0u.append(", sessionId=");
        A0u.append(this.A0C);
        A0u.append(", flowsCategories=");
        A0u.append(this.A09);
        A0u.append(", isTemplate=");
        A0u.append(this.A0D);
        A0u.append(", hsmTag=");
        A0u.append(this.A0A);
        A0u.append(", flowRestoredFromCache=");
        A0u.append(this.A01);
        A0u.append(", flowStatus=");
        A0u.append(this.A08);
        A0u.append(", entryPointConversionSource=");
        A0u.append(this.A06);
        A0u.append(", entryPointConversionApp=");
        A0u.append(this.A05);
        A0u.append(", entryPointMetaData=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
