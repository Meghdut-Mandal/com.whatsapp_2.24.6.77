package X;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: X.64W  reason: invalid class name */
public class AnonymousClass64W {
    public Context A00;
    public AnonymousClass63I A01;
    public AnonymousClass6M6 A02;
    public AnonymousClass7ez A03;
    public C109645Yj A04;
    public C109655Yk A05;
    public C118685oZ A06;

    public C160937lp A00(C131456Pc r12, AnonymousClass6F1 r13, C125085zI r14, C159107ip r15, ExecutorService executorService) {
        AnonymousClass63I r1;
        C125085zI r8 = r14;
        C159107ip r9 = r15;
        if (AnonymousClass000.A1P("image/gif".equals(C109715Yq.A00(r13.A01.getPath(), "video/mp4")) ? 1 : 0) && (r1 = this.A01) != null) {
            Context context = this.A00;
            Objects.requireNonNull(r1);
            return new C141336n4(context, r1, r14, r15);
        } else if (r13.A01()) {
            return new C141326n3(this.A02, r14, r15);
        } else {
            C118685oZ r7 = this.A06;
            return new C141356n6(this.A03, r12, this.A04, this.A05, r7, r8, r9, executorService);
        }
    }

    public AnonymousClass64W(Context context, AnonymousClass63I r2, AnonymousClass6M6 r3, AnonymousClass7ez r4, C109645Yj r5, C109655Yk r6, C118685oZ r7) {
        this.A00 = context;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
    }
}
