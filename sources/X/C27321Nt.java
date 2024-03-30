package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Nt  reason: invalid class name and case insensitive filesystem */
public class C27321Nt {
    public final AnonymousClass17X A00;
    public final C238019x A01;

    public C181758nz A00(AnonymousClass147 r10, AnonymousClass3G4 r11, AnonymousClass3G4 r12, long j) {
        C238019x r2;
        int i;
        if (r12 != null) {
            AnonymousClass147 r4 = r10;
            if (this.A00.A0D(r10)) {
                if (r11 == null) {
                    r11 = new AnonymousClass3G4(0, 0);
                }
                int i2 = r11.A00;
                if (i2 == 0) {
                    if (r12.A00 == 1) {
                        r2 = this.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SystemMessageFactory/newInviteViaLinkUnavailableSystemMessage/gjid=");
                        sb.append(r10);
                        Log.i(sb.toString());
                        i = 73;
                    }
                } else if (i2 == 1 && r12.A00 == 0) {
                    r2 = this.A01;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SystemMessageFactory/newInviteViaLinkAvailableAgainSystemMessage/gjid=");
                    sb2.append(r10);
                    Log.i(sb2.toString());
                    i = 74;
                }
                return r2.A04((AnonymousClass6X6) null, r4, (C207209uj) null, i, j);
            }
        }
        return null;
    }

    public C27321Nt(AnonymousClass17X r1, C238019x r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
