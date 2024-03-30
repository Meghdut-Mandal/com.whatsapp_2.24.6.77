package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaFragment;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.group.view.custom.GroupDetailsCard;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;
import com.whatsapp.spamreport.ReportSpamDialogFragment;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1kC  reason: invalid class name and case insensitive filesystem */
public abstract class C36371kC {
    public static int A00(int i) {
        return i != 0 ? 2 : 1;
    }

    public static int A01(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, 0);
    }

    public static int A05(C203399nx r2, AbstractMap abstractMap) {
        return AnonymousClass6R8.A00(r2.A0i("size", (String) null), abstractMap.size());
    }

    public static long A07(int i) {
        return ((long) i) * 1000;
    }

    public static Paint A0E() {
        return new Paint(1);
    }

    public static View A0I(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0B(inflate);
        return inflate;
    }

    public static TranslateAnimation A0M() {
        return new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
    }

    public static LinearLayout.LayoutParams A0N() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public static C65073Qp A0W(C220412q r1, AnonymousClass11F r2) {
        return r1.A09(r2, false);
    }

    public static Boolean A0m() {
        return true;
    }

    public static Integer A0n() {
        return 3;
    }

    public static Integer A0o() {
        return 4;
    }

    public static Integer A0p() {
        return 5;
    }

    public static String A0t(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    public static AnonymousClass0AR A12(C023509x r3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r0 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r3));
        r0.A0J();
        return r0;
    }

    public static void A1D(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public static void A1K(AnonymousClass171 r1, AnonymousClass141 r2, Object[] objArr, int i) {
        objArr[i] = r1.A0Q(r2, -1);
    }

    public static void A1L(CommentsBottomSheet commentsBottomSheet, C009003v r4, AnonymousClass05H r5) {
        C18510tH r2 = new C18510tH(r4, r5, 5);
        LifecycleCoroutineScopeImpl A00 = C33311f5.A00(commentsBottomSheet);
        C06820Vf.A01(new AnonymousClass041(A00.A01.plus(commentsBottomSheet.A1m())), r2);
    }

    public static void A1P(C132446Tt r1, C19770wU r2) {
        r2.Bp0(r1, new Void[0]);
    }

    public static boolean A1T(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1U(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static boolean A1V(Object obj) {
        AnonymousClass00C.A0D(obj, 1);
        return false;
    }

    public static boolean A1W(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static String[] A1a(long j) {
        return new String[]{Long.toString(j)};
    }

    public static int A04(C203399nx r2) {
        C203399nx A0c = r2.A0c("error");
        if (A0c != null) {
            return A0c.A0S("code", -2);
        }
        return -2;
    }

    public static int A06(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static long A08(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, -1);
    }

    public static long A0A(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public static Intent A0D(Context context, AnonymousClass11F r3) {
        return new AnonymousClass190().A1Z(context, r3, 0);
    }

    public static Drawable A0F(Drawable drawable, AnonymousClass7fA r3, C27751Pr r4) {
        if (r4.A00.A0E(1257)) {
            return new C91274bk(drawable, r3);
        }
        return new C91284bl(drawable, r3);
    }

    public static Bundle A0G(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        return bundle;
    }

    public static AlphaAnimation A0L() {
        return new AlphaAnimation(1.0f, 0.0f);
    }

    public static C18800tq A0P(Context context) {
        return (C18800tq) C18810tr.A00(context, C18800tq.class);
    }

    public static C18830tt A0Q(C18800tq r1, WaFragment waFragment) {
        C18830tt r12 = r1.A00;
        C32191d8.A00(waFragment, C18830tt.A85(r12));
        return r12;
    }

    public static C32691e2 A0R(C18800tq r0) {
        return (C32691e2) r0.A4R.get();
    }

    public static C24361Cd A0T(C18800tq r0) {
        return (C24361Cd) r0.A1j.get();
    }

    public static AnonymousClass185 A0U(C18800tq r0) {
        return (AnonymousClass185) r0.A8u.get();
    }

    public static AnonymousClass1A5 A0X(C18800tq r0) {
        return (AnonymousClass1A5) r0.A2K.get();
    }

    public static C24381Cf A0Y(C18800tq r0) {
        return (C24381Cf) r0.A2M.get();
    }

    public static C20310xM A0Z(C18800tq r0) {
        return (C20310xM) r0.A2S.get();
    }

    public static C233117z A0c(C18800tq r0) {
        return (C233117z) r0.A3w.get();
    }

    public static AnonymousClass1GQ A0f(C18800tq r0) {
        return (AnonymousClass1GQ) r0.A5a.get();
    }

    public static AnonymousClass1EV A0h(C18800tq r0) {
        return (AnonymousClass1EV) r0.A6K.get();
    }

    public static AnonymousClass1CR A0j(C18800tq r0) {
        return (AnonymousClass1CR) r0.A1i.get();
    }

    public static AnonymousClass1EM A0l(C18800tq r0) {
        return (AnonymousClass1EM) r0.A3l.get();
    }

    public static String A0x(ReportSpamDialogFragment reportSpamDialogFragment) {
        String str = (String) reportSpamDialogFragment.A0R.getValue();
        AnonymousClass00C.A08(str);
        return str;
    }

    public static void A1A(Uri uri, AnonymousClass155 r3) {
        r3.A01.A06(r3, new Intent("android.intent.action.VIEW", uri));
    }

    public static void A1C(Parcelable parcelable, AnonymousClass01z r4, int i) {
        EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = new EphemeralDmKicBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chat_jid", parcelable);
        bundle.putInt("entry_point", i);
        ephemeralDmKicBottomSheetDialog.A17(bundle);
        ephemeralDmKicBottomSheetDialog.A1f(r4, "ephemeral_kic_nux");
    }

    public static void A1F(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass9v5(obj, obj2, i));
    }

    public static void A1G(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static void A1I(TextView textView, C21060yb r2) {
        C012005e.A0V(textView, new C34011gJ(textView, r2));
    }

    public static void A1O(GroupCallButtonController groupCallButtonController) {
        C589831u r0 = groupCallButtonController.A04;
        if (r0 != null) {
            GroupDetailsCard.A03(r0.A00);
        }
    }

    public static void A1Q(C19770wU r1, Object obj, Object obj2, Object obj3, int i) {
        r1.Boy(new C35321iV(obj, obj2, obj3, i));
    }

    public static boolean A1Y(String str, String str2, Object[] objArr) {
        objArr[0] = new AnonymousClass1AL(str, str2);
        return false;
    }

    public static String[] A1b(AbstractCollection abstractCollection, int i) {
        return (String[]) abstractCollection.toArray(new String[i]);
    }

    public static int A02(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static int A03(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static long A09(C19970wo r3) {
        return C19970wo.A00(r3) / 1000;
    }

    public static Context A0B(View view) {
        Context context = view.getContext();
        AnonymousClass00C.A08(context);
        return context;
    }

    public static Intent A0C(Context context) {
        return AnonymousClass190.A03(context).addFlags(603979776);
    }

    public static Bundle A0H(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static View A0J(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        AnonymousClass00C.A08(inflate);
        return inflate;
    }

    public static ViewGroup.MarginLayoutParams A0K(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static AnonymousClass0FM A0O(AlertDialog$Builder alertDialog$Builder) {
        AnonymousClass0FM create = alertDialog$Builder.create();
        AnonymousClass00C.A08(create);
        return create;
    }

    public static WaTextView A0S(TextView textView, NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity, int i) {
        textView.setText(i);
        Object value = newsletterAppealsOutcomeActivity.A0A.getValue();
        AnonymousClass00C.A08(value);
        return (WaTextView) value;
    }

    public static C63193Jc A0V(C18800tq r0) {
        return (C63193Jc) r0.AEl.get();
    }

    public static AnonymousClass141 A0a(AnonymousClass16D r1, AbstractList abstractList, int i) {
        return r1.A0D((AnonymousClass11F) abstractList.get(i));
    }

    public static C1261362r A0b(C18830tt r0) {
        return (C1261362r) r0.A7C.get();
    }

    public static Jid A0d(Iterator it) {
        return ((AnonymousClass141) it.next()).A06(UserJid.class);
    }

    public static PhoneUserJid A0e(C19730wQ r0) {
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        return phoneUserJid;
    }

    public static C28361Si A0g(C18800tq r0) {
        return (C28361Si) r0.A56.get();
    }

    public static AF7 A0i(C18800tq r0) {
        return (AF7) r0.A47.get();
    }

    public static C32661dz A0k(C18800tq r0) {
        return (C32661dz) r0.A0E.get();
    }

    public static Integer A0q(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 18;
    }

    public static Object A0r(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static RuntimeException A0s() {
        AnonymousClass03T.A04();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0u(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0v(C19630wG r0, int i) {
        String A01 = r0.A01(i);
        AnonymousClass00C.A08(A01);
        return A01;
    }

    public static String A0w(C18820ts r3, String str) {
        AnonymousClass00C.A08(str);
        String A05 = C20040wv.A05(r3, TimeUnit.SECONDS.toMillis(Long.parseLong(str)));
        AnonymousClass00C.A08(A05);
        return A05;
    }

    public static String A0y(CharSequence charSequence) {
        return AnonymousClass099.A0D(charSequence).toString();
    }

    public static String A0z(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        return sb.toString();
    }

    public static Iterator A10(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static List A11(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }

    public static void A13(Context context, View view, int i) {
        view.setBackground(AnonymousClass00E.A00(context, i));
    }

    public static void A14(Context context, View view, Object[] objArr, int i) {
        view.setContentDescription(context.getString(i, objArr));
    }

    public static void A15(DialogInterface.OnClickListener onClickListener, AlertDialog$Builder alertDialog$Builder, int i) {
        alertDialog$Builder.setPositiveButton(i, onClickListener);
        alertDialog$Builder.setNegativeButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
    }

    public static void A16(Intent intent, View view) {
        view.getContext().startActivity(intent);
    }

    public static void A17(Intent intent, Jid jid) {
        intent.putExtra("jid", jid.getRawString());
    }

    public static void A18(Intent intent, String str) {
        intent.setType(str);
        intent.addFlags(524288);
    }

    public static void A19(Drawable drawable, View view) {
        drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
    }

    public static void A1B(BaseBundle baseBundle, Jid jid) {
        baseBundle.putString("jid", jid.getRawString());
    }

    public static void A1E(View view, CharSequence charSequence, int i) {
        ((TextView) view.findViewById(i)).setText(charSequence);
    }

    public static void A1H(EditText editText) {
        editText.setText(editText.getEditableText().append(System.getProperty("line.separator")));
        editText.setSelection(editText.getEditableText().length());
    }

    public static void A1J(C18830tt r0, WaDialogFragment waDialogFragment) {
        waDialogFragment.A03 = C18830tt.A85(r0);
    }

    public static void A1M(C18820ts r4, Object[] objArr, int i, int i2) {
        objArr[i2] = r4.A0N().format(((double) i) / 100.0d);
    }

    public static void A1N(MediaPickerFragment mediaPickerFragment, int i) {
        mediaPickerFragment.A01 = i + (mediaPickerFragment.A1Z().A07(2693) - mediaPickerFragment.A1Z().A07(2614));
    }

    public static void A1R(String str, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(list.size());
    }

    public static void A1S(Object[] objArr, int i) {
        objArr[5] = Integer.valueOf(i);
    }

    public static boolean A1X(Object obj, boolean z) {
        return AnonymousClass00C.A0J(obj, Boolean.valueOf(z));
    }

    public static byte[] A1Z(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        return bytes;
    }
}
