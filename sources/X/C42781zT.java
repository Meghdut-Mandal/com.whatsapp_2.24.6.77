package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaViewPager;

/* renamed from: X.1zT  reason: invalid class name and case insensitive filesystem */
public class C42781zT extends AnonymousClass07S {
    public final AnonymousClass07S A00;
    public final C18820ts A01;

    public float A06(int i) {
        AnonymousClass07S r2 = this.A00;
        return r2.A06(WaViewPager.A00(this.A01, i, r2.A0H()));
    }

    public int A07(Object obj) {
        AnonymousClass07S r3 = this.A00;
        int A07 = r3.A07(obj);
        if (A07 == -2 || A07 == -1) {
            return A07;
        }
        return WaViewPager.A00(this.A01, A07, r3.A0H());
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass07S r2 = this.A00;
        r2.A0E(viewGroup, obj, WaViewPager.A00(this.A01, i, r2.A0H()));
    }

    public CharSequence A0F(int i) {
        AnonymousClass07S r2 = this.A00;
        return r2.A0F(WaViewPager.A00(this.A01, i, r2.A0H()));
    }

    public void A0G(ViewGroup viewGroup) {
        this.A00.A0G(viewGroup);
    }

    public int A0H() {
        return this.A00.A0H();
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        AnonymousClass07S r2 = this.A00;
        return r2.A0I(viewGroup, WaViewPager.A00(this.A01, i, r2.A0H()));
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass07S r2 = this.A00;
        int A0H = r2.A0H();
        if (i == A0H) {
            A0H++;
        }
        r2.A0J(viewGroup, obj, WaViewPager.A00(this.A01, i, A0H));
    }

    public boolean A0K(View view, Object obj) {
        return this.A00.A0K(view, obj);
    }

    public C42781zT(AnonymousClass07S r3, C18820ts r4) {
        this.A01 = r4;
        this.A00 = r3;
        r3.A0A(new AnonymousClass4VP(this, 0));
    }
}
