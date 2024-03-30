package X;

import java.util.Map;

/* renamed from: X.903  reason: invalid class name */
public enum AnonymousClass903 {
    ;
    
    public static final Map A00 = null;
    public static final Map A01 = null;
    public final String[] otherEncodingNames;
    public final int[] values;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass001.A0J();
        A00 = AnonymousClass001.A0J();
        for (AnonymousClass903 r5 : values()) {
            for (int A1K : r5.values) {
                C90504aG.A1K(r5, A01, A1K);
            }
            A00.put(r5.name(), r5);
            for (String put : r5.otherEncodingNames) {
                A00.put(put, r5);
            }
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass903(String str, String... strArr) {
        this.values = new int[]{r4};
        this.otherEncodingNames = strArr;
    }

    /* access modifiers changed from: public */
    AnonymousClass903(String[] strArr, int i) {
        this.values = r2;
        this.otherEncodingNames = strArr;
    }
}
