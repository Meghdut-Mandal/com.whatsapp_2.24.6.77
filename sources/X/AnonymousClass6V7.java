package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6V7  reason: invalid class name */
public final class AnonymousClass6V7 {
    public final AnonymousClass17Y A00;
    public final C19770wU A01;
    public final C35021i1 A02;
    public final C28781Ua A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;

    public final void A03(AnonymousClass3T1 r6) {
        if (r6 instanceof C46812bi) {
            AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status", 0);
            return;
        }
        AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation", 0);
        ((C132396Tl) this.A09.get()).A04((String) null, 0, r6.A1N);
    }

    public final void A04(AnonymousClass2bV r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (this.A03.A01.A0E(4437)) {
            A03(r3);
            ((C1271467d) this.A08.get()).A01(r3);
        }
    }

    public static final void A00(Context context, AnonymousClass6V7 r8, C160237kg r9, String str, List list) {
        C134876bk r0;
        AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest started", 0);
        AnonymousClass005 r4 = r8.A09;
        C132396Tl r5 = (C132396Tl) r4.get();
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0J, it);
        }
        HashMap A022 = r5.A02(A0J);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C128556Cs r02 = (C128556Cs) A022.get(Long.valueOf(C36391kE.A0l(it2).A1N));
            if (r02 != null) {
                r0 = r02.A02;
            } else {
                r0 = null;
            }
            A0I.add(r0);
        }
        if (r8.A03.A01.A0E(4437)) {
            ArrayList<AnonymousClass2bV> A0I2 = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass2bV) {
                    A0I2.add(next);
                }
            }
            if (!A0I2.isEmpty()) {
                AnonymousClass005 r42 = r8.A08;
                C1271467d r2 = (C1271467d) r42.get();
                for (AnonymousClass2bV A002 : A0I2) {
                    r2.A00(context, A002);
                }
                C1271467d r22 = (C1271467d) r42.get();
                for (AnonymousClass2bV A012 : A0I2) {
                    r22.A01(A012);
                }
            }
        } else if (!A02(context, r8, list)) {
            ArrayList A0J2 = C36321k7.A0J(list);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C90464aC.A1T(A0J2, it3);
            }
            AnonymousClass6Y4.A05(r8.A00, r8.A02, r4, A0J2);
            AnonymousClass1UT.A01("XFamilyCrosspostRequestSessionManager/processTextStatusBurningAndMakeEligibilityRequest status burning fails", (Throwable) null);
            C18740tg.A0D(false, "XFamilyCrosspostRequestSessionManager/status burning fails");
            r9.BWZ(-16, (Integer) null);
            return;
        }
        ((C1266264t) r8.A05.get()).A00(r9, str, list, A0I);
    }

    public static final void A01(AnonymousClass6EF r26, AnonymousClass6V7 r27, C128256Bn r28, C128746Dl r29) {
        String str;
        File file;
        long j;
        int i;
        C104825Bn r8;
        AnonymousClass00C.A0D("XFamilyCrosspostRequestSessionManager/handleMediaUploadAndCrosspost started", 0);
        AnonymousClass6V7 r0 = r27;
        C128256Bn r5 = r28;
        C121985u6 r6 = new C121985u6(r26, r0, r5);
        C124755yk r3 = (C124755yk) r0.A0C.get();
        C18740tg.A00();
        C23931Ak r2 = r5.A00;
        AnonymousClass64R r62 = new AnonymousClass64R(new AnonymousClass5u7(r6, r5, r3), r2.size());
        C225614x it = r2.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C128556Cs r02 = (C128556Cs) r5.A02.get(Long.valueOf(A0l.A1N));
            if (r02 != null) {
                str = r02.A04;
            } else {
                str = null;
            }
            AnonymousClass670 r22 = new AnonymousClass670(r5, r62, r3);
            boolean z = A0l instanceof AnonymousClass2bV;
            if (z || (A0l instanceof AnonymousClass2bU)) {
                String A002 = r3.A03.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        C65013Qj r03 = ((AnonymousClass2bU) A0l).A01;
                        if (r03 == null) {
                            r22.A01((Integer) null, -8, A0l.A1N);
                        } else {
                            file = r03.A0I;
                        }
                    } else if (str == null || str.length() == 0) {
                        C18740tg.A0D(false, "invalid mediaFilePath for textStatus");
                        j = A0l.A1N;
                        i = -7;
                    } else {
                        file = r3.A00.A0X(str);
                    }
                    if (file == null || !file.exists()) {
                        if (!A0l.A1P) {
                            C18740tg.A0D(false, "media file does not exist");
                        }
                        j = A0l.A1N;
                        i = -9;
                    } else {
                        C25471Gl A012 = AnonymousClass6Y1.A01((AnonymousClass11F) null, A0l.A1I, 8);
                        AnonymousClass00C.A08(A012);
                        long j2 = A0l.A1N;
                        AnonymousClass3Ot r11 = new AnonymousClass3Ot(false, false, true);
                        Uri fromFile = Uri.fromFile(file);
                        if (A012 == C25471Gl.A0o) {
                            r8 = new C104825Bn(r3.A02);
                        } else {
                            r8 = null;
                        }
                        C128746Dl r13 = r29;
                        byte[] bArr = r13.A00;
                        C18740tg.A06(bArr);
                        C65233Rg A003 = C65233Rg.A00(fromFile, new C132046Rx(bArr, 1), r8, r11, A012, (AnonymousClass3S2) null, (String) null, 0, true, false, true);
                        AnonymousClass1D0 r7 = r3.A04;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        C146506vi A062 = r7.A06(new C144906t0(r13, bArr2), A003, true);
                        A062.A0X = "mms";
                        A062.A06(new AnonymousClass70Q(A062, r22, r3, j2), (Executor) null);
                        r3.A0A.put(Long.valueOf(j2), A062);
                        C1498272x.A00(r3.A05, A062, r3, 10);
                    }
                } else {
                    r22.A00(A0l.A1N, A002);
                }
            } else {
                C18740tg.A0D(false, AnonymousClass000.A0l(A0l, "invalid status type ", AnonymousClass000.A0u()));
                j = A0l.A1N;
                i = -6;
            }
            r22.A01((Integer) null, i, j);
        }
    }

    public static final boolean A02(Context context, AnonymousClass6V7 r10, List list) {
        String name;
        boolean z = context instanceof Application;
        if (z) {
            C18740tg.A0D(false, "XFamilyCrosspostRequestSessionManager/application context was passed for text status burning");
            AnonymousClass1UT.A01("XFamilyCrosspostRequestSessionManager/processTextStatusBurning application context was passed in for burning text status", (Throwable) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (A0l instanceof AnonymousClass2bV) {
                AnonymousClass632 r1 = (AnonymousClass632) r10.A0B.get();
                AnonymousClass2bV r7 = (AnonymousClass2bV) A0l;
                AnonymousClass00C.A0D(r7, 1);
                if (z) {
                    C18740tg.A0D(false, "Application context was passed in for burning");
                } else {
                    File A002 = r1.A01.A00(r7, C55452ue.A00(context, (C32721e5) null, r7));
                    if (!(A002 == null || (name = A002.getName()) == null)) {
                        ((C132396Tl) r10.A09.get()).A03(r7.A1N, name);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("XFamilyCrosspostRequestSessionManager/text status burning succeed for message: ");
                        AnonymousClass00C.A0D(C36411kG.A11(A0u, A0l.A1N), 0);
                    }
                }
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("XFamilyCrosspostRequestSessionManager/text status burning failed for message: ");
                AnonymousClass1UT.A01(C36411kG.A11(A0u2, A0l.A1N), (Throwable) null);
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6V7(AnonymousClass17Y r1, C19770wU r2, C35021i1 r3, C28781Ua r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11, AnonymousClass005 r12, AnonymousClass005 r13) {
        C36321k7.A1B(r1, r2, r4, r3, r5);
        C36321k7.A1C(r6, r7, r8, r9, r10);
        C36321k7.A15(r11, r12, r13);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A09 = r5;
        this.A06 = r6;
        this.A0B = r7;
        this.A0A = r8;
        this.A05 = r9;
        this.A0C = r10;
        this.A04 = r11;
        this.A07 = r12;
        this.A08 = r13;
    }

    public final void A05(List list, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        List list2 = list;
        ArrayList A0z = C36351kA.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C90464aC.A1T(A0z, it);
        }
        AnonymousClass00C.A0D(AnonymousClass000.A0o(A0z, A0u), 0);
        String A022 = AnonymousClass6Y4.A02();
        C36341k9.A0x(AnonymousClass3NV.A00((AnonymousClass3NV) this.A07.get()).edit(), "pref_debug_session_id", A022);
        ((AnonymousClass66L) this.A0A.get()).A00(A022);
        C132396Tl r3 = (C132396Tl) this.A09.get();
        ArrayList A0z2 = C36351kA.A0z(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C90464aC.A1T(A0z2, it2);
        }
        r3.A05(A022, A0z2);
        ((C1266264t) this.A05.get()).A00(new C1494671i(new C107595Qc(this, Boolean.valueOf(z), A022, list2, true), this, A022), A022, list, (List) null);
    }
}
