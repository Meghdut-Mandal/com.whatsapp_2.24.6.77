package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.userban.ui.fragment.BanAppealBaseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.AbstractMap;
import java.util.ArrayList;

/* renamed from: X.1k7  reason: invalid class name and case insensitive filesystem */
public abstract class C36321k7 {
    public static String A0A(Context context, Object obj, int i) {
        return context.getString(i, new Object[]{obj});
    }

    public static String A0B(Resources resources, int i, int i2, int i3) {
        Object[] objArr = new Object[1];
        objArr[i2] = Integer.valueOf(i);
        return resources.getQuantityString(i3, i, objArr);
    }

    public static void A0N(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A0Q(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public static void A0s(C21710zg r2, Object obj) {
        r2.A04 = true;
        r2.A00(obj.getClass().getSimpleName(), 18);
    }

    public static void A0w(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 0);
        AnonymousClass00C.A0D(obj2, 1);
    }

    public static void A0x(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 1);
        AnonymousClass00C.A0D(obj2, 2);
    }

    public static void A0y(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 1);
        AnonymousClass00C.A0D(obj2, 3);
    }

    public static void A0z(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 2);
        AnonymousClass00C.A0D(obj2, 3);
    }

    public static void A10(Object obj, Object obj2) {
        AnonymousClass00C.A0D(obj, 6);
        AnonymousClass00C.A0D(obj2, 7);
    }

    public static void A11(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 1);
        AnonymousClass00C.A0D(obj2, 2);
        AnonymousClass00C.A0D(obj3, 3);
    }

    public static void A12(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 2);
        AnonymousClass00C.A0D(obj2, 3);
        AnonymousClass00C.A0D(obj3, 4);
    }

    public static void A13(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 6);
        AnonymousClass00C.A0D(obj2, 7);
        AnonymousClass00C.A0D(obj3, 8);
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass00C.A0D(obj, 1);
        AnonymousClass00C.A0D(obj2, 2);
        AnonymousClass00C.A0D(obj3, 3);
        AnonymousClass00C.A0D(obj4, 4);
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass00C.A0D(obj, 2);
        AnonymousClass00C.A0D(obj2, 3);
        AnonymousClass00C.A0D(obj3, 4);
        AnonymousClass00C.A0D(obj4, 5);
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 1);
        AnonymousClass00C.A0D(obj2, 2);
        AnonymousClass00C.A0D(obj3, 3);
        AnonymousClass00C.A0D(obj4, 4);
        AnonymousClass00C.A0D(obj5, 5);
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 6);
        AnonymousClass00C.A0D(obj2, 7);
        AnonymousClass00C.A0D(obj3, 8);
        AnonymousClass00C.A0D(obj4, 9);
        AnonymousClass00C.A0D(obj5, 10);
    }

    public static void A1F(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
    }

    public static int A00(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static long A01(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        AnonymousClass00C.A0D(obj2, 0);
        return longValue;
    }

    public static C195209Sx A03(AnonymousClass9Y1 r2) {
        C195209Sx r1 = new C195209Sx();
        r1.A0A = r2.A02;
        r1.A05 = Integer.valueOf(r2.A0C.get());
        return r1;
    }

    public static NullPointerException A04(Class cls) {
        new C019308f(cls);
        return new NullPointerException("onProcessorExecuted");
    }

    public static Object A05(C18800tq r1, C18830tt r2, C225314u r3) {
        r3.A0B = (AnonymousClass1N0) r2.A3P.get();
        return r1.A8b.get();
    }

    public static RuntimeException A06() {
        AnonymousClass00C.A0G("globalUI");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A07() {
        AnonymousClass00C.A0G("abProps");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A08() {
        AnonymousClass00C.A0G("waWorkers");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A09() {
        AnonymousClass00C.A0G("whatsAppLocale");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static String A0D(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder A0I(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static ArrayList A0J(Iterable iterable) {
        return new ArrayList(AnonymousClass03U.A06(iterable, 10));
    }

    public static void A0S(C24801Dv r0, C27111My r1, C18800tq r2, C18830tt r3, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A0K = r0;
        contactPickerFragment.A1q = C18800tq.AF5(r2);
        contactPickerFragment.A0b = (C24361Cd) r2.A1j.get();
        contactPickerFragment.A13 = (C20430xY) r2.A2H.get();
        contactPickerFragment.A1a = (C64673Oz) r3.A6d.get();
        contactPickerFragment.A1L = (AnonymousClass1I6) r2.AFH.get();
        contactPickerFragment.A10 = (C65383Rv) r3.A2M.get();
        contactPickerFragment.A23 = (C64873Pt) r3.A9Y.get();
        contactPickerFragment.A0j = (AnonymousClass16D) r2.A2A.get();
        contactPickerFragment.A0p = (AnonymousClass171) r2.A90.get();
        contactPickerFragment.A1D = (C18820ts) r2.A9X.get();
        contactPickerFragment.A0i = (C229216m) r2.A27.get();
        contactPickerFragment.A1m = C27111My.A2I(r1);
    }

    public static void A0T(C27111My r1, C32581dr r2, C18800tq r3, C18830tt r4, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A0h = (C19600wD) r3.A24.get();
        contactPickerFragment.A2Q = C18840tu.A00(r3.ACI);
        contactPickerFragment.A0P = (C58182zS) r2.A0X.get();
        contactPickerFragment.A1V = (AnonymousClass1NZ) r3.AYh.get();
        contactPickerFragment.A1s = (AnonymousClass6OF) r4.A0V.get();
        contactPickerFragment.A1e = (C238119y) r3.AFx.get();
        contactPickerFragment.A2W = C18840tu.A00(r4.AAG);
        contactPickerFragment.A1c = (C62483Gi) r4.A5h.get();
        contactPickerFragment.A0W = (AnonymousClass1LI) r3.A3Q.get();
        contactPickerFragment.A0N = (AnonymousClass60O) r1.A3J.get();
        contactPickerFragment.A1w = (C28551Tc) r3.AUI.get();
    }

    public static void A0V(C32581dr r5, C18800tq r6, C18830tt r7, ContactPickerFragment contactPickerFragment, AnonymousClass17X r9) {
        contactPickerFragment.A1Q = r9;
        contactPickerFragment.A1I = r6.A7D();
        contactPickerFragment.A20 = (C19890wg) r6.A7i.get();
        contactPickerFragment.A24 = (C64883Pu) r7.ACT.get();
        C18800tq r2 = r5.A1K;
        contactPickerFragment.A0m = new AnonymousClass310((C20810yC) r2.A02.get());
        contactPickerFragment.A0d = new AnonymousClass3AB((C235718z) r2.A1Z.get(), (C63603Kr) r2.A1a.get(), (C20810yC) r2.A02.get(), C26581Ks.A00());
        contactPickerFragment.A1T = (C232317r) r6.A61.get();
        contactPickerFragment.A0l = (C27261Nn) r6.AQN.get();
        contactPickerFragment.A2A = C32581dr.A0e(r5);
        contactPickerFragment.A15 = (C27381Nz) r6.AEc.get();
        contactPickerFragment.A1O = (AnonymousClass1A5) r6.A2K.get();
        contactPickerFragment.A1l = (C233117z) r6.A3w.get();
        contactPickerFragment.A1u = (C33191es) r7.A1P.get();
        contactPickerFragment.A1H = (C25851Hx) r6.AGV.get();
    }

    public static void A0W(C32581dr r1, C18800tq r2, C18830tt r3, MediaGalleryFragmentBase mediaGalleryFragmentBase, Object obj) {
        mediaGalleryFragmentBase.A0F = (C20810yC) obj;
        mediaGalleryFragmentBase.A07 = (AnonymousClass17Y) r2.A3e.get();
        mediaGalleryFragmentBase.A0B = (C19630wG) r2.A91.get();
        mediaGalleryFragmentBase.A0P = (C19770wU) r2.A9Y.get();
        mediaGalleryFragmentBase.A09 = (AnonymousClass16L) r2.A0q.get();
        mediaGalleryFragmentBase.A0M = (C74153l9) r3.A9h.get();
        mediaGalleryFragmentBase.A0J = C27111My.A2D(r1.A1I);
        mediaGalleryFragmentBase.A0A = (C21060yb) r2.A8W.get();
        mediaGalleryFragmentBase.A0E = (C18820ts) r2.A9X.get();
        mediaGalleryFragmentBase.A0D = (AnonymousClass4QB) r1.A0v.get();
        mediaGalleryFragmentBase.A0C = (C20830yE) r2.A9E.get();
        mediaGalleryFragmentBase.A0Q = r1.A0y;
        mediaGalleryFragmentBase.A0I = new AnonymousClass3GM((C20830yE) r1.A1K.A9E.get());
    }

    public static void A0X(C18800tq r1, C18830tt r2, AnonymousClass155 r3, Object obj) {
        r3.A07 = (C19970wo) obj;
        r3.A0C = (AnonymousClass1N2) r1.A43.get();
        r3.A02 = (C19730wQ) r1.A4g.get();
        r3.A06 = (AnonymousClass179) r1.A3D.get();
        r3.A08 = (C20060wx) r1.A8B.get();
        r3.A01 = (C24801Dv) r1.A0D.get();
        r3.A04 = (AnonymousClass1N3) r1.A9B.get();
        r3.A05 = (AnonymousClass18U) r1.A0I.get();
        r3.A03 = (AnonymousClass1N5) r2.A2o.get();
        r3.A0B = (AnonymousClass1G4) r1.A7Z.get();
        r3.A0A = (AnonymousClass12U) r1.A7L.get();
        r3.A09 = C18800tq.A8a(r1);
    }

    public static void A0Y(C18800tq r1, C18830tt r2, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A1i = (C21010yW) r1.A79.get();
        contactPickerFragment.A0U = (C20050ww) r1.A7v.get();
        contactPickerFragment.A1f = (AnonymousClass1H2) r1.A2x.get();
        contactPickerFragment.A0T = (C21100yf) r1.A7f.get();
        contactPickerFragment.A1X = (AnonymousClass16E) r1.A80.get();
        contactPickerFragment.A0V = (C32601dt) r2.A46.get();
        contactPickerFragment.A0X = (AnonymousClass1X4) r1.A8h.get();
        contactPickerFragment.A2M = (AnonymousClass1YI) r1.A8s.get();
        contactPickerFragment.A1g = (C20810yC) r1.A02.get();
        contactPickerFragment.A2N = (AnonymousClass1KI) r1.A0r.get();
        contactPickerFragment.A2E = (AnonymousClass1M4) r1.AEo.get();
    }

    public static void A0Z(C18800tq r1, C18830tt r2, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A0g = (AnonymousClass1Sk) r1.A1s.get();
        contactPickerFragment.A1t = (AnonymousClass1QW) r2.A0Z.get();
        contactPickerFragment.A1d = (C62203Fe) r2.A1K.get();
        contactPickerFragment.A0o = (AnonymousClass185) r1.A8u.get();
        contactPickerFragment.A0f = (C28421Sp) r1.ADy.get();
    }

    public static void A0c(C18800tq r1, C225314u r2) {
        r2.A04 = (C19770wU) r1.A9Y.get();
        r2.A0D = (C20810yC) r1.A02.get();
        r2.A05 = (AnonymousClass17Y) r1.A3e.get();
        r2.A03 = (C19700wN) r1.A2U.get();
        r2.A04 = (C20690y0) r1.A6r.get();
        r2.A0C = (AnonymousClass1H2) r1.A2x.get();
        r2.A06 = (C21100yf) r1.A7f.get();
        r2.A08 = (C21060yb) r1.A8W.get();
        r2.A09 = (C19420v0) r1.A9G.get();
        r2.A07 = (C19600wD) r1.A24.get();
        r2.A0A = (C19900wh) r1.A9J.get();
    }

    public static void A0d(C18800tq r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A01 = (C18820ts) r1.A9X.get();
        textEmojiLabel.A02 = (C20810yC) r1.A02.get();
        textEmojiLabel.A04 = (AnonymousClass1H2) r1.A2x.get();
        textEmojiLabel.A02 = (C21060yb) r1.A8W.get();
        textEmojiLabel.A05 = (C19890wg) r1.A7i.get();
    }

    public static void A0e(C18800tq r1, WaTextView waTextView) {
        waTextView.A01 = (C18820ts) r1.A9X.get();
        waTextView.A02 = (C20810yC) r1.A02.get();
    }

    public static void A0f(C18800tq r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A02 = (C20810yC) r1.A02.get();
        waDialogFragment.A01 = (C18820ts) r1.A9X.get();
    }

    public static void A0g(C18800tq r1, WaDialogFragment waDialogFragment) {
        waDialogFragment.A02 = (C20810yC) r1.A02.get();
        waDialogFragment.A01 = (C18820ts) r1.A9X.get();
        waDialogFragment.A03 = C18830tt.A85(r1.A00);
    }

    public static void A0h(C18800tq r1, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A22 = (AnonymousClass1CR) r1.A1i.get();
        contactPickerFragment.A1S = (C26141Ja) r1.A5m.get();
        contactPickerFragment.A0Y = (C29411Wn) r1.A9H.get();
        contactPickerFragment.A1n = (AnonymousClass1EL) r1.A8L.get();
        contactPickerFragment.A0q = (C235618y) r1.A15.get();
        contactPickerFragment.A2X = C18840tu.A00(r1.A9U);
        contactPickerFragment.A2C = (C32811eE) r1.A0F.get();
        contactPickerFragment.A2R = C18840tu.A00(r1.A0x);
        contactPickerFragment.A1r = (AnonymousClass19A) r1.A4x.get();
    }

    public static void A0i(C18800tq r1, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A1R = (AnonymousClass12P) r1.A5G.get();
        contactPickerFragment.A1B = (C20830yE) r1.A9E.get();
        contactPickerFragment.A1C = (C19420v0) r1.A9G.get();
        contactPickerFragment.A25 = C18800tq.AKs(r1);
        contactPickerFragment.A1z = (AnonymousClass1EU) r1.A6M.get();
        contactPickerFragment.A2U = C18840tu.A00(r1.A1Z);
        contactPickerFragment.A14 = (C32941eS) r1.A2I.get();
        contactPickerFragment.A17 = (AnonymousClass1A6) r1.A2P.get();
        contactPickerFragment.A1P = (AnonymousClass1FI) r1.AO6.get();
        contactPickerFragment.A26 = (C29731Xt) r1.A81.get();
        contactPickerFragment.A1M = (AnonymousClass2aJ) r1.A2X.get();
        contactPickerFragment.A0I = C19470v6.A00;
    }

    public static void A0j(C18800tq r1, ContactPickerFragment contactPickerFragment, AnonymousClass1DV r3) {
        contactPickerFragment.A2O = r3;
        contactPickerFragment.A0Q = (AnonymousClass17Y) r1.A3e.get();
        contactPickerFragment.A0s = (C27731Pn) r1.A2E.get();
        contactPickerFragment.A0R = (C19730wQ) r1.A4g.get();
        contactPickerFragment.A2H = (AnonymousClass1EM) r1.A3l.get();
        contactPickerFragment.A1k = (AnonymousClass1NN) r1.A3q.get();
        contactPickerFragment.A27 = (C20380xT) r1.ANA.get();
        contactPickerFragment.A2J = (AnonymousClass1GX) r1.A4k.get();
        contactPickerFragment.A2K = (AnonymousClass13J) r1.A6z.get();
        contactPickerFragment.A19 = (C21060yb) r1.A8W.get();
        contactPickerFragment.A0c = (AnonymousClass3L5) r1.A1Y.get();
        contactPickerFragment.A2T = C18840tu.A00(r1.A10);
    }

    public static void A0k(C18800tq r1, WDSButton wDSButton) {
        wDSButton.A03 = (C20810yC) r1.A02.get();
        wDSButton.A01 = (C18820ts) r1.A9X.get();
        wDSButton.A02 = (C21520zN) r1.A01.get();
    }

    public static void A0m(C225314u r2, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C34021gK(r2.A0D));
        textEmojiLabel.setAccessibilityHelper(new C34011gJ(textEmojiLabel, r2.A08));
    }

    public static void A0p(C195209Sx r2, AnonymousClass9Y1 r3) {
        r2.A0D = r3.A00;
        r2.A0E = r3.A01;
        r2.A09 = Long.valueOf((long) r3.A0D.getAndIncrement());
    }

    public static void A0r(C20810yC r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLinkHandler(new C34021gK(r1));
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public static void A14(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 8);
        AnonymousClass00C.A0D(obj2, 9);
        AnonymousClass00C.A0D(obj3, 10);
    }

    public static void A15(Object obj, Object obj2, Object obj3) {
        AnonymousClass00C.A0D(obj, 11);
        AnonymousClass00C.A0D(obj2, 12);
        AnonymousClass00C.A0D(obj3, 13);
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 12);
        AnonymousClass00C.A0D(obj2, 13);
        AnonymousClass00C.A0D(obj3, 14);
        AnonymousClass00C.A0D(obj4, 15);
        AnonymousClass00C.A0D(obj5, 16);
    }

    public static void A1E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AnonymousClass00C.A0D(obj, 17);
        AnonymousClass00C.A0D(obj2, 18);
        AnonymousClass00C.A0D(obj3, 19);
        AnonymousClass00C.A0D(obj4, 20);
        AnonymousClass00C.A0D(obj5, 21);
    }

    public static void A1G(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
    }

    public static C27111My A02(C32581dr r3, C18800tq r4, C18830tt r5, C18830tt r6, ContactPickerFragment contactPickerFragment) {
        C32191d8.A00(contactPickerFragment, C18830tt.A85(r5));
        contactPickerFragment.A29 = (AnonymousClass1X7) r4.A4o.get();
        contactPickerFragment.A1A = (C19970wo) r4.A8b.get();
        contactPickerFragment.A1x = (C64633Ov) r6.A2u.get();
        contactPickerFragment.A0M = (C19700wN) r4.A2U.get();
        contactPickerFragment.A0S = (AnonymousClass1XY) r4.A7c.get();
        contactPickerFragment.A2L = (C19770wU) r4.A9Y.get();
        C27111My r32 = r3.A1I;
        C18800tq r1 = r32.A5g;
        contactPickerFragment.A1F = new AnonymousClass3D8((C19730wQ) r1.A4g.get(), (C20810yC) r1.A02.get());
        contactPickerFragment.A1N = (C220412q) r4.A1l.get();
        contactPickerFragment.A0J = (AnonymousClass1NC) r4.A0C.get();
        contactPickerFragment.A1p = (AnonymousClass1DU) r4.A4T.get();
        return r32;
    }

    public static String A0C(Object obj, String str, StringBuilder sb) {
        C20910yM.A00(obj, str, sb);
        sb.append("}");
        String obj2 = sb.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }

    public static String A0E(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static String A0F(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public static String A0G(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static String A0H(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    public static void A0K(Activity activity, Point point) {
        activity.getWindowManager().getDefaultDisplay().getSize(point);
    }

    public static void A0L(Context context, ImageView imageView, C18820ts r3, int i) {
        imageView.setImageDrawable(new C100744vb(AnonymousClass00E.A00(context, i), r3));
    }

    public static void A0M(Context context, TextView textView, int i, int i2) {
        textView.setTextColor(AnonymousClass00F.A00(context, C224514j.A00(context, i, i2)));
    }

    public static void A0O(AnonymousClass01L r1) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0U(true);
    }

    public static void A0P(AnonymousClass01L r1) {
        AnonymousClass07B supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
    }

    public static void A0R(C170888Hw r2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        r2.A05(new RuntimeException(sb.toString()));
    }

    public static void A0U(C27111My r2, C32581dr r3, C18800tq r4, C18830tt r5, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A12 = (C21159AAt) r4.A2F.get();
        contactPickerFragment.A0e = C18800tq.A4u(r4);
        contactPickerFragment.A0a = C18830tt.A2o(r5);
        contactPickerFragment.A2D = new C61663Cy((C21010yW) r3.A1K.A79.get());
        contactPickerFragment.A16 = (C33751fs) r5.A17.get();
        contactPickerFragment.A1b = C27111My.A21(r2);
        contactPickerFragment.A2G = (C24051Aw) r4.A3E.get();
        contactPickerFragment.A1K = (AnonymousClass3IH) r5.A6e.get();
        contactPickerFragment.A0x = C27111My.A1F(r2);
        contactPickerFragment.A2I = (C230116v) r4.A4P.get();
        contactPickerFragment.A21 = (C21430zE) r4.A7A.get();
        contactPickerFragment.A2F = (C26371Jx) r4.A2n.get();
        contactPickerFragment.A2V = C18840tu.A00(r4.A3S);
        contactPickerFragment.A0H = (C19460v5) r4.A5v.get();
    }

    public static void A0a(C18800tq r1, C18830tt r2, ContactPickerFragment contactPickerFragment, AnonymousClass004 r4) {
        contactPickerFragment.A2Y = C18840tu.A00(r4);
        contactPickerFragment.A1U = (C32731e6) r1.A6S.get();
        contactPickerFragment.A2S = C18840tu.A00(r1.A0y);
        contactPickerFragment.A1j = (C20350xQ) r1.A3k.get();
        contactPickerFragment.A0Z = (AnonymousClass1NG) r1.A0v.get();
        contactPickerFragment.A0k = (AnonymousClass16I) r1.A2B.get();
        contactPickerFragment.A0L = (AnonymousClass1N4) r1.AXM.get();
        contactPickerFragment.A11 = (C32611du) r2.A2N.get();
        contactPickerFragment.A1y = C18800tq.AG6(r1);
        contactPickerFragment.A0n = (AnonymousClass3QX) r2.ACH.get();
        contactPickerFragment.A1h = r1.AzV();
        contactPickerFragment.A1v = (C32241dD) r1.A5g.get();
        contactPickerFragment.A2B = (C32661dz) r1.A0E.get();
    }

    public static void A0b(C18800tq r1, C18830tt r2, BanAppealBaseFragment banAppealBaseFragment) {
        C32191d8.A00(banAppealBaseFragment, C18830tt.A85(r2));
        banAppealBaseFragment.A02 = (C19970wo) r1.A8b.get();
        banAppealBaseFragment.A05 = (C20810yC) r1.A02.get();
        banAppealBaseFragment.A00 = (C24801Dv) r1.A0D.get();
        banAppealBaseFragment.A01 = (AnonymousClass1RU) r1.A08.get();
        banAppealBaseFragment.A03 = (C19420v0) r1.A9G.get();
        banAppealBaseFragment.A04 = (C19900wh) r1.A9J.get();
    }

    public static void A0l(C18830tt r1, RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment) {
        C111955d7.A00(C18830tt.A85(r1), roundedBottomSheetDialogFragment);
        AnonymousClass5ZR.A00(roundedBottomSheetDialogFragment, (C120485ra) r1.A7n.get());
    }

    public static void A0n(WaImageView waImageView) {
        AnonymousClass5ZS.A00(waImageView, (C18820ts) ((C27861Qc) ((C27851Qb) waImageView.generatedComponent())).A0M.A9X.get());
    }

    public static void A0o(WaDialogFragment waDialogFragment) {
        C18800tq r1 = ((C32581dr) ((C32571dq) waDialogFragment.generatedComponent())).A1K;
        waDialogFragment.A02 = (C20810yC) r1.A02.get();
        waDialogFragment.A01 = (C18820ts) r1.A9X.get();
        waDialogFragment.A03 = C18830tt.A85(r1.A00);
    }

    public static void A0q(C19420v0 r0, String str, int i) {
        C19420v0.A00(r0).putInt(str, i).apply();
    }

    public static void A0t(C224214g r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A01());
        Log.i(sb.toString());
    }

    public static void A0u(WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        C111955d7.A00(C18830tt.A85(((C32581dr) ((C32571dq) wDSBottomSheetDialogFragment.generatedComponent())).A1K.A00), wDSBottomSheetDialogFragment);
    }

    public static void A0v(Object obj, int i, Object obj2) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 2);
    }

    public static void A16(Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 2);
        AnonymousClass00C.A0D(obj3, 3);
    }

    public static void A17(Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 4);
        AnonymousClass00C.A0D(obj3, 5);
    }

    public static void A1A(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        AnonymousClass00C.A0D(obj, i);
        AnonymousClass00C.A0D(obj2, 4);
        AnonymousClass00C.A0D(obj3, 5);
        AnonymousClass00C.A0D(obj4, 6);
    }

    public static void A1I(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        abstractMap.put(3, (Object) null);
    }

    public static void A1J(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString());
    }

    public static void A1K(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A1L(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        Log.w(sb.toString());
    }

    public static void A1M(Object obj, String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(obj);
        Log.e(sb.toString(), th);
    }

    public static void A1N(Object obj, StringBuilder sb) {
        sb.append(obj);
        Log.i(sb.toString());
    }

    public static void A1O(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A1P(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A1Q(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A1R(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString());
    }

    public static void A1S(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A1T(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1U(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A1V(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A1W(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th.getMessage());
        Log.e(sb.toString());
    }

    public static void A1X(String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1Y(StringBuilder sb, int i) {
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1Z(StringBuilder sb, String str) {
        sb.append(str);
        Log.e(sb.toString());
    }

    public static void A1a(StringBuilder sb, String str) {
        sb.append(str);
        Log.i(sb.toString());
    }

    public static void A1b(AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), (Object) null);
    }
}
