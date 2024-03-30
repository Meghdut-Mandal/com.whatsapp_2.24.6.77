package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass001;
import X.AnonymousClass01L;
import X.AnonymousClass02E;
import X.AnonymousClass65O;
import X.AnonymousClass6WQ;
import X.C112075dJ;
import X.C118175nS;
import X.C124765yl;
import X.C1501674f;
import X.C90514aH;
import X.C90644aU;
import X.C90884b2;
import X.C91484c5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.whatsapp.R;
import java.lang.Thread;
import java.util.Locale;

public class GetCredential extends AnonymousClass01L {
    public static GetCredential A0L;
    public int A00;
    public int A01 = 0;
    public Bitmap A02 = null;
    public TransitionDrawable A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public AnonymousClass02E A07;
    public Boolean A08 = false;
    public Boolean A09 = false;
    public String A0A = null;
    public String A0B = "";
    public C90884b2 A0C;
    public AnonymousClass65O A0D;
    public AnonymousClass6WQ A0E;
    public s A0F = null;
    public boolean A0G = false;
    public ImageView A0H;
    public Thread.UncaughtExceptionHandler A0I = null;
    public C91484c5 A0J;
    public final Context A0K = this;

    public GetCredential() {
        A0L = this;
    }

    public static void A07(GetCredential getCredential, boolean z) {
        float f = 0.0f;
        ImageView imageView = getCredential.A06;
        if (z) {
            A01(imageView, 0.0f, 180.0f);
        } else {
            A01(imageView, 180.0f, 0.0f);
        }
        int height = getCredential.A04.getHeight();
        if (height == 0) {
            height = getCredential.A00;
        }
        getCredential.A04.clearAnimation();
        ViewPropertyAnimator animate = getCredential.A04.animate();
        float f2 = 0.0f;
        if (!z) {
            f2 = ((float) height) * -1.0f;
        }
        ViewPropertyAnimator y = animate.y(f2);
        if (z) {
            f = 1.0f;
        }
        y.alpha(f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new C90644aU(getCredential, height, z));
    }

    public void onDestroy() {
        super.onDestroy();
        if (A0L != null) {
            A0L = null;
        }
        Thread.currentThread().setUncaughtExceptionHandler(this.A0I);
    }

    public static void A01(View view, float f, float f2) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        C90514aH.A1K(rotateAnimation);
        rotateAnimation.setDuration((long) 300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public void attachBaseContext(Context context) {
        String string = new C118175nS(context).A00.getString("org.npci.upi.language.pref", "en_US");
        if (Build.VERSION.SDK_INT >= 24) {
            context = C112075dJ.A00(context, string);
        } else {
            String[] split = string.split("_");
            Locale locale = new Locale(string);
            if (split.length == 2) {
                locale = new Locale(split[0], split[1]);
            }
            Locale.setDefault(locale);
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = locale;
            configuration.setLayoutDirection(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        super.attachBaseContext(context);
    }

    public void onBackPressed() {
        if (this.A0G) {
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("error", "USER_ABORTED");
            C124765yl.A0B.send(0, A072);
            super.onBackPressed();
            return;
        }
        this.A0G = true;
        Toast.makeText(this, getString(R.string.f12nameremoved), 0).show();
        new Handler().postDelayed(new C1501674f(this, 23), 2000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L15", "l15.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L09", "l09.message", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x041d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x041e, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L11", "l11.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0428, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0429, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L10", "l10.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x043d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L09", "l09.message", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0446, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0447, code lost:
        r2.getMessage();
        r3 = new X.AnonymousClass5VL(r13, "L05", "l05.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x045e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0465, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0466, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0467, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0468, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046e, code lost:
        r3 = new X.AnonymousClass5VL(r13, "L14", "l14.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0abe, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append(r4.a);
        r3 = X.AnonymousClass000.A0q("", r1);
        r1 = r4.b;
        r2 = X.AnonymousClass001.A07();
        r2.putString("errorCode", r3);
        r2.putString("error", r1);
        X.C124765yl.A0B.send(0, r2);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0ae7, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0366 */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0465 A[Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478, 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }, ExcHandler: 5VL (r0v292 'e' X.5VL A[CUSTOM_DECLARE, Catch:{ Exception -> 0x0af6 }]), Splitter:B:8:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[ExcHandler: 5VL | Exception (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r13 = r21
            android.view.Window r1 = r13.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            r0 = r22
            super.onCreate(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.getUncaughtExceptionHandler()
            r13.A0I = r0
            X.75N r0 = new X.75N
            r0.<init>()
            r1.setUncaughtExceptionHandler(r0)
            android.os.Bundle r0 = X.C36371kC.A0H(r13)
            X.65O r3 = new X.65O
            r3.<init>(r0)
            r13.A0D = r3
            X.5yl r1 = new X.5yl     // Catch:{ Exception -> 0x0af6 }
            r1.<init>()     // Catch:{ Exception -> 0x0af6 }
            r3.A0F = r1     // Catch:{ Exception -> 0x0af6 }
            X.684 r0 = new X.684     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r0.<init>(r13, r1)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.A0E = r0     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            X.5yl r2 = r3.A0F     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            android.os.Bundle r3 = r3.A01     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            java.lang.String r18 = "l09.message"
            java.lang.String r4 = "L09"
            java.lang.String r6 = "l07.message"
            java.lang.String r5 = "L07"
            java.lang.String r8 = "txnId"
            java.lang.String r0 = "credType"
            X.66Z r1 = new X.66Z     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r1.<init>(r13)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r2.A0A = r1     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            org.json.JSONArray r7 = X.C90524aI.A0u()     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            r2.A06 = r7     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "setMpin"
            r7.put(r1)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r11 = "pay"
            r1.put(r11)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r10 = "collect"
            r1.put(r10)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r12 = "reqBalChk"
            r1.put(r12)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r7 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "reqBalEnq"
            r7.put(r1)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r7 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "changeMpin"
            r7.put(r1)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r7 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "mandate"
            r7.put(r1)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r7 = r2.A06     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "binding"
            r7.put(r1)     // Catch:{ Exception -> 0x0467, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "keyCode"
            java.lang.String r1 = r3.getString(r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
            r2.A01 = r1     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x0454
            boolean r1 = r1.isEmpty()     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
            if (r1 != 0) goto L_0x0454
            java.lang.String r1 = "keyXmlPayload"
            java.lang.String r5 = r3.getString(r1)     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            if (r5 == 0) goto L_0x0433
            boolean r1 = r5.isEmpty()     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            if (r1 != 0) goto L_0x0433
            X.67U r1 = new X.67U     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            r1.<init>(r5)     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            r2.A00 = r1     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "controls"
            java.lang.String r5 = r3.getString(r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            if (r5 == 0) goto L_0x00e2
            boolean r1 = r5.isEmpty()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = "AADHAAR"
            boolean r1 = r5.contains(r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = "ATMPIN"
            boolean r1 = r5.contains(r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x00db
            java.lang.String r2 = "L32"
            java.lang.String r1 = "l32.message"
            X.5VL r0 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            r0.<init>(r13, r2, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            throw r0     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
        L_0x00db:
            org.json.JSONObject r1 = X.C36441kJ.A1C(r5)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            r2.A07 = r1     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            goto L_0x0113
        L_0x00e2:
            org.json.JSONObject r7 = X.C36441kJ.A1B()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = "type"
            java.lang.String r1 = "PIN"
            r7.put(r5, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = "subtype"
            java.lang.String r1 = "MPIN"
            r7.put(r5, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = "dType"
            java.lang.String r1 = "NUM|ALPH"
            r7.put(r5, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = "dLength"
            r1 = 6
            r7.put(r5, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r6 = X.C90524aI.A0u()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            r6.put(r7)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            r2.A07 = r5     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = "CredAllowed"
            r5.put(r1, r6)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0428, 5VL | Exception -> 0x0478 }
        L_0x0113:
            java.lang.String r1 = "configuration"
            java.lang.String r5 = r3.getString(r1)     // Catch:{ Exception -> 0x041d, 5VL | Exception -> 0x0478 }
            if (r5 == 0) goto L_0x0127
            boolean r1 = r5.isEmpty()     // Catch:{ Exception -> 0x041d, 5VL | Exception -> 0x0478 }
            if (r1 != 0) goto L_0x0127
            org.json.JSONObject r1 = X.C36441kJ.A1C(r5)     // Catch:{ Exception -> 0x041d, 5VL | Exception -> 0x0478 }
            r2.A08 = r1     // Catch:{ Exception -> 0x041d, 5VL | Exception -> 0x0478 }
        L_0x0127:
            java.lang.String r1 = "salt"
            java.lang.String r16 = r3.getString(r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r6 = X.C36441kJ.A1C(r16)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r16 == 0) goto L_0x03fe
            boolean r1 = r16.isEmpty()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r1 != 0) goto L_0x03fe
            boolean r1 = r6.has(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r14 = "l24.message"
            java.lang.String r9 = "L24"
            if (r1 == 0) goto L_0x03f8
            java.lang.Object r1 = r6.get(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r7 = r1 instanceof org.json.JSONArray     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = "l27.message"
            java.lang.String r1 = "L27"
            if (r7 == 0) goto L_0x03f2
            org.json.JSONArray r0 = r6.getJSONArray(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.A05 = r0     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r15 = 1
            if (r0 < r15) goto L_0x03ec
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r7 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r0 = 2
            if (r7 > r0) goto L_0x03e6
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r17 = r15
            r7 = 0
            r14 = 0
        L_0x016d:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r14 >= r0) goto L_0x019c
            r9 = 0
        L_0x0176:
            org.json.JSONArray r0 = r2.A06     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r9 >= r0) goto L_0x0199
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r15 = r0.getString(r14)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r0 = r2.A06     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r15.equals(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x0197
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r7)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r9 = r9 + 1
            goto L_0x0176
        L_0x0197:
            r15 = r17
        L_0x0199:
            int r14 = r14 + 1
            goto L_0x016d
        L_0x019c:
            boolean r0 = r15.booleanValue()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x0408
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r7)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r15 = r14
            r9 = 0
        L_0x01a8:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r9 >= r0) goto L_0x01c1
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r0.equals(r12)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x01be
            r14 = r17
        L_0x01be:
            int r9 = r9 + 1
            goto L_0x01a8
        L_0x01c1:
            boolean r0 = r14.booleanValue()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x01fe
            r9 = 0
        L_0x01c8:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r9 >= r0) goto L_0x01ed
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r0.equals(r11)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x01e8
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r0.equals(r10)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x01ea
        L_0x01e8:
            r15 = r17
        L_0x01ea:
            int r9 = r9 + 1
            goto L_0x01c8
        L_0x01ed:
            boolean r0 = r15.booleanValue()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x01fe
            java.lang.String r1 = "L25"
            java.lang.String r0 = "l25.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x01fe:
            boolean r0 = r6.has(r8)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x03dc
            java.lang.Object r0 = r6.get(r8)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r0 instanceof org.json.JSONArray     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x03d6
            org.json.JSONArray r0 = r6.getJSONArray(r8)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.A04 = r0     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r1 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r1 != r0) goto L_0x03cc
            org.json.JSONArray r0 = r2.A04     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r1 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r0 = 1
            if (r1 <= r0) goto L_0x024e
            org.json.JSONArray r0 = r2.A04     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            int r1 = r0.length()     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r0 = 2
            if (r1 > r0) goto L_0x024e
            org.json.JSONArray r0 = r2.A04     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r5 = r0.getString(r7)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r1 = r2.A04     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            boolean r0 = r5.equals(r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            if (r0 == 0) goto L_0x024e
            java.lang.String r1 = "L29"
            java.lang.String r0 = "l29.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x024e:
            org.json.JSONObject r0 = X.C36441kJ.A1C(r16)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.A09 = r0     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "trust"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x03b0
            boolean r0 = r1.isEmpty()     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x03b0
            org.json.JSONObject r17 = X.C36441kJ.A1C(r1)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
        L_0x0266:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            int r0 = r0.length()     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            if (r7 >= r0) goto L_0x0376
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r14 = r0.getString(r7)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r0 = r2.A04     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r12 = r0.getString(r7)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r1 = r0.getString(r7)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            r0 = r17
            java.lang.String r16 = r0.getString(r1)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "txnAmount"
            java.lang.String r15 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "appId"
            java.lang.String r11 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "deviceId"
            java.lang.String r10 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r9 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "payerAddr"
            java.lang.String r8 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "payeeAddr"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            org.json.JSONObject r5 = r2.A09     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            java.lang.String r0 = "random"
            java.lang.String r5 = r5.optString(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            r0 = 150(0x96, float:2.1E-43)
            java.lang.StringBuilder r6 = X.C90524aI.A0h(r0)     // Catch:{ Exception -> 0x03ba }
            java.lang.String r0 = "|"
            if (r14 == 0) goto L_0x02cb
            X.C90464aC.A1P(r6, r14)     // Catch:{ Exception -> 0x03ba }
        L_0x02cb:
            if (r12 == 0) goto L_0x02d0
            X.C90464aC.A1P(r6, r12)     // Catch:{ Exception -> 0x03ba }
        L_0x02d0:
            if (r11 == 0) goto L_0x02d5
            X.C90464aC.A1P(r6, r11)     // Catch:{ Exception -> 0x03ba }
        L_0x02d5:
            if (r9 == 0) goto L_0x02da
            X.C90464aC.A1P(r6, r9)     // Catch:{ Exception -> 0x03ba }
        L_0x02da:
            if (r10 == 0) goto L_0x02df
            X.C90464aC.A1P(r6, r10)     // Catch:{ Exception -> 0x03ba }
        L_0x02df:
            if (r8 == 0) goto L_0x02e4
            X.C90464aC.A1P(r6, r8)     // Catch:{ Exception -> 0x03ba }
        L_0x02e4:
            if (r1 == 0) goto L_0x02e9
            X.C90464aC.A1P(r6, r1)     // Catch:{ Exception -> 0x03ba }
        L_0x02e9:
            if (r15 == 0) goto L_0x02ee
            X.C90464aC.A1P(r6, r15)     // Catch:{ Exception -> 0x03ba }
        L_0x02ee:
            int r1 = r6.lastIndexOf(r0)     // Catch:{ Exception -> 0x03ba }
            r0 = -1
            if (r1 == r0) goto L_0x0300
            int r0 = r6.length()     // Catch:{ Exception -> 0x03ba }
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x0300
            r6.deleteCharAt(r1)     // Catch:{ Exception -> 0x03ba }
        L_0x0300:
            X.66Z r0 = r2.A0A     // Catch:{ Exception -> 0x03ba }
            java.util.ArrayList r0 = r0.A00()     // Catch:{ Exception -> 0x03ba }
            java.lang.Object r0 = X.C36441kJ.A12(r0)     // Catch:{ Exception -> 0x03ba }
            X.6Ko r0 = (X.C130306Ko) r0     // Catch:{ Exception -> 0x03ba }
            java.lang.String r11 = r0.A01     // Catch:{ Exception -> 0x03ba }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x03ba }
            X.6Ua r0 = new X.6Ua     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            r9 = 2
            byte[] r0 = r5.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            byte[] r10 = X.AnonymousClass6HS.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            byte[] r0 = X.C132506Ua.A00(r1, r5)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            java.lang.String r8 = X.AnonymousClass6HS.A00(r0, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            byte[] r0 = r16.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            byte[] r6 = X.AnonymousClass6HS.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            int r0 = r11.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            int r5 = r0 / 2
            byte[] r1 = new byte[r5]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            r0 = 0
        L_0x0339:
            if (r0 >= r5) goto L_0x0341
            X.C90504aG.A1L(r11, r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            int r0 = r0 + 1
            goto L_0x0339
        L_0x0341:
            javax.crypto.spec.SecretKeySpec r1 = X.C90494aF.A0m(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            javax.crypto.Cipher r0 = X.C90514aH.A19()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            X.C90504aG.A1P(r1, r0, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            byte[] r0 = r0.doFinal(r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            java.lang.String r0 = X.AnonymousClass6HS.A00(r0, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            if (r0 == 0) goto L_0x035e
            int r7 = r7 + 1
            goto L_0x0266
        L_0x035e:
            java.lang.Integer r1 = X.C023109s.A0W     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            X.5VJ r0 = new X.5VJ     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
            throw r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x036e, Exception -> 0x0366 }
        L_0x0366:
            java.lang.Integer r0 = X.C023109s.A0V     // Catch:{ Exception -> 0x03ba }
            X.5VJ r1 = new X.5VJ     // Catch:{ Exception -> 0x03ba }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03ba }
            goto L_0x0375
        L_0x036e:
            java.lang.Integer r0 = X.C023109s.A0V     // Catch:{ Exception -> 0x03ba }
            X.5VJ r1 = new X.5VJ     // Catch:{ Exception -> 0x03ba }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03ba }
        L_0x0375:
            throw r1     // Catch:{ Exception -> 0x03ba }
        L_0x0376:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ Exception -> 0x046e, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x038b
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x046e, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x038b
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x046e, 5VL | Exception -> 0x0478 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x046e, 5VL | Exception -> 0x0478 }
            r2.A03 = r0     // Catch:{ Exception -> 0x046e, 5VL | Exception -> 0x0478 }
        L_0x038b:
            java.lang.String r0 = "languagePref"
            java.lang.String r1 = r3.getString(r0)     // Catch:{ Exception -> 0x03a5, 5VL | Exception -> 0x0478 }
            if (r1 == 0) goto L_0x03a2
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x03a5, 5VL | Exception -> 0x0478 }
            if (r0 != 0) goto L_0x03a2
        L_0x0399:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ Exception -> 0x03a5, 5VL | Exception -> 0x0478 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x03a5, 5VL | Exception -> 0x0478 }
            r2.A02 = r0     // Catch:{ Exception -> 0x03a5, 5VL | Exception -> 0x0478 }
            goto L_0x0478
        L_0x03a2:
            java.lang.String r1 = "en_US"
            goto L_0x0399
        L_0x03a5:
            java.lang.String r1 = "L15"
            java.lang.String r0 = "l15.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x03b0:
            java.lang.String r2 = "L17"
            java.lang.String r0 = "l17.message"
            X.5VL r1 = new X.5VL     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            r1.<init>(r13, r2, r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            goto L_0x03c1
        L_0x03ba:
            java.lang.Integer r0 = X.C023109s.A0W     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            X.5VJ r1 = new X.5VJ     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
            r1.<init>(r0)     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
        L_0x03c1:
            throw r1     // Catch:{ 5VL -> 0x0465, 5VL -> 0x0465, Exception -> 0x03c2, 5VL | Exception -> 0x0478 }
        L_0x03c2:
            r1 = move-exception
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r0 = r18
            r3.<init>(r13, r4, r0, r1)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x03cc:
            java.lang.String r1 = "L28"
            java.lang.String r0 = "l28.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03d6:
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r5)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03dc:
            java.lang.String r1 = "L31"
            java.lang.String r0 = "l31.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03e6:
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r9, r14)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03ec:
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r9, r14)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03f2:
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r5)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03f8:
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r9, r14)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x03fe:
            java.lang.String r1 = "L12"
            java.lang.String r0 = "l12.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            goto L_0x0411
        L_0x0408:
            java.lang.String r1 = "L30"
            java.lang.String r0 = "l30.message"
            X.5VL r2 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
            r2.<init>(r13, r1, r0)     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
        L_0x0411:
            throw r2     // Catch:{ 5VL -> 0x0465, Exception -> 0x0412, 5VL | Exception -> 0x0478 }
        L_0x0412:
            r2 = move-exception
            java.lang.String r1 = "L13"
            java.lang.String r0 = "l13.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x041d:
            r2 = move-exception
            java.lang.String r1 = "L11"
            java.lang.String r0 = "l11.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x0428:
            r2 = move-exception
            java.lang.String r1 = "L10"
            java.lang.String r0 = "l10.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x0433:
            java.lang.String r2 = "L08"
            java.lang.String r1 = "l08.message"
            X.5VL r0 = new X.5VL     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            r0.<init>(r13, r2, r1)     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
            throw r0     // Catch:{ 5VJ -> 0x0446, 5VL -> 0x0465, Exception -> 0x043d, 5VL | Exception -> 0x0478 }
        L_0x043d:
            r1 = move-exception
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r0 = r18
            r3.<init>(r13, r4, r0, r1)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x0446:
            r2 = move-exception
            r2.getMessage()     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            java.lang.String r1 = "L05"
            java.lang.String r0 = "l05.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0, r2)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x0454:
            java.lang.String r2 = "L06"
            java.lang.String r1 = "l06.message"
            X.5VL r0 = new X.5VL     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
            r0.<init>(r13, r2, r1)     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
            throw r0     // Catch:{ 5VL -> 0x0465, Exception -> 0x045e, 5VL | Exception -> 0x0478 }
        L_0x045e:
            r0 = move-exception
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r5, r6, r0)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x0465:
            r0 = move-exception
            throw r0     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
        L_0x0467:
            r0 = move-exception
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r5, r6, r0)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            goto L_0x0477
        L_0x046e:
            java.lang.String r1 = "L14"
            java.lang.String r0 = "l14.message"
            X.5VL r3 = new X.5VL     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
            r3.<init>(r13, r1, r0)     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
        L_0x0477:
            throw r3     // Catch:{ 5VL | Exception -> 0x0478, 5VJ -> 0x0abe }
        L_0x0478:
            java.lang.String r3 = "verifiedMerchant"
            java.lang.String r1 = "bankImage"
            java.lang.String r2 = "bankImageUrl"
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x0509 }
            r4 = 1
            if (r0 == 0) goto L_0x0499
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0509 }
            r13.A0B = r0     // Catch:{ Exception -> 0x0509 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0509 }
            r13.A08 = r0     // Catch:{ Exception -> 0x0509 }
        L_0x0499:
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x0509 }
            if (r0 == 0) goto L_0x04b7
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0509 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x0509 }
            int r0 = r1.length     // Catch:{ Exception -> 0x0509 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ Exception -> 0x0509 }
            r13.A02 = r0     // Catch:{ Exception -> 0x0509 }
        L_0x04b7:
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            boolean r0 = r0.has(r3)     // Catch:{ Exception -> 0x0509 }
            if (r0 == 0) goto L_0x04cf
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x0509 }
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x0509 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0509 }
            r13.A09 = r0     // Catch:{ Exception -> 0x0509 }
        L_0x04cf:
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x0509 }
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x0509 }
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ Exception -> 0x0509 }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ Exception -> 0x0509 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0509 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0509 }
            r0 = 2
            if (r1 != r0) goto L_0x04ec
            r0 = 0
            r1 = r2[r0]     // Catch:{ Exception -> 0x0509 }
            r0 = r2[r4]     // Catch:{ Exception -> 0x0509 }
            java.util.Locale r3 = new java.util.Locale     // Catch:{ Exception -> 0x0509 }
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x0509 }
        L_0x04ec:
            java.util.Locale.setDefault(r3)     // Catch:{ Exception -> 0x0509 }
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ Exception -> 0x0509 }
            r2.<init>()     // Catch:{ Exception -> 0x0509 }
            r2.locale = r3     // Catch:{ Exception -> 0x0509 }
            android.content.Context r0 = r13.getBaseContext()     // Catch:{ Exception -> 0x0509 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x0509 }
            android.content.Context r0 = r13.getBaseContext()     // Catch:{ Exception -> 0x0509 }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)     // Catch:{ Exception -> 0x0509 }
            r1.updateConfiguration(r2, r0)     // Catch:{ Exception -> 0x0509 }
        L_0x0509:
            X.65O r0 = r13.A0D
            org.json.JSONArray r0 = r0.A07
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SIGNATURE"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0578
            java.lang.Boolean r6 = X.C36381kD.A0j()
            android.content.Context r5 = r13.A0K     // Catch:{ Exception -> 0x054a }
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x054a }
            org.json.JSONObject r4 = r0.A0C     // Catch:{ Exception -> 0x054a }
            org.json.JSONArray r3 = r0.A07     // Catch:{ Exception -> 0x054a }
            org.json.JSONObject r0 = r0.A0B     // Catch:{ Exception -> 0x054a }
            X.6WQ r1 = new X.6WQ     // Catch:{ Exception -> 0x054a }
            r1.<init>(r5, r3, r4, r0)     // Catch:{ Exception -> 0x054a }
            r13.A0E = r1     // Catch:{ Exception -> 0x054a }
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x054a }
            java.lang.Boolean r0 = r0.A02     // Catch:{ Exception -> 0x054a }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x054a }
            if (r0 == 0) goto L_0x0543
            java.lang.Integer r0 = X.C113775g6.A01     // Catch:{ Exception -> 0x054a }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x054a }
        L_0x053e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x054a }
            goto L_0x0558
        L_0x0543:
            java.lang.Integer r0 = X.C113775g6.A00     // Catch:{ Exception -> 0x054a }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x054a }
            goto L_0x053e
        L_0x054a:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L_0x055f
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "SYNC_REQUIRED"
        L_0x0555:
            r1.A2E(r0)
        L_0x0558:
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L_0x0578
            return
        L_0x055f:
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x056a
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "INVALID_REQUEST"
            goto L_0x0555
        L_0x056a:
            boolean r0 = r1 instanceof java.security.cert.CertificateException
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            if (r0 == 0) goto L_0x0575
            java.lang.String r0 = "LITE_KEYS_ROTATION_NEEDED"
            goto L_0x0555
        L_0x0575:
            java.lang.String r0 = "TECHNICAL_ERROR"
            goto L_0x0555
        L_0x0578:
            X.65O r1 = r13.A0D
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x06a7
            java.lang.String r6 = "."
            org.json.JSONArray r0 = r1.A07     // Catch:{ Exception -> 0x069d }
            r5 = 0
            org.json.JSONObject r1 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "subtype"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x069d }
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x069d }
            org.json.JSONObject r8 = r0.A0B     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x069d }
            if (r0 == 0) goto L_0x0691
            r7 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x069d }
            if (r8 == 0) goto L_0x05b0
            java.lang.String r1 = "enableUserAuth"
            java.lang.String r0 = "true"
            java.lang.String r0 = r8.optString(r1, r0)     // Catch:{ Exception -> 0x069d }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x069d }
        L_0x05b0:
            boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x069d }
            if (r0 == 0) goto L_0x05d2
            android.content.Context r1 = r13.A0K     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "keyguard"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x069d }
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch:{ Exception -> 0x069d }
            boolean r0 = r1.isKeyguardSecure()     // Catch:{ Exception -> 0x069d }
            if (r0 != 0) goto L_0x05cf
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity> r0 = org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity.class
            android.content.Intent r0 = X.C36441kJ.A0H(r13, r0)     // Catch:{ Exception -> 0x069d }
            r13.startActivity(r0)     // Catch:{ Exception -> 0x069d }
        L_0x05cf:
            r1.isKeyguardSecure()     // Catch:{ Exception -> 0x069d }
        L_0x05d2:
            android.content.Context r3 = r13.A0K     // Catch:{ Exception -> 0x069d }
            X.65O r0 = r13.A0D     // Catch:{ Exception -> 0x069d }
            org.json.JSONObject r1 = r0.A0C     // Catch:{ Exception -> 0x069d }
            org.json.JSONArray r0 = r0.A07     // Catch:{ Exception -> 0x069d }
            X.6WQ r4 = new X.6WQ     // Catch:{ Exception -> 0x069d }
            r4.<init>(r3, r0, r1, r8)     // Catch:{ Exception -> 0x069d }
            r13.A0E = r4     // Catch:{ Exception -> 0x069d }
            java.lang.String r3 = "ClientRiskRules"
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x069d }
            org.json.JSONObject r1 = r4.A0A     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "deviceId"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x069d }
            r8.append(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x069d }
            r8.append(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "accountRef"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r8)     // Catch:{ Exception -> 0x069d }
            byte[] r0 = X.C133166Xa.A03(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r1 = X.C36441kJ.A13(r0)     // Catch:{ Exception -> 0x069d }
            r4.A09 = r1     // Catch:{ Exception -> 0x069d }
            android.content.Context r0 = r4.A04     // Catch:{ Exception -> 0x069d }
            X.6PJ r0 = X.AnonymousClass6PJ.A00(r0, r1)     // Catch:{ Exception -> 0x069d }
            r4.A0D = r0     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = r0.A01(r3)     // Catch:{ JSONException -> 0x0622 }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0622 }
            r4.A0B = r0     // Catch:{ JSONException -> 0x0622 }
            goto L_0x062a
        L_0x0622:
            java.lang.String r0 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}"
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ Exception -> 0x069d }
            r4.A0B = r0     // Catch:{ Exception -> 0x069d }
        L_0x062a:
            X.6PJ r0 = r4.A0D     // Catch:{ Exception -> 0x069d }
            r0.A02()     // Catch:{ Exception -> 0x069d }
            X.6PJ r1 = r4.A0D     // Catch:{ Exception -> 0x069d }
            org.json.JSONObject r0 = r4.A0B     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x069d }
            r1.A03(r0, r3)     // Catch:{ Exception -> 0x069d }
            X.6WQ r0 = r13.A0E     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = r0.A09     // Catch:{ Exception -> 0x069d }
            java.lang.String r4 = X.C133166Xa.A00(r2, r0)     // Catch:{ Exception -> 0x069d }
            X.6WQ r8 = r13.A0E     // Catch:{ Exception -> 0x069d }
            java.lang.String r2 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r2)     // Catch:{ Exception -> 0x069d }
            r0 = 256(0x100, float:3.59E-43)
            r1.init(r0)     // Catch:{ Exception -> 0x069d }
            javax.crypto.SecretKey r0 = r1.generateKey()     // Catch:{ Exception -> 0x069d }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x069d }
            java.lang.String r3 = X.C36441kJ.A13(r0)     // Catch:{ Exception -> 0x069d }
            X.6PJ r0 = r8.A0D     // Catch:{ Exception -> 0x069d }
            r0.A03(r3, r2)     // Catch:{ Exception -> 0x069d }
            X.6WQ r2 = r13.A0E     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x069d }
            r0 = 0
            r1.load(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = r2.A09     // Catch:{ Exception -> 0x069d }
            java.security.cert.Certificate[] r0 = r1.getCertificateChain(r0)     // Catch:{ Exception -> 0x069d }
            r0 = r0[r5]     // Catch:{ Exception -> 0x069d }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x069d }
            java.lang.String r2 = X.C36441kJ.A13(r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ Exception -> 0x069d }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x069d }
            X.AnonymousClass000.A1D(r3, r6, r4, r0)     // Catch:{ Exception -> 0x069d }
            java.lang.String r0 = X.AnonymousClass000.A0p(r6, r2, r0)     // Catch:{ Exception -> 0x069d }
            r1[r5] = r0     // Catch:{ Exception -> 0x069d }
            X.6WQ r0 = r13.A0E     // Catch:{ Exception -> 0x069d }
            r0.A06(r1)     // Catch:{ Exception -> 0x069d }
            return
        L_0x0691:
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x069d }
            if (r0 == 0) goto L_0x06a6
            X.6WQ r0 = r13.A0E     // Catch:{ Exception -> 0x069d }
            r0.A04()     // Catch:{ Exception -> 0x069d }
            return
        L_0x069d:
            android.content.Context r1 = r13.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "TECHNICAL_ERROR"
            r1.A2E(r0)
        L_0x06a6:
            return
        L_0x06a7:
            r0 = 2131624063(0x7f0e007f, float:1.8875295E38)
            r13.setContentView((int) r0)
            java.lang.Boolean r0 = r13.A08
            boolean r0 = r0.booleanValue()
            r12 = 0
            if (r0 == 0) goto L_0x06c4
            java.lang.String r0 = r13.A0B
            X.4c5 r1 = new X.4c5
            r1.<init>(r13, r0)
            r13.A0J = r1
            java.lang.String[] r0 = new java.lang.String[r12]
            r1.execute(r0)
        L_0x06c4:
            r0 = 2131427916(0x7f0b024c, float:1.8477462E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r13, r0)
            r13.A0H = r1
            android.graphics.Bitmap r0 = r13.A02
            if (r0 == 0) goto L_0x06d4
            r1.setImageBitmap(r0)
        L_0x06d4:
            java.lang.String r11 = "mobileNumber"
            java.lang.String r10 = "mandate"
            X.65O r0 = r13.A0D
            org.json.JSONObject r1 = r0.A0B
            java.lang.String r9 = ""
            if (r1 == 0) goto L_0x0a0e
            java.lang.String r0 = "payerBankName"
            java.lang.String r18 = r1.optString(r0)
        L_0x06e6:
            X.65O r0 = r13.A0D
            org.json.JSONObject r2 = r0.A0C
            org.json.JSONArray r14 = r0.A08
            if (r2 != 0) goto L_0x0819
            java.lang.String r2 = "l12"
            java.lang.String r1 = "l12.message"
            X.5VL r0 = new X.5VL
            r0.<init>(r13, r2, r1)
        L_0x06f7:
            r0 = 2131434846(0x7f0b1d5e, float:1.8491517E38)
            android.view.View r2 = r13.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.65O r0 = r13.A0D
            org.json.JSONArray r0 = r0.A08
            r16 = r0
            r8 = 0
        L_0x0707:
            int r0 = r16.length()
            if (r8 >= r0) goto L_0x0a12
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r13)
            r0 = 2131625346(0x7f0e0582, float:1.8877897E38)
            android.view.View r7 = r1.inflate(r0, r2, r12)
            r0 = 2131434844(0x7f0b1d5c, float:1.8491513E38)
            android.widget.TextView r6 = X.C36391kE.A0P(r7, r0)
            r0 = 2131434845(0x7f0b1d5d, float:1.8491515E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r7, r0)
            r0 = 2131435078(0x7f0b1e46, float:1.8491988E38)
            android.widget.TextView r15 = X.C36391kE.A0P(r7, r0)
            r0 = 2131435081(0x7f0b1e49, float:1.8491994E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = r16
            org.json.JSONObject r14 = r0.optJSONObject(r8)
            java.lang.String r4 = "name"
            java.lang.String r3 = r14.optString(r4, r9)
            java.lang.String r0 = "payeeName"
            boolean r0 = r3.equals(r0)
            java.lang.String r3 = "value"
            if (r0 == 0) goto L_0x077d
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x077a
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x077a
            java.lang.String r0 = "Mandate against"
        L_0x0756:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r14.optString(r3)
            r5.setText(r0)
            java.lang.String r0 = "VERIFIED MERCHANT"
            r15.setText(r0)
            java.lang.Boolean r0 = r13.A09
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0774
            r1.setVisibility(r12)
        L_0x0774:
            r2.addView(r7)
            int r8 = r8 + 1
            goto L_0x0707
        L_0x077a:
            java.lang.String r0 = "paying to"
            goto L_0x0756
        L_0x077d:
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "txnAmount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07f1
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "Amount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07f1
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "note"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07b2
            java.lang.String r0 = "Details"
        L_0x07a3:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r14.optString(r3)
        L_0x07ae:
            r5.setText(r0)
            goto L_0x0774
        L_0x07b2:
            java.lang.String r0 = r14.optString(r4, r9)
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x07bf
            java.lang.String r0 = "Mobile"
            goto L_0x07a3
        L_0x07bf:
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "refUrl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07ce
            java.lang.String r0 = "ref url"
            goto L_0x07a3
        L_0x07ce:
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "refId"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07dd
            java.lang.String r0 = "Ref id"
            goto L_0x07a3
        L_0x07dd:
            java.lang.String r1 = r14.optString(r4, r9)
            java.lang.String r0 = "mandateSubType"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07ec
            java.lang.String r0 = "Mandate Type"
            goto L_0x07a3
        L_0x07ec:
            java.lang.String r0 = r14.optString(r4)
            goto L_0x07a3
        L_0x07f1:
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x0816
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0816
            java.lang.String r0 = "Maximum Mandate Amount"
        L_0x07fd:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "₹ "
            r1.append(r0)
            java.lang.String r0 = r14.optString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x07ae
        L_0x0816:
            java.lang.String r0 = "AMOUNT"
            goto L_0x07fd
        L_0x0819:
            java.lang.String r0 = "txnAmount"
            java.lang.String r8 = r2.optString(r0)
            X.65O r1 = r13.A0D     // Catch:{ JSONException -> 0x084f }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x084f }
            r1.A09 = r0     // Catch:{ JSONException -> 0x084f }
            r1 = 0
        L_0x082a:
            X.65O r0 = r13.A0D     // Catch:{ JSONException -> 0x084f }
            org.json.JSONArray r0 = r0.A09     // Catch:{ JSONException -> 0x084f }
            int r0 = r0.length()     // Catch:{ JSONException -> 0x084f }
            if (r1 >= r0) goto L_0x0853
            X.65O r0 = r13.A0D     // Catch:{ JSONException -> 0x084f }
            org.json.JSONArray r0 = r0.A09     // Catch:{ JSONException -> 0x084f }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x084f }
            boolean r0 = r0.equals(r10)     // Catch:{ JSONException -> 0x084f }
            if (r0 == 0) goto L_0x084c
            X.65O r0 = r13.A0D     // Catch:{ JSONException -> 0x084f }
            org.json.JSONArray r0 = r0.A09     // Catch:{ JSONException -> 0x084f }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x084f }
            r13.A0A = r0     // Catch:{ JSONException -> 0x084f }
        L_0x084c:
            int r1 = r1 + 1
            goto L_0x082a
        L_0x084f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0853:
            r15 = r9
            r3 = 0
        L_0x0855:
            int r0 = r14.length()
            java.lang.String r2 = "account"
            java.lang.String r7 = "value"
            java.lang.String r6 = "name"
            if (r3 >= r0) goto L_0x08ae
            java.lang.String r0 = X.C90474aD.A0d(r6, r14, r3)     // Catch:{ Exception -> 0x08ab }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x08ab }
            if (r0 == 0) goto L_0x0894
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x08ab }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08ab }
            java.lang.String r15 = r0.optString(r7, r9)     // Catch:{ Exception -> 0x08ab }
            int r0 = r15.length()     // Catch:{ Exception -> 0x08ab }
            int r1 = r0 + -4
            int r0 = r15.length()     // Catch:{ Exception -> 0x08ab }
            java.lang.String r15 = r15.substring(r1, r0)     // Catch:{ Exception -> 0x08ab }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x08ab }
            java.lang.String r0 = "XXXX"
            r1.append(r0)     // Catch:{ Exception -> 0x08ab }
            r1.append(r15)     // Catch:{ Exception -> 0x08ab }
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x08ab }
            goto L_0x08ae
        L_0x0894:
            java.lang.String r1 = X.C90474aD.A0d(r6, r14, r3)     // Catch:{ Exception -> 0x08ab }
            java.lang.String r0 = "payeeVpa"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x08ab }
            if (r0 == 0) goto L_0x08ab
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x08ab }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08ab }
            java.lang.String r15 = r0.optString(r7, r9)     // Catch:{ Exception -> 0x08ab }
            goto L_0x08ae
        L_0x08ab:
            int r3 = r3 + 1
            goto L_0x0855
        L_0x08ae:
            r1 = 0
        L_0x08af:
            int r0 = r14.length()
            if (r1 >= r0) goto L_0x08ef
            java.lang.String r3 = X.C90474aD.A0d(r6, r14, r1)     // Catch:{ Exception -> 0x08ec }
            java.lang.String r0 = "payeeName"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x08ec }
            if (r0 == 0) goto L_0x08cc
            java.lang.Object r0 = r14.get(r1)     // Catch:{ Exception -> 0x08ec }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08ec }
        L_0x08c7:
            java.lang.String r5 = r0.optString(r7, r9)     // Catch:{ Exception -> 0x08ec }
            goto L_0x08f0
        L_0x08cc:
            java.lang.String r0 = X.C90474aD.A0d(r6, r14, r1)     // Catch:{ Exception -> 0x08ec }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x08ec }
            if (r0 == 0) goto L_0x08dd
            java.lang.Object r0 = r14.get(r1)     // Catch:{ Exception -> 0x08ec }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08ec }
            goto L_0x08c7
        L_0x08dd:
            java.lang.String r0 = X.C90474aD.A0d(r6, r14, r1)     // Catch:{ Exception -> 0x08ec }
            boolean r0 = r0.equals(r11)     // Catch:{ Exception -> 0x08ec }
            if (r0 == 0) goto L_0x08ec
            java.lang.String r5 = X.C90474aD.A0d(r11, r14, r1)     // Catch:{ Exception -> 0x08ec }
            goto L_0x08f0
        L_0x08ec:
            int r1 = r1 + 1
            goto L_0x08af
        L_0x08ef:
            r5 = r9
        L_0x08f0:
            r0 = 2131434835(0x7f0b1d53, float:1.8491495E38)
            android.view.View r20 = r13.findViewById(r0)
            r0 = 2131434904(0x7f0b1d98, float:1.8491635E38)
            android.widget.TextView r17 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434905(0x7f0b1d99, float:1.8491637E38)
            android.widget.TextView r16 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434862(0x7f0b1d6e, float:1.849155E38)
            android.widget.TextView r4 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434863(0x7f0b1d6f, float:1.8491552E38)
            android.widget.TextView r3 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434832(0x7f0b1d50, float:1.849149E38)
            android.widget.TextView r2 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434833(0x7f0b1d51, float:1.8491491E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r13, r0)
            r0 = 2131434834(0x7f0b1d52, float:1.8491493E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r13, r0)
            r13.A06 = r0
            r0 = r16
            r0.setText(r15)
            r0 = r18
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x093e
            r15 = r17
            r0 = r18
            r15.setText(r0)
        L_0x093e:
            boolean r0 = r8.equals(r9)
            r15 = 1
            if (r0 != 0) goto L_0x09d4
            java.lang.String r0 = "null"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x09d4
            double r18 = java.lang.Double.parseDouble(r8)
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x09d4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "₹ "
            java.lang.String r6 = X.AnonymousClass000.A0p(r0, r8, r6)
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x09cc
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x09cc
            java.lang.String r0 = "Maximum Mandate Amount: "
            r2.setText(r0)
            java.lang.String r0 = "Mandate Against: "
        L_0x0972:
            r4.setText(r0)
            r1.setText(r6)
            r3.setText(r5)
        L_0x097b:
            android.view.WindowManager r0 = r13.getWindowManager()
            android.view.Display r1 = r0.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getSize(r0)
            int r0 = r0.y
            r13.A00 = r0
            r1 = 47
            r0 = r20
            X.C36351kA.A1E(r0, r13, r1)
            r0 = 2131434847(0x7f0b1d5f, float:1.849152E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A04 = r0
            r0 = 2131434843(0x7f0b1d5b, float:1.8491511E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A05 = r0
            android.view.View r1 = r13.A04
            r0 = 11
            X.AnonymousClass6UI.A00(r1, r13, r0)
            android.view.View r1 = r13.A05
            if (r1 == 0) goto L_0x09b8
            r0 = 12
            X.AnonymousClass6UI.A00(r1, r13, r0)
        L_0x09b8:
            r0 = 2131434852(0x7f0b1d64, float:1.849153E38)
            android.view.View r0 = r13.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r13.A03 = r0
            r0.setCrossFadeEnabled(r15)
            goto L_0x06f7
        L_0x09cc:
            java.lang.String r0 = "Sending: "
            r2.setText(r0)
            java.lang.String r0 = "To: "
            goto L_0x0972
        L_0x09d4:
            r2.setText(r9)
            r4.setText(r9)
            r1.setText(r9)
            r3.setText(r9)
            r3 = 0
        L_0x09e1:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x0a01
            java.lang.String r1 = X.C90474aD.A0d(r6, r14, r3)     // Catch:{ Exception -> 0x09fe }
            java.lang.String r0 = "note"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x09fe }
            if (r0 == 0) goto L_0x09fe
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x09fe }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x09fe }
            java.lang.String r5 = r0.optString(r7, r9)     // Catch:{ Exception -> 0x09fe }
            goto L_0x0a01
        L_0x09fe:
            int r3 = r3 + 1
            goto L_0x09e1
        L_0x0a01:
            r2.setText(r5)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            r2.setSingleLine(r15)
            goto L_0x097b
        L_0x0a0e:
            r18 = r9
            goto L_0x06e6
        L_0x0a12:
            android.view.View r4 = new android.view.View
            r4.<init>(r13)
            r3 = -1
            r1 = 1077936128(0x40400000, float:3.0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r13)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            X.C90514aH.A1J(r4, r3, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setBackgroundColor(r0)
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            r4.setAlpha(r0)
            r2.addView(r4)
            r0 = 2131430408(0x7f0b0c08, float:1.8482516E38)
            android.view.View r6 = r13.findViewById(r0)
            org.npci.upi.security.pinactivitycomponent.Keypad r6 = (org.npci.upi.security.pinactivitycomponent.Keypad) r6
            if (r6 == 0) goto L_0x0a48
            X.784 r0 = new X.784
            r0.<init>(r13)
            r6.A04 = r0
        L_0x0a48:
            r0 = 2131434770(0x7f0b1d12, float:1.8491363E38)
            android.view.View r1 = r13.findViewById(r0)
            r0 = 10
            r1.setPadding(r12, r0, r12, r12)
            r0 = 2131431362(0x7f0b0fc2, float:1.8484451E38)
            android.view.View r5 = r13.findViewById(r0)
            r0 = 2131434852(0x7f0b1d64, float:1.849153E38)
            android.view.View r4 = r13.findViewById(r0)
            android.util.DisplayMetrics r3 = X.AnonymousClass000.A0X(r13)
            r2 = 50
            int r1 = r3.densityDpi
            r0 = 320(0x140, float:4.48E-43)
            if (r1 > r0) goto L_0x0a84
            int r1 = r3.heightPixels
            r0 = 1184(0x4a0, float:1.659E-42)
            if (r1 > r0) goto L_0x0a84
            r0 = 800(0x320, float:1.121E-42)
            if (r1 > r0) goto L_0x0a83
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r0 = 280(0x118, float:3.92E-43)
            r1.height = r0
            r6.setLayoutParams(r1)
        L_0x0a83:
            r2 = 0
        L_0x0a84:
            X.65O r0 = r13.A0D
            java.lang.Boolean r0 = r0.A02
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0a9f
            r0 = 8
            r4.setVisibility(r0)
        L_0x0a93:
            org.npci.upi.security.pinactivitycomponent.w r2 = new org.npci.upi.security.pinactivitycomponent.w
            r2.<init>()
            r13.A07 = r2
            android.os.Bundle r1 = X.C36371kC.A0H(r13)
            goto L_0x0aa3
        L_0x0a9f:
            r5.setPadding(r12, r2, r12, r12)
            goto L_0x0a93
        L_0x0aa3:
            X.01z r0 = r13.getSupportFragmentManager()     // Catch:{ Exception -> 0x0ae8 }
            if (r1 == 0) goto L_0x0aac
            r2.A17(r1)     // Catch:{ Exception -> 0x0ae8 }
        L_0x0aac:
            X.09Y r1 = new X.09Y     // Catch:{ Exception -> 0x0ae8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ae8 }
            r0 = 2131431362(0x7f0b0fc2, float:1.8484451E38)
            r1.A0B(r2, r0)     // Catch:{ Exception -> 0x0ae8 }
            r0 = 1
            r1.A00(r0)     // Catch:{ Exception -> 0x0ae8 }
            r13.A0F = r2     // Catch:{ Exception -> 0x0ae8 }
            goto L_0x0ae8
        L_0x0abe:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0af6 }
            int r0 = r4.a     // Catch:{ Exception -> 0x0af6 }
            r1.append(r0)     // Catch:{ Exception -> 0x0af6 }
            java.lang.String r0 = ""
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x0af6 }
            java.lang.String r1 = r4.b     // Catch:{ Exception -> 0x0af6 }
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ Exception -> 0x0af6 }
            java.lang.String r0 = "errorCode"
            r2.putString(r0, r3)     // Catch:{ Exception -> 0x0af6 }
            java.lang.String r0 = "error"
            r2.putString(r0, r1)     // Catch:{ Exception -> 0x0af6 }
            android.os.ResultReceiver r1 = X.C124765yl.A0B     // Catch:{ Exception -> 0x0af6 }
            r0 = 0
            r1.send(r0, r2)     // Catch:{ Exception -> 0x0af6 }
            r13.finish()     // Catch:{ Exception -> 0x0af6 }
            throw r4     // Catch:{ Exception -> 0x0af6 }
        L_0x0ae8:
            r0 = 2131430541(0x7f0b0c8d, float:1.8482786E38)
            android.view.View r1 = r13.findViewById(r0)
            if (r1 == 0) goto L_0x0af6
            r0 = 46
            X.C36351kA.A1E(r1, r13, r0)
        L_0x0af6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.GetCredential.onCreate(android.os.Bundle):void");
    }

    public void A2E(String str) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("error", str);
        C124765yl.A0B.send(0, A072);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            try {
                AnonymousClass6WQ r1 = this.A0E;
                r1.A05(r1.A06);
            } catch (Exception unused) {
                ((GetCredential) this.A0K).A2E("TECHNICAL_ERROR");
            }
        } else if (i == 1) {
            this.A0E.A04();
        }
    }

    public void onPause() {
        super.onPause();
        try {
            C90884b2 r0 = this.A0C;
            if (r0 != null) {
                unregisterReceiver(r0);
                this.A0C = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0C = new C90884b2(this);
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(999);
                registerReceiver(this.A0C, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }
}
