package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFullscreenFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Qh  reason: invalid class name and case insensitive filesystem */
public class C64993Qh {
    public final C24801Dv A00;
    public final C32731e6 A01;
    public final AnonymousClass1DW A02;
    public final C20810yC A03;
    public final C20500xf A04;
    public final C21010yW A05;
    public final AnonymousClass1JN A06;
    public final AnonymousClass1TF A07;
    public final C30961b3 A08;
    public final C30921az A09;
    public final AnonymousClass3PX A0A;
    public final AnonymousClass3DP A0B;
    public final C62563Gq A0C;
    public final C19770wU A0D;
    public final AnonymousClass1N3 A0E;
    public final C63193Jc A0F;
    public final C21060yb A0G;
    public final C19970wo A0H;
    public final AnonymousClass1E9 A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (r1.A00(r8.A01) != null) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r13, com.whatsapp.TextEmojiLabel r14, X.AnonymousClass2IR r15, com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet r16, X.AnonymousClass3P8 r17, boolean r18, boolean r19) {
        /*
            r12 = this;
            r6 = r12
            X.3Jc r0 = r12.A0F
            r7 = r13
            X.C63193Jc.A00(r13, r14, r0)
            X.0yC r0 = r12.A03
            r8 = r17
            boolean r0 = X.AnonymousClass3RR.A02(r0, r8)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r8.A08
        L_0x0013:
            r14.setText(r0)
            X.1TF r3 = r12.A07
            boolean r0 = r3.A07(r8)
            r9 = r15
            if (r0 == 0) goto L_0x00d5
            X.3T1 r2 = r15.getFMessage()
            r1 = 1
            X.AnonymousClass00C.A0D(r2, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A
            int r0 = r0.get()
            if (r0 != r1) goto L_0x00d5
            X.0wo r0 = r3.A00
            long r3 = X.AnonymousClass3T1.A05(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r0 = r8.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "code_expiration_minutes"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 != 0) goto L_0x005a
            r0 = 10
        L_0x0047:
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            r0 = 0
            r14.setClickable(r0)
            r0 = 2131100212(0x7f060234, float:1.78128E38)
            X.C36331k8.A0r(r13, r14, r0)
            return
        L_0x005a:
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x0047
        L_0x005f:
            X.1TF r1 = r12.A07
            boolean r0 = r1.A07(r8)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r8.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "cta_display_name"
            java.lang.String r0 = r1.getQueryParameter(r0)
            goto L_0x0013
        L_0x0074:
            if (r19 == 0) goto L_0x00d0
            r4 = 2131102368(0x7f060aa0, float:1.7817172E38)
        L_0x0079:
            if (r18 != 0) goto L_0x007e
            r4 = 2131100212(0x7f060234, float:1.78128E38)
        L_0x007e:
            r3 = 2131232443(0x7f0806bb, float:1.8080995E38)
            int r2 = r8.A06
            r0 = 3
            if (r2 != r0) goto L_0x00b9
            r3 = 2131231779(0x7f080423, float:1.8079649E38)
        L_0x0089:
            android.graphics.drawable.Drawable r5 = X.AnonymousClass3UF.A02(r13, r3, r4)
            r0 = 204(0xcc, float:2.86E-43)
            r5.setAlpha(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131168578(0x7f070d42, float:1.7951462E38)
            if (r19 == 0) goto L_0x009e
            r0 = 2131168576(0x7f070d40, float:1.7951458E38)
        L_0x009e:
            int r4 = r1.getDimensionPixelSize(r0)
            java.lang.String r3 = r8.A08
            android.text.TextPaint r2 = r14.getPaint()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131492939(0x7f0c004b, float:1.8609344E38)
            int r0 = r1.getInteger(r0)
            android.text.SpannableStringBuilder r0 = X.C37351mE.A00(r2, r5, r3, r4, r0)
            goto L_0x0013
        L_0x00b9:
            boolean r0 = r1.A08(r8)
            if (r0 != 0) goto L_0x00cc
            X.3Gq r1 = r12.A0C
            r0 = 2
            if (r2 != r0) goto L_0x0089
            java.lang.String r0 = r8.A01
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0089
        L_0x00cc:
            r3 = 2131231788(0x7f08042c, float:1.8079667E38)
            goto L_0x0089
        L_0x00d0:
            int r4 = X.C36341k9.A05(r13)
            goto L_0x0079
        L_0x00d5:
            r0 = 1
            r14.setClickable(r0)
            r1 = 2130969984(0x7f040580, float:1.7548665E38)
            r0 = 2131101114(0x7f0605ba, float:1.7814629E38)
            X.C36321k7.A0M(r13, r14, r1, r0)
            r11 = 1
            X.3YY r5 = new X.3YY
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r14.setOnClickListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64993Qh.A01(android.content.Context, com.whatsapp.TextEmojiLabel, X.2IR, com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet, X.3P8, boolean, boolean):void");
    }

    public static void A00(Context context, C64993Qh r6, AnonymousClass2IR r7, AnonymousClass3T1 r8, AnonymousClass3P8 r9) {
        String str;
        r6.A0B.A00(r8, "cta-url", String.valueOf(r9.A05));
        AnonymousClass1TF r2 = r6.A07;
        if (!r2.A08(r9) && !r2.A07(r9)) {
            C62563Gq r4 = r6.A0C;
            if (r9.A06 != 2 || r4.A00(r9.A01) == null) {
                String str2 = r9.A01;
                C225314u r22 = (C225314u) C18860tw.A01(context, C225314u.class);
                if (r22 != null) {
                    Set A002 = r6.A01.A00(r8.A0L(), str2);
                    if (A002 != null) {
                        r22.Btm(C53152qr.A00(str2, r8.A1J.A01, A002));
                        return;
                    }
                } else {
                    Log.e("ClickToActionButtonUtils/suspiciousLinkHandler/error: not click in Conversation");
                }
                C80403vL.A01(r6.A0D, r6, r8, r9, 0);
                r6.A03(context, r8, r9);
                return;
            }
            C88854Uh r1 = (C88854Uh) r7.getFMessage();
            AnonymousClass00C.A0D(r1, 0);
            List list = r1.BIE().A06;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass3P8 r23 = (AnonymousClass3P8) it.next();
                    AnonymousClass00C.A0B(r23);
                    if (r23 != null && r23.A06 == 2 && r4.A00(r23.A01) != null) {
                        str = r4.A00(r23.A01);
                        break;
                    }
                }
                r4.A01(str);
                r6.A0D.Boy(new C1502474n(r6, r8, r9, 49));
            }
            str = null;
            r4.A01(str);
            r6.A0D.Boy(new C1502474n(r6, r8, r9, 49));
        } else if (r2.A08(r9)) {
            r2.A05((AnonymousClass2cW) r7.getFMessage(), 2);
        } else if (r2.A07(r9)) {
            r2.A04(context, (AnonymousClass2cW) r7.getFMessage(), 2);
        } else {
            return;
        }
        AnonymousClass4V7 A022 = AnonymousClass3SS.A02(r7);
        if (A022 != null) {
            A022.Bn8();
        }
    }

    public void A02(Context context, AnonymousClass2IR r15, AnonymousClass3T1 r16, AnonymousClass3P8 r17, String str, boolean z) {
        DialogFragment consumerMarketingDisclosureFullscreenFragment;
        AnonymousClass3T1 r9 = r16;
        AnonymousClass11F r4 = r9.A1J.A00;
        Context context2 = context;
        C225314u r3 = (C225314u) C18860tw.A01(context, C225314u.class);
        if (r4 != null && r3 != null) {
            C30921az r2 = this.A09;
            if (!r2.A03.A0E(976)) {
                consumerMarketingDisclosureFullscreenFragment = C54182sX.A00(r4, r2, C51612o6.NON_BLOCKING_DISCLOSURE);
            } else {
                consumerMarketingDisclosureFullscreenFragment = new ConsumerMarketingDisclosureFullscreenFragment(r4, r2);
            }
            if (consumerMarketingDisclosureFullscreenFragment instanceof AnonymousClass4QN) {
                ((AnonymousClass4QN) consumerMarketingDisclosureFullscreenFragment).BqM(new C74103l4(context2, consumerMarketingDisclosureFullscreenFragment, this, r15, r9, r17, str, z));
            }
            r3.Btm(consumerMarketingDisclosureFullscreenFragment);
        }
    }

    public boolean A04(AnonymousClass3T1 r9) {
        AnonymousClass00S r0;
        AnonymousClass11F r5 = r9.A1J.A00;
        C62673Hb A0Q = r9.A0Q();
        if (!(r5 == null || A0Q == null || !A0Q.A00)) {
            C30921az r7 = this.A09;
            AnonymousClass1E9 r2 = this.A0I;
            AnonymousClass00C.A0D(r2, 1);
            if (r7.A03.A0E(5869)) {
                if (r7.A05.A01(C51332ne.MARKETING_MESSAGE)) {
                    r7.A06.A02(r5, 1);
                } else if (C36371kC.A1U(C36411kG.A0E(r7.A08.A01), "pref_disclosure_tos_state")) {
                    r7.A06.A02(r5, 2);
                } else {
                    C30971b4 r4 = r7.A07;
                    if (r4.A00(r5)) {
                        AnonymousClass1EB r22 = r2.A06;
                        if (r22.A00("20210210") == 1) {
                            C19420v0 r1 = r7.A01;
                            if (r1.A2M()) {
                                r0 = new AnonymousClass4H7(r5, r7);
                                C30921az.A00(r7, r0);
                            } else if (!r4.A00(r5) || r1.A2M() || r22.A00("20210210") != 1) {
                                return false;
                            } else {
                                return true;
                            }
                        }
                    }
                    r0 = new AnonymousClass4H6(r5, r7);
                    C30921az.A00(r7, r0);
                }
            }
        }
        return false;
    }

    public C64993Qh(C24801Dv r2, AnonymousClass1N3 r3, C63193Jc r4, C21060yb r5, C19970wo r6, C32731e6 r7, AnonymousClass1DW r8, C20810yC r9, C20500xf r10, C21010yW r11, AnonymousClass1JN r12, AnonymousClass1TF r13, C30961b3 r14, C30921az r15, AnonymousClass3PX r16, AnonymousClass3DP r17, C62563Gq r18, AnonymousClass1E9 r19, C19770wU r20) {
        this.A0H = r6;
        this.A03 = r9;
        this.A0D = r20;
        this.A05 = r11;
        this.A00 = r2;
        this.A0E = r3;
        this.A02 = r8;
        this.A0G = r5;
        this.A0B = r17;
        this.A01 = r7;
        this.A0F = r4;
        this.A07 = r13;
        this.A04 = r10;
        this.A0I = r19;
        this.A0C = r18;
        this.A0A = r16;
        this.A09 = r15;
        this.A06 = r12;
        this.A08 = r14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        if ("compact".equalsIgnoreCase(r1) == false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Context r10, X.AnonymousClass3T1 r11, X.AnonymousClass3P8 r12) {
        /*
            r9 = this;
            r11.A0Q()
            X.0yC r2 = r9.A03
            boolean r0 = X.AnonymousClass3RR.A02(r2, r12)
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r12.A01
            java.lang.String r2 = "research-survey"
            r1 = 1
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A1L(r10, r3, r2, r1, r0)
        L_0x0015:
            X.1Dv r0 = r9.A00
            r0.A06(r10, r1)
            return
        L_0x001b:
            java.lang.String r4 = r12.A01
            X.1DW r1 = r9.A02     // Catch:{ Exception -> 0x003d }
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x003d }
            int r1 = r1.A0C(r0)     // Catch:{ Exception -> 0x003d }
            r0 = 1
            if (r1 == r0) goto L_0x004f
            X.0xf r2 = r9.A04
            X.0yW r1 = r9.A05
            r0 = 4
            X.C65093Qs.A02(r2, r1, r11, r0)
            java.lang.String r0 = r12.A01
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = X.AnonymousClass190.A0P(r10, r0)
            goto L_0x0015
        L_0x003d:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ClickToActionButtonUtils/isDeepLinkUri/<"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "> is not a valid URL. Error="
            X.C36321k7.A1J(r3, r0, r1)
        L_0x004f:
            X.0xf r3 = r9.A04
            X.3Qa r0 = r11.A1J
            X.11F r4 = r0.A00
            boolean r0 = X.AnonymousClass3M3.A01(r3, r4)
            if (r0 == 0) goto L_0x006e
            X.0yW r1 = r9.A05
            r0 = 4
            X.C65093Qs.A02(r3, r1, r11, r0)
        L_0x0061:
            X.1Dv r2 = r9.A00
            java.lang.String r0 = r12.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.Bp7(r10, r1, r0)
            return
        L_0x006e:
            java.lang.String r0 = r12.A01
            r7 = 0
            X.C36331k8.A1I(r0, r2)
            if (r4 == 0) goto L_0x00b8
            boolean r0 = X.AnonymousClass3MQ.A01(r2, r4, r0)
            if (r0 == 0) goto L_0x00b8
        L_0x007c:
            r3 = 1
        L_0x007d:
            java.lang.String r0 = r12.A01
            java.lang.String r1 = X.AnonymousClass3MQ.A00(r2, r4, r0)
            if (r3 != 0) goto L_0x00e5
            java.lang.String r0 = "webview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "browser_tab"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0061
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r0 = X.C52972qU.A00(r10, r0, r7)
            if (r0 == 0) goto L_0x0061
            X.6Sn r0 = new X.6Sn
            r0.<init>()
            X.5gs r1 = r0.A02()
            java.lang.String r0 = r12.A01
            android.net.Uri r0 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r0)
            android.content.Intent r1 = r1.A00
            r1.setData(r0)
            r0 = 0
            X.C05290Pd.A00(r10, r1, r0)
            return
        L_0x00b8:
            r0 = 5970(0x1752, float:8.366E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r1 = r12.A03
            java.lang.String r0 = "full"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "tall"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "compact"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00e3
            goto L_0x007c
        L_0x00e3:
            r3 = 0
            goto L_0x007d
        L_0x00e5:
            X.3PX r3 = r9.A0A
            boolean r0 = r11 instanceof X.AnonymousClass2cW
            if (r0 == 0) goto L_0x0133
            X.2cW r11 = (X.AnonymousClass2cW) r11
            X.3F4 r0 = r11.A00
            java.lang.String r6 = r0.A05
        L_0x00f1:
            java.lang.String r5 = "marketing_msg_webview"
            r8 = 0
            r3.A01(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L_0x0131
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://api.whatsapp.com/send/?phone="
            r1.append(r0)
            java.lang.String r0 = r4.user
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0108:
            r1 = 0
            java.lang.String r0 = r12.A01
            android.content.Intent r2 = X.AnonymousClass190.A1I(r10, r0, r2, r1)
            java.lang.String r0 = "webview_should_ask_before_close"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "message_cta_type"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x0124
            java.lang.String r1 = r4.getRawString()
            java.lang.String r0 = "webview_receiver_jid"
            r2.putExtra(r0, r1)
        L_0x0124:
            if (r6 == 0) goto L_0x012b
            java.lang.String r0 = "webview_message_template_id"
            r2.putExtra(r0, r6)
        L_0x012b:
            X.1Dv r0 = r9.A00
            r0.A06(r10, r2)
            return
        L_0x0131:
            r2 = 0
            goto L_0x0108
        L_0x0133:
            r6 = 0
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64993Qh.A03(android.content.Context, X.3T1, X.3P8):void");
    }
}
