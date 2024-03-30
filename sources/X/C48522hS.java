package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;

/* renamed from: X.2hS  reason: invalid class name and case insensitive filesystem */
public final class C48522hS extends C42581z3 implements C16620po {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final C07200Ws A04;
    public final C07200Ws A05;
    public final C20810yC A06;
    public final C28331Sf A07;
    public final C32121d0 A08;
    public final AnonymousClass13J A09;
    public final WaTextView A0A;
    public final WaTextView A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48522hS(android.view.View r22, X.C18820ts r23, X.C20810yC r24, X.C28331Sf r25, X.C32121d0 r26, X.AnonymousClass13J r27) {
        /*
            r21 = this;
            r3 = 1
            r9 = r23
            r7 = r24
            X.C36421kH.A1J(r9, r3, r7)
            r1 = r25
            r8 = r27
            X.C36321k7.A10(r1, r8)
            r2 = r21
            r4 = r22
            r2.<init>(r4)
            r0 = r26
            r2.A08 = r0
            r2.A06 = r7
            r2.A07 = r1
            r2.A09 = r8
            r0 = 2131434966(0x7f0b1dd6, float:1.849176E38)
            com.whatsapp.WaTextView r1 = X.C36411kG.A0Z(r4, r0)
            r2.A0B = r1
            r0 = 2131431783(0x7f0b1167, float:1.8485305E38)
            android.view.View r6 = r4.findViewById(r0)
            r2.A02 = r6
            r0 = 2131427617(0x7f0b0121, float:1.8476855E38)
            android.view.View r12 = r4.findViewById(r0)
            r2.A00 = r12
            r0 = 2131433744(0x7f0b1910, float:1.8489282E38)
            android.view.ViewGroup r0 = X.C36411kG.A0P(r4, r0)
            r2.A03 = r0
            r5 = 2131433748(0x7f0b1914, float:1.848929E38)
            com.whatsapp.WaTextView r5 = X.C36411kG.A0Z(r4, r5)
            r2.A0A = r5
            r10 = 2131428550(0x7f0b04c6, float:1.8478748E38)
            android.view.View r10 = r4.findViewById(r10)
            r2.A01 = r10
            android.content.Context r11 = r4.getContext()
            boolean r10 = X.C36351kA.A1Y(r9)
            r18 = 5
            int r13 = X.C36421kH.A01(r10)
            r14 = 0
            int r15 = X.C55822vF.A00(r7)
            X.0Ws r10 = new X.0Ws
            r10.<init>(r11, r12, r13, r14, r15)
            r2.A04 = r10
            android.content.Context r16 = r4.getContext()
            boolean r9 = X.C36351kA.A1Y(r9)
            if (r9 != 0) goto L_0x007c
            r18 = 3
        L_0x007c:
            int r20 = X.C55822vF.A00(r7)
            X.0Ws r15 = new X.0Ws
            r19 = 0
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A05 = r15
            r6 = 2131894535(0x7f122107, float:1.9423878E38)
            r1.setText(r6)
            X.C33511fU.A03(r1)
            X.C33511fU.A03(r5)
            r1 = 34
            X.AnonymousClass3Y9.A00(r0, r2, r1)
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r0 = X.C36361kB.A0F(r4, r0)
            r5 = 8
            r0.setVisibility(r5)
            X.C33521fV.A07(r4, r3)
            r0 = 2131428535(0x7f0b04b7, float:1.8478717E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r8.BJo()
            if (r0 == 0) goto L_0x018e
            r0 = 33
            X.AnonymousClass3Y9.A00(r1, r2, r0)
        L_0x00bd:
            r0 = 2131432622(0x7f0b14ae, float:1.8487007E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 35
            X.AnonymousClass3Y9.A00(r1, r2, r0)
            X.0Ws r6 = r2.A04
            X.07a r4 = r6.A03
            X.0yC r0 = r2.A06
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x00d7
            r4.A0C = r3
        L_0x00d7:
            X.13J r0 = r2.A09
            boolean r0 = r0.BJo()
            if (r0 == 0) goto L_0x00f0
            r0 = 2131893172(0x7f121bb4, float:1.9421113E38)
            android.view.MenuItem r1 = r4.add((int) r14, (int) r14, (int) r14, (int) r0)
            r0 = 2131232128(0x7f080580, float:1.8080357E38)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setIcon(r0)
        L_0x00f0:
            r0 = 2131893173(0x7f121bb5, float:1.9421115E38)
            android.view.MenuItem r1 = r4.add((int) r14, (int) r3, (int) r14, (int) r0)
            r0 = 2131233354(0x7f080a4a, float:1.8082843E38)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setIcon(r0)
            android.view.View r4 = r2.A00
            r0 = 32
            X.AnonymousClass3Y9.A00(r4, r2, r0)
            android.view.View r5 = r2.A0H
            android.content.Context r1 = r5.getContext()
            r0 = 2131894897(0x7f122271, float:1.9424612E38)
            X.C36331k8.A0q(r1, r4, r0)
            r6.A01 = r2
            X.0Ws r4 = r2.A05
            X.07a r6 = r4.A03
            X.0yC r0 = r2.A06
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x0124
            r6.A0C = r3
        L_0x0124:
            X.1Sf r0 = r2.A07
            X.0yC r3 = r0.A00
            r0 = 6796(0x1a8c, float:9.523E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0144
            r1 = 2131431682(0x7f0b1102, float:1.84851E38)
            r0 = 2131893924(0x7f121ea4, float:1.9422638E38)
            android.view.MenuItem r1 = r6.add((int) r14, (int) r1, (int) r14, (int) r0)
            r0 = 2131234317(0x7f080e0d, float:1.8084796E38)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setIcon(r0)
        L_0x0144:
            r0 = 6850(0x1ac2, float:9.599E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 != 0) goto L_0x0160
            r1 = 2131431700(0x7f0b1114, float:1.8485137E38)
            r0 = 2131897038(0x7f122ace, float:1.9428954E38)
            android.view.MenuItem r1 = r6.add((int) r14, (int) r1, (int) r14, (int) r0)
            r0 = 2131234229(0x7f080db5, float:1.8084618E38)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setIcon(r0)
        L_0x0160:
            r0 = 6279(0x1887, float:8.799E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 != 0) goto L_0x017a
            r1 = 2
            r0 = 2131896849(0x7f122a11, float:1.942857E38)
            android.view.MenuItem r1 = r6.add((int) r14, (int) r1, (int) r14, (int) r0)
            r0 = 2131231815(0x7f080447, float:1.8079722E38)
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            r1.setIcon(r0)
        L_0x017a:
            android.view.View r3 = r2.A02
            r0 = 36
            X.AnonymousClass3Y9.A00(r3, r2, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131891119(0x7f1213af, float:1.941695E38)
            X.C36331k8.A0q(r1, r3, r0)
            r4.A01 = r2
            return
        L_0x018e:
            X.AnonymousClass00C.A0B(r1)
            r1.setVisibility(r5)
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48522hS.<init>(android.view.View, X.0ts, X.0yC, X.1Sf, X.1d0, X.13J):void");
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            if (Integer.valueOf(itemId) != null) {
                if (itemId == 2) {
                    Context A1D = ((AnonymousClass02E) this.A08).A1D();
                    if (A1D != null) {
                        Intent A0D = C36431kI.A0D();
                        A0D.setClassName(A1D.getPackageName(), "com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity");
                        A1D.startActivity(A0D);
                    }
                    return true;
                } else if (itemId == R.id.menuitem_status_privacy) {
                    AnonymousClass02E r1 = (AnonymousClass02E) this.A08;
                    r1.A1C(AnonymousClass190.A0E(r1.A0a()));
                    return true;
                } else if (itemId == 0) {
                    this.A08.Bd1(11, 59);
                    return true;
                } else if (itemId == 1) {
                    this.A08.Bd6();
                    return true;
                } else if (itemId == R.id.menuitem_archived_status) {
                    C65443Sb.A01(new StatusArchiveSettingsBottomSheetDialog(), ((AnonymousClass02E) this.A08).A0k());
                    return true;
                } else if (itemId == R.id.menuitem_see_all_statuses) {
                    this.A08.Bg3();
                    return true;
                }
            }
        }
        throw AnonymousClass001.A09("Could not handle menu item click");
    }

    private final Drawable A00(int i) {
        Drawable A032 = AnonymousClass3UF.A03(C36441kJ.A0F(this), i, AnonymousClass1MI.A01(this.A06));
        AnonymousClass00C.A08(A032);
        return A032;
    }
}
