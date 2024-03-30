package X;

import java.util.List;

/* renamed from: X.73Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73Q implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6YD A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass73Q(AnonymousClass6YD r1, String str, List list, long j, boolean z) {
        this.A01 = r1;
        this.A03 = list;
        this.A02 = str;
        this.A00 = j;
        this.A04 = z;
    }

    public final void run() {
        AnonymousClass6YD r9 = this.A01;
        List list = this.A03;
        String str = this.A02;
        long j = this.A00;
        boolean z = this.A04;
        C36321k7.A0w(r9, list);
        int i = 0;
        int i2 = 0;
        for (Object next : list) {
            if ((next instanceof C106455Jt) || (next instanceof C106475Jv)) {
                i++;
            } else if (!(next instanceof C106435Jr)) {
            }
            i2++;
        }
        C142626pB A012 = AnonymousClass6YD.A01(r9);
        AnonymousClass1S3 r7 = r9.A0D;
        boolean A1S = AnonymousClass000.A1S(r7.A02, 98);
        int length = r7.A02().length();
        String A0B = r9.A0B();
        if (AnonymousClass6TR.A01(A012.A01)) {
            AnonymousClass2RY r12 = new AnonymousClass2RY();
            C90514aH.A1L(r12, C36371kC.A0o(), A1S ? 1 : 0);
            r12.A02 = 2;
            C142626pB.A01(A012, r12);
            C142626pB.A02(r12, Boolean.valueOf(z), Integer.valueOf(length), (Integer) null, Integer.valueOf(i), Integer.valueOf(i2), (Integer) null, Long.valueOf(j), A0B, (List) null);
            A012.A02.Bly(r12);
        }
        if (i2 == 0 && A1S) {
            A012.A03((Boolean) null, 2, str, (String) null, (String) null, (String) null, 3, 1);
        }
    }
}
