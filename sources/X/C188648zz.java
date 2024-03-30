package X;

import java.util.Locale;

/* renamed from: X.8zz  reason: invalid class name and case insensitive filesystem */
public enum C188648zz {
    ;
    
    public final String project;
    public final String team;
    public final String title;
    public final int version;

    /* access modifiers changed from: public */
    C188648zz(String str, int i) {
        this.title = str;
        this.version = 0;
        this.project = r2.title;
        this.team = r2.team;
    }

    /* access modifiers changed from: public */
    static {
        C188648zz[] r2;
        A00 = C000900k.A00(r2);
    }

    public static C188648zz A00(C188548zl r1, String str, String str2, int i) {
        return new C188648zz(r1, str, str2, i);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = this.team;
        Locale locale = Locale.ROOT;
        A0u.append(C36431kI.A1D(locale, str));
        A0u.append('/');
        A0u.append(C36431kI.A1D(locale, this.project));
        A0u.append('/');
        String A0q = AnonymousClass000.A0q(this.title, A0u);
        int i = this.version;
        if (i <= 0) {
            return A0q;
        }
        StringBuilder A0v = AnonymousClass000.A0v(A0q);
        A0v.append('_');
        return C36381kD.A10(A0v, i);
    }
}
