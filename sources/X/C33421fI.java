package X;

import android.content.Context;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1fI  reason: invalid class name and case insensitive filesystem */
public final class C33421fI {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1A6 A01;
    public final C33411fH A02;
    public final C19970wo A03;
    public final C220712t A04;
    public final C19770wU A05;
    public final AnonymousClass1CR A06;
    public final WeakReference A07;

    public C33421fI(Context context, AnonymousClass17Y r3, AnonymousClass1A6 r4, C33411fH r5, C19970wo r6, C220712t r7, AnonymousClass1CR r8, C19770wU r9) {
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r5, 8);
        this.A03 = r6;
        this.A00 = r3;
        this.A05 = r9;
        this.A04 = r7;
        this.A06 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = new WeakReference(context);
    }

    public final void A00(Set set) {
        Context context = (Context) this.A07.get();
        if (context != null) {
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!this.A01.A0E((AnonymousClass11F) it.next())) {
                        C39001qm A002 = AnonymousClass3LW.A00(context);
                        A002.A0d(R.string.f12nameremoved);
                        A002.A0c(R.string.f12nameremoved);
                        A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                        A002.A0h(new C89684Xm(set, this, 1), R.string.f12nameremoved);
                        A002.A0b();
                        return;
                    }
                }
            }
            this.A00.A0E(context.getResources().getQuantityString(R.plurals.f10nameremoved, 3, new Object[]{3}), 0);
        }
    }

    public final boolean A01(AnonymousClass11F r4) {
        AnonymousClass00C.A0D(r4, 0);
        Set A0X = this.A06.A0X();
        if (A0X.size() >= 3) {
            A00(A0X);
            return true;
        }
        this.A05.Boy(new C35681j5(this, r4, 13));
        return true;
    }
}
