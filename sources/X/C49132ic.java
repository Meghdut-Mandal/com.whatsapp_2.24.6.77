package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2ic  reason: invalid class name and case insensitive filesystem */
public class C49132ic extends C132446Tt {
    public final AnonymousClass1GX A00;
    public final WeakReference A01;

    public C49132ic(AnonymousClass012 r2, AnonymousClass388 r3, AnonymousClass1GX r4) {
        super(r2, true);
        this.A00 = r4;
        this.A01 = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            Bitmap A0e = this.A00.A0e(Uri.fromFile(((File[]) objArr)[0]), 100, 100);
            byte[] A1b = C36401kF.A1b(A0e);
            A0e.recycle();
            return A1b;
        } catch (Exception e) {
            Log.e("create-product-reply/", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        byte[] bArr = (byte[]) obj;
        AnonymousClass388 r0 = (AnonymousClass388) this.A01.get();
        if (r0 != null) {
            C40061uh r4 = r0.A03;
            C207269up r5 = r0.A01;
            AnonymousClass3BR r8 = r0.A02;
            C65013Qj r9 = r0.A00;
            try {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("product_inquiry:");
                String A0q = AnonymousClass000.A0q(r5.A0F, A0u);
                UserJid userJid = r8.A0A;
                C46852bm r2 = new C46852bm(new C64933Qa(userJid, A0q, false), C19970wo.A00(r4.A0g));
                r2.A01 = r9;
                r2.A1C(bArr);
                r5.A00(r2);
                if (userJid != null) {
                    r2.A01 = userJid;
                }
                r4.A0a(r2);
            } catch (Exception e) {
                Log.e("create-product-reply/", e);
            }
            if (bArr == null) {
                Log.i("create-product-reply/creating product reply without media");
                AnonymousClass2bV r3 = new AnonymousClass2bV(r4.A0v.A02(r8.A0A, false), C19970wo.A00(r4.A0g));
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append('*');
                String A0q2 = AnonymousClass000.A0q(r5.A05, A0u2);
                String str = r5.A0C;
                if (!AnonymousClass14B.A0F(str)) {
                    A0q2 = AnonymousClass000.A0p("*\n", str, AnonymousClass000.A0v(A0q2));
                }
                r3.A16(A0q2);
                r4.A0a(r3);
            }
        }
    }
}
