package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: X.1is  reason: invalid class name and case insensitive filesystem */
public class C35551is implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public final int A07;

    public C35551is(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, boolean z) {
        this.A07 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A00 = i;
        this.A04 = obj4;
        this.A06 = z;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        int i = this.A07;
        AnonymousClass1X4 r4 = (AnonymousClass1X4) this.A01;
        if (i != 0) {
            Object obj = this.A02;
            String str = this.A05;
            byte[] bArr = (byte[]) this.A03;
            int i2 = this.A00;
            Object obj2 = this.A04;
            boolean z = this.A06;
            File A0i = r4.A1I.A0i(str, (long) bArr.length);
            try {
                fileOutputStream = new FileOutputStream(A0i);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("UserActions/prepareVCardDocument IO Exception when writing vcard document", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (!A0i.exists()) {
                Log.e("UserActions/prepareVCardDocument Error writing vcard document file");
                return;
            } else {
                r4.A02.Bp3(new C35551is(r4, obj, A0i, obj2, str, i2, 0, z));
                return;
            }
        } else {
            String str2 = this.A05;
            int i3 = this.A00;
            AnonymousClass3T1 r10 = (AnonymousClass3T1) this.A04;
            boolean z2 = this.A06;
            C65013Qj r8 = new C65013Qj();
            r8.A0I = (File) this.A03;
            r8.A01 = i3;
            AnonymousClass3SC A042 = r4.A0p.A04((Uri) null, r8, (AnonymousClass3XT) null, r10, str2, (List) this.A02, (List) null, (List) null, 9, 7, 0, z2);
            for (AnonymousClass2bU r1 : C007103b.A0Y(A042.A02)) {
                if (r1 instanceof C46972by) {
                    C46972by r12 = (C46972by) r1;
                    r12.A00 = i3;
                    r12.A05 = "text/vcard";
                    r12.A06 = str2;
                }
            }
            r4.A0b(A042, (byte[]) null, false, false);
            return;
        }
        throw th;
    }
}
