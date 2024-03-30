package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.6xo  reason: invalid class name and case insensitive filesystem */
public class C147806xo implements C236119d {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ C24331Ca A04;

    public void BiM(C203399nx r10, String str) {
        C203399nx A0b = r10.A0b(0);
        C18740tg.A06(A0b);
        C203399nx.A0A(A0b, "crypto");
        byte[] bArr = A0b.A0d("password").A01;
        String str2 = this.A01;
        byte[] bArr2 = this.A03;
        byte[] bArr3 = this.A02;
        Runnable runnable = this.A00;
        if (str2 != null) {
            C36321k7.A1Q("BackupSendMethods/sendGetCipherKey/success v=", str2, AnonymousClass000.A0u());
            this.A04.A01.A00(str2, bArr, bArr2, bArr3, 0);
        } else {
            Log.w("BackupSendMethods/sendGetCipherKey/get-ck/file is null");
        }
        runnable.run();
    }

    public C147806xo(C24331Ca r1, Runnable runnable, String str, byte[] bArr, byte[] bArr2) {
        this.A04 = r1;
        this.A01 = str;
        this.A03 = bArr;
        this.A02 = bArr2;
        this.A00 = runnable;
    }

    public void BWw(C203399nx r12, String str) {
        Iterator it = r12.A0j("error").iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            if (A0s != null) {
                String A0i = A0s.A0i("code", (String) null);
                String A0i2 = A0s.A0i("text", (String) null);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("BackupSendMethods/sendGetCipherKey id=");
                A0u.append(str);
                A0u.append(" error=");
                A0u.append(A0i);
                C36321k7.A1R(" ", A0i2, A0u);
                if (A0i != null) {
                    int parseInt = Integer.parseInt(A0i);
                    String str2 = this.A01;
                    byte[] bArr = this.A03;
                    byte[] bArr2 = this.A02;
                    Runnable runnable = this.A00;
                    if (str2 != null) {
                        C36321k7.A1Q("BackupSendMethods/sendGetCipherKey/success v=", str2, AnonymousClass000.A0u());
                        this.A04.A01.A00(str2, (byte[]) null, bArr, bArr2, parseInt);
                    } else {
                        Log.w("BackupSendMethods/sendGetCipherKey/get-ck/file is null");
                    }
                    runnable.run();
                }
            }
        }
    }

    public void BVN(String str) {
        C36321k7.A1P("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, AnonymousClass000.A0u());
    }
}
