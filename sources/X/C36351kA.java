package X;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.1kA  reason: invalid class name and case insensitive filesystem */
public abstract class C36351kA {
    public static AlphaAnimation A0D() {
        return new AlphaAnimation(0.0f, 1.0f);
    }

    public static String A0w(Context context, Object obj, int i, int i2) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        return context.getString(i2, objArr);
    }

    public static void A1J(Object obj, Object obj2, int i) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, i);
    }

    public static boolean A1Z(C20800yB r1) {
        AnonymousClass00C.A0D(r1, 1);
        return !r1.A0E(4001);
    }

    public static boolean A1a(Object obj, SortedSet sortedSet, C006302t r4, AnonymousClass05L r5) {
        AnonymousClass00C.A0D(sortedSet, 0);
        TreeSet treeSet = new TreeSet(sortedSet.comparator());
        treeSet.addAll(sortedSet);
        r4.invoke(treeSet);
        return r5.B3B(obj, treeSet);
    }

    public static int A00(int i) {
        return i != 0 ? 0 : 8;
    }

    public static Context A09(View view) {
        List list = AnonymousClass0D3.A0I;
        Context context = view.getContext();
        AnonymousClass00C.A08(context);
        return context;
    }

    public static Bundle A0B(Jid jid, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(str, jid.getRawString());
        return bundle;
    }

    public static C24801Dv A0J(C18800tq r0) {
        return (C24801Dv) r0.A0D.get();
    }

    public static AnonymousClass17Y A0M(C18800tq r0) {
        return (AnonymousClass17Y) r0.A3e.get();
    }

    public static C19730wQ A0N(C18800tq r0) {
        return (C19730wQ) r0.A4g.get();
    }

    public static AnonymousClass16I A0S(C18800tq r0) {
        return (AnonymousClass16I) r0.A2B.get();
    }

    public static C27731Pn A0T(C18800tq r0) {
        return (C27731Pn) r0.A2E.get();
    }

    public static C21060yb A0U(C18800tq r0) {
        return (C21060yb) r0.A8W.get();
    }

    public static C19970wo A0V(C18800tq r0) {
        return (C19970wo) r0.A8b.get();
    }

    public static C19630wG A0W(C18800tq r0) {
        return (C19630wG) r0.A91.get();
    }

    public static C20830yE A0X(C18800tq r0) {
        return (C20830yE) r0.A9E.get();
    }

    public static C19420v0 A0Y(C18800tq r0) {
        return (C19420v0) r0.A9G.get();
    }

    public static C220412q A0a(C18800tq r0) {
        return (C220412q) r0.A1l.get();
    }

    public static AnonymousClass17X A0b(C18800tq r0) {
        return (AnonymousClass17X) r0.A3v.get();
    }

    public static AnonymousClass1H2 A0e(C18800tq r0) {
        return (AnonymousClass1H2) r0.A2x.get();
    }

    public static C21010yW A0g(C18800tq r0) {
        return (C21010yW) r0.A79.get();
    }

    public static AnonymousClass190 A0h(C18800tq r0) {
        return (AnonymousClass190) r0.A97.get();
    }

    public static AnonymousClass11F A0j(AnonymousClass141 r1) {
        return (AnonymousClass11F) r1.A06(AnonymousClass11F.class);
    }

    public static UserJid A0k(AnonymousClass141 r1) {
        Jid A06 = r1.A06(UserJid.class);
        C18740tg.A06(A06);
        return (UserJid) A06;
    }

    public static UserJid A0l(AnonymousClass141 r1) {
        return (UserJid) r1.A06(UserJid.class);
    }

    public static C19890wg A0m(C18800tq r0) {
        return (C19890wg) r0.A7i.get();
    }

    public static AnonymousClass1A1 A0n(C18800tq r0) {
        return (AnonymousClass1A1) r0.A3H.get();
    }

    public static C32681e1 A0p(C18830tt r0) {
        return (C32681e1) r0.A2Y.get();
    }

    public static AnonymousClass13J A0q(C18800tq r0) {
        return (AnonymousClass13J) r0.A6z.get();
    }

    public static String A0x(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        String string = context.getString(i2, objArr);
        AnonymousClass00C.A08(string);
        return string;
    }

    public static String A0y(AnonymousClass141 r0) {
        AnonymousClass11F r02 = r0.A0H;
        C18740tg.A06(r02);
        return r02.getRawString();
    }

    public static ArrayList A0z(Iterable iterable) {
        return new ArrayList(AnonymousClass03U.A06(iterable, 10));
    }

    public static void A1E(View view, Object obj, int i) {
        view.setOnClickListener(new C135476cl(obj, i));
    }

    public static void A1F(RecyclerView recyclerView, int i) {
        recyclerView.setLayoutManager(new LinearLayoutManager(i));
    }

    public static void A1H(C81843xi r0) {
        if (r0 != null) {
            r0.A00.A03();
        }
    }

    public static void A1I(Jid jid, AnonymousClass6QB r2, String str) {
        r2.A04(new AnonymousClass1AL(jid, str));
    }

    public static void A1N(String str, String str2, Object[] objArr) {
        objArr[2] = new AnonymousClass1AL(str, str2);
    }

    public static void A1T(Throwable th, C023509x r3) {
        r3.resumeWith(new AnonymousClass0AK(new AnonymousClass03N(th)));
    }

    public static boolean A1X(AnonymousClass1NG r1, Jid jid) {
        C222813r r0 = UserJid.Companion;
        return r1.A0O(C222813r.A00(jid));
    }

    public static byte[] A1b(String str) {
        byte[] bytes = str.getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A08(bytes);
        return bytes;
    }

    public static int A01(Context context, int i, int i2) {
        return AnonymousClass00F.A00(context, C224514j.A00(context, i, i2));
    }

    public static int A02(Context context, Context context2, int i, int i2) {
        return AnonymousClass00F.A00(context2, C224514j.A00(context, i, i2));
    }

    public static int A03(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static int A04(View view, float f) {
        return (int) (f * ((float) (view.getResources().getDisplayMetrics().densityDpi / 160)));
    }

    public static int A05(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A06(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static long A07(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    public static long A08(AnonymousClass00T r1) {
        return ((Number) r1.getValue()).longValue();
    }

    public static SharedPreferences.Editor A0A(AnonymousClass00T r0) {
        return ((SharedPreferences) r0.getValue()).edit();
    }

    public static LayoutInflater A0C(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static TextView A0E(View view) {
        return (TextView) view.findViewById(R.id.title);
    }

    public static TextView A0F(View view, int i) {
        View findViewById = view.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return (TextView) findViewById;
    }

    public static TextView A0G(AnonymousClass00T r0) {
        Object value = r0.getValue();
        AnonymousClass00C.A08(value);
        return (TextView) value;
    }

    public static AnonymousClass04G A0H(AnonymousClass02E r0) {
        AnonymousClass04G BAw = r0.A0i().BAw();
        AnonymousClass00C.A08(BAw);
        return BAw;
    }

    public static AnonymousClass04J A0I(AnonymousClass02E r0) {
        AnonymousClass04J BJ7 = r0.A0i().BJ7();
        AnonymousClass00C.A08(BJ7);
        return BJ7;
    }

    public static AnonymousClass1N4 A0K(C18800tq r0) {
        return (AnonymousClass1N4) r0.AXM.get();
    }

    public static C27111My A0L(C224814n r0) {
        return (C27111My) ((C27101Mx) r0.generatedComponent());
    }

    public static TextEmojiLabel A0O(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return (TextEmojiLabel) A02;
    }

    public static C33771fu A0P(C18800tq r0) {
        return (C33771fu) r0.A8f.get();
    }

    public static WaTextView A0Q(View view, int i) {
        View findViewById = view.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return (WaTextView) findViewById;
    }

    public static AnonymousClass1RU A0R(C18800tq r0) {
        return (AnonymousClass1RU) r0.A08.get();
    }

    public static C65073Qp A0Z(C220412q r0, Object obj) {
        return (C65073Qp) C220412q.A00(r0).get(obj);
    }

    public static AnonymousClass6O1 A0c(C18830tt r0) {
        return (AnonymousClass6O1) r0.A7K.get();
    }

    public static AnonymousClass1XN A0d(C18800tq r0) {
        return (AnonymousClass1XN) r0.A7G.get();
    }

    public static EmojiSearchProvider A0f(C18830tt r0) {
        return (EmojiSearchProvider) r0.A7B.get();
    }

    public static AnonymousClass11F A0i(BaseBundle baseBundle, String str) {
        return AnonymousClass11F.A00.A02(baseBundle.getString(str));
    }

    public static BanAppealViewModel A0o(AnonymousClass02E r1) {
        return (BanAppealViewModel) new AnonymousClass04H(r1.A0i()).A00(BanAppealViewModel.class);
    }

    public static AnonymousClass1RJ A0r(AnonymousClass01L r0, int i) {
        return new AnonymousClass1RJ(r0.findViewById(i));
    }

    public static Integer A0s(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 16;
    }

    public static Integer A0t(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 17;
    }

    public static Object A0u(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static RuntimeException A0v() {
        AnonymousClass03T.A05();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static ArrayList A10(Object[] objArr) {
        return new ArrayList(Arrays.asList(objArr));
    }

    public static void A11(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static void A12(Activity activity) {
        activity.startActivity(AnonymousClass190.A09(activity));
        activity.finish();
    }

    public static void A13(ContentProviderOperation.Builder builder, Object obj, String str, AbstractCollection abstractCollection) {
        ContentProviderOperation build = builder.withValue(str, obj).build();
        AnonymousClass00C.A08(build);
        abstractCollection.add(build);
    }

    public static void A14(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A15(Resources resources, TextView textView, int i) {
        textView.setTextColor(resources.getColor(i));
    }

    public static void A16(Resources resources, TextView textView, Object[] objArr, int i, int i2) {
        textView.setText(resources.getQuantityString(i, i2, objArr));
    }

    public static void A17(Cursor cursor, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Long.valueOf(cursor.getLong(i)));
    }

    public static void A18(SpannableStringBuilder spannableStringBuilder, Object obj, Object obj2) {
        spannableStringBuilder.setSpan(obj2, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), spannableStringBuilder.getSpanFlags(obj));
    }

    public static void A19(View view, int i) {
        C012005e.A02(view, i).setVisibility(8);
    }

    public static void A1A(View view, int i, int i2) {
        C012005e.A02(view, i).setVisibility(i2);
    }

    public static void A1B(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A1C(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A1D(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A1G(BottomSheetBehavior bottomSheetBehavior, int i) {
        bottomSheetBehavior.A0V(i);
        bottomSheetBehavior.A0W(3);
        bottomSheetBehavior.A0h = true;
    }

    public static void A1K(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
    }

    public static void A1L(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static void A1M(String str, String str2, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void A1O(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(AnonymousClass1M2.A00(i));
    }

    public static void A1P(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.w(sb.toString(), th);
    }

    public static void A1Q(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.e(sb.toString(), th);
    }

    public static void A1R(StringBuilder sb, int i) {
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A1S(StringBuilder sb, long j) {
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A1U(AnonymousClass00T r1) {
        ((AnonymousClass1RJ) r1.getValue()).A03(0);
    }

    public static void A1V(Object[] objArr, int i, long j) {
        objArr[i] = String.valueOf(j);
    }

    public static boolean A1W(C001600r r0) {
        return ((Boolean) r0.A04()).booleanValue();
    }

    public static boolean A1Y(C18820ts r0) {
        return !C18820ts.A00(r0).A06;
    }
}
