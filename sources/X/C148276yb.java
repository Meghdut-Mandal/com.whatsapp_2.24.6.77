package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.util.ClippingLayout;

/* renamed from: X.6yb  reason: invalid class name and case insensitive filesystem */
public class C148276yb implements C160887lk {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass01I A01;
    public final /* synthetic */ C39821ts A02;
    public final /* synthetic */ C21060yb A03;
    public final /* synthetic */ AnonymousClass6YP A04;

    public void BkY(float f, boolean z) {
        ClippingLayout clippingLayout;
        AnonymousClass6YP r5 = this.A04;
        Rect rect = r5.A0U;
        if (z) {
            clippingLayout = r5.A0y;
            rect.set(0, 0, r5.A0Y.getWidth() + ((int) f), clippingLayout.getHeight());
        } else {
            clippingLayout = r5.A0y;
            rect.set((int) f, 0, clippingLayout.getWidth(), clippingLayout.getHeight());
        }
        if (r5.A0Z.getVisibility() == 0) {
            clippingLayout = r5.A0z;
        }
        clippingLayout.setClipBounds(rect);
    }

    public C148276yb(View view, AnonymousClass01I r2, C39821ts r3, C21060yb r4, AnonymousClass6YP r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
    }

    public void BYv(boolean z) {
        this.A04.A0n.A0S();
    }

    public void BaL(boolean z) {
        this.A04.A0R(z);
    }

    public void Bf2() {
        C012005e.A02(this.A00, R.id.footer).setClipBounds((Rect) null);
        this.A04.A0z.setClipBounds((Rect) null);
    }

    public void Bgf() {
        AnonymousClass6YP r2 = this.A04;
        r2.A0a.findViewById(R.id.buttons).setVisibility(0);
        r2.A0Y.requestFocus();
    }

    public void Bgi() {
        AnonymousClass01I r2 = this.A01;
        String string = r2.getString(R.string.f12nameremoved);
        if (this.A04.A0H == null) {
            C33521fV.A00(r2, this.A03, string);
        }
        this.A02.A0U(3);
    }

    public void Bgq(float f) {
        AnonymousClass5VT r3 = this.A04.A0d;
        r3.A00.set(Double.doubleToRawLongBits((double) f));
    }

    public void Bht(boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass6YP.A0E(this.A04, z, z2, z3, z4);
    }
}
