package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1JL  reason: invalid class name */
public final class AnonymousClass1JL extends C19590wC {
    public int A00 = 200;
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public float A02;
    public final Context A03;
    public final C20810yC A04;
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass1JP(this));
    public final AnonymousClass00T A06 = new AnonymousClass00U(new AnonymousClass1JO(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass1JQ(this));
    public final AnonymousClass00T A08;
    public final C19900wh A09;
    public final AnonymousClass13J A0A;

    public AnonymousClass1JL(Context context, C19900wh r4, C20810yC r5, AnonymousClass13J r6, AnonymousClass00T r7) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 5);
        this.A04 = r5;
        this.A08 = r7;
        this.A09 = r4;
        this.A03 = context;
        this.A0A = r6;
    }

    public final Intent A01(Activity activity, Intent intent) {
        AnonymousClass00C.A0D(activity, 0);
        if (!A0C() || intent.getStringExtra("primary_container_class") != null) {
            return intent;
        }
        Intent A032 = AnonymousClass190.A03(activity);
        A032.setData(intent.getData());
        A032.putExtras(intent);
        A032.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
        A032.putExtra("secondary_container_class", "com.whatsapp.Conversation");
        return A032;
    }

    public final void A04(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        float A012 = AnonymousClass1R1.A01(activity) / activity.getResources().getDisplayMetrics().density;
        float A002 = AnonymousClass1R1.A00(activity) / activity.getResources().getDisplayMetrics().density;
        if (A012 > A002) {
            A012 = A002;
        }
        this.A02 = A012;
    }

    public final void A05(Activity activity, AnonymousClass026 r7) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(r7, 1);
        if (A08()) {
            Executor A072 = AnonymousClass00F.A07(activity);
            AnonymousClass00C.A08(A072);
            C208089xd r3 = (C208089xd) ((C201089ip) this.A08.getValue()).A01;
            ReentrantLock reentrantLock = C208089xd.A04;
            reentrantLock.lock();
            try {
                if (r3.A00 == null) {
                    Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                    r7.accept(C023409w.A00);
                } else {
                    C61903Dy r1 = new C61903Dy(activity, r7, A072);
                    r3.A02.add(r1);
                    List list = r3.A01.A00;
                    if (list == null) {
                        list = C023409w.A00;
                    }
                    r1.A00(list);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void A06(AnonymousClass026 r6) {
        AnonymousClass00C.A0D(r6, 0);
        if (A08()) {
            C208089xd r0 = (C208089xd) ((C201089ip) this.A08.getValue()).A01;
            ReentrantLock reentrantLock = C208089xd.A04;
            reentrantLock.lock();
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = r0.A02;
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C61903Dy r1 = (C61903Dy) it.next();
                    if (AnonymousClass00C.A0J(r1.A01, r6)) {
                        copyOnWriteArrayList.remove(r1);
                        break;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean A0B() {
        return C19550w8.A02() && Float.compare(this.A02, (float) 600) > 0 && !A08() && ((Boolean) this.A06.getValue()).booleanValue();
    }

    public static final AnonymousClass80Y A00(Intent intent, String str, List list, int i, int i2) {
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass9V7(new ComponentName(str, (String) it.next())));
        }
        C193309Ky r0 = new C193309Ky(intent, C007103b.A0f(arrayList), i, i2);
        return new AnonymousClass80Y(r0.A02, r0.A03, r0.A01, r0.A00);
    }

    public final boolean A0D() {
        String str = Build.MANUFACTURER;
        if (str == null || !str.equalsIgnoreCase("samsung")) {
            return true;
        }
        return AnonymousClass6YG.A05();
    }

    public final void A02(int i, boolean z) {
        if (A0C()) {
            for (AnonymousClass3L8 A042 : getObservers()) {
                A042.A04(i, z);
            }
        }
    }

    public final void A03(int i, boolean z) {
        if (A0C()) {
            this.A00 = i;
            for (AnonymousClass3L8 A032 : getObservers()) {
                A032.A03(i, z);
            }
        }
    }

    public final void A07(boolean z) {
        if (A0C() || z) {
            for (AnonymousClass3L8 A002 : getObservers()) {
                A002.A00();
            }
        }
    }

    public final boolean A08() {
        if (!A0A() || !this.A09.A01.getBoolean("otp_split_mode_user_choice", true)) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        if (!A0B() || !this.A09.A01.getBoolean("otp_split_mode_user_choice", true)) {
            return false;
        }
        return true;
    }

    public final boolean A0A() {
        if (!C19550w8.A09() || !A0D() || ((C208089xd) ((C201089ip) this.A08.getValue()).A01).A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0C() {
        if (A08() || A09()) {
            return true;
        }
        return false;
    }
}
