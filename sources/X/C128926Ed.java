package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.facebook.rendercore.RootHostView;
import java.util.Objects;

/* renamed from: X.6Ed  reason: invalid class name and case insensitive filesystem */
public final class C128926Ed {
    public AnonymousClass6SR A00;
    public final Context A01;
    public final C98124qv A02;
    public final String A03;

    public View A00(Context context) {
        boolean z;
        AnonymousClass6SR r3 = this.A00;
        if (r3 == null) {
            throw C36331k8.A0d("bloksSurfaceController");
        }
        try {
            C142106oL r4 = r3.A04;
            r4.A00 = new RootHostView(context);
            AnonymousClass6PY r1 = r4.A01;
            if (r1 != null) {
                z = true;
                Objects.requireNonNull(r1);
                r1.A03(r4.A00);
            } else {
                z = false;
                if (r4.A0A.compareAndSet(false, true)) {
                    C115145iP r2 = r4.A05;
                    if (r2 == null) {
                        C142106oL.A00(r4, 0);
                    } else {
                        C142106oL.A00(r4, 1);
                        C142106oL.A02(r4, (C100584vG) r2, 2, 3);
                    }
                }
            }
            Pair create = Pair.create(r4.A00, Boolean.valueOf(z));
            AnonymousClass6MF r0 = r3.A00;
            if (r0 != null) {
                r0.A00(r4);
                C142096oK r02 = new C142096oK(r3, r4);
                r3.A02 = r02;
                AnonymousClass6MF r12 = r3.A00;
                synchronized (r12) {
                    r12.A00 = r02;
                }
            }
            Object obj = create.first;
            if (obj != null) {
                return (View) obj;
            }
            throw C36381kD.A0l();
        } catch (Throwable th) {
            AnonymousClass6MF r03 = r3.A00;
            if (r03 != null) {
                C142106oL r13 = r3.A04;
                r03.A00(r13);
                C142096oK r04 = new C142096oK(r3, r13);
                r3.A02 = r04;
                AnonymousClass6MF r14 = r3.A00;
                synchronized (r14) {
                    r14.A00 = r04;
                }
            }
            throw th;
        }
    }

    public void A01() {
        AnonymousClass6SR r3 = this.A00;
        if (r3 == null) {
            throw C36331k8.A0d("bloksSurfaceController");
        }
        AnonymousClass6MF r1 = r3.A00;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00 = null;
            }
        }
        r3.A00 = null;
        C142106oL r12 = r3.A04;
        AnonymousClass6PY r0 = r12.A01;
        if (r0 != null) {
            r0.A01();
        }
        r12.A01 = null;
        r12.A0B.set((Object) null);
        r3.A0B.set((Object) null);
    }

    public void A02() {
        AnonymousClass6SR r3 = this.A00;
        if (r3 == null) {
            throw C36331k8.A0d("bloksSurfaceController");
        }
        try {
            AnonymousClass7fG r1 = r3.A02;
            if (r1 != null) {
                AnonymousClass6MF r0 = r3.A00;
                if (r0 != null) {
                    r0.A00(r1);
                }
                r3.A02 = null;
            }
        } finally {
            C161027m0 r02 = r3.A01;
            if (r02 != null) {
                r02.BO4("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public void A03() {
        AnonymousClass6SR r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("bloksSurfaceController");
        }
        C161027m0 r1 = r0.A01;
        if (r1 != null) {
            r1.BO4("BloksSurfaceController_onPause");
        }
    }

    public C128926Ed(C98124qv r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = C36371kC.A0B(r2);
    }
}
