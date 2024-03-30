package X;

import android.text.TextUtils;

/* renamed from: X.2wn  reason: invalid class name and case insensitive filesystem */
public abstract class C56732wn {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C73983ks.A00;
        A0u.append(TextUtils.join(", ", strArr));
        A0u.append(" FROM ");
        A00 = AnonymousClass000.A0q("wa_vnames", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(TextUtils.join(", ", strArr), " FROM ", "wa_vnames", A0v);
        A0v.append(" WHERE ");
        A01 = AnonymousClass000.A0q("jid = ?", A0v);
    }
}
