package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.Property;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: X.4aI  reason: invalid class name and case insensitive filesystem */
public abstract class C90524aI {
    public static float A00(float f, float f2, float f3) {
        return Math.min(f3, f / f2);
    }

    public static C137856gq A0D(C1506776e r1, C137856gq r2) {
        if (r2 == null) {
            return r2;
        }
        r1.A0D(r2);
        return null;
    }

    public static Double A0Z(long j) {
        return Double.valueOf((double) j);
    }

    public static float[] A0v() {
        return new float[2];
    }

    public static Object[] A0w() {
        return new Object[0];
    }

    public static float A02(float[] fArr, float f, float f2, int i) {
        return f2 + (fArr[i] * f);
    }

    public static int A05(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static int A06(Integer[] numArr, int i) {
        return numArr[i].intValue();
    }

    public static long A07(Object obj) {
        return ((Long) obj).longValue();
    }

    public static ObjectAnimator A08(Property property, Object obj, float[] fArr, float f, int i) {
        fArr[i] = f;
        return ObjectAnimator.ofFloat(obj, property, fArr);
    }

    public static Bitmap A09(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Canvas A0A(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    public static Matrix A0B() {
        return new Matrix();
    }

    public static VersionedCapability A0E(C107965Ro r4, XplatAssetType xplatAssetType, String str, int i, int i2) {
        return new VersionedCapability(str, i, r4, i2, xplatAssetType);
    }

    public static LatLng A0F(double d, double d2) {
        return new LatLng(d, d2);
    }

    public static C21072A7j A0G(C170918Hz r1) {
        return new C21072A7j(r1);
    }

    public static C25721Hk A0I() {
        return new C25721Hk();
    }

    public static C47862ft A0O(Object[] objArr, int i) {
        return new C47862ft(objArr, i);
    }

    public static ByteArrayInputStream A0P(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static ByteArrayOutputStream A0Q() {
        return new ByteArrayOutputStream();
    }

    public static File A0R(C19630wG r0) {
        return r0.A00.getCacheDir();
    }

    public static File A0S(String str) {
        return new File(str);
    }

    public static File A0T(String str, String str2) {
        return new File(str, str2);
    }

    public static FileInputStream A0U(File file) {
        return new FileInputStream(file);
    }

    public static FileNotFoundException A0V(String str) {
        return new FileNotFoundException(str);
    }

    public static FileOutputStream A0W(File file) {
        return new FileOutputStream(file);
    }

    public static IOException A0X(String str) {
        return new IOException(str);
    }

    public static AssertionError A0Y(Object obj) {
        return new AssertionError(obj);
    }

    public static Integer A0a(int i) {
        return new Integer(i);
    }

    public static Object A0d(Object[] objArr, int i) {
        Object obj = objArr[i];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    public static RuntimeException A0e(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static String A0f(C225314u r0) {
        return r0.A09.A0c();
    }

    public static StringBuilder A0h(int i) {
        return new StringBuilder(i);
    }

    public static StringBuilder A0i(String str) {
        return new StringBuilder(str);
    }

    public static URL A0j(String str) {
        return new URL(str);
    }

    public static HashSet A0k(Collection collection) {
        return new HashSet(collection);
    }

    public static LinkedList A0l() {
        return new LinkedList();
    }

    public static List A0p(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return Arrays.asList(objArr);
    }

    public static ConcurrentHashMap A0s() {
        return new ConcurrentHashMap();
    }

    public static AnonymousClass03N A0t(Throwable th) {
        return new AnonymousClass03N(th);
    }

    public static JSONArray A0u() {
        return new JSONArray();
    }

    public static Object[] A0x(Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return Arrays.copyOf(objArr, i2);
    }

    public static float A01(Context context, float f) {
        return (float) C65103Qt.A01(context, f);
    }

    public static int A03(Enum enumR, int[] iArr) {
        return iArr[enumR.ordinal()];
    }

    public static int A04(List list, int i) {
        return i + list.size();
    }

    public static Handler A0C(AnonymousClass00T r0) {
        return (Handler) r0.getValue();
    }

    public static C170918Hz A0H(AnonymousClass8NN r0) {
        r0.A0S();
        return r0.A00;
    }

    public static AnonymousClass6EE A0J(Iterator it) {
        return (AnonymousClass6EE) it.next();
    }

    public static C161057m5 A0K(Iterator it) {
        return (C161057m5) it.next();
    }

    public static CallRatingViewModel A0L(AnonymousClass00T r0) {
        return (CallRatingViewModel) r0.getValue();
    }

    public static AnonymousClass1UA A0M(AnonymousClass005 r0) {
        return (AnonymousClass1UA) r0.get();
    }

    public static C129196Ft A0N(Iterator it) {
        return (C129196Ft) it.next();
    }

    public static Number A0b(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static Object A0c(C001600r r0) {
        Object A04 = r0.A04();
        C18740tg.A06(A04);
        return A04;
    }

    public static String A0g(String str, String str2, StringBuilder sb) {
        sb.append(str);
        return AnonymousClass3LV.A01(str2);
    }

    public static List A0m(Object obj, String str) {
        AnonymousClass00C.A0E(obj, str);
        return (List) obj;
    }

    public static List A0n(Object obj, AbstractMap abstractMap) {
        return (List) abstractMap.get(obj);
    }

    public static List A0o(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static List A0q(AnonymousClass00T r0) {
        return (List) r0.getValue();
    }

    public static Set A0r(Object obj, Map map) {
        return (Set) map.get(obj);
    }
}
