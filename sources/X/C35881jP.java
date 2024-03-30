package X;

/* renamed from: X.1jP  reason: invalid class name and case insensitive filesystem */
public class C35881jP extends C118095nK implements C22841Awq {
    public String A00;
    public final int A01;

    public C35881jP(C203399nx r10, int i) {
        String[] strArr;
        Class<String> cls;
        long j;
        long j2;
        this.A01 = i;
        C203399nx r2 = r10;
        if (i != 0) {
            C203399nx.A0A(r10, "set");
            strArr = new String[]{"#elementValue"};
            cls = String.class;
            j = 1L;
            j2 = 256;
        } else {
            C203399nx.A0A(r10, "set");
            strArr = new String[]{"hash"};
            cls = String.class;
            j = 0L;
            j2 = 64;
        }
        this.A00 = (String) C203379ns.A03(r2, cls, j, Long.valueOf(j2), (Object) null, strArr, false);
        this.A00 = r10;
    }
}
