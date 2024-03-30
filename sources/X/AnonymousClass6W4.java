package X;

import android.util.JsonReader;
import java.util.Locale;

/* renamed from: X.6W4  reason: invalid class name */
public final class AnonymousClass6W4 {
    public static final AnonymousClass6W4 A00 = new AnonymousClass6W4();

    public final String A03(C18820ts r3, Locale locale) {
        String str;
        String language;
        String country;
        if (locale == null || (language = locale.getLanguage()) == null || language.length() == 0) {
            str = r3.A06();
        } else {
            String language2 = locale.getLanguage();
            if (language2 == null || !language2.equalsIgnoreCase("zh") || (country = locale.getCountry()) == null || country.length() == 0) {
                str = locale.getLanguage();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(locale.getLanguage());
                A0u.append('-');
                return AnonymousClass000.A0q(locale.getCountry(), A0u);
            }
        }
        AnonymousClass00C.A08(str);
        return str;
    }

    public static final AnonymousClass00I A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (AnonymousClass00C.A0J(nextName, "status")) {
                i = jsonReader.nextInt();
            } else if (AnonymousClass00C.A0J(nextName, "msg")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return C36441kJ.A0W(Integer.valueOf(i), str);
    }

    public static final AnonymousClass3XN A01(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        int i2 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116079) {
                        if (hashCode == 113126854 && nextName.equals("width")) {
                            i = C90484aE.A0A(jsonReader);
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("height")) {
                    i2 = C90484aE.A0A(jsonReader);
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str != null) {
            return new AnonymousClass3XN(str, i, i2);
        }
        return null;
    }

    public static final String A02(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -1019779949) {
                    if (hashCode != -407761836) {
                        if (hashCode == 94851343 && nextName.equals("count")) {
                            i2 = jsonReader.nextInt();
                        }
                    } else if (nextName.equals("total_count")) {
                        i4 = jsonReader.nextInt();
                    }
                } else if (nextName.equals("offset")) {
                    i3 = jsonReader.nextInt();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (i2 <= 0 || i3 < 0 || i4 <= 0 || i4 <= (i = i2 + i3)) {
            return null;
        }
        return String.valueOf(i);
    }
}
