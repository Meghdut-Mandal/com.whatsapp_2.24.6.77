package X;

import android.database.Cursor;

/* renamed from: X.3rg  reason: invalid class name and case insensitive filesystem */
public final class C78173rg implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78173rg(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r8) {
        Cursor A09;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof AnonymousClass2bH) {
            C25221Fl A0g = C36441kJ.A0g(this.A00);
            AnonymousClass2bH r82 = (AnonymousClass2bH) r8;
            r82.A1X(Integer.valueOf(C25221Fl.A00(A0g, r82.A1N)));
            long j = r82.A1N;
            AnonymousClass1M0 A04 = A0g.A02.get();
            try {
                C224114e r5 = A04.A02;
                String[] A1R = C36441kJ.A1R();
                int i = 0;
                A1R[0] = Long.toString(j);
                A09 = r5.A09("SELECT ephemeral_trigger FROM message_ephemeral_setting WHERE message_row_id = ?", "GET_EPHEMERAL_SETTING_TRIGGER", A1R);
                if (A09.moveToNext()) {
                    i = C36351kA.A03(A09, "ephemeral_trigger");
                }
                A09.close();
                A04.close();
                r82.A04 = i;
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (r8 instanceof AnonymousClass2bY) {
            AnonymousClass2bY r83 = (AnonymousClass2bY) r8;
            r83.A1X(Integer.valueOf(C25221Fl.A00(C36441kJ.A0g(this.A00), r83.A1N)));
            return;
        } else {
            return;
        }
        throw th;
    }

    public void BKi(AnonymousClass3T1 r10) {
        AnonymousClass00C.A0D(r10, 0);
        if (r10 instanceof AnonymousClass2bH) {
            AnonymousClass005 r0 = this.A00;
            C25221Fl A0g = C36441kJ.A0g(r0);
            long j = r10.A1N;
            AnonymousClass2bH r102 = (AnonymousClass2bH) r10;
            A0g.A06((Boolean) null, r102.A00, 0, 0, j);
            C36441kJ.A0g(r0).A05((C65073Qp) null, r102);
        } else if (r10 instanceof AnonymousClass2bY) {
            AnonymousClass005 r02 = this.A00;
            AnonymousClass2bY r1 = (AnonymousClass2bY) r10;
            C36441kJ.A0g(r02).A06((Boolean) null, r1.A00, r10.A00, 0, r10.A1N);
            C36441kJ.A0g(r02).A03(r1);
        }
    }

    public void BwV(AnonymousClass3T1 r11) {
        AnonymousClass00C.A0D(r11, 0);
        if (r11 instanceof AnonymousClass2bH) {
            AnonymousClass005 r0 = this.A00;
            C25221Fl A0g = C36441kJ.A0g(r0);
            long j = r11.A1N;
            AnonymousClass2bH r2 = (AnonymousClass2bH) r11;
            A0g.A06(r11.A0d, r2.A00, 0, r11.A04, j);
            C36441kJ.A0g(r0).A05((C65073Qp) null, r2);
        } else if (r11 instanceof AnonymousClass2bY) {
            AnonymousClass005 r02 = this.A00;
            C25221Fl A0g2 = C36441kJ.A0g(r02);
            long j2 = r11.A1N;
            AnonymousClass2bY r1 = (AnonymousClass2bY) r11;
            A0g2.A06(r11.A0d, r1.A00, r11.A00, r11.A04, j2);
            C36441kJ.A0g(r02).A03(r1);
        }
    }
}
