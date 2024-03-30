package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.util.JsonReader;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.wabloks.base.BkFragment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.4aD  reason: invalid class name and case insensitive filesystem */
public abstract class C90474aD {
    public static long A0A(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public static AnonymousClass8I5 A0O(AnonymousClass8NN r2, byte[] bArr) {
        AnonymousClass8I5 A01 = C21674AUx.A01(bArr, 0, bArr.length);
        r2.A0S();
        return A01;
    }

    public static String A0i(List list) {
        return (String) list.get(1);
    }

    public static String A0j(List list) {
        return (String) list.get(2);
    }

    public static void A0w(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
    }

    public static void A0z(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static void A12(AnonymousClass6YM r7, CallInfo callInfo) {
        UserJid peerJid = callInfo.getPeerJid();
        C18740tg.A06(peerJid);
        boolean z = callInfo.videoEnabled;
        AnonymousClass6YM r0 = r7;
        r0.A0X(callInfo.groupJid, peerJid, callInfo.callId, false, z, callInfo.isGroupCall);
    }

    public static void A1R(int[] iArr, int i, int i2, int i3) {
        iArr[1] = i;
        iArr[2] = i2;
        iArr[3] = i3;
    }

    public static boolean A1T(int i, int i2) {
        return i > i2;
    }

    public static Object[] A1a(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        return objArr;
    }

    public static String[] A1b(Object obj) {
        return new String[]{obj};
    }

    public static double A00(AtomicLong atomicLong, AtomicLong atomicLong2) {
        return (((double) atomicLong.get()) * 100.0d) / ((double) atomicLong2.get());
    }

    public static int A08(AnonymousClass011 r0) {
        return ((Number) r0.second).intValue();
    }

    public static long A09(int i) {
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public static long A0B(int i, long j) {
        if (i != 0) {
            return AnonymousClass5WS.A00(C133206Xf.A00(j) * -1.0f, C133206Xf.A01(j) * -1.0f);
        }
        return j;
    }

    public static long A0C(long j, long j2) {
        return (j2 & 4294967295L) | (j << 32);
    }

    public static long A0E(VideoComposerFragment videoComposerFragment) {
        C1273567y r0 = videoComposerFragment.A0K;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public static SharedPreferences.Editor A0G(VoiceServiceEventCallback voiceServiceEventCallback) {
        return C27631Pa.A00(voiceServiceEventCallback.voiceService.A2D).edit();
    }

    public static Location A0J(LatLng latLng, String str) {
        Location location = new Location(str);
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        return location;
    }

    public static JsonReader A0K(InputStream inputStream) {
        return new JsonReader(new InputStreamReader(inputStream));
    }

    public static C161337ma A0L(Object obj, Object obj2) {
        C161337ma r0 = (C161337ma) obj;
        ((Number) obj2).intValue();
        return r0;
    }

    public static AnonymousClass3FM A0T(Context context) {
        AnonymousClass3FM r1 = new AnonymousClass3FM(context);
        r1.A01 = R.drawable.permission_location;
        r1.A0C = AnonymousClass1P6.A09;
        r1.A0B = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
        r1.A03 = R.string.f12nameremoved;
        return r1;
    }

    public static BufferedInputStream A0U(File file) {
        return new BufferedInputStream(new FileInputStream(file));
    }

    public static Class A0W(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static Long A0Y() {
        return 1L;
    }

    public static String A0d(String str, JSONArray jSONArray, int i) {
        return ((JSONObject) jSONArray.get(i)).optString(str, "");
    }

    public static String A0f(StringBuilder sb) {
        sb.append(")");
        return sb.toString();
    }

    public static String A0g(StringBuilder sb) {
        sb.append("]");
        return sb.toString();
    }

    public static String A0k(Map map) {
        String obj = new JSONObject(map).toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static Iterator A0r(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static void A0u() {
        LinkedList linkedList = new LinkedList();
        List A0Z = C007103b.A0Z(new C15020mZ(0, 20));
        Collections.shuffle(A0Z);
        linkedList.addAll(A0Z);
        AnonymousClass798.A00 = linkedList;
    }

    public static void A13(AnonymousClass19A r7, C236119d r8, C203399nx r9, String str) {
        r7.A0K(r8, r9, str, 264, 32000);
    }

    public static void A18(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 9);
        AnonymousClass00C.A0D(obj2, 11);
    }

    public static void A19(Object obj, Object obj2) {
        C161337ma r2 = (C161337ma) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && r2.BHg()) {
            r2.BuE();
        }
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[29] = obj;
        objArr[30] = obj2;
        objArr[31] = obj3;
        objArr[32] = obj4;
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[33] = obj;
        objArr[34] = obj2;
        objArr[35] = obj3;
        objArr[36] = obj4;
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[37] = obj;
        objArr[38] = obj2;
        objArr[39] = obj3;
        objArr[40] = obj4;
    }

    public static void A1F(Object obj, Object obj2, Object[] objArr) {
        objArr[2] = new AnonymousClass011(obj, obj2);
    }

    public static void A1G(Object obj, Object obj2, Object[] objArr) {
        objArr[3] = new AnonymousClass011(obj, obj2);
    }

    public static void A1P(AbstractCollection abstractCollection, int[][] iArr, int i) {
        abstractCollection.add(new AnonymousClass1XQ(iArr[i]));
    }

    public static void A1Q(Calendar calendar, int i) {
        calendar.set(14, i);
        calendar.set(13, i);
        calendar.set(12, i);
    }

    public static boolean A1W(Map map, Object obj) {
        Object obj2 = map.get(obj);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj2).booleanValue();
    }

    public static Object[] A1Z(int i) {
        Object[] objArr = new Object[i];
        objArr[0] = "bitField0_";
        return objArr;
    }

    public static float A01(Object obj, AnonymousClass00T r2) {
        Number number = (Number) ((AbstractMap) r2.getValue()).get(obj);
        if (number == null) {
            return 0.0f;
        }
        return number.floatValue();
    }

    public static int A02(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A04(C161337ma r0, Object obj) {
        if (r0.B2f(obj)) {
            return 256;
        }
        return 128;
    }

    public static int A05(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A06(Object obj, Map map) {
        return ((Number) map.get(obj)).intValue();
    }

    public static int A07(AbstractList abstractList, int i) {
        return ((Integer) abstractList.get(i)).intValue();
    }

    public static long A0D(C161547n5 r1) {
        return ((C133336Xx) r1.getValue()).A00;
    }

    public static SharedPreferences.Editor A0F(C27631Pa r0) {
        return C27631Pa.A00(r0).edit();
    }

    public static SharedPreferences.Editor A0H(C194599Qj r0) {
        return r0.A00().edit();
    }

    public static Rect A0I(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static C160287kl A0M(C161717nM r1, C006302t r2, int i, int i2) {
        return r1.BO0(C000400e.A0D(), r2, i, i2);
    }

    public static LatLng A0N(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static WaImageView A0P(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return (WaImageView) A02;
    }

    public static AnonymousClass1Z0 A0Q(AccountSwitchingContentProvider accountSwitchingContentProvider) {
        return (AnonymousClass1Z0) accountSwitchingContentProvider.A0A().get();
    }

    public static C64953Qc A0R(C18830tt r0) {
        return (C64953Qc) r0.A6G.get();
    }

    public static PromptDialogFragment A0S(Context context, AnonymousClass3L4 r3, int i) {
        r3.A00.putString("negative_button", context.getString(i));
        return r3.A00();
    }

    public static CharSequence A0V(View view, C61243Bc r1) {
        return r1.A00(view.getContext());
    }

    public static Integer A0X(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 22;
    }

    public static Long A0Z(SharedPreferences sharedPreferences, String str, long j) {
        return Long.valueOf(sharedPreferences.getLong(str, j));
    }

    public static Object A0a(C161337ma r1, int i) {
        r1.Bum(i);
        r1.Bum(-492369756);
        return r1.BnZ();
    }

    public static String A0b(Uri.Builder builder) {
        return builder.build().toString();
    }

    public static String A0c(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public static String A0e(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        AnonymousClass00C.A08(string);
        return string;
    }

    public static String A0h(HttpURLConnection httpURLConnection) {
        return AnonymousClass14X.A00(httpURLConnection.getErrorStream());
    }

    public static ByteBuffer A0l(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static FloatBuffer A0m(float[] fArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static ArrayList A0n(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static Iterator A0o(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator A0p(C19580wB r0) {
        Iterable observers = r0.getObservers();
        AnonymousClass00C.A08(observers);
        return observers.iterator();
    }

    public static Iterator A0q(AnonymousClass005 r0) {
        return ((Set) r0.get()).iterator();
    }

    public static LinkedHashMap A0s(AbstractMap abstractMap) {
        return new LinkedHashMap(C000300d.A02(abstractMap.size()));
    }

    public static JSONObject A0t(String str, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new JSONObject();
        }
        return optJSONObject;
    }

    public static void A0v(Canvas canvas, RectF rectF, float f) {
        canvas.rotate(f, rectF.centerX(), rectF.centerY());
    }

    public static void A0x(Handler handler, VoiceServiceEventCallback voiceServiceEventCallback, int i) {
        handler.removeMessages(i);
        voiceServiceEventCallback.voiceService.A0c.sendEmptyMessage(i);
    }

    public static void A0y(View view) {
        view.setBackgroundResource(C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public static void A10(ImageView imageView, int i, boolean z) {
        imageView.setImageResource(i);
        AnonymousClass06T.A00(AnonymousClass00F.A04(imageView.getContext(), R.color.f6nameremoved), imageView);
        imageView.setSelected(z);
    }

    public static void A11(C161547n5 r1, boolean z) {
        r1.setValue(Boolean.valueOf(z));
    }

    public static void A14(BkFragment bkFragment, C134906bn r3, Serializable serializable, String str) {
        BkFragment.A05(bkFragment);
        bkFragment.A0b().putSerializable("screen_params", str);
        BkFragment.A05(bkFragment);
        bkFragment.A0b().putParcelable("screen_cache_config", r3);
        BkFragment.A05(bkFragment);
        bkFragment.A0b().putSerializable("qpl_params", serializable);
    }

    public static void A15(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void A16(File file, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(file.getName());
    }

    public static void A17(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A1A(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0B(obj);
        AnonymousClass00C.A0B(obj2);
        AnonymousClass00C.A0B(obj3);
    }

    public static void A1E(Object obj, Object obj2, AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(obj, obj2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("compact_marker_count", Integer.valueOf(i));
        linkedHashMap.put("regular_marker_count", Integer.valueOf(i2));
        abstractMap.put("biz_in_viewport", linkedHashMap);
    }

    public static void A1H(Object obj, AbstractCollection abstractCollection) {
        if (!abstractCollection.contains(obj)) {
            abstractCollection.add(obj);
        }
    }

    public static void A1I(String str, OutputStream outputStream) {
        outputStream.write(str.getBytes());
    }

    public static void A1J(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(C34191gb.A07(str2));
    }

    public static void A1K(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
    }

    public static void A1L(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", ");
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((Object) null);
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A1O(StringBuilder sb, byte[] bArr) {
        sb.append(Arrays.toString(bArr));
    }

    public static void A1S(Object[] objArr, long j) {
        objArr[0] = Long.valueOf(j);
    }

    public static boolean A1U(C161547n5 r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static boolean A1V(Object obj, XmlPullParser xmlPullParser) {
        return xmlPullParser.getName().equals(obj);
    }

    public static boolean A1X(AnonymousClass004 r0) {
        return ((Boolean) r0.get()).booleanValue();
    }

    public static boolean A1Y(AnonymousClass00T r0) {
        return ((File) r0.getValue()).exists();
    }

    public static int A03(long j) {
        return (int) (j & 4294967295L);
    }
}
