package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.0dz  reason: invalid class name and case insensitive filesystem */
public final class C10280dz implements C17340r8 {
    public final C10340e5 A00;

    public C10280dz(C10340e5 r1) {
        this.A00 = r1;
    }

    public final void Bxs() {
    }

    public final void Bxy(Bundle bundle) {
    }

    public final void Bxz(AnonymousClass0L0 r1, C06190Sq r2, boolean z) {
    }

    public final AnonymousClass0JS Bxn(AnonymousClass0JS r6) {
        try {
            C10340e5 r4 = this.A00;
            AnonymousClass0JO r3 = r4.A07;
            AnonymousClass0WV r1 = r3.A08;
            r1.A01.add(r6);
            r6.A08.set(r1.A00);
            AnonymousClass0QI r2 = r6.A00;
            C17590rf r12 = (C17590rf) r3.A0B.get(r2);
            AnonymousClass006.A02(r12, "Appropriate Api was not requested.");
            if (r12.isConnected() || !r4.A0A.containsKey(r2)) {
                r6.A09(r12);
                return r6;
            }
            r6.A0B(new Status(17, (String) null));
            return r6;
        } catch (DeadObjectException unused) {
            C10340e5 r0 = this.A00;
            AnonymousClass000.A14(r0.A08, new C04060Jc(this, this), 1);
            return r6;
        }
    }

    public final void By0(int i) {
        C10340e5 r1 = this.A00;
        r1.A00((AnonymousClass0L0) null);
        r1.A02.Bxr(i, false);
    }

    public final boolean By1() {
        this.A00.A00((AnonymousClass0L0) null);
        return true;
    }

    public final AnonymousClass0JS Bxk(AnonymousClass0JS r1) {
        Bxn(r1);
        return r1;
    }

    public final void Bxv() {
    }
}
