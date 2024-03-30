package X;

import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3s0  reason: invalid class name and case insensitive filesystem */
public final class C78373s0 implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final C19700wN A01;
    public final AnonymousClass164 A02;

    public static void A00(C78373s0 r6, AnonymousClass3T1 r7) {
        C1495671s B1k;
        AnonymousClass00C.A0D(r7, 0);
        if (r7 instanceof AnonymousClass2bX) {
            C25071Ew r3 = (C25071Ew) r6.A00.get();
            if (r7.A0b() != null) {
                C25071Ew.A02(r3, r7.A0b(), r7.A1N);
                return;
            }
            return;
        } else if (r7 instanceof AnonymousClass2bW) {
            C25071Ew r62 = (C25071Ew) r6.A00.get();
            AnonymousClass2bW r72 = (AnonymousClass2bW) r7;
            if (!r72.A1X().isEmpty()) {
                List<String> A1X = r72.A1X();
                AnonymousClass1M0 A05 = r62.A07.A05();
                try {
                    B1k = A05.B1k();
                    for (String A022 : A1X) {
                        C25071Ew.A02(r62, A022, r72.A1N);
                    }
                    B1k.A00();
                    B1k.close();
                    A05.close();
                    return;
                } catch (Throwable th) {
                    try {
                        A05.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                return;
            }
        } else {
            r6.A01(r7);
            return;
        }
        throw th;
    }

    public void B7J(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5 instanceof AnonymousClass2bX) {
            AnonymousClass2bX r52 = (AnonymousClass2bX) r5;
            ArrayList A002 = C25071Ew.A00((C25071Ew) this.A00.get(), r52.A1N, false);
            if (!A002.isEmpty()) {
                r52.A1Y(C36421kH.A0e(A002, 0));
            }
        } else if (r5 instanceof AnonymousClass2bW) {
            AnonymousClass2bW r53 = (AnonymousClass2bW) r5;
            ArrayList A003 = C25071Ew.A00((C25071Ew) this.A00.get(), r53.A1N, false);
            if (!A003.isEmpty()) {
                r53.A1Y(A003);
            }
        } else {
            A01(r5);
        }
    }

    public C78373s0(C19700wN r1, AnonymousClass164 r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r3, r2);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }

    private final void A01(AnonymousClass3T1 r5) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Incorrect message type associated with FMessageContactDatabase, key=");
        A0u.append(r5.A1J);
        A0u.append(", message_type=");
        String A10 = C36381kD.A10(A0u, r5.A1I);
        C18740tg.A0D(false, A10);
        C36321k7.A1R("FMessageContactDatabase/fill; ", A10, AnonymousClass000.A0u());
        this.A01.A0E("fmessage-database-mismatch", A10, false);
    }

    public void BKi(AnonymousClass3T1 r3) {
        A00(this, r3);
        this.A02.A01(new ProcessVCardMessageJob(r3));
    }

    public void BwV(AnonymousClass3T1 r1) {
        A00(this, r1);
    }
}
