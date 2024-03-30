package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wF  reason: invalid class name and case insensitive filesystem */
public final class C40871wF extends AnonymousClass0CZ {
    public List A00;
    public final C19460v5 A01;
    public final C57732yj A02;
    public final AnonymousClass4OQ A03;
    public final List A04;

    public final void A0L(C52622pt r6, String str) {
        AnonymousClass00C.A0D(r6, 0);
        List<C52622pt> list = this.A04;
        ArrayList A0J = C36321k7.A0J(list);
        for (C52622pt r2 : list) {
            AnonymousClass3JH r1 = new AnonymousClass3JH(r2, C36361kB.A1a(r2, r6));
            if (r2 == C52622pt.COUNTRY) {
                r1.A00 = str;
            }
            A0J.add(r1);
        }
        this.A00 = A0J;
        A06();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C57732yj r3 = this.A02;
        View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        TextView textView = (TextView) inflate;
        C33511fU.A03(textView);
        List list = AnonymousClass0D3.A0I;
        return new C42031yA(textView, (AnonymousClass1ZS) r3.A00.A01.A5b.get(), this);
    }

    public int A0J() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0066, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r8, int r9) {
        /*
            r7 = this;
            X.1yA r8 = (X.C42031yA) r8
            r1 = 0
            X.AnonymousClass00C.A0D(r8, r1)
            java.util.List r0 = r7.A00
            java.lang.Object r6 = r0.get(r9)
            X.3JH r6 = (X.AnonymousClass3JH) r6
            X.AnonymousClass00C.A0D(r6, r1)
            X.2pt r5 = r6.A01
            com.google.android.material.chip.Chip r4 = r8.A00
            java.lang.CharSequence r0 = r4.getText()
            r4.setContentDescription(r0)
            boolean r0 = r6.A02
            r4.setChecked(r0)
            r4.setCheckedIconVisible((boolean) r1)
            android.content.Context r0 = X.C36371kC.A0B(r4)
            java.lang.String r0 = r5.A01(r0)
            r4.setText(r0)
            X.2pt r0 = X.C52622pt.COUNTRY
            if (r5 != r0) goto L_0x006c
            r3 = 2131101065(0x7f060589, float:1.781453E38)
            r2 = 1
            r4.setChipIconVisible((boolean) r2)
            r0 = 2131232874(0x7f08086a, float:1.808187E38)
            r4.setChipIconResource(r0)
            r4.setChipIconTintResource(r3)
            r0 = 2131167997(0x7f070afd, float:1.7950283E38)
            r4.setChipIconSizeResource(r0)
            r1 = 2131165753(0x7f070239, float:1.7945732E38)
            r4.setIconStartPaddingResource(r1)
            r4.setCloseIconVisible((boolean) r2)
            r0 = 2131234073(0x7f080d19, float:1.8084301E38)
            r4.setCloseIconResource(r0)
            r4.setCloseIconTintResource(r3)
            r4.setCloseIconEndPaddingResource(r1)
            X.1ZS r1 = r8.A01
            java.lang.String r0 = r6.A00
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0072
        L_0x0068:
            r4.setText(r0)
            return
        L_0x006c:
            r4.setChipIconVisible((boolean) r1)
            r4.setCloseIconVisible((boolean) r1)
        L_0x0072:
            android.content.Context r0 = X.C36371kC.A0B(r4)
            java.lang.String r0 = r5.A01(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40871wF.BSE(X.0D3, int):void");
    }

    public C40871wF(C19460v5 r9, C57732yj r10, C20810yC r11, AnonymousClass4OQ r12) {
        C36321k7.A11(r11, r10, r9);
        this.A02 = r10;
        this.A01 = r9;
        this.A03 = r12;
        List A0L = AnonymousClass099.A0L(C36431kI.A19(r11, 5127), new String[]{","}, 0);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            Integer A032 = AnonymousClass097.A03(C36371kC.A0y(AnonymousClass001.A0C(it)));
            if (A032 != null) {
                A0I.add(A032);
            }
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            int A0A = C36341k9.A0A(it2);
            C52622pt[] values = C52622pt.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C52622pt r1 = values[i];
                if (r1.value == A0A) {
                    A0I2.add(r1);
                    break;
                }
                i++;
            }
        }
        ArrayList A0q = C36361kB.A0q(A0I2);
        Boolean bool = C18750th.A03;
        C19460v5 r13 = this.A01;
        if (r13.A05()) {
            r13.A02();
            throw AnonymousClass001.A0A("shouldAddDiscoveryTab");
        }
        if (r11.A0E(7685)) {
            A0q.remove(C52622pt.COUNTRY);
        }
        this.A04 = A0q;
        this.A00 = AnonymousClass001.A0I();
    }
}
