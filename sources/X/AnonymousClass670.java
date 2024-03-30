package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.670  reason: invalid class name */
public final class AnonymousClass670 {
    public final /* synthetic */ C128256Bn A00;
    public final /* synthetic */ C124755yk A01;
    public final /* synthetic */ AnonymousClass64R A02;

    public void A01(Integer num, int i, long j) {
        List A11 = C36371kC.A11(Long.valueOf(j));
        C124755yk r0 = this.A01;
        AnonymousClass6Y4.A06(r0.A01, r0.A06, r0.A08, A11, 4);
        this.A02.A00(num, 2, i, j);
    }

    public AnonymousClass670(C128256Bn r1, AnonymousClass64R r2, C124755yk r3) {
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public void A00(long j, String str) {
        AnonymousClass64R r6;
        Integer num;
        int i;
        int i2;
        Map map = this.A00.A02;
        long j2 = j;
        Long valueOf = Long.valueOf(j);
        C128556Cs r0 = (C128556Cs) map.get(valueOf);
        if (r0 == null) {
            C18740tg.A0D(false, "XFamilyCrosspostMediaUploadManager/cached DB data map entry is empty");
            List A11 = C36371kC.A11(valueOf);
            C124755yk r02 = this.A01;
            AnonymousClass6Y4.A06(r02.A01, r02.A06, r02.A08, A11, 4);
            r6 = this.A02;
            num = null;
            i = 2;
            i2 = -12;
        } else {
            long j3 = r0.A01;
            map.put(valueOf, new C128556Cs(r0.A02, r0.A03, str, r0.A00, j3));
            ((C132396Tl) this.A01.A08.get()).A03(j, str);
            r6 = this.A02;
            num = null;
            i = 1;
            i2 = 0;
        }
        r6.A00(num, i, i2, j2);
    }
}
