package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9gJ  reason: invalid class name and case insensitive filesystem */
public final class C199949gJ {
    public final int A00;
    public final C202319lY A01;
    public final UserJid A02;
    public final C207059uU A03;
    public final C188008yt A04;
    public final AnonymousClass2bZ A05;
    public final Boolean A06;
    public final List A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199949gJ) {
                C199949gJ r5 = (C199949gJ) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.A00 * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + C36411kG.A09(this.A07);
    }

    public C199949gJ(C202319lY r1, UserJid userJid, C207059uU r3, C188008yt r4, AnonymousClass2bZ r5, Boolean bool, List list, int i) {
        this.A00 = i;
        this.A06 = bool;
        this.A03 = r3;
        this.A05 = r5;
        this.A01 = r1;
        this.A02 = userJid;
        this.A04 = r4;
        this.A07 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CheckoutData(triggerEntryPoint=");
        A0u.append(this.A00);
        A0u.append(", shouldShowShimmer=");
        A0u.append(this.A06);
        A0u.append(", error=");
        A0u.append(this.A03);
        A0u.append(", orderMessage=");
        A0u.append(this.A05);
        A0u.append(", paymentTransactionInfo=");
        A0u.append(this.A01);
        A0u.append(", merchantJid=");
        A0u.append(this.A02);
        A0u.append(", merchantPaymentAccountStatus=");
        A0u.append(this.A04);
        A0u.append(", installmentOptions=");
        return AnonymousClass000.A0m(this.A07, A0u);
    }

    public C199949gJ() {
        this((C202319lY) null, (UserJid) null, (C207059uU) null, C188008yt.NONE, (AnonymousClass2bZ) null, (Boolean) null, (List) null, 0);
    }
}
