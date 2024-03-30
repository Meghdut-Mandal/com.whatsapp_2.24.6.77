package androidx.biometric;

import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0Y0;
import X.AnonymousClass759;
import X.AnonymousClass75C;
import X.AnonymousClass93J;
import X.AnonymousClass9G0;
import X.AnonymousClass9RB;
import X.BA6;
import X.C001700s;
import X.C02680Bk;
import X.C06640Ul;
import X.C07610Yn;
import X.C129206Fv;
import X.C132626Uo;
import X.C166487w0;
import X.C166877wx;
import X.C167717yg;
import X.C192769Im;
import X.C193769Mu;
import X.C196269Ym;
import X.C202529m7;
import X.C207669va;
import X.C21737AYq;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;
import X.C81333wq;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricFragment extends AnonymousClass02E {
    public Handler A00 = C36341k9.A0H();
    public C167717yg A01;

    public void A1a(int i) {
        String string;
        if (i == 3 || !this.A01.A0M) {
            if (A09(this)) {
                this.A01.A00 = i;
                if (i == 1) {
                    Context A1D = A1D();
                    if (A1D == null) {
                        string = "";
                    } else {
                        string = A1D.getString(R.string.f12nameremoved);
                    }
                    A07(this, string, 10);
                }
            }
            C167717yg r0 = this.A01;
            C192769Im r4 = r0.A07;
            if (r4 == null) {
                r4 = new C192769Im();
                r0.A07 = r4;
            }
            CancellationSignal cancellationSignal = r4.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                r4.A00 = null;
            }
            C02680Bk r02 = r4.A01;
            if (r02 != null) {
                try {
                    r02.A03();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                r4.A01 = null;
            }
        }
    }

    public void A1c(C193769Mu r7) {
        C132626Uo r5 = null;
        AnonymousClass01I A0h = A0h();
        if (A0h == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        C167717yg r3 = this.A01;
        r3.A06 = r7;
        int i = r7.A00;
        if (i == 0) {
            i = 255;
            if (r7.A05) {
                i = 33023;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 < 30 && i == 15) {
            r5 = C129206Fv.A01();
        }
        r3.A05 = r5;
        boolean A1d = A1d();
        C167717yg r1 = this.A01;
        String str = null;
        if (A1d) {
            str = A0n(R.string.f12nameremoved);
        }
        r1.A0G = str;
        if (A1d() && new C202529m7(new C207669va(A0h)).A03(255) != 0) {
            this.A01.A0I = true;
            A05(this);
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new AnonymousClass759(this, 2), 600);
        } else {
            A1Z();
        }
    }

    private void A00() {
        this.A01.A0N = false;
        if (A12()) {
            AnonymousClass01z A0l = A0l();
            DialogFragment dialogFragment = (DialogFragment) A0l.A0N("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment == null) {
                return;
            }
            if (dialogFragment.A12()) {
                dialogFragment.A1c();
                return;
            }
            AnonymousClass09Y r0 = new AnonymousClass09Y(A0l);
            r0.A08(dialogFragment);
            r0.A02();
        }
    }

    public static void A06(BiometricFragment biometricFragment, AnonymousClass9G0 r4) {
        C167717yg r1 = biometricFragment.A01;
        if (!r1.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            r1.A0I = false;
            Executor executor = r1.A0H;
            if (executor == null) {
                executor = new C21737AYq();
            }
            executor.execute(new AnonymousClass75C((Object) biometricFragment, (Object) r4, 0));
        }
        biometricFragment.A1Y();
    }

    public static void A07(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        C167717yg r3 = biometricFragment.A01;
        if (r3.A0J) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!r3.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            r3.A0I = false;
            Executor executor = r3.A0H;
            if (executor == null) {
                executor = new C21737AYq();
            }
            executor.execute(new C81333wq(biometricFragment, i, 0, charSequence));
        }
    }

    public static boolean A08(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(R.array.f3nameremoved)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(BiometricFragment biometricFragment) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return true;
        }
        AnonymousClass01I A0h = biometricFragment.A0h();
        if (A0h != null && biometricFragment.A01.A05 != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i != 28) {
                return false;
            }
            if (str != null) {
                for (String equalsIgnoreCase : A0h.getResources().getStringArray(R.array.f3nameremoved)) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        return true;
                    }
                }
            }
            if (str2 != null) {
                for (String startsWith : A0h.getResources().getStringArray(R.array.f3nameremoved)) {
                    if (str2.startsWith(startsWith)) {
                        return true;
                    }
                }
            }
        } else if (i != 28) {
            return false;
        }
        if (!AnonymousClass93J.A00(biometricFragment.A1D())) {
            return true;
        }
        return false;
    }

    public void A1Y() {
        this.A01.A0N = false;
        A00();
        if (!this.A01.A0J && A12()) {
            AnonymousClass09Y r0 = new AnonymousClass09Y(A0l());
            r0.A08(this);
            r0.A02();
        }
        Context A1D = A1D();
        if (A1D != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String equals : A1D.getResources().getStringArray(R.array.f3nameremoved)) {
                    if (str.equals(equals)) {
                        C167717yg r1 = this.A01;
                        r1.A0K = true;
                        this.A00.postDelayed(new AnonymousClass759(r1, 3), 600);
                        return;
                    }
                }
            }
        }
    }

    public void A1Z() {
        int i;
        String str;
        int i2;
        if (this.A01.A0N) {
            return;
        }
        if (A1D() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        C167717yg r2 = this.A01;
        r2.A0N = true;
        r2.A0I = true;
        if (A09(this)) {
            Context applicationContext = A0a().getApplicationContext();
            C07610Yn r6 = new C07610Yn(applicationContext);
            if (!r6.A06()) {
                i = 12;
            } else if (!r6.A05()) {
                i = 11;
            } else if (A12()) {
                this.A01.A0L = true;
                if (!A08(applicationContext, Build.MODEL)) {
                    this.A00.postDelayed(new AnonymousClass759(this, 1), 500);
                    new FingerprintDialogFragment().A1f(A0l(), "androidx.biometric.FingerprintDialogFragment");
                }
                C167717yg r22 = this.A01;
                r22.A00 = 0;
                C132626Uo r3 = r22.A05;
                AnonymousClass0Y0 r5 = null;
                if (r3 != null) {
                    Cipher cipher = r3.A01;
                    if (cipher != null) {
                        r5 = new AnonymousClass0Y0(cipher);
                    } else {
                        Signature signature = r3.A00;
                        if (signature != null) {
                            r5 = new AnonymousClass0Y0(signature);
                        } else {
                            Mac mac = r3.A02;
                            if (mac != null) {
                                r5 = new AnonymousClass0Y0(mac);
                            } else if (Build.VERSION.SDK_INT >= 30 && r3.A00() != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
                C167717yg r7 = this.A01;
                C192769Im r1 = r7.A07;
                if (r1 == null) {
                    r1 = new C192769Im();
                    r7.A07 = r1;
                }
                C02680Bk r32 = r1.A01;
                if (r32 == null) {
                    r32 = new C02680Bk();
                    r1.A01 = r32;
                }
                AnonymousClass9RB r23 = r7.A03;
                if (r23 == null) {
                    r23 = new AnonymousClass9RB(new C166487w0(r7));
                    r7.A03 = r23;
                }
                C06640Ul r12 = r23.A00;
                if (r12 == null) {
                    r12 = new C166877wx(r23);
                    r23.A00 = r12;
                }
                try {
                    r6.A04(r12, r5, r32);
                    return;
                } catch (NullPointerException e) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e);
                    i = 1;
                    if (applicationContext != null) {
                        i2 = R.string.f12nameremoved;
                    }
                }
            } else {
                return;
            }
            if (applicationContext != null) {
                if (11 != i) {
                    i2 = R.string.f12nameremoved;
                } else {
                    i2 = R.string.f12nameremoved;
                }
                str = applicationContext.getString(i2);
                A07(this, str, i);
                A1Y();
                return;
            }
            str = "";
            A07(this, str, i);
            A1Y();
            return;
        }
        A03();
    }

    public boolean A1d() {
        if (Build.VERSION.SDK_INT > 28 || (this.A01.A0S() & 32768) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r1 != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r8 = this;
            android.content.Context r0 = r8.A0a()
            android.content.Context r0 = r0.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r4 = X.C202999n6.A00(r0)
            X.7yg r0 = r8.A01
            X.9Mu r0 = r0.A06
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r1 = r0.A03
            java.lang.CharSequence r0 = r0.A02
            if (r1 == 0) goto L_0x001b
            X.C202999n6.A06(r4, r1)
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            X.C202999n6.A05(r4, r0)
        L_0x0020:
            X.7yg r0 = r8.A01
            java.lang.CharSequence r3 = r0.A0G
            if (r3 != 0) goto L_0x0030
            X.9Mu r0 = r0.A06
            if (r0 == 0) goto L_0x00c9
            java.lang.CharSequence r3 = r0.A01
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = ""
        L_0x0030:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0051
            X.7yg r0 = r8.A01
            java.util.concurrent.Executor r2 = r0.A0H
            if (r2 != 0) goto L_0x0041
            X.AYq r2 = new X.AYq
            r2.<init>()
        L_0x0041:
            X.7yg r1 = r8.A01
            android.content.DialogInterface$OnClickListener r0 = r1.A02
            if (r0 != 0) goto L_0x004e
            X.9pF r0 = new X.9pF
            r0.<init>(r1)
            r1.A02 = r0
        L_0x004e:
            X.C202999n6.A02(r0, r4, r3, r2)
        L_0x0051:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L_0x0066
            X.7yg r0 = r8.A01
            X.9Mu r0 = r0.A06
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.A04
            r0 = 0
            if (r1 == 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            X.AnonymousClass9Yk.A00(r4, r0)
        L_0x0066:
            X.7yg r0 = r8.A01
            int r2 = r0.A0S()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x00bb
            X.AnonymousClass93F.A00(r4, r2)
        L_0x0075:
            android.hardware.biometrics.BiometricPrompt r7 = X.C202999n6.A01(r4)
            android.content.Context r6 = r8.A1D()
            X.7yg r0 = r8.A01
            X.6Uo r0 = r0.A05
            android.hardware.biometrics.BiometricPrompt$CryptoObject r5 = X.C129206Fv.A00(r0)
            X.7yg r1 = r8.A01
            X.9Im r0 = r1.A07
            if (r0 != 0) goto L_0x0092
            X.9Im r0 = new X.9Im
            r0.<init>()
            r1.A07 = r0
        L_0x0092:
            android.os.CancellationSignal r4 = r0.A00
            if (r4 != 0) goto L_0x009d
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            r0.A00 = r4
        L_0x009d:
            X.AYp r3 = new X.AYp
            r3.<init>()
            X.7yg r2 = r8.A01
            X.9RB r1 = r2.A03
            if (r1 != 0) goto L_0x00b4
            X.7w0 r0 = new X.7w0
            r0.<init>(r2)
            X.9RB r1 = new X.9RB
            r1.<init>(r0)
            r2.A03 = r1
        L_0x00b4:
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r0 = r1.A00()
            if (r5 != 0) goto L_0x00d0
            goto L_0x00cc
        L_0x00bb:
            if (r1 < r3) goto L_0x0075
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1P(r2)
            X.AnonymousClass9Yk.A01(r4, r0)
            goto L_0x0075
        L_0x00c9:
            r3 = 0
            goto L_0x0030
        L_0x00cc:
            X.C202999n6.A04(r0, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d4 }
            return
        L_0x00d0:
            X.C202999n6.A03(r0, r5, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d4 }
            goto L_0x00f0
        L_0x00d4:
            r2 = move-exception
            java.lang.String r1 = "BiometricFragment"
            java.lang.String r0 = "Got NPE while authenticating with biometric prompt."
            android.util.Log.e(r1, r0, r2)
            if (r6 == 0) goto L_0x00ed
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
            java.lang.String r1 = r6.getString(r0)
        L_0x00e5:
            r0 = 1
            A07(r8, r1, r0)
            r8.A1Y()
            return
        L_0x00ed:
            java.lang.String r1 = ""
            goto L_0x00e5
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A03():void");
    }

    public static void A05(BiometricFragment biometricFragment) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        int i2;
        AnonymousClass01I A0h = biometricFragment.A0h();
        if (A0h == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager A002 = C196269Ym.A00(A0h);
        if (A002 == null) {
            i = 12;
            i2 = R.string.f12nameremoved;
        } else {
            C193769Mu r0 = biometricFragment.A01.A06;
            if (r0 != null) {
                charSequence = r0.A03;
                charSequence2 = r0.A02;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            if (charSequence2 == null) {
                charSequence2 = null;
            }
            Intent createConfirmDeviceCredentialIntent = A002.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent == null) {
                i = 14;
                i2 = R.string.f12nameremoved;
            } else {
                biometricFragment.A01.A0J = true;
                if (A09(biometricFragment)) {
                    biometricFragment.A00();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                biometricFragment.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A07(biometricFragment, biometricFragment.A0n(i2), i);
        biometricFragment.A1Y();
    }

    public void A1B() {
        super.A1B();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J) {
            AnonymousClass01I A0h = A0h();
            if (A0h == null || !A0h.isChangingConfigurations()) {
                A1a(0);
            }
        }
    }

    public void A1M() {
        super.A1M();
        if (Build.VERSION.SDK_INT == 29) {
            C167717yg r4 = this.A01;
            if ((r4.A0S() & 32768) != 0) {
                r4.A0M = true;
                this.A00.postDelayed(new AnonymousClass759(r4, 4), 250);
            }
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A06(this, new AnonymousClass9G0((C132626Uo) null, 1));
                return;
            }
            A07(this, A0n(R.string.f12nameremoved), 10);
            A1Y();
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            C167717yg r0 = (C167717yg) C36441kJ.A0b(A0h).A00(C167717yg.class);
            this.A01 = r0;
            C001700s r1 = r0.A0A;
            if (r1 == null) {
                r1 = C36431kI.A0S();
                r0.A0A = r1;
            }
            BA6.A00(this, r1, 0);
            C167717yg r02 = this.A01;
            C001700s r12 = r02.A08;
            if (r12 == null) {
                r12 = C36431kI.A0S();
                r02.A08 = r12;
            }
            BA6.A00(this, r12, 1);
            C167717yg r03 = this.A01;
            C001700s r13 = r03.A09;
            if (r13 == null) {
                r13 = C36431kI.A0S();
                r03.A09 = r13;
            }
            BA6.A00(this, r13, 2);
            C167717yg r04 = this.A01;
            C001700s r14 = r04.A0D;
            if (r14 == null) {
                r14 = C36431kI.A0S();
                r04.A0D = r14;
            }
            BA6.A00(this, r14, 3);
            C167717yg r05 = this.A01;
            C001700s r15 = r05.A0F;
            if (r15 == null) {
                r15 = C36431kI.A0S();
                r05.A0F = r15;
            }
            BA6.A00(this, r15, 4);
            C167717yg r06 = this.A01;
            C001700s r16 = r06.A0E;
            if (r16 == null) {
                r16 = C36431kI.A0S();
                r06.A0E = r16;
            }
            BA6.A00(this, r16, 5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r1 != 3) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        if (A08(r1, android.os.Build.MODEL) == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1b(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0003;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 8
        L_0x0005:
            android.content.Context r2 = r4.A1D()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x002e
            r0 = 7
            if (r5 == r0) goto L_0x0016
            r0 = 9
            if (r5 != r0) goto L_0x002e
        L_0x0016:
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.C196269Ym.A01(r2)
            if (r0 == 0) goto L_0x002e
            X.7yg r0 = r4.A01
            int r1 = r0.A0S()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002e
            A05(r4)
            return
        L_0x002e:
            boolean r0 = A09(r4)
            if (r0 == 0) goto L_0x0084
            if (r6 != 0) goto L_0x003e
            android.content.Context r2 = r4.A1D()
            if (r2 != 0) goto L_0x0051
            java.lang.String r6 = ""
        L_0x003e:
            r1 = 5
            X.7yg r0 = r4.A01
            if (r5 != r1) goto L_0x009b
            int r1 = r0.A00
            if (r1 == 0) goto L_0x004a
            r0 = 3
            if (r1 != r0) goto L_0x004d
        L_0x004a:
            A07(r4, r6, r5)
        L_0x004d:
            r4.A1Y()
            return
        L_0x0051:
            r1 = 1
            r0 = 2131896624(0x7f122930, float:1.9428115E38)
            if (r5 == r1) goto L_0x006f
            r0 = 7
            if (r5 == r0) goto L_0x0080
            switch(r5) {
                case 9: goto L_0x0080;
                case 10: goto L_0x0074;
                case 11: goto L_0x0078;
                case 12: goto L_0x007c;
                default: goto L_0x005d;
            }
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown error code: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
        L_0x006f:
            java.lang.String r6 = r2.getString(r0)
            goto L_0x003e
        L_0x0074:
            r0 = 2131896628(0x7f122934, float:1.9428123E38)
            goto L_0x006f
        L_0x0078:
            r0 = 2131896627(0x7f122933, float:1.942812E38)
            goto L_0x006f
        L_0x007c:
            r0 = 2131896625(0x7f122931, float:1.9428117E38)
            goto L_0x006f
        L_0x0080:
            r0 = 2131896626(0x7f122932, float:1.9428119E38)
            goto L_0x006f
        L_0x0084:
            if (r6 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
            java.lang.String r0 = r4.A0n(r0)
            r1.append(r0)
            java.lang.String r0 = " "
            java.lang.String r6 = X.AnonymousClass000.A0r(r0, r1, r5)
            goto L_0x004a
        L_0x009b:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00ab
            A07(r4, r6, r5)
            r4.A1Y()
        L_0x00a5:
            X.7yg r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        L_0x00ab:
            r2 = r6
            if (r6 != 0) goto L_0x00b5
            r0 = 2131896491(0x7f1228ab, float:1.9427845E38)
            java.lang.String r2 = r4.A0n(r0)
        L_0x00b5:
            X.7yg r1 = r4.A01
            r0 = 2
            r1.A0T(r0)
            X.7yg r0 = r4.A01
            r0.A0U(r2)
            android.os.Handler r3 = r4.A00
            r0 = 1
            X.3wq r2 = new X.3wq
            r2.<init>(r4, r5, r0, r6)
            android.content.Context r1 = r4.A1D()
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = A08(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00d9
        L_0x00d7:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x00d9:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A1b(int, java.lang.CharSequence):void");
    }
}
