package X;

import android.net.Uri;
import com.whatsapp.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.2jw  reason: invalid class name and case insensitive filesystem */
public class C49942jw extends C132446Tt {
    public final Uri A00;
    public final AnonymousClass1GX A01;
    public final AnonymousClass17Y A02;
    public final C18820ts A03;
    public final AnonymousClass4SG A04;
    public final WeakReference A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            return this.A01.A0h(this.A00);
        } catch (IOException e) {
            return e;
        }
    }

    public void A0A() {
        C225014r r2 = (C225014r) this.A05.get();
        if (r2 != null) {
            r2.Bu2(0, R.string.f12nameremoved);
        }
    }

    public void A0C(Object obj) {
        C225014r r3 = (C225014r) this.A05.get();
        if (r3 != null) {
            r3.Bnv();
        }
        if (obj instanceof File) {
            this.A04.BXw((File) obj);
            return;
        }
        if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            C36321k7.A1J(th, "mediafileutils/getfilefrommediastoreasync/ioerror ", AnonymousClass000.A0u());
            if (th.getMessage() != null && th.getMessage().contains("No space")) {
                this.A02.A0C(r3, R.string.f12nameremoved);
                return;
            }
        }
        this.A02.A06(R.string.f12nameremoved, 0);
    }

    public C49942jw(Uri uri, C225014r r3, AnonymousClass17Y r4, C18820ts r5, AnonymousClass4SG r6, AnonymousClass1GX r7) {
        this.A02 = r4;
        this.A01 = r7;
        this.A03 = r5;
        this.A05 = AnonymousClass001.A0F(r3);
        this.A00 = uri;
        this.A04 = r6;
    }
}
