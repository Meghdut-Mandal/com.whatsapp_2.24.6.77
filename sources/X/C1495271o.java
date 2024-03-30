package X;

import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.71o  reason: invalid class name and case insensitive filesystem */
public class C1495271o implements Closeable {
    public boolean A00;
    public final JsonWriter A01;
    public final C20070wy A02;
    public final ZipOutputStream A03;

    public void close() {
        if (!this.A00) {
            JsonWriter jsonWriter = this.A01;
            jsonWriter.endObject();
            jsonWriter.flush();
            this.A03.closeEntry();
            this.A00 = true;
        }
    }

    public C1495271o(Map map, ZipOutputStream zipOutputStream) {
        this.A02 = C20070wy.copyOf(map);
        this.A03 = zipOutputStream;
        zipOutputStream.putNextEntry(new ZipEntry("metadata.json"));
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(zipOutputStream)));
        this.A01 = jsonWriter;
        jsonWriter.beginObject();
    }
}
