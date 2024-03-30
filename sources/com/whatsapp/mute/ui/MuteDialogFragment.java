package com.whatsapp.mute.ui;

import X.AnonymousClass00T;
import X.AnonymousClass17Y;
import X.AnonymousClass4CM;
import X.AnonymousClass4CN;
import X.AnonymousClass4CO;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C19420v0;
import X.C19770wU;
import X.C36441kJ;
import X.C85184Gc;
import X.C85194Gd;
import android.content.DialogInterface;

public final class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public AnonymousClass17Y A00;
    public C19420v0 A01;
    public C19770wU A02;
    public boolean A03;
    public final AnonymousClass00T A04;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r6 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0140, code lost:
        if (r1 == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 != true) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r19) {
        /*
            r18 = this;
            r2 = r18
            android.os.Bundle r1 = r2.A0A
            r3 = 0
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "mute_in_conversation_fragment"
            boolean r5 = r1.getBoolean(r0)
        L_0x000d:
            android.os.Bundle r0 = r2.A0A
            java.lang.String r7 = "jid"
            r6 = 1
            if (r0 == 0) goto L_0x001b
            boolean r1 = r0.containsKey(r7)
            r0 = 1
            if (r1 == r6) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r4 = 0
            if (r0 == 0) goto L_0x008f
            X.13q r1 = X.AnonymousClass11F.A00
            android.os.Bundle r0 = r2.A0A
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.getString(r7)
        L_0x0029:
            X.11F r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0033
            java.util.List r4 = X.C36371kC.A11(r0)
        L_0x0033:
            android.os.Bundle r1 = r2.A0A
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "mute_entry_point"
            int r1 = r1.getInt(r0)
            X.2oi[] r0 = X.C51992oi.values()
            java.lang.Object r6 = X.AnonymousClass02R.A08(r0, r1)
            X.2oi r6 = (X.C51992oi) r6
            if (r6 != 0) goto L_0x004b
        L_0x0049:
            X.2oi r6 = X.C51992oi.CHAT_LIST_SCREEN
        L_0x004b:
            android.os.Bundle r1 = r2.A0A
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "is_mute_call"
            boolean r3 = r1.getBoolean(r0)
        L_0x0055:
            r2.A03 = r3
            X.00T r0 = r2.A04
            r17 = r0
            java.lang.Object r7 = r17.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r7 = (com.whatsapp.mute.ui.MuteDialogViewModel) r7
            boolean r3 = r2.A03
            r7.A02 = r4
            r7.A04 = r5
            r7.A00 = r6
            r7.A03 = r3
            X.0v0 r0 = r7.A09
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            if (r3 == 0) goto L_0x008a
            java.lang.String r0 = "last_mute_call_selection"
        L_0x0075:
            int r6 = X.C36371kC.A01(r1, r0)
            X.2pb[] r5 = X.C52542pb.values()
            int r4 = r5.length
            r3 = 0
        L_0x007f:
            if (r3 >= r4) goto L_0x00c4
            r1 = r5[r3]
            int r0 = r1.id
            if (r0 == r6) goto L_0x00c6
            int r3 = r3 + 1
            goto L_0x007f
        L_0x008a:
            java.lang.String r0 = "last_mute_selection"
            goto L_0x0075
        L_0x008d:
            r0 = r4
            goto L_0x0029
        L_0x008f:
            android.os.Bundle r0 = r2.A0A
            java.lang.String r1 = "jids"
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.containsKey(r1)
            if (r0 != r6) goto L_0x0033
            android.os.Bundle r0 = r2.A0A
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x00ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            X.11F r0 = X.C36421kH.A0N(r0)
            if (r0 == 0) goto L_0x00ad
            r4.add(r0)
            goto L_0x00ad
        L_0x00c1:
            r5 = 0
            goto L_0x000d
        L_0x00c4:
            X.2pb r1 = X.C52542pb.A02
        L_0x00c6:
            r7.A01 = r1
            X.1qm r7 = X.AnonymousClass3LW.A05(r2)
            r0 = 2131891193(0x7f1213f9, float:1.94171E38)
            r7.A0L(r0)
            r3 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 39
            X.4XN r0 = new X.4XN
            r0.<init>(r2, r1)
            r7.setPositiveButton(r3, r0)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 38
            X.4XN r0 = new X.4XN
            r0.<init>(r2, r1)
            r7.setNegativeButton(r3, r0)
            android.view.LayoutInflater r3 = X.C36381kD.A0J(r2)
            r0 = 2131625580(0x7f0e066c, float:1.8878372E38)
            r1 = 0
            android.view.View r6 = X.C36361kB.A0E(r3, r1, r0)
            r0 = 2131429502(0x7f0b087e, float:1.8480679E38)
            android.widget.TextView r8 = X.C36391kE.A0O(r6, r0)
            android.content.Context r5 = r2.A1D()
            if (r5 == 0) goto L_0x0149
            java.lang.Object r9 = r17.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r9 = (com.whatsapp.mute.ui.MuteDialogViewModel) r9
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x01e2
            java.util.List r0 = r9.A02
            r3 = 1
            r1 = 0
            if (r0 == 0) goto L_0x01e2
            int r0 = r0.size()
            if (r0 != r3) goto L_0x01e2
            X.13q r0 = X.AnonymousClass11F.A00
            java.util.List r0 = r9.A02
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r0.get(r1)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
        L_0x0127:
            X.144 r4 = X.AnonymousClass6H4.A00(r0)
            if (r4 == 0) goto L_0x0142
            X.0yC r3 = r9.A0C
            X.0wQ r1 = r9.A06
            X.17X r0 = r9.A0B
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r4)
            boolean r1 = X.C34681hT.A0C(r1, r3, r0)
            r0 = 2131891204(0x7f121404, float:1.9417121E38)
            if (r1 != 0) goto L_0x0145
        L_0x0142:
            r0 = 2131891192(0x7f1213f8, float:1.9417097E38)
        L_0x0145:
            java.lang.CharSequence r1 = r5.getText(r0)
        L_0x0149:
            r8.setText(r1)
            r0 = 2131431845(0x7f0b11a5, float:1.848543E38)
            android.view.View r5 = X.C36361kB.A0G(r6, r0)
            android.widget.RadioGroup r5 = (android.widget.RadioGroup) r5
            X.2pb[] r9 = X.C52542pb.values()
            int r0 = r9.length
            r16 = r0
            r10 = 0
        L_0x015d:
            r0 = r16
            if (r10 >= r0) goto L_0x01ec
            r13 = r9[r10]
            java.lang.Object r0 = r17.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            X.2pb r0 = r0.A01
            boolean r12 = X.C36361kB.A1a(r13, r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r2)
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r11 = X.C36441kJ.A05(r1, r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r2)
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
            int r8 = X.C36441kJ.A05(r1, r0)
            android.content.Context r0 = r2.A1D()
            android.widget.RadioButton r4 = new android.widget.RadioButton
            r4.<init>(r0)
            int r0 = X.AnonymousClass04F.A00()
            r4.setId(r0)
            int r15 = r13.ordinal()
            r14 = 2
            r3 = 1
            r1 = 1
            r0 = 0
            if (r15 == r0) goto L_0x01d2
            if (r15 == r3) goto L_0x01d7
            if (r15 != r14) goto L_0x01e7
            X.0ts r3 = r2.A01
            r1 = -1
            r0 = 7
            java.lang.String r0 = X.AnonymousClass3UY.A03(r3, r1, r0)
        L_0x01ab:
            X.AnonymousClass00C.A08(r0)
            r4.setText(r0)
            r4.setChecked(r12)
            java.lang.String r0 = r13.name()
            r4.setTag(r0)
            r3 = -1
            r0 = -2
            android.widget.RadioGroup$LayoutParams r1 = new android.widget.RadioGroup$LayoutParams
            r1.<init>(r3, r0)
            r0 = 0
            r1.setMargins(r0, r11, r0, r11)
            r4.setLayoutParams(r1)
            r4.setPaddingRelative(r8, r0, r0, r0)
            r5.addView(r4)
            int r10 = r10 + 1
            goto L_0x015d
        L_0x01d2:
            X.0ts r0 = r2.A01
            r1 = 8
            goto L_0x01da
        L_0x01d7:
            X.0ts r0 = r2.A01
            r14 = 4
        L_0x01da:
            java.lang.String r0 = X.AnonymousClass3UY.A03(r0, r1, r14)
            goto L_0x01ab
        L_0x01df:
            r0 = 0
            goto L_0x0127
        L_0x01e2:
            r0 = 2131891194(0x7f1213fa, float:1.9417101E38)
            goto L_0x0145
        L_0x01e7:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x01ec:
            r1 = 2
            X.4XE r0 = new X.4XE
            r0.<init>(r2, r5, r1)
            r5.setOnCheckedChangeListener(r0)
            r7.setView(r6)
            X.0FM r0 = X.C36371kC.A0O(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mute.ui.MuteDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((MuteDialogViewModel) this.A04.getValue()).A0S();
    }

    public MuteDialogFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass4CN(new AnonymousClass4CM(this)));
        C019308f A1A = C36441kJ.A1A(MuteDialogViewModel.class);
        this.A04 = C36441kJ.A0a(new AnonymousClass4CO(A002), new C85194Gd(this, A002), new C85184Gc(A002), A1A);
    }
}
