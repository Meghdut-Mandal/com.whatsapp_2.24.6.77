package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass566;
import X.AnonymousClass56Q;
import X.AnonymousClass56T;
import X.AnonymousClass56k;
import X.C009003v;
import X.C023509x;
import X.C1035655y;
import X.C1036756l;
import X.C1036856m;
import X.C1036956n;
import X.C1037056o;
import X.C110725b8;
import X.C125385zp;
import X.C1275568t;
import X.C36321k7;
import X.C36441kJ;
import X.C90524aI;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onPackSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onPackSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $moveToSelectedStickerSection;
    public final /* synthetic */ C125385zp $section;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onPackSelected$1(C125385zp r2, StickerExpressionsViewModel stickerExpressionsViewModel, C023509x r4, boolean z) {
        super(2, r4);
        this.$section = r2;
        this.this$0 = stickerExpressionsViewModel;
        this.$moveToSelectedStickerSection = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        StickerExpressionsViewModel$onPackSelected$1 stickerExpressionsViewModel$onPackSelected$1 = new StickerExpressionsViewModel$onPackSelected$1(this.$section, this.this$0, r6, this.$moveToSelectedStickerSection);
        stickerExpressionsViewModel$onPackSelected$1.L$0 = obj;
        return stickerExpressionsViewModel$onPackSelected$1;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        Object r10;
        boolean z;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (!(this.$section instanceof C1035655y)) {
                C110725b8 r6 = (C110725b8) this.this$0.A0h.getValue();
                if (r6 instanceof AnonymousClass56Q) {
                    AnonymousClass56Q r62 = (AnonymousClass56Q) r6;
                    List<C1275568t> list = r62.A02;
                    C125385zp r4 = this.$section;
                    ArrayList A0J = C36321k7.A0J(list);
                    for (C1275568t r7 : list) {
                        boolean A0J2 = AnonymousClass00C.A0J(r7.A00().A00(), r4.A00());
                        if (r7 instanceof AnonymousClass56k) {
                            AnonymousClass56k r72 = (AnonymousClass56k) r7;
                            r10 = new AnonymousClass56k(r72.A01, r72.A02, r72.A00, A0J2);
                        } else if (r7 instanceof C1036956n) {
                            C1036956n r73 = (C1036956n) r7;
                            r10 = new C1036956n(r73.A01, r73.A02, r73.A03, r73.A00, A0J2);
                        } else if (r7 instanceof C1037056o) {
                            C1037056o r74 = (C1037056o) r7;
                            if (A0J2) {
                                z = false;
                            } else {
                                z = r74.A03;
                            }
                            r10 = new C1037056o(r74.A00, r74.A01, r74.A02, A0J2, z);
                        } else if (r7 instanceof C1036856m) {
                            C1036856m r75 = (C1036856m) r7;
                            r10 = new C1036856m(r75.A00, r75.A01, r75.A02, A0J2);
                        } else if (r7 instanceof C1036756l) {
                            C1036756l r76 = (C1036756l) r7;
                            r10 = new C1036756l(r76.A00, r76.A01, r76.A02, A0J2);
                        } else {
                            throw C36441kJ.A18();
                        }
                        A0J.add(r10);
                    }
                    AnonymousClass05L r42 = this.this$0.A0h;
                    List list2 = r62.A01;
                    if (this.$moveToSelectedStickerSection) {
                        str = this.$section.A00();
                    } else {
                        str = null;
                    }
                    r42.setValue(new AnonymousClass56Q(str, A0J, list2));
                    C125385zp r2 = this.$section;
                    if (r2 instanceof AnonymousClass566) {
                        try {
                            this.this$0.A0U.A01(((AnonymousClass566) r2).A00);
                            obj2 = AnonymousClass0AJ.A00;
                        } catch (Throwable th) {
                            obj2 = C90524aI.A0t(th);
                        }
                        C125385zp r22 = this.$section;
                        if (AnonymousClass0AK.A00(obj2) != null) {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("StickerExpressionViewModel/unable to mark pack as seen: ");
                            C36321k7.A1Z(A0u, ((AnonymousClass566) r22).A00.A0F);
                        }
                    }
                } else if (r6 instanceof AnonymousClass56T) {
                    this.this$0.A0h.setValue(new AnonymousClass56T(this.$section.A00()));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$onPackSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
