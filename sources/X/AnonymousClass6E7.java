package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.6E7  reason: invalid class name */
public final class AnonymousClass6E7 {
    public String A00 = null;
    public final long A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Map A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass6E7(UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, long j, boolean z, boolean z2) {
        AnonymousClass00C.A0D(str3, 5);
        this.A02 = userJid;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A01 = j;
        this.A09 = str5;
        this.A0C = z;
        this.A0B = z2;
        this.A03 = str6;
        this.A04 = str7;
        this.A0A = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E7) {
                AnonymousClass6E7 r8 = (AnonymousClass6E7) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !"galaxy_message".equals("galaxy_message") || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A08, r8.A08) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A09, r8.A09) || !AnonymousClass00C.A0J(this.A00, r8.A00) || this.A0C != r8.A0C || this.A0B != r8.A0B || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A0A, r8.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A06, C36391kE.A0A(this.A02));
        int A083 = C36381kD.A08(this.A08, C36381kD.A08(this.A07, (C36381kD.A08(this.A05, A082) + 1169897944) * 31));
        String str = this.A09;
        return ((C36381kD.A08(this.A03, (((((C36381kD.A08(str, (C36321k7.A00(this.A01, A083) - 1809421292) * 31) + C36341k9.A09(this.A00)) * 31) + C36341k9.A01(this.A0C ? 1 : 0)) * 31) + C36341k9.A01(this.A0B ? 1 : 0)) * 31) + C36341k9.A09(this.A04)) * 31) + C36411kG.A09(this.A0A);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExtensionsContextParams(bizJid=");
        A0u.append(this.A02);
        A0u.append(", flowMessageVersion=");
        A0u.append(this.A06);
        A0u.append(", flowId=");
        A0u.append(this.A05);
        A0u.append(", actionName=");
        A0u.append("galaxy_message");
        A0u.append(", flowToken=");
        A0u.append(this.A07);
        A0u.append(", messageId=");
        A0u.append(this.A08);
        A0u.append(", messageRowId=");
        A0u.append(this.A01);
        A0u.append(", referral=");
        A0u.append(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        A0u.append(", sessionId=");
        A0u.append(this.A09);
        A0u.append(", dataApiVersion=");
        A0u.append(this.A00);
        A0u.append(", isResumableFlow=");
        A0u.append(this.A0C);
        A0u.append(", isDraft=");
        A0u.append(this.A0B);
        A0u.append(", externalObserverId=");
        A0u.append(this.A03);
        A0u.append(", flowAction=");
        A0u.append(this.A04);
        A0u.append(", flowActionPayload=");
        return AnonymousClass000.A0m(this.A0A, A0u);
    }
}
