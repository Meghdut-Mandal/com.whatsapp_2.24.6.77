package X;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.3xE  reason: invalid class name and case insensitive filesystem */
public class C81573xE implements Comparator {
    public static final DateFormat A00 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Date date;
        long j;
        long lastModified;
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file == null) {
            if (file2 == null) {
                return 0;
            }
            return 1;
        } else if (file2 == null) {
            return -1;
        } else {
            String name = file.getName();
            Date date2 = null;
            if (!name.matches("^.*((\\d{4})-(\\d{2})-(\\d{2})).*$")) {
                date = null;
            } else {
                try {
                    date = A00.parse(name.replaceAll("^.*((\\d{4})-(\\d{2})-(\\d{2})).*$", "$1"));
                } catch (ParseException unused) {
                    date = null;
                }
            }
            String name2 = file2.getName();
            if (name2.matches("^.*((\\d{4})-(\\d{2})-(\\d{2})).*$")) {
                try {
                    date2 = A00.parse(name2.replaceAll("^.*((\\d{4})-(\\d{2})-(\\d{2})).*$", "$1"));
                } catch (ParseException unused2) {
                }
            }
            if (date == null) {
                if (date2 != null) {
                    j = file.lastModified();
                    lastModified = date2.getTime();
                }
                j = file.lastModified();
                lastModified = file2.lastModified();
            } else if (date2 != null) {
                int compareTo = date.compareTo(date2);
                if (compareTo != 0) {
                    return compareTo;
                }
                j = file.lastModified();
                lastModified = file2.lastModified();
            } else {
                j = date.getTime();
                lastModified = file2.lastModified();
            }
            return Long.compare(j, lastModified);
        }
    }
}
