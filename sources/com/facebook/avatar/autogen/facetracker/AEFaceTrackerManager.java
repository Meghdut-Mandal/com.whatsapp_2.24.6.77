package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass000;
import X.AnonymousClass041;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5UR;
import X.AnonymousClass6YR;
import X.C006702x;
import X.C008903u;
import X.C009003v;
import X.C009403z;
import X.C023109s;
import X.C023509x;
import X.C07340Xg;
import X.C119115pG;
import X.C124845yt;
import X.C13390jn;
import X.C134956bt;
import X.C139536k1;
import X.C157737eb;
import X.C36331k8;
import X.C53372rD;
import android.content.Context;
import com.facebook.jni.HybridData;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AEFaceTrackerManager implements C157737eb {
    public final C134956bt A00;
    public final C139536k1 A01;
    public final Context A02;
    public HybridData mHybridData;

    @DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1", f = "AEFaceTrackerManager.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            C139536k1 r0;
            String str;
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.this;
                this.label = 1;
                AnonymousClass041 A02 = C009403z.A02(C006702x.A01);
                AEFaceTrackerManager$getModels$modelFetching$1 aEFaceTrackerManager$getModels$modelFetching$1 = new AEFaceTrackerManager$getModels$modelFetching$1(aEFaceTrackerManager, (C023509x) null);
                Object A00 = C07340Xg.A00(this, new AEFaceTrackerManager$getModels$2((C023509x) null, AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, aEFaceTrackerManager$getModels$modelFetching$1, A02)), 8000);
                if (A00 != r6) {
                    A00 = AnonymousClass0AJ.A00;
                }
                if (A00 == r6) {
                    return r6;
                }
            } else if (i == 1) {
                try {
                    AnonymousClass0AN.A00(obj);
                } catch (AnonymousClass5UR e) {
                    AnonymousClass6YR.A09("AEFaceTrackerManager", "Failed to fetch facetracker models", e);
                    r0 = AEFaceTrackerManager.this.A01;
                    num = C023109s.A0G;
                } catch (C13390jn e2) {
                    AnonymousClass6YR.A09("AEFaceTrackerManager", "Timeout fetching facetracker models", e2);
                    r0 = AEFaceTrackerManager.this.A01;
                    num = C023109s.A0R;
                }
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
            C119115pG r1 = r0.A04.A07;
            if (3 - num.intValue() != 0) {
                str = "model_fetch_timeout";
            } else {
                str = "model_fetch_failed";
            }
            C53372rD.A00(r1.A00, r1.A01, str, 36);
            return AnonymousClass0AJ.A00;
        }
    }

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public AEFaceTrackerManager(Context context, C134956bt r5, C139536k1 r6) {
        this.A02 = context;
        this.A00 = r5;
        this.A01 = r6;
        C36331k8.A1T(new AnonymousClass1((C023509x) null), C009403z.A02(C006702x.A01));
    }

    public void BdT(C124845yt r1) {
    }
}
