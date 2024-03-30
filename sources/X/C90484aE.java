package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.JsonReader;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.security.Key;
import java.security.spec.MGF1ParameterSpec;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4aE  reason: invalid class name and case insensitive filesystem */
public abstract class C90484aE {
    public static double A01(int i, int i2) {
        return Math.sqrt((double) ((((float) (i * i)) / 4.0f) + (((float) (i2 * i2)) / 4.0f)));
    }

    public static int A04(int i) {
        return i != 0 ? 4 : 2;
    }

    public static int A06(int i, int i2) {
        return 8 - ((~(i - i2)) >>> 31);
    }

    public static int A07(int i, int i2, int i3, int i4) {
        int i5 = (i - i2) - 1;
        return (((i3 >> i5) & 1) << 1) + ((i4 >> i5) & 1);
    }

    public static int A09(Resources.Theme theme, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int A0D(Object obj, Object[] objArr) {
        objArr[2] = obj;
        return Arrays.hashCode(objArr);
    }

    public static long A0J(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static Bitmap A0L(Bitmap bitmap, Matrix matrix) {
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static CountDownLatch A0u() {
        return new CountDownLatch(1);
    }

    public static AtomicInteger A0v() {
        return new AtomicInteger(0);
    }

    public static void A1L(C006302t r1, Object obj) {
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj);
    }

    public static void A1O(float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
    }

    public static boolean A1Q(int i) {
        return i <= 0;
    }

    public static boolean A1U(Object obj) {
        AnonymousClass00C.A0D(obj, 2);
        return true;
    }

    public static boolean A1X(String str, int[] iArr, String[] strArr) {
        return MediaCodecVideoEncoder.findHwEncoder(str, strArr, iArr, -1, false) != null;
    }

    public static float A03(float[] fArr, int i) {
        float f = fArr[i];
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        return f;
    }

    public static int A0B(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A0F(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static int A0H(AnonymousClass011 r0) {
        return ((Number) r0.first).intValue();
    }

    public static int A0I(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i + 1;
        bArr2[i] = bArr[(i2 >> 6) & 63];
        int i4 = i3 + 1;
        bArr2[i3] = bArr[i2 & 63];
        return i4;
    }

    public static long A0K(TimeUnit timeUnit) {
        return timeUnit.toMillis(1);
    }

    public static Bundle A0N(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 17);
        bundle.putString("title", context.getString(R.string.f12nameremoved));
        return bundle;
    }

    public static JsonReader A0Q(String str) {
        return new JsonReader(new StringReader(str));
    }

    public static SearchFunStickersViewModel A0X(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        return (SearchFunStickersViewModel) searchFunStickersBottomSheet.A0X.getValue();
    }

    public static AnonymousClass1WF A0Y(C18800tq r0) {
        return (AnonymousClass1WF) r0.A3W.get();
    }

    public static C131376Ou A0a(C18800tq r0) {
        return (C131376Ou) r0.A8d.get();
    }

    public static BufferedReader A0b(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static String A0m(Object obj, Map map) {
        Object obj2 = map.get(obj);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.String");
        return (String) obj2;
    }

    public static StringBuilder A0p() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        return sb;
    }

    public static ArrayList A0r(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static JSONObject A0w() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        return jSONObject;
    }

    public static void A16(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static void A1D(C18800tq r1, C18820ts r2, StickerStoreTabFragment stickerStoreTabFragment) {
        stickerStoreTabFragment.A06 = r2;
        stickerStoreTabFragment.A0D = (AnonymousClass1BB) r1.A85.get();
        stickerStoreTabFragment.A0A = (AnonymousClass1BF) r1.A0Q.get();
        stickerStoreTabFragment.A0E = (AnonymousClass1AP) r1.A89.get();
        stickerStoreTabFragment.A0F = (StickerPackDownloader) r1.A87.get();
        stickerStoreTabFragment.A0C = (AnonymousClass1HA) r1.A84.get();
        stickerStoreTabFragment.A0B = (C24121Be) r1.Ab7.get();
    }

    public static void A1F(QrImageView qrImageView) {
        if (!qrImageView.A05) {
            qrImageView.A05 = true;
            qrImageView.generatedComponent();
        }
        qrImageView.A00 = new Paint();
        qrImageView.A01 = new RectF();
    }

    public static void A1H(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = new AnonymousClass011(obj, obj2);
    }

    public static void A1M(byte[] bArr, int i, int i2) {
        bArr[i + 2] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i] = (byte) (i2 >> 16);
    }

    public static void A1N(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        byte b = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16) | (bArr[i + 2] & 255);
        bArr3[i2] = bArr2[(b >> 18) & 63];
        bArr3[i2 + 1] = bArr2[(b >> 12) & 63];
        bArr3[i2 + 2] = bArr2[(b >> 6) & 63];
        bArr3[i2 + 3] = bArr2[b & 63];
    }

    public static boolean A1P() {
        return AnonymousClass6YR.A01.BMH(6);
    }

    public static boolean A1S(C33101ei r10, C33171eq r11, C133226Xi r12) {
        long j = r11.A06.get();
        long j2 = r11.A07.get();
        long j3 = r11.A05.get();
        return C33101ei.A00(r10, r12, r11.A04.get(), j3, j, j2);
    }

    public static boolean A1T(SearchFunStickersViewModel searchFunStickersViewModel) {
        return AnonymousClass1Ax.A03(searchFunStickersViewModel.A0I, 7190);
    }

    public static boolean A1W(String str) {
        return new File(str).exists();
    }

    public static byte[] A1a(Key key, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(2, key, new IvParameterSpec(bArr));
        return cipher.doFinal(bArr2);
    }

    public static byte[] A1b(Key key, byte[] bArr) {
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
        instance.init(1, key, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        return instance.doFinal(bArr);
    }

    public static char A00(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\'');
        return '\'';
    }

    public static float A02(C161547n5 r0) {
        return ((Number) r0.getValue()).floatValue();
    }

    public static int A05(int i) {
        int A02 = C000300d.A02(i);
        if (A02 < 16) {
            return 16;
        }
        return A02;
    }

    public static int A08(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A0A(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        AnonymousClass00C.A08(nextString);
        return Integer.parseInt(nextString);
    }

    public static int A0C(Object obj, String str) {
        AnonymousClass00C.A0E(obj, str);
        return ((Number) obj).intValue();
    }

    public static int A0E(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        String string = jSONArray.getString(i);
        AnonymousClass00C.A08(string);
        abstractCollection.add(string);
        return i + 1;
    }

    public static int A0G(Map.Entry entry) {
        return ((Number) entry.getValue()).intValue();
    }

    public static Uri A0M(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Handler A0O(DoodleView doodleView) {
        doodleView.A02();
        doodleView.A03 = -65536;
        doodleView.A01 = 8.0f;
        doodleView.A02 = 8.0f;
        return new Handler();
    }

    public static DisplayMetrics A0P() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public static LatLng A0R(LatLng latLng, double d, double d2) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(latLng.A00);
        double radians3 = Math.toRadians(latLng.A01);
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public static LatLng A0S(Number number, double d) {
        return new LatLng(d, number.doubleValue());
    }

    public static C237019m A0T(C18800tq r0) {
        return (C237019m) r0.AOD.get();
    }

    public static C132386Tk A0U(C132386Tk r1, String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C132386Tk(str);
        }
        return r1;
    }

    public static C130766Mi A0V(C18820ts r0, int i) {
        return new C130766Mi(r0.A0A(i));
    }

    public static AnonymousClass1M0 A0W(AnonymousClass005 r0) {
        return ((C229616q) r0.get()).get();
    }

    public static C32681e1 A0Z(C18830tt r0) {
        return (C32681e1) r0.A2Y.get();
    }

    public static File A0c(Uri uri) {
        return new File(uri.getPath());
    }

    public static Integer A0d(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 23;
    }

    public static Integer A0e(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 24;
    }

    public static Integer A0f(Object obj, AbstractMap abstractMap, int i) {
        Integer valueOf = Integer.valueOf(i);
        abstractMap.put(obj, valueOf);
        return valueOf;
    }

    public static Long A0g() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Long A0h(Number number) {
        return Long.valueOf((long) number.intValue());
    }

    public static Long A0i(Number number, long j) {
        return Long.valueOf(j - number.longValue());
    }

    public static Object A0j(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static String A0k(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0l(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return jSONObject.toString();
    }

    public static String A0n(String str, String str2) {
        if (str.length() != 0) {
            return str2.concat(str);
        }
        return new String(str2);
    }

    public static String A0o(String str, StringBuilder sb, float f) {
        sb.append(str);
        sb.append(f);
        return sb.toString();
    }

    public static StringBuilder A0q(String str, StringBuilder sb) {
        sb.append(str);
        return new StringBuilder();
    }

    public static Iterator A0s(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static List A0t(String str) {
        return Arrays.asList(new String[]{str});
    }

    public static JSONObject A0x(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj);
        return new JSONObject();
    }

    public static JSONObject A0y(String str, JSONObject jSONObject) {
        return new JSONObject(jSONObject.getString(str));
    }

    public static void A0z() {
        Thread.currentThread().interrupt();
    }

    public static void A10(Context context, AnonymousClass3L4 r1, int i) {
        r1.A00.putString("title", context.getString(i));
    }

    public static void A11(Context context, AnonymousClass3L4 r1, int i) {
        r1.A00.putString("positive_button", context.getString(i));
    }

    public static void A12(Context context, AnonymousClass3L4 r1, int i) {
        r1.A00.putCharSequence("message", context.getString(i));
    }

    public static void A13(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            context.startActivity(intent);
        } else if (str2 != null && !str2.isEmpty()) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public static void A14(Resources resources, Paint paint, int i) {
        paint.setColor(resources.getColor(i));
    }

    public static void A15(Resources resources, Drawable drawable, int i) {
        drawable.setColorFilter(resources.getColor(i), PorterDuff.Mode.SRC_ATOP);
    }

    public static void A17(View view, int i, int i2) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
    }

    public static void A18(TextView textView, AnonymousClass02E r2, int i) {
        textView.setText(r2.A0a().getResources().getText(i));
    }

    public static void A19(AnonymousClass09Y r1, AnonymousClass02E r2, String str) {
        r1.A0D(r2, str);
        r1.A00(true);
    }

    public static void A1A(AnonymousClass01I r1) {
        DialogFragment dialogFragment = (DialogFragment) r1.getSupportFragmentManager().A0N("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A1c();
        }
    }

    public static void A1B(C001600r r2, boolean z) {
        Object A04 = r2.A04();
        Boolean valueOf = Boolean.valueOf(z);
        if (!C1901797e.A00(A04, valueOf)) {
            r2.A0D(valueOf);
        }
    }

    public static void A1C(C32581dr r1, C18800tq r2, BkScreenFragment bkScreenFragment) {
        bkScreenFragment.A05 = C18840tu.A00(r2.AXc);
        bkScreenFragment.A04 = (C1258461m) r2.Ae8.get();
        bkScreenFragment.A02 = (C130996Nh) r2.AC7.get();
        bkScreenFragment.A03 = r2.A3f();
        C27111My r12 = r1.A1I;
        bkScreenFragment.A00 = (AnonymousClass60P) r12.A3V.get();
        bkScreenFragment.A01 = (AnonymousClass66C) r2.Ae4.get();
        bkScreenFragment.A04 = C27111My.A02(r12);
    }

    public static void A1E(C18830tt r0, WaDialogFragment waDialogFragment) {
        C65133Qw.A02(waDialogFragment, C18830tt.A85(r0));
    }

    public static void A1G(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A1I(Object obj, AbstractMap abstractMap, Map map) {
        abstractMap.put(obj, map.get(obj));
    }

    public static void A1J(StringBuilder sb, long j) {
        sb.append(C133336Xx.A07(j));
    }

    public static void A1K(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(true);
    }

    public static boolean A1R(Activity activity, String str) {
        return str.equals(activity.getIntent().getAction());
    }

    public static boolean A1V(String str) {
        return str.equals(Voip.getCurrentCallId());
    }

    public static boolean A1Y(Map map, int i) {
        return map.containsKey(Integer.valueOf(i));
    }

    public static byte[] A1Z(String str, Random random) {
        byte[] bArr = new byte[Cipher.getInstance(str).getBlockSize()];
        random.nextBytes(bArr);
        return bArr;
    }
}
