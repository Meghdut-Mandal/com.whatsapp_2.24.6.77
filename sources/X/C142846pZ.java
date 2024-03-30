package X;

import android.graphics.Bitmap;

/* renamed from: X.6pZ  reason: invalid class name and case insensitive filesystem */
public final class C142846pZ implements C160397kw {
    public /* bridge */ /* synthetic */ void BZu(C160797lb r4) {
        C142876pc r42 = (C142876pc) r4;
        AnonymousClass00C.A0D(r42, 0);
        C164787sN r1 = (C164787sN) r42.A00;
        int i = r1.A01;
        C97674q5 r2 = (C97674q5) r1.A00;
        if (i != 0) {
            r2.A0C.A0E = r2.A07;
        } else {
            Bitmap bitmap = r2.A08;
            r2.A01 = bitmap;
            r2.A03.A01(bitmap);
        }
        r2.A03();
    }

    public /* bridge */ /* synthetic */ void Ba5(Bitmap bitmap, C160797lb r4, boolean z) {
        C142876pc r42 = (C142876pc) r4;
        C36321k7.A0w(r42, bitmap);
        C164787sN r1 = (C164787sN) r42.A00;
        int i = r1.A01;
        C97674q5 r12 = (C97674q5) r1.A00;
        if (i != 0) {
            r12.A0C.A0E = bitmap;
        } else {
            r12.A01 = bitmap;
            r12.A03.A01(bitmap);
        }
        r12.A03();
    }

    public /* bridge */ /* synthetic */ void BRN(C160797lb r1) {
    }

    public /* bridge */ /* synthetic */ void Ba1(C160797lb r1) {
    }
}
