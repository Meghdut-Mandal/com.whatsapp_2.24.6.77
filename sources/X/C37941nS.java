package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.1nS  reason: invalid class name and case insensitive filesystem */
public class C37941nS extends BaseAdapter {
    public final /* synthetic */ MessageDetailsActivity A00;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C37941nS(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public int getCount() {
        MessageDetailsActivity messageDetailsActivity = this.A00;
        if (MessageDetailsActivity.A07(messageDetailsActivity)) {
            return messageDetailsActivity.A0X.size();
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0185, code lost:
        if (r8 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018c, code lost:
        if (r8 != null) goto L_0x00fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
            r15 = this;
            r4 = r17
            r10 = 0
            if (r17 != 0) goto L_0x0014
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r15.A00
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625526(0x7f0e0636, float:1.8878262E38)
            r2 = r18
            android.view.View r4 = r1.inflate(r0, r2, r10)
        L_0x0014:
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r3 = r15.A00
            java.util.ArrayList r5 = r3.A0X
            java.lang.Object r2 = r5.get(r10)
            X.3IC r2 = (X.AnonymousClass3IC) r2
            r6 = 0
            java.lang.Integer r1 = r2.A02()
            java.lang.Integer r0 = X.C023109s.A0C
            boolean r0 = X.C36361kB.A1a(r0, r1)
            r7 = 1
            if (r0 == 0) goto L_0x003b
            int r0 = r5.size()
            if (r0 <= r7) goto L_0x003b
            r6 = r2
            X.2JB r6 = (X.AnonymousClass2JB) r6
            java.lang.Object r2 = r5.get(r7)
            X.3IC r2 = (X.AnonymousClass3IC) r2
        L_0x003b:
            X.3Q6 r8 = r2.A00
            r0 = 2131433718(0x7f0b18f6, float:1.848923E38)
            android.view.View r5 = X.C012005e.A02(r4, r0)
            X.3T1 r0 = r3.A0P
            boolean r0 = X.C66013Ui.A0a(r0)
            r1 = 8
            if (r0 == 0) goto L_0x019e
            r0 = 2131432765(0x7f0b153d, float:1.8487297E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r5, r0)
            r0 = 2131432764(0x7f0b153c, float:1.8487295E38)
            android.widget.ImageView r9 = X.C36401kF.A0G(r5, r0)
            r5.setVisibility(r10)
            X.3T1 r0 = r3.A0P
            X.3NZ r7 = X.AnonymousClass3NZ.A00(r0, r7)
            int r0 = r7.A02
            r2.setText(r0)
            android.content.Context r5 = r4.getContext()
            int r2 = r7.A01
            int r0 = r7.A00
            X.AnonymousClass3UF.A0B(r5, r9, r2, r0)
        L_0x0075:
            r0 = 2131434746(0x7f0b1cfa, float:1.8491315E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r4, r0)
            X.3T1 r0 = r3.A0P
            int r0 = r0.A1I
            if (r0 != 0) goto L_0x0190
            r2 = 2131891063(0x7f121377, float:1.9416835E38)
        L_0x0085:
            r5.setText(r2)
            r0 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r4, r0)
            r0 = 2131429381(0x7f0b0805, float:1.8480433E38)
            android.widget.TextView r12 = X.C36391kE.A0P(r4, r0)
            r0 = 2131429390(0x7f0b080e, float:1.8480451E38)
            android.widget.TextView r10 = X.C36391kE.A0P(r4, r0)
            r0 = 2131429387(0x7f0b080b, float:1.8480445E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r4, r0)
            r0 = 2131430401(0x7f0b0c01, float:1.8482502E38)
            r4.findViewById(r0)
            r0 = 2131429384(0x7f0b0808, float:1.848044E38)
            android.widget.TextView r7 = X.C36391kE.A0O(r4, r0)
            r0 = 2131433717(0x7f0b18f5, float:1.8489228E38)
            android.view.View r2 = X.C012005e.A02(r4, r0)
            r0 = 2131429492(0x7f0b0874, float:1.8480658E38)
            android.view.View r11 = r4.findViewById(r0)
            r0 = 2131427975(0x7f0b0287, float:1.8477581E38)
            X.C36341k9.A10(r4, r0, r1)
            r0 = 2131430400(0x7f0b0c00, float:1.84825E38)
            android.view.View r0 = r4.findViewById(r0)
            r11.setVisibility(r1)
            r0.setVisibility(r1)
            X.3T1 r0 = r3.A0P
            long r0 = r0.A0I
            X.C36391kE.A1L(r9, r3, r0)
            java.lang.String r9 = "—"
            if (r8 == 0) goto L_0x0182
            r0 = 5
            long r0 = r8.A01(r0)
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0182
            X.C36391kE.A1L(r12, r3, r0)
        L_0x00eb:
            r0 = 13
            long r0 = r8.A01(r0)
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0189
            X.C36391kE.A1L(r10, r3, r0)
        L_0x00fa:
            r10 = 0
            long r0 = r8.A01
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0118
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0118
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x010c
            r0 = 0
        L_0x010c:
            X.0wo r9 = r3.A07
            X.0ts r8 = r3.A00
            long r0 = r9.A08(r0)
            java.lang.String r9 = X.AnonymousClass3UY.A0B(r8, r0)
        L_0x0118:
            r5.setText(r9)
            if (r6 == 0) goto L_0x017f
            long r0 = r6.A00
            r8 = 0
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x017f
            r5 = 2131431100(0x7f0b0ebc, float:1.848392E38)
            android.widget.TextView r10 = X.C36391kE.A0P(r4, r5)
            X.3T1 r5 = r3.A0P
            X.2bc r8 = r5.A1U
            X.3Qa r5 = r8.A1J
            boolean r11 = r5.A02
            X.16D r6 = r3.A0C
            com.whatsapp.jid.UserJid r5 = r8.A0L()
            X.141 r9 = r6.A0D(r5)
            X.3T1 r5 = r3.A0P
            X.3Qa r5 = r5.A1J
            X.11F r5 = r5.A00
            boolean r5 = X.AnonymousClass143.A0G(r5)
            int r8 = X.C36391kE.A00(r5)
            X.171 r6 = r3.A0E
            r5 = 0
            java.lang.String r9 = r6.A0R(r9, r8, r5)
            X.0wG r5 = r3.A0J
            android.content.res.Resources r8 = X.C36421kH.A0B(r5)
            if (r11 != 0) goto L_0x0177
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x0177
            r6 = 2131890656(0x7f1211e0, float:1.941601E38)
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r9)
            java.lang.String r5 = r8.getString(r6, r5)
        L_0x016c:
            r10.setText(r5)
            X.C36391kE.A1L(r7, r3, r0)
            r0 = 0
        L_0x0173:
            r2.setVisibility(r0)
            return r4
        L_0x0177:
            r5 = 2131890659(0x7f1211e3, float:1.9416016E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x016c
        L_0x017f:
            r0 = 8
            goto L_0x0173
        L_0x0182:
            r12.setText(r9)
            if (r8 == 0) goto L_0x0189
            goto L_0x00eb
        L_0x0189:
            r10.setText(r9)
            if (r8 == 0) goto L_0x0118
            goto L_0x00fa
        L_0x0190:
            boolean r0 = X.C66013Ui.A0K(r0)
            r2 = 2131891067(0x7f12137b, float:1.9416844E38)
            if (r0 == 0) goto L_0x0085
            r2 = 2131891071(0x7f12137f, float:1.9416852E38)
            goto L_0x0085
        L_0x019e:
            r5.setVisibility(r1)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37941nS.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
