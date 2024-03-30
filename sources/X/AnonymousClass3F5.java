package X;

import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3F5  reason: invalid class name */
public class AnonymousClass3F5 {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C20810yC A06;
    public final UserJid A07;
    public final String A08;

    public static BlockConfirmationDialogFragment A00(AnonymousClass3F5 r8) {
        UserJid userJid = r8.A07;
        boolean z = r8.A02;
        boolean z2 = r8.A05;
        boolean z3 = r8.A04;
        int i = r8.A01;
        return BlockConfirmationDialogFragment.A03(userJid, r8.A08, r8.A00, i, z, r8.A03, z3, z2);
    }

    @Deprecated
    public void A01(int i, int i2) {
        if (!C36421kH.A1Z(this.A06)) {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public AnonymousClass3F5(C20810yC r2, UserJid userJid, String str) {
        this.A06 = r2;
        this.A07 = userJid;
        this.A08 = str;
        boolean A0E = r2.A0E(6185);
        this.A04 = A0E;
        this.A03 = A0E;
    }
}
