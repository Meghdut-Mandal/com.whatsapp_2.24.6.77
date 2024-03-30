package X;

import java.util.List;

/* renamed from: X.73f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1499073f implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass6YD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ C1499073f(AnonymousClass6YD r1, String str, List list, List list2, int i, int i2) {
        this.A02 = r1;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = list;
        this.A05 = list2;
    }

    public final void run() {
        AnonymousClass6YD r2 = this.A02;
        String str = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        List list = this.A04;
        List list2 = this.A05;
        C142626pB A012 = AnonymousClass6YD.A01(r2);
        AnonymousClass1S3 r6 = r2.A0D;
        boolean A1S = AnonymousClass000.A1S(r6.A02, 98);
        int length = r6.A02().length();
        if (AnonymousClass6TR.A01(A012.A01)) {
            AnonymousClass2RY r9 = new AnonymousClass2RY();
            C90514aH.A1L(r9, C36371kC.A0o(), A1S ? 1 : 0);
            C142626pB.A01(A012, r9);
            C142626pB.A02(r9, (Boolean) null, Integer.valueOf(length), (Integer) null, Integer.valueOf(i), (Integer) null, Integer.valueOf(i2), (Long) null, (String) null, list);
            A012.A02.Bly(r9);
        }
        AnonymousClass011[] r8 = new AnonymousClass011[3];
        C36341k9.A1J("error_type", Integer.valueOf(i2), r8, 0);
        C36341k9.A1J("error_code", list, r8, 1);
        C36341k9.A1J("error_message", list2, r8, 2);
        C142626pB r82 = A012;
        r82.A03((Boolean) null, (Integer) null, str, (String) null, C90474aD.A0k(C000400e.A08(r8)), (String) null, 3, A1S ? 1 : 0);
    }
}
