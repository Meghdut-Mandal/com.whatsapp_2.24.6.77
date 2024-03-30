package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.3FH  reason: invalid class name */
public class AnonymousClass3FH {
    public final Context A00;
    public final AnonymousClass1X4 A01;
    public final C224914p A02;
    public final AnonymousClass11F A03;
    public final AnonymousClass00S A04;
    public final CompoundButton.OnCheckedChangeListener A05;
    public final ListItemWithLeftIcon A06;
    public final C19970wo A07;
    public final C19420v0 A08;
    public final C18820ts A09;
    public final C220412q A0A;
    public final AnonymousClass1CR A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e7, code lost:
        if (r9.A0A() != false) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C43102Dw
            if (r0 == 0) goto L_0x0067
            r6 = r10
            X.2Dw r6 = (X.C43102Dw) r6
            com.whatsapp.ListItemWithLeftIcon r2 = r6.A01
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x0066
            X.1CR r1 = r6.A04
            X.11F r0 = r6.A03
            X.3LI r7 = X.C36361kB.A0d(r0, r1)
            r0 = 2131431846(0x7f0b11a6, float:1.8485433E38)
            android.view.View r1 = X.C36361kB.A0G(r2, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 2131431244(0x7f0b0f4c, float:1.8484212E38)
            android.widget.TextView r5 = X.C36341k9.A0M(r2, r0)
            r0 = 8
            r5.setVisibility(r0)
            boolean r0 = r7.A09()
            r1.setChecked(r0)
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0066
            long r3 = r7.A05
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            X.0wo r0 = r7.A0M
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            long r3 = r7.A05
        L_0x004d:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
        L_0x0059:
            r0 = 0
            r5.setVisibility(r0)
            X.0ts r0 = r6.A02
            java.lang.String r0 = X.AnonymousClass3UY.A09(r0, r3)
            r5.setText(r0)
        L_0x0066:
            return
        L_0x0067:
            X.1CR r0 = r10.A0B
            X.11F r3 = r10.A03
            X.3LI r9 = X.C36361kB.A0d(r3, r0)
            com.whatsapp.ListItemWithLeftIcon r2 = r10.A06
            r0 = 2131431247(0x7f0b0f4f, float:1.8484218E38)
            android.widget.TextView r8 = X.C36341k9.A0M(r2, r0)
            r0 = 2131431244(0x7f0b0f4c, float:1.8484212E38)
            android.widget.TextView r6 = X.C36341k9.A0M(r2, r0)
            r0 = 2131431846(0x7f0b11a6, float:1.8485433E38)
            android.view.View r5 = r2.findViewById(r0)
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            if (r5 != 0) goto L_0x0090
            android.content.Context r0 = r10.A00
            com.whatsapp.wds.components.toggle.WDSSwitch r5 = X.C53462rM.A00(r0, r2)
        L_0x0090:
            X.12q r1 = r10.A0A
            X.0v0 r0 = r10.A08
            boolean r4 = X.AnonymousClass1DH.A02(r0, r1, r3)
            r7 = 0
            r5.setOnCheckedChangeListener(r7)
            r3 = 8
            r6.setVisibility(r3)
            r1 = 2
            X.2i5 r0 = new X.2i5
            r0.<init>(r1, r10, r4)
            r2.setOnClickListener(r0)
            r0 = 2131886151(0x7f120047, float:1.9406873E38)
            if (r4 == 0) goto L_0x00b2
            r0 = 2131886519(0x7f1201b7, float:1.940762E38)
        L_0x00b2:
            X.C33521fV.A03(r2, r0)
            android.content.Context r2 = r10.A00
            r0 = 2131101126(0x7f0605c6, float:1.7814653E38)
            if (r4 != 0) goto L_0x00c6
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
        L_0x00c6:
            X.C36331k8.A0r(r2, r8, r0)
            if (r4 != 0) goto L_0x00d4
            X.14p r1 = r10.A02
            r0 = 2131886193(0x7f120071, float:1.9406958E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x00d4:
            r5.setContentDescription(r7)
            r0 = r4 ^ 1
            r5.setEnabled(r0)
            r5.setClickable(r0)
            r7 = 0
            if (r4 != 0) goto L_0x00e9
            boolean r1 = r9.A0A()
            r0 = 0
            if (r1 == 0) goto L_0x00ea
        L_0x00e9:
            r0 = 1
        L_0x00ea:
            r5.setChecked(r0)
            if (r4 != 0) goto L_0x0066
            boolean r0 = r9.A0A()
            if (r0 == 0) goto L_0x0117
            long r3 = r9.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0105
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0111
        L_0x0105:
            r6.setVisibility(r7)
            X.0ts r0 = r10.A09
            java.lang.String r0 = X.AnonymousClass3UY.A09(r0, r3)
            r6.setText(r0)
        L_0x0111:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r10.A05
            r5.setOnCheckedChangeListener(r0)
            return
        L_0x0117:
            r6.setVisibility(r3)
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FH.A00():void");
    }

    public AnonymousClass3FH(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, ListItemWithLeftIcon listItemWithLeftIcon, AnonymousClass1X4 r6, C19970wo r7, C19420v0 r8, C18820ts r9, C220412q r10, AnonymousClass11F r11, AnonymousClass1CR r12, AnonymousClass00S r13) {
        C36321k7.A1B(r7, r9, r10, r12, r6);
        C36321k7.A13(r8, listItemWithLeftIcon, onCheckedChangeListener);
        AnonymousClass00C.A0D(r11, 9);
        this.A07 = r7;
        this.A09 = r9;
        this.A0A = r10;
        this.A0B = r12;
        this.A01 = r6;
        this.A08 = r8;
        this.A06 = listItemWithLeftIcon;
        this.A05 = onCheckedChangeListener;
        this.A03 = r11;
        this.A00 = context;
        this.A04 = r13;
        Activity A002 = C24801Dv.A00(context);
        AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.WaBaseAppCompatActivity");
        this.A02 = (C224914p) A002;
    }
}
