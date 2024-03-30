package X;

import com.facebook.msys.mci.FileManager;
import java.io.File;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.4YY  reason: invalid class name */
public class AnonymousClass4YY implements Comparator {
    public Object A00;
    public final int A01;

    public AnonymousClass4YY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                return FileManager.lambda$sortFilesByNewestFirst$0((Map) this.A00, (File) obj, (File) obj2);
            case 1:
                AnonymousClass1LV r1 = (AnonymousClass1LV) this.A00;
                AnonymousClass3QK r4 = (AnonymousClass3QK) obj;
                AnonymousClass3QK r5 = (AnonymousClass3QK) obj2;
                AnonymousClass00C.A0D(r1, 0);
                C36321k7.A0x(r4, r5);
                int A04 = r1.A02.A04(r4.A02, r5.A02);
                if (A04 != 0) {
                    return A04;
                }
                String str = r4.A04;
                String str2 = r5.A04;
                AnonymousClass00C.A08(str2);
                return str.compareTo(str2);
            default:
                C009003v r12 = (C009003v) this.A00;
                AnonymousClass00C.A0D(r12, 0);
                return AnonymousClass000.A0I(((AnonymousClass4NW) r12).invoke(obj, obj2));
        }
    }
}
