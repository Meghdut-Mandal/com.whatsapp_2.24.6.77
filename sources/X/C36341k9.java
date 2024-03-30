package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1k9  reason: invalid class name and case insensitive filesystem */
public abstract class C36341k9 {
    public static int A06(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        return menuItem.getItemId();
    }

    public static Context A0C(C88744Tw r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.getContext();
    }

    public static View A0K(AnonymousClass01L r3, int i) {
        AnonymousClass1RJ r0 = new AnonymousClass1RJ(r3.findViewById(i));
        r0.A03(0);
        return r0.A01();
    }

    public static String A0g(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return parcel.readString();
    }

    public static StringBuilder A0i(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return new StringBuilder();
    }

    public static ArrayList A0l(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return new ArrayList();
    }

    public static void A1F(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 5);
        AnonymousClass00C.A0D(obj2, 6);
    }

    public static void A1I(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1P(AbstractList abstractList, Object[] objArr) {
        objArr[0] = abstractList.get(0);
        objArr[1] = abstractList.get(1);
    }

    public static void A1Q(List list, Object[] objArr) {
        objArr[0] = list.get(0);
        objArr[1] = list.get(1);
    }

    public static boolean A1Z(Object obj) {
        return AnonymousClass00C.A0J(obj, true);
    }

    public static boolean A1a(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, 1);
        return true;
    }

    public static String[] A1b(long j) {
        return new String[]{String.valueOf(j)};
    }

    public static int A01(int i) {
        return i != 0 ? 1231 : 1237;
    }

    public static int A02(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A09(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static long A0B(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, 0);
    }

    public static SharedPreferences A0E(C19420v0 r0) {
        return (SharedPreferences) r0.A00.get();
    }

    public static AnonymousClass16D A0R(C18800tq r0) {
        return (AnonymousClass16D) r0.A2A.get();
    }

    public static AnonymousClass171 A0S(C18800tq r0) {
        return (AnonymousClass171) r0.A90.get();
    }

    public static C18820ts A0T(C18800tq r0) {
        return (C18820ts) r0.A9X.get();
    }

    public static C18820ts A0U(Object obj) {
        return (C18820ts) ((C27861Qc) ((C27851Qb) obj)).A0M.A9X.get();
    }

    public static C20810yC A0V(C18800tq r0) {
        return (C20810yC) r0.A02.get();
    }

    public static C19770wU A0Z(C18800tq r0) {
        return (C19770wU) r0.A9Y.get();
    }

    public static String A0h(StringBuilder sb, AbstractMap abstractMap, AbstractMap abstractMap2) {
        sb.append("/");
        sb.append(Arrays.deepToString(abstractMap.keySet().toArray()));
        sb.append("/");
        return Arrays.deepToString(abstractMap2.keySet().toArray());
    }

    public static StringBuilder A0j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        return sb;
    }

    public static ArrayList A0k(Intent intent) {
        return AnonymousClass143.A06(AnonymousClass11F.class, intent.getStringArrayListExtra("jids"));
    }

    public static List A0m(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        List asList = Arrays.asList(objArr);
        AnonymousClass00C.A08(asList);
        return asList;
    }

    public static void A0y(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A14(C07700Yy r1, CharSequence charSequence) {
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A0C(charSequence);
        r1.A0C(notificationCompat$BigTextStyle);
    }

    public static void A1B(C18800tq r0, WaFragment waFragment) {
        C32191d8.A00(waFragment, C18830tt.A85(r0.A00));
    }

    public static void A1C(AnonymousClass6QB r3) {
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
    }

    public static void A1D(Object obj) {
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0D(obj, 0);
    }

    public static void A1G(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 11);
        AnonymousClass00C.A0D(obj2, 12);
    }

    public static void A1H(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass00I(obj, obj2));
    }

    public static void A1J(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass011(obj, obj2);
    }

    public static void A1L(String str, String str2, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL(str, str2);
    }

    public static void A1S(Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL("xmlns", "w:g2");
    }

    public static void A1V(Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
    }

    public static float A00(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int A03(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        AnonymousClass00C.A0E(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Number) animatedValue).intValue();
    }

    public static int A04(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static int A05(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A07(C001600r r0) {
        return ((Number) r0.A04()).intValue();
    }

    public static int A08(C20800yB r0, int i) {
        String A09 = r0.A09(i);
        AnonymousClass00C.A08(A09);
        return Integer.parseInt(A09);
    }

    public static int A0A(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static Intent A0D(C20380xT r1, String str) {
        Uri A02 = r1.A02(str);
        AnonymousClass00C.A08(A02);
        return new Intent("android.intent.action.VIEW", A02);
    }

    public static Resources A0F(View view) {
        return view.getContext().getResources();
    }

    public static Resources A0G(AnonymousClass02E r0) {
        return r0.A0a().getResources();
    }

    public static Handler A0H() {
        return new Handler(Looper.getMainLooper());
    }

    public static Pair A0I(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static LayoutInflater A0J(View view, int i) {
        AnonymousClass00C.A0D(view, i);
        return LayoutInflater.from(view.getContext());
    }

    public static ImageView A0L(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return (ImageView) A02;
    }

    public static TextView A0M(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return (TextView) A02;
    }

    public static AnonymousClass07B A0N(AnonymousClass01L r1) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0U(true);
        return supportActionBar;
    }

    public static AnonymousClass09Y A0O(AnonymousClass01I r1) {
        return new AnonymousClass09Y(r1.getSupportFragmentManager());
    }

    public static AnonymousClass04J A0P(AnonymousClass00T r0) {
        AnonymousClass04J BJ7 = ((AnonymousClass016) r0.getValue()).BJ7();
        AnonymousClass00C.A08(BJ7);
        return BJ7;
    }

    public static WaTextView A0Q(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return (WaTextView) A02;
    }

    public static AnonymousClass11F A0W(Iterator it) {
        return ((AnonymousClass141) it.next()).A0H;
    }

    public static AnonymousClass1RJ A0X(View view, int i) {
        return new AnonymousClass1RJ(C012005e.A02(view, i));
    }

    public static AnonymousClass1RJ A0Y(View view, int i) {
        return new AnonymousClass1RJ(view.findViewById(i));
    }

    public static Integer A0a(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 14;
    }

    public static Integer A0b(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 15;
    }

    public static Object A0c(AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), (Object) null);
        return null;
    }

    public static String A0d(Activity activity) {
        return activity.getIntent().getStringExtra("jid");
    }

    public static String A0e(Context context, Object[] objArr, int i, int i2, int i3) {
        objArr[i2] = context.getString(i);
        return context.getString(i3, objArr);
    }

    public static String A0f(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static void A0n(Activity activity) {
        AnonymousClass1RC.A04(activity, C224514j.A00(activity, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public static void A0o(ContentValues contentValues, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
    }

    public static void A0p(ContentValues contentValues, String str, long j) {
        contentValues.put(str, Long.valueOf(j));
    }

    public static void A0q(Context context, View view, int i) {
        view.setBackgroundColor(AnonymousClass00F.A00(context, i));
    }

    public static void A0r(Context context, Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(AnonymousClass00F.A00(context, i)));
    }

    public static void A0s(Context context, TextView textView, Object[] objArr, int i) {
        textView.setText(context.getString(i, objArr));
    }

    public static void A0t(Intent intent, Jid jid) {
        intent.putExtra("chat_jid", AnonymousClass143.A03(jid));
    }

    public static void A0u(SharedPreferences.Editor editor, String str) {
        editor.remove(str).apply();
    }

    public static void A0v(SharedPreferences.Editor editor, String str, int i) {
        editor.putInt(str, i).apply();
    }

    public static void A0w(SharedPreferences.Editor editor, String str, long j) {
        editor.putLong(str, j).apply();
    }

    public static void A0x(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A0z(View view, int i, int i2) {
        view.setPadding(i, i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A10(View view, int i, int i2) {
        view.findViewById(i).setVisibility(i2);
    }

    public static void A11(AlertDialog$Builder alertDialog$Builder) {
        alertDialog$Builder.create().show();
    }

    public static void A12(AnonymousClass01L r1) {
        r1.setSupportActionBar((Toolbar) r1.findViewById(R.id.toolbar));
    }

    public static void A13(AnonymousClass01L r0, int i, int i2) {
        r0.findViewById(i).setVisibility(i2);
    }

    public static void A15(AnonymousClass02E r0) {
        AnonymousClass01I A0h = r0.A0h();
        if (A0h != null) {
            A0h.finish();
        }
    }

    public static void A16(C001600r r1, int i) {
        r1.A0D(Integer.valueOf(i));
    }

    public static void A17(C001600r r1, int i) {
        r1.A0C(Integer.valueOf(i));
    }

    public static void A18(C001600r r1, boolean z) {
        r1.A0D(Boolean.valueOf(z));
    }

    public static void A19(C001600r r1, boolean z) {
        r1.A0C(Boolean.valueOf(z));
    }

    public static void A1A(C06730Uv r0, AnonymousClass0CZ r1, Collection collection, List list) {
        AnonymousClass0X4 A00 = C06880Vl.A00(r0);
        list.clear();
        list.addAll(collection);
        A00.A02(r1);
    }

    public static void A1E(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 3);
    }

    public static void A1K(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1M(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.e(sb.toString());
    }

    public static void A1N(String str, StringBuilder sb, AbstractCollection abstractCollection) {
        sb.append(str);
        sb.append(abstractCollection.size());
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A1R(AnonymousClass00T r0, int i) {
        ((View) r0.getValue()).setVisibility(i);
    }

    public static void A1T(Object[] objArr, int i) {
        objArr[3] = Integer.valueOf(i);
    }

    public static void A1U(Object[] objArr, int i) {
        objArr[4] = Integer.valueOf(i);
    }

    public static void A1W(Object[] objArr, long j) {
        objArr[0] = String.valueOf(j);
    }

    public static boolean A1X(AnonymousClass01L r1) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0U(true);
        return true;
    }

    public static boolean A1Y(AnonymousClass9VA r0, String str, String str2) {
        r0.A02(str, str2);
        if (str2 != null) {
            return true;
        }
        return false;
    }
}
