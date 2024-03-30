package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Cw  reason: invalid class name and case insensitive filesystem */
public class C24551Cw {
    public final C220412q A00;

    public boolean A00(AnonymousClass3T1 r7) {
        try {
            if (!(r7 instanceof C181758nz)) {
                return false;
            }
            C181758nz r3 = (C181758nz) r7;
            C207209uj r0 = r3.A03;
            if (r0 != null) {
                C220412q r4 = this.A00;
                AnonymousClass11F A002 = AnonymousClass143.A00(r0.A02);
                AnonymousClass6SZ r02 = GroupJid.Companion;
                if (r4.A05(AnonymousClass6SZ.A00(A002)) == 1) {
                    return false;
                }
            }
            int i = r3.A00;
            if (i == 4) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 12) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 127) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 90) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 106) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 124) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 144) {
                if (r3.A00 != 1) {
                    return false;
                }
            } else if (i == 143) {
                if (!"sub_group_suggestion_approved".equals(((C181358nL) r3).A01)) {
                    return false;
                }
            } else if (i == 149) {
                if (r3.A00 != 1) {
                    return false;
                }
                String A0b = r3.A0b();
                if (A0b != null) {
                    if (A0b.equals("invite") || A0b.equals("linked_group_join")) {
                        return false;
                    }
                }
            } else if (i != 145) {
                return false;
            } else {
                C220412q r2 = this.A00;
                AnonymousClass11F r1 = r3.A1J.A00;
                AnonymousClass6SZ r03 = GroupJid.Companion;
                if (r2.A05(AnonymousClass6SZ.A00(r1)) == 3) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("GroupMessageUtils/importantmsg/null ");
            sb.append(C66013Ui.A0F(r7));
            Log.e(sb.toString(), e);
            throw e;
        }
    }

    public C24551Cw(C220412q r1) {
        this.A00 = r1;
    }
}
