package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.base.Hilt_WaFragment;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.profile.UsernameViewModel;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.support.faq.FaqItemActivity;
import com.whatsapp.text.AutoSizeTextView;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.io.ByteArrayOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1kF  reason: invalid class name and case insensitive filesystem */
public abstract class C36401kF {
    public static ObjectAnimator A05(Object obj, float f) {
        return ObjectAnimator.ofFloat(obj, View.ALPHA, new float[]{f});
    }

    public static Bitmap A09(Context context, C27761Ps r7, AnonymousClass141 r8, int i) {
        return r7.A07(context, r8, 0.0f, i, false);
    }

    public static Drawable A0B(View view, PopupWindow popupWindow, int i) {
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        Context context = view.getContext();
        if (i == 0) {
            return AnonymousClass3UF.A02(context, R.drawable.panel, C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        Drawable A00 = AnonymousClass00E.A00(context, R.drawable.emoji_skin_popup_background);
        popupWindow.setElevation(4.0f);
        return A00;
    }

    public static Integer A0h() {
        return 7;
    }

    public static String A0p(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return null;
        }
        return intent.getStringExtra(str);
    }

    public static void A16(Menu menu) {
        if (menu != null) {
            menu.add(0, 1, 0, R.string.f12nameremoved);
        }
    }

    public static void A17(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static void A18(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, -1, -2);
    }

    public static void A19(ImageView imageView, TextEmojiLabel textEmojiLabel, AnonymousClass1RY r4, AnonymousClass141 r5) {
        r4.A08(imageView, r5);
        if (r5.A0X != null) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0I(r5.A0X);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    public static void A1D(C225314u r1, int i, int i2) {
        r1.BO9(new Object[0], i, i2);
    }

    public static void A1G(C194349Pi r7, String str, int i, int i2, int i3) {
        r7.A00(str, (String) null, i, i2, i3, 3);
    }

    public static void A1H(PopupNotification popupNotification, AnonymousClass1YV r2) {
        AnonymousClass1YV.A02(r2, true);
        AnonymousClass3T1 r0 = popupNotification.A16;
        if (r0 != null) {
            popupNotification.A1Z.add(r0.A1J);
        }
    }

    public static void A1K(WallPaperView wallPaperView) {
        wallPaperView.A03 = false;
        wallPaperView.setImageDrawable((Drawable) null);
        wallPaperView.invalidate();
    }

    public static void A1R(Object obj, Object obj2, Object[] objArr) {
        objArr[4] = obj;
        objArr[5] = obj2;
    }

    public static boolean A1U(int i) {
        return i >= 0;
    }

    public static int A01(AnonymousClass17X r0, AnonymousClass144 r1) {
        return r0.A07.A0C(r1).A08.size();
    }

    public static Intent A06(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.EditCommunityActivity");
        intent.putExtra("extra_community_jid", AnonymousClass143.A03(jid));
        return intent;
    }

    public static Intent A07(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.VerifyEmailActivity");
        intent.putExtra("email", str);
        intent.putExtra("state", i);
        return intent;
    }

    public static Intent A08(String str) {
        Intent intent = new Intent();
        intent.putExtra("jid", str);
        return intent;
    }

    public static Uri.Builder A0C() {
        return new Uri.Builder().scheme("content").authority(MediaProvider.A0B);
    }

    public static C225314u A0L(Object obj) {
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return (C225314u) obj;
    }

    public static Me A0M(AnonymousClass155 r0) {
        C19730wQ r02 = r0.A02;
        r02.A0G();
        return r02.A00;
    }

    public static MemberSuggestedGroupsManagementViewModel A0T(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity) {
        return (MemberSuggestedGroupsManagementViewModel) memberSuggestedGroupsManagementActivity.A0G.getValue();
    }

    public static C235618y A0U(C18800tq r0) {
        return (C235618y) r0.A15.get();
    }

    public static AnonymousClass1NM A0W(C18800tq r0) {
        return (AnonymousClass1NM) r0.A1c.get();
    }

    public static C21520zN A0Y(C18800tq r0) {
        return (C21520zN) r0.A01.get();
    }

    public static UserJid A0b(Jid jid) {
        C222813r r0 = UserJid.Companion;
        return C222813r.A00(jid);
    }

    public static C29501Ww A0d(C18800tq r0) {
        return (C29501Ww) r0.A7K.get();
    }

    public static AnonymousClass1N2 A0f(C18800tq r0) {
        return (AnonymousClass1N2) r0.A43.get();
    }

    public static AnonymousClass1SV A0g(C18800tq r0) {
        return (AnonymousClass1SV) r0.A5I.get();
    }

    public static Integer A0i() {
        return 9;
    }

    public static Integer A0j() {
        return 10;
    }

    public static Integer A0k() {
        return 14;
    }

    public static String A0q(AnonymousClass02E r0, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return r0.A0o(i2, objArr);
    }

    public static Locale A0x(C18820ts r0) {
        return C18820ts.A01(r0.A00);
    }

    public static AnonymousClass03P A0y() {
        C005502l r0 = C006702x.A00;
        return AnonymousClass03K.A00.A05();
    }

    public static void A15(SpannableString spannableString, String str, String str2, String str3) {
        URLSpan uRLSpan = new URLSpan(str);
        int indexOf = str2.indexOf(str3);
        spannableString.setSpan(uRLSpan, indexOf, indexOf + str3.length(), 33);
    }

    public static void A1C(C225314u r2) {
        r2.A2O(r2.A00, r2.A05);
    }

    public static void A1I(UsernameViewModel usernameViewModel, Integer num) {
        UsernameViewModel.A02(usernameViewModel, num, usernameViewModel.A04.A0B());
    }

    public static void A1J(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.A0s.A03("failTooMany");
        verifyPhoneNumber.A0s.A02("verify-tmg");
    }

    public static void A1O(Object obj, int i, int i2) {
        WDSActionTile wDSActionTile;
        if ((obj instanceof WDSActionTile) && (wDSActionTile = (WDSActionTile) obj) != null) {
            wDSActionTile.setIcon(i);
            wDSActionTile.setText(i2);
        }
    }

    public static void A1P(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[25] = obj;
        objArr[26] = obj2;
        objArr[27] = obj3;
        objArr[28] = obj4;
    }

    public static void A1Q(Object obj, Object obj2, Object[] objArr) {
        objArr[8] = obj;
        objArr[9] = obj2;
    }

    public static boolean A1V(C225314u r1) {
        return r1.A0D.A0E(3792);
    }

    public static boolean A1W(C235718z r0) {
        return ((C25731Hl) r0.A0B.get()).A03();
    }

    public static boolean A1Y(C20800yB r1) {
        return r1.A0E(5868);
    }

    public static boolean A1Z(C20800yB r2) {
        return C20800yB.A01(C21000yV.A01, r2, 5141);
    }

    public static byte[] A1b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int A00(C001600r r0) {
        return ((List) r0.A04()).size();
    }

    public static int A02(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static long A03(long j) {
        return (AnonymousClass6XI.A01(j) - System.currentTimeMillis()) + 1000;
    }

    public static long A04(C20800yB r2, int i) {
        return ((long) r2.A07(i)) * 1048576;
    }

    public static ColorDrawable A0A(View view) {
        return new ColorDrawable(AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved));
    }

    public static SpannableStringBuilder A0D(TextView textView, C21060yb r4, C19890wg r5, CharSequence charSequence) {
        float textSize = textView.getPaint().getTextSize();
        int A01 = AnonymousClass1K2.A01(r4, r5);
        int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A01 < 2011) {
            i = 512;
        }
        return new SpannableStringBuilder(AnonymousClass6YV.A01(charSequence, textSize, -16777216, i, false));
    }

    public static View A0E(ViewStub viewStub, int i) {
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static View A0F(AnonymousClass00T r0) {
        return (View) r0.getValue();
    }

    public static ImageView A0G(View view, int i) {
        return (ImageView) C012005e.A02(view, i);
    }

    public static TextView A0H(Activity activity, int i) {
        return (TextView) C03570Gk.A0B(activity, i);
    }

    public static AnonymousClass04K A0I(AnonymousClass02E r0) {
        return r0.A0i().BAv();
    }

    public static AnonymousClass1NC A0J(C18800tq r0) {
        return (AnonymousClass1NC) r0.A0C.get();
    }

    public static C32571dq A0K(Hilt_WaFragment hilt_WaFragment) {
        return (C32571dq) hilt_WaFragment.generatedComponent();
    }

    public static C21360z5 A0N(C18800tq r0) {
        return (C21360z5) r0.A7P.get();
    }

    public static TextEmojiLabel A0O(View view, int i) {
        return (TextEmojiLabel) C012005e.A02(view, i);
    }

    public static TextEmojiLabel A0P(View view, int i) {
        return (TextEmojiLabel) view.findViewById(i);
    }

    public static WaTextView A0Q(View view, int i) {
        return (WaTextView) C012005e.A02(view, i);
    }

    public static AnonymousClass18U A0R(AppAuthenticationActivity appAuthenticationActivity) {
        return (AnonymousClass18U) appAuthenticationActivity.A3K().get();
    }

    public static AnonymousClass16L A0S(C18800tq r0) {
        return (AnonymousClass16L) r0.A0q.get();
    }

    public static AnonymousClass1A6 A0V(C18800tq r0) {
        return (AnonymousClass1A6) r0.A2P.get();
    }

    public static AnonymousClass3HC A0X(C18830tt r0) {
        return (AnonymousClass3HC) r0.A6M.get();
    }

    public static AnonymousClass11F A0Z(Intent intent, String str) {
        return AnonymousClass11F.A00.A02(intent.getStringExtra(str));
    }

    public static AnonymousClass11F A0a(Iterator it) {
        return (AnonymousClass11F) it.next();
    }

    public static C20720y3 A0c(C18800tq r0) {
        return (C20720y3) r0.A52.get();
    }

    public static C32811eE A0e(C18800tq r0) {
        return (C32811eE) r0.A0F.get();
    }

    public static Integer A0l(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 20;
    }

    public static Object A0m(C001600r r0) {
        Object A04 = r0.A04();
        AnonymousClass00C.A08(A04);
        return A04;
    }

    public static Object A0n(List list) {
        return list.get(list.size() - 1);
    }

    public static String A0o(Context context, int i) {
        return context.getResources().getString(i);
    }

    public static String A0r(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(" AND ");
        return " AND ";
    }

    public static String A0s(List list, int i) {
        return (String) list.get(i);
    }

    public static StringBuilder A0t(Object obj, int i) {
        AnonymousClass00C.A0D(obj, i);
        return new StringBuilder();
    }

    public static ArrayList A0u(Intent intent, Class cls, String str) {
        return AnonymousClass143.A06(cls, intent.getStringArrayListExtra(str));
    }

    public static ArrayList A0v(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static List A0w(C001600r r0) {
        return (List) r0.A04();
    }

    public static void A0z(int i, Paint paint) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A10(Context context, Boolean bool) {
        C225314u r1 = (C225314u) C24801Dv.A00(context);
        if (bool.booleanValue()) {
            r1.Bu1(R.string.f12nameremoved);
        } else {
            r1.Bnv();
        }
    }

    public static void A11(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, AlertDialog$Builder alertDialog$Builder, int i) {
        alertDialog$Builder.setPositiveButton(i, onClickListener);
        alertDialog$Builder.setNegativeButton(R.string.f12nameremoved, onClickListener2);
    }

    public static void A12(Path path, View view) {
        path.lineTo((float) ((view.getWidth() * 9) / 10), (float) ((view.getHeight() * 3) / 4));
    }

    public static void A13(Path path, View view) {
        path.moveTo((float) ((view.getWidth() * 9) / 10), (float) ((view.getHeight() * 9) / 10));
    }

    public static void A14(BaseBundle baseBundle, Jid jid, String str) {
        baseBundle.putString(str, jid.getRawString());
    }

    public static void A1A(TextView textView, AnonymousClass00T r2) {
        textView.setText((String) r2.getValue());
    }

    public static void A1B(AnonymousClass01L r0, int i) {
        r0.findViewById(i).setVisibility(0);
    }

    public static void A1E(AnonymousClass1X4 r0, AnonymousClass3T1 r1) {
        r0.A0T(r1);
        r0.A0X.A0h(r1);
    }

    public static void A1F(C195209Sx r1, int i) {
        r1.A06 = Integer.valueOf(i);
    }

    public static void A1L(FaqItemActivity faqItemActivity) {
        faqItemActivity.A02 += System.currentTimeMillis() - faqItemActivity.A01;
        faqItemActivity.A01 = System.currentTimeMillis();
        faqItemActivity.setResult(-1, new Intent().putExtra("article_id", faqItemActivity.A00).putExtra("total_time_spent", faqItemActivity.A02));
    }

    public static void A1M(AutoSizeTextView autoSizeTextView) {
        autoSizeTextView.A09();
        autoSizeTextView.A00 = 0.0f;
        autoSizeTextView.A01 = 0.0f;
        autoSizeTextView.A02 = 0;
        autoSizeTextView.A03 = null;
    }

    public static void A1N(C42581z3 r3, List list, int i) {
        List list2 = AnonymousClass0D3.A0I;
        r3.A0B((C55652uy) list.get(i), (List) null);
    }

    public static void A1S(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", contact=");
    }

    public static void A1T(Object[] objArr, int i, long j) {
        objArr[i] = Long.toString(j);
    }

    public static boolean A1X(C18820ts r0) {
        return C18820ts.A00(r0).A06;
    }

    public static boolean A1a(List list) {
        return !list.isEmpty();
    }
}
