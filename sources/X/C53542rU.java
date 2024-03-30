package X;

import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2rU  reason: invalid class name and case insensitive filesystem */
public class C53542rU implements C88764Ty {
    public Object A00;
    public final int A01;

    public C53542rU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTL(C588331f r5) {
        AnonymousClass17Y r2;
        Runnable A002;
        if (this.A01 != 0) {
            ArrayList arrayList = r5.A00;
            r2 = ((C225314u) this.A00).A05;
            A002 = new C81203wd(this, arrayList, 32);
        } else {
            Log.i("storage-usage-activity/fetch chats/completed");
            StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
            ArrayList arrayList2 = r5.A00;
            storageUsageActivity.A0Q = arrayList2;
            StorageUsageActivity.A0H(storageUsageActivity, arrayList2, (List) null, true);
            r2 = storageUsageActivity.A05;
            A002 = C81183wb.A00(this, 10);
        }
        r2.A0H(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r2.add(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BTM(X.C588431g r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0012
            java.util.List r2 = r12.A00
            java.lang.Object r0 = r11.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r1 = r0.A05
            r0 = 32
            X.C81203wd.A00(r1, r11, r2, r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r6 = r11.A00
            com.whatsapp.storage.StorageUsageActivity r6 = (com.whatsapp.storage.StorageUsageActivity) r6
            X.1wZ r0 = r6.A0H
            if (r0 == 0) goto L_0x0011
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r6.A0Q
            java.util.Iterator r7 = r0.iterator()
        L_0x0024:
            boolean r0 = r7.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x005c
            java.lang.Object r5 = r7.next()
            X.3v0 r5 = (X.C80193v0) r5
            java.util.List r0 = r12.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0037:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r3 = r4.next()
            X.3v0 r3 = (X.C80193v0) r3
            X.11F r1 = r3.A01()
            X.11F r0 = r5.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            int r0 = r5.compareTo(r3)
            if (r0 == 0) goto L_0x0058
            goto L_0x0024
        L_0x0058:
            r2.add(r5)
            goto L_0x0024
        L_0x005c:
            java.util.ArrayList r0 = r6.A0Q
            int r1 = r0.size()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x0069
            r5 = 0
        L_0x0069:
            r6.A0Q = r2
            java.util.List r7 = r12.A00
            java.util.Collections.sort(r7)
            r9 = 0
            java.lang.Object r1 = r7.get(r9)
            X.3v0 r1 = (X.C80193v0) r1
            boolean r0 = X.C65503Si.A02(r1)
            if (r0 != 0) goto L_0x0011
            java.util.ArrayList r2 = X.C36441kJ.A15(r2)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            X.00I r4 = X.C36441kJ.A0W(r2, r0)
            r3 = 0
        L_0x008a:
            java.lang.Object r2 = r4.A00
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x0100
            java.lang.Object r0 = r8.get(r9)
            X.3v0 r0 = (X.C80193v0) r0
            X.11F r10 = r0.A01()
            X.11F r0 = r1.A01()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00cd
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00bd
            java.lang.Object r1 = r7.get(r3)
            X.3v0 r1 = (X.C80193v0) r1
            boolean r0 = X.C65503Si.A02(r1)
            if (r0 == 0) goto L_0x00cd
        L_0x00bd:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r6.A0Q = r2
            if (r5 == 0) goto L_0x00c8
            r0 = 0
        L_0x00c4:
            com.whatsapp.storage.StorageUsageActivity.A0H(r6, r2, r0, r5)
            return
        L_0x00c8:
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            goto L_0x00c4
        L_0x00cd:
            java.lang.Object r0 = r8.get(r9)
            X.3v0 r0 = (X.C80193v0) r0
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x00fd
            r8.add(r9, r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.add(r0)
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00bd
            java.lang.Object r1 = r7.get(r3)
            X.3v0 r1 = (X.C80193v0) r1
            boolean r0 = X.C65503Si.A02(r1)
            if (r0 != 0) goto L_0x00bd
            int r9 = r9 + -1
        L_0x00fd:
            int r9 = r9 + 1
            goto L_0x008a
        L_0x0100:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00bd
            java.lang.Object r1 = r7.get(r3)
            X.3v0 r1 = (X.C80193v0) r1
            boolean r0 = X.C65503Si.A02(r1)
            if (r0 != 0) goto L_0x00bd
            r8.add(r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            int r0 = X.C36431kI.A07(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53542rU.BTM(X.31g):void");
    }

    public void BVI(C66753Xe r4, AnonymousClass11F r5) {
        if (this.A01 == 0) {
            ((C225314u) this.A00).A05.A0H(new AnonymousClass737(this, r5, r4, 11));
        }
    }
}
