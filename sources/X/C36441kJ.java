package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.lang.ref.Reference;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONObject;

/* renamed from: X.1kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C36441kJ {
    public static C18950u5 A0p(int i, int i2, int i3) {
        return new C18950u5(i, i2, i3, false);
    }

    public static Long A0y(int i) {
        return Long.valueOf((long) i);
    }

    public static Object A12(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static String A13(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static void A1E(C132446Tt r1, C19770wU r2) {
        r2.Box(r1, new String[0]);
    }

    public static boolean A1I(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, true);
    }

    public static int[] A1O() {
        return new int[2];
    }

    public static Animator[] A1P(Object obj, Object obj2, int i) {
        Animator[] animatorArr = new Animator[i];
        animatorArr[0] = obj;
        animatorArr[1] = obj2;
        return animatorArr;
    }

    public static Object[] A1Q() {
        return new Object[3];
    }

    public static String[] A1R() {
        return new String[1];
    }

    public static String[] A1S() {
        return new String[2];
    }

    public static float A03(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A08(AnonymousClass155 r0) {
        return r0.A0A.A00();
    }

    public static AnimatorSet A0C() {
        return new AnimatorSet();
    }

    public static ContentValues A0E() {
        return new ContentValues();
    }

    public static Context A0F(AnonymousClass0D3 r0) {
        return r0.A0H.getContext();
    }

    public static Intent A0H(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static Intent A0I(String str) {
        return new Intent(str);
    }

    public static Paint A0K() {
        return new Paint();
    }

    public static Paint A0L(int i) {
        return new Paint(i);
    }

    public static Path A0M() {
        return new Path();
    }

    public static RectF A0N() {
        return new RectF();
    }

    public static SpannableString A0O(CharSequence charSequence) {
        return new SpannableString(charSequence);
    }

    public static SpannableStringBuilder A0P(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static Pair A0Q(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static AnonymousClass00I A0W(Object obj, Object obj2) {
        return new AnonymousClass00I(obj, obj2);
    }

    public static AnonymousClass01I A0X(Object obj) {
        return ((AnonymousClass02E) obj).A0h();
    }

    public static AnonymousClass08S A0Y() {
        return new AnonymousClass08S();
    }

    public static C001700s A0Z(Object obj) {
        return new C001700s(obj);
    }

    public static C12560iI A0a(AnonymousClass00S r1, AnonymousClass00S r2, AnonymousClass00S r3, C019108d r4) {
        return new C12560iI(r1, r2, r3, r4);
    }

    public static AnonymousClass04H A0b(AnonymousClass016 r1) {
        return new AnonymousClass04H(r1);
    }

    public static AnonymousClass9VA A0d() {
        return new AnonymousClass9VA();
    }

    public static AnonymousClass190 A0j() {
        return new AnonymousClass190();
    }

    public static GroupJid A0l(Jid jid) {
        AnonymousClass6SZ r0 = GroupJid.Companion;
        return AnonymousClass6SZ.A00(jid);
    }

    public static AnonymousClass6QB A0q(String str) {
        return new AnonymousClass6QB(str);
    }

    public static C34831hi A0s(Object obj) {
        return new C34831hi(obj);
    }

    public static C28201Rs A0t() {
        return new C28201Rs();
    }

    public static AnonymousClass1QZ A0v(View view) {
        return new AnonymousClass1QZ(view);
    }

    public static File A0w(File file, String str) {
        return new File(file, str);
    }

    public static Boolean A0x(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static Object A11() {
        return new Object();
    }

    public static ArrayList A14(int i) {
        return new ArrayList(i);
    }

    public static ArrayList A15(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashSet A16() {
        return new HashSet();
    }

    public static LinkedHashSet A17() {
        return new LinkedHashSet();
    }

    public static C13180jS A18() {
        return new C13180jS();
    }

    public static AnonymousClass011 A19(Object obj, Object obj2) {
        return new AnonymousClass011(obj, obj2);
    }

    public static C019308f A1A(Class cls) {
        return new C019308f(cls);
    }

    public static JSONObject A1B() {
        return new JSONObject();
    }

    public static JSONObject A1C(String str) {
        return new JSONObject(str);
    }

    public static void A1D(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public static void A1F(Object obj) {
        ((DialogInterface) obj).dismiss();
    }

    public static void A1G(Object obj, StringBuilder sb) {
        C20910yM.A00(obj, "isAGroup", sb);
    }

    public static void A1H(Object obj, StringBuilder sb) {
        C20910yM.A00(obj, "mediaType", sb);
    }

    public static boolean A1K(AnonymousClass155 r2) {
        if (r2.A0A.A00() == 20) {
            return true;
        }
        return false;
    }

    public static boolean A1L(C20800yB r1) {
        return r1.A0E(4136);
    }

    public static boolean A1M(String str) {
        return str.equals("wa_old");
    }

    public static boolean A1N(String str) {
        return str.equals("email_otp");
    }

    public static float A00(Resources resources, int i) {
        return (float) resources.getDimensionPixelSize(i);
    }

    public static float A01(View view) {
        return (float) view.getWidth();
    }

    public static float A02(View view) {
        return (float) view.getHeight();
    }

    public static int A04(Context context) {
        return C224314h.A00(context);
    }

    public static int A05(Resources resources, int i) {
        return (int) resources.getDimension(i);
    }

    public static int A06(Resources resources, int i, int i2) {
        return i2 + resources.getDimensionPixelSize(i);
    }

    public static int A07(View view) {
        return view.getHeight() / 2;
    }

    public static int A09(String str, int i) {
        return str.length() + i;
    }

    public static long A0A(long j) {
        return System.currentTimeMillis() - j;
    }

    public static long A0B(C20800yB r0, int i) {
        return (long) r0.A07(i);
    }

    public static Activity A0D(Reference reference) {
        return (Activity) reference.get();
    }

    public static Context A0G(Reference reference) {
        return (Context) reference.get();
    }

    public static Resources A0J(View view) {
        Resources resources = view.getResources();
        AnonymousClass00C.A08(resources);
        return resources;
    }

    public static View A0R(MenuItem menuItem, int i) {
        menuItem.setActionView(i);
        return menuItem.getActionView();
    }

    public static ViewStub A0S(View view, int i) {
        return (ViewStub) C012005e.A02(view, i);
    }

    public static FrameLayout A0T(View view, int i) {
        return (FrameLayout) C012005e.A02(view, i);
    }

    public static LinearLayout A0U(View view, int i) {
        return (LinearLayout) view.findViewById(i);
    }

    public static TextView A0V(AnonymousClass1RJ r0) {
        return (TextView) r0.A01();
    }

    public static RecyclerView A0c(View view, int i) {
        return (RecyclerView) view.findViewById(i);
    }

    public static TextEmojiLabel A0e(Activity activity, int i) {
        return (TextEmojiLabel) C03570Gk.A0B(activity, i);
    }

    public static AnonymousClass1K3 A0f(C19460v5 r0) {
        return (AnonymousClass1K3) r0.A02();
    }

    public static C25221Fl A0g(AnonymousClass005 r0) {
        return (C25221Fl) r0.get();
    }

    public static C65663Sz A0h(Iterator it) {
        return (C65663Sz) it.next();
    }

    public static AnonymousClass141 A0i(AnonymousClass16D r0, AnonymousClass11F r1) {
        C18740tg.A06(r1);
        return r0.A0D(r1);
    }

    public static AnonymousClass11F A0k(AnonymousClass141 r0, Class cls) {
        return (AnonymousClass11F) r0.A06(cls);
    }

    public static Jid A0m(AnonymousClass00T r0) {
        return (Jid) r0.getValue();
    }

    public static PhoneUserJid A0n(C19730wQ r0) {
        r0.A0G();
        return r0.A03;
    }

    public static UserJid A0o(Iterator it) {
        return (UserJid) it.next();
    }

    public static AnonymousClass2bU A0r(Iterator it) {
        return (AnonymousClass2bU) it.next();
    }

    public static WDSButton A0u(View view, int i) {
        return (WDSButton) view.findViewById(i);
    }

    public static Number A0z(C001600r r0) {
        return (Number) r0.A04();
    }

    public static Number A10(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static boolean A1J(C19730wQ r0) {
        return !r0.A0L();
    }
}
