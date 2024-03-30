package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4mk  reason: invalid class name and case insensitive filesystem */
public class C96074mk extends AnonymousClass0CZ {
    public ArrayList A00;
    public C147396x9[] A01;
    public final /* synthetic */ C147416xB A02;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C147416xB r0 = this.A02;
        if (i == 1) {
            return new C97004oF(r0.A07, viewGroup, r0.A0B);
        }
        return new C96774ns(r0.A07, viewGroup);
    }

    public C96074mk(C147416xB r2, ArrayList arrayList, C147396x9[] r4) {
        this.A02 = r2;
        this.A00 = arrayList;
        this.A01 = r4;
        A0B(true);
    }

    public long A0E(int i) {
        if (!this.A00) {
            return -1;
        }
        String str = ((C130706Mc) this.A00.get(i)).A01;
        C147416xB r5 = this.A02;
        HashMap hashMap = r5.A0C;
        Number A10 = C36441kJ.A10(str, hashMap);
        if (A10 == null) {
            long j = r5.A02;
            r5.A02 = 1 + j;
            A10 = Long.valueOf(j);
            hashMap.put(str, A10);
        }
        return A10.longValue();
    }

    public int A0J() {
        return this.A00.size();
    }

    public void A0K(AnonymousClass0D3 r2) {
        if (r2 instanceof C97004oF) {
            ((C97004oF) r2).A0B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b6, code lost:
        if (r3 != 3) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r19, int r20) {
        /*
            r18 = this;
            r11 = r19
            r2 = r18
            r1 = r20
            int r0 = r2.getItemViewType(r1)
            if (r0 != 0) goto L_0x00cb
            X.4ns r11 = (X.C96774ns) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r5 = r0.get(r1)
            X.6Mc r5 = (X.C130706Mc) r5
            X.6xB r0 = r2.A02
            int r0 = r0.A00
            boolean r6 = r5.A00(r0)
            android.view.View r7 = r11.A01
            if (r6 == 0) goto L_0x00c8
            android.content.Context r4 = r7.getContext()
            android.content.Context r3 = r7.getContext()
            r1 = 2130970332(0x7f0406dc, float:1.7549371E38)
            r0 = 2131101952(0x7f060900, float:1.7816328E38)
            int r0 = X.C36351kA.A02(r3, r4, r1, r0)
        L_0x0034:
            r7.setBackgroundColor(r0)
            X.6x9[] r1 = r2.A01
            int r0 = r5.A00
            r4 = r1[r0]
            android.widget.ImageView r3 = r11.A02
            boolean r0 = r4 instanceof X.C106675Ku
            if (r0 == 0) goto L_0x008f
            r10 = r4
            X.5Ku r10 = (X.C106675Ku) r10
            r0 = 0
            X.AnonymousClass06T.A00(r0, r3)
            X.68B r0 = r10.A04
            java.lang.String r0 = r0.A0F
            r3.setTag(r0)
            X.6z9 r9 = new X.6z9
            r9.<init>(r3, r10, r0)
            android.content.Context r8 = r10.A0B
            r7 = 2131894572(0x7f12212c, float:1.9423953E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            X.68B r0 = r10.A04
            java.lang.String r0 = r0.A0H
            java.lang.String r0 = X.C36381kD.A0r(r8, r0, r1, r7)
            r3.setContentDescription(r0)
            r3.setSelected(r6)
            X.1AP r1 = r10.A06
            X.68B r0 = r10.A04
            r1.A0B(r0, r9)
        L_0x0074:
            boolean r0 = r4 instanceof X.C106675Ku
            if (r0 == 0) goto L_0x008d
            X.5Ku r4 = (X.C106675Ku) r4
            X.68B r0 = r4.A04
            boolean r0 = r0.A09
        L_0x007e:
            android.view.View r1 = r11.A00
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            r0 = 27
            X.AnonymousClass3YC.A00(r3, r2, r5, r0)
        L_0x008c:
            return
        L_0x008d:
            r0 = 0
            goto L_0x007e
        L_0x008f:
            boolean r0 = r4 instanceof X.C106665Kt
            if (r0 == 0) goto L_0x00a2
            r0 = 2131233777(0x7f080bf1, float:1.8083701E38)
            X.C90474aD.A10(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894552(0x7f122118, float:1.9423912E38)
            X.C36331k8.A0q(r1, r3, r0)
            goto L_0x0074
        L_0x00a2:
            boolean r0 = r4 instanceof X.C106685Kv
            if (r0 == 0) goto L_0x00b5
            r0 = 2131231495(0x7f080307, float:1.8079073E38)
            X.C90474aD.A10(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894600(0x7f122148, float:1.942401E38)
            X.C36331k8.A0q(r1, r3, r0)
            goto L_0x0074
        L_0x00b5:
            boolean r0 = r4 instanceof X.C106655Ks
            if (r0 != 0) goto L_0x0074
            r0 = 2131233768(0x7f080be8, float:1.8083683E38)
            X.C90474aD.A10(r3, r0, r6)
            android.content.Context r1 = r4.A0B
            r0 = 2131894543(0x7f12210f, float:1.9423894E38)
            X.C36331k8.A0q(r1, r3, r0)
            goto L_0x0074
        L_0x00c8:
            r0 = 0
            goto L_0x0034
        L_0x00cb:
            X.4oF r11 = (X.C97004oF) r11
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r10 = r0.get(r1)
            X.6Mc r10 = (X.C130706Mc) r10
            android.view.View r9 = r11.A02
            r0 = 23
            X.AnonymousClass3YC.A00(r9, r2, r10, r0)
            android.view.View r8 = r11.A03
            r0 = 24
            X.AnonymousClass3YC.A00(r8, r2, r10, r0)
            android.view.View r7 = r11.A04
            r0 = 25
            X.AnonymousClass3YC.A00(r7, r2, r10, r0)
            android.view.View r6 = r11.A05
            r0 = 26
            X.AnonymousClass3YC.A00(r6, r2, r10, r0)
            X.6xB r0 = r2.A02
            r17 = r0
            int r0 = r0.A00
            boolean r0 = r10.A00(r0)
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x019d
            X.07n r5 = new X.07n
            r5.<init>()
            r5.A08(r8)
            android.view.View r14 = r11.A01
            r5.A08(r14)
            r0 = 300(0x12c, double:1.48E-321)
            r5.A06(r0)
            X.07k r13 = new X.07k
            r13.<init>()
            X.056 r2 = new X.056
            r2.<init>()
            X.0ts r0 = r11.A08
            r16 = r0
            boolean r0 = X.C36351kA.A1Y(r16)
            r15 = 5
            int r0 = X.C36421kH.A01(r0)
            r2.A0Z(r0)
            r3 = 400(0x190, double:1.976E-321)
            r2.A06(r3)
            X.07m r12 = new X.07m
            r12.<init>()
            r0 = 100
            r12.A02 = r0
            r12.A06(r3)
            r13.A0Z(r9)
            r13.A0a(r2)
            r13.A0a(r12)
            X.07k r12 = new X.07k
            r12.<init>()
            X.056 r2 = new X.056
            r2.<init>()
            boolean r16 = X.C36351kA.A1Y(r16)
            if (r16 == 0) goto L_0x0158
            r15 = 3
        L_0x0158:
            r2.A0Z(r15)
            r2.A06(r3)
            r2.A02 = r0
            X.07m r3 = new X.07m
            r3.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.A02 = r0
            r0 = 300(0x12c, double:1.48E-321)
            r3.A06(r0)
            r12.A0Z(r6)
            r12.A0Z(r7)
            r12.A0a(r2)
            r12.A0a(r3)
            android.view.View r0 = r11.A0H
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C018607y.A02(r0, r5)
            android.view.ViewGroup r0 = r11.A07
            X.C018607y.A02(r0, r12)
            android.view.ViewGroup r0 = r11.A06
            X.C018607y.A02(r0, r13)
            r0 = 2131233786(0x7f080bfa, float:1.808372E38)
            r14.setBackgroundResource(r0)
            r0 = 0
            r7.setVisibility(r0)
            r6.setVisibility(r0)
            r9.setVisibility(r0)
            r11.A00 = r0
        L_0x019d:
            r0 = r17
            int r3 = r0.A00
            int r1 = r10.A00
            if (r3 < r1) goto L_0x01b8
            int r0 = r1 + 4
            if (r3 >= r0) goto L_0x01b8
            int r3 = r3 - r1
            r0 = 1
            r2 = 1
            if (r3 == 0) goto L_0x01b9
            r2 = 2
            if (r3 == r0) goto L_0x01b9
            if (r3 == r2) goto L_0x01d7
            r0 = 3
            r2 = 8
            if (r3 == r0) goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            r0 = 0
            r9.setSelected(r0)
            r7.setSelected(r0)
            r8.setSelected(r0)
            r6.setSelected(r0)
            r1 = 1
            if (r2 == r1) goto L_0x01e5
            r0 = 2
            if (r2 == r0) goto L_0x01e1
            r0 = 4
            if (r2 == r0) goto L_0x01dd
            r0 = 8
            if (r2 != r0) goto L_0x008c
            r6.setSelected(r1)
            return
        L_0x01d7:
            r2 = 4
            goto L_0x01b9
        L_0x01d9:
            r11.A0B()
            goto L_0x019d
        L_0x01dd:
            r7.setSelected(r1)
            return
        L_0x01e1:
            r8.setSelected(r1)
            return
        L_0x01e5:
            r9.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96074mk.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        return this.A00.get(i) instanceof C106585Kl ? 1 : 0;
    }
}
