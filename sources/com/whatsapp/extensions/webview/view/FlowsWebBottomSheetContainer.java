package com.whatsapp.extensions.webview.view;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass07B;
import X.AnonymousClass099;
import X.AnonymousClass0FL;
import X.AnonymousClass185;
import X.AnonymousClass1KT;
import X.AnonymousClass3T1;
import X.AnonymousClass3Y2;
import X.AnonymousClass6LV;
import X.AnonymousClass6NP;
import X.AnonymousClass6OE;
import X.AnonymousClass6ZE;
import X.AnonymousClass7M7;
import X.C012005e;
import X.C023509x;
import X.C10810fG;
import X.C115235iY;
import X.C131376Ou;
import X.C154607Sv;
import X.C154617Sw;
import X.C154627Sx;
import X.C154637Sy;
import X.C164717sG;
import X.C164997si;
import X.C165177t0;
import X.C18820ts;
import X.C19600wD;
import X.C20310xM;
import X.C20380xT;
import X.C20810yC;
import X.C224514j;
import X.C236419g;
import X.C24801Dv;
import X.C33311f5;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C90514aH;
import X.C91364bt;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.PercentageBasedMaxHeightLinearLayout;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class FlowsWebBottomSheetContainer extends Hilt_FlowsWebBottomSheetContainer {
    public LinearLayout A00;
    public RelativeLayout A01;
    public Toolbar A02;
    public C24801Dv A03;
    public C115235iY A04;
    public C19600wD A05;
    public AnonymousClass185 A06;
    public C33751fs A07;
    public AnonymousClass6OE A08;
    public C18820ts A09;
    public C20310xM A0A;
    public C236419g A0B;
    public AnonymousClass6NP A0C;
    public FlowsInitialLoadingView A0D;
    public AnonymousClass1KT A0E;
    public AnonymousClass6LV A0F;
    public WaFlowsViewModel A0G;
    public C20810yC A0H;
    public C20380xT A0I;
    public C131376Ou A0J;
    public AnonymousClass005 A0K;
    public AnonymousClass005 A0L;
    public boolean A0M = true;
    public UserJid A0N;
    public String A0O;
    public boolean A0P;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        FlowsInitialLoadingView flowsInitialLoadingView;
        Toolbar toolbar;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J2 = C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
        A1Z().setOnKeyListener(new C164717sG(this, 1));
        this.A01 = (RelativeLayout) C012005e.A02(A0J2, R.id.toolbar_layout);
        this.A02 = (Toolbar) C012005e.A02(A0J2, R.id.flows_bottom_sheet_toolbar);
        AnonymousClass01I A0h = A0h();
        AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass07B A0Q = C36431kI.A0Q((AnonymousClass01L) A0h, this.A02);
        if (A0Q != null) {
            A0Q.A0X(false);
        }
        Toolbar toolbar2 = this.A02;
        if (toolbar2 != null) {
            C18820ts r2 = this.A09;
            if (r2 != null) {
                toolbar2.setNavigationIcon((Drawable) C91364bt.A00(A0a(), r2, R.drawable.vec_ic_close_24));
            } else {
                throw C36321k7.A09();
            }
        }
        Resources A0G2 = C36341k9.A0G(this);
        if (!(A0G2 == null || (toolbar = this.A02) == null)) {
            C36391kE.A1C(A0G2, toolbar, C224514j.A00(A0a(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        Toolbar toolbar3 = this.A02;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new AnonymousClass3Y2(this, 3));
        }
        Toolbar toolbar4 = this.A02;
        if ((toolbar4 instanceof WDSToolbar) && toolbar4 != null) {
            C36341k9.A0q(A0a(), toolbar4, R.color.f6nameremoved);
        }
        this.A00 = C90514aH.A0U(A0J2, R.id.flows_web_view_container);
        this.A0D = (FlowsInitialLoadingView) C012005e.A02(A0J2, R.id.flows_initial_view);
        C20810yC r1 = this.A0H;
        if (r1 != null) {
            if (!r1.A0E(7760) && (flowsInitialLoadingView = this.A0D) != null) {
                View view = flowsInitialLoadingView.A00;
                if (view == null) {
                    throw C36331k8.A0d("loadingView");
                }
                ((CircularProgressBar) view).A0A = AnonymousClass00F.A00(flowsInitialLoadingView.getContext(), R.color.f6nameremoved);
            }
            C36361kB.A14(this.A02);
            Toolbar toolbar5 = this.A02;
            if (toolbar5 != null) {
                toolbar5.setNavigationOnClickListener(new AnonymousClass3Y2(this, 4));
            }
            C10810fG r6 = new C10810fG();
            Bundle bundle2 = this.A0A;
            if (bundle2 != null) {
                r6.element = C36431kI.A0l(bundle2.getString("chat_id"));
                str = bundle2.getString("flow_id");
            } else {
                str = null;
            }
            if (r6.element == null || str == null) {
                A05(this, A0n(R.string.f12nameremoved), (String) null);
            } else {
                WaFlowsViewModel waFlowsViewModel = this.A0G;
                if (waFlowsViewModel == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                }
                C165177t0.A00(A0m(), waFlowsViewModel.A06, new C154607Sv(this), 27);
                C36331k8.A1T(new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3(this, (C023509x) null, r6), C33311f5.A00(this));
            }
            Window window = A1Z().getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            return A0J2;
        }
        throw C36321k7.A07();
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        FlowsInitialLoadingView flowsInitialLoadingView;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        UserJid userJid = this.A0N;
        if (!(userJid == null || (str = this.A0O) == null || (flowsInitialLoadingView = this.A0D) == null)) {
            flowsInitialLoadingView.A02(userJid, str, false);
        }
        WaFlowsViewModel waFlowsViewModel = this.A0G;
        if (waFlowsViewModel == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(this, waFlowsViewModel.A05, new C154617Sw(this), 24);
        WaFlowsViewModel waFlowsViewModel2 = this.A0G;
        if (waFlowsViewModel2 == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(this, waFlowsViewModel2.A01, new C154627Sx(this), 25);
        WaFlowsViewModel waFlowsViewModel3 = this.A0G;
        if (waFlowsViewModel3 == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(this, waFlowsViewModel3.A02, new C154637Sy(this), 26);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        boolean A1a = C36341k9.A1a(menu, menuInflater);
        boolean z = this.A0P;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        C36391kE.A1F(menu, A1a ? 1 : 0, i);
        menu.add(0, 2, 0, A0n(R.string.f12nameremoved)).setShowAsAction(0);
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                A03();
            }
            return false;
        }
        A06("extensions_help");
        return false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        A0i().finish();
    }

    private final void A03() {
        UserJid A022;
        Bundle bundle = this.A0A;
        if (bundle != null && (A022 = UserJid.Companion.A02(bundle.getString("chat_id"))) != null) {
            C236419g r0 = this.A0B;
            if (r0 != null) {
                r0.A07().A0A(new C164997si(A022, this, 2));
                return;
            }
            throw C36331k8.A0d("companionDeviceManager");
        }
    }

    public static final void A05(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, String str, String str2) {
        String str3;
        String string;
        C19600wD r0 = flowsWebBottomSheetContainer.A05;
        if (r0 != null) {
            if (!r0.A09()) {
                str = flowsWebBottomSheetContainer.A0n(R.string.f12nameremoved);
                str3 = "no_network_error";
            } else {
                str3 = str2;
            }
            Bundle bundle = flowsWebBottomSheetContainer.A0A;
            if (!(bundle == null || (string = bundle.getString("flow_id")) == null)) {
                if (str3 != null) {
                    AnonymousClass1KT r2 = flowsWebBottomSheetContainer.A0E;
                    if (r2 != null) {
                        r2.A0B(string.hashCode(), str3, (String) null);
                    } else {
                        throw C36331k8.A0d("flowsScreenNavigationLogger");
                    }
                }
                AnonymousClass1KT r22 = flowsWebBottomSheetContainer.A0E;
                if (r22 != null) {
                    r22.A0C(string.hashCode(), 3);
                } else {
                    throw C36331k8.A0d("flowsScreenNavigationLogger");
                }
            }
            if (str2 != null) {
                AnonymousClass6OE r3 = flowsWebBottomSheetContainer.A08;
                if (r3 != null) {
                    AnonymousClass01I A0h = flowsWebBottomSheetContainer.A0h();
                    AnonymousClass185 r1 = flowsWebBottomSheetContainer.A06;
                    if (r1 != null) {
                        AnonymousClass6NP r02 = flowsWebBottomSheetContainer.A0C;
                        if (r02 != null) {
                            r3.A01(A0h, r1, r02, str2);
                        } else {
                            throw C36331k8.A0d("wamFlowsStructuredMessageInteractionReporter");
                        }
                    } else {
                        throw C36331k8.A0d("verifiedNameManager");
                    }
                } else {
                    throw C36331k8.A0d("extensionsDataUtil");
                }
            }
            FlowsInitialLoadingView flowsInitialLoadingView = flowsWebBottomSheetContainer.A0D;
            if (flowsInitialLoadingView != null) {
                if (str == null) {
                    str = flowsWebBottomSheetContainer.A0n(R.string.f12nameremoved);
                    AnonymousClass00C.A08(str);
                }
                flowsInitialLoadingView.setErrorMessage(str);
            }
            FlowsInitialLoadingView flowsInitialLoadingView2 = flowsWebBottomSheetContainer.A0D;
            if (flowsInitialLoadingView2 != null) {
                flowsInitialLoadingView2.setVisibility(0);
            }
            RelativeLayout relativeLayout = flowsWebBottomSheetContainer.A01;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            C36331k8.A0y(flowsWebBottomSheetContainer.A00);
            return;
        }
        throw C36331k8.A0d("connectivityStateProvider");
    }

    private final void A06(String str) {
        if (this.A0P) {
            C33751fs r1 = this.A07;
            if (r1 != null) {
                r1.A01(A0i(), str);
                return;
            }
            throw C36331k8.A0d("contextualHelpHandler");
        }
        String str2 = this.A0O;
        if (str2 != null) {
            C24801Dv r3 = this.A03;
            if (r3 != null) {
                Context A0a = A0a();
                C20380xT r0 = this.A0I;
                if (r0 != null) {
                    r3.Bp7(A0a, r0.A02(str2), (AnonymousClass3T1) null);
                    return;
                }
                throw C36331k8.A0d("faqLinkFactory");
            }
            throw C36331k8.A0d("activityUtils");
        }
    }

    public void A1M() {
        C20810yC r1 = this.A0H;
        if (r1 != null) {
            ((PercentageBasedMaxHeightLinearLayout) C012005e.A02(A0d(), R.id.flows_bottom_sheet)).A00 = r1.A07(3319);
            super.A1M();
            return;
        }
        throw C36321k7.A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d7, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0217, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0248, code lost:
        if (r3 != null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x025f, code lost:
        if (r3 != null) goto L_0x0261;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1m(android.webkit.WebMessagePort r23, org.json.JSONObject r24) {
        /*
            r22 = this;
            java.lang.String r0 = "method"
            r2 = r24
            java.lang.String r5 = r2.optString(r0)
            java.lang.String r4 = "data"
            org.json.JSONObject r3 = r2.optJSONObject(r4)
            r10 = 0
            r1 = r22
            if (r5 == 0) goto L_0x001a
            int r0 = r5.hashCode()
            switch(r0) {
                case -1245310213: goto L_0x021b;
                case -1169841072: goto L_0x020d;
                case -111710694: goto L_0x01fd;
                case -17437989: goto L_0x01f2;
                case 434552709: goto L_0x01ab;
                case 1004141592: goto L_0x0172;
                case 1259564602: goto L_0x010e;
                case 1887645349: goto L_0x003e;
                case 1911526633: goto L_0x0029;
                default: goto L_0x001a;
            }
        L_0x001a:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = X.C33311f5.A00(r1)
            com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 r0 = new com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1
            r4 = r23
            r0.<init>(r4, r1, r10, r2)
            X.C36331k8.A1T(r0, r3)
        L_0x0028:
            return
        L_0x0029:
            java.lang.String r0 = "WAExtensionsSetDraggable"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x003c
            java.lang.String r0 = "is_draggable"
            boolean r0 = r3.optBoolean(r0)
        L_0x0039:
            r1.A0M = r0
            return
        L_0x003c:
            r0 = 1
            goto L_0x0039
        L_0x003e:
            java.lang.String r0 = "WAFlowsMediaSelect"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.0yC r2 = r1.A0H
            if (r2 == 0) goto L_0x022e
            r0 = 6826(0x1aaa, float:9.565E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0028
            X.6LV r4 = r1.A0F
            if (r4 == 0) goto L_0x0227
            X.01I r9 = r1.A0h()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.AnonymousClass00C.A0E(r9, r0)
            X.7Su r8 = new X.7Su
            r8.<init>(r1)
            r5 = 1
            X.AnonymousClass00C.A0D(r9, r5)
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x0075
            java.lang.String r0 = "collectionId"
            java.lang.String r0 = r3.optString(r0, r7)
            if (r0 == 0) goto L_0x0075
            r7 = r0
        L_0x0075:
            X.01X r6 = r9.A04
            X.04a r2 = new X.04a
            r2.<init>()
            X.6dw r1 = new X.6dw
            r1.<init>(r4, r7, r8)
            java.lang.String r0 = "flowsMediaPickerResultKey"
            X.0sc r1 = r6.A02(r1, r2, r0)
            if (r3 == 0) goto L_0x010c
            java.lang.String r0 = "maxItems"
            int r8 = r3.optInt(r0, r5)
        L_0x008f:
            java.lang.String r2 = "gallery"
            if (r3 == 0) goto L_0x009b
            java.lang.String r0 = "inputType"
            java.lang.String r0 = r3.optString(r0, r2)
            if (r0 != 0) goto L_0x009c
        L_0x009b:
            r0 = r2
        L_0x009c:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00fa
            X.0yC r2 = r4.A02
            r0 = 7951(0x1f0f, float:1.1142E-41)
            boolean r0 = r2.A0E(r0)
            r7 = 0
            r4 = 51
            r3 = 40
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r6 = r9.getPackageName()
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity"
        L_0x00bb:
            r2.setClassName(r6, r0)
            java.lang.String r0 = "max_items"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "skip_max_items_new_limit"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "preview"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "send"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "include_media"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_send_media"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "should_hide_caption_view"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_set_gallery_result"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "origin"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "media_sharing_user_journey_origin"
            r2.putExtra(r0, r3)
        L_0x00f0:
            X.AnonymousClass00C.A0B(r2)
            r1.A01(r10, r2)
            return
        L_0x00f7:
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPicker"
            goto L_0x00bb
        L_0x00fa:
            r17 = 0
            r19 = 0
            r14 = 17
            r15 = 40
            r16 = 35
            r12 = r10
            r13 = r10
            r11 = r10
            android.content.Intent r2 = X.AnonymousClass190.A0a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            goto L_0x00f0
        L_0x010c:
            r8 = 1
            goto L_0x008f
        L_0x010e:
            java.lang.String r0 = "WAFlowsShowNativeInputDialogComponent"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            org.json.JSONObject r3 = r2.optJSONObject(r4)
            if (r3 == 0) goto L_0x0165
            java.lang.String r0 = "input_type"
            java.lang.String r3 = r3.optString(r0)
        L_0x0122:
            java.lang.String r0 = "DatePicker"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0167
            org.json.JSONObject r2 = r2.optJSONObject(r4)
            r18 = 0
            if (r2 == 0) goto L_0x0161
            java.lang.String r0 = "params"
            org.json.JSONObject r3 = r2.optJSONObject(r0)
            java.lang.String r0 = "input_name"
            java.lang.String r19 = r2.optString(r0)
        L_0x013e:
            java.lang.String r20 = ""
            if (r19 != 0) goto L_0x0144
            r19 = r20
        L_0x0144:
            if (r2 == 0) goto L_0x0150
            java.lang.String r0 = "input_type"
            java.lang.String r0 = r2.optString(r0)
            if (r0 == 0) goto L_0x0150
            r20 = r0
        L_0x0150:
            if (r3 == 0) goto L_0x015e
            java.lang.String r0 = "date_picker_mode"
            int r21 = r3.optInt(r0)
        L_0x0158:
            java.lang.String r2 = "FlowsLogger/getDatePickerInputParams/bind Max date is not a valid date format"
            if (r3 == 0) goto L_0x0246
            goto L_0x0233
        L_0x015e:
            r21 = 1
            goto L_0x0158
        L_0x0161:
            r3 = r10
            r19 = r10
            goto L_0x013e
        L_0x0165:
            r3 = 0
            goto L_0x0122
        L_0x0167:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/handleInputDialog Input type dialog is not recognised - "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            goto L_0x01d7
        L_0x0172:
            java.lang.String r0 = "WAExtensionsConfigureNavBar"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x01a9
            java.lang.String r0 = "is_hidden"
            boolean r4 = r3.optBoolean(r0)
        L_0x0182:
            android.widget.RelativeLayout r2 = r1.A01
            r3 = 0
            if (r2 == 0) goto L_0x0190
            r0 = r4 ^ 1
            int r0 = X.C36351kA.A00(r0)
            r2.setVisibility(r0)
        L_0x0190:
            com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView r2 = r1.A0D
            if (r2 == 0) goto L_0x019d
            r0 = r4 ^ 1
            int r0 = X.C36351kA.A00(r0)
            r2.setVisibility(r0)
        L_0x019d:
            android.widget.LinearLayout r0 = r1.A00
            if (r0 == 0) goto L_0x0028
            if (r4 != 0) goto L_0x01a5
            r3 = 8
        L_0x01a5:
            r0.setVisibility(r3)
            return
        L_0x01a9:
            r4 = 0
            goto L_0x0182
        L_0x01ab:
            java.lang.String r0 = "WAExtensionsReportItem"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            if (r3 == 0) goto L_0x01bb
            java.lang.String r0 = "product_id"
            java.lang.String r10 = r3.optString(r0)
        L_0x01bb:
            android.os.Bundle r2 = r1.A0A
            if (r2 == 0) goto L_0x01f0
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x01f0
            com.whatsapp.jid.UserJid r6 = X.C36431kI.A0l(r0)
        L_0x01cb:
            if (r10 == 0) goto L_0x01ed
            boolean r0 = X.AnonymousClass098.A06(r10)
            if (r0 != 0) goto L_0x01ed
            if (r6 != 0) goto L_0x01db
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] failed to parse chat jid from string"
        L_0x01d7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01db:
            X.01I r3 = r1.A0i()
            boolean r0 = r3 instanceof X.C225014r
            if (r0 != 0) goto L_0x01e6
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] activity doesn't implement DialogInterface"
            goto L_0x01d7
        L_0x01e6:
            boolean r0 = r3 instanceof X.AnonymousClass01L
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] activity is not instance of AppCompatActivity"
            goto L_0x01d7
        L_0x01ed:
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] no product id provided"
            goto L_0x01d7
        L_0x01f0:
            r6 = 0
            goto L_0x01cb
        L_0x01f2:
            java.lang.String r0 = "WAExtensionsLearnMore"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "extensions_learn_more"
            goto L_0x0217
        L_0x01fd:
            java.lang.String r0 = "WAExtensionsClose"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.01I r0 = r1.A0i()
            r0.finish()
            return
        L_0x020d:
            java.lang.String r0 = "WAExtensionsContextualHelp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "extensions_help"
        L_0x0217:
            r1.A06(r0)
            return
        L_0x021b:
            java.lang.String r0 = "WAExtensionsSpamReport"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r1.A03()
            return
        L_0x0227:
            java.lang.String r0 = "flowsMediaPicker"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x022e:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0233:
            java.lang.String r0 = "initial_ts_in_millis"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ NumberFormatException -> 0x0240 }
            if (r0 == 0) goto L_0x0246
            java.lang.Long r16 = X.C36431kI.A15(r0)     // Catch:{ NumberFormatException -> 0x0240 }
            goto L_0x024a
        L_0x0240:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r16 = r10
            goto L_0x024a
        L_0x0246:
            r16 = r10
            if (r3 == 0) goto L_0x025d
        L_0x024a:
            java.lang.String r0 = "max_ts_in_millis"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ NumberFormatException -> 0x0257 }
            if (r0 == 0) goto L_0x025d
            java.lang.Long r17 = X.C36431kI.A15(r0)     // Catch:{ NumberFormatException -> 0x0257 }
            goto L_0x0261
        L_0x0257:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r17 = r10
            goto L_0x0261
        L_0x025d:
            r17 = r10
            if (r3 == 0) goto L_0x0277
        L_0x0261:
            java.lang.String r0 = "min_ts_in_millis"
            java.lang.String r0 = r3.optString(r0)     // Catch:{ NumberFormatException -> 0x0272 }
            if (r0 == 0) goto L_0x0277
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0272 }
            java.lang.Long r18 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0272 }
            goto L_0x0277
        L_0x0272:
            java.lang.String r0 = "FlowsLogger/getDatePickerInputParams/bind Min date is not a valid date format"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0277:
            X.6DI r15 = new X.6DI
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.lang.Long r0 = r15.A01
            if (r0 == 0) goto L_0x0296
            r5 = 0
            long r2 = r0.longValue()
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0296
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            r4.setTime(r0)
        L_0x0296:
            r0 = 0
            X.5ZJ r8 = new X.5ZJ
            r8.<init>(r1, r15, r0)
            int r0 = r15.A00
            r2 = 2
            r11 = 2132083263(0x7f15023f, float:1.9806663E38)
            if (r0 != r2) goto L_0x02a7
            r11 = 2132083262(0x7f15023e, float:1.9806661E38)
        L_0x02a7:
            android.content.Context r9 = r1.A0a()
            r0 = 1
            int r12 = r4.get(r0)
            int r13 = r4.get(r2)
            r0 = 5
            int r14 = r4.get(r0)
            X.4fy r7 = new X.4fy
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Long r0 = r15.A02
            if (r0 == 0) goto L_0x02cb
            android.widget.DatePicker r2 = r7.A01
            long r0 = r0.longValue()
            r2.setMaxDate(r0)
        L_0x02cb:
            java.lang.Long r0 = r15.A03
            if (r0 == 0) goto L_0x02d8
            android.widget.DatePicker r2 = r7.A01
            long r0 = r0.longValue()
            r2.setMinDate(r0)
        L_0x02d8:
            r7.show()
            return
        L_0x02dc:
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r2 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment
            r2.<init>()
            r9 = 0
            X.7pZ r0 = new X.7pZ
            r4 = r0
            r5 = r3
            r7 = r1
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A00 = r0
            X.01z r0 = r3.getSupportFragmentManager()
            X.C65443Sb.A02(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer.A1m(android.webkit.WebMessagePort, org.json.JSONObject):void");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0G = (WaFlowsViewModel) C36381kD.A0P(this).A00(WaFlowsViewModel.class);
        Bundle bundle2 = this.A0A;
        UserJid userJid = null;
        if (bundle2 != null) {
            userJid = UserJid.Companion.A02(bundle2.getString("chat_id"));
        }
        this.A0N = userJid;
        C20810yC r1 = this.A0H;
        if (r1 != null) {
            this.A0O = r1.A09(2069);
            C20810yC r12 = this.A0H;
            if (r12 != null) {
                boolean z = false;
                if (r12.A0E(4393)) {
                    C20810yC r13 = this.A0H;
                    if (r13 == null) {
                        throw C36321k7.A07();
                    } else if (AnonymousClass099.A0O(C36431kI.A19(r13, 3063), "extensions_help", false)) {
                        z = true;
                    }
                }
                this.A0P = z;
                A10(true);
                return;
            }
            throw C36321k7.A07();
        }
        throw C36321k7.A07();
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        AnonymousClass00C.A0E(A1a, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass0FL r4 = (AnonymousClass0FL) A1a;
        C115235iY r3 = this.A04;
        if (r3 != null) {
            AnonymousClass01I A0i = A0i();
            AnonymousClass7M7 r1 = new AnonymousClass7M7(this);
            AnonymousClass00C.A0D(r4, 1);
            r4.setOnShowListener(new AnonymousClass6ZE(A0i, r4, r3, r1));
            return r4;
        }
        throw C36331k8.A0d("bottomSheetDragBehavior");
    }
}
