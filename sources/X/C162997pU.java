package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.7pU  reason: invalid class name and case insensitive filesystem */
public class C162997pU extends AnonymousClass3PM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C162997pU(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void A01() {
        int i;
        if (this.A03 != 0) {
            try {
                AnonymousClass64Q r1 = (AnonymousClass64Q) this.A02;
                int i2 = r1.A00;
                String str = r1.A04;
                int i3 = r1.A02;
                int i4 = r1.A01;
                long j = (long) i2;
                long j2 = (long) i3;
                long j3 = (long) i4;
                long j4 = (long) 7;
                JniBridge.jvidispatchIIIIIOOOO(j, j2, j3, j4, str, r1.A05, r1.A03, (AnonymousClass5u4) this.A01);
            } catch (Exception unused) {
                Log.e("Error : Could not enqueue upload request in wa-msys.");
                i = 23;
                A02(i);
            }
        } else {
            try {
                AnonymousClass654 r12 = (AnonymousClass654) this.A02;
                int i5 = r12.A01;
                int i6 = r12.A00;
                String str2 = r12.A06;
                String str3 = r12.A05;
                String str4 = r12.A03;
                byte[] bArr = r12.A08;
                byte[] bArr2 = r12.A07;
                byte[] bArr3 = r12.A09;
                String str5 = r12.A02;
                String str6 = r12.A04;
                String str7 = str5;
                String str8 = str6;
                String str9 = str3;
                String str10 = str4;
                String str11 = str2;
                long j5 = (long) 7;
                JniBridge.jvidispatchIIIIOOOOOOOOO((long) i5, (long) i6, j5, str11, str9, str10, str7, str8, (AnonymousClass5u3) this.A01, bArr, bArr2, bArr3);
            } catch (Exception unused2) {
                Log.e("Error: Could not enqueue download request in wa-msys");
                i = new C133136Wx(17, (String) null, false);
                A02(i);
            }
        }
    }
}
