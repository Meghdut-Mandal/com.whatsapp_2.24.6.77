package X;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Vp  reason: invalid class name and case insensitive filesystem */
public final class C132876Vp {
    public static final C132876Vp A00 = new C132876Vp();

    public static final void A02(DialogFragment dialogFragment, AnonymousClass01I r15, C23087B3x b3x, AnonymousClass6XK r17, C16140og r18, AnonymousClass7fM r19, String str, int i) {
        AnonymousClass01I r5 = r15;
        AnonymousClass00C.A0D(r15, 0);
        AnonymousClass01z supportFragmentManager = r15.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
        r1.A0J((String) null);
        DialogFragment dialogFragment2 = dialogFragment;
        try {
            dialogFragment.A08 = false;
            dialogFragment.A09 = true;
            r1.A0D(dialogFragment, (String) null);
            dialogFragment.A0B = false;
            dialogFragment.A00 = r1.A00(false);
        } catch (IllegalStateException e) {
            if (r15.isFinishing() || r15.isDestroyed() || supportFragmentManager.A0E) {
                AnonymousClass6RS.A00((C1271967i) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e);
            } else {
                try {
                    AnonymousClass01z.A0H(supportFragmentManager, (String) null);
                    AnonymousClass09Y r0 = new AnonymousClass09Y(supportFragmentManager);
                    r0.A0J((String) null);
                    C90484aE.A19(r0, dialogFragment, (String) null);
                } catch (Exception e2) {
                    AnonymousClass6RS.A00((C1271967i) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2);
                }
            }
        }
        AnonymousClass746 r4 = new AnonymousClass746(r5, dialogFragment2, b3x, r18, r17, r19, str, i, 0);
        Handler A0H = C36341k9.A0H();
        A0H.post(new AnonymousClass731(A0H, dialogFragment, r4));
    }

    public static final C128926Ed A01(Context context, DialogFragment dialogFragment, C23087B3x b3x, AnonymousClass6XK r17, C16140og r18, String str) {
        C23087B3x b3x2 = b3x;
        C16140og r9 = r18;
        C36331k8.A1G(b3x2, 3, r9);
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) dialogFragment;
        String str2 = str;
        C36321k7.A0v(str2, 1, bkCdsBottomSheetFragment);
        Context context2 = context;
        C128926Ed r2 = new C128926Ed(new C98124qv(context), str2);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.cds_bottom_sheet_screen_data, r2);
        AnonymousClass65A r11 = bkCdsBottomSheetFragment.A00;
        C139046j9 r10 = (C139046j9) b3x2;
        SparseArray clone = r10.A03.clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        Map map = r10.A09;
        int i2 = r10.A00;
        HashMap A0J = AnonymousClass001.A0J();
        A0J.putAll(map);
        String valueOf = String.valueOf(i2);
        A0J.put("ttrc_instance_id", valueOf);
        Map map2 = r10.A08;
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.putAll(map2);
        A0J2.put("ttrc_instance_id", valueOf);
        AnonymousClass6SR r5 = new AnonymousClass6SR(new C142106oL(context2, clone, r17, r11, A0J, A0J2), r10, r9);
        if (r5.A01 == null) {
            AnonymousClass68W r7 = r5.A03;
            C158987iZ r14 = r5.A06;
            C139046j9 r92 = r5.A05;
            C161027m0 Buv = r14.Buv(r92.A04, r92.A01, r92.A00, r92.A02);
            Map map3 = r92.A07;
            if (map3 != null) {
                Iterator A0y = AnonymousClass000.A0y(map3);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    C133026Wh.A01(Buv, A11.getValue(), C90494aF.A0f(A11));
                }
            }
            Iterator it = r92.A06.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("onStart");
            }
            r5.A01 = Buv;
            Buv.BPL("surface_core_created_at", r7.A00);
        }
        C161027m0 r8 = r5.A01;
        C139046j9 r112 = r5.A05;
        String str3 = r112.A04;
        if (str3 == null || r112.A0A) {
            r8.B0l("initial_content_step");
        } else {
            r8.B0i("bloks_query", TimeUnit.SECONDS, 86400);
        }
        if (r5.A00 == null && !r112.A0A && str3 != null) {
            HashMap hashMap = r112.A05;
            C16140og r1 = r5.A08;
            C1257661e r102 = AnonymousClass6NR.A00().A05;
            if (r102.A01 == null) {
                synchronized (r102) {
                    if (r102.A01 == null) {
                        C1258361l r93 = r102.A00;
                        r102.A01 = new C114535hP(new C119185pN(r93.A00, r93.A01.A00.A00.A00.A0w));
                    }
                }
            }
            AnonymousClass6MF r113 = new AnonymousClass6MF((AnonymousClass7fG) null);
            C119185pN r103 = ((C114535hP) r102.A01).A00;
            C114525hO r94 = new C114525hO(r113);
            String A0l = C90504aG.A0l("params", hashMap);
            C131556Pn r12 = (C131556Pn) r103.A01.get();
            String str4 = ((C142086oJ) r1).A02;
            if (str4 != null) {
                str3 = str4;
            }
            r12.A03((C134906bn) null, new C163837qq(context2, r94, r103, 0), (Boolean) null, str3, A0l, (String) null);
            r5.A00 = r113;
        }
        C142106oL r0 = r5.A04;
        r0.A0B.set(new C139056jA(r5, bkCdsBottomSheetFragment, r8));
        C161027m0 r13 = r5.A01;
        Objects.requireNonNull(r13);
        r13.BPC("cds_bottomsheet", true);
        r2.A00 = r5;
        return r2;
    }

    public static final DialogFragment A00(C132876Vp r3, String str, List list) {
        int i;
        int A07 = C36431kI.A07(list);
        if (A07 < 0) {
            return null;
        }
        do {
            i = A07 - 1;
            AnonymousClass02E r1 = (AnonymousClass02E) list.get(A07);
            if (!(r1 instanceof BkCdsBottomSheetFragment) || !(r1 instanceof DialogFragment)) {
                List A04 = r1.A0k().A0T.A04();
                AnonymousClass00C.A08(A04);
                DialogFragment A002 = A00(r3, str, A04);
                if (A002 != null) {
                    return A002;
                }
            } else {
                DialogFragment dialogFragment = (DialogFragment) r1;
                if (((BkCdsBottomSheetFragment) dialogFragment).A1i(str)) {
                    return dialogFragment;
                }
            }
            A07 = i;
        } while (i >= 0);
        return null;
    }
}
