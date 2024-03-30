package X;

import java.io.File;

/* renamed from: X.70M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70M implements C25711Hj {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C006302t A03;

    public /* synthetic */ AnonymousClass70M(String str, String str2, String str3, C006302t r4) {
        this.A03 = r4;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final void accept(Object obj) {
        String str;
        C006302t r2 = this.A03;
        String str2 = this.A00;
        String str3 = this.A01;
        String str4 = this.A02;
        C122615v9 r10 = (C122615v9) obj;
        AnonymousClass00C.A0D(r10, 4);
        File file = r10.A00;
        Long l = null;
        if (file != null) {
            str = file.getName();
            l = Long.valueOf(file.length());
        } else {
            str = null;
        }
        r2.invoke(new AnonymousClass57E(new C128586Cv(l, str2, str3, str4, str)));
    }
}
