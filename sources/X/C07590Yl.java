package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0Yl  reason: invalid class name and case insensitive filesystem */
public abstract class C07590Yl {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C17370rB A03;
    public final C06190Sq A04;
    public final AnonymousClass0XK A05;
    public final AnonymousClass0US A06;
    public final C07720Za A07;
    public final String A08;
    public final C15920oE A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C07590Yl(android.content.Context r2, X.C17370rB r3, X.C06190Sq r4, X.C15920oE r5) {
        /*
            r1 = this;
            X.0Ts r0 = new X.0Ts
            r0.<init>()
            r0.A01 = r5
            X.0WU r0 = r0.A00()
            r1.<init>((android.content.Context) r2, (X.C17370rB) r3, (X.C06190Sq) r4, (X.AnonymousClass0WU) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07590Yl.<init>(android.content.Context, X.0rB, X.0Sq, X.0oE):void");
    }

    public static final zzw A01(C07590Yl r6, C06490Tu r7, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C07720Za r4 = r6.A07;
        C15920oE r1 = r6.A09;
        C07720Za.A05(r6, r4, taskCompletionSource, r7.A00);
        AnonymousClass000.A14(r4.A06, new C06220St(r6, new C04120Ji(r1, r7, taskCompletionSource, i), r4.A0C.get()), 4);
        return taskCompletionSource.zza;
    }

    public AnonymousClass0TD A03() {
        AnonymousClass0TD r3 = new AnonymousClass0TD();
        Set emptySet = Collections.emptySet();
        C000000a r1 = r3.A00;
        if (r1 == null) {
            r1 = new C000000a(0);
            r3.A00 = r1;
        }
        r1.addAll(emptySet);
        Context context = this.A01;
        r3.A03 = AnonymousClass000.A0k(context);
        r3.A02 = context.getPackageName();
        return r3;
    }

    public static final void A02(C07590Yl r4, AnonymousClass0JS r5, int i) {
        r5.A05();
        C07720Za r0 = r4.A07;
        AnonymousClass000.A14(r0.A06, new C06220St(r4, new C04170Jn(r5, i), r0.A0C.get()), 4);
    }

    public C07590Yl(Activity activity, Context context, C17370rB r8, C06190Sq r9, AnonymousClass0WU r10) {
        AnonymousClass006.A02(context, "Null context is not permitted.");
        AnonymousClass006.A02(r9, "Api must not be null.");
        AnonymousClass006.A02(r10, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.A01 = context.getApplicationContext();
        String str = null;
        if (AnonymousClass0VW.A01()) {
            try {
                str = (String) AnonymousClass000.A0h(Context.class, context, "getAttributionTag");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.A08 = str;
        this.A04 = r9;
        this.A03 = r8;
        this.A02 = r10.A00;
        AnonymousClass0US r3 = new AnonymousClass0US(r8, r9, str);
        this.A06 = r3;
        this.A05 = new AnonymousClass0JN(this);
        C07720Za A012 = C07720Za.A01(this.A01);
        this.A07 = A012;
        this.A00 = A012.A0B.getAndIncrement();
        this.A09 = r10.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C17270r0 fragment = LifecycleCallback.getFragment(activity);
            AnonymousClass0JX r1 = (AnonymousClass0JX) fragment.B9H(AnonymousClass0JX.class, "ConnectionlessLifecycleHelper");
            r1 = r1 == null ? new AnonymousClass0JX(C02610Bd.A00, A012, fragment) : r1;
            r1.A01.add(r3);
            A012.A07(r1);
        }
        AnonymousClass000.A14(A012.A06, this, 7);
    }

    public C07590Yl(Context context, C17370rB r8, C06190Sq r9, AnonymousClass0WU r10) {
        this((Activity) null, context, r8, r9, r10);
    }
}
