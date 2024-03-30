package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6Ro  reason: invalid class name and case insensitive filesystem */
public abstract class C131966Ro {
    public static final C93564gm A00 = C93554gl.A00(AnonymousClass7PS.A00);
    public static final C93564gm A01 = new C93544gk(AnonymousClass7PT.A00);
    public static final C93564gm A02 = new C93544gk(AnonymousClass7PU.A00);
    public static final C93564gm A03 = new C93544gk(AnonymousClass7PX.A00);
    public static final C93564gm A04 = new C93544gk(AnonymousClass7PV.A00);
    public static final C93564gm A05 = new C93544gk(AnonymousClass7PW.A00);

    public static final void A00(C161337ma r15, AndroidComposeView androidComposeView, C009003v r17, int i) {
        String str;
        LinkedHashMap linkedHashMap;
        boolean z;
        C161337ma r5 = r15;
        r15.Bun(1396852028);
        AndroidComposeView androidComposeView2 = androidComposeView;
        Context context = androidComposeView2.getContext();
        r15.Bum(-492369756);
        Object BnZ = r15.BnZ();
        Object obj = C129736Ig.A00;
        if (BnZ == obj) {
            BnZ = C93994hT.A00(C137076fY.A00, new Configuration(AnonymousClass000.A0U(context)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            r15.Bwv(BnZ);
        }
        C136916fF r4 = (C136916fF) r5;
        C136916fF.A0M(r4, false);
        C161547n5 r6 = (C161547n5) BnZ;
        r15.Bum(-797338989);
        boolean B2f = r15.B2f(r6);
        Object BnZ2 = r15.BnZ();
        if (B2f || BnZ2 == obj) {
            BnZ2 = new C154157Rc(r6);
            r4.A0R(BnZ2);
        }
        C136916fF.A0M(r4, false);
        androidComposeView2.A05 = (C006302t) BnZ2;
        r15.Bum(-492369756);
        Object BnZ3 = r15.BnZ();
        if (BnZ3 == obj) {
            BnZ3 = new AnonymousClass6h3(context);
            r4.A0R(BnZ3);
        }
        C136916fF.A0M(r4, false);
        AnonymousClass6h3 r7 = (AnonymousClass6h3) BnZ3;
        C118345nj viewTreeOwners = androidComposeView2.getViewTreeOwners();
        if (viewTreeOwners != null) {
            r15.Bum(-492369756);
            Object BnZ4 = r15.BnZ();
            if (BnZ4 == obj) {
                AnonymousClass017 r8 = viewTreeOwners.A01;
                View A0K = C36411kG.A0K(androidComposeView2);
                Object tag = A0K.getTag(R.id.compose_view_saveable_id_tag);
                if (!(tag instanceof String) || (str = (String) tag) == null) {
                    str = String.valueOf(A0K.getId());
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("SaveableStateRegistry");
                String A0f = C90464aC.A0f(str, A0u, ':');
                AnonymousClass01U BGx = r8.BGx();
                Bundle A002 = BGx.A00(A0f);
                if (A002 != null) {
                    linkedHashMap = C36431kI.A1G();
                    Iterator<String> it = A002.keySet().iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        ArrayList parcelableArrayList = A002.getParcelableArrayList(A0C);
                        AnonymousClass00C.A0E(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(A0C, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                C137186fj r82 = new C137186fj(linkedHashMap, C155617Wt.A00);
                try {
                    BGx.A03(new C138606iO(r82), A0f);
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                BnZ4 = new C137176fi(r82, new AnonymousClass7OT(BGx, A0f, z));
                r4.A0R(BnZ4);
            }
            C136916fF.A0M(r4, false);
            C137176fi r10 = (C137176fi) BnZ4;
            C132846Vm.A02(r5, AnonymousClass0AJ.A00, new C154167Rd(r10));
            Configuration configuration = (Configuration) r6.getValue();
            r5.Bum(-485908294);
            r5.Bum(-492369756);
            Object BnZ5 = r5.BnZ();
            if (BnZ5 == obj) {
                BnZ5 = new C114395hB();
                r4.A0R(BnZ5);
            }
            C136916fF.A0M(r4, false);
            C114395hB r83 = (C114395hB) BnZ5;
            r5.Bum(-492369756);
            Object BnZ6 = r5.BnZ();
            Configuration configuration2 = BnZ6;
            if (BnZ6 == obj) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                r5.Bwv(configuration3);
                configuration2 = configuration3;
            }
            C136916fF.A0M(r4, false);
            Configuration configuration4 = (Configuration) configuration2;
            r5.Bum(-492369756);
            Object BnZ7 = r5.BnZ();
            if (BnZ7 == obj) {
                BnZ7 = new C133476Yq(configuration4, r83);
                r4.A0R(BnZ7);
            }
            C136916fF.A0M(r4, false);
            C132846Vm.A02(r5, r83, new C154837Ts(context, (C133476Yq) BnZ7));
            C136916fF.A0M(r4, false);
            C120655rr[] r42 = new C120655rr[7];
            C120655rr.A00(A00, r6.getValue(), r42, 0, true);
            r42[1] = new C120655rr(A01, context, true);
            C120655rr.A00(A04, viewTreeOwners.A00, r42, 2, true);
            C120655rr.A00(A05, viewTreeOwners.A01, r42, 3, true);
            C120655rr.A00(C112315dh.A00, r10, r42, 4, true);
            C120655rr.A00(A03, androidComposeView2, r42, 5, true);
            C120655rr.A00(A02, r83, r42, 6, true);
            C009003v r62 = r17;
            AnonymousClass6Fz.A01(r5, AnonymousClass5WH.A00(r5, new AnonymousClass7YY(androidComposeView2, r7, r62), 1471621628), r42, 56);
            C136976fO B6Z = r5.B6Z();
            if (B6Z != null) {
                B6Z.A06 = new AnonymousClass7YZ(androidComposeView2, r62, i);
                return;
            }
            return;
        }
        throw AnonymousClass001.A09("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final /* synthetic */ void A01(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompositionLocal ");
        A0u.append(str);
        throw AnonymousClass000.A0g(" not present", A0u);
    }
}
