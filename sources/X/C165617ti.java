package X;

import android.media.Image;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzhd;
import com.google.android.recaptcha.internal.zzik;
import com.google.android.recaptcha.internal.zzin;
import com.google.android.recaptcha.internal.zzit;
import com.google.android.recaptcha.internal.zzje;
import com.google.android.recaptcha.internal.zzjf;
import com.google.android.recaptcha.internal.zzke;
import com.google.android.recaptcha.internal.zzkp;
import com.google.android.recaptcha.internal.zzkt;
import com.google.android.recaptcha.internal.zzl;
import com.google.android.recaptcha.internal.zzn;
import com.google.android.recaptcha.internal.zzp;
import com.whatsapp.jid.UserJid;
import java.io.EOFException;
import java.math.BigDecimal;
import java.security.InvalidAlgorithmParameterException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.7ti  reason: invalid class name and case insensitive filesystem */
public abstract class C165617ti {
    public static byte A00(int i, long j, long j2) {
        return (byte) ((int) (j2 | (j << i)));
    }

    public static int A02(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i;
        return i3 + 1;
    }

    public static int A07(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        return i2 + 1;
    }

    public static C207269up A0N(C29461Ws r1, String str) {
        return r1.A06((UserJid) null, str);
    }

    public static String A0a(String[] strArr) {
        return strArr[0];
    }

    public static AnonymousClass1AL[] A0k() {
        return new AnonymousClass1AL[1];
    }

    public static int A01(int i) {
        return (527 + i) * 31;
    }

    public static int A03(zzhd zzhd) {
        return zzhd.zza.zzd();
    }

    public static int A04(zzhd zzhd) {
        return zzhd.zza.zzn();
    }

    public static int A05(Object obj) {
        return ((C12260hl) obj).A00();
    }

    public static int A06(List list) {
        int i = zzkt.zza;
        return list.size();
    }

    public static int A08(String[] strArr, int i) {
        return Integer.parseInt(strArr[i]);
    }

    public static AnonymousClass04H A0A(AnonymousClass04G r1, AnonymousClass016 r2) {
        return new AnonymousClass04H(r1, r2);
    }

    public static AnonymousClass72I A0D(String str, String str2, String str3) {
        return new AnonymousClass72I(str, str2, str3);
    }

    public static zzae A0E(Throwable th, int i, int i2) {
        return new zzae(i, i2, th);
    }

    public static zzik A0F(zzjf zzjf, String str, int i, int i2) {
        return new zzik(str, i, i, i2, zzjf);
    }

    public static zzje A0H(String str) {
        return new zzje(str);
    }

    public static zzkp A0I(zzke zzke, String str, Object[] objArr) {
        return new zzkp(zzke, str, objArr);
    }

    public static zzl A0J(int i) {
        return new zzl(i);
    }

    public static zzp A0K(zzl zzl, zzn zzn, String str) {
        return new zzp(zzn, zzl, str);
    }

    public static AnonymousClass186 A0L(String str) {
        return new AnonymousClass186(str);
    }

    public static C135086c7 A0P(C158347gm r1, Class cls, Object obj, String str) {
        return new C135086c7(r1, cls, obj, str);
    }

    public static C235919b A0Q(String str) {
        return new C235919b(str);
    }

    public static C64933Qa A0R(AnonymousClass11F r1, String str, boolean z) {
        return new C64933Qa(r1, str, z);
    }

    public static C28541Tb A0S(Integer num, String str) {
        return new C28541Tb(num, str);
    }

    public static EOFException A0T() {
        return new EOFException();
    }

    public static IllegalArgumentException A0U() {
        return new IllegalArgumentException();
    }

    public static IllegalStateException A0V() {
        return new IllegalStateException();
    }

    public static IndexOutOfBoundsException A0W(String str) {
        return new IndexOutOfBoundsException(str);
    }

    public static Integer A0X(Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return Integer.valueOf(i2);
    }

    public static String A0Y(int i) {
        if (i != 0) {
            return "1";
        }
        return "0";
    }

    public static String A0Z(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static BigDecimal A0b(String str) {
        return new BigDecimal(str);
    }

    public static InvalidAlgorithmParameterException A0c(String str) {
        return new InvalidAlgorithmParameterException(str);
    }

    public static NoSuchElementException A0e() {
        return new NoSuchElementException();
    }

    public static AnonymousClass122 A0f(String str) {
        return new AnonymousClass122(str);
    }

    public static void A0g(StringBuilder sb, String[] strArr, int i) {
        sb.append(strArr[i]);
    }

    public static void A0h(byte[] bArr, byte[] bArr2, int i, int i2) {
        bArr2[i2] = bArr[i];
    }

    public static String[] A0l() {
        return new String[]{"from"};
    }

    public static Image.Plane A09(Image image, int i) {
        return image.getPlanes()[i];
    }

    public static AnonymousClass9RE A0B(List list, int i) {
        return (AnonymousClass9RE) list.get(i);
    }

    public static AnonymousClass9Y8 A0C(Iterator it) {
        return (AnonymousClass9Y8) it.next();
    }

    public static zzit A0G(zzin zzin) {
        zzin.zzm();
        return zzin.zza;
    }

    public static AnonymousClass6B4 A0M(Iterator it) {
        return (AnonymousClass6B4) it.next();
    }

    public static AnonymousClass16S A0O(AnonymousClass1EU r0) {
        AnonymousClass1EU.A00(r0);
        return r0.A06;
    }

    public static List A0d(Object obj, long j) {
        return (List) C203729od.A03(obj, j);
    }

    public static byte[] A0i(C21674AUx aUx) {
        byte[] A06 = aUx.A06();
        AnonymousClass00C.A08(A06);
        return A06;
    }

    public static byte[] A0j(Object obj, Map map) {
        return (byte[]) map.get(obj);
    }
}
