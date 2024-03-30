package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.66z  reason: invalid class name and case insensitive filesystem */
public final class C1271066z {
    public final /* synthetic */ AnonymousClass6DN A00;
    public final /* synthetic */ C124835ys A01;
    public final /* synthetic */ AnonymousClass64O A02;

    public C1271066z(AnonymousClass6DN r1, AnonymousClass64O r2, C124835ys r3) {
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public void A00(int i, long j) {
        C23931Ak r0 = this.A00.A01;
        ArrayList A0J = C36321k7.A0J(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C127986Ak.A00(A0J, it);
        }
        List A11 = C36371kC.A11(Long.valueOf(j));
        C124835ys r02 = this.A01;
        AnonymousClass6R9.A00(r02.A02, r02.A07, r02.A09, A11, A0J, 4);
        this.A02.A00(2, j, i);
    }

    public void A01(long j, String str) {
        AnonymousClass64O r2;
        int i;
        int i2;
        AnonymousClass6DN r22 = this.A00;
        Map map = r22.A05;
        Long valueOf = Long.valueOf(j);
        AnonymousClass6D4 r0 = (AnonymousClass6D4) map.get(valueOf);
        if (r0 == null) {
            C18740tg.A0D(false, "CrosspostMediaUploadManager/cached DB data map entry is empty");
            C23931Ak r02 = r22.A01;
            ArrayList A0J = C36321k7.A0J(r02);
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                C127986Ak.A00(A0J, it);
            }
            List A11 = C36371kC.A11(valueOf);
            C124835ys r03 = this.A01;
            AnonymousClass6R9.A00(r03.A02, r03.A07, r03.A09, A11, A0J, 4);
            r2 = this.A02;
            i = 2;
            i2 = -12;
        } else {
            String str2 = str;
            map.put(valueOf, new AnonymousClass6D4(r0.A03, r0.A02, str2, r0.A04, r0.A00));
            ContentValues A0E = C36441kJ.A0E();
            A0E.put("direct_url_path", str);
            AnonymousClass6VF.A02(A0E, (AnonymousClass6VF) this.A01.A09.get(), C36371kC.A11(valueOf));
            r2 = this.A02;
            i = 1;
            i2 = 0;
        }
        r2.A00(i, j, i2);
    }
}
