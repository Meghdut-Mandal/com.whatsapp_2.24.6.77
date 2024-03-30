package X;

import java.io.File;

/* renamed from: X.5Za  reason: invalid class name and case insensitive filesystem */
public abstract class C109765Za {
    public static AnonymousClass6QE A00(C19730wQ r3, C132716Uy r4, C24431Ck r5, C24341Cb r6, AnonymousClass1CY r7, C20840yF r8, C24391Cg r9, AnonymousClass5U6 r10, AnonymousClass1CS r11, File file, Boolean bool) {
        AnonymousClass5U6 r2 = r10;
        int i = r10.version;
        AnonymousClass1CS r102 = r11;
        File file2 = file;
        if (i == AnonymousClass5U6.UNENCRYPTED.version) {
            return new C101434xY(r6, r8, r102, file);
        }
        if (i == AnonymousClass5U6.CRYPT12.version) {
            return new C101464xb(r3, r4, r5, r6, r7, r8, r9, r102, file2);
        }
        if (i == AnonymousClass5U6.CRYPT13.version) {
            return new C101444xZ(r3, r4, r5, r6, r7, r8, r9, r102, file2);
        }
        Boolean bool2 = bool;
        if (i == AnonymousClass5U6.CRYPT14.version) {
            return new C101474xc(r3, r4, r5, r6, r7, r8, r9, r102, file2, bool2);
        }
        if (i == AnonymousClass5U6.CRYPT15.version) {
            return new C101454xa(r3, r4, r5, r6, r7, r8, r9, r102, file2, bool2);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupFile/verify-integrity/unknown-version: ");
        A0u.append(r2);
        r9.A00(AnonymousClass000.A0l(file2, " ", A0u), 4);
        throw C90524aI.A0X("BackupFile/verify-integrity/unknown-version");
    }
}
