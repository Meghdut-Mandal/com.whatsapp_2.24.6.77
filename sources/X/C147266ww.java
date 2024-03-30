package X;

import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ww  reason: invalid class name and case insensitive filesystem */
public class C147266ww implements C17790s2 {
    public final /* synthetic */ C100844vw A00;

    public C147266ww(C100844vw r1) {
        this.A00 = r1;
    }

    public void BRH(C135106c9 r10, File file) {
        C100844vw r7 = this.A00;
        List list = r7.A0J;
        synchronized (list) {
            ArrayList A15 = C36441kJ.A15(list);
            Iterator it = A15.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C135106c9 r8 = ((C1262563e) it.next()).A03;
                if (r8 != null) {
                    String str = r8.A0F;
                    String str2 = r10.A0F;
                    if (str.equals(str2)) {
                        C1262563e r3 = new C1262563e(r8);
                        if (file != null) {
                            r3.A00 = true;
                        } else {
                            r3.A00 = false;
                            r3.A01 = true;
                        }
                        C135106c9 r0 = r7.A07;
                        if (r0 != null && str2.equals(r0.A0F)) {
                            z = true;
                        }
                        r3.A02 = z;
                        A15.set(i, r3);
                        C96004md r2 = r7.A08;
                        A15.size();
                        List list2 = r2.A05;
                        C36341k9.A1A(new C95584lr(list2, A15), r2, A15, list2);
                        list.set(i, r3);
                    }
                }
                i++;
            }
        }
    }

    public void BWY() {
        this.A00.A01.postDelayed(new AVY(this, 36), 2000);
    }

    public /* bridge */ /* synthetic */ void BbA(Object obj) {
        boolean z;
        List<C135106c9> list = (List) obj;
        C100844vw r4 = this.A00;
        r4.A05.setVisibility(0);
        List list2 = r4.A0J;
        synchronized (list2) {
            r4.A08.A01 = r4.A07;
            list2.clear();
            C1262563e r1 = new C1262563e((C135106c9) null);
            r1.A00 = true;
            r1.A02 = AnonymousClass000.A1W(r4.A07);
            list2.add(r1);
            for (C135106c9 r3 : list) {
                C1262563e r2 = new C1262563e(r3);
                C135106c9 r0 = r4.A07;
                if (r0 != null) {
                    boolean equals = r0.A0F.equals(r3.A0F);
                    z = true;
                    if (equals) {
                        r2.A02 = z;
                        list2.add(r2);
                    }
                }
                z = false;
                r2.A02 = z;
                list2.add(r2);
            }
            C96004md r22 = r4.A08;
            list2.size();
            List list3 = r22.A05;
            C36341k9.A1A(new C95584lr(list3, list2), r22, list2, list3);
        }
        r4.A06.setVisibility(8);
        r4.A03.setText(R.string.f12nameremoved);
    }

    public void Bj9() {
        this.A00.A01.postDelayed(new AVY(this, 37), 2000);
    }
}
