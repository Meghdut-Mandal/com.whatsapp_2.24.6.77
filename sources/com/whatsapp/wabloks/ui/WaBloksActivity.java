package com.whatsapp.wabloks.ui;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01P;
import X.AnonymousClass5l6;
import X.AnonymousClass60P;
import X.AnonymousClass65A;
import X.C100974wL;
import X.C101084wy;
import X.C101094wz;
import X.C102364zs;
import X.C116645kv;
import X.C1265064h;
import X.C131616Pt;
import X.C158047fi;
import X.C158057fj;
import X.C159757js;
import X.C159787jv;
import X.C162977pS;
import X.C36441kJ;
import X.C88684Tq;
import X.C90494aF;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Map;
import java.util.Set;

public class WaBloksActivity extends C100974wL implements C159757js, C159787jv {
    public AnonymousClass60P A00;
    public AnonymousClass65A A01;
    public C1265064h A02;
    public AnonymousClass5l6 A03;
    public C131616Pt A04;
    public C101084wy A05;
    public C101094wz A06;
    public AnonymousClass005 A07;
    public AnonymousClass005 A08;
    public String A09;
    public Map A0A;
    public Map A0B;
    public final Set A0C = C36441kJ.A16();
    public final Set A0D = C36441kJ.A16();

    public static Intent A07(Context context, String str, String str2) {
        return C90494aF.A0D(context, (Parcelable) null, WaBloksActivity.class, str, str2);
    }

    public AnonymousClass65A BJB() {
        AnonymousClass65A r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C102364zs A002 = this.A00.A00(this, getSupportFragmentManager(), new C116645kv(this.A0A));
        this.A01 = A002;
        return A002;
    }

    public void Bwn(C158057fj r3) {
        if (this.A06.A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
            this.A05.A03(r3);
        }
    }

    public void Bwo(C158047fi r3, C158057fj r4, boolean z) {
        if (this.A06.A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
            C101094wz r0 = this.A06;
            if (r0 != null) {
                r0.A01(r3, r4);
            }
            if (z) {
                onCreateOptionsMenu(this.A02.getMenu());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r7 = this;
            X.4wy r2 = r7.A05
            boolean r0 = r2 instanceof X.C107415On
            if (r0 == 0) goto L_0x006e
            r0 = r2
            X.5On r0 = (X.C107415On) r0
            X.7fl r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1V(r0)
        L_0x000f:
            if (r0 == 0) goto L_0x0080
        L_0x0011:
            boolean r0 = r2 instanceof X.C107415On
            if (r0 == 0) goto L_0x0027
            X.5On r2 = (X.C107415On) r2
            X.7fl r0 = r2.A00
            if (r0 == 0) goto L_0x0026
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = r2.A03
            X.65A r1 = r0.BJB()
            X.7fl r0 = r2.A00
        L_0x0023:
            X.C142326oh.A0B(r1, r0)
        L_0x0026:
            return
        L_0x0027:
            boolean r0 = r2 instanceof X.C107385Ok
            if (r0 == 0) goto L_0x005b
            X.5Ok r2 = (X.C107385Ok) r2
            com.whatsapp.wabloks.ui.WaBloksActivity r6 = r2.A03
            X.5OV r6 = (X.AnonymousClass5OV) r6
            X.67o r5 = r2.A00
            java.lang.String r3 = r5.A02
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x0045
            X.6EW r1 = r6.A00
            if (r1 == 0) goto L_0x0045
            X.705 r0 = new X.705
            r0.<init>(r2, r3)
            r1.A02(r0)
        L_0x0045:
            java.lang.String r4 = r5.A00
            java.lang.String r3 = r5.A01
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0026
            X.6EW r2 = r6.A00
            if (r2 == 0) goto L_0x0026
            r1 = 1
            X.707 r0 = new X.707
            r0.<init>(r4, r3, r1)
            r2.A02(r0)
            return
        L_0x005b:
            boolean r0 = r2 instanceof X.C107365Oi
            if (r0 == 0) goto L_0x0026
            X.5Oi r2 = (X.C107365Oi) r2
            X.7fl r0 = r2.A00
            if (r0 == 0) goto L_0x0026
            com.whatsapp.wabloks.ui.WaBloksActivity r0 = r2.A03
            X.65A r1 = r0.BJB()
            X.7fl r0 = r2.A00
            goto L_0x0023
        L_0x006e:
            boolean r0 = r2 instanceof X.C107385Ok
            if (r0 != 0) goto L_0x0011
            boolean r0 = r2 instanceof X.C107365Oi
            if (r0 == 0) goto L_0x0080
            r0 = r2
            X.5Oi r0 = (X.C107365Oi) r0
            X.7fl r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1V(r0)
            goto L_0x000f
        L_0x0080:
            X.01z r0 = r7.getSupportFragmentManager()
            int r1 = r0.A0I()
            r0 = 1
            if (r1 > r0) goto L_0x009b
            android.content.Intent r0 = r7.getIntent()
            android.content.Intent r1 = X.C53092ql.A00(r0)
            r0 = 0
            r7.setResult(r0, r1)
            r7.finish()
            return
        L_0x009b:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.WaBloksActivity.onBackPressed():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.whatsapp.wabloks.base.BkScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: com.whatsapp.authgraphql.ui.CommonBloksScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: com.whatsapp.wabloks.base.FdsContentFragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX WARNING: type inference failed for: r8v5, types: [com.whatsapp.inappsupport.ui.SupportBkScreenFragment] */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015a A[LOOP:0: B:37:0x0154->B:39:0x015a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = r24
            r5 = r25
            super.onCreate(r5)
            boolean r8 = r0 instanceof com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity
            if (r8 == 0) goto L_0x029b
            r1 = 2131626539(0x7f0e0a2b, float:1.8880317E38)
        L_0x000e:
            r0.setContentView((int) r1)
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r7 = "screen_name"
            java.lang.String r4 = r2.getStringExtra(r7)
            r0.A09 = r4
            X.5l6 r3 = r0.A03
            r1 = 0
            X.AnonymousClass00C.A0D(r4, r1)
            r3.A00 = r4
            X.65A r1 = r0.A01
            if (r1 != 0) goto L_0x003c
            X.60P r6 = r0.A00
            X.01z r4 = r0.getSupportFragmentManager()
            java.util.Map r3 = r0.A0A
            X.5kv r1 = new X.5kv
            r1.<init>(r3)
            X.4zs r1 = r6.A00(r0, r4, r1)
            r0.A01 = r1
        L_0x003c:
            if (r8 == 0) goto L_0x0098
            com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity r0 = (com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity) r0
            r6 = 0
            java.lang.String r1 = "screen_params"
            java.lang.String r1 = r2.getStringExtra(r1)
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = ""
        L_0x004b:
            java.lang.String r2 = r2.getStringExtra(r7)
            X.C18740tg.A06(r2)
            X.005 r3 = r0.A00
            if (r3 == 0) goto L_0x02ff
            java.lang.Object r3 = r3.get()
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x02a7
            r3 = 2131433001(0x7f0b1629, float:1.8487775E38)
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L_0x006e
            r3.setVisibility(r6)
        L_0x006e:
            X.AnonymousClass00C.A0B(r2)
            X.005 r3 = r0.A01
            if (r3 == 0) goto L_0x02a0
            java.lang.Object r5 = r3.get()
            X.64r r5 = (X.C1266064r) r5
            java.lang.ref.WeakReference r10 = X.AnonymousClass001.A0F(r0)
            boolean r11 = X.AnonymousClass1RC.A0A(r0)
            X.0wQ r3 = r0.A02
            java.lang.String r8 = X.C90514aH.A0v(r3)
            r4 = 1
            X.7qr r3 = new X.7qr
            r3.<init>(r0, r4)
            r6 = 0
            r4 = r5
            r5 = r3
            r7 = r2
            r9 = r1
            r4.A00(r5, r6, r7, r8, r9, r10, r11)
        L_0x0097:
            return
        L_0x0098:
            X.01z r4 = r0.getSupportFragmentManager()
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity
            if (r1 == 0) goto L_0x0187
            java.lang.String r7 = r2.getStringExtra(r7)
            java.lang.String r1 = "fds_state_name"
            java.lang.String r8 = r2.getStringExtra(r1)
            java.lang.String r1 = "data_module_job_id"
            java.lang.String r9 = r2.getStringExtra(r1)
            java.lang.String r1 = "data_module_namespace"
            java.lang.String r10 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_params"
            java.lang.String r11 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r6 = r2.getParcelableExtra(r1)
            X.6bn r6 = (X.C134906bn) r6
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r12 = r2.getStringExtra(r1)
            java.lang.String r1 = "fds_manager_id"
            java.lang.String r13 = r2.getStringExtra(r1)
            java.lang.String r1 = "fds_observer_id"
            java.lang.String r14 = r2.getStringExtra(r1)
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r8 = com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00da:
            int r1 = r4.A0I()
            if (r1 != 0) goto L_0x00f6
            if (r8 == 0) goto L_0x00f6
            X.09Y r2 = new X.09Y
            r2.<init>(r4)
            r1 = 2131428083(0x7f0b02f3, float:1.84778E38)
            r2.A0A(r8, r1)
            java.lang.String r1 = r0.A09
            r2.A0J(r1)
            r1 = 1
            r2.A00(r1)
        L_0x00f6:
            java.util.Map r2 = r0.A0B
            java.lang.String r1 = r0.A09
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x0164
            java.util.Map r2 = r0.A0B
            java.lang.String r1 = r0.A09
            java.lang.Object r2 = r2.get(r1)
            X.7ju r2 = (X.C159777ju) r2
        L_0x010a:
            X.005 r1 = r0.A08
            java.lang.Object r1 = r1.get()
            X.64N r1 = (X.AnonymousClass64N) r1
            X.4wy r1 = r2.B4l(r0, r1)
            r0.A05 = r1
            X.4wz r1 = r2.B4i(r0)
        L_0x011c:
            r0.A06 = r1
            java.lang.String r2 = r0.A09
            if (r2 == 0) goto L_0x013d
            java.lang.String r1 = "com.bloks.www.ctwa.messaging.hub"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x013d
            r1 = 2131102006(0x7f060936, float:1.7816438E38)
            X.AnonymousClass1RC.A04(r0, r1)
            r2 = 2131101103(0x7f0605af, float:1.7814606E38)
            r1 = 1
            X.AnonymousClass1RC.A06(r0, r2, r1)
            r1 = 2131435279(0x7f0b1f0f, float:1.8492396E38)
            X.C36361kB.A0v(r0, r1)
        L_0x013d:
            java.util.Set r3 = r0.A0C
            X.4wz r1 = r0.A06
            r3.add(r1)
            java.util.Set r2 = r0.A0D
            X.4wz r1 = r0.A06
            r2.add(r1)
            X.4wy r1 = r0.A05
            r3.add(r1)
            java.util.Iterator r2 = r3.iterator()
        L_0x0154:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r2.next()
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            r1.onActivityCreated(r0, r5)
            goto L_0x0154
        L_0x0164:
            boolean r1 = r0 instanceof X.AnonymousClass7dM
            if (r1 == 0) goto L_0x0178
            r1 = r0
            X.7dM r1 = (X.AnonymousClass7dM) r1
            X.5OV r1 = (X.AnonymousClass5OV) r1
            X.71P r2 = r1.A02
            if (r2 != 0) goto L_0x010a
            java.lang.String r0 = "phoenixBloksActivityHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0178:
            X.0ts r2 = r0.A00
            X.5Oj r1 = new X.5Oj
            r1.<init>(r2, r0)
            r0.A05 = r1
            X.5Op r1 = new X.5Op
            r1.<init>(r2, r0)
            goto L_0x011c
        L_0x0187:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsModalActivity
            if (r1 == 0) goto L_0x01a4
            r6 = r0
            com.whatsapp.wabloks.ui.WaFcsModalActivity r6 = (com.whatsapp.wabloks.ui.WaFcsModalActivity) r6
            java.lang.String r3 = "fds_observer_id"
            java.lang.String r1 = r2.getStringExtra(r3)
            com.whatsapp.wabloks.base.FdsContentFragmentManager r8 = new com.whatsapp.wabloks.base.FdsContentFragmentManager
            r8.<init>()
            android.os.Bundle r1 = X.C36431kI.A0I(r3, r1)
            r8.A17(r1)
            r6.A00 = r8
            goto L_0x00da
        L_0x01a4:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity
            if (r1 == 0) goto L_0x01ab
            r8 = 0
            goto L_0x00da
        L_0x01ab:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity
            if (r1 != 0) goto L_0x0294
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksActivityWithCustomPreloadScreens
            if (r1 == 0) goto L_0x01d8
            java.lang.String r7 = r2.getStringExtra(r7)
            java.lang.String r1 = "screen_params"
            java.lang.String r6 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r3 = r2.getParcelableExtra(r1)
            X.6bn r3 = (X.C134906bn) r3
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r1 = r2.getStringExtra(r1)
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r8 = new com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens
            r8.<init>()
            r8.A1c(r7)
            X.C90474aD.A14(r8, r3, r1, r6)
            goto L_0x00da
        L_0x01d8:
            boolean r1 = r0 instanceof com.whatsapp.payments.care.csat.CsatSurveyBloksActivity
            if (r1 != 0) goto L_0x0294
            boolean r1 = r0 instanceof com.whatsapp.inappsupport.ui.SupportBloksActivity
            if (r1 == 0) goto L_0x0249
            r3 = 0
            java.lang.String r9 = r2.getStringExtra(r7)
            if (r9 != 0) goto L_0x01e9
            java.lang.String r9 = ""
        L_0x01e9:
            java.lang.String r1 = "com.bloks.www.csf"
            boolean r1 = X.AnonymousClass098.A07(r9, r1, r3)
            if (r1 != 0) goto L_0x022d
            java.lang.String r1 = "com.bloks.www.cxthelp"
            boolean r1 = X.AnonymousClass098.A07(r9, r1, r3)
            if (r1 == 0) goto L_0x022d
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r7 = "screen_params"
            java.lang.String r6 = r1.getStringExtra(r7)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r3 = "screen_cache_config"
            android.os.Parcelable r2 = r1.getParcelableExtra(r3)
            X.6bn r2 = (X.C134906bn) r2
            com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment r8 = new com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment
            r8.<init>()
        L_0x0214:
            r8.A1c(r9)
        L_0x0217:
            com.whatsapp.wabloks.base.BkFragment.A05(r8)
            android.os.Bundle r1 = r8.A0b()
            r1.putSerializable(r7, r6)
            com.whatsapp.wabloks.base.BkFragment.A05(r8)
            android.os.Bundle r1 = r8.A0b()
            r1.putParcelable(r3, r2)
            goto L_0x00da
        L_0x022d:
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r7 = "screen_params"
            java.lang.String r6 = r1.getStringExtra(r7)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r3 = "screen_cache_config"
            android.os.Parcelable r2 = r1.getParcelableExtra(r3)
            X.6bn r2 = (X.C134906bn) r2
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r8 = new com.whatsapp.inappsupport.ui.SupportBkScreenFragment
            r8.<init>()
            goto L_0x0214
        L_0x0249:
            boolean r1 = r0 instanceof com.whatsapp.authgraphql.ui.CommonBloksActivity
            if (r1 == 0) goto L_0x026c
            java.lang.String r1 = r2.getStringExtra(r7)
            if (r1 != 0) goto L_0x0255
            java.lang.String r1 = ""
        L_0x0255:
            java.lang.String r7 = "screen_params"
            java.lang.String r6 = r2.getStringExtra(r7)
            java.lang.String r3 = "screen_cache_config"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            X.6bn r2 = (X.C134906bn) r2
            com.whatsapp.authgraphql.ui.CommonBloksScreenFragment r8 = new com.whatsapp.authgraphql.ui.CommonBloksScreenFragment
            r8.<init>()
            r8.A1c(r1)
            goto L_0x0217
        L_0x026c:
            java.lang.String r7 = r2.getStringExtra(r7)
            java.lang.String r1 = "screen_params"
            java.lang.String r6 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r3 = r2.getParcelableExtra(r1)
            X.6bn r3 = (X.C134906bn) r3
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r2 = r2.getStringExtra(r1)
            r1 = 0
            com.whatsapp.wabloks.base.BkScreenFragment r8 = new com.whatsapp.wabloks.base.BkScreenFragment
            r8.<init>()
            r8.A1c(r7)
            X.C90474aD.A14(r8, r3, r2, r6)
            r8.A05 = r1
            goto L_0x00da
        L_0x0294:
            X.02E r8 = new X.02E
            r8.<init>()
            goto L_0x00da
        L_0x029b:
            r1 = 2131624082(0x7f0e0092, float:1.8875334E38)
            goto L_0x000e
        L_0x02a0:
            java.lang.String r0 = "asyncActionLauncherLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02a7:
            X.AnonymousClass00C.A0B(r2)
            X.AnonymousClass00C.A0D(r2, r6)
            java.lang.Integer r13 = X.C023109s.A00
            java.lang.Integer r15 = X.C023109s.A01
            r4 = 1
            r8 = 0
            r20 = 16542(0x409e, float:2.318E-41)
            X.6WB r7 = new X.6WB
            r10 = r8
            r11 = r8
            r12 = r8
            r16 = r13
            r17 = r8
            r18 = r8
            r19 = r8
            r22 = 0
            r23 = 1
            r21 = 0
            r9 = r8
            r14 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r7 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A05(r7, r2)
            X.65A r3 = r0.A01
            r7.A00 = r3
            X.6oJ r5 = new X.6oJ
            r5.<init>((java.lang.String) r2)
            X.011[] r4 = new X.AnonymousClass011[r4]
            java.lang.String r3 = "params"
            X.C36341k9.A1J(r3, r1, r4, r6)
            java.util.HashMap r1 = X.C000400e.A05(r4)
            X.5wn r3 = new X.5wn
            r3.<init>()
            r3.A01 = r2
            r3.A02 = r1
            X.6j9 r1 = new X.6j9
            r1.<init>(r3)
            r16 = 32
            r9 = r7
            r10 = r0
            r11 = r1
            r13 = r5
            r14 = r8
            r15 = r2
            X.C132876Vp.A02(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x02ff:
            java.lang.String r0 = "asyncActionAppIds"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.WaBloksActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (C88684Tq BUv : this.A0D) {
            BUv.BUv(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C88684Tq Bbx : this.A0D) {
            if (Bbx.Bbx(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (C88684Tq BdM : this.A0D) {
            BdM.BdM(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public C1265064h B8t() {
        return this.A02;
    }

    public void onDestroy() {
        if (isFinishing() && getIntent().getStringExtra("wa_screen_options") != null) {
            C131616Pt r3 = this.A04;
            String stringExtra = getIntent().getStringExtra("wa_screen_options");
            AnonymousClass00C.A0D(stringExtra, 0);
            r3.A03(new C162977pS(stringExtra, 0), "wa_screen_options");
        }
        super.onDestroy();
    }
}
