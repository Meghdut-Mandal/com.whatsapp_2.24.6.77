package com.whatsapp.registration.verifyphone;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3PP;
import X.C012005e;
import X.C18740tg;
import X.C18820ts;
import X.C36321k7;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C67133Yq;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RequestOtpCodeBottomSheetFragment extends Hilt_RequestOtpCodeBottomSheetFragment {
    public C18820ts A00;
    public AnonymousClass3PP A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public VerifyPhoneNumber A06;
    public WDSButton A07;
    public WDSButton A08;
    public WDSButton A09;
    public WDSButton A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final HashMap A0E = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r10 = com.whatsapp.R.plurals.f10nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r8 = r13.A0B;
        r4 = X.C80313vC.A00(r13, r14, 35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r7 = r15;
        r15.setText(r8);
        r15.setIcon(r3);
        r15.setOnClickListener(new X.AnonymousClass3YM(r13, r15, r4, 24));
        r11 = r17;
        r0 = (r17 > 0 ? 1 : (r17 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r0 >= 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r15.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r4 = new X.C81153wY(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r0 != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        r15.setEnabled(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r15.setEnabled(false);
        r1 = r13.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if (r1.get(r9) == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        ((android.os.CountDownTimer) r1.get(r9)).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r1.put(r9, new X.C37051lj(r5, r6, r7, r8, r9, r10, r11));
        ((android.os.CountDownTimer) r1.get(r9)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r3 = com.whatsapp.R.drawable.ic_reg_sms_normal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r13.A0D != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0 = r13.A0C;
        r10 = com.whatsapp.R.plurals.f10nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r0 == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(com.whatsapp.registration.verifyphone.VerifyPhoneNumber r14, com.whatsapp.wds.components.button.WDSButton r15, java.lang.String r16, long r17) {
        /*
            r13 = this;
            r6 = r14
            r9 = r16
            if (r14 != 0) goto L_0x0017
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RequestOtpCodeBottomSheetFragment/initializeButtonAndStartTimer for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "/null base activity"
            X.C36321k7.A1a(r1, r0)
            return
        L_0x0017:
            int r0 = r9.hashCode()
            r2 = 0
            r1 = 1
            r5 = r13
            switch(r0) {
                case -795576526: goto L_0x0059;
                case 112386354: goto L_0x006f;
                case 2120743944: goto L_0x008a;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3 = 2131232611(0x7f080763, float:1.8081336E38)
            boolean r0 = r13.A0D
            if (r0 != 0) goto L_0x002f
            boolean r0 = r13.A0C
            r10 = 2131755402(0x7f10018a, float:1.9141682E38)
            if (r0 == 0) goto L_0x0032
        L_0x002f:
            r10 = 2131755404(0x7f10018c, float:1.9141686E38)
        L_0x0032:
            java.lang.String r8 = r13.A0B
            r0 = 35
            X.3vC r4 = X.C80313vC.A00(r13, r14, r0)
        L_0x003a:
            r7 = r15
            r15.setText(r8)
            r15.setIcon((int) r3)
            r3 = 24
            X.3YM r0 = new X.3YM
            r0.<init>(r13, r15, r4, r3)
            r15.setOnClickListener(r0)
            r3 = 0
            r11 = r17
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a5
            r0 = 8
            r15.setVisibility(r0)
            return
        L_0x0059:
            boolean r0 = X.C36441kJ.A1M(r9)
            if (r0 == 0) goto L_0x0021
            r3 = 2131232681(0x7f0807a9, float:1.8081478E38)
            r10 = 2131755403(0x7f10018b, float:1.9141684E38)
            r0 = 2131895602(0x7f122532, float:1.9426042E38)
            java.lang.String r8 = r13.A0n(r0)
            r0 = 13
            goto L_0x009f
        L_0x006f:
            java.lang.String r0 = "voice"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0021
            r3 = 2131232609(0x7f080761, float:1.8081332E38)
            r10 = 2131755405(0x7f10018d, float:1.9141688E38)
            r0 = 2131895616(0x7f122540, float:1.942607E38)
            java.lang.String r8 = r13.A0n(r0)
            java.util.Objects.requireNonNull(r14)
            r0 = 12
            goto L_0x009f
        L_0x008a:
            boolean r0 = X.C36441kJ.A1N(r9)
            if (r0 == 0) goto L_0x0021
            r3 = 2131232073(0x7f080549, float:1.8080245E38)
            r10 = 2131755310(0x7f10012e, float:1.9141496E38)
            r0 = 2131893690(0x7f121dba, float:1.9422164E38)
            java.lang.String r8 = r13.A0n(r0)
            r0 = 14
        L_0x009f:
            X.3wY r4 = new X.3wY
            r4.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r14, (int) r0)
            goto L_0x003a
        L_0x00a5:
            if (r0 != 0) goto L_0x00ab
            r15.setEnabled(r1)
            return
        L_0x00ab:
            r15.setEnabled(r2)
            java.util.HashMap r1 = r13.A0E
            java.lang.Object r0 = r1.get(r9)
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r1.get(r9)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.cancel()
        L_0x00bf:
            X.1lj r4 = new X.1lj
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.put(r9, r4)
            java.lang.Object r0 = r1.get(r9)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment.A05(com.whatsapp.registration.verifyphone.VerifyPhoneNumber, com.whatsapp.wds.components.button.WDSButton, java.lang.String, long):void");
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        VerifyPhoneNumber verifyPhoneNumber;
        WDSButton wDSButton;
        long j;
        String str;
        super.A1S(bundle, view);
        C67133Yq.A00(C012005e.A02(view, R.id.request_otp_code_bottom_sheet_close_button), this, 24);
        ImageView A0G = C36401kF.A0G(view, R.id.request_otp_code_bottom_sheet_icon);
        TextView A0O = C36391kE.A0O(view, R.id.request_otp_code_bottom_sheet_title);
        TextView A0O2 = C36391kE.A0O(view, R.id.request_otp_code_bottom_sheet_description);
        if (this.A0D) {
            A0G.setImageDrawable((Drawable) null);
            A0G.setBackgroundResource(R.drawable.registration_device_confirmation);
            A0O.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else if (this.A0C) {
            A0G.setImageResource(R.drawable.ic_business_email);
            i = R.string.f12nameremoved;
        } else {
            C36391kE.A18(A1D(), A0G, R.drawable.ic_reg_sms_normal);
            A0G.setBackgroundResource(R.drawable.request_otp_code_circle_background);
            A0O.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        }
        A0O2.setText(i);
        A05(this.A06, this.A08, "sms", this.A03);
        A05(this.A06, this.A09, "voice", this.A04);
        if (this.A0D) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A0A;
            C18740tg.A04(wDSButton);
            j = this.A05;
            str = "wa_old";
        } else if (this.A0C) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A07;
            C18740tg.A04(wDSButton);
            j = this.A02;
            str = "email_otp";
        } else {
            return;
        }
        A05(verifyPhoneNumber, wDSButton, str, j);
    }

    public static RequestOtpCodeBottomSheetFragment A03(String str, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = new RequestOtpCodeBottomSheetFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putLong("EXTRA_SMS_COUNTDOWN_TIME", j);
        A072.putLong("EXTRA_VOICE_COUNTDOWN_TIME", j2);
        A072.putLong("EXTRA_WA_OLD_COUNTDOWN_TIME", j3);
        A072.putLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME", j4);
        A072.putBoolean("EXTRA_REG_STATE_IS_WA_OLD", z);
        A072.putBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP", z2);
        A072.putString("EXTRA_ENABLE_SMS_STRING", str);
        requestOtpCodeBottomSheetFragment.A17(A072);
        return requestOtpCodeBottomSheetFragment;
    }

    public void A19() {
        super.A19();
        this.A06 = null;
        HashMap hashMap = this.A0E;
        Iterator A10 = C36371kC.A10(hashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (A11.getValue() != null) {
                ((CountDownTimer) A11.getValue()).cancel();
                hashMap.put(A11.getKey(), (Object) null);
            }
        }
        hashMap.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r0 = 2131626038(0x7f0e0836, float:1.88793E38)
            android.view.View r5 = X.C36411kG.A0J(r11, r12, r0)
            r0 = 2131433357(0x7f0b178d, float:1.8488497E38)
            android.view.ViewGroup r4 = X.C36411kG.A0O(r5, r0)
            boolean r0 = r9.A0D
            r6 = 0
            if (r0 == 0) goto L_0x0065
            r0 = 2131626039(0x7f0e0837, float:1.8879303E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A0A = r0
        L_0x001e:
            r4.addView(r0)
        L_0x0021:
            boolean r0 = r9.A0D
            r7 = 0
            if (r0 == 0) goto L_0x002d
            long r0 = r9.A05
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0037
        L_0x002d:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0061
            long r1 = r9.A02
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
        L_0x0037:
            r0 = 2131626040(0x7f0e0838, float:1.8879305E38)
        L_0x003a:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A08 = r0
            long r2 = r9.A03
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 2131626040(0x7f0e0838, float:1.8879305E38)
            if (r1 >= 0) goto L_0x004e
            r0 = 2131626039(0x7f0e0837, float:1.8879303E38)
        L_0x004e:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A09 = r0
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A08
            r4.addView(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A09
            r4.addView(r0)
            return r5
        L_0x0061:
            r0 = 2131626039(0x7f0e0837, float:1.8879303E38)
            goto L_0x003a
        L_0x0065:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0021
            r0 = 2131626039(0x7f0e0837, float:1.8879303E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A07 = r0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A06 = (VerifyPhoneNumber) A0h();
        } catch (ClassCastException e) {
            C36321k7.A1W("RequestOtpCodeBottomSheetFragment/onAttach/error: ", AnonymousClass000.A0u(), e);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A03 = A0b().getLong("EXTRA_SMS_COUNTDOWN_TIME");
        this.A04 = A0b().getLong("EXTRA_VOICE_COUNTDOWN_TIME");
        this.A05 = A0b().getLong("EXTRA_WA_OLD_COUNTDOWN_TIME");
        this.A02 = A0b().getLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME");
        this.A0D = A0b().getBoolean("EXTRA_REG_STATE_IS_WA_OLD");
        this.A0C = A0b().getBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP");
        this.A0B = C36431kI.A17(A0b(), "EXTRA_ENABLE_SMS_STRING");
    }
}
