package X;

import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: X.6TA  reason: invalid class name */
public final class AnonymousClass6TA {
    public final C26151Jb A00;

    public static final boolean A00(int i) {
        return i == 1 || i == 57 || i == 42 || i == 3 || i == 62 || i == 43 || i == 2 || i == 20 || i == 9 || i == 63 || i == 13;
    }

    public boolean A02(AnonymousClass3T1 r3) {
        int i = r3.A1I;
        if (i == 0 || i == 78 || A00(i)) {
            return true;
        }
        return false;
    }

    public byte[] A03(AnonymousClass3T1 r8) {
        byte[] bArr;
        if ((r8 instanceof AnonymousClass2bV) || (r8 instanceof AnonymousClass2cX)) {
            String A0b = r8.A0b();
            if (A0b == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            AnonymousClass00C.A09(charset);
            return C36371kC.A1Z(A0b, charset);
        } else if (!(r8 instanceof AnonymousClass2bU)) {
            return null;
        } else {
            int i = r8.A1I;
            if (A00(i)) {
                AnonymousClass2bU r82 = (AnonymousClass2bU) r8;
                String str = r82.A03;
                if (str != null) {
                    bArr = C36351kA.A1b(str);
                } else {
                    bArr = null;
                }
                String A1a = r82.A1a();
                if (A1a == null) {
                    return bArr;
                }
                if (bArr == null) {
                    return null;
                }
                byte[] A1b = C36351kA.A1b(A1a);
                int length = bArr.length;
                int length2 = A1b.length;
                byte[] copyOf = Arrays.copyOf(bArr, length + length2);
                System.arraycopy(A1b, 0, copyOf, length, length2);
                AnonymousClass00C.A0B(copyOf);
                return copyOf;
            } else if (!A02(r8)) {
                return null;
            } else {
                this.A00.A00(C188648zz.A0N, String.valueOf(i));
                return null;
            }
        }
    }

    public AnonymousClass6TA(C26151Jb r1) {
        this.A00 = r1;
    }

    public static final byte[] A01(UserJid userJid, UserJid userJid2, AnonymousClass3T1 r6, AnonymousClass6TA r7, byte[] bArr) {
        if (r7.A02(r6)) {
            String str = r6.A1J.A01;
            AnonymousClass00C.A07(str);
            byte[] A01 = AnonymousClass6HP.A01(userJid, userJid2, "Report Token", str, bArr);
            AnonymousClass00C.A08(A01);
            byte[] A03 = r7.A03(r6);
            if (A03 != null) {
                try {
                    byte[] A002 = C110525ao.A00(A03, A01);
                    AnonymousClass00C.A08(A002);
                    byte[] bArr2 = new byte[A002.length];
                    C90504aG.A1Q(bArr2);
                    return bArr2;
                } catch (Exception e) {
                    r7.A00.A01(C188648zz.A0J, (String) null, e);
                    return null;
                }
            }
        }
        return null;
    }
}
