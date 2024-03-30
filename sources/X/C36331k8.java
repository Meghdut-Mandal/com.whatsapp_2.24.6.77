package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.1k8  reason: invalid class name and case insensitive filesystem */
public abstract class C36331k8 {
    public static C18950u5 A0H() {
        return new C18950u5(1, 1, 1, false);
    }

    public static String A0g(C18820ts r4, int i, int i2, int i3) {
        Object[] objArr = new Object[1];
        objArr[i2] = Integer.valueOf(i);
        return r4.A0L(objArr, i3, (long) i);
    }

    public static void A0m(Activity activity) {
        activity.setResult(-1);
        activity.finish();
    }

    public static void A0o(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A0x(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A13(C001600r r1) {
        r1.A0C(true);
    }

    public static void A1F(C132446Tt r1, C19770wU r2) {
        r2.Box(r1, new Void[0]);
    }

    public static void A1H(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 4);
        AnonymousClass00C.A0D(obj2, 5);
    }

    public static void A1I(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, 1);
    }

    public static void A1N(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1U(boolean z) {
        C31111bI.A00("onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0], z);
    }

    public static void A1W(Object[] objArr, int i) {
        objArr[0] = Integer.valueOf(i);
    }

    public static boolean A1a(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, 1);
        return true;
    }

    public static int A01(Iterable iterable) {
        int A02 = C000300d.A02(AnonymousClass03U.A06(iterable, 10));
        if (A02 < 16) {
            return 16;
        }
        return A02;
    }

    public static SharedPreferences.Editor A05(C19420v0 r0) {
        return ((SharedPreferences) r0.A00.get()).edit();
    }

    public static SharedPreferences A06(C225314u r0) {
        return (SharedPreferences) r0.A09.A00.get();
    }

    public static Bundle A07(Jid jid) {
        Bundle bundle = new Bundle();
        bundle.putString("jid", jid.getRawString());
        return bundle;
    }

    public static LayoutInflater A08(LayoutInflater layoutInflater, AnonymousClass02E r2) {
        return layoutInflater.cloneInContext(new C32531dl(layoutInflater, r2));
    }

    public static LayoutInflater A09(View view) {
        List list = AnonymousClass0D3.A0I;
        return LayoutInflater.from(view.getContext());
    }

    public static C18820ts A0C(Object obj) {
        return (C18820ts) ((C27861Qc) ((C27851Qb) obj)).A0M.A9X.get();
    }

    public static AnonymousClass11F A0G(AnonymousClass141 r1) {
        Jid A06 = r1.A06(AnonymousClass11F.class);
        C18740tg.A06(A06);
        return (AnonymousClass11F) A06;
    }

    public static RuntimeException A0W() {
        AnonymousClass00C.A0G("systemServices");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0X() {
        AnonymousClass00C.A0G("waIntents");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0Y() {
        AnonymousClass00C.A0G("adapter");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0Z() {
        AnonymousClass00C.A0G("contactManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0a() {
        AnonymousClass00C.A0G("viewModel");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0b() {
        AnonymousClass00C.A0G("linkifier");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0c() {
        AnonymousClass00C.A0G("waContactNames");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0h(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static StringBuilder A0k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void A0y(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A0z(TextView textView, C225314u r3, C20810yC r4) {
        textView.setMovementMethod(new C34021gK(r4));
        C012005e.A0V(textView, new C34011gJ(textView, r3.A08));
    }

    public static void A10(TextView textView, C20810yC r2) {
        textView.setMovementMethod(new C34021gK(r2));
    }

    public static void A14(C27111My r1, C18800tq r2, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A18 = (C33081eg) r1.A0S.get();
        contactPickerFragment.A1G = (AnonymousClass1IN) r2.A2Y.get();
        contactPickerFragment.A0O = (AnonymousClass3Bu) r1.A1S.get();
    }

    public static void A15(C18800tq r0, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        C111955d7.A00(C18830tt.A85(r0.A00), wDSBottomSheetDialogFragment);
    }

    public static void A16(TextEmojiLabel textEmojiLabel, C21060yb r2) {
        textEmojiLabel.setAccessibilityHelper(new C34011gJ(textEmojiLabel, r2));
    }

    public static void A1A(C20810yC r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C34021gK(r1));
    }

    public static void A1B(Jid jid, String str, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        objArr[3] = new AnonymousClass1AL(jid, "to");
    }

    public static void A1C(AnonymousClass6QB r8, String str) {
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r8.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
    }

    public static void A1D(AnonymousClass6QB r1, String str, String str2) {
        r1.A04(new AnonymousClass1AL(str, str2));
    }

    public static void A1E(C132446Tt r1) {
        if (r1 != null) {
            r1.A0D(true);
        }
    }

    public static void A1J(Object obj, Object obj2) {
        C006302t r1 = (C006302t) obj;
        AnonymousClass00C.A0D(r1, 0);
        r1.invoke(obj2);
    }

    public static void A1K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 23);
        AnonymousClass00C.A0D(obj2, 24);
        AnonymousClass00C.A0D(obj3, 25);
        AnonymousClass00C.A0D(obj4, 26);
        AnonymousClass00C.A0D(obj5, 27);
    }

    public static void A1L(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[14] = obj;
        objArr[15] = obj2;
        objArr[16] = obj3;
        objArr[17] = obj4;
    }

    public static void A1M(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[18] = obj;
        objArr[19] = obj2;
        objArr[20] = obj3;
        objArr[21] = obj4;
    }

    public static void A1R(String str, Object[] objArr, int i) {
        objArr[i] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
    }

    public static void A1T(C009003v r2, AnonymousClass040 r3) {
        AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, r2, r3);
    }

    public static boolean A1Y(AnonymousClass1NG r1, AnonymousClass141 r2) {
        return r1.A0O((UserJid) r2.A06(UserJid.class));
    }

    public static int A00(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A02(AnonymousClass00T r0) {
        return ((Number) r0.getValue()).intValue();
    }

    public static Intent A03(AnonymousClass02E r0) {
        AnonymousClass01I A0h = r0.A0h();
        if (A0h != null) {
            return A0h.getIntent();
        }
        return null;
    }

    public static Intent A04(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static AnonymousClass04R A0A(AnonymousClass02E r1) {
        return new AnonymousClass04H(r1.A0i()).A00(EncBackupViewModel.class);
    }

    public static C18800tq A0B(C224814n r0) {
        return ((C27111My) ((C27101Mx) r0.generatedComponent())).A5g;
    }

    public static C20810yC A0D(C18800tq r1, C18830tt r2, WaFragment waFragment) {
        C32191d8.A00(waFragment, C18830tt.A85(r2));
        return (C20810yC) r1.A02.get();
    }

    public static C20810yC A0E(C18800tq r1, C18830tt r2, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        C111955d7.A00(C18830tt.A85(r2), wDSBottomSheetDialogFragment);
        return (C20810yC) r1.A02.get();
    }

    public static AnonymousClass11F A0F(Activity activity) {
        return AnonymousClass11F.A00.A02(activity.getIntent().getStringExtra("jid"));
    }

    public static C20380xT A0I(C18800tq r0) {
        return (C20380xT) r0.ANA.get();
    }

    public static Integer A0J(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 1;
    }

    public static Integer A0K(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 2;
    }

    public static Integer A0L(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 3;
    }

    public static Integer A0M(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 4;
    }

    public static Integer A0N(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 5;
    }

    public static Integer A0O(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 6;
    }

    public static Integer A0P(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 7;
    }

    public static Integer A0Q(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 8;
    }

    public static Integer A0R(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 9;
    }

    public static Integer A0S(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 10;
    }

    public static Integer A0T(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 11;
    }

    public static Integer A0U(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 12;
    }

    public static Integer A0V(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return 13;
    }

    public static RuntimeException A0d(String str) {
        AnonymousClass00C.A0G(str);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0e(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getStringExtra("extra_referral_screen");
        }
        return null;
    }

    public static String A0f(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0i(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static String A0j(StringBuilder sb, long j) {
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public static void A0l(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
    }

    public static void A0n(Activity activity) {
        AnonymousClass1RC.A05(activity, C224314h.A01(activity, R.attr.f4nameremoved));
    }

    public static void A0p(ProgressDialog progressDialog, CharSequence charSequence) {
        progressDialog.setMessage(charSequence);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
    }

    public static void A0q(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A0r(Context context, TextView textView, int i) {
        textView.setTextColor(AnonymousClass00F.A00(context, i));
    }

    public static void A0s(Context context, Toolbar toolbar, C18820ts r3, int i) {
        toolbar.setNavigationIcon((Drawable) new C100744vb(AnonymousClass00E.A00(context, i), r3));
    }

    public static void A0t(Context context, C32691e2 r3, String str) {
        r3.Bp7(context, Uri.parse(str), (AnonymousClass3T1) null);
    }

    public static void A0u(Intent intent, Jid jid, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("jid", jid.getRawString());
    }

    public static void A0v(Intent intent, Jid jid, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("jid", AnonymousClass143.A03(jid));
    }

    public static void A0w(SharedPreferences.Editor editor, String str, boolean z) {
        editor.putBoolean(str, z).apply();
    }

    public static void A11(AnonymousClass01L r0, int i) {
        r0.findViewById(i).setVisibility(8);
    }

    public static void A12(DialogFragment dialogFragment, AnonymousClass01I r3) {
        dialogFragment.A1f(r3.getSupportFragmentManager(), (String) null);
    }

    public static void A17(WaFragment waFragment) {
        C32191d8.A00(waFragment, C18830tt.A85(((C32581dr) ((C32571dq) waFragment.generatedComponent())).A1K.A00));
    }

    public static void A18(C19420v0 r0, String str, boolean z) {
        C19420v0.A00(r0).putBoolean(str, z).apply();
    }

    public static void A19(AnonymousClass163 r0, AnonymousClass11F r1, Object[] objArr, int i) {
        objArr[i] = String.valueOf(r0.A08(r1));
    }

    public static void A1G(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 4);
    }

    public static void A1O(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append("; host=");
    }

    public static void A1P(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.e(sb.toString());
    }

    public static void A1Q(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1S(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1V(Object[] objArr, int i) {
        objArr[2] = Integer.valueOf(i);
    }

    public static void A1X(Object[] objArr, int i, int i2, int i3, int i4) {
        objArr[i2] = Integer.valueOf(i);
        objArr[i4] = Integer.valueOf(i3);
    }

    public static boolean A1Z(C203399nx r0, String str) {
        if (r0.A0c(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean A1b(AnonymousClass00T r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }
}
