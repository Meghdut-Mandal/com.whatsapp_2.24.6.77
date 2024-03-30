package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Z4  reason: invalid class name */
public abstract class AnonymousClass5Z4 {
    public static C140456lc A00(C160607lH r23) {
        C139106jF r5;
        C118905ov r0;
        Object obj;
        C100444v1 r9;
        String valueOf;
        Integer BlO = r23.BlO();
        Integer num = C023109s.A0C;
        if (BlO == num) {
            C100444v1 r92 = null;
            while (true) {
                Integer BQE = r23.BQE();
                Integer num2 = C023109s.A0G;
                if (BQE != num2) {
                    String BlN = r23.BlN();
                    int A00 = AnonymousClass5ZE.A00(BlN);
                    boolean A1T = C36371kC.A1T(A00, 32);
                    r23.BQE();
                    if (!A1T || 13347 != A00) {
                        C100444v1 r93 = new C100444v1((List) null, A00, 10);
                        if (!A1T) {
                            AnonymousClass6RS.A01("BloksModelParser", String.format(AnonymousClass000.A0p("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", BlN, AnonymousClass000.A0u()), C90524aI.A0w()));
                        } else if (r23.BlO() != num) {
                            r23.BuF();
                            r9 = null;
                        } else {
                            while (r23.BQE() != num2) {
                                int A002 = AnonymousClass5ZE.A00(r23.BlN());
                                r23.BQE();
                                switch (r23.BlO().intValue()) {
                                    case 0:
                                        ArrayList A0I = AnonymousClass001.A0I();
                                        while (r23.BQE() != C023109s.A01) {
                                            if (r23.BlO() == num) {
                                                C140456lc A003 = A00(r23);
                                                if (A003 != null) {
                                                    A0I.add(A003);
                                                }
                                            } else {
                                                A0I.add(C129296Gi.A00(r23));
                                            }
                                        }
                                        r93.A05.put(A002, A0I);
                                        break;
                                    case 2:
                                        obj = A00(r23);
                                        break;
                                    case 5:
                                        obj = r23.BlP().BvC();
                                        break;
                                    case 6:
                                        obj = AnonymousClass5ZM.A00(r23.BlP());
                                        break;
                                    case 7:
                                        obj = r23.BlP().BQP();
                                        break;
                                    case 8:
                                        obj = Boolean.valueOf(r23.BlP().B1v());
                                        break;
                                }
                                r93.A05.put(A002, obj);
                                r23.BuF();
                            }
                            int[] iArr = C113025es.A00;
                            int i = 0;
                            do {
                                int i2 = iArr[i];
                                SparseArray sparseArray = r93.A05;
                                Object obj2 = sparseArray.get(i2);
                                if (obj2 instanceof String) {
                                    C157187by r1 = r93.A01;
                                    if (r1 != null) {
                                        AnonymousClass5o2 r02 = new AnonymousClass5o2(r1);
                                        List list = r02.A00;
                                        C90504aG.A10(i2, list);
                                        r5 = new C139106jF(r02.A01, list);
                                    } else {
                                        r5 = null;
                                    }
                                    AnonymousClass6IL r16 = AnonymousClass6IL.A00;
                                    int i3 = r93.A03;
                                    int i4 = r93.A04;
                                    String str = (String) C140456lc.A0I(r93, 128);
                                    C115205iV r12 = new C115205iV((String) obj2);
                                    if (r5 != null) {
                                        r0 = new C118905ov(r5, (List) null);
                                    } else {
                                        r0 = null;
                                    }
                                    sparseArray.put(i2, new C142256oa(r16, r12, r0, str, i3, i4, i2));
                                }
                                i++;
                            } while (i < 3);
                        }
                        r93.A0h();
                        r9 = r93;
                    } else {
                        C122225uV r2 = new C122225uV();
                        if (r23.BlO() != num) {
                            r23.BuF();
                            r2 = null;
                        } else {
                            while (r23.BQE() != num2) {
                                int A004 = AnonymousClass5ZE.A00(r23.BlN());
                                r23.BQE();
                                if (35 == A004) {
                                    r2.A00 = A00(r23);
                                } else if (33 == A004) {
                                    C160707lS BlP = r23.BlP();
                                    Integer BlO2 = r23.BlO();
                                    int intValue = BlO2.intValue();
                                    if (intValue == 7) {
                                        valueOf = String.valueOf(BlP.BOz());
                                    } else if (intValue == 5) {
                                        valueOf = BlP.BvC();
                                    } else {
                                        StringBuilder A0u = AnonymousClass000.A0u();
                                        A0u.append("Bloks id only supports long and String types but got: ");
                                        throw new AnonymousClass5R5(AnonymousClass000.A0q(C1898495v.A00(BlO2), A0u));
                                    }
                                    r2.A03 = valueOf;
                                } else if (38 == A004) {
                                    r2.A02 = AnonymousClass5ZM.A00(r23.BlP());
                                } else if (43 == A004) {
                                    r2.A01 = AnonymousClass5ZM.A00(r23.BlP());
                                }
                                r23.BuF();
                            }
                        }
                        C140456lc r03 = r2.A00;
                        if (r03 != null) {
                            C140456lc r94 = new C140456lc(r03, r2);
                            r2.A00 = null;
                            r9 = r94;
                        } else {
                            throw new AnonymousClass5R5("Shadow component should never be a leaf node");
                        }
                    }
                    r23.BuF();
                    r92 = r9;
                } else {
                    if (r92 == null) {
                        AnonymousClass6RS.A02("BloksParser", C90524aI.A0X("unknown bloks data type"));
                    }
                    return r92;
                }
            }
        } else {
            r23.BuF();
            throw C90524aI.A0X("Token parsing error.");
        }
    }
}
