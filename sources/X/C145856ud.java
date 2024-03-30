package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6ud  reason: invalid class name and case insensitive filesystem */
public class C145856ud implements C159487jR {
    public final AnonymousClass6QG A00;
    public final /* synthetic */ C145896uh A01;

    public C145856ud(AnonymousClass6QG r1, C145896uh r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWx(C1261662u r4, int i) {
        C122345uh r2 = this.A01.A0D;
        if (r2 != null) {
            C123205w7 r1 = r2.A01;
            r1.A03 = null;
            r1.A04.clear();
            r1.A01 = 5;
            r1.A00 = i;
            r2.A00.A0D(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C128836Du r13 = (C128836Du) obj;
        C145896uh r1 = this.A01;
        if (r1.A0D != null) {
            List list = r13.A09;
            C131836Qv.A01(this.A00, list);
            C122345uh r7 = r1.A0D;
            C123205w7 r6 = r7.A01;
            r6.A03 = null;
            List list2 = r6.A04;
            list2.clear();
            r6.A02 = r13;
            List<AnonymousClass544> list3 = r13.A07;
            if (list3.isEmpty()) {
                r6.A01 = 2;
            } else {
                ArrayList A0I = AnonymousClass001.A0I();
                for (AnonymousClass544 r9 : list3) {
                    A0I.add(new AnonymousClass5E3(new C48812i6(r9, r7, 15), r9.A03, r9.A01, false));
                }
                C28201Rs r92 = r7.A02.A00.A0S;
                if (r92.A04() != null && !list.isEmpty()) {
                    String A0v = C36391kE.A0v(r7.A03.A00, ((C134986bw) r92.A04()).A01, new Object[1], 0, R.string.f12nameremoved);
                    A0I.add(new C105095Di());
                    A0I.add(new AnonymousClass5E3(new C48892iE(r7, 11), "", A0v, true));
                }
                r6.A01 = 1;
                list2.clear();
                list2.addAll(A0I);
            }
            r7.A00.A0D(r6);
        }
    }
}
