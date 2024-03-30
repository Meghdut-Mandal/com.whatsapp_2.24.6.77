package X;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.android.recaptcha.internal.zzam;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9XW  reason: invalid class name */
public final class AnonymousClass9XW {
    public int A00 = -1;
    public RecaptchaTasksClient A01;
    public C188258zI A02 = C188258zI.ABPROP_NOT_CHECKED;
    public Exception A03;
    public AtomicBoolean A04 = C36431kI.A1H();
    public Boolean A05;
    public final C19970wo A06;
    public final C19420v0 A07;
    public final C26151Jb A08;
    public final AnonymousClass1X1 A09;
    public final C19600wD A0A;
    public final C21060yb A0B;
    public final C21520zN A0C;
    public final C129886Iv A0D;

    public final void A01(Application application) {
        String str;
        String str2;
        AnonymousClass00C.A0D(application, 0);
        if (!A02()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RecaptchaClientHandler/recaptcha is not enabled for this user: ");
            str2 = C36381kD.A10(A0u, this.A00);
        } else {
            TelephonyManager A0K = this.A0B.A0K();
            if (A0K != null) {
                str = A0K.getSimCountryIso();
            } else {
                str = null;
            }
            if (C007103b.A0j(C129886Iv.A00, str) || "gb".equalsIgnoreCase(str)) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("RecaptchaClientHandler/sim country makes recaptcha unusable: \"");
                A0u2.append(str);
                Log.i(AnonymousClass000.A0t(A0u2, '\"'));
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Ineligible country: \"");
                A0u3.append(str);
                this.A03 = AnonymousClass001.A09(AnonymousClass000.A0t(A0u3, '\"'));
                this.A02 = C188258zI.INIT_FAILED;
                return;
            } else if (this.A01 != null) {
                str2 = "RecaptchaClientHandler/client already initialised";
            } else {
                AtomicBoolean atomicBoolean = this.A04;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    str2 = "RecaptchaClientHandler/client is already being initialised - exiting early";
                } else if (!this.A0A.A09()) {
                    Log.i("RecaptchaClientHandler/Not initialising ReCAPTCHA client due to not having network access");
                    this.A08.A00(C188648zz.A0I, "No internet connectivity");
                    this.A03 = AnonymousClass001.A09("No internet");
                    this.A02 = C188258zI.INIT_FAILED;
                    atomicBoolean.set(false);
                    return;
                } else {
                    this.A02 = C188258zI.INIT_STARTED;
                    AnonymousClass1X1 r5 = this.A09;
                    r5.A00("RECAPTCHA_INIT_");
                    try {
                        Task zzd = zzam.zzd(application, "6LcgaR4pAAAAAFMQmjEQyA7UegLcjegCi241YDXv", 10000);
                        zzd.addOnSuccessListener(new C1903297y(new C22418AmJ(this), 2));
                        zzd.addOnFailureListener(new B9C(this, 0));
                        return;
                    } catch (Exception e) {
                        this.A08.A01(C188648zz.A0I, "exceptionThrown", e);
                        C36321k7.A1J(e, "RecaptchaClientHandler/Exception caught in initialisation of client/", AnonymousClass000.A0u());
                        this.A03 = e;
                        this.A02 = C188258zI.INIT_FAILED;
                        r5.A01("RECAPTCHA_INIT_", "EXCEPTION");
                        atomicBoolean.set(false);
                        return;
                    }
                }
            }
        }
        Log.i(str2);
    }

    public final AnonymousClass00I A00() {
        AnonymousClass005 r4 = this.A07.A00;
        String string = C36391kE.A0H(r4).getString("less_beep_beep_identi", (String) null);
        Long valueOf = Long.valueOf(C36371kC.A08(C36391kE.A0H(r4), "less_beep_beep_time"));
        if (string != null) {
            return new AnonymousClass00I(string, valueOf);
        }
        return null;
    }

    public final boolean A02() {
        C188258zI r0;
        Boolean bool = this.A05;
        if (bool == null) {
            int i = this.A00;
            boolean z = true;
            if (i < 0) {
                C19420v0 r4 = this.A07;
                int i2 = C36341k9.A0E(r4).getInt("more_sheep_random_number", -1);
                i = AnonymousClass0XG.A01.A03(1, 1000);
                if (i2 < 0) {
                    C36341k9.A0v(C19420v0.A00(r4), "more_sheep_random_number", i);
                    this.A00 = i;
                } else {
                    this.A00 = i2;
                    i = i2;
                }
            }
            if (i >= this.A0C.A07(7343)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.A05 = valueOf;
            AnonymousClass00C.A0E(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
            if (valueOf.booleanValue()) {
                r0 = C188258zI.ABPROP_ENABLED;
            } else {
                r0 = C188258zI.ABPROP_DISABLED;
            }
            this.A02 = r0;
            bool = this.A05;
        }
        AnonymousClass00C.A0E(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    public AnonymousClass9XW(C19600wD r2, C21060yb r3, C19970wo r4, C19420v0 r5, C26151Jb r6, C21520zN r7, AnonymousClass1X1 r8, C129886Iv r9) {
        C36321k7.A11(r4, r3, r7);
        C36381kD.A1K(r9, 5, r5);
        AnonymousClass00C.A0D(r2, 8);
        this.A06 = r4;
        this.A0B = r3;
        this.A0C = r7;
        this.A08 = r6;
        this.A0D = r9;
        this.A09 = r8;
        this.A07 = r5;
        this.A0A = r2;
    }
}
