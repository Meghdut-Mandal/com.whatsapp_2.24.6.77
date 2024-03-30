package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Range;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzez;
import com.google.android.recaptcha.internal.zzhd;
import com.google.android.recaptcha.internal.zzhh;
import com.google.android.recaptcha.internal.zzje;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import org.json.JSONObject;
import org.whispersystems.curve25519.JavaCurve25519Provider;

/* renamed from: X.7th  reason: invalid class name and case insensitive filesystem */
public abstract class C165607th {
    public static int A04(Parcel parcel, int i, int i2, int i3) {
        if (i != 4) {
            AnonymousClass0ZA.A0D(parcel, i2);
            return i3;
        }
        AnonymousClass0ZA.A0F(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int A07(C20800yB r1) {
        AnonymousClass00C.A0D(r1, 0);
        int A07 = r1.A07(3327);
        if (A07 == 0) {
            return SearchActionVerificationClientService.NOTIFICATION_ID;
        }
        return A07;
    }

    public static Range A0J(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i != 0) {
            return Range.create(Integer.valueOf(i2 / 1000), Integer.valueOf(iArr[1] / 1000));
        }
        return Range.create(Integer.valueOf(i2), Integer.valueOf(iArr[1]));
    }

    public static zzae A0M(int i, int i2) {
        return new zzae(i, i2, (Throwable) null);
    }

    public static AnonymousClass8I5 A0O(byte[] bArr) {
        return C21674AUx.A01(bArr, 0, bArr.length);
    }

    public static Object A0m(Class cls) {
        return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static BigDecimal A0z(C132386Tk r2, C203399nx r3) {
        String A0e;
        if (r3 == null || (A0e = r3.A0e()) == null || r2 == null) {
            return null;
        }
        return C129676Ia.A00(r2, Long.parseLong(A0e));
    }

    public static ArrayList A10() {
        return new ArrayList(1);
    }

    public static void A15(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) i3;
    }

    public static void A1I(OutputStream outputStream, int i, int i2) {
        outputStream.write((byte) (i | i2));
    }

    public static void A1M(StringBuffer stringBuffer, long j, long j2) {
        stringBuffer.append((int) (j - j2));
    }

    public static void A1R(byte[] bArr, int i, int i2, int i3) {
        bArr[i3] = (byte) (i ^ i2);
    }

    public static void A1S(byte[] bArr, int i, long j) {
        bArr[28] = (byte) i;
        bArr[29] = (byte) ((int) (j >> 1));
        bArr[30] = (byte) ((int) (j >> 9));
        bArr[31] = (byte) ((int) (j >> 17));
    }

    public static int[] A1Y() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static int A01(int i) {
        return zzhh.zzy(i << 3);
    }

    public static int A02(int i, int i2) {
        return ((i << 28) + (i2 + 112)) >> 30;
    }

    public static int A05(zzhd zzhd) {
        return zzhd.zza.zzm();
    }

    public static int A06(AnonymousClass141 r1, Object obj) {
        if (obj == C108515Tu.A06) {
            return r1.A05;
        }
        return r1.A06;
    }

    public static int A0B(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 16);
    }

    public static int A0C(int[] iArr, int i, int i2, int i3) {
        return i3 + i2 + iArr[i];
    }

    public static int A0D(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i2] = i;
        int i5 = i3 ^ i;
        iArr[i4] = i5;
        return i5;
    }

    public static int A0E(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[i];
        return i + 1;
    }

    public static C207019uQ A0K(C204359ps r0) {
        return (C207019uQ) r0.A0J.get();
    }

    public static LatLng A0L(Parcel parcel, int i) {
        return (LatLng) AnonymousClass0ZA.A06(parcel, LatLng.CREATOR, i);
    }

    public static zzje A0N() {
        return new zzje("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static AnonymousClass9Y1 A0P(C18800tq r0) {
        return (AnonymousClass9Y1) r0.A1R.get();
    }

    public static C202279lS A0Q(C18800tq r0) {
        return (C202279lS) r0.A1T.get();
    }

    public static AnonymousClass16X A0R(Object obj, String str) {
        return AnonymousClass16X.A00(str, ((AnonymousClass16V) obj).A01);
    }

    public static C52502pX A0T(C63573Ko r1, String str, Object[] objArr) {
        r1.A02 = str;
        C52502pX r2 = C52502pX.TEXT;
        r1.A00 = r2;
        objArr[1] = r1.A0r();
        return r2;
    }

    public static C61223Ba A0V(C18830tt r0) {
        return (C61223Ba) r0.A34.get();
    }

    public static AEA A0W(C18830tt r0) {
        return (AEA) r0.A2H.get();
    }

    public static AE0 A0X(C18800tq r0) {
        return (AE0) r0.A49.get();
    }

    public static AnonymousClass1EZ A0Y(C18800tq r0) {
        return (AnonymousClass1EZ) r0.A65.get();
    }

    public static AnonymousClass6PS A0Z(C18800tq r0) {
        return (AnonymousClass6PS) r0.A68.get();
    }

    public static C24611Dc A0a(String str) {
        return C24611Dc.A00(str, "payment", "IN");
    }

    public static C24611Dc A0b(String str) {
        return C24611Dc.A00(str, "onboarding", "IN");
    }

    public static C24611Dc A0c(String str, String str2) {
        return C24611Dc.A00(str, str2, "COMMON");
    }

    public static IndiaUpiPinPrimerDialogFragment A0d(Parcelable parcelable, C23030B1b b1b) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_bank_account", parcelable);
        IndiaUpiPinPrimerDialogFragment indiaUpiPinPrimerDialogFragment = new IndiaUpiPinPrimerDialogFragment();
        indiaUpiPinPrimerDialogFragment.A17(bundle);
        indiaUpiPinPrimerDialogFragment.A06 = b1b;
        return indiaUpiPinPrimerDialogFragment;
    }

    public static C199849g7 A0e(C18800tq r0) {
        return (C199849g7) r0.A6C.get();
    }

    public static C203399nx A0h(String str) {
        ArrayList arrayList = C185898uy.A00;
        AnonymousClass6QB r2 = new AnonymousClass6QB("presence");
        r2.A08(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C185898uy.A00);
        return r2.A03();
    }

    public static Long A0k() {
        return 10L;
    }

    public static Long A0l() {
        return 1024L;
    }

    public static String A0o(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0p(AnonymousClass155 r2) {
        return C237919w.A00(r2.A02, r2.A07);
    }

    public static String A0s(C135086c7 r0) {
        Object obj = r0.A00;
        C18740tg.A06(obj);
        return (String) obj;
    }

    public static String A0w(byte[] bArr) {
        return new String(bArr, AnonymousClass0S4.A05);
    }

    public static StringBuffer A0x() {
        return new StringBuffer();
    }

    public static StringBuilder A0y(StringBuilder sb) {
        sb.append(10);
        return new StringBuilder();
    }

    public static Map A12() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static C17980sO A13(zzez zzez) {
        C17980sO r0 = zzez.zzb;
        if (r0 == null) {
            return null;
        }
        return r0;
    }

    public static AnonymousClass122 A14(String str, AnonymousClass122 r2) {
        return new AnonymousClass122(str, r2);
    }

    public static void A1A(TextView textView, Object obj) {
        textView.setText((CharSequence) obj);
    }

    public static void A1C(Jid jid, AnonymousClass8NG r1) {
        if (jid != null) {
            r1.A0W(jid.getRawString());
        }
    }

    public static void A1D(C135086c7 r0, String str, JSONObject jSONObject) {
        jSONObject.put(str, r0.A00);
    }

    public static void A1F(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        PinBottomSheetDialogFragment.A03(pinBottomSheetDialogFragment, j * 1000, true);
    }

    public static void A1G(AnonymousClass2bU r1, String str) {
        r1.A02 = AnonymousClass14B.A0C(str, 65536);
    }

    public static void A1H(C47142dX r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        C64933Qa r0 = r2.A09.A1J;
        voiceNoteProfileAvatarView.A05(0, false, r0.A02, AnonymousClass143.A0G(r0.A00));
    }

    public static void A1K(Object obj, AbstractCollection abstractCollection, byte[] bArr, int i) {
        abstractCollection.add(Byte.valueOf((byte) (bArr[i] ^ ((Number) obj).byteValue())));
    }

    public static void A1N(Throwable th) {
        Log.e("AutoconfManager/preload/feo2/soft_error", th);
    }

    public static void A1O(Method method, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(method.getName(), method);
        if (method.getParameterTypes().length == 0) {
            abstractMap2.put(method.getName(), method);
            if (method.getName().startsWith("get")) {
                abstractCollection.add(method.getName());
            }
        }
    }

    public static void A1P(Method method, AbstractMap abstractMap, AbstractMap abstractMap2) {
        boolean startsWith = method.getName().startsWith("has");
        String name = method.getName();
        if (startsWith) {
            abstractMap.put(name, method);
        } else if (name.startsWith("get")) {
            abstractMap2.put(method.getName(), method);
        }
    }

    public static boolean A1U(Parcel parcel, int i, int i2, int i3, boolean z) {
        if (i == i2) {
            return AnonymousClass0ZA.A0G(parcel, i3);
        }
        AnonymousClass0ZA.A0D(parcel, i3);
        return z;
    }

    public static boolean A1V(zzhd zzhd) {
        return zzhd.zza.zzC();
    }

    public static Object[] A1Z(Object[] objArr, int i) {
        Object[] objArr2 = objArr[i];
        AnonymousClass00C.A0E(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return objArr2;
    }

    public static String[] A1a() {
        return new String[]{"error"};
    }

    public static String[] A1b(C203399nx r0, C118095nK r1, String str) {
        r1.A00 = r0;
        return new String[]{str};
    }

    public static char A00(String str, StringBuilder sb, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            sb.append("_");
        }
        return charAt;
    }

    public static int A03(int i, int i2, int i3) {
        return Math.max(i3, Math.min(i, i2));
    }

    public static int A08(String str) {
        AnonymousClass00C.A08(str);
        return str.length();
    }

    public static int A09(String str, int i) {
        return Character.getNumericValue(str.charAt(i));
    }

    public static int A0A(Matcher matcher, int i) {
        return Integer.parseInt(matcher.group(i));
    }

    public static long A0F(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A00(bArr, i) >>> i2) & 2097151;
    }

    public static long A0G(byte[] bArr, int i, int i2) {
        return (JavaCurve25519Provider.A01(bArr, i) >>> i2) & 2097151;
    }

    public static Uri A0H(Activity activity) {
        return activity.getIntent().getData();
    }

    public static Bundle A0I(Parcel parcel, Class cls) {
        return parcel.readBundle(cls.getClassLoader());
    }

    public static C207249un A0S(Iterator it) {
        return (C207249un) it.next();
    }

    public static AnonymousClass9KA A0U(AbstractList abstractList, int i) {
        return (AnonymousClass9KA) abstractList.get(i);
    }

    public static PaymentCustomInstructionsBottomSheet A0f(Parcelable parcelable, String str, String str2, String str3) {
        C18740tg.A06(parcelable);
        C18740tg.A06(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("merchantJid", parcelable);
        bundle.putString("PayInstructionsKey", str);
        bundle.putString("referral_screen", str2);
        bundle.putString("total_amount", str3);
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = new PaymentCustomInstructionsBottomSheet();
        paymentCustomInstructionsBottomSheet.A17(bundle);
        return paymentCustomInstructionsBottomSheet;
    }

    public static C64933Qa A0g(C23084B3s b3s, String str, StringBuilder sb) {
        sb.append(str);
        return b3s.BE4();
    }

    public static IllegalArgumentException A0i(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static Integer A0j(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static Object A0n(Stack stack) {
        Object peek = stack.peek();
        AnonymousClass00C.A08(peek);
        return peek;
    }

    public static String A0q(C19970wo r1, C18820ts r2, long j) {
        return AnonymousClass3UM.A00(r2, r1.A08(j));
    }

    public static String A0r(Jid jid, String str, StringBuilder sb) {
        sb.append(str);
        return jid.getRawString();
    }

    public static String A0t(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static String A0u(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(valueOf);
        }
        return new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
    }

    public static String A0v(Locale locale, String str) {
        String upperCase = str.toUpperCase(locale);
        AnonymousClass00C.A08(upperCase);
        return upperCase;
    }

    public static List A11(String str, String str2, String str3, String str4) {
        return Arrays.asList(new String[]{str, str2, str3, str4});
    }

    public static void A16(Context context, AnonymousClass07B r1, int i) {
        r1.A0Q(context.getString(i));
        r1.A0U(true);
    }

    public static void A17(Context context, AnonymousClass07B r2, int i) {
        r2.A0L(AnonymousClass3UF.A08(context.getResources().getDrawable(R.drawable.ic_close), i));
    }

    public static void A18(Intent intent, String str, int i, boolean z, boolean z2) {
        intent.putExtra(str, i);
        intent.putExtra("extra_is_first_payment_method", z);
        intent.putExtra("extra_skip_value_props_display", z2);
    }

    public static void A19(IInterface iInterface, Parcel parcel, String str, String str2) {
        parcel.writeInterfaceToken(str);
        parcel.writeString(str2);
        parcel.writeStrongInterface(iInterface);
    }

    public static void A1B(Preference preference, TwoStatePreference twoStatePreference, boolean z) {
        preference.A0R(Boolean.valueOf(z));
        twoStatePreference.A0T(z);
    }

    public static void A1E(C24611Dc r1, Object obj) {
        r1.A06(obj.toString());
    }

    public static void A1J(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 17);
    }

    public static void A1L(String str, String str2, Throwable th, Object[] objArr) {
        android.util.Log.e(str2, String.format(str, objArr), th);
    }

    public static void A1Q(AbstractMap abstractMap, Iterator it) {
        AnonymousClass011 r0 = (AnonymousClass011) it.next();
        abstractMap.put(r0.first, r0.second);
    }

    public static void A1T(Object[] objArr, long j) {
        objArr[4] = Long.valueOf(j);
    }

    public static boolean A1W(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean A1X(List list, int i) {
        return list.contains(Integer.valueOf(i));
    }
}
