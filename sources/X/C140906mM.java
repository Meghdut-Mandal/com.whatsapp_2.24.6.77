package X;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6mM  reason: invalid class name and case insensitive filesystem */
public class C140906mM implements C157877ep {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final AnonymousClass6EQ A02;
    public final C157957ey A03;
    public final Map A04 = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final Executor A05;

    public /* bridge */ /* synthetic */ void BcH(AnonymousClass6MU r8, C125255za r9, File file) {
        File file2;
        C98474rU r5 = (C98474rU) r9;
        String str = r5.A00;
        AnonymousClass6MU r4 = r8;
        if (str == null) {
            str = r8.A00;
        }
        r5.A00 = str;
        Map map = this.A04;
        File file3 = file;
        try {
            file2 = file.getCanonicalFile();
        } catch (IOException unused) {
            file2 = file.getAbsoluteFile();
        }
        map.put(file2, r5);
        this.A05.execute(new C1503474x((Object) file3, (Object) this, (Object) r4, (Object) r5, 5));
    }

    public C140906mM(C157957ey r3) {
        this.A03 = r3;
        this.A02 = ((C157917et) r3).BHy("eviction.v2");
        this.A05 = ((C157937ew) r3).BBh(C023109s.A00);
    }
}
