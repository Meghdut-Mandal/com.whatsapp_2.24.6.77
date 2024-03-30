package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9nx  reason: invalid class name and case insensitive filesystem */
public class C203399nx {
    public final String A00;
    public final byte[] A01;
    public final C203399nx[] A02;
    public final AnonymousClass1AL[] A03;

    public C203399nx(String str, AnonymousClass1AL[] r3) {
        this(str, (byte[]) null, r3, (C203399nx[]) null);
    }

    public static int A01(C203399nx r1, String str, int i) {
        return AnonymousClass6R8.A00(r1.A0i(str, (String) null), i);
    }

    public static long A02(C203399nx r1, String str) {
        return AnonymousClass6R8.A01(r1.A0i(str, (String) null), 0);
    }

    public static C203399nx A06(AbstractCollection abstractCollection) {
        return new C203399nx("account", (AnonymousClass1AL[]) abstractCollection.toArray(new AnonymousClass1AL[0]));
    }

    public static ArrayList A07(Object obj) {
        AnonymousClass1AL[] A0k = ((C203399nx) obj).A0k();
        if (A0k != null) {
            return new ArrayList(new AnonymousClass0CN(A0k, false));
        }
        return new ArrayList();
    }

    public static void A0C(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C203399nx(str, str2, (AnonymousClass1AL[]) null));
    }

    public static boolean A0J(C203399nx r1, String str, String str2) {
        return str2.equals(r1.A0i(str, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r6 == null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x0081
            r8 = 0
            if (r11 == 0) goto L_0x0080
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x0080
            X.9nx r11 = (X.C203399nx) r11
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r11.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0080
            X.1AL[] r5 = r10.A03
            X.1AL[] r0 = r11.A03
            if (r5 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0080
            int r4 = r5.length
            int r0 = r0.length
            if (r4 != r0) goto L_0x0080
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x0042
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            java.lang.String r1 = X.C36391kE.A0x(r11, r0)
            if (r1 == 0) goto L_0x0080
            java.lang.String r0 = r2.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0040:
            if (r0 != 0) goto L_0x0080
        L_0x0042:
            X.9nx[] r7 = r10.A02
            X.9nx[] r6 = r11.A02
            if (r7 == 0) goto L_0x0064
            if (r6 == 0) goto L_0x0080
            int r5 = r7.length
            int r4 = r6.length
            if (r5 != r4) goto L_0x0080
            r3 = 0
        L_0x004f:
            if (r3 >= r5) goto L_0x0066
            r2 = r7[r3]
            r1 = 0
        L_0x0054:
            if (r1 >= r4) goto L_0x0080
            r0 = r6[r1]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
            int r3 = r3 + 1
            goto L_0x004f
        L_0x0061:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0064:
            if (r6 != 0) goto L_0x0080
        L_0x0066:
            byte[] r3 = r10.A01
            if (r3 == 0) goto L_0x0079
            byte[] r2 = r11.A01
            if (r2 == 0) goto L_0x007e
            int r1 = r3.length
            int r0 = r2.length
            if (r1 != r0) goto L_0x007e
            boolean r0 = java.util.Arrays.equals(r3, r2)
            if (r0 == 0) goto L_0x007e
            return r9
        L_0x0079:
            byte[] r0 = r11.A01
            if (r0 != 0) goto L_0x007e
            return r9
        L_0x007e:
            r9 = 0
            return r9
        L_0x0080:
            return r8
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203399nx.equals(java.lang.Object):boolean");
    }

    public static C203399nx A03(C203399nx r1) {
        return r1.A0c("account");
    }

    public static C203399nx A04(String str, AnonymousClass1AL[] r2) {
        return new C203399nx(str, r2);
    }

    public static C203399nx A05(String str, AnonymousClass1AL[] r2, C203399nx[] r3) {
        return new C203399nx(str, r2, r3);
    }

    public static void A09(C203399nx r1) {
        A0A(r1, "message");
    }

    public static void A0B(C203399nx r1, String str, AbstractCollection abstractCollection, AnonymousClass1AL[] r4) {
        abstractCollection.add(new C203399nx(r1, str, r4));
    }

    public static void A0D(String str, AbstractCollection abstractCollection, byte[] bArr, AnonymousClass1AL[] r4) {
        abstractCollection.add(new C203399nx(str, bArr, r4));
    }

    public static void A0E(String str, AbstractCollection abstractCollection, AnonymousClass1AL[] r3) {
        abstractCollection.add(new C203399nx(str, r3));
    }

    public static void A0F(String str, AbstractCollection abstractCollection, AnonymousClass1AL[] r3, C203399nx[] r4) {
        abstractCollection.add(new C203399nx(str, r3, r4));
    }

    public static void A0G(String str, byte[] bArr, AnonymousClass1AL[] r3, Object[] objArr, int i) {
        objArr[i] = new C203399nx(str, bArr, r3);
    }

    public static void A0H(String str, AnonymousClass1AL[] r2, Object[] objArr, int i) {
        objArr[i] = new C203399nx(str, r2);
    }

    public static boolean A0I(C203399nx r0, String str) {
        if (r0 == null || !r0.A00.equals(str)) {
            return false;
        }
        return true;
    }

    public static byte[] A0K(C203399nx r3, int i) {
        byte[] bArr = r3.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i) {
                return bArr;
            }
            StringBuilder A0v = AnonymousClass000.A0v("failed require. node ");
            A0v.append(r3);
            A0v.append(" data length ");
            A0v.append(length);
            throw C165617ti.A0Q(AnonymousClass000.A0r(" != required length ", A0v, i));
        }
        StringBuilder A0v2 = AnonymousClass000.A0v("failed require. node ");
        A0v2.append(r3);
        throw C165577te.A0X(" missing data", A0v2);
    }

    public static String[] A0L(C203399nx r1) {
        A0A(r1, "error");
        return new String[]{"text"};
    }

    public AnonymousClass1AL A0Z(String str) {
        int length;
        AnonymousClass1AL[] r4 = this.A03;
        if (r4 == null || (length = r4.length) <= 0) {
            return null;
        }
        int i = 0;
        do {
            AnonymousClass1AL r1 = r4[i];
            if (TextUtils.equals(str, r1.A02)) {
                return r1;
            }
            i++;
        } while (i < length);
        return null;
    }

    public C203399nx A0a() {
        C203399nx[] r1 = this.A02;
        if (r1 != null && r1.length != 0) {
            return r1[0];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("required first child missing for tag ");
        throw C165577te.A0X(this.A00, A0u);
    }

    public C203399nx A0b(int i) {
        C203399nx[] r1 = this.A02;
        if (r1 == null || r1.length <= i) {
            return null;
        }
        return r1[i];
    }

    public C203399nx A0c(String str) {
        C203399nx[] r5 = this.A02;
        if (r5 != null) {
            for (C203399nx r1 : r5) {
                if (TextUtils.equals(str, r1.A00)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public String A0e() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, C19430v1.A0B);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public List A0j(String str) {
        C203399nx[] r5 = this.A02;
        if (r5 == null) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C203399nx r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                A0I.add(r1);
            }
        }
        return A0I;
    }

    public AnonymousClass1AL[] A0k() {
        AnonymousClass1AL[] r1 = this.A03;
        if (r1 == null || r1.length != 0) {
            return r1;
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.A00.hashCode() + 31) * 31;
        byte[] bArr = this.A01;
        int i2 = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i3 = (hashCode2 + hashCode) * 31;
        C203399nx[] r4 = this.A02;
        if (r4 == null) {
            i = 0;
        } else {
            i = 0;
            for (C203399nx r0 : r4) {
                if (r0 != null) {
                    i = C36401kF.A02(r0, i);
                }
            }
        }
        int i4 = (i3 + i) * 31;
        AnonymousClass1AL[] r3 = this.A03;
        if (r3 != null) {
            for (AnonymousClass1AL r02 : r3) {
                if (r02 != null) {
                    i2 = C36401kF.A02(r02, i2);
                }
            }
        }
        return i4 + i2;
    }

    public static int A00(C203399nx r1, String str) {
        return r1.A0T(r1.A0h(str), str);
    }

    public static Iterator A08(C203399nx r0, String str) {
        return r0.A0j(str).iterator();
    }

    public static void A0A(C203399nx r2, String str) {
        String str2;
        if (!A0I(r2, str)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("failed requireTag: expected: ");
            A0u.append(str);
            A0u.append(", actual: ");
            if (r2 != null) {
                str2 = r2.A00;
            } else {
                str2 = "null";
            }
            throw C165577te.A0X(str2, A0u);
        }
    }

    public static String[] A0M(C203399nx r0, String str) {
        A0A(r0, str);
        return new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID};
    }

    public static String[] A0N(C203399nx r0, String str) {
        A0A(r0, str);
        return new String[]{"jid"};
    }

    public static String[] A0O(C203399nx r0, String str) {
        A0A(r0, str);
        return new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
    }

    public static String[] A0P(C203399nx r0, String str) {
        A0A(r0, str);
        return new String[]{"error"};
    }

    public static String[] A0Q(C203399nx r0, String str) {
        A0A(r0, str);
        return new String[]{"#elementValue"};
    }

    public int A0R(String str) {
        return A00(this, str);
    }

    public int A0S(String str, int i) {
        String A0x = C36391kE.A0x(this, str);
        if (A0x == null) {
            return i;
        }
        return A0T(A0x, str);
    }

    public int A0T(String str, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("attribute ");
            A0u.append(str2);
            A0u.append(" for tag ");
            A0u.append(this.A00);
            throw C165567td.A0G(" is not integral: ", str, A0u);
        }
    }

    public long A0U(String str) {
        return A0W(A0h(str), str);
    }

    public long A0V(String str, long j) {
        String A0x = C36391kE.A0x(this, str);
        if (A0x == null) {
            return j;
        }
        return A0W(A0x, str);
    }

    public long A0W(String str, String str2) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("attribute ");
            A0u.append(str2);
            A0u.append(" for tag ");
            A0u.append(this.A00);
            throw C165567td.A0G(" is not integral: ", str, A0u);
        }
    }

    public Jid A0X(Class cls, String str) {
        Jid jid;
        AnonymousClass1AL A0Z = A0Z(str);
        if (!((A0Z == null || (jid = A0Z.A01) == null) && (jid = C36411kG.A0i(A0i(str, (String) null))) == null) && !jid.isProtocolCompliant()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ProtocolTreeNode/getAttributeJid invalid jid, Jid: '");
            A0u.append(jid);
            A0u.append("' key: '");
            A0u.append(str);
            A0u.append("' tag: '");
            A0u.append(this.A00);
            C36321k7.A1Z(A0u, "'");
        }
        if (cls == DeviceJid.class && (jid instanceof UserJid)) {
            jid = DeviceJid.of(jid);
        }
        try {
            return (Jid) cls.cast(jid);
        } catch (ClassCastException e) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("ProtocolTreeNode/getAttributeJid/failed to convert '");
            A0u2.append(jid);
            A0u2.append("' to ");
            C36351kA.A1Q(cls.getName(), A0u2, e);
            return null;
        }
    }

    public Jid A0Y(Class cls, String str) {
        Jid A0X = A0X(cls, str);
        if (A0X != null) {
            return A0X;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("required attribute '");
        A0u.append(str);
        A0u.append("' missing for tag ");
        throw C165577te.A0X(this.A00, A0u);
    }

    public C203399nx A0d(String str) {
        C203399nx A0c = A0c(str);
        if (A0c != null) {
            return A0c;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("required child ");
        A0u.append(str);
        A0u.append(" missing for tag ");
        throw C165577te.A0X(this.A00, A0u);
    }

    public String A0f() {
        return this.A00;
    }

    public String A0g(String str) {
        return C36391kE.A0x(this, str);
    }

    public String A0h(String str) {
        String A0x = C36391kE.A0x(this, str);
        if (A0x != null) {
            return A0x;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("required attribute '");
        A0u.append(str);
        A0u.append("' missing for tag ");
        throw C165577te.A0X(this.A00, A0u);
    }

    public String A0i(String str, String str2) {
        AnonymousClass1AL A0Z = A0Z(str);
        if (A0Z != null) {
            return A0Z.A03;
        }
        return str2;
    }

    public String toString() {
        String str;
        boolean z;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("<");
        String str3 = this.A00;
        A0u.append(str3);
        AnonymousClass1AL[] r4 = this.A03;
        if (r4 == null) {
            r4 = new AnonymousClass1AL[0];
        }
        for (AnonymousClass1AL r1 : r4) {
            C36421kH.A1N(A0u);
            A0u.append(r1.A02);
            A0u.append("='");
            A0u.append(r1.A03);
            A0u.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A02 == null) {
            str = "/>";
        } else {
            str = ">";
            A0u.append(str);
            C203399nx[] r2 = this.A02;
            if (r2 == null) {
                r2 = new C203399nx[0];
            }
            for (C203399nx r0 : r2) {
                if (r0 != null) {
                    C36351kA.A1K(r0, A0u);
                }
            }
            if (bArr != null) {
                try {
                    C19430v1.A0D.newDecoder().decode(ByteBuffer.wrap(bArr));
                    z = true;
                } catch (CharacterCodingException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        str2 = new String(bArr, C19430v1.A0B);
                    } catch (UnsupportedEncodingException unused2) {
                        str2 = null;
                    }
                } else {
                    str2 = C36441kJ.A13(bArr);
                }
                A0u.append(str2);
            }
            A0u.append("</");
            A0u.append(str3);
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public C203399nx(String str, byte[] bArr, AnonymousClass1AL[] r4, C203399nx[] r5) {
        C18740tg.A06(str);
        this.A00 = str;
        this.A03 = r4;
        this.A02 = r5;
        this.A01 = bArr;
        if (r5 != null && bArr != null) {
            throw AnonymousClass001.A08("node may not have both data and children");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C203399nx(C203399nx r4, String str, AnonymousClass1AL[] r6) {
        this(str, (byte[]) null, r6, r4 != null ? new C203399nx[]{r4} : null);
    }

    public C203399nx(String str, byte[] bArr, AnonymousClass1AL[] r4) {
        this(str, bArr, r4, (C203399nx[]) null);
    }

    public C203399nx(String str, AnonymousClass1AL[] r3, C203399nx[] r4) {
        this(str, (byte[]) null, r3, r4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C203399nx(String str, String str2, AnonymousClass1AL[] r5) {
        this(str, str2 != null ? str2.getBytes() : null, r5, (C203399nx[]) null);
    }
}
