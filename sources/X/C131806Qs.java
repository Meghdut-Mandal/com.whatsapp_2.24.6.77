package X;

/* renamed from: X.6Qs  reason: invalid class name and case insensitive filesystem */
public abstract class C131806Qs {
    public static void A00(C65013Qj r3, AnonymousClass2bU r4, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            C121555tK B5L = new C144826ss(AnonymousClass6Y1.A02(r4)).B5L(bArr);
            r3.A0a = bArr;
            r3.A0W = B5L.A00;
            r3.A0Y = B5L.A02;
            r3.A0Z = B5L.A01;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
        A0u.append(length);
        A0u.append("; message.key=");
        C36351kA.A1L(r4.A1J, A0u);
        throw new C28541Tb(16);
    }

    public static boolean A02(AnonymousClass3T1 r4) {
        if (!(r4 instanceof C46972by)) {
            return false;
        }
        C65013Qj r2 = ((AnonymousClass2bU) r4).A01;
        if (r4.A09 != 7 || r2 == null || r2.A01 <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A01(AnonymousClass3T1 r3) {
        if ((!A02(r3) || !r3.A1T(1)) && r3.A09 != 3) {
            return false;
        }
        return true;
    }
}
