package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.4mK  reason: invalid class name and case insensitive filesystem */
public class C95814mK extends C02920Ck {
    public int A00 = -1;
    public boolean A01;
    public boolean A02;
    public final C115285id A03;
    public final C115295ie A04;
    public final PollCreatorViewModel A05;
    public final List A06 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            C115285id r1 = this.A03;
            PollCreatorViewModel pollCreatorViewModel = this.A05;
            List list = AnonymousClass0D3.A0I;
            C18800tq r0 = r1.A00.A01;
            C20810yC A0V = C36341k9.A0V(r0);
            AnonymousClass1H2 A0e = C36351kA.A0e(r0);
            return new AnonymousClass5HC(inflate, C36351kA.A0U(r0), (AnonymousClass1N0) r0.A00.A3P.get(), A0e, A0V, pollCreatorViewModel, C36351kA.A0m(r0));
        } else if (i == 1) {
            return new AnonymousClass5HB(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false));
        } else {
            if (i == 2) {
                View inflate2 = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
                C115295ie r12 = this.A04;
                PollCreatorViewModel pollCreatorViewModel2 = this.A05;
                List list2 = AnonymousClass0D3.A0I;
                C18800tq r02 = r12.A00.A01;
                C20810yC A0V2 = C36341k9.A0V(r02);
                AnonymousClass1H2 A0e2 = C36351kA.A0e(r02);
                return new AnonymousClass5HD(inflate2, C36351kA.A0U(r02), C36341k9.A0T(r02), (AnonymousClass1N0) r02.A00.A3P.get(), A0e2, A0V2, pollCreatorViewModel2, C36351kA.A0m(r02));
            }
            throw C90464aC.A0R("Unrecognized view type = ", AnonymousClass000.A0u(), i);
        }
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return i != 1 ? 2 : 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((X.C36351kA.A06(r3, X.C36421kH.A06(r3, 1)) + 2) != r10) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BSE(X.AnonymousClass0D3 r9, int r10) {
        /*
            r8 = this;
            X.4nV r9 = (X.C96544nV) r9
            boolean r0 = r9 instanceof X.AnonymousClass5HD
            if (r0 == 0) goto L_0x00c1
            java.util.List r3 = r8.A06
            java.util.Iterator r1 = r3.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00be
            int r0 = X.C36341k9.A0A(r1)
            int r0 = r0 + 2
            if (r0 != r10) goto L_0x000c
            r7 = 1
        L_0x001b:
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0036
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0036
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0036
            int r0 = X.C36421kH.A06(r3, r1)
            int r0 = X.C36351kA.A06(r3, r0)
            int r0 = r0 + 2
            r6 = 1
            if (r0 == r10) goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            X.5HD r9 = (X.AnonymousClass5HD) r9
            java.lang.Object r1 = r8.A0L(r10)
            X.5HF r1 = (X.AnonymousClass5HF) r1
            int r0 = r8.A00
            if (r0 != r10) goto L_0x0044
            r2 = 1
        L_0x0044:
            int r0 = r1.A00
            r9.A00 = r0
            java.lang.String r5 = r1.A00
            com.whatsapp.WaEditText r4 = r9.A02
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = X.C36361kB.A0n(r4)
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x005f
            r4.setText(r5)
        L_0x005f:
            if (r2 == 0) goto L_0x00af
            android.view.View r0 = r9.A0H
            android.content.Context r3 = r0.getContext()
            X.0yb r2 = r9.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131893149(0x7f121b9d, float:1.9421066E38)
            java.lang.String r0 = r1.getString(r0)
            X.C33521fV.A00(r3, r2, r0)
            X.1RJ r1 = r9.A05
            r0 = 0
            r1.A03(r0)
        L_0x007d:
            if (r6 == 0) goto L_0x00ab
            r4.requestFocus()
            int r0 = r5.length()
            r4.setSelection(r0)
        L_0x0089:
            X.1RJ r1 = r9.A04
            int r0 = X.C36381kD.A09(r7)
            r1.A03(r0)
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto L_0x00aa
            android.graphics.drawable.Drawable r2 = r9.A01
            java.lang.String r0 = r0.toString()
            boolean r1 = r0.isEmpty()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x00a7
            r0 = 0
        L_0x00a7:
            r2.setAlpha(r0)
        L_0x00aa:
            return
        L_0x00ab:
            r4.clearFocus()
            goto L_0x0089
        L_0x00af:
            X.1RJ r1 = r9.A05
            r0 = 8
            r1.A03(r0)
            int r0 = r5.length()
            r4.setSelection(r0)
            goto L_0x007d
        L_0x00be:
            r7 = 0
            goto L_0x001b
        L_0x00c1:
            boolean r0 = r9 instanceof X.AnonymousClass5HC
            if (r0 == 0) goto L_0x00aa
            X.5HC r9 = (X.AnonymousClass5HC) r9
            java.lang.Object r2 = r8.A0L(r10)
            X.5HG r2 = (X.AnonymousClass5HG) r2
            com.whatsapp.WaEditText r1 = r9.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r2.A00
            int r0 = r0.length()
            r1.setSelection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95814mK.BSE(X.0D3, int):void");
    }

    public C95814mK(C02830Cb r2, C115285id r3, C115295ie r4, PollCreatorViewModel pollCreatorViewModel) {
        super(r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = pollCreatorViewModel;
    }
}
