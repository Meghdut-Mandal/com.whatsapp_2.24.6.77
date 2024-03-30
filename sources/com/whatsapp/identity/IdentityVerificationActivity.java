package com.whatsapp.identity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass046;
import X.AnonymousClass047;
import X.AnonymousClass048;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass192;
import X.AnonymousClass1MK;
import X.AnonymousClass1OD;
import X.AnonymousClass3AX;
import X.AnonymousClass3C8;
import X.AnonymousClass3DX;
import X.AnonymousClass3FF;
import X.AnonymousClass3FM;
import X.AnonymousClass3P5;
import X.AnonymousClass3U8;
import X.AnonymousClass4Q9;
import X.AnonymousClass4QJ;
import X.AnonymousClass4UK;
import X.AnonymousClass4VH;
import X.AnonymousClass4WE;
import X.AnonymousClass6YY;
import X.AnonymousClass92E;
import X.AnonymousClass9S4;
import X.C023109s;
import X.C187798yY;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C1901797e;
import X.C19930wk;
import X.C200649ht;
import X.C203559oI;
import X.C20380xT;
import X.C20830yE;
import X.C232217q;
import X.C233418c;
import X.C235618y;
import X.C236419g;
import X.C236919l;
import X.C27111My;
import X.C30431aC;
import X.C32691e2;
import X.C32791eC;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C429721s;
import X.C48902iF;
import X.C50322kZ;
import X.C599836a;
import X.C62123Ew;
import X.C62353Fv;
import X.C63453Kc;
import X.C75323n2;
import X.C75493nK;
import X.C80253v6;
import X.C80293vA;
import X.C89334Wd;
import X.C90024Yu;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IdentityVerificationActivity extends AnonymousClass155 implements AnonymousClass4UK, AnonymousClass4Q9, AnonymousClass4QJ {
    public int A00;
    public View A01;
    public ImageView A02;
    public ProgressBar A03;
    public AnonymousClass3C8 A04;
    public C233418c A05;
    public C32691e2 A06;
    public AnonymousClass1MK A07;
    public AnonymousClass16D A08;
    public AnonymousClass171 A09;
    public C235618y A0A;
    public C30431aC A0B;
    public C20830yE A0C;
    public C599836a A0D;
    public C232217q A0E;
    public AnonymousClass141 A0F;
    public C236419g A0G;
    public AnonymousClass1OD A0H;
    public AnonymousClass3FF A0I;
    public AnonymousClass3AX A0J;
    public C63453Kc A0K;
    public UserJid A0L;
    public AnonymousClass3P5 A0M;
    public C236919l A0N;
    public C32791eC A0O;
    public WaQrScannerView A0P;
    public C20380xT A0Q;
    public boolean A0R;
    public MenuItem A0S;
    public TextView A0T;
    public TextView A0U;
    public Toolbar A0V;
    public AnonymousClass9S4 A0W;
    public boolean A0X;
    public final AnonymousClass192 A0Y;
    public final C75323n2 A0Z;
    public final C75323n2 A0a;
    public final Runnable A0b;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0H(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r1 = getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r0 = r7.getParcelableArrayExtra(r0)
            r5 = 0
            r1 = r0[r5]
            android.nfc.NdefMessage r1 = (android.nfc.NdefMessage) r1
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r5]
            byte[] r3 = r0.getPayload()
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r5]
            byte[] r2 = r0.getId()
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)
            if (r1 == 0) goto L_0x0055
            X.16D r0 = r6.A08
            X.141 r1 = r0.A0D(r1)
            r6.A0F = r1
            X.171 r0 = r6.A09
            java.lang.String r4 = X.C36381kD.A0v(r0, r1)
            r0 = 2131895574(0x7f122516, float:1.9425985E38)
            r2 = 1
            java.lang.String r0 = X.C36351kA.A0w(r6, r4, r2, r0)
            r6.A3E(r0)
            A0L(r6, r5)
            X.36a r0 = r6.A0D
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "idverification/ndef/no-fingerprint"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0055:
            return
        L_0x0056:
            X.3Kc r0 = r6.A0K
            X.34O r3 = r0.A00(r3)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0064
            A0M(r6, r2)
            return
        L_0x0064:
            boolean r0 = r3 instanceof X.AnonymousClass2LV
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "idverification/handleIntentV1Error result = "
            X.C36321k7.A1L(r3, r0, r1)
            int r1 = r3.A00
            r0 = -3
            if (r1 == r0) goto L_0x0093
            r0 = -2
            if (r1 == r0) goto L_0x00cc
            r0 = 2
            if (r1 != r0) goto L_0x0055
            A0M(r6, r5)
            return
        L_0x0080:
            boolean r0 = r3 instanceof X.AnonymousClass2LW
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "idverification/handleIntentV3Error result = "
            X.C36321k7.A1L(r3, r0, r1)
            int r0 = r3.A00
            switch(r0) {
                case -38: goto L_0x0097;
                case -37: goto L_0x0097;
                case -36: goto L_0x0097;
                case -35: goto L_0x0097;
                case -34: goto L_0x0097;
                case -33: goto L_0x00a4;
                case -32: goto L_0x0092;
                case -31: goto L_0x00a4;
                case -30: goto L_0x00a4;
                case -29: goto L_0x00a4;
                case -28: goto L_0x00a8;
                case -27: goto L_0x0092;
                case -26: goto L_0x00a8;
                case -25: goto L_0x0097;
                case -24: goto L_0x00a8;
                case -23: goto L_0x0092;
                case -22: goto L_0x00ac;
                case -21: goto L_0x00b0;
                case -20: goto L_0x00b0;
                case -19: goto L_0x00b0;
                case -18: goto L_0x00b0;
                case -17: goto L_0x00ac;
                case -16: goto L_0x0097;
                case -15: goto L_0x0097;
                case -14: goto L_0x0097;
                case -13: goto L_0x00b4;
                case -12: goto L_0x00b8;
                case -11: goto L_0x00bc;
                case -10: goto L_0x00c0;
                case -9: goto L_0x00c4;
                default: goto L_0x0092;
            }
        L_0x0092:
            return
        L_0x0093:
            r0 = 2131895581(0x7f12251d, float:1.9426E38)
            goto L_0x00cf
        L_0x0097:
            X.3Kc r2 = r6.A0K
            r1 = 21
            X.3v6 r0 = new X.3v6
            r0.<init>(r6, r1)
            r2.A02(r0)
            return
        L_0x00a4:
            r0 = 2131889614(0x7f120dce, float:1.9413897E38)
            goto L_0x00cf
        L_0x00a8:
            r0 = 2131889611(0x7f120dcb, float:1.941389E38)
            goto L_0x00cf
        L_0x00ac:
            r0 = 2131889610(0x7f120dca, float:1.9413888E38)
            goto L_0x00cf
        L_0x00b0:
            r0 = 2131889613(0x7f120dcd, float:1.9413895E38)
            goto L_0x00cf
        L_0x00b4:
            r0 = 2131889612(0x7f120dcc, float:1.9413892E38)
            goto L_0x00cf
        L_0x00b8:
            r0 = 2131889615(0x7f120dcf, float:1.9413899E38)
            goto L_0x00cf
        L_0x00bc:
            r0 = 2131889616(0x7f120dd0, float:1.94139E38)
            goto L_0x00cf
        L_0x00c0:
            r0 = 2131889617(0x7f120dd1, float:1.9413903E38)
            goto L_0x00c7
        L_0x00c4:
            r0 = 2131889618(0x7f120dd2, float:1.9413905E38)
        L_0x00c7:
            java.lang.String r1 = r6.getString(r0)
            goto L_0x00d3
        L_0x00cc:
            r0 = 2131895580(0x7f12251c, float:1.9425997E38)
        L_0x00cf:
            java.lang.String r1 = X.C36351kA.A0w(r6, r4, r2, r0)
        L_0x00d3:
            X.17Y r0 = r6.A05
            r0.A0E(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A07(android.content.Intent):void");
    }

    public static void A0F(Spanned spanned, TextEmojiLabel textEmojiLabel, IdentityVerificationActivity identityVerificationActivity) {
        C36331k8.A1A(identityVerificationActivity.A0D, textEmojiLabel);
        SpannableStringBuilder A0P2 = C36441kJ.A0P(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) A0P2.getSpans(0, A0P2.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                C36351kA.A18(A0P2, uRLSpan, C429721s.A00(identityVerificationActivity, uRLSpan, identityVerificationActivity.A06, identityVerificationActivity.A05, identityVerificationActivity.A08));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A0P2.removeSpan(removeSpan);
            }
        }
        C36331k8.A16(textEmojiLabel, identityVerificationActivity.A08);
        C36431kI.A1M(textEmojiLabel, A0P2);
    }

    public static void A0G(IdentityVerificationActivity identityVerificationActivity) {
        String obj;
        StringBuilder A0k;
        FileOutputStream fileOutputStream;
        Point point = new Point();
        IdentityVerificationActivity identityVerificationActivity2 = identityVerificationActivity;
        C36321k7.A0K(identityVerificationActivity2, point);
        int min = (Math.min(point.x, point.y) * 2) / 3;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        AnonymousClass3DX r14 = identityVerificationActivity2.A0W.A03;
        int i = r14.A01;
        int i2 = r14.A00;
        int i3 = min / 12;
        float f = ((float) (min - (i3 * 2))) * 1.0f;
        float f2 = f / ((float) i);
        float f3 = f / ((float) i2);
        Paint A0K2 = C36441kJ.A0K();
        A0K2.setColor(-16777216);
        int i4 = 0;
        while (true) {
            byte b = 1;
            if (i4 >= i) {
                break;
            }
            int i5 = 0;
            while (i5 < i2) {
                if (r14.A02[i5][i4] == b) {
                    float f4 = (float) i3;
                    float f5 = (((float) i4) * f2) + f4;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f5, (((float) i5) * f3) + f4, (((float) (i4 + 1)) * f2) + f4, f4 + (((float) (i5 + 1)) * f3), A0K2);
                }
                i5++;
                b = 1;
            }
            i4++;
        }
        File A0X2 = identityVerificationActivity2.A04.A0X("code.png");
        try {
            fileOutputStream = new FileOutputStream(A0X2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            Log.e("idverification/sharefailed", e);
            identityVerificationActivity2.A05.A06(R.string.f12nameremoved, 0);
            createBitmap.recycle();
            return;
        } catch (IOException e2) {
            try {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                createBitmap.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        createBitmap.recycle();
        C62353Fv r0 = identityVerificationActivity2.A0D.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (r0 != null) {
            String str = r0.A00;
            String str2 = r0.A01;
            if (str.compareTo(str2) <= 0) {
                A0k = C36331k8.A0k(str, str2);
            } else {
                A0k = C36331k8.A0k(str2, str);
            }
            String obj2 = A0k.toString();
            int length = obj2.length();
            for (int i6 = 1; i6 <= length; i6++) {
                A0u.append(obj2.charAt(i6 - 1));
                if (i6 != length) {
                    if (i6 % 20 == 0) {
                        A0u.append(10);
                    } else if (i6 % 5 == 0) {
                        C36421kH.A1N(A0u);
                    }
                }
            }
        }
        Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
        PhoneUserJid A0e = C36371kC.A0e(identityVerificationActivity2.A02);
        Object[] A0M2 = AnonymousClass001.A0M();
        C36411kG.A1H(identityVerificationActivity2.A00, C36391kE.A0w(identityVerificationActivity2), A0M2, 0);
        intent.putExtra("android.intent.extra.SUBJECT", C36391kE.A0v(identityVerificationActivity2, identityVerificationActivity2.A00.A0H(AnonymousClass3U8.A01(C203559oI.A00(), A0e.user)), A0M2, 1, R.string.f12nameremoved));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36351kA.A14(identityVerificationActivity2, A0u2, R.string.f12nameremoved);
        A0u2.append("\n");
        C18820ts r02 = identityVerificationActivity2.A00;
        String obj3 = A0u.toString();
        String[] split = obj3.split("\n");
        AnonymousClass046 r8 = C18820ts.A00(r02).A03;
        int length2 = obj3.length();
        StringBuilder sb = new StringBuilder(length2 + (r6 * 4));
        for (String str3 : split) {
            AnonymousClass048 r03 = AnonymousClass047.A04;
            if (str3 == null) {
                obj = null;
            } else {
                obj = r8.A03(r03, str3).toString();
            }
            sb.append(obj);
            sb.append(10);
        }
        C36351kA.A1K(sb, A0u2);
        intent.putExtra("android.intent.extra.TEXT", A0u2.toString());
        intent.putExtra("android.intent.extra.STREAM", AnonymousClass6YY.A01(identityVerificationActivity2.getApplicationContext(), A0X2));
        C36371kC.A18(intent, "image/png");
        identityVerificationActivity2.startActivity(Intent.createChooser(intent, (CharSequence) null));
        return;
        throw th;
    }

    public static void A0H(IdentityVerificationActivity identityVerificationActivity) {
        WaQrScannerView waQrScannerView = identityVerificationActivity.A0P;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            return;
        }
        if (identityVerificationActivity.A0C.A02("android.permission.CAMERA") != 0) {
            AnonymousClass3FM A002 = AnonymousClass3FM.A00(identityVerificationActivity);
            A002.A02 = R.string.f12nameremoved;
            A002.A03 = R.string.f12nameremoved;
            AnonymousClass3FM.A01(A002, "android.permission.CAMERA");
            identityVerificationActivity.startActivityForResult(A002.A02(), 1);
            return;
        }
        identityVerificationActivity.findViewById(R.id.overlay).setVisibility(0);
        identityVerificationActivity.A0P.setVisibility(0);
        identityVerificationActivity.A0T.setVisibility(8);
        identityVerificationActivity.A05.A0G(identityVerificationActivity.A0b);
    }

    public static void A0K(IdentityVerificationActivity identityVerificationActivity, String str, String str2) {
        identityVerificationActivity.A0J.A04.animate().alpha(0.0f).setDuration(150).setListener(new AnonymousClass4VH(identityVerificationActivity, str, str2, 1));
    }

    public static void A0M(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        identityVerificationActivity.A02.setVisibility(0);
        ImageView imageView = identityVerificationActivity.A02;
        int i = R.drawable.red_circle;
        if (z) {
            i = R.drawable.green_circle;
        }
        imageView.setBackgroundResource(i);
        ImageView imageView2 = identityVerificationActivity.A02;
        int i2 = R.string.f12nameremoved;
        if (z) {
            i2 = R.string.f12nameremoved;
        }
        C36331k8.A0q(identityVerificationActivity, imageView2, i2);
        ImageView imageView3 = identityVerificationActivity.A02;
        int i3 = R.drawable.ill_verification_failure;
        if (z) {
            i3 = R.drawable.ill_verification_success;
        }
        imageView3.setImageResource(i3);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation A0M2 = C36391kE.A0M(0.0f, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(A0M2);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        C36421kH.A0p(identityVerificationActivity.getResources(), animationSet, 17694721);
        identityVerificationActivity.A02.startAnimation(animationSet);
        identityVerificationActivity.A02.setFocusable(true);
        identityVerificationActivity.A02.setFocusableInTouchMode(true);
        identityVerificationActivity.A02.requestFocus();
        identityVerificationActivity.A05.A0I(identityVerificationActivity.A0b, 4000);
    }

    private void A0O(boolean z) {
        MenuItem menuItem = this.A0S;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        int i = 0;
        findViewById(R.id.footer).setVisibility(C36351kA.A00(z ? 1 : 0));
        findViewById(R.id.verify_identity_tip).setVisibility(C36351kA.A00(z));
        View findViewById = findViewById(R.id.qr_code_group);
        if (!z) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void A2F() {
        if (!this.A0X) {
            this.A0X = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r3 = A0L2.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r2 = r3.A00;
            C36321k7.A0X(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A06 = C36371kC.A0R(r3);
            this.A07 = C36381kD.A0W(r3);
            this.A09 = C36341k9.A0S(r3);
            this.A08 = C36341k9.A0R(r3);
            this.A0Q = C36331k8.A0I(r3);
            this.A0I = (AnonymousClass3FF) r2.A8I.get();
            this.A0A = C36401kF.A0U(r3);
            this.A0N = (C236919l) r3.A5Q.get();
            this.A05 = (C233418c) r3.A42.get();
            this.A0C = C36351kA.A0X(r3);
            this.A0H = (AnonymousClass1OD) r3.A2j.get();
            this.A0G = C36381kD.A0a(r3);
            this.A0M = C27111My.A2W(A0L2);
            this.A0B = (C30431aC) r3.A0Z.get();
            this.A0E = (C232217q) r3.A8j.get();
            this.A0O = (C32791eC) r2.A3L.get();
            this.A04 = (AnonymousClass3C8) A0L2.A2d.get();
            this.A0K = C27111My.A2P(A0L2);
        }
    }

    public void A2x(int i) {
        if (i == 101) {
            A0I(this);
            this.A0R = false;
        }
    }

    public void BYX(DeviceJid deviceJid, int i) {
        runOnUiThread(new C80293vA(this, deviceJid, 13));
    }

    public void BZ0(DeviceJid deviceJid) {
        A0J(this, deviceJid.userJid);
    }

    public void BZ1(DeviceJid deviceJid) {
        A0J(this, deviceJid.userJid);
    }

    public void BZ2(DeviceJid deviceJid) {
        A0J(this, deviceJid.userJid);
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0P;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0 && findViewById(R.id.main_layout).getVisibility() == 8) {
            this.A0K.A02((Runnable) null);
        } else {
            super.finish();
        }
    }

    public IdentityVerificationActivity(int i) {
        this.A0X = false;
        C89334Wd.A00(this, 42);
    }

    private void A01() {
        if (!C36411kG.A1X(this)) {
            runOnUiThread(new C80293vA(this, C023109s.A0C, 14));
        }
        Jid A0h = C36431kI.A0h(this.A0F);
        PhoneUserJid A0j = C36411kG.A0j(this);
        if (A0j != null) {
            UserJid[] userJidArr = new UserJid[2];
            C36331k8.A1N(A0h, A0j, userJidArr);
            C62123Ew A002 = this.A04.A00(new C75493nK(this), Arrays.asList(userJidArr));
            if (A002.A03.A01.A0E(2966)) {
                C80253v6.A01(A002.A05, A002, 43);
            }
        }
    }

    public static void A0I(IdentityVerificationActivity identityVerificationActivity) {
        float f;
        StringBuilder A0k;
        char c;
        boolean A1X = C36411kG.A1X(identityVerificationActivity);
        if (identityVerificationActivity.A0D != null) {
            identityVerificationActivity.A01();
            C62353Fv r0 = identityVerificationActivity.A0D.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            String str = null;
            if (r0 != null) {
                String str2 = r0.A00;
                String str3 = r0.A01;
                if (str2.compareTo(str3) <= 0) {
                    A0k = C36331k8.A0k(str2, str3);
                } else {
                    A0k = C36331k8.A0k(str3, str2);
                }
                String obj = A0k.toString();
                int length = obj.length();
                for (int i = 1; i <= length; i++) {
                    A0u.append(obj.charAt(i - 1));
                    if (i != length) {
                        if (i % 20 == 0) {
                            if (str == null) {
                                str = A0u.toString();
                            }
                            c = 10;
                        } else if (i % 5 == 0) {
                            A0u.append("     ");
                        } else if (!A1X) {
                            c = ' ';
                        }
                        A0u.append(c);
                    }
                }
            }
            if (A1X) {
                C48902iF.A00(identityVerificationActivity.A0J.A06, identityVerificationActivity, A0u, 11);
                identityVerificationActivity.A0J.A06.setEnabled(true);
                return;
            }
            float textSize = identityVerificationActivity.A0U.getTextSize();
            if (str != null) {
                f = identityVerificationActivity.A0U.getPaint().measureText(str);
            } else {
                f = 0.0f;
            }
            Point point = new Point();
            C36321k7.A0K(identityVerificationActivity, point);
            float min = ((float) Math.min(point.x, point.y)) - identityVerificationActivity.getResources().getDimension(R.dimen.f7nameremoved);
            while (f > min && textSize > 1.0f) {
                textSize -= 1.0f;
                identityVerificationActivity.A0U.setTextSize(textSize);
                f = identityVerificationActivity.A0U.getPaint().measureText(str);
            }
            identityVerificationActivity.A0U.setText(A0u.toString());
            identityVerificationActivity.A0U.setTextDirection(3);
            QrImageView qrImageView = (QrImageView) identityVerificationActivity.findViewById(R.id.qr_code);
            try {
                EnumMap enumMap = new EnumMap(C187798yY.class);
                AnonymousClass9S4 A002 = C200649ht.A00(C023109s.A00, new String(identityVerificationActivity.A0D.A02.A0o(), "ISO-8859-1"), enumMap);
                identityVerificationActivity.A0W = A002;
                qrImageView.setQrCode(A002);
            } catch (AnonymousClass92E | UnsupportedEncodingException e) {
                Log.w("idverification/", e);
            }
            identityVerificationActivity.A0O(true);
        } else if (!A1X) {
            identityVerificationActivity.A0O(false);
            TextView textView = identityVerificationActivity.A0U;
            Object[] objArr = new Object[1];
            C36371kC.A1K(identityVerificationActivity.A09, identityVerificationActivity.A0F, objArr, 0);
            C36341k9.A0s(identityVerificationActivity, textView, objArr, R.string.f12nameremoved);
        }
    }

    public static void A0J(IdentityVerificationActivity identityVerificationActivity, UserJid userJid) {
        if (C36431kI.A1V(identityVerificationActivity, userJid) || userJid.equals(C36431kI.A0h(identityVerificationActivity.A0F))) {
            identityVerificationActivity.runOnUiThread(new C80253v6(identityVerificationActivity, 25));
        }
    }

    public static void A0L(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        C75323n2 r4;
        identityVerificationActivity.Bnv();
        if (z) {
            r4 = identityVerificationActivity.A0a;
        } else {
            r4 = identityVerificationActivity.A0Z;
        }
        AnonymousClass3FF r1 = identityVerificationActivity.A0I;
        UserJid A0l = C36351kA.A0l(identityVerificationActivity.A0F);
        C19930wk r3 = r1.A09;
        r3.A02();
        new C50322kZ(r4, r1, A0l).A02.executeOnExecutor(r3, new Void[0]);
    }

    public void BRl(List list) {
        UserJid userJid;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                userJid = null;
            } else {
                userJid = deviceJid.userJid;
            }
            if (C1901797e.A00(C36431kI.A0h(this.A0F), userJid)) {
                A0L(this, false);
            }
        }
    }

    public void Bk5(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            A0J(this, userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0071, code lost:
        if (X.C36391kE.A1X(r9.A0D) == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            java.lang.String r1 = X.C36341k9.A0d(r9)     // Catch:{ 0wR -> 0x025b }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x025b }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A01(r1)     // Catch:{ 0wR -> 0x025b }
            r9.A0L = r1     // Catch:{ 0wR -> 0x025b }
            X.16D r0 = r9.A08
            X.141 r0 = r0.A0D(r1)
            r9.A0F = r0
            boolean r1 = X.C36411kG.A1X(r9)
            r0 = 2131625161(0x7f0e04c9, float:1.8877522E38)
            if (r1 == 0) goto L_0x0023
            r0 = 2131625162(0x7f0e04ca, float:1.8877524E38)
        L_0x0023:
            r9.setContentView((int) r0)
            boolean r0 = X.C36411kG.A1X(r9)
            r5 = 2131895595(0x7f12252b, float:1.9426027E38)
            if (r0 == 0) goto L_0x0032
            r5 = 2131895596(0x7f12252c, float:1.942603E38)
        L_0x0032:
            r9.setTitle(r5)
            androidx.appcompat.widget.Toolbar r4 = X.C36361kB.A0N(r9)
            r9.A0V = r4
            X.0ts r3 = r9.A00
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131231957(0x7f0804d5, float:1.808001E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131101044(0x7f060574, float:1.7814487E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A06(r1, r2, r0)
            X.4vb r0 = new X.4vb
            r0.<init>(r1, r3)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            androidx.appcompat.widget.Toolbar r0 = r9.A0V
            r0.setTitle((int) r5)
            X.0wQ r1 = r9.A02
            X.141 r0 = r9.A0F
            boolean r0 = X.C36361kB.A1X(r1, r0)
            if (r0 == 0) goto L_0x0073
            X.0yC r0 = r9.A0D
            boolean r1 = X.C36391kE.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            r6 = 1
            r5 = 0
            androidx.appcompat.widget.Toolbar r4 = r9.A0V
            if (r0 == 0) goto L_0x0120
            X.171 r2 = r9.A09
            X.0ts r1 = r9.A00
            X.141 r0 = r9.A0F
            java.lang.String r0 = X.C53722rm.A00(r9, r2, r1, r0)
        L_0x0084:
            r4.setSubtitle((java.lang.CharSequence) r0)
            androidx.appcompat.widget.Toolbar r1 = r9.A0V
            android.content.Context r0 = r1.getContext()
            X.AnonymousClass00C.A0D(r0, r5)
            int r0 = X.C224314h.A00(r0)
            r1.setBackgroundResource(r0)
            androidx.appcompat.widget.Toolbar r1 = r9.A0V
            r0 = 2132083846(0x7f150486, float:1.9807846E38)
            r1.A0J(r9, r0)
            androidx.appcompat.widget.Toolbar r2 = r9.A0V
            r1 = 2
            X.3Y3 r0 = new X.3Y3
            r0.<init>(r9, r1)
            r2.setNavigationOnClickListener(r0)
            androidx.appcompat.widget.Toolbar r0 = r9.A0V
            r9.setSupportActionBar(r0)
            boolean r0 = X.C36411kG.A1X(r9)
            if (r0 == 0) goto L_0x013e
            android.view.View r0 = r9.A00
            X.3AX r3 = new X.3AX
            r3.<init>(r0)
            r9.A0J = r3
            r0 = 2131895589(0x7f122525, float:1.9426015E38)
            java.lang.String r1 = r9.getString(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r9)
            int r2 = r0.widthPixels
            com.whatsapp.TextEmojiLabel r4 = r3.A04
            android.text.TextPaint r0 = r4.getPaint()
            float r1 = r0.measureText(r1)
            float r0 = (float) r2
            float r1 = r1 / r0
            double r0 = (double) r1
            double r2 = java.lang.Math.ceil(r0)
            int r1 = (int) r2
            int r0 = r4.getLineHeight()
            int r1 = r1 * r0
            int r0 = r4.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r4.getPaddingBottom()
            int r1 = r1 + r0
            r4.setHeight(r1)
            r9.A01()
            X.3AX r0 = r9.A0J
            com.whatsapp.settings.SettingsRowIconText r1 = r0.A07
            r0 = 14
            X.C48752hz.A00(r1, r9, r0)
            A0L(r9, r5)
            X.3AX r0 = r9.A0J
            com.whatsapp.settings.SettingsRowIconText r0 = r0.A06
            r0.setEnabled(r5)
            X.0xT r1 = r9.A0Q
            java.lang.String r0 = "28030015"
            java.lang.String r2 = r1.A05(r0)
            X.3AX r0 = r9.A0J
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            r0 = 2131886457(0x7f120179, float:1.9407493E38)
            java.lang.String r0 = X.C36351kA.A0w(r9, r2, r6, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            A0F(r0, r1, r9)
            return
        L_0x0120:
            r3 = 2131895574(0x7f122516, float:1.9425985E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.171 r1 = r9.A09
            X.141 r0 = r9.A0F
            X.C36371kC.A1K(r1, r0, r2, r5)
            java.lang.String r2 = r9.getString(r3, r2)
            androidx.appcompat.widget.Toolbar r0 = r9.A0V
            android.content.Context r1 = r0.getContext()
            X.1H2 r0 = r9.A0C
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r2)
            goto L_0x0084
        L_0x013e:
            r0 = 2131430844(0x7f0b0dbc, float:1.84834E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r9, r0)
            r9.A0U = r0
            r0 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A03 = r0
            r0 = 2131430021(0x7f0b0a85, float:1.8481731E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r9, r0)
            r9.A0T = r0
            r0 = 2131433067(0x7f0b166b, float:1.848791E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.qrcode.WaQrScannerView r0 = (com.whatsapp.qrcode.WaQrScannerView) r0
            r9.A0P = r0
            r0 = 2131430714(0x7f0b0d3a, float:1.8483137E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.A01 = r0
            X.0v0 r0 = r9.A09
            boolean r0 = r0.A2C()
            if (r0 != 0) goto L_0x0194
            X.0v0 r3 = r9.A09
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            java.lang.String r0 = "security_notifications_alert_timestamp"
            boolean r0 = r3.A2V(r0, r1)
            if (r0 == 0) goto L_0x0194
            android.view.View r3 = r9.A01
            r0 = 24
            X.3v6 r2 = new X.3v6
            r2.<init>(r9, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x0194:
            r0 = 2131429903(0x7f0b0a0f, float:1.8481492E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 3
            X.AnonymousClass3Y3.A00(r1, r9, r0)
            r0 = 2131428856(0x7f0b05f8, float:1.8479368E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 15
            X.C48752hz.A00(r1, r9, r0)
            X.3Kc r3 = r9.A0K
            android.view.View r2 = r9.A00
            com.whatsapp.jid.UserJid r1 = r9.A0L
            X.3Qu r0 = new X.3Qu
            r0.<init>(r9, r5)
            r3.A01(r2, r0, r1)
            X.3Kc r2 = r9.A0K
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A0G
            if (r1 == 0) goto L_0x01cc
            java.util.Map r0 = r2.A0I
            r1.setQrDecodeHints(r0)
            X.3MA r0 = new X.3MA
            r0.<init>(r2, r5)
            r1.setQrScannerCallback(r0)
        L_0x01cc:
            r9.A0O(r5)
            A0L(r9, r5)
            r0 = 2131433414(0x7f0b17c6, float:1.8488613E38)
            android.widget.ImageView r0 = X.C36431kI.A0P(r9, r0)
            r9.A02 = r0
            r0 = 2131433535(0x7f0b183f, float:1.8488858E38)
            android.view.View r1 = X.C03570Gk.A0B(r9, r0)
            r0 = 4
            X.AnonymousClass3Y3.A00(r1, r9, r0)
            boolean r0 = X.C19550w8.A0A()
            if (r0 != 0) goto L_0x0244
            X.0yE r1 = r9.A0C
            java.lang.String r0 = "android.permission.NFC"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0244
            android.nfc.NfcAdapter r8 = android.nfc.NfcAdapter.getDefaultAdapter(r9)
            if (r8 == 0) goto L_0x022d
            java.lang.Class<android.nfc.NfcAdapter> r3 = android.nfc.NfcAdapter.class
            java.lang.String r2 = "setNdefPushMessageCallback"
            r7 = 3
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            java.lang.Class<android.nfc.NfcAdapter$CreateNdefMessageCallback> r0 = android.nfc.NfcAdapter.CreateNdefMessageCallback.class
            r1[r5] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r1[r6] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            java.lang.Class<android.app.Activity[]> r0 = android.app.Activity[].class
            r4 = 2
            r1[r4] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            java.lang.reflect.Method r3 = r3.getMethod(r2, r1)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            android.app.Activity[] r2 = new android.app.Activity[r5]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            X.3WV r0 = new X.3WV     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            r0.<init>(r9)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            r1[r5] = r0     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            r1[r6] = r9     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            r1[r4] = r2     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            r3.invoke(r8, r1)     // Catch:{ IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x0227 }
            goto L_0x022d
        L_0x0227:
            r1 = move-exception
            java.lang.String r0 = "idverification/ "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x022d:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0244
            android.content.Intent r0 = r9.getIntent()
            r9.A07(r0)
        L_0x0244:
            X.1aC r0 = r9.A0B
            r0.registerObserver(r9)
            X.18c r0 = r9.A05
            r0.registerObserver(r9)
            X.17q r0 = r9.A0E
            r0.registerObserver(r9)
            X.19g r1 = r9.A0G
            X.192 r0 = r9.A0Y
            r1.registerObserver(r0)
            return
        L_0x025b:
            r1 = move-exception
            java.lang.String r0 = "idverification/finishing due to invalid jid"
            com.whatsapp.util.Log.e(r0, r1)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!C36411kG.A1X(this)) {
            MenuItem icon = menu.add(0, R.id.menuitem_share, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_share);
            this.A0S = icon;
            icon.setShowAsAction(2);
            this.A0S.setVisible(AnonymousClass000.A1V(this.A0D));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0B.unregisterObserver(this);
        this.A05.unregisterObserver(this);
        this.A0E.unregisterObserver(this);
        this.A0G.unregisterObserver(this.A0Y);
        this.A05.A0G(this.A0b);
        C63453Kc r1 = this.A0K;
        r1.A02 = null;
        r1.A0G = null;
        r1.A0F = null;
        r1.A01 = null;
        r1.A06 = null;
        r1.A05 = null;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            A07(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_share) {
            WaQrScannerView waQrScannerView = this.A0P;
            if (waQrScannerView == null || waQrScannerView.getVisibility() != 0) {
                A0G(this);
                return true;
            }
            this.A0K.A02(new C80253v6(this, 20));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        if (!C36411kG.A1X(this) && this.A0P.getVisibility() == 0) {
            this.A0P.setVisibility(4);
        }
    }

    public void onResume() {
        super.onResume();
        if (!C36411kG.A1X(this) && this.A0P.getVisibility() == 4) {
            this.A0P.setVisibility(0);
        }
    }

    public IdentityVerificationActivity() {
        this(0);
        this.A0b = new C80253v6(this, 22);
        this.A0Y = new C90024Yu(this, 2);
        this.A0Z = new AnonymousClass4WE(this, 0);
        this.A0a = new AnonymousClass4WE(this, 1);
    }
}
