package X;

import java.util.TimerTask;

/* renamed from: X.3yW  reason: invalid class name and case insensitive filesystem */
public class C82323yW extends TimerTask {
    public C64503Og A00;

    public void run() {
        C20350xQ r2;
        int i;
        C64503Og r3 = this.A00;
        if (r3 instanceof AnonymousClass23C) {
            AnonymousClass23C r32 = (AnonymousClass23C) r3;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("groupmgr/group_request/timeout/type:");
            C36321k7.A1Y(A0u, r32.A00);
            r32.A00 = true;
            r32.A02.A04(r32.A01, false);
            return;
        }
        AnonymousClass23D r33 = (AnonymousClass23D) r3;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("groupmgr/group_request/timeout/type:");
        int i2 = r33.A00;
        C36321k7.A1Y(A0u2, i2);
        r33.A00 = true;
        if (i2 != 30) {
            if (i2 == 91) {
                r2 = r33.A02;
                i = 1005;
            } else if (i2 != 92) {
                switch (i2) {
                    case 15:
                        r2 = r33.A02;
                        i = 1002;
                        break;
                    case 16:
                        r2 = r33.A02;
                        i = 1001;
                        break;
                    case 17:
                        r2 = r33.A02;
                        i = 1007;
                        break;
                }
            } else {
                r2 = r33.A02;
                i = 1006;
            }
            r2.A0T(i, r33.A03);
        } else {
            r2 = r33.A02;
            i = 1003;
            r2.A0T(i, r33.A03);
        }
        r33.A01.A04(r33.A03, false);
        r33.A00((Integer) null);
    }

    public C82323yW(C64503Og r1) {
        this.A00 = r1;
    }
}
