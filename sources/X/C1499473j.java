package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* renamed from: X.73j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1499473j implements Runnable {
    public final /* synthetic */ WorkDatabase A00;
    public final /* synthetic */ AnonymousClass6QA A01;
    public final /* synthetic */ AnonymousClass6QA A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1499473j(WorkDatabase workDatabase, AnonymousClass6QA r2, AnonymousClass6QA r3, String str, List list, Set set, boolean z) {
        this.A00 = workDatabase;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = list;
        this.A03 = str;
        this.A05 = set;
        this.A06 = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        C162547ol r10;
        C161957nk A022;
        C13180jS r0;
        WorkDatabase workDatabase = this.A00;
        AnonymousClass6QA r8 = this.A01;
        AnonymousClass6QA r9 = this.A02;
        List list = this.A04;
        String str = this.A03;
        Set set = this.A05;
        boolean z = this.A06;
        C160977lt A0D = workDatabase.A0D();
        C158977iY A0E = workDatabase.A0E();
        Integer num = r9.A0E;
        int i = r9.A01;
        long j = r9.A06;
        int i2 = r9.A0I + 1;
        String str2 = r8.A0J;
        String str3 = r8.A0G;
        String str4 = r8.A0F;
        AnonymousClass6X2 r40 = r8.A0A;
        AnonymousClass6X2 r39 = r8.A0B;
        long j2 = r8.A04;
        long j3 = r8.A05;
        long j4 = r8.A03;
        C132316Tb r38 = r8.A09;
        Integer num2 = r8.A0C;
        long j5 = r8.A02;
        long j6 = r8.A07;
        long j7 = r8.A08;
        boolean z2 = r8.A0H;
        AnonymousClass6QA A002 = C109465Xr.A00(new AnonymousClass6QA(r38, r40, r39, num, num2, r8.A0D, str2, str3, str4, i, r8.A00, i2, j2, j3, j4, j5, j, j6, j7, z2), list);
        C138936iw r02 = (C138936iw) A0D;
        AnonymousClass6Q8 r92 = r02.A02;
        r92.A05();
        r92.A06();
        try {
            r10 = r02.A01;
            A022 = r10.A02();
            String str5 = A002.A0J;
            AnonymousClass6QA.A03(A022, A002, str5);
            byte[] A012 = AnonymousClass6X2.A01(A002.A0A);
            if (A012 == null) {
                A022.B1p(5);
            } else {
                A022.B1m(5, A012);
            }
            byte[] A013 = AnonymousClass6X2.A01(A002.A0B);
            if (A013 == null) {
                A022.B1p(6);
            } else {
                A022.B1m(6, A013);
            }
            int A003 = AnonymousClass6QA.A00(A022, A002);
            int i3 = 1;
            if (A003 == 0) {
                i3 = 0;
            } else if (A003 != 1) {
                r0 = C36441kJ.A18();
                throw r0;
            }
            int A014 = AnonymousClass6QA.A01(A022, A002, i3);
            int i4 = 1;
            if (A014 == 0) {
                i4 = 0;
            } else if (A014 != 1) {
                r0 = C36441kJ.A18();
                throw r0;
            }
            AnonymousClass6QA.A02(A022, A002, i4);
            A022.B1q(28, str5);
            ((C97274ok) A022).A00.executeUpdateDelete();
            r10.A03(A022);
            r92.A07();
            AnonymousClass6Q8.A01(r92);
            C138946ix r03 = (C138946ix) A0E;
            AnonymousClass6Q8 r82 = r03.A01;
            r82.A05();
            AnonymousClass6P9 r7 = r03.A02;
            C161957nk A004 = AnonymousClass6P9.A00(r82, r7, str);
            try {
                C97274ok.A00(r82, A004);
                AnonymousClass6Q8.A01(r82);
                r7.A03(A004);
                A0E.BKl(str, set);
                if (!z) {
                    A0D.BP9(str, -1);
                    workDatabase.A0C().B5B(str);
                }
            } catch (Throwable th) {
                AnonymousClass6Q8.A01(r82);
                r7.A03(A004);
                throw th;
            }
        } catch (Throwable th2) {
            AnonymousClass6Q8.A01(r92);
            throw th2;
        }
    }
}
