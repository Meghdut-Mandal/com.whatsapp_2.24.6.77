package X;

import android.os.Build;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

public final class AA2 implements C226515g {
    public final C22991Azh A00;
    public final AnonymousClass1X7 A01;
    public final WeakReference A02;

    public AA2(C225314u r2, C22991Azh azh, AnonymousClass1X7 r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A01 = r4;
        this.A00 = azh;
        this.A02 = AnonymousClass001.A0F(r2);
    }

    public void Be9(String str) {
        C225314u r1 = (C225314u) this.A02.get();
        if (r1 != null) {
            this.A01.A03(r1);
        }
    }

    public void BeA() {
        C224914p r5 = (C224914p) this.A02.get();
        if (r5 != null) {
            int BGV = this.A00.BGV();
            if (!r5.isFinishing()) {
                r5.startActivityForResult(AnonymousClass3US.A03(r5, R.string.f12nameremoved, BGV, false), 151);
            }
        }
    }

    public void Bjm(String str) {
        C225314u r1 = (C225314u) this.A02.get();
        if (r1 != null) {
            this.A01.A03(r1);
        }
    }

    public void Bjn() {
        int i;
        C224914p r5 = (C224914p) this.A02.get();
        if (r5 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
                if (i2 < 33) {
                    i = R.string.f12nameremoved;
                }
            }
            if (!r5.isFinishing()) {
                r5.startActivityForResult(AnonymousClass3US.A03(r5, R.string.f12nameremoved, i, false), 151);
            }
        }
    }
}
