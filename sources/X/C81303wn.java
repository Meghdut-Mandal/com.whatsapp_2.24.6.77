package X;

import android.app.Notification;
import android.app.Service;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.List;

/* renamed from: X.3wn  reason: invalid class name and case insensitive filesystem */
public class C81303wn implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C81303wn(Object obj, int i, Object obj2, int i2, int i3) {
        this.A04 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = i2;
    }

    public void run() {
        AnonymousClass3T1 r0;
        C63683Kz A0V;
        byte[] A022;
        Bitmap bitmap;
        AnonymousClass6TX r4;
        int i;
        int i2;
        C122765vO r1;
        int i3;
        String str;
        switch (this.A04) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    int i5 = this.A00;
                    C53042qc.A00((Notification) this.A03, (Service) this.A02, i5, this.A01);
                    return;
                }
                Service service = (Service) this.A02;
                int i6 = this.A00;
                Notification notification = (Notification) this.A03;
                if (i4 >= 29) {
                    C53032qb.A00(notification, service, i6, this.A01);
                    return;
                } else {
                    service.startForeground(i6, notification);
                    return;
                }
            case 1:
                int i7 = this.A00;
                int i8 = this.A01;
                ((AnonymousClass2KI) this.A02).A02.A00((AnonymousClass3T1) this.A03, Integer.valueOf(i7), i8);
                return;
            case 2:
                synchronized (this) {
                    r0 = (AnonymousClass3T1) this.A03;
                }
                if (r0 == null || (A0V = r0.A0V()) == null || (A022 = A0V.A02()) == null || (bitmap = AnonymousClass6Y8.A08((AnonymousClass67H) null, new C130396Kx(this.A01, this.A00), A022, false).A02) == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
                    ((C001600r) this.A02).A0C((Object) null);
                    return;
                } else {
                    ((C001600r) this.A02).A0C(bitmap);
                    return;
                }
            case 3:
                AnonymousClass3PQ r6 = (AnonymousClass3PQ) this.A02;
                int i9 = this.A00;
                AnonymousClass3T1 r42 = (AnonymousClass3T1) this.A03;
                int i10 = this.A01;
                C63613Ks r2 = new C63613Ks(r6.A01, 82, i9);
                AnonymousClass3O7 r12 = r2.A08;
                synchronized (r12) {
                    str = r12.A00;
                    if (str == null) {
                        str = AnonymousClass3O7.A00(r12);
                    }
                }
                r2.A02 = str;
                AnonymousClass11F r02 = r42.A1J.A00;
                r2.A01(r02);
                r2.A02(r02);
                r2.A03(r42);
                r2.A01 = C36441kJ.A0y(i10);
                r6.A00.Blx(r2.A00(), AnonymousClass3PQ.A03);
                return;
            case 4:
                r4 = (AnonymousClass6TX) this.A02;
                i = this.A00;
                i2 = this.A01;
                r1 = (C122765vO) this.A03;
                i3 = 1;
                break;
            case 5:
                r4 = (AnonymousClass6TX) this.A02;
                i = this.A00;
                i2 = this.A01;
                r1 = (C122765vO) this.A03;
                i3 = 0;
                break;
            case 6:
                int i11 = this.A01;
                C122765vO r22 = (C122765vO) this.A03;
                AnonymousClass00C.A0D(r22, 3);
                AnonymousClass6TX.A00(r22, (AnonymousClass6TX) this.A02, 897463359, i11, 2);
                return;
            default:
                C124315xx r43 = (C124315xx) this.A02;
                int i12 = this.A00;
                int i13 = this.A01;
                AnonymousClass00C.A0D(r43, 0);
                AnonymousClass6P0 r7 = C113435fX.A00;
                Integer valueOf = Integer.valueOf(i12);
                C18820ts r03 = r43.A01;
                ((AnonymousClass1UA) r43.A04.get()).A03(new C145456tv(r43, (List) this.A03, i13), r7, (C128936Ee) null, valueOf, "1", r03.A06(), r03.A05());
                return;
        }
        AnonymousClass6TX.A00(r1, r4, i, i2, i3);
    }

    public C81303wn(C122765vO r2, AnonymousClass6TX r3, int i, int i2, int i3) {
        this.A04 = i3;
        switch (i3) {
            case 4:
            case 5:
                this.A02 = r3;
                this.A00 = i;
                break;
            default:
                this.A02 = r3;
                this.A00 = 897463359;
                break;
        }
        this.A01 = i2;
        this.A03 = r2;
    }

    public C81303wn(int i, int i2) {
        this.A04 = 2;
        this.A02 = C36431kI.A0S();
        this.A01 = i;
        this.A00 = i2;
    }
}
