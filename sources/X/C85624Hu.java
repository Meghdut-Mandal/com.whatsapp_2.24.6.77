package X;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* renamed from: X.4Hu  reason: invalid class name and case insensitive filesystem */
public final class C85624Hu extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass4PL $tosAcceptedCallback;
    public final /* synthetic */ C51412nm $tosType;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85624Hu(C225314u r2, AnonymousClass4PL r3, AnonymousClass1K6 r4, C51412nm r5, Integer num) {
        super(0);
        this.this$0 = r4;
        this.$tosType = r5;
        this.$dialogActivity = r2;
        this.$entryPoint = num;
        this.$tosAcceptedCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        String str;
        AnonymousClass1K6 r1 = this.this$0;
        C51412nm r4 = this.$tosType;
        C25621Ha r3 = r1.A02;
        if (r3.A04(r4)) {
            z = false;
        } else if (!AnonymousClass00C.A0J(r1.A05.A05(), "US") || r4 != C51412nm.META_AI_SHORTCUT) {
            z = true;
        } else {
            z = !r3.A04(C51412nm.INVOKE);
        }
        AnonymousClass1K6 r0 = this.this$0;
        if (z) {
            C132326Tc r42 = (C132326Tc) r0.A06.get();
            r42.A04.Boy(new AVW(r42, 45));
            AnonymousClass1K6 r12 = this.this$0;
            AnonymousClass1K7 r5 = r12.A01;
            C225314u r9 = this.$dialogActivity;
            C51412nm r8 = this.$tosType;
            Integer num = this.$entryPoint;
            AnonymousClass369 r32 = new AnonymousClass369(this.$tosAcceptedCallback, r12, r8);
            boolean A1a = C36341k9.A1a(r9, r8);
            C21010yW r2 = r5.A05;
            C45162Qh r13 = new C45162Qh();
            r13.A00 = 32;
            r13.A02 = 36;
            r13.A01 = num;
            r2.Bly(r13);
            if (!C20800yB.A01(C21000yV.A01, r5.A02.A01, 8004) || r8 != C51412nm.META_AI_SHORTCUT) {
                C203639oR A00 = r5.A00.A00((AnonymousClass691) null);
                AnonymousClass011[] r22 = new AnonymousClass011[2];
                C36341k9.A1J("platform", "android", r22, 0);
                if (r8 == C51412nm.INVOKE) {
                    str = "invoked";
                } else {
                    str = "chat";
                }
                C36341k9.A1J("nux_screen", str, r22, A1a ? 1 : 0);
                A00.A0B(new AnonymousClass3T5(r32, 0), new C76463ou(r5, r32, num), new C128166Be("bonsai_nux", (String) null, C000400e.A08(r22)), "", (String) null, (Map) null);
            } else {
                Context context = r5.A03.A00;
                Intent A0D = C36431kI.A0D();
                C36421kH.A0l(context, A0D, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity", "com.bloks.www.whatsapp.bonsai.shortcut_nux");
                A0D.putExtra("is_async_component", false);
                A0D.putExtra("restore_saved_instance", A1a);
                r9.A33(A0D, false);
                r32.A01.A00.A02();
            }
        } else {
            r0.A00.A02();
            this.$tosAcceptedCallback.BjC(false);
        }
        return AnonymousClass0AJ.A00;
    }
}
