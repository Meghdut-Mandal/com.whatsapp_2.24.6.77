package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzin;
import com.google.android.recaptcha.internal.zzjd;
import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzkr;
import com.whatsapp.R;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.json.JSONObject;
import org.w3c.dom.Node;

/* renamed from: X.7tf  reason: invalid class name and case insensitive filesystem */
public abstract class C165587tf {
    public static float A00(int i, int i2, int i3) {
        return ((float) (i - i2)) - (((float) i3) / 2.0f);
    }

    public static int A03(int i) {
        return i != 0 ? 2 : 0;
    }

    public static int A05(C20800yB r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A07(4248);
    }

    public static int A08(byte[] bArr) {
        int length = bArr.length;
        return C201849kY.A01(length) + 1 + length;
    }

    public static long A0A(int i, long j) {
        return (j ^ (((long) i) << 56)) ^ 71499008037633920L;
    }

    public static zzae A0G() {
        return new zzae(4, 5, (Throwable) null);
    }

    public static Object A0d(Class cls) {
        return cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{false});
    }

    public static Object A0e(ClassLoader classLoader, String str, InvocationHandler invocationHandler, Class[] clsArr) {
        Class<?> loadClass = classLoader.loadClass(str);
        AnonymousClass00C.A08(loadClass);
        clsArr[0] = loadClass;
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        AnonymousClass00C.A08(newProxyInstance);
        return newProxyInstance;
    }

    public static Map A0o(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof Map) {
            return (Map) obj2;
        }
        return null;
    }

    public static CanonicalizationException A0r(Node node, Object[] objArr) {
        objArr[2] = node.getNodeValue();
        return new CanonicalizationException("c14n.Canonicalizer.RelativeNamespace", objArr);
    }

    public static XMLSignatureException A0s(Throwable th, Object[] objArr) {
        objArr[1] = th.getLocalizedMessage();
        return new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr);
    }

    public static void A0x(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A13(C21674AUx aUx, AnonymousClass3L1 r4, byte[] bArr) {
        byte[] A06 = aUx.A06();
        r4.A08 = Base64.encodeToString(bArr, 2);
        r4.A05 = Base64.encodeToString(A06, 2);
    }

    public static void A1B(C1271267b r2) {
        r2.A02 = null;
        r2.A00 = 0;
    }

    public static void A1F(Class cls) {
        Class cls2 = Long.TYPE;
        cls.getMethod("getInt", new Class[]{cls2});
        cls.getMethod("putInt", new Class[]{cls2, Integer.TYPE});
    }

    public static void A1I(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
        objArr[6] = obj3;
    }

    public static void A1K(Object obj, byte[][] bArr, int i, int i2) {
        System.arraycopy(obj, 0, bArr[0], 0, i);
        bArr[1] = new byte[i2];
        System.arraycopy(obj, i, bArr[1], 0, i2);
    }

    public static void A1S(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void A1T(byte[] bArr, int i, int i2, int i3) {
        bArr[i3] = (byte) (i | i2);
    }

    public static float A01(int[] iArr, float f, int i) {
        return Math.abs(f - ((float) iArr[i]));
    }

    public static int A02(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A04(C225314u r1, List list) {
        if (r1.A0D.A0E(2443)) {
            Collections.sort(list);
        }
        return 2443;
    }

    public static int A09(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static long A0B(Object obj) {
        Number number = (Number) obj;
        AnonymousClass00C.A08(number);
        return number.longValue();
    }

    public static long A0C(Object[] objArr, int i) {
        return objArr[i].longValue();
    }

    public static AnonymousClass9U5 A0E(Object obj) {
        AnonymousClass9U5 r1 = (AnonymousClass9U5) obj;
        AnonymousClass00C.A0D(r1, 0);
        return r1;
    }

    public static zzjd A0H() {
        return new zzjd("Protocol message tag had invalid wire type.");
    }

    public static zzkr A0I(Object obj) {
        return zzkn.zzb.zzb(obj.getClass());
    }

    public static AnonymousClass186 A0J() {
        return new AnonymousClass186("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static C27111My A0K(C32581dr r1, C18800tq r2, BusinessProductListBaseFragment businessProductListBaseFragment) {
        businessProductListBaseFragment.A03 = (AnonymousClass6VE) r2.A1Q.get();
        businessProductListBaseFragment.A02 = (C178358fo) r2.ADJ.get();
        businessProductListBaseFragment.A05 = (C31771cM) r2.A6p.get();
        businessProductListBaseFragment.A06 = (C29461Ws) r2.A1S.get();
        businessProductListBaseFragment.A07 = (AnonymousClass9Y1) r2.A1R.get();
        C27111My r12 = r1.A1I;
        businessProductListBaseFragment.A04 = (AnonymousClass4PE) r12.A1N.get();
        businessProductListBaseFragment.A08 = (C196089Xp) r12.A0L.get();
        return r12;
    }

    public static AnonymousClass1KK A0L(C18800tq r0) {
        return (AnonymousClass1KK) r0.A19.get();
    }

    public static C24381Cf A0O(C18800tq r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A2H = (C32931eR) r1.A4K.get();
        conversationsFragment.A2J = (C32881eL) r1.A4L.get();
        return (C24381Cf) r1.A2M.get();
    }

    public static AnonymousClass16T A0Q(C18800tq r0) {
        return (AnonymousClass16T) r0.A66.get();
    }

    public static C202319lY A0R(C24881Ed r2, String str, String str2) {
        return r2.A0L(str, str2, -1);
    }

    public static C24601Db A0S(C18800tq r0) {
        return (C24601Db) r0.A6D.get();
    }

    public static C29121Vk A0T(C18800tq r0) {
        return (C29121Vk) r0.A6I.get();
    }

    public static AF7 A0V(C18800tq r0) {
        return (AF7) r0.A47.get();
    }

    public static AF8 A0W(AnonymousClass1EU r1) {
        AF8 A04 = r1.A04("UPI");
        C18740tg.A06(A04);
        return A04;
    }

    public static C24611Dc A0X(String str) {
        return C24611Dc.A00(str, "payment-settings", "IN");
    }

    public static C29131Vl A0Z(C18800tq r0) {
        return (C29131Vl) r0.A67.get();
    }

    public static AnonymousClass6QB A0a() {
        return new AnonymousClass6QB("account");
    }

    public static Long A0b() {
        return 20L;
    }

    public static Long A0c() {
        return 1000L;
    }

    public static StringBuilder A0i(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        return sb;
    }

    public static StringBuilder A0j(C24601Db r4) {
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A03().getString("payments_sent_payment_with_account", ""));
        return sb;
    }

    public static StringBuilder A0k(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("sende2emessagejob/");
        sb.append(obj);
        return sb;
    }

    public static StringBuilder A0l(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(10);
        return new StringBuilder();
    }

    public static Mac A0q(byte[] bArr) {
        Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
        instance.init(new SecretKeySpec(bArr, DefaultCrypto.HMAC_SHA256));
        return instance;
    }

    public static void A0v(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A0w(Paint paint, C196189Yb r2) {
        if (r2 != null) {
            paint.setColorFilter((ColorFilter) r2.A05());
        }
    }

    public static void A0y(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new AnonymousClass75C(obj, obj2, i));
    }

    public static void A0z(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new AnonymousClass74N(obj, obj2, i));
    }

    public static void A11(C001600r r1, Object obj, Object obj2) {
        r1.A0C(new AnonymousClass00I(obj, obj2));
    }

    public static void A12(zzin zzin) {
        if (!zzin.zza.zzG()) {
            zzin.zzn();
        }
    }

    public static void A15(C19730wQ r0, DeviceJid deviceJid, AbstractCollection abstractCollection) {
        UserJid userJid = deviceJid.userJid;
        if (!r0.A0M(userJid)) {
            abstractCollection.add(userJid.getPrimaryDevice());
        }
    }

    public static void A19(C201259jD r0, AnonymousClass4TM r1) {
        if (r1 != null) {
            r1.onError(C1900696t.A00(r0));
        }
    }

    public static void A1A(GroupJid groupJid, String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass3QK(groupJid, str, 2, 0));
    }

    public static void A1C(AnonymousClass6QB r1, C592133b r2) {
        if (r2 != null) {
            r1.A05(r2.A00);
        }
    }

    public static void A1D(AnonymousClass6QB r1, Object obj, int i) {
        if (i != 0) {
            r1.A07(String.valueOf(obj));
        }
    }

    public static void A1E(Appendable appendable, int i) {
        appendable.append("0123456789ABCDEF".charAt(i & 15));
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[19] = obj;
        objArr[20] = obj2;
        objArr[21] = obj3;
    }

    public static void A1L(String str, String str2, Object[] objArr) {
        objArr[1] = new AnonymousClass1AL(str, str2);
    }

    public static void A1N(String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass1AL(str, i));
    }

    public static void A1U(byte[] bArr, byte[] bArr2, int i) {
        bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
    }

    public static void A1V(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void A1Y(int[][] iArr, int i, int i2, int i3) {
        int[] iArr2 = iArr[i];
        int i4 = iArr2[i2];
        int i5 = ((i4 << i3) | (i4 >>> 8)) ^ i4;
        int i6 = i4 ^ ((((-2139062144 & i5) >>> 7) * 27) ^ ((2139062143 & i5) << 1));
        int i7 = i6 & -1061109568;
        int i8 = i7 ^ (i7 >>> 1);
        int i9 = i5 ^ ((i8 >>> 5) ^ (((1061109567 & i6) << 2) ^ (i8 >>> 2)));
        iArr2[i2] = i6 ^ (i9 ^ ((i9 << (-16)) | (i9 >>> 16)));
    }

    public static boolean A1Z(Appendable appendable, boolean z) {
        if (!z) {
            return true;
        }
        appendable.append(',');
        return z;
    }

    public static int A06(Object obj, Map map) {
        return Integer.parseInt((String) map.get(obj));
    }

    public static int A07(String str, int i, int i2) {
        return Integer.parseInt(str.substring(i, i2).trim());
    }

    public static Drawable A0D(Context context, int i) {
        return AnonymousClass3UF.A02(context, i, R.color.f6nameremoved);
    }

    public static RecaptchaException A0F(RecaptchaErrorCode recaptchaErrorCode) {
        return new RecaptchaException(recaptchaErrorCode, recaptchaErrorCode.getErrorMessage());
    }

    public static AnonymousClass16I A0M(C18800tq r0) {
        return (AnonymousClass16I) r0.A2B.get();
    }

    public static C20830yE A0N(C18800tq r0) {
        return (C20830yE) r0.A9E.get();
    }

    public static AnonymousClass16X A0P(C21120yh r1, C21100yf r2, Object obj) {
        return new AnonymousClass16X(new BigDecimal(r2.A04(r1)), ((AnonymousClass16V) obj).A01);
    }

    public static C195389Uc A0U(C18830tt r0) {
        return (C195389Uc) r0.AAi.get();
    }

    public static AnonymousClass61B A0Y(C18800tq r0) {
        return (AnonymousClass61B) r0.ANg.get();
    }

    public static RuntimeException A0f(Object obj, String str, StringBuffer stringBuffer) {
        stringBuffer.append(str);
        stringBuffer.append(obj);
        return new RuntimeException(stringBuffer.toString());
    }

    public static String A0g(Activity activity) {
        return activity.getIntent().getStringExtra("extra_referral_screen");
    }

    public static String A0h(AnonymousClass1LB r0, Object obj, String str) {
        String str2;
        C192999Jl A00 = r0.A00();
        if (A00 == null || (str2 = (String) A00.A02.get(obj)) == null) {
            return str;
        }
        return str2;
    }

    public static Throwable A0m(Throwable th) {
        if (th.getCause() != null) {
            return th.getCause();
        }
        return th;
    }

    public static ArrayList A0n(List list, int i) {
        return new ArrayList(list.size() + i);
    }

    public static Logger A0p(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A0t(Context context, C39001qm r1, Object[] objArr, int i) {
        r1.A0p(context.getString(i, objArr));
    }

    public static void A0u(Intent intent, C225314u r2, String str, String str2) {
        intent.putExtra(str, str2);
        r2.A33(intent, true);
    }

    public static void A10(View view, Object[] objArr, int i, int i2) {
        objArr[i2] = view.findViewById(i);
    }

    public static void A14(C27111My r0, C18830tt r1, ConversationsFragment conversationsFragment) {
        conversationsFragment.A1Y = (C33081eg) r0.A0S.get();
        conversationsFragment.A2h = (C32251dE) r1.A0E.get();
    }

    public static void A16(C39001qm r1) {
        r1.A0d(R.string.f12nameremoved);
        r1.A0c(R.string.f12nameremoved);
    }

    public static void A17(C39001qm r2) {
        r2.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
    }

    public static void A18(C176658cT r1, Object obj, JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            r1.A0Z = obj.toString();
        }
    }

    public static void A1G(Class cls, Object obj, String str, int i) {
        C132886Vq.A01(cls, Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i), str);
    }

    public static void A1J(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append("; participant=");
    }

    public static void A1M(String str, String str2, Object[] objArr) {
        Log.d(str2, String.format(str, objArr));
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(' ');
    }

    public static void A1P(ByteBuffer byteBuffer, UUID uuid) {
        byteBuffer.putLong(uuid.getMostSignificantBits());
        byteBuffer.putLong(uuid.getLeastSignificantBits());
    }

    public static void A1Q(AbstractCollection abstractCollection, float f) {
        abstractCollection.add(Float.valueOf(f));
    }

    public static void A1R(AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        Objects.requireNonNull(obj);
        ((CountDownLatch) obj).countDown();
    }

    public static void A1W(Object[] objArr, long j) {
        objArr[3] = Long.valueOf(j);
    }

    public static void A1X(Object[] objArr, boolean z) {
        objArr[2] = Boolean.valueOf(z);
    }

    public static boolean A1a(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).find();
    }

    public static boolean A1b(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }
}
