package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.NoSuchElementException;

/* renamed from: X.71t  reason: invalid class name and case insensitive filesystem */
public abstract class C1495771t implements Closeable {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final JsonReader A04;

    public void close() {
        this.A01 = true;
        this.A04.close();
    }

    public Object A00() {
        Object obj;
        if (this.A01) {
            throw C90524aI.A0X("Closed.");
        } else if (!A01() || (obj = this.A00) == null) {
            throw new NoSuchElementException();
        } else {
            this.A00 = null;
            return obj;
        }
    }

    public boolean A01() {
        Object obj;
        if (!this.A01) {
            JsonReader jsonReader = this.A04;
            if (this.A00 != null) {
                return true;
            }
            if (!this.A02) {
                if (!this.A03) {
                    if (!(this instanceof AnonymousClass5D0)) {
                        if (!(this instanceof AnonymousClass5D2)) {
                            jsonReader.beginObject();
                            while (true) {
                                if (jsonReader.hasNext()) {
                                    if ("files".equals(jsonReader.nextName())) {
                                        break;
                                    }
                                    jsonReader.skipValue();
                                } else {
                                    break;
                                }
                            }
                        } else {
                            AnonymousClass5D2 r1 = (AnonymousClass5D2) this;
                            C18740tg.A06(r1.A01);
                            C18740tg.A06(r1.A00);
                            jsonReader.beginObject();
                            while (true) {
                                if (jsonReader.hasNext()) {
                                    if ("files".equals(jsonReader.nextName())) {
                                        break;
                                    }
                                    jsonReader.skipValue();
                                } else {
                                    break;
                                }
                            }
                            this.A02 = true;
                        }
                    } else {
                        jsonReader.beginObject();
                        while (true) {
                            if (jsonReader.hasNext()) {
                                if ("relativePaths".equals(jsonReader.nextName())) {
                                    break;
                                }
                                jsonReader.skipValue();
                            } else {
                                break;
                            }
                        }
                    }
                    jsonReader.beginArray();
                    this.A03 = true;
                }
                while (jsonReader.hasNext()) {
                    if (this instanceof AnonymousClass5D0) {
                        jsonReader.beginObject();
                        obj = null;
                        long j = 0;
                        String str = null;
                        boolean z = false;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            switch (nextName.hashCode()) {
                                case -393139297:
                                    if (!nextName.equals("required")) {
                                        break;
                                    } else {
                                        z = jsonReader.nextBoolean();
                                        break;
                                    }
                                case 3530753:
                                    if (!nextName.equals("size")) {
                                        break;
                                    } else {
                                        j = jsonReader.nextLong();
                                        break;
                                    }
                                case 2114191800:
                                    if (!nextName.equals("relative_path")) {
                                        break;
                                    } else {
                                        str = jsonReader.nextString();
                                        break;
                                    }
                            }
                        }
                        jsonReader.endObject();
                        if (str == null) {
                            Log.e("EncFileInfo/fromJson; file path is null, skipping...");
                        } else if (j != 0) {
                            obj = new C130816Mn(j, str, z);
                        }
                    } else if (this instanceof AnonymousClass5D2) {
                        AnonymousClass6T9 r7 = ((AnonymousClass5D2) this).A00;
                        C18740tg.A06(r7);
                        jsonReader.beginObject();
                        obj = null;
                        String str2 = null;
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("iv")) {
                                str3 = jsonReader.nextString();
                            } else if (!nextName2.equals("path")) {
                                jsonReader.skipValue();
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        if (str2 == null) {
                            Log.e("EncFileInfo/fromJson; file path is null, skipping...");
                        } else if (str3 == null) {
                            Log.e("EncFileInfo/fromJson; file IV is null, skipping...");
                        } else {
                            obj = new AnonymousClass624(r7.A02(str2), str3);
                        }
                    } else {
                        AnonymousClass5D1 r8 = (AnonymousClass5D1) this;
                        jsonReader.beginObject();
                        obj = null;
                        long j2 = -1;
                        String str4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            if (nextName3.equals("path")) {
                                str4 = jsonReader.nextString();
                            } else if (!nextName3.equals("size")) {
                                Log.e("GoogleMigrateFileData/parseFileDataObject/field not recognized");
                                jsonReader.skipValue();
                            } else {
                                j2 = jsonReader.nextLong();
                            }
                        }
                        jsonReader.endObject();
                        if (str4 != null) {
                            obj = new AnonymousClass6AR(r8.A00.A02(str4), j2);
                        } else {
                            Log.e("GoogleMigrateFileData/parseFileDataObject/file path is null or empty");
                        }
                    }
                    this.A00 = obj;
                    if (obj != null) {
                        return true;
                    }
                }
                this.A02 = true;
            }
            return false;
        }
        throw C90524aI.A0X("Closed.");
    }

    public C1495771t(JsonReader jsonReader) {
        this.A04 = jsonReader;
    }
}
