package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jU  reason: invalid class name and case insensitive filesystem */
public class C49662jU extends C132446Tt {
    public Context A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass1PW A04;
    public final C27761Ps A05;
    public final List A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            Context context = this.A00;
            if (context != null) {
                if (this.A05.A07(context, A0f, (float) this.A01, this.A02, true) == null) {
                }
            }
            return false;
        }
        return C36371kC.A0m();
    }

    public C49662jU(Context context, AnonymousClass1PW r2, C27761Ps r3, List list, int i, int i2, int i3) {
        this.A00 = context;
        this.A06 = list;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = r2;
        C18740tg.A06(r3);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("notification_type", this.A03);
            this.A04.A00(new C132636Up("refresh_notification", A07));
        }
    }
}
