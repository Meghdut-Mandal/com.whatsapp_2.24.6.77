package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: X.1kB  reason: invalid class name and case insensitive filesystem */
public abstract class C36361kB {
    public static Point A0A(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
    }

    public static View A0E(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static AnimationSet A0K(Animation animation, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(animation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static C33301f4 A0Y(C19770wU r2) {
        return new C33301f4(new C19930wk(r2, true));
    }

    public static C224214g A0g() {
        C224214g r0 = new C224214g(true);
        r0.A03();
        return r0;
    }

    public static Integer A0i() {
        return 1;
    }

    public static Integer A0j() {
        return 2;
    }

    public static ArrayList A0q(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        return new ArrayList(collection);
    }

    public static void A0u(Activity activity) {
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().setNavigationBarColor(AnonymousClass00F.A00(activity, R.color.f6nameremoved));
    }

    public static void A0x(Context context, Context context2, Object[] objArr) {
        objArr[0] = AnonymousClass14B.A03(context2, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public static void A11(Path path, View view, int i) {
        path.lineTo((float) i, (float) ((view.getHeight() * 9) / 10));
    }

    public static void A19(TextView textView) {
        textView.setAutoLinkMask(0);
        textView.setLinksClickable(false);
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    public static void A1T(C009003v r2, AnonymousClass040 r3, AnonymousClass05H r4) {
        C06820Vf.A01(r3, new C18510tH(r2, r4, 5));
    }

    public static void A1U(float[] fArr, float f) {
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    public static boolean A1Y(C20810yC r2) {
        return AnonymousClass1MI.A02(r2, (C21000yV) null, 4497);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static Intent A07(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupAdminPickerActivity");
        intent.putExtra("gid", AnonymousClass143.A03(jid));
        return intent;
    }

    public static AnonymousClass1LI A0S(C18800tq r0) {
        return (AnonymousClass1LI) r0.A3Q.get();
    }

    public static AnonymousClass1X4 A0T(C18800tq r0) {
        return (AnonymousClass1X4) r0.A8h.get();
    }

    public static AnonymousClass1LV A0U(C18800tq r0) {
        return (AnonymousClass1LV) r0.A1q.get();
    }

    public static AnonymousClass1Pp A0V(C18800tq r0) {
        return (AnonymousClass1Pp) r0.A28.get();
    }

    public static C27761Ps A0W(C18800tq r0) {
        return (C27761Ps) r0.A2D.get();
    }

    public static C33751fs A0X(C18830tt r0) {
        return (C33751fs) r0.A17.get();
    }

    public static AnonymousClass16J A0Z(C18800tq r0) {
        return (AnonymousClass16J) r0.A57.get();
    }

    public static C20350xQ A0a(C18800tq r0) {
        return (C20350xQ) r0.A3k.get();
    }

    public static AnonymousClass1CF A0b(C18800tq r0) {
        return (AnonymousClass1CF) r0.A8K.get();
    }

    public static AnonymousClass19A A0c(C18800tq r0) {
        return (AnonymousClass19A) r0.A4x.get();
    }

    public static AnonymousClass1N6 A0e(C18800tq r0) {
        return (AnonymousClass1N6) r0.A5V.get();
    }

    public static String A0o(String str, Locale locale, long j) {
        return new SimpleDateFormat(str, locale).format(new Date(j));
    }

    public static Collator A0p(C18820ts r0) {
        return Collator.getInstance(C18820ts.A01(r0.A00));
    }

    public static void A0w(Activity activity, Intent intent, C24801Dv r3, String str, int i) {
        intent.putExtra("entrypoint", i);
        intent.putExtra("session_id", str);
        r3.A06(activity, intent);
        activity.finish();
    }

    public static void A0y(Context context, Uri uri, C24801Dv r4) {
        r4.A06(context, new Intent("android.intent.action.VIEW", uri));
    }

    public static void A13(Drawable drawable, ImageView imageView, C18820ts r3) {
        imageView.setImageDrawable(new C100744vb(drawable, r3));
    }

    public static void A14(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A17(View view, Object obj, int i) {
        view.setOnClickListener(new C135446ci(obj, i));
    }

    public static void A18(View view, Object obj, int i) {
        view.setOnClickListener(new C135436ch(obj, i));
    }

    public static void A1C(C18800tq r0, C225314u r1) {
        r1.A0B = (AnonymousClass1N0) r0.A00.A3P.get();
    }

    public static void A1D(C18830tt r0, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A03 = (AnonymousClass1N0) r0.A3P.get();
    }

    public static void A1G(C201669k5 r1, StringBuilder sb) {
        sb.append(", operation=");
        sb.append(r1.A05);
        sb.append(", collectionName=");
        sb.append(r1.A06);
        sb.append(", keyId=");
        sb.append(r1.A00);
    }

    public static void A1K(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 10);
        AnonymousClass00C.A0D(obj2, 11);
    }

    public static void A1L(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 14);
        AnonymousClass00C.A0D(obj2, 15);
    }

    public static void A1M(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 17);
        AnonymousClass00C.A0D(obj2, 18);
    }

    public static void A1N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 31);
        AnonymousClass00C.A0D(obj2, 32);
        AnonymousClass00C.A0D(obj3, 33);
        AnonymousClass00C.A0D(obj4, 34);
        AnonymousClass00C.A0D(obj5, 35);
    }

    public static void A1O(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public static void A1Q(String str, String str2, Object[] objArr) {
        objArr[3] = new AnonymousClass1AL(str, str2);
    }

    public static boolean A1X(C19730wQ r1, AnonymousClass141 r2) {
        return r1.A0M(r2.A0H);
    }

    public static float A00(ValueAnimator valueAnimator, int i) {
        AnonymousClass00C.A0D(valueAnimator, i);
        Object animatedValue = valueAnimator.getAnimatedValue();
        AnonymousClass00C.A0E(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A01(ValueAnimator valueAnimator) {
        return ((Number) valueAnimator.getAnimatedValue()).intValue();
    }

    public static int A02(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A03(C001600r r0) {
        Number number = (Number) r0.A04();
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public static int A04(Object obj, Object obj2, int i) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 2);
        return 2;
    }

    public static Activity A05(View view) {
        return C18860tw.A01(view.getContext(), C225314u.class);
    }

    public static Activity A06(View view) {
        return C24801Dv.A00(view.getContext());
    }

    public static Intent A08(Context context, Jid jid, int i) {
        return AnonymousClass190.A0F(context, i).putExtra("jid", AnonymousClass143.A03(jid));
    }

    public static Resources.Theme A09(View view) {
        return view.getContext().getTheme();
    }

    public static DisplayMetrics A0B(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static View A0C(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static View A0D(Activity activity, int i) {
        View A0B = C03570Gk.A0B(activity, i);
        AnonymousClass00C.A08(A0B);
        return A0B;
    }

    public static View A0F(View view, int i) {
        View findViewById = view.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return findViewById;
    }

    public static View A0G(View view, int i) {
        View A02 = C012005e.A02(view, i);
        AnonymousClass00C.A08(A02);
        return A02;
    }

    public static View A0H(AnonymousClass01L r0, int i) {
        View findViewById = r0.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return findViewById;
    }

    public static View A0I(AnonymousClass00T r0) {
        Object value = r0.getValue();
        AnonymousClass00C.A08(value);
        return (View) value;
    }

    public static View A0J(AnonymousClass00T r0) {
        return ((AnonymousClass1RJ) r0.getValue()).A01();
    }

    public static ImageView A0L(View view) {
        return new ImageView(view.getContext());
    }

    public static ImageView A0M(View view, int i) {
        View findViewById = view.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return (ImageView) findViewById;
    }

    public static Toolbar A0N(Activity activity) {
        return (Toolbar) C03570Gk.A0B(activity, R.id.toolbar);
    }

    public static Toolbar A0O(AnonymousClass155 r1, int i) {
        r1.setContentView(i);
        return (Toolbar) r1.findViewById(R.id.toolbar);
    }

    public static C18800tq A0P(C33491fR r0) {
        return ((C27861Qc) ((C27851Qb) r0.generatedComponent())).A0M;
    }

    public static AnonymousClass3DY A0Q(C18800tq r0) {
        return (AnonymousClass3DY) r0.A7b.get();
    }

    public static TextEmojiLabel A0R(View view, int i) {
        View findViewById = view.findViewById(i);
        AnonymousClass00C.A08(findViewById);
        return (TextEmojiLabel) findViewById;
    }

    public static AnonymousClass3LI A0d(Jid jid, AnonymousClass1CR r1) {
        return AnonymousClass1CR.A02(r1, jid.getRawString());
    }

    public static AnonymousClass1M4 A0f(C18800tq r0) {
        return (AnonymousClass1M4) r0.AEo.get();
    }

    public static AnonymousClass1RJ A0h(Activity activity, int i) {
        return new AnonymousClass1RJ(C03570Gk.A0B(activity, i));
    }

    public static Long A0k(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public static String A0l() {
        return UUID.randomUUID().toString();
    }

    public static String A0m(Context context, int i) {
        String string = context.getString(i);
        AnonymousClass00C.A08(string);
        return string;
    }

    public static String A0n(EditText editText) {
        return editText.getText().toString();
    }

    public static ArrayList A0r(List list) {
        return new ArrayList(list.size());
    }

    public static Iterator A0s(C19580wB r0) {
        return r0.getObservers().iterator();
    }

    public static void A0t(Activity activity) {
        activity.startActivity(AnonymousClass190.A02(activity));
        AnonymousClass0XN.A00(activity);
    }

    public static void A0v(Activity activity, int i) {
        C03570Gk.A0B(activity, i).setVisibility(8);
    }

    public static void A0z(Context context, View view, C18820ts r3, int i) {
        view.setBackground(new C100744vb(AnonymousClass00E.A00(context, i), r3));
    }

    public static void A10(Resources resources, View view, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static void A12(Path path, AbstractList abstractList, int i) {
        path.lineTo(((PointF) abstractList.get(i)).x, ((PointF) abstractList.get(i)).y);
    }

    public static void A15(View view, View view2, View view3, int i) {
        view.setVisibility(i);
        view2.setVisibility(i);
        view3.setVisibility(i);
    }

    public static void A16(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public static void A1A(C07700Yy r2) {
        r2.A0B.icon = R.drawable.notifybar;
    }

    public static void A1B(C07700Yy r0, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        r0.A0I(z);
        r0.A0F(charSequence);
        r0.A0E(charSequence2);
    }

    public static void A1E(C18830tt r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        C111955d7.A00(C18830tt.A85(r0), wDSBottomSheetDialogFragment);
    }

    public static void A1F(AnonymousClass171 r0, AnonymousClass141 r1, Object[] objArr, int i) {
        objArr[i] = r0.A0H(r1);
    }

    public static void A1H(AnonymousClass6QB r0, AnonymousClass6QB r1) {
        r1.A05(r0.A03());
    }

    public static void A1I(Object obj) {
        AnonymousClass00C.A0B(obj);
        AnonymousClass00C.A0D(obj, 0);
    }

    public static void A1J(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 8);
    }

    public static void A1P(String str, TextView textView) {
        textView.setText(Html.fromHtml(str));
    }

    public static void A1R(String str, StringBuilder sb, String[] strArr) {
        sb.append(AnonymousClass1M2.A01(str, strArr));
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass141) it.next()).A06(AnonymousClass11F.class));
    }

    public static void A1V(Object[] objArr, int i) {
        objArr[7] = Integer.valueOf(i);
    }

    public static void A1W(Object[] objArr, long j) {
        objArr[2] = Long.valueOf(j);
    }

    public static boolean A1Z(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }

    public static boolean A1b(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
        return false;
    }
}
