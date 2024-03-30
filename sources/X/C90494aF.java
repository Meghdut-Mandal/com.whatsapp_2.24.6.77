package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.voipcalling.CallInfo;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.4aF  reason: invalid class name and case insensitive filesystem */
public abstract class C90494aF {
    public static float A01(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static int A06(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return 0;
        }
        return 2;
    }

    public static Integer A0U() {
        return -1;
    }

    public static Object A0Y(Object obj, Map map) {
        AnonymousClass00C.A0D(map, 0);
        return C000200c.A00(obj, map);
    }

    public static List A0i(CharSequence charSequence, String str) {
        return AnonymousClass099.A0L(charSequence, new String[]{str}, 0);
    }

    public static AnonymousClass041 A0n(C005102h r2) {
        return C009403z.A02(new C007703h((C007403e) null).plus(r2));
    }

    public static void A0t(Rect rect, RectF rectF, float f, float f2) {
        rectF.set(f + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
    }

    public static void A0w(View view, int i, int i2) {
        view.measure(i, i2);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void A1H(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1O(ArrayList arrayList, List list) {
        list.addAll(arrayList.subList(0, Math.min(arrayList.size(), 3 - list.size())));
    }

    public static void A1P(float[] fArr, float f, float f2) {
        fArr[6] = f;
        fArr[7] = f2;
    }

    public static void A1Q(int[] iArr, int i) {
        iArr[3] = i;
        iArr[4] = 12322;
        iArr[5] = i;
        iArr[6] = 12321;
    }

    public static void A1S(Object[] objArr, long j) {
        objArr[0] = Double.valueOf(((double) j) / 1000.0d);
    }

    public static boolean A1Z(CharSequence charSequence, CharSequence charSequence2) {
        return AnonymousClass099.A0O(charSequence, charSequence2, false);
    }

    public static boolean A1a(String str) {
        return Log.isLoggable(str, 3);
    }

    public static float A03(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static float A05(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public static int A07(int i) {
        return i != 0 ? 32 : 16;
    }

    public static int A08(long j) {
        return (int) (j >> 32);
    }

    public static int A0C(int[] iArr, int i) {
        return iArr[i + 1] & 67108863;
    }

    public static Intent A0D(Context context, Parcelable parcelable, Class cls, String str, String str2) {
        return new Intent(context, cls).putExtra("screen_name", str).putExtra("screen_params", str2).putExtra("screen_cache_config", parcelable);
    }

    public static Drawable A0F(PorterDuff.Mode mode, Drawable drawable, Object obj) {
        if (drawable == null) {
            return null;
        }
        if (obj == null) {
            return drawable;
        }
        Drawable mutate = AnonymousClass08I.A01(drawable).mutate();
        AnonymousClass00C.A08(mutate);
        if (mode == null) {
            return mutate;
        }
        AnonymousClass076.A04(mode, mutate);
        return mutate;
    }

    public static Drawable A0G(View view, int i) {
        if (i != 0) {
            return C013105r.A01(view.getContext(), i);
        }
        return null;
    }

    public static C94064ha A0H(Object obj) {
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C94064ha) AnonymousClass6YQ.A07((C94064ha) obj);
    }

    public static C142616pA A0J(C18830tt r0) {
        return (C142616pA) r0.A1R.get();
    }

    public static AnonymousClass13E A0L(C18800tq r0) {
        return (AnonymousClass13E) r0.A96.get();
    }

    public static AnonymousClass1QW A0N(C18830tt r0) {
        return (AnonymousClass1QW) r0.A0Z.get();
    }

    public static C142606p9 A0O(C18830tt r0) {
        return (C142606p9) r0.A0b.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.hasAttribute(r4) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.VoipStanzaChildNode A0Q(com.whatsapp.calling.service.OutgoingSignalingHandler r5, com.whatsapp.protocol.VoipStanzaChildNode r6) {
        /*
            X.0wQ r0 = r5.meManager
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = "type"
            java.lang.String r0 = "pkmsg"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r3 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r6, r3)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r0.hasAttribute(r4)
            if (r0 == 0) goto L_0x006d
        L_0x001f:
            X.0wp r0 = r5.companionModeSharedPreferences
            byte[] r3 = r0.A02()
            X.C18740tg.A06(r3)
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r2 = X.C34681hT.A01(r6)
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r6.getChildrenCopy()
            r2.addChildren(r0)
            java.lang.String r1 = "device-identity"
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r0 = new com.whatsapp.protocol.VoipStanzaChildNode$Builder
            r0.<init>(r1)
            r0.setData(r3)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r0.build()
            r2.addChild(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r2.build()
            return r0
        L_0x0049:
            java.lang.String r0 = "destination"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r6, r0)
            if (r0 == 0) goto L_0x006d
            com.whatsapp.protocol.VoipStanzaChildNode[] r2 = r0.getChildrenCopy()
            r1 = 0
            if (r2 == 0) goto L_0x006d
        L_0x0058:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x006d
            r0 = r2[r1]
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C34681hT.A02(r0, r3)
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.hasAttribute(r4)
            if (r0 == 0) goto L_0x006a
            goto L_0x001f
        L_0x006a:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x006d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90494aF.A0Q(com.whatsapp.calling.service.OutgoingSignalingHandler, com.whatsapp.protocol.VoipStanzaChildNode):com.whatsapp.protocol.VoipStanzaChildNode");
    }

    public static CharSequence A0R(View view, int i) {
        if (i != 0) {
            return view.getResources().getText(i);
        }
        return null;
    }

    public static Double A0S() {
        return Double.valueOf(0.0d);
    }

    public static Long A0W(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static Iterator A0h(Object obj) {
        return ((C20990A2e) obj).A00.iterator();
    }

    public static SecretKey A0l() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return instance.generateKey();
    }

    public static SecretKeySpec A0m(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static short A0p() {
        if (Build.VERSION.SDK_INT >= 26) {
            return -1;
        }
        return -2;
    }

    public static void A0q(Animator animator) {
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A0r(Context context, Intent intent) {
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A0s(ColorStateList colorStateList, Drawable drawable, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            AnonymousClass076.A06(drawable, C018107s.A03(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public static void A10(Object obj) {
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
    }

    public static void A13(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[44] = obj;
        objArr[45] = obj2;
        objArr[46] = obj3;
        objArr[47] = obj4;
    }

    public static void A14(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[48] = obj;
        objArr[49] = obj2;
        objArr[50] = obj3;
        objArr[51] = obj4;
    }

    public static void A15(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[52] = obj;
        objArr[53] = obj2;
        objArr[54] = obj3;
        objArr[55] = obj4;
    }

    public static void A16(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[56] = obj;
        objArr[57] = obj2;
        objArr[58] = obj3;
        objArr[59] = obj4;
    }

    public static void A17(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[60] = obj;
        objArr[61] = obj2;
        objArr[62] = obj3;
        objArr[63] = obj4;
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[64] = obj;
        objArr[65] = obj2;
        objArr[66] = obj3;
        objArr[67] = obj4;
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[68] = obj;
        objArr[69] = obj2;
        objArr[70] = obj3;
        objArr[71] = obj4;
    }

    public static void A1A(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[72] = obj;
        objArr[73] = obj2;
        objArr[74] = obj3;
        objArr[75] = obj4;
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[76] = obj;
        objArr[77] = obj2;
        objArr[78] = obj3;
        objArr[79] = obj4;
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[80] = obj;
        objArr[81] = obj2;
        objArr[82] = obj3;
        objArr[83] = obj4;
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[84] = obj;
        objArr[85] = obj2;
        objArr[86] = obj3;
        objArr[87] = obj4;
    }

    public static void A1E(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[88] = obj;
        objArr[89] = obj2;
        objArr[90] = obj3;
        objArr[91] = obj4;
    }

    public static void A1F(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass011(obj, obj2));
    }

    public static void A1I(Object obj, JSONObject jSONObject) {
        jSONObject.put("client_pub_key", obj);
        jSONObject.put("client_pub_key_type", "RSA 2048");
    }

    public static void A1K(StringBuilder sb, int i) {
        sb.append(" (");
        sb.append(i);
    }

    public static void A1R(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static boolean A1V(WaDialogFragment waDialogFragment) {
        return waDialogFragment.A02.A0E(5627);
    }

    public static boolean A1X(C20800yB r1) {
        return r1.A0E(450);
    }

    public static boolean A1Y(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Object[] A1b(Object obj) {
        return Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1);
    }

    public static double A00(AtomicReference atomicReference) {
        return ((Number) atomicReference.get()).doubleValue();
    }

    public static float A02(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), Math.max(Math.min(f, f2), f3));
    }

    public static float A04(Context context) {
        return context.getResources().getDimension(R.dimen.f7nameremoved);
    }

    public static int A09(Activity activity) {
        return activity.getIntent().getIntExtra("origin", 1);
    }

    public static int A0A(C161337ma r0, Object obj) {
        if (r0.B2h(obj)) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public static int A0B(Number number, String str, int i) {
        return i + str.hashCode() + number.intValue();
    }

    public static SharedPreferences.Editor A0E(C24601Db r0) {
        return r0.A03().edit();
    }

    public static Chip A0I(View view) {
        return new Chip(view.getContext(), (AttributeSet) null);
    }

    public static AnonymousClass1M0 A0K(AnonymousClass005 r0) {
        return ((C229616q) r0.get()).A04();
    }

    public static UserJid A0M(CallInfo callInfo) {
        UserJid peerJid = callInfo.getPeerJid();
        C18740tg.A06(peerJid);
        return peerJid;
    }

    public static WhatsAppLibLoader A0P(C18800tq r0) {
        return (WhatsAppLibLoader) r0.A9W.get();
    }

    public static Float A0T(C20800yB r0, int i) {
        return Float.valueOf(r0.A05(i));
    }

    public static Long A0V(long j) {
        return Long.valueOf(SystemClock.elapsedRealtime() - j);
    }

    public static Object A0X(C161337ma r1) {
        r1.Bum(-492369756);
        return r1.BnZ();
    }

    public static String A0Z(Cursor cursor, int i) {
        String string = cursor.getString(i);
        AnonymousClass00C.A08(string);
        return string;
    }

    public static String A0a(C88834Uf r1) {
        return AnonymousClass143.A03(r1.getContact().A06(AnonymousClass11F.class));
    }

    public static String A0b(C18820ts r4, int i) {
        return r4.A0N().format(((double) i) / 100.0d);
    }

    public static String A0c(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        return obj.toString();
    }

    public static String A0d(String str, int i) {
        String substring = str.substring(i);
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static String A0e(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        AnonymousClass00C.A08(format);
        return format;
    }

    public static String A0f(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static ArrayList A0g(Map map) {
        return new ArrayList(map.values());
    }

    public static List A0j(Object[] objArr) {
        List asList = Arrays.asList(objArr);
        AnonymousClass00C.A08(asList);
        return asList;
    }

    public static Map A0k(List list, int i) {
        return (Map) list.get(i);
    }

    public static C93104fl A0o(AbstractList abstractList, int i) {
        return (C93104fl) abstractList.get(i);
    }

    public static void A0u(View view) {
        if (C19550w8.A01()) {
            view.setLayerType(2, (Paint) null);
        }
    }

    public static void A0v(View view, int i) {
        view.findViewById(i).setVisibility(4);
    }

    public static void A0x(AnonymousClass1KS r1, String str, int i) {
        r1.A08(Integer.valueOf(i), str);
    }

    public static void A0y(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 3;
    }

    public static void A0z(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 4;
    }

    public static void A11(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 13);
    }

    public static void A12(Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 18);
        AnonymousClass00C.A0D(obj3, 19);
    }

    public static void A1G(Object obj, Object obj2, AnonymousClass00T r3) {
        ((AbstractMap) r3.getValue()).put(obj, obj2);
    }

    public static void A1J(String str, Locale locale, Object[] objArr) {
        com.whatsapp.util.Log.i(String.format(locale, str, objArr));
    }

    public static void A1L(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("x");
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(": ");
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", name=");
    }

    public static boolean A1T(C161337ma r1, Object obj) {
        r1.Bum(1157296644);
        return r1.B2f(obj);
    }

    public static boolean A1U(C001600r r0, Object obj) {
        return obj.equals(r0.A04());
    }

    public static boolean A1W(C160817ld r1, C148826zU r2) {
        return r1.BBi().A1J.equals(r2.A0J.A1J);
    }
}
