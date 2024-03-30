package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3mn  reason: invalid class name and case insensitive filesystem */
public abstract class C75173mn implements AnonymousClass4U3 {
    public final AnonymousClass3B9 A00;
    public final C19970wo A01;
    public final C24381Cf A02;
    public final C20310xM A03;
    public final C20350xQ A04;
    public final C238019x A05;

    public void Bj9() {
        AnonymousClass3B9 r0 = this.A00;
        AnonymousClass146 r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i = r0.A00;
        Log.i("groupmgr/group_request/timeout/type: 14");
        this.A04.A15.remove(r3);
        this.A03.A0h(this.A05.A05(r3, str, list, 3, i, C19970wo.A00(this.A01)));
        this.A02.A04(r3, false);
    }

    public void onError(int i) {
        AnonymousClass3B9 r0 = this.A00;
        AnonymousClass146 r3 = r0.A02;
        String str = r0.A04;
        List list = r0.A05;
        int i2 = r0.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("groupmgr/request failed : ");
        A0u.append(i);
        A0u.append(" | ");
        A0u.append(r3);
        A0u.append(" | ");
        C36351kA.A1R(A0u, 14);
        C20350xQ r2 = this.A04;
        r2.A15.remove(r3);
        int i3 = 2003;
        if (i != 406) {
            i3 = 2027;
            if (i != 412) {
                i3 = 2004;
                if (i != 429) {
                    i3 = 2002;
                    if (i != 500) {
                        i3 = 2001;
                    }
                }
            }
        }
        r2.A0T(i3, str);
        this.A03.A0h(this.A05.A05(r3, str, list, 3, i2, C19970wo.A00(this.A01)));
        this.A02.A04(r3, false);
    }

    public C75173mn(C19970wo r2, C24381Cf r3, C20310xM r4, C20350xQ r5, AnonymousClass3B9 r6, C238019x r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A02 = r3;
        this.A00 = r6;
        List list = r6.A05;
        if (list != null) {
            Arrays.deepToString(list.toArray());
        }
    }

    public void BiP(AnonymousClass39E r4, AnonymousClass147 r5) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("groupmgr/request success : ");
        A0u.append(r5);
        A0u.append(" | ");
        C36321k7.A1Y(A0u, 14);
        this.A02.A04(this.A00.A02, false);
    }
}
