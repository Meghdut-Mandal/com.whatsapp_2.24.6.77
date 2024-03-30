package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public abstract class C41121we extends AnonymousClass0CZ implements C158307gi {
    public AnonymousClass66P A00;
    public final int A01;
    public final LayoutInflater A02;
    public final C18820ts A03;
    public final AnonymousClass1H2 A04;
    public final AnonymousClass4QX A05;
    public final C19890wg A06;

    public synchronized int A0J() {
        int i;
        AnonymousClass66P r0 = this.A00;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A01.size();
        }
        return i;
    }

    public synchronized void A0L(AnonymousClass66P r3) {
        AnonymousClass66P r1 = this.A00;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A00 = r3;
        r3.A00(this);
        A06();
    }

    public /* bridge */ /* synthetic */ void A0F(AnonymousClass0D3 r1) {
        ((C42691zE) r1).A0B();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r3, int i) {
        AnonymousClass1XQ r0;
        C42691zE r32 = (C42691zE) r3;
        synchronized (this) {
            if (i < this.A00.A01.size()) {
                r0 = (AnonymousClass1XQ) this.A00.A01.get(i);
            } else {
                r0 = null;
            }
            r32.A01 = r0;
            r32.A00 = i;
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42691zE(this.A02, viewGroup, this.A04, this.A05, this.A06, this.A01);
    }

    public void BfQ(AnonymousClass66P r2) {
        if (r2.equals(this.A00)) {
            A06();
        }
    }

    public C41121we(Activity activity, C18820ts r3, AnonymousClass1H2 r4, AnonymousClass4QX r5, C19890wg r6, int i) {
        this.A02 = activity.getLayoutInflater();
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = i;
    }
}
