package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.4YX  reason: invalid class name */
public class AnonymousClass4YX implements Comparator {
    public String A00;
    public final int A01;

    public AnonymousClass4YX(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    public final int compare(Object obj, Object obj2) {
        String str;
        int parseInt;
        String name;
        int i = this.A01;
        String str2 = this.A00;
        File file = (File) obj;
        File file2 = (File) obj2;
        if (i != 0) {
            str = "$1";
            parseInt = Integer.parseInt(file2.getName().replaceAll(str2, str));
            name = file.getName();
        } else {
            str = "$1";
            parseInt = Integer.parseInt(file.getName().replaceAll(str2, str));
            name = file2.getName();
        }
        return Integer.compare(parseInt, Integer.parseInt(name.replaceAll(str2, str)));
    }
}
