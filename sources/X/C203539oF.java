package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9oF  reason: invalid class name and case insensitive filesystem */
public final class C203539oF {
    public static Object A00(C203399nx r1, C22993Azj azj) {
        return A06(r1, azj, new String[0]);
    }

    public static Object A05(C203399nx r7, C22993Azj azj, String[] strArr) {
        AnonymousClass00C.A0D(r7, 0);
        return A09(r7, azj, strArr, 1, 1).get(0);
    }

    public static final Object A07(C203399nx r13, Class cls, Long l, Long l2, Object obj, String[] strArr, boolean z) {
        String A0i;
        String A0i2;
        AnonymousClass00C.A0D(r13, 0);
        int length = strArr.length - 1;
        String str = strArr[length];
        boolean A1S = AnonymousClass000.A1S(str.charAt(0), 35);
        for (int i = 0; i < length; i++) {
            r13 = r13.A0d(strArr[i]);
        }
        Long l3 = null;
        Long l4 = l;
        Long l5 = l2;
        Object obj2 = obj;
        if (cls.equals(String.class)) {
            if (A1S) {
                A0i2 = r13.A0e();
            } else {
                A0i2 = r13.A0i(str, (String) null);
            }
            if (z) {
                if (!C1901797e.A00(A0i2, obj2)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u);
                    throw C165567td.A0G(r13.A00, "/>.", A0u);
                }
            } else if (A0i2 != null) {
                if (l != null && ((long) A0i2.length()) < l4.longValue()) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Length of attribute ", str, " for tag ", A0u2);
                    A0u2.append(r13.A00);
                    A0u2.append(" is less than the specified lower bound value of ");
                    A0u2.append(l4);
                    throw C165617ti.A0Q(AnonymousClass000.A0t(A0u2, '.'));
                } else if (l5 != null && ((long) A0i2.length()) > l5.longValue()) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Length of attribute ", str, " for tag ", A0u3);
                    A0u3.append(r13.A00);
                    A0u3.append(" is more than the specified upper bound value of ");
                    A0u3.append(l5);
                    throw C165617ti.A0Q(AnonymousClass000.A0t(A0u3, '.'));
                } else if (obj2 != null && !A0i2.equals(obj2)) {
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u4);
                    throw C165567td.A0G(r13.A00, "/>.", A0u4);
                }
            }
            return A0i2;
        } else if (cls.equals(byte[].class)) {
            if (A1S) {
                byte[] bArr = r13.A01;
                if (bArr != null) {
                    if (l != null && ((long) bArr.length) < l.longValue()) {
                        StringBuilder A0v = AnonymousClass000.A0v("Length of element value for tag ");
                        A0v.append(r13.A00);
                        throw C165617ti.A0Q(AnonymousClass000.A0l(l, " is less than the specified lower bound value of ", A0v));
                    } else if (l2 == null || ((long) bArr.length) <= l5.longValue()) {
                        return bArr;
                    } else {
                        StringBuilder A0v2 = AnonymousClass000.A0v("Length of element value for tag ");
                        A0v2.append(r13.A00);
                        throw C165617ti.A0Q(AnonymousClass000.A0l(l5, " is more than the specified upper bound value of ", A0v2));
                    }
                }
            } else {
                throw new C235919b("Cannot have binary not contained in an element value in tag %s", r13.A00);
            }
        } else if (cls.equals(Long.class) || cls.equals(Long.TYPE)) {
            if (A1S) {
                A0i = r13.A0e();
            } else {
                A0i = r13.A0i(str, (String) null);
            }
            if (z) {
                if (A0i != null) {
                    l3 = Long.valueOf(r13.A0W(A0i, str));
                }
                if (!C1901797e.A00(l3, obj2)) {
                    StringBuilder A0u5 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u5);
                    throw C165567td.A0G(r13.A00, "/>.", A0u5);
                }
            } else if (A0i != null) {
                long A0W = r13.A0W(A0i, str);
                if (l != null && A0W < l.longValue()) {
                    StringBuilder A0u6 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Value of attribute '", str, "' for tag ", A0u6);
                    A0u6.append(r13.A00);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(l4, " is less than the specified lower bound value of ", A0u6));
                } else if (l5 == null || A0W <= l5.longValue()) {
                    if (obj2 != null) {
                        Long valueOf = Long.valueOf(A0W);
                        AnonymousClass00C.A0E(valueOf, "null cannot be cast to non-null type T of com.whatsapp.wapdata.SmaxStandardLibrary.Companion.getOptionalAttributeValueFromPTN");
                        if (!obj2.equals(valueOf)) {
                            StringBuilder A0u7 = AnonymousClass000.A0u();
                            AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u7);
                            throw C165567td.A0G(r13.A00, "/>.", A0u7);
                        }
                    }
                    Long valueOf2 = Long.valueOf(A0W);
                    AnonymousClass00C.A0E(valueOf2, "null cannot be cast to non-null type T of com.whatsapp.wapdata.SmaxStandardLibrary.Companion.getOptionalAttributeValueFromPTN");
                    return valueOf2;
                } else {
                    StringBuilder A0u8 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Value of attribute '", str, "' for tag ", A0u8);
                    A0u8.append(r13.A00);
                    throw C165617ti.A0Q(AnonymousClass000.A0l(l5, " is more than the specified upper bound value of ", A0u8));
                }
            }
        } else if (Jid.class.isAssignableFrom(cls)) {
            Jid A0X = r13.A0X(cls, str);
            if (z) {
                if (!C1901797e.A00(A0X, obj2)) {
                    StringBuilder A0u9 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u9);
                    throw C165567td.A0G(r13.A00, "/>.", A0u9);
                }
            } else if (A0X != null) {
                if (obj != null && !A0X.equals(obj2)) {
                    StringBuilder A0u10 = AnonymousClass000.A0u();
                    AnonymousClass000.A1D("Error while parsing attribute '", str, "' in tag <", A0u10);
                    throw C165567td.A0G(r13.A00, "/>.", A0u10);
                }
            }
            return A0X;
        } else {
            StringBuilder A0u11 = AnonymousClass000.A0u();
            A0u11.append("Invalid type '");
            C165597tg.A1F(cls, A0u11);
            throw C165577te.A0X("' passed to function", A0u11);
        }
        return l3;
    }

    public static final ArrayList A09(C203399nx r7, C22993Azj azj, String[] strArr, long j, long j2) {
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            r7 = r7.A0d(strArr[i]);
        }
        String str = strArr[length];
        List A0j = r7.A0j(str);
        ArrayList A13 = C36411kG.A13(A0j);
        Iterator it = A0j.iterator();
        while (it.hasNext()) {
            A13.add(azj.B15(C36431kI.A0s(it)));
        }
        if (((long) A13.size()) < j) {
            StringBuilder A0k = C36331k8.A0k("Invalid number of children '", str);
            C36341k9.A1N("'. Received ", A0k, A13);
            A0k.append(" children but the minimum value specified in the spec is ");
            A0k.append(j);
            throw C165617ti.A0Q(AnonymousClass000.A0t(A0k, '.'));
        } else if (((long) A13.size()) <= j2) {
            return A13;
        } else {
            StringBuilder A0k2 = C36331k8.A0k("Invalid number of children '", str);
            C36341k9.A1N("'. Received ", A0k2, A13);
            A0k2.append(" children but the maximum value specified in the spec is ");
            A0k2.append(j2);
            throw C165617ti.A0Q(AnonymousClass000.A0t(A0k2, '.'));
        }
    }

    public static void A0A(C203399nx r2, C203399nx r3, int i) {
        A06(r3, new C23212B9u(r2, i), new String[0]);
    }

    public static void A0B(C203399nx r1, C22993Azj azj) {
        A06(r1, azj, new String[0]);
    }

    public static void A0C(C203399nx r1, C22993Azj azj) {
        A06(r1, azj, new String[0]);
    }

    public static void A0E(AnonymousClass6QB r8, String str) {
        if (A0P(str, 0, 9007199254740991L, false)) {
            r8.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
    }

    public static final void A0I(byte[] bArr, long j, long j2) {
        StringBuilder A0u;
        AnonymousClass00C.A0D(bArr, 0);
        long length = (long) bArr.length;
        if (length < j) {
            A0u = AnonymousClass000.A0u();
            A0u.append("Length of binary byte array is less than the specified lower bound value of ");
            A0u.append(j);
        } else if (length > j2) {
            A0u = AnonymousClass000.A0u();
            A0u.append("Length of binary byte array is greater than the specified upper bound value of ");
            A0u.append(j2);
        } else {
            return;
        }
        C18740tg.A0D(false, A0u.toString());
    }

    public static final boolean A0J(Jid jid, String str, List list, boolean z) {
        AnonymousClass00C.A0D(list, 2);
        if (jid != null || z) {
            if (jid != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (C165587tf.A1b((Class) it.next(), jid)) {
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("JID enum '");
                A0u.append(str);
                A0u.append("' was expected to be one of '");
                A0u.append(C007103b.A0Q(", ", "", "", list, (C006302t) null));
                A0u.append("' but was '");
                AnonymousClass000.A1C(jid, A0u);
                C18740tg.A0D(false, AnonymousClass000.A0q("'.", A0u));
                return true;
            }
            return true;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        AnonymousClass000.A1D("Received null for JID enum '", str, "'.", A0u2);
        C18740tg.A0D(false, A0u2.toString());
        return false;
    }

    public static boolean A0K(Long l) {
        return A0L(l, 99, 2147476647, false);
    }

    public static boolean A0O(String str) {
        return A0P(str, 1, 100, true);
    }

    public final Object A0Z(C203399nx r12, Class cls, Long l, Long l2, Object obj, String[] strArr, boolean z) {
        C203399nx r4 = r12;
        AnonymousClass00C.A0D(r12, 0);
        String[] strArr2 = strArr;
        Object A07 = A07(r4, cls, l, l2, obj, strArr2, z);
        if (A07 != null) {
            return A07;
        }
        int length = strArr2.length - 1;
        String str = strArr[length];
        for (int i = 0; i < length; i++) {
            r4 = r4.A0d(strArr[i]);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Required attribute '");
        A0u.append(str);
        A0u.append("' missing for tag '");
        A0u.append(r4.A00);
        throw C165617ti.A0Q(AnonymousClass000.A0t(A0u, '\''));
    }

    public static Object A01(C203399nx r1, C22993Azj azj) {
        return A06(r1, azj, new String[]{"error"});
    }

    public static Object A02(C203399nx r1, C22993Azj azj, int i) {
        return A06(r1, azj, new String[i]);
    }

    public static Object A04(C203399nx r7, C22993Azj azj, String[] strArr) {
        AnonymousClass00C.A0D(r7, 0);
        return A09(r7, azj, strArr, 1, 1).get(0);
    }

    public static ArrayList A08(C203399nx r8, C22993Azj azj, String[] strArr, long j) {
        AnonymousClass00C.A0D(r8, 0);
        return A09(r8, azj, strArr, j, 50);
    }

    public static void A0D(AnonymousClass6QB r8, String str) {
        if (A0P(str, 1, 200, false)) {
            r8.A04(new AnonymousClass1AL("credential-id", str));
        }
    }

    public static void A0F(AnonymousClass6QB r8, String str) {
        if (A0P(str, 1, 1000, false)) {
            r8.A04(new AnonymousClass1AL("nonce", str));
        }
    }

    public static void A0G(AnonymousClass6QB r8, String str, boolean z) {
        if (A0P(str, 1, 255, z)) {
            r8.A04(new AnonymousClass1AL("device-id", str));
        }
    }

    public static final boolean A0L(Long l, long j, long j2, boolean z) {
        StringBuilder A0u;
        if (l != null || z) {
            if (l != null) {
                long longValue = l.longValue();
                if (longValue < j) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Value is less than the specified lower bound value of ");
                    A0u.append(j);
                } else if (longValue > j2) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Value is greater than the specified lower bound value of ");
                    A0u.append(j2);
                }
                C18740tg.A0D(false, A0u.toString());
            }
            return true;
        }
        C18740tg.A0D(false, "Received null value for non-optional ':int'.");
        return false;
    }

    public static boolean A0M(Long l, boolean z) {
        return A0L(l, 0, 9007199254740991L, z);
    }

    public static final boolean A0N(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Received null value for non-optional '");
        A0u.append(str);
        C18740tg.A0D(false, AnonymousClass000.A0q("'.", A0u));
        return false;
    }

    public static final boolean A0P(String str, long j, long j2, boolean z) {
        StringBuilder A0u;
        if (str != null || z) {
            if (str != null) {
                long length = (long) str.length();
                if (length < j) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Length of string is less than the specified lower bound value of ");
                    A0u.append(j);
                } else if (length > j2) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("Length of string is greater than the specified upper bound value of ");
                    A0u.append(j2);
                }
                C18740tg.A0D(false, A0u.toString());
            }
            return true;
        }
        C18740tg.A0D(false, "Received null value for non-optional ':string'.");
        return false;
    }

    public static boolean A0R(String str, long j, boolean z) {
        return A0P(str, j, 10, z);
    }

    public static boolean A0S(String str, long j, boolean z) {
        return A0P(str, j, 100, z);
    }

    public static boolean A0T(String str, long j, boolean z) {
        return A0P(str, j, 255, z);
    }

    public static boolean A0U(String str, long j, boolean z) {
        return A0P(str, j, 1000, z);
    }

    public static boolean A0V(String str, long j, boolean z) {
        return A0P(str, j, 10000, z);
    }

    public static boolean A0W(String str, boolean z) {
        return A0P(str, 0, 9007199254740991L, z);
    }

    public static boolean A0X(String str, boolean z) {
        return A0P(str, 1, 1000, z);
    }

    public static final boolean A0Y(List list, long j, long j2) {
        StringBuilder A0u;
        if (list == null) {
            C18740tg.A0D(false, "Received null value for children. Pass `Collections.emptyList()` instead of null for non-present, optional children.");
            return false;
        }
        if (((long) list.size()) < j) {
            A0u = AnonymousClass000.A0u();
            C36371kC.A1R("Number of children ", A0u, list);
            A0u.append(" is less than the specified minimum value of ");
            A0u.append(j);
        } else {
            if (((long) list.size()) > j2) {
                A0u = AnonymousClass000.A0u();
                C36371kC.A1R("Number of children ", A0u, list);
                A0u.append(" is greater than the specified maximum value of ");
                A0u.append(j2);
            }
            return true;
        }
        C18740tg.A0D(false, A0u.toString());
        return true;
    }

    public static Object A03(C203399nx r1, C22993Azj azj, String str) {
        return A06(r1, azj, new String[]{str});
    }

    public static final Object A06(C203399nx r3, C22993Azj azj, String[] strArr) {
        C36321k7.A0w(r3, azj);
        for (String A0d : strArr) {
            r3 = r3.A0d(A0d);
        }
        return azj.B15(r3);
    }

    public static final void A0H(String str, List list) {
        if (!list.contains(str)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("String was expected to be one of '");
            A0u.append(C007103b.A0Q(", ", "", "", list, (C006302t) null));
            throw C165577te.A0X("'.", A0u);
        }
    }

    public final Object A0a(C203399nx r4, String str, List list, String[] strArr) {
        ArrayList A0l = C36341k9.A0l(r4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                return A06(r4, (C22993Azj) it.next(), strArr);
            } catch (C235919b e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                A0l.add(message);
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Required mixin group '");
        A0u.append(str);
        A0u.append("' was not present, encountered the following errors for each possible mixin:\n");
        throw C165577te.A0X(AnonymousClass14B.A07("\n", A0l), A0u);
    }

    public static boolean A0Q(String str, long j, boolean z) {
        return A0P(str, j, 9007199254740991L, z);
    }
}
