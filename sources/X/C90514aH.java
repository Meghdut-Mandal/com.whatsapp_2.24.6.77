package X;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.CamcorderProfile;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.CaptioningManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import java.io.File;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* renamed from: X.4aH  reason: invalid class name and case insensitive filesystem */
public abstract class C90514aH {
    public static float A00(float f, float f2, float f3, float f4) {
        return (f * f2) + (f3 * f4);
    }

    public static float A01(float f, float f2, float f3, float f4) {
        return (f * f2) - (f3 * f4);
    }

    public static int A04(float f) {
        return (int) ((float) Math.ceil((double) f));
    }

    public static int A06(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A09(int i) {
        return C023109s.A00(3).length + (i * C023109s.A00(4).length);
    }

    public static int A0A(int i) {
        return i != 0 ? 0 : 4;
    }

    public static RectF A0L(float f, int i) {
        return new RectF(0.0f, 0.0f, f, (float) i);
    }

    public static View A0Q(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass00C.A0B(inflate);
        return inflate;
    }

    public static C18650tV A0X(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return new C18650tV(obj, 0);
    }

    public static Object A0q(Object obj, C03000Ct r2) {
        AnonymousClass00C.A0D(obj, 0);
        return r2.receiver;
    }

    public static Object A0r(List list) {
        return list.get(1);
    }

    public static String A0t(Context context, AnonymousClass16D r3, AnonymousClass171 r4, List list) {
        C61243Bc A04 = AnonymousClass3UD.A04(r3, r4, list, 3, false);
        if (A04 == null) {
            return null;
        }
        return A04.A00(context).toString();
    }

    public static String A0z(String str, int i) {
        return str.substring(0, i);
    }

    public static AtomicInteger A17() {
        return new AtomicInteger(1);
    }

    public static AtomicReference A18() {
        return new AtomicReference((Object) null);
    }

    public static short A1B(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 1;
    }

    public static short A1C(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 2;
    }

    public static void A1O(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = obj;
        objArr[3] = obj2;
    }

    public static boolean A1V(int i) {
        return i == 1;
    }

    public static boolean A1Y(Object obj) {
        AnonymousClass00C.A0D(obj, 2);
        return false;
    }

    public static float A02(float f, float f2, int i) {
        if (i != 0) {
            return (f * f2) / 100.0f;
        }
        return f;
    }

    public static float A03(int i) {
        return i != 0 ? 0.0f : 1.0f;
    }

    public static int A07(int i) {
        return i != 0 ? 1048576 : 524288;
    }

    public static int A08(int i) {
        if (i != 0) {
            return C132986Wc.A0F;
        }
        return 65536;
    }

    public static int A0D(long j) {
        return (int) (j >>> 32);
    }

    public static int A0G(C225314u r1) {
        C19420v0 r12 = r1.A09;
        Executor executor = AnonymousClass6Y6.A00;
        return r12.A0F();
    }

    public static int A0H(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static C199989gN A0W(CamcorderProfile camcorderProfile, C195099Sm r3) {
        r3.A00(C199989gN.A0J, Integer.valueOf(camcorderProfile.audioCodec));
        r3.A00(C199989gN.A0R, Integer.valueOf(camcorderProfile.videoCodec));
        r3.A00(C199989gN.A0O, Long.valueOf(SystemClock.elapsedRealtime()));
        return new C199989gN(r3);
    }

    public static AnonymousClass19J A0Z(C18800tq r0) {
        return (AnonymousClass19J) r0.A9p.get();
    }

    public static ExpressionsSearchViewModel A0b(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        return (ExpressionsSearchViewModel) expressionsKeyboardSearchBottomSheet.A0S.getValue();
    }

    public static EmojiExpressionsViewModel A0c(EmojiExpressionsFragment emojiExpressionsFragment) {
        return (EmojiExpressionsViewModel) emojiExpressionsFragment.A0J.getValue();
    }

    public static AnonymousClass5V6 A0d(Object obj) {
        AnonymousClass5V6 r1 = (AnonymousClass5V6) obj;
        AnonymousClass00C.A0D(r1, 0);
        return r1;
    }

    public static C203399nx A0e(C203399nx r1, C592133b r2) {
        C203399nx.A0A(r1, "iq");
        return r2.A00;
    }

    public static AnonymousClass68B A0f(StickerStoreTabFragment stickerStoreTabFragment, int i) {
        return (AnonymousClass68B) stickerStoreTabFragment.A0I.get(i);
    }

    public static AnonymousClass005 A0i(C18800tq r0) {
        return C18840tu.A00(r0.A96);
    }

    public static File A0j(C19630wG r0) {
        return r0.A00.getFilesDir();
    }

    public static Integer A0k() {
        return 27;
    }

    public static RuntimeException A0s(String str) {
        return new RuntimeException(str);
    }

    public static String A0y(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static Iterator A13(Object obj) {
        return ((List) obj).iterator();
    }

    public static Cipher A19() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    public static void A1F(Bitmap bitmap, OutputStream outputStream) {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    }

    public static void A1H(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A1J(View view, int i, int i2) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static void A1K(Animation animation) {
        animation.setInterpolator(new LinearInterpolator());
    }

    public static void A1L(AnonymousClass2RY r1, Integer num, int i) {
        r1.A00 = num;
        r1.A01 = Integer.valueOf(i);
    }

    public static void A1N(Object obj) {
        ((View) obj).setVisibility(8);
    }

    public static void A1P(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, new ArrayList());
    }

    public static boolean A1X(CallInfo callInfo, String str) {
        return str.equals(callInfo.callWaitingInfo.A04);
    }

    public static boolean A1Z(String str) {
        return str.endsWith("%");
    }

    public static int A05(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A0B(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    public static int A0C(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A0E(C161337ma r0, int i) {
        if (r0.B2d(i)) {
            return 16384;
        }
        return DefaultCrypto.BUFFER_SIZE;
    }

    public static int A0F(C161337ma r0, int i) {
        if (r0.B2d(i)) {
            return 8388608;
        }
        return 4194304;
    }

    public static int A0I(List list, int i) {
        return AnonymousClass03T.A01(Integer.valueOf(i), list, list.size());
    }

    public static long A0J(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static long A0K(AnonymousClass1CP r2, AnonymousClass5U6 r3) {
        File file;
        File A0E = r2.A0E(r3);
        AnonymousClass00C.A0D(A0E, 0);
        ArrayList A0K = r2.A0K(A0E);
        if (!(!A0K.isEmpty()) || (file = (File) C007103b.A0N(A0K)) == null) {
            return 0;
        }
        return file.length();
    }

    public static Handler A0M(HandlerThread handlerThread) {
        return new Handler(handlerThread.getLooper());
    }

    public static Handler A0N(VoiceServiceEventCallback voiceServiceEventCallback, String str) {
        Log.i(str);
        return voiceServiceEventCallback.voiceService.A0c;
    }

    public static KeyPairGeneratorSpec.Builder A0O(KeyPairGeneratorSpec.Builder builder, BigInteger bigInteger, Calendar calendar, Calendar calendar2) {
        return builder.setSerialNumber(bigInteger).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime());
    }

    public static Pair A0P(Object obj, int i) {
        return Pair.create(obj, Integer.valueOf(i));
    }

    public static ViewPropertyAnimator A0R(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f);
    }

    public static CaptioningManager A0S(View view) {
        return (CaptioningManager) view.getContext().getSystemService("captioning");
    }

    public static ImageButton A0T(View view, int i) {
        return (ImageButton) C012005e.A02(view, i);
    }

    public static LinearLayout A0U(View view, int i) {
        return (LinearLayout) C012005e.A02(view, i);
    }

    public static AnonymousClass6VR A0V(C18910u1 r0) {
        return (AnonymousClass6VR) r0.get();
    }

    public static C140456lc A0Y(Iterator it) {
        return (C140456lc) it.next();
    }

    public static C132306Ta A0a(C001600r r0) {
        Object A04 = r0.A04();
        AnonymousClass00C.A0B(A04);
        return (C132306Ta) A04;
    }

    public static AnonymousClass68B A0g(Iterator it) {
        return (AnonymousClass68B) it.next();
    }

    public static C148316yf A0h(AnonymousClass005 r0) {
        return (C148316yf) r0.get();
    }

    public static Integer A0l(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, obj2);
        return Integer.valueOf(i);
    }

    public static Long A0m(Number number) {
        return Long.valueOf(number.longValue());
    }

    public static Object A0n(Object obj, String str, Map map) {
        Object obj2 = map.get(obj);
        AnonymousClass00C.A0E(obj2, str);
        return obj2;
    }

    public static Object A0o(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        C18740tg.A06(obj2);
        return obj2;
    }

    public static Object A0p(Object obj, Map map) {
        Object obj2 = map.get(obj);
        C18740tg.A06(obj2);
        return obj2;
    }

    public static String A0u(Parcel parcel) {
        String readString = parcel.readString();
        C18740tg.A06(readString);
        return readString;
    }

    public static String A0v(C19730wQ r0) {
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        AnonymousClass00C.A0B(phoneUserJid);
        return phoneUserJid.getRawString();
    }

    public static String A0w(File file) {
        String absolutePath = file.getAbsolutePath();
        AnonymousClass00C.A08(absolutePath);
        return absolutePath;
    }

    public static String A0x(File file, String str, StringBuilder sb) {
        sb.append(str);
        return file.getAbsolutePath();
    }

    public static String A10(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static Thread A11() {
        return Looper.getMainLooper().getThread();
    }

    public static Iterator A12(Iterable iterable) {
        return C007103b.A0Y(iterable).iterator();
    }

    public static Iterator A14(List list) {
        AnonymousClass00C.A08(list);
        return list.iterator();
    }

    public static Map A15(Object obj, Map map) {
        return (Map) map.get(obj);
    }

    public static Map A16(AnonymousClass00T r0) {
        return (Map) r0.getValue();
    }

    public static C11020fb A1A(int i, int i2) {
        C15020mZ A05 = C15040mb.A05(i, i2);
        int i3 = 2;
        int i4 = A05.A00;
        int i5 = A05.A01;
        if (A05.A02 <= 0) {
            i3 = -2;
        }
        return new C11020fb(i4, i5, i3);
    }

    public static void A1D() {
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static void A1E(Animator.AnimatorListener animatorListener, ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setListener(animatorListener).start();
    }

    public static void A1G(Canvas canvas, Paint paint, Path path, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.drawPath(path, paint);
    }

    public static void A1I(Handler handler, int i) {
        handler.obtainMessage(i).sendToTarget();
    }

    public static void A1M(RandomAccessFile randomAccessFile) {
        randomAccessFile.getFD().sync();
    }

    public static void A1Q(Object obj, Object[] objArr, int i) {
        objArr[i] = obj.toString();
    }

    public static void A1R(String str, StringBuilder sb, int i) {
        sb.append(str.charAt(i));
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(0);
    }

    public static void A1T(StringBuilder sb, Object[] objArr) {
        sb.append(Arrays.toString(objArr));
    }

    public static void A1U(Throwable th, Object[] objArr, int i) {
        objArr[i] = th.getMessage();
    }

    public static boolean A1W(Intent intent, String str) {
        return str.equals(intent.getAction());
    }

    public static boolean A1a(Set set) {
        return !set.isEmpty();
    }

    public static byte[] A1b(String str, JSONObject jSONObject, int i) {
        return Base64.decode(jSONObject.getString(str), i);
    }
}
