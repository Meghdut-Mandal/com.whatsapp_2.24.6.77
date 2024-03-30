package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;

/* renamed from: X.9iT  reason: invalid class name and case insensitive filesystem */
public final class C200919iT {
    public int A00;
    public PushToRecordIconAnimation A01;
    public AnonymousClass9YA A02;
    public AnonymousClass1RJ A03;
    public final AnonymousClass012 A04;
    public final C39821ts A05;
    public final C39941uJ A06;
    public final C18820ts A07;

    public static final View A01(C200919iT r2) {
        AnonymousClass9YA r0 = r2.A02;
        if ((r0 == null || !r0.A01()) && !r2.A03.A09()) {
            return null;
        }
        return r2.A03.A01();
    }

    public C200919iT(AnonymousClass012 r1, C39821ts r2, C39941uJ r3, C18820ts r4, AnonymousClass1RJ r5) {
        this.A07 = r4;
        this.A04 = r1;
        this.A03 = r5;
        this.A05 = r2;
        this.A06 = r3;
    }

    public static final float A00(C200919iT r0, int i) {
        Context context;
        Resources resources;
        View A012 = A01(r0);
        if (A012 == null || (context = A012.getContext()) == null || (resources = context.getResources()) == null) {
            return 0.0f;
        }
        return (float) resources.getDimensionPixelSize(i);
    }
}
