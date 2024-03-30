package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.IOnDoneCallback;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzcj;
import com.google.android.recaptcha.internal.zzhi;
import com.google.android.recaptcha.internal.zzkh;
import com.google.android.recaptcha.internal.zzpq;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.commons.logging.Log;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.json.JSONObject;

/* renamed from: X.7te  reason: invalid class name and case insensitive filesystem */
public abstract class C165577te {
    public static float A00(Parcel parcel, int i) {
        AnonymousClass0ZA.A0F(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int A03(int i, byte[] bArr, int i2, int i3) {
        int i4 = i3 + 1;
        return (bArr[i4 + 1] & 255) | i | i2 | ((bArr[i4] & 255) << 8);
    }

    public static zzae A0N() {
        return new zzae(4, 3, (Throwable) null);
    }

    public static C18800tq A0P(Context context) {
        AnonymousClass00C.A0D(context, 0);
        return (C18800tq) C18810tr.A00(context, C18800tq.class);
    }

    public static Object A0d() {
        return Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static Object A0h(C194429Pq r3, Object obj, int i) {
        if (i != 0) {
            String str = (String) obj;
            if (AnonymousClass098.A07(str, "$.", false)) {
                return r3.A00(str);
            }
        }
        return obj;
    }

    public static Object A0i(JSONObject jSONObject) {
        AnonymousClass00C.A0D(jSONObject, 0);
        Object obj = jSONObject.get("variable");
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static void A0s(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((int) (j >> i));
    }

    public static void A0t(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    public static void A0x(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.readInt();
    }

    public static void A0y(Parcel parcel, Parcelable parcelable, int i, int i2) {
        AnonymousClass0Z9.A0B(parcel, parcelable, 3, i, false);
        AnonymousClass0Z9.A07(parcel, i2);
    }

    public static void A18(C22947Ayz ayz, Object obj, int i) {
        ayz.Bkm(Message.obtain((Handler) null, 0, i, 0, obj));
    }

    public static void A1C(C23075B3f b3f, Integer num, String str, String str2) {
        C18740tg.A06(b3f);
        b3f.BOm(1, num, str, str2);
    }

    public static void A1P(StringBuilder sb, int i) {
        sb.append(new String(new int[]{i}, 0, 1));
    }

    public static void A1R(XMLSignatureInput xMLSignatureInput) {
        xMLSignatureInput.b = null;
        xMLSignatureInput.c = null;
        xMLSignatureInput.d = null;
        xMLSignatureInput.e = null;
        xMLSignatureInput.f = false;
        xMLSignatureInput.g = false;
        xMLSignatureInput.h = null;
        xMLSignatureInput.m = null;
        xMLSignatureInput.n = null;
        xMLSignatureInput.i = new ArrayList();
        xMLSignatureInput.j = false;
        xMLSignatureInput.k = null;
    }

    public static void A1U(Object[] objArr) {
        objArr[5] = "zzi";
        objArr[6] = "zzj";
    }

    public static boolean A1W(int i) {
        return (i & 1) != 0;
    }

    public static int A02(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((255 & i3) << i4) | (i2 & (~(255 << i4)));
    }

    public static int A04(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A05(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        AnonymousClass00C.A0D(obj2, 0);
        return intValue;
    }

    public static int A06(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static int A07(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
        return (i & 7) + 48;
    }

    public static int A09(byte[] bArr, char c, char c2, int i) {
        int codePoint = Character.toCodePoint(c, c2);
        int i2 = i + 1;
        bArr[i] = (byte) ((codePoint >>> 18) | 240);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((codePoint >>> 12) & 63) | 128);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((codePoint >>> 6) & 63) | 128);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((codePoint & 63) | 128);
        return i5;
    }

    public static int A0A(byte[] bArr, int i) {
        byte b = bArr[i] & 255;
        byte b2 = bArr[i + 1] & 255;
        byte b3 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (b2 << 8) | b | (b3 << 16);
    }

    public static int A0B(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static long A0C(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static long A0E(byte[] bArr, int i) {
        return (((long) bArr[i + 2]) << 16) & 16711680;
    }

    public static long A0F(byte[] bArr, int i) {
        long j = (long) bArr[i];
        long j2 = (long) bArr[i + 2];
        long j3 = (long) bArr[i + 3];
        long j4 = (long) bArr[i + 4];
        long j5 = (long) bArr[i + 5];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static long A0G(int[] iArr, int i) {
        return (long) (iArr[i + 1] & 1048575);
    }

    public static long A0H(int[] iArr, int i) {
        return (long) (iArr[i + 2] & 1048575);
    }

    public static Intent A0I(Context context, Parcelable parcelable, Class cls) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_bank_account", parcelable);
        return intent;
    }

    public static C166677wd A0L(Object obj) {
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C166677wd) AnonymousClass6YQ.A07((C166677wd) obj);
    }

    public static AnonymousClass04R A0M(AnonymousClass016 r2, AnonymousClass4PE r3, UserJid userJid) {
        return new AnonymousClass04H(new C68063bH(r3, userJid), r2).A00(C167497y9.class);
    }

    public static C23073B3d A0O(Object obj) {
        return C198739e7.A02.A00(obj.getClass());
    }

    public static C52502pX A0R(C63573Ko r3, Object[] objArr) {
        r3.A02 = "_id";
        C52502pX r2 = C52502pX.INTEGER;
        r3.A00 = r2;
        r3.A0t();
        r3.A0s();
        objArr[0] = r3.A0r();
        return r2;
    }

    public static C135086c7 A0S(Object obj) {
        return new C135086c7(new C146356vT(), String.class, obj, "upiHandle");
    }

    public static C135086c7 A0T(Object obj, String str) {
        return new C135086c7(new C146356vT(), String.class, obj, str);
    }

    public static AnonymousClass19I A0U(C18800tq r0) {
        return (AnonymousClass19I) r0.A45.get();
    }

    public static C21240yt A0V(String str, Throwable th, byte b) {
        return new C21240yt(new SSLException(str, th), b);
    }

    public static C21240yt A0W(Throwable th) {
        return new C21240yt(new SSLException(th), (byte) 80);
    }

    public static AnonymousClass6QB A0Y(C592133b r2, String str) {
        AnonymousClass6QB r1 = new AnonymousClass6QB(str);
        ConditionVariable conditionVariable = C18740tg.A00;
        r1.A06(r2.A00);
        return r1;
    }

    public static Long A0Z() {
        return 100L;
    }

    public static Long A0a() {
        return 200L;
    }

    public static Object A0e(zzcj zzcj, zzpq[] zzpqArr, int i) {
        return zzcj.zze.zza(zzpqArr[i]);
    }

    public static Object A0g(C135086c7 r0) {
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public static Throwable A0m(Throwable th) {
        return new NoClassDefFoundError().initCause(th);
    }

    public static List A0q(Collection collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static void A0z(View view, float f) {
        view.setPivotX(f / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
    }

    public static void A11(zzhi zzhi, int i) {
        zzhi.zza.zzq((i << 3) | 2);
    }

    public static void A12(C27111My r1, C18800tq r2, C18830tt r3, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2D = (AnonymousClass1CF) r2.A8K.get();
        conversationsFragment.A1i = (C18820ts) r2.A9X.get();
        conversationsFragment.A26 = C27111My.A2I(r1);
        conversationsFragment.A13 = (C229216m) r2.A27.get();
        conversationsFragment.A2O = (AnonymousClass1QW) r3.A0Z.get();
    }

    public static void A14(AnonymousClass1O1 r2, AnonymousClass9jB r3, int i) {
        if (i != 0) {
            AnonymousClass1EU r0 = r2.A0H;
            AnonymousClass1EU.A00(r0);
            r3.A05 = r0.A08.A00(r3.A0P, r3.A0Q);
        }
    }

    public static void A15(C87724Px r1, String str, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C604537x(r1, str, i, z));
    }

    public static void A16(Jid jid, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass1AL(jid, str));
    }

    public static void A19(AnonymousClass19A r7, C236119d r8, C203399nx r9, String str) {
        r7.A0E(r8, r9, str, 204, 0);
    }

    public static void A1A(AnonymousClass19A r7, C236119d r8, C203399nx r9, String str) {
        r7.A0E(r8, r9, str, 204, 0);
    }

    public static void A1G(AnonymousClass6QB r1, C592133b r2) {
        if (r2 != null) {
            r1.A06(r2.A00);
        }
    }

    public static void A1H(AnonymousClass6QB r1, C592133b r2, C592133b r3) {
        r1.A06(r2.A00);
        r3.A00 = r1.A03();
    }

    public static void A1I(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[13] = obj;
        objArr[14] = obj2;
        objArr[15] = obj3;
    }

    public static void A1K(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA512WITHCVC-ECDSA");
        abstractMap.put(B4B.A00, "XMSS");
        abstractMap.put(B4B.A01, "XMSSMT");
        abstractMap.put(new AnonymousClass122("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        abstractMap.put(new AnonymousClass122("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        abstractMap.put(new AnonymousClass122("1.2.840.10040.4.3"), "SHA1WITHDSA");
        abstractMap.put(B4T.A0X, "SHA1WITHECDSA");
        abstractMap.put(B4T.A0Z, "SHA224WITHECDSA");
        abstractMap.put(B4T.A0a, "SHA256WITHECDSA");
        abstractMap.put(B4T.A0b, "SHA384WITHECDSA");
        abstractMap.put(B4T.A0c, "SHA512WITHECDSA");
        abstractMap.put(AnonymousClass128.A0B, "SHA1WITHRSA");
        abstractMap.put(AnonymousClass128.A05, "SHA1WITHDSA");
        abstractMap.put(AnonymousClass12B.A01, "SHA224WITHDSA");
        abstractMap.put(AnonymousClass12B.A02, "SHA256WITHDSA");
    }

    public static void A1L(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA384WITHRSA");
        abstractMap.put(C219311y.A2G, "SHA512WITHRSA");
        abstractMap.put(B4P.A0M, "GOST3411WITHGOST3410");
        abstractMap.put(B4P.A0L, "GOST3411WITHECGOST3410");
        abstractMap.put(B4J.A0H, "GOST3411-2012-256WITHECGOST3410-2012-256");
        abstractMap.put(B4J.A0I, "GOST3411-2012-512WITHECGOST3410-2012-512");
        abstractMap.put(B4K.A03, "SHA1WITHPLAIN-ECDSA");
        abstractMap.put(B4K.A04, "SHA224WITHPLAIN-ECDSA");
        abstractMap.put(B4K.A05, "SHA256WITHPLAIN-ECDSA");
        abstractMap.put(B4K.A06, "SHA384WITHPLAIN-ECDSA");
        abstractMap.put(B4K.A07, "SHA512WITHPLAIN-ECDSA");
        abstractMap.put(B4K.A02, "RIPEMD160WITHPLAIN-ECDSA");
        abstractMap.put(B4L.A0C, "SHA1WITHCVC-ECDSA");
        abstractMap.put(B4L.A0D, "SHA224WITHCVC-ECDSA");
        abstractMap.put(B4L.A0E, "SHA256WITHCVC-ECDSA");
        abstractMap.put(B4L.A0F, "SHA384WITHCVC-ECDSA");
    }

    public static void A1N(String str, String str2, String str3, StringBuffer stringBuffer) {
        stringBuffer.append("    ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str2);
    }

    public static void A1S(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i & 63) | 128);
    }

    public static void A1T(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr2[i3] = (byte) (i2 ^ bArr[i]);
    }

    public static boolean A1Z(C135086c7 r0) {
        Object obj = r0.A00;
        C18740tg.A06(obj);
        return ((Boolean) obj).booleanValue();
    }

    public static AnonymousClass1AL[] A1a(AbstractCollection abstractCollection, int i) {
        return (AnonymousClass1AL[]) abstractCollection.toArray(new AnonymousClass1AL[i]);
    }

    public static C203399nx[] A1b(AbstractCollection abstractCollection, int i) {
        return (C203399nx[]) abstractCollection.toArray(new C203399nx[i]);
    }

    public static float A01(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A08(Map.Entry entry) {
        return ((Number) entry.getKey()).intValue();
    }

    public static long A0D(List list, int i) {
        return Double.doubleToRawLongBits(((Number) list.get(i)).doubleValue());
    }

    public static TextPaint A0J(TextView textView, Object obj) {
        AnonymousClass00C.A08(obj);
        TextPaint paint = textView.getPaint();
        AnonymousClass00C.A08(paint);
        return paint;
    }

    public static IOnDoneCallback A0K(Parcel parcel) {
        return IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder());
    }

    public static C27731Pn A0Q(C18800tq r0) {
        return (C27731Pn) r0.A2E.get();
    }

    public static C235919b A0X(String str, StringBuilder sb) {
        sb.append(str);
        return new C235919b(sb.toString());
    }

    public static Long A0b(String str, JSONObject jSONObject) {
        return Long.valueOf(jSONObject.getLong(str));
    }

    public static NullPointerException A0c(String str, StringBuilder sb) {
        sb.append(str);
        return new NullPointerException(sb.toString());
    }

    public static Object A0f(C18800tq r0) {
        return r0.A6J.get();
    }

    public static String A0j(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static String A0k(C135086c7 r0) {
        C18740tg.A06(r0);
        Object obj = r0.A00;
        C18740tg.A06(obj);
        return (String) obj;
    }

    public static String A0l(String str, String str2, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static X509Certificate A0n(CertPath certPath, int i) {
        return (X509Certificate) certPath.getCertificates().get(i);
    }

    public static ArrayList A0o(AnonymousClass1EU r0) {
        AnonymousClass1EU.A00(r0);
        return r0.A06.A0A();
    }

    public static List A0p(zzkh zzkh, Object obj, int i) {
        return zzkh.zzm.zza(obj, (long) (i & 1048575));
    }

    public static Set A0r(Object obj) {
        return Collections.unmodifiableSet(new HashSet(Collections.singletonList(obj)));
    }

    public static void A0u(Matrix matrix, Path path, List list, int i) {
        path.addPath(((B5O) list.get(i)).BFG(), matrix);
    }

    public static void A0v(CaptureRequest.Builder builder, CaptureRequest.Key key, int i) {
        builder.set(key, Integer.valueOf(i));
    }

    public static void A0w(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A10(AnonymousClass07B r1, int i) {
        r1.A0I(i);
        r1.A0U(true);
    }

    public static void A13(AnonymousClass155 r3, int i) {
        AnonymousClass3SJ.A00(r3, i);
        r3.A01.Bp7(r3, Uri.parse("https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"), (AnonymousClass3T1) null);
    }

    public static void A17(C222813r r0, AnonymousClass3T1 r1, String str) {
        r1.A0q(r0.A02(str));
    }

    public static void A1B(C24601Db r1, Object obj) {
        r1.A0K(obj.toString());
    }

    public static void A1D(C24611Dc r1, StringBuilder sb, int i) {
        sb.append(i);
        r1.A06(sb.toString());
    }

    public static void A1E(C24611Dc r1, StringBuilder sb, boolean z) {
        sb.append(z);
        r1.A06(sb.toString());
    }

    public static void A1F(AnonymousClass3T1 r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A1J);
    }

    public static void A1J(Object obj, String str, StringBuffer stringBuffer, Log log) {
        stringBuffer.append(str);
        stringBuffer.append(obj);
        log.debug(stringBuffer.toString());
    }

    public static void A1M(String str, String str2) {
        com.whatsapp.util.Log.e(C24611Dc.A01(str, str2));
    }

    public static void A1O(String str, StringBuilder sb, int i, int i2) {
        sb.append(str.substring(i, i2));
    }

    public static void A1Q(List list, long j) {
        list.add(Long.valueOf(j));
    }

    public static void A1V(Object[] objArr, boolean z) {
        objArr[0] = Boolean.valueOf(z);
    }

    public static boolean A1X(Parcel parcel, C134946bs r3, String str) {
        parcel.writeInterfaceToken(str);
        if (r3 != null) {
            parcel.writeInt(1);
            r3.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static boolean A1Y(C1041758o r2, AbstractCollection abstractCollection) {
        r2.A0F = Long.valueOf((long) abstractCollection.size());
        return abstractCollection.isEmpty();
    }
}
