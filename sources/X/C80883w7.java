package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.3w7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80883w7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C80143uv A03;
    public final /* synthetic */ AnonymousClass141 A04;
    public final /* synthetic */ AnonymousClass35P A05;
    public final /* synthetic */ C42251yW A06;
    public final /* synthetic */ C41021wU A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C80883w7(Context context, Bitmap bitmap, C80143uv r3, AnonymousClass141 r4, AnonymousClass35P r5, C42251yW r6, C41021wU r7, String str, int i, boolean z) {
        this.A07 = r7;
        this.A09 = z;
        this.A01 = context;
        this.A04 = r4;
        this.A00 = i;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = bitmap;
        this.A08 = str;
        this.A03 = r3;
    }

    public final void run() {
        String A0G;
        int i;
        AnonymousClass35Q r8;
        C41021wU r5 = this.A07;
        boolean z = this.A09;
        Context context = this.A01;
        AnonymousClass141 r4 = this.A04;
        int i2 = this.A00;
        C42251yW r6 = this.A06;
        AnonymousClass35P r7 = this.A05;
        Bitmap bitmap = this.A02;
        String str = this.A08;
        C80143uv r10 = this.A03;
        if (z) {
            A0G = context.getString(R.string.f12nameremoved);
            i = R.color.f6nameremoved;
        } else {
            A0G = r5.A05.A0G(C41021wU.A00(r4, r5, i2).A00, r4, i2);
            boolean isEmpty = TextUtils.isEmpty(A0G);
            i = R.color.f6nameremoved;
            if (isEmpty) {
                r8 = new AnonymousClass35Q((String) null, 0);
                r5.A01.A0H(new C80803vz(r5, r6, r7, r8, bitmap, r10, str, 1, z));
            }
        }
        r8 = new AnonymousClass35Q(A0G, i);
        r5.A01.A0H(new C80803vz(r5, r6, r7, r8, bitmap, r10, str, 1, z));
    }
}
