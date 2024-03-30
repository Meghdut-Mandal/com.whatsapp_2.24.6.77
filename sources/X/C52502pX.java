package X;

/* renamed from: X.2pX  reason: invalid class name and case insensitive filesystem */
public enum C52502pX {
    BOOLEAN("BOOLEAN"),
    BLOB("BLOB"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    DOUBLE("DOUBLE"),
    INTEGER("INTEGER"),
    REAL("REAL"),
    STRING("STRING"),
    TEXT("TEXT"),
    LONG("LONG"),
    UNSPECIFIED("");
    
    public final String value;

    public static C64563Om[] A03(C63573Ko r2) {
        C64563Om[] r1 = new C64563Om[1];
        r2.A02 = "jid";
        r2.A00 = TEXT;
        return r1;
    }

    public static C64563Om A00(C63573Ko r1, String str) {
        r1.A02 = str;
        r1.A00 = BLOB;
        return r1.A0r();
    }

    public static C52502pX A01(C63573Ko r1) {
        r1.A02 = "_id";
        return INTEGER;
    }

    public static C52502pX A02(C63573Ko r1) {
        r1.A02 = "message_row_id";
        return INTEGER;
    }

    /* access modifiers changed from: public */
    C52502pX(String str) {
        this.value = str;
    }
}
