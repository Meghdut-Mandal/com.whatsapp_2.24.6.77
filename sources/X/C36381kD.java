package X;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.settings.SettingsPasskeysViewModel;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1kD  reason: invalid class name and case insensitive filesystem */
public abstract class C36381kD {
    public static int A00(int i) {
        return i != 0 ? 8 : 0;
    }

    public static Intent A0C(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker");
        className.putExtra("hidden_jids", 0);
        className.putExtra("call_from_ui", i);
        return className;
    }

    public static View A0K(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static WindowManager.LayoutParams A0M(Window window) {
        window.getDecorView().setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        return attributes;
    }

    public static LinearLayout.LayoutParams A0N() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public static Boolean A0j() {
        return false;
    }

    public static Integer A0m() {
        return 0;
    }

    public static Integer A0n() {
        return 6;
    }

    public static String A0r(Context context, Object obj, Object[] objArr, int i) {
        objArr[0] = obj;
        return context.getString(i, objArr);
    }

    public static String A0v(AnonymousClass171 r1, AnonymousClass141 r2) {
        return r1.A0Q(r2, -1);
    }

    public static String A0x(CharSequence charSequence, Iterable iterable) {
        return C007103b.A0Q(charSequence, "", "", iterable, (C006302t) null);
    }

    public static Iterator A12(Object obj) {
        return new C18660tW(obj, 0).iterator();
    }

    public static void A1B(View view, View view2) {
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    public static void A1L(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
    }

    public static void A1S(float[] fArr, Object[] objArr) {
        fArr[0] = 1.4f;
        objArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        objArr[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.4f});
    }

    public static boolean A1U(int i, int i2) {
        return i != i2;
    }

    public static URLSpan[] A1b(Spanned spanned) {
        return (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
    }

    public static int A03(Pair pair) {
        return ((Number) pair.second).intValue();
    }

    public static int A04(Pair pair) {
        return ((Number) pair.first).intValue();
    }

    public static int A07(Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A09(boolean z) {
        return z ? 0 : 8;
    }

    public static Intent A0B(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
    }

    public static Intent A0D(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity");
        intent.putExtra("entrypoint", i);
        return intent;
    }

    public static Intent A0E(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.support.faq.FaqItemActivity");
        intent.putExtra("title", str);
        intent.putExtra("content", str2);
        intent.putExtra("url", str3);
        return intent;
    }

    public static Intent A0F(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        return intent;
    }

    public static AttributeSet A0I(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static C20760y7 A0R(AnonymousClass17X r0, AnonymousClass144 r1) {
        return r0.A07.A0C(r1).A07();
    }

    public static C225314u A0S(Context context) {
        return (C225314u) C24801Dv.A01(context, C225314u.class);
    }

    public static C20050ww A0U(C18800tq r0) {
        return (C20050ww) r0.A7v.get();
    }

    public static AnonymousClass1NG A0V(C18800tq r0) {
        return (AnonymousClass1NG) r0.A0v.get();
    }

    public static AnonymousClass1MK A0W(C18800tq r0) {
        return (AnonymousClass1MK) r0.A75.get();
    }

    public static C236419g A0a(C18800tq r0) {
        return (C236419g) r0.A1v.get();
    }

    public static C27751Pr A0b(C18800tq r0) {
        return (C27751Pr) r0.A64.get();
    }

    public static C27541Op A0c(C18800tq r0) {
        return (C27541Op) r0.A3n.get();
    }

    public static AnonymousClass1EL A0d(C18800tq r0) {
        return (AnonymousClass1EL) r0.A8L.get();
    }

    public static AnonymousClass1EU A0f(C18800tq r0) {
        return (AnonymousClass1EU) r0.A6M.get();
    }

    public static C29731Xt A0i(C18800tq r0) {
        return (C29731Xt) r0.A81.get();
    }

    public static IllegalArgumentException A0k() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static IllegalStateException A0l() {
        return new IllegalStateException("Required value was null.");
    }

    public static String A0w(Jid jid) {
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public static StringBuilder A11(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static void A15(Context context, Intent intent) {
        intent.setFlags(67108864);
        context.startActivity(intent);
    }

    public static void A1A(View view, int i, int i2) {
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(i, i2));
    }

    public static void A1C(Animation animation) {
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A1F(AnonymousClass02E r1, AnonymousClass01z r2, String str) {
        AnonymousClass09Y r0 = new AnonymousClass09Y(r2);
        r0.A0D(r1, str);
        r0.A02();
    }

    public static void A1G(AnonymousClass02E r3, Jid jid) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PARENT_GROUP_JID", jid.getRawString());
        r3.A17(bundle);
    }

    public static void A1J(Object obj) {
        ((C170888Hw) obj).A04((Object) null);
    }

    public static void A1M(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass1AL(str, str2));
    }

    public static void A1N(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass1AL(str, str2);
    }

    public static void A1R(C005102h r1, C009003v r2, AnonymousClass040 r3) {
        AnonymousClass0A2.A02(C023109s.A00, r1, r2, r3);
    }

    public static boolean A1X(C225314u r1) {
        return r1.A0D.A0E(5012);
    }

    public static int A01(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A02(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A05(View view, int i) {
        return AnonymousClass00F.A00(view.getContext(), i);
    }

    public static int A06(EditText editText) {
        return editText.getText().length();
    }

    public static int A08(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static Activity A0A(Context context) {
        Activity A00 = C24801Dv.A00(context);
        AnonymousClass00C.A0E(A00, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return A00;
    }

    public static SharedPreferences.Editor A0G(C19890wg r0, String str) {
        return r0.A00(str).edit();
    }

    public static Drawable A0H(Context context, int i) {
        Drawable A00 = AnonymousClass00E.A00(context, i);
        C18740tg.A06(A00);
        return A00;
    }

    public static LayoutInflater A0J(AnonymousClass02E r0) {
        return r0.A0i().getLayoutInflater();
    }

    public static View A0L(View view, int i) {
        return ((ViewStub) C012005e.A02(view, i)).inflate();
    }

    public static AnonymousClass07B A0O(AnonymousClass01L r0) {
        AnonymousClass07B supportActionBar = r0.getSupportActionBar();
        C18740tg.A06(supportActionBar);
        return supportActionBar;
    }

    public static AnonymousClass04H A0P(AnonymousClass02E r1) {
        return new AnonymousClass04H(r1.A0i());
    }

    public static AnonymousClass1GC A0Q(AnonymousClass004 r0) {
        return C19460v5.A01(r0.get());
    }

    public static AnonymousClass142 A0T(C19730wQ r0) {
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        C18740tg.A06(r02);
        return r02;
    }

    public static C229216m A0X(C18800tq r0) {
        return (C229216m) r0.A27.get();
    }

    public static C89004Uw A0Y(AnonymousClass02E r0) {
        AnonymousClass01I A0h = r0.A0h();
        C18740tg.A06(A0h);
        return (C89004Uw) A0h;
    }

    public static AnonymousClass141 A0Z(AnonymousClass16D r1, List list, int i) {
        return r1.A08((AnonymousClass11F) list.get(i));
    }

    public static Jid A0e(AnonymousClass141 r0, Class cls) {
        Jid A06 = r0.A06(cls);
        C18740tg.A06(A06);
        return A06;
    }

    public static C61943Ec A0g(AnonymousClass00T r1) {
        return ((SettingsPasskeysViewModel) r1.getValue()).A02.B41(2);
    }

    public static C64883Pu A0h(C18830tt r0) {
        return (C64883Pu) r0.ACT.get();
    }

    public static Integer A0o(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 19;
    }

    public static Object A0p(AnonymousClass00T r0) {
        Object value = r0.getValue();
        AnonymousClass00C.A08(value);
        return value;
    }

    public static String A0q(Activity activity) {
        return activity.getIntent().getStringExtra("search_result_key");
    }

    public static String A0s(Resources resources, int i) {
        String string = resources.getString(i);
        AnonymousClass00C.A08(string);
        return string;
    }

    public static String A0t(View view, int i) {
        return view.getContext().getString(i);
    }

    public static String A0u(AnonymousClass16D r0, AnonymousClass171 r1, AnonymousClass11F r2) {
        return r1.A0H(r0.A0D(r2));
    }

    public static String A0y(Object obj) {
        String obj2 = obj.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }

    public static String A0z(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A10(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static List A13(String str, String str2) {
        List asList = Arrays.asList(new String[]{str, str2});
        AnonymousClass00C.A08(asList);
        return asList;
    }

    public static void A14(ValueAnimator valueAnimator, long j) {
        valueAnimator.setDuration(j);
        valueAnimator.setInterpolator(new LinearInterpolator());
    }

    public static void A16(Context context, Paint paint, int i) {
        paint.setColor(AnonymousClass00F.A00(context, i));
    }

    public static void A17(Bundle bundle, DialogFragment dialogFragment, C225314u r2) {
        dialogFragment.A17(bundle);
        r2.Btl(dialogFragment, (String) null);
    }

    public static void A18(View view, int i) {
        view.findViewById(i).setVisibility(8);
    }

    public static void A19(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A1D(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new DecelerateInterpolator());
    }

    public static void A1E(TextView textView, AnonymousClass02E r2, Object[] objArr, int i) {
        textView.setText(r2.A0o(i, objArr));
    }

    public static void A1H(AnonymousClass16D r0, AnonymousClass11F r1, AbstractCollection abstractCollection) {
        abstractCollection.add(r0.A0D(r1));
    }

    public static void A1I(AnonymousClass005 r0, Object obj) {
        ((AnonymousClass1F0) r0.get()).A01((AnonymousClass2bL) obj);
    }

    public static void A1K(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 7);
    }

    public static void A1O(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" WHERE ");
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass4V2) it.next()).B7k());
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof AnonymousClass2YQ) {
            abstractCollection.add(next);
        }
    }

    public static void A1T(Object[] objArr, int i) {
        objArr[6] = Integer.valueOf(i);
    }

    public static boolean A1V(Uri uri) {
        return new File(uri.getPath()).exists();
    }

    public static boolean A1W(AnonymousClass01L r1) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        return true;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return AnonymousClass00C.A0J(obj.getClass(), obj2.getClass());
    }

    public static boolean A1Z(AbstractCollection abstractCollection, int i) {
        return abstractCollection.contains(Integer.valueOf(i));
    }

    public static URLSpan[] A1a(SpannableStringBuilder spannableStringBuilder, int i) {
        return (URLSpan[]) spannableStringBuilder.getSpans(i, spannableStringBuilder.length(), URLSpan.class);
    }
}
