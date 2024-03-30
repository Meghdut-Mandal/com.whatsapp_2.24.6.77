package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass1GL;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass5NP;
import X.AnonymousClass6FG;
import X.AnonymousClass6KH;
import X.AnonymousClass6QO;
import X.AnonymousClass6VQ;
import X.AnonymousClass6VT;
import X.AnonymousClass6YG;
import X.C1273567y;
import X.C129126Fh;
import X.C130956Nc;
import X.C132366Tg;
import X.C146636vv;
import X.C146806wC;
import X.C160827le;
import X.C18740tg;
import X.C18820ts;
import X.C19630wG;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C21656ATx;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36411kG;
import X.C65083Qq;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public final class GifComposerFragment extends Hilt_GifComposerFragment {
    public C65083Qq A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        C65083Qq r3;
        View view2;
        View A08;
        RuntimeException th;
        C146806wC r11;
        int i;
        int i2;
        View view3 = view;
        AnonymousClass00C.A0D(view3, 0);
        super.A1S(bundle, view3);
        Uri uri = this.A00;
        if (uri != null) {
            C18740tg.A0C(AnonymousClass000.A1W(this.A00));
            C160827le A1a = A1a();
            if (A1a != null) {
                C132366Tg r32 = ((MediaComposerActivity) A1a).A1r;
                File A082 = r32.A03(uri).A08();
                if (A082 != null) {
                    if (bundle == null) {
                        String A0B = r32.A03(uri).A0B();
                        String BBN = A1a.BBN(uri);
                        if (A0B == null) {
                            try {
                                C1273567y A05 = r32.A03(uri).A05();
                                if (A05 == null) {
                                    A05 = new C1273567y(A082);
                                }
                                A1Z();
                                boolean A02 = A05.A02();
                                if (A02) {
                                    i = A05.A00;
                                } else {
                                    i = A05.A02;
                                }
                                float f = (float) i;
                                A1Z();
                                if (A02) {
                                    i2 = A05.A02;
                                } else {
                                    i2 = A05.A00;
                                }
                                RectF rectF = new RectF(0.0f, 0.0f, f, (float) i2);
                                C146806wC r10 = this.A0E;
                                if (r10 != null) {
                                    r10.A0O.A07 = rectF;
                                    r10.A0N.A00 = 0.0f;
                                    r10.A0B(rectF);
                                }
                            } catch (AnonymousClass1GL e) {
                                Log.e("GifComposerFragment/bad video", e);
                            }
                        } else {
                            C130956Nc r102 = AnonymousClass6VQ.A05;
                            Context A0a = A0a();
                            AnonymousClass1H2 r13 = this.A08;
                            if (r13 != null) {
                                C18820ts r12 = this.A07;
                                if (r12 != null) {
                                    AnonymousClass1HA r14 = this.A0K;
                                    if (r14 != null) {
                                        AnonymousClass6VQ A022 = r102.A02(A0a, r12, r13, r14, A0B);
                                        if (!(A022 == null || (r11 = this.A0E) == null)) {
                                            r11.A0N.setDoodle(A022);
                                            r11.A0T.A05(BBN);
                                        }
                                    } else {
                                        throw C36331k8.A0d("stickerImageFileLoader");
                                    }
                                } else {
                                    throw C36321k7.A09();
                                }
                            } else {
                                throw C36331k8.A0d("emojiLoader");
                            }
                        }
                    }
                    try {
                        C21656ATx.A04(A082);
                        r3 = new AnonymousClass5NP(A0i(), A082);
                    } catch (IOException unused) {
                        C20810yC r142 = this.A0A;
                        if (r142 != null) {
                            AnonymousClass17Y r112 = this.A02;
                            if (r112 != null) {
                                C21060yb r122 = this.A04;
                                if (r122 != null) {
                                    Context A0a2 = A0a();
                                    C19630wG r132 = this.A05;
                                    if (r132 != null) {
                                        AnonymousClass6QO A03 = r32.A03(uri);
                                        synchronized (A03) {
                                            boolean A1S = AnonymousClass000.A1S(A03.A0C ? 1 : 0, 1);
                                            boolean A01 = AnonymousClass6YG.A01();
                                            C19770wU r9 = this.A0R;
                                            if (r9 != null) {
                                                AnonymousClass005 r33 = this.A0U;
                                                if (r33 != null) {
                                                    r3 = C65083Qq.A03(A0a2, r112, r122, r132, r142, (AnonymousClass6KH) r33.get(), r9, (AnonymousClass6FG) null, A082, true, A1S, A01);
                                                } else {
                                                    th = C36331k8.A0d("heroSettingProvider");
                                                }
                                            } else {
                                                throw C36321k7.A08();
                                            }
                                        }
                                    } else {
                                        th = C36331k8.A0d("waContext");
                                    }
                                } else {
                                    throw C36331k8.A0W();
                                }
                            } else {
                                throw C36321k7.A06();
                            }
                        } else {
                            throw C36321k7.A07();
                        }
                    } catch (IOException e2) {
                        Log.e("GifComposerFragment/onViewCreated videoPlayer initialization", e2);
                        AnonymousClass17Y r2 = this.A02;
                        if (r2 != null) {
                            r2.A06(R.string.f12nameremoved, 0);
                            A0i().finish();
                            return;
                        }
                        throw C36321k7.A06();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    this.A00 = r3;
                    r3.A0V(true);
                    ViewGroup A0P = C36411kG.A0P(view3, R.id.video_player);
                    C65083Qq r34 = this.A00;
                    if (r34 != null) {
                        view2 = r34.A08();
                    } else {
                        view2 = null;
                    }
                    A0P.addView(view2, new FrameLayout.LayoutParams(-1, -1, 17));
                    if (uri.equals(A1a.B8e())) {
                        C65083Qq r1 = this.A00;
                        if (!(r1 == null || (A08 = r1.A08()) == null)) {
                            A08.setAlpha(0.0f);
                        }
                        A0i().A1q();
                        return;
                    }
                    return;
                }
            }
            throw C36381kD.A0l();
        }
        return;
        throw th;
    }

    public void A1h(AnonymousClass6VT r3, C146636vv r4, C129126Fh r5) {
        AnonymousClass00C.A0D(r5, 0);
        C36321k7.A0x(r4, r3);
        super.A1h(r3, r4, r5);
        r5.A0I.setCropToolVisibility(8);
        r4.A01();
        A1d();
    }

    public void A1J() {
        super.A1J();
        C65083Qq r0 = this.A00;
        if (r0 != null) {
            r0.A0D();
        }
        this.A00 = null;
    }
}
