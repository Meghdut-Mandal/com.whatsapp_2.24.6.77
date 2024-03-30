package X;

import android.os.ParcelFileDescriptor;
import android.util.JsonReader;

/* renamed from: X.5D1  reason: invalid class name */
public class AnonymousClass5D1 extends C1495771t {
    public final AnonymousClass6T9 A00;
    public final ParcelFileDescriptor A01;

    public AnonymousClass5D1(ParcelFileDescriptor parcelFileDescriptor, JsonReader jsonReader, AnonymousClass6T9 r3) {
        super(jsonReader);
        this.A01 = parcelFileDescriptor;
        this.A00 = r3;
    }

    public void close() {
        super.close();
        this.A01.close();
    }
}
