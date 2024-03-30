package X;

import java.util.Locale;

/* renamed from: X.6Ln  reason: invalid class name and case insensitive filesystem */
public class C130556Ln {
    public final C19700wN A00;
    public final C65653Sy A01;
    public final C123705wx A02 = new C123705wx();
    public final C29911Yl A03;
    public final AnonymousClass1A3 A04;
    public final C20310xM A05;
    public final AnonymousClass17S A06;
    public final C26171Jd A07;
    public final C30661aZ A08;
    public final AnonymousClass1A1 A09;

    public static void A00(C130556Ln r5, AnonymousClass8SU r6, Throwable th) {
        Locale locale = Locale.US;
        Object[] A1Z = C36431kI.A1Z("Failed to parse message from WMI.", 4);
        AnonymousClass8SW r0 = r6.key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        A1Z[1] = r0.id_;
        A1Z[2] = r6.A0u();
        C36341k9.A1T(A1Z, r6.messageStubParameters_.size());
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", A1Z);
        C90464aC.A1L("IncrementalBackup/MessagesImporter/", format, AnonymousClass000.A0u(), th);
        r5.A00.A0D("incremental-backup-importer-parsing-failed", AnonymousClass000.A0l(th, "; ex=", AnonymousClass000.A0v(format)), th);
    }

    public C130556Ln(C19700wN r2, C65653Sy r3, C29911Yl r4, AnonymousClass1A3 r5, C20310xM r6, AnonymousClass17S r7, C26171Jd r8, C30661aZ r9, AnonymousClass1A1 r10) {
        this.A00 = r2;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A04 = r5;
        this.A01 = r3;
        this.A07 = r8;
        this.A06 = r7;
        this.A03 = r4;
    }
}
