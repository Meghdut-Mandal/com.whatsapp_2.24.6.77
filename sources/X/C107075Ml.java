package X;

import android.text.TextUtils;
import com.whatsapp.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5Ml  reason: invalid class name and case insensitive filesystem */
public class C107075Ml extends C132446Tt {
    public WeakReference A00;
    public final AnonymousClass17Y A01;
    public final C20050ww A02;
    public final C21010yW A03;
    public final C128896Ea A04 = new C128896Ea();
    public final File A05;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        C225314u r3 = (C225314u) this.A00.get();
        if (r3 != null && !r3.BLh()) {
            r3.Bnv();
            if (TextUtils.isEmpty(str)) {
                this.A01.A04(R.string.f12nameremoved, 0);
                return;
            }
            AnonymousClass2NC r2 = new AnonymousClass2NC();
            r2.A00 = Long.valueOf(this.A04.A00);
            this.A03.Blw(r2);
            r3.A33(C36331k8.A04(str), false);
        }
    }

    public C107075Ml(C225314u r2, AnonymousClass17Y r3, C20050ww r4, C21010yW r5, File file) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = AnonymousClass001.A0F(r2);
        this.A05 = file;
    }
}
