package X;

import java.io.File;

/* renamed from: X.2Vj  reason: invalid class name and case insensitive filesystem */
public class C46182Vj extends C75173mn {
    public final /* synthetic */ C20350xQ A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46182Vj(C19970wo r9, C24381Cf r10, C20310xM r11, C20350xQ r12, C20350xQ r13, AnonymousClass3B9 r14, C238019x r15, File file, File file2) {
        super(r9, r10, r11, r13, r14, r15);
        this.A00 = r12;
        this.A01 = file;
        this.A02 = file2;
    }

    public void BiP(AnonymousClass39E r10, AnonymousClass147 r11) {
        super.BiP(r10, r11);
        C20350xQ r7 = this.A00;
        AnonymousClass141 A0D = r7.A0C.A0D(r11);
        AnonymousClass16K r8 = r7.A0E;
        File A002 = r8.A00(A0D);
        C18740tg.A06(A002);
        File file = this.A01;
        if (!file.renameTo(A002)) {
            StringBuilder A0v = AnonymousClass000.A0v("group/create again, failed to rename ");
            A0v.append(file.getAbsolutePath());
            A0v.append(" to ");
            C36341k9.A1O(A0v, A002.getAbsolutePath());
        }
        File A012 = r8.A01(A0D);
        C18740tg.A06(A012);
        File file2 = this.A02;
        if (!file2.renameTo(A012)) {
            StringBuilder A0v2 = AnonymousClass000.A0v("group/create again, failed to rename ");
            A0v2.append(file2.getAbsolutePath());
            A0v2.append(" to ");
            C36341k9.A1O(A0v2, A012.getAbsolutePath());
        }
        r7.A0v.A0E(A0D);
    }
}
