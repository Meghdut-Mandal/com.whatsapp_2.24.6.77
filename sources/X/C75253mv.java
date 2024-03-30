package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3mv  reason: invalid class name and case insensitive filesystem */
public final class C75253mv implements AnonymousClass4TD {
    public final /* synthetic */ AnonymousClass026 A00;
    public final /* synthetic */ C586630o A01;
    public final /* synthetic */ C27771Pt A02;
    public final /* synthetic */ AnonymousClass147 A03;

    public void Bhz(AnonymousClass147 r21, UserJid userJid, AnonymousClass3QL r23, String str, Map map, int i, int i2, int i3, long j, long j2, boolean z) {
        int A1P;
        AnonymousClass147 r8 = r21;
        AnonymousClass00C.A0D(r8, 0);
        C27771Pt r5 = this.A02;
        Map map2 = map;
        ArrayList A0R = r5.A05.A0R(map2);
        AnonymousClass6X6 r3 = new AnonymousClass6X6(r8, 0);
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A0y = AnonymousClass000.A0y(map2);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String str2 = ((C63523Kj) A11.getValue()).A04;
            AnonymousClass00C.A08(str2);
            if (str2.equals("admin") || str2.equals("superadmin")) {
                C36411kG.A1T(A1G, A11);
            }
        }
        Iterator A0y2 = AnonymousClass000.A0y(A1G);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            UserJid userJid2 = (UserJid) A112.getKey();
            HashSet A0B = r5.A04.A0B(userJid2);
            String str3 = ((C63523Kj) A112.getValue()).A04;
            AnonymousClass00C.A08(str3);
            if (str3.equals("superadmin")) {
                A1P = 2;
            } else {
                A1P = AnonymousClass000.A1P(str3.equals("admin") ? 1 : 0);
            }
            AnonymousClass6X6.A00(r3, userJid2, A0B, A1P, false, true);
        }
        r5.A03.A00.put(r8, r3);
        AnonymousClass3B2 r7 = new AnonymousClass3B2(r8, userJid, r23, str, (String) null, A0R, i, i2, i3, j);
        r7.A00 = z;
        this.A00.accept(r7);
    }

    public C75253mv(AnonymousClass026 r1, C586630o r2, C27771Pt r3, AnonymousClass147 r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void onError(int i) {
        C586630o r0 = this.A01;
        AnonymousClass147 r5 = this.A03;
        C40041ue r2 = r0.A00;
        AnonymousClass3B2 r4 = new AnonymousClass3B2(r5, (UserJid) null, (AnonymousClass3QL) null, (String) null, (String) null, (List) null, 0, 2, 0, 0);
        C001700s r1 = r2.A0G;
        int i2 = i;
        if (i2 != -1) {
            r1.A0C(new C62303Fq(r4, i2));
            C36341k9.A17(r2.A0d, 5);
            return;
        }
        throw AnonymousClass001.A09("Error code expected but default success code '-1' was provided.");
    }
}
