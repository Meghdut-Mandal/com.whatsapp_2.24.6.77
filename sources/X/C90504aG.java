package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.jid.Jid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.security.MessageDigest;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;

/* renamed from: X.4aG  reason: invalid class name and case insensitive filesystem */
public abstract class C90504aG {
    public static double A00(double d, double d2) {
        return Math.abs(d - d2);
    }

    public static float A02(float f, float f2, float f3, float f4, float f5) {
        return (f3 - (f * f2)) + (f4 * f5);
    }

    public static int A05(float f) {
        return C14960mT.A01((float) Math.ceil((double) f));
    }

    public static int A06(float f, int i, int i2) {
        return i2 + Math.round(f * ((float) (i - i2)));
    }

    public static int A07(int i) {
        if (i == 1) {
            return 270;
        }
        if (i != 3) {
            return i * 90;
        }
        return 90;
    }

    public static int A0D(byte[] bArr, int[] iArr, int i) {
        return (iArr[bArr[i] & 255] << 18) | (iArr[bArr[i + 1] & 255] << 12) | (iArr[bArr[i + 2] & 255] << 6) | iArr[bArr[i + 3] & 255];
    }

    public static long A0E(int i) {
        return ((long) i) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static C158227ga A0P(AvatarStickersCategoriesView avatarStickersCategoriesView) {
        AnonymousClass00C.A0D(avatarStickersCategoriesView, 0);
        return avatarStickersCategoriesView.A00;
    }

    public static C64933Qa A0T(AnonymousClass11F r2, String str) {
        return new C64933Qa(r2, str, false);
    }

    public static Long A0h(long j, long j2) {
        return Long.valueOf(j - j2);
    }

    public static Object A0j(Object obj, Object obj2, C009003v r3) {
        AnonymousClass00C.A0D(r3, 2);
        return r3.invoke(obj, obj2);
    }

    public static ArrayList A0u(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        return new ArrayList(collection);
    }

    public static Set A0w(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        return AnonymousClass02R.A0E(objArr);
    }

    public static short A0y(Object obj, String str) {
        return !str.equals(obj) ? (short) -1 : 0;
    }

    public static void A1I(Object obj, Object obj2, Executor executor, int i) {
        executor.execute(new C81333wq(obj, i, 4, obj2));
    }

    public static void A1P(Key key, Cipher cipher, byte[] bArr) {
        cipher.init(2, key, new GCMParameterSpec(128, bArr));
    }

    public static boolean A1T(int i) {
        return i != 0;
    }

    public static boolean A1U(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1Z(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    public static String[] A1b(Jid jid) {
        return new String[]{jid.getRawString()};
    }

    public static double A01(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static float A04(RectF rectF, JSONObject jSONObject) {
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        rectF.top = ((float) jSONObject.getInt("t")) / 100.0f;
        rectF.right = ((float) jSONObject.getInt("r")) / 100.0f;
        rectF.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        return 100.0f;
    }

    public static int A08(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static long A0F(C121455tA r0, int i, long j) {
        if (i == 0) {
            return -1;
        }
        return j - r0.A01;
    }

    public static Intent A0G(Context context, AnonymousClass141 r2) {
        return new AnonymousClass190().A1W(context, r2);
    }

    public static AnonymousClass16L A0L(C18800tq r0) {
        return (AnonymousClass16L) r0.A0q.get();
    }

    public static C19420v0 A0O(RegistrationIntentService registrationIntentService) {
        return (C19420v0) registrationIntentService.A0B.get();
    }

    public static C1034355i A0Q(Iterator it) {
        C1256760v r0 = (C1256760v) it.next();
        AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type com.whatsapp.expressionstray.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
        return (C1034355i) r0;
    }

    public static C20020wt A0X(C18800tq r0) {
        return (C20020wt) r0.A8i.get();
    }

    public static BufferedOutputStream A0Y(File file) {
        return new BufferedOutputStream(new FileOutputStream(file));
    }

    public static BufferedReader A0Z(File file) {
        return new BufferedReader(new FileReader(file));
    }

    public static Object A0i(AnonymousClass187 r0, Callable callable) {
        return r0.A00.submit(callable).get();
    }

    public static String A0n(Map map) {
        return new JSONObject(map).toString();
    }

    public static String A0o(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static StringBuilder A0p() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error(error=");
        return sb;
    }

    public static StringBuilder A0q(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb;
    }

    public static URLConnection A0r(String str) {
        return new URL(str).openConnection();
    }

    public static MessageDigest A0s() {
        return MessageDigest.getInstance("SHA-256");
    }

    public static List A0v(CharSequence charSequence, String str, int i) {
        return new C10880fN(str).A01(charSequence, i);
    }

    public static JSONObject A0x(byte[] bArr) {
        return new JSONObject(new String(bArr, DefaultCrypto.UTF_8));
    }

    public static void A14(Rect rect, View view) {
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void A17(C1501574e r2, AnonymousClass6YM r3) {
        if (r3.A2t.A0E(2903)) {
            r3.A1E.execute(r2);
        } else {
            r2.run();
        }
    }

    public static void A19(C225314u r4) {
        AnonymousClass3FM r2 = new AnonymousClass3FM(r4);
        r2.A01 = R.drawable.permission_contacts_small;
        r2.A0C = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        r2.A02 = R.string.f12nameremoved;
        r2.A03 = R.string.f12nameremoved;
        r4.BuO(r2.A02(), 150);
    }

    public static void A1A(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AbstractCollection abstractCollection) {
        C134986bw r0 = businessDirectoryContextualSearchViewModel.A02;
        if (r0 != null) {
            abstractCollection.add(new AnonymousClass5EG(new C116815lF(businessDirectoryContextualSearchViewModel), r0.A01));
        }
    }

    public static void A1E(Jid jid, String str, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL(jid, str);
    }

    public static void A1L(String str, byte[] bArr, int i) {
        int i2 = i * 2;
        bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
    }

    public static void A1M(StringBuilder sb) {
        sb.append(", ");
    }

    public static void A1R(float[] fArr, float f, int i) {
        fArr[i] = fArr[i] * f;
    }

    public static boolean A1X(Object obj, Object obj2) {
        return AnonymousClass00C.A0J(((C206569tc) obj).A01.A00, obj2);
    }

    public static float A03(long j, long j2) {
        return C133206Xf.A01(j) + AnonymousClass6X0.A00(j2);
    }

    public static int A09(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        return iArr[0];
    }

    public static int A0A(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static int A0B(String str, int i) {
        return i + str.hashCode();
    }

    public static int A0C(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static SharedPreferences.Editor A0H(C18910u1 r0) {
        return ((SharedPreferences) r0.get()).edit();
    }

    public static Uri.Builder A0I(String str) {
        return Uri.parse(str).buildUpon();
    }

    public static RecyclerView A0J(View view, int i) {
        return (RecyclerView) C012005e.A02(view, i);
    }

    public static C140456lc A0K(List list, int i) {
        return (C140456lc) list.get(i);
    }

    public static C27761Ps A0M(C18800tq r0) {
        return (C27761Ps) r0.A2D.get();
    }

    public static C33751fs A0N(C18830tt r0) {
        return (C33751fs) r0.A17.get();
    }

    public static AnonymousClass1EV A0R(C18800tq r0) {
        return (AnonymousClass1EV) r0.A6K.get();
    }

    public static C100084uR A0S(AnonymousClass8NN r0) {
        r0.A0S();
        return (C100084uR) r0.A00;
    }

    public static C135066c4 A0U(Iterator it) {
        return (C135066c4) it.next();
    }

    public static AnonymousClass1N6 A0V(C18800tq r0) {
        return (AnonymousClass1N6) r0.A5V.get();
    }

    public static AnonymousClass1N2 A0W(C18800tq r0) {
        return (AnonymousClass1N2) r0.A43.get();
    }

    public static File A0a(Iterator it) {
        return (File) it.next();
    }

    public static Double A0b(String str, JSONObject jSONObject) {
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static Integer A0c(Resources resources, int i) {
        return Integer.valueOf((int) resources.getDimension(i));
    }

    public static Integer A0d(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 28;
    }

    public static Integer A0e(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 30;
    }

    public static Integer A0f(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 31;
    }

    public static Integer A0g(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 32;
    }

    public static String A0k(C160607lH r1) {
        if (r1.BlP().BMV()) {
            return null;
        }
        return r1.BlP().BvC();
    }

    public static String A0l(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static String A0m(String str, Object[] objArr) {
        String format = String.format(str, objArr);
        AnonymousClass00C.A08(format);
        return format;
    }

    public static ArrayList A0t(C001600r r1) {
        return new ArrayList((Collection) r1.A04());
    }

    public static void A0z(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
    }

    public static void A10(int i, List list) {
        list.add(Integer.valueOf(i));
    }

    public static void A11(Context context, ImageView imageView, int i) {
        AnonymousClass3UF.A0E(imageView, AnonymousClass00F.A00(context, i));
    }

    public static void A12(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A13(Canvas canvas, Path path, AnonymousClass00T r3) {
        canvas.drawPath(path, (Paint) r3.getValue());
    }

    public static void A15(View view, CharSequence charSequence) {
        if (view.getContentDescription() != charSequence) {
            view.setContentDescription(charSequence);
        }
    }

    public static void A16(TextView textView, C18820ts r2, long j) {
        textView.setText(AnonymousClass3UY.A07(r2, j));
    }

    public static void A18(C18830tt r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        wDSBottomSheetDialogFragment.A00 = C18830tt.A85(r0);
    }

    public static void A1B(AnonymousClass6WU r2, Set set) {
        r2.A05(!set.isEmpty(), set.size());
    }

    public static void A1C(C19420v0 r2, AbstractMap abstractMap) {
        abstractMap.put("backupFrequency", Integer.valueOf(r2.A0C()));
        abstractMap.put("backupNetworkSettings", Integer.valueOf(r2.A0D()));
        abstractMap.put("includeVideosInBackup", Boolean.valueOf(r2.A2E()));
    }

    public static void A1D(AnonymousClass1KS r1, int i) {
        r1.A07(Integer.valueOf(i));
    }

    public static void A1F(CallInfo callInfo, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(callInfo.getInitialPeerJid());
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; callId=");
        sb.append(callInfo.callId);
        sb.append("; transactionId=");
        sb.append(callInfo.initialGroupTransactionId);
    }

    public static void A1G(Object obj) {
        Log.e(obj.toString());
    }

    public static void A1H(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1J(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj.toString());
    }

    public static void A1K(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A1N(StringBuilder sb, Map map) {
        sb.append(map.size());
    }

    public static void A1O(StringBuilder sb, Map map, int i) {
        if (i < map.size() - 1) {
            sb.append(",");
        }
    }

    public static void A1Q(byte[] bArr) {
        AnonymousClass136.A00().nextBytes(bArr);
    }

    public static void A1S(int[] iArr) {
        iArr[0] = R.string.f12nameremoved;
        iArr[1] = R.string.f12nameremoved;
        iArr[2] = R.string.f12nameremoved;
        iArr[3] = R.string.f12nameremoved;
        iArr[4] = R.string.f12nameremoved;
    }

    public static boolean A1V(C21060yb r1) {
        AccessibilityManager A0M = r1.A0M();
        if (A0M == null || !A0M.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public static boolean A1W(ExpressionsBottomSheetView expressionsBottomSheetView) {
        return expressionsBottomSheetView.getAbProps().A0E(5627);
    }

    public static boolean A1Y(Throwable th) {
        return th.getMessage().contains("No space");
    }

    public static byte[] A1a(byte[] bArr, String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }
}
