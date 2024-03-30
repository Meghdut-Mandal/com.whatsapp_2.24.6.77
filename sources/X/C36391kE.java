package X;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.RectF;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.base.Hilt_WaDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import com.whatsapp.wds.components.bottomsheet.Hilt_WDSBottomSheetDialogFragment;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kE  reason: invalid class name and case insensitive filesystem */
public abstract class C36391kE {
    public static int A00(int i) {
        return i != 0 ? 1 : 2;
    }

    public static Intent A0F(Context context, AnonymousClass190 r2, AnonymousClass11F r3) {
        return r2.A1Z(context, r3, 0);
    }

    public static SpannableString A0K(Object obj, String str) {
        SpannableString spannableString = new SpannableString(obj.toString());
        spannableString.setSpan(new StyleSpan(1), 0, str.length() + 2, 33);
        return spannableString;
    }

    public static ScaleAnimation A0M(float f, float f2) {
        return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
    }

    public static Object A0t(List list) {
        return list.get(0);
    }

    public static String A0x(C203399nx r1, String str) {
        return r1.A0i(str, (String) null);
    }

    public static void A1D(BaseBundle baseBundle, ImageView imageView, String str) {
        int i = baseBundle.getInt(str);
        AnonymousClass00C.A0D(imageView, 0);
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
    }

    public static void A1F(Menu menu, int i, int i2) {
        menu.add(0, i, 0, i2).setShowAsAction(0);
    }

    public static void A1Q(C132446Tt r1, C19770wU r2) {
        r2.Box(r1, new Void[0]);
    }

    public static boolean A1Y(C20800yB r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A0E(3223);
    }

    public static int A01(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static long A0B(long j) {
        return j / 1000;
    }

    public static long A0C(AnonymousClass141 r1) {
        AnonymousClass3IL r0 = r1.A0F;
        if (r0 == null) {
            return 0;
        }
        return r0.A00;
    }

    public static Intent A0G(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static C19700wN A0V(C18800tq r0) {
        return (C19700wN) r0.A2U.get();
    }

    public static C18800tq A0W(Object obj) {
        return ((C27861Qc) ((C27851Qb) obj)).A0M;
    }

    public static AnonymousClass1ND A0Y(C18800tq r0) {
        return (AnonymousClass1ND) r0.A1N.get();
    }

    public static C235718z A0Z(C18800tq r0) {
        return (C235718z) r0.A1Z.get();
    }

    public static C28431Sq A0b(C18800tq r0) {
        return (C28431Sq) r0.A1r.get();
    }

    public static C19600wD A0c(C18800tq r0) {
        return (C19600wD) r0.A24.get();
    }

    public static C25271Fq A0d(C18800tq r0) {
        return (C25271Fq) r0.A9D.get();
    }

    public static AnonymousClass16E A0e(C18800tq r0) {
        return (AnonymousClass16E) r0.A80.get();
    }

    public static C27591Ow A0g(C18800tq r0) {
        return (C27591Ow) r0.A5M.get();
    }

    public static UserJid A0i(AnonymousClass141 r1) {
        AnonymousClass11F r12 = r1.A0H;
        C222813r r0 = UserJid.Companion;
        return C222813r.A00(r12);
    }

    public static AnonymousClass1DU A0j(C18800tq r0) {
        return (AnonymousClass1DU) r0.A4T.get();
    }

    public static C203399nx A0m(C203399nx r2, AnonymousClass1AL[] r3) {
        return new C203399nx(r2, "iq", r3);
    }

    public static ErrorDialogFragment A0n(int i) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_ERROR_CODE", i);
        errorDialogFragment.A17(bundle);
        return errorDialogFragment;
    }

    public static C28781Ua A0p(C18800tq r0) {
        return (C28781Ua) r0.A9d.get();
    }

    public static Integer A0r() {
        return 8;
    }

    public static String A0v(Context context, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return context.getString(i2, objArr);
    }

    public static String A0w(AnonymousClass155 r0) {
        return r0.A02.A0A.A02();
    }

    public static StringBuilder A0z() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        return sb;
    }

    public static Map A11(Object obj, Object obj2) {
        return C000300d.A03(new AnonymousClass011(obj, obj2));
    }

    public static AnonymousClass0A6 A12(C009003v r2, AnonymousClass040 r3) {
        return AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, r2, r3);
    }

    public static void A13(Animator animator) {
        animator.setInterpolator(new DecelerateInterpolator());
    }

    public static void A19(Context context, AnonymousClass07B r4) {
        View view = new View(context);
        if (r4.A0B() == null) {
            r4.A0O(view, new C013405v(-1, -1));
        }
    }

    public static void A1G(View view, ViewGroup viewGroup, int i, int i2) {
        viewGroup.addView(view, new FrameLayout.LayoutParams(i, i, i2));
    }

    public static void A1H(View view, WaButtonWithLoader waButtonWithLoader) {
        waButtonWithLoader.setSize(C34271gk.SMALL);
        ViewParent parent = view.getParent();
        AnonymousClass00C.A0E(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((AnonymousClass0BJ) layoutParams).A0K = waButtonWithLoader.getId();
        waButtonWithLoader.getLayoutParams().width = -2;
        waButtonWithLoader.findViewById(R.id.button_view).getLayoutParams().width = -2;
    }

    public static void A1I(View view, Object obj, int i) {
        view.setOnClickListener(new C207349ux(obj, i));
    }

    public static void A1K(TextView textView) {
        textView.setText("");
    }

    public static void A1L(TextView textView, MessageDetailsActivity messageDetailsActivity, long j) {
        textView.setText(AnonymousClass3UY.A0B(messageDetailsActivity.A00, messageDetailsActivity.A07.A08(j)));
    }

    public static void A1O(AnonymousClass141 r1, Set set) {
        r1.A0x = set.contains(r1.A06(AnonymousClass11F.class));
    }

    public static void A1P(PopupNotification popupNotification) {
        AnonymousClass141 r2 = popupNotification.A0l;
        if (r2 != null) {
            popupNotification.A1Y.add(r2.A06(AnonymousClass11F.class));
        }
    }

    public static void A1R(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new AVa(obj, obj2, i));
    }

    public static void A1S(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C1498072v(obj, obj2, i));
    }

    public static void A1T(Object obj) {
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0D(obj, 1);
    }

    public static void A1U(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 9);
        AnonymousClass00C.A0D(obj2, 10);
    }

    public static void A1V(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static boolean A1X(C20800yB r1) {
        return r1.A0E(1967);
    }

    public static boolean A1Z(AnonymousClass1GQ r1) {
        return AnonymousClass1GQ.A01(r1, 3877);
    }

    public static int A02(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static int A03(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A04(Context context) {
        return C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A05(Context context) {
        return AnonymousClass00F.A00(context, C224314h.A00(context));
    }

    public static int A06(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static int A07(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static int A08(View view) {
        return C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public static int A09(AnonymousClass01L r0, int i) {
        r0.findViewById(i).setVisibility(8);
        return 8;
    }

    public static int A0A(Object obj) {
        return obj.hashCode() * 31;
    }

    public static long A0D(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static Activity A0E(View view) {
        return C24801Dv.A01(view.getContext(), AnonymousClass155.class);
    }

    public static SharedPreferences A0H(AnonymousClass005 r0) {
        return (SharedPreferences) r0.get();
    }

    public static Resources A0I(Context context, Object obj) {
        AnonymousClass00C.A08(obj);
        Resources resources = context.getResources();
        AnonymousClass00C.A08(resources);
        return resources;
    }

    public static RectF A0J(ConversationRowImage$RowImageView conversationRowImage$RowImageView) {
        conversationRowImage$RowImageView.A03();
        conversationRowImage$RowImageView.A0I = false;
        conversationRowImage$RowImageView.A0G = false;
        conversationRowImage$RowImageView.A06 = 0;
        conversationRowImage$RowImageView.A05 = 0;
        conversationRowImage$RowImageView.A0H = false;
        conversationRowImage$RowImageView.A08 = 0;
        conversationRowImage$RowImageView.A07 = 0;
        return new RectF();
    }

    public static View A0L(AnonymousClass1RJ r0, int i) {
        r0.A03(i);
        return r0.A01();
    }

    public static ImageView A0N(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static TextView A0O(View view, int i) {
        return (TextView) C012005e.A02(view, i);
    }

    public static TextView A0P(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    public static TextView A0Q(AnonymousClass01L r0, int i) {
        return (TextView) r0.findViewById(i);
    }

    public static AnonymousClass67A A0R(String str) {
        Uri A01 = C133036Wk.A01(str);
        AnonymousClass00C.A08(A01);
        AnonymousClass68X r3 = new AnonymousClass68X();
        r3.A02("https");
        r3.A01(A01.getHost());
        C125245zZ A00 = r3.A00();
        AnonymousClass00C.A08(A00);
        C1257361b r1 = new C1257361b();
        r1.A00.add(A00);
        return r1.A00();
    }

    public static C19460v5 A0S(C18800tq r0) {
        return (C19460v5) r0.A5v.get();
    }

    public static C32571dq A0T(Hilt_WaDialogFragment hilt_WaDialogFragment) {
        return (C32571dq) hilt_WaDialogFragment.generatedComponent();
    }

    public static C32571dq A0U(Hilt_WDSBottomSheetDialogFragment hilt_WDSBottomSheetDialogFragment) {
        return (C32571dq) hilt_WDSBottomSheetDialogFragment.generatedComponent();
    }

    public static AnonymousClass1N3 A0X(C18800tq r0) {
        return (AnonymousClass1N3) r0.A9B.get();
    }

    public static AnonymousClass3L5 A0a(C18800tq r0) {
        return (AnonymousClass3L5) r0.A1Y.get();
    }

    public static AnonymousClass141 A0f(Iterator it) {
        return (AnonymousClass141) it.next();
    }

    public static UserJid A0h(BaseBundle baseBundle, String str) {
        return UserJid.Companion.A02(baseBundle.getString(str));
    }

    public static AnonymousClass1P3 A0k(C18800tq r0) {
        return (AnonymousClass1P3) r0.AX7.get();
    }

    public static AnonymousClass3T1 A0l(Iterator it) {
        return (AnonymousClass3T1) it.next();
    }

    public static AnonymousClass1X8 A0o(C18800tq r0) {
        return (AnonymousClass1X8) r0.AdX.get();
    }

    public static Boolean A0q(C20800yB r0, int i) {
        return Boolean.valueOf(r0.A0E(i));
    }

    public static Object A0s(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        abstractMap.put(obj, arrayList);
        return arrayList;
    }

    public static String A0u(Activity activity) {
        return activity.getIntent().getStringExtra("session_id");
    }

    public static String A0y(String str, Locale locale, Object[] objArr, int i) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i));
        AnonymousClass00C.A08(format);
        return format;
    }

    public static Iterator A10(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static void A14(Activity activity) {
        AnonymousClass1RC.A04(activity, C224314h.A00(activity));
    }

    public static void A15(Activity activity, int i) {
        activity.setTitle(activity.getString(i));
    }

    public static void A16(Activity activity, int i, int i2) {
        C03570Gk.A0B(activity, i).setVisibility(i2);
    }

    public static void A17(AlertDialog alertDialog, Context context, int i) {
        alertDialog.setMessage(context.getString(i));
    }

    public static void A18(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(AnonymousClass00E.A00(context, i));
    }

    public static void A1A(Context context, C24801Dv r2, AnonymousClass141 r3, AnonymousClass190 r4) {
        r2.A07(context, r4.A1W(context, r3));
    }

    public static void A1B(Resources.Theme theme, Resources resources, ImageView imageView, AnonymousClass7fA r5, C27751Pr r6) {
        imageView.setImageDrawable(C27751Pr.A00(theme, resources, r5, r6.A00, R.drawable.vec_ic_avatar_community));
    }

    public static void A1C(Resources resources, View view, int i) {
        view.setBackgroundColor(resources.getColor(i));
    }

    public static void A1E(Parcel parcel, Enum enumR) {
        parcel.writeString(enumR.name());
    }

    public static void A1J(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A1M(C02800By r1, Object obj, List list) {
        list.remove(obj);
        if (!r1.A0D()) {
            r1.A05();
        }
    }

    public static void A1N(C21060yb r2) {
        Vibrator A0H = r2.A0H();
        C18740tg.A06(A0H);
        A0H.vibrate(75);
    }

    public static void A1W(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static boolean A1a(AnonymousClass1S3 r0) {
        return !r0.A03().isEmpty();
    }

    public static byte[] A1b(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
