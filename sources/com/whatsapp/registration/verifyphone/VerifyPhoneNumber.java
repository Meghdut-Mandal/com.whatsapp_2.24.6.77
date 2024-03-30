package com.whatsapp.registration.verifyphone;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass099;
import X.AnonymousClass0FM;
import X.AnonymousClass0XN;
import X.AnonymousClass0YZ;
import X.AnonymousClass13E;
import X.AnonymousClass13I;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1CF;
import X.AnonymousClass1M8;
import X.AnonymousClass1MP;
import X.AnonymousClass1N4;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass224;
import X.AnonymousClass2d1;
import X.AnonymousClass2d2;
import X.AnonymousClass3BM;
import X.AnonymousClass3DY;
import X.AnonymousClass3G5;
import X.AnonymousClass3KE;
import X.AnonymousClass3KJ;
import X.AnonymousClass3KW;
import X.AnonymousClass3LA;
import X.AnonymousClass3LN;
import X.AnonymousClass3MJ;
import X.AnonymousClass3PP;
import X.AnonymousClass3SJ;
import X.AnonymousClass3TX;
import X.AnonymousClass3US;
import X.AnonymousClass3UV;
import X.AnonymousClass3UY;
import X.AnonymousClass3XC;
import X.AnonymousClass4UE;
import X.AnonymousClass4UF;
import X.AnonymousClass4YH;
import X.AnonymousClass6JD;
import X.AnonymousClass97V;
import X.AnonymousClass9XW;
import X.C001700s;
import X.C18740tg;
import X.C18750th;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C19680wL;
import X.C19770wU;
import X.C19890wg;
import X.C19970wo;
import X.C199929gH;
import X.C200079gZ;
import X.C20050ww;
import X.C20830yE;
import X.C21010yW;
import X.C21360z5;
import X.C21520zN;
import X.C25271Fq;
import X.C27111My;
import X.C29501Ww;
import X.C32681e1;
import X.C33751fs;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37041li;
import X.C37141ls;
import X.C39711tN;
import X.C49752jd;
import X.C50062k8;
import X.C50112kE;
import X.C52072oq;
import X.C55252uK;
import X.C57802yq;
import X.C61303Bi;
import X.C62043En;
import X.C62143Ey;
import X.C62433Gd;
import X.C62603Gu;
import X.C62623Gw;
import X.C62653Gz;
import X.C63543Kl;
import X.C63643Kv;
import X.C65603St;
import X.C65983Uf;
import X.C66713Xa;
import X.C67793aq;
import X.C77343qL;
import X.C80313vC;
import X.C80343vF;
import X.C80453vQ;
import X.C81153wY;
import X.C89364Wg;
import X.C90914b9;
import X.C90924bA;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.registration.entercode.EnterCodeViewModel;
import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VerifyPhoneNumber extends AnonymousClass155 implements AnonymousClass4UE, AnonymousClass4UF {
    public static int A1e = 6;
    public static int A1f = 6;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public Handler A0D;
    public ViewStub A0E;
    public ImageButton A0F;
    public ProgressBar A0G;
    public RelativeLayout A0H;
    public TextView A0I;
    public AnonymousClass0FM A0J;
    public C19460v5 A0K;
    public C19460v5 A0L;
    public CodeInputField A0M;
    public AnonymousClass1N4 A0N;
    public C61303Bi A0O;
    public C57802yq A0P;
    public C21360z5 A0Q;
    public AnonymousClass3DY A0R;
    public C20050ww A0S;
    public TextEmojiLabel A0T;
    public C33771fu A0U;
    public WaTextView A0V;
    public WaTextView A0W;
    public AnonymousClass1RU A0X;
    public C33751fs A0Y;
    public AnonymousClass1MP A0Z;
    public C19630wG A0a;
    public C25271Fq A0b;
    public C20830yE A0c;
    public C62603Gu A0d;
    public C21520zN A0e;
    public C21010yW A0f;
    public AnonymousClass13E A0g;
    public AnonymousClass1CF A0h;
    public C200079gZ A0i;
    public AnonymousClass9XW A0j;
    public C19890wg A0k;
    public AnonymousClass3PP A0l;
    public C63643Kv A0m;
    public AnonymousClass13I A0n;
    public C63543Kl A0o;
    public C62623Gw A0p;
    public AnonymousClass3UV A0q;
    public C29501Ww A0r;
    public AnonymousClass1X8 A0s;
    public C199929gH A0t;
    public AnonymousClass2d1 A0u;
    public C62043En A0v;
    public EnterCodeViewModel A0w;
    public C62143Ey A0x;
    public C39711tN A0y;
    public AnonymousClass3TX A0z;
    public PasskeyAndroidApiImpl A10;
    public RetryCodeCountdownTimersViewModel A11;
    public C90914b9 A12;
    public C37141ls A13;
    public C90924bA A14;
    public C62433Gd A15;
    public AnonymousClass3LA A16;
    public BanReportViewModel A17;
    public AnonymousClass3KW A18;
    public C32681e1 A19;
    public AnonymousClass1RJ A1A;
    public AnonymousClass1RJ A1B;
    public AnonymousClass005 A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public int A1W;
    public ProgressDialog A1X;
    public WaTextView A1Y;
    public WaTextView A1Z;
    public String A1a;
    public String A1b;
    public boolean A1c;
    public final C19680wL A1d;

    public static final String A0G(Intent intent) {
        String str;
        Uri data;
        String path;
        AnonymousClass00C.A0D(intent, 0);
        if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 != null && "r".equals(data2.getHost())) {
                str = data2.getQueryParameter("c");
            }
            str = null;
        } else {
            if (("http".equals(intent.getScheme()) || "https".equals(intent.getScheme())) && (data = intent.getData()) != null && "v.whatsapp.com".equals(data.getHost()) && (path = data.getPath()) != null) {
                str = path.substring(AnonymousClass099.A0B(path, "/", path.length() - 1) + 1);
                AnonymousClass00C.A08(str);
            }
            str = null;
        }
        C36321k7.A1Q("VerifyPhoneNumberUtils/getCodeFromVerificationLink/code/", str, AnonymousClass000.A0u());
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r0 = X.C36411kG.A0w(r10, r15, new java.lang.Object[r3], 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003d, code lost:
        if (r0 == -1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        r0 = r0 - java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r0 <= 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r2 = new java.lang.Object[2];
        r2[0] = r15;
        r0 = X.C36411kG.A0w(r10, X.AnonymousClass3UY.A0D(r12, r0), r2, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        X.AnonymousClass00C.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0I(android.content.res.Resources r10, X.C19970wo r11, X.C18820ts r12, X.AnonymousClass3LA r13, java.lang.String r14, java.lang.String r15) {
        /*
            r4 = 0
            boolean r3 = X.C36341k9.A1a(r10, r12)
            r5 = 2
            X.C36321k7.A17(r13, r15, r11, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeTooManyTriesErrorMsg/method="
            X.C36321k7.A1Q(r0, r14, r1)
            r0 = 2131895603(0x7f122533, float:1.9426044E38)
            java.lang.String r7 = X.C36381kD.A0s(r10, r0)
            java.lang.String r0 = "sms"
            long r0 = r13.A02(r0)
            int r2 = r14.hashCode()
            java.lang.String r6 = "voice"
            switch(r2) {
                case -795576526: goto L_0x006e;
                case 112386354: goto L_0x007c;
                case 2120743944: goto L_0x0061;
                default: goto L_0x0028;
            }
        L_0x0028:
            long r0 = r13.A02(r6)
            r2 = 2131895616(0x7f122540, float:1.942607E38)
            java.lang.String r15 = X.C36381kD.A0s(r10, r2)
            r9 = 2131893425(0x7f121cb1, float:1.9421626E38)
            r8 = 2131893426(0x7f121cb2, float:1.9421628E38)
        L_0x0039:
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x005a
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x005a
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r15
            java.lang.String r0 = X.AnonymousClass3UY.A0D(r12, r0)
            java.lang.String r0 = X.C36411kG.A0w(r10, r0, r2, r3, r8)
        L_0x0056:
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x005a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C36411kG.A0w(r10, r15, r0, r4, r9)
            goto L_0x0056
        L_0x0061:
            boolean r2 = X.C36441kJ.A1N(r14)
            if (r2 == 0) goto L_0x0028
            r9 = 2131893660(0x7f121d9c, float:1.9422103E38)
            r8 = 2131893661(0x7f121d9d, float:1.9422105E38)
            goto L_0x007a
        L_0x006e:
            boolean r2 = X.C36441kJ.A1M(r14)
            if (r2 == 0) goto L_0x0028
            r9 = 2131893433(0x7f121cb9, float:1.9421642E38)
            r8 = 2131893434(0x7f121cba, float:1.9421644E38)
        L_0x007a:
            r15 = r7
            goto L_0x0039
        L_0x007c:
            boolean r2 = r14.equals(r6)
            if (r2 == 0) goto L_0x0028
            r9 = 2131893429(0x7f121cb5, float:1.9421634E38)
            r8 = 2131893430(0x7f121cb6, float:1.9421636E38)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0I(android.content.res.Resources, X.0wo, X.0ts, X.3LA, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0255, code lost:
        if (r12.A0c.A02("android.permission.RECEIVE_SMS") == 0) goto L_0x0257;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0L() {
        /*
            r12 = this;
            r6 = 0
            A1P(r12, r6)
            com.whatsapp.TextEmojiLabel r0 = r12.A0T
            r0.setVisibility(r6)
            android.widget.RelativeLayout r0 = r12.A0H
            r0.setVisibility(r6)
            android.widget.TextView r3 = r12.A0I
            r2 = 2131895567(0x7f12250f, float:1.942597E38)
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = A1e
            X.AnonymousClass000.A1L(r1, r0, r6)
            X.C36341k9.A0s(r12, r3, r1, r2)
            com.whatsapp.WaTextView r1 = r12.A0V
            r0 = 2131895612(0x7f12253c, float:1.9426062E38)
            r1.setText(r0)
            java.lang.String r5 = r12.A0F()
            boolean r0 = X.C36441kJ.A1K(r12)
            r4 = 8
            if (r0 == 0) goto L_0x00ae
            android.widget.RelativeLayout r0 = r12.A0H
            r0.setVisibility(r4)
            android.widget.TextView r0 = r12.A0I
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r1 = r12.A0V
            r0 = 2131892133(0x7f1217a5, float:1.9419006E38)
            r1.setText(r0)
            r1 = 2131892132(0x7f1217a4, float:1.9419004E38)
            r6 = 2131892132(0x7f1217a4, float:1.9419004E38)
            java.lang.String r0 = X.C36351kA.A0w(r12, r5, r7, r1)
            android.text.SpannableString r4 = X.C36441kJ.A0O(r0)
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r7)
            java.lang.String r0 = r12.getString(r1)
            java.lang.String r1 = "%s"
            int r2 = r0.indexOf(r1)
            java.lang.String r0 = r12.getString(r6)
            int r1 = r0.indexOf(r1)
            int r0 = r5.length()
            int r1 = r1 + r0
            r0 = 33
            r4.setSpan(r3, r2, r1, r0)
            com.whatsapp.TextEmojiLabel r0 = r12.A0T
            r0.setText(r4)
        L_0x0078:
            java.lang.String r0 = "VerifyPhoneNumber/initializeBottomSheetEntryText/hide request code buttons in bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131430239(0x7f0b0b5f, float:1.8482173E38)
            android.view.View r0 = X.C03570Gk.A0B(r12, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r12.A0W = r0
            boolean r0 = X.C36441kJ.A1K(r12)
            if (r0 != 0) goto L_0x02a9
            X.12U r0 = r12.A0A
            int r1 = r0.A00()
            r0 = 23
            if (r1 == r0) goto L_0x02a9
            boolean r0 = X.C36431kI.A1T(r12)
            if (r0 == 0) goto L_0x00a6
            com.whatsapp.WaTextView r1 = r12.A0W
            r0 = 2131896063(0x7f1226ff, float:1.9426977E38)
            r1.setText(r0)
        L_0x00a6:
            com.whatsapp.WaTextView r1 = r12.A0W
            r0 = 25
            X.C67133Yq.A00(r1, r12, r0)
            return
        L_0x00ae:
            X.12U r0 = r12.A0A
            int r1 = r0.A00()
            r0 = 23
            if (r1 != r0) goto L_0x00cb
            android.widget.RelativeLayout r0 = r12.A0H
            r0.setVisibility(r4)
            android.widget.TextView r0 = r12.A0I
            r0.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r1 = r12.A0T
            r0 = 2131894382(0x7f12206e, float:1.9423567E38)
            r1.setText(r0)
            goto L_0x0078
        L_0x00cb:
            boolean r0 = X.C36431kI.A1S(r12)
            if (r0 == 0) goto L_0x00ed
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            r0 = 2131895572(0x7f122514, float:1.942598E38)
            java.lang.String r1 = X.C36351kA.A0w(r12, r5, r7, r0)
            r0 = 0
            android.text.SpannableStringBuilder r0 = r12.A07(r0, r1, r6)
            r2.setText(r0)
            android.widget.RelativeLayout r0 = r12.A0H
            r0.setVisibility(r4)
            android.widget.TextView r0 = r12.A0I
        L_0x00e9:
            r0.setVisibility(r4)
            goto L_0x0078
        L_0x00ed:
            boolean r0 = X.C36431kI.A1U(r12)
            if (r0 == 0) goto L_0x011e
            com.whatsapp.WaTextView r1 = r12.A0V
            r0 = 2131887865(0x7f1206f9, float:1.941035E38)
            r1.setText(r0)
            java.lang.String r3 = r12.A1b
            if (r3 == 0) goto L_0x0115
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            r1 = 2131887917(0x7f12072d, float:1.9410455E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r3
            X.C36341k9.A0s(r12, r2, r0, r1)
        L_0x010b:
            com.whatsapp.TextEmojiLabel r1 = r12.A0T
            r0 = 2131887918(0x7f12072e, float:1.9410457E38)
            X.C36331k8.A0q(r12, r1, r0)
            goto L_0x0078
        L_0x0115:
            com.whatsapp.TextEmojiLabel r1 = r12.A0T
            r0 = 2131887918(0x7f12072e, float:1.9410457E38)
            r1.setText(r0)
            goto L_0x010b
        L_0x011e:
            boolean r0 = X.C36431kI.A1T(r12)
            if (r0 == 0) goto L_0x01ac
            com.whatsapp.WaTextView r0 = r12.A1Y
            if (r0 != 0) goto L_0x016b
            android.view.ViewStub r0 = r12.A0E
            android.view.View r1 = r0.inflate()
            r0 = 2131435106(0x7f0b1e62, float:1.8492045E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r1, r0)
            r12.A1Z = r0
            r0 = 2131435105(0x7f0b1e61, float:1.8492043E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r1, r0)
            r12.A1Y = r0
            X.0zN r1 = r12.A0e
            r0 = 4250(0x109a, float:5.956E-42)
            boolean r8 = r1.A0E(r0)
            android.content.SharedPreferences r1 = X.C36331k8.A06(r12)
            java.lang.String r0 = "pref_wa_old_for_uc"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x017b
            com.whatsapp.WaTextView r1 = r12.A1Z
            r0 = 2131895626(0x7f12254a, float:1.942609E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A1Y
            r2 = 2131895625(0x7f122549, float:1.9426088E38)
        L_0x0161:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = A1e
            X.AnonymousClass000.A1L(r1, r0, r6)
            X.C36341k9.A0s(r12, r3, r1, r2)
        L_0x016b:
            com.whatsapp.WaTextView r2 = r12.A0V
            r1 = 2131895622(0x7f122546, float:1.9426082E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r5
            X.C36341k9.A0s(r12, r2, r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r12.A0T
            goto L_0x00e9
        L_0x017b:
            boolean r0 = r12.A1M
            com.whatsapp.WaTextView r1 = r12.A1Z
            if (r0 == 0) goto L_0x0192
            r0 = 2131886332(0x7f1200fc, float:1.940724E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A1Y
            r2 = 2131886330(0x7f1200fa, float:1.9407236E38)
            if (r8 == 0) goto L_0x0161
            r2 = 2131886331(0x7f1200fb, float:1.9407238E38)
            goto L_0x0161
        L_0x0192:
            if (r8 == 0) goto L_0x01a0
            r0 = 2131895621(0x7f122545, float:1.942608E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A1Y
            r2 = 2131895619(0x7f122543, float:1.9426076E38)
            goto L_0x0161
        L_0x01a0:
            r0 = 2131895620(0x7f122544, float:1.9426078E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r3 = r12.A1Y
            r2 = 2131895618(0x7f122542, float:1.9426074E38)
            goto L_0x0161
        L_0x01ac:
            boolean r0 = X.AnonymousClass3PP.A00(r12)
            if (r0 == 0) goto L_0x0205
            X.3PP r0 = r12.A0l
            X.3Gz r0 = r0.A01
            X.3G5 r1 = r0.A05
            long r6 = r1.A00()
            long r4 = r1.A01()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wg r1 = r1.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r3 = X.C36381kD.A0G(r1, r0)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d8
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time"
            r3.remove(r0)
        L_0x01d8:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e1
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time"
            r3.remove(r0)
        L_0x01e1:
            boolean r0 = r3.commit()
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clear-original-wait-time-diffs/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01ec:
            com.whatsapp.TextEmojiLabel r5 = r12.A0T
            X.3PP r4 = r12.A0l
            int r3 = r12.A00
            X.0ts r2 = r12.A00
            java.lang.String r1 = r12.A1D
            java.lang.String r0 = r12.A1F
            java.lang.String r0 = X.C65983Uf.A0D(r2, r1, r0)
            android.text.SpannableStringBuilder r0 = r4.A01(r12, r0, r3)
            r5.setText(r0)
            goto L_0x0078
        L_0x0205:
            long r10 = java.lang.System.currentTimeMillis()
            com.whatsapp.TextEmojiLabel r1 = r12.A0T
            X.0yC r0 = r12.A0D
            X.C36331k8.A1A(r0, r1)
            com.whatsapp.TextEmojiLabel r1 = r12.A0T
            X.0yb r0 = r12.A08
            X.C36331k8.A16(r1, r0)
            X.3LA r1 = r12.A16
            java.lang.String r0 = "sms"
            long r1 = r1.A02(r0)
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0248
            X.3LA r1 = r12.A16
            java.lang.String r0 = "voice"
            long r8 = r1.A02(r0)
            long r8 = r8 - r10
            r2 = 5000(0x1388, double:2.4703E-320)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            r0 = 2131895611(0x7f12253b, float:1.942606E38)
            if (r1 >= 0) goto L_0x023a
            r0 = 2131895605(0x7f122535, float:1.9426048E38)
        L_0x023a:
            java.lang.String r1 = X.C36351kA.A0w(r12, r5, r7, r0)
        L_0x023e:
            r0 = 0
            android.text.SpannableStringBuilder r0 = r12.A07(r0, r1, r6)
            r2.setText(r0)
            goto L_0x0078
        L_0x0248:
            boolean r0 = r12.A1V
            if (r0 != 0) goto L_0x0257
            X.0yE r1 = r12.A0c
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            int r0 = r1.A02(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0258
        L_0x0257:
            r3 = 1
        L_0x0258:
            int r1 = X.C36441kJ.A08(r12)
            r0 = 19
            if (r1 != r0) goto L_0x026b
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            r0 = 2131895607(0x7f122537, float:1.9426052E38)
            if (r3 == 0) goto L_0x023a
            r0 = 2131895609(0x7f122539, float:1.9426056E38)
            goto L_0x023a
        L_0x026b:
            boolean r0 = r12.A1M
            if (r0 == 0) goto L_0x0275
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            r0 = 2131886329(0x7f1200f9, float:1.9407234E38)
            goto L_0x023a
        L_0x0275:
            X.0zN r1 = r12.A0e
            r0 = 7475(0x1d33, float:1.0475E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x029c
            r2 = 2131895608(0x7f122538, float:1.9426054E38)
            if (r3 == 0) goto L_0x0287
            r2 = 2131895610(0x7f12253a, float:1.9426058E38)
        L_0x0287:
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = A1e
            X.AnonymousClass000.A1L(r1, r0, r6)
            java.lang.String r1 = X.C36391kE.A0v(r12, r5, r1, r7, r2)
            android.widget.TextView r0 = r12.A0I
            r0.setVisibility(r4)
        L_0x0299:
            com.whatsapp.TextEmojiLabel r2 = r12.A0T
            goto L_0x023e
        L_0x029c:
            r0 = 2131895606(0x7f122536, float:1.942605E38)
            if (r3 == 0) goto L_0x02a4
            r0 = 2131895604(0x7f122534, float:1.9426046E38)
        L_0x02a4:
            java.lang.String r1 = X.C36351kA.A0w(r12, r5, r7, r0)
            goto L_0x0299
        L_0x02a9:
            com.whatsapp.WaTextView r1 = r12.A0W
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0L():void");
    }

    private void A13(AnonymousClass2d2 r9, boolean z) {
        A12(r9, this, this.A1D, this.A1F, "voice", (String) null, (String) null, z);
    }

    private void A14(AnonymousClass3KE r10) {
        this.A0r.A09();
        this.A15.A01();
        if (!AnonymousClass3SJ.A04(this)) {
            C19970wo r4 = this.A07;
            new AnonymousClass224(this, this.A01, this.A08, r4, this.A00, this.A0D, r10, this.A19).show();
        }
    }

    public static void A1G(VerifyPhoneNumber verifyPhoneNumber, int i) {
        C19420v0 r0;
        int i2 = 1;
        C19420v0 r1 = verifyPhoneNumber.A09;
        if (i == 1) {
            r1.A1O("autoconf_authentication_successful");
            r0 = verifyPhoneNumber.A09;
        } else {
            r1.A1O("autoconf_authentication_failed");
            r0 = verifyPhoneNumber.A09;
            i2 = 0;
        }
        C36341k9.A0v(C36331k8.A05(r0), "pref_autoconf_verification_status", i2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3j() {
        /*
            r13 = this;
            r6 = r13
            boolean r0 = X.C36431kI.A1U(r13)
            if (r0 == 0) goto L_0x0041
            X.0v0 r1 = r13.A09
            java.lang.String r0 = "email_otp_choose_flash_or_voice_instead"
            r1.A1Q(r0)
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/opt out of email verification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "VerifyPhoneNumber/restartActivityWithVoiceVerification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C62433Gd.A00(r13)
            X.1Ww r2 = r13.A0r
            r1 = 5
            r0 = 1
            X.C29501Ww.A02(r2, r1, r0)
            X.3LA r1 = r13.A16
            java.lang.String r0 = "sms"
            long r7 = r1.A02(r0)
            X.3LA r1 = r13.A16
            java.lang.String r0 = "voice"
            long r9 = r1.A02(r0)
            boolean r11 = r13.A1V
            boolean r12 = r13.A1H
            android.content.Intent r0 = X.AnonymousClass190.A0O(r6, r7, r9, r11, r12)
            r13.finish()
            r13.startActivity(r0)
            return
        L_0x0041:
            boolean r0 = X.AnonymousClass3PP.A00(r13)
            if (r0 == 0) goto L_0x004b
            r0 = 2
            r13.A3k(r0)
        L_0x004b:
            X.0v0 r4 = r13.A09
            X.0yb r1 = r13.A08
            boolean r3 = X.C36331k8.A1a(r4, r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r0 = 23
            if (r2 >= r0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/api="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
        L_0x0064:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0067:
            java.lang.String r2 = "/phoneNumber="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r5 == 0) goto L_0x00d4
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/flash/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1D
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1F
            X.C36321k7.A1a(r1, r0)
            X.0v0 r1 = r13.A09
            java.lang.String r0 = "secondary_eligible"
            r1.A1W(r0)
            X.0v0 r0 = r13.A09
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r0)
            java.lang.String r0 = "is_first_flash_call_request"
            X.C36331k8.A0w(r1, r0, r2)
            r13.A1U(r2)
            return
        L_0x0098:
            android.telephony.TelephonyManager r0 = r1.A0K()
            if (r0 == 0) goto L_0x00a7
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x00a7
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/sim absent"
            goto L_0x0064
        L_0x00a7:
            X.005 r2 = r4.A00
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "is_first_flash_call_request"
            boolean r4 = r1.getBoolean(r0, r3)
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "flash_call_eligible"
            int r2 = r1.getInt(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlashCallManager/isEligibleForSecondaryFlashCall/isFirstSecondaryFlashCallRequest="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/flashCallEligible="
            X.C36321k7.A1T(r0, r1, r2)
            if (r4 == 0) goto L_0x0067
            if (r2 < r3) goto L_0x0067
            r5 = 1
            goto L_0x0067
        L_0x00d4:
            java.lang.String r0 = "VerifyPhoneNumber/requestSecondaryFlashOrVoiceCall/voice/cc="
            r1.append(r0)
            java.lang.String r0 = r13.A1D
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A1F
            X.C36321k7.A1a(r1, r0)
            X.0zN r1 = r13.A0e
            X.0v0 r0 = r13.A09
            X.2d2 r2 = X.C65983Uf.A08(r0, r1)
            X.0yb r0 = r13.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            r1 = 0
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.getSimState()
            if (r0 != r3) goto L_0x00fe
            r1 = 1
        L_0x00fe:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A01 = r0
            X.0v0 r0 = r13.A09
            boolean r0 = r0.A2D()
            if (r0 == 0) goto L_0x0112
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A02 = r0
        L_0x0112:
            r13.A13(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A3j():void");
    }

    public void A3m(String str) {
        this.A1O = true;
        this.A16.A08(str, this.A1D, this.A1F);
        this.A01 = 0;
        String A0f2 = this.A09.A0f();
        String A0h2 = this.A09.A0h();
        AnonymousClass3MJ.A00(this.A0K);
        A3l(this.A0u, str, A0f2, A0h2, "sms", (String) null, 2);
    }

    public void A3n(String str) {
        int length;
        int i;
        String str2;
        String str3 = str;
        if (str != null && (length = str.length()) == (i = A1f)) {
            if (length == i) {
                int i2 = 0;
                while (i2 < length) {
                    if (Character.isDigit(str.charAt(i2))) {
                        i2++;
                    }
                }
                String str4 = this.A1D;
                String str5 = this.A1F;
                C18740tg.A06(str5);
                if (C36431kI.A1T(this)) {
                    str2 = "wa_old";
                } else if (C36431kI.A1U(this)) {
                    str2 = "email_otp";
                } else {
                    str2 = "voice";
                }
                AnonymousClass3MJ.A00(this.A0K);
                A3l(this.A0u, str3, str4, str5, str2, (String) null, 1);
                return;
            }
            AnonymousClass3SJ.A01(this, 29);
        }
    }

    public void A3o(boolean z) {
        this.A09.A1Q("email_otp_requested");
        this.A09.A1U((String) null);
        String str = this.A1D;
        C18740tg.A06(str);
        String str2 = this.A1F;
        C18740tg.A06(str2);
        String A0c2 = C36421kH.A0c(this);
        A12(C65983Uf.A08(this.A09, this.A0e), this, str, str2, "email_otp", (String) null, A0c2, z);
    }

    public void A3q(boolean z) {
        this.A09.A1U((String) null);
        String str = this.A1D;
        C18740tg.A06(str);
        String str2 = this.A1F;
        C18740tg.A06(str2);
        String A0c2 = C36421kH.A0c(this);
        A12(C65983Uf.A08(this.A09, this.A0e), this, str, str2, "wa_old", (String) null, A0c2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r0.isNetworkRoaming() != true) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(com.whatsapp.registration.verifyphone.VerifyPhoneNumber r9) {
        /*
            X.0zN r1 = r9.A0e
            r0 = 3977(0xf89, float:5.573E-42)
            boolean r8 = r1.A0E(r0)
            X.0zN r1 = r9.A0e
            r0 = 4056(0xfd8, float:5.684E-42)
            boolean r7 = r1.A0E(r0)
            X.0zN r1 = r9.A0e
            r0 = 4057(0xfd9, float:5.685E-42)
            boolean r6 = r1.A0E(r0)
            X.0zN r1 = r9.A0e
            r0 = 4058(0xfda, float:5.686E-42)
            boolean r5 = r1.A0E(r0)
            X.0zN r1 = r9.A0e
            r0 = 4678(0x1246, float:6.555E-42)
            int r4 = r1.A07(r0)
            X.0yb r3 = r9.A08
            X.0wG r0 = r9.A0a
            android.content.Context r1 = r0.A00
            r2 = 1
            if (r8 == 0) goto L_0x0041
            android.telephony.TelephonyManager r0 = r3.A0K()
            if (r0 == 0) goto L_0x0041
            int r0 = r0.getSimState()
            if (r0 != r2) goto L_0x0041
            r1 = 1
        L_0x003e:
            r9.A03 = r1
            return r1
        L_0x0041:
            if (r7 == 0) goto L_0x004b
            boolean r0 = X.C19600wD.A02(r1)
            if (r0 != r2) goto L_0x004b
            r1 = 2
            goto L_0x003e
        L_0x004b:
            if (r6 == 0) goto L_0x0059
            int r0 = X.C55222uH.A00(r3)
            if (r0 != 0) goto L_0x0055
            r1 = 3
            goto L_0x003e
        L_0x0055:
            if (r0 >= r4) goto L_0x0059
            r1 = 4
            goto L_0x003e
        L_0x0059:
            if (r5 == 0) goto L_0x0068
            android.telephony.TelephonyManager r0 = r3.A0K()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isNetworkRoaming()
            r1 = 5
            if (r0 == r2) goto L_0x003e
        L_0x0068:
            r1 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A01(com.whatsapp.registration.verifyphone.VerifyPhoneNumber):int");
    }

    private SpannableStringBuilder A07(Runnable runnable, String str, boolean z) {
        int i;
        if (this.A0e.A0E(6290)) {
            i = C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            i = 0;
        }
        C80313vC A002 = C80313vC.A00(this, runnable, 36);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.put("edit-number", A002);
        return AnonymousClass3LN.A00((TextAppearanceSpan) null, str, A0J2, i, z);
    }

    private String A0F() {
        String str;
        String str2 = this.A1F;
        if (str2 == null || (str = this.A1D) == null) {
            return null;
        }
        return this.A00.A0H(C65983Uf.A0E(str, str2).replace(' ', 160));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0H(android.content.res.Resources r12, X.C19970wo r13, X.C18820ts r14, X.AnonymousClass3LA r15, java.lang.String r16, java.lang.String r17) {
        /*
            r7 = r17
            r6 = 0
            boolean r5 = X.C36341k9.A1a(r12, r14)
            r8 = 2
            X.C36321k7.A17(r15, r7, r13, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumberUtils/getRequestCodeNextMethodErrorMsg/method="
            r9 = r16
            X.C36321k7.A1Q(r0, r9, r1)
            r0 = 2131895603(0x7f122533, float:1.9426044E38)
            java.lang.String r11 = X.C36381kD.A0s(r12, r0)
            java.lang.String r4 = "sms"
            long r1 = r15.A02(r4)
            int r0 = r9.hashCode()
            java.lang.String r3 = "voice"
            switch(r0) {
                case -795576526: goto L_0x0065;
                case 114009: goto L_0x0073;
                case 2120743944: goto L_0x005a;
                default: goto L_0x002c;
            }
        L_0x002c:
            r10 = 2131893427(0x7f121cb3, float:1.942163E38)
            r9 = 2131893428(0x7f121cb4, float:1.9421632E38)
        L_0x0032:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r6] = r7
            java.lang.String r0 = X.AnonymousClass3UY.A0D(r14, r1)
            java.lang.String r0 = X.C36411kG.A0w(r12, r0, r3, r5, r9)
        L_0x004f:
            X.AnonymousClass00C.A0B(r0)
            return r0
        L_0x0053:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r0 = X.C36411kG.A0w(r12, r7, r0, r6, r10)
            goto L_0x004f
        L_0x005a:
            boolean r0 = X.C36441kJ.A1N(r9)
            r10 = 2131893652(0x7f121d94, float:1.9422087E38)
            r9 = 2131893653(0x7f121d95, float:1.9422089E38)
            goto L_0x006f
        L_0x0065:
            boolean r0 = X.C36441kJ.A1M(r9)
            r10 = 2131893431(0x7f121cb7, float:1.9421638E38)
            r9 = 2131893432(0x7f121cb8, float:1.942164E38)
        L_0x006f:
            if (r0 == 0) goto L_0x002c
            r7 = r11
            goto L_0x0032
        L_0x0073:
            boolean r0 = r9.equals(r4)
            if (r0 == 0) goto L_0x002c
            long r1 = r15.A02(r3)
            r10 = 2131893423(0x7f121caf, float:1.9421622E38)
            r9 = 2131893424(0x7f121cb0, float:1.9421624E38)
            r0 = 2131895616(0x7f122540, float:1.942607E38)
            java.lang.String r7 = X.C36381kD.A0s(r12, r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0H(android.content.res.Resources, X.0wo, X.0ts, X.3LA, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M() {
        /*
            r18 = this;
            r6 = r18
            X.0yb r2 = r6.A08
            X.0yE r1 = r6.A0c
            X.005 r0 = r6.A1C
            java.lang.Object r0 = r0.get()
            X.9oI r0 = (X.C203559oI) r0
            java.util.ArrayList r0 = X.AnonymousClass3SI.A03(r0, r2, r1)
            X.1N4 r5 = r6.A0N
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r3.next()
            X.3XJ r2 = (X.AnonymousClass3XJ) r2
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r2.A02
            int r1 = X.AnonymousClass3U2.A00(r5, r1, r0)
            r0 = 1
            if (r1 != r0) goto L_0x001c
            r4.add(r2)
            goto L_0x001c
        L_0x0037:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r6.A1D
            r1.append(r0)
            java.lang.String r0 = r6.A1F
            java.lang.String r9 = X.AnonymousClass000.A0q(r0, r1)
            X.005 r0 = r6.A1C
            java.lang.Object r7 = r0.get()
            X.9oI r7 = (X.C203559oI) r7
            int r0 = r4.size()
            if (r0 != 0) goto L_0x0094
            r2 = -1
        L_0x0055:
            X.0zN r1 = r6.A0e
            X.0v0 r0 = r6.A09
            X.2d2 r5 = X.C65983Uf.A08(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A03 = r0
            X.0v0 r0 = r6.A09
            boolean r0 = r0.A2D()
            r12 = 1
            if (r0 == 0) goto L_0x0072
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r5.A02 = r0
        L_0x0072:
            boolean r0 = X.C36431kI.A1S(r6)
            if (r0 != 0) goto L_0x0105
            android.content.SharedPreferences r2 = X.C36331k8.A06(r6)
            java.lang.String r0 = "flash_call_eligible"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            if (r0 >= r12) goto L_0x0105
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should not request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r5.A00 = r0
            r6.A13(r5, r1)
            return
        L_0x0094:
            java.util.Iterator r3 = r4.iterator()
        L_0x0098:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r2 = r3.next()
            X.3XJ r2 = (X.AnonymousClass3XJ) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r2.A02
            java.lang.String r14 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r2 = "ZZ"
            X.AUN r0 = r7.A0F(r9, r2)     // Catch:{ 172 -> 0x00be }
            java.lang.Integer r1 = r7.A0H(r0, r14)     // Catch:{ 172 -> 0x00be }
            goto L_0x00f3
        L_0x00be:
            r0 = move-exception
            X.8zA r0 = r0.errorType
            X.8zA r1 = X.C188178zA.INVALID_COUNTRY_CODE
            if (r0 != r1) goto L_0x00f1
            X.AUN r0 = r7.A0F(r14, r2)     // Catch:{ 172 -> 0x00ce }
            java.lang.Integer r1 = r7.A0H(r0, r9)     // Catch:{ 172 -> 0x00ce }
            goto L_0x00f3
        L_0x00ce:
            r0 = move-exception
            X.8zA r0 = r0.errorType
            if (r0 != r1) goto L_0x00f1
            X.AUN r8 = new X.AUN     // Catch:{ 172 -> 0x00f1 }
            r8.<init>()     // Catch:{ 172 -> 0x00f1 }
            X.AUN r13 = new X.AUN     // Catch:{ 172 -> 0x00f1 }
            r13.<init>()     // Catch:{ 172 -> 0x00f1 }
            r10 = 0
            r11 = 0
            r12 = 0
            X.C203559oI.A06(r7, r8, r9, r10, r11, r12)     // Catch:{ 172 -> 0x00f1 }
            r16 = 0
            r17 = 0
            r12 = r7
            r15 = r10
            X.C203559oI.A06(r12, r13, r14, r15, r16, r17)     // Catch:{ 172 -> 0x00f1 }
            java.lang.Integer r1 = r7.A0G(r8, r13)     // Catch:{ 172 -> 0x00f1 }
            goto L_0x00f3
        L_0x00f1:
            java.lang.Integer r1 = X.C023109s.A00
        L_0x00f3:
            java.lang.Integer r0 = X.C023109s.A0R
            if (r1 == r0) goto L_0x00ff
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x00ff
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0098
        L_0x00ff:
            r2 = 1
            goto L_0x0055
        L_0x0102:
            r2 = 0
            goto L_0x0055
        L_0x0105:
            java.lang.String r0 = "VerifyPhoneNumber/maybeAttemptFlashCall/should request flash call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r7 = r6.A1D
            java.lang.String r8 = r6.A1F
            X.C18740tg.A06(r8)
            r10 = 0
            java.lang.String r9 = "flash"
            r11 = r10
            A12(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0M():void");
    }

    private void A0Q() {
        if (this.A1V) {
            if (this.A1U) {
                unregisterReceiver(this.A14);
                this.A1U = false;
            }
        } else if (this.A1P) {
            unregisterReceiver(this.A12);
            this.A1P = false;
        }
    }

    private void A0i() {
        long A022 = this.A16.A02("voice");
        if (A022 != -1) {
            long currentTimeMillis = A022 - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                A0l(currentTimeMillis, "voice");
            } else {
                this.A16.A06("voice");
            }
        }
    }

    private void A0j() {
        String str;
        Log.i("VerifyPhoneNumber/saveBackupToken");
        this.A04.Boy(new C81153wY(this, 19));
        if (C65983Uf.A0V(this.A09, this.A1O)) {
            Log.i("VerifyPhoneNumber/attempt to create autoconf verifier");
            A17(this);
            C19770wU r2 = this.A04;
            boolean z = this.A1O;
            String str2 = this.A1D;
            String str3 = this.A1F;
            if (this.A09.A06() == 3) {
                str = "2";
            } else {
                str = "1";
            }
            C36441kJ.A1E(new C49752jd(this.A09, this.A0q, this.A0t, str2, str3, str, z), r2);
            return;
        }
        Log.i("VerifyPhoneNumber/should not create autoconf verifier");
    }

    private void A0k(long j) {
        if (!this.A0A.A02() && !C36441kJ.A1K(this) && !C36431kI.A1S(this)) {
            this.A0r.A0C(j);
        }
    }

    private void A0l(long j, String str) {
        RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A11;
        long j2 = j;
        if (1 > j || j >= 3000) {
            String str2 = str;
            if (j < 0) {
                retryCodeCountdownTimersViewModel.A03.put(str, -1000L);
                return;
            }
            Map map = retryCodeCountdownTimersViewModel.A05;
            if (map.containsKey(str)) {
                CountDownTimer countDownTimer = (CountDownTimer) map.get(str);
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                retryCodeCountdownTimersViewModel.A03.put(str, 0L);
            }
            Map map2 = retryCodeCountdownTimersViewModel.A04;
            Object obj = map2.get(str);
            if (obj == null) {
                obj = C36431kI.A0S();
                map2.put(str, obj);
            }
            C001700s r4 = (C001700s) obj;
            r4.A0C("running");
            map2.put(str, r4);
            C37041li r3 = new C37041li(r4, retryCodeCountdownTimersViewModel, str2, j2);
            r3.start();
            map.put(str, r3);
            r4.A08(this, new C67793aq(this, str));
        }
    }

    private void A0n(long j, String str, boolean z, long j2) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/");
        A0u2.append(str);
        A0u2.append("/launchAccountDefenceFlow deviceConfirmationFlow: ");
        boolean z2 = z;
        A0u2.append(z2);
        A0u2.append(", smsWait: ");
        A0u2.append(j);
        C36321k7.A1V(", voiceWait: ", A0u2, j2);
        this.A0z.A08(A0J(this), "successful");
        C29501Ww r4 = this.A0r;
        int i = 13;
        if (z) {
            i = 14;
        }
        C29501Ww.A02(r4, i, true);
        C62433Gd.A00(this);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        long j5 = j3 + currentTimeMillis;
        long j6 = j4 + currentTimeMillis;
        AnonymousClass3LA r42 = this.A16;
        C36341k9.A0w(r42.A00.edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", Math.min(j5, j6));
        this.A0l.A02(j3, j4);
        A0O();
        AnonymousClass3SJ.A01(this, 44);
        this.A05.A0I(new C80453vQ(this, j5, j6, z2), 1500);
    }

    public static void A0o(Network network, VerifyPhoneNumber verifyPhoneNumber) {
        String str;
        String str2;
        TelephonyManager A0K2;
        Log.i("VerifyPhoneNumber/executeSilentAuthCoverageRequest");
        if (verifyPhoneNumber.A0e.A0E(6386)) {
            str = AnonymousClass6JD.A0P;
        } else {
            str = AnonymousClass6JD.A0Q;
        }
        String str3 = "";
        if (!verifyPhoneNumber.A0e.A0E(6655) || (A0K2 = verifyPhoneNumber.A08.A0K()) == null) {
            str2 = str3;
        } else {
            C65603St A002 = C65603St.A00(A0K2.getSimOperator());
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("&mcc=");
            A0u2.append(A002.A00);
            A0u2.append("&");
            A0u2.append("mnc");
            A0u2.append("=");
            str2 = AnonymousClass000.A0q(A002.A01, A0u2);
        }
        StringBuilder A0k2 = C36331k8.A0k(str, "&");
        A0k2.append("phone");
        A0k2.append("=");
        A0k2.append(verifyPhoneNumber.A1D);
        A0k2.append(verifyPhoneNumber.A1F);
        if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        }
        C36421kH.A1G(verifyPhoneNumber.A04, verifyPhoneNumber, network, AnonymousClass000.A0q(str3, A0k2), 14);
    }

    private void A0p(AnonymousClass3XC r4) {
        Log.i("VerifyPhoneNumber/userIsBlocked");
        if (this.A18.A02(r4, true)) {
            Log.i("VerifyPhoneNumber/launching-ban-appeals-flow");
            C29501Ww.A02(this.A0r, 10, true);
            AnonymousClass3KW r1 = this.A18;
            C18740tg.A06(r4);
            startActivity(r1.A00(this, r4, 2));
            finish();
            return;
        }
        Log.i("VerifyPhoneNumber/userIsBlocked skipping ban appeals flow and showing blocked dialog");
        this.A0I.setText(R.string.f12nameremoved);
        this.A0T.setVisibility(8);
        this.A0H.setVisibility(8);
        AnonymousClass3SJ.A01(this, 124);
    }

    public static void A0q(AnonymousClass3XC r0, AnonymousClass3KJ r1, VerifyPhoneNumber verifyPhoneNumber) {
        if (r1 == null) {
            verifyPhoneNumber.A0p(r0);
            return;
        }
        verifyPhoneNumber.A0r.A09();
        verifyPhoneNumber.A15.A01();
        verifyPhoneNumber.startActivity(AnonymousClass190.A0y(verifyPhoneNumber, r1));
        verifyPhoneNumber.finish();
    }

    public static void A0r(AnonymousClass3XC r5, VerifyPhoneNumber verifyPhoneNumber, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete");
        verifyPhoneNumber.A0j();
        verifyPhoneNumber.A15.A02(0);
        verifyPhoneNumber.A13.removeMessages(1);
        verifyPhoneNumber.A16.A05();
        verifyPhoneNumber.A0z.A08(A0J(verifyPhoneNumber), "successful");
        if (verifyPhoneNumber.A02 != 3 || !verifyPhoneNumber.A18.A02(r5, true)) {
            verifyPhoneNumber.A09.A1w(z);
            verifyPhoneNumber.A09.A1v(z2);
            verifyPhoneNumber.A09.A1r(z3);
            C19460v5 r1 = verifyPhoneNumber.A0K;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("setVNameCertSetInRegistration");
            }
            verifyPhoneNumber.A0r.A0D(str, str2, str3);
            verifyPhoneNumber.A0r.A04();
            C29501Ww.A02(verifyPhoneNumber.A0r, 2, true);
            C36341k9.A0u(C36331k8.A05(verifyPhoneNumber.A09).remove("flash_call_eligible").remove("is_first_flash_call_request").remove("pref_flash_call_education_link_clicked").remove("pref_flash_call_manage_call_permission_granted").remove("pref_flash_call_call_log_permission_granted").remove("pref_flash_call_education_screen_displayed"), "pref_prefer_sms_over_flash");
            verifyPhoneNumber.A0x.A00();
            verifyPhoneNumber.A0n.A00(false);
            return;
        }
        Log.i("VerifyPhoneNumber/updateStateOnVerificationComplete/launching ban appeals");
        C29501Ww.A02(verifyPhoneNumber.A0r, 10, true);
        AnonymousClass3KW r0 = verifyPhoneNumber.A18;
        C18740tg.A06(r5);
        verifyPhoneNumber.startActivity(r0.A00(verifyPhoneNumber, r5, 2));
        verifyPhoneNumber.finish();
    }

    public static void A12(AnonymousClass2d2 r19, VerifyPhoneNumber verifyPhoneNumber, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        int i;
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (!AnonymousClass3PP.A00(verifyPhoneNumber2) || (i = verifyPhoneNumber2.A00) == 2 || i == 3) {
            String str7 = str3;
            if (verifyPhoneNumber2.A0e.A0E(7694)) {
                if (!"voice".equals(str7)) {
                    verifyPhoneNumber2.A0L();
                } else if (verifyPhoneNumber2.A0e.A0E(7475)) {
                    Object[] A0M2 = AnonymousClass001.A0M();
                    boolean A1b2 = C36361kB.A1b(A0M2, A1e);
                    verifyPhoneNumber2.A0T.setText(verifyPhoneNumber2.A07((Runnable) null, C36391kE.A0v(verifyPhoneNumber2, verifyPhoneNumber2.A0F(), A0M2, 1, R.string.f12nameremoved), A1b2));
                }
            }
            C19770wU r1 = verifyPhoneNumber2.A04;
            int A0B2 = verifyPhoneNumber2.A09.A0B();
            int i2 = C36331k8.A06(verifyPhoneNumber2).getInt("pref_flash_call_manage_call_permission_granted", -1);
            int i3 = C36331k8.A06(verifyPhoneNumber2).getInt("pref_flash_call_call_log_permission_granted", -1);
            C19630wG r4 = verifyPhoneNumber2.A0a;
            boolean A1S2 = AnonymousClass000.A1S(verifyPhoneNumber2.A02, 3);
            if (C36441kJ.A08(verifyPhoneNumber2) == 19) {
                str6 = "twofac_reset";
            } else {
                int i4 = verifyPhoneNumber2.A02;
                if (i4 == 2 || i4 == 1) {
                    str6 = "account_defence";
                } else if (i4 == 3) {
                    str6 = "ban_appeal";
                } else {
                    str6 = null;
                }
            }
            C36441kJ.A1E(new C50112kE(verifyPhoneNumber2.A08, r4, verifyPhoneNumber2.A09, verifyPhoneNumber2.A0q, verifyPhoneNumber2.A0t, r19, verifyPhoneNumber2, str, str2, str7, str4, str5, str6, A0B2, i2, i3, z, A1S2), r1);
            return;
        }
        Log.w("VerifyPhoneNumber/executeRequestCodeTask should not request code yet, returning");
    }

    public static void A15(VerifyPhoneNumber verifyPhoneNumber) {
        int i;
        verifyPhoneNumber.A0Z.A00();
        AnonymousClass1M8 A042 = verifyPhoneNumber.A07.A04();
        C36321k7.A1K(A042, "VerifyPhoneNumber/network/active ", AnonymousClass000.A0u());
        if (A042 == null) {
            i = -1;
        } else if (A042.A04) {
            i = 0;
        } else {
            i = 99;
            if (A042.A06) {
                i = 1;
            }
        }
        int i2 = verifyPhoneNumber.A1W;
        if (i != i2) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("VerifyPhoneNumber/network/switch old=");
            A0u2.append(i2);
            C36321k7.A1T(" new=", A0u2, i);
            verifyPhoneNumber.A1W = i;
            if (i != -1 && verifyPhoneNumber.A13.hasMessages(1)) {
                Log.i("VerifyPhoneNumber/network/switch/has-retry-pending");
                verifyPhoneNumber.A13.removeMessages(1);
                verifyPhoneNumber.A01 = 0;
                String A032 = verifyPhoneNumber.A16.A03(verifyPhoneNumber.A1D, verifyPhoneNumber.A1F);
                if (A032 != null) {
                    verifyPhoneNumber.A13.sendMessage(verifyPhoneNumber.A13.obtainMessage(1, A032));
                    return;
                }
                Log.e("VerifyPhoneNumber/network/switch/no-saved-code");
            }
        }
    }

    public static void A16(VerifyPhoneNumber verifyPhoneNumber) {
        if (verifyPhoneNumber.A0m.A03()) {
            verifyPhoneNumber.A0m.A01();
        } else {
            C36391kE.A1K(verifyPhoneNumber.A0M);
        }
    }

    public static void A17(VerifyPhoneNumber verifyPhoneNumber) {
        AnonymousClass0FM r0 = verifyPhoneNumber.A0J;
        if (r0 != null && r0.isShowing()) {
            verifyPhoneNumber.A0J.dismiss();
        }
        verifyPhoneNumber.A0J = null;
    }

    public static void A18(VerifyPhoneNumber verifyPhoneNumber) {
        if (verifyPhoneNumber.A0o.A00 || verifyPhoneNumber.BLh()) {
            C65983Uf.A0J(verifyPhoneNumber, verifyPhoneNumber.A0b, -1);
        }
    }

    public static void A19(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.Btm(RequestOtpCodeBottomSheetFragment.A03(A0K(verifyPhoneNumber), verifyPhoneNumber.A11.A0S("sms"), verifyPhoneNumber.A11.A0S("voice"), verifyPhoneNumber.A11.A0S("wa_old"), verifyPhoneNumber.A11.A0S("email_otp"), C36431kI.A1T(verifyPhoneNumber), C36431kI.A1U(verifyPhoneNumber)));
    }

    public static void A1A(VerifyPhoneNumber verifyPhoneNumber) {
        Log.i("VerifyPhoneNumber/removeProgressDialog");
        ProgressDialog progressDialog = verifyPhoneNumber.A1X;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        verifyPhoneNumber.A1X = null;
    }

    public static void A1B(VerifyPhoneNumber verifyPhoneNumber) {
        Intent A0B2;
        verifyPhoneNumber.A15.A01();
        if (verifyPhoneNumber.A1H) {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/change numberflow");
            C29501Ww.A02(verifyPhoneNumber.A0r, 3, true);
            if (!verifyPhoneNumber.A0r.A0F()) {
                verifyPhoneNumber.finish();
            }
            A0B2 = AnonymousClass190.A00(verifyPhoneNumber);
        } else {
            Log.i("VerifyPhoneNumber/returnToEnterPhoneNumber/reg flow");
            C29501Ww.A02(verifyPhoneNumber.A0r, 1, true);
            A0B2 = AnonymousClass190.A0B(verifyPhoneNumber);
            A0B2.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        verifyPhoneNumber.startActivity(A0B2);
        verifyPhoneNumber.finish();
    }

    public static void A1C(VerifyPhoneNumber verifyPhoneNumber) {
        Log.i("VerifyPhoneNumber/updateUiOn2FARequired");
        verifyPhoneNumber.A33(AnonymousClass190.A1R(verifyPhoneNumber, verifyPhoneNumber.A1H), false);
        verifyPhoneNumber.finish();
    }

    public static void A1D(VerifyPhoneNumber verifyPhoneNumber) {
        Intent A092;
        if (verifyPhoneNumber.A1H) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/change number");
            if (!verifyPhoneNumber.A0r.A0E()) {
                Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/error completing change number");
                verifyPhoneNumber.finish();
            }
        }
        if (verifyPhoneNumber.A0o.A00) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/notify user to come back and finish registration");
            C65983Uf.A0K(verifyPhoneNumber, verifyPhoneNumber.A0b, verifyPhoneNumber.A0r, verifyPhoneNumber.A1H);
        } else if (verifyPhoneNumber.A1H) {
            Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/complete change number");
            A092 = AnonymousClass190.A09(verifyPhoneNumber);
            verifyPhoneNumber.startActivity(A092);
            A1A(verifyPhoneNumber);
            verifyPhoneNumber.finish();
        }
        Log.i("VerifyPhoneNumber/updateUiOnVerificationComplete/proceed to register name");
        A092 = AnonymousClass190.A0A(verifyPhoneNumber);
        verifyPhoneNumber.startActivity(A092);
        A1A(verifyPhoneNumber);
        verifyPhoneNumber.finish();
    }

    public static void A1E(VerifyPhoneNumber verifyPhoneNumber, int i) {
        String str;
        long A002;
        long A003;
        long A004;
        long A005;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        Intent A0J2;
        int i4;
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        int i5 = i;
        A1A(verifyPhoneNumber2);
        verifyPhoneNumber2.BKE();
        boolean A0R2 = C65983Uf.A0R(C36371kC.A01(C36331k8.A06(verifyPhoneNumber2), "pref_email_otp_eligibility"));
        if ((verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2)) && A0R2) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to email otp");
            Log.i("VerifyPhoneNumber/restartActivityWithEmailVerification");
            C62433Gd.A00(verifyPhoneNumber2);
            C29501Ww.A02(verifyPhoneNumber2.A0r, 17, true);
            str = null;
            i5 = verifyPhoneNumber2.A04;
            A002 = verifyPhoneNumber2.A16.A02("sms");
            A003 = verifyPhoneNumber2.A16.A02("voice");
            A004 = verifyPhoneNumber2.A16.A02("wa_old");
            A005 = verifyPhoneNumber2.A16.A02("email_otp");
            z = verifyPhoneNumber2.A1V;
            Boolean bool = C18750th.A03;
            z2 = true;
            z3 = verifyPhoneNumber2.A1H;
            z4 = false;
            i3 = 0;
        } else if ((verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2)) && ((i4 = verifyPhoneNumber2.A0A) == 1 || i4 == 3)) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to device switching");
            C62433Gd.A00(verifyPhoneNumber2);
            C29501Ww.A02(verifyPhoneNumber2.A0r, 15, true);
            str = null;
            i5 = -1;
            A002 = AnonymousClass3LA.A00(verifyPhoneNumber2, "sms");
            A003 = AnonymousClass3LA.A00(verifyPhoneNumber2, "voice");
            A004 = AnonymousClass3LA.A00(verifyPhoneNumber2, "wa_old");
            A005 = AnonymousClass3LA.A00(verifyPhoneNumber2, "email_otp");
            z = verifyPhoneNumber2.A1V;
            z2 = false;
            z3 = verifyPhoneNumber2.A1H;
            i3 = verifyPhoneNumber2.A0A;
            z4 = false;
        } else if ((verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2)) && verifyPhoneNumber2.A0A == 4) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to device switching self serve");
            A0J2 = AnonymousClass190.A0J(verifyPhoneNumber2, i5, AnonymousClass3LA.A00(verifyPhoneNumber2, "sms"), AnonymousClass3LA.A00(verifyPhoneNumber2, "voice"), AnonymousClass3LA.A00(verifyPhoneNumber2, "wa_old"), AnonymousClass3LA.A00(verifyPhoneNumber2, "email_otp"), verifyPhoneNumber2.A1H);
            verifyPhoneNumber2.finish();
            verifyPhoneNumber2.startActivity(A0J2);
        } else if ((verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2)) && verifyPhoneNumber2.A09 == 1) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to silent auth");
            C29501Ww.A02(verifyPhoneNumber2.A0r, 23, true);
            str = null;
            A002 = AnonymousClass3LA.A00(verifyPhoneNumber2, "sms");
            A003 = AnonymousClass3LA.A00(verifyPhoneNumber2, "voice");
            A004 = AnonymousClass3LA.A00(verifyPhoneNumber2, "wa_old");
            A005 = AnonymousClass3LA.A00(verifyPhoneNumber2, "email_otp");
            z = verifyPhoneNumber2.A1V;
            Boolean bool2 = C18750th.A03;
            z2 = true;
            z3 = verifyPhoneNumber2.A1H;
            z4 = false;
            i2 = verifyPhoneNumber2.A09;
            i3 = 0;
            A0J2 = AnonymousClass190.A19(verifyPhoneNumber2, str, i5, i3, i2, A002, A003, A004, A005, z, z2, z3, z4, false);
            verifyPhoneNumber2.finish();
            verifyPhoneNumber2.startActivity(A0J2);
        } else if ((verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2) || verifyPhoneNumber2.A0A.A00() == 23) && C55252uK.A00(verifyPhoneNumber2.A08, verifyPhoneNumber2.A0e, i5)) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to flash call");
            verifyPhoneNumber2.A33(AnonymousClass190.A0K(verifyPhoneNumber2, i5, AnonymousClass3LA.A00(verifyPhoneNumber2, "sms"), AnonymousClass3LA.A00(verifyPhoneNumber2, "voice"), verifyPhoneNumber2.A1H), true);
            return;
        } else if (verifyPhoneNumber2.A0A.A02() || C36441kJ.A1K(verifyPhoneNumber2) || verifyPhoneNumber2.A0A.A00() == 23 || C36431kI.A1S(verifyPhoneNumber2)) {
            Log.i("VerifyPhoneNumber/maybeTransitionToRelevantRegMethod/fall back to sms");
            A1J(verifyPhoneNumber2, AnonymousClass3LA.A00(verifyPhoneNumber2, "sms"), AnonymousClass3LA.A00(verifyPhoneNumber2, "voice"));
            return;
        } else {
            return;
        }
        i2 = 0;
        A0J2 = AnonymousClass190.A19(verifyPhoneNumber2, str, i5, i3, i2, A002, A003, A004, A005, z, z2, z3, z4, false);
        verifyPhoneNumber2.finish();
        verifyPhoneNumber2.startActivity(A0J2);
    }

    public static void A1F(VerifyPhoneNumber verifyPhoneNumber, int i) {
        if (verifyPhoneNumber.A0o.A00 || verifyPhoneNumber.BLh()) {
            C65983Uf.A0J(verifyPhoneNumber, verifyPhoneNumber.A0b, i);
        } else {
            AnonymousClass3SJ.A01(verifyPhoneNumber, i);
        }
    }

    public static void A1H(VerifyPhoneNumber verifyPhoneNumber, int i) {
        if (!verifyPhoneNumber.A0A.A02() && !C36441kJ.A1K(verifyPhoneNumber) && !C36431kI.A1S(verifyPhoneNumber)) {
            verifyPhoneNumber.A0o.A01(i);
        }
    }

    public static void A1J(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        if (verifyPhoneNumber.A1V) {
            Log.i("VerifyPhoneNumber/maybeUseSmsRetriever/useSmsRetriever already set");
            A1K(verifyPhoneNumber, j, j2);
            return;
        }
        Log.i("VerifyPhoneNumber/maybeUseSmsRetriever");
        C77343qL r4 = new C77343qL(verifyPhoneNumber, j, j2);
        AnonymousClass97V.A00(verifyPhoneNumber.A0a, verifyPhoneNumber.A09, r4, verifyPhoneNumber.A0e.A0E(3902));
    }

    public static void A1K(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        long j3;
        Log.i("VerifyPhoneNumber/restartActivityWithSmsVerification");
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        C62433Gd.A00(verifyPhoneNumber);
        if (C36431kI.A1S(verifyPhoneNumber)) {
            verifyPhoneNumber.A09.A1T("primary_failed");
        }
        if (!C36431kI.A1U(verifyPhoneNumber)) {
            AnonymousClass3SJ.A01(verifyPhoneNumber, 43);
        }
        AnonymousClass17Y r2 = verifyPhoneNumber.A05;
        C80343vF r3 = new C80343vF(verifyPhoneNumber2, 2, j, j2);
        if (C36431kI.A1U(verifyPhoneNumber2)) {
            j3 = 0;
        } else {
            j3 = 1500;
        }
        r2.A0I(r3, j3);
    }

    public static void A1M(VerifyPhoneNumber verifyPhoneNumber, String str) {
        if (!verifyPhoneNumber.A0A.A02() && !C36441kJ.A1K(verifyPhoneNumber) && !C36431kI.A1S(verifyPhoneNumber)) {
            verifyPhoneNumber.A0o.A03(str);
        }
    }

    public static void A1N(VerifyPhoneNumber verifyPhoneNumber, String str) {
        if (C62433Gd.A04 == 12) {
            verifyPhoneNumber.A0H.setVisibility(8);
            return;
        }
        if (!str.equals("flash")) {
            verifyPhoneNumber.A0H.setVisibility(0);
        }
        verifyPhoneNumber.A0i();
    }

    public static void A1O(VerifyPhoneNumber verifyPhoneNumber, String str, String str2, String str3, long j, boolean z, boolean z2) {
        C29501Ww r2;
        int i;
        Log.i("VerifyPhoneNumber/updateStateOn2FARequired");
        if (z) {
            verifyPhoneNumber.A0j();
        }
        long j2 = j;
        if (z2) {
            verifyPhoneNumber.A09.A1n(str2, str3, j2, -1, -1, C36431kI.A08(verifyPhoneNumber));
        }
        verifyPhoneNumber.A0z.A08(A0J(verifyPhoneNumber), "successful");
        if (!"sms".equals(str) || j != -1) {
            r2 = verifyPhoneNumber.A0r;
            i = 7;
        } else {
            r2 = verifyPhoneNumber.A0r;
            i = 18;
        }
        C29501Ww.A02(r2, i, true);
    }

    public static void A1P(VerifyPhoneNumber verifyPhoneNumber, boolean z) {
        int i;
        int i2;
        ImageButton imageButton = verifyPhoneNumber.A0F;
        int i3 = 4;
        if (z) {
            i3 = 0;
        }
        imageButton.setVisibility(i3);
        if (verifyPhoneNumber.A0m.A03()) {
            RelativeLayout relativeLayout = verifyPhoneNumber.A0H;
            int i4 = 16;
            if (z) {
                i4 = 1;
            }
            relativeLayout.setGravity(i4);
            C63643Kv r4 = verifyPhoneNumber.A0m;
            boolean z2 = !z;
            for (TextView textView : r4.A0A) {
                if (!z2) {
                    i = r4.A08;
                } else {
                    i = r4.A07;
                }
                textView.setWidth(i);
                if (!z2) {
                    i2 = r4.A05;
                } else {
                    i2 = r4.A04;
                }
                textView.setHeight(i2);
            }
            if (z) {
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(verifyPhoneNumber.A0F);
                A0a2.setMargins(verifyPhoneNumber.A05, verifyPhoneNumber.A07, verifyPhoneNumber.A06, 0);
                int i5 = verifyPhoneNumber.A08;
                A0a2.width = i5;
                A0a2.height = i5;
                verifyPhoneNumber.A0F.setLayoutParams(A0a2);
            }
        }
    }

    private void A1Q(Runnable runnable) {
        if (this.A0J == null) {
            this.A0J = this.A0v.A00(this, runnable, new C81153wY(this, 21));
            if (!isFinishing()) {
                this.A0J.show();
            }
        }
    }

    private void A1R(Runnable runnable, String str, boolean z) {
        if ((!str.equals("autoconf") || !this.A0e.A0E(3131)) && !str.equals("silent_auth")) {
            if (z) {
                Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/go to 2FA screen");
            } else {
                Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show old verification complete dialog");
                AnonymousClass0FM A022 = C65983Uf.A02(this);
                this.A0J = A022;
                if (A022 != null) {
                    if (!isFinishing()) {
                        this.A0J.show();
                    }
                    this.A05.A0I(runnable, 1000);
                    return;
                }
            }
            runnable.run();
            return;
        }
        Log.i("VerifyPhoneNumber/showVerifiedCompleteDialog/show new verification complete dialog");
        this.A0z.A07("verification_complete_dialog", "successful");
        A1Q(runnable);
    }

    private void A1U(boolean z) {
        Log.i("VerifyPhoneNumber/request-flash");
        if (!this.A0c.A0A()) {
            Log.i("VerifyPhoneNumber/request-flash/request-permission");
            AnonymousClass3US.A07(this, this.A0c, 700, z);
            return;
        }
        Log.i("VerifyPhoneNumber/request-flash/has-permission");
        A0M();
    }

    public void A2F() {
        if (!this.A1c) {
            this.A1c = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0U = C36351kA.A0P(r2);
            this.A0a = C36351kA.A0W(r2);
            this.A19 = C36351kA.A0p(r3);
            this.A18 = (AnonymousClass3KW) r2.ABK.get();
            this.A0f = C36351kA.A0g(r2);
            this.A0Q = C36401kF.A0N(r2);
            this.A0S = C36381kD.A0U(r2);
            this.A0L = C19470v6.A00;
            this.A0z = C36431kI.A0u(r3);
            this.A0n = (AnonymousClass13I) r2.A4a.get();
            this.A0R = C36361kB.A0Q(r2);
            this.A0g = (AnonymousClass13E) r2.A96.get();
            this.A0e = C36401kF.A0Y(r2);
            this.A0X = C36351kA.A0R(r2);
            this.A0t = (C199929gH) r3.A0I.get();
            this.A0N = C36351kA.A0K(r2);
            this.A0x = (C62143Ey) r3.A8K.get();
            this.A10 = C18830tt.A8v(r3);
            this.A0Z = (AnonymousClass1MP) r2.A8X.get();
            this.A1C = C18840tu.A00(r2.AXh);
            this.A0h = C36361kB.A0b(r2);
            this.A0p = C27111My.A38(A0L2);
            this.A0d = (C62603Gu) r3.A8A.get();
            this.A0r = C36401kF.A0d(r2);
            this.A0c = C36351kA.A0X(r2);
            this.A0i = (C200079gZ) r2.AOQ.get();
            this.A0s = C36391kE.A0o(r2);
            this.A0b = C36391kE.A0d(r2);
            this.A0Y = C36361kB.A0X(r3);
            this.A0j = (AnonymousClass9XW) r2.AYZ.get();
            this.A0K = (C19460v5) r2.A5y.get();
            this.A0q = C36431kI.A0t(r2);
            this.A0k = C36351kA.A0m(r2);
            this.A0O = (C61303Bi) A0L2.A0o.get();
            this.A0P = (C57802yq) A0L2.A3S.get();
            this.A0l = C27111My.A37(A0L2);
            this.A0v = C27111My.A3A(A0L2);
        }
    }

    public int A3i() {
        int i = this.A02;
        if (i == 3) {
            return 9;
        }
        if (i == 2) {
            return 14;
        }
        if (i == 1) {
            return 13;
        }
        return 4;
    }

    public void A3k(int i) {
        this.A00 = i;
        AnonymousClass3G5 r2 = this.A0l.A01.A05;
        C36321k7.A1T("AccountDefenceLocalDataRepository/save-acct-defence-state/", AnonymousClass000.A0u(), i);
        SharedPreferences.Editor A0G2 = C36381kD.A0G(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        A0G2.putInt("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state", i);
        if (!A0G2.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-acct-defence-state/error");
        }
        this.A0T.setText(this.A0l.A01(this, C65983Uf.A0D(this.A00, this.A1D, this.A1F), this.A00));
    }

    public void A3l(AnonymousClass2d1 r19, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        C19770wU r2 = this.A04;
        C19420v0 r6 = this.A09;
        AnonymousClass3UV r7 = this.A0q;
        C199929gH r8 = this.A0t;
        boolean A1S2 = AnonymousClass000.A1S(this.A02, 3);
        if (C36441kJ.A08(this) == 19) {
            str6 = "twofac_reset";
        } else {
            int i2 = this.A02;
            if (i2 == 2 || i2 == 1) {
                str6 = "account_defence";
            } else if (i2 == 3) {
                str6 = "ban_appeal";
            } else {
                str6 = null;
            }
        }
        r2.Box(new C50062k8(r6, r7, r8, r19, this, str2, str3, str4, str6, str5, i, A1S2), str);
    }

    public void A3p(boolean z) {
        Log.i("VerifyPhoneNumber/requestSmsCode");
        if (C36431kI.A1U(this)) {
            this.A09.A1Q("email_otp_choose_sms_instead");
        }
        TelephonyManager A0K2 = this.A08.A0K();
        if (A0K2 != null) {
            A0K2.getNetworkOperator();
            A0K2.getNetworkOperatorName();
            A0K2.getSimOperator();
            A0K2.getSimOperatorName();
        }
        this.A09.A1U((String) null);
        if (C36431kI.A1T(this) || C36431kI.A1U(this)) {
            Log.i("VerifyPhoneNumber/requestSmsCode/maybeUseSmsRetriever");
            A1J(this, this.A11.A0S("sms"), this.A11.A0S("voice"));
            return;
        }
        AnonymousClass2d2 A082 = C65983Uf.A08(this.A09, this.A0e);
        if (this.A09.A2D()) {
            A082.A02 = C36371kC.A0m();
        }
        String str = this.A1D;
        C18740tg.A06(str);
        String str2 = this.A1F;
        C18740tg.A06(str2);
        A12(A082, this, str, str2, "sms", (String) null, C36421kH.A0c(this), z);
    }

    public void BKC(boolean z, String str) {
        int i;
        if (z) {
            switch (str.hashCode()) {
                case -795576526:
                    if (C36441kJ.A1M(str)) {
                        i = 46;
                        break;
                    } else {
                        return;
                    }
                case 114009:
                    if (str.equals("sms")) {
                        i = 52;
                        break;
                    } else {
                        return;
                    }
                case 112386354:
                    if (str.equals("voice")) {
                        A1A(this);
                        return;
                    }
                    return;
                case 2120743944:
                    if (C36441kJ.A1N(str)) {
                        i = 51;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            AnonymousClass3SJ.A00(this, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a6, code lost:
        if (r3 != X.C52082or.A0T) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a8, code lost:
        X.C18740tg.A06(r11);
        A0w(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b0, code lost:
        r2 = X.C36341k9.A0j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b6, code lost:
        if (r3 != r5) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b8, code lost:
        r1 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ba, code lost:
        X.C36321k7.A1Z(r2, r1);
        X.C65983Uf.A0Q(r12.A09, "voice-bad-token");
        r1 = 41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c6, code lost:
        r1 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        A0k(r2);
        X.AnonymousClass3UY.A0I(r12, com.whatsapp.R.string.f12nameremoved, r2);
        X.AnonymousClass3LA.A01(r12.A16, "voice", r2);
        A0l(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e0, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e1, code lost:
        X.C36351kA.A1P("/too-recent/time-not-int", X.C36411kG.A12(r0), r3);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        A0k(r2);
        X.AnonymousClass3UY.A0I(r12, com.whatsapp.R.string.f12nameremoved, r2);
        X.AnonymousClass3LA.A01(r12.A16, "voice", r2);
        A0l(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0306, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0307, code lost:
        X.C36351kA.A1P("/too-recent/time-not-int", X.C36331k8.A0k("VerifyPhoneNumber/verifyvoice/request/", r0), r3);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r1 = X.C66713Xa.A00(r11);
        r12.A0C = r1;
        A0k(r1);
        A1M(r12, X.C36391kE.A0v(r12, X.AnonymousClass3UY.A0D(r12.A00, r12.A0C), X.AnonymousClass001.A0L(), 0, com.whatsapp.R.string.f12nameremoved));
        r12.A16.A07("voice", java.lang.System.currentTimeMillis() + r12.A0C);
        A0l(r12.A0C, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0348, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0349, code lost:
        X.C36351kA.A1P("/triedtoomanytimesallmethods/time-not-int", X.C36411kG.A12(r0), r3);
        A1H(r12, 26);
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r0.equals("flash") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r1 = X.C66713Xa.A00(r11);
        r12.A0C = r1;
        A0k(r1);
        A1H(r12, 31);
        r12.A16.A07("voice", java.lang.System.currentTimeMillis() + r12.A0C);
        A0l(r12.A0C, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x037b, code lost:
        A1F(r12, 22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r1 = X.C66713Xa.A00(r11);
        r12.A0C = r1;
        A0k(r1);
        A1H(r12, 32);
        r12.A16.A07("voice", java.lang.System.currentTimeMillis() + r12.A0C);
        A0l(r12.A0C, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03a3, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a4, code lost:
        r2 = X.C36411kG.A12(r0);
        r1 = "/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03ab, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ac, code lost:
        r2 = X.C36411kG.A12(r0);
        r1 = "/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b2, code lost:
        X.C36351kA.A1P(r1, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b5, code lost:
        A1H(r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03ba, code lost:
        r5 = X.C52082or.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03bc, code lost:
        if (r3 == r5) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03c0, code lost:
        if (r3 == X.C52082or.A0J) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03c8, code lost:
        if (r0.equals("flash") == false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03cc, code lost:
        if (r3 != X.C52082or.A09) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03ce, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r3 == X.C52082or.A09) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d7, code lost:
        if (X.C36431kI.A1S(r12) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03d9, code lost:
        r2 = X.C65983Uf.A08(r12.A09, r12.A0e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03e7, code lost:
        if (r12.A09.A2D() == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03e9, code lost:
        r2.A02 = X.C36371kC.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ef, code lost:
        A13(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03f7, code lost:
        if (r3 != X.C52082or.A0E) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03f9, code lost:
        A1L(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0400, code lost:
        if (r3 != X.C52082or.A05) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        A0y(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0402, code lost:
        X.C29501Ww.A02(r12.A0r, 16, true);
        A33(X.AnonymousClass190.A1Q(r12, r12.A1H), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0415, code lost:
        X.C18740tg.A06(r11);
        r6 = X.C65983Uf.A01(r11.A0M, 0);
        r10 = X.C65983Uf.A01(r11.A0O, 0);
        A0n(r6, r0, X.C36361kB.A1a(r3, r5), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0431, code lost:
        r2 = X.C36421kH.A0f(r11);
        r2.append("VerifyPhoneNumber/verifyvoice/request/");
        r2.append(r0);
        X.C36321k7.A1a(r2, "/requested");
        r9 = r0.equals("flash");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x044a, code lost:
        if (r9 == false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x044c, code lost:
        r1 = r11.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x044e, code lost:
        if (r1 == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0450, code lost:
        r12.A0B = java.lang.Long.parseLong(r1) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0457, code lost:
        r6 = r12.A0y;
        r1 = r12.A0B;
        r6.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0460, code lost:
        if (r1 >= 1000) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0462, code lost:
        r18 = X.AnonymousClass6X5.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0464, code lost:
        r6.A02.A0C("running");
        X.C36341k9.A19(r6.A01, false);
        r6.A00 = new X.AnonymousClass4VR(r6, 3, r1 / ((long) 2), r18).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0483, code lost:
        r1 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0485, code lost:
        if (r1 <= 0) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0487, code lost:
        if (r9 != false) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0489, code lost:
        A1f = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0491, code lost:
        if (r12.A0m.A03() != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0493, code lost:
        r2 = r12.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0495, code lost:
        if (r2 == null) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0497, code lost:
        r2.A02 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x049b, code lost:
        r1 = r12.A09;
        X.C36341k9.A0v(X.C19420v0.A00(r1), "registration_voice_code_length", r11.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r3 != X.C52082or.A0S) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04a8, code lost:
        r2 = r11.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ae, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04b0, code lost:
        r12.A0r.A0C(java.lang.Long.parseLong(r2) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04ba, code lost:
        if (r9 == false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04bc, code lost:
        r3 = r12.A0x;
        r15 = r12.A1D;
        r2 = r12.A1F;
        X.C18740tg.A06(r2);
        r14 = r11.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04c7, code lost:
        if (r14 != null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04c9, code lost:
        r14 = "(.*)xyz(.*)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04cb, code lost:
        r11 = r12.A0u;
        X.AnonymousClass00C.A0D(r15, 0);
        X.C36331k8.A1G(r2, 1, r11);
        r1 = r3.A02.A00;
        X.AnonymousClass00C.A08(r1);
        r6 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04de, code lost:
        if (r6 != null) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e0, code lost:
        r13 = r3.A06;
        r7 = r3.A01;
        r8 = r3.A03;
        r9 = r3.A04;
        r10 = r3.A05;
        X.C18740tg.A06(r2);
        r6 = new X.C36671l3(r7, r8, r9, r10, r11, r12, r13, r14, r15, r2);
        r3.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        X.C18740tg.A06(r11);
        A0x(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04f6, code lost:
        r7 = r1;
        X.C26981Mg.A00(r6, r7, new android.content.IntentFilter("android.intent.action.PHONE_STATE"), (android.os.Handler) null, X.C19430v1.A0C, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0506, code lost:
        r2 = X.C36441kJ.A08(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x050c, code lost:
        if (r2 == 13) goto L_0x0512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0510, code lost:
        if (r2 != 14) goto L_0x052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0518, code lost:
        if ("voice".equals(r0) == false) goto L_0x052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x051a, code lost:
        r2 = X.C36331k8.A0k("VerifyPhoneNumber/verifyvoice/request/", r0);
        r2.append("/update acct defence stat:");
        X.C36321k7.A1Y(r2, 3);
        A3k(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x052a, code lost:
        r1 = r12.A0w;
        r1.A0S();
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        if (r1 != null) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        A1N(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0539, code lost:
        throw X.C36331k8.A0d("verifyPhoneNumberPrefs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x053a, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x053e, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0543, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/response is null");
        A0l(300000, "sms");
        A0l(300000, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0559, code lost:
        if (X.C36431kI.A1T(r12) == false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x055b, code lost:
        r4 = "wa_old";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055d, code lost:
        A0l(300000, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0566, code lost:
        if (X.C36431kI.A1U(r12) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0568, code lost:
        r4 = "email_otp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0571, code lost:
        if (r0.equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0577, code lost:
        if (isFinishing() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0579, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onRequestGenericCodeResponse/method=");
        r1.append(r0);
        X.C36321k7.A1K(r3, "/status=", r1);
        X.C65983Uf.A00 = "";
        r2 = X.AnonymousClass000.A0v("VerifyPhoneNumber/onRequestGenericCodeResponse/method=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0592, code lost:
        if (r22 == null) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0594, code lost:
        A0y(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0599, code lost:
        if (r3 != X.C52082or.A0S) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x059b, code lost:
        X.C18740tg.A06(r11);
        A0x(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05a2, code lost:
        r2.append(r0);
        X.C36341k9.A1O(r2, "/response is null");
        A0l(300000, "sms");
        A0l(300000, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05bb, code lost:
        if (X.C36431kI.A1T(r12) == false) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05bd, code lost:
        r4 = "wa_old";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05bf, code lost:
        A0l(300000, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05c7, code lost:
        if (X.C36431kI.A1U(r12) == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c9, code lost:
        r4 = "email_otp";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r3 == X.C52082or.A0U) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05ce, code lost:
        if (r3 != X.C52082or.A0U) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d0, code lost:
        X.C18740tg.A06(r11);
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onGenericCodeSent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05dc, code lost:
        if (X.C36431kI.A1U(r12) == false) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05de, code lost:
        r12.A09.A1Q("email_sent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05e5, code lost:
        r1 = X.C36441kJ.A08(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05eb, code lost:
        if (r1 == 13) goto L_0x05f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05ef, code lost:
        if (r1 != 14) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f1, code lost:
        A3k(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method=");
        r2.append(r0);
        X.C36321k7.A1K(r3, "/status=", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05f7, code lost:
        if (r12.A1L != false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05f9, code lost:
        r2 = r12.A0l.A01.A05;
        X.C36321k7.A1X("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/", X.AnonymousClass000.A0u(), true);
        r1 = X.C36381kD.A0G(r2.A00, "AccountDefenceLocalDataRepository_prefs");
        r1.putBoolean("com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x061a, code lost:
        if (r1.commit() != false) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x061c, code lost:
        com.whatsapp.util.Log.e("AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0621, code lost:
        r12.A1L = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0623, code lost:
        r2 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0625, code lost:
        if (r2 <= 0) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0627, code lost:
        A1e = r2;
        X.C36341k9.A0v(X.C36421kH.A0A(r12), "registration_sms_code_length", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0632, code lost:
        r1 = r11.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0638, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3 != X.C52082or.A08) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x063a, code lost:
        r12.A0r.A0C(X.C36411kG.A0B(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0643, code lost:
        r0 = r12.A0w;
        r0.A0S();
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x064a, code lost:
        if (r0 != null) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0652, code lost:
        throw X.C36331k8.A0d("verifyPhoneNumberPrefs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0653, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0658, code lost:
        A0Q();
        r2 = X.AnonymousClass000.A0u();
        r2.append("VerifyPhoneNumber/onRequestGenericCodeError/method=");
        r2.append(r0);
        X.C36321k7.A1K(r3, "/status=", r2);
        r8 = X.C36441kJ.A1N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x066e, code lost:
        if (r8 == false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0676, code lost:
        if (r3.equals(X.C52082or.A0T) != false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        X.AnonymousClass3SJ.A00(r12, 52);
        X.C55232uI.A00(r12.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0678, code lost:
        r12.A09.A1Q("email_otp_request_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0681, code lost:
        if (r3 != X.C52082or.A08) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0683, code lost:
        X.AnonymousClass3SJ.A00(r12, 52);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0688, code lost:
        X.C55232uI.A00(r12.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x068d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0690, code lost:
        if (r3 != X.C52082or.A0L) goto L_0x06d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0692, code lost:
        X.C18740tg.A06(r11);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-temp-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06a7, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06a9, code lost:
        r1 = r12.A0o;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06ae, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06b1, code lost:
        A18(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        r12.A0r.A0C(r2);
        r12.A0o.A03(X.AnonymousClass3UY.A01(r12, com.whatsapp.R.string.f12nameremoved, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06cc, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter", r1);
        r1 = r12.A0o;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06d9, code lost:
        if (r3 != X.C52082or.A0Q) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06db, code lost:
        X.C36341k9.A1O(X.C36341k9.A0j(r0), "/unspecified");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-error-unspecified");
        r0 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06ed, code lost:
        A1H(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06f3, code lost:
        if (r3 != X.C52082or.A0M) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06f5, code lost:
        X.C18740tg.A06(r11);
        X.C36321k7.A1R("VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method=", r0, X.AnonymousClass000.A0u());
        r3 = r0.equals("wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0709, code lost:
        if (r3 == false) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x070b, code lost:
        r5 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0715, code lost:
        if (X.AnonymousClass3MJ.A01(r12.A09, r11, r12, "server-send-request-too-many-tries") != false) goto L_0x0a86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0717, code lost:
        r12.A0o.A01(r5);
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x071f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0720, code lost:
        r5 = 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0722, code lost:
        if (r8 == false) goto L_0x070d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0724, code lost:
        r5 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0729, code lost:
        if (r3 != X.C52082or.A0N) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x072b, code lost:
        X.C18740tg.A06(r11);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods");
        r4 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x073d, code lost:
        if (X.AnonymousClass3MJ.A01(r12.A09, r11, r12, "server-send-request-too-many-tries-all-methods") == false) goto L_0x08b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0743, code lost:
        if (r3 != X.C52082or.A06) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0745, code lost:
        X.C65983Uf.A0Q(r12.A09, "server-send-request-error-connectivity");
        r0 = X.C36381kD.A0r(r12, getString(com.whatsapp.R.string.f12nameremoved), X.AnonymousClass001.A0L(), com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x075e, code lost:
        A1M(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0765, code lost:
        if (r3 != X.C52082or.A02) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0767, code lost:
        X.C18740tg.A06(r11);
        A0z(r11, r0, "server-send-request-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x076f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0772, code lost:
        if (r3 != X.C52082or.A0C) goto L_0x0788;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0774, code lost:
        X.C36321k7.A1Z(X.C36341k9.A0j(r0), "/missing-parameter");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-missing-param");
        r0 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r12.A09.A1W("secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x078a, code lost:
        if (r3 != X.C52082or.A0G) goto L_0x079c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x078c, code lost:
        X.C18740tg.A06(r11);
        r1 = r11.A08;
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooOld");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0796, code lost:
        if (r1 == null) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0798, code lost:
        A14(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x079b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x079e, code lost:
        if (r3 != X.C52082or.A0P) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07a0, code lost:
        r1 = X.C36421kH.A0f(r11);
        r1.append("VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter=");
        r1.append(r11.A0K);
        X.C36341k9.A1O(r1, " seconds");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07c0, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07c2, code lost:
        r1 = r12.A0o;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        A1E(r12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x07cb, code lost:
        if (r3 != X.C52082or.A04) goto L_0x07ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07cd, code lost:
        r4 = r11.A05;
        r3 = r11.A07;
        X.C36321k7.A1Z(X.C36341k9.A0j(r0), "/blocked");
        r12.A15.A02(12);
        X.C65983Uf.A0Q(r12.A09, "server-send-request-user-blocked");
        A0q(r4, r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x07ef, code lost:
        if (r3 != X.C52082or.A0D) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07f1, code lost:
        X.C18740tg.A06(r11);
        A1T(r0, "server-send-request-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07fc, code lost:
        if (r3 != X.C52082or.A0O) goto L_0x081b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07fe, code lost:
        X.C18740tg.A06(r11);
        com.whatsapp.util.Log.w("VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-too-many-guesses");
        X.C36401kF.A1J(r12);
        r4 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0818, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) == false) goto L_0x08b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x081d, code lost:
        if (r3 != X.C52082or.A0H) goto L_0x08f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x081f, code lost:
        X.C18740tg.A06(r11);
        r4 = X.C36441kJ.A1M(r0);
        com.whatsapp.util.Log.e("VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout");
        X.C65983Uf.A0Q(r12.A09, "server-send-request-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0834, code lost:
        if (r4 == false) goto L_0x0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0836, code lost:
        r3 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x083f, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x08c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0841, code lost:
        r0 = getString(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0847, code lost:
        r3 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r3 != X.C52082or.A0L) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x084a, code lost:
        if (r8 == false) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x084c, code lost:
        r3 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r1 = X.C66713Xa.A00(r11);
        r12.A0C = r1;
        r12.A0r.A0C(r1);
        r12.A1Q = true;
        r12.A0o.A01(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        r12.A0r.A0C(r2);
        r12.A0o.A03(X.AnonymousClass3UY.A01(r12, com.whatsapp.R.string.f12nameremoved, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x087e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x087f, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        r1 = r12.A0o;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        r12.A0C = r2;
        r12.A0r.A0C(r2);
        r12.A1Q = true;
        r1 = r12.A0o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        X.C18740tg.A06(r11);
        r2 = X.AnonymousClass000.A0u();
        X.C36411kG.A1S("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method=", r0, r2);
        X.C36321k7.A1a(r2, r11.A0K);
        X.C65983Uf.A0Q(r12.A09, "voice-temp-unavail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x089f, code lost:
        if (X.C36441kJ.A1M(r0) == false) goto L_0x08a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x08a1, code lost:
        r0 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x08a4, code lost:
        r0 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08a6, code lost:
        if (r8 == false) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x08a8, code lost:
        r0 = 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x08aa, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x08af, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x08b0, code lost:
        r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x08b3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x08b4, code lost:
        r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x08b6, code lost:
        com.whatsapp.util.Log.w(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x08b9, code lost:
        r12.A0o.A01(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        r1 = X.C66713Xa.A00(r11);
        r12.A0r.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08c9, code lost:
        if (r4 == false) goto L_0x08cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08cb, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08cf, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08d2, code lost:
        if (r8 == false) goto L_0x08d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08d4, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08d7, code lost:
        X.AnonymousClass3UY.A0I(r12, r0, r1);
        X.AnonymousClass3LA.A01(r12.A16, "sms", r1);
        A0l(r1, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08e4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08e5, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/too-recent/time-not-int", r1);
        A1M(r12, getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08f5, code lost:
        if (r3 != X.C52082or.A0I) goto L_0x0914;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08f7, code lost:
        r1 = X.C36431kI.A1U(r12);
        X.C18740tg.A06(r11);
        r14 = com.whatsapp.R.string.f12nameremoved;
        r15 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0904, code lost:
        if (r1 == false) goto L_0x090c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0906, code lost:
        r14 = com.whatsapp.R.string.f12nameremoved;
        r15 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x090c, code lost:
        A10(r11, r0, "server-send-request-provider-unroutable", r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0913, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r1 = getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0916, code lost:
        if (r3 != X.C52082or.A0F) goto L_0x0937;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0918, code lost:
        r1 = X.C36431kI.A1U(r12);
        X.C18740tg.A06(r11);
        r15 = com.whatsapp.R.string.f12nameremoved;
        r16 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0925, code lost:
        if (r1 == false) goto L_0x092d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0927, code lost:
        r15 = com.whatsapp.R.string.f12nameremoved;
        r16 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x092d, code lost:
        A11(r11, r0, "server-send-request-no-routes", "noRouteSms", r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0936, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0937, code lost:
        r4 = X.C52082or.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0939, code lost:
        if (r3 == r4) goto L_0x0b2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x093d, code lost:
        if (r3 == X.C52082or.A0A) goto L_0x0b2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        A1M(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0941, code lost:
        if (r3 != X.C52082or.A0T) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0943, code lost:
        X.C18740tg.A06(r11);
        A0w(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0949, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x094a, code lost:
        r4 = X.C52082or.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x094c, code lost:
        if (r3 == r4) goto L_0x0b14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0950, code lost:
        if (r3 == X.C52082or.A0J) goto L_0x0b14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0954, code lost:
        if (r3 != X.C52082or.A0E) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0956, code lost:
        A1L(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0959, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x095c, code lost:
        if (r3 == X.C52082or.A05) goto L_0x09b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0960, code lost:
        if (r3 == X.C52082or.A0K) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0964, code lost:
        if (r3 != X.C52082or.A0R) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0966, code lost:
        if (r22 == null) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2 = X.C66713Xa.A00(r11);
        A0k(r2);
        X.AnonymousClass3UY.A0I(r12, com.whatsapp.R.string.f12nameremoved, r2);
        X.AnonymousClass3LA.A01(r12.A16, "voice", r2);
        A0l(r2, "voice");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x096e, code lost:
        if (android.text.TextUtils.isEmpty(r11.A0L) != false) goto L_0x0b06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0970, code lost:
        r4 = r11.A0L;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/transitionToSendSmsToWa");
        r3 = r12.A1H;
        r1 = X.C36431kI.A0D().setClassName(getPackageName(), "com.whatsapp.registration.SendSmsToWa");
        r1.putExtra("sendSmsNumber", r4);
        r1.putExtra("changeNumber", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0991, code lost:
        A33(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0995, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09b7, code lost:
        X.C29501Ww.A02(r12.A0r, 16, true);
        r1 = X.AnonymousClass190.A1Q(r12, r12.A1H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x09ea, code lost:
        r12.A09.A1E(r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x09f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        X.C36351kA.A1P("/temporarily-unavailable/unable-to-parse-retryAfter", X.C36411kG.A12(r0), r3);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0a12, code lost:
        BKE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a36, code lost:
        A1E(r12, r12.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a3b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        if (r3 != X.C52082or.A0Q) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:?, code lost:
        r0 = X.C66713Xa.A00(r11);
        r12.A0C = r0;
        r12.A0r.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a93, code lost:
        if (r3 == false) goto L_0x0abd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a95, code lost:
        r12.A0o.A03(X.C36391kE.A0v(r12, X.AnonymousClass3UY.A0D(r12.A00, r12.A0C), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved));
        r12.A16.A07("wa_old", java.lang.System.currentTimeMillis() + r12.A0C);
        A0l(r12.A0C, "wa_old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0abc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        X.C36341k9.A1O(X.C36341k9.A0j(r0), "/unspecified");
        X.C65983Uf.A0Q(r12.A09, "voice-error");
        r1 = 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0abd, code lost:
        r12.A0o.A03(X.C36391kE.A0v(r12, X.AnonymousClass3UY.A0D(r12.A00, r12.A0C), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved));
        r12.A16.A07("sms", java.lang.System.currentTimeMillis() + r12.A0C);
        A0l(r12.A0C, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0ae4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0ae5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0ae6, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int", r1);
        r12.A0o.A01(r5);
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0af3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0af4, code lost:
        r12.A0Q.A01 = true;
        r12.A15.A02(8);
        A1F(r12, 22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0b05, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0b06, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/send sms number is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b0b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        A1H(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0b14, code lost:
        X.C18740tg.A06(r11);
        A0n(X.C65983Uf.A01(r11.A0M, 0), "sms", X.C36361kB.A1a(r3, r4), X.C65983Uf.A01(r11.A0O, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b2e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b2f, code lost:
        r1 = X.C36341k9.A0j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0b35, code lost:
        if (r3 != r4) goto L_0x0b47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b37, code lost:
        r0 = "/bad-token";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0b39, code lost:
        X.C36321k7.A1Z(r1, r0);
        X.C65983Uf.A0Q(r12.A09, "server-send-request-bad-token");
        A1H(r12, 41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0b46, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b47, code lost:
        r0 = "/invalid-skey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r3 != X.C52082or.A0M) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0106, code lost:
        X.C18740tg.A06(r11);
        X.C36321k7.A1Q("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method=", r0, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        if (X.AnonymousClass3MJ.A01(r12.A09, r11, r12, "voice-error-too-many-tries") != false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0120, code lost:
        A1H(r12, 26);
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        if (r3 != X.C52082or.A0N) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        X.C18740tg.A06(r11);
        r2 = X.AnonymousClass000.A0u();
        X.C36411kG.A1S("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method=", r0, r2);
        X.C36321k7.A1a(r2, r11.A0K);
        r6 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        if (X.AnonymousClass3MJ.A01(r12.A09, r11, r12, "voice-error-too-many-tries-all-methods") == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014f, code lost:
        if (r3 != X.C52082or.A06) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0151, code lost:
        r1 = X.C36381kD.A0r(r12, getString(com.whatsapp.R.string.f12nameremoved), X.AnonymousClass001.A0L(), com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0167, code lost:
        if (r3 != X.C52082or.A02) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0169, code lost:
        X.C18740tg.A06(r11);
        A0z(r11, r0, "voice-bad-param");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        if (r3 != X.C52082or.A0C) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0177, code lost:
        X.C36321k7.A1Z(X.C36341k9.A0j(r0), "/missing-parameter");
        X.C65983Uf.A0Q(r12.A09, "voice-missing-param");
        r1 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018d, code lost:
        if (r3 != X.C52082or.A0G) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        X.C18740tg.A06(r11);
        r3 = r11.A08;
        X.C36321k7.A1Q("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method=", r0, X.AnonymousClass000.A0u());
        X.C65983Uf.A0Q(r12.A09, "voice-version-too-old");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a8, code lost:
        if (X.C36431kI.A1S(r12) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01aa, code lost:
        if (r3 == null) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ac, code lost:
        A14(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b3, code lost:
        if (r3 != X.C52082or.A0P) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        X.C18740tg.A06(r11);
        r2 = X.AnonymousClass000.A0u();
        X.C36411kG.A1S("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method=", r0, r2);
        X.C36321k7.A1a(r2, r11.A0K);
        X.C65983Uf.A0Q(r12.A09, "voice-too-recent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d7, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01de, code lost:
        if (r3 != X.C52082or.A04) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e0, code lost:
        X.C18740tg.A06(r11);
        r5 = r11.A05;
        r4 = r11.A07;
        X.C36321k7.A1Z(X.C36341k9.A0j(r0), "/blocked");
        r12.A15.A02(12);
        X.C65983Uf.A0Q(r12.A09, "voice-blocked");
        A0q(r5, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
        if (r3 != X.C52082or.A0D) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0.equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0207, code lost:
        X.C18740tg.A06(r11);
        A1T(r0, "voice-next-method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0213, code lost:
        if (r3 != X.C52082or.A0O) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0215, code lost:
        X.C18740tg.A06(r11);
        r2 = X.AnonymousClass000.A0u();
        X.C36411kG.A1S("VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method=", r0, r2);
        X.C36321k7.A1a(r2, r11.A0K);
        X.C65983Uf.A0Q(r12.A09, "voice-too-many-guesses");
        X.C36401kF.A1J(r12);
        r6 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023a, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0240, code lost:
        if (r3 != X.C52082or.A0H) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0242, code lost:
        X.C18740tg.A06(r11);
        r2 = X.AnonymousClass000.A0u();
        r2.append("VerifyPhoneNumber/verifyvoice/request/");
        r2.append(r0);
        X.C36321k7.A1Z(r2, "/provider-timeout");
        X.C65983Uf.A0Q(r12.A09, "voice-provider-timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0265, code lost:
        if (X.AnonymousClass3MJ.A02(r11.A0K) != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0267, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = X.AnonymousClass000.A0u();
        r2.append("VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method=");
        r2.append(r0);
        X.C36321k7.A1K(r3, "/status=", r2);
        X.C65983Uf.A00 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026e, code lost:
        if (r3 != X.C52082or.A0I) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0270, code lost:
        X.C18740tg.A06(r11);
        A10(r11, r0, "voice-provider-unroutable", com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0285, code lost:
        if (r3 != X.C52082or.A0F) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0287, code lost:
        X.C18740tg.A06(r11);
        A11(r11, r0, "voice-no-routes", "noRouteVoice", com.whatsapp.R.string.f12nameremoved, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029c, code lost:
        r5 = X.C52082or.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029e, code lost:
        if (r3 == r5) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02a2, code lost:
        if (r3 == X.C52082or.A0A) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r22 == null) goto L_0x0543;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BTw(X.C52082or r21, X.C66713Xa r22, java.lang.String r23) {
        /*
            r20 = this;
            r0 = r23
            int r1 = r0.hashCode()
            r12 = r20
            r3 = r21
            r11 = r22
            switch(r1) {
                case -795576526: goto L_0x0010;
                case 114009: goto L_0x0014;
                case 97513456: goto L_0x0018;
                case 112386354: goto L_0x001b;
                case 601452370: goto L_0x0a17;
                case 1439178067: goto L_0x0996;
                case 2120743944: goto L_0x056b;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r1 = "wa_old"
            goto L_0x056d
        L_0x0014:
            java.lang.String r1 = "sms"
            goto L_0x056d
        L_0x0018:
            java.lang.String r1 = "flash"
            goto L_0x001d
        L_0x001b:
            java.lang.String r1 = "voice"
        L_0x001d:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x000f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/method="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r5 = "/status="
            X.C36321k7.A1K(r3, r5, r2)
            java.lang.String r1 = ""
            X.C65983Uf.A00 = r1
            if (r22 == 0) goto L_0x0543
            java.lang.String r1 = "flash"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0046
            X.2or r1 = X.C52082or.ERROR_FLASH_CALL_DISABLED
            if (r3 == r1) goto L_0x0049
        L_0x0046:
            r12.A0y(r11, r0)
        L_0x0049:
            X.2or r1 = X.C52082or.OK
            if (r3 != r1) goto L_0x0057
            X.C18740tg.A06(r11)
            r12.A0x(r11, r0)
        L_0x0053:
            A1N(r12, r0)
            return
        L_0x0057:
            X.2or r1 = X.C52082or.YES
            if (r3 == r1) goto L_0x0431
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onVoiceOrFlashCodeRequestError/method="
            r2.append(r1)
            r2.append(r0)
            X.C36321k7.A1K(r3, r5, r2)
            X.2or r1 = X.C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r3 != r1) goto L_0x0092
            r1 = 52
            X.AnonymousClass3SJ.A00(r12, r1)
            X.17Y r1 = r12.A05
            X.C55232uI.A00(r1)
        L_0x0078:
            java.lang.String r1 = "flash"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x008d
            boolean r1 = X.C36431kI.A1S(r12)
            if (r1 != 0) goto L_0x008d
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "secondary_failed"
            r2.A1W(r1)
        L_0x008d:
            r1 = -1
            A1E(r12, r1)
            goto L_0x0053
        L_0x0092:
            X.2or r1 = X.C52082or.ERROR_TEMPORARILY_UNAVAILABLE
            if (r3 != r1) goto L_0x00e7
            X.C18740tg.A06(r11)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTempUnavailable/method="
            X.C36411kG.A1S(r1, r0, r2)
            java.lang.String r1 = r11.A0K
            X.C36321k7.A1a(r2, r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-temp-unavail"
            X.C65983Uf.A0Q(r2, r1)
            java.lang.String r1 = r11.A0K
            boolean r1 = X.AnonymousClass3MJ.A02(r1)
            if (r1 != 0) goto L_0x00c3
            r1 = 2131893444(0x7f121cc4, float:1.9421665E38)
        L_0x00bb:
            java.lang.String r1 = r12.getString(r1)
        L_0x00bf:
            A1M(r12, r1)
            goto L_0x0078
        L_0x00c3:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x00d9 }
            r12.A0k(r2)     // Catch:{ NumberFormatException -> 0x00d9 }
            r1 = 2131893445(0x7f121cc5, float:1.9421667E38)
            X.AnonymousClass3UY.A0I(r12, r1, r2)     // Catch:{ NumberFormatException -> 0x00d9 }
            X.3LA r1 = r12.A16     // Catch:{ NumberFormatException -> 0x00d9 }
            X.AnonymousClass3LA.A01(r1, r4, r2)     // Catch:{ NumberFormatException -> 0x00d9 }
            r12.A0l(r2, r4)     // Catch:{ NumberFormatException -> 0x00d9 }
            goto L_0x0078
        L_0x00d9:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36411kG.A12(r0)
            java.lang.String r1 = "/temporarily-unavailable/unable-to-parse-retryAfter"
            X.C36351kA.A1P(r1, r2, r3)
            r1 = 2131893444(0x7f121cc4, float:1.9421665E38)
            goto L_0x00bb
        L_0x00e7:
            X.2or r1 = X.C52082or.ERROR_UNSPECIFIED
            if (r3 != r1) goto L_0x0102
            java.lang.String r3 = "voice-error"
            java.lang.StringBuilder r2 = X.C36341k9.A0j(r0)
            java.lang.String r1 = "/unspecified"
            X.C36341k9.A1O(r2, r1)
            X.0v0 r1 = r12.A09
            X.C65983Uf.A0Q(r1, r3)
            r1 = 109(0x6d, float:1.53E-43)
        L_0x00fd:
            A1H(r12, r1)
            goto L_0x0078
        L_0x0102:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY
            if (r3 != r1) goto L_0x0128
            X.C18740tg.A06(r11)
            java.lang.String r7 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooMany/method="
            X.C36321k7.A1Q(r1, r0, r2)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-error-too-many-tries"
            boolean r1 = X.AnonymousClass3MJ.A01(r2, r11, r12, r1)
            r6 = 26
            if (r1 != 0) goto L_0x0315
            A1H(r12, r6)
            r12.A0O()
            goto L_0x0078
        L_0x0128:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY_ALL_METHODS
            if (r3 != r1) goto L_0x014d
            X.C18740tg.A06(r11)
            java.lang.String r7 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyAllMethods/method="
            X.C36411kG.A1S(r1, r0, r2)
            java.lang.String r1 = r11.A0K
            X.C36321k7.A1a(r2, r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-error-too-many-tries-all-methods"
            boolean r1 = X.AnonymousClass3MJ.A01(r2, r11, r12, r1)
            r6 = 27
            if (r1 == 0) goto L_0x03b5
            goto L_0x035a
        L_0x014d:
            X.2or r1 = X.C52082or.ERROR_CONNECTIVITY
            if (r3 != r1) goto L_0x0165
            r3 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r1 = r12.getString(r1)
            java.lang.String r1 = X.C36381kD.A0r(r12, r1, r2, r3)
            goto L_0x00bf
        L_0x0165:
            X.2or r1 = X.C52082or.ERROR_BAD_PARAMETER
            if (r3 != r1) goto L_0x0173
            X.C18740tg.A06(r11)
            java.lang.String r1 = "voice-bad-param"
            r12.A0z(r11, r0, r1)
            goto L_0x0078
        L_0x0173:
            X.2or r1 = X.C52082or.ERROR_MISSING_PARAMETER
            if (r3 != r1) goto L_0x018b
            java.lang.String r3 = "voice-missing-param"
            java.lang.StringBuilder r2 = X.C36341k9.A0j(r0)
            java.lang.String r1 = "/missing-parameter"
            X.C36321k7.A1Z(r2, r1)
            X.0v0 r1 = r12.A09
            X.C65983Uf.A0Q(r1, r3)
            r1 = 25
            goto L_0x00fd
        L_0x018b:
            X.2or r1 = X.C52082or.ERROR_OLD_VERSION
            if (r3 != r1) goto L_0x01b1
            X.C18740tg.A06(r11)
            X.3KE r3 = r11.A08
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooOld/method="
            X.C36321k7.A1Q(r1, r0, r2)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-version-too-old"
            X.C65983Uf.A0Q(r2, r1)
            boolean r1 = X.C36431kI.A1S(r12)
            if (r1 != 0) goto L_0x0078
            if (r3 == 0) goto L_0x037b
            r12.A14(r3)
            goto L_0x0078
        L_0x01b1:
            X.2or r1 = X.C52082or.ERROR_TOO_RECENT
            if (r3 != r1) goto L_0x01dc
            X.C18740tg.A06(r11)
            java.lang.String r4 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooRecent/method="
            X.C36411kG.A1S(r1, r0, r2)
            java.lang.String r1 = r11.A0K
            X.C36321k7.A1a(r2, r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-too-recent"
            X.C65983Uf.A0Q(r2, r1)
            java.lang.String r1 = r11.A0K
            boolean r1 = X.AnonymousClass3MJ.A02(r1)
            if (r1 != 0) goto L_0x02c9
            r1 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x00bb
        L_0x01dc:
            X.2or r1 = X.C52082or.ERROR_BLOCKED
            if (r3 != r1) goto L_0x0203
            X.C18740tg.A06(r11)
            X.3XC r5 = r11.A05
            X.3KJ r4 = r11.A07
            java.lang.String r3 = "voice-blocked"
            java.lang.StringBuilder r2 = X.C36341k9.A0j(r0)
            java.lang.String r1 = "/blocked"
            X.C36321k7.A1Z(r2, r1)
            X.3Gd r2 = r12.A15
            r1 = 12
            r2.A02(r1)
            X.0v0 r1 = r12.A09
            X.C65983Uf.A0Q(r1, r3)
            A0q(r5, r4, r12)
            goto L_0x0078
        L_0x0203:
            X.2or r1 = X.C52082or.ERROR_NEXT_METHOD
            if (r3 != r1) goto L_0x0211
            X.C18740tg.A06(r11)
            java.lang.String r1 = "voice-next-method"
            r12.A1T(r0, r1)
            goto L_0x0078
        L_0x0211:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY_GUESSES
            if (r3 != r1) goto L_0x023e
            X.C18740tg.A06(r11)
            java.lang.String r7 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashErrorTooManyGuesses/method="
            X.C36411kG.A1S(r1, r0, r2)
            java.lang.String r1 = r11.A0K
            X.C36321k7.A1a(r2, r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-too-many-guesses"
            X.C65983Uf.A0Q(r2, r1)
            X.C36401kF.A1J(r12)
            java.lang.String r1 = r11.A0K
            boolean r1 = X.AnonymousClass3MJ.A02(r1)
            r6 = 28
            if (r1 == 0) goto L_0x03b5
            goto L_0x0382
        L_0x023e:
            X.2or r1 = X.C52082or.ERROR_PROVIDER_TIMEOUT
            if (r3 != r1) goto L_0x026c
            X.C18740tg.A06(r11)
            java.lang.String r5 = "voice"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "VerifyPhoneNumber/verifyvoice/request/"
            r2.append(r4)
            r2.append(r0)
            java.lang.String r1 = "/provider-timeout"
            X.C36321k7.A1Z(r2, r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "voice-provider-timeout"
            X.C65983Uf.A0Q(r2, r1)
            java.lang.String r1 = r11.A0K
            boolean r1 = X.AnonymousClass3MJ.A02(r1)
            if (r1 != 0) goto L_0x02ef
            r1 = 2131893483(0x7f121ceb, float:1.9421744E38)
            goto L_0x00bb
        L_0x026c:
            X.2or r1 = X.C52082or.ERROR_PROVIDER_UNROUTABLE
            if (r3 != r1) goto L_0x0283
            X.C18740tg.A06(r11)
            r5 = 2131893485(0x7f121ced, float:1.9421748E38)
            r6 = 2131893484(0x7f121cec, float:1.9421746E38)
            java.lang.String r4 = "voice-provider-unroutable"
            r1 = r12
            r3 = r0
            r2 = r11
            r1.A10(r2, r3, r4, r5, r6)
            goto L_0x0078
        L_0x0283:
            X.2or r1 = X.C52082or.ERROR_NO_ROUTES
            if (r3 != r1) goto L_0x029c
            X.C18740tg.A06(r11)
            r6 = 2131893485(0x7f121ced, float:1.9421748E38)
            r7 = 2131893484(0x7f121cec, float:1.9421746E38)
            java.lang.String r4 = "voice-no-routes"
            java.lang.String r5 = "noRouteVoice"
            r1 = r12
            r3 = r0
            r2 = r11
            r1.A11(r2, r3, r4, r5, r6, r7)
            goto L_0x0078
        L_0x029c:
            X.2or r5 = X.C52082or.ERROR_BAD_TOKEN
            if (r3 == r5) goto L_0x02b0
            X.2or r1 = X.C52082or.ERROR_INVALID_SKEY_SIGNATURE
            if (r3 == r1) goto L_0x02b0
            X.2or r1 = X.C52082or.SECURITY_CODE
            if (r3 != r1) goto L_0x03ba
            X.C18740tg.A06(r11)
            r12.A0w(r11, r0)
            goto L_0x0078
        L_0x02b0:
            java.lang.String r4 = "voice-bad-token"
            java.lang.StringBuilder r2 = X.C36341k9.A0j(r0)
            if (r3 != r5) goto L_0x02c6
            java.lang.String r1 = "/bad-token"
        L_0x02ba:
            X.C36321k7.A1Z(r2, r1)
            X.0v0 r1 = r12.A09
            X.C65983Uf.A0Q(r1, r4)
            r1 = 41
            goto L_0x00fd
        L_0x02c6:
            java.lang.String r1 = "/invalid-skey"
            goto L_0x02ba
        L_0x02c9:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x02e0 }
            r12.A0k(r2)     // Catch:{ NumberFormatException -> 0x02e0 }
            r1 = 2131893447(0x7f121cc7, float:1.942167E38)
            X.AnonymousClass3UY.A0I(r12, r1, r2)     // Catch:{ NumberFormatException -> 0x02e0 }
            X.3LA r1 = r12.A16     // Catch:{ NumberFormatException -> 0x02e0 }
            X.AnonymousClass3LA.A01(r1, r4, r2)     // Catch:{ NumberFormatException -> 0x02e0 }
            r12.A0l(r2, r4)     // Catch:{ NumberFormatException -> 0x02e0 }
            goto L_0x0078
        L_0x02e0:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36411kG.A12(r0)
            java.lang.String r1 = "/too-recent/time-not-int"
            X.C36351kA.A1P(r1, r2, r3)
            r1 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x00bb
        L_0x02ef:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x0306 }
            r12.A0k(r2)     // Catch:{ NumberFormatException -> 0x0306 }
            r1 = 2131893482(0x7f121cea, float:1.9421742E38)
            X.AnonymousClass3UY.A0I(r12, r1, r2)     // Catch:{ NumberFormatException -> 0x0306 }
            X.3LA r1 = r12.A16     // Catch:{ NumberFormatException -> 0x0306 }
            X.AnonymousClass3LA.A01(r1, r5, r2)     // Catch:{ NumberFormatException -> 0x0306 }
            r12.A0l(r2, r5)     // Catch:{ NumberFormatException -> 0x0306 }
            goto L_0x0078
        L_0x0306:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r4, r0)
            java.lang.String r1 = "/too-recent/time-not-int"
            X.C36351kA.A1P(r1, r2, r3)
            r1 = 2131893483(0x7f121ceb, float:1.9421744E38)
            goto L_0x00bb
        L_0x0315:
            long r1 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x0348 }
            r12.A0C = r1     // Catch:{ NumberFormatException -> 0x0348 }
            r12.A0k(r1)     // Catch:{ NumberFormatException -> 0x0348 }
            r8 = 2131894440(0x7f1220a8, float:1.9423685E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ NumberFormatException -> 0x0348 }
            r4 = 0
            X.0ts r3 = r12.A00     // Catch:{ NumberFormatException -> 0x0348 }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x0348 }
            java.lang.String r1 = X.AnonymousClass3UY.A0D(r3, r1)     // Catch:{ NumberFormatException -> 0x0348 }
            java.lang.String r1 = X.C36391kE.A0v(r12, r1, r5, r4, r8)     // Catch:{ NumberFormatException -> 0x0348 }
            A1M(r12, r1)     // Catch:{ NumberFormatException -> 0x0348 }
            X.3LA r5 = r12.A16     // Catch:{ NumberFormatException -> 0x0348 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0348 }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x0348 }
            long r3 = r3 + r1
            r5.A07(r7, r3)     // Catch:{ NumberFormatException -> 0x0348 }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x0348 }
            r12.A0l(r1, r7)     // Catch:{ NumberFormatException -> 0x0348 }
            goto L_0x0078
        L_0x0348:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36411kG.A12(r0)
            java.lang.String r1 = "/triedtoomanytimesallmethods/time-not-int"
            X.C36351kA.A1P(r1, r2, r3)
            A1H(r12, r6)
            r12.A0O()
            goto L_0x0078
        L_0x035a:
            long r1 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x03ab }
            r12.A0C = r1     // Catch:{ NumberFormatException -> 0x03ab }
            r12.A0k(r1)     // Catch:{ NumberFormatException -> 0x03ab }
            r1 = 31
            A1H(r12, r1)     // Catch:{ NumberFormatException -> 0x03ab }
            X.3LA r5 = r12.A16     // Catch:{ NumberFormatException -> 0x03ab }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x03ab }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x03ab }
            long r3 = r3 + r1
            r5.A07(r7, r3)     // Catch:{ NumberFormatException -> 0x03ab }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x03ab }
            r12.A0l(r1, r7)     // Catch:{ NumberFormatException -> 0x03ab }
            goto L_0x0078
        L_0x037b:
            r1 = 22
            A1F(r12, r1)
            goto L_0x0078
        L_0x0382:
            long r1 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x03a3 }
            r12.A0C = r1     // Catch:{ NumberFormatException -> 0x03a3 }
            r12.A0k(r1)     // Catch:{ NumberFormatException -> 0x03a3 }
            r1 = 32
            A1H(r12, r1)     // Catch:{ NumberFormatException -> 0x03a3 }
            X.3LA r5 = r12.A16     // Catch:{ NumberFormatException -> 0x03a3 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x03a3 }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x03a3 }
            long r3 = r3 + r1
            r5.A07(r7, r3)     // Catch:{ NumberFormatException -> 0x03a3 }
            long r1 = r12.A0C     // Catch:{ NumberFormatException -> 0x03a3 }
            r12.A0l(r1, r7)     // Catch:{ NumberFormatException -> 0x03a3 }
            goto L_0x0078
        L_0x03a3:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36411kG.A12(r0)
            java.lang.String r1 = "/too-many-guesses/time-not-int"
            goto L_0x03b2
        L_0x03ab:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.C36411kG.A12(r0)
            java.lang.String r1 = "/triedtoomanytimesallmethods/time-not-int"
        L_0x03b2:
            X.C36351kA.A1P(r1, r2, r3)
        L_0x03b5:
            A1H(r12, r6)
            goto L_0x0078
        L_0x03ba:
            X.2or r5 = X.C52082or.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r3 == r5) goto L_0x0415
            X.2or r1 = X.C52082or.ERROR_SECOND_OTP
            if (r3 == r1) goto L_0x0415
            java.lang.String r1 = "flash"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x03f5
            X.2or r1 = X.C52082or.ERROR_FLASH_CALL_DISABLED
            if (r3 != r1) goto L_0x03f5
            java.lang.String r1 = "VerifyPhoneNumber/onRequestFlashErrorDisabled/fall back to voice"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = X.C36431kI.A1S(r12)
            if (r1 != 0) goto L_0x0078
            X.0zN r2 = r12.A0e
            X.0v0 r1 = r12.A09
            X.2d2 r2 = X.C65983Uf.A08(r1, r2)
            X.0v0 r1 = r12.A09
            boolean r1 = r1.A2D()
            if (r1 == 0) goto L_0x03ef
            java.lang.Boolean r1 = X.C36371kC.A0m()
            r2.A02 = r1
        L_0x03ef:
            r1 = 0
            r12.A13(r2, r1)
            goto L_0x0078
        L_0x03f5:
            X.2or r1 = X.C52082or.ERROR_NOT_ALLOWED
            if (r3 != r1) goto L_0x03fe
            A1L(r12, r0)
            goto L_0x0078
        L_0x03fe:
            X.2or r1 = X.C52082or.ERROR_CODE_CHECKPOINT
            if (r3 != r1) goto L_0x0078
            X.1Ww r3 = r12.A0r
            r1 = 16
            r2 = 1
            X.C29501Ww.A02(r3, r1, r2)
            boolean r1 = r12.A1H
            android.content.Intent r1 = X.AnonymousClass190.A1Q(r12, r1)
            r12.A33(r1, r2)
            goto L_0x0078
        L_0x0415:
            X.C18740tg.A06(r11)
            java.lang.String r4 = r11.A0M
            r1 = 0
            long r6 = X.C65983Uf.A01(r4, r1)
            java.lang.String r4 = r11.A0O
            long r10 = X.C65983Uf.A01(r4, r1)
            boolean r9 = X.C36361kB.A1a(r3, r5)
            r5 = r12
            r8 = r0
            r5.A0n(r6, r8, r9, r10)
            goto L_0x0078
        L_0x0431:
            java.lang.StringBuilder r2 = X.C36421kH.A0f(r11)
            java.lang.String r5 = "VerifyPhoneNumber/verifyvoice/request/"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r1 = "/requested"
            X.C36321k7.A1a(r2, r1)
            java.lang.String r1 = "flash"
            boolean r9 = r0.equals(r1)
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x0483
            java.lang.String r1 = r11.A0E
            if (r1 == 0) goto L_0x0457
            long r1 = java.lang.Long.parseLong(r1)
            long r1 = r1 * r7
            r12.A0B = r1
        L_0x0457:
            X.1tN r6 = r12.A0y
            long r1 = r12.A0B
            r6.A0S()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x053a
            r18 = 30000(0x7530, double:1.4822E-319)
        L_0x0464:
            r3 = 2
            long r3 = (long) r3
            long r1 = r1 / r3
            X.00s r4 = r6.A02
            java.lang.String r3 = "running"
            r4.A0C(r3)
            X.00s r4 = r6.A01
            r3 = 0
            X.C36341k9.A19(r4, r3)
            r15 = 3
            X.4VR r13 = new X.4VR
            r14 = r6
            r16 = r1
            r13.<init>(r14, r15, r16, r18)
            android.os.CountDownTimer r1 = r13.start()
            r6.A00 = r1
        L_0x0483:
            int r1 = r11.A02
            if (r1 <= 0) goto L_0x04a8
            if (r9 != 0) goto L_0x04a8
            A1f = r1
            X.3Kv r1 = r12.A0m
            boolean r1 = r1.A03()
            if (r1 != 0) goto L_0x049b
            com.whatsapp.CodeInputField r2 = r12.A0M
            if (r2 == 0) goto L_0x049b
            int r1 = r11.A02
            r2.A02 = r1
        L_0x049b:
            X.0v0 r1 = r12.A09
            int r3 = r11.A02
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r1)
            java.lang.String r1 = "registration_voice_code_length"
            X.C36341k9.A0v(r2, r1, r3)
        L_0x04a8:
            java.lang.String r2 = r11.A0H
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x04ba
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 * r7
            X.1Ww r3 = r12.A0r
            r3.A0C(r1)
        L_0x04ba:
            if (r9 == 0) goto L_0x0506
            X.3Ey r3 = r12.A0x
            java.lang.String r15 = r12.A1D
            java.lang.String r2 = r12.A1F
            X.C18740tg.A06(r2)
            java.lang.String r14 = r11.A0B
            if (r14 != 0) goto L_0x04cb
            java.lang.String r14 = "(.*)xyz(.*)"
        L_0x04cb:
            X.2d1 r11 = r12.A0u
            r1 = 0
            X.AnonymousClass00C.A0D(r15, r1)
            r1 = 1
            X.C36331k8.A1G(r2, r1, r11)
            X.0wG r1 = r3.A02
            android.content.Context r1 = r1.A00
            X.AnonymousClass00C.A08(r1)
            X.1l3 r6 = r3.A00
            if (r6 != 0) goto L_0x04f6
            X.0wU r13 = r3.A06
            X.0yb r7 = r3.A01
            X.0yE r8 = r3.A03
            X.0v0 r9 = r3.A04
            X.3UV r10 = r3.A05
            X.C18740tg.A06(r2)
            X.1l3 r6 = new X.1l3
            r16 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A00 = r6
        L_0x04f6:
            java.lang.String r3 = "android.intent.action.PHONE_STATE"
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r3)
            java.lang.String r10 = X.C19430v1.A0C
            r9 = 0
            r11 = 1
            r8 = r2
            r7 = r1
            X.C26981Mg.A00(r6, r7, r8, r9, r10, r11)
        L_0x0506:
            int r2 = X.C36441kJ.A08(r12)
            r1 = 13
            if (r2 == r1) goto L_0x0512
            r1 = 14
            if (r2 != r1) goto L_0x052a
        L_0x0512:
            java.lang.String r1 = "voice"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x052a
            java.lang.StringBuilder r2 = X.C36331k8.A0k(r5, r0)
            java.lang.String r1 = "/update acct defence stat:"
            r2.append(r1)
            r1 = 3
            X.C36321k7.A1Y(r2, r1)
            r12.A3k(r1)
        L_0x052a:
            com.whatsapp.registration.entercode.EnterCodeViewModel r1 = r12.A0w
            r1.A0S()
            X.3LA r1 = r1.A01
            if (r1 != 0) goto L_0x053e
            java.lang.String r0 = "verifyPhoneNumberPrefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x053a:
            r18 = r1
            goto L_0x0464
        L_0x053e:
            r1.A04()
            goto L_0x0053
        L_0x0543:
            java.lang.String r1 = "VerifyPhoneNumber/onRequestVoiceOrFlashCodeResponse/response is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "sms"
            r12.A0l(r1, r4)
            java.lang.String r4 = "voice"
            r12.A0l(r1, r4)
            boolean r4 = X.C36431kI.A1T(r12)
            if (r4 == 0) goto L_0x0562
            java.lang.String r4 = "wa_old"
        L_0x055d:
            r12.A0l(r1, r4)
            goto L_0x0049
        L_0x0562:
            boolean r4 = X.C36431kI.A1U(r12)
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = "email_otp"
            goto L_0x055d
        L_0x056b:
            java.lang.String r1 = "email_otp"
        L_0x056d:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x000f
            boolean r1 = r12.isFinishing()
            if (r1 != 0) goto L_0x000f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "VerifyPhoneNumber/onRequestGenericCodeResponse/method="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r5 = "/status="
            X.C36321k7.A1K(r3, r5, r1)
            java.lang.String r1 = ""
            X.C65983Uf.A00 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r2)
            if (r22 == 0) goto L_0x05a2
            r12.A0y(r11, r0)
        L_0x0597:
            X.2or r1 = X.C52082or.OK
            if (r3 != r1) goto L_0x05cc
            X.C18740tg.A06(r11)
            r12.A0x(r11, r0)
            return
        L_0x05a2:
            r2.append(r0)
            java.lang.String r1 = "/response is null"
            X.C36341k9.A1O(r2, r1)
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "sms"
            r12.A0l(r1, r4)
            java.lang.String r4 = "voice"
            r12.A0l(r1, r4)
            boolean r4 = X.C36431kI.A1T(r12)
            if (r4 == 0) goto L_0x05c3
            java.lang.String r4 = "wa_old"
        L_0x05bf:
            r12.A0l(r1, r4)
            goto L_0x0597
        L_0x05c3:
            boolean r4 = X.C36431kI.A1U(r12)
            if (r4 == 0) goto L_0x0597
            java.lang.String r4 = "email_otp"
            goto L_0x05bf
        L_0x05cc:
            X.2or r1 = X.C52082or.YES
            if (r3 != r1) goto L_0x0658
            X.C18740tg.A06(r11)
            java.lang.String r0 = "VerifyPhoneNumber/onGenericCodeSent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C36431kI.A1U(r12)
            if (r0 == 0) goto L_0x05e5
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "email_sent"
            r1.A1Q(r0)
        L_0x05e5:
            int r1 = X.C36441kJ.A08(r12)
            r0 = 13
            if (r1 == r0) goto L_0x05f1
            r0 = 14
            if (r1 != r0) goto L_0x0623
        L_0x05f1:
            r0 = 3
            r12.A3k(r0)
            boolean r0 = r12.A1L
            if (r0 != 0) goto L_0x0623
            X.3PP r0 = r12.A0l
            r3 = 1
            X.3Gz r0 = r0.A01
            X.3G5 r2 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/"
            X.C36321k7.A1X(r0, r1, r3)
            X.0wg r1 = r2.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r1 = X.C36381kD.A0G(r1, r0)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            r1.putBoolean(r0, r3)
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x0621
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveSecondSmsRequestedOnce/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0621:
            r12.A1L = r3
        L_0x0623:
            int r2 = r11.A02
            if (r2 <= 0) goto L_0x0632
            A1e = r2
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r12)
            java.lang.String r0 = "registration_sms_code_length"
            X.C36341k9.A0v(r1, r0, r2)
        L_0x0632:
            java.lang.String r1 = r11.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0643
            long r1 = X.C36411kG.A0B(r1)
            X.1Ww r0 = r12.A0r
            r0.A0C(r1)
        L_0x0643:
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r12.A0w
            r0.A0S()
            X.3LA r0 = r0.A01
            if (r0 != 0) goto L_0x0653
            java.lang.String r0 = "verifyPhoneNumberPrefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0653:
            r0.A04()
            goto L_0x09ea
        L_0x0658:
            r12.A0Q()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeError/method="
            r2.append(r1)
            r2.append(r0)
            X.C36321k7.A1K(r3, r5, r2)
            boolean r8 = X.C36441kJ.A1N(r0)
            if (r8 == 0) goto L_0x067f
            X.2or r1 = X.C52082or.SECURITY_CODE
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x067f
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "email_otp_request_failed"
            r2.A1Q(r1)
        L_0x067f:
            X.2or r1 = X.C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r3 != r1) goto L_0x068e
            r0 = 52
            X.AnonymousClass3SJ.A00(r12, r0)
        L_0x0688:
            X.17Y r0 = r12.A05
            X.C55232uI.A00(r0)
            return
        L_0x068e:
            X.2or r1 = X.C52082or.ERROR_TEMPORARILY_UNAVAILABLE
            if (r3 != r1) goto L_0x06d7
            X.C18740tg.A06(r11)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTempUnavailable"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-temp-unavailable"
            X.C65983Uf.A0Q(r1, r0)
            java.lang.String r0 = r11.A0K
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            if (r0 != 0) goto L_0x06b5
            X.3Kl r1 = r12.A0o
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
        L_0x06ae:
            r1.A02(r0)
        L_0x06b1:
            A18(r12)
            return
        L_0x06b5:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x06cb }
            X.1Ww r0 = r12.A0r     // Catch:{ NumberFormatException -> 0x06cb }
            r0.A0C(r2)     // Catch:{ NumberFormatException -> 0x06cb }
            X.3Kl r1 = r12.A0o     // Catch:{ NumberFormatException -> 0x06cb }
            r0 = 2131893445(0x7f121cc5, float:1.9421667E38)
            java.lang.String r0 = X.AnonymousClass3UY.A01(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x06cb }
            r1.A03(r0)     // Catch:{ NumberFormatException -> 0x06cb }
            goto L_0x06b1
        L_0x06cb:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/temporarily-unavailable/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            X.3Kl r1 = r12.A0o
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
            goto L_0x06ae
        L_0x06d7:
            X.2or r1 = X.C52082or.ERROR_UNSPECIFIED
            if (r3 != r1) goto L_0x06f1
            java.lang.String r2 = "server-send-request-error-unspecified"
            java.lang.StringBuilder r1 = X.C36341k9.A0j(r0)
            java.lang.String r0 = "/unspecified"
            X.C36341k9.A1O(r1, r0)
            X.0v0 r0 = r12.A09
            X.C65983Uf.A0Q(r0, r2)
            r0 = 109(0x6d, float:1.53E-43)
        L_0x06ed:
            A1H(r12, r0)
            goto L_0x06b1
        L_0x06f1:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY
            if (r3 != r1) goto L_0x0727
            X.C18740tg.A06(r11)
            java.lang.String r6 = "sms"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooMany/method="
            X.C36321k7.A1R(r1, r0, r2)
            java.lang.String r7 = "wa_old"
            boolean r3 = r0.equals(r7)
            if (r3 == 0) goto L_0x0720
            r5 = 40
        L_0x070d:
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-too-many-tries"
            boolean r0 = X.AnonymousClass3MJ.A01(r1, r11, r12, r0)
            if (r0 != 0) goto L_0x0a86
            X.3Kl r0 = r12.A0o
            r0.A01(r5)
            r12.A0O()
            return
        L_0x0720:
            r5 = 39
            if (r8 == 0) goto L_0x070d
            r5 = 48
            goto L_0x070d
        L_0x0727:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY_ALL_METHODS
            if (r3 != r1) goto L_0x0741
            X.C18740tg.A06(r11)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyAllMethods"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-too-many-tries-all-methods"
            boolean r0 = X.AnonymousClass3MJ.A01(r1, r11, r12, r0)
            r4 = 27
            if (r0 == 0) goto L_0x08b9
            goto L_0x0850
        L_0x0741:
            X.2or r1 = X.C52082or.ERROR_CONNECTIVITY
            if (r3 != r1) goto L_0x0763
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-error-connectivity"
            X.C65983Uf.A0Q(r1, r0)
            r2 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r0 = X.C36381kD.A0r(r12, r0, r1, r2)
        L_0x075e:
            A1M(r12, r0)
            goto L_0x06b1
        L_0x0763:
            X.2or r1 = X.C52082or.ERROR_BAD_PARAMETER
            if (r3 != r1) goto L_0x0770
            X.C18740tg.A06(r11)
            java.lang.String r1 = "server-send-request-bad-param"
            r12.A0z(r11, r0, r1)
            return
        L_0x0770:
            X.2or r1 = X.C52082or.ERROR_MISSING_PARAMETER
            if (r3 != r1) goto L_0x0788
            java.lang.String r2 = "server-send-request-missing-param"
            java.lang.StringBuilder r1 = X.C36341k9.A0j(r0)
            java.lang.String r0 = "/missing-parameter"
            X.C36321k7.A1Z(r1, r0)
            X.0v0 r0 = r12.A09
            X.C65983Uf.A0Q(r0, r2)
            r0 = 25
            goto L_0x06ed
        L_0x0788:
            X.2or r1 = X.C52082or.ERROR_OLD_VERSION
            if (r3 != r1) goto L_0x079c
            X.C18740tg.A06(r11)
            X.3KE r1 = r11.A08
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooOld"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            if (r1 == 0) goto L_0x0af4
            r12.A14(r1)
            return
        L_0x079c:
            X.2or r1 = X.C52082or.ERROR_TOO_RECENT
            if (r3 != r1) goto L_0x07c9
            java.lang.StringBuilder r1 = X.C36421kH.A0f(r11)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooRecent/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r11.A0K
            r1.append(r0)
            java.lang.String r0 = " seconds"
            X.C36341k9.A1O(r1, r0)
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-too-recent"
            X.C65983Uf.A0Q(r1, r0)
            java.lang.String r0 = r11.A0K
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            if (r0 != 0) goto L_0x0867
            X.3Kl r1 = r12.A0o
            r0 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x06ae
        L_0x07c9:
            X.2or r1 = X.C52082or.ERROR_BLOCKED
            if (r3 != r1) goto L_0x07ed
            X.3XC r4 = r11.A05
            X.3KJ r3 = r11.A07
            java.lang.String r2 = "server-send-request-user-blocked"
            java.lang.StringBuilder r1 = X.C36341k9.A0j(r0)
            java.lang.String r0 = "/blocked"
            X.C36321k7.A1Z(r1, r0)
            X.3Gd r1 = r12.A15
            r0 = 12
            r1.A02(r0)
            X.0v0 r0 = r12.A09
            X.C65983Uf.A0Q(r0, r2)
            A0q(r4, r3, r12)
            goto L_0x06b1
        L_0x07ed:
            X.2or r1 = X.C52082or.ERROR_NEXT_METHOD
            if (r3 != r1) goto L_0x07fa
            X.C18740tg.A06(r11)
            java.lang.String r1 = "server-send-request-next-method"
            r12.A1T(r0, r1)
            return
        L_0x07fa:
            X.2or r1 = X.C52082or.ERROR_TOO_MANY_GUESSES
            if (r3 != r1) goto L_0x081b
            X.C18740tg.A06(r11)
            java.lang.String r1 = "VerifyPhoneNumber/onRequestGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.0v0 r2 = r12.A09
            java.lang.String r1 = "server-send-request-too-many-guesses"
            X.C65983Uf.A0Q(r2, r1)
            X.C36401kF.A1J(r12)
            java.lang.String r1 = r11.A0K
            boolean r1 = X.AnonymousClass3MJ.A02(r1)
            r4 = 28
            if (r1 == 0) goto L_0x08b9
            goto L_0x088b
        L_0x081b:
            X.2or r1 = X.C52082or.ERROR_PROVIDER_TIMEOUT
            if (r3 != r1) goto L_0x08f3
            X.C18740tg.A06(r11)
            java.lang.String r5 = "sms"
            boolean r4 = X.C36441kJ.A1M(r0)
            java.lang.String r0 = "VerifyPhoneNumber/onRequestGenericCodeErrorProviderTimeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0v0 r1 = r12.A09
            java.lang.String r0 = "server-send-request-provider-timeout"
            X.C65983Uf.A0Q(r1, r0)
            if (r4 == 0) goto L_0x0847
            r3 = 2131893489(0x7f121cf1, float:1.9421756E38)
        L_0x0839:
            java.lang.String r0 = r11.A0K
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            if (r0 != 0) goto L_0x08c0
            java.lang.String r0 = r12.getString(r3)
            goto L_0x075e
        L_0x0847:
            r3 = 2131893438(0x7f121cbe, float:1.9421653E38)
            if (r8 == 0) goto L_0x0839
            r3 = 2131893654(0x7f121d96, float:1.942209E38)
            goto L_0x0839
        L_0x0850:
            long r1 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x08b3 }
            r12.A0C = r1     // Catch:{ NumberFormatException -> 0x08b3 }
            X.1Ww r0 = r12.A0r     // Catch:{ NumberFormatException -> 0x08b3 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x08b3 }
            r0 = 1
            r12.A1Q = r0     // Catch:{ NumberFormatException -> 0x08b3 }
            X.3Kl r1 = r12.A0o     // Catch:{ NumberFormatException -> 0x08b3 }
            r0 = 31
            r1.A01(r0)     // Catch:{ NumberFormatException -> 0x08b3 }
            goto L_0x06b1
        L_0x0867:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x087e }
            X.1Ww r0 = r12.A0r     // Catch:{ NumberFormatException -> 0x087e }
            r0.A0C(r2)     // Catch:{ NumberFormatException -> 0x087e }
            X.3Kl r1 = r12.A0o     // Catch:{ NumberFormatException -> 0x087e }
            r0 = 2131893447(0x7f121cc7, float:1.942167E38)
            java.lang.String r0 = X.AnonymousClass3UY.A01(r12, r0, r2)     // Catch:{ NumberFormatException -> 0x087e }
            r1.A03(r0)     // Catch:{ NumberFormatException -> 0x087e }
            goto L_0x06b1
        L_0x087e:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.3Kl r1 = r12.A0o
            r0 = 2131893448(0x7f121cc8, float:1.9421673E38)
            goto L_0x06ae
        L_0x088b:
            long r2 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x08af }
            r12.A0C = r2     // Catch:{ NumberFormatException -> 0x08af }
            X.1Ww r1 = r12.A0r     // Catch:{ NumberFormatException -> 0x08af }
            r1.A0C(r2)     // Catch:{ NumberFormatException -> 0x08af }
            r1 = 1
            r12.A1Q = r1     // Catch:{ NumberFormatException -> 0x08af }
            X.3Kl r1 = r12.A0o     // Catch:{ NumberFormatException -> 0x08af }
            boolean r0 = X.C36441kJ.A1M(r0)     // Catch:{ NumberFormatException -> 0x08af }
            if (r0 == 0) goto L_0x08a4
            r0 = 33
            goto L_0x08aa
        L_0x08a4:
            r0 = 32
            if (r8 == 0) goto L_0x08aa
            r0 = 50
        L_0x08aa:
            r1.A01(r0)     // Catch:{ NumberFormatException -> 0x08af }
            goto L_0x06b1
        L_0x08af:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-many-guesses/time-not-int"
            goto L_0x08b6
        L_0x08b3:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
        L_0x08b6:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x08b9:
            X.3Kl r0 = r12.A0o
            r0.A01(r4)
            goto L_0x06b1
        L_0x08c0:
            long r1 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x08e4 }
            X.1Ww r0 = r12.A0r     // Catch:{ NumberFormatException -> 0x08e4 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x08e4 }
            if (r4 == 0) goto L_0x08cf
            r0 = 2131893488(0x7f121cf0, float:1.9421754E38)
            goto L_0x08d7
        L_0x08cf:
            r0 = 2131893437(0x7f121cbd, float:1.942165E38)
            if (r8 == 0) goto L_0x08d7
            r0 = 2131893655(0x7f121d97, float:1.9422093E38)
        L_0x08d7:
            X.AnonymousClass3UY.A0I(r12, r0, r1)     // Catch:{ NumberFormatException -> 0x08e4 }
            X.3LA r0 = r12.A16     // Catch:{ NumberFormatException -> 0x08e4 }
            X.AnonymousClass3LA.A01(r0, r5, r1)     // Catch:{ NumberFormatException -> 0x08e4 }
            r12.A0l(r1, r5)     // Catch:{ NumberFormatException -> 0x08e4 }
            goto L_0x06b1
        L_0x08e4:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/too-recent/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r12.getString(r3)
            A1M(r12, r0)
            goto L_0x06b1
        L_0x08f3:
            X.2or r1 = X.C52082or.ERROR_PROVIDER_UNROUTABLE
            if (r3 != r1) goto L_0x0914
            boolean r1 = X.C36431kI.A1U(r12)
            X.C18740tg.A06(r11)
            r14 = 2131893440(0x7f121cc0, float:1.9421657E38)
            r15 = 2131893439(0x7f121cbf, float:1.9421655E38)
            if (r1 == 0) goto L_0x090c
            r14 = 2131893656(0x7f121d98, float:1.9422095E38)
            r15 = 2131893657(0x7f121d99, float:1.9422097E38)
        L_0x090c:
            java.lang.String r13 = "server-send-request-provider-unroutable"
            r10 = r12
            r12 = r0
            r10.A10(r11, r12, r13, r14, r15)
            return
        L_0x0914:
            X.2or r1 = X.C52082or.ERROR_NO_ROUTES
            if (r3 != r1) goto L_0x0937
            boolean r1 = X.C36431kI.A1U(r12)
            X.C18740tg.A06(r11)
            r15 = 2131893440(0x7f121cc0, float:1.9421657E38)
            r16 = 2131893439(0x7f121cbf, float:1.9421655E38)
            if (r1 == 0) goto L_0x092d
            r15 = 2131893656(0x7f121d98, float:1.9422095E38)
            r16 = 2131893657(0x7f121d99, float:1.9422097E38)
        L_0x092d:
            java.lang.String r13 = "server-send-request-no-routes"
            java.lang.String r14 = "noRouteSms"
            r10 = r12
            r12 = r0
            r10.A11(r11, r12, r13, r14, r15, r16)
            return
        L_0x0937:
            X.2or r4 = X.C52082or.ERROR_BAD_TOKEN
            if (r3 == r4) goto L_0x0b2f
            X.2or r1 = X.C52082or.ERROR_INVALID_SKEY_SIGNATURE
            if (r3 == r1) goto L_0x0b2f
            X.2or r1 = X.C52082or.SECURITY_CODE
            if (r3 != r1) goto L_0x094a
            X.C18740tg.A06(r11)
            r12.A0w(r11, r0)
            return
        L_0x094a:
            X.2or r4 = X.C52082or.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP
            if (r3 == r4) goto L_0x0b14
            X.2or r1 = X.C52082or.ERROR_SECOND_OTP
            if (r3 == r1) goto L_0x0b14
            X.2or r1 = X.C52082or.ERROR_NOT_ALLOWED
            if (r3 != r1) goto L_0x095a
            A1L(r12, r0)
            return
        L_0x095a:
            X.2or r0 = X.C52082or.ERROR_CODE_CHECKPOINT
            if (r3 == r0) goto L_0x09b7
            X.2or r0 = X.C52082or.ERROR_SEND_SMS_TO_WA
            if (r3 == r0) goto L_0x0966
            X.2or r0 = X.C52082or.ERROR_WAITING_FOR_SMS
            if (r3 != r0) goto L_0x000f
        L_0x0966:
            if (r22 == 0) goto L_0x0b06
            java.lang.String r0 = r11.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0b06
            java.lang.String r4 = r11.A0L
            java.lang.String r0 = "VerifyPhoneNumber/transitionToSendSmsToWa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r3 = r12.A1H
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.SendSmsToWa"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "sendSmsNumber"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "changeNumber"
            r1.putExtra(r0, r3)
        L_0x0991:
            r0 = 1
            r12.A33(r1, r0)
            return
        L_0x0996:
            java.lang.String r14 = "autoconf"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x000f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/status="
            X.C36321k7.A1K(r3, r0, r1)
            java.lang.String r2 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/fraud eligible"
            if (r22 != 0) goto L_0x09c6
            java.lang.String r0 = "VerifyPhoneNumber/onRequestAutoConfCodeResponse/result is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x09b0:
            boolean r0 = r12.A1I
            if (r0 == 0) goto L_0x0a36
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x09b7:
            X.1Ww r2 = r12.A0r
            r1 = 16
            r0 = 1
            X.C29501Ww.A02(r2, r1, r0)
            boolean r0 = r12.A1H
            android.content.Intent r1 = X.AnonymousClass190.A1Q(r12, r0)
            goto L_0x0991
        L_0x09c6:
            X.2or r0 = X.C52082or.YES
            if (r3 != r0) goto L_0x09f2
            java.lang.String r0 = "VerifyPhoneNumber/onAutoconfCodeSent/attempt to verify authResponse"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r15 = r12.A1D
            java.lang.String r1 = r12.A1F
            X.C18740tg.A06(r1)
            X.0v5 r0 = r12.A0K
            X.AnonymousClass3MJ.A00(r0)
            X.2d1 r13 = r12.A0u
            java.lang.String r0 = r11.A0A
            r19 = 2
            r17 = r14
            r16 = r1
            r18 = r0
            r12.A3l(r13, r14, r15, r16, r17, r18, r19)
        L_0x09ea:
            X.0v0 r1 = r12.A09
            int r0 = r12.A04
            r1.A1E(r0)
            return
        L_0x09f2:
            X.2or r1 = X.C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            r0 = 0
            if (r3 == r1) goto L_0x0a12
            A1G(r12, r0)
            X.0v0 r1 = r12.A09
            java.lang.String r0 = r3.name()
            X.C65983Uf.A0Q(r1, r0)
            goto L_0x09b0
        L_0x0a04:
            X.2or r0 = X.C52082or.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r3 != r0) goto L_0x0a31
            java.lang.String r0 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0v0 r0 = r12.A09
            r0.A1Y(r5)
        L_0x0a12:
            r12.BKE()
            goto L_0x0688
        L_0x0a17:
            java.lang.String r1 = "silent_auth"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse/status="
            X.C36321k7.A1K(r3, r0, r1)
            java.lang.String r5 = "silent_auth_request_code_failed"
            if (r22 != 0) goto L_0x0a3c
            java.lang.String r0 = "VerifyPhoneNumber/onRequestSilentAuthCodeResponse/result is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0a31:
            X.0v0 r0 = r12.A09
        L_0x0a33:
            r0.A1Y(r5)
        L_0x0a36:
            int r0 = r12.A04
            A1E(r12, r0)
            return
        L_0x0a3c:
            X.2or r0 = X.C52082or.YES
            if (r3 != r0) goto L_0x0a04
            X.3TX r3 = r12.A0z
            java.lang.String r1 = A0J(r12)
            java.lang.String r0 = "ipification_auth_initiated"
            r2 = 0
            r3.A0A(r1, r0, r2)
            java.lang.String r4 = r11.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0a5a
            java.lang.String r0 = "VerifyPhoneNumber/onSilentAuthCodeSent/uri is null or empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0a31
        L_0x0a5a:
            X.0wD r0 = r12.A07
            r1 = 1
            int r0 = r0.A03(r1)
            if (r0 != r1) goto L_0x0a72
            X.0wG r3 = r12.A0a
            X.0zN r2 = r12.A0e
            X.0v0 r1 = r12.A09
            X.3qK r0 = new X.3qK
            r0.<init>(r12, r4)
            X.C65983Uf.A0P(r3, r1, r2, r0)
            return
        L_0x0a72:
            if (r0 != 0) goto L_0x0b0c
            X.3TX r3 = r12.A0z
            java.lang.String r2 = A0J(r12)
            java.lang.String r1 = "ipification_auth_failure"
            java.lang.String r0 = "cellular_not_available"
            r3.A0A(r2, r1, r0)
            X.0v0 r0 = r12.A09
            java.lang.String r5 = "silent_auth_no_internet"
            goto L_0x0a33
        L_0x0a86:
            long r0 = X.C66713Xa.A00(r11)     // Catch:{ NumberFormatException -> 0x0ae5 }
            r12.A0C = r0     // Catch:{ NumberFormatException -> 0x0ae5 }
            X.1Ww r2 = r12.A0r     // Catch:{ NumberFormatException -> 0x0ae5 }
            r2.A0C(r0)     // Catch:{ NumberFormatException -> 0x0ae5 }
            r8 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0abd
            X.3Kl r6 = r12.A0o     // Catch:{ NumberFormatException -> 0x0ae5 }
            r4 = 2131893487(0x7f121cef, float:1.9421752E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0ae5 }
            X.0ts r2 = r12.A00     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            java.lang.String r0 = X.AnonymousClass3UY.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x0ae5 }
            java.lang.String r0 = X.C36391kE.A0v(r12, r0, r3, r8, r4)     // Catch:{ NumberFormatException -> 0x0ae5 }
            r6.A03(r0)     // Catch:{ NumberFormatException -> 0x0ae5 }
            X.3LA r4 = r12.A16     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r2 = r2 + r0
            r4.A07(r7, r2)     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            r12.A0l(r0, r7)     // Catch:{ NumberFormatException -> 0x0ae5 }
            return
        L_0x0abd:
            X.3Kl r7 = r12.A0o     // Catch:{ NumberFormatException -> 0x0ae5 }
            r4 = 2131894440(0x7f1220a8, float:1.9423685E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ NumberFormatException -> 0x0ae5 }
            X.0ts r2 = r12.A00     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            java.lang.String r0 = X.AnonymousClass3UY.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x0ae5 }
            java.lang.String r0 = X.C36391kE.A0v(r12, r0, r3, r8, r4)     // Catch:{ NumberFormatException -> 0x0ae5 }
            r7.A03(r0)     // Catch:{ NumberFormatException -> 0x0ae5 }
            X.3LA r4 = r12.A16     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r2 = r2 + r0
            r4.A07(r6, r2)     // Catch:{ NumberFormatException -> 0x0ae5 }
            long r0 = r12.A0C     // Catch:{ NumberFormatException -> 0x0ae5 }
            r12.A0l(r0, r6)     // Catch:{ NumberFormatException -> 0x0ae5 }
            return
        L_0x0ae5:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/request/sms/triedtoomanytimesallmethods/time-not-int"
            com.whatsapp.util.Log.w(r0, r1)
            X.3Kl r0 = r12.A0o
            r0.A01(r5)
            r12.A0O()
            return
        L_0x0af4:
            X.0z5 r1 = r12.A0Q
            r0 = 1
            r1.A01 = r0
            X.3Gd r1 = r12.A15
            r0 = 8
            r1.A02(r0)
            r0 = 22
            A1F(r12, r0)
            return
        L_0x0b06:
            java.lang.String r0 = "VerifyPhoneNumber/send sms number is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0b0c:
            X.0wU r1 = r12.A04
            r0 = 15
            X.C36421kH.A1G(r1, r12, r2, r4, r0)
            return
        L_0x0b14:
            X.C18740tg.A06(r11)
            java.lang.String r2 = r11.A0M
            r0 = 0
            long r13 = X.C65983Uf.A01(r2, r0)
            java.lang.String r2 = r11.A0O
            long r17 = X.C65983Uf.A01(r2, r0)
            boolean r16 = X.C36361kB.A1a(r3, r4)
            java.lang.String r15 = "sms"
            r12.A0n(r13, r15, r16, r17)
            return
        L_0x0b2f:
            java.lang.String r2 = "server-send-request-bad-token"
            java.lang.StringBuilder r1 = X.C36341k9.A0j(r0)
            if (r3 != r4) goto L_0x0b47
            java.lang.String r0 = "/bad-token"
        L_0x0b39:
            X.C36321k7.A1Z(r1, r0)
            X.0v0 r0 = r12.A09
            X.C65983Uf.A0Q(r0, r2)
            r0 = 41
            A1H(r12, r0)
            return
        L_0x0b47:
            java.lang.String r0 = "/invalid-skey"
            goto L_0x0b39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.BTw(X.2or, X.3Xa, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r6.equals("flash") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r4.A15.A02(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r2 = X.C36441kJ.A08(r4);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r2 != 19) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        A1I(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        X.AnonymousClass3SJ.A01(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bu4(boolean r5, java.lang.String r6) {
        /*
            r4 = this;
            X.3Ey r0 = r4.A0x
            r0.A00()
            int r0 = r6.hashCode()
            java.lang.String r2 = "flash"
            r1 = 0
            switch(r0) {
                case -795576526: goto L_0x0093;
                case 114009: goto L_0x0054;
                case 97513456: goto L_0x002d;
                case 112386354: goto L_0x0026;
                case 2120743944: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = X.C36441kJ.A1N(r6)
            if (r0 == 0) goto L_0x000f
            X.3Gd r0 = r4.A15
            r0.A02(r1)
            X.1Ww r0 = r4.A0r
            r0.A04()
            if (r5 == 0) goto L_0x000f
            r0 = 51
            goto L_0x00a7
        L_0x0026:
            java.lang.String r0 = "voice"
            boolean r0 = r6.equals(r0)
            goto L_0x0031
        L_0x002d:
            boolean r0 = r6.equals(r2)
        L_0x0031:
            if (r0 == 0) goto L_0x000f
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x0040
            X.3Gd r1 = r4.A15
            r0 = 16
            r1.A02(r0)
        L_0x0040:
            if (r5 == 0) goto L_0x000f
            int r2 = X.C36441kJ.A08(r4)
            r1 = 19
            r0 = 2131893486(0x7f121cee, float:1.942175E38)
            if (r2 != r1) goto L_0x0050
            r0 = 2131894059(0x7f121f2b, float:1.9422912E38)
        L_0x0050:
            A1I(r4, r0)
            return
        L_0x0054:
            java.lang.String r0 = "sms"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.3Gd r0 = r4.A15
            r0.A02(r1)
            boolean r0 = r4.A1V
            r3 = 1
            if (r0 == 0) goto L_0x007e
            r4.A1U = r3
            X.4bA r2 = r4.A14
            java.lang.String r1 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            X.C26981Mg.A01(r2, r4, r0, r3)
        L_0x0074:
            X.1Ww r0 = r4.A0r
            r0.A04()
            if (r5 == 0) goto L_0x000f
            r0 = 52
            goto L_0x00a7
        L_0x007e:
            java.lang.String r0 = "android.provider.Telephony.SMS_RECEIVED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setPriority(r0)
            X.4b9 r0 = r4.A12
            X.C26981Mg.A01(r0, r4, r1, r3)
            r4.A1P = r3
            goto L_0x0074
        L_0x0093:
            boolean r0 = X.C36441kJ.A1M(r6)
            if (r0 == 0) goto L_0x000f
            X.3Gd r0 = r4.A15
            r0.A02(r1)
            X.1Ww r0 = r4.A0r
            r0.A04()
            if (r5 == 0) goto L_0x000f
            r0 = 46
        L_0x00a7:
            X.AnonymousClass3SJ.A01(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.Bu4(boolean, java.lang.String):void");
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0k.A00(getLocalClassName());
    }

    public void onBackPressed() {
        this.A0z.A08(A0J(this), "back");
        if (this.A1M) {
            Log.i("VerifyPhoneNumber/onBackPressed/is adding new account");
            C65983Uf.A0F(this, this.A0X, this.A09, this.A0A);
        } else if (C36431kI.A1T(this) || C36431kI.A1U(this)) {
            A1B(this);
        } else if (C36441kJ.A08(this) == 19) {
            Log.i("VerifyPhoneNumber/returnTo2Fac");
            this.A0A.A01(18);
            A33(AnonymousClass190.A1R(this, this.A1H), false);
            finish();
        } else if (this.A02 == 2) {
            super.onBackPressed();
        } else {
            Log.i("VerifyPhoneNumber/onBackPressed/wrong registration state, do not allow go back");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x050f, code lost:
        if (X.C36441kJ.A08(r0) != 19) goto L_0x0512;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0301  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            super.onCreate(r8)
            java.lang.Boolean r1 = X.C18750th.A03
            X.0wU r3 = r0.A04
            r2 = 15
            X.3wY r1 = new X.3wY
            r1.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0, (int) r2)
            r3.Boy(r1)
            int r9 = X.C36441kJ.A08(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/registrationState="
            X.C36321k7.A1T(r1, r2, r9)
            r4 = 1
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1V(r8)
            r0.A1J = r1
            android.os.Bundle r1 = X.C36371kC.A0H(r0)
            if (r1 == 0) goto L_0x00e2
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "code_verification_mode"
            int r5 = r2.getIntExtra(r1, r3)
            r0.A02 = r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/codeVerificationMode is "
            X.C36321k7.A1T(r1, r2, r5)
            X.0zN r2 = r0.A0e
            r1 = 4464(0x1170, float:6.255E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x005b
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_IS_APP_RESTARTED"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1N = r1
        L_0x005b:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "changenumber"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1H = r1
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "passkey_solved_challenge"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A1E = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "EXTRA_SHOULD_REQUEST_VOICE_CALL"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1R = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "server_start_message"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A1G = r1
            android.content.Intent r5 = r0.getIntent()
            r2 = -1
            java.lang.String r1 = "flash_type"
            int r1 = r5.getIntExtra(r1, r2)
            r0.A04 = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "fraud_eligible"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1I = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "wa_old_eligible"
            int r5 = r2.getIntExtra(r1, r3)
            r0.A0A = r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/waOldEligible : "
            X.C36321k7.A1T(r1, r2, r5)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "silent_auth_eligible"
            int r1 = r2.getIntExtra(r1, r3)
            r0.A09 = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "show_request_code_progress_dialog"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1T = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "has_retried_flash_call"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0.A1K = r1
        L_0x00e2:
            X.0wo r5 = r0.A07
            android.content.SharedPreferences r2 = r0.getPreferences(r3)
            X.3LA r1 = new X.3LA
            r1.<init>(r2, r5)
            r0.A16 = r1
            android.content.SharedPreferences r2 = X.C36331k8.A06(r0)
            java.lang.String r1 = "email_address"
            r6 = 0
            java.lang.String r1 = r2.getString(r1, r6)
            r0.A1b = r1
            X.0zN r2 = r0.A0e
            r1 = 2964(0xb94, float:4.153E-42)
            boolean r1 = r2.A0E(r1)
            r0.A1S = r1
            X.0v0 r2 = r0.A09
            X.3Kl r1 = new X.3Kl
            r1.<init>(r0, r2)
            r0.A0o = r1
            boolean r1 = X.C36431kI.A1T(r0)
            if (r1 == 0) goto L_0x011c
            X.0v0 r2 = r0.A09
            java.lang.String r1 = "wa_old_entered"
            r2.A1a(r1)
        L_0x011c:
            X.1RU r2 = r0.A0X
            boolean r1 = r0.A1H
            boolean r1 = r2.A0F(r1)
            r0.A1M = r1
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r2 = r5.getScheme()
            java.lang.String r1 = "whatsapp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06db
            java.lang.String r2 = r5.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06db
            java.lang.String r2 = r5.getScheme()
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06db
            r0.A1a = r6
        L_0x0150:
            int r1 = r0.A3i()
            if (r9 == r1) goto L_0x01a3
            boolean r1 = X.C36431kI.A1U(r0)
            if (r1 != 0) goto L_0x01a3
            int r2 = X.C36441kJ.A08(r0)
            r1 = 19
            if (r2 == r1) goto L_0x01a3
            boolean r1 = X.C36431kI.A1S(r0)
            if (r1 != 0) goto L_0x01a3
            X.12U r1 = r0.A0A
            boolean r1 = r1.A02()
            if (r1 != 0) goto L_0x01a3
            boolean r1 = X.C36441kJ.A1K(r0)
            if (r1 != 0) goto L_0x01a3
            boolean r1 = X.C36431kI.A1T(r0)
            if (r1 != 0) goto L_0x01a3
            int r2 = X.C36441kJ.A08(r0)
            r1 = 5
            if (r2 == r1) goto L_0x01a3
            X.12U r1 = r0.A0A
            int r2 = r1.A00()
            r1 = 23
            if (r2 == r1) goto L_0x01a3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/wrong-state bounce to main "
            X.C36321k7.A1S(r1, r2, r9)
            android.content.Intent r3 = X.AnonymousClass190.A09(r0)
        L_0x019c:
            r0.startActivity(r3)
            r0.finish()
        L_0x01a2:
            return
        L_0x01a3:
            X.0v0 r1 = r0.A09
            java.lang.String r1 = r1.A0f()
            r0.A1D = r1
            X.0v0 r1 = r0.A09
            java.lang.String r1 = r1.A0h()
            r0.A1F = r1
            android.content.SharedPreferences r2 = X.C36331k8.A06(r0)
            java.lang.String r1 = "reg_attempts_verify_code"
            int r5 = r2.getInt(r1, r3)
            X.0zN r2 = r0.A0e
            X.0v0 r1 = r0.A09
            java.lang.String r2 = X.C65983Uf.A0C(r1, r2)
            X.2d1 r1 = new X.2d1
            r1.<init>(r5, r2)
            r0.A0u = r1
            java.lang.String r2 = r0.A1D
            java.lang.String r1 = r0.A1F
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            X.0v5 r12 = r0.A0K
            X.2d1 r13 = r0.A0u
            X.1ls r10 = new X.1ls
            r14 = r0
            r15 = r2
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A13 = r10
            X.2yq r1 = r0.A0P
            android.content.SharedPreferences r6 = r0.getPreferences(r3)
            X.1Mz r2 = r1.A00
            X.0tq r1 = r2.A01
            X.0wo r5 = X.C36351kA.A0V(r1)
            X.1My r1 = r2.A00
            X.3PP r2 = X.C27111My.A37(r1)
            X.3Gd r1 = new X.3Gd
            r1.<init>(r6, r5, r2, r10)
            r0.A15 = r1
            X.0zN r2 = r0.A0e
            r1 = 3902(0xf3e, float:5.468E-42)
            boolean r18 = r2.A0E(r1)
            android.os.Bundle r1 = X.C36371kC.A0H(r0)
            java.lang.String r11 = "voice"
            java.lang.String r7 = "sms"
            if (r1 == 0) goto L_0x0348
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "should_request_flash_call"
            boolean r17 = r2.getBooleanExtra(r1, r3)
            boolean r1 = X.C36431kI.A1T(r0)
            if (r1 != 0) goto L_0x0236
            boolean r1 = X.C36431kI.A1U(r0)
            if (r1 != 0) goto L_0x0236
            boolean r1 = X.C36441kJ.A1K(r0)
            if (r1 != 0) goto L_0x0236
            X.12U r1 = r0.A0A
            int r2 = r1.A00()
            r1 = 23
            if (r2 != r1) goto L_0x023d
        L_0x0236:
            X.0v0 r2 = r0.A09
            int r1 = r0.A04
            r2.A1E(r1)
        L_0x023d:
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/ssend"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r2 = "use_sms_retriever"
            if (r20 != 0) goto L_0x0336
            android.content.Intent r1 = r0.getIntent()
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r18 == 0) goto L_0x0332
            if (r1 == 0) goto L_0x0254
            r0.A1V = r4
        L_0x0254:
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r13 = "sms_retry_time"
            r1 = 0
            long r5 = r3.getLongExtra(r13, r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r12 = "voice_retry_time"
            long r3 = r3.getLongExtra(r12, r1)
            android.content.Intent r14 = r0.getIntent()
            java.lang.String r10 = "wa_old_retry_time"
            long r15 = r14.getLongExtra(r10, r1)
            android.content.Intent r14 = r0.getIntent()
            java.lang.String r10 = "email_otp_retry_time"
            long r1 = r14.getLongExtra(r10, r1)
            r10 = 13
            if (r9 == r10) goto L_0x0312
            r10 = 14
            if (r9 == r10) goto L_0x0312
            X.3LA r9 = r0.A16
            r9.A07(r7, r5)
            X.3LA r5 = r0.A16
            r5.A07(r11, r3)
            X.3LA r6 = r0.A16
            java.lang.String r5 = "wa_old"
            r3 = r15
            r6.A07(r5, r3)
            X.3LA r4 = r0.A16
            java.lang.String r3 = "email_otp"
            r4.A07(r3, r1)
        L_0x029f:
            if (r18 == 0) goto L_0x02b7
            android.content.SharedPreferences r1 = X.C36331k8.A06(r0)
            java.lang.String r2 = "registration_use_sms_retriever"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x02b7
            android.content.SharedPreferences r1 = X.C36331k8.A06(r0)
            boolean r1 = X.C36371kC.A1U(r1, r2)
            r0.A1V = r1
        L_0x02b7:
            X.12U r1 = r0.A0A
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0307
            java.lang.String r1 = r0.A1G
            if (r1 != 0) goto L_0x0307
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/app got killed during autoconf authentication during changeNumber"
        L_0x02c5:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1Ww r3 = r0.A0r
            int r2 = r0.A3i()
            r1 = 1
            X.C29501Ww.A02(r3, r2, r1)
            X.C62433Gd.A00(r0)
        L_0x02d5:
            X.0wD r2 = r0.A07
            X.0wL r1 = r0.A1d
            r2.registerObserver(r1)
            java.lang.String r1 = r0.A1D
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0301
            java.lang.String r1 = r0.A1F
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0301
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "return_to_phone_number"
            boolean r1 = X.C36421kH.A1T(r2, r1)
            if (r1 == 0) goto L_0x034c
            java.lang.String r1 = "VerifyPhoneNumber/return to enter phone number based on intent extra"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02fd:
            A1B(r0)
            return
        L_0x0301:
            java.lang.String r1 = "VerifyPhoneNumber/create/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x02fd
        L_0x0307:
            boolean r1 = X.C36431kI.A1S(r0)
            if (r1 == 0) goto L_0x02d5
            if (r17 != 0) goto L_0x02d5
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/app got killed during flash call verification, reset reg state to SMS"
            goto L_0x02c5
        L_0x0312:
            android.content.Intent r1 = r0.getIntent()
            boolean r9 = r1.hasExtra(r13)
            android.content.Intent r1 = r0.getIntent()
            boolean r2 = r1.hasExtra(r12)
            if (r9 == 0) goto L_0x0329
            X.3LA r1 = r0.A16
            r1.A07(r7, r5)
        L_0x0329:
            if (r2 == 0) goto L_0x029f
            X.3LA r1 = r0.A16
            r1.A07(r11, r3)
            goto L_0x029f
        L_0x0332:
            r0.A1V = r1
            goto L_0x0254
        L_0x0336:
            if (r18 != 0) goto L_0x033e
            boolean r1 = r8.getBoolean(r2, r3)
            r0.A1V = r1
        L_0x033e:
            java.lang.String r1 = "has_retried_flash_call"
            boolean r1 = r8.getBoolean(r1, r3)
            r0.A1K = r1
            goto L_0x029f
        L_0x0348:
            r17 = 0
            goto L_0x029f
        L_0x034c:
            X.0v0 r2 = r0.A09
            X.4b9 r1 = new X.4b9
            r1.<init>(r2, r0)
            r0.A12 = r1
            X.0v0 r2 = r0.A09
            X.4bA r1 = new X.4bA
            r1.<init>(r2, r0)
            r0.A14 = r1
            X.3PP r9 = r0.A0l
            long r1 = X.AnonymousClass3LA.A00(r0, r7)
            long r3 = X.AnonymousClass3LA.A00(r0, r11)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = ", "
            X.C36321k7.A1V(r5, r6, r3)
            X.3Gz r5 = r9.A01
            X.3G5 r11 = r5.A05
            X.0wg r6 = r11.A00
            java.lang.String r5 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r9 = r6.A00(r5)
            java.lang.String r6 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_verification_state"
            int r10 = X.C36371kC.A01(r9, r6)
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "AccountDefenceLocalDataRepository/getSecondCodeVerificationState/"
            X.C36321k7.A1T(r6, r9, r10)
            if (r10 != 0) goto L_0x06a6
            long r17 = java.lang.System.currentTimeMillis()
            long r15 = r11.A00()
            long r13 = r11.A01()
            r11 = 0
            int r6 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x03b8
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x03b8
            if (r6 <= 0) goto L_0x03b2
            int r6 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r6 < 0) goto L_0x03b8
        L_0x03b2:
            if (r9 <= 0) goto L_0x06a6
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 >= 0) goto L_0x06a6
        L_0x03b8:
            java.lang.String r1 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return enabled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r10 = 1
        L_0x03be:
            r0.A00 = r10
            X.3PP r1 = r0.A0l
            X.3Gz r1 = r1.A01
            X.3G5 r1 = r1.A05
            X.0wg r1 = r1.A00
            android.content.SharedPreferences r2 = r1.A00(r5)
            java.lang.String r1 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_sms_requested_once"
            boolean r3 = X.C36371kC.A1U(r2, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "AccountDefenceLocalDataRepository/isSecondSmsRequestedOnce/"
            X.C36321k7.A1X(r1, r2, r3)
            r0.A1L = r3
            A15(r0)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.A0D = r1
            X.C36331k8.A0n(r0)
            X.0wG r1 = r0.A0a
            android.content.res.Resources r2 = X.C36421kH.A0B(r1)
            r1 = 2131168112(0x7f070b70, float:1.7950517E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r0.A08 = r1
            X.0wG r1 = r0.A0a
            android.content.res.Resources r2 = X.C36421kH.A0B(r1)
            r1 = 2131168109(0x7f070b6d, float:1.795051E38)
            int r2 = r2.getDimensionPixelSize(r1)
            X.0ts r1 = r0.A00
            boolean r1 = X.C36351kA.A1Y(r1)
            r3 = 0
            if (r1 == 0) goto L_0x06a0
            r0.A05 = r2
            r0.A06 = r3
        L_0x0413:
            X.0wG r1 = r0.A0a
            android.content.res.Resources r2 = X.C36421kH.A0B(r1)
            r1 = 2131168110(0x7f070b6e, float:1.7950513E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r0.A07 = r1
            r1 = 2131896940(0x7f122a6c, float:1.9428755E38)
            r0.setTitle(r1)
            r1 = 2131626444(0x7f0e09cc, float:1.8880124E38)
            r0.setContentView((int) r1)
            X.04H r2 = X.C36441kJ.A0b(r0)
            java.lang.Class<com.whatsapp.registration.entercode.EnterCodeViewModel> r1 = com.whatsapp.registration.entercode.EnterCodeViewModel.class
            X.04R r2 = r2.A00(r1)
            com.whatsapp.registration.entercode.EnterCodeViewModel r2 = (com.whatsapp.registration.entercode.EnterCodeViewModel) r2
            r0.A0w = r2
            X.3LA r1 = r0.A16
            X.AnonymousClass00C.A0D(r1, r3)
            r2.A01 = r1
            com.whatsapp.registration.entercode.EnterCodeViewModel r1 = r0.A0w
            X.00s r1 = r1.A02
            r5 = 26
            X.C65973Ue.A00(r0, r1, r5)
            com.whatsapp.registration.entercode.EnterCodeViewModel r1 = r0.A0w
            X.00s r2 = r1.A03
            r1 = 28
            X.C65973Ue.A00(r0, r2, r1)
            com.whatsapp.registration.entercode.EnterCodeViewModel r1 = r0.A0w
            X.1Rs r2 = r1.A04
            r1 = 31
            X.C65973Ue.A00(r0, r2, r1)
            X.04H r2 = X.C36441kJ.A0b(r0)
            java.lang.Class<X.1tN> r1 = X.C39711tN.class
            X.04R r1 = r2.A00(r1)
            X.1tN r1 = (X.C39711tN) r1
            r0.A0y = r1
            X.00s r2 = r1.A02
            r1 = 32
            X.C65973Ue.A00(r0, r2, r1)
            X.1tN r1 = r0.A0y
            X.00s r2 = r1.A01
            r1 = 27
            X.C65973Ue.A00(r0, r2, r1)
            X.04H r2 = X.C36441kJ.A0b(r0)
            java.lang.Class<com.whatsapp.report.activity.banreport.BanReportViewModel> r1 = com.whatsapp.report.activity.banreport.BanReportViewModel.class
            X.04R r1 = r2.A00(r1)
            com.whatsapp.report.activity.banreport.BanReportViewModel r1 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r1
            r0.A17 = r1
            X.00s r2 = r1.A01
            r1 = 33
            X.C65973Ue.A00(r0, r2, r1)
            com.whatsapp.report.activity.banreport.BanReportViewModel r1 = r0.A17
            X.00s r2 = r1.A02
            r1 = 29
            X.C65973Ue.A00(r0, r2, r1)
            X.04H r2 = X.C36441kJ.A0b(r0)
            java.lang.Class<com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel> r1 = com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel.class
            X.04R r2 = r2.A00(r1)
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r2 = (com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel) r2
            r0.A11 = r2
            boolean r1 = r0.A1S
            if (r1 == 0) goto L_0x04b3
            X.00r r2 = r2.A00
            r1 = 30
            X.C65973Ue.A00(r0, r2, r1)
        L_0x04b3:
            r1 = 2131434754(0x7f0b1d02, float:1.849133E38)
            r2 = 2131434754(0x7f0b1d02, float:1.849133E38)
            android.view.View r1 = X.C03570Gk.A0B(r0, r1)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r0.A0V = r1
            r1 = 2131428882(0x7f0b0612, float:1.8479421E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.A0H = r1
            r1 = 2131429975(0x7f0b0a57, float:1.8481638E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r0, r1)
            r0.A0I = r1
            r1 = 2131433843(0x7f0b1973, float:1.8489483E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36421kH.A0I(r0, r1)
            r0.A0T = r1
            r1 = 2131435104(0x7f0b1e60, float:1.849204E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0.A0E = r1
            X.0zN r1 = r0.A0e
            X.C65983Uf.A0O(r0, r1, r2)
            X.0ts r6 = r0.A00
            android.view.View r9 = r0.A00
            r12 = 2131434753(0x7f0b1d01, float:1.8491329E38)
            int r1 = r0.A02
            r4 = 2
            boolean r13 = X.AnonymousClass000.A1S(r1, r4)
            boolean r1 = X.C36431kI.A1T(r0)
            if (r1 != 0) goto L_0x0511
            boolean r1 = X.C36431kI.A1U(r0)
            if (r1 != 0) goto L_0x0511
            int r2 = X.C36441kJ.A08(r0)
            r1 = 19
            r14 = 0
            if (r2 != r1) goto L_0x0512
        L_0x0511:
            r14 = 1
        L_0x0512:
            boolean r1 = r0.A1M
            r10 = r0
            r11 = r6
            r15 = r1
            X.C65983Uf.A0M(r9, r10, r11, r12, r13, r14, r15)
            X.0wD r1 = r0.A07
            X.3K7 r1 = r1.A05()
            if (r1 == 0) goto L_0x053d
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x053d
            boolean r1 = X.C36431kI.A1T(r0)
            if (r1 != 0) goto L_0x053d
            boolean r1 = X.C36441kJ.A1K(r0)
            if (r1 != 0) goto L_0x053d
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/display-roaming"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 2131433477(0x7f0b1805, float:1.848874E38)
            X.C36341k9.A13(r0, r1, r3)
        L_0x053d:
            r1 = 2131433002(0x7f0b162a, float:1.8487777E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r0.A0G = r2
            r1 = 100
            r2.setProgress(r1)
            r1 = 2131435102(0x7f0b1e5e, float:1.8492037E38)
            android.view.View r1 = r0.findViewById(r1)
            com.whatsapp.CodeInputField r1 = (com.whatsapp.CodeInputField) r1
            r0.A0M = r1
            X.3Bi r2 = r0.A0O
            r1 = 0
            X.3Kv r1 = r2.A00(r1)
            r0.A0m = r1
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x068d
            android.view.View r2 = r0.A00
            r1 = 2131435101(0x7f0b1e5d, float:1.8492035E38)
            android.view.View r9 = X.C012005e.A02(r2, r1)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            X.3Kv r6 = r0.A0m
            X.3qI r2 = new X.3qI
            r2.<init>(r0)
            int r1 = A1e
            r6.A02(r9, r2, r1)
            com.whatsapp.CodeInputField r1 = r0.A0M
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ProgressBar r1 = r0.A0G
            r1.setVisibility(r2)
            r9.setVisibility(r3)
        L_0x058d:
            r1 = 2131435103(0x7f0b1e5f, float:1.8492039E38)
            android.view.View r3 = r0.findViewById(r1)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r0.A0F = r3
            X.0ts r2 = r0.A00
            r1 = 2131231773(0x7f08041d, float:1.8079636E38)
            X.C36321k7.A0L(r0, r3, r2, r1)
            android.widget.ImageButton r1 = r0.A0F
            X.C67133Yq.A00(r1, r0, r5)
            r0.A0L()
            r1 = 2131434088(0x7f0b1a68, float:1.848998E38)
            X.1RJ r1 = X.C36351kA.A0r(r0, r1)
            r0.A1B = r1
            r1 = 2131429544(0x7f0b08a8, float:1.8480764E38)
            X.1RJ r1 = X.C36351kA.A0r(r0, r1)
            r0.A1A = r1
            android.content.res.Resources r1 = r0.getResources()
            boolean r1 = X.C65983Uf.A0S(r1)
            if (r1 == 0) goto L_0x05cb
            android.view.Window r1 = r0.getWindow()
            r1.setSoftInputMode(r4)
        L_0x05cb:
            X.3LA r3 = r0.A16
            java.lang.String r2 = r0.A1D
            java.lang.String r1 = r0.A1F
            java.lang.String r4 = r3.A03(r2, r1)
            if (r4 == 0) goto L_0x05fd
            boolean r1 = X.C36431kI.A1S(r0)
            if (r1 != 0) goto L_0x05fd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/create/savedcode "
            X.C36321k7.A1Q(r1, r4, r2)
            java.lang.String r3 = r0.A1D
            java.lang.String r2 = r0.A1F
            r16 = 4
            X.0v5 r1 = r0.A0K
            X.AnonymousClass3MJ.A00(r1)
            X.2d1 r1 = r0.A0u
            r15 = 0
            r9 = r0
            r10 = r1
            r11 = r4
            r12 = r3
            r13 = r2
            r14 = r7
            r9.A3l(r10, r11, r12, r13, r14, r15, r16)
        L_0x05fd:
            boolean r1 = X.C36431kI.A1S(r0)
            if (r1 != 0) goto L_0x0654
            android.os.Bundle r1 = X.C36371kC.A0H(r0)
            if (r1 == 0) goto L_0x0654
            if (r20 != 0) goto L_0x0643
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "request_code_method"
            java.lang.String r5 = r2.getStringExtra(r1)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r4 = "request_code_status"
            r3 = -1
            int r1 = r1.getIntExtra(r4, r3)
            if (r1 < 0) goto L_0x068b
            X.2or[] r2 = X.C52082or.values()
            android.content.Intent r1 = r0.getIntent()
            int r1 = r1.getIntExtra(r4, r3)
            r3 = r2[r1]
        L_0x0630:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "request_code_result"
            android.os.Parcelable r1 = r2.getParcelableExtra(r1)
            X.3Xa r1 = (X.C66713Xa) r1
            if (r5 == 0) goto L_0x0643
            if (r3 == 0) goto L_0x0643
            r0.BTw(r3, r1, r5)
        L_0x0643:
            r1 = 0
            r3 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            android.content.Intent r1 = X.AnonymousClass190.A0I(r0, r1, r2, r3, r5, r7, r9, r10)
            r0.setIntent(r1)
        L_0x0654:
            X.3TX r2 = r0.A0z
            java.lang.String r1 = A0J(r0)
            r2.A04(r1)
            java.lang.String r1 = r0.A1G
            if (r1 == 0) goto L_0x06b1
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/attempt autoconf verification"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = X.C36431kI.A1S(r0)
            if (r1 != 0) goto L_0x0671
            r1 = 23
            X.AnonymousClass3SJ.A01(r0, r1)
        L_0x0671:
            r13 = 0
            java.lang.String r5 = r0.A1D
            java.lang.String r4 = r0.A1F
            java.lang.String r3 = r0.A1G
            r12 = 0
            X.0zN r2 = r0.A0e
            X.0v0 r1 = r0.A09
            X.2d2 r6 = X.C65983Uf.A08(r1, r2)
            java.lang.String r10 = "autoconf"
            r7 = r0
            r8 = r5
            r9 = r4
            r11 = r3
            A12(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x068b:
            r3 = 0
            goto L_0x0630
        L_0x068d:
            com.whatsapp.CodeInputField r1 = r0.A0M
            r1.setVisibility(r3)
            com.whatsapp.CodeInputField r3 = r0.A0M
            r1 = 5
            X.4Yw r2 = new X.4Yw
            r2.<init>(r0, r1)
            r1 = 6
            r3.A0F(r2, r1)
            goto L_0x058d
        L_0x06a0:
            r0.A05 = r3
            r0.A06 = r2
            goto L_0x0413
        L_0x06a6:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "AccountDefenceSecondCodeViewPresenter/determine-current-account-defence-verification-state return code:"
            X.C36321k7.A1T(r1, r2, r10)
            goto L_0x03be
        L_0x06b1:
            boolean r1 = X.C36441kJ.A1K(r0)
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = "VerifyPhoneNumber/passkeyEvent/passkey_start_login"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r4 = r0.A1E
            if (r4 == 0) goto L_0x01a2
            java.lang.String r3 = r0.A1D
            java.lang.String r2 = r0.A1F
            X.C18740tg.A06(r2)
            r12 = 5
            X.0v5 r1 = r0.A0K
            X.AnonymousClass3MJ.A00(r1)
            X.2d1 r1 = r0.A0u
            r11 = 0
            java.lang.String r10 = "passkey"
            r5 = r0
            r6 = r1
            r7 = r4
            r8 = r3
            r9 = r2
            r5.A3l(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x06db:
            if (r9 != r4) goto L_0x06f1
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.whatsapp.registration.phonenumberentry.RegisterPhone"
            r3.setClassName(r2, r1)
            java.lang.String r1 = "com.whatsapp.registration.RegisterPhone.tapped_sms_link"
            r3.putExtra(r1, r4)
            goto L_0x019c
        L_0x06f1:
            java.lang.String r5 = A0G(r5)
            r0.A1a = r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "VerifyPhoneNumber/onCreate/code "
            X.C36321k7.A1Q(r1, r5, r2)
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x044f, code lost:
        r2 = new X.AnonymousClass4XP(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0454, code lost:
        r0.A0f(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x049b, code lost:
        X.C39001qm.A0F(r0, r8, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04a2, code lost:
        return r0.create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        X.C36391kE.A17(r7, r8, r0);
        r7.setIndeterminate(true);
        r7.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        return X.C65983Uf.A05(r8, r8.A0R, r8.A00, r8.A0h, new X.C81153wY(r8, 24), r8.A1D, r8.A1F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x027c, code lost:
        r0 = X.AnonymousClass3LW.A00(r8);
        r0.A0p(X.C36391kE.A0v(r8, X.AnonymousClass3UY.A0D(r8.A00, r8.A0C), new java.lang.Object[1], 0, r7));
        r0.A0r(false);
        r0.A0h(new X.C89784Xw(r8, r4, 8), com.whatsapp.R.string.f12nameremoved);
        r3 = com.whatsapp.R.string.f12nameremoved;
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02f2, code lost:
        r0 = getString(r0);
        r7 = new android.app.ProgressDialog(r8);
        X.C36331k8.A0p(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02fe, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x031e, code lost:
        r2 = new X.C89784Xw(r8, r4, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0428  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r21) {
        /*
            r20 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r8 = r20
            r4 = r21
            if (r4 == r0) goto L_0x04d9
            r0 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r4 == r0) goto L_0x0021
            r0 = 604(0x25c, float:8.46E-43)
            if (r4 == r0) goto L_0x04a3
            r6 = 1
            switch(r21) {
                case 21: goto L_0x02a7;
                case 22: goto L_0x02c1;
                case 23: goto L_0x02eb;
                case 24: goto L_0x02ff;
                case 25: goto L_0x02ff;
                case 26: goto L_0x0325;
                case 27: goto L_0x0347;
                case 28: goto L_0x036c;
                case 29: goto L_0x0388;
                case 30: goto L_0x03a1;
                case 31: goto L_0x03b2;
                case 32: goto L_0x0275;
                case 33: goto L_0x0279;
                case 34: goto L_0x0468;
                default: goto L_0x0015;
            }
        L_0x0015:
            r13 = 0
            switch(r21) {
                case 36: goto L_0x00c6;
                case 37: goto L_0x00fe;
                case 38: goto L_0x0120;
                case 39: goto L_0x0142;
                case 40: goto L_0x0164;
                case 41: goto L_0x00a2;
                case 42: goto L_0x00e8;
                case 43: goto L_0x00c1;
                case 44: goto L_0x0186;
                case 45: goto L_0x01a8;
                case 46: goto L_0x01c2;
                case 47: goto L_0x01c7;
                case 48: goto L_0x022a;
                case 49: goto L_0x0251;
                case 50: goto L_0x009d;
                case 51: goto L_0x024c;
                case 52: goto L_0x02ef;
                case 53: goto L_0x03ee;
                case 54: goto L_0x0483;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r21) {
                case 124: goto L_0x00e8;
                case 125: goto L_0x0038;
                case 126: goto L_0x0045;
                case 127: goto L_0x0061;
                case 128: goto L_0x006a;
                case 129: goto L_0x0084;
                case 130: goto L_0x0096;
                default: goto L_0x001c;
            }
        L_0x001c:
            android.app.Dialog r7 = super.onCreateDialog(r4)
        L_0x0020:
            return r7
        L_0x0021:
            android.app.Dialog r7 = super.onCreateDialog(r4)
            if (r7 == 0) goto L_0x0020
            boolean r0 = r8.A1Q
            if (r0 == 0) goto L_0x0020
            r7.setCancelable(r5)
            r1 = 5
            X.4Yj r0 = new X.4Yj
            r0.<init>(r8, r1)
            r7.setOnDismissListener(r0)
            return r7
        L_0x0038:
            X.3DY r3 = r8.A0R
            X.1CF r2 = r8.A0h
            java.lang.String r1 = r8.A1D
            java.lang.String r0 = r8.A1F
            X.0FM r7 = X.C65983Uf.A06(r8, r3, r2, r1, r0)
            return r7
        L_0x0045:
            X.3DY r10 = r8.A0R
            X.0ts r11 = r8.A00
            X.1CF r12 = r8.A0h
            java.lang.String r15 = r8.A1D
            java.lang.String r1 = r8.A1F
            r0 = 24
            X.3wY r14 = new X.3wY
            r14.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r0)
            X.1Dv r7 = r8.A01
            X.17Y r9 = r8.A05
            r16 = r1
            X.0FM r7 = X.C65983Uf.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r7
        L_0x0061:
            android.app.ProgressDialog r7 = new android.app.ProgressDialog
            r7.<init>(r8)
            r0 = 2131893452(0x7f121ccc, float:1.942168E38)
            goto L_0x008c
        L_0x006a:
            r0 = 24
            X.3wY r3 = new X.3wY
            r3.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r0)
            r0 = 26
            X.3wY r2 = new X.3wY
            r2.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r0)
            r1 = 25
            X.3wY r0 = new X.3wY
            r0.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r1)
            X.0FM r7 = X.C65983Uf.A07(r8, r3, r2, r0)
            return r7
        L_0x0084:
            android.app.ProgressDialog r7 = new android.app.ProgressDialog
            r7.<init>(r8)
            r0 = 2131893473(0x7f121ce1, float:1.9421724E38)
        L_0x008c:
            X.C36391kE.A17(r7, r8, r0)
            r7.setIndeterminate(r6)
            r7.setCancelable(r5)
            return r7
        L_0x0096:
            java.lang.String r0 = "violationType"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x009d:
            r7 = 2131889044(0x7f120b94, float:1.941274E38)
            goto L_0x027c
        L_0x00a2:
            r0 = 2131893435(0x7f121cbb, float:1.9421646E38)
            java.lang.String r2 = r8.getString(r0)
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131893392(0x7f121c90, float:1.942156E38)
            java.lang.String r1 = X.C36351kA.A0w(r8, r2, r6, r1)
            r0.A0p(r1)
            r0.A0r(r5)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 22
            goto L_0x049b
        L_0x00c1:
            r0 = 2131893679(0x7f121daf, float:1.9422141E38)
            goto L_0x02f2
        L_0x00c6:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "sms"
            java.lang.String r1 = A0H(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 15
            goto L_0x049b
        L_0x00e8:
            X.3DY r9 = r8.A0R
            X.0ts r10 = r8.A00
            X.1CF r11 = r8.A0h
            java.lang.String r13 = r8.A1D
            java.lang.String r14 = r8.A1F
            r0 = 24
            X.3wY r12 = new X.3wY
            r12.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r0)
            X.0FM r7 = X.C65983Uf.A05(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x00fe:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "voice"
            java.lang.String r1 = A0H(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 14
            goto L_0x049b
        L_0x0120:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "wa_old"
            java.lang.String r1 = A0H(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 16
            goto L_0x049b
        L_0x0142:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "sms"
            java.lang.String r1 = A0I(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 33
            goto L_0x049b
        L_0x0164:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "wa_old"
            java.lang.String r1 = A0I(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 12
            goto L_0x049b
        L_0x0186:
            r0 = 2131624819(0x7f0e0373, float:1.8876828E38)
            android.view.View r3 = android.view.View.inflate(r8, r0, r13)
            X.1qm r2 = X.AnonymousClass3LW.A00(r8)
            r0 = 2131435076(0x7f0b1e44, float:1.8491984E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r3, r0)
            if (r1 == 0) goto L_0x01a0
            r0 = 2131886254(0x7f1200ae, float:1.9407082E38)
            r1.setText(r0)
        L_0x01a0:
            r2.setView(r3)
            X.0FM r7 = r2.create()
            return r7
        L_0x01a8:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131893497(0x7f121cf9, float:1.9421772E38)
            r0.A0d(r1)
            r1 = 2131893496(0x7f121cf8, float:1.942177E38)
            r0.A0c(r1)
            r0.A0r(r5)
            r2 = 2131891808(0x7f121660, float:1.9418347E38)
            r1 = 27
            goto L_0x049b
        L_0x01c2:
            r0 = 2131893650(0x7f121d92, float:1.9422083E38)
            goto L_0x02f2
        L_0x01c7:
            r0 = 18
            X.3wY r7 = new X.3wY
            r7.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8, (int) r0)
            r0 = 2131624993(0x7f0e0421, float:1.8877181E38)
            android.view.View r3 = android.view.View.inflate(r8, r0, r13)
            r0 = 2131429549(0x7f0b08ad, float:1.8480774E38)
            android.widget.TextView r4 = X.C36391kE.A0O(r3, r0)
            X.C36391kE.A1J(r4)
            r2 = 2131893662(0x7f121d9e, float:1.9422107E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r8.A0F()
            java.lang.String r0 = X.C36391kE.A0v(r8, r0, r1, r5, r2)
            android.text.SpannableStringBuilder r0 = r8.A07(r7, r0, r6)
            r4.setText(r0)
            r1 = 3
            X.4Vd r0 = new X.4Vd
            r0.<init>(r7, r8, r1)
            X.C012005e.A0V(r4, r0)
            r0 = 2131434901(0x7f0b1d95, float:1.849163E38)
            android.view.View r2 = X.C012005e.A02(r3, r0)
            r1 = 20
            X.3Yr r0 = new X.3Yr
            r0.<init>(r8, r1)
            r2.setOnClickListener(r0)
            r0 = 2131435107(0x7f0b1e63, float:1.8492047E38)
            android.view.View r2 = X.C012005e.A02(r3, r0)
            r1 = 21
            X.3Yr r0 = new X.3Yr
            r0.<init>(r8, r1)
            r2.setOnClickListener(r0)
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r0.A0j(r3)
            r0.A0r(r5)
            goto L_0x049e
        L_0x022a:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "email_otp"
            java.lang.String r1 = A0I(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 13
            goto L_0x049b
        L_0x024c:
            r0 = 2131894057(0x7f121f29, float:1.9422908E38)
            goto L_0x02f2
        L_0x0251:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r14 = r8.getResources()
            X.0ts r2 = r8.A00
            X.3LA r1 = r8.A16
            X.0wo r15 = r8.A07
            java.lang.String r18 = "email_otp"
            r16 = r2
            r17 = r1
            r19 = r13
            java.lang.String r1 = A0H(r14, r15, r16, r17, r18, r19)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 17
            goto L_0x049b
        L_0x0275:
            r7 = 2131894440(0x7f1220a8, float:1.9423685E38)
            goto L_0x027c
        L_0x0279:
            r7 = 2131893487(0x7f121cef, float:1.9421752E38)
        L_0x027c:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.0ts r3 = r8.A00
            long r1 = r8.A0C
            java.lang.String r1 = X.AnonymousClass3UY.A0D(r3, r1)
            java.lang.String r1 = X.C36391kE.A0v(r8, r1, r6, r5, r7)
            r0.A0p(r1)
            r0.A0r(r5)
            r3 = 2131896681(0x7f122969, float:1.942823E38)
            r2 = 8
            X.4Xw r1 = new X.4Xw
            r1.<init>(r8, r4, r2)
            r0.A0h(r1, r3)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 9
            goto L_0x031e
        L_0x02a7:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r3 = 2131893394(0x7f121c92, float:1.9421563E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r1 = X.C36341k9.A0e(r8, r2, r1, r5, r3)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 26
            goto L_0x049b
        L_0x02c1:
            X.3Gd r0 = r8.A15
            r0.A02(r5)
            X.1Ww r0 = r8.A0r
            X.C29501Ww.A02(r0, r6, r6)
            X.0wo r14 = r8.A07
            X.0yC r1 = r8.A0D
            X.1fu r11 = r8.A0U
            X.0yW r0 = r8.A0f
            X.0z5 r10 = r8.A0Q
            X.1Dv r9 = r8.A01
            X.0yb r13 = r8.A08
            X.0ts r15 = r8.A00
            X.1fs r12 = r8.A0Y
            X.225 r7 = new X.225
            r16 = r1
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 2
            X.AnonymousClass4XV.A00(r7, r8, r0)
            return r7
        L_0x02eb:
            r0 = 2131893479(0x7f121ce7, float:1.9421736E38)
            goto L_0x02f2
        L_0x02ef:
            r0 = 2131894059(0x7f121f2b, float:1.9422912E38)
        L_0x02f2:
            java.lang.String r0 = r8.getString(r0)
            android.app.ProgressDialog r7 = new android.app.ProgressDialog
            r7.<init>(r8)
            X.C36331k8.A0p(r7, r0)
            return r7
        L_0x02ff:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131893449(0x7f121cc9, float:1.9421675E38)
            r0.A0c(r1)
            r0.A0r(r5)
            r3 = 2131893399(0x7f121c97, float:1.9421573E38)
            r2 = 10
            X.4Xw r1 = new X.4Xw
            r1.<init>(r8, r4, r2)
            r0.A0h(r1, r3)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 11
        L_0x031e:
            X.4Xw r2 = new X.4Xw
            r2.<init>(r8, r4, r1)
            goto L_0x0454
        L_0x0325:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            android.content.res.Resources r1 = r8.getResources()
            X.0ts r3 = r8.A00
            X.3LA r4 = r8.A16
            java.lang.String r6 = A0K(r8)
            X.0wo r2 = r8.A07
            java.lang.String r5 = "voice"
            java.lang.String r1 = A0I(r1, r2, r3, r4, r5, r6)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 32
            goto L_0x049b
        L_0x0347:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            boolean r2 = X.C36431kI.A1U(r8)
            r1 = 2131893422(0x7f121cae, float:1.942162E38)
            if (r2 == 0) goto L_0x0357
            r1 = 2131893658(0x7f121d9a, float:1.9422099E38)
        L_0x0357:
            r0.A0c(r1)
            r0.A0r(r5)
            r2 = 2131893399(0x7f121c97, float:1.9421573E38)
            r1 = 18
            X.C39001qm.A0F(r0, r8, r1, r2)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 19
            goto L_0x044f
        L_0x036c:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131894439(0x7f1220a7, float:1.9423683E38)
            r0.A0c(r1)
            r0.A0r(r5)
            r2 = 2131893399(0x7f121c97, float:1.9421573E38)
            r1 = 23
            X.C39001qm.A0F(r0, r8, r1, r2)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 24
            goto L_0x044f
        L_0x0388:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            X.0ts r3 = r8.A00
            r2 = 2131755302(0x7f100126, float:1.914148E38)
            int r1 = A1f
            java.lang.String r1 = X.C36331k8.A0g(r3, r1, r5, r2)
            r0.A0p(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 11
            goto L_0x049b
        L_0x03a1:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131893478(0x7f121ce6, float:1.9421734E38)
            r0.A0c(r1)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 30
            goto L_0x049b
        L_0x03b2:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            boolean r1 = X.C36431kI.A1T(r8)
            if (r1 == 0) goto L_0x03e1
            r7 = 2131893490(0x7f121cf2, float:1.9421758E38)
        L_0x03bf:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            X.0ts r3 = r8.A00
            long r1 = r8.A0C
            java.lang.String r1 = X.AnonymousClass3UY.A0D(r3, r1)
            java.lang.String r1 = X.C36391kE.A0v(r8, r1, r4, r5, r7)
            r0.A0p(r1)
            r0.A0r(r5)
            r2 = 2131896681(0x7f122969, float:1.942823E38)
            r1 = 20
            X.C39001qm.A0F(r0, r8, r1, r2)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 21
            goto L_0x044f
        L_0x03e1:
            boolean r1 = X.C36431kI.A1U(r8)
            r7 = 2131893420(0x7f121cac, float:1.9421616E38)
            if (r1 == 0) goto L_0x03bf
            r7 = 2131893659(0x7f121d9b, float:1.94221E38)
            goto L_0x03bf
        L_0x03ee:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            int r4 = r8.A03
            X.0wG r1 = r8.A0a
            android.content.Context r3 = r1.A00
            X.AnonymousClass00C.A0D(r3, r6)
            r2 = 2131888820(0x7f120ab4, float:1.9412286E38)
            if (r4 == r6) goto L_0x0463
            r1 = 2
            r2 = 2131888806(0x7f120aa6, float:1.9412258E38)
            if (r4 == r1) goto L_0x0463
            r1 = 3
            r2 = 2131888814(0x7f120aae, float:1.9412274E38)
            if (r4 == r1) goto L_0x0463
            r1 = 4
            r2 = 2131888811(0x7f120aab, float:1.9412268E38)
            if (r4 == r1) goto L_0x0463
            r1 = 5
            if (r4 == r1) goto L_0x0460
            java.lang.String r1 = ""
        L_0x0417:
            r0.A0q(r1)
            int r4 = r8.A03
            X.0wG r1 = r8.A0a
            android.content.Context r3 = r1.A00
            X.AnonymousClass00C.A0D(r3, r6)
            r2 = 2131888819(0x7f120ab3, float:1.9412284E38)
            if (r4 == r6) goto L_0x045b
            r1 = 2
            r2 = 2131888805(0x7f120aa5, float:1.9412256E38)
            if (r4 == r1) goto L_0x045b
            r1 = 3
            r2 = 2131888813(0x7f120aad, float:1.9412272E38)
            if (r4 == r1) goto L_0x045b
            r1 = 4
            r2 = 2131888810(0x7f120aaa, float:1.9412266E38)
            if (r4 == r1) goto L_0x045b
            r1 = 5
            if (r4 == r1) goto L_0x0458
            java.lang.String r1 = ""
        L_0x043f:
            r0.A0p(r1)
            r2 = 2131888808(0x7f120aa8, float:1.9412262E38)
            r1 = 28
            X.C39001qm.A0F(r0, r8, r1, r2)
            r3 = 2131888809(0x7f120aa9, float:1.9412264E38)
            r1 = 25
        L_0x044f:
            X.4XP r2 = new X.4XP
            r2.<init>(r8, r1)
        L_0x0454:
            r0.A0f(r2, r3)
            goto L_0x049e
        L_0x0458:
            r2 = 2131888816(0x7f120ab0, float:1.9412278E38)
        L_0x045b:
            java.lang.String r1 = X.C36361kB.A0m(r3, r2)
            goto L_0x043f
        L_0x0460:
            r2 = 2131888817(0x7f120ab1, float:1.941228E38)
        L_0x0463:
            java.lang.String r1 = X.C36361kB.A0m(r3, r2)
            goto L_0x0417
        L_0x0468:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131893388(0x7f121c8c, float:1.9421551E38)
            r0.A0c(r1)
            r0.A0r(r5)
            r3 = 2131891808(0x7f121660, float:1.9418347E38)
            r2 = 31
            X.4XP r1 = new X.4XP
            r1.<init>(r8, r2)
            r0.A0g(r1, r3)
            goto L_0x049e
        L_0x0483:
            X.1qm r0 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131892116(0x7f121794, float:1.9418971E38)
            r0.A0d(r1)
            r1 = 2131892117(0x7f121795, float:1.9418973E38)
            r0.A0c(r1)
            r0.A0r(r5)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 29
        L_0x049b:
            X.C39001qm.A0F(r0, r8, r1, r2)
        L_0x049e:
            X.0FM r7 = r0.create()
            return r7
        L_0x04a3:
            X.0ts r2 = r8.A00
            java.lang.String r1 = r8.A1D
            java.lang.String r0 = r8.A1F
            java.lang.String r4 = X.C65983Uf.A0D(r2, r1, r0)
            X.1qm r3 = X.AnonymousClass3LW.A00(r8)
            r2 = 2131886246(0x7f1200a6, float:1.9407065E38)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r5] = r4
            android.text.Spanned r0 = X.AnonymousClass14B.A01(r8, r0, r2)
            r3.A0p(r0)
            r3.A0r(r1)
            r0 = 2131891808(0x7f121660, float:1.9418347E38)
            java.lang.String r2 = r8.getString(r0)
            r1 = 20
            X.4XO r0 = new X.4XO
            r0.<init>(r8, r1)
            r3.A0i(r0, r2)
            X.0FM r7 = r3.create()
            return r7
        L_0x04d9:
            X.0wU r15 = r8.A04
            X.3DY r9 = r8.A0R
            X.0yb r11 = r8.A08
            X.1CF r13 = r8.A0h
            X.0wD r10 = r8.A07
            X.0yE r12 = r8.A0c
            X.3UV r14 = r8.A0q
            X.0FM r7 = X.C65983Uf.A04(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onCreateDialog(int):android.app.Dialog");
    }

    public void onDestroy() {
        Log.i("VerifyPhoneNumber/ondestroy");
        A0Q();
        this.A0x.A00();
        EnterCodeViewModel enterCodeViewModel = this.A0w;
        if (enterCodeViewModel != null) {
            enterCodeViewModel.A0S();
        }
        RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A11;
        if (retryCodeCountdownTimersViewModel != null) {
            Map map = retryCodeCountdownTimersViewModel.A05;
            Iterator A0y2 = AnonymousClass000.A0y(map);
            while (A0y2.hasNext()) {
                ((CountDownTimer) C36351kA.A0u(A0y2)).cancel();
            }
            map.clear();
            retryCodeCountdownTimersViewModel.A03.clear();
            retryCodeCountdownTimersViewModel.A01.A0C(Long.MAX_VALUE);
        }
        C39711tN r0 = this.A0y;
        if (r0 != null) {
            r0.A0S();
        }
        this.A07.unregisterObserver(this.A1d);
        this.A0p.A00();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.i("VerifyPhoneNumber/intent");
        super.onNewIntent(intent);
        String A0G2 = A0G(intent);
        if (A0G2 == null) {
            int intExtra = intent.getIntExtra("com.whatsapp.verifynumber.dialog", 0);
            int i = 21;
            if (intExtra != 21) {
                i = 22;
                if (intExtra != 22) {
                    C36321k7.A1T("VerifyPhoneNumber/intent/unknown ", AnonymousClass000.A0u(), intExtra);
                    return;
                }
            }
            AnonymousClass3SJ.A01(this, i);
        } else if (this.A1J) {
            A1S(A0G2);
        } else {
            C36321k7.A1Q("VerifyPhoneNumber/intent/defer-code/", A0G2, AnonymousClass000.A0u());
            this.A1a = A0G2;
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        AnonymousClass0FM r8;
        String str;
        String str2;
        AnonymousClass3LA r3;
        C18820ts r2;
        C19970wo r1;
        Resources resources;
        String A0I2;
        AnonymousClass0FM r82;
        Resources resources2;
        C18820ts r22;
        AnonymousClass3LA r32;
        String A0K2;
        C19970wo r12;
        String str3;
        if (i == 26) {
            r82 = (AnonymousClass0FM) dialog;
            resources = getResources();
            r2 = this.A00;
            r3 = this.A16;
            str = A0K(this);
            r1 = this.A07;
            str2 = "voice";
            A0I2 = A0I(resources, r1, r2, r3, str2, str);
        } else if (i != 39) {
            if (i == 36) {
                r8 = (AnonymousClass0FM) dialog;
                resources2 = getResources();
                r22 = this.A00;
                r32 = this.A16;
                A0K2 = A0K(this);
                r12 = this.A07;
                str3 = "sms";
            } else if (i == 37) {
                r8 = (AnonymousClass0FM) dialog;
                resources2 = getResources();
                r22 = this.A00;
                r32 = this.A16;
                A0K2 = A0K(this);
                r12 = this.A07;
                str3 = "voice";
            } else {
                return;
            }
            A0I2 = A0H(resources2, r12, r22, r32, str3, A0K2);
        } else {
            r82 = (AnonymousClass0FM) dialog;
            resources = getResources();
            r2 = this.A00;
            r3 = this.A16;
            str = A0K(this);
            r1 = this.A07;
            str2 = "sms";
            A0I2 = A0I(resources, r1, r2, r3, str2, str);
        }
        AnonymousClass0YZ r0 = r8.A00;
        r0.A0R = A0I2;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(A0I2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02eb, code lost:
        if (r5.contains("com.whatsapp.registration.VerifyPhoneNumber.is_eu_smb") == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (X.C36431kI.A1S(r2) != false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r18 = this;
            r2 = r18
            super.onResume()
            X.3Kl r0 = r2.A0o
            r0.A00()
            java.lang.String r0 = r2.A1D
            if (r0 == 0) goto L_0x0335
            java.lang.String r0 = r2.A1F
            if (r0 == 0) goto L_0x0335
            X.12U r0 = r2.A0A
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0055
            boolean r0 = X.C36441kJ.A1K(r2)
            if (r0 != 0) goto L_0x0055
            android.content.SharedPreferences r3 = X.C36331k8.A06(r2)
            java.lang.String r1 = "pref_autoconf_verification_status"
            r0 = -1
            int r0 = r3.getInt(r1, r0)
            r7 = 1
            if (r0 != r7) goto L_0x0038
            X.0zN r1 = r2.A0e
            r0 = 3131(0xc3b, float:4.387E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0044
        L_0x0038:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r2)
            java.lang.String r0 = "silent_auth_verification_status"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 == 0) goto L_0x0060
        L_0x0044:
            int r1 = X.C36441kJ.A08(r2)
            r0 = 2
            if (r1 != r0) goto L_0x0056
            r1 = 22
        L_0x004d:
            X.3wY r0 = new X.3wY
            r0.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2, (int) r1)
            r2.A1Q(r0)
        L_0x0055:
            return
        L_0x0056:
            int r1 = X.C36441kJ.A08(r2)
            r0 = 7
            if (r1 != r0) goto L_0x0060
            r1 = 23
            goto L_0x004d
        L_0x0060:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r2)
            java.lang.String r0 = "registration_sms_code_length"
            r3 = 6
            int r0 = r1.getInt(r0, r3)
            A1e = r0
            android.content.SharedPreferences r1 = X.C36331k8.A06(r2)
            java.lang.String r0 = "registration_voice_code_length"
            int r0 = r1.getInt(r0, r3)
            A1f = r0
            X.3Kv r0 = r2.A0m
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0087
            com.whatsapp.CodeInputField r1 = r2.A0M
            int r0 = A1f
            r1.A02 = r0
        L_0x0087:
            boolean r0 = X.AnonymousClass3PP.A00(r2)
            if (r0 == 0) goto L_0x026f
            java.lang.String r1 = "verify-second-sms"
        L_0x008f:
            X.1X8 r0 = r2.A0s
            r0.A02(r1)
            int r3 = X.C62433Gd.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/resume verification_state="
            X.C36321k7.A1T(r0, r1, r3)
            r1 = 4
            r0 = 21
            if (r3 == r1) goto L_0x02c5
            r0 = 8
            if (r3 == r0) goto L_0x02c3
            r1 = 12
            X.3LA r0 = r2.A16
            if (r3 == r1) goto L_0x02c9
            java.lang.String r9 = "sms"
            long r3 = r0.A02(r9)
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            X.3LA r0 = r2.A16
            java.lang.String r8 = "voice"
            long r16 = r0.A02(r8)
            long r0 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r0
            X.3LA r0 = r2.A16
            java.lang.String r11 = "wa_old"
            long r5 = r0.A02(r11)
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            X.3LA r0 = r2.A16
            java.lang.String r10 = "email_otp"
            long r0 = r0.A02(r10)
            long r12 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r12
            boolean r14 = X.C36431kI.A1T(r2)
            r12 = 0
            if (r14 == 0) goto L_0x01e6
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            r2.A0l(r5, r11)
        L_0x00f0:
            X.3LA r0 = r2.A16
            r0.A06(r11)
            boolean r0 = r2.A1J
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A1N
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A1T
            r2.A3q(r0)
        L_0x0102:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            r2.A0l(r3, r9)
            boolean r0 = r2.A1J
            if (r0 != 0) goto L_0x0116
            boolean r0 = X.C36431kI.A1S(r2)
            if (r0 == 0) goto L_0x0116
        L_0x0113:
            r2.A1U(r7)
        L_0x0116:
            r2.A0i()
            boolean r0 = X.C36431kI.A1U(r2)
            if (r0 != 0) goto L_0x016d
            boolean r0 = X.C36431kI.A1S(r2)
            if (r0 != 0) goto L_0x016d
            boolean r0 = X.C36431kI.A1T(r2)
            if (r0 != 0) goto L_0x016d
            X.12U r0 = r2.A0A
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x016d
            boolean r0 = X.C36441kJ.A1K(r2)
            if (r0 != 0) goto L_0x016d
            X.0zN r1 = r2.A0e
            r0 = 3977(0xf89, float:5.573E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0161
            X.0zN r1 = r2.A0e
            r0 = 4056(0xfd8, float:5.684E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0161
            X.0zN r1 = r2.A0e
            r0 = 4057(0xfd9, float:5.685E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0161
            X.0zN r1 = r2.A0e
            r0 = 4058(0xfda, float:5.686E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x016d
        L_0x0161:
            r0 = 27
            X.3wY r1 = new X.3wY
            r1.<init>((com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2, (int) r0)
            android.os.Handler r0 = r2.A0D
            r0.post(r1)
        L_0x016d:
            com.whatsapp.registration.entercode.EnterCodeViewModel r5 = r2.A0w
            X.1Rs r0 = r5.A04
            java.lang.Object r1 = r0.A04()
            java.lang.String r0 = "idle"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0286
            X.3LA r0 = r5.A01
            if (r0 != 0) goto L_0x0273
            java.lang.String r0 = "verifyPhoneNumberPrefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0188:
            X.3LA r0 = r2.A16
            r0.A06(r9)
            boolean r0 = X.AnonymousClass3PP.A00(r2)
            if (r0 == 0) goto L_0x01b2
            X.3PP r0 = r2.A0l
            X.3Gz r0 = r0.A01
            X.3G5 r0 = r0.A05
            long r11 = r0.A00()
            r10 = r2
            r13 = r9
            r14 = r3
            r10.A0m(r11, r13, r14)
            X.3PP r0 = r2.A0l
            X.3Gz r0 = r0.A01
            X.3G5 r0 = r0.A05
            long r13 = r0.A01()
            r12 = r2
            r15 = r8
            r12.A0m(r13, r15, r16)
        L_0x01b2:
            boolean r0 = r2.A1J
            if (r0 != 0) goto L_0x0116
            boolean r0 = r2.A1N
            if (r0 != 0) goto L_0x0116
            boolean r0 = X.C36431kI.A1S(r2)
            if (r0 != 0) goto L_0x0113
            boolean r0 = X.C36431kI.A1T(r2)
            if (r0 != 0) goto L_0x0116
            boolean r0 = X.C36431kI.A1U(r2)
            if (r0 != 0) goto L_0x0116
            X.12U r0 = r2.A0A
            int r1 = r0.A00()
            r0 = 23
            if (r1 == r0) goto L_0x0116
            boolean r0 = r2.A1R
            if (r0 == 0) goto L_0x01df
            r2.A3j()
            goto L_0x0116
        L_0x01df:
            boolean r0 = r2.A1T
            r2.A3p(r0)
            goto L_0x0116
        L_0x01e6:
            boolean r5 = X.C36431kI.A1U(r2)
            if (r5 == 0) goto L_0x0207
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x01f3
            r2.A0l(r0, r10)
        L_0x01f3:
            X.3LA r0 = r2.A16
            r0.A06(r10)
            boolean r0 = r2.A1J
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A1N
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A1T
            r2.A3o(r0)
            goto L_0x0102
        L_0x0207:
            X.12U r0 = r2.A0A
            int r0 = r0.A00()
            r5 = 23
            if (r0 != r5) goto L_0x0102
            boolean r0 = r2.A1J
            if (r0 != 0) goto L_0x0102
            boolean r0 = r2.A1N
            if (r0 != 0) goto L_0x0102
            X.0v0 r1 = r2.A09
            java.lang.String r0 = "silent_auth_entered"
            r1.A1Y(r0)
            boolean r0 = X.C36431kI.A1S(r2)
            if (r0 != 0) goto L_0x0229
            X.AnonymousClass3SJ.A01(r2, r5)
        L_0x0229:
            X.3TX r6 = r2.A0z
            java.lang.String r5 = A0J(r2)
            java.lang.String r0 = "ipification_coverage_initiated"
            r1 = 0
            r6.A0A(r5, r0, r1)
            X.0wD r0 = r2.A07
            int r0 = r0.A03(r7)
            if (r0 != r7) goto L_0x024d
            X.0wG r6 = r2.A0a
            X.0zN r5 = r2.A0e
            X.0v0 r1 = r2.A09
            X.3qJ r0 = new X.3qJ
            r0.<init>(r2)
            X.C65983Uf.A0P(r6, r1, r5, r0)
            goto L_0x0102
        L_0x024d:
            if (r0 != 0) goto L_0x026a
            X.0v0 r1 = r2.A09
            java.lang.String r0 = "silent_auth_no_internet"
            r1.A1Y(r0)
            X.3TX r6 = r2.A0z
            java.lang.String r5 = A0J(r2)
            java.lang.String r1 = "ipification_coverage_failure"
            java.lang.String r0 = "cellular_not_available"
            r6.A0A(r5, r1, r0)
            int r0 = r2.A04
            A1E(r2, r0)
            goto L_0x0102
        L_0x026a:
            A0o(r1, r2)
            goto L_0x0102
        L_0x026f:
            java.lang.String r1 = "verify-sms"
            goto L_0x008f
        L_0x0273:
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time"
            long r3 = X.C36371kC.A08(r1, r0)
            java.lang.System.currentTimeMillis()
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r5.A0T(r3)
        L_0x0286:
            int r1 = r2.A3i()
            r0 = 14
            if (r1 != r0) goto L_0x02aa
            X.3PP r6 = r2.A0l
            java.lang.String r5 = r2.A1D
            X.C18740tg.A06(r5)
            java.lang.String r4 = r2.A1F
            X.C18740tg.A06(r4)
            r0 = 2
            X.4aA r3 = new X.4aA
            r3.<init>(r2, r0)
            X.3Gz r1 = r6.A01
            X.3qN r0 = new X.3qN
            r0.<init>(r6, r3)
            r1.A01(r0, r5, r4)
        L_0x02aa:
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = X.C65983Uf.A0S(r0)
            if (r0 != 0) goto L_0x0316
            com.whatsapp.CodeInputField r0 = r2.A0M
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0316
            com.whatsapp.CodeInputField r1 = r2.A0M
            r0 = 0
            r1.A0C(r0)
            goto L_0x0316
        L_0x02c3:
            r0 = 22
        L_0x02c5:
            X.AnonymousClass3SJ.A01(r2, r0)
            goto L_0x0316
        L_0x02c9:
            android.content.SharedPreferences r5 = r0.A00
            java.lang.String r4 = "com.whatsapp.registration.VerifyPhoneNumber.appeal_token"
            boolean r0 = r5.contains(r4)
            java.lang.String r6 = "com.whatsapp.registration.VerifyPhoneNumber.is_eu_smb"
            java.lang.String r9 = "com.whatsapp.registration.VerifyPhoneNumber.violation_type"
            java.lang.String r8 = "com.whatsapp.registration.VerifyPhoneNumber.violated_policy"
            r3 = 0
            if (r0 == 0) goto L_0x02ed
            boolean r0 = r5.contains(r8)
            if (r0 == 0) goto L_0x02ed
            boolean r0 = r5.contains(r9)
            if (r0 == 0) goto L_0x02ed
            boolean r1 = r5.contains(r6)
            r0 = 1
            if (r1 != 0) goto L_0x02ee
        L_0x02ed:
            r0 = 0
        L_0x02ee:
            r10 = 0
            if (r0 == 0) goto L_0x0313
            java.lang.String r11 = r5.getString(r9, r10)
            java.lang.String r12 = r5.getString(r8, r10)
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.violation_reason"
            java.lang.String r13 = r5.getString(r0, r10)
            r1 = -1
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.violation_source"
            int r15 = r5.getInt(r0, r1)
            boolean r16 = r5.getBoolean(r6, r3)
            java.lang.String r14 = r5.getString(r4, r10)
            X.3XC r10 = new X.3XC
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x0313:
            r2.A0p(r10)
        L_0x0316:
            X.1Fq r1 = r2.A0b
            java.lang.String r0 = "VerifySms1"
            r1.A03(r7, r0)
            java.lang.String r3 = r2.A1a
            if (r3 == 0) goto L_0x0332
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/resume/scheme/code "
            X.C36321k7.A1Q(r0, r3, r1)
            java.lang.String r0 = r2.A1a
            r2.A1S(r0)
            r0 = 0
            r2.A1a = r0
        L_0x0332:
            r2.A1J = r7
            return
        L_0x0335:
            java.lang.String r0 = "VerifyPhoneNumber/resume/cc or num is missing, bounce to regphone"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            A1B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("use_sms_retriever", this.A1V);
        bundle.putBoolean("has_retried_flash_call", this.A1K);
        super.onSaveInstanceState(bundle);
    }

    public VerifyPhoneNumber(int i) {
        this.A1c = false;
        C89364Wg.A00(this, 14);
    }

    public static String A0J(VerifyPhoneNumber verifyPhoneNumber) {
        if (C36441kJ.A1K(verifyPhoneNumber)) {
            return "verify_passkey";
        }
        if (C36431kI.A1U(verifyPhoneNumber)) {
            return "verify_email_otp";
        }
        if (C36431kI.A1T(verifyPhoneNumber)) {
            return "verify_wa_old";
        }
        if (verifyPhoneNumber.A0A.A00() == 23) {
            return "verify_silent_auth";
        }
        if (AnonymousClass3PP.A00(verifyPhoneNumber)) {
            return "verify_second_sms";
        }
        return "verify_sms";
    }

    public static String A0K(VerifyPhoneNumber verifyPhoneNumber) {
        int i;
        int A082;
        if (C36431kI.A1T(verifyPhoneNumber) || C36431kI.A1U(verifyPhoneNumber) || (((A082 = C36441kJ.A08(verifyPhoneNumber)) == 13 || A082 == 14) && !verifyPhoneNumber.A1L)) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
        }
        return verifyPhoneNumber.getString(i);
    }

    private void A0O() {
        String str;
        if (!C36431kI.A1S(this)) {
            boolean A1T2 = C36431kI.A1T(this);
            AnonymousClass3LA r1 = this.A16;
            if (A1T2) {
                str = "wa_old";
            } else {
                str = "sms";
            }
            long A022 = r1.A02(str);
            long currentTimeMillis = System.currentTimeMillis();
            long j = -1;
            if (A022 != -1) {
                j = A022 - currentTimeMillis;
            }
            if (A022 > currentTimeMillis) {
                this.A0r.A0C(j);
            }
        }
    }

    private void A0h() {
        boolean A1S2 = C36431kI.A1S(this);
        C19420v0 r1 = this.A09;
        if (A1S2) {
            r1.A1T("primary_successful");
        } else {
            r1.A1W("secondary_successful");
        }
    }

    private void A0m(long j, String str, long j2) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/updateRequestCodeTimerPerMethod/method=");
        A0u2.append(str);
        A0u2.append("/serverWaitTime=");
        A0u2.append(j);
        C36321k7.A1V("/remainingWaitTime=", A0u2, j2);
        if (j2 > 0) {
            A0l(j2, str);
            AnonymousClass3LA.A01(this.A16, str, j2);
            return;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A11;
            if (j < 0) {
                retryCodeCountdownTimersViewModel.A03.put(str, Long.valueOf(j));
            }
        } else if (i == 0) {
            this.A0W.setClickable(true);
            if (this.A1S) {
                this.A1B.A03(8);
            }
            this.A16.A06(str);
            if ((str.equals("sms") || str.equals("voice")) && AnonymousClass3PP.A00(this) && this.A00 == 0) {
                A3k(1);
            }
        }
    }

    public static void A0s(AnonymousClass3BM r7, VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/");
        String str2 = str;
        A0u2.append(str);
        A0u2.append("/onAccountDefenceChecksRequired status ");
        C52072oq r1 = r7.A05;
        C36321k7.A1N(r1, A0u2);
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (str.equals("flash")) {
            verifyPhoneNumber.A0h();
        }
        verifyPhoneNumber2.A0n(r7.A01, str2, C36361kB.A1a(r1, C52072oq.DEVICE_CONFIRM_OR_SECOND_OTP), r7.A02);
    }

    public static void A0t(AnonymousClass3BM r9, VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/method=");
        A0u2.append(str);
        C36321k7.A1a(A0u2, "/onRegisterEntrypoint2FARequired");
        VerifyPhoneNumber verifyPhoneNumber2 = verifyPhoneNumber;
        if (C36441kJ.A1N(str)) {
            verifyPhoneNumber.A09.A1Q("email_otp_verified");
        }
        if (str.equals("flash")) {
            verifyPhoneNumber.A0h();
        }
        A1O(verifyPhoneNumber2, r9.A09, r9.A0C, r9.A0B, r9.A03, true, true);
        verifyPhoneNumber.A1R(new C81153wY(verifyPhoneNumber, 23), str, true);
    }

    public static void A0u(AnonymousClass3BM r9, VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/method=");
        A0u2.append(str);
        C36321k7.A1a(A0u2, "/onRegisterEntrypointVerified");
        String str2 = verifyPhoneNumber.A1D;
        String str3 = verifyPhoneNumber.A1F;
        String str4 = r9.A08;
        boolean z = r9.A0F;
        boolean z2 = r9.A0E;
        boolean z3 = r9.A0D;
        A0r(r9.A04, verifyPhoneNumber, str2, str3, str4, z, z2, z3);
        if (str.equals("flash")) {
            verifyPhoneNumber.A0h();
        }
        verifyPhoneNumber.A1R(new C81153wY(verifyPhoneNumber, 22), str, false);
    }

    public static void A0v(AnonymousClass3BM r4, VerifyPhoneNumber verifyPhoneNumber, String str) {
        String str2;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36411kG.A1S("VerifyPhoneNumber/onVerifyCodeErrorMismatch/method=", str, A0u2);
        C36321k7.A1a(A0u2, r4.A0A);
        A16(verifyPhoneNumber);
        if (str.equals("sms") || C36441kJ.A1M(str) || C36441kJ.A1N(str)) {
            C65983Uf.A0Q(verifyPhoneNumber.A09, "server-send-mismatch");
            verifyPhoneNumber.A16.A05();
        }
        long j = 60000;
        String str3 = r4.A0A;
        if (str3 != null) {
            try {
                j = 1000 * Long.parseLong(str3);
                if (j <= 0) {
                    str2 = verifyPhoneNumber.getString(R.string.f12nameremoved);
                    A1M(verifyPhoneNumber, str2);
                    verifyPhoneNumber.A0w.A0T(j);
                }
            } catch (NumberFormatException e) {
                Log.w(C36381kD.A0z("VerifyPhoneNumber/onVerifyCodeErrorMismatch/fail to parse retryAfter/use default wait time ", AnonymousClass000.A0u(), 60000), e);
            }
        }
        str2 = AnonymousClass3UY.A01(verifyPhoneNumber, R.string.f12nameremoved, j);
        A1M(verifyPhoneNumber, str2);
        verifyPhoneNumber.A0w.A0T(j);
    }

    private void A0w(C66713Xa r11, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/method=");
        A0u2.append(str);
        C36321k7.A1a(A0u2, "/onCodeEntrypoint2FARequired/go to 2FA screen");
        if (C36441kJ.A1N(str)) {
            this.A09.A1Q("email_otp_verified");
        }
        A1O(this, r11.A0J, r11.A0R, r11.A0Q, r11.A04, true, true);
        A1C(this);
    }

    private void A0x(C66713Xa r10, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/method=");
        A0u2.append(str);
        C36321k7.A1a(A0u2, "/onCodeEntrypointVerified");
        this.A09.A1w(r10.A0T);
        this.A09.A1v(r10.A0S);
        A0r((AnonymousClass3XC) null, this, this.A1D, this.A1F, r10.A0G, r10.A0T, r10.A0S, false);
        A1D(this);
    }

    private void A0y(C66713Xa r26, String str) {
        String str2;
        String str3 = str;
        C36321k7.A1Q("VerifyPhoneNumber/updateRequestCodeTimers/method=", str3, AnonymousClass000.A0u());
        C66713Xa r4 = r26;
        long A012 = C65983Uf.A01(r4.A0M, -1) * 1000;
        long A013 = C65983Uf.A01(r4.A0O, -1) * 1000;
        long A014 = C65983Uf.A01(r4.A0P, -1) * 1000;
        long A015 = C65983Uf.A01(r4.A0D, -1) * 1000;
        switch (str3.hashCode()) {
            case -795576526:
                if (C36441kJ.A1M(str3)) {
                    String str4 = r4.A0P;
                    if (str4 == null) {
                        str4 = r4.A0K;
                    }
                    A014 = C65983Uf.A01(str4, -1) * 1000;
                    break;
                }
                break;
            case 114009:
                if (str3.equals("sms")) {
                    String str5 = r4.A0M;
                    if (str5 == null) {
                        str5 = r4.A0K;
                    }
                    A012 = C65983Uf.A01(str5, -1) * 1000;
                    break;
                }
                break;
            case 97513456:
                str2 = "flash";
                break;
            case 112386354:
                str2 = "voice";
                break;
            case 2120743944:
                if (C36441kJ.A1N(str3)) {
                    String str6 = r4.A0D;
                    if (str6 == null) {
                        str6 = r4.A0K;
                    }
                    A015 = C65983Uf.A01(str6, -1) * 1000;
                    break;
                }
                break;
        }
        if (str3.equals(str2)) {
            String str7 = r4.A0O;
            if (str7 == null) {
                str7 = r4.A0K;
            }
            A013 = C65983Uf.A01(str7, -1) * 1000;
            if (A012 < 0 && A013 < 0 && ((!C36431kI.A1T(this) || A014 < 0) && (!C36431kI.A1U(this) || A015 < 0))) {
                Log.i("VerifyPhoneNumber/updateRequestCodeTimers/all attempts exhausted");
                this.A0W.setClickable(false);
                C36351kA.A15(getResources(), this.A0W, R.color.f6nameremoved);
                if (this.A1S) {
                    this.A1B.A03(8);
                }
            }
            if (AnonymousClass3PP.A00(this)) {
                this.A0l.A02(A012, A013);
            }
            A0m(A012, "sms", A012);
            A0m(A013, "voice", A013);
            if (C36431kI.A1T(this)) {
                A0m(A014, "wa_old", A014);
                return;
            } else if (C36431kI.A1U(this)) {
                A0m(A015, "email_otp", A015);
                return;
            } else {
                return;
            }
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/updateRequestCodeTimers/Invalid method: ");
        throw AnonymousClass000.A0c(str3, A0u2);
    }

    private void A0z(C66713Xa r3, String str, String str2) {
        StringBuilder A0j2 = C36341k9.A0j(str);
        A0j2.append("/bad-parameter/");
        C36321k7.A1Z(A0j2, r3.A0I);
        C65983Uf.A0Q(this.A09, str2);
        if ("number".equals(r3.A0I)) {
            A1H(this, 34);
            return;
        }
        A1H(this, 24);
        if (str.equals("sms") || C36441kJ.A1M(str) || C36441kJ.A1N(str)) {
            A18(this);
        }
    }

    private void A10(C66713Xa r7, String str, String str2, int i, int i2) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/verify");
        A0u2.append(str);
        A0u2.append("/request/");
        A0u2.append(str);
        C36321k7.A1Z(A0u2, "/provider-unroutable");
        C65983Uf.A0Q(this.A09, str2);
        if (!AnonymousClass3MJ.A02(r7.A0K)) {
            A1M(this, getString(i));
            return;
        }
        try {
            long A002 = C66713Xa.A00(r7);
            A0k(A002);
            AnonymousClass3UY.A0I(this, i2, A002);
            AnonymousClass3LA.A01(this.A16, "voice", A002);
            A0l(A002, str);
        } catch (NumberFormatException e) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            AnonymousClass000.A1D("VerifyPhoneNumber/verify", str, "/request/", A0u3);
            A0u3.append(str);
            C36351kA.A1P("/unroutable/time-not-int", A0u3, e);
            A1M(this, getString(i));
        }
    }

    private void A11(C66713Xa r7, String str, String str2, String str3, int i, int i2) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/verify");
        A0u2.append(str);
        A0u2.append("/request/");
        A0u2.append(str);
        C36341k9.A1O(A0u2, "/no-routes");
        C65983Uf.A0Q(this.A09, str2);
        if (!AnonymousClass3MJ.A02(r7.A0K)) {
            A1M(this, getString(i));
            this.A0s.A03(str3);
            return;
        }
        try {
            long A002 = C66713Xa.A00(r7);
            A0k(A002);
            AnonymousClass3UY.A0I(this, i2, A002);
            AnonymousClass3LA.A01(this.A16, "voice", A002);
            A0l(A002, str);
            this.A0s.A03(str3);
        } catch (NumberFormatException e) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            AnonymousClass000.A1D("VerifyPhoneNumber/verify", str, "/request/", A0u3);
            A0u3.append(str);
            C36351kA.A1P("/no-routes/time-not-int", A0u3, e);
            A1M(this, getString(i));
        }
    }

    public static void A1I(VerifyPhoneNumber verifyPhoneNumber, int i) {
        String string = verifyPhoneNumber.getString(i);
        C36321k7.A1Q("VerifyPhoneNumber/showProgressDialog/", string, AnonymousClass000.A0u());
        ProgressDialog progressDialog = new ProgressDialog(verifyPhoneNumber);
        C36331k8.A0p(progressDialog, string);
        progressDialog.show();
        verifyPhoneNumber.A1X = progressDialog;
    }

    public static void A1L(VerifyPhoneNumber verifyPhoneNumber, String str) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/verify/");
        A0u2.append(str);
        C36321k7.A1Z(A0u2, "/registration-not-allowed-error");
        C65983Uf.A0Q(verifyPhoneNumber.A09, "not-allowed");
        verifyPhoneNumber.A0o.A01(45);
    }

    private void A1S(String str) {
        if (C36431kI.A1U(this)) {
            this.A0z.A08(A0J(this), "click_email_otp_deep_link");
            this.A0z.A04(A0J(this));
        }
        if (C36351kA.A1W(this.A0w.A02)) {
            Log.i("VerifyPhoneNumber/verificationlink/voice/code-entry-blocked-retry-later");
            this.A16.A08(str, this.A1D, this.A1F);
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/verificationlink/voice/state ");
        C36321k7.A1Y(A0u2, C62433Gd.A04);
        if (this.A0m.A03()) {
            C63643Kv r1 = this.A0m;
            if (str == null || str.length() == 0) {
                r1.A01();
                return;
            }
            List list = r1.A0A;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((TextView) list.get(i)).setText(String.valueOf(str.charAt(i)));
            }
            return;
        }
        this.A0M.setText(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        A1H(r2, r1);
        A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1T(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.C36341k9.A0j(r3)
            java.lang.String r0 = "/next-method"
            X.C36341k9.A1O(r1, r0)
            X.0v0 r0 = r2.A09
            X.C65983Uf.A0Q(r0, r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case 114009: goto L_0x001e;
                case 112386354: goto L_0x0027;
                case 2120743944: goto L_0x0030;
                default: goto L_0x0015;
            }
        L_0x0015:
            r1 = 38
        L_0x0017:
            A1H(r2, r1)
            r2.A0O()
            return
        L_0x001e:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            r1 = 36
            goto L_0x0036
        L_0x0027:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            r1 = 37
            goto L_0x0036
        L_0x0030:
            boolean r0 = X.C36441kJ.A1N(r3)
            r1 = 49
        L_0x0036:
            if (r0 != 0) goto L_0x0017
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1T(java.lang.String, java.lang.String):void");
    }

    public void BKE() {
        if (C36431kI.A1S(this)) {
            Log.i("VerifyPhoneNumber/hide-automatically-verifying-progress-dialog");
            A1A(this);
            return;
        }
        Log.i("VerifyPhoneNumber/hide-verifying-progress-dialog");
        AnonymousClass3SJ.A00(this, 23);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 700) {
            if (i2 == -1) {
                Log.i("VerifyPhoneNumber/activity-result/permission-accepted/request-flash");
                A0M();
                return;
            }
            Log.i("VerifyPhoneNumber/activity-result/permission-declined/request-voice");
            AnonymousClass2d2 A082 = C65983Uf.A08(this.A09, this.A0e);
            if (this.A09.A2D()) {
                A082.A02 = true;
            }
            A082.A00 = false;
            A13(A082, true);
        } else if (i == 701) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("VerifyPhoneNumber/activity-result/request-sms-permissions/");
            if (i2 == -1) {
                str = "granted";
            } else {
                str = "denied";
            }
            C36321k7.A1a(A0u2, str);
            this.A1V = false;
            A1K(this, this.A11.A0S("sms"), this.A11.A0S("voice"));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        if (!this.A1H && AnonymousClass3PP.A00(this)) {
            menu.add(0, 2, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                this.A0r.A09();
                this.A15.A01();
                intent = AnonymousClass190.A02(this);
            } else if (itemId == 2) {
                this.A0r.A09();
                this.A15.A01();
                intent = AnonymousClass190.A0C(this);
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                if (this.A02 == 2) {
                    this.A0z.A08(A0J(this), "back");
                }
                finish();
                return true;
            }
            startActivity(intent);
            AnonymousClass0XN.A00(this);
            return true;
        } else if (C36431kI.A1T(this)) {
            this.A0Y.A01(this, "verify-number-about-changing-phones");
            return true;
        } else {
            C62623Gw r3 = this.A0p;
            AnonymousClass1X8 r2 = this.A0s;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("verify-sms +");
            A0u2.append(this.A1D);
            r3.A01(this, r2, AnonymousClass000.A0q(this.A1F, A0u2));
            return true;
        }
    }

    public void onPause() {
        String code;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("VerifyPhoneNumber/pause ");
        C36321k7.A1Y(A0u2, C62433Gd.A04);
        super.onPause();
        C63543Kl r1 = this.A0o;
        r1.A00 = true;
        C65983Uf.A0Q(r1.A03, C65983Uf.A00);
        if (this.A0m.A03()) {
            code = this.A0m.A00();
        } else {
            code = this.A0M.getCode();
        }
        if (!TextUtils.isEmpty(code)) {
            this.A09.A1U(code);
        }
        if (A3i() == 14) {
            C62653Gz r12 = this.A0l.A01;
            Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
            r12.A04.A01();
        }
        this.A0D.removeCallbacksAndMessages((Object) null);
    }

    public void onStop() {
        super.onStop();
        A17(this);
    }

    public VerifyPhoneNumber() {
        this(0);
        this.A00 = 0;
        this.A1W = -2;
        this.A1M = false;
        this.A0C = 0;
        this.A0B = -1;
        this.A1d = new AnonymousClass4YH(this, 4);
    }
}
