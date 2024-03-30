package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.companionmode.registration.CompanionBootstrapActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.413  reason: invalid class name */
public class AnonymousClass413 implements C25711Hj {
    public Object A00;
    public final int A01;

    public AnonymousClass413(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        C19980wp r0;
        int i;
        switch (this.A01) {
            case 0:
                AnonymousClass2ZE r1 = (AnonymousClass2ZE) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    int incrementAndGet = (r1.A09.incrementAndGet() * 100) / 3;
                    Iterator A0s = C36361kB.A0s(r1);
                    while (A0s.hasNext()) {
                        CompanionBootstrapActivity companionBootstrapActivity = ((C587730z) A0s.next()).A00;
                        companionBootstrapActivity.runOnUiThread(new C81283wl((Object) companionBootstrapActivity, incrementAndGet, 22));
                    }
                    return;
                }
                return;
            case 1:
                C608539p r3 = (C608539p) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    r0 = r3.A03;
                    i = 3;
                } else {
                    Iterator it = C201669k5.A09.iterator();
                    while (it.hasNext()) {
                        r3.A04.A03(AnonymousClass001.A0C(it));
                    }
                    r0 = r3.A03;
                    i = 0;
                }
                C36341k9.A0v(C19980wp.A00(r0).edit(), "companion_syncd_critical_bootstrap_state", i);
                return;
            case 2:
                C30591aS r2 = (C30591aS) this.A00;
                C220712t.A02(r2.A08, false);
                AnonymousClass196 r02 = r2.A04;
                C19770wU r32 = r02.A0W;
                AnonymousClass1AK r22 = r02.A0J;
                Objects.requireNonNull(r22);
                r32.Boy(new C35671j4(r22, 33));
                return;
            case 3:
                C30771ak r12 = ((C30761aj) this.A00).A01;
                synchronized (r12) {
                    r12.A00 = null;
                }
                return;
            case 4:
                C20260xH r6 = (C20260xH) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    r6.A0P.A01(8);
                    AnonymousClass1E9 r5 = r6.A0j;
                    r5.A01();
                    if (r6.A0e.A0E(877)) {
                        r5.A09.BpM(r5.A0A, "ToSGatingRepository/requestRefresh", 0);
                    }
                    Iterator A0s2 = C36361kB.A0s(r6);
                    while (A0s2.hasNext()) {
                        AnonymousClass3LD r23 = (AnonymousClass3LD) A0s2.next();
                        if (r23 instanceof AnonymousClass2FT) {
                            AnonymousClass2FT r24 = (AnonymousClass2FT) r23;
                            Log.i("EventCompanionRegistrationObserver/ Companion device bootstrap successful");
                            if (!r24.A03.A0E(7306)) {
                                Log.i("EventCompanionRegistrationObserver/ skipping, feature not enabled");
                            } else {
                                r24.A04.Bp1(C80243v5.A00(r24, 0));
                            }
                        } else {
                            AnonymousClass4W1 r25 = (AnonymousClass4W1) r23;
                            if (r25.A01 == 0) {
                                Context context = (Context) r25.A00;
                                Intent A09 = AnonymousClass190.A09(context);
                                A09.addFlags(268468224);
                                context.startActivity(A09);
                            }
                        }
                    }
                    return;
                }
                Log.e("companion/registration/onRegistrationSuccess critical bootstrap fails");
                r6.A09("critical_sync_timeout", true, true);
                return;
            case 5:
                C20260xH r52 = (C20260xH) this.A00;
                if (((long) AnonymousClass000.A0I(obj)) == 429) {
                    Iterator A0s3 = C36361kB.A0s(r52);
                    while (A0s3.hasNext()) {
                        AnonymousClass3LD r13 = (AnonymousClass3LD) A0s3.next();
                        if (r13 instanceof AnonymousClass4W1) {
                            AnonymousClass4W1 r14 = (AnonymousClass4W1) r13;
                            if (2 - r14.A01 == 0) {
                                Log.i("companion/registration/link code too many attempts");
                                Activity activity = (Activity) r14.A00;
                                activity.runOnUiThread(C80213v2.A00(activity, 22));
                            }
                        }
                    }
                    return;
                }
                r52.A05();
                return;
            case 6:
                C20260xH r53 = (C20260xH) this.A00;
                Log.i("companion/registration/companion-hello/received IQ response");
                r53.A0p.set(obj);
                r53.A0P.A01(12);
                Runnable runnable = r53.A0A;
                if (runnable != null) {
                    r53.A0k.Bnx(runnable);
                }
                r53.A0A = r53.A0k.BpM(new C35671j4(r53, 38), "CompanionRegistrationManager/linkCodeRefTimeoutRunnable", 195000);
                return;
            case 7:
                AnonymousClass2bU.A00((AnonymousClass2bU) this.A00).A0L = (String) obj;
                return;
            default:
                AnonymousClass33E r26 = (AnonymousClass33E) this.A00;
                Iterable iterable = (Iterable) obj;
                C36331k8.A1I(r26, iterable);
                ArrayList A07 = AnonymousClass03U.A07(iterable);
                AnonymousClass00C.A0D(A07, 0);
                r26.A00.A0C(A07);
                return;
        }
    }
}
