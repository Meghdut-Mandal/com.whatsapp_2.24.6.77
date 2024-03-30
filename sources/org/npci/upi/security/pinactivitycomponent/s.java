package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass66Z;
import X.AnonymousClass7dR;
import X.C135496cn;
import X.C1498272x;
import X.C36341k9;
import X.C36391kE;
import X.C90474aD;
import X.C91564cF;
import X.C93104fl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Timer;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

public abstract class s extends AnonymousClass02E implements AnonymousClass7dR {
    public int A00 = -1;
    public int A01 = 2;
    public Context A02;
    public CountDownTimer A03 = null;
    public ArrayList A04 = AnonymousClass001.A0I();
    public Timer A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public AnonymousClass66Z A08;
    public Handler A09;
    public Runnable A0A;
    public Timer A0B;

    public void A1O(Context context) {
        super.A1O(context);
        this.A02 = context;
        this.A08 = new AnonymousClass66Z(context);
    }

    public C93104fl A1Y(Boolean bool, String str, String str2, String str3, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C93104fl r2 = new C93104fl(A0h(), this.A02);
        r2.setActionBarPositionTop(true);
        layoutParams.width = -2;
        FormItemEditText formItemEditText = r2.A0G;
        formItemEditText.setCharSize(0.0f);
        formItemEditText.setSpace((float) ((int) (15.0f * ((float) (C36341k9.A0G(this).getDisplayMetrics().densityDpi / 160)))));
        formItemEditText.setFontSize((float) ((int) (24.0f * ((float) (C36341k9.A0G(this).getDisplayMetrics().densityDpi / 160)))));
        int[] iArr = new int[4];
        iArr[0] = 80;
        C90474aD.A1R(iArr, (int) (25.0f * ((float) (C36341k9.A0G(this).getDisplayMetrics().densityDpi / 160))), 80, 0);
        formItemEditText.setMargin(iArr);
        formItemEditText.setLineStrokeCentered(true);
        formItemEditText.setLineStrokeSelected((float) ((int) (2.0f * ((float) (C36341k9.A0G(this).getDisplayMetrics().densityDpi / 160)))));
        formItemEditText.setColorStates(AnonymousClass00F.A04(A0h(), R.color.f6nameremoved));
        r2.setLayoutParams(layoutParams);
        r2.setInputLength(i2);
        r2.A0H = this;
        r2.setTitle(str);
        r2.A01 = i;
        r2.setEducationalText(str2);
        r2.A0F = str3;
        if (((GetCredential) this.A02).A0D.A0I) {
            r2.setForgotUpi(bool);
            return r2;
        }
        r2.setForgotUpi(false);
        return r2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x007c=Splitter:B:39:0x007c, B:26:0x004d=Splitter:B:26:0x004d, B:48:0x008f=Splitter:B:48:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1a(X.AnonymousClass63A r9) {
        /*
            r8 = this;
            java.lang.String r6 = "otp_type_aadhaar"
            java.lang.String r2 = "AADHAAR"
            int r1 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            r0 = -1
            if (r1 == r0) goto L_0x00b9
            java.util.ArrayList r7 = r8.A04     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r8.A06     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0011
            int r1 = r1 + -1
        L_0x0011:
            X.4fl r0 = X.C90494aF.A0o(r7, r1)     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.isShown()     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0024
            boolean r1 = r8.A06     // Catch:{ Exception -> 0x00b9 }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0026
            int r0 = r0 + -1
            goto L_0x0026
        L_0x0024:
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
        L_0x0026:
            X.4fl r5 = X.C90494aF.A0o(r7, r0)     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r8.A06     // Catch:{ Exception -> 0x00b9 }
            r1 = 1
            java.lang.String r4 = "otp_type_bank"
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.A0F     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r9.A00     // Catch:{ Exception -> 0x00b9 }
            boolean r0 = r0.contains(r2)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0064
            X.66Z r0 = r8.A08     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r0.getString(r6, r3)     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A07 = r1     // Catch:{ Exception -> 0x00b9 }
            r5.setText(r2)     // Catch:{ Exception -> 0x00b9 }
            X.66Z r0 = r8.A08     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00b9 }
            r0.putString(r6, r3)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00b6
        L_0x0064:
            java.lang.String r2 = r5.A0F     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "SMS"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r8.A07     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            X.66Z r0 = r8.A08     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = r0.getString(r4, r3)     // Catch:{ Exception -> 0x007b }
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A07 = r1     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00a8
        L_0x0085:
            X.66Z r0 = r8.A08     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = r0.getString(r4, r3)     // Catch:{ Exception -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x00b9 }
            if (r0 != 0) goto L_0x00b9
            r8.A07 = r1     // Catch:{ Exception -> 0x00b9 }
            boolean r1 = r8.A06     // Catch:{ Exception -> 0x00b9 }
            int r0 = r8.A00     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x009f
            int r0 = r0 + -1
        L_0x009f:
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x00b9 }
            X.4Uu r0 = (X.C88984Uu) r0     // Catch:{ Exception -> 0x00b9 }
            r0.setText(r2)     // Catch:{ Exception -> 0x00b9 }
        L_0x00a8:
            r5.setText(r2)     // Catch:{ Exception -> 0x00b9 }
            X.66Z r0 = r8.A08     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences r0 = r0.A01     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00b9 }
            r0.putString(r4, r3)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b6:
            r0.commit()     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.s.A1a(X.63A):void");
    }

    public void A1b(C93104fl r9) {
        r9.Azo((Drawable) null, (View.OnClickListener) null, "", 0, false, false);
        r9.A00(r9.A05, false);
        this.A03 = new C91564cF(this, r9).start();
        r9.A01();
    }

    public void A1H() {
        Runnable runnable;
        super.A1H();
        Timer timer = this.A05;
        if (timer != null) {
            try {
                timer.cancel();
            } catch (Exception unused) {
            }
        }
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            try {
                countDownTimer.cancel();
            } catch (Exception unused2) {
            }
        }
        Timer timer2 = this.A0B;
        if (timer2 != null) {
            try {
                timer2.cancel();
            } catch (Exception unused3) {
            }
        }
        Handler handler = this.A09;
        if (handler != null && (runnable = this.A0A) != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof GetCredential) {
            GetCredential getCredential = (GetCredential) A0h;
            getCredential.A0F = this;
            this.A01 = getCredential.A0D.A00;
        }
    }

    public void A1Z(String str) {
        View findViewById = A0h().findViewById(R.id.popupView);
        findViewById.setVisibility(0);
        findViewById.setAnimation(AnimationUtils.loadAnimation(A1D(), R.anim.f1nameremoved));
        C36391kE.A0P(findViewById, R.id.popup_text).setText(str);
        findViewById.findViewById(R.id.popup_button).setOnClickListener(new C135496cn(findViewById, this, 9));
        this.A0B = new Timer();
        Handler A0H = C36341k9.A0H();
        this.A09 = A0H;
        C1498272x r2 = new C1498272x(this, findViewById, 15);
        this.A0A = r2;
        A0H.postDelayed(r2, 3000);
    }
}
