package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1nX  reason: invalid class name and case insensitive filesystem */
public class C37991nX extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C37991nX(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.view.View r36, int r37) {
        /*
            r35 = this;
            r34 = r35
            r0 = r34
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r5 = r0.A02
            java.util.ArrayList r13 = r5.A0X
            r7 = r37
            java.lang.Object r4 = r13.get(r7)
            X.3IC r4 = (X.AnonymousClass3IC) r4
            r0 = 2131433715(0x7f0b18f3, float:1.8489224E38)
            r6 = r36
            android.view.View r2 = r6.findViewById(r0)
            r14 = 1
            r15 = 13
            r1 = 5
            r12 = 0
            r10 = 8
            r9 = 0
            if (r37 == 0) goto L_0x0289
            int r11 = r4.A00()
            int r0 = r37 + -1
            java.lang.Object r0 = r13.get(r0)
            X.3IC r0 = (X.AnonymousClass3IC) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x0289
            java.lang.Integer r3 = r4.A02()
            java.lang.Integer r0 = X.C023109s.A0C
            if (r0 == r3) goto L_0x0289
            r27 = 0
            r2.setVisibility(r10)
        L_0x0042:
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r26 = r6.findViewById(r0)
            int r0 = r13.size()
            int r0 = r0 - r14
            if (r7 == r0) goto L_0x027c
            int r0 = r37 + 1
            java.lang.Object r0 = r13.get(r0)
            X.3IC r0 = (X.AnonymousClass3IC) r0
            int r0 = r0.A00()
            if (r11 != r0) goto L_0x027c
            r1 = 2131233426(0x7f080a92, float:1.808299E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r9)
        L_0x0070:
            r0 = 2131429089(0x7f0b06e1, float:1.847984E38)
            android.widget.ImageView r13 = X.C36391kE.A0N(r6, r0)
            X.1LI r1 = r5.A09
            r0 = 2131432895(0x7f0b15bf, float:1.848756E38)
            X.3SF r12 = X.AnonymousClass3SF.A01(r6, r1, r0)
            r0 = 2131433700(0x7f0b18e4, float:1.8489193E38)
            com.whatsapp.TextEmojiLabel r9 = X.C36401kF.A0P(r6, r0)
            r0 = 2131433252(0x7f0b1724, float:1.8488284E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r6, r0)
            r0 = 2131429382(0x7f0b0806, float:1.8480435E38)
            android.view.View r10 = r6.findViewById(r0)
            r0 = 2131429391(0x7f0b080f, float:1.8480453E38)
            android.view.View r25 = r6.findViewById(r0)
            r0 = 2131429388(0x7f0b080c, float:1.8480447E38)
            android.view.View r24 = r6.findViewById(r0)
            r0 = 2131429385(0x7f0b0809, float:1.8480441E38)
            android.view.View r8 = X.C012005e.A02(r6, r0)
            r0 = 2131429381(0x7f0b0805, float:1.8480433E38)
            android.widget.TextView r23 = X.C36391kE.A0P(r6, r0)
            r0 = 2131429390(0x7f0b080e, float:1.8480451E38)
            android.widget.TextView r22 = X.C36391kE.A0P(r6, r0)
            r0 = 2131429387(0x7f0b080b, float:1.8480445E38)
            android.widget.TextView r21 = X.C36391kE.A0P(r6, r0)
            r0 = 2131429384(0x7f0b0808, float:1.848044E38)
            android.widget.TextView r20 = X.C36391kE.A0O(r6, r0)
            r0 = 2131429383(0x7f0b0807, float:1.8480437E38)
            android.view.View r19 = r6.findViewById(r0)
            r0 = 2131429392(0x7f0b0810, float:1.8480455E38)
            android.view.View r18 = r6.findViewById(r0)
            r0 = 2131429389(0x7f0b080d, float:1.848045E38)
            android.view.View r17 = r6.findViewById(r0)
            r0 = 2131429386(0x7f0b080a, float:1.8480443E38)
            android.view.View r16 = X.C012005e.A02(r6, r0)
            r15 = 8
            r1 = r25
            r0 = r24
            X.C36361kB.A15(r10, r1, r0, r15)
            r1 = r19
            r0 = r18
            X.C36361kB.A15(r8, r1, r0, r15)
            r0 = r17
            r0.setVisibility(r15)
            r0 = r16
            r0.setVisibility(r15)
            java.lang.Integer r0 = X.C023109s.A01
            if (r0 != r3) goto L_0x012f
            r0 = 0
            r2.setVisibility(r0)
            r13.setVisibility(r15)
            com.whatsapp.TextEmojiLabel r0 = r12.A01
            r0.setVisibility(r15)
            r9.setVisibility(r15)
            X.2JC r4 = (X.AnonymousClass2JC) r4
            X.0ts r7 = r5.A00
            r5 = 2131755264(0x7f100100, float:1.9141402E38)
            int r1 = r4.A00
            long r3 = (long) r1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            X.AnonymousClass000.A1J(r0, r1)
            java.lang.String r0 = r7.A0L(r0, r5, r3)
            r2.setText(r0)
            r2 = 0
            r6.setTag(r2)
        L_0x0129:
            r0 = r26
            r0.setOnClickListener(r2)
            return
        L_0x012f:
            X.16D r0 = r5.A0C
            com.whatsapp.jid.UserJid r1 = r4.A01
            X.141 r3 = r0.A0D(r1)
            X.171 r14 = r5.A0E
            X.3T1 r0 = r5.A0P
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            int r0 = r14.A0A(r0)
            r2.setVisibility(r15)
            r2 = 0
            r13.setVisibility(r2)
            X.1RY r14 = r5.A0F
            r14.A0B(r13, r3, r2)
            r14 = 0
            com.whatsapp.TextEmojiLabel r13 = r12.A01
            r13.setVisibility(r2)
            if (r27 == 0) goto L_0x0265
            com.whatsapp.jid.PhoneUserJid r2 = X.C36411kG.A0j(r5)
            boolean r1 = r1.equals(r2)
            r15 = 0
            if (r1 == 0) goto L_0x0251
            android.content.Context r2 = r12.A00
            r1 = 2131890660(0x7f1211e4, float:1.9416018E38)
            java.lang.String r14 = r2.getString(r1)
        L_0x016b:
            r2 = 0
            r1 = 256(0x100, float:3.59E-43)
            r13.A0J(r14, r15, r1, r2)
            boolean r1 = r12.A0A(r3)
            r12.A03(r1)
        L_0x0178:
            X.171 r12 = r5.A0E
            r1 = 1
            X.34G r1 = r12.A0E(r3, r0, r2, r1)
            X.2ol r1 = r1.A00
            java.lang.String r1 = r12.A0G(r1, r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x024a
            r9.setVisibility(r2)
            r9.A0I(r1)
        L_0x0191:
            X.11F r1 = r3.A0H
            r0 = r34
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 5
            if (r1 == 0) goto L_0x020d
            long r0 = r4.A01(r0)
            r11 = 0
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x01b5
            r9 = r23
            X.C36391kE.A1L(r9, r5, r0)
            r10.setVisibility(r2)
            r0 = r19
            r0.setVisibility(r2)
        L_0x01b5:
            r0 = 13
            long r0 = r4.A01(r0)
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x01ce
            r9 = r22
            X.C36391kE.A1L(r9, r5, r0)
            r0 = r25
            r0.setVisibility(r2)
            r0 = r18
            r0.setVisibility(r2)
        L_0x01ce:
            r0 = 8
            long r0 = r4.A01(r0)
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x01e7
            r9 = r21
            X.C36391kE.A1L(r9, r5, r0)
            r0 = r24
            r0.setVisibility(r2)
            r0 = r17
            r0.setVisibility(r2)
        L_0x01e7:
            if (r27 == 0) goto L_0x01fe
            X.2JB r4 = (X.AnonymousClass2JB) r4
            long r0 = r4.A00
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x01fe
            r4 = r20
            X.C36391kE.A1L(r4, r5, r0)
            r8.setVisibility(r2)
            r0 = r16
            r0.setVisibility(r2)
        L_0x01fe:
            X.11F r0 = r3.A0H
            r6.setTag(r0)
            r1 = 4
            X.3YL r2 = new X.3YL
            r0 = r34
            r2.<init>(r0, r7, r1, r6)
            goto L_0x0129
        L_0x020d:
            if (r11 == r0) goto L_0x0240
            r0 = 8
            if (r11 == r0) goto L_0x0234
            r0 = 13
            if (r11 != r0) goto L_0x0225
            long r0 = r4.A01(r0)
            r9 = r22
            X.C36391kE.A1L(r9, r5, r0)
        L_0x0220:
            r10 = r25
        L_0x0222:
            r10.setVisibility(r2)
        L_0x0225:
            if (r27 == 0) goto L_0x01fe
            X.2JB r4 = (X.AnonymousClass2JB) r4
            long r0 = r4.A00
            r4 = r20
            X.C36391kE.A1L(r4, r5, r0)
            r8.setVisibility(r2)
            goto L_0x01fe
        L_0x0234:
            long r0 = r4.A01(r0)
            r9 = r21
            X.C36391kE.A1L(r9, r5, r0)
            r25 = r24
            goto L_0x0220
        L_0x0240:
            long r0 = r4.A01(r0)
            r9 = r23
            X.C36391kE.A1L(r9, r5, r0)
            goto L_0x0222
        L_0x024a:
            r0 = 8
            r9.setVisibility(r0)
            goto L_0x0191
        L_0x0251:
            boolean r2 = r12.A0A(r3)
            X.171 r1 = r12.A02
            if (r2 == 0) goto L_0x025f
            java.lang.String r14 = r1.A0S(r3, r14)
            goto L_0x016b
        L_0x025f:
            java.lang.String r14 = r1.A0R(r3, r0, r14)
            goto L_0x016b
        L_0x0265:
            X.171 r1 = r12.A02
            X.34G r29 = r1.A0C(r3, r0)
            boolean r33 = r12.A0A(r3)
            r31 = 0
            r28 = r12
            r30 = r3
            r32 = r0
            r28.A04(r29, r30, r31, r32, r33)
            goto L_0x0178
        L_0x027c:
            r1 = 2131233425(0x7f080a91, float:1.8082987E38)
            r0 = r26
            r0.setBackgroundResource(r1)
            r2.setVisibility(r10)
            goto L_0x0070
        L_0x0289:
            r2.setVisibility(r9)
            r0 = 2131433719(0x7f0b18f7, float:1.8489232E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r6, r0)
            r0 = 2131433716(0x7f0b18f4, float:1.8489226E38)
            android.widget.TextView r2 = X.C36391kE.A0P(r6, r0)
            int r11 = r4.A00()
            if (r11 == r1) goto L_0x0334
            if (r11 == r10) goto L_0x0320
            if (r11 != r15) goto L_0x02c1
            X.3T1 r0 = r5.A0P
            int r0 = r0.A1I
            if (r0 != 0) goto L_0x0313
            r1 = 2131891064(0x7f121378, float:1.9416837E38)
        L_0x02ad:
            r8.setText(r1)
            android.content.Context r15 = r6.getContext()
            r3 = 2131233220(0x7f0809c4, float:1.8082571E38)
            r0 = 2131101696(0x7f060800, float:1.7815809E38)
        L_0x02ba:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r15, r3, r0)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
        L_0x02c1:
            java.lang.Integer r3 = r4.A02()
            java.lang.Integer r0 = X.C023109s.A0C
            r27 = 0
            if (r0 != r3) goto L_0x0042
            r27 = 1
            X.3T1 r0 = r5.A0P
            X.2bc r0 = r0.A1U
            if (r0 == 0) goto L_0x02f0
            X.16D r1 = r5.A0C
            com.whatsapp.jid.UserJid r0 = r0.A0L()
            X.141 r15 = r1.A0D(r0)
            X.3T1 r0 = r5.A0P
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            int r1 = X.C36391kE.A00(r0)
            X.171 r0 = r5.A0E
            r0.A0R(r15, r1, r9)
        L_0x02f0:
            X.0wG r0 = r5.A0J
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131890658(0x7f1211e2, float:1.9416014E38)
            java.lang.String r0 = r1.getString(r0)
            r15 = 2131231808(0x7f080440, float:1.8079707E38)
            r1 = 2131101065(0x7f060589, float:1.781453E38)
            r8.setText(r0)
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r0, r15, r1)
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r12, r12, r12)
            goto L_0x0042
        L_0x0313:
            boolean r0 = X.C66013Ui.A0K(r0)
            r1 = 2131891068(0x7f12137c, float:1.9416846E38)
            if (r0 == 0) goto L_0x02ad
            r1 = 2131891069(0x7f12137d, float:1.9416848E38)
            goto L_0x02ad
        L_0x0320:
            X.3T1 r0 = r5.A0P
            X.3NZ r1 = X.AnonymousClass3NZ.A00(r0, r9)
            int r0 = r1.A02
            r8.setText(r0)
            android.content.Context r15 = r6.getContext()
            int r3 = r1.A01
            int r0 = r1.A00
            goto L_0x02ba
        L_0x0334:
            r0 = 2131891037(0x7f12135d, float:1.9416783E38)
            r8.setText(r0)
            android.content.Context r15 = r6.getContext()
            r3 = 2131233220(0x7f0809c4, float:1.8082571E38)
            r0 = 2131101697(0x7f060801, float:1.781581E38)
            goto L_0x02ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37991nX.A00(android.view.View, int):void");
    }

    public static void A01(View view, C37991nX r17, int i, boolean z) {
        int i2;
        int width;
        AlphaAnimation alphaAnimation;
        int width2;
        int width3;
        C37991nX r3 = r17;
        MessageDetailsActivity messageDetailsActivity = r3.A02;
        int i3 = i;
        AnonymousClass3IC r1 = (AnonymousClass3IC) messageDetailsActivity.A0X.get(i3);
        View view2 = view;
        View findViewById = view2.findViewById(R.id.date_time_delivered);
        View findViewById2 = view2.findViewById(R.id.date_time_read);
        View findViewById3 = view2.findViewById(R.id.date_time_played);
        View A022 = C012005e.A02(view2, R.id.date_time_delivered_label);
        TextView A0O = C36391kE.A0O(view2, R.id.date_time_read_label);
        TextView A0O2 = C36391kE.A0O(view2, R.id.date_time_played_label);
        View findViewById4 = view2.findViewById(R.id.date_time_delivered_group);
        View findViewById5 = view2.findViewById(R.id.date_time_read_group);
        View findViewById6 = view2.findViewById(R.id.date_time_played_group);
        int i4 = messageDetailsActivity.A0P.A1I;
        if (i4 == 0) {
            i2 = R.string.f12nameremoved;
        } else {
            boolean A0K = C66013Ui.A0K(i4);
            i2 = R.string.f12nameremoved;
            if (A0K) {
                i2 = R.string.f12nameremoved;
            }
        }
        A0O.setText(i2);
        A0O2.setText(AnonymousClass3NZ.A00(messageDetailsActivity.A0P, true).A02);
        ArrayList A14 = C36441kJ.A14(6);
        int A002 = r1.A00();
        if (A002 == 5) {
            A14.add(A022);
            if (C36351kA.A1Y(messageDetailsActivity.A00)) {
                if (z) {
                    width = findViewById.getWidth() - findViewById4.getWidth();
                } else {
                    width = A022.getWidth();
                }
                TranslateAnimation translateAnimation = new TranslateAnimation((float) width, 0.0f, 0.0f, 0.0f);
                C36381kD.A1D(translateAnimation, (long) r3.A01);
                findViewById.startAnimation(translateAnimation);
            }
        } else if (A002 == 8) {
            A14.add(A0O2);
            A14.add(findViewById5);
            A14.add(A0O);
            A14.add(findViewById4);
            A14.add(A022);
            if (C36351kA.A1Y(messageDetailsActivity.A00)) {
                if (z) {
                    width2 = findViewById3.getWidth() - findViewById6.getWidth();
                } else {
                    width2 = A0O2.getWidth();
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation((float) width2, 0.0f, 0.0f, 0.0f);
                C36381kD.A1D(translateAnimation2, (long) r3.A01);
                findViewById3.startAnimation(translateAnimation2);
            }
        } else if (A002 == 13) {
            A14.add(A0O);
            A14.add(findViewById4);
            A14.add(A022);
            if (C36351kA.A1Y(messageDetailsActivity.A00)) {
                if (z) {
                    width3 = findViewById2.getWidth() - findViewById5.getWidth();
                } else {
                    width3 = A0O.getWidth();
                }
                TranslateAnimation translateAnimation3 = new TranslateAnimation((float) width3, 0.0f, 0.0f, 0.0f);
                C36381kD.A1D(translateAnimation3, (long) r3.A01);
                findViewById2.startAnimation(translateAnimation3);
            }
        }
        Iterator it = A14.iterator();
        while (it.hasNext()) {
            View A0K2 = C36431kI.A0K(it);
            if (!z) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            int i5 = r3.A01;
            alphaAnimation.setDuration((long) i5);
            alphaAnimation.setStartOffset((long) (((float) i5) * 0.0f));
            A0K2.startAnimation(alphaAnimation);
        }
        View findViewById7 = view2.findViewById(R.id.timestamps);
        int height = findViewById7.getHeight();
        r3.A00(view2, i3);
        C36351kA.A1B(findViewById7, findViewById7.getWidth(), 1073741824);
        int measuredHeight = findViewById7.getMeasuredHeight();
        C36411kG.A1A(findViewById7, height);
        C37701n4 r2 = new C37701n4(findViewById7, r3, height, measuredHeight);
        r2.setDuration((long) r3.A01);
        findViewById7.startAnimation(r2);
    }

    public int getCount() {
        return this.A02.A0X.size();
    }

    public Object getItem(int i) {
        return this.A02.A0X.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C36361kB.A0E(this.A02.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
        }
        A00(view, i);
        return view;
    }
}
