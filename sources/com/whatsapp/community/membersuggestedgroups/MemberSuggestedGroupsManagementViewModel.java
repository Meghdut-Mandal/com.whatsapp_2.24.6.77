package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass001;
import X.AnonymousClass03T;
import X.AnonymousClass04R;
import X.AnonymousClass05E;
import X.AnonymousClass05H;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass1LV;
import X.AnonymousClass3K2;
import X.AnonymousClass3KN;
import X.AnonymousClass4WB;
import X.AnonymousClass4WC;
import X.C005502l;
import X.C023409w;
import X.C023509x;
import X.C06810Ve;
import X.C109325Xd;
import X.C12960iw;
import X.C18010sR;
import X.C19600wD;
import X.C19730wQ;
import X.C20810yC;
import X.C220412q;
import X.C233117z;
import X.C24541Cv;
import X.C26801Lo;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C49392j2;
import X.C51172nO;
import X.C51182nP;
import X.C51452nq;
import X.C62873Hw;
import X.C62883Hx;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public final class MemberSuggestedGroupsManagementViewModel extends AnonymousClass04R {
    public int A00 = -1;
    public final C19730wQ A01;
    public final AnonymousClass1LV A02;
    public final MemberSuggestedGroupsManager A03;
    public final C19600wD A04;
    public final C220412q A05;
    public final C24541Cv A06;
    public final C20810yC A07;
    public final AnonymousClass147 A08;
    public final C005502l A09;
    public final C18010sR A0A;
    public final AnonymousClass05H A0B;
    public final AnonymousClass05L A0C;
    public final AnonymousClass05L A0D;
    public final AnonymousClass05L A0E;
    public final AnonymousClass05K A0F;
    public final AnonymousClass05K A0G;
    public final AnonymousClass05K A0H;
    public final AnonymousClass05K A0I;
    public final AnonymousClass16D A0J;
    public final C233117z A0K;
    public final AnonymousClass4WC A0L;
    public final AnonymousClass4WB A0M;
    public final C26801Lo A0N;
    public final AnonymousClass05L A0O;

    public final void A0S(C51452nq r11, boolean z) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (C62873Hw r0 : (Iterable) this.A0H.getValue()) {
            Object obj = r0.A01;
            if (obj instanceof AnonymousClass3K2) {
                A0I2.add(obj);
            }
        }
        ArrayList<AnonymousClass3K2> A0I3 = AnonymousClass001.A0I();
        for (Object next : A0I2) {
            if (((AnonymousClass3K2) next).A00 == 0) {
                A0I3.add(next);
            }
        }
        ArrayList A0J2 = C36321k7.A0J(A0I3);
        for (AnonymousClass3K2 r02 : A0I3) {
            A0J2.add(r02.A02);
        }
        if (C36401kF.A1a(A0J2)) {
            C36381kD.A1R(this.A09, new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this, r11, A0J2, (C023509x) null, z), C109325Xd.A00(this));
        }
    }

    public MemberSuggestedGroupsManagementViewModel(C19730wQ r5, AnonymousClass1LV r6, MemberSuggestedGroupsManager memberSuggestedGroupsManager, C19600wD r8, AnonymousClass16D r9, C220412q r10, C24541Cv r11, C20810yC r12, C233117z r13, C26801Lo r14, AnonymousClass147 r15, C005502l r16) {
        C005502l r0 = r16;
        C36321k7.A1B(r15, r0, r12, memberSuggestedGroupsManager, r6);
        C36321k7.A1C(r9, r13, r14, r8, r10);
        C36341k9.A1G(r11, r5);
        this.A08 = r15;
        this.A09 = r0;
        this.A07 = r12;
        this.A03 = memberSuggestedGroupsManager;
        this.A02 = r6;
        this.A0J = r9;
        this.A0K = r13;
        this.A0N = r14;
        this.A04 = r8;
        this.A05 = r10;
        this.A06 = r11;
        this.A01 = r5;
        AnonymousClass05N A002 = AnonymousClass05E.A00(C023409w.A00);
        this.A0D = A002;
        this.A0H = A002;
        AnonymousClass05N r02 = new AnonymousClass05N(C36421kH.A0j(0, r6.A06.A07(1238) + 1));
        this.A0O = r02;
        this.A0G = r02;
        C12960iw r03 = new C12960iw(0);
        this.A0A = r03;
        this.A0B = C06810Ve.A01(r03);
        AnonymousClass05N r04 = new AnonymousClass05N(C51182nP.MEMBER);
        this.A0E = r04;
        this.A0I = r04;
        AnonymousClass05N r05 = new AnonymousClass05N(C51172nO.LOADING);
        this.A0C = r05;
        this.A0F = r05;
        AnonymousClass4WC r2 = new AnonymousClass4WC(this, 3);
        this.A0L = r2;
        AnonymousClass4WB r06 = new AnonymousClass4WB(this, 6);
        this.A0M = r06;
        r14.registerObserver(r2);
        r13.registerObserver(r06);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r7, java.util.Map r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C82663z4
            if (r0 == 0) goto L_0x008d
            r3 = r9
            X.3z4 r3 = (X.C82663z4) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x0081
            if (r0 != r2) goto L_0x0096
            java.lang.Object r5 = r3.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r3.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r7 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r7
            X.AnonymousClass0AN.A00(r1)
        L_0x0028:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0093
            java.util.Map$Entry r6 = X.AnonymousClass000.A11(r5)
            java.lang.Object r0 = r6.getKey()
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0071
            r0 = 3
            if (r1 == r0) goto L_0x0061
            r0 = 4
            if (r1 != r0) goto L_0x0028
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.2FC r1 = new X.2FC
            r1.<init>(r0)
        L_0x0052:
            X.0sR r0 = r7.A0A
            r3.L$0 = r7
            r3.L$1 = r5
            r3.label = r2
            java.lang.Object r0 = r0.Bpf(r1, r3)
            if (r0 != r4) goto L_0x0028
            return r4
        L_0x0061:
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.2FI r1 = new X.2FI
            r1.<init>(r0)
            goto L_0x0052
        L_0x0071:
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            X.2FB r1 = new X.2FB
            r1.<init>(r0)
            goto L_0x0052
        L_0x0081:
            X.AnonymousClass0AN.A00(r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass3R6.A01(r8)
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r0)
            goto L_0x0028
        L_0x008d:
            X.3z4 r3 = new X.3z4
            r3.<init>(r7, r9)
            goto L_0x0012
        L_0x0093:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A01(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.Map, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9, java.util.Map r10, X.C023509x r11) {
        /*
            boolean r0 = r11 instanceof X.C82563yu
            if (r0 == 0) goto L_0x002c
            r4 = r11
            X.3yu r4 = (X.C82563yu) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 0
            r8 = 4
            r7 = 3
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x006d
            if (r0 == r6) goto L_0x0083
            if (r0 == r7) goto L_0x005d
            if (r0 == r8) goto L_0x0083
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002c:
            X.3yu r4 = new X.3yu
            r4.<init>(r9, r11)
            goto L_0x0012
        L_0x0032:
            X.AnonymousClass0AN.A00(r1)
            X.147 r0 = r9.A08
            java.lang.Object r0 = r10.get(r0)
            boolean r0 = X.C36371kC.A1X(r0, r2)
            X.05L r1 = r9.A0C
            if (r0 == 0) goto L_0x0050
            X.2nO r0 = X.C51172nO.LOADING
            r4.L$0 = r9
            r4.label = r2
            java.lang.Object r0 = r1.B6N(r0, r4)
            if (r0 != r3) goto L_0x0074
            return r3
        L_0x0050:
            X.2nO r0 = X.C51172nO.READY
            r4.L$0 = r9
            r4.label = r7
            java.lang.Object r0 = r1.B6N(r0, r4)
            if (r0 != r3) goto L_0x0064
            return r3
        L_0x005d:
            java.lang.Object r9 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r9
            X.AnonymousClass0AN.A00(r1)
        L_0x0064:
            r4.L$0 = r5
            r4.label = r8
            java.lang.Object r0 = A03(r9, r4)
            goto L_0x0080
        L_0x006d:
            java.lang.Object r9 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r9
            X.AnonymousClass0AN.A00(r1)
        L_0x0074:
            X.05L r1 = r9.A0D
            X.09w r0 = X.C023409w.A00
            r4.L$0 = r5
            r4.label = r6
            java.lang.Object r0 = r1.B6N(r0, r4)
        L_0x0080:
            if (r0 != r3) goto L_0x0086
            return r3
        L_0x0083:
            X.AnonymousClass0AN.A00(r1)
        L_0x0086:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A02(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.Map, X.09x):java.lang.Object");
    }

    public static final Object A03(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C023509x r13) {
        Object obj;
        AnonymousClass3K2 r2;
        boolean A0E2 = memberSuggestedGroupsManagementViewModel.A07.A0E(5078);
        SortedSet<AnonymousClass3KN> A032 = memberSuggestedGroupsManagementViewModel.A03.A03(memberSuggestedGroupsManagementViewModel.A08);
        if (A0E2) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            ArrayList A0I3 = AnonymousClass001.A0I();
            HashMap A0J2 = AnonymousClass001.A0J();
            for (AnonymousClass3KN r7 : A032) {
                if (memberSuggestedGroupsManagementViewModel.A0E.getValue() != C51182nP.MEMBER || memberSuggestedGroupsManagementViewModel.A01.A0M(r7.A04)) {
                    if (r7.A07) {
                        AnonymousClass147 r3 = r7.A02;
                        if (!A0J2.containsKey(r3)) {
                            A0J2.put(r3, AnonymousClass03T.A03(r7.A04));
                            memberSuggestedGroupsManagementViewModel.A07(r7, A0I2);
                        } else {
                            List list = (List) A0J2.get(r3);
                            if (list != null) {
                                list.add(r7.A04);
                            }
                        }
                    } else {
                        memberSuggestedGroupsManagementViewModel.A07(r7, A0I3);
                    }
                }
            }
            ArrayList A0I4 = AnonymousClass001.A0I();
            if (A0I2.size() > 0) {
                A0I4.add(new C62873Hw(2, new C62883Hx(R.string.f12nameremoved, A0I2.size())));
                A0I4.addAll(A0I2);
            }
            if (A0I3.size() > 0) {
                A0I4.add(new C62873Hw(2, new C62883Hx(R.string.f12nameremoved, A0I3.size())));
                A0I4.addAll(A0I3);
            }
            memberSuggestedGroupsManagementViewModel.A00 = A0I3.size() + A0I2.size();
            obj = memberSuggestedGroupsManagementViewModel.A0D.B6N(A0I4, r13);
            if (obj != AnonymousClass0AO.COROUTINE_SUSPENDED) {
                obj = AnonymousClass0AJ.A00;
            }
        } else {
            ArrayList A0J3 = C36321k7.A0J(A032);
            for (AnonymousClass3KN r72 : A032) {
                AnonymousClass16D r22 = memberSuggestedGroupsManagementViewModel.A0J;
                A0J3.add(new C62873Hw(1, new AnonymousClass3K2((C51182nP) memberSuggestedGroupsManagementViewModel.A0I.getValue(), r72, r22.A0D(r72.A02), r22.A0D(r72.A04), new C49392j2(memberSuggestedGroupsManagementViewModel, 3), 0)));
            }
            ArrayList A0I5 = AnonymousClass001.A0I();
            for (Object next : A0J3) {
                C62873Hw r1 = (C62873Hw) next;
                int ordinal = ((C51182nP) memberSuggestedGroupsManagementViewModel.A0E.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        C19730wQ r32 = memberSuggestedGroupsManagementViewModel.A01;
                        Object obj2 = r1.A01;
                        UserJid userJid = null;
                        if ((obj2 instanceof AnonymousClass3K2) && (r2 = (AnonymousClass3K2) obj2) != null) {
                            userJid = r2.A02.A04;
                        }
                        if (!r32.A0M(userJid)) {
                        }
                    } else {
                        throw C36441kJ.A18();
                    }
                }
                A0I5.add(next);
            }
            memberSuggestedGroupsManagementViewModel.A00 = A0I5.size();
            obj = memberSuggestedGroupsManagementViewModel.A0D.B6N(A0I5, r13);
        }
        if (obj != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0AO A04(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9, java.util.List r10, X.C023509x r11, X.C006302t r12, int r13) {
        /*
            boolean r0 = r11 instanceof X.C82673z5
            if (r0 == 0) goto L_0x0026
            r6 = r11
            X.3z5 r6 = (X.C82673z5) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r8 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 0
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r0) goto L_0x0057
            if (r1 == r4) goto L_0x0072
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0026:
            X.3z5 r6 = new X.3z5
            r6.<init>(r9, r11)
            goto L_0x0012
        L_0x002c:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2 r3 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2
            r3.<init>(r7, r12)
            r6.L$0 = r9
            r6.I$0 = r13
            r6.label = r0
            r1 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.util.Map r0 = X.C36391kE.A11(r0, r10)
            X.05N r8 = X.AnonymousClass05E.A00(r0)
            X.040 r2 = X.C109325Xd.A00(r9)
            X.02l r1 = r9.A09
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1
            r0.<init>(r10, r7, r3, r8)
            X.C36381kD.A1R(r1, r0, r2)
            goto L_0x0060
        L_0x0057:
            int r13 = r6.I$0
            java.lang.Object r9 = r6.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r9 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r9
            X.AnonymousClass0AN.A00(r8)
        L_0x0060:
            X.05I r8 = (X.AnonymousClass05I) r8
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3
            r0.<init>(r9, r13)
            r6.L$0 = r7
            r6.label = r4
            java.lang.Object r0 = r8.B36(r6, r0)
            if (r0 != r5) goto L_0x0075
            return r5
        L_0x0072:
            X.AnonymousClass0AN.A00(r8)
        L_0x0075:
            X.0jR r0 = new X.0jR
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel, java.util.List, X.09x, X.02t, int):X.0AO");
    }

    public static final void A05(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel) {
        Object value;
        AnonymousClass1LV r3;
        AnonymousClass05L r5 = memberSuggestedGroupsManagementViewModel.A0O;
        do {
            value = r5.getValue();
            r3 = memberSuggestedGroupsManagementViewModel.A02;
        } while (!r5.B3B(value, C36421kH.A0j(Integer.valueOf(r3.A08.A02(memberSuggestedGroupsManagementViewModel.A08).size()), r3.A06.A07(1238) + 1)));
    }

    public static final void A06(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, Map map) {
        int i;
        AnonymousClass05L r2 = memberSuggestedGroupsManagementViewModel.A0D;
        Iterable<C62873Hw> iterable = (Iterable) r2.getValue();
        ArrayList A0J2 = C36321k7.A0J(iterable);
        for (C62873Hw r4 : iterable) {
            Object obj = r4.A01;
            if (obj instanceof AnonymousClass3K2) {
                AnonymousClass3K2 r3 = (AnonymousClass3K2) obj;
                AnonymousClass3KN r8 = r3.A02;
                Number number = (Number) map.get(r8.A02);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = r3.A00;
                }
                r4 = new C62873Hw(r4.A00, new AnonymousClass3K2(r3.A01, r8, r3.A04, r3.A03, r3.A05, i));
            }
            A0J2.add(r4);
        }
        do {
        } while (!r2.B3B(r2.getValue(), A0J2));
    }

    private final void A07(AnonymousClass3KN r10, List list) {
        AnonymousClass16D r1 = this.A0J;
        AnonymousClass141 A0D2 = r1.A0D(r10.A02);
        AnonymousClass141 A0D3 = r1.A0D(r10.A04);
        C49392j2 r7 = new C49392j2(this, 2);
        list.add(new C62873Hw(1, new AnonymousClass3K2((C51182nP) this.A0I.getValue(), r10, A0D2, A0D3, r7, 0)));
    }

    public void A0R() {
        this.A0N.unregisterObserver(this.A0L);
    }
}
