package X;

import android.content.Context;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.0JM  reason: invalid class name */
public final class AnonymousClass0JM extends C07590Yl implements C16860qD {
    public static final AnonymousClass0JC A00;
    public static final AnonymousClass0QI A01;
    public static final C06190Sq A02;

    public final zzw BOW(AnonymousClass0K4 r5) {
        C07180Wq r3 = new C07180Wq((AnonymousClass0OR) null);
        r3.A03 = new C04520Ky[]{C05910Ro.A00};
        r3.A02 = false;
        r3.A01 = new C10180dp(r5);
        return C07590Yl.A01(this, r3.A00(), 2);
    }

    static {
        AnonymousClass0QI r3 = new AnonymousClass0QI();
        A01 = r3;
        AnonymousClass0J5 r2 = new AnonymousClass0J5();
        A00 = r2;
        A02 = new C06190Sq(r2, r3, "ClientTelemetry.API");
    }

    public AnonymousClass0JM(Context context, C10080df r4) {
        super(context, (C17370rB) r4, A02, AnonymousClass0WU.A02);
    }
}
