package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.5Ms  reason: invalid class name and case insensitive filesystem */
public abstract class C107145Ms extends C132446Tt {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ AnonymousClass6Ej A03;

    public C107145Ms(AnonymousClass6Ej r1, boolean z, boolean z2, boolean z3) {
        this.A03 = r1;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C131006Ni r4 = (C131006Ni) obj;
        if (!A0L(r4)) {
            boolean A002 = r4.A00();
            StringBuilder A0u = AnonymousClass000.A0u();
            String A0H = A0H();
            if (A002) {
                A0u.append(A0H);
                C36321k7.A1a(A0u, "success");
                boolean z = this.A00;
                if (!z) {
                    C36321k7.A1a(AnonymousClass000.A0v(A0H), "notregname/send-active");
                    this.A03.A03.A04(true);
                }
                AnonymousClass6Ej r1 = this.A03;
                r1.A04.A01();
                if (!z) {
                    r1.A02.A07();
                }
            } else {
                A0u.append(A0H);
                C36321k7.A1K(r4, "failed with status: ", A0u);
            }
            AnonymousClass6Ej r0 = this.A03;
            r0.A01();
            r0.A03(r4);
        }
    }

    public C131006Ni A0G() {
        if (this instanceof AnonymousClass5JU) {
            AnonymousClass5JU r3 = (AnonymousClass5JU) this;
            AnonymousClass5JW r2 = r3.A00;
            r2.A01.A00();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("restore>PrepareMessageStoreTask/");
            C36321k7.A1a(A0u, "initialize msgstore from backup");
            C165287tB r5 = new C165287tB(r3, 1);
            C29301Wc r4 = r2.A01;
            boolean z = r3.A01;
            File A012 = r2.A03.A01(AnonymousClass6XZ.A01);
            AnonymousClass1Q9 r1 = C29301Wc.A00(r4).A09;
            return r1.A0G(new C145086tK(r1, r5, A012), z);
        }
        AnonymousClass5JV r6 = (AnonymousClass5JV) this;
        AnonymousClass5JX r52 = r6.A01;
        r52.A08.A00();
        boolean z2 = r6.A02;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (z2) {
            A0u2.append("restore>PrepareMessageStoreTask/");
            C36321k7.A1a(A0u2, "initialize msgstore from backup");
            C165287tB r42 = new C165287tB(r6, 0);
            C29301Wc r0 = r52.A01;
            boolean z3 = r6.A01;
            AnonymousClass1Q9 r22 = C29301Wc.A00(r0).A09;
            C131006Ni A0G = r22.A0G(new AnonymousClass6XX(r22, r42, 1), z3);
            if (!r6.A00) {
                AnonymousClass196 r12 = r52.A05;
                if (r12.A0S()) {
                    r12.A0I(5);
                }
            }
            return A0G;
        }
        A0u2.append("restore>PrepareMessageStoreTask/");
        C36321k7.A1a(A0u2, "initializeMessageStore/newstore");
        return r52.A07.A00();
    }

    public void A0I() {
        if (this instanceof AnonymousClass5JU) {
            AnonymousClass5JW r4 = ((AnonymousClass5JU) this).A00;
            Iterator A0q = C90474aD.A0q(r4.A05);
            while (A0q.hasNext()) {
                AnonymousClass1CP r6 = (AnonymousClass1CP) A0q.next();
                String A0J = r6.A0J();
                try {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("restore>PrepareMessageStoreTask/");
                    C36321k7.A1Q(" restoring ", A0J, A0u);
                    Context context = r4.A00.A00;
                    AnonymousClass00C.A08(context);
                    r6.A0I(context, C36441kJ.A0w(r4.A03.A00.getFilesDir(), "migration/import/sandbox"));
                    C36321k7.A1Q(" restored ", A0J, AnonymousClass000.A0v("restore>PrepareMessageStoreTask/"));
                } catch (Exception e) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("restore>PrepareMessageStoreTask/");
                    A0u2.append(" failed to restore ");
                    C36351kA.A1P(A0J, A0u2, e);
                }
            }
            return;
        }
        AnonymousClass5JV r1 = (AnonymousClass5JV) this;
        if (r1.A00 && r1.A02) {
            AnonymousClass5JX r42 = r1.A01;
            Iterator A0q2 = C90474aD.A0q(r42.A09);
            while (A0q2.hasNext()) {
                AnonymousClass1CP r5 = (AnonymousClass1CP) A0q2.next();
                String A0J2 = r5.A0J();
                try {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("restore>PrepareMessageStoreTask/");
                    C36321k7.A1Q("restoring ", A0J2, A0u3);
                    Activity activity = r42.A01;
                    AnonymousClass00C.A0D(activity, 0);
                    r5.A0I(activity, r5.A02.A02());
                    C36321k7.A1Q("restored ", A0J2, AnonymousClass000.A0v("restore>PrepareMessageStoreTask/"));
                } catch (Exception e2) {
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("restore>PrepareMessageStoreTask/");
                    A0u4.append("failed to restore ");
                    C36351kA.A1P(A0J2, A0u4, e2);
                }
            }
        }
    }

    public void A0J(long j) {
        if (this.A02 && j > 0) {
            SystemClock.sleep(j);
        }
    }

    public void A0K(C131006Ni r5) {
        if (!(this instanceof AnonymousClass5JU)) {
            AnonymousClass5JV r3 = (AnonymousClass5JV) this;
            if (r3.A02 && r5.A00 == 2 && r3.A00) {
                r3.A01.A02.A0H(new C1496972k(r3, 8));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.C131006Ni r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass5JU
            if (r0 != 0) goto L_0x0075
            r4 = r5
            X.5JV r4 = (X.AnonymousClass5JV) r4
            X.1kW r0 = X.AnonymousClass5JX.A0G
            if (r0 == 0) goto L_0x0017
            X.5JX r0 = r4.A01
            android.app.Activity r1 = r0.A01
            r0 = 100
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 0
            X.AnonymousClass5JX.A0G = r0
        L_0x0017:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x0027
            r0 = 3
            if (r1 == r0) goto L_0x0027
            r0 = 4
            if (r1 == r0) goto L_0x0027
            r0 = 5
            if (r1 == r0) goto L_0x0027
            r0 = 6
            if (r1 != r0) goto L_0x0069
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference r1 = X.AnonymousClass5JX.A0H
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r6 = r1.get()
            X.6Ni r6 = (X.C131006Ni) r6
        L_0x0035:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x0045
            r0 = 3
            if (r1 == r0) goto L_0x0045
            r0 = 4
            if (r1 == r0) goto L_0x0045
            r0 = 5
            if (r1 == r0) goto L_0x0045
            r0 = 6
            if (r1 != r0) goto L_0x0075
        L_0x0045:
            r3 = 1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "restore>PrepareMessageStoreTask/"
            r2.append(r1)
            java.lang.String r0 = "setting onePrepareMsgstoreTaskAlreadyFinished to true"
            X.C36321k7.A1a(r2, r0)
            X.5JX r0 = r4.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0A
            boolean r0 = r0.getAndSet(r3)
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "this attempt failed but another attempt in parallel proceeded further than this stage, therefore, aborting this attempt "
            X.C36321k7.A1K(r6, r0, r1)
            r0 = 1
            return r0
        L_0x0069:
            java.util.concurrent.atomic.AtomicReference r1 = X.AnonymousClass5JX.A0H
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x0035
            r1.set(r6)
            goto L_0x0035
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107145Ms.A0L(X.6Ni):boolean");
    }

    public String A0H() {
        return "restore>PrepareMessageStoreTask/";
    }
}
