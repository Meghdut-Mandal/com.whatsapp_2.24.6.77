package X;

import android.content.ContentValues;
import android.net.Uri;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public final class C34971hw {
    public final AnonymousClass17Y A00;
    public final C19770wU A01;
    public final C34931hs A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;

    public C34971hw(AnonymousClass17Y r2, C19770wU r3, C34931hs r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r10, 9);
        AnonymousClass00C.A0D(r11, 10);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r5;
        this.A05 = r6;
        this.A03 = r7;
        this.A09 = r8;
        this.A07 = r9;
        this.A04 = r10;
        this.A06 = r11;
    }

    public final void A01(AnonymousClass3T1 r4, List list) {
        if (r4 instanceof C46812bi) {
            AnonymousClass00C.A0D("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation skip for audio status", 0);
            return;
        }
        AnonymousClass00C.A0D("CrosspostRequestSessionManager/handleNewAutoShareRecordCreation start new record creation", 0);
        ((AnonymousClass6VF) this.A08.get()).A05(list, r4.A1N);
    }

    public final void A02(AnonymousClass2bV r2, List list) {
        AnonymousClass00C.A0D(r2, 0);
        A01(r2, list);
        ((AnonymousClass67T) this.A06.get()).A01(r2);
    }

    public static final void A00(AnonymousClass692 r25, C34971hw r26, AnonymousClass6DN r27, C128736Dk r28) {
        String str;
        File file;
        long j;
        int i;
        C104825Bn r3;
        AnonymousClass00C.A0D("CrosspostRequestSessionManager/handleMediaUploadAndCrosspost started", 0);
        C34971hw r0 = r26;
        AnonymousClass6DN r10 = r27;
        C121965u0 r32 = new C121965u0(r25, r0, r10);
        C124835ys r9 = (C124835ys) r0.A09.get();
        C18740tg.A00();
        C23931Ak r2 = r10.A02;
        AnonymousClass64O r8 = new AnonymousClass64O(new C121975u2(r32, r10, r9), r2.size());
        C225614x it = r2.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r33 = (AnonymousClass3T1) it.next();
            Map map = r10.A05;
            AnonymousClass6D4 r02 = (AnonymousClass6D4) map.get(Long.valueOf(r33.A1N));
            String str2 = null;
            if (r02 != null) {
                str = r02.A01;
            } else {
                str = null;
            }
            AnonymousClass6D4 r03 = (AnonymousClass6D4) map.get(Long.valueOf(r33.A1N));
            if (r03 != null) {
                str2 = r03.A02;
            }
            C1271066z r7 = new C1271066z(r10, r8, r9);
            boolean z = r33 instanceof AnonymousClass2bV;
            if (z || (r33 instanceof AnonymousClass2bU)) {
                String A002 = r9.A04.A00(str, true);
                if (A002 == null || A002.length() == 0) {
                    if (!z) {
                        C65013Qj r04 = ((AnonymousClass2bU) r33).A01;
                        if (r04 == null) {
                            j = r33.A1N;
                            i = -8;
                        } else {
                            file = r04.A0I;
                        }
                    } else if (str2 == null || str2.length() == 0) {
                        C18740tg.A0D(false, "invalid mediaFilePath for textStatus");
                        j = r33.A1N;
                        i = -7;
                    } else {
                        file = C20690y0.A02(r9.A01.A0E(), str2);
                    }
                    if (file == null || !file.exists()) {
                        if (!r33.A1P) {
                            C18740tg.A0D(false, "media file does not exist");
                        }
                        j = r33.A1N;
                        i = -9;
                    } else {
                        C25471Gl A012 = AnonymousClass6Y1.A01((AnonymousClass11F) null, r33.A1I, 8);
                        AnonymousClass00C.A08(A012);
                        long j2 = r33.A1N;
                        AnonymousClass3Ot r4 = new AnonymousClass3Ot(false, false, true);
                        Uri fromFile = Uri.fromFile(file);
                        if (A012 == C25471Gl.A0o) {
                            r3 = new C104825Bn(r9.A03);
                        } else {
                            r3 = null;
                        }
                        C128736Dk r12 = r28;
                        byte[] bArr = r12.A00;
                        C18740tg.A06(bArr);
                        C65233Rg A003 = C65233Rg.A00(fromFile, new C132046Rx(bArr, 1), r3, r4, A012, (AnonymousClass3S2) null, (String) null, 0, true, false, true);
                        AnonymousClass1D0 r22 = r9.A05;
                        byte[] bArr2 = new byte[24];
                        new SecureRandom().nextBytes(bArr2);
                        C146506vi A062 = r22.A06(new C144916t1(r12, r9, bArr2), A003, true);
                        A062.A0X = "mms";
                        A062.A06(new AnonymousClass70P(A062, r7, r9, j2), (Executor) null);
                        r9.A0B.put(Long.valueOf(j2), A062);
                        r9.A06.Boy(new C1498172w(r9, A062, 42));
                    }
                } else {
                    r7.A01(r33.A1N, A002);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid status type ");
                sb.append(r33);
                C18740tg.A0D(false, sb.toString());
                j = r33.A1N;
                i = -6;
            }
            r7.A00(i, j);
        }
    }

    public final void A03(List list, List list2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CrosspostRequestSessionManager/handleNewStatusInPreviousAppSessionAutoShareCrosspost started for messages: ");
        List list3 = list;
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((AnonymousClass3T1) it.next()).A1N));
        }
        sb.append(arrayList);
        AnonymousClass00C.A0D(sb.toString(), 0);
        String obj = UUID.randomUUID().toString();
        AnonymousClass00C.A08(obj);
        ArrayList arrayList2 = new ArrayList(AnonymousClass099.A0K(obj, String.valueOf('-'), 0));
        arrayList2.add(2, "waffle");
        String A0Q = C007103b.A0Q("-", "", "", arrayList2, (C006302t) null);
        ((AnonymousClass66M) this.A07.get()).A00(A0Q);
        ArrayList arrayList3 = new ArrayList(AnonymousClass03U.A06(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((AnonymousClass3T1) it2.next()).A1N));
        }
        AnonymousClass17Y r5 = this.A00;
        C34931hs r4 = this.A02;
        AnonymousClass005 r1 = this.A08;
        AnonymousClass00C.A0D(arrayList3, 0);
        List<C108475Tq> list4 = list2;
        AnonymousClass00C.A0D(list4, 1);
        AnonymousClass6VF r7 = (AnonymousClass6VF) r1.get();
        for (C108475Tq r3 : list4) {
            AnonymousClass00C.A0D(r3, 1);
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 1);
            contentValues.put("crossposting_session_id", A0Q);
            r7.A03().A03(r3, arrayList3, 1);
            AnonymousClass6VF.A01(contentValues, r3, r7, arrayList3);
        }
        r5.A0H(new C1498172w(r4, arrayList3, 45));
        ((C1266164s) this.A03.get()).A00(new AnonymousClass6CZ(new AnonymousClass5Ow((C34951hu) this.A04.get()), this, A0Q, list), A0Q, list3, (List) null, list4);
    }
}
