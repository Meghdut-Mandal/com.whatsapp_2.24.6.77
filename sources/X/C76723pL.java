package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3pL  reason: invalid class name and case insensitive filesystem */
public class C76723pL implements C236119d {
    public final long A00;
    public final AnonymousClass19A A01;
    public final long A02;
    public final AnonymousClass1OG A03;
    public final boolean A04;

    public void BVN(String str) {
        C36331k8.A18(this.A03.A03, "adv_key_index_list_require_update", true);
    }

    public void BWw(C203399nx r4, String str) {
        C203399nx A0c = r4.A0c("error");
        int i = -1;
        if (A0c != null) {
            i = A0c.A0S("code", -1);
        }
        this.A03.A05(i);
    }

    public void BiM(C203399nx r10, String str) {
        long j;
        C203399nx A0c = r10.A0c("retry-ts");
        if (A0c != null) {
            String A0x = C36391kE.A0x(A0c, "ts");
            if (!TextUtils.isEmpty(A0x)) {
                j = AnonymousClass6R8.A01(A0x, -1);
            } else {
                j = -1;
            }
            if (this.A04 || j == -1) {
                this.A03.A05(-1);
                return;
            }
            AnonymousClass1OG r2 = this.A03;
            long j2 = this.A02;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("DeviceKeyIndexListUpdateHandler/onRetry advTs=");
            A0u.append(j);
            C36341k9.A1M(" serverTs=", A0u, j2);
            AnonymousClass1OG.A01(r2, j, j2, true);
            return;
        }
        AnonymousClass1OG r5 = this.A03;
        long j3 = this.A00;
        long j4 = this.A02;
        r5.A00.A06(j3);
        C236419g r8 = r5.A04;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = r8.A09().iterator();
        while (it.hasNext()) {
            AnonymousClass3SB r52 = (AnonymousClass3SB) it.next();
            if (r52.A02() && r52.A01 < j4) {
                A0I.add(r52.A07);
            }
        }
        r8.A0I.A08(C20760y7.copyOf((Collection) A0I));
    }

    public C76723pL(AnonymousClass1OG r1, AnonymousClass19A r2, long j, long j2, boolean z) {
        this.A01 = r2;
        this.A04 = z;
        this.A00 = j;
        this.A02 = j2;
        this.A03 = r1;
    }
}
