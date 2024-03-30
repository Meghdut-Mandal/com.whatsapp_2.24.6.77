package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Xt  reason: invalid class name and case insensitive filesystem */
public final class C29731Xt implements AnonymousClass00M {
    public C61103Ao A00;
    public C65303Rn A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final AnonymousClass1HT A04;
    public final AnonymousClass16F A05;
    public final AnonymousClass16E A06;
    public final C21010yW A07;
    public final C24811Dw A08;
    public final C21690ze A09;
    public final C29761Xw A0A;
    public final C29751Xv A0B;
    public final C19770wU A0C;
    public final Map A0D;
    public final Map A0E;
    public final AnonymousClass00T A0F = new AnonymousClass00U(C29791Xz.A00);
    public final AnonymousClass0z8 A0G;
    public final C29741Xu A0H;
    public final LinkedHashMap A0I = new AnonymousClass1Y0(this);

    public C29731Xt(C21390zA r3, AnonymousClass16D r4, C19970wo r5, AnonymousClass1HT r6, AnonymousClass16F r7, AnonymousClass16E r8, C21010yW r9, C24811Dw r10, C21690ze r11, C29741Xu r12, C29761Xw r13, C29751Xv r14, C19770wU r15) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r15, 2);
        AnonymousClass00C.A0D(r9, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r12, 8);
        AnonymousClass00C.A0D(r7, 9);
        AnonymousClass00C.A0D(r3, 10);
        AnonymousClass00C.A0D(r14, 11);
        AnonymousClass00C.A0D(r13, 12);
        AnonymousClass00C.A0D(r11, 13);
        this.A03 = r5;
        this.A0C = r15;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r4;
        this.A04 = r6;
        this.A08 = r10;
        this.A0H = r12;
        this.A05 = r7;
        this.A0B = r14;
        this.A0A = r13;
        this.A09 = r11;
        AnonymousClass1Y1 r1 = new AnonymousClass1Y1(this);
        this.A0G = r1;
        this.A0E = new HashMap();
        this.A0D = new HashMap();
        r3.registerObserver(r1);
    }

    public static final Integer A01(int i) {
        int i2;
        switch (i) {
            case 3:
                i2 = 3;
                break;
            case 4:
            case 10:
                i2 = 1;
                break;
            case 11:
                i2 = 4;
                break;
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public final void A06(C45722Sl r8, AnonymousClass3P0 r9, boolean z, boolean z2) {
        AnonymousClass00C.A0D(r9, 1);
        r8.A00 = Boolean.valueOf(z);
        List list = r9.A02;
        r8.A0B = Long.valueOf((long) list.size());
        r8.A0A = Long.valueOf(A00(list));
        List list2 = r9.A03;
        r8.A0D = Long.valueOf((long) list2.size());
        r8.A0C = Long.valueOf(A00(list2));
        List<C65663Sz> list3 = r9.A01;
        r8.A08 = Long.valueOf((long) list3.size());
        r8.A07 = Long.valueOf(A00(list3));
        int i = 0;
        for (C65663Sz A032 : list3) {
            i += A032.A03();
        }
        r8.A06 = Long.valueOf((long) i);
        long A002 = A00(list3);
        int i2 = 0;
        for (C65663Sz A033 : list3) {
            i2 += A033.A03();
        }
        r8.A09 = Long.valueOf(A002 - ((long) i2));
        r8.A01 = Boolean.valueOf(z2);
        this.A07.Bls(r8, new C18950u5(1, 1), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (java.lang.Integer.valueOf(r14) != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.UserJid r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.util.List r24, java.util.List r25, java.util.List r26, java.util.Map r27) {
        /*
            r19 = this;
            r0 = 1
            r9 = r24
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 2
            r10 = r25
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 3
            r11 = r26
            X.AnonymousClass00C.A0D(r11, r0)
            r2 = r19
            X.3Ao r4 = r2.A00
            if (r4 == 0) goto L_0x0095
            r3 = 1
            r7 = r21
            if (r21 == 0) goto L_0x002d
            r0 = 4
            int r1 = r7.intValue()
            if (r1 == r0) goto L_0x002d
            if (r1 == r3) goto L_0x002d
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 2
            if (r1 == r0) goto L_0x002d
            r3 = 0
        L_0x002d:
            r6 = r20
            if (r22 != 0) goto L_0x009d
            if (r3 == 0) goto L_0x009b
            X.13z r0 = X.C223613z.A00
            if (r6 == r0) goto L_0x009b
            r3 = 0
            r0 = 3
            java.util.List[] r1 = new java.util.List[r0]
            r1[r3] = r24
            r0 = 1
            r1[r0] = r25
            r0 = 2
            r1[r0] = r26
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.AnonymousClass00C.A08(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r3 = r5.next()
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r14 = 0
        L_0x005f:
            if (r14 >= r1) goto L_0x004e
            java.lang.Object r0 = r3.get(r14)
            X.3Sz r0 = (X.C65663Sz) r0
            com.whatsapp.jid.UserJid r0 = r0.A09
            boolean r0 = X.AnonymousClass00C.A0J(r6, r0)
            if (r0 == 0) goto L_0x0096
            if (r14 < 0) goto L_0x004e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            if (r0 == 0) goto L_0x0099
        L_0x0077:
            X.0wo r5 = r2.A03
            long r0 = r4.A05
            X.00T r3 = r2.A0F
            java.lang.Object r3 = r3.getValue()
            java.util.Random r3 = (java.util.Random) r3
            long r17 = r3.nextLong()
            java.util.LinkedHashMap r13 = r2.A0I
            X.3Rn r4 = new X.3Rn
            r8 = r23
            r12 = r27
            r15 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            r2.A01 = r4
        L_0x0095:
            return
        L_0x0096:
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0099:
            r14 = -1
            goto L_0x0077
        L_0x009b:
            r14 = 0
            goto L_0x0077
        L_0x009d:
            int r14 = r22.intValue()
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29731Xt.A07(com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.Map):void");
    }

    public final void A0B(Map map, int i) {
        long j;
        C61103Ao r2 = this.A00;
        boolean z = true;
        if (r2 == null || r2.A04 || !r2.A07) {
            z = false;
        }
        C18740tg.A0D(z, "Report tab open only once per session");
        C45022Pt r22 = new C45022Pt();
        C61103Ao r0 = this.A00;
        if (r0 != null) {
            j = r0.A05;
        } else {
            j = 0;
        }
        r22.A01 = Long.valueOf(j);
        r22.A00 = Long.valueOf((long) i);
        r22.A02 = AnonymousClass3MO.A01(map);
        this.A07.Blw(r22);
        C61103Ao r02 = this.A00;
        if (r02 != null) {
            r02.A04 = true;
        }
    }

    public final void A02() {
        C29761Xw r2 = this.A0A;
        if (r2.A04.A00()) {
            AnonymousClass2SV A002 = C29761Xw.A00(r2);
            A002.A03 = 27;
            r2.A02.Blw(A002);
        }
    }

    public final void A03() {
        Long l;
        C29761Xw r2 = this.A0A;
        if (r2.A04.A00()) {
            AnonymousClass2SV A002 = C29761Xw.A00(r2);
            A002.A03 = 24;
            A002.A02 = 3;
            r2.A02.Blw(A002);
        }
        if (((Boolean) r2.A07.getValue()).booleanValue() && (l = r2.A03.A00) != null) {
            ((C1265964q) r2.A06.get()).A00(3, l.longValue());
        }
    }

    public final void A04() {
        Long l;
        C29761Xw r2 = this.A0A;
        if (r2.A04.A00()) {
            AnonymousClass2SV A002 = C29761Xw.A00(r2);
            A002.A03 = 23;
            A002.A02 = 4;
            r2.A02.Blw(A002);
        }
        if (((Boolean) r2.A07.getValue()).booleanValue() && (l = r2.A03.A00) != null) {
            ((C1265964q) r2.A06.get()).A00(4, l.longValue());
        }
    }

    public final void A05() {
        this.A0H.A00 = null;
        C61103Ao r3 = this.A00;
        if (r3 != null && r3.A07) {
            AnonymousClass2RT r2 = new AnonymousClass2RT();
            r2.A02 = Long.valueOf(r3.A05);
            r2.A04 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A06);
            r2.A05 = Long.valueOf((long) r3.A03);
            r2.A03 = Long.valueOf((long) r3.A02);
            int i = r3.A00;
            if (i != 0) {
                r2.A01 = Integer.valueOf(i);
            }
            int i2 = r3.A01;
            if (i2 != 0) {
                r2.A00 = Integer.valueOf(i2);
            }
            this.A07.Blw(r2);
            this.A00 = null;
        }
    }

    public final void A09(Boolean bool) {
        C29741Xu r1 = this.A0H;
        long nextLong = r1.A01.nextLong();
        Long valueOf = Long.valueOf(nextLong);
        r1.A00 = valueOf;
        if (valueOf != null) {
            this.A00 = new C61103Ao(this.A03, nextLong, AnonymousClass00C.A0J(bool, true));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r1 == 1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1 == 3) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r1 = (X.C1265964q) r4.A06.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r6 = this;
            X.1Xw r4 = r6.A0A
            X.1Xc r0 = r4.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0055
            X.2SV r5 = X.C29761Xw.A00(r4)
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A03 = r0
            java.lang.Integer r0 = X.C29761Xw.A01(r8)
            r5.A02 = r0
            r3 = 0
            r2 = 2
            if (r7 == 0) goto L_0x0036
            int r1 = r7.intValue()
            if (r1 == 0) goto L_0x0032
            r0 = 3
            r2 = 4
            if (r1 == r0) goto L_0x0032
            r0 = 13
            r2 = 5
            if (r1 == r0) goto L_0x0032
            r2 = 1
            if (r1 != r2) goto L_0x0036
        L_0x0032:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x0036:
            r5.A01 = r3
            if (r9 == 0) goto L_0x007b
            int r1 = r9.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x004a
            r0 = 2
            if (r1 == r0) goto L_0x004a
            r0 = 4
            if (r1 == r0) goto L_0x004a
            r0 = 3
            if (r1 != r0) goto L_0x007b
        L_0x004a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x004e:
            r5.A00 = r0
            X.0yW r0 = r4.A02
            r0.Blw(r5)
        L_0x0055:
            X.00T r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007a
            X.005 r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.64q r1 = (X.C1265964q) r1
            java.lang.Long r0 = r1.A00
            if (r0 == 0) goto L_0x007a
            long r2 = r0.longValue()
            X.1UP r1 = r1.A01
            java.lang.String r0 = "tap_status_share"
            r1.flowMarkPoint(r2, r0)
        L_0x007a:
            return
        L_0x007b:
            r0 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29731Xt.A0A(java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    public static final long A00(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C65663Sz) it.next()).A02();
        }
        return (long) i;
    }

    public void A08(AnonymousClass3T1 r5, String str, int i, long j, boolean z, boolean z2) {
        String str2;
        long j2;
        Integer num;
        int i2 = 3;
        switch (str.hashCode()) {
            case -2101465844:
                if (str.equals("failed_insufficient_space")) {
                    i2 = 10;
                    break;
                }
                break;
            case -1911610141:
                if (str.equals("media_error_no_such_algorithm")) {
                    i2 = 28;
                    break;
                }
                break;
            case -1892291233:
                if (str.equals("media_error_request_timeout")) {
                    i2 = 14;
                    break;
                }
                break;
            case -1867169789:
                str2 = "success";
                break;
            case -1858954673:
                if (str.equals("media_error_cronet")) {
                    i2 = 35;
                    break;
                }
                break;
            case -1735489987:
                if (str.equals("media_error_request")) {
                    i2 = 4;
                    break;
                }
                break;
            case -1597391554:
                if (str.equals("media_error_file_format_unsupported")) {
                    i2 = 31;
                    break;
                }
                break;
            case -1412796971:
                if (str.equals("media_error_server")) {
                    i2 = 13;
                    break;
                }
                break;
            case -1393956401:
                if (str.equals("media_error_no_direct_path")) {
                    i2 = 36;
                    break;
                }
                break;
            case -1302125668:
                if (str.equals("media_error_wamsys")) {
                    i2 = 25;
                    break;
                }
                break;
            case -962621161:
                if (str.equals("media_error_optimistic_network_unsafe")) {
                    i2 = 29;
                    break;
                }
                break;
            case -705042791:
                if (str.equals("media_skipped_ep_no_primary_host")) {
                    i2 = 34;
                    break;
                }
                break;
            case -678813737:
                if (str.equals("media_error_dns")) {
                    i2 = 18;
                    break;
                }
                break;
            case -678811828:
                if (str.equals("media_error_fnf")) {
                    i2 = 11;
                    break;
                }
                break;
            case -678803141:
                if (str.equals("media_error_oom")) {
                    i2 = 6;
                    break;
                }
                break;
            case -678799174:
                if (str.equals("media_error_ssl")) {
                    i2 = 20;
                    break;
                }
                break;
            case -678797283:
                if (str.equals("media_error_url")) {
                    i2 = 27;
                    break;
                }
                break;
            case -621954360:
                if (str.equals("media_error_not_finalized")) {
                    i2 = 15;
                    break;
                }
                break;
            case -383881924:
                if (str.equals("media_error_throttle")) {
                    i2 = 19;
                    break;
                }
                break;
            case -379366874:
                if (str.equals("media_error_no_client_network")) {
                    i2 = 21;
                    break;
                }
                break;
            case -160901288:
                if (str.equals("media_error_bad_media")) {
                    i2 = 9;
                    break;
                }
                break;
            case 431581758:
                if (str.equals("media_error_conn")) {
                    i2 = 26;
                    break;
                }
                break;
            case 476588369:
                if (str.equals("cancelled")) {
                    i2 = 2;
                    break;
                }
                break;
            case 1086481592:
                if (str.equals("media_error_io")) {
                    i2 = 7;
                    break;
                }
                break;
            case 1095692943:
                str2 = "request";
                break;
            case 1354954699:
                if (str.equals("media_error_transcoding_unknown")) {
                    i2 = 30;
                    break;
                }
                break;
            case 1380799384:
                if (str.equals("media_error_no_permissions")) {
                    i2 = 8;
                    break;
                }
                break;
            case 1465774270:
                if (str.equals("media_error_too_large")) {
                    i2 = 24;
                    break;
                }
                break;
            case 1643533646:
                if (str.equals("media_error_optimistic_hash")) {
                    i2 = 16;
                    break;
                }
                break;
            case 1744829935:
                if (str.equals("media_switch_required")) {
                    i2 = 23;
                    break;
                }
                break;
        }
        if (str.equals(str2)) {
            i2 = 1;
        }
        AnonymousClass2SD r3 = new AnonymousClass2SD();
        C61103Ao r0 = this.A00;
        if (r0 != null) {
            j2 = r0.A05;
        } else {
            j2 = 0;
        }
        r3.A08 = Long.valueOf(j2);
        r3.A03 = Integer.valueOf(i);
        r3.A07 = Long.valueOf(j);
        r3.A06 = Integer.valueOf(i2);
        r3.A00 = Boolean.valueOf(z);
        r3.A01 = Boolean.valueOf(z2);
        int A052 = this.A06.A05();
        int i3 = 2;
        if (A052 == 0) {
            i3 = 3;
        } else if (A052 != 1) {
            i3 = 4;
            if (A052 != 2) {
                i3 = 1;
            }
        }
        r3.A02 = Integer.valueOf(i3);
        int i4 = r5.A09;
        int i5 = 4;
        if (i4 == 3) {
            i5 = 3;
        } else if (i4 == 4) {
            i5 = 1;
        } else if (i4 == 5 || i4 == 10 || i4 == 11) {
            i5 = 2;
        }
        r3.A05 = Integer.valueOf(i5);
        AnonymousClass3XT r02 = r5.A0c.A01;
        if (r02 != null) {
            int i6 = r02.A00;
            int i7 = 2;
            if (i6 == 0) {
                i7 = 3;
            } else if (i6 != 1) {
                i7 = 4;
                if (i6 != 2) {
                    i7 = 1;
                }
            }
            num = Integer.valueOf(i7);
        } else {
            num = null;
        }
        r3.A04 = num;
        this.A07.Blw(r3);
        if (!str.equals("success")) {
            this.A0A.A03(r5, str, j);
        }
    }
}
