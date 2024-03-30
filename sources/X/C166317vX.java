package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.List;

/* renamed from: X.7vX  reason: invalid class name and case insensitive filesystem */
public class C166317vX extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x010b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r2 = 0
            r5 = 0
            if (r11 != 0) goto L_0x0162
            android.view.LayoutInflater r1 = r9.A01
            r0 = 2131625095(0x7f0e0487, float:1.8877388E38)
            android.view.View r11 = r1.inflate(r0, r12, r5)
            X.9Mi r0 = new X.9Mi
            r0.<init>()
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r1 = r9.A02
            X.1LI r3 = r1.A00
            r1 = 2131431865(0x7f0b11b9, float:1.8485471E38)
            X.3SF r1 = X.AnonymousClass3SF.A01(r11, r3, r1)
            r0.A03 = r1
            r1 = 2131427833(0x7f0b01f9, float:1.8477293E38)
            android.widget.ImageView r1 = X.C36391kE.A0N(r11, r1)
            r0.A01 = r1
            r1 = 2131433701(0x7f0b18e5, float:1.8489195E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36401kF.A0P(r11, r1)
            r0.A00 = r1
            r1 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r11, r1)
            r0.A02 = r1
            r11.setTag(r0)
        L_0x003d:
            X.3SF r1 = r0.A03
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            r1.setText(r2)
            X.3SF r6 = r0.A03
            android.content.Context r4 = r9.getContext()
            android.content.Context r3 = r9.getContext()
            r2 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r1 = 2131101134(0x7f0605ce, float:1.781467E38)
            int r1 = X.C224514j.A00(r3, r2, r1)
            int r2 = X.AnonymousClass00F.A00(r4, r1)
            com.whatsapp.TextEmojiLabel r1 = r6.A01
            r1.setTextColor(r2)
            X.3SF r1 = r0.A03
            r2 = 1065353216(0x3f800000, float:1.0)
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            r1.setAlpha(r2)
            com.whatsapp.TextEmojiLabel r1 = r0.A00
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A02
            r1.setVisibility(r2)
            android.widget.TextView r2 = r0.A02
            r1 = 2131892105(0x7f121789, float:1.9418949E38)
            r2.setText(r1)
            java.util.List r1 = r9.A00
            java.lang.Object r3 = r1.get(r10)
            X.9IB r3 = (X.AnonymousClass9IB) r3
            X.C18740tg.A06(r3)
            X.141 r7 = r3.A00
            r0.A04 = r3
            X.3SF r1 = r0.A03
            r1.A05(r7)
            android.widget.ImageView r6 = r0.A01
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            android.content.Context r1 = r9.getContext()
            X.3CG r2 = new X.3CG
            r2.<init>(r1)
            r1 = 2131897109(0x7f122b15, float:1.9429098E38)
            java.lang.String r1 = r2.A02(r1)
            r4.append(r1)
            X.11F r1 = r7.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r1)
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r4)
            X.C011004s.A08(r6, r1)
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = r9.A02
            X.1RY r2 = r6.A05
            android.widget.ImageView r1 = r0.A01
            r2.A08(r1, r7)
            android.widget.ImageView r2 = r0.A01
            r1 = 15
            X.AnonymousClass3YM.A00(r2, r9, r7, r0, r1)
            X.1EV r2 = r6.A0A
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r7.A06(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            int r1 = r2.A06(r1)
            r8 = 2
            if (r1 == r8) goto L_0x010c
            X.3SF r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A02
            r1.setVisibility(r5)
            X.3IL r1 = r7.A0F
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fb
            android.widget.TextView r2 = r0.A02
            r1 = 2131888243(0x7f120873, float:1.9411116E38)
        L_0x00f8:
            r2.setText(r1)
        L_0x00fb:
            java.lang.String r1 = r7.A0a
            if (r1 == 0) goto L_0x010b
            X.3IL r1 = r7.A0F
            if (r1 == 0) goto L_0x016a
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x016a
        L_0x010b:
            return r11
        L_0x010c:
            X.1NG r2 = r6.A01
            com.whatsapp.jid.Jid r1 = r7.A06(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0O(r1)
            if (r1 == 0) goto L_0x012e
            X.3SF r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A02
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A02
            r1 = 2131895184(0x7f122390, float:1.9425194E38)
            goto L_0x00f8
        L_0x012e:
            X.0yC r2 = r6.A0D
            r1 = 544(0x220, float:7.62E-43)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x00fb
            X.8ax r2 = r3.A01
            X.1EU r1 = r6.A0B
            X.B66 r1 = r1.A05()
            X.9Md r1 = r1.BFa()
            if (r1 == 0) goto L_0x00fb
            if (r2 == 0) goto L_0x00fb
            X.9bx r1 = X.C175728ax.A02(r2)
            long r3 = r1.A00
            r1 = 12
            long r3 = r3 >> r1
            r1 = 15
            long r3 = r3 & r1
            int r1 = (int) r3
            if (r1 != r8) goto L_0x00fb
            android.widget.TextView r1 = r0.A02
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A02
            r1 = 2131892462(0x7f1218ee, float:1.9419673E38)
            goto L_0x00f8
        L_0x0162:
            java.lang.Object r0 = r11.getTag()
            X.9Mi r0 = (X.C193659Mi) r0
            goto L_0x003d
        L_0x016a:
            com.whatsapp.TextEmojiLabel r1 = r0.A00
            r1.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r1 = r0.A00
            X.171 r0 = r6.A04
            java.lang.String r0 = r0.A0N(r7)
            r1.A0I(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166317vX.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166317vX(Context context, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = C36441kJ.A15(list);
    }

    public int getCount() {
        return C90484aE.A0F(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }
}
