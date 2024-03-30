package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.2j3  reason: invalid class name and case insensitive filesystem */
public final class C49402j3 extends C132446Tt {
    public final AnonymousClass31U A00;
    public final AnonymousClass11F A01;
    public final AnonymousClass3T0 A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass3T0 r2 = this.A02;
        return r2.A08(r2.A0B(C36441kJ.A0G(this.A03), this.A01));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass28c.A00((Drawable) obj, this.A00.A00);
    }

    public C49402j3(Context context, AnonymousClass31U r3, AnonymousClass11F r4, AnonymousClass3T0 r5) {
        this.A03 = AnonymousClass001.A0F(context);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }
}
