package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.3KR  reason: invalid class name */
public abstract class AnonymousClass3KR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C135066c4 A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public Context A00() {
        if (this instanceof C47642fM) {
            return ((C47642fM) this).A00.getContext();
        }
        return ((C47632fL) this).A00;
    }

    public void A01(Drawable drawable, AnonymousClass17Y r6) {
        if (this instanceof C47642fM) {
            C18740tg.A06(r6);
            C81203wd.A00(r6, this, drawable, 17);
            return;
        }
        C47632fL r3 = (C47632fL) this;
        if (drawable != null) {
            drawable.setBounds(0, 0, r3.A02, r3.A00);
            r3.A01.Bhd(drawable);
        }
    }

    public boolean A02() {
        if (!(this instanceof C47642fM)) {
            return true;
        }
        C47642fM r0 = (C47642fM) this;
        return r0.A05.equals(r0.A00.getTag());
    }

    public AnonymousClass3KR(C135066c4 r1, Integer num, String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = r1;
        this.A05 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A01 = i3;
        this.A07 = z2;
        this.A04 = num;
    }
}
