package X;

/* renamed from: X.030  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass030 {
    public static final long A00(String str, long j, long j2, long j3) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A04 = AnonymousClass097.A04(property);
                if (A04 != null) {
                    long longValue = A04.longValue();
                    if (j2 <= longValue && longValue <= j3) {
                        return longValue;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("System property '");
                    sb.append(str);
                    sb.append("' should be in range ");
                    sb.append(j2);
                    sb.append("..");
                    sb.append(j3);
                    sb.append(", but is '");
                    sb.append(longValue);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("System property '");
                sb2.append(str);
                sb2.append("' has unrecognized value '");
                sb2.append(property);
                sb2.append('\'');
                throw new IllegalStateException(sb2.toString());
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
