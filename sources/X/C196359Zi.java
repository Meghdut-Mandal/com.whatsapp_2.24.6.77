package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: X.9Zi  reason: invalid class name and case insensitive filesystem */
public abstract class C196359Zi {
    public static void A01(String str, StringBuffer stringBuffer, AnonymousClass121 r16) {
        StringBuilder A0u;
        StringBuilder A0v;
        byte[] bArr;
        String str2;
        StringBuilder A0u2;
        String A02;
        String obj;
        String A0H;
        byte[] bArr2;
        StringBuilder A0v2;
        int i;
        String str3;
        String str4;
        AnonymousClass121 Bve;
        String str5;
        String str6;
        AnonymousClass121 Bve2;
        AnonymousClass121 r4 = r16;
        String str7 = AnonymousClass11q.A00;
        if (r4 instanceof C22656AsM) {
            Enumeration A0I = ((C22656AsM) r4).A0I();
            String A0D = C36321k7.A0D(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C22673Asd) {
                str6 = "BER Sequence";
            } else if (r4 instanceof C22675Asf) {
                str6 = "DER Sequence";
            } else {
                str6 = "Sequence";
            }
            stringBuffer.append(str6);
            while (true) {
                stringBuffer.append(str7);
                while (A0I.hasMoreElements()) {
                    Object nextElement = A0I.nextElement();
                    if (nextElement == null || nextElement.equals(C22590ArI.A00)) {
                        stringBuffer.append(A0D);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement instanceof AnonymousClass121) {
                            Bve2 = (AnonymousClass121) nextElement;
                        } else {
                            Bve2 = ((C219411z) nextElement).Bve();
                        }
                        A01(A0D, stringBuffer, Bve2);
                    }
                }
                return;
            }
        } else if (r4 instanceof C22658AsO) {
            String A0D2 = C36321k7.A0D(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C22679Asj) {
                str5 = "BER Tagged [";
            } else {
                str5 = "Tagged [";
            }
            stringBuffer.append(str5);
            C22658AsO asO = (C22658AsO) r4;
            stringBuffer.append(Integer.toString(asO.A00));
            stringBuffer.append(']');
            if (!asO.A02) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str7);
            A01(A0D2, stringBuffer, C22658AsO.A01(asO));
        } else if (r4 instanceof C22657AsN) {
            B97 b97 = new B97((C22657AsN) r4);
            String A0D3 = C36321k7.A0D(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C22676Asg) {
                str4 = "BER Set";
            } else if (r4 instanceof C22678Asi) {
                str4 = "DER Set";
            } else {
                str4 = "Set";
            }
            stringBuffer.append(str4);
            while (true) {
                stringBuffer.append(str7);
                while (b97.hasMoreElements()) {
                    Object nextElement2 = b97.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(A0D3);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement2 instanceof AnonymousClass121) {
                            Bve = (AnonymousClass121) nextElement2;
                        } else {
                            Bve = ((C219411z) nextElement2).Bve();
                        }
                        A01(A0D3, stringBuffer, Bve);
                    }
                }
                return;
            }
        } else {
            if (r4 instanceof C22659AsP) {
                C22659AsP asP = (C22659AsP) r4;
                boolean z = r4 instanceof C22645AsB;
                A0v2 = AnonymousClass000.A0u();
                if (z) {
                    A0v2.append(str);
                    str3 = "BER Constructed Octet String[";
                } else {
                    A0v2.append(str);
                    str3 = "DER Octet String[";
                }
                A0v2.append(str3);
                i = asP.A00.length;
            } else {
                if (r4 instanceof AnonymousClass122) {
                    A0u2 = AnonymousClass000.A0v(str);
                    A0u2.append("ObjectIdentifier(");
                    A02 = ((AnonymousClass122) r4).A01;
                } else {
                    if (r4 instanceof C22653AsJ) {
                        A0u2 = AnonymousClass000.A0v(str);
                        A0u2.append("Boolean(");
                        A0u2.append(AnonymousClass000.A1P(((C22653AsJ) r4).A00));
                    } else {
                        if (r4 instanceof C22654AsK) {
                            A0v = AnonymousClass000.A0v(str);
                            A0v.append("Integer(");
                            bArr = ((C22654AsK) r4).A00;
                        } else if (r4 instanceof C22586ArE) {
                            C22667AsX asX = (C22667AsX) r4;
                            A0v2 = AnonymousClass000.A0v(str);
                            A0v2.append("DER Bit String[");
                            A0v2.append(asX.A0H().length);
                            A0v2.append(", ");
                            i = asX.A00;
                        } else {
                            if (r4 instanceof C22671Asb) {
                                A0u = AnonymousClass000.A0v(str);
                                A0u.append("IA5String(");
                                bArr2 = ((C22671Asb) r4).A00;
                            } else {
                                if (r4 instanceof C22669AsZ) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("UTF8String(");
                                    A0H = ((C22669AsZ) r4).BHz();
                                } else if (r4 instanceof C22668AsY) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("PrintableString(");
                                    bArr2 = ((C22668AsY) r4).A00;
                                } else if (r4 instanceof C22666AsW) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("VisibleString(");
                                    bArr2 = ((C22666AsW) r4).A00;
                                } else if (r4 instanceof C22662AsS) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("BMPString(");
                                    A0H = new String(((C22662AsS) r4).A00);
                                } else if (r4 instanceof C22665AsV) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("T61String(");
                                    bArr2 = ((C22665AsV) r4).A00;
                                } else if (r4 instanceof C22660AsQ) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("GraphicString(");
                                    bArr2 = ((C22660AsQ) r4).A00;
                                } else if (r4 instanceof C22661AsR) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("VideotexString(");
                                    bArr2 = ((C22661AsR) r4).A00;
                                } else if (r4 instanceof C22650AsG) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("UTCTime(");
                                    A0H = ((C22650AsG) r4).A0H();
                                } else if (r4 instanceof C22655AsL) {
                                    A0u = AnonymousClass000.A0v(str);
                                    A0u.append("GeneralizedTime(");
                                    A0H = ((C22655AsL) r4).A0H();
                                } else {
                                    if (r4 instanceof C22583ArB) {
                                        str2 = "BER";
                                    } else if (r4 instanceof C22584ArC) {
                                        str2 = "";
                                    } else if (r4 instanceof C22652AsI) {
                                        A0v = AnonymousClass000.A0v(str);
                                        A0v.append("DER Enumerated(");
                                        bArr = ((C22652AsI) r4).A00;
                                    } else if (r4 instanceof C22651AsH) {
                                        C22651AsH asH = (C22651AsH) r4;
                                        stringBuffer.append(AnonymousClass000.A0p("External ", str7, AnonymousClass000.A0v(str)));
                                        String A0D4 = C36321k7.A0D(str, "    ");
                                        AnonymousClass122 r2 = asH.A02;
                                        if (r2 != null) {
                                            StringBuilder A0v3 = AnonymousClass000.A0v(A0D4);
                                            A0v3.append("Direct Reference: ");
                                            stringBuffer.append(AnonymousClass000.A0p(r2.A01, str7, A0v3));
                                        }
                                        C22654AsK asK = asH.A01;
                                        if (asK != null) {
                                            StringBuilder A0v4 = AnonymousClass000.A0v(A0D4);
                                            stringBuffer.append(AnonymousClass000.A0p(C90494aF.A0c(asK, "Indirect Reference: ", A0v4), str7, A0v4));
                                        }
                                        AnonymousClass121 r0 = asH.A03;
                                        if (r0 != null) {
                                            A01(A0D4, stringBuffer, r0);
                                        }
                                        StringBuilder A0v5 = AnonymousClass000.A0v(A0D4);
                                        A0v5.append("Encoding: ");
                                        A0v5.append(asH.A00);
                                        stringBuffer.append(AnonymousClass000.A0q(str7, A0v5));
                                        A01(A0D4, stringBuffer, asH.A04);
                                        return;
                                    } else {
                                        A0u = AnonymousClass000.A0u();
                                        C165567td.A1M(r4, str, A0u);
                                        obj = AnonymousClass000.A0q(str7, A0u);
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    C22649AsF A01 = C22649AsF.A01(r4);
                                    StringBuffer A0x = C165607th.A0x();
                                    if (A01.A01) {
                                        try {
                                            byte[] A08 = A01.A08();
                                            int i2 = 1;
                                            if ((A08[0] & 31) == 31) {
                                                i2 = 2;
                                                byte b = A08[1] & 255;
                                                if ((b & Byte.MAX_VALUE) == 0) {
                                                    throw C90524aI.A0X("corrupted stream - invalid high tag number found");
                                                }
                                                while ((b & 128) != 0) {
                                                    b = A08[i2] & 255;
                                                    i2++;
                                                }
                                            }
                                            int length = (A08.length - i2) + 1;
                                            byte[] bArr3 = new byte[length];
                                            System.arraycopy(A08, i2, bArr3, 1, length - 1);
                                            byte b2 = (byte) 16;
                                            bArr3[0] = b2;
                                            if ((A08[0] & 32) != 0) {
                                                bArr3[0] = (byte) (b2 | 32);
                                            }
                                            C22656AsM A04 = C22656AsM.A04(AnonymousClass121.A00(bArr3));
                                            StringBuilder A0u3 = AnonymousClass000.A0u();
                                            AnonymousClass000.A1D(str, str2, " ApplicationSpecific[", A0u3);
                                            A0u3.append(A01.A00);
                                            A0x.append(AnonymousClass000.A0p("]", str7, A0u3));
                                            Enumeration A0I2 = A04.A0I();
                                            while (A0I2.hasMoreElements()) {
                                                A01(C36321k7.A0D(str, "    "), A0x, (AnonymousClass121) A0I2.nextElement());
                                            }
                                        } catch (IOException e) {
                                            A0x.append(e);
                                        }
                                        obj = A0x.toString();
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    A0u2 = AnonymousClass000.A0u();
                                    AnonymousClass000.A1D(str, str2, " ApplicationSpecific[", A0u2);
                                    A0u2.append(A01.A00);
                                    A0u2.append("] (");
                                    byte[] A022 = AnonymousClass124.A02(A01.A02);
                                    A02 = AnonymousClass11q.A02(C202439lp.A03(A022, 0, A022.length));
                                }
                                A0u.append(A0H);
                                A0u.append(") ");
                                obj = AnonymousClass000.A0q(str7, A0u);
                                stringBuffer.append(obj);
                                return;
                            }
                            A0H = AnonymousClass11q.A02(bArr2);
                            A0u.append(A0H);
                            A0u.append(") ");
                            obj = AnonymousClass000.A0q(str7, A0u);
                            stringBuffer.append(obj);
                            return;
                        }
                        A0u2.append(new BigInteger(bArr));
                    }
                    A0u.append(")");
                    obj = AnonymousClass000.A0q(str7, A0u);
                    stringBuffer.append(obj);
                    return;
                }
                A0u2.append(A02);
                A0u.append(")");
                obj = AnonymousClass000.A0q(str7, A0u);
                stringBuffer.append(obj);
                return;
            }
            A0v2.append(i);
            stringBuffer.append(AnonymousClass000.A0q("] ", A0v2));
            stringBuffer.append(str7);
        }
    }

    public static String A00(Object obj) {
        AnonymousClass121 Bve;
        StringBuffer A0x = C165607th.A0x();
        if (obj instanceof AnonymousClass121) {
            Bve = (AnonymousClass121) obj;
        } else if (obj instanceof C219411z) {
            Bve = ((C219411z) obj).Bve();
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1M(obj, "unknown object type ", A0u);
            return A0u.toString();
        }
        A01("", A0x, Bve);
        return A0x.toString();
    }
}
