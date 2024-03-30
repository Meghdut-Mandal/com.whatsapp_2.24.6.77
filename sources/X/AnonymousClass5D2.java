package X;

import android.util.JsonReader;
import java.util.zip.ZipInputStream;

/* renamed from: X.5D2  reason: invalid class name */
public class AnonymousClass5D2 extends C1495771t {
    public final AnonymousClass6T9 A00;
    public final ZipInputStream A01;

    public AnonymousClass5D2(JsonReader jsonReader, AnonymousClass6T9 r2, ZipInputStream zipInputStream) {
        super(jsonReader);
        this.A01 = zipInputStream;
        this.A00 = r2;
    }

    public void close() {
        super.close();
        this.A01.close();
    }
}
