package X;

import com.google.android.gms.common.api.Scope;

/* renamed from: X.0S3  reason: invalid class name */
public abstract class AnonymousClass0S3 {
    public static final AnonymousClass0JC A00;
    public static final AnonymousClass0JC A01;
    public static final AnonymousClass0QI A02;
    public static final AnonymousClass0QI A03;
    public static final C06190Sq A04;
    public static final C06190Sq A05;

    static {
        AnonymousClass0QI r6 = new AnonymousClass0QI();
        A02 = r6;
        AnonymousClass0QI r5 = new AnonymousClass0QI();
        A03 = r5;
        AnonymousClass0JA r4 = new AnonymousClass0JA();
        A01 = r4;
        AnonymousClass0JB r3 = new AnonymousClass0JB();
        A00 = r3;
        new Scope(1, "profile");
        new Scope(1, "email");
        A04 = new C06190Sq(r4, r6, "SignIn.API");
        A05 = new C06190Sq(r3, r5, "SignIn.INTERNAL_API");
    }
}
