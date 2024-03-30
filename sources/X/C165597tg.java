package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.model.CarText;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.recaptcha.internal.zzje;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.Format;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbEntry;
import org.apache.xml.security.c14n.implementations.NameSpaceSymbTable;
import org.apache.xml.security.c14n.implementations.SymbMap;
import org.apache.xml.security.signature.XMLSignatureException;

/* renamed from: X.7tg  reason: invalid class name and case insensitive filesystem */
public abstract class C165597tg {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static int A03(int i, float f) {
        return (int) Math.ceil((double) (((float) i) * f));
    }

    public static int A05(C203399nx r1) {
        AnonymousClass00C.A0D(r1, 1);
        return AnonymousClass3ME.A00(r1);
    }

    public static long A0C(int i) {
        return ((long) i) & 4294967295L;
    }

    public static long A0E(long j, long j2) {
        return (j * j2) / SearchActionVerificationClientService.MS_TO_NS;
    }

    public static C21669AUm A0R(C20800yB r2, List list, int i, int i2) {
        if (!r2.A0E(i) || i2 == -1) {
            return null;
        }
        return (C21669AUm) list.get(i2);
    }

    public static String A0m(String str) {
        return String.valueOf(str.substring(0, 1).toLowerCase());
    }

    public static List A0r(AnonymousClass1LV r4, AnonymousClass147 r5) {
        List A05 = r4.A05(r5);
        return A05.subList(0, Math.min(1, A05.size()));
    }

    public static void A10(TypedArray typedArray, TwoStatePreference twoStatePreference, int i) {
        twoStatePreference.A03 = typedArray.getBoolean(i, typedArray.getBoolean(2, false));
        typedArray.recycle();
    }

    public static void A11(Parcel parcel, String str, int i, int i2) {
        AnonymousClass0Z9.A0C(parcel, str, i, false);
        AnonymousClass0Z9.A07(parcel, i2);
    }

    public static void A12(View view, ConversationRowAudioPreview conversationRowAudioPreview) {
        view.setVisibility(0);
        conversationRowAudioPreview.A00.setVisibility(8);
    }

    public static void A19(C204359ps r1, String str) {
        C204359ps.A06(r1, str, new Object[0]);
    }

    public static void A1A(C225314u r3, int i) {
        r3.BO9(new Object[]{r3.getString(R.string.f12nameremoved)}, 0, i);
    }

    public static void A1P(int[] iArr) {
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static int A02(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int A04(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A06(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Objects.hash(objArr);
    }

    public static int A08(byte[] bArr, int i, int i2) {
        return i2 | ((bArr[i] & 255) << 8);
    }

    public static int A09(C219411z[] r0, int i, int i2) {
        return i2 + r0[i].Bve().A0C().A0A();
    }

    public static long A0B() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static Intent A0F(Context context) {
        return new Intent(context, BrazilPayBloksActivity.class);
    }

    public static Intent A0G(Context context) {
        return new Intent(context, IndiaUpiPaymentsAccountSetupActivity.class);
    }

    public static C206389tK A0H(C206419tN r0, int i) {
        return (C206389tK) r0.A02.get(i);
    }

    public static C207179ug A0I(C204359ps r0) {
        return (C207179ug) r0.A08.get();
    }

    public static B3S A0J(Object obj) {
        return C198719e5.A02.A00(obj.getClass());
    }

    public static zzje A0K() {
        return new zzje("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static AnonymousClass186 A0L() {
        return new AnonymousClass186("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C176958cx A0N(Object obj) {
        C176958cx r1 = (C176958cx) obj;
        AnonymousClass00C.A0D(r1, 0);
        return r1;
    }

    public static C176918ct A0O(Object obj) {
        C176918ct r1 = (C176918ct) obj;
        AnonymousClass00C.A0D(r1, 0);
        return r1;
    }

    public static C177258dV A0P(Object obj) {
        C177258dV r1 = (C177258dV) obj;
        AnonymousClass00C.A0D(r1, 0);
        return r1;
    }

    public static C24611Dc A0S(String str) {
        return C24611Dc.A00(str, "network", "COMMON");
    }

    public static PaymentIncentiveViewModel A0T(AnonymousClass016 r2) {
        return (PaymentIncentiveViewModel) new AnonymousClass04H(r2).A00(PaymentIncentiveViewModel.class);
    }

    public static AnonymousClass3L6 A0U(C18800tq r0) {
        return (AnonymousClass3L6) r0.A0t.get();
    }

    public static C21700zf A0V(AnonymousClass3L6 r2) {
        return (C21700zf) r2.A02.get("catalog_collections_view_tag");
    }

    public static AnonymousClass6QB A0W() {
        return new AnonymousClass6QB("message");
    }

    public static AnonymousClass6QB A0X() {
        return new AnonymousClass6QB("smax:any");
    }

    public static AnonymousClass2bV A0Y(C64933Qa r2, String str, long j) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass2bV r0 = new AnonymousClass2bV(r2, j);
        r0.A16(str);
        r0.A18(arrayList);
        return r0;
    }

    public static Class A0b(Class cls, String str, Class[] clsArr, int i) {
        Class cls2 = Long.TYPE;
        clsArr[i] = cls2;
        cls.getMethod(str, clsArr);
        return cls2;
    }

    public static IllegalArgumentException A0c() {
        return new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static Integer A0d() {
        return 26;
    }

    public static Long A0e() {
        return 50L;
    }

    public static Long A0f(String str) {
        return Long.valueOf(AnonymousClass6R8.A01(str, 0));
    }

    public static NullPointerException A0g() {
        return new NullPointerException("zza");
    }

    public static Object A0h(C18800tq r0) {
        return r0.A2x.get();
    }

    public static Object A0i(Object obj) {
        if (obj == AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return obj;
        }
        return new AnonymousClass0AK(obj);
    }

    public static String A0l(String str) {
        if (str.equals("")) {
            return null;
        }
        return str;
    }

    public static StringBuffer A0o(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("No message with ID \"");
        stringBuffer.append(str);
        stringBuffer.append("\" found in resource bundle \"");
        stringBuffer.append("org/apache/xml/security/resource/xmlsecurity");
        return stringBuffer;
    }

    public static StringBuffer A0p(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer;
    }

    public static StringBuilder A0q(int i, char c) {
        StringBuilder sb = new StringBuilder(i);
        sb.append("Failed writing ");
        sb.append(c);
        return sb;
    }

    public static NameSpaceSymbEntry A0u(Object obj, NameSpaceSymbTable nameSpaceSymbTable) {
        SymbMap symbMap = nameSpaceSymbTable.a;
        return symbMap.b[symbMap.a(obj)];
    }

    public static XMLSignatureException A0v(Exception exc) {
        return new XMLSignatureException("empty", exc);
    }

    public static AnonymousClass121 A0w(C219411z[] r0, int i) {
        return r0[i].Bve().A0B();
    }

    public static void A0x(int i, int i2, int[] iArr, int[] iArr2) {
        iArr2[i] = i2 + iArr[i];
    }

    public static void A0z(Intent intent, String str) {
        intent.putExtra("referral_screen", str);
    }

    public static void A15(ListPreference listPreference, ListPreference listPreference2) {
        listPreference2.A0J(listPreference.A0J);
        listPreference2.A0R = listPreference.A0R;
        listPreference2.A0G = listPreference.A00;
        listPreference2.A0U(listPreference.A01);
        listPreference2.A02 = listPreference.A02;
        listPreference2.A0H(listPreference.A04());
        listPreference2.A0I(listPreference.A0F);
        int i = listPreference.A02;
        if (i != listPreference2.A02) {
            listPreference2.A02 = i;
            listPreference2.A06();
        }
    }

    public static void A1B(C225314u r1, int i) {
        if (i != 0) {
            r1.setResult(-1);
        } else {
            r1.A05.A06(R.string.f12nameremoved, 1);
        }
    }

    public static void A1C(C29121Vk r6, C236119d r7, C203399nx r8) {
        r6.A0H(r7, r8, "get", 0);
    }

    public static void A1D(AnonymousClass6QB r1, Object obj) {
        r1.A06(((C592133b) obj).A00);
    }

    public static void A1E(C19770wU r1, Object obj, int i) {
        r1.Boy(new C1497372o(obj, i));
    }

    public static void A1G(String str, String str2, StringBuilder sb) {
        sb.append("Field ");
        sb.append(str);
        sb.append(" for ");
        sb.append(str2);
        sb.append(" not found. Known fields are ");
    }

    public static void A1I(String str, AbstractCollection abstractCollection, long j) {
        abstractCollection.add(new AnonymousClass1AL(str, j));
    }

    public static void A1L(Charset charset, List list, byte[] bArr, int i, int i2) {
        list.add(new String(bArr, i, i2, charset));
    }

    public static void A1N(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
    }

    public static void A1O(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i & 127) | 128);
    }

    public static boolean A1Q(Parcel parcel, AZS azs) {
        parcel.writeInterfaceToken("com.facebook.wearable.applinks.IAppLinkServiceV2");
        if (azs != null) {
            parcel.writeInt(1);
            azs.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static boolean A1R(C20800yB r1) {
        return r1.A0E(4465);
    }

    public static byte[] A1U(long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong(j);
        return order.array();
    }

    public static int[] A1X(Object obj, int i, int i2) {
        int[] iArr = new int[((i / 2) + 1)];
        System.arraycopy(obj, 0, iArr, 0, i2);
        return iArr;
    }

    public static Class[] A1Y(Object obj, int i) {
        Class[] clsArr = new Class[i];
        clsArr[0] = Object.class;
        clsArr[1] = obj;
        return clsArr;
    }

    public static String[] A1Z() {
        return new String[]{"code"};
    }

    public static String[] A1a() {
        return new String[]{"active", "active_pending", "active_status_pending", "available", "blocked", "deregistered", "deregistered_pending", "inactive", "inactive_status_pending", "unknown"};
    }

    public static String[] A1b() {
        return new String[]{"CREDIT", "CURRENT", "DEFAULT", "NRE", "NRO", "OD_SECURED", "OD_UNSECURED", "SAVINGS", "UNKNOWN"};
    }

    public static float A01(float f, float f2, float f3) {
        return Math.max(f3, Math.min(f, f2));
    }

    public static int A07(List list) {
        int size = list.size();
        int i = size << 1;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static long A0A() {
        return Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    }

    public static long A0D(int i) {
        return (long) (i & 1048575);
    }

    public static C21903AcX A0M(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            return new C21903AcX();
        }
        return new C21903AcX(abstractMap);
    }

    public static C175818b6 A0Q(C24611Dc r0, Object obj, String str) {
        C18740tg.A07(obj, r0.A03(str));
        return (C175818b6) obj;
    }

    public static ArrayIndexOutOfBoundsException A0Z(String str, Object[] objArr) {
        return new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static CharSequence A0a(Drawable drawable, TextView textView, CharSequence charSequence) {
        return C37351mE.A02(textView.getPaint(), drawable, charSequence);
    }

    public static String A0j(Activity activity) {
        return activity.getIntent().getStringExtra("referral_screen");
    }

    public static String A0k(AnonymousClass1N3 r0, String str) {
        return r0.A00(str).toString();
    }

    public static String A0n(String str, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static List A0s(String str, String str2) {
        return Arrays.asList(new String[]{str, str2});
    }

    public static UUID A0t(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static void A0y(Intent intent, Intent intent2, String str) {
        intent2.putExtra(str, intent.getStringExtra(str));
    }

    public static void A13(TextView textView, Format format, long j) {
        textView.setText(format.format(Long.valueOf(j)));
    }

    public static void A14(CarText carText, StringBuilder sb) {
        sb.append(CarText.A00(carText));
    }

    public static void A16(ListPreference listPreference, String str) {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        listPreference.A0T(str);
        int A0S = listPreference.A0S(listPreference.A00);
        if (A0S < 0 || (charSequenceArr = listPreference.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr[A0S];
        }
        listPreference.A0H(charSequence);
    }

    public static void A17(Preference preference) {
        preference.A0L(preference.A0P());
        preference.A05();
    }

    public static void A18(C165737u4 r1) {
        if (!r1.isVisible()) {
            r1.A0L = C023109s.A00;
        }
    }

    public static void A1F(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A1H(String str, String str2, Object[] objArr) {
        Log.w(str2, String.format(str, objArr));
    }

    public static void A1J(StringBuilder sb, B35 b35) {
        sb.append(b35.B8R());
    }

    public static void A1K(Buffer buffer) {
        buffer.position(buffer.limit());
    }

    public static void A1M(AbstractMap abstractMap, int i) {
        abstractMap.put("error_code", String.valueOf(i));
    }

    public static boolean A1S(Object obj, boolean z) {
        return Objects.equals(obj, Boolean.valueOf(z));
    }

    public static boolean A1T(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static byte[] A1V(C219411z r1) {
        return r1.Bve().A09("DER");
    }

    public static int[] A1W(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            return C203739og.A00;
        }
        return iArr;
    }
}
