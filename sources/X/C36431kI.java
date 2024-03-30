package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Paint;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1kI  reason: invalid class name and case insensitive filesystem */
public abstract class C36431kI {
    public static int A01(int i) {
        return i != 0 ? 3 : 4;
    }

    public static int A02(Intent intent, String str) {
        return intent.getIntExtra(str, 0);
    }

    public static Intent A0E(Context context, UserJid userJid, Integer num) {
        return AnonymousClass190.A0w(context, userJid, num, true, true);
    }

    public static View A0J(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null, false);
    }

    public static LinearLayoutManager A0T() {
        return new LinearLayoutManager(1);
    }

    public static C18950u5 A0q() {
        return new C18950u5(1, 1, 1, false);
    }

    public static C18910u1 A0x(AnonymousClass004 r2) {
        return new C18910u1((Object) null, r2);
    }

    public static AtomicBoolean A1H() {
        return new AtomicBoolean(false);
    }

    public static boolean A1P(int i) {
        return i < 0;
    }

    public static boolean A1Q(int i) {
        return i == 0;
    }

    public static Object[] A1a(Object obj, Object obj2, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        objArr[1] = obj2;
        return objArr;
    }

    public static String[] A1b(List list) {
        return (String[]) list.toArray(new String[0]);
    }

    public static long A08(AnonymousClass155 r1) {
        return C19970wo.A00(r1.A07);
    }

    public static long A09(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Intent A0B() {
        return new Intent("android.intent.action.SEND");
    }

    public static Intent A0C() {
        return new Intent("android.intent.action.VIEW");
    }

    public static Intent A0D() {
        return new Intent();
    }

    public static Bundle A0I(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static FrameLayout A0O(Context context, View view) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(view);
        return frameLayout;
    }

    public static C001700s A0S() {
        return new C001700s();
    }

    public static AnonymousClass142 A0V(AnonymousClass155 r0) {
        C19730wQ r02 = r0.A02;
        r02.A0G();
        return r02.A0E;
    }

    public static C21100yf A0W(C18800tq r0) {
        return (C21100yf) r0.A7f.get();
    }

    public static WfalManager A0Y(C18800tq r0) {
        return (WfalManager) r0.A9U.get();
    }

    public static AnonymousClass1Sk A0Z(C18800tq r0) {
        return (AnonymousClass1Sk) r0.A1s.get();
    }

    public static C24341Cb A0a(C18800tq r0) {
        return (C24341Cb) r0.A4n.get();
    }

    public static AnonymousClass1DW A0b(C18800tq r0) {
        return (AnonymousClass1DW) r0.A2f.get();
    }

    public static C20350xQ A0d(C20510xg r0) {
        return (C20350xQ) r0.A08.get();
    }

    public static C20510xg A0e(C18800tq r0) {
        return (C20510xg) r0.A3x.get();
    }

    public static C26801Lo A0f(C18800tq r0) {
        return (C26801Lo) r0.A60.get();
    }

    public static C32931eR A0g(C18800tq r0) {
        return (C32931eR) r0.A4K.get();
    }

    public static Jid A0h(AnonymousClass141 r1) {
        return r1.A06(UserJid.class);
    }

    public static AnonymousClass147 A0j(AnonymousClass141 r1) {
        return (AnonymousClass147) r1.A06(AnonymousClass147.class);
    }

    public static UserJid A0l(String str) {
        return UserJid.Companion.A02(str);
    }

    public static C30131Zi A0m(C18800tq r0) {
        return (C30131Zi) r0.A5h.get();
    }

    public static C32241dD A0n(C18800tq r0) {
        return (C32241dD) r0.A5g.get();
    }

    public static AnonymousClass1FR A0p(C18800tq r0) {
        return (AnonymousClass1FR) r0.A6O.get();
    }

    public static AnonymousClass3UV A0t(C18800tq r0) {
        return (AnonymousClass3UV) r0.A7J.get();
    }

    public static AnonymousClass3TX A0u(C18830tt r0) {
        return (AnonymousClass3TX) r0.A1p.get();
    }

    public static C28331Sf A0v(C18800tq r0) {
        return (C28331Sf) r0.A7w.get();
    }

    public static StickerInfoViewModel A0w(StickerInfoBottomSheet stickerInfoBottomSheet) {
        return (StickerInfoViewModel) stickerInfoBottomSheet.A0K.getValue();
    }

    public static C32531dl A11(Context context, AnonymousClass02E r2) {
        return new C32531dl(context, r2);
    }

    public static Integer A12() {
        return 12;
    }

    public static Integer A13() {
        return 17;
    }

    public static Integer A14() {
        return 25;
    }

    public static LinkedHashMap A1G() {
        return new LinkedHashMap();
    }

    public static AnonymousClass00U A1I(AnonymousClass00S r1) {
        return new AnonymousClass00U(r1);
    }

    public static void A1K(Context context, TextView textView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new BulletSpan((int) context.getResources().getDimension(R.dimen.f7nameremoved)), 0, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }

    public static void A1L(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A1M(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence, TextView.BufferType.SPANNABLE);
    }

    public static void A1N(Object obj) {
        ((DialogFragment) obj).A1b();
    }

    public static boolean A1R(C225314u r0) {
        return r0.A07.A09();
    }

    public static boolean A1S(AnonymousClass155 r2) {
        if (r2.A0A.A00() == 8) {
            return true;
        }
        return false;
    }

    public static boolean A1T(AnonymousClass155 r2) {
        if (r2.A0A.A00() == 15) {
            return true;
        }
        return false;
    }

    public static boolean A1U(AnonymousClass155 r2) {
        if (r2.A0A.A00() == 17) {
            return true;
        }
        return false;
    }

    public static boolean A1V(AnonymousClass155 r0, AnonymousClass11F r1) {
        return r0.A02.A0M(r1);
    }

    public static boolean A1W(AnonymousClass141 r0) {
        return AnonymousClass143.A0I(r0.A0H);
    }

    public static boolean A1X(C20800yB r1) {
        return r1.A0E(5839);
    }

    public static boolean A1Y(C132446Tt r0) {
        return r0.A02.isCancelled();
    }

    public static Object[] A1Z(Object obj, int i) {
        Object[] objArr = new Object[i];
        objArr[0] = obj;
        return objArr;
    }

    public static double A00(Cursor cursor, String str) {
        return cursor.getDouble(cursor.getColumnIndexOrThrow(str));
    }

    public static int A03(DisplayMetrics displayMetrics, float f, int i) {
        return C14960mT.A01(TypedValue.applyDimension(i, f, displayMetrics));
    }

    public static int A04(View view, int i) {
        return i + view.getHeight();
    }

    public static int A05(C235518x r0) {
        return r0.A04().intValue();
    }

    public static int A06(Enum enumR, int i) {
        AnonymousClass00C.A0D(enumR, i);
        return enumR.ordinal();
    }

    public static int A07(List list) {
        return list.size() - 1;
    }

    public static Context A0A(View view, View view2, int i) {
        view.setVisibility(i);
        return view2.getContext();
    }

    public static Intent A0F(AnonymousClass155 r0, int i) {
        r0.setContentView(i);
        return r0.getIntent();
    }

    public static ColorStateList A0G(Context context, int i) {
        return ColorStateList.valueOf(AnonymousClass00F.A00(context, i));
    }

    public static Configuration A0H(View view) {
        return view.getResources().getConfiguration();
    }

    public static View A0K(Iterator it) {
        return (View) it.next();
    }

    public static ViewPropertyAnimator A0L(View view, long j) {
        return view.animate().setDuration(j);
    }

    public static ViewStub A0M(View view, int i) {
        return (ViewStub) view.findViewById(i);
    }

    public static Window A0N(AnonymousClass02E r0) {
        return r0.A0i().getWindow();
    }

    public static ImageView A0P(Activity activity, int i) {
        return (ImageView) C03570Gk.A0B(activity, i);
    }

    public static AnonymousClass07B A0Q(AnonymousClass01L r0, Toolbar toolbar) {
        r0.setSupportActionBar(toolbar);
        return r0.getSupportActionBar();
    }

    public static AnonymousClass0FM A0R(DialogInterface.OnClickListener onClickListener, AlertDialog$Builder alertDialog$Builder, int i) {
        alertDialog$Builder.setNegativeButton(i, onClickListener);
        return alertDialog$Builder.create();
    }

    public static C225314u A0U(AnonymousClass02E r0) {
        return (C225314u) r0.A0i();
    }

    public static WaImageView A0X(View view, int i) {
        return (WaImageView) C012005e.A02(view, i);
    }

    public static C88924Uo A0c(AnonymousClass6N7 r1, String str, int i, boolean z) {
        return r1.A01(AnonymousClass6N7.A00(str, i, z));
    }

    public static C28981Uw A0i(AnonymousClass00T r0) {
        return (C28981Uw) r0.getValue();
    }

    public static AnonymousClass147 A0k(AnonymousClass00T r0) {
        return (AnonymousClass147) r0.getValue();
    }

    public static AnonymousClass1V7 A0o(AnonymousClass005 r0) {
        return (AnonymousClass1V7) r0.get();
    }

    public static AnonymousClass3T1 A0r(C001600r r0) {
        return (AnonymousClass3T1) r0.A04();
    }

    public static C203399nx A0s(Iterator it) {
        return (C203399nx) it.next();
    }

    public static WDSButton A0y(View view, int i) {
        return (WDSButton) C012005e.A02(view, i);
    }

    public static C21050ya A0z(C21060yb r0) {
        C21050ya A0O = r0.A0O();
        C18740tg.A06(A0O);
        return A0O;
    }

    public static AnonymousClass1UM A10(AnonymousClass005 r0) {
        return (AnonymousClass1UM) r0.get();
    }

    public static Long A15(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static String A16(int i, int i2, String str) {
        String substring = str.substring(i, i2);
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static String A17(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        C18740tg.A06(string);
        return string;
    }

    public static String A18(TextView textView) {
        return textView.getText().toString();
    }

    public static String A19(C20800yB r0, int i) {
        String A09 = r0.A09(i);
        AnonymousClass00C.A08(A09);
        return A09;
    }

    public static String A1A(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A1B(String str, String str2) {
        return str2.substring(str.length());
    }

    public static String A1C(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" WHERE ");
        return " WHERE ";
    }

    public static String A1D(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        AnonymousClass00C.A08(lowerCase);
        return lowerCase;
    }

    public static String A1E(AnonymousClass00T r0) {
        return (String) r0.getValue();
    }

    public static ArrayList A1F(Bundle bundle, Class cls, String str) {
        return AnonymousClass143.A06(cls, bundle.getStringArrayList(str));
    }

    public static void A1J(Activity activity, int i) {
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(C018107s.A03(0.3f, i, AnonymousClass00F.A00(activity, C224314h.A01(activity, R.attr.f4nameremoved))));
    }

    public static void A1O(Object[] objArr, int i, int i2) {
        objArr[i2] = String.valueOf(i);
    }
}
