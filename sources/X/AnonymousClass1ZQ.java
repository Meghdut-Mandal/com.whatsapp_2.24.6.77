package X;

/* renamed from: X.1ZQ  reason: invalid class name */
public final class AnonymousClass1ZQ {
    public final C19970wo A00;
    public final AnonymousClass1ZP A01;

    public AnonymousClass1ZQ(C19970wo r2, AnonymousClass1ZP r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A00(String str, long j) {
        AnonymousClass1ZP r3 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_timestamp");
        String A002 = r3.A00(sb.toString());
        if (A002 != null) {
            long parseLong = Long.parseLong(A002);
            if (Long.valueOf(parseLong) != null && (parseLong == -1 || this.A00.A04() - parseLong <= j)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_timestamp");
        r3.A01(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("_data");
        r3.A01(sb3.toString());
        return false;
    }
}
