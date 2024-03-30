package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.json.JSONObject;

/* renamed from: X.1kG  reason: invalid class name and case insensitive filesystem */
public abstract class C36411kG {
    public static int A02(Parcel parcel) {
        AnonymousClass00C.A0D(parcel, 0);
        return parcel.readInt();
    }

    public static int A08(Object obj) {
        return obj == null ? 8 : 0;
    }

    public static int A09(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static ValueAnimator A0C(int[] iArr, int i) {
        iArr[1] = i;
        return ValueAnimator.ofInt(iArr);
    }

    public static TransitionDrawable A0G(Object obj, Drawable[] drawableArr) {
        drawableArr[1] = obj;
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(150);
        return transitionDrawable;
    }

    public static View A0J(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, true);
    }

    public static View A0L(ViewGroup viewGroup) {
        return viewGroup.getChildAt(0);
    }

    public static C64933Qa A0o(AnonymousClass11F r1, C237919w r2) {
        return r2.A02(r1, true);
    }

    public static C19930wk A0r(C19770wU r2) {
        return new C19930wk(r2, false);
    }

    public static void A1B(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1U(int[] r4, java.lang.Object[] r5, int r6) {
        /*
            r3 = 0
            r2 = 1
            r4[r3] = r6
            r0 = 25
            r5[r0] = r4
            int[] r1 = new int[r2]
            r0 = 128159(0x1f49f, float:1.79589E-40)
            r1[r3] = r0
            r0 = 26
            r5[r0] = r1
            int[] r1 = new int[r2]
            r0 = 128571(0x1f63b, float:1.80166E-40)
            r1[r3] = r0
            r0 = 27
            r5[r0] = r1
            int[] r1 = new int[r2]
            r0 = 128573(0x1f63d, float:1.80169E-40)
            r1[r3] = r0
            r0 = 28
            r5[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36411kG.A1U(int[], java.lang.Object[], int):void");
    }

    public static boolean A1Z(C132446Tt r1) {
        if (r1 != null) {
            r1.A0D(true);
        }
        return true;
    }

    public static Object[] A1b(Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        return objArr;
    }

    public static int A03(Layout layout, TextAndDateLayout textAndDateLayout) {
        int i = textAndDateLayout.A00;
        if (i == 0) {
            return layout.getLineCount() - 1;
        }
        return Math.min(i - 1, layout.getLineCount() - 1);
    }

    public static int A04(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static Intent A0D(AnonymousClass02E r3) {
        Intent intent = new Intent();
        intent.putExtra("bucket_uri", r3.A0i().getIntent().getData());
        return intent;
    }

    public static ShapeDrawable A0F() {
        return new ShapeDrawable(new OvalShape());
    }

    public static C27341Nv A0X(C18800tq r0) {
        return (C27341Nv) r0.A6l.get();
    }

    public static AnonymousClass1XY A0Y(C18800tq r0) {
        return (AnonymousClass1XY) r0.A7c.get();
    }

    public static AnonymousClass17Z A0c(C18800tq r0) {
        return (AnonymousClass17Z) r0.A95.get();
    }

    public static AnonymousClass12O A0d(C18800tq r0) {
        return (AnonymousClass12O) r0.A98.get();
    }

    public static AnonymousClass1LU A0e(C18800tq r0) {
        return (AnonymousClass1LU) r0.A7p.get();
    }

    public static InAppBugReportingViewModel A0g(InAppBugReportingActivity inAppBugReportingActivity) {
        return (InAppBugReportingViewModel) inAppBugReportingActivity.A0Q.getValue();
    }

    public static Jid A0h(AnonymousClass141 r1) {
        return r1.A06(AnonymousClass11F.class);
    }

    public static Jid A0i(String str) {
        return Jid.Companion.A02(str);
    }

    public static PhoneUserJid A0j(AnonymousClass155 r0) {
        C19730wQ r02 = r0.A02;
        r02.A0G();
        return r02.A03;
    }

    public static UserJid A0k(AnonymousClass141 r0) {
        return C222813r.A00(r0.A0H);
    }

    public static AnonymousClass1P5 A0l(C18800tq r0) {
        return (AnonymousClass1P5) r0.A4V.get();
    }

    public static AnonymousClass2XH A0m(C18800tq r0) {
        return (AnonymousClass2XH) r0.A4W.get();
    }

    public static Long A0t() {
        return 0L;
    }

    public static String A0w(Resources resources, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return resources.getString(i2, objArr);
    }

    public static String A0y(CharSequence charSequence, String str) {
        return new C10880fN(str).A00(charSequence, "");
    }

    public static String A0z(Object obj) {
        return ((CharSequence) obj).toString().trim();
    }

    public static StringBuilder A12(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verifyvoice/request/");
        sb.append(str);
        return sb;
    }

    public static C12600iM A16(C023509x r1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12600iM.A01;
        return new C12600iM(AnonymousClass0AA.A01(r1));
    }

    public static void A1C(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C135506co(obj, obj2, i));
    }

    public static void A1D(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public static void A1F(AnonymousClass17Y r1, Object obj, Object obj2, int i) {
        r1.A0H(new C1502074j(obj, obj2, i));
    }

    public static void A1K(AnonymousClass6QB r1, String str, long j) {
        r1.A04(new AnonymousClass1AL(str, j));
    }

    public static void A1M(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C1501974i(obj, obj2, i));
    }

    public static void A1N(Object obj) {
        ((Activity) obj).finish();
    }

    public static void A1O(Object obj) {
        ((Runnable) obj).run();
    }

    public static void A1Q(Object obj, Object obj2, Object[] objArr, int i) {
        objArr[i] = obj;
        objArr[2] = obj2;
    }

    public static void A1R(Object obj, Collection collection) {
        C40801w8 r1;
        if ((obj instanceof C40801w8) && (r1 = (C40801w8) obj) != null) {
            List list = r1.A02;
            list.clear();
            list.addAll(collection);
            r1.A06();
        }
    }

    public static boolean A1V(AnonymousClass141 r0, Object obj) {
        return AnonymousClass00C.A0J(obj, r0.A0H);
    }

    public static boolean A1W(C20800yB r1) {
        return r1.A0E(4023);
    }

    public static boolean A1X(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.A0M.A00(identityVerificationActivity.A0L);
    }

    public static boolean A1Y(C28331Sf r2) {
        return C20800yB.A01(C21000yV.A01, r2.A00, 7341);
    }

    public static int A00() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int A01(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A05(View view) {
        return view.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
    }

    public static int A06(Number number) {
        C18740tg.A06(number);
        AnonymousClass00C.A08(number);
        return number.intValue();
    }

    public static int A07(Number number) {
        AnonymousClass00C.A0B(number);
        return number.intValue();
    }

    public static int A0A(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static long A0B(String str) {
        return Long.parseLong(str) * 1000;
    }

    public static SharedPreferences A0E(AnonymousClass00T r0) {
        return (SharedPreferences) r0.getValue();
    }

    public static Parcelable A0H(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static MenuItem A0I(Menu menu) {
        return menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved);
    }

    public static View A0K(View view) {
        ViewParent parent = view.getParent();
        AnonymousClass00C.A0E(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    public static View A0M(Window window) {
        return window.getDecorView().findViewById(R.id.bot_embodiment_draggable_container);
    }

    public static ViewGroup.MarginLayoutParams A0N(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static ViewGroup A0O(View view, int i) {
        return (ViewGroup) C012005e.A02(view, i);
    }

    public static ViewGroup A0P(View view, int i) {
        return (ViewGroup) view.findViewById(i);
    }

    public static ImageView A0Q(AnonymousClass01L r0, int i) {
        return (ImageView) r0.findViewById(i);
    }

    public static Toolbar A0R(AnonymousClass01L r1) {
        return (Toolbar) r1.findViewById(R.id.toolbar);
    }

    public static AnonymousClass09Y A0S(AnonymousClass02E r1) {
        return new AnonymousClass09Y(r1.A0k());
    }

    public static LifecycleCoroutineScopeImpl A0T(AnonymousClass02E r0) {
        return C33311f5.A00(r0.A0m());
    }

    public static AnonymousClass04J A0U(AnonymousClass01G r0) {
        AnonymousClass04J BJ7 = r0.BJ7();
        AnonymousClass00C.A08(BJ7);
        return BJ7;
    }

    public static AnonymousClass016 A0V(AnonymousClass00T r0) {
        return (AnonymousClass016) r0.getValue();
    }

    public static C225314u A0W(Reference reference) {
        return (C225314u) reference.get();
    }

    public static WaTextView A0Z(View view, int i) {
        return (WaTextView) view.findViewById(i);
    }

    public static C235718z A0a(AnonymousClass005 r0) {
        return (C235718z) r0.get();
    }

    public static C21159AAt A0b(C18800tq r0) {
        return (C21159AAt) r0.A2F.get();
    }

    public static C194349Pi A0f(C18830tt r0) {
        return (C194349Pi) r0.A76.get();
    }

    public static AnonymousClass3T1 A0n(List list, int i) {
        return (AnonymousClass3T1) list.get(i);
    }

    public static C33051ed A0p(C18830tt r0) {
        return (C33051ed) r0.A1L.get();
    }

    public static C19650wI A0q(C18800tq r0) {
        return (C19650wI) r0.A4f.get();
    }

    public static Integer A0s(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 21;
    }

    public static NullPointerException A0u(C19460v5 r1) {
        r1.A02();
        return new NullPointerException("logUserAction");
    }

    public static Object A0v(AnonymousClass005 r0) {
        Object obj = r0.get();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static String A0x(AnonymousClass02E r1) {
        return r1.A0b().getString("jid");
    }

    public static String A10(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        AnonymousClass00C.A08(optString);
        return optString;
    }

    public static String A11(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static ArrayList A13(Object obj) {
        AnonymousClass00C.A08(obj);
        return new ArrayList();
    }

    public static List A14(Iterable iterable, ListIterator listIterator) {
        return C007103b.A0a(iterable, listIterator.nextIndex() + 1);
    }

    public static Set A15(Object obj) {
        Set singleton = Collections.singleton(obj);
        AnonymousClass00C.A08(singleton);
        return singleton;
    }

    public static void A17(Dialog dialog, int i, int i2) {
        AnonymousClass0PN.A00(dialog, i).setVisibility(i2);
    }

    public static void A18(Canvas canvas, Paint paint, Drawable drawable, float f, int i) {
        canvas.save();
        Rect bounds = drawable.getBounds();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f, ((float) i) + (((fontMetrics.ascent + fontMetrics.descent) - ((float) bounds.height())) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void A19(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void A1A(View view, int i) {
        view.getLayoutParams().height = i;
    }

    public static void A1E(TextView textView, NumberFormat numberFormat, long j) {
        textView.setText(numberFormat.format(j));
    }

    public static void A1G(C195209Sx r1, int i) {
        r1.A04 = Integer.valueOf(i);
    }

    public static void A1H(C18820ts r0, String str, Object[] objArr, int i) {
        objArr[i] = r0.A0G(str);
    }

    public static void A1I(C19580wB r1, AnonymousClass00T r2) {
        r1.unregisterObserver(r2.getValue());
    }

    public static void A1J(AnonymousClass1P2 r0) {
        r0.A02().delete();
    }

    public static void A1L(AnonymousClass1RJ r0, int i) {
        r0.A01().setVisibility(i);
    }

    public static void A1P(Object obj) {
        Log.i(obj.toString());
    }

    public static void A1S(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append("/retryAfter=");
    }

    public static void A1T(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static boolean A1a(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }
}
