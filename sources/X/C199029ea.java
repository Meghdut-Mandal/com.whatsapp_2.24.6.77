package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9ea  reason: invalid class name and case insensitive filesystem */
public class C199029ea {
    public String A00;
    public final Runnable A01;
    public final Context A02;
    public final C225014r A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final A8P A06;
    public final AnonymousClass1EV A07;
    public final AnonymousClass1EU A08;
    public final C167527yC A09;
    public final Runnable A0A;
    public final boolean A0B;

    public void A01(AnonymousClass11F r20, AnonymousClass3T1 r21, String str, String str2, int i, boolean z) {
        AnonymousClass17Y r3;
        Context context;
        int i2;
        int i3 = i;
        if (i3 == 5) {
            r3 = this.A04;
            context = this.A02;
            i2 = R.string.f12nameremoved;
        } else if (i3 == 3) {
            r3 = this.A04;
            context = this.A02;
            i2 = R.string.f12nameremoved;
        } else if (i3 == 1) {
            r3 = this.A04;
            context = this.A02;
            i2 = R.string.f12nameremoved;
        } else {
            AnonymousClass17Y r7 = this.A04;
            AnonymousClass1EU r8 = this.A08;
            AnonymousClass11F r13 = r20;
            AnonymousClass3T1 r15 = r21;
            String str3 = str;
            String str4 = str2;
            boolean z2 = z;
            String str5 = str4;
            C199549fV r4 = new C199549fV(this.A02, this.A03, r7, r8, this.A09, new AVp(r13, this, r15, str3, str5, z2), new C1497372o(this, 16), this.A0B);
            UserJid A0b = C36401kF.A0b(r13);
            if (A0b == null || !r4.A02()) {
                A00(r13, this, r15, str3, str5, z2);
                return;
            } else {
                r4.A01(A0b, new B9Z(this, 1), str4);
                return;
            }
        }
        r3.A0E(context.getString(i2), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r11.A05.A0M(r12.A0M.A0E) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass11F r10, X.C199029ea r11, X.AnonymousClass3T1 r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            if (r12 == 0) goto L_0x0019
            X.9lY r0 = r12.A0M
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0019
            X.0wQ r1 = r11.A05
            X.9lY r0 = r12.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0M(r0)
            r6 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r6 = 0
        L_0x001a:
            X.1EV r9 = r11.A07
            X.A8P r0 = r11.A06
            android.content.Context r3 = r11.A02
            java.lang.String r1 = r11.A00
            r4 = 0
            android.content.Intent r2 = r0.A01(r3, r6, r4)
            X.C165597tg.A0z(r2, r14)
            java.lang.String r0 = "extra_payment_note"
            r2.putExtra(r0, r13)
            java.lang.String r8 = "upiHandle"
            java.lang.String r7 = "extra_payment_handle"
            if (r12 == 0) goto L_0x00ac
            java.lang.String r0 = "extra_conversation_message_type"
            r5 = 2
            r2.putExtra(r0, r5)
            X.11F r0 = r12.A0J()
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            int r0 = r9.A06(r1)
            if (r0 != r5) goto L_0x006b
            java.lang.String r1 = X.AnonymousClass143.A03(r1)
            java.lang.String r0 = "extra_receiver_jid"
            r2.putExtra(r0, r1)
            X.9lY r0 = r12.A0M
            if (r0 == 0) goto L_0x006b
            X.8av r0 = r0.A0A
            if (r0 == 0) goto L_0x006b
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = r0.A0F()
            X.6c7 r0 = X.C165617ti.A0P(r5, r1, r0, r8)
            r2.putExtra(r7, r0)
        L_0x006b:
            long r0 = r12.A1N
            java.lang.String r5 = "extra_quoted_msg_row_id"
            r2.putExtra(r5, r0)
            if (r6 == 0) goto L_0x0093
            X.3Qa r0 = r12.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_request_message_key"
            r2.putExtra(r0, r1)
            X.9lY r0 = r12.A0M
            X.C18740tg.A06(r0)
            X.16X r0 = r0.A08
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_amount"
            r2.putExtra(r0, r1)
            r2.putExtra(r5, r4)
        L_0x0093:
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            r2.putExtra(r0, r15)
            java.lang.String r1 = r10.getRawString()
            java.lang.String r0 = "extra_jid"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            java.lang.Runnable r0 = r11.A0A
            if (r0 == 0) goto L_0x00ab
            r0.run()
        L_0x00ab:
            return
        L_0x00ac:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0093
            X.6c7 r0 = X.C165577te.A0T(r1, r8)
            r2.putExtra(r7, r0)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199029ea.A00(X.11F, X.9ea, X.3T1, java.lang.String, java.lang.String, boolean):void");
    }

    public C199029ea(Context context, C225014r r2, AnonymousClass17Y r3, C19730wQ r4, A8P a8p, AnonymousClass1EV r6, AnonymousClass1EU r7, C167527yC r8, Runnable runnable, Runnable runnable2, boolean z) {
        this.A02 = context;
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r2;
        this.A08 = r7;
        this.A07 = r6;
        this.A09 = r8;
        this.A06 = a8p;
        this.A0B = z;
        this.A0A = runnable;
        this.A01 = runnable2;
    }
}
