package X;

import android.util.JsonWriter;

/* renamed from: X.6Mn  reason: invalid class name and case insensitive filesystem */
public class C130816Mn {
    public boolean A00;
    public long A01;
    public String A02;

    public C130816Mn(long j, String str, boolean z) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = z;
    }

    public void A00(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        jsonWriter.name("relative_path").value(this.A02);
        jsonWriter.name("size").value(this.A01);
        jsonWriter.name("required").value(this.A00);
        jsonWriter.endObject();
    }

    public C130816Mn(C123905xH r3) {
        this.A02 = r3.A04;
        this.A01 = r3.A01;
        this.A00 = r3.A05;
    }
}
