package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.InteractiveAnnotation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1D5  reason: invalid class name */
public class AnonymousClass1D5 {
    public final C19700wN A00;
    public final C20690y0 A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C24041Av A04;
    public final C20050ww A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final AnonymousClass1DF A08;
    public final AnonymousClass1GF A09;
    public final C20810yC A0A;
    public final AnonymousClass1GE A0B;
    public final AnonymousClass1BV A0C;
    public final AnonymousClass1BU A0D;
    public final AnonymousClass1D8 A0E;
    public final AnonymousClass1GH A0F;
    public final AnonymousClass1D4 A0G;
    public final AnonymousClass1DE A0H;
    public final AnonymousClass1E1 A0I;
    public final AnonymousClass1GI A0J;
    public final AnonymousClass1D9 A0K;
    public final AnonymousClass1GD A0L;
    public final C19890wg A0M;
    public final AnonymousClass1BS A0N;
    public final C19770wU A0O;
    public final AnonymousClass1D7 A0P;
    public final AnonymousClass1GG A0Q;
    public final C220812u A0R;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r11.A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C146506vi A01(X.C65233Rg r12, boolean r13) {
        /*
            r11 = this;
            r10 = r12
            java.lang.String r1 = r12.A04
            r5 = 0
            if (r1 == 0) goto L_0x002c
            X.1DE r4 = r11.A0H
            r0 = 0
            X.5z2 r3 = r4.A03(r1, r0)
            if (r3 == 0) goto L_0x002c
            X.0wo r2 = r11.A06
            X.0wU r5 = r11.A0O
            X.6Wa r1 = new X.6Wa
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            X.0yC r7 = r11.A0A
            r0 = 4
            X.AnonymousClass00C.A0D(r7, r0)
            X.5z9 r0 = r12.A01
            X.7jL r6 = X.AnonymousClass1D0.A00(r0)
            X.6vi r5 = new X.6vi
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x002c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D5.A01(X.3Rg, boolean):X.6vi");
    }

    public C124935z2 A00(String str) {
        C124935z2 r0;
        if (str == null) {
            return null;
        }
        AnonymousClass1DE r3 = this.A0H;
        synchronized (r3) {
            C002000v r1 = r3.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(1);
            if (r1.A04(sb.toString()) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(1);
                r0 = (C124935z2) r1.A04(sb2.toString());
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public C146496vh A02(String str, int i, int i2, boolean z) {
        AnonymousClass1DE r4 = this.A0H;
        C124935z2 A032 = r4.A03(str, 2);
        boolean z2 = z;
        if (A032 == null) {
            A032 = r4.A02(str, 2);
        } else if (z) {
            A032.A03++;
        }
        C132976Wa r1 = new C132976Wa(this.A06, A032, r4, this.A0O, z2);
        r1.A09(i, i2, false);
        return new C146496vh(A032, r1);
    }

    public AnonymousClass3SC A04(Uri uri, C65013Qj r19, AnonymousClass3XT r20, AnonymousClass3T1 r21, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            str2 = C237919w.A00(this.A03, this.A06);
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri2 = uri;
            arrayList.add(A03(uri2, r19.A00(), r20, (AnonymousClass11F) it.next(), r21, str, str2, list2, list3, i, i2, i3, z));
        }
        return new AnonymousClass3SC(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A05() {
        /*
            r3 = this;
            X.0yC r2 = r3.A0A
            r1 = 147(0x93, float:2.06E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0019
            X.12u r2 = r3.A0R
            monitor-enter(r2)
            boolean r1 = r2.A00     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D5.A05():java.lang.Boolean");
    }

    public AnonymousClass1D5(C19700wN r2, C20690y0 r3, AnonymousClass17Y r4, C19730wQ r5, C24041Av r6, C20050ww r7, C19970wo r8, C19630wG r9, AnonymousClass1DF r10, AnonymousClass1GF r11, C20810yC r12, AnonymousClass1GG r13, AnonymousClass1GE r14, AnonymousClass1BV r15, AnonymousClass1BU r16, AnonymousClass1D8 r17, AnonymousClass1GH r18, AnonymousClass1D4 r19, AnonymousClass1DE r20, AnonymousClass1E1 r21, AnonymousClass1GI r22, AnonymousClass1D9 r23, AnonymousClass1GD r24, C19890wg r25, AnonymousClass1BS r26, C19770wU r27, AnonymousClass1D7 r28, C220812u r29) {
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = r12;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A0O = r27;
        this.A01 = r3;
        this.A05 = r7;
        this.A0P = r28;
        this.A0R = r29;
        this.A0N = r26;
        this.A0E = r17;
        this.A0G = r19;
        this.A0K = r23;
        this.A0H = r20;
        this.A08 = r10;
        this.A0L = r24;
        this.A09 = r11;
        this.A0I = r21;
        this.A0Q = r13;
        this.A0F = r18;
        this.A0D = r16;
        this.A0B = r14;
        this.A0C = r15;
        this.A0M = r25;
        this.A0J = r22;
        this.A04 = r6;
    }

    public AnonymousClass2bU A03(Uri uri, C65013Qj r12, AnonymousClass3XT r13, AnonymousClass11F r14, AnonymousClass3T1 r15, String str, String str2, List list, List list2, int i, int i2, int i3, boolean z) {
        AnonymousClass1GG r2 = this.A0Q;
        long A002 = C19970wo.A00(this.A06);
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass00C.A0D(r12, 1);
        int i4 = i;
        AnonymousClass3T1 A003 = r2.A00.A00(r2.A01.A02(r14, true), i4, A002);
        if (A003 instanceof AnonymousClass2bU) {
            AnonymousClass2bU r5 = (AnonymousClass2bU) A003;
            r5.A01 = r12;
            r5.A02 = 0;
            r5.A0n(1);
            r5.A06 = null;
            r5.A00 = 0;
            r5.A09 = i2;
            r2.A02.A00(A003, r15);
            if (str != null) {
                if (!(r5 instanceof C46972by)) {
                    r5.A02 = str.trim();
                    if (TextUtils.isEmpty(r5.A1a())) {
                        r5.A02 = null;
                    }
                } else {
                    C46972by r1 = (C46972by) r5;
                    r1.A1k(str.trim());
                    if (TextUtils.isEmpty(r1.A01)) {
                        r1.A1k((String) null);
                    }
                }
            }
            File file = r12.A0I;
            if (file == null) {
                C18740tg.A06(uri);
                r5.A06 = uri.toString();
                r5.A00 = 0;
            } else {
                r5.A06 = file.getName();
                r5.A00 = r12.A0I.length();
            }
            if (i4 == 2 || i4 == 3 || i4 == 43 || i4 == 81 || i4 == 13 || i4 == 82) {
                long j = r12.A0F;
                if (j > 0 || r12.A0G > 0) {
                    r5.A0B = (int) ((r12.A0G - j) / 1000);
                } else {
                    r5.A0B = AnonymousClass1GW.A04(r12.A0I);
                }
            }
            r5.A18(list);
            r12.A0C = r5.A00;
            r12.A0Q = true;
            r5.A1f(str2);
            if (z) {
                r5.A0j(4);
            }
            List list3 = list2;
            if (list2 != null && !list3.isEmpty()) {
                r12.A0b = (InteractiveAnnotation[]) list3.toArray(new InteractiveAnnotation[0]);
            }
            int i5 = i3;
            if (i3 > 0) {
                r5.A0j(1);
                r5.A06 = i5;
            }
            if (r13 != null) {
                r5.A0p(r13);
            }
            return r5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FMessageMediaFactory/newFMessageMedia/wrong message type; mediaWaType=");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }
}
