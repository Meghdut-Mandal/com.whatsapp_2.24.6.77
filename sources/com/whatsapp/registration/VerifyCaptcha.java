package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1CF;
import X.AnonymousClass1RU;
import X.AnonymousClass1X8;
import X.AnonymousClass2d2;
import X.AnonymousClass3DY;
import X.AnonymousClass3KW;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UV;
import X.AnonymousClass3XC;
import X.AnonymousClass3Y6;
import X.AnonymousClass4OZ;
import X.AnonymousClass4UE;
import X.C18750th;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19630wG;
import X.C19770wU;
import X.C199929gH;
import X.C20830yE;
import X.C21060yb;
import X.C21520zN;
import X.C23045B1q;
import X.C27111My;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C50112kE;
import X.C52082or;
import X.C55232uI;
import X.C62603Gu;
import X.C62623Gw;
import X.C65983Uf;
import X.C66713Xa;
import X.C81143wX;
import X.C89354Wf;
import X.C90044Yw;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.io.FileOutputStream;

public final class VerifyCaptcha extends AnonymousClass155 implements AnonymousClass4UE, C23045B1q, AnonymousClass4OZ {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AudioManager A07;
    public MediaPlayer A08;
    public ProgressBar A09;
    public CodeInputField A0A;
    public AnonymousClass3DY A0B;
    public WaImageButton A0C;
    public WaImageButton A0D;
    public WaImageView A0E;
    public AnonymousClass1RU A0F;
    public C19630wG A0G;
    public C20830yE A0H;
    public C62603Gu A0I;
    public C21520zN A0J;
    public AnonymousClass1CF A0K;
    public AnonymousClass3XC A0L;
    public C62623Gw A0M;
    public AnonymousClass3UV A0N;
    public C29501Ww A0O;
    public AnonymousClass1X8 A0P;
    public C199929gH A0Q;
    public AnonymousClass3KW A0R;
    public WDSButton A0S;
    public File A0T;
    public String A0U;
    public String A0V;
    public boolean A0W;
    public ViewStub A0X;
    public ViewStub A0Y;
    public ProgressBar A0Z;
    public boolean A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r6.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0K(com.whatsapp.registration.VerifyCaptcha r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 0
            r2 = 1
            if (r6 == 0) goto L_0x000b
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            java.lang.String r3 = "captcha_bad_image_blob_response"
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/bad image blob response"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 7
            X.AnonymousClass3SJ.A01(r5, r0)
            X.0v0 r0 = r5.A09
            r0.A1P(r3)
            return r4
        L_0x001f:
            byte[] r1 = android.util.Base64.decode(r6, r4)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            int r0 = r1.length     // Catch:{ IllegalArgumentException -> 0x00c2 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r1 == 0) goto L_0x0035
            com.whatsapp.WaImageView r0 = r5.A0E     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "captchaImage"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
        L_0x0034:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c2 }
        L_0x0035:
            java.lang.String r0 = "bMap is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            goto L_0x0034
        L_0x003c:
            r0.setImageBitmap(r1)     // Catch:{ IllegalArgumentException -> 0x00c2 }
            if (r7 == 0) goto L_0x00a7
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00a7
            X.0wU r1 = r5.A04     // Catch:{ FileNotFoundException -> 0x008b }
            r0 = 20
            X.C36421kH.A1H(r1, r5, r7, r0)     // Catch:{ FileNotFoundException -> 0x008b }
            com.whatsapp.WaImageButton r0 = r5.A0C
            java.lang.String r3 = "captchaAudioBtn"
            if (r0 != 0) goto L_0x0059
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0059:
            r0.setVisibility(r4)
            com.whatsapp.WaImageButton r1 = r5.A0C
            if (r1 != 0) goto L_0x0065
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0065:
            r0 = 2131233643(0x7f080b6b, float:1.808343E38)
            X.C36371kC.A13(r5, r1, r0)
            com.whatsapp.WaImageButton r1 = r5.A0C
            if (r1 != 0) goto L_0x0074
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0074:
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            r1.setColorFilter(r0)
            com.whatsapp.WaImageButton r0 = r5.A0C
            if (r0 != 0) goto L_0x0087
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0087:
            r0.setEnabled(r2)
            return r2
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudio/FileNotFoundException"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.WaImageButton r1 = r5.A0C
            if (r1 != 0) goto L_0x009c
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009c:
            r0 = 8
            r1.setVisibility(r0)
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/failed to setup captcha audio"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x00a7:
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/bad audio blob response"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.WaImageButton r1 = r5.A0C
            if (r1 != 0) goto L_0x00b7
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b7:
            r0 = 8
            r1.setVisibility(r0)
            X.0v0 r0 = r5.A09
            r0.A1P(r3)
            return r2
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaImage/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)
            com.whatsapp.WaImageButton r1 = r5.A0C
            if (r1 != 0) goto L_0x00d3
            java.lang.String r0 = "captchaAudioBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d3:
            r0 = 8
            r1.setVisibility(r0)
            X.AnonymousClass3SJ.A01(r5, r0)
            java.lang.String r0 = "VerifyCaptcha/setupCaptcha/failed to setup captcha image"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifyCaptcha.A0K(com.whatsapp.registration.VerifyCaptcha, java.lang.String, java.lang.String):boolean");
    }

    public void BTw(C52082or r6, C66713Xa r7, String str) {
        String str2;
        int A062 = C36431kI.A06(r6, 1);
        if (A062 != 7) {
            int i = 8;
            if (A062 != 9) {
                if (A062 == 3) {
                    AnonymousClass17Y r0 = this.A05;
                    AnonymousClass00C.A07(r0);
                    C55232uI.A00(r0);
                    this.A09.A1P("captcha_request_failed");
                    return;
                } else if (A062 == 6 || A062 == 19) {
                    i = 7;
                } else {
                    String str3 = null;
                    if (r7 != null) {
                        str2 = r7.A0F;
                        str3 = r7.A09;
                    } else {
                        str2 = null;
                    }
                    A0K(this, str2, str3);
                    return;
                }
            }
            AnonymousClass3SJ.A01(this, i);
            this.A09.A1P("captcha_request_failed");
            return;
        }
        AnonymousClass3SJ.A01(this, 5);
        this.A09.A1P("captcha_too_many_guesses_failed");
    }

    public void Bus() {
        A0J(true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0n(this);
        setContentView((int) R.layout.f9nameremoved);
        C81143wX.A01(this.A04, this, 25);
        this.A0Z = (ProgressBar) C36361kB.A0G(this.A00, R.id.progress_bar_code_input_blocked);
        this.A0E = (WaImageView) C36361kB.A0G(this.A00, R.id.captcha_image);
        this.A0A = (CodeInputField) C36361kB.A0G(this.A00, R.id.captcha_code_input);
        this.A0C = (WaImageButton) C36361kB.A0G(this.A00, R.id.captcha_audio_btn);
        this.A0D = (WaImageButton) C36361kB.A0G(this.A00, R.id.captcha_refresh_btn);
        this.A0Y = (ViewStub) C36361kB.A0G(this.A00, R.id.captcha_warning_view_stub);
        this.A0S = (WDSButton) C36361kB.A0G(this.A00, R.id.captcha_submit);
        this.A09 = (ProgressBar) C36361kB.A0G(this.A00, R.id.captcha_progress_bar);
        this.A0X = (ViewStub) C36361kB.A0G(this.A00, R.id.captcha_error_description_view_stub);
        C21520zN r0 = this.A0J;
        if (r0 != null) {
            C65983Uf.A0O(this, r0, R.id.captcha_title_toolbar_text);
            CodeInputField codeInputField = this.A0A;
            if (codeInputField == null) {
                throw C36331k8.A0d("codeInputField");
            }
            codeInputField.A0F(new C90044Yw(this, 2), 3);
            if (!C65983Uf.A0S(getResources())) {
                CodeInputField codeInputField2 = this.A0A;
                if (codeInputField2 == null) {
                    throw C36331k8.A0d("codeInputField");
                }
                codeInputField2.A0C(false);
            }
            WaImageButton waImageButton = this.A0D;
            if (waImageButton == null) {
                throw C36331k8.A0d("captchaRefreshBtn");
            }
            AnonymousClass3Y6.A00(waImageButton, this, 39);
            WDSButton wDSButton = this.A0S;
            if (wDSButton == null) {
                throw C36331k8.A0d("captchaSubmitButton");
            }
            AnonymousClass3Y6.A00(wDSButton, this, 37);
            this.A07 = this.A08.A0D();
            WaImageButton waImageButton2 = this.A0C;
            if (waImageButton2 == null) {
                throw C36331k8.A0d("captchaAudioBtn");
            }
            AnonymousClass3Y6.A00(waImageButton2, this, 38);
            ProgressBar progressBar = this.A0Z;
            if (progressBar == null) {
                throw C36331k8.A0d("progressBar");
            }
            progressBar.setProgress(100);
            WaImageView waImageView = this.A0E;
            if (waImageView == null) {
                throw C36331k8.A0d("captchaImage");
            }
            waImageView.setClipToOutline(true);
            if (C36371kC.A0H(this) != null) {
                this.A0W = getIntent().getBooleanExtra("change_number", false);
            }
            C18820ts r6 = this.A00;
            View view = this.A00;
            AnonymousClass1RU r1 = this.A0F;
            if (r1 != null) {
                C65983Uf.A0M(view, this, r6, R.id.captcha_title_toolbar, false, true, r1.A0F(this.A0W));
                String A0f = this.A09.A0f();
                AnonymousClass00C.A08(A0f);
                this.A0U = A0f;
                String A0h = this.A09.A0h();
                AnonymousClass00C.A08(A0h);
                this.A0V = A0h;
                String str = this.A0U;
                if (str == null) {
                    throw C36331k8.A0d("countryCode");
                } else if (str.length() == 0 || A0h.length() == 0) {
                    Log.w("VerifyCaptcha/create/cc or num is missing, bounce to regphone");
                    A0G(this);
                } else {
                    this.A09.A1P("captcha_entered");
                    String str2 = this.A0U;
                    if (str2 == null) {
                        throw C36331k8.A0d("countryCode");
                    }
                    String str3 = this.A0V;
                    if (str3 == null) {
                        throw C36331k8.A0d("phoneNumber");
                    }
                    C21520zN r12 = this.A0J;
                    if (r12 != null) {
                        A0H(this, C65983Uf.A08(this.A09, r12), str2, str3);
                        return;
                    }
                    throw C36331k8.A0d("abPreChatdProps");
                }
            } else {
                throw C36331k8.A0d("accountSwitcher");
            }
        } else {
            throw C36331k8.A0d("abPreChatdProps");
        }
    }

    private final void A01() {
        File file = this.A0T;
        if (file != null) {
            file.delete();
        }
        WaImageButton waImageButton = this.A0C;
        if (waImageButton == null) {
            throw C36331k8.A0d("captchaAudioBtn");
        }
        C36371kC.A13(this, waImageButton, R.color.f6nameremoved);
        WaImageButton waImageButton2 = this.A0C;
        if (waImageButton2 == null) {
            throw C36331k8.A0d("captchaAudioBtn");
        }
        waImageButton2.setColorFilter(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        WaImageButton waImageButton3 = this.A0C;
        if (waImageButton3 == null) {
            throw C36331k8.A0d("captchaAudioBtn");
        }
        waImageButton3.setEnabled(false);
    }

    private final void A07() {
        ProgressBar progressBar = this.A0Z;
        if (progressBar == null) {
            throw C36331k8.A0d("progressBar");
        }
        progressBar.setEnabled(false);
        CodeInputField codeInputField = this.A0A;
        if (codeInputField == null) {
            throw C36331k8.A0d("codeInputField");
        }
        codeInputField.setEnabled(false);
        WDSButton wDSButton = this.A0S;
        if (wDSButton == null) {
            throw C36331k8.A0d("captchaSubmitButton");
        }
        wDSButton.setEnabled(false);
    }

    public static final void A0F(VerifyCaptcha verifyCaptcha) {
        CodeInputField codeInputField = verifyCaptcha.A0A;
        if (codeInputField == null) {
            throw C36331k8.A0d("codeInputField");
        }
        codeInputField.setCode("");
        WDSButton wDSButton = verifyCaptcha.A0S;
        if (wDSButton == null) {
            throw C36331k8.A0d("captchaSubmitButton");
        }
        wDSButton.setEnabled(false);
    }

    public static final void A0G(VerifyCaptcha verifyCaptcha) {
        Intent A0B2;
        boolean z = verifyCaptcha.A0W;
        C29501Ww r2 = verifyCaptcha.A0O;
        if (r2 != null) {
            if (z) {
                C29501Ww.A02(r2, 3, true);
                C29501Ww r0 = verifyCaptcha.A0O;
                if (r0 != null) {
                    if (!r0.A0F()) {
                        verifyCaptcha.finish();
                    }
                    A0B2 = AnonymousClass190.A00(verifyCaptcha);
                } else {
                    throw C36331k8.A0d("registrationManager");
                }
            } else {
                C29501Ww.A02(r2, 1, true);
                A0B2 = AnonymousClass190.A0B(verifyCaptcha);
                AnonymousClass00C.A08(A0B2);
                A0B2.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
            }
            verifyCaptcha.startActivity(A0B2);
            verifyCaptcha.finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public static final void A0H(VerifyCaptcha verifyCaptcha, AnonymousClass2d2 r21, String str, String str2) {
        VerifyCaptcha verifyCaptcha2 = verifyCaptcha;
        C19770wU r1 = verifyCaptcha2.A04;
        int A0B2 = verifyCaptcha2.A09.A0B();
        int i = C36331k8.A06(verifyCaptcha2).getInt("pref_flash_call_manage_call_permission_granted", -1);
        int i2 = C36331k8.A06(verifyCaptcha2).getInt("pref_flash_call_call_log_permission_granted", -1);
        C19630wG r4 = verifyCaptcha2.A0G;
        if (r4 != null) {
            C21060yb r3 = verifyCaptcha2.A08;
            AnonymousClass00C.A07(r3);
            C19420v0 r5 = verifyCaptcha2.A09;
            AnonymousClass00C.A07(r5);
            AnonymousClass3UV r6 = verifyCaptcha2.A0N;
            if (r6 != null) {
                C199929gH r7 = verifyCaptcha2.A0Q;
                if (r7 != null) {
                    C36441kJ.A1E(new C50112kE(r3, r4, r5, r6, r7, r21, verifyCaptcha2, str, str2, "captcha", (String) null, (String) null, (String) null, A0B2, i, i2, true, false), r1);
                    return;
                }
                throw C36331k8.A0d("autoconfManager");
            }
            throw C36331k8.A0d("registrationHttpManager");
        }
        throw C36331k8.A0d("waContext");
    }

    public void A2F() {
        if (!this.A0a) {
            this.A0a = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r2 = r1.A00;
            C36321k7.A0X(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A0G = C36351kA.A0W(r1);
            this.A0R = (AnonymousClass3KW) r1.ABK.get();
            this.A0B = C36361kB.A0Q(r1);
            this.A0J = C36401kF.A0Y(r1);
            this.A0Q = (C199929gH) r2.A0I.get();
            this.A0F = C36351kA.A0R(r1);
            this.A0M = C27111My.A38(A0L2);
            this.A0K = C36361kB.A0b(r1);
            this.A0I = (C62603Gu) r2.A8A.get();
            this.A0O = C36401kF.A0d(r1);
            this.A0H = C36351kA.A0X(r1);
            this.A0P = C36391kE.A0o(r1);
            this.A0N = C36431kI.A0t(r1);
        }
    }

    public void BKC(boolean z, String str) {
        ProgressBar progressBar = this.A09;
        if (progressBar == null) {
            throw C36331k8.A0d("captchaRequestLoading");
        }
        progressBar.setVisibility(8);
    }

    public void BmG() {
        int i = this.A02;
        if (!(i == 1 || i == 3 || C65983Uf.A0R(this.A00) || i == 4)) {
            C20830yE r1 = this.A0H;
            if (r1 == null) {
                throw C36331k8.A0d("waPermissionsHelper");
            } else if (r1.A02("android.permission.RECEIVE_SMS") != 0) {
                Log.i("VerifyCaptcha/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
                C65983Uf.A0N(this, 1);
                return;
            }
        }
        Log.i("VerifyCaptcha/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
        A0J(false);
    }

    public void Bu4(boolean z, String str) {
        ProgressBar progressBar = this.A09;
        if (progressBar == null) {
            throw C36331k8.A0d("captchaRequestLoading");
        }
        progressBar.setVisibility(0);
    }

    public void onBackPressed() {
        AnonymousClass1RU r1 = this.A0F;
        if (r1 == null) {
            throw C36331k8.A0d("accountSwitcher");
        } else if (r1.A0F(this.A0W)) {
            Log.i("VerifyCaptcha/onBackPressed/is adding new account");
            AnonymousClass1RU r2 = this.A0F;
            if (r2 != null) {
                C65983Uf.A0F(this, r2, this.A09, this.A0A);
                return;
            }
            throw C36331k8.A0d("accountSwitcher");
        } else {
            A0G(this);
        }
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        switch (i) {
            case 1:
                CodeInputField codeInputField = this.A0A;
                if (codeInputField == null) {
                    throw C36331k8.A0d("codeInputField");
                }
                codeInputField.setImportantForAccessibility(2);
                ViewStub viewStub = this.A0Y;
                if (viewStub == null) {
                    throw C36331k8.A0d("captchaWarningIcon");
                }
                viewStub.setVisibility(8);
                ViewStub viewStub2 = this.A0X;
                if (viewStub2 == null) {
                    throw C36331k8.A0d("captchaErrorDescription");
                }
                viewStub2.setVisibility(8);
                C39001qm A002 = AnonymousClass3LW.A00(this);
                A002.A0d(R.string.f12nameremoved);
                A002.A0c(R.string.f12nameremoved);
                C39001qm.A0C(A002, this, 32, R.string.f12nameremoved);
                return A002.create();
            case 2:
                String string = getString(R.string.f12nameremoved);
                ProgressDialog progressDialog = new ProgressDialog(this);
                C36331k8.A0p(progressDialog, string);
                return progressDialog;
            case 3:
                CodeInputField codeInputField2 = this.A0A;
                if (codeInputField2 == null) {
                    throw C36331k8.A0d("codeInputField");
                }
                codeInputField2.setImportantForAccessibility(2);
                ViewStub viewStub3 = this.A0Y;
                if (viewStub3 == null) {
                    throw C36331k8.A0d("captchaWarningIcon");
                }
                viewStub3.setVisibility(8);
                ViewStub viewStub4 = this.A0X;
                if (viewStub4 == null) {
                    throw C36331k8.A0d("captchaErrorDescription");
                }
                viewStub4.setVisibility(8);
                C39001qm A003 = AnonymousClass3LW.A00(this);
                A003.A0d(R.string.f12nameremoved);
                C39001qm.A0C(A003, this, 30, R.string.f12nameremoved);
                return A003.create();
            case 4:
                AnonymousClass3DY r10 = this.A0B;
                if (r10 != null) {
                    C18820ts r11 = this.A00;
                    AnonymousClass1CF r12 = this.A0K;
                    if (r12 != null) {
                        String str = this.A0U;
                        if (str == null) {
                            throw C36331k8.A0d("countryCode");
                        }
                        String str2 = this.A0V;
                        if (str2 != null) {
                            return C65983Uf.A05(this, r10, r11, r12, C81143wX.A00(this, 26), str, str2);
                        }
                        throw C36331k8.A0d("phoneNumber");
                    }
                    throw C36331k8.A0d("supportGatingUtils");
                }
                throw C36331k8.A0d("sendFeedback");
            case 5:
                ViewStub viewStub5 = this.A0X;
                if (viewStub5 == null) {
                    throw C36331k8.A0d("captchaErrorDescription");
                }
                viewStub5.setVisibility(0);
                A01();
                A07();
                C39001qm A004 = AnonymousClass3LW.A00(this);
                A004.A0d(R.string.f12nameremoved);
                A004.A0c(R.string.f12nameremoved);
                C39001qm.A0C(A004, this, 31, R.string.f12nameremoved);
                return A004.create();
            case 6:
                AnonymousClass3DY r112 = this.A0B;
                if (r112 != null) {
                    C18820ts r122 = this.A00;
                    AnonymousClass1CF r13 = this.A0K;
                    if (r13 != null) {
                        String str3 = this.A0U;
                        if (str3 == null) {
                            throw C36331k8.A0d("countryCode");
                        }
                        String str4 = this.A0V;
                        if (str4 == null) {
                            throw C36331k8.A0d("phoneNumber");
                        }
                        C81143wX A005 = C81143wX.A00(this, 26);
                        return C65983Uf.A03(this.A01, this, this.A05, r112, r122, r13, this.A0L, A005, str3, str4);
                    }
                    throw C36331k8.A0d("supportGatingUtils");
                }
                throw C36331k8.A0d("sendFeedback");
            case 7:
                ViewStub viewStub6 = this.A0Y;
                if (viewStub6 == null) {
                    throw C36331k8.A0d("captchaWarningIcon");
                }
                viewStub6.setVisibility(0);
                ViewStub viewStub7 = this.A0X;
                if (viewStub7 == null) {
                    throw C36331k8.A0d("captchaErrorDescription");
                }
                viewStub7.setVisibility(0);
                WaImageView waImageView = this.A0E;
                if (waImageView == null) {
                    throw C36331k8.A0d("captchaImage");
                }
                waImageView.setImageBitmap((Bitmap) null);
                A01();
                A07();
                C39001qm A006 = AnonymousClass3LW.A00(this);
                A006.A0c(R.string.f12nameremoved);
                A006.A0r(false);
                C39001qm.A0D(A006, this, 27, R.string.f12nameremoved);
                C39001qm.A0C(A006, this, 28, R.string.f12nameremoved);
                return A006.create();
            case 8:
                ViewStub viewStub8 = this.A0Y;
                if (viewStub8 == null) {
                    throw C36331k8.A0d("captchaWarningIcon");
                }
                viewStub8.setVisibility(0);
                ViewStub viewStub9 = this.A0X;
                if (viewStub9 == null) {
                    throw C36331k8.A0d("captchaErrorDescription");
                }
                viewStub9.setVisibility(0);
                WaImageView waImageView2 = this.A0E;
                if (waImageView2 == null) {
                    throw C36331k8.A0d("captchaImage");
                }
                waImageView2.setImageBitmap((Bitmap) null);
                A01();
                A07();
                C39001qm A007 = AnonymousClass3LW.A00(this);
                A007.A0d(R.string.f12nameremoved);
                C39001qm.A0C(A007, this, 29, R.string.f12nameremoved);
                return A007.create();
            case 9:
                AnonymousClass3DY r3 = this.A0B;
                if (r3 != null) {
                    AnonymousClass1CF r2 = this.A0K;
                    if (r2 != null) {
                        String str5 = this.A0U;
                        if (str5 == null) {
                            throw C36331k8.A0d("countryCode");
                        }
                        String str6 = this.A0V;
                        if (str6 != null) {
                            return C65983Uf.A06(this, r3, r2, str5, str6);
                        }
                        throw C36331k8.A0d("phoneNumber");
                    }
                    throw C36331k8.A0d("supportGatingUtils");
                }
                throw C36331k8.A0d("sendFeedback");
            default:
                return super.onCreateDialog(i2);
        }
    }

    public VerifyCaptcha(int i) {
        this.A0a = false;
        C89354Wf.A00(this, 47);
    }

    public static final void A0I(VerifyCaptcha verifyCaptcha, String str) {
        boolean A1V = C36371kC.A1V(str);
        File file = verifyCaptcha.A0T;
        if (file == null || !file.exists()) {
            C81143wX.A01(verifyCaptcha.A04, verifyCaptcha, 25);
        }
        byte[] decode = Base64.decode(str, A1V ? 1 : 0);
        File file2 = verifyCaptcha.A0T;
        if (file2 == null) {
            throw C36331k8.A0d("captchaAudioFile");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(decode);
        fileOutputStream.close();
        MediaPlayer mediaPlayer = verifyCaptcha.A08;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
                C19630wG r0 = verifyCaptcha.A0G;
                if (r0 != null) {
                    Context context = r0.A00;
                    File file3 = verifyCaptcha.A0T;
                    if (file3 == null) {
                        throw C36331k8.A0d("captchaAudioFile");
                    }
                    mediaPlayer.setDataSource(context, Uri.fromFile(file3));
                    mediaPlayer.prepare();
                    return;
                }
                throw C36331k8.A0d("waContext");
            } catch (Exception e) {
                C36321k7.A1J(e, "VerifyCaptcha/decodeAudio/mediaPlayer ex: ", AnonymousClass000.A0u());
            }
        }
    }

    private final void A0J(boolean z) {
        int i;
        Intent A19;
        boolean z2 = z;
        C36321k7.A1X("VerifyCaptcha/startVerifySms useSmsRetriever ", AnonymousClass000.A0u(), z2);
        C29501Ww r5 = this.A0O;
        if (r5 != null) {
            int i2 = this.A02;
            boolean z3 = true;
            if (!(i2 == 1 || i2 == 3)) {
                z3 = false;
            }
            if (z3) {
                i = 15;
            } else {
                i = 4;
                if (this.A00 == 1) {
                    i = 17;
                }
            }
            C29501Ww.A02(r5, i, true);
            int i3 = this.A02;
            if (i3 == 4) {
                A19 = AnonymousClass190.A0J(this, this.A01, this.A04, this.A05, this.A06, this.A03, this.A0W);
            } else {
                int i4 = this.A01;
                long j = this.A04;
                long j2 = this.A05;
                long j3 = this.A06;
                long j4 = this.A03;
                Boolean bool = C18750th.A03;
                A19 = AnonymousClass190.A19(this, (String) null, i4, i3, 0, j, j2, j3, j4, z2, true, this.A0W, false, false);
            }
            AnonymousClass00C.A0B(A19);
            startActivity(A19);
            finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C36401kF.A16(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.A08;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            MediaPlayer mediaPlayer2 = this.A08;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.A08 = null;
        }
        File file = this.A0T;
        if (file != null && file.exists()) {
            File file2 = this.A0T;
            if (file2 == null) {
                throw C36331k8.A0d("captchaAudioFile");
            }
            file2.delete();
        }
        C62623Gw r0 = this.A0M;
        if (r0 != null) {
            r0.A00();
            return;
        }
        throw C36331k8.A0d("registrationHelper");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1) {
            C62623Gw r3 = this.A0M;
            if (r3 != null) {
                AnonymousClass1X8 r2 = this.A0P;
                if (r2 != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("verify-captcha +");
                    String str = this.A0U;
                    if (str == null) {
                        throw C36331k8.A0d("countryCode");
                    }
                    A0u.append(str);
                    String str2 = this.A0V;
                    if (str2 == null) {
                        throw C36331k8.A0d("phoneNumber");
                    }
                    r3.A01(this, r2, AnonymousClass000.A0q(str2, A0u));
                } else {
                    throw C36331k8.A0d("verificationFlowState");
                }
            } else {
                throw C36331k8.A0d("registrationHelper");
            }
        } else if (A062 == 2) {
            C36361kB.A0t(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public VerifyCaptcha() {
        this(0);
    }
}
