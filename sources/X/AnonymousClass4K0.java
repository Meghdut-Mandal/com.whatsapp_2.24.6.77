package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversationslist.LockedConversationsFragment;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.Arrays;

/* renamed from: X.4K0  reason: invalid class name */
public final class AnonymousClass4K0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LockedConversationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4K0(LockedConversationsFragment lockedConversationsFragment) {
        super(1);
        this.this$0 = lockedConversationsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A22;
        View A222;
        int A06 = C36431kI.A06((C51722oH) obj, 0);
        if (A06 != 1) {
            LockedConversationsFragment lockedConversationsFragment = this.this$0;
            if (A06 != 3) {
                int A04 = C36411kG.A04(lockedConversationsFragment.A00);
                View view = this.this$0.A01;
                if (view != null) {
                    view.setVisibility(A04);
                }
            } else {
                View view2 = lockedConversationsFragment.A01;
                if (view2 == null) {
                    if (AnonymousClass1MI.A00(lockedConversationsFragment.A21)) {
                        A222 = lockedConversationsFragment.A22(R.layout.f9nameremoved);
                        WDSBanner wDSBanner = (WDSBanner) A222.findViewById(R.id.banner);
                        if (wDSBanner != null) {
                            C36391kE.A0P(wDSBanner, R.id.banner_header).setMaxLines(2);
                            View findViewById = wDSBanner.findViewById(R.id.banner_description);
                            AnonymousClass00C.A0B(findViewById);
                            C65723Tf.A02(findViewById, new AnonymousClass3QI(0, wDSBanner.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0));
                            C62053Eo r7 = new C62053Eo();
                            r7.A02 = new AnonymousClass2lR(new C50762lX(R.drawable.vec_ic_settings_unfilled_linked_devices_wds));
                            r7.A01 = R.string.f12nameremoved;
                            Context A0B = C36371kC.A0B(wDSBanner);
                            String string = A0B.getString(R.string.f12nameremoved, Arrays.copyOf(new Object[0], 0));
                            AnonymousClass00C.A0B(string);
                            C62053Eo.A00(wDSBanner, r7, C63953Mb.A01(A0B, string, C36361kB.A0m(A0B, R.string.f12nameremoved)));
                            wDSBanner.setOnDismissListener((AnonymousClass00S) new AnonymousClass4B0(lockedConversationsFragment));
                            C66963Xz.A00(wDSBanner, lockedConversationsFragment, 43);
                            if (!C222013h.A05) {
                                wDSBanner.A07();
                            } else {
                                wDSBanner.A06();
                            }
                        }
                    } else {
                        A222 = lockedConversationsFragment.A22(R.layout.f9nameremoved);
                        View findViewById2 = A222.findViewById(R.id.full_companion_support_banner_close_button);
                        if (findViewById2 != null) {
                            C66963Xz.A00(findViewById2, lockedConversationsFragment, 44);
                        }
                        View findViewById3 = A222.findViewById(R.id.full_companion_support_banner_cta);
                        if (findViewById3 != null) {
                            C66963Xz.A00(findViewById3, lockedConversationsFragment, 46);
                        }
                    }
                    lockedConversationsFragment.A01 = A222;
                } else {
                    view2.setVisibility(0);
                }
            }
        } else {
            LockedConversationsFragment lockedConversationsFragment2 = this.this$0;
            if (lockedConversationsFragment2.A00 == null) {
                if (AnonymousClass1MI.A00(lockedConversationsFragment2.A21)) {
                    A22 = lockedConversationsFragment2.A22(R.layout.f9nameremoved);
                    WDSBanner wDSBanner2 = (WDSBanner) A22.findViewById(R.id.banner);
                    if (wDSBanner2 != null) {
                        C62053Eo r8 = new C62053Eo();
                        r8.A02 = C50722lQ.A00;
                        Context A0B2 = C36371kC.A0B(wDSBanner2);
                        String string2 = A0B2.getString(R.string.f12nameremoved, Arrays.copyOf(new Object[0], 0));
                        AnonymousClass00C.A0B(string2);
                        C62053Eo.A00(wDSBanner2, r8, C63953Mb.A01(A0B2, string2, C36361kB.A0m(A0B2, R.string.f12nameremoved)));
                        wDSBanner2.setOnDismissListener((AnonymousClass00S) new AnonymousClass4B2(lockedConversationsFragment2));
                        C66963Xz.A00(wDSBanner2, lockedConversationsFragment2, 48);
                        if (!C222013h.A05) {
                            wDSBanner2.A07();
                        } else {
                            wDSBanner2.A06();
                        }
                    }
                } else {
                    A22 = lockedConversationsFragment2.A22(R.layout.f9nameremoved);
                    View findViewById4 = A22.findViewById(R.id.close_leaky_banner_button);
                    if (findViewById4 != null) {
                        C66963Xz.A00(findViewById4, lockedConversationsFragment2, 47);
                    }
                    View findViewById5 = A22.findViewById(R.id.learn_more_button);
                    if (findViewById5 != null) {
                        C66963Xz.A00(findViewById5, lockedConversationsFragment2, 45);
                    }
                }
                lockedConversationsFragment2.A00 = A22;
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
