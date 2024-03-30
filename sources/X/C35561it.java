package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
public class C35561it implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06 = 0;

    public C35561it(Context context, C122805vS r3, C35011i0 r4, Integer num, List list) {
        this.A00 = r4;
        this.A01 = context;
        this.A02 = list;
        this.A03 = num;
        this.A05 = "status_fragment";
        this.A04 = r3;
    }

    public final void run() {
        AnonymousClass3T1 A012;
        if (this.A06 != 0) {
            C35011i0 r11 = (C35011i0) this.A00;
            Context context = (Context) this.A01;
            List<AnonymousClass3T1> list = (List) this.A02;
            C122805vS r10 = (C122805vS) this.A04;
            AnonymousClass00C.A0D(r10, 5);
            String A022 = AnonymousClass6Y4.A02();
            C107615Qe r8 = new C107615Qe(context, r10, r11, (Integer) this.A03, A022, list);
            AnonymousClass6V7 r5 = (AnonymousClass6V7) r11.A0E.get();
            AnonymousClass3NV.A00((AnonymousClass3NV) r5.A07.get()).edit().putString("pref_debug_session_id", A022).apply();
            StringBuilder sb = new StringBuilder();
            sb.append("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest called for session: ");
            sb.append(A022);
            sb.append(" with message ");
            ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(list, 10));
            for (AnonymousClass3T1 r0 : list) {
                arrayList.add(Long.valueOf(r0.A1N));
            }
            sb.append(arrayList);
            AnonymousClass00C.A0D(sb.toString(), 0);
            if (AnonymousClass6Y4.A09(list)) {
                AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest skip for audio status", 0);
                r8.A02((Integer) null, A022, -4, true);
                return;
            }
            ((AnonymousClass66L) r5.A0A.get()).A00(A022);
            C132396Tl r6 = (C132396Tl) r5.A09.get();
            ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(list, 10));
            for (AnonymousClass3T1 r02 : list) {
                arrayList2.add(Long.valueOf(r02.A1N));
            }
            r6.A05(A022, arrayList2);
            C1494571h r1 = new C1494571h(r8, A022);
            AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/handleNewAutoShareEligibilityRequest start text status re-burning and eligibility", 0);
            AnonymousClass6V7.A00(context, r5, r1, A022, list);
            return;
        }
        AnonymousClass1X4 r12 = (AnonymousClass1X4) this.A00;
        AnonymousClass3T1 r03 = (AnonymousClass3T1) this.A02;
        String str = this.A05;
        List list2 = (List) this.A04;
        C145166tS r4 = (C145166tS) this.A03;
        AnonymousClass3L1 r3 = ((C39471sS) this.A01).A04;
        if (r03 instanceof AnonymousClass2bU) {
            AnonymousClass1D5 r42 = r12.A0p;
            AnonymousClass11F r82 = r03.A1J.A00;
            AnonymousClass2bU r2 = (AnonymousClass2bU) r03;
            A012 = r42.A03((Uri) null, r2.A01, (AnonymousClass3XT) null, r82, (AnonymousClass3T1) null, str, r2.A08, list2, (List) null, r03.A1I, r03.A09, 0, r03.A1T(4));
        } else {
            A012 = AnonymousClass1X4.A01(r12, r4, (AnonymousClass3XT) null, r03.A1J.A00, (AnonymousClass3BG) null, (AnonymousClass3T1) null, r3, str, list2, false, false, false);
        }
        AnonymousClass1X4.A09(r12, r03, A012);
    }

    public C35561it(AnonymousClass1X4 r2, C145166tS r3, C39471sS r4, AnonymousClass3T1 r5, String str, List list) {
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r5;
        this.A05 = str;
        this.A04 = list;
        this.A03 = r3;
    }
}
