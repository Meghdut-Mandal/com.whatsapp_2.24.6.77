package X;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.6xp  reason: invalid class name and case insensitive filesystem */
public class C147816xp implements C236119d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ byte[] A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ C24331Ca A04;

    public void BiM(C203399nx r16, String str) {
        C203399nx A0b = r16.A0b(0);
        C18740tg.A06(A0b);
        C203399nx.A0A(A0b, "crypto");
        String A0x = C36391kE.A0x(A0b, "version");
        byte[] bArr = A0b.A0d("code").A01;
        byte[] bArr2 = A0b.A0d("password").A01;
        int i = this.A00;
        byte[] bArr3 = this.A02;
        byte[] bArr4 = this.A03;
        Runnable runnable = this.A01;
        Arrays.toString(bArr);
        Arrays.toString(bArr2);
        Arrays.toString(bArr3);
        Arrays.toString(bArr4);
        if (A0x == null || bArr == null || bArr2 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
            A0u.append(i);
            C36321k7.A1S(", error_code=", A0u, 0);
        } else {
            C24331Ca r0 = this.A04;
            if (i != 1) {
                r0.A01.A00(A0x, bArr2, bArr, bArr3, 0);
            } else {
                AnonymousClass6YO.A0B(r0.A00.A00, A0x, bArr, bArr2, bArr3, bArr4);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C147816xp(C24331Ca r1, Runnable runnable, byte[] bArr, byte[] bArr2, int i) {
        this.A04 = r1;
        this.A00 = i;
        this.A02 = bArr;
        this.A03 = bArr2;
        this.A01 = runnable;
    }

    public void BWw(C203399nx r9, String str) {
        Iterator it = r9.A0j("error").iterator();
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
                    int i = this.A00;
                    byte[] bArr = this.A02;
                    byte[] bArr2 = this.A03;
                    Runnable runnable = this.A01;
                    Arrays.toString((byte[]) null);
                    Arrays.toString((byte[]) null);
                    Arrays.toString(bArr);
                    Arrays.toString(bArr2);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
                    A0u2.append(i);
                    C36321k7.A1S(", error_code=", A0u2, parseInt);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        }
    }

    public void BVN(String str) {
        C36321k7.A1P("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, AnonymousClass000.A0u());
    }
}
