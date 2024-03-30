package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3o1  reason: invalid class name and case insensitive filesystem */
public final class C75923o1 implements AnonymousClass4UA {
    public final AnonymousClass1ZN A00;
    public final C52462pT A01;
    public final AnonymousClass4UA A02;
    public final String A03;
    public final String A04;

    public /* synthetic */ void BWf(C21854Abe abe, String str) {
    }

    public void Bmz(String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        if (this.A04 == null) {
            AnonymousClass1ZN r5 = this.A00;
            String str2 = this.A01.value;
            String str3 = this.A03;
            AnonymousClass00C.A0D(str2, 0);
            int A07 = r5.A01.A07(5304);
            if (A07 < 0) {
                A07 = 0;
            }
            long A002 = ((long) A07) + C19970wo.A00(r5.A00);
            if (str3 == null) {
                str3 = "global";
            }
            StringBuilder A0v = AnonymousClass000.A0v(str2);
            A0v.append('_');
            String A0q = AnonymousClass000.A0q(str3, A0v);
            Map map = r5.A02;
            synchronized (map) {
                map.put(A0q, new AnonymousClass3JF(str, list, A002));
            }
            AnonymousClass1ZN.A00(r5);
        }
        this.A02.Bmz(str, list);
    }

    public void BWe(C21854Abe abe) {
        String str = this.A04;
        AnonymousClass4UA r0 = this.A02;
        if (str == null) {
            r0.BWe(abe);
        } else {
            r0.BWf(abe, str);
        }
    }

    public C75923o1(AnonymousClass1ZN r1, C52462pT r2, AnonymousClass4UA r3, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
