package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.1kH  reason: invalid class name and case insensitive filesystem */
public abstract class C36421kH {
    public static int A00(int i) {
        return i == 0 ? 8 : 0;
    }

    public static int A01(int i) {
        return i != 0 ? 5 : 3;
    }

    public static int A05(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static View A0D(Context context, int i) {
        return View.inflate(context, i, (ViewGroup) null);
    }

    public static AnonymousClass3QK A0L(AnonymousClass1LV r1, AnonymousClass147 r2) {
        AnonymousClass00C.A0D(r2, 0);
        return r1.A08.A00(r2);
    }

    public static String A0b(C206969uL r2) {
        String str;
        if (r2 == null || (str = r2.A01) == null) {
            return null;
        }
        return new JSONObject(str).optString("display_text");
    }

    public static void A0l(Context context, Intent intent, String str, String str2) {
        intent.setClassName(context, str);
        intent.putExtra("screen_name", str2);
        intent.putExtra("screen_params", (String) null);
    }

    public static void A0r(View view) {
        C011504z.A0B(view, 64, (Bundle) null);
    }

    public static void A15(AbsListView absListView, int i, int i2) {
        absListView.setTranscriptMode(0);
        absListView.setSelectionFromTop(i, i2);
    }

    public static void A19(AnonymousClass07B r1) {
        r1.A0X(true);
        r1.A0U(true);
    }

    public static void A1A(DialogFragment dialogFragment, AnonymousClass01I r3) {
        dialogFragment.A1f(r3.getSupportFragmentManager(), (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r3.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = (r0 = r4.A0h()).getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1S(android.app.Activity r3, X.AnonymousClass02E r4, java.lang.String r5) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x0023
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.hasExtra(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0023
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0023
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.getBooleanExtra(r5, r2)
            if (r0 != r1) goto L_0x0023
            return r1
        L_0x0023:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36421kH.A1S(android.app.Activity, X.02E, java.lang.String):boolean");
    }

    public static boolean A1T(Intent intent, String str) {
        return intent.getBooleanExtra(str, false);
    }

    public static boolean A1U(View view) {
        return view.canScrollVertically(1);
    }

    public static boolean A1X(CollapsingProfilePhotoView collapsingProfilePhotoView) {
        collapsingProfilePhotoView.A04 = -1;
        collapsingProfilePhotoView.A00 = -1.0f;
        collapsingProfilePhotoView.A05 = 0;
        collapsingProfilePhotoView.A03 = 0;
        collapsingProfilePhotoView.A02 = 0;
        collapsingProfilePhotoView.A0C = true;
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A1b(java.lang.Object[] r6) {
        /*
            r5 = 1
            r4 = 0
            r3 = 2
            r2 = 3
            int[] r1 = new int[r5]
            r0 = 128512(0x1f600, float:1.80084E-40)
            r1[r4] = r0
            r6[r4] = r1
            int[] r1 = new int[r5]
            r0 = 128515(0x1f603, float:1.80088E-40)
            r1[r4] = r0
            r6[r5] = r1
            int[] r1 = new int[r5]
            r0 = 128516(0x1f604, float:1.80089E-40)
            r1[r4] = r0
            r6[r3] = r1
            int[] r1 = new int[r5]
            r0 = 128513(0x1f601, float:1.80085E-40)
            r1[r4] = r0
            r6[r2] = r1
            int[] r1 = new int[r5]
            r0 = 128518(0x1f606, float:1.80092E-40)
            r1[r4] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36421kH.A1b(java.lang.Object[]):int[]");
    }

    public static Intent A08(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity");
        className.putExtra("invite_source", i);
        return className;
    }

    public static Intent A09(Context context, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", z);
        return className;
    }

    public static SharedPreferences.Editor A0A(C225314u r0) {
        return C19420v0.A00(r0.A09);
    }

    public static Resources A0B(C19630wG r0) {
        return r0.A00.getResources();
    }

    public static C20430xY A0K(C18800tq r0) {
        return (C20430xY) r0.A2H.get();
    }

    public static C29541Xa A0M(C18800tq r0) {
        return (C29541Xa) r0.A35.get();
    }

    public static AnonymousClass11F A0N(String str) {
        return AnonymousClass11F.A00.A02(str);
    }

    public static GroupJid A0P(AnonymousClass141 r1) {
        return (GroupJid) r1.A06(AnonymousClass147.class);
    }

    public static AnonymousClass1C4 A0Q(C18800tq r0) {
        return (AnonymousClass1C4) r0.A7e.get();
    }

    public static AnonymousClass3T1 A0R(AnonymousClass1A1 r0, long j) {
        return r0.A01.A01(j);
    }

    public static AnonymousClass6QB A0T() {
        return new AnonymousClass6QB("iq");
    }

    public static Integer A0U() {
        return 11;
    }

    public static Integer A0V() {
        return 13;
    }

    public static Integer A0W() {
        return 15;
    }

    public static String A0c(VerifyPhoneNumber verifyPhoneNumber) {
        C20830yE r1 = verifyPhoneNumber.A0c;
        if (verifyPhoneNumber.A1V) {
            return "2";
        }
        if (r1.A02("android.permission.RECEIVE_SMS") == 0) {
            return "1";
        }
        return "0";
    }

    public static List A0h(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        return list;
    }

    public static Set A0i(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        return AnonymousClass02R.A0E(objArr);
    }

    public static void A0o(Intent intent, String str, String str2) {
        intent.setComponent(new ComponentName(str, str2));
    }

    public static void A0q(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A0v(View view, int i, int i2, int i3) {
        if (i != 0) {
            view.setVisibility(i2);
        } else {
            view.setVisibility(i3);
        }
    }

    public static void A0x(View view, View view2) {
        view.setVisibility(8);
        view2.setVisibility(8);
    }

    public static void A10(View view, Object obj, int i) {
        view.setOnClickListener(new C135426cg(obj, i));
    }

    public static void A11(View view, Object obj, int i) {
        C012005e.A0V(view, new C89064Vc(obj, i));
    }

    public static void A12(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass9v0(obj, i));
    }

    public static void A13(View view, Object obj, int i) {
        view.setOnClickListener(new C207369uz(obj, i));
    }

    public static void A14(View view, Object obj, String str, int i) {
        view.setOnClickListener(new AnonymousClass9v1(i, str, obj));
    }

    public static void A18(TextView textView, AnonymousClass02E r5) {
        if (textView != null) {
            Context A0a = r5.A0a();
            textView.setText(new SpannableStringBuilder(C37351mE.A02(textView.getPaint(), AnonymousClass3UF.A02(A0a, R.drawable.ic_voip_e2ee_padlock_flat_wds, R.color.f6nameremoved), A0a.getString(R.string.f12nameremoved))));
        }
    }

    public static void A1B(C18830tt r1, AnonymousClass185 r2, MediaPickerFragment mediaPickerFragment) {
        mediaPickerFragment.A06 = r2;
        mediaPickerFragment.A0C = (AnonymousClass1JI) r1.A3j.get();
        mediaPickerFragment.A05 = (C132726Uz) r1.A5w.get();
        mediaPickerFragment.A0D = (C1270866x) r1.A9g.get();
    }

    public static void A1C(AnonymousClass1X4 r4) {
        AnonymousClass17Y r3 = r4.A02;
        C28361Si r2 = r4.A0z;
        Objects.requireNonNull(r2);
        r3.A0H(new C35641j1((Object) r2, 48));
    }

    public static void A1D(WaEditText waEditText) {
        if (waEditText != null) {
            waEditText.A0C(false);
        }
    }

    public static void A1E(SearchFragment searchFragment) {
        SearchViewModel searchViewModel = searchFragment.A1d;
        C134786bb A0a = searchViewModel.A0a();
        if (A0a != null && 2 == A0a.A01) {
            searchViewModel.A0d();
        }
    }

    public static void A1F(AnonymousClass1RJ r1) {
        if (r1 != null) {
            r1.A03(8);
        }
    }

    public static void A1G(C19770wU r1, Object obj, Object obj2, String str, int i) {
        r1.Boy(new C1502374m(obj, obj2, str, i));
    }

    public static void A1H(C19770wU r1, Object obj, String str, int i) {
        r1.Boy(new C1503274v(i, str, obj));
    }

    public static void A1N(StringBuilder sb) {
        sb.append(" ");
    }

    public static void A1O(int[] iArr, int i, int i2, int i3) {
        iArr[i2] = i;
        iArr[i3] = R.drawable.permission_plus;
    }

    public static boolean A1V(AnonymousClass155 r0) {
        return r0.A02.A0L();
    }

    public static boolean A1W(AnonymousClass18U r1) {
        return r1.A03.A0E(266);
    }

    public static boolean A1Z(C20800yB r1) {
        return r1.A0E(6187);
    }

    public static int A02(Context context) {
        if (C19600wD.A02(context)) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public static int A03(Drawable drawable) {
        return drawable.getBounds().width();
    }

    public static int A04(String str) {
        return str.hashCode() * 31;
    }

    public static int A06(List list, int i) {
        return list.size() - i;
    }

    public static int A07(AnonymousClass00T r1) {
        ((AnonymousClass1RJ) r1.getValue()).A03(8);
        return 8;
    }

    public static BitmapDrawable A0C(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static ViewGroup A0E(AnonymousClass01L r0, int i) {
        return (ViewGroup) r0.findViewById(i);
    }

    public static C07700Yy A0F(Context context) {
        C07700Yy A02 = C20600xp.A02(context);
        A02.A0M = "other_notifications@1";
        return A02;
    }

    public static AnonymousClass04G A0G(AnonymousClass01G r0) {
        AnonymousClass04G BAw = r0.BAw();
        AnonymousClass00C.A08(BAw);
        return BAw;
    }

    public static C27101Mx A0H(C224814n r0) {
        return (C27101Mx) r0.generatedComponent();
    }

    public static TextEmojiLabel A0I(AnonymousClass01L r0, int i) {
        return (TextEmojiLabel) r0.findViewById(i);
    }

    public static WaImageView A0J(View view, int i) {
        return (WaImageView) view.findViewById(i);
    }

    public static AnonymousClass11F A0O(AnonymousClass00T r0) {
        return (AnonymousClass11F) r0.getValue();
    }

    public static AnonymousClass3T1 A0S(Iterable iterable) {
        return (AnonymousClass3T1) C007103b.A0H(iterable);
    }

    public static Iterable A0X(C19580wB r0) {
        Iterable observers = r0.getObservers();
        AnonymousClass00C.A08(observers);
        return observers;
    }

    public static Object A0Y(List list, int i) {
        return ((Pair) list.get(i)).first;
    }

    public static String A0Z(EditText editText) {
        return String.valueOf(editText.getText());
    }

    public static String A0a(AnonymousClass02E r0, int i) {
        String A0n = r0.A0n(i);
        AnonymousClass00C.A08(A0n);
        return A0n;
    }

    public static String A0d(StringBuilder sb, boolean z) {
        sb.append(z);
        return sb.toString();
    }

    public static String A0e(AbstractList abstractList, int i) {
        return (String) abstractList.get(i);
    }

    public static StringBuilder A0f(Object obj) {
        C18740tg.A06(obj);
        return new StringBuilder();
    }

    public static HashSet A0g(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static AnonymousClass011 A0j(Object obj, int i) {
        return new AnonymousClass011(obj, Integer.valueOf(i));
    }

    public static void A0k(Context context, int i, int i2, Object[] objArr) {
        objArr[i2] = context.getString(i);
    }

    public static void A0m(Intent intent, Jid jid) {
        intent.putExtra("jid", AnonymousClass143.A03(jid));
    }

    public static void A0n(Intent intent, String str) {
        intent.setData(Uri.parse(str));
    }

    public static void A0p(Resources resources, Animation animation, int i) {
        animation.setDuration((long) resources.getInteger(i));
    }

    public static void A0s(View view) {
        C18740tg.A04(view);
        view.setVisibility(8);
    }

    public static void A0t(View view) {
        view.getLayoutParams().height = -2;
    }

    public static void A0u(View view, int i) {
        view.setVisibility(i);
        view.setAlpha(1.0f);
    }

    public static void A0w(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), i3);
    }

    public static void A0y(View view, View view2, int i, int i2, int i3) {
        view2.setPadding(i, i2, i3, view.getPaddingBottom());
    }

    public static void A0z(View view, AnonymousClass02E r2, int i) {
        view.setContentDescription(r2.A0n(i));
    }

    public static void A16(CompoundButton compoundButton) {
        compoundButton.setChecked(!compoundButton.isChecked());
    }

    public static void A17(TextView textView, TextView textView2, TextView textView3, float f) {
        textView.setTextSize(f);
        textView2.setTextSize(f);
        textView3.setTextSize(f);
        C33511fU.A03(textView);
        C33511fU.A03(textView2);
        C33511fU.A03(textView3);
    }

    public static void A1I(AnonymousClass005 r0) {
        ((AnonymousClass1V7) r0.get()).A00();
    }

    public static void A1J(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 5);
    }

    public static void A1K(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1L(Object obj, List list) {
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static void A1M(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1P(Object[] objArr, long j) {
        objArr[1] = Long.valueOf(j);
    }

    public static void A1Q(Object[] objArr, long j) {
        objArr[0] = Long.toString(j);
    }

    public static void A1R(Object[] objArr, boolean z) {
        objArr[1] = Boolean.valueOf(z);
    }

    public static boolean A1Y(AnonymousClass141 r0) {
        return TextUtils.isEmpty(r0.A0J());
    }

    public static boolean A1a(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }
}
